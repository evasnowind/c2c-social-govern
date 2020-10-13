package com.prayerlaputa.c2c.social.govern.report.mapper;

import com.prayerlaputa.c2c.social.govern.report.domain.ReportTaskVote;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;

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
    @Options(useGeneratedKeys=true, keyProperty="id", keyColumn="id")
    void insert(ReportTaskVote reportTaskVote);

}
