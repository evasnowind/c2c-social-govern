package com.prayerlaputa.c2c.social.govern.reviewer.mapper;

import com.prayerlaputa.c2c.social.govern.reviewer.domain.ReviewerTaskStatus;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * 评审员处理任务状态Mapper组件
 */
@Mapper
public interface ReviewerTaskStatusMapper {

    /**
     * 插入评审员处理任务状态
     * @param reviewerTaskStatus
     */
    @Insert("INSERT INTO reviewer_task_status(reviewer_id,report_task_id,status) " +
            "VALUES(#{reviewerId},#{reportTaskId},#{status})")
    void insert(ReviewerTaskStatus reviewerTaskStatus);

}
