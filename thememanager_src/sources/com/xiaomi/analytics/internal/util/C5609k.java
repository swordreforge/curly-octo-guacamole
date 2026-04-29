package com.xiaomi.analytics.internal.util;

import android.util.Log;

/* JADX INFO: renamed from: com.xiaomi.analytics.internal.util.k */
/* JADX INFO: compiled from: ALog.java */
/* JADX INFO: loaded from: classes3.dex */
public class C5609k {

    /* JADX INFO: renamed from: k */
    public static boolean f31199k = false;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f73058toq = "Analytics-Api-";

    public static void f7l8(String str, String str2, Throwable th) {
        if (f31199k) {
            Log.i(m19240k(str), str2, th);
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m19239g(String str, String str2) {
        if (f31199k) {
            Log.i(m19240k(str), str2);
        }
    }

    /* JADX INFO: renamed from: k */
    public static String m19240k(String str) {
        return f73058toq + str;
    }

    /* JADX INFO: renamed from: n */
    public static void m19241n(String str, String str2, Throwable th) {
        if (f31199k) {
            Log.e(m19240k(str), str2, th);
        }
    }

    /* JADX INFO: renamed from: q */
    public static void m19242q(String str, String str2) {
        if (f31199k) {
            Log.e(m19240k(str), str2);
        }
    }

    /* JADX INFO: renamed from: s */
    public static void m19243s(String str, String str2, Throwable th) {
        if (f31199k) {
            Log.w(m19240k(str), str2, th);
        }
    }

    public static void toq(String str, String str2) {
        if (f31199k) {
            Log.d(m19240k(str), str2);
        }
    }

    /* JADX INFO: renamed from: y */
    public static void m19244y(String str, String str2) {
        if (f31199k) {
            Log.w(m19240k(str), str2);
        }
    }

    public static void zy(String str, String str2, Throwable th) {
        if (f31199k) {
            Log.d(m19240k(str), str2, th);
        }
    }
}
