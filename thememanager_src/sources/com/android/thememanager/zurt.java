package com.android.thememanager;

import com.android.thememanager.basemodule.network.theme.model.CommonResponse;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.android.thememanager.v9.model.UIPage;
import f7z0.InterfaceC6030g;
import f7z0.InterfaceC6032i;
import sok.C7670k;

/* JADX INFO: compiled from: RecommendRequestInterface.java */
/* JADX INFO: loaded from: classes.dex */
public interface zurt {
    @InterfaceC6030g("uipages?apiVersion=1")
    @f7z0.ld6({com.android.thememanager.basemodule.network.theme.f7l8.f57584fn3e})
    /* JADX INFO: renamed from: k */
    retrofit2.toq<CommonResponse<UIPage>> m10542k(@InterfaceC6032i(InterfaceC1925p.ivf) String category, @InterfaceC6032i("cardStart") int cardStart, @InterfaceC6032i("cardCount") int cardCount);

    @InterfaceC6030g("uipages/settings/aod/picker")
    @f7z0.ld6({com.android.thememanager.basemodule.network.theme.f7l8.f57594zurt})
    retrofit2.toq<CommonResponse<sok.toq<C7670k<sok.zy>>>> toq();
}
