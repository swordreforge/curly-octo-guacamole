package com.android.thememanager.detail.theme.model;

import com.android.thememanager.basemodule.network.theme.f7l8;
import com.android.thememanager.basemodule.network.theme.model.CommonResponse;
import com.android.thememanager.basemodule.network.theme.model.OrderResponse;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.android.thememanager.router.detail.entity.RewardData;
import com.android.thememanager.router.recommend.entity.UIPage;
import com.google.gson.kja0;
import f7z0.InterfaceC6030g;
import f7z0.InterfaceC6032i;
import f7z0.InterfaceC6034n;
import f7z0.ld6;
import f7z0.t8r;
import f7z0.zy;
import retrofit2.toq;

/* JADX INFO: loaded from: classes2.dex */
public interface PadDetailRequestInterface {
    @InterfaceC6030g("uipages/recommend?type=AOD_DETAIL_RIGHT")
    @ld6({f7l8.f57594zurt, f7l8.f57582cdj})
    toq<CommonResponse<UIPage>> getRecommendAod(@InterfaceC6032i(InterfaceC1925p.jt) int randIndex, @InterfaceC6032i("cardStart") int cardStart);

    @InterfaceC6030g("uipages/recommend?type=FONT_DETAIL_RIGHT")
    @ld6({f7l8.f57594zurt, f7l8.f57582cdj})
    toq<CommonResponse<UIPage>> getRecommendFont(@InterfaceC6032i(InterfaceC1925p.jt) int randIndex, @InterfaceC6032i("cardStart") int cardStart);

    @InterfaceC6030g("uipages/recommend?type=ICONS_DETAIL_RIGHT")
    @ld6({f7l8.f57594zurt, f7l8.f57582cdj})
    toq<CommonResponse<UIPage>> getRecommendIcon(@InterfaceC6032i(InterfaceC1925p.jt) int randIndex, @InterfaceC6032i("cardStart") int cardStart);

    @InterfaceC6030g("uipages/recommend?type=THEME_HOME")
    @ld6({f7l8.f57594zurt, f7l8.f57582cdj})
    toq<CommonResponse<UIPage>> getRecommendTheme(@InterfaceC6032i("cardStart") int cardStart);

    @InterfaceC6030g("uipages/recommend?type=ICONS_DETAIL_BELOW")
    @ld6({f7l8.f57584fn3e, f7l8.f57582cdj})
    toq<CommonResponse<kja0>> getRelateIcon(@InterfaceC6032i(InterfaceC1925p.jt) int randIndex, @InterfaceC6032i("cardStart") int cardStart, @InterfaceC6032i("uuid") String resourceId);

    @InterfaceC6030g("uipages/recommend?type=AOD_DETAIL")
    @ld6({f7l8.f57584fn3e, f7l8.f57582cdj})
    toq<CommonResponse<kja0>> getRelateRecommendAod(@InterfaceC6032i(InterfaceC1925p.jt) int randIndex, @InterfaceC6032i("cardStart") int cardStart, @InterfaceC6032i("uuid") String resourceId);

    @InterfaceC6030g("uipages/recommend?type=THEME_DETAIL")
    @ld6({f7l8.f57584fn3e, f7l8.f57582cdj})
    toq<CommonResponse<kja0>> getRelateRecommendTheme(@InterfaceC6032i("cardStart") int cardStart, @InterfaceC6032i("uuid") String resourceId);

    @InterfaceC6030g("products/detail/{onlineId}")
    @ld6({f7l8.f57584fn3e, f7l8.f57587kja0, "request_analytics_flag:/app/v9/products/detail"})
    toq<CommonResponse<OnlineResourceDetail>> getResourceDetail(@t8r("onlineId") String onlineId);

    @InterfaceC6034n
    @ld6({f7l8.f57594zurt, f7l8.f57582cdj})
    @f7z0.kja0("/thm/native/bounty/order")
    toq<OrderResponse<RewardData>> getRewardOrder(@zy("moduleId") String moduleId, @zy("bounty") String bounty, @zy("bountyId") String bountyId);

    @InterfaceC6030g("/thm/native/bounty/rand")
    @ld6({f7l8.f57594zurt, f7l8.f57582cdj})
    toq<OrderResponse<RewardData>> getRewardRand();

    @InterfaceC6034n
    @ld6({f7l8.f57592t8r, f7l8.f57582cdj})
    @f7z0.kja0("/thm/native/bounty/rank")
    toq<OrderResponse<RewardData>> getRewardRank(@zy("moduleId") String moduleId, @zy("pageIndex") int pageIndex, @zy("pageCount") int pageCount);

    @InterfaceC6030g("safe/products/detail/{onlineId}")
    @ld6({f7l8.f10067i, f7l8.f57587kja0, "request_analytics_flag:/app/v9/safe/products/detail"})
    toq<CommonResponse<OnlineResourceDetail>> getSafeResourceDetail(@t8r("onlineId") String onlineId);
}
