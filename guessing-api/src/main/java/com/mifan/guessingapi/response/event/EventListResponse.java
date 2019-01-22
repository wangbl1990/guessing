package com.mifan.guessingapi.response.event;

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
public class EventListResponse implements Serializable {

    @ApiModelProperty( name = "id" , value = "赛事ID" )
    private String id;//赛事ID
    @ApiModelProperty( name = "eventId" , value = "滚球赛事ID" )
    private String eventId;//滚球赛事ID
    @ApiModelProperty( name = "sportId" , value = "运动项目ID" )
    private String sportId;//运动项目ID
    @ApiModelProperty( name = "eventName" , value = "赛事名称" )
    private String eventName;//赛事名称
    @ApiModelProperty( name = "eventTime" , value = "赛事时间" )
    private Date eventTime;//赛事时间
    @ApiModelProperty( name = "competitionName" , value = "赛事类型" )
    private String competitionName;//赛事类型
    @ApiModelProperty( name = "seasonName" , value = "赛事ID" )
    private String seasonName;
    @ApiModelProperty( name = "roundName" , value = "赛事ID" )
    private String roundName;
    @ApiModelProperty( name = "homeTeamName" , value = "主队名称" )
    private String homeTeamName;//主队名称
    @ApiModelProperty( name = "awayTeamName" , value = "客队名称" )
    private String awayTeamName;//客队名称
    @ApiModelProperty( name = "homeTeamScore" , value = "主队得分" )
    private String homeTeamScore;//主队得分
    @ApiModelProperty( name = "awayTeamScore" , value = "客队得分" )
    private String awayTeamScore;//客队得分
    @ApiModelProperty( name = "state" , value = "赛事ID" )
    private String state;
    @ApiModelProperty( name = "stage" , value = "赛事ID" )
    private String stage;

}
