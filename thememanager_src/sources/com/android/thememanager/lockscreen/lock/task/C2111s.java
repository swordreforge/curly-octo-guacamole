package com.android.thememanager.lockscreen.lock.task;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.android.thememanager.lockscreen.lock.task.s */
/* JADX INFO: compiled from: TaskManager.java */
/* JADX INFO: loaded from: classes2.dex */
class C2111s {

    /* JADX INFO: renamed from: n */
    private static AtomicInteger f12393n;

    /* JADX INFO: renamed from: q */
    private static final int f12394q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static volatile C2111s f60359toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final int f60360zy;

    /* JADX INFO: renamed from: k */
    private final ScheduledExecutorService f12395k = Executors.newScheduledThreadPool(f12394q, new k());

    /* JADX INFO: renamed from: com.android.thememanager.lockscreen.lock.task.s$k */
    /* JADX INFO: compiled from: TaskManager.java */
    class k implements ThreadFactory {
        k() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable r2) {
            return new Thread(r2, "KeyguardEditor #" + C2111s.f12393n.getAndIncrement());
        }
    }

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        f60360zy = iAvailableProcessors;
        f12394q = (iAvailableProcessors * 2) + 1;
        f12393n = new AtomicInteger(1);
    }

    private C2111s() {
    }

    public static C2111s zy() {
        if (f60359toq == null) {
            synchronized (C2111s.class) {
                if (f60359toq == null) {
                    f60359toq = new C2111s();
                }
            }
        }
        return f60359toq;
    }

    /* JADX INFO: renamed from: g */
    public <T> Future<T> m8076g(Callable<T> task) {
        return this.f12395k.submit(task);
    }

    /* JADX INFO: renamed from: n */
    public Future<?> m8077n(Runnable runnable, long delay) {
        return this.f12395k.schedule(runnable, delay, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: renamed from: q */
    public ScheduledExecutorService m8078q() {
        return this.f12395k;
    }

    public void toq(Runnable runnable) {
        this.f12395k.execute(runnable);
    }
}
