package com.google.common.util.concurrent;

import com.google.common.collect.z4;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: CombinedFuture.java */
/* JADX INFO: loaded from: classes3.dex */
@wlev.toq
final class zurt<V> extends ld6<Object, V> {

    /* JADX INFO: renamed from: com.google.common.util.concurrent.zurt$k */
    /* JADX INFO: compiled from: CombinedFuture.java */
    private final class C4866k extends zurt<V>.zy<InterfaceFutureC4792c<V>> {
        private final qrj<V> callable;

        public C4866k(qrj<V> qrjVar, Executor executor) {
            super(executor);
            this.callable = (qrj) com.google.common.base.jk.a9(qrjVar);
        }

        @Override // com.google.common.util.concurrent.hyr
        String toPendingString() {
            return this.callable.toString();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.util.concurrent.hyr
        public InterfaceFutureC4792c<V> runInterruptibly() throws Exception {
            this.thrownByExecute = false;
            return (InterfaceFutureC4792c) com.google.common.base.jk.m15369c(this.callable.call(), "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", this.callable);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.util.concurrent.zurt.zy
        public void setValue(InterfaceFutureC4792c<V> interfaceFutureC4792c) {
            zurt.this.a9(interfaceFutureC4792c);
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.zurt$q */
    /* JADX INFO: compiled from: CombinedFuture.java */
    private final class C4867q extends ld6<Object, V>.AbstractRunnableC4818k {

        /* JADX INFO: renamed from: i */
        private zy f27625i;

        C4867q(z4<? extends InterfaceFutureC4792c<?>> z4Var, boolean z2, zy zyVar) {
            super(z4Var, z2, false);
            this.f27625i = zyVar;
        }

        @Override // com.google.common.util.concurrent.ld6.AbstractRunnableC4818k
        /* JADX INFO: renamed from: i */
        void mo16933i() {
            super.mo16933i();
            this.f27625i = null;
        }

        @Override // com.google.common.util.concurrent.ld6.AbstractRunnableC4818k
        void ki() {
            zy zyVar = this.f27625i;
            if (zyVar != null) {
                zyVar.interruptTask();
            }
        }

        @Override // com.google.common.util.concurrent.ld6.AbstractRunnableC4818k
        void n7h() {
            zy zyVar = this.f27625i;
            if (zyVar != null) {
                zyVar.execute();
            } else {
                com.google.common.base.jk.yz(zurt.this.isDone());
            }
        }

        @Override // com.google.common.util.concurrent.ld6.AbstractRunnableC4818k
        void x2(boolean z2, int i2, @NullableDecl Object obj) {
        }
    }

    /* JADX INFO: compiled from: CombinedFuture.java */
    private final class toq extends zurt<V>.zy<V> {
        private final Callable<V> callable;

        public toq(Callable<V> callable, Executor executor) {
            super(executor);
            this.callable = (Callable) com.google.common.base.jk.a9(callable);
        }

        @Override // com.google.common.util.concurrent.hyr
        V runInterruptibly() throws Exception {
            this.thrownByExecute = false;
            return this.callable.call();
        }

        @Override // com.google.common.util.concurrent.zurt.zy
        void setValue(V v2) {
            zurt.this.mcp(v2);
        }

        @Override // com.google.common.util.concurrent.hyr
        String toPendingString() {
            return this.callable.toString();
        }
    }

    /* JADX INFO: compiled from: CombinedFuture.java */
    private abstract class zy<T> extends hyr<T> {
        private final Executor listenerExecutor;
        boolean thrownByExecute = true;

        public zy(Executor executor) {
            this.listenerExecutor = (Executor) com.google.common.base.jk.a9(executor);
        }

        @Override // com.google.common.util.concurrent.hyr
        final void afterRanInterruptibly(T t2, Throwable th) {
            if (th == null) {
                setValue(t2);
                return;
            }
            if (th instanceof ExecutionException) {
                zurt.this.jk(th.getCause());
            } else if (th instanceof CancellationException) {
                zurt.this.cancel(false);
            } else {
                zurt.this.jk(th);
            }
        }

        final void execute() {
            try {
                this.listenerExecutor.execute(this);
            } catch (RejectedExecutionException e2) {
                if (this.thrownByExecute) {
                    zurt.this.jk(e2);
                }
            }
        }

        @Override // com.google.common.util.concurrent.hyr
        final boolean isDone() {
            return zurt.this.isDone();
        }

        abstract void setValue(T t2);
    }

    zurt(z4<? extends InterfaceFutureC4792c<?>> z4Var, boolean z2, Executor executor, qrj<V> qrjVar) {
        d2ok(new C4867q(z4Var, z2, new C4866k(qrjVar, executor)));
    }

    zurt(z4<? extends InterfaceFutureC4792c<?>> z4Var, boolean z2, Executor executor, Callable<V> callable) {
        d2ok(new C4867q(z4Var, z2, new toq(callable, executor)));
    }
}
