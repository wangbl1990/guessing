package com.mifan.guessingapi.response.banner;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

/**
 * @auther wangbinlei
 * @create 2018/12/4
 */
@ApiModel
public class BossBannerListResponse implements Serializable {

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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPicPath() {
        return picPath;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath;
    }

    public String getPicLink() {
        return picLink;
    }

    public void setPicLink(String picLink) {
        this.picLink = picLink;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }
}
