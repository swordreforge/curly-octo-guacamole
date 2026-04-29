package com.android.thememanager.model;

import com.android.thememanager.basemodule.network.theme.f7l8;
import com.android.thememanager.basemodule.network.theme.model.CommonResponse;
import com.android.thememanager.router.recommend.entity.UIPage;
import f7z0.InterfaceC6030g;
import f7z0.ld6;
import mub.InterfaceC7396q;
import retrofit2.toq;

/* JADX INFO: compiled from: FloatingWindowRequestInterface.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface FloatingWindowRequestInterface {
    @InterfaceC7396q
    @InterfaceC6030g("page/v3/EXTEND_OPERATE_BANNER")
    @ld6({f7l8.f57594zurt, f7l8.f10066h})
    toq<CommonResponse<UIPage>> getFloatingWindowData();
}
