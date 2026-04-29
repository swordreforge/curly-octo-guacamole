package androidx.core.telephony;

import android.annotation.SuppressLint;
import android.os.Build;
import android.telephony.TelephonyManager;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import zy.InterfaceC7830i;
import zy.dd;
import zy.hyr;
import zy.lrht;
import zy.lvui;

/* JADX INFO: compiled from: TelephonyManagerCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class zy {

    /* JADX INFO: renamed from: k */
    private static Method f3799k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static Method f50574toq;

    /* JADX INFO: renamed from: androidx.core.telephony.zy$k */
    /* JADX INFO: compiled from: TelephonyManagerCompat.java */
    @hyr(23)
    private static class C0612k {
        private C0612k() {
        }

        @lrht("android.permission.READ_PHONE_STATE")
        @InterfaceC7830i
        @SuppressLint({"MissingPermission"})
        @dd
        /* JADX INFO: renamed from: k */
        static String m2845k(TelephonyManager telephonyManager, int i2) {
            return telephonyManager.getDeviceId(i2);
        }
    }

    /* JADX INFO: compiled from: TelephonyManagerCompat.java */
    @hyr(26)
    private static class toq {
        private toq() {
        }

        @lrht("android.permission.READ_PHONE_STATE")
        @InterfaceC7830i
        @SuppressLint({"MissingPermission"})
        @dd
        /* JADX INFO: renamed from: k */
        static String m2846k(TelephonyManager telephonyManager) {
            return telephonyManager.getImei();
        }
    }

    /* JADX INFO: renamed from: androidx.core.telephony.zy$zy, reason: collision with other inner class name */
    /* JADX INFO: compiled from: TelephonyManagerCompat.java */
    @hyr(30)
    private static class C7869zy {
        private C7869zy() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static int m2847k(TelephonyManager telephonyManager) {
            return telephonyManager.getSubscriptionId();
        }
    }

    private zy() {
    }

    @lrht("android.permission.READ_PHONE_STATE")
    @SuppressLint({"MissingPermission"})
    @dd
    /* JADX INFO: renamed from: k */
    public static String m2844k(@lvui TelephonyManager telephonyManager) {
        return toq.m2846k(telephonyManager);
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    public static int toq(@lvui TelephonyManager telephonyManager) {
        if (Build.VERSION.SDK_INT >= 30) {
            return C7869zy.m2847k(telephonyManager);
        }
        try {
            if (f50574toq == null) {
                Method declaredMethod = TelephonyManager.class.getDeclaredMethod("getSubId", new Class[0]);
                f50574toq = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            Integer num = (Integer) f50574toq.invoke(telephonyManager, new Object[0]);
            if (num == null || num.intValue() == -1) {
                return Integer.MAX_VALUE;
            }
            return num.intValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return Integer.MAX_VALUE;
        }
    }
}
