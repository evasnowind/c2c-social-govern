package com.prayerlaputa.c2c.social.govern.report.dao;

import com.prayerlaputa.c2c.social.govern.report.domain.ReportTaskVote;
import com.prayerlaputa.c2c.social.govern.report.mapper.ReportTaskVoteMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * 举报任务投票DAO组件
 */
@Repository
public class ReportTaskVoteDAOImpl implements ReportTaskVoteDAO {

    /**
     * 举报任务投票Mapper组件
     */
    @Autowired
    private ReportTaskVoteMapper reportTaskVoteMapper;

    /**
     * 增加举报任务投票
     * @param reportTaskVote 举报任务投票
     */
    @Override
    public void add(ReportTaskVote reportTaskVote) {
        reportTaskVoteMapper.insert(reportTaskVote);
    }

}
