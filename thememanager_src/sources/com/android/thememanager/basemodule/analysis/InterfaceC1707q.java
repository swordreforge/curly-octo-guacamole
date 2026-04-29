package com.android.thememanager.basemodule.analysis;

import com.android.thememanager.basemodule.network.theme.model.EmptyResponse;
import com.android.thememanager.controller.online.InterfaceC1925p;
import f7z0.InterfaceC6034n;

/* JADX INFO: renamed from: com.android.thememanager.basemodule.analysis.q */
/* JADX INFO: compiled from: AnalyticsRequestInterface.java */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1707q {
    @InterfaceC6034n
    @f7z0.ld6({com.android.thememanager.basemodule.network.theme.f7l8.f57582cdj, com.android.thememanager.basemodule.network.theme.f7l8.f57594zurt})
    @f7z0.kja0("stats")
    /* JADX INFO: renamed from: k */
    retrofit2.toq<EmptyResponse> m6657k(@f7z0.zy("source") String source, @f7z0.zy(InterfaceC1925p.hkfy) String payload);

    @InterfaceC6034n
    @f7z0.ld6({com.android.thememanager.basemodule.network.theme.f7l8.f57582cdj, com.android.thememanager.basemodule.network.theme.f7l8.f57594zurt})
    @f7z0.kja0(InterfaceC1925p.qj)
    retrofit2.toq<EmptyResponse> toq(@f7z0.zy(InterfaceC1925p.igv) String actionType, @f7z0.zy("pageId") String pageId, @f7z0.zy(InterfaceC1925p.v9) String trackIds, @f7z0.zy("userId") String userId, @f7z0.zy("extra") String extra);
}
