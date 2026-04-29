package com.google.common.collect;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: renamed from: com.google.common.collect.q */
/* JADX INFO: compiled from: AbstractListMultimap.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
abstract class AbstractC4516q<K, V> extends AbstractC4469n<K, V> implements h4b<K, V> {
    private static final long serialVersionUID = 6588350623831699109L;

    protected AbstractC4516q(Map<K, Collection<V>> map) {
        super(map);
    }

    @Override // com.google.common.collect.AbstractC4579y, com.google.common.collect.lw, com.google.common.collect.h4b
    public Map<K, Collection<V>> asMap() {
        return super.asMap();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractC4469n
    public abstract List<V> createCollection();

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
        return Collections.unmodifiableList((List) collection);
    }

    @Override // com.google.common.collect.AbstractC4469n
    Collection<V> wrapCollection(K k2, Collection<V> collection) {
        return wrapList(k2, (List) collection, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractC4469n
    public List<V> createUnmodifiableEmptyCollection() {
        return Collections.emptyList();
    }

    @Override // com.google.common.collect.AbstractC4469n, com.google.common.collect.lw
    public List<V> get(@NullableDecl K k2) {
        return (List) super.get((Object) k2);
    }

    @Override // com.google.common.collect.AbstractC4469n, com.google.common.collect.lw
    @CanIgnoreReturnValue
    public List<V> removeAll(@NullableDecl Object obj) {
        return (List) super.removeAll(obj);
    }

    @Override // com.google.common.collect.AbstractC4469n, com.google.common.collect.AbstractC4579y, com.google.common.collect.lw
    @CanIgnoreReturnValue
    public List<V> replaceValues(@NullableDecl K k2, Iterable<? extends V> iterable) {
        return (List) super.replaceValues((Object) k2, (Iterable) iterable);
    }
}
