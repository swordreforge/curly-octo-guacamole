package com.android.thememanager.mine.setting.model;

import com.android.thememanager.basemodule.network.theme.f7l8;
import com.android.thememanager.basemodule.network.theme.model.CommonResponse;
import com.google.gson.kja0;
import f7z0.InterfaceC6030g;
import f7z0.InterfaceC6032i;
import f7z0.ld6;
import retrofit2.toq;

/* JADX INFO: loaded from: classes2.dex */
public interface FontSettingRequestInterface {
    @InterfaceC6030g("uipages/settings/font")
    @ld6({f7l8.f57594zurt, f7l8.f10066h})
    toq<CommonResponse<kja0>> getSettingsFontList(@InterfaceC6032i("cardStart") int cardStart, @InterfaceC6032i("cardCount") int cardCount);
}
