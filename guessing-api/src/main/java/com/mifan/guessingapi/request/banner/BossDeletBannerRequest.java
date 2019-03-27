package com.mifan.guessingapi.request.banner;

import java.io.Serializable;
import java.util.List;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @auther wangbinlei
 * @create 2018/12/4
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel
public class BossDeletBannerRequest implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty( name = "bannerIds" , value = "bannerId集合" )
    private List<String> bannerIds;

}
