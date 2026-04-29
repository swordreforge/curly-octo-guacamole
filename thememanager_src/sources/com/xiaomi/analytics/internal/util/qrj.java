package com.xiaomi.analytics.internal.util;

import android.util.Log;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: TaskRunner.java */
/* JADX INFO: loaded from: classes3.dex */
public class qrj {

    /* JADX INFO: renamed from: k */
    private static final String f31214k = "TaskRunner";

    /* JADX INFO: renamed from: q */
    public static final ExecutorService f31215q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static ThreadPoolExecutor f73065toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static int f73066zy = Runtime.getRuntime().availableProcessors();

    static {
        int i2 = f73066zy;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i2, i2, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        f73065toq = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f31215q = Executors.newSingleThreadExecutor();
    }

    /* JADX INFO: renamed from: k */
    public static void m19254k(Runnable runnable) {
        try {
            f73065toq.execute(runnable);
        } catch (Exception e2) {
            Log.e(C5609k.m19240k(f31214k), "execute e", e2);
        }
    }
}
