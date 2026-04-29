package com.bumptech.glide.util;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import zy.lvui;
import zy.yz;

/* JADX INFO: renamed from: com.bumptech.glide.util.g */
/* JADX INFO: compiled from: Executors.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C3199g {

    /* JADX INFO: renamed from: k */
    private static final Executor f19070k = new k();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final Executor f63070toq = new toq();

    /* JADX INFO: renamed from: com.bumptech.glide.util.g$k */
    /* JADX INFO: compiled from: Executors.java */
    class k implements Executor {
        k() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(@lvui Runnable runnable) {
            kja0.fu4(runnable);
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.util.g$toq */
    /* JADX INFO: compiled from: Executors.java */
    class toq implements Executor {
        toq() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(@lvui Runnable runnable) {
            runnable.run();
        }
    }

    private C3199g() {
    }

    /* JADX INFO: renamed from: k */
    public static Executor m11219k() {
        return f63070toq;
    }

    public static Executor toq() {
        return f19070k;
    }

    @yz
    public static void zy(ExecutorService executorService) {
        executorService.shutdownNow();
        try {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            if (executorService.awaitTermination(5L, timeUnit)) {
                return;
            }
            executorService.shutdownNow();
            if (executorService.awaitTermination(5L, timeUnit)) {
            } else {
                throw new RuntimeException("Failed to shutdown");
            }
        } catch (InterruptedException e2) {
            executorService.shutdownNow();
            Thread.currentThread().interrupt();
            throw new RuntimeException(e2);
        }
    }
}
