package com.mifan.guessing.service;

import com.github.pagehelper.PageInfo;
import com.mifan.guessingapi.request.banner.*;
import com.mifan.guessingapi.response.BaseResponse;
import com.mifan.guessingapi.response.banner.BossBannerListResponse;
import com.mifan.guessingapi.response.banner.BossGetBannerResponse;

/**
 * @auther wangbinlei
 * @create 2018/12/13
 */
public interface BannerService {

    public BaseResponse<PageInfo<BossBannerListResponse>> list(BossBannerListRequest request);

    public BaseResponse<Integer> add(BossCreatBannerRequest request);

    public BaseResponse<Integer> del(BossDeletBannerRequest request);

    public BaseResponse<Integer> edit(BossEditBannerRequest request);

    public BaseResponse<BossGetBannerResponse> get(BossGetBannerRequest request);

}
