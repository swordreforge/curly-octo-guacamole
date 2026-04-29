package com.android.thememanager.basemodule.network.theme.interceptors;

import com.android.thememanager.basemodule.privacy.C1781k;
import com.android.thememanager.basemodule.privacy.x2;
import java.io.IOException;
import okhttp3.fti;
import okhttp3.ni7;
import zy.lvui;

/* JADX INFO: compiled from: UserAgreementInterceptor.java */
/* JADX INFO: loaded from: classes.dex */
public class f7l8 implements ni7 {
    @Override // okhttp3.ni7
    @lvui
    /* JADX INFO: renamed from: k */
    public fti mo6886k(@lvui ni7.InterfaceC7521k chain) throws IOException {
        if (!C1781k.toq(bf2.toq.toq()) || x2.f7l8()) {
            throw new IOException("UserAgreement not agree");
        }
        return chain.mo27071q(chain.zy());
    }
}
