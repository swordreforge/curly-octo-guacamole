package com.android.thememanager.util;

import android.text.TextUtils;
import android.util.Log;
import yz.C7794k;

/* JADX INFO: renamed from: com.android.thememanager.util.j */
/* JADX INFO: compiled from: LogUtils.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C2789j {

    /* JADX INFO: renamed from: k */
    private static boolean f16566k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static int f61310toq;

    static {
        boolean zM5812n = bf2.toq.m5812n();
        f16566k = zM5812n;
        f61310toq = zM5812n ? 2 : 5;
    }

    public static void f7l8(String tag, Throwable tr, String format, Object... args) {
        if (m9831y(tag, 4)) {
            Log.i(tag, m9827n(format, args), tr);
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m9825g(String tag, String format, Object... args) {
        f7l8(tag, null, format, args);
    }

    /* JADX INFO: renamed from: k */
    public static void m9826k(String tag, String format, Object... args) {
        toq(tag, null, format, args);
    }

    public static void ld6(String msg) {
        x2(C7794k.f45962k, msg, new Object[0]);
    }

    /* JADX INFO: renamed from: n */
    private static String m9827n(String format, Object... args) {
        if (format == null) {
            return null;
        }
        return args.length == 0 ? format : String.format(format, args);
    }

    public static void n7h(String tag, Throwable tr, String format, Object... args) {
        if (m9831y(tag, 5)) {
            Log.w(tag, m9827n(format, args), tr);
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m9828p(String tag, Throwable tr, String format, Object... args) {
        if (m9831y(tag, 2)) {
            Log.v(tag, m9827n(format, args), tr);
        }
    }

    /* JADX INFO: renamed from: q */
    public static void m9829q(String tag, Throwable tr, String format, Object... args) {
        if (m9831y(tag, 6)) {
            Log.e(tag, m9827n(format, args), tr);
        }
    }

    public static void qrj(String tag, Throwable tr) {
        x2(tag, null, tr);
    }

    /* JADX INFO: renamed from: s */
    public static void m9830s(String tag, String format, Object... args) {
        m9828p(tag, null, format, args);
    }

    public static void toq(String tag, Throwable tr, String format, Object... args) {
        if (m9831y(tag, 3)) {
            Log.d(tag, m9827n(format, args), tr);
        }
    }

    public static void x2(String tag, String format, Object... args) {
        n7h(tag, null, format, args);
    }

    /* JADX INFO: renamed from: y */
    private static boolean m9831y(String tag, int level) {
        if (TextUtils.isEmpty(tag)) {
            return false;
        }
        return f61310toq <= level || Log.isLoggable(tag, level);
    }

    public static void zy(String tag, String format, Object... args) {
        m9829q(tag, null, format, args);
    }
}
