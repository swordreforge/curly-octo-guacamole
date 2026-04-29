package com.android.thememanager.detail.video.model;

import com.android.thememanager.basemodule.network.theme.f7l8;
import com.android.thememanager.basemodule.network.theme.model.CommonResponse;
import com.android.thememanager.router.recommend.entity.UIPage;
import com.google.gson.kja0;
import f7z0.InterfaceC6030g;
import f7z0.InterfaceC6032i;
import f7z0.ld6;
import f7z0.t8r;
import retrofit2.toq;

/* JADX INFO: loaded from: classes2.dex */
public interface VideoRequestInterface {
    @InterfaceC6030g("safe/products/{onlineId}")
    @ld6({f7l8.f57592t8r, f7l8.f57582cdj})
    toq<kja0> getSafeVideoDetail(@t8r("onlineId") String onlineId);

    @InterfaceC6030g("products/{onlineId}")
    @ld6({f7l8.f57594zurt, f7l8.f57582cdj})
    toq<kja0> getVideoDetail(@t8r("onlineId") String onlineId);

    @InterfaceC6030g("page/v3/recommend?type=VIDEO_WP_INDEX")
    @ld6({f7l8.f57584fn3e, f7l8.f57582cdj})
    toq<CommonResponse<UIPage>> getVideoStaggeredUrl(@InterfaceC6032i("cardStart") int page);
}
