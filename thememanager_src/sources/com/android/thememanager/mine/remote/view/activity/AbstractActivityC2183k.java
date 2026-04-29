package com.android.thememanager.mine.remote.view.activity;

import android.os.Bundle;
import java.util.List;

/* JADX INFO: renamed from: com.android.thememanager.mine.remote.view.activity.k */
/* JADX INFO: compiled from: AbstractRemoteResourceTabActivity.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractActivityC2183k extends zy {
    protected abstract String cfr();

    @Override // com.android.thememanager.mine.remote.view.activity.zy
    protected void etdu() {
        List<com.android.thememanager.basemodule.model.flextab.toq> listZurt = p001b.toq.zurt(r8s8());
        if (listZurt != null) {
            for (com.android.thememanager.basemodule.model.flextab.toq toqVar : listZurt) {
                if (toqVar.mo6880y(r8s8())) {
                    was(toqVar.m6881q(), toqVar.mo6879n(), sok(), com.android.thememanager.mine.remote.view.fragment.zy.yp31(toqVar.m6881q(), r8s8()));
                }
            }
        }
    }

    @Override // com.android.thememanager.mine.remote.view.activity.zy, com.android.thememanager.basemodule.base.AbstractActivityC1717k, miuix.appcompat.app.t8r, androidx.fragment.app.ActivityC0891q, androidx.activity.ComponentActivity, androidx.core.app.cdj, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        this.f12851f = cfr();
        super.onCreate(savedInstanceState);
    }

    protected abstract Class sok();
}
