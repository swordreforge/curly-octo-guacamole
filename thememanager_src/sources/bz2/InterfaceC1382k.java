package bz2;

import com.android.thememanager.basemodule.network.theme.f7l8;
import com.android.thememanager.basemodule.network.theme.model.CommonResponse;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.android.thememanager.router.recommend.entity.UIPage;
import com.google.gson.kja0;
import f7z0.InterfaceC6030g;
import f7z0.InterfaceC6032i;
import f7z0.ld6;
import f7z0.t8r;

/* JADX INFO: renamed from: bz2.k */
/* JADX INFO: compiled from: WallpaperSettingInterface.java */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC1382k {
    @InterfaceC6030g("settings/picture-description")
    @ld6({f7l8.f57594zurt})
    /* JADX INFO: renamed from: k */
    retrofit2.toq<CommonResponse<kja0>> m5839k();

    @InterfaceC6030g("page/v3/setting/picker/wallpaper")
    @ld6({f7l8.f57594zurt})
    /* JADX INFO: renamed from: n */
    retrofit2.toq<CommonResponse<UIPage>> m5840n(@InterfaceC6032i("cardStart") int cardStart);

    @InterfaceC6030g("uipages/settings/wallpaper/V2")
    @ld6({f7l8.f57594zurt})
    /* JADX INFO: renamed from: q */
    retrofit2.toq<CommonResponse<kja0>> m5841q(@InterfaceC6032i("cardStart") int cardStart, @InterfaceC6032i(InterfaceC1925p.jt) int randomIndex);

    @InterfaceC6030g("page/v3/subjects/{uuid}")
    retrofit2.toq<CommonResponse<UIPage>> toq(@t8r("uuid") String uuid, @InterfaceC6032i("cardStart") int cardStart, @InterfaceC6032i("cardCount") int count, @InterfaceC6032i("deviceType") String deviceType);

    @InterfaceC6030g("uipages/settings/wallpaper/V3")
    @ld6({f7l8.f57594zurt})
    retrofit2.toq<CommonResponse<kja0>> zy(@InterfaceC6032i("cardStart") int cardStart, @InterfaceC6032i(InterfaceC1925p.jt) int randomIndex);
}
