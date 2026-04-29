package com.android.thememanager.lockscreen.lock.task;

import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/* JADX INFO: compiled from: BatchTask.java */
/* JADX INFO: loaded from: classes2.dex */
public class zy extends C2112y {

    /* JADX INFO: renamed from: q */
    private static final String f12399q = "Task.BatchTask";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final ArrayList<Runnable> f60362zy;

    zy(Runnable... tasks) {
        if (tasks == null) {
            this.f60362zy = new ArrayList<>();
        } else {
            this.f60362zy = new ArrayList<>(Arrays.asList(tasks));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m8083p(Void r1, Throwable th) {
        if (th != null) {
            Log.e(f12399q, "BatchTask.run", th);
        }
    }

    /* JADX INFO: renamed from: s */
    public zy m8085s(Runnable runnable) {
        this.f60362zy.add(runnable);
        return this;
    }

    public void x2(final Consumer<Throwable> consumer) {
        int size = this.f60362zy.size();
        CompletableFuture[] completableFutureArr = new CompletableFuture[size];
        for (int i2 = 0; i2 < size; i2++) {
            completableFutureArr[i2] = CompletableFuture.runAsync(this.f60362zy.get(i2), this.f12398k);
        }
        if (consumer == null) {
            CompletableFuture.allOf(completableFutureArr).whenCompleteAsync(new BiConsumer() { // from class: com.android.thememanager.lockscreen.lock.task.k
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    zy.m8083p((Void) obj, (Throwable) obj2);
                }
            }, this.f60361toq);
        } else {
            CompletableFuture.allOf(completableFutureArr).whenCompleteAsync(new BiConsumer() { // from class: com.android.thememanager.lockscreen.lock.task.toq
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    consumer.accept((Throwable) obj2);
                }
            }, this.f60361toq);
        }
    }
}
