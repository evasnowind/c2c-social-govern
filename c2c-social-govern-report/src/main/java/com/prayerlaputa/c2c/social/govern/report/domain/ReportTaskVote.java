package com.prayerlaputa.c2c.social.govern.report.domain;

/**
 * 举报任务投票
 */
public class ReportTaskVote {

    /**
     * 未投票
     */
    public static final Integer UNKNOWN = -1;
    /**
     * 投票通过
     */
    public static final Integer APPROVED = 1;
    /**
     * 投票未通过
     */
    public static final Integer UNAPPROVED = 2;

    /**
     * 举报任务投票id
     */
    private Long id;
    /**
     * 评审员id
     */
    private Long reviewerId;
    /**
     * 举报任务id
     */
    private Long reportTaskId;
    /**
     * 投票结果
     */
    private Integer voteResult;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getReviewerId() {
        return reviewerId;
    }

    public void setReviewerId(Long reviewerId) {
        this.reviewerId = reviewerId;
    }

    public Long getReportTaskId() {
        return reportTaskId;
    }

    public void setReportTaskId(Long reportTaskId) {
        this.reportTaskId = reportTaskId;
    }

    public Integer getVoteResult() {
        return voteResult;
    }

    public void setVoteResult(Integer voteResult) {
        this.voteResult = voteResult;
    }
}
