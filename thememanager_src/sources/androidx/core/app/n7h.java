package androidx.core.app;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;
import zy.InterfaceC7830i;

/* JADX INFO: compiled from: AppOpsManagerCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class n7h {

    /* JADX INFO: renamed from: k */
    public static final int f3224k = 0;

    /* JADX INFO: renamed from: q */
    public static final int f3225q = 3;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final int f50117toq = 1;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final int f50118zy = 2;

    /* JADX INFO: renamed from: androidx.core.app.n7h$k */
    /* JADX INFO: compiled from: AppOpsManagerCompat.java */
    @zy.hyr(19)
    static class C0441k {
        private C0441k() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static int m1945k(AppOpsManager appOpsManager, String str, int i2, String str2) {
            return appOpsManager.noteOp(str, i2, str2);
        }

        @InterfaceC7830i
        static int toq(AppOpsManager appOpsManager, String str, int i2, String str2) {
            return appOpsManager.noteOpNoThrow(str, i2, str2);
        }
    }

    /* JADX INFO: compiled from: AppOpsManagerCompat.java */
    @zy.hyr(23)
    static class toq {
        private toq() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static <T> T m1946k(Context context, Class<T> cls) {
            return (T) context.getSystemService(cls);
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: q */
        static String m1947q(String str) {
            return AppOpsManager.permissionToOp(str);
        }

        @InterfaceC7830i
        static int toq(AppOpsManager appOpsManager, String str, String str2) {
            return appOpsManager.noteProxyOp(str, str2);
        }

        @InterfaceC7830i
        static int zy(AppOpsManager appOpsManager, String str, String str2) {
            return appOpsManager.noteProxyOpNoThrow(str, str2);
        }
    }

    /* JADX INFO: compiled from: AppOpsManagerCompat.java */
    @zy.hyr(29)
    static class zy {
        private zy() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static int m1948k(@zy.dd AppOpsManager appOpsManager, @zy.lvui String str, int i2, @zy.lvui String str2) {
            if (appOpsManager == null) {
                return 1;
            }
            return appOpsManager.checkOpNoThrow(str, i2, str2);
        }

        @InterfaceC7830i
        @zy.lvui
        static String toq(@zy.lvui Context context) {
            return context.getOpPackageName();
        }

        @InterfaceC7830i
        @zy.dd
        static AppOpsManager zy(@zy.lvui Context context) {
            return (AppOpsManager) context.getSystemService(AppOpsManager.class);
        }
    }

    private n7h() {
    }

    @zy.dd
    /* JADX INFO: renamed from: g */
    public static String m1941g(@zy.lvui String str) {
        return toq.m1947q(str);
    }

    /* JADX INFO: renamed from: k */
    public static int m1942k(@zy.lvui Context context, int i2, @zy.lvui String str, @zy.lvui String str2) {
        if (Build.VERSION.SDK_INT < 29) {
            return m1943n(context, str, str2);
        }
        AppOpsManager appOpsManagerZy = zy.zy(context);
        int iM1948k = zy.m1948k(appOpsManagerZy, str, Binder.getCallingUid(), str2);
        return iM1948k != 0 ? iM1948k : zy.m1948k(appOpsManagerZy, str, i2, zy.toq(context));
    }

    /* JADX INFO: renamed from: n */
    public static int m1943n(@zy.lvui Context context, @zy.lvui String str, @zy.lvui String str2) {
        return toq.zy((AppOpsManager) toq.m1946k(context, AppOpsManager.class), str, str2);
    }

    /* JADX INFO: renamed from: q */
    public static int m1944q(@zy.lvui Context context, @zy.lvui String str, @zy.lvui String str2) {
        return toq.toq((AppOpsManager) toq.m1946k(context, AppOpsManager.class), str, str2);
    }

    public static int toq(@zy.lvui Context context, @zy.lvui String str, int i2, @zy.lvui String str2) {
        return C0441k.m1945k((AppOpsManager) context.getSystemService("appops"), str, i2, str2);
    }

    public static int zy(@zy.lvui Context context, @zy.lvui String str, int i2, @zy.lvui String str2) {
        return C0441k.toq((AppOpsManager) context.getSystemService("appops"), str, i2, str2);
    }
}
