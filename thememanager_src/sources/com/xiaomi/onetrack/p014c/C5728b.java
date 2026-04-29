package com.xiaomi.onetrack.p014c;

import android.os.Handler;
import android.os.HandlerThread;
import com.xiaomi.onetrack.util.C5804p;

/* JADX INFO: renamed from: com.xiaomi.onetrack.c.b */
/* JADX INFO: loaded from: classes3.dex */
public class C5728b {

    /* JADX INFO: renamed from: a */
    private static final String f31983a = "DbExecutor";

    /* JADX INFO: renamed from: b */
    private static String f31984b = "onetrack_db";

    /* JADX INFO: renamed from: c */
    private static Handler f31985c;

    /* JADX INFO: renamed from: a */
    private static void m19939a() {
        if (f31985c == null) {
            synchronized (C5728b.class) {
                if (f31985c == null) {
                    HandlerThread handlerThread = new HandlerThread(f31984b);
                    handlerThread.start();
                    f31985c = new Handler(handlerThread.getLooper());
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m19940a(Runnable runnable) {
        try {
            m19939a();
            f31985c.post(runnable);
        } catch (Throwable th) {
            C5804p.m20347b(f31983a, th.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m19941a(Runnable runnable, long j2) {
        try {
            m19939a();
            f31985c.postDelayed(runnable, j2);
        } catch (Throwable th) {
            C5804p.m20347b(f31983a, th.getMessage());
        }
    }
}
