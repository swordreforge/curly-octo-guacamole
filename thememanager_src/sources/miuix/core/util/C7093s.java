package miuix.core.util;

import android.util.Log;
import android.view.View;
import miuix.reflect.C7320k;

/* JADX INFO: renamed from: miuix.core.util.s */
/* JADX INFO: compiled from: MiShadowUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public class C7093s {

    /* JADX INFO: renamed from: k */
    private static final String f39899k = "MiShadowHelper";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final boolean f87373toq;

    static {
        boolean z2 = Boolean.parseBoolean(SystemProperties.get("persist.sys.mi_shadow_supported", "false"));
        f87373toq = z2;
        if (z2) {
            return;
        }
        Log.d(f39899k, "This device does not support mi shadow!");
    }

    private C7093s() {
    }

    /* JADX INFO: renamed from: k */
    public static void m25624k(View view) {
        zy(view, 0, 0.0f, 0.0f, 0.0f);
    }

    /* JADX INFO: renamed from: q */
    public static void m25625q(View view, @zy.x2 int i2, float f2, float f3, float f4, float f5) {
        if (f87373toq) {
            try {
                Class cls = Float.TYPE;
                C7320k.m26526h(View.class, view, "setMiShadow", new Class[]{Integer.TYPE, cls, cls, cls, cls}, Integer.valueOf(i2), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), Float.valueOf(f5));
            } catch (Exception e2) {
                Log.e(f39899k, "Failed to call setMiShadow", e2);
            }
        }
    }

    public static void toq(View view, @zy.x2 int i2, float f2) {
        zy(view, i2, 0.0f, 0.0f, f2);
    }

    public static void zy(View view, @zy.x2 int i2, float f2, float f3, float f4) {
        m25625q(view, i2, f2, f3, f4, 1.0f);
    }
}
