package com.mifan.guessing.serviceimpl;

import com.github.pagehelper.PageInfo;
import com.mifan.guessing.domain.BannerDomain;
import com.mifan.guessing.service.BannerService;
import com.mifan.guessingapi.request.banner.*;
import com.mifan.guessingapi.response.BaseResponse;
import com.mifan.guessingapi.response.banner.BossBannerListResponse;
import com.mifan.guessingapi.response.banner.BossGetBannerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @auther wangbinlei
 * @create 2018/12/13
 */
@Service(value = "bannerService")
public class BannerServiceImpl implements BannerService {

    @Autowired
    private BannerDomain bannerDomain;

    @Override
    public BaseResponse<PageInfo<BossBannerListResponse>> list(BossBannerListRequest request) {

        PageInfo<BossBannerListResponse> list = bannerDomain.list(request);
        return BaseResponse.generateOKResponseEntity(list);
    }

    @Override
    public BaseResponse<Integer> add(BossCreatBannerRequest request) {
        int list = bannerDomain.insert(request);
        return BaseResponse.generateOKResponseEntity(list);
    }

    @Override
    public BaseResponse<Integer> del(BossDeletBannerRequest request) {
        int list = bannerDomain.del(request);
        return BaseResponse.generateOKResponseEntity(list);
    }

    @Override
    public BaseResponse<Integer> edit(BossEditBannerRequest request) {
        int list = bannerDomain.edit(request);
        return BaseResponse.generateOKResponseEntity(list);
    }

    @Override
    public BaseResponse<BossGetBannerResponse> get(BossGetBannerRequest request) {
        BossGetBannerResponse list = bannerDomain.get(request);
        return BaseResponse.generateOKResponseEntity(list);
    }
}
