package com.xiaomi.onetrack.p017f;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.xiaomi.onetrack.util.C5777j;

/* JADX INFO: renamed from: com.xiaomi.onetrack.f.a */
/* JADX INFO: loaded from: classes3.dex */
public class C5756a {

    /* JADX INFO: renamed from: a */
    private static Context f32100a = null;

    /* JADX INFO: renamed from: b */
    private static Context f32101b = null;

    /* JADX INFO: renamed from: c */
    private static int f32102c = 0;

    /* JADX INFO: renamed from: d */
    private static String f32103d = null;

    /* JADX INFO: renamed from: e */
    private static String f32104e = null;

    /* JADX INFO: renamed from: f */
    private static long f32105f = 0;

    /* JADX INFO: renamed from: g */
    private static volatile boolean f32106g = false;

    /* JADX INFO: renamed from: a */
    public static void m20050a(Context context) {
        if (f32106g) {
            return;
        }
        synchronized (C5756a.class) {
            if (f32106g) {
                return;
            }
            f32100a = context;
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(f32100a.getPackageName(), 0);
                f32102c = packageInfo.versionCode;
                f32103d = packageInfo.versionName;
                f32105f = packageInfo.lastUpdateTime;
                f32104e = f32100a.getPackageName();
            } catch (PackageManager.NameNotFoundException e2) {
                e2.printStackTrace();
            }
            f32106g = true;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m20054b(Context context, String str) {
        PackageInfo packageInfoM20049a = m20049a(context, str, 0);
        return (packageInfoM20049a == null || packageInfoM20049a.applicationInfo == null) ? false : true;
    }

    /* JADX INFO: renamed from: c */
    public static String m20056c(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        try {
            return packageManager.getApplicationInfo(str, 0).loadLabel(packageManager).toString();
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
            return "";
        }
    }

    /* JADX INFO: renamed from: d */
    public static int m20057d() {
        return f32102c;
    }

    /* JADX INFO: renamed from: e */
    public static String m20058e() {
        return f32104e;
    }

    /* JADX INFO: renamed from: f */
    public static long m20059f() {
        return f32105f;
    }

    /* JADX INFO: renamed from: b */
    public static Context m20053b() {
        return f32100a;
    }

    /* JADX INFO: renamed from: c */
    public static String m20055c() {
        return f32103d;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m20052a(ApplicationInfo applicationInfo) {
        return (applicationInfo.flags & 1) != 0;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m20051a(Context context, String str) {
        try {
            return m20052a(m20049a(context, str, 0).applicationInfo);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public static PackageInfo m20049a(Context context, String str, int i2) {
        try {
            return context.getPackageManager().getPackageInfo(str, i2);
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static Context m20048a() {
        if (C5777j.m20262d(f32100a)) {
            Context context = f32101b;
            if (context != null) {
                return context;
            }
            synchronized (C5756a.class) {
                if (f32101b == null) {
                    f32101b = C5777j.m20257a(f32100a);
                }
            }
            return f32101b;
        }
        return f32100a;
    }
}
