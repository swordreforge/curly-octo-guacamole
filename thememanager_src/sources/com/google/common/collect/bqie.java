package com.google.common.collect;

import com.google.common.collect.qh4d;
import com.google.common.collect.ukdy;
import java.util.Map;

/* JADX INFO: compiled from: SingletonImmutableTable.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
class bqie<R, C, V> extends ukdy<R, C, V> {
    final C singleColumnKey;
    final R singleRowKey;
    final V singleValue;

    bqie(R r2, C c2, V v2) {
        this.singleRowKey = (R) com.google.common.base.jk.a9(r2);
        this.singleColumnKey = (C) com.google.common.base.jk.a9(c2);
        this.singleValue = (V) com.google.common.base.jk.a9(v2);
    }

    @Override // com.google.common.collect.ukdy
    ukdy.toq createSerializedForm() {
        return ukdy.toq.create(this, new int[]{0}, new int[]{0});
    }

    @Override // com.google.common.collect.qh4d
    public int size() {
        return 1;
    }

    @Override // com.google.common.collect.ukdy, com.google.common.collect.qh4d
    public zkd<R, V> column(C c2) {
        com.google.common.base.jk.a9(c2);
        return containsColumn(c2) ? zkd.of(this.singleRowKey, (Object) this.singleValue) : zkd.of();
    }

    @Override // com.google.common.collect.ukdy, com.google.common.collect.qh4d
    public zkd<C, Map<R, V>> columnMap() {
        return zkd.of(this.singleColumnKey, zkd.of(this.singleRowKey, (Object) this.singleValue));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.ukdy, com.google.common.collect.cdj
    public vep5<qh4d.InterfaceC4517k<R, C, V>> createCellSet() {
        return vep5.of(ukdy.cellOf(this.singleRowKey, this.singleColumnKey, this.singleValue));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.ukdy, com.google.common.collect.cdj
    public z4<V> createValues() {
        return vep5.of(this.singleValue);
    }

    @Override // com.google.common.collect.ukdy, com.google.common.collect.qh4d
    public zkd<R, Map<C, V>> rowMap() {
        return zkd.of(this.singleRowKey, zkd.of(this.singleColumnKey, (Object) this.singleValue));
    }

    bqie(qh4d.InterfaceC4517k<R, C, V> interfaceC4517k) {
        this(interfaceC4517k.getRowKey(), interfaceC4517k.getColumnKey(), interfaceC4517k.getValue());
    }
}
