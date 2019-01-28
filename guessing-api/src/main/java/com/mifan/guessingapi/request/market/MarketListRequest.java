package com.mifan.guessingapi.request.market;

import com.mifan.guessingapi.request.BaseRequest;
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
public class MarketListRequest extends BaseRequest implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty( name = "eventId" , value = "赛事ID" )
    private String envetId;

}
