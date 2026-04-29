package com.google.common.util.concurrent;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import wlev.InterfaceC7731k;

/* JADX INFO: compiled from: AbstractListeningExecutorService.java */
/* JADX INFO: loaded from: classes3.dex */
@CanIgnoreReturnValue
@InterfaceC7731k
@wlev.zy
public abstract class f7l8 extends AbstractExecutorService implements InterfaceExecutorServiceC4801e {
    @Override // java.util.concurrent.AbstractExecutorService
    protected final <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t2) {
        return t8iq.x9kr(runnable, t2);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    protected final <T> RunnableFuture<T> newTaskFor(Callable<T> callable) {
        return t8iq.ncyb(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public InterfaceFutureC4792c<?> submit(Runnable runnable) {
        return (InterfaceFutureC4792c) super.submit(runnable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public <T> InterfaceFutureC4792c<T> submit(Runnable runnable, @NullableDecl T t2) {
        return (InterfaceFutureC4792c) super.submit(runnable, (Object) t2);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public <T> InterfaceFutureC4792c<T> submit(Callable<T> callable) {
        return (InterfaceFutureC4792c) super.submit((Callable) callable);
    }
}
