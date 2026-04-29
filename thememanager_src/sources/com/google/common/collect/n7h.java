package com.google.common.collect;

import java.util.Collection;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: compiled from: AbstractSortedKeySortedSetMultimap.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
abstract class n7h<K, V> extends AbstractC4400h<K, V> {
    n7h(SortedMap<K, Collection<V>> sortedMap) {
        super(sortedMap);
    }

    @Override // com.google.common.collect.AbstractC4469n, com.google.common.collect.AbstractC4579y
    Set<K> createKeySet() {
        return createMaybeNavigableKeySet();
    }

    @Override // com.google.common.collect.AbstractC4400h, com.google.common.collect.qrj, com.google.common.collect.AbstractC4579y, com.google.common.collect.lw, com.google.common.collect.h4b
    public SortedMap<K, Collection<V>> asMap() {
        return (SortedMap) super.asMap();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractC4469n
    public SortedMap<K, Collection<V>> backingMap() {
        return (SortedMap) super.backingMap();
    }

    @Override // com.google.common.collect.AbstractC4579y, com.google.common.collect.lw
    public SortedSet<K> keySet() {
        return (SortedSet) super.keySet();
    }
}
