package com.android.thememanager.mine.setting.model;

import com.android.thememanager.basemodule.network.theme.f7l8;
import com.android.thememanager.basemodule.network.theme.model.CommonResponse;
import f7z0.InterfaceC6030g;
import f7z0.InterfaceC6034n;
import f7z0.kja0;
import f7z0.ld6;
import f7z0.zy;
import retrofit2.toq;

/* JADX INFO: loaded from: classes2.dex */
public interface SupportThemeRequestInterface {
    @InterfaceC6030g("list/adOfFree")
    @ld6({f7l8.f57594zurt})
    toq<CommonResponse<SupportTheme>> fetchSupportCount();

    @InterfaceC6034n
    @ld6({f7l8.f57594zurt})
    @kja0("like/adOfFree")
    toq<CommonResponse<SupportTheme>> supportTheme(@zy("uselessParam") Integer uselessParam);
}
