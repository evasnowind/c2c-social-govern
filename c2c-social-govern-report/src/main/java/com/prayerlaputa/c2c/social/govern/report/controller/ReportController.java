package com.prayerlaputa.c2c.social.govern.report.controller;

import com.prayerlaputa.c2c.social.govern.report.domain.ReportTask;
import com.prayerlaputa.c2c.social.govern.report.domain.ReportTaskVote;
import com.prayerlaputa.c2c.social.govern.report.service.ReportTaskService;
import com.prayerlaputa.c2c.social.govern.report.service.ReportTaskVoteService;
import com.prayerlaputa.c2c.social.govern.reviewer.ReviewerService;
import com.prayerlaputa.c2c.social.govern.reward.api.RewardService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * 举报服务的接口
 */
@RestController
public class ReportController {

    /**
     * 举报任务Service组件
     */
    @Autowired
    private ReportTaskService reportTaskService;
    /**
     * 举报任务投票Service组件
     */
    @Autowired
    private ReportTaskVoteService reportTaskVoteService;

    /**
     * 评审员服务
     */
    @Reference(version = "1.0.0",
            interfaceClass = ReviewerService.class,
            cluster = "failfast")
    private ReviewerService reviewerService;

    /**
     * 奖励服务
     */
    @Reference(version = "1.0.0",
            interfaceClass = RewardService.class,
            cluster = "failfast")
    private RewardService rewardService;

    /**
     * 提交举报接口
     * @param type 举报任务类型
     * @param reportUserId 举报用户id
     * @param reportContent 举报说明
     * @param targetId 举报目标对象id
     * @return
     */
    @GetMapping("/report")
    public String report(String type,
                         Long reportUserId,
                         String reportContent,
                         Long targetId) {
        // 封装举报任务对象
        ReportTask reportTask = new ReportTask();
        reportTask.setType(type);
        reportTask.setReportUserId(reportUserId);
        reportTask.setReportContent(reportContent);
        reportTask.setTargetId(targetId);

        // 在本地数据库增加一个举报任务
        reportTaskService.add(reportTask);

        // 调用评审员服务，选择一批评审员
        List<Long> reviewerIds = reviewerService.selectReviewers(
                reportTask.getId());
        // 在本地数据库初始化这批评审员对举报任务的投票状态
        reportTaskVoteService.initVotes(reviewerIds, reportTask.getId());

        // 模拟发送push消息给评审员
        System.out.println("模拟发送push消息给评审员.....");

        return "success";
    }

    /**
     * 对举报任务进行投票
     * @param reviewerId 评审员id
     * @param reportTaskId 举报任务id
     * @param voteResult 投票结果
     * @return
     */
    @GetMapping("/report/vote")
    public String vote(
            Long reviewerId,
            Long reportTaskId,
            Integer voteResult) {
        // 本地数据库记录投票
        reportTaskVoteService.vote(reviewerId, reportTaskId, voteResult);
        // 调用评审员服务，标记本次投票结束
        reviewerService.finishVote(reviewerId, reportTaskId);

        // 对举报任务进行归票
        Boolean hasFinishedVote = reportTaskVoteService
                .calculateVotes(reportTaskId);

        // 如果举报任务得到归票结果
        if(hasFinishedVote) {
            // 发放奖励
            List<ReportTaskVote> reportTaskVotes = reportTaskVoteService
                    .queryByReportTaskId(reportTaskId);
            List<Long> reviewerIds = new ArrayList<Long>();

            for(ReportTaskVote reportTaskVote : reportTaskVotes) {
                reviewerIds.add(reportTaskVote.getReviewerId());
            }

            rewardService.giveReward(reviewerIds);

            // 推送消息到MQ，告知其他系统，本次评审结果
            System.out.println("推送消息到MQ，告知其他系统，本次评审结果");
        }

        return "success";
    }
}
