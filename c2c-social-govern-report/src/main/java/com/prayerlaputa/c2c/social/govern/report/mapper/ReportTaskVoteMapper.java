package com.prayerlaputa.c2c.social.govern.report.mapper;

import com.prayerlaputa.c2c.social.govern.report.domain.ReportTaskVote;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * 举报任务投票Mapper组件
 */
@Mapper
public interface ReportTaskVoteMapper {

    /**
     * 插入举报任务投票
     * @param reportTaskVote
     */
    @Insert("INSERT INTO report_task_vote(reviewer_id,report_task_id,vote_result) " +
            "VALUES(#{reviewerId},#{reportTaskId},#{voteResult})")
    void insert(ReportTaskVote reportTaskVote);

    /**
     * 更新举报任务投票
     * @param reportTaskVote 举报任务投票
     */
    @Update("UPDATE report_task_vote " +
            "SET vote_result=#{voteResult} " +
            "WHERE reviewer_id=#{reviewerId} " +
            "AND report_task_id=#{reportTaskId}")
    void update(ReportTaskVote reportTaskVote);

    /**
     * 查询举报任务的所有投票
     * @param reportTaskId 举报任务id
     * @return 举报任务投票
     */
    @Select("SELECT " +
                "id," +
                "reviewer_id," +
                "report_task_id," +
                "vote_result " +
            "FROM report_task_vote " +
            "WHERE report_task_id=#{reportTaskId}")
    @Results({
            @Result(column = "id", property = "id", id = true),
            @Result(column = "reviewer_id", property = "reviewerId"),
            @Result(column = "report_task_id", property = "reportTaskId"),
            @Result(column = "vote_result", property = "voteResult")
    })
    List<ReportTaskVote> selectByReportTaskId(
            @Param("reportTaskId") Long reportTaskId);

}
