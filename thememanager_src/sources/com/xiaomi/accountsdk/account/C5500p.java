package com.xiaomi.accountsdk.account;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import java.io.File;

/* JADX INFO: renamed from: com.xiaomi.accountsdk.account.p */
/* JADX INFO: compiled from: XMPassportSettings.java */
/* JADX INFO: loaded from: classes3.dex */
public class C5500p {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static volatile Application f72773f7l8 = null;

    /* JADX INFO: renamed from: g */
    private static boolean f30764g = false;

    /* JADX INFO: renamed from: k */
    private static final String f30765k = "staging_sp";

    /* JADX INFO: renamed from: n */
    private static volatile String f30766n = null;

    /* JADX INFO: renamed from: q */
    private static volatile String f30767q = null;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f72774toq = "is_staging";

    /* JADX INFO: renamed from: y */
    @SuppressLint({"StaticFieldLeak"})
    private static volatile Context f30768y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static String f72775zy;

    public static synchronized void cdj(String str) {
        f30767q = str;
    }

    public static synchronized String f7l8() {
        return f30767q;
    }

    /* JADX INFO: renamed from: g */
    public static String m18780g() {
        return ld6.m18770q(f72773f7l8);
    }

    @Deprecated
    /* JADX INFO: renamed from: h */
    public static void m18781h(String str) {
        ld6.f7l8(str);
    }

    /* JADX INFO: renamed from: k */
    public static synchronized void m18782k(Application application) {
        if (application == null) {
            throw new IllegalArgumentException("application == null");
        }
        if (f72773f7l8 == null) {
            f72773f7l8 = application;
        }
    }

    public static synchronized void kja0(String str) {
        f30766n = str;
    }

    public static void ld6(String str) {
        f72775zy = str;
    }

    /* JADX INFO: renamed from: n */
    public static synchronized String m18783n() {
        return f30766n;
    }

    public static void n7h(boolean z2) {
        f30764g = z2;
    }

    /* JADX INFO: renamed from: p */
    public static synchronized void m18784p(Application application) {
        if (application == null) {
            throw new IllegalArgumentException("application == null");
        }
        f72773f7l8 = application;
    }

    /* JADX INFO: renamed from: q */
    private static Context m18785q() {
        return f72773f7l8 != null ? f72773f7l8 : f30768y;
    }

    public static void qrj(Context context, boolean z2) {
        x2(context);
        context.getSharedPreferences(f30765k, 0).edit().putBoolean(f72774toq, z2).apply();
    }

    /* JADX INFO: renamed from: s */
    static boolean m18786s() {
        boolean zExists = new File("/data/system/xiaomi_account_preview").exists();
        Context contextM18785q = m18785q();
        return (contextM18785q == null || "com.xiaomi.account".equals(contextM18785q.getPackageName())) ? zExists : zExists || contextM18785q.getSharedPreferences(f30765k, 0).getBoolean(f72774toq, false);
    }

    public static synchronized Application toq() {
        if (f30764g && f72773f7l8 == null) {
            throw new IllegalStateException("getApplicationContext should be called after setApplicationContext() or ensureApplicationContext()");
        }
        return f72773f7l8;
    }

    private static void x2(Context context) {
        if (context == null || context.getApplicationContext() == null) {
            throw new IllegalArgumentException("globalContext == null or globalContext.getApplicationContext() == null");
        }
        f30768y = context.getApplicationContext();
    }

    /* JADX INFO: renamed from: y */
    public static boolean m18787y(Context context) {
        x2(context);
        return m18786s();
    }

    public static String zy() {
        return f72775zy;
    }
}
