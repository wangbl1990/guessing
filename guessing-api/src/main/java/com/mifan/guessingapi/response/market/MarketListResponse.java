package com.mifan.guessingapi.response.market;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel
public class MarketListResponse implements Serializable {

    @ApiModelProperty( name = "eventId" , value = "开放市场ID" )
    private String marketId;
    @ApiModelProperty( name = "ruleType" , value = "规则类型" )
    private String ruleType;
    @ApiModelProperty( name = "periodType" , value = "赛事ID" )
    private String periodType;
    @ApiModelProperty( name = "periodValue" , value = "赛事ID" )
    private String periodValue;
    @ApiModelProperty( name = "periodBegin" , value = "赛事ID" )
    private String periodBegin;
    @ApiModelProperty( name = "periodEnd" , value = "赛事ID" )
    private String periodEnd;
    @ApiModelProperty( name = "quotaAppetite" , value = "赛事ID" )
    private String quotaAppetite;
    @ApiModelProperty( name = "bettingDelay" , value = "赛事ID" )
    private String bettingDelay;
    @ApiModelProperty( name = "openResult" , value = "赛事ID" )
    private String openResult;
    @ApiModelProperty( name = "verifyResult" , value = "赛事ID" )
    private String verifyResult;
    @ApiModelProperty( name = "settledResult" , value = "赛事ID" )
    private String settledResult;
    @ApiModelProperty( name = "selectionResponseList" , value = "市场子项列表" )
    private List<MarketSelectionResponse> selectionResponseList;

}
