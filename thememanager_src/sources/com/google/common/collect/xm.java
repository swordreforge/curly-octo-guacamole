package com.google.common.collect;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.SortedSet;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: SortedSetMultimap.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
public interface xm<K, V> extends wt<K, V> {
    @Override // com.google.common.collect.wt, com.google.common.collect.lw, com.google.common.collect.h4b
    Map<K, Collection<V>> asMap();

    @Override // com.google.common.collect.wt, com.google.common.collect.lw
    SortedSet<V> get(@NullableDecl K k2);

    @Override // com.google.common.collect.wt, com.google.common.collect.lw
    @CanIgnoreReturnValue
    SortedSet<V> removeAll(@NullableDecl Object obj);

    @Override // com.google.common.collect.wt, com.google.common.collect.lw
    @CanIgnoreReturnValue
    SortedSet<V> replaceValues(K k2, Iterable<? extends V> iterable);

    Comparator<? super V> valueComparator();
}
