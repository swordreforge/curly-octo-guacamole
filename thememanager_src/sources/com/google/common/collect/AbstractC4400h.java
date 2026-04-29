package com.google.common.collect;

import com.google.common.collect.AbstractC4469n;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.NavigableSet;
import java.util.SortedSet;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: renamed from: com.google.common.collect.h */
/* JADX INFO: compiled from: AbstractSortedSetMultimap.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
abstract class AbstractC4400h<K, V> extends qrj<K, V> implements xm<K, V> {
    private static final long serialVersionUID = 430848587173315748L;

    protected AbstractC4400h(Map<K, Collection<V>> map) {
        super(map);
    }

    @Override // com.google.common.collect.qrj, com.google.common.collect.AbstractC4579y, com.google.common.collect.lw, com.google.common.collect.h4b
    public Map<K, Collection<V>> asMap() {
        return super.asMap();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.qrj, com.google.common.collect.AbstractC4469n
    public abstract SortedSet<V> createCollection();

    @Override // com.google.common.collect.AbstractC4469n, com.google.common.collect.AbstractC4579y, com.google.common.collect.lw
    public Collection<V> values() {
        return super.values();
    }

    @Override // com.google.common.collect.qrj, com.google.common.collect.AbstractC4469n
    Collection<V> wrapCollection(K k2, Collection<V> collection) {
        return collection instanceof NavigableSet ? new AbstractC4469n.qrj(k2, (NavigableSet) collection, null) : new AbstractC4469n.kja0(k2, (SortedSet) collection, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.qrj, com.google.common.collect.AbstractC4469n
    public <E> SortedSet<E> unmodifiableCollectionSubclass(Collection<E> collection) {
        return collection instanceof NavigableSet ? g0ad.dd((NavigableSet) collection) : Collections.unmodifiableSortedSet((SortedSet) collection);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.qrj, com.google.common.collect.AbstractC4469n
    public SortedSet<V> createUnmodifiableEmptyCollection() {
        return (SortedSet<V>) unmodifiableCollectionSubclass((Collection) createCollection());
    }

    @Override // com.google.common.collect.qrj, com.google.common.collect.AbstractC4469n, com.google.common.collect.lw
    public SortedSet<V> get(@NullableDecl K k2) {
        return (SortedSet) super.get((Object) k2);
    }

    @Override // com.google.common.collect.qrj, com.google.common.collect.AbstractC4469n, com.google.common.collect.lw
    @CanIgnoreReturnValue
    public SortedSet<V> removeAll(@NullableDecl Object obj) {
        return (SortedSet) super.removeAll(obj);
    }

    @Override // com.google.common.collect.qrj, com.google.common.collect.AbstractC4469n, com.google.common.collect.AbstractC4579y, com.google.common.collect.lw
    @CanIgnoreReturnValue
    public SortedSet<V> replaceValues(@NullableDecl K k2, Iterable<? extends V> iterable) {
        return (SortedSet) super.replaceValues((Object) k2, (Iterable) iterable);
    }
}
