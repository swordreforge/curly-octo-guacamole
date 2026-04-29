package com.google.common.util.concurrent;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: ForwardingListeningExecutorService.java */
/* JADX INFO: loaded from: classes3.dex */
@CanIgnoreReturnValue
@wlev.zy
public abstract class d2ok extends gvn7 implements InterfaceExecutorServiceC4801e {
    protected d2ok() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.util.concurrent.gvn7
    /* JADX INFO: renamed from: x2, reason: merged with bridge method [inline-methods] */
    public abstract InterfaceExecutorServiceC4801e delegate();

    @Override // com.google.common.util.concurrent.gvn7, java.util.concurrent.ExecutorService, com.google.common.util.concurrent.InterfaceExecutorServiceC4801e
    public <T> InterfaceFutureC4792c<T> submit(Callable<T> callable) {
        return delegate().submit((Callable) callable);
    }

    @Override // com.google.common.util.concurrent.gvn7, java.util.concurrent.ExecutorService, com.google.common.util.concurrent.InterfaceExecutorServiceC4801e
    public InterfaceFutureC4792c<?> submit(Runnable runnable) {
        return delegate().submit(runnable);
    }

    @Override // com.google.common.util.concurrent.gvn7, java.util.concurrent.ExecutorService, com.google.common.util.concurrent.InterfaceExecutorServiceC4801e
    public <T> InterfaceFutureC4792c<T> submit(Runnable runnable, T t2) {
        return delegate().submit(runnable, (Object) t2);
    }
}
