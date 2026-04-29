package com.market.sdk;

import com.xiaomi.mipush.sdk.C5658n;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.market.sdk.t */
/* JADX INFO: compiled from: ThreadExecutors.java */
/* JADX INFO: loaded from: classes3.dex */
public class C5000t {

    /* JADX INFO: renamed from: k */
    private static final String f28168k = "ThreadExecutors";

    /* JADX INFO: renamed from: com.market.sdk.t$k */
    /* JADX INFO: compiled from: ThreadExecutors.java */
    private static class k implements ThreadFactory {

        /* JADX INFO: renamed from: n */
        private static final AtomicInteger f28169n = new AtomicInteger(1);

        /* JADX INFO: renamed from: k */
        private final ThreadGroup f28170k;

        /* JADX INFO: renamed from: q */
        private final int f28171q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final AtomicInteger f68977toq = new AtomicInteger(1);

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final String f68978zy;

        public k(String str, int i2) {
            SecurityManager securityManager = System.getSecurityManager();
            this.f28170k = securityManager != null ? securityManager.getThreadGroup() : Thread.currentThread().getThreadGroup();
            this.f68978zy = "Po" + f28169n.getAndIncrement() + C5658n.f73185t8r + str + C5658n.f73185t8r;
            this.f28171q = i2;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(this.f28170k, runnable, this.f68978zy + this.f68977toq.getAndIncrement(), 0L);
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            int priority = thread.getPriority();
            int i2 = this.f28171q;
            if (priority != i2) {
                thread.setPriority(i2);
            }
            return thread;
        }
    }

    /* JADX INFO: renamed from: k */
    public static ThreadPoolExecutor m17400k(int i2, int i3, int i4, String str) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i2, i2, 60L, TimeUnit.SECONDS, new ArrayBlockingQueue(i3), new k(str, i4), new ThreadPoolExecutor.DiscardOldestPolicy());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    /* JADX INFO: renamed from: q */
    public static ThreadPoolExecutor m17401q(int i2, int i3, String str) {
        return m17400k(i2, i3, 2, str);
    }

    public static ThreadPoolExecutor toq(int i2, int i3, int i4, String str) {
        return new ThreadPoolExecutor(i2, i3, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new k(str, i4), new ThreadPoolExecutor.CallerRunsPolicy());
    }

    public static ThreadPoolExecutor zy(int i2, String str) {
        return toq(i2, i2, 5, str);
    }
}
