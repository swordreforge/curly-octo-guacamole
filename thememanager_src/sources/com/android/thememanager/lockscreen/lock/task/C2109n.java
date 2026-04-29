package com.android.thememanager.lockscreen.lock.task;

import android.os.Handler;
import android.os.Looper;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.android.thememanager.lockscreen.lock.task.n */
/* JADX INFO: compiled from: LooperExecutor.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2109n extends AbstractExecutorService {

    /* JADX INFO: renamed from: k */
    private final Handler f12391k;

    public C2109n(Looper looper) {
        this.f12391k = new Handler(looper);
    }

    @Override // java.util.concurrent.ExecutorService
    @Deprecated
    public boolean awaitTermination(long l2, TimeUnit timeUnit) throws InterruptedException {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        if (this.f12391k.getLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            this.f12391k.post(runnable);
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return false;
    }

    /* JADX INFO: renamed from: k */
    public Handler m8074k() {
        return this.f12391k;
    }

    @Override // java.util.concurrent.ExecutorService
    @Deprecated
    public void shutdown() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    @Deprecated
    public List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException();
    }
}
