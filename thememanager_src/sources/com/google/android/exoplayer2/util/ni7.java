package com.google.android.exoplayer2.util;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: compiled from: Log.java */
/* JADX INFO: loaded from: classes2.dex */
public final class ni7 {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static boolean f67062f7l8 = true;

    /* JADX INFO: renamed from: g */
    private static int f23254g = 0;

    /* JADX INFO: renamed from: k */
    public static final int f23255k = 0;

    /* JADX INFO: renamed from: n */
    public static final int f23256n = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: q */
    public static final int f23257q = 3;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final int f67063toq = 1;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final int f67064zy = 2;

    private ni7() {
    }

    @Pure
    @zy.dd
    public static String f7l8(@zy.dd Throwable th) {
        if (th == null) {
            return null;
        }
        return m13701p(th) ? "UnknownHostException (no network)" : !f67062f7l8 ? th.getMessage() : Log.getStackTraceString(th).trim().replace("\t", "    ");
    }

    @Pure
    /* JADX INFO: renamed from: g */
    public static int m13698g() {
        return f23254g;
    }

    @Pure
    /* JADX INFO: renamed from: k */
    private static String m13699k(String str, @zy.dd Throwable th) {
        String strF7l8 = f7l8(th);
        if (TextUtils.isEmpty(strF7l8)) {
            return str;
        }
        String strValueOf = String.valueOf(str);
        String strReplace = strF7l8.replace("\n", "\n  ");
        StringBuilder sb = new StringBuilder(strValueOf.length() + 4 + String.valueOf(strReplace).length());
        sb.append(strValueOf);
        sb.append("\n  ");
        sb.append(strReplace);
        sb.append('\n');
        return sb.toString();
    }

    public static void ld6(int i2) {
        f23254g = i2;
    }

    @Pure
    /* JADX INFO: renamed from: n */
    public static void m13700n(String str, String str2, @zy.dd Throwable th) {
        m13702q(str, m13699k(str2, th));
    }

    @Pure
    public static void n7h(String str, String str2, @zy.dd Throwable th) {
        qrj(str, m13699k(str2, th));
    }

    @Pure
    /* JADX INFO: renamed from: p */
    private static boolean m13701p(@zy.dd Throwable th) {
        while (th != null) {
            if (th instanceof UnknownHostException) {
                return true;
            }
            th = th.getCause();
        }
        return false;
    }

    @Pure
    /* JADX INFO: renamed from: q */
    public static void m13702q(String str, String str2) {
        if (f23254g <= 3) {
            Log.e(str, str2);
        }
    }

    @Pure
    public static void qrj(String str, String str2) {
        if (f23254g <= 2) {
            Log.w(str, str2);
        }
    }

    @Pure
    /* JADX INFO: renamed from: s */
    public static void m13703s(String str, String str2, @zy.dd Throwable th) {
        m13704y(str, m13699k(str2, th));
    }

    @Pure
    public static void toq(String str, String str2) {
        if (f23254g == 0) {
            Log.d(str, str2);
        }
    }

    public static void x2(boolean z2) {
        f67062f7l8 = z2;
    }

    @Pure
    /* JADX INFO: renamed from: y */
    public static void m13704y(String str, String str2) {
        if (f23254g <= 1) {
            Log.i(str, str2);
        }
    }

    @Pure
    public static void zy(String str, String str2, @zy.dd Throwable th) {
        toq(str, m13699k(str2, th));
    }
}
