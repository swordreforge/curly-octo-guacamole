package com.google.common.util.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: ListenableFutureTask.java */
/* JADX INFO: loaded from: classes3.dex */
@wlev.zy
public class lrht<V> extends FutureTask<V> implements InterfaceFutureC4792c<V> {

    /* JADX INFO: renamed from: k */
    private final o1t f27484k;

    lrht(Callable<V> callable) {
        super(callable);
        this.f27484k = new o1t();
    }

    /* JADX INFO: renamed from: k */
    public static <V> lrht<V> m16975k(Runnable runnable, @NullableDecl V v2) {
        return new lrht<>(runnable, v2);
    }

    public static <V> lrht<V> toq(Callable<V> callable) {
        return new lrht<>(callable);
    }

    @Override // java.util.concurrent.FutureTask
    protected void done() {
        this.f27484k.toq();
    }

    @Override // com.google.common.util.concurrent.InterfaceFutureC4792c
    public void n7h(Runnable runnable, Executor executor) {
        this.f27484k.m16992k(runnable, executor);
    }

    lrht(Runnable runnable, @NullableDecl V v2) {
        super(runnable, v2);
        this.f27484k = new o1t();
    }
}
