package com.android.thememanager.basemodule.network.theme.interceptors;

import com.android.thememanager.basemodule.account.C1688q;
import java.io.IOException;
import okhttp3.fti;
import okhttp3.jk;
import okhttp3.ni7;
import yz.C7794k;

/* JADX INFO: renamed from: com.android.thememanager.basemodule.network.theme.interceptors.g */
/* JADX INFO: compiled from: RetryInterceptor.java */
/* JADX INFO: loaded from: classes.dex */
public class C1771g implements ni7 {

    /* JADX INFO: renamed from: k */
    private static final String f10080k = "RetryInterceptor";

    @Override // okhttp3.ni7
    /* JADX INFO: renamed from: k */
    public fti mo6886k(ni7.InterfaceC7521k chain) throws IOException {
        jk jkVarZy = chain.zy();
        fti ftiVarMo27071q = chain.mo27071q(jkVarZy);
        if (ftiVarMo27071q.i1() != 401 && ftiVarMo27071q.i1() != 821) {
            return ftiVarMo27071q;
        }
        C7794k.m28196p(f10080k, "RetryInterceptor code=" + ftiVarMo27071q.i1() + ", try to invalidateServiceToken");
        C1688q.cdj().mcp();
        if (ftiVarMo27071q.hyr() != null) {
            ftiVarMo27071q.close();
        }
        return chain.mo27071q(jkVarZy);
    }
}
