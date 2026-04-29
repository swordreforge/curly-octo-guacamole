package com.google.common.collect;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: compiled from: ForwardingConcurrentMap.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
public abstract class ch<K, V> extends xwq3<K, V> implements ConcurrentMap<K, V> {
    protected ch() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.xwq3, com.google.common.collect.qkj8
    public abstract ConcurrentMap<K, V> delegate();

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @CanIgnoreReturnValue
    public V putIfAbsent(K k2, V v2) {
        return delegate().putIfAbsent(k2, v2);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @CanIgnoreReturnValue
    public boolean remove(Object obj, Object obj2) {
        return delegate().remove(obj, obj2);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @CanIgnoreReturnValue
    public V replace(K k2, V v2) {
        return delegate().replace(k2, v2);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @CanIgnoreReturnValue
    public boolean replace(K k2, V v2, V v3) {
        return delegate().replace(k2, v2, v3);
    }
}
