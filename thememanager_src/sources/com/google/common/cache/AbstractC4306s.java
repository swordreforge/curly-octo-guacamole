package com.google.common.cache;

import com.google.common.base.jk;
import com.google.common.collect.zkd;
import java.util.concurrent.ExecutionException;

/* JADX INFO: renamed from: com.google.common.cache.s */
/* JADX INFO: compiled from: ForwardingLoadingCache.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.zy
public abstract class AbstractC4306s<K, V> extends AbstractC4307y<K, V> implements InterfaceC4303p<K, V> {

    /* JADX INFO: renamed from: com.google.common.cache.s$k */
    /* JADX INFO: compiled from: ForwardingLoadingCache.java */
    public static abstract class k<K, V> extends AbstractC4306s<K, V> {

        /* JADX INFO: renamed from: k */
        private final InterfaceC4303p<K, V> f25922k;

        protected k(InterfaceC4303p<K, V> interfaceC4303p) {
            this.f25922k = (InterfaceC4303p) jk.a9(interfaceC4303p);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.cache.AbstractC4306s, com.google.common.cache.AbstractC4307y, com.google.common.collect.qkj8
        /* JADX INFO: renamed from: ld6, reason: merged with bridge method [inline-methods] */
        public final InterfaceC4303p<K, V> delegate() {
            return this.f25922k;
        }
    }

    protected AbstractC4306s() {
    }

    @Override // com.google.common.cache.InterfaceC4303p, com.google.common.base.t8r
    public V apply(K k2) {
        return delegate().apply(k2);
    }

    @Override // com.google.common.cache.InterfaceC4303p
    public V get(K k2) throws ExecutionException {
        return delegate().get(k2);
    }

    @Override // com.google.common.cache.InterfaceC4303p
    public zkd<K, V> getAll(Iterable<? extends K> iterable) throws ExecutionException {
        return delegate().getAll(iterable);
    }

    @Override // com.google.common.cache.InterfaceC4303p
    public V getUnchecked(K k2) {
        return delegate().getUnchecked(k2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.cache.AbstractC4307y, com.google.common.collect.qkj8
    /* JADX INFO: renamed from: ld6 */
    public abstract InterfaceC4303p<K, V> delegate();

    @Override // com.google.common.cache.InterfaceC4303p
    public void refresh(K k2) {
        delegate().refresh(k2);
    }
}
