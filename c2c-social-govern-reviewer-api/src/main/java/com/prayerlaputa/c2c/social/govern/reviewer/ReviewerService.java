package com.prayerlaputa.c2c.social.govern.reviewer;

import java.util.List;

/**
 * 评审员服务的接口
 *
 * @author chenglong.yu
 * created on 2020/10/11
 */
public interface ReviewerService {
    /**
     * 选择评审员
     * @param reportTaskId 举报任务id
     * @return 评审员用户id
     */
    List<Long> selectReviewers(Long reportTaskId);
}
