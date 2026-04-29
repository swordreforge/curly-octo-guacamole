package com.xiaomi.accountsdk.account;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.xiaomi.accountsdk.utils.AbstractC5574n;
import com.xiaomi.onetrack.util.C5814z;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: compiled from: XMPassportUserAgent.java */
/* JADX INFO: loaded from: classes3.dex */
public class ld6 {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static volatile String f72766f7l8 = null;

    /* JADX INFO: renamed from: g */
    private static volatile String f30754g = null;

    /* JADX INFO: renamed from: k */
    private static final String f30755k = "XMPassportUserAgent";

    /* JADX INFO: renamed from: n */
    private static volatile Set<String> f30756n = new LinkedHashSet();

    /* JADX INFO: renamed from: q */
    private static volatile String f30757q = null;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f72767toq = "APP/";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String f72768zy = "APPV/";

    /* JADX INFO: compiled from: XMPassportUserAgent.java */
    private static class toq {

        /* JADX INFO: renamed from: k */
        private final Context f30758k;

        /* JADX INFO: renamed from: q */
        private final boolean f30759q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final String f72769toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final Set<String> f72770zy;

        private String toq(Context context) {
            if (context == null) {
                return null;
            }
            try {
                return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
                AbstractC5574n.m19115y(ld6.f30755k, context.getPackageName() + " NameNotFound");
                return null;
            }
        }

        private String zy(Context context) {
            String packageName = context == null ? "unknown" : context.getPackageName();
            String[] strArrSplit = packageName.split(C5814z.f32495a);
            if (strArrSplit.length <= 2) {
                return packageName;
            }
            return strArrSplit[strArrSplit.length - 2] + "." + strArrSplit[strArrSplit.length - 1];
        }

        /* JADX INFO: renamed from: k */
        public String m18771k() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f72769toq);
            sb.append(" ");
            sb.append(ld6.f72767toq);
            sb.append(zy(this.f30758k));
            String qVar = toq(this.f30758k);
            if (!TextUtils.isEmpty(qVar)) {
                sb.append(" ");
                sb.append(ld6.f72768zy);
                sb.append(qVar);
            }
            if (this.f30759q) {
                sb.append(" ");
                sb.append("XiaoMi/HybridView/");
            }
            for (String str : this.f72770zy) {
                if (!TextUtils.isEmpty(str)) {
                    sb.append(" ");
                    sb.append(str);
                }
            }
            return sb.toString();
        }

        private toq(Context context, String str, Set<String> set, boolean z2) {
            this.f30758k = context;
            this.f72769toq = str;
            this.f72770zy = set;
            this.f30759q = z2;
        }
    }

    private ld6() {
    }

    static synchronized void f7l8(String str) {
        f30757q = str;
        m18767g();
    }

    /* JADX INFO: renamed from: g */
    private static synchronized void m18767g() {
        f30754g = null;
        f72766f7l8 = null;
    }

    /* JADX INFO: renamed from: k */
    public static synchronized void m18768k(String str) {
        f30756n.add(str);
        m18767g();
    }

    /* JADX INFO: renamed from: n */
    public static synchronized String m18769n(WebView webView, Context context) {
        toq();
        if (TextUtils.isEmpty(f72766f7l8)) {
            f72766f7l8 = new toq(context, webView.getSettings().getUserAgentString(), f30756n, true).m18771k();
        }
        return f72766f7l8;
    }

    /* JADX INFO: renamed from: q */
    public static synchronized String m18770q(Context context) {
        if (TextUtils.isEmpty(f30754g)) {
            f30754g = new toq(context, TextUtils.isEmpty(f30757q) ? zy() : f30757q, f30756n, false).m18771k();
        }
        return f30754g;
    }

    private static void toq() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalThreadStateException("cannot be called without main thread");
        }
    }

    private static String zy() {
        return System.getProperty("http.agent");
    }
}
