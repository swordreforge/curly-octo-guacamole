package com.google.common.collect;

import com.google.common.collect.qh4d;
import com.google.common.collect.ukdy;
import com.google.common.collect.zkd;
import com.google.errorprone.annotations.Immutable;
import java.lang.reflect.Array;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: renamed from: com.google.common.collect.l */
/* JADX INFO: compiled from: DenseImmutableTable.java */
/* JADX INFO: loaded from: classes2.dex */
@Immutable(containerOf = {"R", com.market.sdk.reflect.toq.f28134q, "V"})
@wlev.toq
final class C4437l<R, C, V> extends cyoe<R, C, V> {
    private final int[] cellColumnIndices;
    private final int[] cellRowIndices;
    private final int[] columnCounts;
    private final zkd<C, Integer> columnKeyToIndex;
    private final zkd<C, zkd<R, V>> columnMap;
    private final int[] rowCounts;
    private final zkd<R, Integer> rowKeyToIndex;
    private final zkd<R, zkd<C, V>> rowMap;
    private final V[][] values;

    /* JADX INFO: renamed from: com.google.common.collect.l$g */
    /* JADX INFO: compiled from: DenseImmutableTable.java */
    private final class g extends q<R, zkd<C, V>> {
        @Override // com.google.common.collect.zkd
        boolean isPartialView() {
            return false;
        }

        @Override // com.google.common.collect.C4437l.q
        zkd<R, Integer> keyToIndex() {
            return C4437l.this.rowKeyToIndex;
        }

        private g() {
            super(C4437l.this.rowCounts.length);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.C4437l.q
        public zkd<C, V> getValue(int i2) {
            return new n(i2);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.l$n */
    /* JADX INFO: compiled from: DenseImmutableTable.java */
    private final class n extends q<C, V> {
        private final int rowIndex;

        n(int i2) {
            super(C4437l.this.rowCounts[i2]);
            this.rowIndex = i2;
        }

        @Override // com.google.common.collect.C4437l.q
        V getValue(int i2) {
            return (V) C4437l.this.values[this.rowIndex][i2];
        }

        @Override // com.google.common.collect.zkd
        boolean isPartialView() {
            return true;
        }

        @Override // com.google.common.collect.C4437l.q
        zkd<C, Integer> keyToIndex() {
            return C4437l.this.columnKeyToIndex;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.l$q */
    /* JADX INFO: compiled from: DenseImmutableTable.java */
    private static abstract class q<K, V> extends zkd.zy<K, V> {
        private final int size;

        /* JADX INFO: renamed from: com.google.common.collect.l$q$k */
        /* JADX INFO: compiled from: DenseImmutableTable.java */
        class k extends com.google.common.collect.zy<Map.Entry<K, V>> {

            /* JADX INFO: renamed from: g */
            private final int f26292g;

            /* JADX INFO: renamed from: n */
            private int f26293n = -1;

            k() {
                this.f26292g = q.this.keyToIndex().size();
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.zy
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> mo15703k() {
                int i2 = this.f26293n;
                while (true) {
                    this.f26293n = i2 + 1;
                    int i3 = this.f26293n;
                    if (i3 >= this.f26292g) {
                        return toq();
                    }
                    Object value = q.this.getValue(i3);
                    if (value != null) {
                        return vy.dd(q.this.getKey(this.f26293n), value);
                    }
                    i2 = this.f26293n;
                }
            }
        }

        q(int i2) {
            this.size = i2;
        }

        /* JADX INFO: renamed from: k */
        private boolean m15783k() {
            return this.size == keyToIndex().size();
        }

        @Override // com.google.common.collect.zkd.zy, com.google.common.collect.zkd
        vep5<K> createKeySet() {
            return m15783k() ? keyToIndex().keySet() : super.createKeySet();
        }

        @Override // com.google.common.collect.zkd.zy
        ab<Map.Entry<K, V>> entryIterator() {
            return new k();
        }

        @Override // com.google.common.collect.zkd, java.util.Map
        public V get(@NullableDecl Object obj) {
            Integer num = keyToIndex().get(obj);
            if (num == null) {
                return null;
            }
            return getValue(num.intValue());
        }

        K getKey(int i2) {
            return keyToIndex().keySet().asList().get(i2);
        }

        @NullableDecl
        abstract V getValue(int i2);

        abstract zkd<K, Integer> keyToIndex();

        @Override // java.util.Map
        public int size() {
            return this.size;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.l$toq */
    /* JADX INFO: compiled from: DenseImmutableTable.java */
    private final class toq extends q<R, V> {
        private final int columnIndex;

        toq(int i2) {
            super(C4437l.this.columnCounts[i2]);
            this.columnIndex = i2;
        }

        @Override // com.google.common.collect.C4437l.q
        V getValue(int i2) {
            return (V) C4437l.this.values[i2][this.columnIndex];
        }

        @Override // com.google.common.collect.zkd
        boolean isPartialView() {
            return true;
        }

        @Override // com.google.common.collect.C4437l.q
        zkd<R, Integer> keyToIndex() {
            return C4437l.this.rowKeyToIndex;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.l$zy */
    /* JADX INFO: compiled from: DenseImmutableTable.java */
    private final class zy extends q<C, zkd<R, V>> {
        @Override // com.google.common.collect.zkd
        boolean isPartialView() {
            return false;
        }

        @Override // com.google.common.collect.C4437l.q
        zkd<C, Integer> keyToIndex() {
            return C4437l.this.columnKeyToIndex;
        }

        private zy() {
            super(C4437l.this.columnCounts.length);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.C4437l.q
        public zkd<R, V> getValue(int i2) {
            return new toq(i2);
        }
    }

    C4437l(se<qh4d.InterfaceC4517k<R, C, V>> seVar, vep5<R> vep5Var, vep5<C> vep5Var2) {
        this.values = (V[][]) ((Object[][]) Array.newInstance((Class<?>) Object.class, vep5Var.size(), vep5Var2.size()));
        zkd<R, Integer> zkdVarNcyb = vy.ncyb(vep5Var);
        this.rowKeyToIndex = zkdVarNcyb;
        zkd<C, Integer> zkdVarNcyb2 = vy.ncyb(vep5Var2);
        this.columnKeyToIndex = zkdVarNcyb2;
        this.rowCounts = new int[zkdVarNcyb.size()];
        this.columnCounts = new int[zkdVarNcyb2.size()];
        int[] iArr = new int[seVar.size()];
        int[] iArr2 = new int[seVar.size()];
        for (int i2 = 0; i2 < seVar.size(); i2++) {
            qh4d.InterfaceC4517k<R, C, V> interfaceC4517k = seVar.get(i2);
            R rowKey = interfaceC4517k.getRowKey();
            C columnKey = interfaceC4517k.getColumnKey();
            int iIntValue = this.rowKeyToIndex.get(rowKey).intValue();
            int iIntValue2 = this.columnKeyToIndex.get(columnKey).intValue();
            checkNoDuplicate(rowKey, columnKey, this.values[iIntValue][iIntValue2], interfaceC4517k.getValue());
            this.values[iIntValue][iIntValue2] = interfaceC4517k.getValue();
            int[] iArr3 = this.rowCounts;
            iArr3[iIntValue] = iArr3[iIntValue] + 1;
            int[] iArr4 = this.columnCounts;
            iArr4[iIntValue2] = iArr4[iIntValue2] + 1;
            iArr[i2] = iIntValue;
            iArr2[i2] = iIntValue2;
        }
        this.cellRowIndices = iArr;
        this.cellColumnIndices = iArr2;
        this.rowMap = new g();
        this.columnMap = new zy();
    }

    @Override // com.google.common.collect.ukdy
    ukdy.toq createSerializedForm() {
        return ukdy.toq.create(this, this.cellRowIndices, this.cellColumnIndices);
    }

    @Override // com.google.common.collect.ukdy, com.google.common.collect.cdj, com.google.common.collect.qh4d
    public V get(@NullableDecl Object obj, @NullableDecl Object obj2) {
        Integer num = this.rowKeyToIndex.get(obj);
        Integer num2 = this.columnKeyToIndex.get(obj2);
        if (num == null || num2 == null) {
            return null;
        }
        return this.values[num.intValue()][num2.intValue()];
    }

    @Override // com.google.common.collect.cyoe
    qh4d.InterfaceC4517k<R, C, V> getCell(int i2) {
        int i3 = this.cellRowIndices[i2];
        int i4 = this.cellColumnIndices[i2];
        return ukdy.cellOf(rowKeySet().asList().get(i3), columnKeySet().asList().get(i4), this.values[i3][i4]);
    }

    @Override // com.google.common.collect.cyoe
    V getValue(int i2) {
        return this.values[this.cellRowIndices[i2]][this.cellColumnIndices[i2]];
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
