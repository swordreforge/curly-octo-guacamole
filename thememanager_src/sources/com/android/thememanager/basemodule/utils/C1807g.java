package com.android.thememanager.basemodule.utils;

import android.app.ActivityManager;
import android.content.Context;
import android.hardware.SensorManager;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebSettings;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.utils.o1t;
import com.android.thememanager.clockmessage.model.C1873k;
import com.market.sdk.utils.C5012n;
import java.io.File;
import java.util.Arrays;
import java.util.Locale;
import miui.drm.DrmManager;
import miui.telephony.TelephonyManager;
import miuix.device.C7106k;
import miuix.provider.C7317k;

/* JADX INFO: renamed from: com.android.thememanager.basemodule.utils.g */
/* JADX INFO: compiled from: DeviceUtils.java */
/* JADX INFO: loaded from: classes.dex */
public class C1807g {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private static boolean f57753cdj = false;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static String f57754f7l8 = null;

    /* JADX INFO: renamed from: g */
    public static final String f10322g = "MIPAD";

    /* JADX INFO: renamed from: h */
    private static String f10323h = null;

    /* JADX INFO: renamed from: i */
    private static Boolean f10324i = null;

    /* JADX INFO: renamed from: k */
    public static final String f10325k = "DeviceUtils";

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private static int f57755ki = 0;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private static String f57756kja0 = null;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static String f57757ld6 = null;

    /* JADX INFO: renamed from: n */
    public static final String f10326n = "MIFOLD";

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private static String f57758n7h = null;

    /* JADX INFO: renamed from: p */
    private static String f10327p = null;

    /* JADX INFO: renamed from: q */
    public static final String f10328q = "MIPHONE";

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static String f57759qrj;

    /* JADX INFO: renamed from: s */
    private static String f10329s;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private static final int f57760t8r;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final boolean f57761toq;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static String f57762x2;

    /* JADX INFO: renamed from: y */
    private static String f10330y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static Object f57763zy;

    static {
        f57761toq = Build.VERSION.SDK_INT >= 30 && m7071e();
        f57754f7l8 = null;
        f10330y = null;
        f10329s = null;
        f10327p = null;
        f57757ld6 = null;
        f57762x2 = null;
        f57759qrj = null;
        f57758n7h = null;
        f57756kja0 = null;
        f10323h = null;
        f57753cdj = false;
        f57755ki = -2;
        f57760t8r = C7106k.m25706p();
    }

    public static boolean a9() {
        return f57753cdj;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m7070c() {
        return lvui() && (C7106k.oc() || Arrays.asList("dizi", "ruan").contains(Build.DEVICE));
    }

    public static String cdj() {
        if (f10327p == null) {
            f10327p = Build.VERSION.RELEASE + "_" + Build.VERSION.INCREMENTAL;
        }
        return f10327p;
    }

    public static boolean d2ok() {
        if (f57761toq) {
            try {
                return ((Boolean) f57763zy.getClass().getMethod("isOnPcMode", new Class[0]).invoke(f57763zy, new Object[0])).booleanValue();
            } catch (Exception e2) {
                Log.d(f10325k, "not on pc mode: ", e2);
            }
        }
        return false;
    }

    public static boolean d3() {
        return C7106k.eqxt();
    }

    public static boolean dd() {
        return !m7081r();
    }

    /* JADX INFO: renamed from: e */
    private static boolean m7071e() {
        try {
            Object objInvoke = Class.forName("android.pc.MiuiPcManager").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
            f57763zy = objInvoke;
            if (objInvoke == null) {
                return false;
            }
            return ((Boolean) objInvoke.getClass().getMethod("supportPcMode", new Class[0]).invoke(f57763zy, new Object[0])).booleanValue();
        } catch (Exception e2) {
            Log.d(f10325k, "not support pc mode: ", e2);
            return false;
        }
    }

    public static boolean eqxt() {
        return C7106k.lvui();
    }

    /* JADX INFO: renamed from: f */
    public static boolean m7072f() {
        return TelephonyManager.getDefault().isVoiceCapable();
    }

    public static String f7l8() {
        return lvui() ? f10322g : f10328q;
    }

    public static boolean fn3e() {
        return Arrays.asList(bf2.toq.toq().getResources().getStringArray(R.array.DeviceNameOfCustomThemeByHwid)).contains(m7073g());
    }

    public static boolean fti() {
        return f57760t8r == 1;
    }

    public static boolean fu4() {
        return f57760t8r == 2;
    }

    /* JADX INFO: renamed from: g */
    public static String m7073g() {
        if (f57754f7l8 == null) {
            f57754f7l8 = Build.DEVICE;
        }
        return f57754f7l8;
    }

    public static boolean gvn7() {
        return C7106k.oc();
    }

    /* JADX INFO: renamed from: h */
    public static String m7074h() {
        if (f10329s == null) {
            f10329s = miuix.core.util.x2.f87403zy;
        }
        return f10329s;
    }

    public static boolean hb() {
        return !miuix.os.f7l8.toq("ro.radio.noril", false);
    }

    public static boolean hyr(Context context) {
        if (context == null) {
            return false;
        }
        try {
            return Settings.Secure.getInt(context.getContentResolver(), C7317k.k.f90032toq, 0) > 0;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: i */
    public static String m7075i() {
        if (!com.android.thememanager.basemodule.privacy.x2.zy()) {
            Log.i(f10325k, "getV error, not allow get");
            return null;
        }
        if (f57756kja0 == null) {
            Class<?> clsM7117k = lrht.m7117k("com.android.id.IdentifierManager");
            String str = (String) lrht.f7l8(lrht.m7118n(clsM7117k, "getVAID", Context.class), lrht.m7121y("com.android.id.IdentifierManager"), bf2.toq.toq());
            if (!TextUtils.isEmpty(str)) {
                f57756kja0 = C5012n.ld6(str);
            }
        }
        return f57756kja0;
    }

    public static boolean jk() {
        return f57760t8r == 0;
    }

    public static boolean jp0y() {
        if (bf2.toq.toq().getResources().getBoolean(R.bool.disableVideoWallpaper) || "veux".equals(Build.DEVICE)) {
            return true;
        }
        return !C7106k.gvn7() && d3();
    }

    /* JADX INFO: renamed from: k */
    public static int m7076k(Context context) {
        int identifier = context.getResources().getIdentifier("rounded_corner_radius_bottom", "dimen", "android");
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static int ki() {
        return C7106k.m25710t();
    }

    public static String kja0() {
        if (f10330y == null) {
            f10330y = miui.os.Build.getRegion();
        }
        return f10330y;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m7077l() {
        return !m7081r() && o1t.ki() && fn3e.m7063n(false);
    }

    public static String ld6() {
        if (f57762x2 == null) {
            if (o1t.C1820k.f57807zy > 0) {
                f57762x2 = "V" + (o1t.C1820k.m7181n() * 10);
            } else {
                f57762x2 = miuix.os.f7l8.m26160k("ro.miui.ui.version.name", "");
            }
        }
        return f57762x2;
    }

    public static void lrht(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService(C1873k.f10652g);
        if (activityManager == null || activityManager.isLowRamDevice() || mcp()) {
            f57753cdj = true;
            return;
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        f57753cdj = (((float) memoryInfo.totalMem) * 1.0f) / 1.0737418E9f <= 4.0f;
    }

    public static boolean lvui() {
        return miui.os.Build.IS_TABLET;
    }

    public static boolean mcp() {
        return f57760t8r == 0;
    }

    /* JADX INFO: renamed from: n */
    public static String m7078n() {
        if (f57758n7h == null) {
            String strM26160k = miuix.os.f7l8.m26160k("ro.miui.customized.region", "");
            f57758n7h = strM26160k;
            if (TextUtils.isEmpty(strM26160k)) {
                f57758n7h = miuix.os.f7l8.m26160k("ro.miui.cust_variant", "");
            }
        }
        return f57758n7h;
    }

    public static boolean n5r1() {
        return Build.DEVICE.equalsIgnoreCase("draco");
    }

    public static String n7h() {
        return lvui() ? f10322g : zurt() ? f10326n : f10328q;
    }

    public static boolean ncyb() {
        return zurt() && !y9n.a9() && new File(com.android.thememanager.basemodule.resource.constants.toq.kqo).exists();
    }

    public static boolean ni7() {
        return m7080q() == 2;
    }

    public static boolean nn86() {
        Boolean bool = f10324i;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (Build.VERSION.SDK_INT < 30 || !zurt()) {
            f10324i = Boolean.FALSE;
        } else {
            try {
                f10324i = Boolean.valueOf(((SensorManager) bf2.toq.toq().getSystemService(SensorManager.class)).getDefaultSensor(36, false) != null);
            } catch (Exception e2) {
                e2.printStackTrace();
                f10324i = Boolean.FALSE;
            }
        }
        return Boolean.TRUE.equals(f10324i);
    }

    public static boolean o1t() {
        return miui.os.Build.IS_INTERNATIONAL_BUILD;
    }

    public static Boolean oc() {
        return Boolean.valueOf(C7106k.d2ok());
    }

    /* JADX INFO: renamed from: p */
    public static String m7079p(Context context) {
        if (Build.VERSION.SDK_INT >= 29 || !lvui.ni7(context)) {
            return null;
        }
        if (TextUtils.isEmpty(f57757ld6)) {
            f57757ld6 = DrmManager.getEncodedImei(context);
        }
        return f57757ld6;
    }

    /* JADX INFO: renamed from: q */
    public static int m7080q() {
        return C7106k.x2(C7106k.f87451y9n, C7106k.f87410a98o);
    }

    public static String qrj() {
        if (!com.android.thememanager.basemodule.privacy.x2.zy()) {
            Log.i(f10325k, "getO error,not allow");
            return null;
        }
        if (f10323h == null) {
            Class<?> clsM7117k = lrht.m7117k("com.android.id.IdentifierManager");
            f10323h = (String) lrht.f7l8(lrht.m7118n(clsM7117k, "getOAID", Context.class), lrht.m7121y("com.android.id.IdentifierManager"), bf2.toq.toq());
        }
        return f10323h;
    }

    /* JADX INFO: renamed from: r */
    public static boolean m7081r() {
        return zurt() || lvui();
    }

    /* JADX INFO: renamed from: s */
    public static String m7082s() {
        if (f57759qrj == null) {
            try {
                f57759qrj = miuix.os.f7l8.m26160k("ro.boot.hwversion", "");
            } catch (Exception unused) {
                f57759qrj = "";
            }
        }
        return f57759qrj;
    }

    @Deprecated
    /* JADX INFO: renamed from: t */
    public static boolean m7083t(Context context) {
        return zurt() && (context.getResources().getConfiguration().screenLayout & 15) >= 3;
    }

    public static String t8r(Context context) {
        String property;
        try {
            property = WebSettings.getDefaultUserAgent(context);
        } catch (Exception unused) {
            property = System.getProperty("http.agent");
        }
        StringBuilder sb = new StringBuilder();
        int length = property.length();
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = property.charAt(i2);
            if (cCharAt <= 31 || cCharAt >= 127) {
                sb.append(String.format("\\u%04x", Integer.valueOf(cCharAt)));
            } else {
                sb.append(cCharAt);
            }
        }
        return sb.toString();
    }

    public static int toq(Context context) {
        int identifier = context.getResources().getIdentifier("rounded_corner_radius_top", "dimen", "android");
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static boolean uv6() {
        return !zurt();
    }

    public static boolean vyq() {
        return lvui();
    }

    public static boolean wvg() {
        return m7083t(bf2.toq.toq());
    }

    public static String x2() {
        return Build.MODEL;
    }

    public static boolean x9kr() {
        return "1".equals(miuix.os.f7l8.m26160k("ro.miui.restrict_imei_p", null));
    }

    /* JADX INFO: renamed from: y */
    public static int m7084y() {
        return C7106k.x2(C7106k.f87451y9n, C7106k.f39970a);
    }

    /* JADX INFO: renamed from: z */
    public static boolean m7085z() {
        return m7084y() == 2;
    }

    public static boolean zurt() {
        if (f57755ki == -2) {
            f57755ki = miuix.os.f7l8.zy("persist.sys.muiltdisplay_type", -1);
        }
        return f57755ki == 2;
    }

    public static String zy() {
        String strM26160k = miuix.os.f7l8.m26160k("ro.miui.region", "");
        if (TextUtils.isEmpty(strM26160k)) {
            strM26160k = miuix.os.f7l8.m26160k("ro.product.locale.region", "");
        }
        if (TextUtils.isEmpty(strM26160k)) {
            strM26160k = miuix.os.f7l8.m26160k("persist.sys.country", "");
        }
        return TextUtils.isEmpty(strM26160k) ? Locale.getDefault().getCountry() : strM26160k;
    }
}
