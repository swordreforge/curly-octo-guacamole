package com.market.sdk.utils;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ConfigurationInfo;
import android.content.pm.FeatureInfo;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.WindowManager;
import com.android.thememanager.clockmessage.model.C1873k;
import com.market.sdk.utils.qrj;
import com.market.sdk.wvg;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;
import java.util.UUID;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL10;
import miuix.appcompat.internal.app.widget.ActionBarMovableLayout;

/* JADX INFO: renamed from: com.market.sdk.utils.q */
/* JADX INFO: compiled from: Client.java */
/* JADX INFO: loaded from: classes3.dex */
public class C5014q {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    public static String f69006cdj = null;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static int f69007f7l8 = 0;

    /* JADX INFO: renamed from: g */
    public static int f28222g = 0;

    /* JADX INFO: renamed from: h */
    public static String f28223h = null;

    /* JADX INFO: renamed from: k */
    private static final String f28224k = "MarketSdkClient";

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    public static String f69008ki = null;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    public static int f69009kja0 = 0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    public static String f69010ld6 = null;

    /* JADX INFO: renamed from: n */
    public static final int f28225n = 11;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    public static ArrayList<String> f69011n7h = null;

    /* JADX INFO: renamed from: p */
    public static int f28226p = 0;

    /* JADX INFO: renamed from: q */
    private static String f28227q = "-1";

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    public static ArrayList<String> f69012qrj = null;

    /* JADX INFO: renamed from: s */
    public static int f28228s = 0;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private static final Object f69013t8r = new Object();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static boolean f69014toq = false;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public static ArrayList<String> f69015x2;

    /* JADX INFO: renamed from: y */
    public static String f28229y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static String f69016zy;

    public static String cdj() {
        return Build.MODEL;
    }

    private static void f7l8(Context context) {
        f69006cdj = Build.VERSION.RELEASE;
        f28223h = Build.VERSION.INCREMENTAL;
        f69009kja0 = Build.VERSION.SDK_INT;
    }

    public static void fn3e(Context context) {
        if (f69014toq) {
            return;
        }
        m17468g(context);
        m17471k(context);
        toq(context);
        m17472n(context);
        zy();
        f7l8(context);
        m17474q(context);
        f69014toq = true;
    }

    public static boolean fu4() {
        return f69009kja0 >= 11;
    }

    /* JADX INFO: renamed from: g */
    private static void m17468g(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        f69007f7l8 = displayMetrics.heightPixels;
        f28222g = displayMetrics.widthPixels;
        f28229y = f69007f7l8 + "*" + f28222g;
        f28228s = displayMetrics.densityDpi;
    }

    /* JADX INFO: renamed from: h */
    public static String m17469h() {
        String strM17502k = wvg.m17502k("ro.miui.ui.version.name", "");
        if (TextUtils.isEmpty(strM17502k) || m17476t()) {
            return strM17502k;
        }
        if (zurt()) {
            return strM17502k + "-alpha";
        }
        return strM17502k + "-dev";
    }

    /* JADX INFO: renamed from: i */
    public static String m17470i() {
        String strM17484p = qrj.m17484p("uuid", "", new qrj.EnumC5015k[0]);
        if (!TextUtils.isEmpty(strM17484p)) {
            return strM17484p;
        }
        String strValueOf = String.valueOf(UUID.randomUUID());
        qrj.m17481i("uuid", strValueOf, new qrj.EnumC5015k[0]);
        return strValueOf;
    }

    /* JADX INFO: renamed from: k */
    private static void m17471k(Context context) {
        ConfigurationInfo deviceConfigurationInfo = ((ActivityManager) context.getSystemService(C1873k.f10652g)).getDeviceConfigurationInfo();
        f28226p = deviceConfigurationInfo.reqTouchScreen;
        f69010ld6 = deviceConfigurationInfo.getGlEsVersion();
    }

    public static String ki() {
        return wvg.m17502k("ro.miui.region", "CN");
    }

    public static String kja0() {
        return wvg.m17502k("ro.miui.ui.version.code", f28227q);
    }

    public static int ld6() {
        return mcp() ? 1 : 0;
    }

    public static boolean mcp() {
        return wvg.m17502k("ro.build.characteristics", "").contains("tablet");
    }

    /* JADX INFO: renamed from: n */
    private static void m17472n(Context context) {
        String[] systemSharedLibraryNames = context.getPackageManager().getSystemSharedLibraryNames();
        synchronized (f69013t8r) {
            f69012qrj = new ArrayList<>();
            if (systemSharedLibraryNames != null) {
                for (String str : systemSharedLibraryNames) {
                    if (!TextUtils.isEmpty(str)) {
                        f69012qrj.add(str);
                    }
                }
            }
            Collections.sort(f69012qrj);
        }
    }

    public static String n7h() {
        return Locale.getDefault().getLanguage();
    }

    public static boolean ni7() {
        return wvg() && wvg.m17502k("ro.product.mod_device", "").contains("_global");
    }

    public static boolean o1t() {
        return f69009kja0 >= 24;
    }

    /* JADX INFO: renamed from: p */
    public static String m17473p() {
        return Build.DEVICE;
    }

    /* JADX INFO: renamed from: q */
    private static void m17474q(Context context) {
        f69008ki = Settings.Secure.getString(context.getContentResolver(), "android_id");
    }

    public static String qrj() {
        try {
            String deviceId = ((TelephonyManager) C5010k.toq().getSystemService("phone")).getDeviceId();
            if (TextUtils.isEmpty(deviceId)) {
                deviceId = m17470i();
            }
            return C5012n.ld6(deviceId);
        } catch (Exception e2) {
            Log.e(f28224k, "getImeiMd5 error: " + e2.getMessage());
            return "";
        }
    }

    /* JADX INFO: renamed from: s */
    public static String m17475s() {
        ArrayList arrayList = new ArrayList();
        if (m17478z()) {
            String strM17502k = wvg.m17502k("ro.product.cpu.abilist", "");
            if (!TextUtils.isEmpty(strM17502k)) {
                arrayList = new ArrayList(Arrays.asList(TextUtils.split(strM17502k, ",")));
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(Build.CPU_ABI);
            arrayList.add(Build.CPU_ABI2);
        }
        return TextUtils.join(",", arrayList);
    }

    /* JADX INFO: renamed from: t */
    public static boolean m17476t() {
        return miui.os.Build.IS_STABLE_VERSION;
    }

    public static int t8r() {
        return Build.VERSION.SDK_INT;
    }

    private static void toq(Context context) {
        FeatureInfo[] systemAvailableFeatures = context.getPackageManager().getSystemAvailableFeatures();
        synchronized (f69013t8r) {
            f69015x2 = new ArrayList<>();
            if (systemAvailableFeatures != null) {
                for (FeatureInfo featureInfo : systemAvailableFeatures) {
                    if (!TextUtils.isEmpty(featureInfo.name)) {
                        f69015x2.add(featureInfo.name);
                    }
                }
            }
            Collections.sort(f69015x2);
        }
    }

    public static boolean wvg() {
        if (f69016zy == null) {
            f69016zy = kja0();
        }
        return (TextUtils.isEmpty(f69016zy) || f28227q.equals(f69016zy)) ? false : true;
    }

    private static String x2() {
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        EGLDisplay eGLDisplayEglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        if (eGLDisplayEglGetDisplay == EGL10.EGL_NO_DISPLAY || !egl10.eglInitialize(eGLDisplayEglGetDisplay, new int[2])) {
            return null;
        }
        int[] iArr = new int[1];
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (!egl10.eglChooseConfig(eGLDisplayEglGetDisplay, new int[]{12339, 1, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12344}, eGLConfigArr, 1, iArr)) {
            return null;
        }
        EGLConfig eGLConfig = iArr[0] > 0 ? eGLConfigArr[0] : null;
        EGLContext eGLContextEglCreateContext = egl10.eglCreateContext(eGLDisplayEglGetDisplay, eGLConfig, EGL10.EGL_NO_CONTEXT, null);
        EGLSurface eGLSurfaceEglCreatePbufferSurface = egl10.eglCreatePbufferSurface(eGLDisplayEglGetDisplay, eGLConfig, new int[]{12375, 480, 12374, ActionBarMovableLayout.n5ij, 12344});
        if (eGLSurfaceEglCreatePbufferSurface == null || eGLSurfaceEglCreatePbufferSurface == EGL10.EGL_NO_SURFACE) {
            return null;
        }
        egl10.eglMakeCurrent(eGLDisplayEglGetDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContextEglCreateContext);
        if (!egl10.eglMakeCurrent(eGLDisplayEglGetDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContextEglCreateContext)) {
            return null;
        }
        String strGlGetString = ((GL10) eGLContextEglCreateContext.getGL()).glGetString(7939);
        egl10.eglDestroySurface(eGLDisplayEglGetDisplay, eGLSurfaceEglCreatePbufferSurface);
        egl10.eglDestroyContext(eGLDisplayEglGetDisplay, eGLContextEglCreateContext);
        egl10.eglTerminate(eGLDisplayEglGetDisplay);
        if (strGlGetString != null) {
            return strGlGetString.trim();
        }
        return null;
    }

    /* JADX INFO: renamed from: y */
    public static String m17477y() {
        return Locale.getDefault().getCountry();
    }

    /* JADX INFO: renamed from: z */
    public static boolean m17478z() {
        return t8r() >= 21;
    }

    public static boolean zurt() {
        return miui.os.Build.IS_ALPHA_BUILD;
    }

    private static void zy() {
        String strX2 = x2();
        synchronized (f69013t8r) {
            f69011n7h = new ArrayList<>();
            if (!TextUtils.isEmpty(strX2)) {
                for (String str : TextUtils.split(strX2, " ")) {
                    if (!TextUtils.isEmpty(str)) {
                        f69011n7h.add(str);
                    }
                }
            }
            Collections.sort(f69011n7h);
        }
    }
}
