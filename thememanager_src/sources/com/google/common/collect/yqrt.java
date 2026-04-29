package com.google.common.collect;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: ImmutableEntry.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq(serializable = true)
class yqrt<K, V> extends f7l8<K, V> implements Serializable {
    private static final long serialVersionUID = 0;

    @NullableDecl
    final K key;

    @NullableDecl
    final V value;

    yqrt(@NullableDecl K k2, @NullableDecl V v2) {
        this.key = k2;
        this.value = v2;
    }

    @Override // com.google.common.collect.f7l8, java.util.Map.Entry
    @NullableDecl
    public final K getKey() {
        return this.key;
    }

    @Override // com.google.common.collect.f7l8, java.util.Map.Entry
    @NullableDecl
    public final V getValue() {
        return this.value;
    }

    @Override // com.google.common.collect.f7l8, java.util.Map.Entry
    public final V setValue(V v2) {
        throw new UnsupportedOperationException();
    }
}
