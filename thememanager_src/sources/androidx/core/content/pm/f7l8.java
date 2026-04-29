package androidx.core.content.pm;

import android.annotation.SuppressLint;
import android.content.pm.PermissionInfo;
import android.os.Build;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import zy.InterfaceC7830i;
import zy.hyr;
import zy.lvui;
import zy.uv6;

/* JADX INFO: compiled from: PermissionInfoCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class f7l8 {

    /* JADX INFO: renamed from: androidx.core.content.pm.f7l8$k */
    /* JADX INFO: compiled from: PermissionInfoCompat.java */
    @hyr(28)
    static class C0487k {
        private C0487k() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static int m2191k(PermissionInfo permissionInfo) {
            return permissionInfo.getProtection();
        }

        @InterfaceC7830i
        static int toq(PermissionInfo permissionInfo) {
            return permissionInfo.getProtectionFlags();
        }
    }

    /* JADX INFO: compiled from: PermissionInfoCompat.java */
    @Retention(RetentionPolicy.SOURCE)
    @uv6({uv6.EnumC7844k.LIBRARY})
    public @interface toq {
    }

    /* JADX INFO: compiled from: PermissionInfoCompat.java */
    @SuppressLint({"UniqueConstants"})
    @uv6({uv6.EnumC7844k.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    public @interface zy {
    }

    private f7l8() {
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: k */
    public static int m2190k(@lvui PermissionInfo permissionInfo) {
        return Build.VERSION.SDK_INT >= 28 ? C0487k.m2191k(permissionInfo) : permissionInfo.protectionLevel & 15;
    }

    @SuppressLint({"WrongConstant"})
    public static int toq(@lvui PermissionInfo permissionInfo) {
        return Build.VERSION.SDK_INT >= 28 ? C0487k.toq(permissionInfo) : permissionInfo.protectionLevel & (-16);
    }
}
