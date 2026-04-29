package miuix.autodensity;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import miuix.core.util.C7085q;
import miuix.core.util.SystemProperties;
import miuix.provider.C7317k;

/* JADX INFO: renamed from: miuix.autodensity.n */
/* JADX INFO: compiled from: DensityConfigManager.java */
/* JADX INFO: loaded from: classes3.dex */
public class C7070n {

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final float f87171ld6 = 440.0f;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private static C7070n f87172n7h = null;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static final float f87173qrj = 1.1398964f;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final float f87174x2 = 386.0f;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private C7072q f87175f7l8;

    /* JADX INFO: renamed from: g */
    private C7072q f39750g;

    /* JADX INFO: renamed from: k */
    @Deprecated
    private boolean f39751k = false;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private float f87176toq = 0.0f;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private int f87177zy = 0;

    /* JADX INFO: renamed from: q */
    private float f39754q = 0.0f;

    /* JADX INFO: renamed from: n */
    private int f39752n = 0;

    /* JADX INFO: renamed from: y */
    private Point f39756y = new Point();

    /* JADX INFO: renamed from: s */
    private Point f39755s = new Point();

    /* JADX INFO: renamed from: p */
    private boolean f39753p = true;

    private C7070n() {
    }

    private float f7l8() {
        if (ld6.toq()) {
            return zy.m25520k();
        }
        return 0.0f;
    }

    private float fu4(Context context) {
        float fF7l8 = f7l8();
        if (fF7l8 < 0.0f) {
            this.f39753p = false;
            Log.d("AutoDensity", "disable auto density in debug mode");
        } else {
            this.f39753p = true;
        }
        if (fF7l8 <= 0.0f) {
            fF7l8 = m25507p(context);
        }
        return fF7l8 * m25508q(context);
    }

    /* JADX INFO: renamed from: h */
    private WindowManager m25505h(Context context) {
        return (WindowManager) context.getSystemService("window");
    }

    /* JADX INFO: renamed from: k */
    private float m25506k(Context context) {
        return Math.max(1.0f, Math.min((x2(context) / 9.3f) * 1.06f, 1.15f));
    }

    public static C7070n ld6() {
        if (f87172n7h == null) {
            f87172n7h = new C7070n();
        }
        return f87172n7h;
    }

    private void o1t(Context context) {
        Display display = ((DisplayManager) context.getSystemService("display")).getDisplay(0);
        display.getRealSize(this.f39755s);
        wvg(display);
    }

    /* JADX INFO: renamed from: p */
    private float m25507p(Context context) {
        float f2 = this.f39754q;
        if (f2 > 0.0f) {
            this.f87176toq = f2;
            return f2;
        }
        float qVar = x2.m25519q() ? x2.toq(context) : miuix.os.toq.f87881zy ? "cetus".contentEquals(Build.DEVICE) ? 1.0f : toq(context) : miuix.os.toq.f87880toq ? m25506k(context) : toq(context);
        zy.m25521q("getDeviceScale " + qVar);
        this.f87176toq = qVar;
        return qVar;
    }

    /* JADX INFO: renamed from: q */
    private float m25508q(Context context) {
        int iM26507n;
        if (miuix.os.toq.f40718n && miuix.os.zy.m26178g(context)) {
            zy.m25521q("in flip external screen delta: 1.0f");
            return 1.0f;
        }
        int iM25514y = m25514y();
        zy.m25521q("default dpi: " + iM25514y);
        if (iM25514y == -1) {
            return 1.0f;
        }
        try {
            iM26507n = C7317k.k.m26507n(context.getContentResolver(), "display_density_forced");
        } catch (Settings.SettingNotFoundException e2) {
            zy.m25521q("Exception: " + e2);
            iM26507n = iM25514y;
        }
        float f2 = (iM26507n * 1.0f) / iM25514y;
        zy.m25521q("accessibility dpi: " + iM26507n + ", delta: " + f2);
        return f2;
    }

    private float qrj(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        float fMax = Math.max(displayMetrics.xdpi, displayMetrics.ydpi);
        float fMin = Math.min(displayMetrics.xdpi, displayMetrics.ydpi);
        Point point = this.f39756y;
        float fMax2 = Math.max(point.x, point.y);
        Point point2 = this.f39756y;
        float fMin2 = Math.min(point2.x, point2.y);
        if (this.f39751k) {
            Point point3 = this.f39755s;
            fMax2 = Math.max(point3.x, point3.y);
            Point point4 = this.f39755s;
            fMin2 = Math.min(point4.x, point4.y);
        }
        return Math.min(fMin2 / fMin, fMax2 / fMax);
    }

    private float toq(Context context) {
        float fQrj = qrj(context);
        if (fQrj < 2.7f) {
            return fQrj / 2.8f;
        }
        return 1.0f;
    }

    private void wvg(Display display) {
        this.f39756y.set(0, 0);
        Display.Mode[] supportedModes = display.getSupportedModes();
        for (int i2 = 0; i2 < supportedModes.length; i2++) {
            Display.Mode mode = supportedModes[i2];
            zy.m25521q("updatePhysicalSizeFromDisplay mode" + i2 + " " + mode);
            this.f39756y.x = Math.max(mode.getPhysicalWidth(), this.f39756y.x);
            this.f39756y.y = Math.max(mode.getPhysicalHeight(), this.f39756y.y);
        }
        zy.m25521q("updatePhysicalSizeFromDisplay mPhysicalScreenSize " + this.f39756y + " mScreenSize " + this.f39755s);
    }

    private float x2(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        float fMax = Math.max(displayMetrics.xdpi, displayMetrics.ydpi);
        float fMin = Math.min(displayMetrics.xdpi, displayMetrics.ydpi);
        Point point = this.f39756y;
        float fMax2 = Math.max(point.x, point.y);
        Point point2 = this.f39756y;
        float fMin2 = Math.min(point2.x, point2.y);
        if (this.f39751k) {
            Point point3 = this.f39755s;
            fMax2 = Math.max(point3.x, point3.y);
            Point point4 = this.f39755s;
            fMin2 = Math.min(point4.x, point4.y);
        }
        return Math.max(fMin2 / fMin, fMax2 / fMax);
    }

    /* JADX INFO: renamed from: z */
    private int m25509z(Context context) {
        int i2 = this.f39752n;
        if (i2 > 0) {
            this.f87177zy = i2;
            return i2;
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        zy.m25521q("physical size: " + this.f39756y + " cur size: " + this.f39755s + ", display xdpi: " + displayMetrics.xdpi + ", ydpi: " + displayMetrics.ydpi);
        float fMax = Math.max(displayMetrics.xdpi, displayMetrics.ydpi);
        float fMin = Math.min(displayMetrics.xdpi, displayMetrics.ydpi);
        Point point = this.f39756y;
        float fMax2 = (float) Math.max(point.x, point.y);
        Point point2 = this.f39756y;
        float fMin2 = (float) Math.min(point2.x, point2.y);
        Point point3 = this.f39755s;
        float fMax3 = (float) Math.max(point3.x, point3.y);
        Point point4 = this.f39755s;
        float fMin3 = Math.min(point4.x, point4.y);
        if (this.f39751k) {
            fMax2 = fMax3;
            fMin2 = fMin3;
        }
        float f2 = fMax2 / fMax;
        float f3 = fMin2 / fMin;
        double dSqrt = Math.sqrt(Math.pow(f2, 2.0d) + Math.pow(f3, 2.0d));
        boolean z2 = fMax2 < fMax3;
        int iSqrt = (int) (Math.sqrt(Math.pow(fMax3, 2.0d) + Math.pow(fMin3, 2.0d)) / dSqrt);
        if (miuix.os.toq.f40718n && miuix.os.zy.m26178g(context) && !z2 && x2.zy()) {
            iSqrt = x2.m25517k(context, false);
        }
        this.f87177zy = iSqrt;
        zy.m25521q("Screen inches : " + dSqrt + ", isWindowScaled:" + z2 + ", ppi:" + iSqrt + ", physicalX:" + f2 + " physicalY:" + f3 + ", logicalX:" + this.f39755s.x + " logicalY:" + this.f39755s.y + ",min size inches: " + (Math.min(f3, f2) / 2.8f));
        return iSqrt;
    }

    public void cdj(Context context) {
        this.f87175f7l8 = new C7072q(context.getResources().getConfiguration());
        zy.m25521q("DensityConfigManager init");
        ni7(context, context.getResources().getConfiguration());
    }

    public void fn3e(int i2) {
        this.f39752n = i2;
    }

    /* JADX INFO: renamed from: g */
    public int m25510g() {
        return this.f87177zy;
    }

    /* JADX INFO: renamed from: i */
    public void m25511i(float f2) {
        this.f39754q = f2;
    }

    public boolean ki() {
        return this.f39753p;
    }

    public C7072q kja0() {
        return this.f87175f7l8;
    }

    /* JADX INFO: renamed from: n */
    public float m25512n() {
        return this.f87176toq;
    }

    public C7072q n7h() {
        return this.f39750g;
    }

    public void ni7(Context context, Configuration configuration) {
        zy.m25521q("DensityConfigManager updateConfig " + configuration + " context " + context);
        C7072q c7072q = new C7072q(configuration);
        this.f39750g = c7072q;
        C7085q.m25610z(c7072q);
        o1t(context);
        int iM25509z = (int) (m25509z(context) * f87173qrj * fu4(context));
        float f2 = (iM25509z * 1.0f) / configuration.densityDpi;
        C7072q c7072q2 = this.f87175f7l8;
        c7072q2.f92297zy = iM25509z;
        c7072q2.f42313q = iM25509z;
        C7072q c7072q3 = this.f39750g;
        c7072q2.f42312n = c7072q3.f42312n * f2;
        c7072q2.f42310g = c7072q3.f42310g * f2;
        c7072q2.f92295f7l8 = c7072q3.f92295f7l8 * f2;
        zy.m25521q("Config changed. Raw config(" + this.f39750g + ") TargetConfig(" + this.f87175f7l8 + ")");
    }

    /* JADX INFO: renamed from: s */
    public int m25513s() {
        C7072q c7072q = this.f39750g;
        return SystemProperties.getInt("ro.sf.lcd_density", c7072q != null ? c7072q.f42313q : -1);
    }

    @Deprecated
    public void t8r(boolean z2) {
        this.f39751k = z2;
    }

    /* JADX INFO: renamed from: y */
    public int m25514y() {
        int iM25513s = m25513s();
        if (!f7l8.m25499n()) {
            return iM25513s;
        }
        Point point = this.f39755s;
        float fMax = Math.max(point.x, point.y);
        Point point2 = this.f39756y;
        if (fMax == Math.max(point2.x, point2.y)) {
            return iM25513s;
        }
        Point point3 = this.f39755s;
        float fMin = iM25513s * Math.min(point3.x, point3.y) * 1.0f;
        Point point4 = this.f39756y;
        return Math.round(fMin / Math.min(point4.x, point4.y));
    }

    public boolean zurt(Context context, Configuration configuration) {
        zy.m25521q("tryUpdateConfig newConfig " + configuration + " context " + context);
        C7072q c7072q = this.f39750g;
        if (c7072q == null) {
            ni7(context, configuration);
            return true;
        }
        if (configuration.screenWidthDp == c7072q.f42311k && configuration.screenHeightDp == c7072q.f92296toq && configuration.densityDpi == c7072q.f42313q && configuration.fontScale == c7072q.f92295f7l8) {
            zy.m25521q("tryUpdateConfig failed");
            return false;
        }
        ni7(context, configuration);
        return true;
    }

    @Deprecated
    public int zy(int i2) {
        try {
            int iM25513s = m25513s();
            if (!f7l8.m25499n()) {
                return iM25513s;
            }
            Point point = this.f39755s;
            float fMax = Math.max(point.x, point.y);
            Point point2 = this.f39756y;
            if (fMax == Math.max(point2.x, point2.y)) {
                return iM25513s;
            }
            Point point3 = this.f39755s;
            float fMin = iM25513s * Math.min(point3.x, point3.y) * 1.0f;
            Point point4 = this.f39756y;
            return Math.round(fMin / Math.min(point4.x, point4.y));
        } catch (Throwable unused) {
            return -1;
        }
    }
}
