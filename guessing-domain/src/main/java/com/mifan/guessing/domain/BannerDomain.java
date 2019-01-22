package com.mifan.guessing.domain;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mifan.guessing.dao.mapper.BannerMapper;
import com.mifan.guessing.dao.model.Banner;
import com.mifan.guessing.dao.model.BannerExample;
import com.mifan.guessingapi.request.banner.*;
import com.mifan.guessingapi.response.banner.AppBannerListResponse;
import com.mifan.guessingapi.response.banner.BossBannerListResponse;
import com.mifan.guessingapi.response.banner.BossGetBannerResponse;
import com.mifan.guessingutils.BeanMapper;
import com.mifan.guessingutils.IdMakerUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

/**
 * @auther wangbinlei
 * @create 2018/12/4
 */
@Component
public class BannerDomain {

    @Autowired
    private BannerMapper bannerMapper;

    /**
     * banner列表
     * @param bossBannerListRequest
     * @return
     */
    public PageInfo<BossBannerListResponse> list(BossBannerListRequest bossBannerListRequest) {
        BannerExample example = new BannerExample();
        PageHelper.startPage(bossBannerListRequest.getPageNum(), bossBannerListRequest.getPageSize(),true);
        List<Banner> banners = bannerMapper.selectByExample(example);
        PageInfo<BossBannerListResponse> repageList = new PageInfo(banners);
        List<BossBannerListResponse> eventList = BeanMapper.mapList(banners, BossBannerListResponse.class);
        repageList.setList(eventList);
        return repageList;
    }

    /**
     * banner详情
     * @param bossGetBannerRequest
     * @return
     */
    public BossGetBannerResponse get(BossGetBannerRequest bossGetBannerRequest) {
        BannerExample example = new BannerExample();
        List<Banner> banners = bannerMapper.selectByExample(example);
        Banner banner = banners.get(0);
        BossGetBannerResponse bossBannerListResponse = BeanMapper.map(banner, BossGetBannerResponse.class);
        return bossBannerListResponse;
    }

    /**
     * banner删除
     * @param bossDeletBannerRequest
     * @return
     */
    public int del(BossDeletBannerRequest bossDeletBannerRequest) {

        List<String> bannerIds = bossDeletBannerRequest.getBannerIds();
        for(String bannerId : bannerIds){
            int result = bannerMapper.deleteByPrimaryKey(bannerId);
        }
        return 1;
    }

    /**
     * banner编辑
     * @param bossEditBannerRequest
     * @return
     */
    public int edit(BossEditBannerRequest bossEditBannerRequest) {
        Banner banner = BeanMapper.map(bossEditBannerRequest,Banner.class);
        banner.setModifyTime(new Date());
        int result = bannerMapper.updateByPrimaryKeySelective(banner);
        return result;
    }

    /**
     * banner新增
     * @param bossCreatBannerRequest
     * @return
     */
    public int insert(BossCreatBannerRequest bossCreatBannerRequest) {
        Banner banner = BeanMapper.map(bossCreatBannerRequest,Banner.class);
        banner.setCreateTime(new Date());
        banner.setModifyTime(new Date());
        banner.setId(IdMakerUtils.getOrderId());
        int result = bannerMapper.insert(banner);
        return result;
    }

    /**
     * banner 列表 for APP
     * @param appBannerListRequest
     * @return
     */
    public List<AppBannerListResponse> listForApp(AppBannerListRequest appBannerListRequest) {
        BannerExample example = new BannerExample();
        List<Banner> banners = bannerMapper.selectByExample(example);
        List<AppBannerListResponse> eventList = BeanMapper.mapList(banners, AppBannerListResponse.class);
        return eventList;
    }
}
