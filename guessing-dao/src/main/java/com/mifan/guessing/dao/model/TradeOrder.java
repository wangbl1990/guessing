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

    private Long fillAmount;

    private Long fillPrice;

    private String placedResult;

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

    public Long getFillAmount() {
        return fillAmount;
    }

    public void setFillAmount(Long fillAmount) {
        this.fillAmount = fillAmount;
    }

    public Long getFillPrice() {
        return fillPrice;
    }

    public void setFillPrice(Long fillPrice) {
        this.fillPrice = fillPrice;
    }

    public String getPlacedResult() {
        return placedResult;
    }

    public void setPlacedResult(String placedResult) {
        this.placedResult = placedResult == null ? null : placedResult.trim();
    }
}