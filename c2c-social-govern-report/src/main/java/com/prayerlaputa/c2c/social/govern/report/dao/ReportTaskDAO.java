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

}
