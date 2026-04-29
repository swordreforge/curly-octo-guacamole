package com.google.common.cache;

import com.google.common.base.jk;
import com.google.common.collect.qkj8;
import com.google.common.collect.zkd;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: renamed from: com.google.common.cache.y */
/* JADX INFO: compiled from: ForwardingCache.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.zy
public abstract class AbstractC4307y<K, V> extends qkj8 implements zy<K, V> {

    /* JADX INFO: renamed from: com.google.common.cache.y$k */
    /* JADX INFO: compiled from: ForwardingCache.java */
    public static abstract class k<K, V> extends AbstractC4307y<K, V> {

        /* JADX INFO: renamed from: k */
        private final zy<K, V> f25923k;

        protected k(zy<K, V> zyVar) {
            this.f25923k = (zy) jk.a9(zyVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.cache.AbstractC4307y, com.google.common.collect.qkj8
        public final zy<K, V> delegate() {
            return this.f25923k;
        }
    }

    protected AbstractC4307y() {
    }

    @Override // com.google.common.cache.zy
    public ConcurrentMap<K, V> asMap() {
        return delegate().asMap();
    }

    @Override // com.google.common.cache.zy
    public void cleanUp() {
        delegate().cleanUp();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.qkj8
    public abstract zy<K, V> delegate();

    @Override // com.google.common.cache.zy
    public V get(K k2, Callable<? extends V> callable) throws ExecutionException {
        return delegate().get(k2, callable);
    }

    @Override // com.google.common.cache.zy
    public zkd<K, V> getAllPresent(Iterable<?> iterable) {
        return delegate().getAllPresent(iterable);
    }

    @Override // com.google.common.cache.zy
    @NullableDecl
    public V getIfPresent(Object obj) {
        return delegate().getIfPresent(obj);
    }

    @Override // com.google.common.cache.zy
    public void invalidate(Object obj) {
        delegate().invalidate(obj);
    }

    @Override // com.google.common.cache.zy
    public void invalidateAll(Iterable<?> iterable) {
        delegate().invalidateAll(iterable);
    }

    @Override // com.google.common.cache.zy
    public void put(K k2, V v2) {
        delegate().put(k2, v2);
    }

    @Override // com.google.common.cache.zy
    public void putAll(Map<? extends K, ? extends V> map) {
        delegate().putAll(map);
    }

    @Override // com.google.common.cache.zy
    public long size() {
        return delegate().size();
    }

    @Override // com.google.common.cache.zy
    public f7l8 stats() {
        return delegate().stats();
    }

    @Override // com.google.common.cache.zy
    public void invalidateAll() {
        delegate().invalidateAll();
    }
}
