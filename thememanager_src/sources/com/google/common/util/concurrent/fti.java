package com.google.common.util.concurrent;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.lang.Exception;
import java.util.concurrent.TimeUnit;
import wlev.InterfaceC7731k;

/* JADX INFO: compiled from: ForwardingCheckedFuture.java */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC7731k
@wlev.zy
@Deprecated
public abstract class fti<V, X extends Exception> extends eqxt<V> implements InterfaceC4813i<V, X> {

    /* JADX INFO: renamed from: com.google.common.util.concurrent.fti$k */
    /* JADX INFO: compiled from: ForwardingCheckedFuture.java */
    @InterfaceC7731k
    @Deprecated
    public static abstract class AbstractC4807k<V, X extends Exception> extends fti<V, X> {

        /* JADX INFO: renamed from: k */
        private final InterfaceC4813i<V, X> f27430k;

        protected AbstractC4807k(InterfaceC4813i<V, X> interfaceC4813i) {
            this.f27430k = (InterfaceC4813i) com.google.common.base.jk.a9(interfaceC4813i);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.util.concurrent.fti, com.google.common.util.concurrent.eqxt
        /* JADX INFO: renamed from: kja0, reason: merged with bridge method [inline-methods] */
        public final InterfaceC4813i<V, X> delegate() {
            return this.f27430k;
        }
    }

    @Override // com.google.common.util.concurrent.InterfaceC4813i
    @CanIgnoreReturnValue
    public V f7l8(long j2, TimeUnit timeUnit) throws Exception {
        return delegate().f7l8(j2, timeUnit);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.util.concurrent.eqxt
    /* JADX INFO: renamed from: kja0 */
    public abstract InterfaceC4813i<V, X> delegate();

    @Override // com.google.common.util.concurrent.InterfaceC4813i
    @CanIgnoreReturnValue
    public V zy() throws Exception {
        return delegate().zy();
    }
}
