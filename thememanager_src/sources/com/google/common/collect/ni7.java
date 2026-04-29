package com.google.common.collect;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: BiMap.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
public interface ni7<K, V> extends Map<K, V> {
    @CanIgnoreReturnValue
    @NullableDecl
    V forcePut(@NullableDecl K k2, @NullableDecl V v2);

    ni7<V, K> inverse();

    @CanIgnoreReturnValue
    @NullableDecl
    V put(@NullableDecl K k2, @NullableDecl V v2);

    @Override // java.util.Map
    void putAll(Map<? extends K, ? extends V> map);

    Set<V> values();
}
