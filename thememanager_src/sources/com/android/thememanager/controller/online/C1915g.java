package com.android.thememanager.controller.online;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.android.thememanager.C2082k;
import com.android.thememanager.basemodule.account.C1688q;
import com.android.thememanager.basemodule.analysis.C1697g;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.privacy.C1781k;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.basemodule.utils.y9n;
import com.android.thememanager.controller.online.zurt;
import com.android.thememanager.util.C2755a;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: com.android.thememanager.controller.online.g */
/* JADX INFO: compiled from: NetworkHelper.java */
/* JADX INFO: loaded from: classes2.dex */
public class C1915g implements com.android.thememanager.basemodule.analysis.toq {

    /* JADX INFO: renamed from: k */
    private static final String f10930k = "NetworkHelper";

    /* JADX INFO: renamed from: com.android.thememanager.controller.online.g$k */
    /* JADX INFO: compiled from: NetworkHelper.java */
    public enum k {
        WIFI,
        DATA,
        NONE
    }

    public static String f7l8(zurt url) throws C1922n, IOException {
        return m7548g(url, null);
    }

    /* JADX INFO: renamed from: g */
    public static String m7548g(zurt url, File outputFile) throws C1922n, IOException {
        if (url.shouldEncryptParam() && !C1688q.cdj().o1t()) {
            Log.i(f10930k, "invalid token");
            C1688q.cdj().mcp();
        }
        C1945z qVar = toq(url, outputFile);
        int iM7651k = qVar.m7651k();
        if (iM7651k == 401) {
            Log.i(C2755a.f16307g, "Invalid service token by passport: " + iM7651k);
            C1688q.cdj().mcp();
            qVar = toq(url, outputFile);
            iM7651k = qVar.m7651k();
        }
        if (iM7651k != 200) {
            Log.d(f10930k, "requestFile,error code:" + iM7651k);
            if (iM7651k == 820) {
                String strQrj = C1807g.qrj();
                StringBuilder sb = new StringBuilder();
                sb.append("device info ,o = ");
                sb.append(strQrj == null ? null : com.android.thememanager.util.o1t.m9942y(strQrj));
                Log.w(f10930k, sb.toString());
            }
        }
        m7552y(qVar);
        if (outputFile != null && url.getHostProxyType() == zurt.EnumC1946k.FILE_PROXY) {
            int iZy = qVar.zy();
            if (iZy != outputFile.length()) {
                throw new IOException("writing length not equal content length: " + iZy + " vs " + outputFile.length());
            }
        }
        return qVar.toq();
    }

    /* JADX INFO: renamed from: k */
    public static boolean m7549k() {
        return C1781k.toq(bf2.toq.toq());
    }

    /* JADX INFO: renamed from: n */
    public static boolean m7550n() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) C2082k.zy().toq().getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
    }

    /* JADX INFO: renamed from: q */
    public static k m7551q() {
        return m7550n() ? com.android.thememanager.basemodule.utils.mcp.f7l8() ? k.WIFI : k.DATA : k.NONE;
    }

    private static C1945z toq(zurt url, File outputFile) throws IOException {
        try {
            try {
                if (bf2.toq.m5812n()) {
                    Log.d(C2755a.f16307g, "Http request: " + url.getBaseUrl());
                }
                bufferedOutputStream = outputFile != null ? new BufferedOutputStream(new FileOutputStream(outputFile)) : null;
                return zy(url, bufferedOutputStream);
            } catch (IOException e2) {
                Log.e(C2755a.f16307g, "Http request failed: " + url.getBaseUrl(), e2);
                throw e2;
            }
        } finally {
            y9n.m7246g(bufferedOutputStream);
        }
    }

    /* JADX INFO: renamed from: y */
    private static void m7552y(C1945z conn) throws Throwable {
        int iM7651k = conn.m7651k();
        if (iM7651k != 200) {
            String strM7654q = conn.m7654q();
            if (bf2.toq.m5812n()) {
                strM7654q = strM7654q + " { " + conn.toq() + " }";
            } else if (strM7654q.length() > 50) {
                strM7654q = strM7654q.substring(0, 50);
            }
            Log.i(C2755a.f16307g, "Http resposne: code=" + iM7651k + " reason=" + strM7654q + " " + (bf2.toq.m5812n() ? conn.m7652n() : ""));
            throw new C1922n(iM7651k, strM7654q);
        }
    }

    private static C1945z zy(zurt url, OutputStream os) throws Throwable {
        Uri uri;
        if (!m7549k()) {
            throw new IOException("User has not allowed to connect network.");
        }
        if (com.android.thememanager.basemodule.privacy.x2.f7l8()) {
            throw new IOException("User in Local Mode, not allow to connect network");
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String analyticsBaseUrl = url.getAnalyticsBaseUrl();
        C1697g.toq toqVarZurt = new C1697g.toq().zurt(jCurrentTimeMillis);
        if (TextUtils.isEmpty(analyticsBaseUrl)) {
            analyticsBaseUrl = url.getBaseUrl();
        }
        C1697g.toq toqVarKi = toqVarZurt.ki(analyticsBaseUrl);
        C1945z c1945z = new C1945z();
        try {
            if (url.usingHttpGetMethod()) {
                c1945z.n7h(url.getFinalGetUrl());
                c1945z.kja0(false);
                uri = Uri.parse(url.getFinalGetUrl());
            } else {
                Pair<String, String> finalPostUrl = url.getFinalPostUrl();
                c1945z.n7h((String) finalPostUrl.first);
                c1945z.kja0(true);
                c1945z.x2((String) finalPostUrl.second);
                uri = Uri.parse((String) finalPostUrl.first);
            }
            toqVarKi.o1t(uri.getScheme()).t8r(uri.getHost()).m6631i(uri.getPath());
            c1945z.m7655s(url.getFinalHeaders());
            c1945z.qrj(url);
            c1945z.ld6(os);
            c1945z.m7653p(url.getOriginHostName());
            c1945z.m7656y();
            int iM7651k = c1945z.m7651k();
            if (iM7651k == 200) {
                toqVarKi.ni7(iM7651k).fu4(0);
            } else {
                toqVarKi.ni7(iM7651k).fu4(1);
            }
            toqVarKi.kja0(System.currentTimeMillis() - jCurrentTimeMillis);
            C1708s.f7l8().ld6().hyr(toqVarKi.n7h());
            return c1945z;
        } catch (IOException e2) {
            if (e2 instanceof InterruptedIOException) {
                toqVarKi.fu4(2);
            } else {
                toqVarKi.fu4(1);
            }
            toqVarKi.m6630h(e2.getClass().getSimpleName());
            throw e2;
        }
    }
}
