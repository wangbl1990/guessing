package com.mifan.guessingapi.response.event;

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
public class SubscribeEventListResponse implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty( name = "userCode" , value = "用户ID" )
    private String userCode;
    @ApiModelProperty( name = "phone" , value = "用户手机号" )
    private String phone;
    @ApiModelProperty( name = "eventId" , value = "赛事ID" )
    private String eventId;
    @ApiModelProperty( name = "eventTime" , value = "比赛时间" )
    private Date eventTime;
    @ApiModelProperty( name = "eventType" , value = "赛事类型" )
    private String eventType;
    @ApiModelProperty( name = "eventName" , value = "赛事名称" )
    private String eventName;

}
