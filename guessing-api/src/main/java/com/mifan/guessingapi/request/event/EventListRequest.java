package com.mifan.guessingapi.request.event;

import com.mifan.guessingapi.request.BaseRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

/**
 * @auther wangbinlei
 * @create 2018/12/4
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel
public class EventListRequest extends BaseRequest {

    @ApiModelProperty( name = "pageNum" , value = "页码" )
    @Min( value = 1 , message = "页码必须大于0")
    private int pageNum;

    @ApiModelProperty( name = "pageSize" , value = "条数" )
    @Min( value = 1 , message = "条数必须大于0")
    @Max( value = 20 , message = "条数必须小于20")
    private int pageSize;

    @ApiModelProperty( name = "eventType" , value = "赛事类型" )
    private String eventType;//赛事类型

}
