package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;

/* JADX INFO: renamed from: com.xiaomi.mipush.sdk.q */
/* JADX INFO: loaded from: classes3.dex */
public class C5662q {

    /* JADX INFO: renamed from: k */
    private static volatile boolean f31425k = false;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static long f73196toq;

    public static void f7l8(Context context) {
        InterfaceC5654k interfaceC5654kM19441q = C5648f.m19438n(context).m19441q(hyr.ASSEMBLE_PUSH_COS);
        if (interfaceC5654kM19441q != null) {
            com.xiaomi.channel.commonutils.logger.zy.kja0("ASSEMBLE_PUSH :  register cos when network change!");
            interfaceC5654kM19441q.toq();
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m19542g(Context context, String str) {
    }

    /* JADX INFO: renamed from: k */
    public static void m19543k(Intent intent) {
        uv6.qrj(intent);
    }

    /* JADX INFO: renamed from: n */
    public static void m19544n(Context context, String str) {
    }

    /* JADX INFO: renamed from: q */
    public static boolean m19545q(Context context) {
        return uv6.kja0(context);
    }

    /* JADX INFO: renamed from: s */
    public static void m19546s(Context context, String str) {
        uv6.ld6(context, hyr.ASSEMBLE_PUSH_COS, str);
    }

    public static void toq(Context context) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (zy()) {
            long j2 = f73196toq;
            if (j2 <= 0 || j2 + 300000 <= jElapsedRealtime) {
                f73196toq = jElapsedRealtime;
                f7l8(context);
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public static synchronized void m19547y(boolean z2) {
        f31425k = z2;
    }

    public static boolean zy() {
        return f31425k;
    }
}
