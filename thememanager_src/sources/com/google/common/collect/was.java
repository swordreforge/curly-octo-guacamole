package com.google.common.collect;

import java.util.Comparator;
import java.util.SortedSet;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: ForwardingSortedSetMultimap.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
public abstract class was<K, V> extends tfm<K, V> implements xm<K, V> {
    protected was() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.tfm, com.google.common.collect.ikck, com.google.common.collect.qkj8
    public abstract xm<K, V> delegate();

    @Override // com.google.common.collect.xm
    public Comparator<? super V> valueComparator() {
        return delegate().valueComparator();
    }

    @Override // com.google.common.collect.tfm, com.google.common.collect.ikck, com.google.common.collect.lw
    public SortedSet<V> get(@NullableDecl K k2) {
        return delegate().get((Object) k2);
    }

    @Override // com.google.common.collect.tfm, com.google.common.collect.ikck, com.google.common.collect.lw
    public SortedSet<V> removeAll(@NullableDecl Object obj) {
        return delegate().removeAll(obj);
    }

    @Override // com.google.common.collect.tfm, com.google.common.collect.ikck, com.google.common.collect.lw
    public SortedSet<V> replaceValues(K k2, Iterable<? extends V> iterable) {
        return delegate().replaceValues((Object) k2, (Iterable) iterable);
    }
}
