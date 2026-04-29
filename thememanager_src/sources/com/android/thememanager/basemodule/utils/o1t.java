package com.android.thememanager.basemodule.utils;

import android.app.Activity;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.MiuiConfiguration;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import android.view.Window;
import android.view.accessibility.AccessibilityManager;
import androidx.fragment.app.Fragment;
import com.android.thememanager.basemodule.resource.constants.InterfaceC1789q;
import com.android.thememanager.module.DependencyUtils;
import com.android.thememanager.settings.superwallpaper.utils.C2663k;
import java.io.File;
import java.lang.reflect.Method;
import java.util.TimeZone;
import miui.os.Build;
import miuix.android.content.C6824k;
import miuix.appcompat.app.AbstractC6946k;

/* JADX INFO: compiled from: MiuiUtils.java */
/* JADX INFO: loaded from: classes.dex */
public class o1t {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    public static final String f57790cdj = "elderly_mode";

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static final int f57791f7l8 = 0;

    /* JADX INFO: renamed from: g */
    public static final int f10381g = 1;

    /* JADX INFO: renamed from: h */
    private static final String f10382h = "boot_audio";

    /* JADX INFO: renamed from: k */
    private static final String f10383k = "MiuiUtils";

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private static Boolean f57792ki = null;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private static final int f57793kja0 = 1;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final int f57794ld6 = 1;

    /* JADX INFO: renamed from: n */
    public static final int f10384n = 0;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private static final int f57795n7h = 0;

    /* JADX INFO: renamed from: p */
    private static final String f10385p = "is_default_font";

    /* JADX INFO: renamed from: q */
    public static final boolean f10386q;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static final String f57796qrj = "is_default_icon";

    /* JADX INFO: renamed from: s */
    public static final int f10387s = 2;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final Object f57797toq = new Object();

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final int f57798x2 = 2;

    /* JADX INFO: renamed from: y */
    public static final int f10388y = 1;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static volatile File f57799zy;

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.utils.o1t$k */
    /* JADX INFO: compiled from: MiuiUtils.java */
    public static class C1820k {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        public static int f57800f7l8;

        /* JADX INFO: renamed from: g */
        public static int f10389g;

        /* JADX INFO: renamed from: kja0, reason: collision with root package name */
        private static int f57801kja0;

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        public static int f57802ld6;

        /* JADX INFO: renamed from: n */
        public static int f10391n;

        /* JADX INFO: renamed from: n7h, reason: collision with root package name */
        public static int f57803n7h;

        /* JADX INFO: renamed from: p */
        public static int f10392p;

        /* JADX INFO: renamed from: q */
        public static int f10393q;

        /* JADX INFO: renamed from: qrj, reason: collision with root package name */
        public static int f57804qrj;

        /* JADX INFO: renamed from: s */
        public static int f10394s;

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        public static int f57806x2;

        /* JADX INFO: renamed from: y */
        public static int f10395y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public static final int f57807zy;

        /* JADX INFO: renamed from: k */
        public static String f10390k = miuix.os.f7l8.m26160k("ro.miui.ui.version.code", "6");

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public static String f57805toq = miuix.os.f7l8.m26160k("ro.miui.version.code_time", "0");

        static {
            int iZy = miuix.os.f7l8.zy("ro.mi.os.version.code", 0);
            f57807zy = iZy;
            f10393q = 7;
            f10391n = 8;
            f10389g = 9;
            f57800f7l8 = 10;
            f10395y = 11;
            f10394s = 12;
            f10392p = 13;
            f57802ld6 = 14;
            f57806x2 = 15;
            f57804qrj = 1;
            f57803n7h = 15;
            try {
                if (iZy > 0) {
                    f57801kja0 = 14 + iZy;
                } else {
                    f57801kja0 = Integer.parseInt(f10390k);
                }
            } catch (Exception unused) {
            }
        }

        /* JADX INFO: renamed from: k */
        public static long m7180k() {
            return Long.parseLong(f57805toq);
        }

        /* JADX INFO: renamed from: n */
        public static int m7181n() {
            return f57801kja0;
        }

        /* JADX INFO: renamed from: q */
        public static int m7182q() {
            return f57807zy;
        }

        public static boolean toq(int version) {
            return f57807zy >= version;
        }

        public static boolean zy(int version) {
            return f57801kja0 >= version;
        }
    }

    static {
        f10386q = m7175q() >= 8;
        f57792ki = null;
    }

    public static boolean a9() {
        return toq() >= 1;
    }

    public static boolean cdj() {
        return C1820k.zy(C1820k.f10392p);
    }

    public static boolean f7l8() {
        return C2663k.qrj();
    }

    public static boolean fn3e() {
        return Settings.System.getInt(bf2.toq.toq().getContentResolver(), f57790cdj, 0) == 1;
    }

    public static void fti(Activity activity, boolean translucent) {
        Window window;
        if (y9n.m7258z() && C1819o.d3() && C1819o.eqxt(activity) && (window = activity.getWindow()) != null) {
            window.addFlags(Integer.MIN_VALUE);
            if (translucent) {
                window.addFlags(134217728);
            } else {
                window.clearFlags(134217728);
            }
        }
    }

    public static boolean fu4() {
        Boolean bool = f57792ki;
        if (bool != null) {
            return bool.booleanValue();
        }
        int userHandleId = DependencyUtils.getUserHandleId();
        Boolean boolValueOf = Boolean.valueOf((userHandleId < 10 || userHandleId == 99 || userHandleId == 999) ? false : true);
        f57792ki = boolValueOf;
        return boolValueOf.booleanValue();
    }

    /* JADX INFO: renamed from: g */
    public static boolean m7169g(Context context) {
        AccessibilityManager accessibilityManager;
        return context != null && (accessibilityManager = (AccessibilityManager) context.getApplicationContext().getSystemService("accessibility")) != null && accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled();
    }

    public static void gvn7() {
        int i2 = !TextUtils.isEmpty(vyq.ni7("icons")) ? 1 : 0;
        Log.d(f10383k, "writeDefaultIconSettings: status = " + i2);
        Settings.Global.putInt(bf2.toq.toq().getContentResolver(), f57796qrj, i2);
    }

    /* JADX INFO: renamed from: h */
    public static boolean m7170h() {
        return C1820k.zy(C1820k.f10395y);
    }

    /* JADX INFO: renamed from: i */
    public static boolean m7171i() {
        return C1820k.toq(C1820k.f57804qrj);
    }

    public static boolean jk() {
        ContentProviderClient contentProviderClientAcquireContentProviderClient = bf2.toq.toq().getContentResolver().acquireContentProviderClient("content://com.lbe.security.miui.autostartmgr");
        if (contentProviderClientAcquireContentProviderClient == null) {
            return false;
        }
        contentProviderClientAcquireContentProviderClient.release();
        return true;
    }

    public static void jp0y() {
        Settings.Global.putInt(bf2.toq.toq().getContentResolver(), f10385p, !new File(InterfaceC1789q.bt9).exists() ? 1 : 2);
    }

    /* JADX INFO: renamed from: k */
    public static int m7172k() {
        if (f7l8()) {
            return !a9.cdj(bf2.toq.toq()) ? 1 : 2;
        }
        return 0;
    }

    public static boolean ki() {
        return C1820k.zy(C1820k.f57802ld6);
    }

    public static boolean kja0() {
        return C1820k.zy(C1820k.f57800f7l8);
    }

    public static boolean ld6(Intent intent) {
        String strQrj = com.android.thememanager.basemodule.analysis.f7l8.qrj(intent);
        return !TextUtils.isEmpty(strQrj) && (strQrj.endsWith("com.android.settings") || strQrj.endsWith(InterfaceC1789q.ch1s) || strQrj.endsWith(InterfaceC1789q.rxcq));
    }

    public static void mcp(Activity activity) {
        if (!y9n.m7258z() || C1819o.d3()) {
            return;
        }
        C1819o.hb(activity, 0);
        activity.getWindow().getDecorView().setSystemUiVisibility(1792);
    }

    /* JADX INFO: renamed from: n */
    public static void m7173n(@zy.lvui Context context, @zy.dd Fragment fragment, int requestCode) {
        Intent intent = new Intent();
        if (m7171i()) {
            intent.setClassName("com.miui.aod", com.android.thememanager.settings.personalize.ld6.f60811ld6);
        } else {
            intent.setAction("android.intent.action.MAIN");
            intent.setClassName("com.android.settings", "com.android.settings.SubSettings");
            intent.putExtra(":settings:show_fragment", "com.android.settings.AodAndLockScreenSettings");
        }
        if (fragment != null) {
            fragment.startActivityForResult(intent, requestCode);
        } else if (context instanceof Activity) {
            ((Activity) context).startActivityForResult(intent, requestCode);
        } else {
            context.startActivity(intent);
        }
    }

    public static boolean n7h() {
        return C1820k.zy(C1820k.f10389g);
    }

    public static boolean ni7(Context context) {
        return Settings.System.getInt(context.getContentResolver(), C6824k.eklw, 0) == 1;
    }

    public static boolean o1t(@zy.lvui Context context) {
        boolean zM7174p = m7174p(context);
        String id = TimeZone.getDefault().getID();
        String string = Settings.System.getString(context.getContentResolver(), "resident_timezone");
        return (!zM7174p || string == null || string.equals(id)) ? false : true;
    }

    /* JADX INFO: renamed from: p */
    public static boolean m7174p(Context context) {
        return Settings.System.getInt(context.getContentResolver(), "auto_dual_clock", 0) != 0;
    }

    /* JADX INFO: renamed from: q */
    private static int m7175q() {
        return C1820k.m7181n();
    }

    public static boolean qrj() {
        return C1820k.zy(C1820k.f10391n);
    }

    /* JADX INFO: renamed from: s */
    public static boolean m7176s(@zy.lvui Context context) {
        return Settings.Global.getInt(context.getContentResolver(), f10382h, 1) == 1;
    }

    /* JADX INFO: renamed from: t */
    public static void m7177t(Context context, boolean open) {
        try {
            Settings.Global.putInt(context.getContentResolver(), f10382h, open ? 1 : 0);
        } catch (Exception e2) {
            Log.e(f10383k, e2.getMessage());
        }
        cdj.fu4(context);
    }

    public static boolean t8r() {
        return C1820k.zy(C1820k.f10393q);
    }

    public static int toq() {
        if (!Build.IS_TABLET && !Build.IS_INTERNATIONAL_BUILD) {
            try {
                Bundle bundle = bf2.toq.toq().getPackageManager().getApplicationInfo("com.android.incallui", 128).metaData;
                if (bundle == null) {
                    return 0;
                }
                return bundle.getInt("incall_incoming_show", 0);
            } catch (PackageManager.NameNotFoundException e2) {
                e2.printStackTrace();
            }
        }
        return 0;
    }

    public static void wvg(AbstractC6946k actionBar, int state) {
        if (actionBar != null) {
            if (!kja0()) {
                state = 0;
            }
            actionBar.nsb(state);
            actionBar.dxef(state == 1);
        }
    }

    public static boolean x2() {
        return m7172k() >= 2;
    }

    /* JADX INFO: renamed from: y */
    public static boolean m7178y() {
        return Settings.Secure.getInt(bf2.toq.toq().getContentResolver(), Build.VERSION.SDK_INT >= 28 ? "doze_always_on" : "aod_mode", 0) != 0;
    }

    /* JADX INFO: renamed from: z */
    public static boolean m7179z() {
        return Build.VERSION.SDK_INT >= 30 && m7170h();
    }

    public static boolean zurt(Context context) {
        return Settings.Secure.getInt(context.getContentResolver(), "accessibility_display_inversion_enabled", 0) != 0;
    }

    public static MiuiConfiguration zy(Configuration configuration) {
        try {
            Method methodM7116g = lrht.m7116g(MiuiConfiguration.class, "getExtraConfig", Configuration.class);
            methodM7116g.setAccessible(true);
            return (MiuiConfiguration) methodM7116g.invoke(null, configuration);
        } catch (Exception e2) {
            Log.w(f10383k, "MiuiConfiguration from Configuration failed", e2);
            return null;
        }
    }
}
