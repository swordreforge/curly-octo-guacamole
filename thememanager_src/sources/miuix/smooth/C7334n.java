package miuix.smooth;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import miuix.core.util.SystemProperties;
import miuix.reflect.C7320k;

/* JADX INFO: renamed from: miuix.smooth.n */
/* JADX INFO: compiled from: SmoothCornerHelper.java */
/* JADX INFO: loaded from: classes3.dex */
public class C7334n {

    /* JADX INFO: renamed from: k */
    public static Boolean f41680k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static boolean f90109toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static Boolean f90110zy;

    static {
        boolean z2 = Boolean.parseBoolean(SystemProperties.get("persist.sys.support_view_smoothcorner", "false"));
        f90109toq = z2;
        if (z2) {
            return;
        }
        Log.d("SmoothCornerHelper", "this device is not support system smooth corner");
    }

    private static void f7l8(View view, boolean z2) {
        try {
            C7320k.m26526h(View.class, view, "setSmoothCornerEnabled", new Class[]{Boolean.TYPE}, Boolean.valueOf(z2));
        } catch (Exception e2) {
            Log.d("SmoothCornerHelper", "setViewSmoothCornerEnable fail " + e2);
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m26604g(View view, boolean z2) {
        if (f90109toq && !toq(view.getContext())) {
            f7l8(view, z2);
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m26605k(Context context) {
        if (f90109toq) {
            toq(context);
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m26606n(Drawable drawable, boolean z2) {
        if (f90109toq) {
            m26607q(drawable, z2);
        }
    }

    /* JADX INFO: renamed from: q */
    private static void m26607q(Drawable drawable, boolean z2) {
        try {
            C7320k.m26526h(Drawable.class, drawable, "setSmoothCornerEnabled", new Class[]{Boolean.TYPE}, Boolean.valueOf(z2));
        } catch (Exception e2) {
            Log.d("SmoothCornerHelper", "setDrawableSmoothCornerEnable fail " + e2);
        }
    }

    public static boolean toq(Context context) {
        if (f90110zy == null) {
            try {
                Boolean bool = (Boolean) C7320k.ki(ApplicationInfo.class, context.getApplicationInfo(), "getGlobalSmoothCornerEnabled", new Class[0], new Object[0]);
                f90110zy = bool;
                if (bool == null) {
                    f90110zy = Boolean.FALSE;
                }
            } catch (Exception e2) {
                f90110zy = Boolean.FALSE;
                Log.d("SmoothCornerHelper", "isEnableAppSmoothCorner fail " + e2);
            }
        }
        return f90110zy.booleanValue();
    }

    /* JADX INFO: renamed from: y */
    public static void m26608y(View view, boolean z2) {
        if (f90109toq) {
            f7l8(view, z2);
        }
    }

    public static void zy(Drawable drawable, boolean z2) {
        if (f90109toq) {
            Boolean bool = f90110zy;
            if (bool == null || !bool.booleanValue()) {
                m26607q(drawable, z2);
            }
        }
    }
}
