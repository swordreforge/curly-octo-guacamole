package androidx.core.net;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import zy.InterfaceC7830i;
import zy.dd;
import zy.hyr;
import zy.lrht;
import zy.lvui;
import zy.uv6;

/* JADX INFO: renamed from: androidx.core.net.k */
/* JADX INFO: compiled from: ConnectivityManagerCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0574k {

    /* JADX INFO: renamed from: k */
    public static final int f3694k = 1;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final int f50533toq = 2;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final int f50534zy = 3;

    /* JADX INFO: renamed from: androidx.core.net.k$k */
    /* JADX INFO: compiled from: ConnectivityManagerCompat.java */
    @hyr(16)
    static class k {
        private k() {
        }

        @lrht("android.permission.ACCESS_NETWORK_STATE")
        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static boolean m2698k(ConnectivityManager connectivityManager) {
            return connectivityManager.isActiveNetworkMetered();
        }
    }

    /* JADX INFO: renamed from: androidx.core.net.k$toq */
    /* JADX INFO: compiled from: ConnectivityManagerCompat.java */
    @hyr(24)
    static class toq {
        private toq() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static int m2699k(ConnectivityManager connectivityManager) {
            return connectivityManager.getRestrictBackgroundStatus();
        }
    }

    /* JADX INFO: renamed from: androidx.core.net.k$zy */
    /* JADX INFO: compiled from: ConnectivityManagerCompat.java */
    @Retention(RetentionPolicy.SOURCE)
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public @interface zy {
    }

    private C0574k() {
    }

    @lrht("android.permission.ACCESS_NETWORK_STATE")
    @SuppressLint({"ReferencesDeprecated"})
    @dd
    /* JADX INFO: renamed from: k */
    public static NetworkInfo m2697k(@lvui ConnectivityManager connectivityManager, @lvui Intent intent) {
        NetworkInfo networkInfo = (NetworkInfo) intent.getParcelableExtra("networkInfo");
        if (networkInfo != null) {
            return connectivityManager.getNetworkInfo(networkInfo.getType());
        }
        return null;
    }

    public static int toq(@lvui ConnectivityManager connectivityManager) {
        return toq.m2699k(connectivityManager);
    }

    @lrht("android.permission.ACCESS_NETWORK_STATE")
    public static boolean zy(@lvui ConnectivityManager connectivityManager) {
        return k.m2698k(connectivityManager);
    }
}
