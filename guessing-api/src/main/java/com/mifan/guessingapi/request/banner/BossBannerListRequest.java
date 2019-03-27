package com.mifan.guessingapi.request.banner;

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
public class BossBannerListRequest implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty( name = "pageNum" , value = "页码" )
    private int pageNum;

    @ApiModelProperty( name = "pageSize" , value = "条数" )
    private int pageSize;

}
