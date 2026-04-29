package com.xiaomi.onetrack.util;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.xiaomi.onetrack.util.i */
/* JADX INFO: loaded from: classes3.dex */
public class C5776i {

    /* JADX INFO: renamed from: a */
    private static ThreadPoolExecutor f32309a;

    /* JADX INFO: renamed from: b */
    private static int f32310b = Runtime.getRuntime().availableProcessors() + 1;

    static {
        int i2 = f32310b;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i2, i2, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        f32309a = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    /* JADX INFO: renamed from: a */
    public static void m20256a(Runnable runnable) {
        try {
            f32309a.execute(runnable);
        } catch (Throwable unused) {
        }
    }
}
