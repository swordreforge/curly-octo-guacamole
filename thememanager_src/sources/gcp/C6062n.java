package gcp;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.WindowManager;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Locale;
import miuix.core.util.SystemProperties;
import miuix.provider.C7317k;

/* JADX INFO: renamed from: gcp.n */
/* JADX INFO: compiled from: DeviceConfig.java */
/* JADX INFO: loaded from: classes3.dex */
public class C6062n {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    public static final int f77032cdj;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static final int f77033f7l8 = 0;

    /* JADX INFO: renamed from: g */
    public static final String f35041g = "high_text_contrast_enabled";

    /* JADX INFO: renamed from: h */
    public static final boolean f35042h;

    /* JADX INFO: renamed from: k */
    public static final String f35043k = "cetus";

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    public static final boolean f77034kja0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    public static final int f77035ld6 = 1;

    /* JADX INFO: renamed from: n */
    private static final String f35044n = "ClockDeviceConfig";

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    public static final ArrayList<String> f77036n7h;

    /* JADX INFO: renamed from: p */
    public static final int f35045p = 0;

    /* JADX INFO: renamed from: q */
    public static final boolean f35046q;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static int f77037qrj = 0;

    /* JADX INFO: renamed from: s */
    public static final int f35047s = -1;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final String f77038toq = "goku";

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public static final String f77039x2 = "background_blur_enable";

    /* JADX INFO: renamed from: y */
    public static final int f35048y = 1;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final boolean f77040zy;

    static {
        f77040zy = SystemProperties.getInt("persist.sys.muiltdisplay_type", 0) == 2;
        f35046q = "tablet".equals(SystemProperties.get("ro.build.characteristics", "default"));
        f77037qrj = -1;
        ArrayList<String> arrayList = new ArrayList<>();
        f77036n7h = arrayList;
        f77034kja0 = SystemProperties.getBoolean("persist.sys.background_blur_keyguard_disabled", false);
        arrayList.add("yudi");
        arrayList.add("corot");
        f35042h = SystemProperties.getBoolean("persist.sys.background_blur_supported", false);
        f77032cdj = SystemProperties.getInt("persist.sys.background_blur_version", 0);
    }

    public static boolean cdj() {
        return f77032cdj >= 2;
    }

    public static Rect f7l8(Context context) {
        if (context == null) {
            return new Rect();
        }
        if (Build.VERSION.SDK_INT >= 30) {
            Rect bounds = ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds();
            Log.i(f35044n, "get bounds = " + bounds);
            return bounds;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        Log.i(f35044n, "get dm w = " + displayMetrics.widthPixels + ", h = " + displayMetrics.heightPixels);
        return new Rect(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    /* JADX INFO: renamed from: g */
    private static String m22316g() {
        String str = SystemProperties.get("persist.sys.miui_resolution", null);
        return (TextUtils.isEmpty(str) || Integer.parseInt(str.split(",")[0]) != 1440) ? "FHD+" : "WQHD+";
    }

    /* JADX INFO: renamed from: h */
    public static boolean m22317h(Context context) {
        if (f77037qrj == -1) {
            f77037qrj = m22320p(context);
        }
        return f35042h && f77037qrj == 1 && !(f77036n7h.contains(Build.DEVICE) && !cdj()) && !(f77034kja0 && ld6());
    }

    /* JADX INFO: renamed from: k */
    public static float m22318k(Context context) {
        return context.getResources().getConfiguration().smallestScreenWidthDp / m22319n(context);
    }

    public static void kja0(int i2) {
        f77037qrj = i2;
    }

    public static boolean ld6() {
        return TextUtils.equals(m22316g(), "WQHD+");
    }

    /* JADX INFO: renamed from: n */
    private static float m22319n(Context context) {
        if (qrj() && !m22322s(context)) {
            return 320.0f;
        }
        if (qrj() && m22322s(context)) {
            return 676.0f;
        }
        return (f77040zy && m22323y(context)) ? Build.DEVICE.equalsIgnoreCase(f77038toq) ? 741.0f : 696.0f : f35046q ? 711.0f : 392.0f;
    }

    public static boolean n7h() {
        return TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
    }

    /* JADX INFO: renamed from: p */
    public static int m22320p(Context context) {
        if (!C6064q.m22333g(context)) {
            return Settings.Secure.getInt(context.getContentResolver(), f77039x2, 0);
        }
        try {
            int iF7l8 = C6064q.f7l8();
            Class cls = Integer.TYPE;
            return ((Integer) Settings.Secure.class.getMethod("getIntForUser", ContentResolver.class, String.class, cls, cls).invoke(null, context.getContentResolver(), f77039x2, 0, Integer.valueOf(iF7l8))).intValue();
        } catch (Exception e2) {
            Log.e(f35044n, "getIntForUser fail", e2);
            return 0;
        }
    }

    /* JADX INFO: renamed from: q */
    private static int m22321q(int i2) {
        try {
            Method declaredMethod = Class.forName("android.view.WindowManagerGlobal").getDeclaredMethod("getWindowManagerService", new Class[0]);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(null, new Object[0]);
            Method declaredMethod2 = Class.forName("android.view.IWindowManager").getDeclaredMethod("getInitialDisplayDensity", Integer.TYPE);
            declaredMethod2.setAccessible(true);
            return ((Integer) declaredMethod2.invoke(objInvoke, Integer.valueOf(i2))).intValue();
        } catch (Throwable th) {
            Log.e(f35044n, "getDefaultDisplayDensity error: ", th);
            return -1;
        }
    }

    public static boolean qrj() {
        return TextUtils.equals(Build.DEVICE, "cetus");
    }

    /* JADX INFO: renamed from: s */
    public static boolean m22322s(Context context) {
        return (context.getResources().getConfiguration().screenLayout & 15) >= 3;
    }

    private static int toq(int i2) {
        try {
            String str = SystemProperties.get("persist.sys.miui_resolution", null);
            if (TextUtils.isEmpty(str)) {
                return m22321q(i2);
            }
            Point point = new Point();
            Method declaredMethod = Class.forName("android.view.WindowManagerGlobal").getDeclaredMethod("getWindowManagerService", new Class[0]);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(null, new Object[0]);
            Class<?> cls = Class.forName("android.view.IWindowManager");
            Class<?> cls2 = Integer.TYPE;
            Method declaredMethod2 = cls.getDeclaredMethod("getInitialDisplaySize", cls2, Point.class);
            declaredMethod2.setAccessible(true);
            declaredMethod2.invoke(objInvoke, Integer.valueOf(i2), point);
            int iIntValue = Integer.valueOf(str.split(",")[0]).intValue();
            cls.getDeclaredMethod("getInitialDisplayDensity", cls2).setAccessible(true);
            return Math.round(((((Integer) r3.invoke(objInvoke, Integer.valueOf(i2))).intValue() * iIntValue) * 1.0f) / point.x);
        } catch (Throwable th) {
            Log.e(f35044n, "getAccessibilityDefaultDisplayDpi error: ", th);
            return -1;
        }
    }

    public static boolean x2(Context context) {
        int iIntValue;
        if (!C6064q.m22333g(context)) {
            return Settings.Secure.getInt(context.getContentResolver(), f35041g, 0) == 1;
        }
        try {
            int iF7l8 = C6064q.f7l8();
            Class cls = Integer.TYPE;
            iIntValue = ((Integer) Settings.Secure.class.getMethod("getIntForUser", ContentResolver.class, String.class, cls, cls).invoke(null, context.getContentResolver(), f35041g, 0, Integer.valueOf(iF7l8))).intValue();
        } catch (Exception e2) {
            Log.e(f35044n, "getIntForUser fail", e2);
            iIntValue = 0;
        }
        return iIntValue == 1;
    }

    /* JADX INFO: renamed from: y */
    public static boolean m22323y(Context context) {
        return context.getResources().getConfiguration().smallestScreenWidthDp >= 600;
    }

    public static float zy(Context context) {
        int iM26507n;
        int qVar = toq(0);
        Log.d(f35044n, "default dpi: " + qVar);
        if (qVar == -1) {
            return 1.0f;
        }
        try {
            iM26507n = C7317k.k.m26507n(context.getContentResolver(), "display_density_forced");
        } catch (Settings.SettingNotFoundException e2) {
            Log.w(f35044n, "Exception: " + e2);
            iM26507n = qVar;
        }
        float f2 = (iM26507n * 1.0f) / qVar;
        Log.d(f35044n, "accessibility dpi: " + iM26507n + ", delta: " + f2);
        return f2;
    }
}
