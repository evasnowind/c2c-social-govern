package com.prayerlaputa.c2c.social.govern.report.dao;


import com.prayerlaputa.c2c.social.govern.report.domain.ReportTaskVote;

/**
 * 举报任务投票DAO接口
 */
public interface ReportTaskVoteDAO {

    /**
     * 增加举报任务投票
     * @param reportTaskVote 举报任务投票
     */
    void add(ReportTaskVote reportTaskVote);

}
