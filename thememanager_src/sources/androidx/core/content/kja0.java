package androidx.core.content;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import androidx.concurrent.futures.C0258n;
import androidx.core.os.mcp;
import com.google.common.util.concurrent.InterfaceFutureC4792c;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.concurrent.Executors;
import zy.dd;
import zy.hyr;
import zy.lvui;
import zy.uv6;

/* JADX INFO: compiled from: PackageManagerCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class kja0 {

    /* JADX INFO: renamed from: k */
    @uv6({uv6.EnumC7844k.LIBRARY})
    public static final String f3445k = "PackageManagerCompat";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f50355toq = "android.intent.action.AUTO_REVOKE_PERMISSIONS";

    /* JADX INFO: renamed from: androidx.core.content.kja0$k */
    /* JADX INFO: compiled from: PackageManagerCompat.java */
    @hyr(30)
    private static class C0484k {
        private C0484k() {
        }

        /* JADX INFO: renamed from: k */
        static boolean m2182k(@lvui Context context) {
            return !context.getPackageManager().isAutoRevokeWhitelisted();
        }
    }

    /* JADX INFO: compiled from: PackageManagerCompat.java */
    @Retention(RetentionPolicy.SOURCE)
    @uv6({uv6.EnumC7844k.LIBRARY})
    public @interface toq {
    }

    private kja0() {
    }

    @uv6({uv6.EnumC7844k.LIBRARY})
    /* JADX INFO: renamed from: k */
    public static boolean m2181k(@lvui PackageManager packageManager) {
        int i2 = Build.VERSION.SDK_INT;
        boolean z2 = i2 >= 30;
        boolean z3 = i2 < 30;
        boolean z5 = toq(packageManager) != null;
        if (z2) {
            return true;
        }
        return z3 && z5;
    }

    @dd
    @uv6({uv6.EnumC7844k.LIBRARY})
    public static String toq(@lvui PackageManager packageManager) {
        String str = null;
        Iterator<ResolveInfo> it = packageManager.queryIntentActivities(new Intent(f50355toq).setData(Uri.fromParts("package", "com.example", null)), 0).iterator();
        while (it.hasNext()) {
            String str2 = it.next().activityInfo.packageName;
            if (packageManager.checkPermission("android.permission.PACKAGE_VERIFICATION_AGENT", str2) == 0) {
                if (str != null) {
                    return str;
                }
                str = str2;
            }
        }
        return str;
    }

    @lvui
    public static InterfaceFutureC4792c<Integer> zy(@lvui Context context) {
        C0258n<Integer> c0258nFu4 = C0258n.fu4();
        if (!mcp.m2737k(context)) {
            c0258nFu4.t8r(0);
            Log.e(f3445k, "User is in locked direct boot mode");
            return c0258nFu4;
        }
        if (!m2181k(context.getPackageManager())) {
            c0258nFu4.t8r(1);
            return c0258nFu4;
        }
        int i2 = context.getApplicationInfo().targetSdkVersion;
        if (i2 < 30) {
            c0258nFu4.t8r(0);
            Log.e(f3445k, "Target SDK version below API 30");
            return c0258nFu4;
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 31) {
            if (C0484k.m2182k(context)) {
                c0258nFu4.t8r(Integer.valueOf(i2 >= 31 ? 5 : 4));
            } else {
                c0258nFu4.t8r(2);
            }
            return c0258nFu4;
        }
        if (i3 == 30) {
            c0258nFu4.t8r(Integer.valueOf(C0484k.m2182k(context) ? 4 : 2));
            return c0258nFu4;
        }
        final UnusedAppRestrictionsBackportServiceConnection unusedAppRestrictionsBackportServiceConnection = new UnusedAppRestrictionsBackportServiceConnection(context);
        c0258nFu4.n7h(new Runnable() { // from class: androidx.core.content.qrj
            @Override // java.lang.Runnable
            public final void run() {
                unusedAppRestrictionsBackportServiceConnection.toq();
            }
        }, Executors.newSingleThreadExecutor());
        unusedAppRestrictionsBackportServiceConnection.m2171k(c0258nFu4);
        return c0258nFu4;
    }
}
