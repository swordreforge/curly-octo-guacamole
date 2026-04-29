package miuix.device;

import android.util.Log;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: LiteSystemProperties.java */
/* JADX INFO: loaded from: classes3.dex */
class toq {

    /* JADX INFO: renamed from: k */
    private static final String f39997k = "LiteSystemProperties";

    /* JADX INFO: renamed from: q */
    private static Method f39998q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static Class f87460toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static Method f87461zy;

    static {
        try {
            f87460toq = Class.forName("android.os.SystemProperties");
        } catch (Exception unused) {
            f87460toq = null;
        }
        Class cls = f87460toq;
        if (cls != null) {
            try {
                Method method = cls.getMethod("get", String.class, String.class);
                f87461zy = method;
                method.setAccessible(true);
            } catch (Exception unused2) {
            }
            try {
                Method method2 = f87460toq.getMethod("getInt", String.class, Integer.TYPE);
                f39998q = method2;
                method2.setAccessible(true);
            } catch (Exception unused3) {
            }
        }
    }

    toq() {
    }

    /* JADX INFO: renamed from: k */
    public static String m25713k(String str) {
        return toq(str, "");
    }

    public static String toq(String str, String str2) {
        Method method = f87461zy;
        if (method != null) {
            try {
                return (String) method.invoke(null, str, str2);
            } catch (Exception e2) {
                Log.e(f39997k, "key: " + str + " detail:" + e2);
            }
        }
        return str2;
    }

    public static int zy(String str, int i2) {
        Method method = f39998q;
        if (method != null) {
            try {
                return ((Integer) method.invoke(null, str, Integer.valueOf(i2))).intValue();
            } catch (Exception e2) {
                Log.e(f39997k, "key: " + str + " detail:" + e2);
            }
        }
        return i2;
    }
}
