package com.google.common.collect;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: SetMultimap.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
public interface wt<K, V> extends lw<K, V> {
    @Override // com.google.common.collect.lw, com.google.common.collect.h4b
    Map<K, Collection<V>> asMap();

    @Override // com.google.common.collect.lw
    Set<Map.Entry<K, V>> entries();

    @Override // com.google.common.collect.lw, com.google.common.collect.h4b
    boolean equals(@NullableDecl Object obj);

    @Override // com.google.common.collect.lw
    Set<V> get(@NullableDecl K k2);

    @Override // com.google.common.collect.lw
    @CanIgnoreReturnValue
    Set<V> removeAll(@NullableDecl Object obj);

    @Override // com.google.common.collect.lw
    @CanIgnoreReturnValue
    Set<V> replaceValues(K k2, Iterable<? extends V> iterable);
}
