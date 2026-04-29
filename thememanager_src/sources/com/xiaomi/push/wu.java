package com.xiaomi.push;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
public class wu {

    /* JADX INFO: renamed from: k */
    private static Context f34083k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static String f73718toq;

    public static boolean f7l8(Context context) {
        try {
            return (context.getApplicationInfo().flags & 2) != 0;
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.zy.t8r(e2);
            return false;
        }
    }

    /* JADX INFO: renamed from: g */
    public static boolean m21966g() {
        return TextUtils.equals((String) C5892r.f7l8("android.os.SystemProperties", "get", "sys.boot_completed"), "1");
    }

    /* JADX INFO: renamed from: k */
    public static int m21967k() {
        try {
            Class<?> clsZy = zy(null, "miui.os.Build");
            if (clsZy.getField("IS_STABLE_VERSION").getBoolean(null)) {
                return 3;
            }
            return clsZy.getField("IS_DEVELOPMENT_VERSION").getBoolean(null) ? 2 : 1;
        } catch (Exception unused) {
            return 0;
        }
    }

    private static String ld6() {
        String strM21289k = mla.m21289k("ro.vivo.os.version", "");
        if (!TextUtils.isEmpty(strM21289k) && !strM21289k.startsWith("FuntouchOS_")) {
            f73718toq = "FuntouchOS_" + strM21289k;
        }
        return f73718toq;
    }

    /* JADX INFO: renamed from: n */
    public static void m21968n(Context context) {
        f34083k = context.getApplicationContext();
    }

    /* JADX INFO: renamed from: p */
    private static String m21969p() {
        String strM21289k = mla.m21289k("ro.build.version.opporom", "");
        if (!TextUtils.isEmpty(strM21289k) && !strM21289k.startsWith("ColorOS_")) {
            f73718toq = "ColorOS_" + strM21289k;
        }
        return f73718toq;
    }

    /* JADX INFO: renamed from: q */
    public static synchronized String m21970q() {
        String str = f73718toq;
        if (str != null) {
            return str;
        }
        String strValueOf = Build.VERSION.INCREMENTAL;
        if (m21967k() <= 0) {
            String strM21972y = m21972y();
            if (TextUtils.isEmpty(strM21972y)) {
                strM21972y = m21969p();
                if (TextUtils.isEmpty(strM21972y)) {
                    strM21972y = ld6();
                    if (TextUtils.isEmpty(strM21972y)) {
                        strValueOf = String.valueOf(mla.m21289k("ro.product.brand", "Android") + "_" + strValueOf);
                    }
                }
                strValueOf = strM21972y;
            } else {
                strValueOf = strM21972y;
            }
        }
        f73718toq = strValueOf;
        return strValueOf;
    }

    /* JADX INFO: renamed from: s */
    public static boolean m21971s() {
        try {
            return zy(null, "miui.os.Build").getField("IS_GLOBAL_BUILD").getBoolean(Boolean.FALSE);
        } catch (ClassNotFoundException unused) {
            com.xiaomi.channel.commonutils.logger.zy.jk("miui.os.Build ClassNotFound");
            return false;
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.zy.t8r(e2);
            return false;
        }
    }

    public static Context toq() {
        return f34083k;
    }

    /* JADX INFO: renamed from: y */
    private static String m21972y() {
        String strM21289k = mla.m21289k("ro.build.version.emui", "");
        f73718toq = strM21289k;
        return strM21289k;
    }

    public static Class<?> zy(Context context, String str) throws ClassNotFoundException {
        if (str == null || str.trim().length() == 0) {
            throw new ClassNotFoundException("class is empty");
        }
        boolean z2 = context != null;
        if (z2 && Build.VERSION.SDK_INT >= 29) {
            try {
                return context.getClassLoader().loadClass(str);
            } catch (Throwable unused) {
            }
        }
        try {
            return Class.forName(str);
        } catch (Throwable th) {
            com.xiaomi.channel.commonutils.logger.zy.kja0(String.format("loadClass fail hasContext= %s, errMsg = %s", Boolean.valueOf(z2), th.getLocalizedMessage()));
            throw new ClassNotFoundException("loadClass fail ", th);
        }
    }
}
