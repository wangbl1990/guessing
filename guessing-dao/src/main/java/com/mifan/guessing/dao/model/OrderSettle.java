package com.mifan.guessing.dao.model;

import java.util.Date;

public class OrderSettle {
    private String id;

    private String orderId;

    private Long orderAmount;

    private Long settleIncome;

    private Long settleLoss;

    private String type;

    private String eventType;

    private String eventName;

    private String playName;

    private String status;

    private Date settleTime;

    private Date createTime;

    private String userNikeName;

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

    public Long getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(Long orderAmount) {
        this.orderAmount = orderAmount;
    }

    public Long getSettleIncome() {
        return settleIncome;
    }

    public void setSettleIncome(Long settleIncome) {
        this.settleIncome = settleIncome;
    }

    public Long getSettleLoss() {
        return settleLoss;
    }

    public void setSettleLoss(Long settleLoss) {
        this.settleLoss = settleLoss;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
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

    public String getPlayName() {
        return playName;
    }

    public void setPlayName(String playName) {
        this.playName = playName == null ? null : playName.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getSettleTime() {
        return settleTime;
    }

    public void setSettleTime(Date settleTime) {
        this.settleTime = settleTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUserNikeName() {
        return userNikeName;
    }

    public void setUserNikeName(String userNikeName) {
        this.userNikeName = userNikeName == null ? null : userNikeName.trim();
    }
}