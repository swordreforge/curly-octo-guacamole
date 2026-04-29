package com.xiaomi.push;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public class yqrt {

    /* JADX INFO: renamed from: k */
    private static py f34217k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static i9jn f73748toq;

    private static boolean f7l8(Context context) {
        return zsr0.zy(context);
    }

    /* JADX INFO: renamed from: g */
    public static void m22057g(Context context, imd imdVar) {
        py pyVar = f34217k;
        if (pyVar != null) {
            imdVar.m20984p(pyVar);
            f34217k = null;
        }
        i9jn i9jnVar = f73748toq;
        if (i9jnVar != null) {
            imdVar.m20988z(i9jnVar);
            f73748toq = null;
        }
        zy("stopStats");
    }

    /* JADX INFO: renamed from: k */
    public static void m22058k(Context context) {
        zy("onSendMsg");
        if (f7l8(context)) {
            se.f7l8(context, System.currentTimeMillis(), m22060q(context));
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m22059n(Context context) {
        zy("onReceiveMsg");
        if (f7l8(context)) {
            se.ld6(context, System.currentTimeMillis(), m22060q(context));
        }
    }

    /* JADX INFO: renamed from: q */
    public static boolean m22060q(Context context) {
        return m8.cdj(context);
    }

    /* JADX INFO: renamed from: s */
    public static void m22061s(Context context) {
        zy("onPong");
        if (f7l8(context)) {
            se.qrj(context, System.currentTimeMillis(), m22060q(context));
        }
    }

    public static void toq(Context context, imd imdVar) {
        if (f7l8(context)) {
            if (f34217k == null) {
                f34217k = new py(context);
            }
            if (f73748toq == null) {
                f73748toq = new i9jn(context);
            }
            py pyVar = f34217k;
            imdVar.ld6(pyVar, pyVar);
            i9jn i9jnVar = f73748toq;
            imdVar.o1t(i9jnVar, i9jnVar);
            zy("startStats");
        }
    }

    /* JADX INFO: renamed from: y */
    public static void m22062y(Context context) {
        zy("onPing");
        if (f7l8(context)) {
            se.x2(context, System.currentTimeMillis(), m22060q(context));
        }
    }

    static void zy(String str) {
        zsr0.toq("Push-PowerStats", str);
    }
}
