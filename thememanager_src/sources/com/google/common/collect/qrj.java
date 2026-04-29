package com.google.common.collect;

import com.google.common.collect.AbstractC4469n;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: AbstractSetMultimap.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
abstract class qrj<K, V> extends AbstractC4469n<K, V> implements wt<K, V> {
    private static final long serialVersionUID = 7431625294878419160L;

    protected qrj(Map<K, Collection<V>> map) {
        super(map);
    }

    @Override // com.google.common.collect.AbstractC4579y, com.google.common.collect.lw, com.google.common.collect.h4b
    public Map<K, Collection<V>> asMap() {
        return super.asMap();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractC4469n
    public abstract Set<V> createCollection();

    @Override // com.google.common.collect.AbstractC4579y, com.google.common.collect.lw, com.google.common.collect.h4b
    public boolean equals(@NullableDecl Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.common.collect.AbstractC4469n, com.google.common.collect.AbstractC4579y, com.google.common.collect.lw
    @CanIgnoreReturnValue
    public boolean put(@NullableDecl K k2, @NullableDecl V v2) {
        return super.put(k2, v2);
    }

    @Override // com.google.common.collect.AbstractC4469n
    <E> Collection<E> unmodifiableCollectionSubclass(Collection<E> collection) {
        return Collections.unmodifiableSet((Set) collection);
    }

    @Override // com.google.common.collect.AbstractC4469n
    Collection<V> wrapCollection(K k2, Collection<V> collection) {
        return new AbstractC4469n.n7h(k2, (Set) collection);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractC4469n
    public Set<V> createUnmodifiableEmptyCollection() {
        return Collections.emptySet();
    }

    @Override // com.google.common.collect.AbstractC4469n, com.google.common.collect.AbstractC4579y, com.google.common.collect.lw
    public Set<Map.Entry<K, V>> entries() {
        return (Set) super.entries();
    }

    @Override // com.google.common.collect.AbstractC4469n, com.google.common.collect.lw
    public Set<V> get(@NullableDecl K k2) {
        return (Set) super.get((Object) k2);
    }

    @Override // com.google.common.collect.AbstractC4469n, com.google.common.collect.lw
    @CanIgnoreReturnValue
    public Set<V> removeAll(@NullableDecl Object obj) {
        return (Set) super.removeAll(obj);
    }

    @Override // com.google.common.collect.AbstractC4469n, com.google.common.collect.AbstractC4579y, com.google.common.collect.lw
    @CanIgnoreReturnValue
    public Set<V> replaceValues(@NullableDecl K k2, Iterable<? extends V> iterable) {
        return (Set) super.replaceValues((Object) k2, (Iterable) iterable);
    }
}
