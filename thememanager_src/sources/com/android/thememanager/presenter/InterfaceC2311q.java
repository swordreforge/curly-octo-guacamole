package com.android.thememanager.presenter;

import com.android.thememanager.basemodule.network.theme.f7l8;
import com.android.thememanager.basemodule.network.theme.model.CommonResponse;
import f7z0.InterfaceC6030g;
import f7z0.kja0;
import f7z0.ld6;

/* JADX INFO: renamed from: com.android.thememanager.presenter.q */
/* JADX INFO: compiled from: PolicyRequestInterface.java */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC2311q {
    @ld6({f7l8.f57592t8r})
    @kja0("/thm/native/privacy/withdraw")
    /* JADX INFO: renamed from: k */
    retrofit2.toq<CommonResponse<String>> m8452k();

    @InterfaceC6030g("/thm/native/privacy/withdrawCheck")
    @ld6({f7l8.f57592t8r})
    retrofit2.toq<CommonResponse<String>> toq();
}
