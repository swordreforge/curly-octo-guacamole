package com.xiaomi.onetrack.p009a.p010a;

import android.os.Handler;
import android.os.HandlerThread;
import com.xiaomi.onetrack.util.C5804p;

/* JADX INFO: renamed from: com.xiaomi.onetrack.a.a.a */
/* JADX INFO: loaded from: classes3.dex */
public class C5676a {

    /* JADX INFO: renamed from: a */
    private static final String f31592a = "AdMonitorDbExecutor";

    /* JADX INFO: renamed from: b */
    private static String f31593b = "onetrack_ad_monitor_db";

    /* JADX INFO: renamed from: c */
    private static Handler f31594c;

    /* JADX INFO: renamed from: a */
    private static void m19660a() {
        if (f31594c == null) {
            synchronized (C5676a.class) {
                if (f31594c == null) {
                    HandlerThread handlerThread = new HandlerThread(f31593b);
                    handlerThread.start();
                    f31594c = new Handler(handlerThread.getLooper());
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m19661a(Runnable runnable) {
        m19660a();
        f31594c.post(runnable);
    }

    /* JADX INFO: renamed from: a */
    public static void m19662a(Runnable runnable, long j2) {
        try {
            m19660a();
            f31594c.postDelayed(runnable, j2);
        } catch (Throwable th) {
            C5804p.m20347b(f31592a, th.getMessage());
        }
    }
}
