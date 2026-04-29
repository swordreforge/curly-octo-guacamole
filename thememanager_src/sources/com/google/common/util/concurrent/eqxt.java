package com.google.common.util.concurrent;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: ForwardingListenableFuture.java */
/* JADX INFO: loaded from: classes3.dex */
@CanIgnoreReturnValue
@wlev.toq
public abstract class eqxt<V> extends oc<V> implements InterfaceFutureC4792c<V> {

    /* JADX INFO: renamed from: com.google.common.util.concurrent.eqxt$k */
    /* JADX INFO: compiled from: ForwardingListenableFuture.java */
    public static abstract class AbstractC4803k<V> extends eqxt<V> {

        /* JADX INFO: renamed from: k */
        private final InterfaceFutureC4792c<V> f27419k;

        protected AbstractC4803k(InterfaceFutureC4792c<V> interfaceFutureC4792c) {
            this.f27419k = (InterfaceFutureC4792c) com.google.common.base.jk.a9(interfaceFutureC4792c);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.util.concurrent.eqxt, com.google.common.util.concurrent.oc
        /* JADX INFO: renamed from: x2, reason: merged with bridge method [inline-methods] */
        public final InterfaceFutureC4792c<V> delegate() {
            return this.f27419k;
        }
    }

    protected eqxt() {
    }

    @Override // com.google.common.util.concurrent.InterfaceFutureC4792c
    public void n7h(Runnable runnable, Executor executor) {
        delegate().n7h(runnable, executor);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.util.concurrent.oc
    /* JADX INFO: renamed from: x2 */
    public abstract InterfaceFutureC4792c<? extends V> delegate();
}
