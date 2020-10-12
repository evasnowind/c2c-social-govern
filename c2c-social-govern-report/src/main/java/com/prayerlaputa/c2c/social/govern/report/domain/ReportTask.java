package com.prayerlaputa.c2c.social.govern.report.domain;

/**
 * 举报任务
 */
public class ReportTask {

    /**
     * 举报任务id
     */
    private Long id;
    /**
     * 举报任务类型
     */
    private String type;
    /**
     * 举报用户id
     */
    private Long reportUserId;
    /**
     * 举报说明
     */
    private String reportContent;
    /**
     * 举报目标对象id
     */
    private Long targetId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getReportUserId() {
        return reportUserId;
    }

    public void setReportUserId(Long reportUserId) {
        this.reportUserId = reportUserId;
    }

    public String getReportContent() {
        return reportContent;
    }

    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }

    public Long getTargetId() {
        return targetId;
    }

    public void setTargetId(Long targetId) {
        this.targetId = targetId;
    }
}
