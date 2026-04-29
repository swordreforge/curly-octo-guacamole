package com.google.common.collect;

import com.google.common.collect.qh4d;
import com.google.common.collect.ukdy;
import com.google.common.collect.zkd;
import com.google.errorprone.annotations.Immutable;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: SparseImmutableTable.java */
/* JADX INFO: loaded from: classes2.dex */
@Immutable(containerOf = {"R", com.market.sdk.reflect.toq.f28134q, "V"})
@wlev.toq
final class mj<R, C, V> extends cyoe<R, C, V> {
    static final ukdy<Object, Object, Object> EMPTY = new mj(se.of(), vep5.of(), vep5.of());
    private final int[] cellColumnInRowIndices;
    private final int[] cellRowIndices;
    private final zkd<C, zkd<R, V>> columnMap;
    private final zkd<R, zkd<C, V>> rowMap;

    /* JADX WARN: Multi-variable type inference failed */
    mj(se<qh4d.InterfaceC4517k<R, C, V>> seVar, vep5<R> vep5Var, vep5<C> vep5Var2) {
        zkd zkdVarNcyb = vy.ncyb(vep5Var);
        LinkedHashMap linkedHashMapM16017j = vy.m16017j();
        ab<R> it = vep5Var.iterator();
        while (it.hasNext()) {
            linkedHashMapM16017j.put(it.next(), new LinkedHashMap());
        }
        LinkedHashMap linkedHashMapM16017j2 = vy.m16017j();
        ab<C> it2 = vep5Var2.iterator();
        while (it2.hasNext()) {
            linkedHashMapM16017j2.put(it2.next(), new LinkedHashMap());
        }
        int[] iArr = new int[seVar.size()];
        int[] iArr2 = new int[seVar.size()];
        for (int i2 = 0; i2 < seVar.size(); i2++) {
            qh4d.InterfaceC4517k<R, C, V> interfaceC4517k = seVar.get(i2);
            R rowKey = interfaceC4517k.getRowKey();
            C columnKey = interfaceC4517k.getColumnKey();
            V value = interfaceC4517k.getValue();
            iArr[i2] = ((Integer) zkdVarNcyb.get(rowKey)).intValue();
            Map map = (Map) linkedHashMapM16017j.get(rowKey);
            iArr2[i2] = map.size();
            checkNoDuplicate(rowKey, columnKey, map.put(columnKey, value), value);
            ((Map) linkedHashMapM16017j2.get(columnKey)).put(rowKey, value);
        }
        this.cellRowIndices = iArr;
        this.cellColumnInRowIndices = iArr2;
        zkd.toq toqVar = new zkd.toq(linkedHashMapM16017j.size());
        for (Map.Entry entry : linkedHashMapM16017j.entrySet()) {
            toqVar.mo15592q(entry.getKey(), zkd.copyOf((Map) entry.getValue()));
        }
        this.rowMap = toqVar.mo15589k();
        zkd.toq toqVar2 = new zkd.toq(linkedHashMapM16017j2.size());
        for (Map.Entry entry2 : linkedHashMapM16017j2.entrySet()) {
            toqVar2.mo15592q(entry2.getKey(), zkd.copyOf((Map) entry2.getValue()));
        }
        this.columnMap = toqVar2.mo15589k();
    }

    @Override // com.google.common.collect.ukdy
    ukdy.toq createSerializedForm() {
        zkd zkdVarNcyb = vy.ncyb(columnKeySet());
        int[] iArr = new int[cellSet().size()];
        ab<qh4d.InterfaceC4517k<R, C, V>> it = cellSet().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            iArr[i2] = ((Integer) zkdVarNcyb.get(it.next().getColumnKey())).intValue();
            i2++;
        }
        return ukdy.toq.create(this, this.cellRowIndices, iArr);
    }

    @Override // com.google.common.collect.cyoe
    qh4d.InterfaceC4517k<R, C, V> getCell(int i2) {
        Map.Entry<R, zkd<C, V>> entry = this.rowMap.entrySet().asList().get(this.cellRowIndices[i2]);
        zkd<C, V> value = entry.getValue();
        Map.Entry<C, V> entry2 = value.entrySet().asList().get(this.cellColumnInRowIndices[i2]);
        return ukdy.cellOf(entry.getKey(), entry2.getKey(), entry2.getValue());
    }

    @Override // com.google.common.collect.cyoe
    V getValue(int i2) {
        zkd<C, V> zkdVar = this.rowMap.values().asList().get(this.cellRowIndices[i2]);
        return zkdVar.values().asList().get(this.cellColumnInRowIndices[i2]);
    }

    @Override // com.google.common.collect.qh4d
    public int size() {
        return this.cellRowIndices.length;
    }

    @Override // com.google.common.collect.ukdy, com.google.common.collect.qh4d
    public zkd<C, Map<R, V>> columnMap() {
        return zkd.copyOf((Map) this.columnMap);
    }

    @Override // com.google.common.collect.ukdy, com.google.common.collect.qh4d
    public zkd<R, Map<C, V>> rowMap() {
        return zkd.copyOf((Map) this.rowMap);
    }
}
