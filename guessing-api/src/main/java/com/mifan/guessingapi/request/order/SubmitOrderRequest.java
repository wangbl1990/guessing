package com.mifan.guessingapi.request.order;

import com.mifan.guessingapi.request.BaseRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;

@ApiModel
public class SubmitOrderRequest extends BaseRequest {

    @ApiModelProperty( name = "eventId" , value = "赛事ID" )
    private String eventId;
    @ApiModelProperty( name = "eventName" , value = "赛事名称" )
    private String eventName;
    @ApiModelProperty( name = "eventType" , value = "赛事类型" )
    private String eventType;
    @ApiModelProperty( name = "marketId" , value = "开放市场ID" )
    private String marketId;
    @ApiModelProperty( name = "selectionId" , value = "市场子项ID" )
    private String selectionId;
    @ApiModelProperty( name = "placeResult" , value = "盘中验证，回填marketVerifyResult" )
    private String placeResult;
    @ApiModelProperty( name = "requestPrice" , value = "下单价格买单为backOdds" )
    private BigDecimal requestPrice;
    @ApiModelProperty( name = "requestAmount" , value = "下单金额单位分" )
    private BigDecimal requestAmount;

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

    public String getPlaceResult() {
        return placeResult;
    }

    public void setPlaceResult(String placeResult) {
        this.placeResult = placeResult;
    }

    public BigDecimal getRequestPrice() {
        return requestPrice;
    }

    public void setRequestPrice(BigDecimal requestPrice) {
        this.requestPrice = requestPrice;
    }

    public BigDecimal getRequestAmount() {
        return requestAmount;
    }

    public void setRequestAmount(BigDecimal requestAmount) {
        this.requestAmount = requestAmount;
    }
}
