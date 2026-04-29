package com.android.thememanager.basemodule.model.flextab;

import com.android.thememanager.R;
import com.android.thememanager.basemodule.config.C1724k;

/* JADX INFO: renamed from: com.android.thememanager.basemodule.model.flextab.y */
/* JADX INFO: compiled from: RingtoneTab.java */
/* JADX INFO: loaded from: classes.dex */
public class C1768y extends toq {
    public C1768y() {
        this.f10064k = "ringtone";
    }

    @Override // com.android.thememanager.basemodule.model.flextab.toq
    public boolean f7l8(String pageName) {
        return C1724k.m6723p().ld6().ring_page_style == 0;
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
        return R.string.component_title_ringtone;
    }

    @Override // com.android.thememanager.basemodule.model.flextab.toq
    public int toq() {
        return R.drawable.me_icon_ringtone;
    }

    @Override // com.android.thememanager.basemodule.model.flextab.toq
    /* JADX INFO: renamed from: y */
    public boolean mo6880y(String pageName) {
        return (p001b.toq.f7221t.equals(pageName) || p001b.toq.f7219r.equals(pageName) || p001b.toq.f7213l.equals(pageName)) ? false : true;
    }

    @Override // com.android.thememanager.basemodule.model.flextab.toq
    public int zy(String pageName) {
        return 1;
    }
}
