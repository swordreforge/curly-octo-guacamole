package com.android.thememanager.lockscreen.lock.task;

import android.util.Log;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

/* JADX INFO: compiled from: SingleTask.java */
/* JADX INFO: loaded from: classes2.dex */
public class f7l8<T> extends C2112y {

    /* JADX INFO: renamed from: q */
    private static final String f12389q = "Task.SingleTask";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private Supplier<T> f60357zy;

    f7l8(Supplier<T> supplier) {
        this.f60357zy = supplier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m8071s(Consumer consumer, Object obj, Throwable th) {
        if (th != null) {
            Log.e(f12389q, "post", th);
        } else {
            consumer.accept(obj);
        }
    }

    public void ld6(final Consumer<T> action) {
        m8072p(new BiConsumer() { // from class: com.android.thememanager.lockscreen.lock.task.g
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                f7l8.m8071s(action, obj, (Throwable) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public void m8072p(BiConsumer<T, Throwable> action) {
        CompletableFuture.supplyAsync(this.f60357zy, this.f12398k).whenCompleteAsync((BiConsumer) action, this.f60361toq);
    }

    /* JADX INFO: renamed from: y */
    public <T1> C2110q<T, T1> m8073y(Supplier<T1> combinedSupplier) {
        return new C2110q<>(this.f60357zy, combinedSupplier);
    }
}
