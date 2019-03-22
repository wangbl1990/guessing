package com.mifan.guessingapi.response.order;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
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
    @ApiModelProperty( name = "homeTeamName" , value = "主队名称" )
    private String homeTeamName;
    @ApiModelProperty( name = "homeTeamNameEn" , value = "主队英文名称" )
    private String homeTeamNameEn;
    @ApiModelProperty( name = "awayTeamName" , value = "客队名称" )
    private String awayTeamName;
    @ApiModelProperty( name = "awayTeamNameEn" , value = "客队英文名称" )
    private String awayTeamNameEn;

}
