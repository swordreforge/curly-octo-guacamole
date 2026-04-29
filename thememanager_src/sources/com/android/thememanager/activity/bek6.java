package com.android.thememanager.activity;

import android.os.Build;
import miuix.autodensity.InterfaceC7074y;

/* JADX INFO: compiled from: MiuixCompatActivity.kt */
/* JADX INFO: loaded from: classes.dex */
public class bek6 extends miuix.appcompat.app.t8r implements InterfaceC7074y {
    private final boolean enableAutoDensity;

    public bek6() {
        this.enableAutoDensity = Build.VERSION.SDK_INT >= 30;
    }

    @Override // miuix.autodensity.InterfaceC7074y
    public boolean shouldAdaptAutoDensity() {
        return this.enableAutoDensity;
    }
}
