package com.google.common.cache;

import com.google.common.collect.vy;
import com.google.common.collect.zkd;
import com.google.common.util.concurrent.bo;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: AbstractLoadingCache.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.zy
public abstract class toq<K, V> extends AbstractC4285k<K, V> implements InterfaceC4303p<K, V> {
    protected toq() {
    }

    @Override // com.google.common.cache.InterfaceC4303p, com.google.common.base.t8r
    public final V apply(K k2) {
        return getUnchecked(k2);
    }

    @Override // com.google.common.cache.InterfaceC4303p
    public zkd<K, V> getAll(Iterable<? extends K> iterable) throws ExecutionException {
        LinkedHashMap linkedHashMapM16017j = vy.m16017j();
        for (K k2 : iterable) {
            if (!linkedHashMapM16017j.containsKey(k2)) {
                linkedHashMapM16017j.put(k2, get(k2));
            }
        }
        return zkd.copyOf((Map) linkedHashMapM16017j);
    }

    @Override // com.google.common.cache.InterfaceC4303p
    public V getUnchecked(K k2) {
        try {
            return get(k2);
        } catch (ExecutionException e2) {
            throw new bo(e2.getCause());
        }
    }

    @Override // com.google.common.cache.InterfaceC4303p
    public void refresh(K k2) {
        throw new UnsupportedOperationException();
    }
}
