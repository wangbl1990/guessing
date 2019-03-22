package com.mifan.guessingapi.request.event;

import com.mifan.guessingapi.request.BaseRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @auther wangbinlei
 * @create 2018/12/4
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel
public class SubscribeEventRequest extends BaseRequest implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty( name = "eventId" , value = "赛事ID" )
    private String eventId;
    @ApiModelProperty( name = "eventTime" , value = "赛事开始时间" )
    private Date eventTime;
    @ApiModelProperty( name = "sportId" , value = "赛事类型" )
    private String sportId;
    @ApiModelProperty( name = "eventName" , value = "赛事名称" )
    private String eventName;
    @ApiModelProperty( name = "competitionname" , value = "联赛名称" )
    private String competitionname;

}
