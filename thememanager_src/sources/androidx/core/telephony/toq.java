package androidx.core.telephony;

import android.os.Build;
import android.telephony.SubscriptionManager;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import zy.InterfaceC7830i;
import zy.hyr;

/* JADX INFO: compiled from: SubscriptionManagerCompat.java */
/* JADX INFO: loaded from: classes.dex */
@hyr(22)
public class toq {

    /* JADX INFO: renamed from: k */
    private static Method f3798k;

    /* JADX INFO: renamed from: androidx.core.telephony.toq$k */
    /* JADX INFO: compiled from: SubscriptionManagerCompat.java */
    @hyr(29)
    private static class C0611k {
        private C0611k() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static int m2843k(int i2) {
            return SubscriptionManager.getSlotIndex(i2);
        }
    }

    private toq() {
    }

    /* JADX INFO: renamed from: k */
    public static int m2842k(int i2) {
        if (i2 == -1) {
            return -1;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return C0611k.m2843k(i2);
        }
        try {
            if (f3798k == null) {
                Method declaredMethod = SubscriptionManager.class.getDeclaredMethod("getSlotIndex", Integer.TYPE);
                f3798k = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            Integer num = (Integer) f3798k.invoke(null, Integer.valueOf(i2));
            if (num != null) {
                return num.intValue();
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        return -1;
    }
}
