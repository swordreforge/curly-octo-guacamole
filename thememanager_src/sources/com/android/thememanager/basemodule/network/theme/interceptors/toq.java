package com.android.thememanager.basemodule.network.theme.interceptors;

import com.android.thememanager.basemodule.account.C1688q;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.basemodule.utils.mcp;
import java.io.IOException;
import okhttp3.C7526q;
import okhttp3.fti;
import okhttp3.jk;
import okhttp3.ni7;

/* JADX INFO: compiled from: HeaderInterceptor.java */
/* JADX INFO: loaded from: classes.dex */
public class toq implements ni7 {
    @Override // okhttp3.ni7
    /* JADX INFO: renamed from: k */
    public fti mo6886k(ni7.InterfaceC7521k chain) throws IOException {
        jk jkVarZy = chain.zy();
        jk.C7511k c7511kN7h = jkVarZy.n7h();
        c7511kN7h.m27316k("Cookie", C1688q.qrj()).m27315i("User-Agent").m27316k("User-Agent", C1807g.t8r(bf2.toq.toq()));
        if (!mcp.m7139n() && !jkVarZy.f7l8().t8r()) {
            c7511kN7h.zy(C7526q.f43515h).toq();
        }
        return chain.mo27071q(c7511kN7h.toq());
    }
}
