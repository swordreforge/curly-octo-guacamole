package com.google.common.cache;

import com.google.common.collect.zkd;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;

/* JADX INFO: renamed from: com.google.common.cache.p */
/* JADX INFO: compiled from: LoadingCache.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
public interface InterfaceC4303p<K, V> extends zy<K, V>, com.google.common.base.t8r<K, V> {
    @Override // com.google.common.base.t8r
    @Deprecated
    V apply(K k2);

    @Override // com.google.common.cache.zy
    ConcurrentMap<K, V> asMap();

    V get(K k2) throws ExecutionException;

    zkd<K, V> getAll(Iterable<? extends K> iterable) throws ExecutionException;

    V getUnchecked(K k2);

    void refresh(K k2);
}
