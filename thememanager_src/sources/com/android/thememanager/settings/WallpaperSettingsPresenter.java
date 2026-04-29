package com.android.thememanager.settings;

import androidx.lifecycle.InterfaceC0928g;
import androidx.lifecycle.InterfaceC0954z;
import bz2.InterfaceC1382k;
import com.android.thememanager.basemodule.network.theme.model.CommonResponse;

/* JADX INFO: loaded from: classes2.dex */
public class WallpaperSettingsPresenter implements InterfaceC0928g {

    /* JADX INFO: renamed from: k */
    InterfaceC1382k f14948k = (InterfaceC1382k) com.android.thememanager.basemodule.network.theme.f7l8.m6882h().qrj(InterfaceC1382k.class);

    /* JADX INFO: renamed from: k */
    retrofit2.toq<CommonResponse<com.google.gson.kja0>> m8984k() {
        return this.f14948k.m5841q(0, com.android.thememanager.basemodule.network.theme.toq.toq());
    }

    @Override // androidx.lifecycle.InterfaceC0928g, androidx.lifecycle.ld6
    public void onDestroy(@zy.lvui InterfaceC0954z owner) {
    }
}
