package com.android.thememanager.lockscreen.lock.task;

import android.os.Looper;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.function.Supplier;

/* JADX INFO: renamed from: com.android.thememanager.lockscreen.lock.task.y */
/* JADX INFO: compiled from: Task.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2112y {

    /* JADX INFO: renamed from: k */
    protected Executor f12398k = zy();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    protected Executor f60361toq = new C2109n(Looper.getMainLooper());

    protected C2112y() {
    }

    /* JADX INFO: renamed from: g */
    public static <T> Future<T> m8079g(Callable<T> task) {
        return C2111s.zy().m8076g(task);
    }

    /* JADX INFO: renamed from: k */
    public static zy m8080k(Runnable... tasks) {
        return new zy(tasks);
    }

    /* JADX INFO: renamed from: n */
    public static Future<?> m8081n(Runnable runnable, long delay) {
        return C2111s.zy().m8077n(runnable, delay);
    }

    /* JADX INFO: renamed from: q */
    public static void m8082q(Runnable runnable) {
        C2111s.zy().toq(runnable);
    }

    public static <T> f7l8<T> toq(Supplier<T> supplier) {
        return new f7l8<>(supplier);
    }

    public static ScheduledExecutorService zy() {
        return C2111s.zy().m8078q();
    }
}
