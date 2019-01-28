package com.mifan.guessingapi.request.banner;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * @auther wangbinlei
 * @create 2018/12/4
 */
@ApiModel
public class BossGetBannerRequest implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty( name = "id" , value = "bannnerId" )
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
