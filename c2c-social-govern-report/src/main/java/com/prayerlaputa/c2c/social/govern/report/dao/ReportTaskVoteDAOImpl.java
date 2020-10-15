package com.prayerlaputa.c2c.social.govern.report.dao;

import com.prayerlaputa.c2c.social.govern.report.domain.ReportTaskVote;
import com.prayerlaputa.c2c.social.govern.report.mapper.ReportTaskVoteMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

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

    /**
     * 更新举报任务投票
     * @param reportTaskVote 举报任务投票
     */
    @Override
    public void update(ReportTaskVote reportTaskVote) {
        reportTaskVoteMapper.update(reportTaskVote);
    }

    /**
     * 查询举报任务的所有投票
     * @param reportTaskId 举报任务id
     * @return 举报任务投票
     */
    @Override
    public List<ReportTaskVote> queryByReportTaskId(Long reportTaskId) {
        return reportTaskVoteMapper.selectByReportTaskId(reportTaskId);
    }

}
