package com.android.thememanager.controller.online;

import android.net.Uri;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.android.thememanager.C2082k;
import com.android.thememanager.basemodule.account.C1688q;
import java.util.Map;

/* JADX INFO: compiled from: ResourceCookieUtils.java */
/* JADX INFO: loaded from: classes2.dex */
public class fu4 {
    /* JADX INFO: renamed from: k */
    public static boolean m7546k(Uri uri) {
        return com.android.thememanager.basemodule.utils.mcp.m7140q(uri);
    }

    /* JADX INFO: renamed from: q */
    public static void m7547q() {
        C1688q c1688qCdj = C1688q.cdj();
        miuix.hybrid.zy.m25926k(C2082k.zy().toq());
        miuix.hybrid.toq toqVarM25918n = miuix.hybrid.toq.m25918n();
        CookieSyncManager.createInstance(C2082k.zy().toq());
        CookieManager cookieManager = CookieManager.getInstance();
        if (toqVarM25918n == null) {
            return;
        }
        toqVarM25918n.mo25875p(true);
        if (cookieManager == null) {
            return;
        }
        cookieManager.setAcceptCookie(true);
        if (!c1688qCdj.wvg()) {
            return;
        }
        String str = null;
        if (c1688qCdj.m6586h() != null) {
            str = "cUserId=" + c1688qCdj.m6586h();
        }
        String str2 = "serviceToken=" + c1688qCdj.x2();
        int i2 = 0;
        while (true) {
            String[] strArr = com.android.thememanager.basemodule.utils.mcp.f57781toq;
            if (i2 >= strArr.length) {
                miuix.hybrid.zy.zy();
                miuix.hybrid.zy.m25927q();
                CookieSyncManager.getInstance().sync();
                return;
            }
            if (str != null) {
                String str3 = strArr[i2];
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append("; domain=");
                String[] strArr2 = com.android.thememanager.basemodule.utils.mcp.f57782zy;
                sb.append(strArr2[i2]);
                sb.append("; path=/");
                toqVarM25918n.qrj(str3, sb.toString());
                cookieManager.setCookie(strArr[i2], str + "; domain=" + strArr2[i2] + "; path=/");
            }
            String str4 = strArr[i2];
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append("; domain=");
            String[] strArr3 = com.android.thememanager.basemodule.utils.mcp.f57782zy;
            sb2.append(strArr3[i2]);
            sb2.append("; path=/");
            toqVarM25918n.qrj(str4, sb2.toString());
            cookieManager.setCookie(strArr[i2], str2 + "; domain=" + strArr3[i2] + "; path=/");
            i2++;
        }
    }

    public static boolean toq(Uri uri) {
        return com.android.thememanager.basemodule.utils.mcp.m7137g(uri);
    }

    public static void zy(Map<String, String> headerMap) {
        C1688q c1688qCdj = C1688q.cdj();
        StringBuilder sb = new StringBuilder();
        if (c1688qCdj.o1t()) {
            sb.append(InterfaceC1925p.du);
            sb.append("=");
            sb.append(c1688qCdj.x2());
            if (c1688qCdj.m6586h() != null) {
                sb.append("; ");
                sb.append(InterfaceC1925p.dqjj);
                sb.append("=");
                sb.append(c1688qCdj.m6586h());
            }
        }
        if (sb.length() > 0) {
            headerMap.put("Cookie", sb.toString());
        }
    }
}
