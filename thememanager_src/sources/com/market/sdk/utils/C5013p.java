package com.market.sdk.utils;

import android.text.TextUtils;
import android.util.Log;

/* JADX INFO: renamed from: com.market.sdk.utils.p */
/* JADX INFO: compiled from: Log.java */
/* JADX INFO: loaded from: classes3.dex */
public class C5013p {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final int f69003f7l8 = 4;

    /* JADX INFO: renamed from: g */
    private static final int f28218g = 3;

    /* JADX INFO: renamed from: k */
    private static final int f28219k = 3000;

    /* JADX INFO: renamed from: n */
    private static final int f28220n = 2;

    /* JADX INFO: renamed from: q */
    private static final int f28221q = 1;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f69004toq = "MarketSdk-";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final int f69005zy = 0;

    public static void f7l8(String str, String str2, Throwable th) {
        m17466s(m17462k(str), str2, th, 2);
    }

    /* JADX INFO: renamed from: g */
    public static void m17461g(String str, String str2) {
        m17467y(m17462k(str), str2, 2);
    }

    /* JADX INFO: renamed from: k */
    public static String m17462k(String str) {
        return f69004toq + str;
    }

    public static void kja0(String str, String str2, Throwable th) {
        m17466s(m17462k(str), str2, th, 1);
    }

    private static void ld6(String str, String str2, Throwable th, int i2) {
        if (str2 == null) {
            str2 = "";
        }
        if (i2 == 0) {
            Log.e(str, str2, th);
            return;
        }
        if (i2 == 1) {
            Log.w(str, str2, th);
            return;
        }
        if (i2 == 2) {
            Log.i(str, str2, th);
        } else if (i2 == 3) {
            Log.d(str, str2, th);
        } else {
            if (i2 != 4) {
                return;
            }
            Log.v(str, str2, th);
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m17463n(String str, String str2, Throwable th) {
        m17466s(m17462k(str), str2, th, 0);
    }

    public static void n7h(String str, String str2) {
        m17467y(m17462k(str), str2, 1);
    }

    /* JADX INFO: renamed from: p */
    private static void m17464p(String str, String str2, int i2) {
        if (str2 == null) {
            str2 = "";
        }
        if (i2 == 0) {
            Log.e(str, str2);
            return;
        }
        if (i2 == 1) {
            Log.w(str, str2);
            return;
        }
        if (i2 == 2) {
            Log.i(str, str2);
        } else if (i2 == 3) {
            Log.d(str, str2);
        } else {
            if (i2 != 4) {
                return;
            }
            Log.v(str, str2);
        }
    }

    /* JADX INFO: renamed from: q */
    public static void m17465q(String str, String str2) {
        m17467y(m17462k(str), str2, 0);
    }

    public static void qrj(String str, String str2, Throwable th) {
        m17466s(m17462k(str), str2, th, 4);
    }

    /* JADX INFO: renamed from: s */
    private static void m17466s(String str, String str2, Throwable th, int i2) {
        if (TextUtils.isEmpty(str2) || str2.length() <= 3000) {
            ld6(str, str2, th, i2);
            return;
        }
        int i3 = 0;
        while (i3 <= str2.length() / 3000) {
            int i4 = i3 * 3000;
            i3++;
            int iMin = Math.min(str2.length(), i3 * 3000);
            if (i4 < iMin) {
                ld6(str, str2.substring(i4, iMin), th, i2);
            }
        }
    }

    public static void toq(String str, String str2) {
        m17467y(m17462k(str), str2, 3);
    }

    public static void x2(String str, String str2) {
        m17467y(m17462k(str), str2, 4);
    }

    /* JADX INFO: renamed from: y */
    private static void m17467y(String str, String str2, int i2) {
        if (TextUtils.isEmpty(str2) || str2.length() <= 3000) {
            m17464p(str, str2, i2);
            return;
        }
        int i3 = 0;
        while (i3 <= str2.length() / 3000) {
            int i4 = i3 * 3000;
            i3++;
            int iMin = Math.min(str2.length(), i3 * 3000);
            if (i4 < iMin) {
                m17464p(str, str2.substring(i4, iMin), i2);
            }
        }
    }

    public static void zy(String str, String str2, Throwable th) {
        m17466s(m17462k(str), str2, th, 3);
    }
}
