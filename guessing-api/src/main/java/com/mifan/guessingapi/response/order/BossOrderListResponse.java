package com.mifan.guessingapi.response.order;

import java.math.BigDecimal;
import java.util.Date;

public class BossOrderListResponse {

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

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public String getMarketId() {
        return marketId;
    }

    public void setMarketId(String marketId) {
        this.marketId = marketId;
    }

    public String getSelectionId() {
        return selectionId;
    }

    public void setSelectionId(String selectionId) {
        this.selectionId = selectionId;
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
        this.status = status;
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
        this.userCode = userCode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
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
        this.placedResult = placedResult;
    }
}
