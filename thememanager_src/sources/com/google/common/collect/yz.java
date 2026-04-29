package com.google.common.collect;

import java.util.List;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: FilteredKeyListMultimap.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
final class yz<K, V> extends y9n<K, V> implements h4b<K, V> {
    yz(h4b<K, V> h4bVar, com.google.common.base.a9<? super K> a9Var) {
        super(h4bVar, a9Var);
    }

    @Override // com.google.common.collect.y9n, com.google.common.collect.bf2
    /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
    public h4b<K, V> toq() {
        return (h4b) super.toq();
    }

    @Override // com.google.common.collect.y9n, com.google.common.collect.lw
    public List<V> get(K k2) {
        return (List) super.get((Object) k2);
    }

    @Override // com.google.common.collect.y9n, com.google.common.collect.lw
    public List<V> removeAll(@NullableDecl Object obj) {
        return (List) super.removeAll(obj);
    }

    @Override // com.google.common.collect.AbstractC4579y, com.google.common.collect.lw
    public List<V> replaceValues(K k2, Iterable<? extends V> iterable) {
        return (List) super.replaceValues((Object) k2, (Iterable) iterable);
    }
}
