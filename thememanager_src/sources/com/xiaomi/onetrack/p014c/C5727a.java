package com.xiaomi.onetrack.p014c;

import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;

/* JADX INFO: renamed from: com.xiaomi.onetrack.c.a */
/* JADX INFO: loaded from: classes3.dex */
public class C5727a {

    /* JADX INFO: renamed from: a */
    private static final String f31980a = "BroadcastExecutor";

    /* JADX INFO: renamed from: b */
    private static String f31981b = "onetrack_broadcast";

    /* JADX INFO: renamed from: c */
    private static Handler f31982c;

    /* JADX INFO: renamed from: a */
    public static void m19937a() {
        if (f31982c == null) {
            synchronized (C5727a.class) {
                if (f31982c == null) {
                    Log.d(f31980a, "initIfNeeded : " + Thread.currentThread().getId());
                    HandlerThread handlerThread = new HandlerThread(f31981b);
                    handlerThread.start();
                    f31982c = new Handler(handlerThread.getLooper());
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m19938a(Runnable runnable) {
        Log.d(f31980a, "BroadcastExecutor : " + Thread.currentThread().getId());
        m19937a();
        f31982c.post(runnable);
    }
}
