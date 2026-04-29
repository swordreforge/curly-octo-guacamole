package com.android.thememanager.basemodule.model.flextab;

import com.android.thememanager.R;
import com.android.thememanager.basemodule.utils.C1819o;

/* JADX INFO: renamed from: com.android.thememanager.basemodule.model.flextab.k */
/* JADX INFO: compiled from: AodTab.java */
/* JADX INFO: loaded from: classes.dex */
public class C1763k extends toq {
    public C1763k() {
        this.f10064k = "aod";
    }

    @Override // com.android.thememanager.basemodule.model.flextab.toq
    public boolean f7l8(String pageName) {
        return true;
    }

    @Override // com.android.thememanager.basemodule.model.flextab.toq
    /* JADX INFO: renamed from: g */
    public boolean mo6877g(String pageName) {
        return p001b.toq.f7221t.equals(pageName);
    }

    @Override // com.android.thememanager.basemodule.model.flextab.toq
    /* JADX INFO: renamed from: k */
    public int mo6878k(String pageName) {
        return p001b.toq.f7209h.equals(pageName) ? 2 : 0;
    }

    @Override // com.android.thememanager.basemodule.model.flextab.toq
    /* JADX INFO: renamed from: n */
    public int mo6879n() {
        return R.string.theme_component_title_aod;
    }

    @Override // com.android.thememanager.basemodule.model.flextab.toq
    public int toq() {
        return R.drawable.me_icon_aod;
    }

    @Override // com.android.thememanager.basemodule.model.flextab.toq
    /* JADX INFO: renamed from: y */
    public boolean mo6880y(String pageName) {
        return C1819o.m7159l();
    }

    @Override // com.android.thememanager.basemodule.model.flextab.toq
    public int zy(String pageName) {
        return p001b.toq.f7210i.equals(pageName) ? 1 : 0;
    }
}
