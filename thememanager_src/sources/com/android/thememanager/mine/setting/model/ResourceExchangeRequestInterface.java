package com.android.thememanager.mine.setting.model;

import com.android.thememanager.basemodule.network.theme.f7l8;
import com.android.thememanager.basemodule.network.theme.model.CommonResponse;
import f7z0.InterfaceC6034n;
import f7z0.kja0;
import f7z0.ld6;
import f7z0.zy;
import retrofit2.toq;

/* JADX INFO: loaded from: classes2.dex */
public interface ResourceExchangeRequestInterface {
    @InterfaceC6034n
    @ld6({f7l8.f57582cdj, f7l8.f57592t8r})
    @kja0("native/redeemInfo")
    toq<CommonResponse<Object>> checkRedeemCode(@zy("code") String redeemCode);
}
