package com.mifan.guessingapi.request.order;

import com.mifan.guessingapi.request.BaseRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@ApiModel
public class SubmitOrderRequest extends BaseRequest implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty( name = "eventId" , value = "赛事ID" )
    private String eventId;
    @ApiModelProperty( name = "eventName" , value = "赛事名称" )
    private String eventName;
    @ApiModelProperty( name = "sportId" , value = "赛事类型" )
    private String sportId;
    @ApiModelProperty( name = "marketId" , value = "开放市场ID" )
    private String marketId;
    @ApiModelProperty( name = "selectionId" , value = "市场子项ID" )
    private String selectionId;
//    @ApiModelProperty( name = "placeResult" , value = "盘中验证，回填marketVerifyResult" )
//    private String placeResult;
    @ApiModelProperty( name = "requestPrice" , value = "下单价格买单为backOdds" )
    private BigDecimal requestPrice;
    @ApiModelProperty( name = "requestAmount" , value = "下单金额单位分" )
    private BigDecimal requestAmount;

    @ApiModelProperty( name = "competitionName" , value = "联赛名称" )
    private String competitionName;
    @ApiModelProperty( name = "seasonName" , value = "赛季" )
    private String seasonName;
    @ApiModelProperty( name = "roundName" , value = "轮次" )
    private String roundName;
    @ApiModelProperty( name = "ruleTypeName" , value = "玩法名称" )
    private String ruleTypeName;
    @ApiModelProperty( name = "selectionOdds" , value = "选项详情" )
    private String selectionOdds;
    @ApiModelProperty( name = "eventTime" , value = "赛事时间" )
    private Date eventTime;

    public String getSportId() {
        return sportId;
    }

    public void setSportId(String sportId) {
        this.sportId = sportId;
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

    public String getCompetitionName() {
        return competitionName;
    }

    public void setCompetitionName(String competitionName) {
        this.competitionName = competitionName;
    }

    public String getSeasonName() {
        return seasonName;
    }

    public void setSeasonName(String seasonName) {
        this.seasonName = seasonName;
    }

    public String getRoundName() {
        return roundName;
    }

    public void setRoundName(String roundName) {
        this.roundName = roundName;
    }

    public String getRuleTypeName() {
        return ruleTypeName;
    }

    public void setRuleTypeName(String ruleTypeName) {
        this.ruleTypeName = ruleTypeName;
    }

    public String getSelectionOdds() {
        return selectionOdds;
    }

    public void setSelectionOdds(String selectionOdds) {
        this.selectionOdds = selectionOdds;
    }

    public Date getEventTime() {
        return eventTime;
    }

    public void setEventTime(Date eventTime) {
        this.eventTime = eventTime;
    }
}
