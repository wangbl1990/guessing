package com.mifan.guessingapi.request.banner;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @auther wangbinlei
 * @create 2018/12/4
 */
@ApiModel
public class BossBannerListRequest {

    @ApiModelProperty( name = "pageNum" , value = "页码" )
    private int pageNum;

    @ApiModelProperty( name = "pageSize" , value = "条数" )
    private int pageSize;

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
