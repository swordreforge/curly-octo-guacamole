package com.google.common.collect;

import com.google.j2objc.annotations.Weak;
import java.io.Serializable;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: ImmutableMapEntrySet.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq(emulated = true)
abstract class bz2<K, V> extends vep5<Map.Entry<K, V>> {

    /* JADX INFO: renamed from: com.google.common.collect.bz2$k */
    /* JADX INFO: compiled from: ImmutableMapEntrySet.java */
    @wlev.zy
    private static class C4323k<K, V> implements Serializable {
        private static final long serialVersionUID = 0;
        final zkd<K, V> map;

        C4323k(zkd<K, V> zkdVar) {
            this.map = zkdVar;
        }

        Object readResolve() {
            return this.map.entrySet();
        }
    }

    /* JADX INFO: compiled from: ImmutableMapEntrySet.java */
    static final class toq<K, V> extends bz2<K, V> {

        /* JADX INFO: renamed from: s */
        private final transient se<Map.Entry<K, V>> f26012s;

        /* JADX INFO: renamed from: y */
        @Weak
        private final transient zkd<K, V> f26013y;

        toq(zkd<K, V> zkdVar, Map.Entry<K, V>[] entryArr) {
            this(zkdVar, se.asImmutableList(entryArr));
        }

        @Override // com.google.common.collect.z4
        @wlev.zy("not used in GWT")
        int copyIntoArray(Object[] objArr, int i2) {
            return this.f26012s.copyIntoArray(objArr, i2);
        }

        @Override // com.google.common.collect.vep5
        se<Map.Entry<K, V>> createAsList() {
            return this.f26012s;
        }

        @Override // com.google.common.collect.bz2
        zkd<K, V> map() {
            return this.f26013y;
        }

        toq(zkd<K, V> zkdVar, se<Map.Entry<K, V>> seVar) {
            this.f26013y = zkdVar;
            this.f26012s = seVar;
        }

        @Override // com.google.common.collect.vep5, com.google.common.collect.z4, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.o05
        public ab<Map.Entry<K, V>> iterator() {
            return this.f26012s.iterator();
        }
    }

    bz2() {
    }

    @Override // com.google.common.collect.z4, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.o05
    public boolean contains(@NullableDecl Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        V v2 = map().get(entry.getKey());
        return v2 != null && v2.equals(entry.getValue());
    }

    @Override // com.google.common.collect.vep5, java.util.Collection, java.util.Set
    public int hashCode() {
        return map().hashCode();
    }

    @Override // com.google.common.collect.vep5
    @wlev.zy
    boolean isHashCodeFast() {
        return map().isHashCodeFast();
    }

    @Override // com.google.common.collect.z4
    boolean isPartialView() {
        return map().isPartialView();
    }

    abstract zkd<K, V> map();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return map().size();
    }

    @Override // com.google.common.collect.vep5, com.google.common.collect.z4
    @wlev.zy
    Object writeReplace() {
        return new C4323k(map());
    }
}
