package com.android.thememanager.model;

import com.android.thememanager.basemodule.network.theme.AbstractC1777n;
import com.android.thememanager.basemodule.network.theme.f7l8;
import com.android.thememanager.router.recommend.entity.UIPage;
import com.android.thememanager.viewmodel.toq;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: FloatingWindowRequestModel.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class FloatingWindowRequestModel {

    @InterfaceC7396q
    public static final FloatingWindowRequestModel INSTANCE = new FloatingWindowRequestModel();

    private FloatingWindowRequestModel() {
    }

    public final void requestFloatingWindowData(@InterfaceC7396q final toq vm) {
        d2ok.m23075h(vm, "vm");
        ((FloatingWindowRequestInterface) f7l8.m6882h().toq(FloatingWindowRequestInterface.class)).getFloatingWindowData().mo27954p(new AbstractC1777n<UIPage>() { // from class: com.android.thememanager.model.FloatingWindowRequestModel.requestFloatingWindowData.1
            @Override // com.android.thememanager.basemodule.network.theme.AbstractC1777n
            public void onResponse(@InterfaceC7396q UIPage response) {
                d2ok.m23075h(response, "response");
                vm.hyr().cdj(response);
            }
        });
    }
}
