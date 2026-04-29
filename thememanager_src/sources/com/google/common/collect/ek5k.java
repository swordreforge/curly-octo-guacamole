package com.google.common.collect;

import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: FilteredEntrySetMultimap.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
final class ek5k<K, V> extends C4451m<K, V> implements a98o<K, V> {
    ek5k(wt<K, V> wtVar, com.google.common.base.a9<? super Map.Entry<K, V>> a9Var) {
        super(wtVar, a9Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.C4451m, com.google.common.collect.AbstractC4579y
    /* JADX INFO: renamed from: f7l8, reason: merged with bridge method [inline-methods] */
    public Set<Map.Entry<K, V>> createEntries() {
        return g0ad.m15697s(toq().entries(), mo15585p());
    }

    @Override // com.google.common.collect.AbstractC4579y, com.google.common.collect.lw
    public Set<Map.Entry<K, V>> entries() {
        return (Set) super.entries();
    }

    @Override // com.google.common.collect.C4451m, com.google.common.collect.lw
    public Set<V> get(K k2) {
        return (Set) super.get((Object) k2);
    }

    @Override // com.google.common.collect.C4451m, com.google.common.collect.lw
    public Set<V> removeAll(Object obj) {
        return (Set) super.removeAll(obj);
    }

    @Override // com.google.common.collect.AbstractC4579y, com.google.common.collect.lw
    public Set<V> replaceValues(K k2, Iterable<? extends V> iterable) {
        return (Set) super.replaceValues((Object) k2, (Iterable) iterable);
    }

    @Override // com.google.common.collect.C4451m, com.google.common.collect.bf2
    public wt<K, V> toq() {
        return (wt) this.f26356s;
    }
}
