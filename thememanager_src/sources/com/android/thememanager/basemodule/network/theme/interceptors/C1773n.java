package com.android.thememanager.basemodule.network.theme.interceptors;

import android.net.Uri;
import android.text.TextUtils;
import com.android.thememanager.basemodule.analysis.C1697g;
import com.android.thememanager.basemodule.analysis.C1708s;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.URL;
import okhttp3.fti;
import okhttp3.jk;
import okhttp3.ni7;

/* JADX INFO: renamed from: com.android.thememanager.basemodule.network.theme.interceptors.n */
/* JADX INFO: compiled from: RequestTrackInterceptor.java */
/* JADX INFO: loaded from: classes.dex */
public class C1773n implements ni7, com.android.thememanager.basemodule.analysis.toq {
    @Override // okhttp3.ni7
    /* JADX INFO: renamed from: k */
    public fti mo6886k(ni7.InterfaceC7521k chain) throws IOException {
        jk jkVarZy = chain.zy();
        URL urlNn86 = jkVarZy.cdj().nn86();
        Uri uri = Uri.parse(urlNn86.toString());
        String strM27311s = jkVarZy.m27311s(com.android.thememanager.basemodule.network.theme.f7l8.f57590ni7);
        if (TextUtils.isEmpty(strM27311s)) {
            strM27311s = urlNn86.getPath();
        }
        String str = urlNn86.getProtocol() + "://" + urlNn86.getHost() + strM27311s;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C1697g.toq toqVarKi = new C1697g.toq().zurt(jCurrentTimeMillis).o1t(uri.getScheme()).t8r(uri.getHost()).m6631i(uri.getPath()).ki(str);
        try {
            fti ftiVarMo27071q = chain.mo27071q(jkVarZy);
            if (ftiVarMo27071q.i1() == 200) {
                toqVarKi.ni7(ftiVarMo27071q.i1()).fu4(0);
            } else {
                toqVarKi.ni7(ftiVarMo27071q.i1()).fu4(1);
            }
            toqVarKi.kja0(System.currentTimeMillis() - jCurrentTimeMillis);
            C1708s.f7l8().ld6().hyr(toqVarKi.n7h());
            return ftiVarMo27071q;
        } catch (IOException e2) {
            if (e2 instanceof InterruptedIOException) {
                toqVarKi.fu4(2);
            } else {
                toqVarKi.fu4(1);
            }
            toqVarKi.m6630h(e2.getClass().getSimpleName());
            toqVarKi.kja0(System.currentTimeMillis() - jCurrentTimeMillis);
            C1708s.f7l8().ld6().hyr(toqVarKi.n7h());
            throw e2;
        }
    }
}
