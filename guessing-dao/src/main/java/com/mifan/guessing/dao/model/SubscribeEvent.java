package com.mifan.guessing.dao.model;

import java.util.Date;

public class SubscribeEvent {
    private String id;

    private String userCode;

    private String phone;

    private String eventId;

    private Date eventTime;

    private String eventType;

    private String eventName;

    private Date createTime;

    private Integer deleted;

    private String competitionname;

    private String homeTeamIcon;

    private String awayTeamIcon;

    private String homeTeamName;

    private String homeTeamNameEn;

    private String awayTeamName;

    private String awayTeamNameEn;

    private String clientId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode == null ? null : userCode.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId == null ? null : eventId.trim();
    }

    public Date getEventTime() {
        return eventTime;
    }

    public void setEventTime(Date eventTime) {
        this.eventTime = eventTime;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType == null ? null : eventType.trim();
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName == null ? null : eventName.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    public String getCompetitionname() {
        return competitionname;
    }

    public void setCompetitionname(String competitionname) {
        this.competitionname = competitionname == null ? null : competitionname.trim();
    }

    public String getHomeTeamIcon() {
        return homeTeamIcon;
    }

    public void setHomeTeamIcon(String homeTeamIcon) {
        this.homeTeamIcon = homeTeamIcon == null ? null : homeTeamIcon.trim();
    }

    public String getAwayTeamIcon() {
        return awayTeamIcon;
    }

    public void setAwayTeamIcon(String awayTeamIcon) {
        this.awayTeamIcon = awayTeamIcon == null ? null : awayTeamIcon.trim();
    }

    public String getHomeTeamName() {
        return homeTeamName;
    }

    public void setHomeTeamName(String homeTeamName) {
        this.homeTeamName = homeTeamName == null ? null : homeTeamName.trim();
    }

    public String getHomeTeamNameEn() {
        return homeTeamNameEn;
    }

    public void setHomeTeamNameEn(String homeTeamNameEn) {
        this.homeTeamNameEn = homeTeamNameEn == null ? null : homeTeamNameEn.trim();
    }

    public String getAwayTeamName() {
        return awayTeamName;
    }

    public void setAwayTeamName(String awayTeamName) {
        this.awayTeamName = awayTeamName == null ? null : awayTeamName.trim();
    }

    public String getAwayTeamNameEn() {
        return awayTeamNameEn;
    }

    public void setAwayTeamNameEn(String awayTeamNameEn) {
        this.awayTeamNameEn = awayTeamNameEn == null ? null : awayTeamNameEn.trim();
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId == null ? null : clientId.trim();
    }
}