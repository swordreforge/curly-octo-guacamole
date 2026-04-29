package com.android.thememanager.basemodule.model.flextab;

import com.android.thememanager.R;
import com.android.thememanager.basemodule.utils.C1807g;

/* JADX INFO: renamed from: com.android.thememanager.basemodule.model.flextab.g */
/* JADX INFO: compiled from: LargeIconTab.java */
/* JADX INFO: loaded from: classes.dex */
public class C1762g extends toq {
    public C1762g() {
        this.f10064k = "largeicons";
    }

    @Override // com.android.thememanager.basemodule.model.flextab.toq
    public boolean f7l8(String pageName) {
        return false;
    }

    @Override // com.android.thememanager.basemodule.model.flextab.toq
    /* JADX INFO: renamed from: g */
    public boolean mo6877g(String pageName) {
        return p001b.toq.f7221t.equals(pageName);
    }

    @Override // com.android.thememanager.basemodule.model.flextab.toq
    /* JADX INFO: renamed from: k */
    public int mo6878k(String pageName) {
        return 0;
    }

    @Override // com.android.thememanager.basemodule.model.flextab.toq
    /* JADX INFO: renamed from: n */
    public int mo6879n() {
        return R.string.theme_component_title_large_icon;
    }

    @Override // com.android.thememanager.basemodule.model.flextab.toq
    public int toq() {
        return R.drawable.me_icon_large_icons;
    }

    @Override // com.android.thememanager.basemodule.model.flextab.toq
    /* JADX INFO: renamed from: y */
    public boolean mo6880y(String pageName) {
        if (!C1807g.m7077l()) {
            return false;
        }
        if (p001b.toq.f7213l.equals(pageName) || p001b.toq.f7219r.equals(pageName)) {
            return !C1807g.m7081r();
        }
        return true;
    }

    @Override // com.android.thememanager.basemodule.model.flextab.toq
    public int zy(String pageName) {
        return 1;
    }
}
