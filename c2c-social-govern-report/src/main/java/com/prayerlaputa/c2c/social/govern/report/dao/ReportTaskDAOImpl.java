package com.prayerlaputa.c2c.social.govern.report.dao;

import com.prayerlaputa.c2c.social.govern.report.domain.ReportTask;
import com.prayerlaputa.c2c.social.govern.report.mapper.ReportTaskMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * 举报任务DAO实现类
 */
@Repository
public class ReportTaskDAOImpl implements ReportTaskDAO {

    /**
     * 举报任务Mapper组件
     */
    @Autowired
    private ReportTaskMapper reportTaskMapper;

    /**
     * 增加举报任务
     * @param reportTask 举报任务
     */
    @Override
    public void add(ReportTask reportTask) {
        reportTaskMapper.insert(reportTask);
    }
}
