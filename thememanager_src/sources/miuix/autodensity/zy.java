package miuix.autodensity;

import android.text.TextUtils;
import android.util.Log;
import miuix.core.util.SystemProperties;

/* JADX INFO: compiled from: DebugUtil.java */
/* JADX INFO: loaded from: classes3.dex */
public class zy {

    /* JADX INFO: renamed from: k */
    static final String f39849k = "AutoDensity";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static volatile float f87333toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static String f87334zy;

    /* JADX INFO: renamed from: k */
    public static float m25520k() {
        return f87333toq;
    }

    /* JADX INFO: renamed from: q */
    public static void m25521q(String str) {
        if (f87333toq < 0.0f || TextUtils.isEmpty(f87334zy)) {
            return;
        }
        Log.d(f39849k, str);
    }

    public static void toq() {
        String str;
        try {
            str = SystemProperties.get("log.tag.autodensity.debug.enable");
            f87334zy = str;
            if (str == null) {
                str = "0";
            }
        } catch (Exception e2) {
            Log.i(f39849k, "can not access property log.tag.autodensity.enable, undebugable", e2);
            str = "";
        }
        Log.d(f39849k, "autodensity debugEnable = " + str);
        try {
            f87333toq = Float.parseFloat(str);
        } catch (NumberFormatException unused) {
            f87333toq = 0.0f;
        }
    }

    public static boolean zy() {
        return f87333toq < 0.0f;
    }
}
