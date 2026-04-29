package com.google.common.collect;

import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: renamed from: com.google.common.collect.b */
/* JADX INFO: compiled from: FilteredKeySetMultimap.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
final class C4313b<K, V> extends y9n<K, V> implements a98o<K, V> {

    /* JADX INFO: renamed from: com.google.common.collect.b$k */
    /* JADX INFO: compiled from: FilteredKeySetMultimap.java */
    class k extends y9n<K, V>.zy implements Set<Map.Entry<K, V>> {
        k() {
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

    C4313b(wt<K, V> wtVar, com.google.common.base.a9<? super K> a9Var) {
        super(wtVar, a9Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.y9n, com.google.common.collect.AbstractC4579y
    /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
    public Set<Map.Entry<K, V>> createEntries() {
        return new k();
    }

    @Override // com.google.common.collect.AbstractC4579y, com.google.common.collect.lw
    public Set<Map.Entry<K, V>> entries() {
        return (Set) super.entries();
    }

    @Override // com.google.common.collect.y9n, com.google.common.collect.lw
    public Set<V> get(K k2) {
        return (Set) super.get((Object) k2);
    }

    @Override // com.google.common.collect.y9n, com.google.common.collect.lw
    public Set<V> removeAll(Object obj) {
        return (Set) super.removeAll(obj);
    }

    @Override // com.google.common.collect.AbstractC4579y, com.google.common.collect.lw
    public Set<V> replaceValues(K k2, Iterable<? extends V> iterable) {
        return (Set) super.replaceValues((Object) k2, (Iterable) iterable);
    }

    @Override // com.google.common.collect.y9n, com.google.common.collect.bf2
    public wt<K, V> toq() {
        return (wt) this.f26741s;
    }
}
