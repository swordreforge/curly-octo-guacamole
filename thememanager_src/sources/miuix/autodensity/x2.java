package miuix.autodensity;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import miuix.core.util.C7085q;
import miuix.core.util.SystemProperties;

/* JADX INFO: compiled from: SkuScale.java */
/* JADX INFO: loaded from: classes3.dex */
public class x2 {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static int f87330f7l8;

    /* JADX INFO: renamed from: g */
    private static final String f39844g;

    /* JADX INFO: renamed from: k */
    private static final String f39845k;

    /* JADX INFO: renamed from: n */
    private static final String f39846n;

    /* JADX INFO: renamed from: q */
    private static float f39847q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f87331toq;

    /* JADX INFO: renamed from: y */
    private static int f39848y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static float f87332zy;

    static {
        String str = SystemProperties.get("ro.miui.density.primaryscale", null);
        f39845k = str;
        String str2 = SystemProperties.get("ro.miui.density.secondaryscale", null);
        f87331toq = str2;
        f87332zy = 0.0f;
        f39847q = 0.0f;
        String str3 = SystemProperties.get("ro.miui.density.primaryppi", null);
        f39846n = str3;
        String str4 = SystemProperties.get("ro.miui.density.secondaryppi", null);
        f39844g = str4;
        f87330f7l8 = 0;
        f39848y = 0;
        if (!TextUtils.isEmpty(str)) {
            f87332zy = m25516g(str);
        }
        if (!TextUtils.isEmpty(str2)) {
            f39847q = m25516g(str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            f87330f7l8 = m25518n(str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            f39848y = m25518n(str4);
        }
        if (f39847q == 0.0f) {
            f39847q = f87332zy;
        }
    }

    /* JADX INFO: renamed from: g */
    private static float m25516g(String str) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException e2) {
            Log.w("AutoDensity", "catch error: sku scale is not a number", e2);
            return 0.0f;
        }
    }

    /* JADX INFO: renamed from: k */
    static int m25517k(Context context, boolean z2) {
        return z2 ? f87330f7l8 : f39848y;
    }

    /* JADX INFO: renamed from: n */
    private static int m25518n(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e2) {
            Log.w("AutoDensity", "catch error: sku scale is not a number", e2);
            return 0;
        }
    }

    /* JADX INFO: renamed from: q */
    static boolean m25519q() {
        return (f87332zy == 0.0f && f39847q == 0.0f) ? false : true;
    }

    static float toq(Context context) {
        float f2 = f87332zy;
        if ((miuix.os.toq.f40719q || miuix.os.toq.f87879f7l8) && C7085q.m25604n(context) > 640) {
            f2 = f39847q;
        }
        return (miuix.os.toq.f40718n && miuix.os.zy.m26178g(context)) ? f39847q : f2;
    }

    static boolean zy() {
        return (f87330f7l8 == 0 && f39848y == 0) ? false : true;
    }
}
