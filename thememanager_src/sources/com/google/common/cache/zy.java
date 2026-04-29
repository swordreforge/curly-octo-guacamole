package com.google.common.cache;

import com.google.common.collect.zkd;
import com.google.errorprone.annotations.CompatibleWith;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: Cache.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
public interface zy<K, V> {
    ConcurrentMap<K, V> asMap();

    void cleanUp();

    V get(K k2, Callable<? extends V> callable) throws ExecutionException;

    zkd<K, V> getAllPresent(Iterable<?> iterable);

    @NullableDecl
    V getIfPresent(@CompatibleWith("K") Object obj);

    void invalidate(@CompatibleWith("K") Object obj);

    void invalidateAll();

    void invalidateAll(Iterable<?> iterable);

    void put(K k2, V v2);

    void putAll(Map<? extends K, ? extends V> map);

    long size();

    f7l8 stats();
}
