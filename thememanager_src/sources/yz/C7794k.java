package yz;

import android.text.TextUtils;
import android.util.Log;

/* JADX INFO: renamed from: yz.k */
/* JADX INFO: compiled from: Logger.java */
/* JADX INFO: loaded from: classes.dex */
public class C7794k {

    /* JADX INFO: renamed from: k */
    public static final String f45962k = "ThemeManager:";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f100628toq = "Default";

    public static void f7l8(String str) {
        m28198s("Default", str, null);
    }

    /* JADX INFO: renamed from: g */
    private static boolean m28193g() {
        return true;
    }

    /* JADX INFO: renamed from: k */
    public static void m28194k(String str, String str2) {
        if (m28193g()) {
            Log.d(m28197q(str), str2);
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m28195n(String str, String str2) {
        if (m28193g()) {
            Log.i(m28197q(str), str2);
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m28196p(String str, String str2) {
        if (m28193g()) {
            Log.w(m28197q(str), str2);
        }
    }

    /* JADX INFO: renamed from: q */
    private static String m28197q(String str) {
        if (TextUtils.isEmpty(str)) {
            return "ThemeManager:Default";
        }
        return f45962k + str;
    }

    /* JADX INFO: renamed from: s */
    public static void m28198s(String str, String str2, Throwable th) {
        if (th != null) {
            zy(str, str2, th);
        } else {
            toq(str, str2);
        }
    }

    public static void toq(String str, String str2) {
        if (m28193g()) {
            Log.e(m28197q(str), str2);
        }
    }

    /* JADX INFO: renamed from: y */
    public static void m28199y(String str, String str2) {
        m28198s(str, str2, null);
    }

    public static void zy(String str, String str2, Throwable th) {
        if (m28193g()) {
            Log.e(m28197q(str), str2, th);
        }
    }
}
