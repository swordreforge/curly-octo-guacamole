package androidx.core.os;

import android.annotation.SuppressLint;
import android.os.Process;
import android.os.UserHandle;
import java.lang.reflect.Method;
import zy.hyr;

/* JADX INFO: compiled from: ProcessCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class fn3e {

    /* JADX INFO: renamed from: androidx.core.os.fn3e$k */
    /* JADX INFO: compiled from: ProcessCompat.java */
    @hyr(16)
    static class C0578k {

        /* JADX INFO: renamed from: k */
        private static final Object f3701k = new Object();

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private static Method f50538toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private static boolean f50539zy;

        private C0578k() {
        }

        @SuppressLint({"PrivateApi"})
        /* JADX INFO: renamed from: k */
        static boolean m2717k(int i2) {
            try {
                synchronized (f3701k) {
                    if (!f50539zy) {
                        f50539zy = true;
                        f50538toq = Class.forName("android.os.UserId").getDeclaredMethod("isApp", Integer.TYPE);
                    }
                }
                Method method = f50538toq;
                if (method != null) {
                    Boolean bool = (Boolean) method.invoke(null, Integer.valueOf(i2));
                    if (bool != null) {
                        return bool.booleanValue();
                    }
                    throw new NullPointerException();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            return true;
        }
    }

    /* JADX INFO: compiled from: ProcessCompat.java */
    @hyr(17)
    static class toq {

        /* JADX INFO: renamed from: k */
        private static final Object f3702k = new Object();

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private static Method f50540toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private static boolean f50541zy;

        private toq() {
        }

        @SuppressLint({"DiscouragedPrivateApi"})
        /* JADX INFO: renamed from: k */
        static boolean m2718k(int i2) {
            try {
                synchronized (f3702k) {
                    if (!f50541zy) {
                        f50541zy = true;
                        f50540toq = UserHandle.class.getDeclaredMethod("isApp", Integer.TYPE);
                    }
                }
                Method method = f50540toq;
                if (method != null) {
                    Boolean bool = (Boolean) method.invoke(null, Integer.valueOf(i2));
                    if (bool != null) {
                        return bool.booleanValue();
                    }
                    throw new NullPointerException();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            return true;
        }
    }

    /* JADX INFO: compiled from: ProcessCompat.java */
    @hyr(24)
    static class zy {
        private zy() {
        }

        /* JADX INFO: renamed from: k */
        static boolean m2719k(int i2) {
            return Process.isApplicationUid(i2);
        }
    }

    private fn3e() {
    }

    /* JADX INFO: renamed from: k */
    public static boolean m2716k(int i2) {
        return zy.m2719k(i2);
    }
}
