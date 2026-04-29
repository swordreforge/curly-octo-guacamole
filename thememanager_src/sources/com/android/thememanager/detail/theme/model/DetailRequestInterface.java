package com.android.thememanager.detail.theme.model;

import com.android.thememanager.basemodule.network.theme.f7l8;
import com.android.thememanager.basemodule.network.theme.interceptors.C1774q;
import com.android.thememanager.basemodule.network.theme.model.CommonResponse;
import com.android.thememanager.basemodule.network.theme.model.OrderResponse;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.android.thememanager.model.LargeIconInfoElement;
import com.android.thememanager.router.detail.entity.RewardData;
import com.android.thememanager.router.recommend.entity.UIPage;
import com.google.gson.kja0;
import f7z0.InterfaceC6030g;
import f7z0.InterfaceC6032i;
import f7z0.InterfaceC6034n;
import f7z0.ld6;
import f7z0.t8r;
import f7z0.zy;
import java.util.List;
import m2t.C6794k;
import retrofit2.toq;

/* JADX INFO: loaded from: classes2.dex */
public interface DetailRequestInterface {
    @InterfaceC6030g("page/v3/theme/largeIcons")
    @ld6({f7l8.f57594zurt, f7l8.f57582cdj})
    toq<CommonResponse<OnlineResourceDetail>> getDefaultLargeIconDetail(@InterfaceC6032i("productPackageName") String productPackageName);

    @InterfaceC6030g("settings/app_list")
    @ld6({f7l8.f57594zurt, f7l8.f57582cdj})
    toq<CommonResponse<List<LargeIconInfoElement>>> getLargeIconInfoList();

    @InterfaceC6030g("native/page/v3/search/largeIcons")
    @ld6({f7l8.f57592t8r, f7l8.f57582cdj})
    toq<CommonResponse<UIPage>> getPickerRecommend(@InterfaceC6032i(InterfaceC1925p.ivf) String category, @InterfaceC6032i("cardStart") int pageIndex, @InterfaceC6032i("cardCount") int requestedCount, @InterfaceC6032i("productPackageName") String productPackageName);

    @InterfaceC6030g("page/v3/search/largeIcons")
    @ld6({f7l8.f57594zurt, f7l8.f57582cdj})
    toq<CommonResponse<UIPage>> getPickerRecommendNoLogin(@InterfaceC6032i(InterfaceC1925p.ivf) String category, @InterfaceC6032i("cardStart") int pageIndex, @InterfaceC6032i("cardCount") int requestedCount, @InterfaceC6032i("productPackageName") String productPackageName);

    @InterfaceC6030g("page/v3/recommend?type=AOD_DETAIL_RIGHT")
    @ld6({f7l8.f57594zurt, f7l8.f57582cdj})
    toq<CommonResponse<UIPage>> getRecommendAod(@InterfaceC6032i(InterfaceC1925p.jt) int randIndex, @InterfaceC6032i("cardStart") int cardStart);

    @InterfaceC6030g("page/v3/recommend?type=FONT_DETAIL_RIGHT")
    @ld6({f7l8.f57594zurt, f7l8.f57582cdj})
    toq<CommonResponse<UIPage>> getRecommendFont(@InterfaceC6032i(InterfaceC1925p.jt) int randIndex, @InterfaceC6032i("cardStart") int cardStart);

    @InterfaceC6030g("page/v3/recommend?type=ICONS_DETAIL_RIGHT")
    @ld6({f7l8.f57594zurt, f7l8.f57582cdj})
    toq<CommonResponse<UIPage>> getRecommendIcon(@InterfaceC6032i(InterfaceC1925p.jt) int randIndex, @InterfaceC6032i("cardStart") int cardStart);

    @InterfaceC6030g("page/v3/recommend?type=LARGEICONS_DETAIL_RIGHT")
    @ld6({f7l8.f57594zurt, f7l8.f57582cdj})
    toq<CommonResponse<UIPage>> getRecommendLargeIcon(@InterfaceC6032i(InterfaceC1925p.jt) int randIndex, @InterfaceC6032i("cardStart") int cardStart);

    @InterfaceC6030g("page/v3/recommend?type=THEME_HOME")
    @ld6({f7l8.f57594zurt, f7l8.f57582cdj})
    toq<CommonResponse<UIPage>> getRecommendTheme(@InterfaceC6032i("cardStart") int cardStart);

    @InterfaceC6030g("page/v3/recommend?type=ICONS_DETAIL_BELOW")
    @ld6({f7l8.f57584fn3e, f7l8.f57582cdj})
    toq<CommonResponse<kja0>> getRelateIcon(@InterfaceC6032i(InterfaceC1925p.jt) int randIndex, @InterfaceC6032i("cardStart") int cardStart, @InterfaceC6032i("uuid") String resourceId);

    @InterfaceC6030g("page/v3/recommend?type=LARGEICONS_DETAIL_BELOW")
    @ld6({f7l8.f57584fn3e, f7l8.f57582cdj})
    toq<CommonResponse<kja0>> getRelateLargeIcon(@InterfaceC6032i(InterfaceC1925p.jt) int randIndex, @InterfaceC6032i("cardStart") int cardStart, @InterfaceC6032i("uuid") String resourceId);

    @InterfaceC6030g("page/v3/recommend?type=AOD_DETAIL")
    @ld6({f7l8.f57584fn3e, f7l8.f57582cdj})
    toq<CommonResponse<kja0>> getRelateRecommendAod(@InterfaceC6032i(InterfaceC1925p.jt) int randIndex, @InterfaceC6032i("cardStart") int cardStart, @InterfaceC6032i("uuid") String resourceId);

    @InterfaceC6030g("page/v3/recommend?type=THEME_DETAIL")
    @ld6({f7l8.f57584fn3e, f7l8.f57582cdj})
    toq<CommonResponse<kja0>> getRelateRecommendTheme(@InterfaceC6032i("cardStart") int cardStart, @InterfaceC6032i("uuid") String resourceId);

    @InterfaceC6030g("page/v3/recommend?type=WIDGET_DETAIL_BELOW&isSubject=true")
    @ld6({f7l8.f57594zurt, f7l8.f57582cdj})
    toq<CommonResponse<kja0>> getRelatedWidget(@InterfaceC6032i("cardStart") int cardStart, @InterfaceC6032i("uuid") String uuid);

    @InterfaceC6030g("page/v3/theme/{onlineId}")
    @ld6({f7l8.f57584fn3e, f7l8.f57587kja0, "request_analytics_flag:/thm/page/v3/theme"})
    toq<CommonResponse<OnlineResourceDetail>> getResourceDetail(@t8r("onlineId") String onlineId, @InterfaceC6032i("systemUIPlugin") boolean systemUIPlugin);

    @InterfaceC6034n
    @ld6({f7l8.f57594zurt, f7l8.f57582cdj})
    @f7z0.kja0("/thm/native/bounty/order")
    toq<OrderResponse<RewardData>> getRewardOrder(@zy("moduleId") String moduleId, @zy("bounty") String bounty, @zy("bountyId") String bountyId, @zy(C1774q.bl) String accountType, @zy(InterfaceC1925p.du) String serviceToken, @zy(InterfaceC1925p.dqjj) String cUserId, @zy(InterfaceC1925p.v7x) String identityToken, @zy(C6794k.f84363ld6) String sign);

    @InterfaceC6030g("/thm/native/bounty/rand")
    @ld6({f7l8.f57594zurt, f7l8.f57582cdj})
    toq<OrderResponse<RewardData>> getRewardRand();

    @InterfaceC6034n
    @ld6({f7l8.f57592t8r, f7l8.f57582cdj})
    @f7z0.kja0("/thm/native/bounty/rank")
    toq<OrderResponse<RewardData>> getRewardRank(@zy("moduleId") String moduleId, @zy("pageIndex") int pageIndex, @zy("pageCount") int pageCount);

    @InterfaceC6030g("native/page/v3/theme/{onlineId}")
    @ld6({f7l8.f10067i, f7l8.f57587kja0, "request_analytics_flag:/thm/native/page/v3/theme"})
    toq<CommonResponse<OnlineResourceDetail>> getSafeResourceDetail(@t8r("onlineId") String onlineId, @InterfaceC6032i("systemUIPlugin") boolean systemUIPlugin);

    @InterfaceC6030g("native/page/v3/theme/{suitId}")
    @ld6({f7l8.f10067i, f7l8.f57587kja0, "request_analytics_flag:/thm/native/page/v3/theme"})
    toq<CommonResponse<OnlineResourceDetail>> getSafeWidgetDetail(@t8r(InterfaceC1925p.nt6s) String suitId, @InterfaceC6032i("productType") String productType);

    @InterfaceC6030g("page/v3/theme/{suitId}")
    @ld6({f7l8.f57584fn3e, f7l8.f57587kja0, "request_analytics_flag:/thm/page/v3/theme"})
    toq<CommonResponse<OnlineResourceDetail>> getWidgetDetail(@t8r(InterfaceC1925p.nt6s) String suitId, @InterfaceC6032i("productType") String productType);
}
