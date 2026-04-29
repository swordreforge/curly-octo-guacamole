package com.google.common.collect;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: ImmutableMapKeySet.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq(emulated = true)
final class uj2j<K, V> extends ebn<K> {
    private final zkd<K, V> map;

    /* JADX INFO: renamed from: com.google.common.collect.uj2j$k */
    /* JADX INFO: compiled from: ImmutableMapKeySet.java */
    @wlev.zy
    private static class C4529k<K> implements Serializable {
        private static final long serialVersionUID = 0;
        final zkd<K, ?> map;

        C4529k(zkd<K, ?> zkdVar) {
            this.map = zkdVar;
        }

        Object readResolve() {
            return this.map.keySet();
        }
    }

    uj2j(zkd<K, V> zkdVar) {
        this.map = zkdVar;
    }

    @Override // com.google.common.collect.z4, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.o05
    public boolean contains(@NullableDecl Object obj) {
        return this.map.containsKey(obj);
    }

    @Override // com.google.common.collect.ebn
    K get(int i2) {
        return this.map.entrySet().asList().get(i2).getKey();
    }

    @Override // com.google.common.collect.z4
    boolean isPartialView() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.map.size();
    }

    @Override // com.google.common.collect.vep5, com.google.common.collect.z4
    @wlev.zy
    Object writeReplace() {
        return new C4529k(this.map);
    }

    @Override // com.google.common.collect.ebn, com.google.common.collect.vep5, com.google.common.collect.z4, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.o05
    public ab<K> iterator() {
        return this.map.keyIterator();
    }
}
