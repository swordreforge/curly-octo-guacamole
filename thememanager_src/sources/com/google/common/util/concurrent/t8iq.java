package com.google.common.util.concurrent;

import com.google.common.util.concurrent.mcp;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: TrustedListenableFutureTask.java */
/* JADX INFO: loaded from: classes3.dex */
@wlev.toq
class t8iq<V> extends mcp.AbstractC4821k<V> implements RunnableFuture<V> {

    /* JADX INFO: renamed from: i */
    private volatile hyr<?> f27542i;

    /* JADX INFO: renamed from: com.google.common.util.concurrent.t8iq$k */
    /* JADX INFO: compiled from: TrustedListenableFutureTask.java */
    private final class C4841k extends hyr<InterfaceFutureC4792c<V>> {
        private final qrj<V> callable;

        C4841k(qrj<V> qrjVar) {
            this.callable = (qrj) com.google.common.base.jk.a9(qrjVar);
        }

        @Override // com.google.common.util.concurrent.hyr
        final boolean isDone() {
            return t8iq.this.isDone();
        }

        @Override // com.google.common.util.concurrent.hyr
        String toPendingString() {
            return this.callable.toString();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.util.concurrent.hyr
        public void afterRanInterruptibly(InterfaceFutureC4792c<V> interfaceFutureC4792c, Throwable th) {
            if (th == null) {
                t8iq.this.a9(interfaceFutureC4792c);
            } else {
                t8iq.this.jk(th);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.util.concurrent.hyr
        public InterfaceFutureC4792c<V> runInterruptibly() throws Exception {
            return (InterfaceFutureC4792c) com.google.common.base.jk.m15369c(this.callable.call(), "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", this.callable);
        }
    }

    /* JADX INFO: compiled from: TrustedListenableFutureTask.java */
    private final class toq extends hyr<V> {
        private final Callable<V> callable;

        toq(Callable<V> callable) {
            this.callable = (Callable) com.google.common.base.jk.a9(callable);
        }

        @Override // com.google.common.util.concurrent.hyr
        void afterRanInterruptibly(V v2, Throwable th) {
            if (th == null) {
                t8iq.this.mcp(v2);
            } else {
                t8iq.this.jk(th);
            }
        }

        @Override // com.google.common.util.concurrent.hyr
        final boolean isDone() {
            return t8iq.this.isDone();
        }

        @Override // com.google.common.util.concurrent.hyr
        V runInterruptibly() throws Exception {
            return this.callable.call();
        }

        @Override // com.google.common.util.concurrent.hyr
        String toPendingString() {
            return this.callable.toString();
        }
    }

    t8iq(Callable<V> callable) {
        this.f27542i = new toq(callable);
    }

    static <V> t8iq<V> dd(qrj<V> qrjVar) {
        return new t8iq<>(qrjVar);
    }

    static <V> t8iq<V> ncyb(Callable<V> callable) {
        return new t8iq<>(callable);
    }

    static <V> t8iq<V> x9kr(Runnable runnable, @NullableDecl V v2) {
        return new t8iq<>(Executors.callable(runnable, v2));
    }

    @Override // com.google.common.util.concurrent.AbstractC4837q
    /* JADX INFO: renamed from: h */
    protected void mo16921h() {
        hyr<?> hyrVar;
        super.mo16921h();
        if (jp0y() && (hyrVar = this.f27542i) != null) {
            hyrVar.interruptTask();
        }
        this.f27542i = null;
    }

    @Override // com.google.common.util.concurrent.AbstractC4837q
    protected String o1t() {
        hyr<?> hyrVar = this.f27542i;
        if (hyrVar == null) {
            return super.o1t();
        }
        return "task=[" + hyrVar + "]";
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public void run() {
        hyr<?> hyrVar = this.f27542i;
        if (hyrVar != null) {
            hyrVar.run();
        }
        this.f27542i = null;
    }

    t8iq(qrj<V> qrjVar) {
        this.f27542i = new C4841k(qrjVar);
    }
}
