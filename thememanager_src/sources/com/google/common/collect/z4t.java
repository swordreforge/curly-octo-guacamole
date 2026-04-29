package com.google.common.collect;

import com.google.common.collect.ec;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import wlev.InterfaceC7732q;

/* JADX INFO: compiled from: RegularImmutableBiMap.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq(emulated = true, serializable = true)
final class z4t<K, V> extends cfr<K, V> {
    static final z4t<Object, Object> EMPTY = new z4t<>();

    @InterfaceC7732q
    final transient Object[] alternatingKeysAndValues;

    /* JADX INFO: renamed from: h */
    private final transient z4t<V, K> f26751h;

    /* JADX INFO: renamed from: p */
    private final transient int f26752p;

    /* JADX INFO: renamed from: s */
    private final transient int f26753s;

    /* JADX INFO: renamed from: y */
    private final transient int[] f26754y;

    /* JADX WARN: Multi-variable type inference failed */
    private z4t() {
        this.f26754y = null;
        this.alternatingKeysAndValues = new Object[0];
        this.f26753s = 0;
        this.f26752p = 0;
        this.f26751h = this;
    }

    @Override // com.google.common.collect.zkd
    vep5<Map.Entry<K, V>> createEntrySet() {
        return new ec.C4355k(this, this.alternatingKeysAndValues, this.f26753s, this.f26752p);
    }

    @Override // com.google.common.collect.zkd
    vep5<K> createKeySet() {
        return new ec.toq(this, new ec.zy(this.alternatingKeysAndValues, this.f26753s, this.f26752p));
    }

    @Override // com.google.common.collect.zkd, java.util.Map
    public V get(@NullableDecl Object obj) {
        return (V) ec.get(this.f26754y, this.alternatingKeysAndValues, this.f26752p, this.f26753s, obj);
    }

    @Override // com.google.common.collect.zkd
    boolean isPartialView() {
        return false;
    }

    @Override // java.util.Map
    public int size() {
        return this.f26752p;
    }

    @Override // com.google.common.collect.cfr, com.google.common.collect.ni7
    public cfr<V, K> inverse() {
        return this.f26751h;
    }

    z4t(Object[] objArr, int i2) {
        this.alternatingKeysAndValues = objArr;
        this.f26752p = i2;
        this.f26753s = 0;
        int iChooseTableSize = i2 >= 2 ? vep5.chooseTableSize(i2) : 0;
        this.f26754y = ec.createHashTable(objArr, i2, iChooseTableSize, 0);
        this.f26751h = new z4t<>(ec.createHashTable(objArr, i2, iChooseTableSize, 1), objArr, i2, this);
    }

    private z4t(int[] iArr, Object[] objArr, int i2, z4t<V, K> z4tVar) {
        this.f26754y = iArr;
        this.alternatingKeysAndValues = objArr;
        this.f26753s = 1;
        this.f26752p = i2;
        this.f26751h = z4tVar;
    }
}
