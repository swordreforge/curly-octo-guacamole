package com.android.thememanager.basemodule.model.flextab;

import com.android.thememanager.R;

/* JADX INFO: renamed from: com.android.thememanager.basemodule.model.flextab.s */
/* JADX INFO: compiled from: ThemeTab.java */
/* JADX INFO: loaded from: classes.dex */
public class C1767s extends toq {
    public C1767s() {
        this.f10064k = "theme";
    }

    @Override // com.android.thememanager.basemodule.model.flextab.toq
    public boolean f7l8(String pageName) {
        return !p001b.toq.f7210i.equals(pageName);
    }

    @Override // com.android.thememanager.basemodule.model.flextab.toq
    /* JADX INFO: renamed from: g */
    public boolean mo6877g(String pageName) {
        return p001b.toq.f7221t.equals(pageName) || p001b.toq.f7213l.equals(pageName) || p001b.toq.f7219r.equals(pageName);
    }

    @Override // com.android.thememanager.basemodule.model.flextab.toq
    /* JADX INFO: renamed from: k */
    public int mo6878k(String pageName) {
        return p001b.toq.f7209h.equals(pageName) ? 1 : 0;
    }

    @Override // com.android.thememanager.basemodule.model.flextab.toq
    /* JADX INFO: renamed from: n */
    public int mo6879n() {
        return R.string.theme_component_title_all;
    }

    @Override // com.android.thememanager.basemodule.model.flextab.toq
    public int toq() {
        return R.drawable.me_icon_theme;
    }

    @Override // com.android.thememanager.basemodule.model.flextab.toq
    /* JADX INFO: renamed from: y */
    public boolean mo6880y(String pageName) {
        return true;
    }

    @Override // com.android.thememanager.basemodule.model.flextab.toq
    public int zy(String pageName) {
        return p001b.toq.f7210i.equals(pageName) ? 1 : 0;
    }
}
