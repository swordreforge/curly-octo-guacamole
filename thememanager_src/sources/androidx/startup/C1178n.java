package androidx.startup;

import android.util.Log;
import zy.dd;
import zy.lvui;
import zy.uv6;

/* JADX INFO: renamed from: androidx.startup.n */
/* JADX INFO: compiled from: StartupLogger.java */
/* JADX INFO: loaded from: classes.dex */
@uv6({uv6.EnumC7844k.LIBRARY})
public final class C1178n {

    /* JADX INFO: renamed from: k */
    private static final String f6364k = "StartupLogger";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    static final boolean f52468toq = false;

    private C1178n() {
    }

    /* JADX INFO: renamed from: k */
    public static void m5288k(@lvui String str, @dd Throwable th) {
        Log.e(f6364k, str, th);
    }

    public static void toq(@lvui String str) {
        Log.i(f6364k, str);
    }
}
