package androidx.core.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import zy.InterfaceC7830i;

/* JADX INFO: renamed from: androidx.core.app.h */
/* JADX INFO: compiled from: BundleCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0432h {

    /* JADX INFO: renamed from: androidx.core.app.h$k */
    /* JADX INFO: compiled from: BundleCompat.java */
    @zy.hyr(18)
    static class k {
        private k() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static IBinder m1887k(Bundle bundle, String str) {
            return bundle.getBinder(str);
        }

        @InterfaceC7830i
        static void toq(Bundle bundle, String str, IBinder iBinder) {
            bundle.putBinder(str, iBinder);
        }
    }

    /* JADX INFO: renamed from: androidx.core.app.h$toq */
    /* JADX INFO: compiled from: BundleCompat.java */
    @SuppressLint({"BanUncheckedReflection"})
    static class toq {

        /* JADX INFO: renamed from: k */
        private static final String f3179k = "BundleCompatBaseImpl";

        /* JADX INFO: renamed from: n */
        private static boolean f3180n;

        /* JADX INFO: renamed from: q */
        private static Method f3181q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private static Method f50070toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private static boolean f50071zy;

        private toq() {
        }

        /* JADX INFO: renamed from: k */
        public static IBinder m1888k(Bundle bundle, String str) {
            if (!f50071zy) {
                try {
                    Method method = Bundle.class.getMethod("getIBinder", String.class);
                    f50070toq = method;
                    method.setAccessible(true);
                } catch (NoSuchMethodException e2) {
                    Log.i(f3179k, "Failed to retrieve getIBinder method", e2);
                }
                f50071zy = true;
            }
            Method method2 = f50070toq;
            if (method2 != null) {
                try {
                    return (IBinder) method2.invoke(bundle, str);
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e3) {
                    Log.i(f3179k, "Failed to invoke getIBinder via reflection", e3);
                    f50070toq = null;
                }
            }
            return null;
        }

        public static void toq(Bundle bundle, String str, IBinder iBinder) {
            if (!f3180n) {
                try {
                    Method method = Bundle.class.getMethod("putIBinder", String.class, IBinder.class);
                    f3181q = method;
                    method.setAccessible(true);
                } catch (NoSuchMethodException e2) {
                    Log.i(f3179k, "Failed to retrieve putIBinder method", e2);
                }
                f3180n = true;
            }
            Method method2 = f3181q;
            if (method2 != null) {
                try {
                    method2.invoke(bundle, str, iBinder);
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e3) {
                    Log.i(f3179k, "Failed to invoke putIBinder via reflection", e3);
                    f3181q = null;
                }
            }
        }
    }

    private C0432h() {
    }

    @zy.dd
    /* JADX INFO: renamed from: k */
    public static IBinder m1886k(@zy.lvui Bundle bundle, @zy.dd String str) {
        return k.m1887k(bundle, str);
    }

    public static void toq(@zy.lvui Bundle bundle, @zy.dd String str, @zy.dd IBinder iBinder) {
        k.toq(bundle, str, iBinder);
    }
}
