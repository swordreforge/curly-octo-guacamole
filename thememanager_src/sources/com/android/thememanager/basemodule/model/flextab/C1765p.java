package com.android.thememanager.basemodule.model.flextab;

import com.android.thememanager.R;
import com.android.thememanager.basemodule.utils.qrj;

/* JADX INFO: renamed from: com.android.thememanager.basemodule.model.flextab.p */
/* JADX INFO: compiled from: VideowallpaperTab.java */
/* JADX INFO: loaded from: classes.dex */
public class C1765p extends toq {
    public C1765p() {
        this.f10064k = "videowallpaper";
    }

    @Override // com.android.thememanager.basemodule.model.flextab.toq
    public boolean f7l8(String pageName) {
        return !p001b.toq.f7210i.equals(pageName);
    }

    @Override // com.android.thememanager.basemodule.model.flextab.toq
    /* JADX INFO: renamed from: g */
    public boolean mo6877g(String pageName) {
        return false;
    }

    @Override // com.android.thememanager.basemodule.model.flextab.toq
    /* JADX INFO: renamed from: k */
    public int mo6878k(String pageName) {
        return p001b.toq.f7209h.equals(pageName) ? 1 : 0;
    }

    @Override // com.android.thememanager.basemodule.model.flextab.toq
    /* JADX INFO: renamed from: n */
    public int mo6879n() {
        return R.string.theme_component_video_wallpaper;
    }

    @Override // com.android.thememanager.basemodule.model.flextab.toq
    public int toq() {
        return R.drawable.me_icon_video_wallpaper;
    }

    @Override // com.android.thememanager.basemodule.model.flextab.toq
    /* JADX INFO: renamed from: y */
    public boolean mo6880y(String pageName) {
        return (qrj.zy(qrj.toq.VIDEO_WALLPAPER) || p001b.toq.f7221t.equals(pageName) || p001b.toq.f7213l.equals(pageName)) ? false : true;
    }

    @Override // com.android.thememanager.basemodule.model.flextab.toq
    public int zy(String pageName) {
        return p001b.toq.f7210i.equals(pageName) ? 1 : 0;
    }
}
