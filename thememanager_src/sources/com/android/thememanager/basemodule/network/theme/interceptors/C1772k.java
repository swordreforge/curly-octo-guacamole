package com.android.thememanager.basemodule.network.theme.interceptors;

import android.text.TextUtils;
import java.io.IOException;
import okhttp3.fti;
import okhttp3.jk;
import okhttp3.ni7;

/* JADX INFO: renamed from: com.android.thememanager.basemodule.network.theme.interceptors.k */
/* JADX INFO: compiled from: CacheInterceptor.java */
/* JADX INFO: loaded from: classes.dex */
public class C1772k implements ni7 {
    @Override // okhttp3.ni7
    /* JADX INFO: renamed from: k */
    public fti mo6886k(ni7.InterfaceC7521k chain) throws IOException {
        jk jkVarZy = chain.zy();
        fti ftiVarMo27071q = chain.mo27071q(jkVarZy);
        String string = jkVarZy.f7l8().toString();
        return !TextUtils.isEmpty(string) ? ftiVarMo27071q.ij().zurt(com.google.common.net.zy.f27254k, string).jk(com.google.common.net.zy.f27257n).zy() : ftiVarMo27071q;
    }
}
