package com.google.common.collect;

import java.lang.Comparable;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import wlev.InterfaceC7731k;

/* JADX INFO: compiled from: RangeMap.java */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7731k
@wlev.zy
public interface ra<K extends Comparable, V> {
    Map<ps<K>, V> asDescendingMapOfRanges();

    Map<ps<K>, V> asMapOfRanges();

    void clear();

    boolean equals(@NullableDecl Object obj);

    @NullableDecl
    V get(K k2);

    @NullableDecl
    Map.Entry<ps<K>, V> getEntry(K k2);

    int hashCode();

    void put(ps<K> psVar, V v2);

    void putAll(ra<K, V> raVar);

    void putCoalescing(ps<K> psVar, V v2);

    void remove(ps<K> psVar);

    ps<K> span();

    ra<K, V> subRangeMap(ps<K> psVar);

    String toString();
}
