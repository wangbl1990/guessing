package com.mifan.guessingapi.request.banner;

import java.io.Serializable;
import java.util.List;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @auther wangbinlei
 * @create 2018/12/4
 */
@ApiModel
public class BossDeletBannerRequest implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty( name = "bannerIds" , value = "bannerId集合" )
    private List<String> bannerIds;

    public List<String> getBannerIds() {
        return bannerIds;
    }

    public void setBannerIds(List<String> bannerIds) {
        this.bannerIds = bannerIds;
    }
}
