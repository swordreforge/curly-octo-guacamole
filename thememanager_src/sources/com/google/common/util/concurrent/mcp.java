package com.google.common.util.concurrent;

import com.google.common.util.concurrent.AbstractC4837q;
import com.google.common.util.concurrent.C4833o;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import wlev.InterfaceC7731k;

/* JADX INFO: compiled from: FluentFuture.java */
/* JADX INFO: loaded from: classes3.dex */
@wlev.toq(emulated = true)
@InterfaceC7731k
public abstract class mcp<V> extends ncyb<V> {

    /* JADX INFO: renamed from: com.google.common.util.concurrent.mcp$k */
    /* JADX INFO: compiled from: FluentFuture.java */
    static abstract class AbstractC4821k<V> extends mcp<V> implements AbstractC4837q.s<V> {
        AbstractC4821k() {
        }

        @Override // com.google.common.util.concurrent.AbstractC4837q, java.util.concurrent.Future
        @CanIgnoreReturnValue
        public final boolean cancel(boolean z2) {
            return super.cancel(z2);
        }

        @Override // com.google.common.util.concurrent.AbstractC4837q, java.util.concurrent.Future
        @CanIgnoreReturnValue
        public final V get() throws ExecutionException, InterruptedException {
            return (V) super.get();
        }

        @Override // com.google.common.util.concurrent.AbstractC4837q, java.util.concurrent.Future
        public final boolean isCancelled() {
            return super.isCancelled();
        }

        @Override // com.google.common.util.concurrent.AbstractC4837q, java.util.concurrent.Future
        public final boolean isDone() {
            return super.isDone();
        }

        @Override // com.google.common.util.concurrent.AbstractC4837q, com.google.common.util.concurrent.InterfaceFutureC4792c
        public final void n7h(Runnable runnable, Executor executor) {
            super.n7h(runnable, executor);
        }

        @Override // com.google.common.util.concurrent.AbstractC4837q, java.util.concurrent.Future
        @CanIgnoreReturnValue
        public final V get(long j2, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
            return (V) super.get(j2, timeUnit);
        }
    }

    mcp() {
    }

    public static <V> mcp<V> eqxt(InterfaceFutureC4792c<V> interfaceFutureC4792c) {
        return interfaceFutureC4792c instanceof mcp ? (mcp) interfaceFutureC4792c : new d3(interfaceFutureC4792c);
    }

    public final <T> mcp<T> d2ok(com.google.common.base.t8r<? super V, T> t8rVar, Executor executor) {
        return (mcp) dd.ni7(this, t8rVar, executor);
    }

    @C4833o.k("AVAILABLE but requires exceptionType to be Throwable.class")
    public final <X extends Throwable> mcp<V> d3(Class<X> cls, com.google.common.base.t8r<? super X, ? extends V> t8rVar, Executor executor) {
        return (mcp) dd.m16912q(this, cls, t8rVar, executor);
    }

    public final void gvn7(InterfaceC4838r<? super V> interfaceC4838r, Executor executor) {
        dd.m16909k(this, interfaceC4838r, executor);
    }

    public final <T> mcp<T> lvui(n7h<? super V, T> n7hVar, Executor executor) {
        return (mcp) dd.fu4(this, n7hVar, executor);
    }

    @C4833o.k("AVAILABLE but requires exceptionType to be Throwable.class")
    public final <X extends Throwable> mcp<V> oc(Class<X> cls, n7h<? super X, ? extends V> n7hVar, Executor executor) {
        return (mcp) dd.m16910n(this, cls, n7hVar, executor);
    }

    @wlev.zy
    /* JADX INFO: renamed from: r */
    public final mcp<V> m16979r(long j2, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return (mcp) dd.mcp(this, j2, timeUnit, scheduledExecutorService);
    }
}
