package com.mifan.guessingapi.request.event;

import com.mifan.guessingapi.request.BaseRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @auther wangbinlei
 * @create 2018/12/4
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel
public class EventDetailRequest extends BaseRequest {

    @ApiModelProperty( name = "eventId" , value = "赛事ID" )
    private String eventId;//赛事ID

}
