package com.mifan.guessingapi.response.order;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class MyOrderListResponse implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty( name = "orderId" , value = "订单编号" )
    private String orderId;
    @ApiModelProperty( name = "eventId" , value = "赛事ID" )
    private String eventId;
    @ApiModelProperty( name = "marketId" , value = "市场ID" )
    private String marketId;
    @ApiModelProperty( name = "selectionId" , value = "子项ID" )
    private String selectionId;
    @ApiModelProperty( name = "requestAmount" , value = "下单金额" )
    private BigDecimal requestAmount;
    @ApiModelProperty( name = "requestPrice" , value = "下单赔率" )
    private BigDecimal requestPrice;
    @ApiModelProperty( name = "status" , value = "订单状态 0 :下单成功;1:接单成功;2:订单已结算;3:订单取消;4:订单⽆无效;5:订单被拒" )
    private String status;
    @ApiModelProperty( name = "submittedTime" , value = "结算时间" )
    private Date submittedTime;
    @ApiModelProperty( name = "userCode" , value = "用户ID" )
    private String userCode;
    @ApiModelProperty( name = "userName" , value = "用户名称" )
    private String userName;
    @ApiModelProperty( name = "eventType" , value = "赛事类型" )
    private String eventType;
    @ApiModelProperty( name = "eventName" , value = "赛事名称" )
    private String eventName;
    @ApiModelProperty( name = "placedResult" , value = "下单时比分" )
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

    public String getPlacedResult() {
        return placedResult;
    }

    public void setPlacedResult(String placedResult) {
        this.placedResult = placedResult;
    }
}
