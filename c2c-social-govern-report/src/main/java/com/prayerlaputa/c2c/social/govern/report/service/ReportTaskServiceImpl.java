package com.prayerlaputa.c2c.social.govern.report.service;

import com.prayerlaputa.c2c.social.govern.report.dao.ReportTaskDAO;
import com.prayerlaputa.c2c.social.govern.report.domain.ReportTask;
import com.prayerlaputa.c2c.social.govern.report.mapper.ReportTaskMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * 举报任务Service实现类
 */
@Repository
public class ReportTaskServiceImpl implements ReportTaskService {

    /**
     * 举报任务DAO组件
     */
    @Autowired
    private ReportTaskDAO reportTaskDAO;

    /**
     * 增加举报任务
     * @param reportTask 举报任务
     */
    @Override
    public void add(ReportTask reportTask) {
        reportTaskDAO.add(reportTask);
    }

    /**
     * 根据id查询举报任务
     * @param id 举报任务id
     * @return 举报任务
     */
    @Override
    public ReportTask queryById(Long id) {
        return reportTaskDAO.queryById(id);
    }
}
