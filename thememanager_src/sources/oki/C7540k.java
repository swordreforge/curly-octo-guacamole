package oki;

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
import java.util.Locale;
import miuix.core.util.SystemProperties;
import miuix.provider.C7317k;

/* JADX INFO: renamed from: oki.k */
/* JADX INFO: compiled from: DeviceConfig.java */
/* JADX INFO: loaded from: classes3.dex */
public class C7540k {

    /* JADX INFO: renamed from: k */
    public static final String f43676k = "cetus";

    /* JADX INFO: renamed from: n */
    public static final boolean f43677n;

    /* JADX INFO: renamed from: q */
    private static final String f43678q = "ClockDeviceConfig";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final boolean f94260toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final boolean f94261zy;

    static {
        f94260toq = SystemProperties.getInt("persist.sys.muiltdisplay_type", 0) == 2;
        f94261zy = "tablet".equals(SystemProperties.get("ro.build.characteristics", "default"));
        f43677n = SystemProperties.getBoolean("persist.sys.background_blur_supported", false);
    }

    public static Rect f7l8(Context context) {
        if (context == null) {
            return new Rect();
        }
        if (Build.VERSION.SDK_INT >= 30) {
            Rect bounds = ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds();
            Log.i(f43678q, "get bounds = " + bounds);
            return bounds;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        Log.i(f43678q, "get dm w = " + displayMetrics.widthPixels + ", h = " + displayMetrics.heightPixels);
        return new Rect(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    /* JADX INFO: renamed from: g */
    private static float m27571g(Context context) {
        if (m27576s() && !m27577y(context)) {
            return 320.0f;
        }
        if (m27576s() && m27577y(context)) {
            return 676.0f;
        }
        if (f94260toq && m27577y(context)) {
            return 696.0f;
        }
        return f94261zy ? 711.0f : 392.0f;
    }

    /* JADX INFO: renamed from: k */
    public static float m27572k(Context context) {
        return context.getResources().getConfiguration().smallestScreenWidthDp / m27571g(context);
    }

    public static boolean ld6() {
        return TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
    }

    /* JADX INFO: renamed from: n */
    private static int m27573n(int i2) {
        try {
            Method declaredMethod = Class.forName("android.view.WindowManagerGlobal").getDeclaredMethod("getWindowManagerService", new Class[0]);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(null, new Object[0]);
            Method declaredMethod2 = Class.forName("android.view.IWindowManager").getDeclaredMethod("getInitialDisplayDensity", Integer.TYPE);
            declaredMethod2.setAccessible(true);
            return ((Integer) declaredMethod2.invoke(objInvoke, Integer.valueOf(i2))).intValue();
        } catch (Throwable th) {
            Log.e(f43678q, "getDefaultDisplayDensity error: ", th);
            return -1;
        }
    }

    /* JADX INFO: renamed from: p */
    public static boolean m27574p() {
        return (f94260toq || f94261zy) ? false : true;
    }

    /* JADX INFO: renamed from: q */
    public static float m27575q(Context context) {
        int iM26507n;
        int iZy = zy(0);
        Log.d(f43678q, "default dpi: " + iZy);
        if (iZy == -1) {
            return 1.0f;
        }
        try {
            iM26507n = C7317k.k.m26507n(context.getContentResolver(), "display_density_forced");
        } catch (Settings.SettingNotFoundException e2) {
            Log.w(f43678q, "Exception: " + e2);
            iM26507n = iZy;
        }
        float f2 = (iM26507n * 1.0f) / iZy;
        Log.d(f43678q, "accessibility dpi: " + iM26507n + ", delta: " + f2);
        return f2;
    }

    /* JADX INFO: renamed from: s */
    public static boolean m27576s() {
        return TextUtils.equals(Build.DEVICE, "cetus");
    }

    public static Point toq(Context context) {
        Point point = new Point();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRealSize(point);
        return point;
    }

    /* JADX INFO: renamed from: y */
    public static boolean m27577y(Context context) {
        return (context.getResources().getConfiguration().screenLayout & 15) >= 3;
    }

    private static int zy(int i2) {
        try {
            String str = SystemProperties.get("persist.sys.miui_resolution", null);
            if (TextUtils.isEmpty(str)) {
                return m27573n(i2);
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
            Log.e(f43678q, "getAccessibilityDefaultDisplayDpi error: ", th);
            return -1;
        }
    }
}
