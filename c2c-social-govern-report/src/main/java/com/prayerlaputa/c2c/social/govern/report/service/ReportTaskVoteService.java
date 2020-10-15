package com.prayerlaputa.c2c.social.govern.report.service;


import com.prayerlaputa.c2c.social.govern.report.domain.ReportTaskVote;

import java.util.List;

/**
 * 举报任务投票Service接口
 */
public interface ReportTaskVoteService {

    /**
     * 初始化评审员对举报任务的投票
     *
     * @param reviewerIds  评审员id
     * @param reportTaskId 举报任务id
     */
    void initVotes(List<Long> reviewerIds, Long reportTaskId);


    /**
     * 对举报任务执行投票
     * @param reviewerId 评审员id
     * @param reportTaskId 举报任务id
     * @param voteResult 投票结果
     */
    void vote(Long reviewerId, Long reportTaskId, Integer voteResult);

    /**
     * 对举报任务进行归票
     * @param reportTaskId 举报任务id
     * @return 是否得到举报任务的最终投票结果
     */
    Boolean calculateVotes(Long reportTaskId);

    /**
     * 查询举报任务下的所有投票
     * @param reportTaskId 举报任务id
     * @return 投票
     */
    List<ReportTaskVote> queryByReportTaskId(Long reportTaskId);
}
