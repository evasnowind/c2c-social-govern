package com.prayerlaputa.c2c.social.govern.report.service;

import com.prayerlaputa.c2c.social.govern.report.dao.ReportTaskVoteDAO;
import com.prayerlaputa.c2c.social.govern.report.domain.ReportTaskVote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 举报任务投票Service组件
 */
@Service
public class ReportTaskVoteServiceImpl implements ReportTaskVoteService {

    /**
     * 举报任务投票DAO组件
     */
    @Autowired
    private ReportTaskVoteDAO reportTaskVoteDAO;

    /**
     * 初始化评审员对举报任务的投票
     * @param reviewerIds 评审员id
     * @param reportTaskId 举报任务id
     */
    @Override
    public void initVotes(List<Long> reviewerIds, Long reportTaskId) {
        for(Long reviewerId : reviewerIds) {
            ReportTaskVote reportTaskVote = new ReportTaskVote();
            reportTaskVote.setReviewerId(reviewerId);
            reportTaskVote.setReportTaskId(reportTaskId);
            reportTaskVote.setVoteResult(ReportTaskVote.UNKNOWN);

            reportTaskVoteDAO.add(reportTaskVote);
        }
    }

}
