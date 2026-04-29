package com.google.common.collect;

import java.io.Serializable;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: ImmutableMapValues.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq(emulated = true)
final class jz5<K, V> extends z4<V> {
    private final zkd<K, V> map;

    /* JADX INFO: renamed from: com.google.common.collect.jz5$k */
    /* JADX INFO: compiled from: ImmutableMapValues.java */
    class C4426k extends ab<V> {

        /* JADX INFO: renamed from: k */
        final ab<Map.Entry<K, V>> f26259k;

        C4426k() {
            this.f26259k = jz5.this.map.entrySet().iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f26259k.hasNext();
        }

        @Override // java.util.Iterator
        public V next() {
            return this.f26259k.next().getValue();
        }
    }

    /* JADX INFO: compiled from: ImmutableMapValues.java */
    class toq extends se<V> {
        final /* synthetic */ se val$entryList;

        toq(se seVar) {
            this.val$entryList = seVar;
        }

        @Override // java.util.List
        public V get(int i2) {
            return (V) ((Map.Entry) this.val$entryList.get(i2)).getValue();
        }

        @Override // com.google.common.collect.z4
        boolean isPartialView() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.val$entryList.size();
        }
    }

    /* JADX INFO: compiled from: ImmutableMapValues.java */
    @wlev.zy
    private static class zy<V> implements Serializable {
        private static final long serialVersionUID = 0;
        final zkd<?, V> map;

        zy(zkd<?, V> zkdVar) {
            this.map = zkdVar;
        }

        Object readResolve() {
            return this.map.values();
        }
    }

    jz5(zkd<K, V> zkdVar) {
        this.map = zkdVar;
    }

    @Override // com.google.common.collect.z4
    public se<V> asList() {
        return new toq(this.map.entrySet().asList());
    }

    @Override // com.google.common.collect.z4, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.o05
    public boolean contains(@NullableDecl Object obj) {
        return obj != null && zwy.cdj(iterator(), obj);
    }

    @Override // com.google.common.collect.z4
    boolean isPartialView() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        return this.map.size();
    }

    @Override // com.google.common.collect.z4
    @wlev.zy
    Object writeReplace() {
        return new zy(this.map);
    }

    @Override // com.google.common.collect.z4, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.o05
    public ab<V> iterator() {
        return new C4426k();
    }
}
