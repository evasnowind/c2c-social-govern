package com.prayerlaputa.c2c.social.govern.report.mapper;

import com.prayerlaputa.c2c.social.govern.report.domain.ReportTask;
import org.apache.ibatis.annotations.*;

/**
 * 举报任务SQL
 */
@Mapper
public interface ReportTaskMapper {

    /**
     * 插入举报任务
     * @param reportTask
     */
    @Insert("INSERT INTO report_task(type,report_user_id,report_content,target_id,vote_result) " +
            "VALUES(#{type},#{reportUserId},#{reportContent},#{targetId},#{voteResult})")
    @Options(keyColumn = "id", keyProperty = "id", useGeneratedKeys = true)
    void insert(ReportTask reportTask);

    /**
     * 根据id查询举报任务
     * @param id
     * @return
     */
    @Select("SELECT " +
                "id," +
                "type," +
                "report_user_id," +
                "report_content," +
                "target_id," +
                "vote_result " +
            "FROM report_task " +
            "WHERE id=#{id}")
    @Results({
            @Result(column = "id", property = "id", id = true),
            @Result(column = "type", property = "type"),
            @Result(column = "report_user_id", property = "reportUserId"),
            @Result(column = "report_content", property = "reportContent"),
            @Result(column = "target_id", property = "targetId"),
            @Result(column = "vote_result", property = "voteResult")
    })
    ReportTask selectById(@Param("id") Long id);

    /**
     * 更新举报任务
     * @param reportTask
     */
    @Update("UPDATE report_task " +
            "SET vote_result=#{voteResult} " +
            "WHERE id=#{id}")
    void update(ReportTask reportTask);

}
