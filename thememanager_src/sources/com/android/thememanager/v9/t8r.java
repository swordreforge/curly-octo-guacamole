package com.android.thememanager.v9;

import com.android.thememanager.basemodule.network.theme.model.CommonResponse;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.android.thememanager.router.recommend.entity.UIPage;
import f7z0.InterfaceC6030g;
import f7z0.InterfaceC6032i;

/* JADX INFO: compiled from: WallpaperDetailInterface.java */
/* JADX INFO: loaded from: classes2.dex */
public interface t8r {
    @InterfaceC6030g("page/v3/recommend")
    @f7z0.ld6({com.android.thememanager.basemodule.network.theme.f7l8.f57594zurt, "request_analytics_flag:/thm/page/v3/recommend"})
    /* JADX INFO: renamed from: k */
    retrofit2.toq<CommonResponse<UIPage>> m10203k(@InterfaceC6032i("cardStart") String cardStart, @InterfaceC6032i("type") String type, @InterfaceC6032i(InterfaceC1925p.a95z) String isSubject, @InterfaceC6032i("uuid") String subjectUuid);

    @InterfaceC6030g("page/v3/recommend")
    @f7z0.ld6({com.android.thememanager.basemodule.network.theme.f7l8.f57594zurt, "request_analytics_flag:/thm/page/v3/recommend"})
    retrofit2.toq<CommonResponse<UIPage>> toq(@InterfaceC6032i("cardStart") String cardStart, @InterfaceC6032i("type") String type);
}
