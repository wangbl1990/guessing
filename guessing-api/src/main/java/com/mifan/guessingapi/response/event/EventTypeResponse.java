package com.mifan.guessingapi.response.event;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @auther wangbinlei
 * @create 2018/12/4
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel
public class EventTypeResponse implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty( name = "eventType" , value = "赛事类型" )
    private String eventType;//赛事ID




}
