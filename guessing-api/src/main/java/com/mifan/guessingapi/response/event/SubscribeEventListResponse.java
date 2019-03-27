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

    @ApiModelProperty( name = "id" , value = "预约ID" )
    private String id;
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
    @ApiModelProperty( name = "competitionname" , value = "联赛名称" )
    private String competitionname;
    @ApiModelProperty( name = "homeTeamName" , value = "主队名称" )
    private String homeTeamName;//主队名称
    @ApiModelProperty( name = "awayTeamName" , value = "客队名称" )
    private String awayTeamName;//客队名称
    @ApiModelProperty( name = "homeTeamNameEn" , value = "主队英文名" )
    private String homeTeamNameEn;
    @ApiModelProperty( name = "awayTeamNameEn" , value = "客队英文名" )
    private String awayTeamNameEn;
    @ApiModelProperty( name = "homeTeamIcon" , value = "主队Icon" )
    private String homeTeamIcon;
    @ApiModelProperty( name = "awayTeamIcon" , value = "客队Icon" )
    private String awayTeamIcon;
}
