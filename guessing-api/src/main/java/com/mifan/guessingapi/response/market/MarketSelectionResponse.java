package com.mifan.guessingapi.response.market;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel
public class MarketSelectionResponse implements Serializable {

    @ApiModelProperty( name = "selectionId" , value = "子项ID" )
    private String selectionId;
    @ApiModelProperty( name = "backOdds" , value = "赛事ID" )
    private String backOdds;
    @ApiModelProperty( name = "lastBackOdds" , value = "赛事ID" )
    private String lastBackOdds;
    @ApiModelProperty( name = "maxStakeLimit" , value = "赛事ID" )
    private String maxStakeLimit;

}
