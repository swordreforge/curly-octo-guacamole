package com.android.thememanager.model;

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
public interface LargeIconRequestInterface {
    @InterfaceC6030g("page/v3/{onlineId}")
    @ld6({f7l8.f57594zurt, f7l8.f57582cdj})
    toq<CommonResponse<UIPage>> getLargeIconCategory(@t8r("onlineId") String onlineId);

    @InterfaceC6030g("page/v3/{onlineId}")
    @ld6({f7l8.f57594zurt, f7l8.f57582cdj})
    toq<CommonResponse<kja0>> getLargeIconCategoryData(@t8r("onlineId") String pageID, @InterfaceC6032i("cardStart") int cardStart, @InterfaceC6032i("cardCount") int count);
}
