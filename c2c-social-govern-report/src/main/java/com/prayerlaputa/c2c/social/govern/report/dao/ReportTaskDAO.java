package com.prayerlaputa.c2c.social.govern.report.dao;

import com.prayerlaputa.c2c.social.govern.report.domain.ReportTask;

/**
 * 举报任务DAO接口
 */
public interface ReportTaskDAO {

    /**
     * 增加一个举报任务
     * @param reportTask 举报任务
     */
    void add(ReportTask reportTask);

    /**
     * 根据id查询举报任务
     * @param id 举报任务id
     * @return 举报任务
     */
    ReportTask queryById(Long id);

    /**
     * 更新举报任务
     * @param reportTask 举报任务
     */
    void update(ReportTask reportTask);

}
