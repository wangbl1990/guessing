package com.mifan.guessingapi.request.order;

import com.mifan.guessingapi.request.BaseRequest;
import io.swagger.annotations.ApiModel;
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
    @ApiModelProperty( name = "homeTeamName" , value = "主队名称" )
    private String homeTeamName;
    @ApiModelProperty( name = "homeTeamNameEn" , value = "主队英文名称" )
    private String homeTeamNameEn;
    @ApiModelProperty( name = "awayTeamName" , value = "客队名称" )
    private String awayTeamName;
    @ApiModelProperty( name = "awayTeamNameEn" , value = "客队英文名称" )
    private String awayTeamNameEn;
    @ApiModelProperty( name = "homeTeamIcon" , value = "主队Icon" )
    private String homeTeamIcon;
    @ApiModelProperty( name = "awayTeamIcon" , value = "客队Icon" )
    private String awayTeamIcon;
    @ApiModelProperty( name = "selectionName" , value = "选项名称" )
    private String selectionName;
    @ApiModelProperty( name = "selectionValue" , value = "选项值" )
    private BigDecimal selectionValue;
}
