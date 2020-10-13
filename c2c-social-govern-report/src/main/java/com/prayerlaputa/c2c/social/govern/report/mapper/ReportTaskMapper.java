package com.prayerlaputa.c2c.social.govern.report.mapper;

import com.prayerlaputa.c2c.social.govern.report.domain.ReportTask;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;

/**
 * 举报任务SQL
 */
@Mapper
public interface ReportTaskMapper {

    /**
     * 插入举报任务
     * @param reportTask
     */
    @Insert("INSERT INTO report_task(type,report_user_id,report_content,target_id) " +
            "VALUES(#{type},#{reportUserId},#{reportContent},#{targetId})")
    @Options(useGeneratedKeys=true, keyProperty="id", keyColumn="id")
    void insert(ReportTask reportTask);

}
