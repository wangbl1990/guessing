package com.mifan.guessing.dao.model;

import java.math.BigDecimal;
import java.util.Date;

public class TradeOrder {
    private String id;

    private String orderId;

    private String eventId;

    private String marketId;

    private String selectionId;

    private BigDecimal requestAmount;

    private BigDecimal requestPrice;

    private String status;

    private Date submittedTime;

    private String userCode;

    private String userName;

    private String eventType;

    private String eventName;

    private String placedResult;

    private String competitionName;

    private String seasonName;

    private String roundName;

    private String ruleTypeName;

    private String selectionOdds;

    private Date eventTime;

    private String homeTeamName;

    private String homeTeamNameEn;

    private String awayTeamName;

    private String awayTeamNameEn;

    private String homeTeamIcon;

    private String awayTeamIcon;

    private String selectionName;

    private BigDecimal selectionValue;

    private String remark;

    private BigDecimal settleIncomeLose;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId == null ? null : eventId.trim();
    }

    public String getMarketId() {
        return marketId;
    }

    public void setMarketId(String marketId) {
        this.marketId = marketId == null ? null : marketId.trim();
    }

    public String getSelectionId() {
        return selectionId;
    }

    public void setSelectionId(String selectionId) {
        this.selectionId = selectionId == null ? null : selectionId.trim();
    }

    public BigDecimal getRequestAmount() {
        return requestAmount;
    }

    public void setRequestAmount(BigDecimal requestAmount) {
        this.requestAmount = requestAmount;
    }

    public BigDecimal getRequestPrice() {
        return requestPrice;
    }

    public void setRequestPrice(BigDecimal requestPrice) {
        this.requestPrice = requestPrice;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getSubmittedTime() {
        return submittedTime;
    }

    public void setSubmittedTime(Date submittedTime) {
        this.submittedTime = submittedTime;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode == null ? null : userCode.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
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

    public String getPlacedResult() {
        return placedResult;
    }

    public void setPlacedResult(String placedResult) {
        this.placedResult = placedResult == null ? null : placedResult.trim();
    }

    public String getCompetitionName() {
        return competitionName;
    }

    public void setCompetitionName(String competitionName) {
        this.competitionName = competitionName == null ? null : competitionName.trim();
    }

    public String getSeasonName() {
        return seasonName;
    }

    public void setSeasonName(String seasonName) {
        this.seasonName = seasonName == null ? null : seasonName.trim();
    }

    public String getRoundName() {
        return roundName;
    }

    public void setRoundName(String roundName) {
        this.roundName = roundName == null ? null : roundName.trim();
    }

    public String getRuleTypeName() {
        return ruleTypeName;
    }

    public void setRuleTypeName(String ruleTypeName) {
        this.ruleTypeName = ruleTypeName == null ? null : ruleTypeName.trim();
    }

    public String getSelectionOdds() {
        return selectionOdds;
    }

    public void setSelectionOdds(String selectionOdds) {
        this.selectionOdds = selectionOdds == null ? null : selectionOdds.trim();
    }

    public Date getEventTime() {
        return eventTime;
    }

    public void setEventTime(Date eventTime) {
        this.eventTime = eventTime;
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

    public String getSelectionName() {
        return selectionName;
    }

    public void setSelectionName(String selectionName) {
        this.selectionName = selectionName == null ? null : selectionName.trim();
    }

    public BigDecimal getSelectionValue() {
        return selectionValue;
    }

    public void setSelectionValue(BigDecimal selectionValue) {
        this.selectionValue = selectionValue;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public BigDecimal getSettleIncomeLose() {
        return settleIncomeLose;
    }

    public void setSettleIncomeLose(BigDecimal settleIncomeLose) {
        this.settleIncomeLose = settleIncomeLose;
    }
}