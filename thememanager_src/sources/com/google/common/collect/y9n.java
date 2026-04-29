package com.google.common.collect;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: FilteredKeyMultimap.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
class y9n<K, V> extends AbstractC4579y<K, V> implements bf2<K, V> {

    /* JADX INFO: renamed from: p */
    final com.google.common.base.a9<? super K> f26740p;

    /* JADX INFO: renamed from: s */
    final lw<K, V> f26741s;

    /* JADX INFO: renamed from: com.google.common.collect.y9n$k */
    /* JADX INFO: compiled from: FilteredKeyMultimap.java */
    static class C4580k<K, V> extends c8jq<V> {

        /* JADX INFO: renamed from: k */
        final K f26742k;

        C4580k(K k2) {
            this.f26742k = k2;
        }

        @Override // com.google.common.collect.AbstractC4572x, java.util.Collection, java.util.Queue
        public boolean add(V v2) {
            add(0, v2);
            return true;
        }

        @Override // com.google.common.collect.AbstractC4572x, java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            addAll(0, collection);
            return true;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.c8jq, com.google.common.collect.AbstractC4572x, com.google.common.collect.qkj8
        /* JADX INFO: renamed from: ld6 */
        public List<V> delegate() {
            return Collections.emptyList();
        }

        @Override // com.google.common.collect.c8jq, java.util.List
        public void add(int i2, V v2) {
            com.google.common.base.jk.m15381o(i2, 0);
            throw new IllegalArgumentException("Key does not satisfy predicate: " + this.f26742k);
        }

        @Override // com.google.common.collect.c8jq, java.util.List
        @CanIgnoreReturnValue
        public boolean addAll(int i2, Collection<? extends V> collection) {
            com.google.common.base.jk.a9(collection);
            com.google.common.base.jk.m15381o(i2, 0);
            throw new IllegalArgumentException("Key does not satisfy predicate: " + this.f26742k);
        }
    }

    /* JADX INFO: compiled from: FilteredKeyMultimap.java */
    class zy extends AbstractC4572x<Map.Entry<K, V>> {
        zy() {
        }

        @Override // com.google.common.collect.AbstractC4572x, java.util.Collection
        public boolean remove(@NullableDecl Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (y9n.this.f26741s.containsKey(entry.getKey()) && y9n.this.f26740p.apply((Object) entry.getKey())) {
                return y9n.this.f26741s.remove(entry.getKey(), entry.getValue());
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.AbstractC4572x, com.google.common.collect.qkj8
        public Collection<Map.Entry<K, V>> delegate() {
            return mcp.m15859n(y9n.this.f26741s.entries(), y9n.this.mo15585p());
        }
    }

    y9n(lw<K, V> lwVar, com.google.common.base.a9<? super K> a9Var) {
        this.f26741s = (lw) com.google.common.base.jk.a9(lwVar);
        this.f26740p = (com.google.common.base.a9) com.google.common.base.jk.a9(a9Var);
    }

    @Override // com.google.common.collect.lw
    public void clear() {
        keySet().clear();
    }

    @Override // com.google.common.collect.lw
    public boolean containsKey(@NullableDecl Object obj) {
        if (this.f26741s.containsKey(obj)) {
            return this.f26740p.apply(obj);
        }
        return false;
    }

    @Override // com.google.common.collect.AbstractC4579y
    Map<K, Collection<V>> createAsMap() {
        return vy.jp0y(this.f26741s.asMap(), this.f26740p);
    }

    @Override // com.google.common.collect.AbstractC4579y
    Collection<Map.Entry<K, V>> createEntries() {
        return new zy();
    }

    @Override // com.google.common.collect.AbstractC4579y
    Set<K> createKeySet() {
        return g0ad.m15697s(this.f26741s.keySet(), this.f26740p);
    }

    @Override // com.google.common.collect.AbstractC4579y
    o05<K> createKeys() {
        return m58i.m15838p(this.f26741s.keys(), this.f26740p);
    }

    @Override // com.google.common.collect.AbstractC4579y
    Collection<V> createValues() {
        return new i1(this);
    }

    @Override // com.google.common.collect.AbstractC4579y
    Iterator<Map.Entry<K, V>> entryIterator() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.lw
    public Collection<V> get(K k2) {
        return this.f26740p.apply(k2) ? this.f26741s.get(k2) : this.f26741s instanceof wt ? new toq(k2) : new C4580k(k2);
    }

    /* JADX INFO: renamed from: k */
    Collection<V> m16101k() {
        return this.f26741s instanceof wt ? vep5.of() : se.of();
    }

    @Override // com.google.common.collect.bf2
    /* JADX INFO: renamed from: p */
    public com.google.common.base.a9<? super Map.Entry<K, V>> mo15585p() {
        return vy.m16013f(this.f26740p);
    }

    @Override // com.google.common.collect.lw
    public Collection<V> removeAll(Object obj) {
        return containsKey(obj) ? this.f26741s.removeAll(obj) : m16101k();
    }

    @Override // com.google.common.collect.lw
    public int size() {
        Iterator<Collection<V>> it = asMap().values().iterator();
        int size = 0;
        while (it.hasNext()) {
            size += it.next().size();
        }
        return size;
    }

    public lw<K, V> toq() {
        return this.f26741s;
    }

    /* JADX INFO: compiled from: FilteredKeyMultimap.java */
    static class toq<K, V> extends qo<V> {

        /* JADX INFO: renamed from: k */
        final K f26743k;

        toq(K k2) {
            this.f26743k = k2;
        }

        @Override // com.google.common.collect.AbstractC4572x, java.util.Collection, java.util.Queue
        public boolean add(V v2) {
            throw new IllegalArgumentException("Key does not satisfy predicate: " + this.f26743k);
        }

        @Override // com.google.common.collect.AbstractC4572x, java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            com.google.common.base.jk.a9(collection);
            throw new IllegalArgumentException("Key does not satisfy predicate: " + this.f26743k);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.qo, com.google.common.collect.AbstractC4572x, com.google.common.collect.qkj8
        public Set<V> delegate() {
            return Collections.emptySet();
        }
    }
}
