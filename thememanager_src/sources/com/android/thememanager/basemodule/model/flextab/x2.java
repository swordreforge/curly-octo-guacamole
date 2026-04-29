package com.android.thememanager.basemodule.model.flextab;

import com.android.thememanager.R;
import com.android.thememanager.basemodule.utils.a9;

/* JADX INFO: compiled from: WidgetSuitTab.java */
/* JADX INFO: loaded from: classes.dex */
public class x2 extends toq {
    public x2() {
        this.f10064k = "widget_suit";
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
        return p001b.toq.f7209h.equals(pageName) ? 3 : 0;
    }

    @Override // com.android.thememanager.basemodule.model.flextab.toq
    /* JADX INFO: renamed from: n */
    public int mo6879n() {
        return R.string.component_title_widget_suit;
    }

    @Override // com.android.thememanager.basemodule.model.flextab.toq
    public int toq() {
        return R.drawable.me_icon_widget_suit;
    }

    @Override // com.android.thememanager.basemodule.model.flextab.toq
    /* JADX INFO: renamed from: y */
    public boolean mo6880y(String pageName) {
        if (p001b.toq.f7207f.equals(pageName) || p001b.toq.f7219r.equals(pageName)) {
            return false;
        }
        return (p001b.toq.f7213l.equals(pageName) || p001b.toq.f7221t.equals(pageName) || p001b.toq.f7227z.equals(pageName)) ? a9.toq() : a9.toq();
    }

    @Override // com.android.thememanager.basemodule.model.flextab.toq
    public int zy(String pageName) {
        return p001b.toq.f7210i.equals(pageName) ? 1 : 0;
    }
}
