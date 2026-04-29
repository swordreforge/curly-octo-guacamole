package com.xiaomi.onetrack.util;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import androidx.exifinterface.media.C0846k;
import com.market.sdk.reflect.toq;
import com.xiaomi.onetrack.OneTrack;
import com.xiaomi.onetrack.p014c.C5735i;
import com.xiaomi.onetrack.p017f.C5756a;
import java.lang.reflect.Method;
import java.util.Locale;
import java.util.TimeZone;
import miuix.provider.C7317k;

/* JADX INFO: renamed from: com.xiaomi.onetrack.util.q */
/* JADX INFO: loaded from: classes3.dex */
public class C5805q {

    /* JADX INFO: renamed from: a */
    public static final int f32424a = 33;

    /* JADX INFO: renamed from: b */
    public static final int f32425b = 29;

    /* JADX INFO: renamed from: c */
    public static final int f32426c = 25;

    /* JADX INFO: renamed from: d */
    public static final int f32427d = 24;

    /* JADX INFO: renamed from: e */
    public static final int f32428e = 23;

    /* JADX INFO: renamed from: f */
    public static final int f32429f = 22;

    /* JADX INFO: renamed from: g */
    public static final int f32430g = 21;

    /* JADX INFO: renamed from: h */
    public static final int f32431h = 19;

    /* JADX INFO: renamed from: i */
    public static final int f32432i = 17;

    /* JADX INFO: renamed from: j */
    public static final int f32433j = 28;

    /* JADX INFO: renamed from: k */
    public static final int f32434k = 2;

    /* JADX INFO: renamed from: l */
    public static final int f32435l = 4;

    /* JADX INFO: renamed from: m */
    private static final String f32436m = "OsUtil";

    /* JADX INFO: renamed from: n */
    private static Class f32437n = null;

    /* JADX INFO: renamed from: o */
    private static Method f32438o = null;

    /* JADX INFO: renamed from: p */
    private static Boolean f32439p = null;

    /* JADX INFO: renamed from: q */
    private static final String f32440q = "";

    /* JADX INFO: renamed from: r */
    private static Method f32441r = null;

    /* JADX INFO: renamed from: s */
    private static boolean f32442s = false;

    /* JADX INFO: renamed from: t */
    private static String f32443t = null;

    /* JADX INFO: renamed from: u */
    private static boolean f32444u = false;

    /* JADX INFO: renamed from: v */
    private static int f32445v;

    static {
        try {
            f32441r = Class.forName("android.os.SystemProperties").getMethod("get", String.class);
        } catch (Throwable th) {
            C5804p.m20347b(f32436m, "sGetProp init failed ex: " + th.getMessage());
        }
        try {
            f32437n = Class.forName("miui.os.Build");
        } catch (Throwable th2) {
            C5804p.m20347b(f32436m, "sMiuiBuild init failed ex: " + th2.getMessage());
        }
        try {
            Method declaredMethod = Class.forName("android.provider.MiuiSettings$Secure").getDeclaredMethod("isUserExperienceProgramEnable", ContentResolver.class);
            f32438o = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (Throwable th3) {
            C5804p.m20347b(f32436m, "sMiuiUEPMethod init failed ex: " + th3.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m20359a() {
        Boolean bool = f32439p;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (TextUtils.isEmpty(m20363b("ro.miui.ui.version.code"))) {
            f32439p = Boolean.FALSE;
        } else {
            f32439p = Boolean.TRUE;
        }
        return f32439p.booleanValue();
    }

    /* JADX INFO: renamed from: b */
    private static String m20363b(String str) {
        try {
            Method method = f32441r;
            if (method != null) {
                return String.valueOf(method.invoke(null, str));
            }
        } catch (Exception e2) {
            C5804p.m20347b(f32436m, "getProp failed ex: " + e2.getMessage());
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static String m20364c() {
        Class cls = f32437n;
        if (cls == null) {
            return "";
        }
        try {
            if (((Boolean) cls.getField("IS_ALPHA_BUILD").get(null)).booleanValue()) {
                return C0846k.l0;
            }
            if (((Boolean) f32437n.getField("IS_STABLE_VERSION").get(null)).booleanValue()) {
                return "S";
            }
            boolean zContains = Build.VERSION.INCREMENTAL.contains(".DEV");
            boolean zBooleanValue = ((Boolean) f32437n.getField("IS_DEVELOPMENT_VERSION").get(null)).booleanValue();
            return (!zBooleanValue || zContains) ? (zBooleanValue && zContains) ? "X" : "" : toq.f28135s;
        } catch (Exception e2) {
            Log.e(f32436m, "getRomBuildCode failed: " + e2.toString());
            return "";
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m20365d() {
        return Build.VERSION.INCREMENTAL;
    }

    /* JADX INFO: renamed from: e */
    public static String m20366e() {
        return Build.VERSION.RELEASE;
    }

    /* JADX INFO: renamed from: f */
    public static int m20367f() {
        Integer num;
        Throwable th;
        try {
            Method declaredMethod = Class.forName("android.os.UserHandle").getDeclaredMethod("getUserId", Integer.TYPE);
            declaredMethod.setAccessible(true);
            int iMyUid = Process.myUid();
            num = (Integer) declaredMethod.invoke(null, Integer.valueOf(iMyUid));
            try {
                C5804p.m20342a(f32436m, String.format("getUserId, uid:%d, userId:%d", Integer.valueOf(iMyUid), num));
            } catch (Throwable th2) {
                th = th2;
                Log.e(C5804p.m20340a(f32436m), "getUserId exception: " + th.getMessage());
            }
        } catch (Throwable th3) {
            num = null;
            th = th3;
        }
        if (num == null) {
            num = 0;
        }
        return num.intValue();
    }

    @TargetApi(17)
    /* JADX INFO: renamed from: g */
    public static boolean m20368g() {
        try {
            boolean z2 = Settings.Global.getInt(C5756a.m20053b().getContentResolver(), "device_provisioned", 0) != 0;
            if (!z2) {
                C5804p.m20351c(f32436m, "Provisioned: " + z2);
            }
            return z2;
        } catch (Exception e2) {
            C5804p.m20348b(f32436m, "isDeviceProvisioned exception", e2);
            return true;
        }
    }

    /* JADX INFO: renamed from: h */
    public static boolean m20369h() {
        return (!m20359a() || f32444u) ? f32442s : m20373l();
    }

    /* JADX INFO: renamed from: i */
    public static String m20370i() {
        return (!m20359a() || f32444u) ? !TextUtils.isEmpty(f32443t) ? f32443t : m20372k() : m20372k();
    }

    /* JADX INFO: renamed from: j */
    public static String m20371j() {
        return m20372k();
    }

    /* JADX INFO: renamed from: k */
    private static String m20372k() {
        try {
            String strM20219a = ab.m20219a("ro.miui.region", "");
            if (TextUtils.isEmpty(strM20219a)) {
                strM20219a = ab.m20219a("ro.product.locale.region", "");
            }
            if (TextUtils.isEmpty(strM20219a)) {
                Object objInvoke = Class.forName("android.os.LocaleList").getMethod("getDefault", new Class[0]).invoke(null, new Object[0]);
                Object objInvoke2 = objInvoke.getClass().getMethod("size", new Class[0]).invoke(objInvoke, new Object[0]);
                if ((objInvoke2 instanceof Integer) && ((Integer) objInvoke2).intValue() > 0) {
                    Object objInvoke3 = objInvoke.getClass().getMethod("get", Integer.TYPE).invoke(objInvoke, 0);
                    Object objInvoke4 = objInvoke3.getClass().getMethod("getCountry", new Class[0]).invoke(objInvoke3, new Object[0]);
                    if (objInvoke4 instanceof String) {
                        strM20219a = (String) objInvoke4;
                    }
                }
            }
            if (TextUtils.isEmpty(strM20219a)) {
                strM20219a = Locale.getDefault().getCountry();
            }
            if (!TextUtils.isEmpty(strM20219a)) {
                return strM20219a.trim();
            }
        } catch (Throwable th) {
            C5804p.m20347b(f32436m, "getRegion Exception: " + th.getMessage());
        }
        return "";
    }

    /* JADX INFO: renamed from: l */
    private static boolean m20373l() {
        Class cls = f32437n;
        if (cls != null) {
            try {
                return ((Boolean) cls.getField("IS_INTERNATIONAL_BUILD").get(null)).booleanValue();
            } catch (Exception unused) {
            }
        }
        if (TextUtils.isEmpty(m20372k())) {
            return false;
        }
        return !TextUtils.equals("CN", r0.toUpperCase());
    }

    /* JADX INFO: renamed from: b */
    public static String m20362b() {
        return m20355a(TimeZone.getDefault().getRawOffset());
    }

    /* JADX INFO: renamed from: a */
    public static String m20355a(int i2) {
        try {
            int i3 = i2 / 60000;
            char c2 = '+';
            if (i3 < 0) {
                c2 = '-';
                i3 = -i3;
            }
            StringBuilder sb = new StringBuilder(9);
            sb.append("GMT");
            sb.append(c2);
            m20356a(sb, i3 / 60);
            sb.append(':');
            m20356a(sb, i3 % 60);
            return sb.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m20356a(StringBuilder sb, int i2) {
        String string = Integer.toString(i2);
        for (int i3 = 0; i3 < 2 - string.length(); i3++) {
            sb.append('0');
        }
        sb.append(string);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m20360a(Context context) {
        if (f32438o == null) {
            try {
                if (m20359a()) {
                    int i2 = Settings.Secure.getInt(context.getContentResolver(), C7317k.k.f90032toq, -1);
                    C5804p.m20342a(f32436m, "isUserExperiencePlanEnabled upload_log_value: " + i2);
                    if (i2 != 1 && i2 == 0) {
                        return false;
                    }
                }
                return true;
            } catch (Throwable th) {
                C5804p.m20342a(f32436m, "Settings failed: " + th.toString());
            }
        }
        try {
            return ((Boolean) f32438o.invoke(null, context.getContentResolver())).booleanValue();
        } catch (Throwable th2) {
            Log.d(f32436m, "isUserExperiencePlanEnabled failed: " + th2.getMessage());
            return true;
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m20361a(String str) {
        if (!OneTrack.isDisable() && !OneTrack.isUseSystemNetTrafficOnly()) {
            if (!m20368g()) {
                C5804p.m20351c(str, "should not access network or location, not provisioned");
                return true;
            }
            if (C5735i.m19962b()) {
                return false;
            }
            C5804p.m20351c(str, "should not access network or location, cta");
            return true;
        }
        C5804p.m20351c(str, "should not access network or location, cta");
        return true;
    }

    /* JADX INFO: renamed from: a */
    public static void m20358a(boolean z2, String str, OneTrack.Mode mode) {
        int i2;
        if (mode == OneTrack.Mode.APP) {
            i2 = 3;
        } else if (mode == OneTrack.Mode.PLUGIN) {
            i2 = 2;
        } else {
            i2 = mode == OneTrack.Mode.SDK ? 1 : 0;
        }
        if (f32445v <= i2) {
            f32442s = z2;
            f32443t = str;
            f32445v = i2;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m20357a(boolean z2) {
        f32444u = z2;
    }
}
