package com.mifan.guessingapi.request.banner;

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
public class BossEditBannerRequest implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty( name = "id" , value = "bannnerID" )
    private String id;

    @ApiModelProperty( name = "title" , value = "banner标题" )
    private String title;//banner标题

    @ApiModelProperty( name = "picPath" , value = "banner图片存储路径" )
    private String picPath;//banner图片存储路径

    @ApiModelProperty( name = "picLink" , value = "banner图片链接地址" )
    private String picLink;//banner图片链接地址

    @ApiModelProperty( name = "createTime" , value = "创建时间" )
    private Date createTime;

    @ApiModelProperty( name = "modifyTime" , value = "修改时间" )
    private Date modifyTime;

}
