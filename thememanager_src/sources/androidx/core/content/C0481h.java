package androidx.core.content;

import android.content.Context;
import android.os.Binder;
import android.os.Process;
import androidx.core.util.C0642s;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import zy.dd;
import zy.lvui;
import zy.uv6;

/* JADX INFO: renamed from: androidx.core.content.h */
/* JADX INFO: compiled from: PermissionChecker.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0481h {

    /* JADX INFO: renamed from: k */
    public static final int f3440k = 0;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final int f50351toq = -1;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final int f50352zy = -2;

    /* JADX INFO: renamed from: androidx.core.content.h$k */
    /* JADX INFO: compiled from: PermissionChecker.java */
    @Retention(RetentionPolicy.SOURCE)
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public @interface k {
    }

    private C0481h() {
    }

    /* JADX INFO: renamed from: k */
    public static int m2177k(@lvui Context context, @lvui String str) {
        return zy(context, str, Binder.getCallingPid(), Binder.getCallingUid(), Binder.getCallingPid() == Process.myPid() ? context.getPackageName() : null);
    }

    /* JADX INFO: renamed from: q */
    public static int m2178q(@lvui Context context, @lvui String str) {
        return zy(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }

    public static int toq(@lvui Context context, @lvui String str, @dd String str2) {
        if (Binder.getCallingPid() == Process.myPid()) {
            return -1;
        }
        return zy(context, str, Binder.getCallingPid(), Binder.getCallingUid(), str2);
    }

    public static int zy(@lvui Context context, @lvui String str, int i2, int i3, @dd String str2) {
        if (context.checkPermission(str, i2, i3) == -1) {
            return -1;
        }
        String strM1941g = androidx.core.app.n7h.m1941g(str);
        if (strM1941g == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i3);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        return (Process.myUid() == i3 && C0642s.m2985k(context.getPackageName(), str2) ? androidx.core.app.n7h.m1942k(context, i3, strM1941g, str2) : androidx.core.app.n7h.m1943n(context, strM1941g, str2)) == 0 ? 0 : -2;
    }
}
