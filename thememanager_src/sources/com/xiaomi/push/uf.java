package com.xiaomi.push;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.app.Application;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class uf {

    /* JADX INFO: renamed from: k */
    private static InterfaceC5950k f33980k;

    /* JADX INFO: renamed from: com.xiaomi.push.uf$k */
    public interface InterfaceC5950k {
        /* JADX INFO: renamed from: k */
        Map<String, String> m21866k(Context context, String str);

        /* JADX INFO: renamed from: k */
        boolean m21867k(Context context, String str);

        boolean toq(Context context, String str);
    }

    public enum toq {
        UNKNOWN(0),
        ALLOWED(1),
        NOT_ALLOWED(2);


        /* JADX INFO: renamed from: a */
        private final int f33985a;

        toq(int i2) {
            this.f33985a = i2;
        }

        /* JADX INFO: renamed from: a */
        public int m21868a() {
            return this.f33985a;
        }
    }

    public static boolean cdj(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            if (Settings.Secure.getInt(context.getContentResolver(), "freeform_window_state", -1) >= 0) {
                return str.equals(Settings.Secure.getString(context.getContentResolver(), "freeform_package_name"));
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static String f7l8() {
        String processName = Build.VERSION.SDK_INT >= 28 ? Application.getProcessName() : (String) C5892r.f7l8("android.app.ActivityThread", "currentProcessName", new Object[0]);
        return !TextUtils.isEmpty(processName) ? processName : "";
    }

    @TargetApi(19)
    /* JADX INFO: renamed from: g */
    public static toq m21858g(Context context, String str, boolean z2) {
        ApplicationInfo applicationInfo;
        toq toqVarM21861n;
        toq toqVar;
        if (context == null || TextUtils.isEmpty(str)) {
            return toq.UNKNOWN;
        }
        try {
            applicationInfo = str.equals(context.getPackageName()) ? context.getApplicationInfo() : context.getPackageManager().getApplicationInfo(str, 0);
            toqVarM21861n = m21861n(context, applicationInfo);
            toqVar = toq.UNKNOWN;
        } catch (Throwable th) {
            com.xiaomi.channel.commonutils.logger.zy.kja0("get app op error " + th);
        }
        if (toqVarM21861n != toqVar) {
            return toqVarM21861n;
        }
        Integer num = (Integer) C5892r.toq(AppOpsManager.class, "OP_POST_NOTIFICATION");
        if (num == null) {
            return toqVar;
        }
        Integer num2 = (Integer) C5892r.m21411n((AppOpsManager) context.getSystemService("appops"), "checkOpNoThrow", num, Integer.valueOf(applicationInfo.uid), str);
        int i2 = (Integer) C5892r.toq(AppOpsManager.class, "MODE_ALLOWED");
        int i3 = (Integer) C5892r.toq(AppOpsManager.class, "MODE_IGNORED");
        com.xiaomi.channel.commonutils.logger.zy.m19302z(String.format("get app mode %s|%s|%s", num2, i2, i3));
        if (i2 == null) {
            i2 = 0;
        }
        if (i3 == null) {
            i3 = 1;
        }
        if (num2 != null) {
            return z2 ? !num2.equals(i3) ? toq.ALLOWED : toq.NOT_ALLOWED : num2.equals(i2) ? toq.ALLOWED : toq.NOT_ALLOWED;
        }
        return toq.UNKNOWN;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m21859h(Context context, String str) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            packageInfo = null;
        }
        return packageInfo != null;
    }

    /* JADX INFO: renamed from: k */
    public static int m21860k(Context context) {
        Bundle bundle;
        if (context == null) {
            return 0;
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo("com.android.systemui", 128);
            if (applicationInfo == null || (bundle = applicationInfo.metaData) == null) {
                return 0;
            }
            return bundle.getInt("SupportForPushVersionCode");
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    public static boolean kja0(Context context, String str) {
        InterfaceC5950k interfaceC5950k = f33980k;
        return interfaceC5950k != null && interfaceC5950k.toq(context, str);
    }

    public static boolean ld6(Context context) {
        String strF7l8 = f7l8();
        if (TextUtils.isEmpty(strF7l8) || context == null) {
            return false;
        }
        return strF7l8.equals(context.getPackageName());
    }

    /* JADX INFO: renamed from: n */
    private static toq m21861n(Context context, ApplicationInfo applicationInfo) {
        int i2 = Build.VERSION.SDK_INT;
        if (applicationInfo == null) {
            return toq.UNKNOWN;
        }
        Boolean boolValueOf = null;
        try {
            if (applicationInfo.packageName.equals(context.getPackageName())) {
                boolValueOf = Boolean.valueOf(((NotificationManager) context.getSystemService(com.android.thememanager.basemodule.analysis.toq.mle)).areNotificationsEnabled());
            } else {
                Object objM21411n = i2 >= 29 ? C5892r.m21411n(context.getSystemService(com.android.thememanager.basemodule.analysis.toq.mle), "getService", new Object[0]) : context.getSystemService("security");
                if (objM21411n != null) {
                    boolValueOf = (Boolean) C5892r.n7h(objM21411n, "areNotificationsEnabledForPackage", applicationInfo.packageName, Integer.valueOf(applicationInfo.uid));
                }
            }
            if (boolValueOf != null) {
                return boolValueOf.booleanValue() ? toq.ALLOWED : toq.NOT_ALLOWED;
            }
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.zy.kja0("are notifications enabled error " + e2);
        }
        return toq.UNKNOWN;
    }

    public static String n7h(Context context, String str) {
        ApplicationInfo applicationInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
            return (packageInfo == null || (applicationInfo = packageInfo.applicationInfo) == null) ? str : packageManager.getApplicationLabel(applicationInfo).toString();
        } catch (PackageManager.NameNotFoundException unused) {
            return str;
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m21862p(Context context, ApplicationInfo applicationInfo, boolean z2) {
        int i2 = Build.VERSION.SDK_INT;
        if (toq.ALLOWED != m21861n(context, applicationInfo)) {
            try {
                Object objM21411n = i2 >= 29 ? C5892r.m21411n(context.getSystemService(com.android.thememanager.basemodule.analysis.toq.mle), "getService", new Object[0]) : context.getSystemService("security");
                if (objM21411n != null) {
                    C5892r.n7h(objM21411n, "setNotificationsEnabledForPackage", applicationInfo.packageName, Integer.valueOf(applicationInfo.uid), Boolean.valueOf(z2));
                }
            } catch (Exception e2) {
                com.xiaomi.channel.commonutils.logger.zy.kja0("set notifications enabled error " + e2);
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public static Drawable m21863q(Context context, String str) {
        ApplicationInfo applicationInfoZy = zy(context, str);
        Drawable drawableLoadIcon = null;
        if (applicationInfoZy != null) {
            try {
                drawableLoadIcon = applicationInfoZy.loadIcon(context.getPackageManager());
                if (drawableLoadIcon == null) {
                    drawableLoadIcon = applicationInfoZy.loadLogo(context.getPackageManager());
                }
            } catch (Exception e2) {
                com.xiaomi.channel.commonutils.logger.zy.kja0("get app icon drawable failed, " + e2);
            }
        }
        return drawableLoadIcon != null ? drawableLoadIcon : new ColorDrawable(0);
    }

    public static int qrj(Context context, String str) {
        ApplicationInfo applicationInfoZy = zy(context, str);
        if (applicationInfoZy == null) {
            return 0;
        }
        int i2 = applicationInfoZy.icon;
        return i2 == 0 ? applicationInfoZy.logo : i2;
    }

    /* JADX INFO: renamed from: s */
    public static Map<String, String> m21864s(Context context, String str) {
        InterfaceC5950k interfaceC5950k = f33980k;
        if (interfaceC5950k == null) {
            return null;
        }
        return interfaceC5950k.m21866k(context, str);
    }

    public static int toq(Context context, String str) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(str, 16384);
        } catch (Exception unused) {
            packageInfo = null;
        }
        if (packageInfo != null) {
            return packageInfo.versionCode;
        }
        return 0;
    }

    public static boolean x2(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return false;
        }
        if (!nc.m21315s()) {
            return context.getPackageName().equals(str);
        }
        InterfaceC5950k interfaceC5950k = f33980k;
        return interfaceC5950k != null && interfaceC5950k.m21867k(context, str);
    }

    /* JADX INFO: renamed from: y */
    public static String m21865y(Context context, String str) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(str, 16384);
        } catch (Exception unused) {
            packageInfo = null;
        }
        return packageInfo != null ? packageInfo.versionName : "1.0";
    }

    private static ApplicationInfo zy(Context context, String str) {
        if (str.equals(context.getPackageName())) {
            return context.getApplicationInfo();
        }
        try {
            return context.getPackageManager().getApplicationInfo(str, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            com.xiaomi.channel.commonutils.logger.zy.kja0("not found app info " + str);
            return null;
        }
    }
}
