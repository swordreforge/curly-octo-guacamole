package com.android.thememanager.lockscreen.lock.task;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

/* JADX INFO: renamed from: com.android.thememanager.lockscreen.lock.task.q */
/* JADX INFO: compiled from: CombinedTask.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2110q<T1, T2> extends C2112y {

    /* JADX INFO: renamed from: q */
    private Supplier<T2> f12392q;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private Supplier<T1> f60358zy;

    C2110q(Supplier<T1> supplier1, Supplier<T2> supplier2) {
        this.f60358zy = supplier1;
        this.f12392q = supplier2;
    }

    public void f7l8(BiConsumer<T1, T2> consumer) {
        CompletableFuture.supplyAsync(this.f60358zy, this.f12398k).thenAcceptBothAsync((CompletionStage) CompletableFuture.supplyAsync(this.f12392q, this.f12398k), (BiConsumer) consumer, this.f60361toq);
    }
}
