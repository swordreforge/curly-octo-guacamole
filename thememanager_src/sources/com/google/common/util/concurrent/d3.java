package com.google.common.util.concurrent;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: ForwardingFluentFuture.java */
/* JADX INFO: loaded from: classes3.dex */
@wlev.toq
final class d3<V> extends mcp<V> {

    /* JADX INFO: renamed from: i */
    private final InterfaceFutureC4792c<V> f27398i;

    d3(InterfaceFutureC4792c<V> interfaceFutureC4792c) {
        this.f27398i = (InterfaceFutureC4792c) com.google.common.base.jk.a9(interfaceFutureC4792c);
    }

    @Override // com.google.common.util.concurrent.AbstractC4837q, java.util.concurrent.Future
    public boolean cancel(boolean z2) {
        return this.f27398i.cancel(z2);
    }

    @Override // com.google.common.util.concurrent.AbstractC4837q, java.util.concurrent.Future
    public V get() throws ExecutionException, InterruptedException {
        return this.f27398i.get();
    }

    @Override // com.google.common.util.concurrent.AbstractC4837q, java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f27398i.isCancelled();
    }

    @Override // com.google.common.util.concurrent.AbstractC4837q, java.util.concurrent.Future
    public boolean isDone() {
        return this.f27398i.isDone();
    }

    @Override // com.google.common.util.concurrent.AbstractC4837q, com.google.common.util.concurrent.InterfaceFutureC4792c
    public void n7h(Runnable runnable, Executor executor) {
        this.f27398i.n7h(runnable, executor);
    }

    @Override // com.google.common.util.concurrent.AbstractC4837q, java.util.concurrent.Future
    public V get(long j2, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.f27398i.get(j2, timeUnit);
    }
}
