package com.google.common.collect;

import com.google.common.collect.oki;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: renamed from: com.google.common.collect.y */
/* JADX INFO: compiled from: AbstractMultimap.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
abstract class AbstractC4579y<K, V> implements lw<K, V> {

    /* JADX INFO: renamed from: g */
    @MonotonicNonNullDecl
    private transient Collection<V> f26732g;

    /* JADX INFO: renamed from: k */
    @MonotonicNonNullDecl
    private transient Collection<Map.Entry<K, V>> f26733k;

    /* JADX INFO: renamed from: n */
    @MonotonicNonNullDecl
    private transient o05<K> f26734n;

    /* JADX INFO: renamed from: q */
    @MonotonicNonNullDecl
    private transient Set<K> f26735q;

    /* JADX INFO: renamed from: y */
    @MonotonicNonNullDecl
    private transient Map<K, Collection<V>> f26736y;

    /* JADX INFO: renamed from: com.google.common.collect.y$k */
    /* JADX INFO: compiled from: AbstractMultimap.java */
    class k extends oki.AbstractC4492g<K, V> {
        k() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return AbstractC4579y.this.entryIterator();
        }

        @Override // com.google.common.collect.oki.AbstractC4492g
        /* JADX INFO: renamed from: k */
        lw<K, V> mo15941k() {
            return AbstractC4579y.this;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.y$toq */
    /* JADX INFO: compiled from: AbstractMultimap.java */
    class toq extends AbstractC4579y<K, V>.k implements Set<Map.Entry<K, V>> {
        toq() {
            super();
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(@NullableDecl Object obj) {
            return g0ad.f7l8(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return g0ad.ld6(this);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.y$zy */
    /* JADX INFO: compiled from: AbstractMultimap.java */
    class zy extends AbstractCollection<V> {
        zy() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            AbstractC4579y.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@NullableDecl Object obj) {
            return AbstractC4579y.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return AbstractC4579y.this.valueIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return AbstractC4579y.this.size();
        }
    }

    AbstractC4579y() {
    }

    @Override // com.google.common.collect.lw, com.google.common.collect.h4b
    public Map<K, Collection<V>> asMap() {
        Map<K, Collection<V>> map = this.f26736y;
        if (map != null) {
            return map;
        }
        Map<K, Collection<V>> mapCreateAsMap = createAsMap();
        this.f26736y = mapCreateAsMap;
        return mapCreateAsMap;
    }

    @Override // com.google.common.collect.lw
    public boolean containsEntry(@NullableDecl Object obj, @NullableDecl Object obj2) {
        Collection<V> collection = asMap().get(obj);
        return collection != null && collection.contains(obj2);
    }

    @Override // com.google.common.collect.lw
    public boolean containsValue(@NullableDecl Object obj) {
        Iterator<Collection<V>> it = asMap().values().iterator();
        while (it.hasNext()) {
            if (it.next().contains(obj)) {
                return true;
            }
        }
        return false;
    }

    abstract Map<K, Collection<V>> createAsMap();

    abstract Collection<Map.Entry<K, V>> createEntries();

    abstract Set<K> createKeySet();

    abstract o05<K> createKeys();

    abstract Collection<V> createValues();

    @Override // com.google.common.collect.lw
    public Collection<Map.Entry<K, V>> entries() {
        Collection<Map.Entry<K, V>> collection = this.f26733k;
        if (collection != null) {
            return collection;
        }
        Collection<Map.Entry<K, V>> collectionCreateEntries = createEntries();
        this.f26733k = collectionCreateEntries;
        return collectionCreateEntries;
    }

    abstract Iterator<Map.Entry<K, V>> entryIterator();

    @Override // com.google.common.collect.lw, com.google.common.collect.h4b
    public boolean equals(@NullableDecl Object obj) {
        return oki.f7l8(this, obj);
    }

    @Override // com.google.common.collect.lw
    public int hashCode() {
        return asMap().hashCode();
    }

    @Override // com.google.common.collect.lw
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // com.google.common.collect.lw
    public Set<K> keySet() {
        Set<K> set = this.f26735q;
        if (set != null) {
            return set;
        }
        Set<K> setCreateKeySet = createKeySet();
        this.f26735q = setCreateKeySet;
        return setCreateKeySet;
    }

    @Override // com.google.common.collect.lw
    public o05<K> keys() {
        o05<K> o05Var = this.f26734n;
        if (o05Var != null) {
            return o05Var;
        }
        o05<K> o05VarCreateKeys = createKeys();
        this.f26734n = o05VarCreateKeys;
        return o05VarCreateKeys;
    }

    @Override // com.google.common.collect.lw
    @CanIgnoreReturnValue
    public boolean put(@NullableDecl K k2, @NullableDecl V v2) {
        return get(k2).add(v2);
    }

    @Override // com.google.common.collect.lw
    @CanIgnoreReturnValue
    public boolean putAll(@NullableDecl K k2, Iterable<? extends V> iterable) {
        com.google.common.base.jk.a9(iterable);
        if (iterable instanceof Collection) {
            Collection<? extends V> collection = (Collection) iterable;
            return !collection.isEmpty() && get(k2).addAll(collection);
        }
        Iterator<? extends V> it = iterable.iterator();
        return it.hasNext() && zwy.m16125k(get(k2), it);
    }

    @Override // com.google.common.collect.lw
    @CanIgnoreReturnValue
    public boolean remove(@NullableDecl Object obj, @NullableDecl Object obj2) {
        Collection<V> collection = asMap().get(obj);
        return collection != null && collection.remove(obj2);
    }

    @Override // com.google.common.collect.lw
    @CanIgnoreReturnValue
    public Collection<V> replaceValues(@NullableDecl K k2, Iterable<? extends V> iterable) {
        com.google.common.base.jk.a9(iterable);
        Collection<V> collectionRemoveAll = removeAll(k2);
        putAll(k2, iterable);
        return collectionRemoveAll;
    }

    public String toString() {
        return asMap().toString();
    }

    Iterator<V> valueIterator() {
        return vy.zsr0(entries().iterator());
    }

    @Override // com.google.common.collect.lw
    public Collection<V> values() {
        Collection<V> collection = this.f26732g;
        if (collection != null) {
            return collection;
        }
        Collection<V> collectionCreateValues = createValues();
        this.f26732g = collectionCreateValues;
        return collectionCreateValues;
    }

    @Override // com.google.common.collect.lw
    @CanIgnoreReturnValue
    public boolean putAll(lw<? extends K, ? extends V> lwVar) {
        boolean zPut = false;
        for (Map.Entry<? extends K, ? extends V> entry : lwVar.entries()) {
            zPut |= put(entry.getKey(), entry.getValue());
        }
        return zPut;
    }
}
