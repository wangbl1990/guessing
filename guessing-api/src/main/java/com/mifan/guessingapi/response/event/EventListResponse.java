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

    private static final long serialVersionUID = 1L;

    @ApiModelProperty( name = "id" , value = "赛事ID" )
    private String id;//赛事ID
    @ApiModelProperty( name = "eventId" , value = "滚球赛事ID" )
    private String eventId;//滚球赛事ID
    @ApiModelProperty( name = "sportId" , value = "赛事类型 1 足球" )
    private String sportId;//赛事类型 1 足球
    @ApiModelProperty( name = "eventName" , value = "赛事名称" )
    private String eventName;//赛事名称
    @ApiModelProperty( name = "eventTime" , value = "比赛时间" )
    private Date eventTime;//比赛时间
    @ApiModelProperty( name = "competitionName" , value = "赛事类型" )
    private String competitionName;//赛事类型
    @ApiModelProperty( name = "seasonName" , value = "赛季" )
    private String seasonName;
    @ApiModelProperty( name = "roundName" , value = "轮次" )
    private String roundName;
    @ApiModelProperty( name = "homeTeamName" , value = "主队名称" )
    private String homeTeamName;//主队名称
    @ApiModelProperty( name = "awayTeamName" , value = "客队名称" )
    private String awayTeamName;//客队名称
    @ApiModelProperty( name = "homeTeamNameEn" , value = "主队英文名" )
    private String homeTeamNameEn;
    @ApiModelProperty( name = "awayTeamNameEn" , value = "客队英文名" )
    private String awayTeamNameEn;
    @ApiModelProperty( name = "score" , value = "赛果" )
    private String score;
    @ApiModelProperty( name = "state" , value = "比赛状态 0:未开,1:上半场,2:中场,3:下半场,4,加时，-11:待定,-12:腰斩,-13:中断,-14:推迟,-1:完场，-10取消" )
    private String state;
    @ApiModelProperty( name = "hot" , value = "是否热门" )
    private String hot;

}
