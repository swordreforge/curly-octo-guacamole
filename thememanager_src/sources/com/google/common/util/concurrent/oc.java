package com.google.common.util.concurrent;

import com.google.common.collect.qkj8;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: ForwardingFuture.java */
/* JADX INFO: loaded from: classes3.dex */
@CanIgnoreReturnValue
@wlev.toq
public abstract class oc<V> extends qkj8 implements Future<V> {

    /* JADX INFO: renamed from: com.google.common.util.concurrent.oc$k */
    /* JADX INFO: compiled from: ForwardingFuture.java */
    public static abstract class AbstractC4835k<V> extends oc<V> {

        /* JADX INFO: renamed from: k */
        private final Future<V> f27500k;

        protected AbstractC4835k(Future<V> future) {
            this.f27500k = (Future) com.google.common.base.jk.a9(future);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.util.concurrent.oc, com.google.common.collect.qkj8
        /* JADX INFO: renamed from: ld6, reason: merged with bridge method [inline-methods] */
        public final Future<V> delegate() {
            return this.f27500k;
        }
    }

    protected oc() {
    }

    public boolean cancel(boolean z2) {
        return delegate().cancel(z2);
    }

    @Override // java.util.concurrent.Future
    public V get() throws ExecutionException, InterruptedException {
        return delegate().get();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return delegate().isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return delegate().isDone();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.qkj8
    /* JADX INFO: renamed from: ld6 */
    public abstract Future<? extends V> delegate();

    @Override // java.util.concurrent.Future
    public V get(long j2, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return delegate().get(j2, timeUnit);
    }
}
