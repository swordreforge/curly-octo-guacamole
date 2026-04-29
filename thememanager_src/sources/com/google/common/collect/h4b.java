package com.google.common.collect;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: ListMultimap.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
public interface h4b<K, V> extends lw<K, V> {
    Map<K, Collection<V>> asMap();

    boolean equals(@NullableDecl Object obj);

    @Override // com.google.common.collect.lw
    List<V> get(@NullableDecl K k2);

    @Override // com.google.common.collect.lw
    @CanIgnoreReturnValue
    List<V> removeAll(@NullableDecl Object obj);

    @Override // com.google.common.collect.lw
    @CanIgnoreReturnValue
    List<V> replaceValues(K k2, Iterable<? extends V> iterable);
}
