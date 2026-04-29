package androidx.core.app;

import android.app.Service;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import zy.InterfaceC7830i;
import zy.uv6;

/* JADX INFO: renamed from: androidx.core.app.u */
/* JADX INFO: compiled from: ServiceCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0457u {

    /* JADX INFO: renamed from: k */
    public static final int f3255k = 1;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final int f50128toq = 1;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final int f50129zy = 2;

    /* JADX INFO: renamed from: androidx.core.app.u$k */
    /* JADX INFO: compiled from: ServiceCompat.java */
    @zy.hyr(24)
    static class k {
        private k() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static void m1999k(Service service, int i2) {
            service.stopForeground(i2);
        }
    }

    /* JADX INFO: renamed from: androidx.core.app.u$toq */
    /* JADX INFO: compiled from: ServiceCompat.java */
    @Retention(RetentionPolicy.SOURCE)
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public @interface toq {
    }

    private C0457u() {
    }

    /* JADX INFO: renamed from: k */
    public static void m1998k(@zy.lvui Service service, int i2) {
        k.m1999k(service, i2);
    }
}
