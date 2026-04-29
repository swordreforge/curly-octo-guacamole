package com.google.common.collect;

import com.google.common.collect.hyow;
import com.google.common.collect.qh4d;
import com.google.common.collect.se;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: ImmutableTable.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
public abstract class ukdy<R, C, V> extends cdj<R, C, V> implements Serializable {

    /* JADX INFO: renamed from: com.google.common.collect.ukdy$k */
    /* JADX INFO: compiled from: ImmutableTable.java */
    public static final class C4530k<R, C, V> {

        /* JADX INFO: renamed from: k */
        private final List<qh4d.InterfaceC4517k<R, C, V>> f26602k = wlev.cdj();

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @MonotonicNonNullDecl
        private Comparator<? super R> f68230toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        @MonotonicNonNullDecl
        private Comparator<? super C> f68231zy;

        @CanIgnoreReturnValue
        /* JADX INFO: renamed from: g */
        public C4530k<R, C, V> m16000g(qh4d<? extends R, ? extends C, ? extends V> qh4dVar) {
            Iterator<qh4d.InterfaceC4517k<? extends R, ? extends C, ? extends V>> it = qh4dVar.cellSet().iterator();
            while (it.hasNext()) {
                m16003q(it.next());
            }
            return this;
        }

        /* JADX INFO: renamed from: k */
        public ukdy<R, C, V> m16001k() {
            int size = this.f26602k.size();
            return size != 0 ? size != 1 ? cyoe.forCells(this.f26602k, this.f68230toq, this.f68231zy) : new bqie((qh4d.InterfaceC4517k) nsb.o1t(this.f26602k)) : ukdy.of();
        }

        @CanIgnoreReturnValue
        /* JADX INFO: renamed from: n */
        public C4530k<R, C, V> m16002n(R r2, C c2, V v2) {
            this.f26602k.add(ukdy.cellOf(r2, c2, v2));
            return this;
        }

        @CanIgnoreReturnValue
        /* JADX INFO: renamed from: q */
        public C4530k<R, C, V> m16003q(qh4d.InterfaceC4517k<? extends R, ? extends C, ? extends V> interfaceC4517k) {
            if (interfaceC4517k instanceof hyow.zy) {
                com.google.common.base.jk.fti(interfaceC4517k.getRowKey(), "row");
                com.google.common.base.jk.fti(interfaceC4517k.getColumnKey(), "column");
                com.google.common.base.jk.fti(interfaceC4517k.getValue(), "value");
                this.f26602k.add(interfaceC4517k);
            } else {
                m16002n(interfaceC4517k.getRowKey(), interfaceC4517k.getColumnKey(), interfaceC4517k.getValue());
            }
            return this;
        }

        @CanIgnoreReturnValue
        public C4530k<R, C, V> toq(Comparator<? super C> comparator) {
            this.f68231zy = (Comparator) com.google.common.base.jk.fti(comparator, "columnComparator");
            return this;
        }

        @CanIgnoreReturnValue
        public C4530k<R, C, V> zy(Comparator<? super R> comparator) {
            this.f68230toq = (Comparator) com.google.common.base.jk.fti(comparator, "rowComparator");
            return this;
        }
    }

    /* JADX INFO: compiled from: ImmutableTable.java */
    static final class toq implements Serializable {
        private static final long serialVersionUID = 0;
        private final int[] cellColumnIndices;
        private final int[] cellRowIndices;
        private final Object[] cellValues;
        private final Object[] columnKeys;
        private final Object[] rowKeys;

        private toq(Object[] objArr, Object[] objArr2, Object[] objArr3, int[] iArr, int[] iArr2) {
            this.rowKeys = objArr;
            this.columnKeys = objArr2;
            this.cellValues = objArr3;
            this.cellRowIndices = iArr;
            this.cellColumnIndices = iArr2;
        }

        static toq create(ukdy<?, ?, ?> ukdyVar, int[] iArr, int[] iArr2) {
            return new toq(ukdyVar.rowKeySet().toArray(), ukdyVar.columnKeySet().toArray(), ukdyVar.values().toArray(), iArr, iArr2);
        }

        Object readResolve() {
            Object[] objArr = this.cellValues;
            if (objArr.length == 0) {
                return ukdy.of();
            }
            int i2 = 0;
            if (objArr.length == 1) {
                return ukdy.of(this.rowKeys[0], this.columnKeys[0], objArr[0]);
            }
            se.C4520k c4520k = new se.C4520k(objArr.length);
            while (true) {
                Object[] objArr2 = this.cellValues;
                if (i2 >= objArr2.length) {
                    return cyoe.forOrderedComponents(c4520k.mo15570n(), vep5.copyOf(this.rowKeys), vep5.copyOf(this.columnKeys));
                }
                c4520k.mo15569k(ukdy.cellOf(this.rowKeys[this.cellRowIndices[i2]], this.columnKeys[this.cellColumnIndices[i2]], objArr2[i2]));
                i2++;
            }
        }
    }

    ukdy() {
    }

    public static <R, C, V> C4530k<R, C, V> builder() {
        return new C4530k<>();
    }

    static <R, C, V> qh4d.InterfaceC4517k<R, C, V> cellOf(R r2, C c2, V v2) {
        return hyow.zy(com.google.common.base.jk.fti(r2, "rowKey"), com.google.common.base.jk.fti(c2, "columnKey"), com.google.common.base.jk.fti(v2, "value"));
    }

    public static <R, C, V> ukdy<R, C, V> copyOf(qh4d<? extends R, ? extends C, ? extends V> qh4dVar) {
        return qh4dVar instanceof ukdy ? (ukdy) qh4dVar : m15999k(qh4dVar.cellSet());
    }

    /* JADX INFO: renamed from: k */
    private static <R, C, V> ukdy<R, C, V> m15999k(Iterable<? extends qh4d.InterfaceC4517k<? extends R, ? extends C, ? extends V>> iterable) {
        C4530k c4530kBuilder = builder();
        Iterator<? extends qh4d.InterfaceC4517k<? extends R, ? extends C, ? extends V>> it = iterable.iterator();
        while (it.hasNext()) {
            c4530kBuilder.m16003q(it.next());
        }
        return c4530kBuilder.m16001k();
    }

    public static <R, C, V> ukdy<R, C, V> of() {
        return (ukdy<R, C, V>) mj.EMPTY;
    }

    @Override // com.google.common.collect.cdj, com.google.common.collect.qh4d
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.qh4d
    public abstract zkd<C, Map<R, V>> columnMap();

    @Override // com.google.common.collect.cdj, com.google.common.collect.qh4d
    public boolean contains(@NullableDecl Object obj, @NullableDecl Object obj2) {
        return get(obj, obj2) != null;
    }

    @Override // com.google.common.collect.cdj, com.google.common.collect.qh4d
    public /* bridge */ /* synthetic */ boolean containsColumn(@NullableDecl Object obj) {
        return super.containsColumn(obj);
    }

    @Override // com.google.common.collect.cdj, com.google.common.collect.qh4d
    public /* bridge */ /* synthetic */ boolean containsRow(@NullableDecl Object obj) {
        return super.containsRow(obj);
    }

    @Override // com.google.common.collect.cdj, com.google.common.collect.qh4d
    public boolean containsValue(@NullableDecl Object obj) {
        return values().contains(obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.cdj
    public abstract vep5<qh4d.InterfaceC4517k<R, C, V>> createCellSet();

    abstract toq createSerializedForm();

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.cdj
    public abstract z4<V> createValues();

    @Override // com.google.common.collect.cdj, com.google.common.collect.qh4d
    public /* bridge */ /* synthetic */ boolean equals(@NullableDecl Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.common.collect.cdj, com.google.common.collect.qh4d
    public /* bridge */ /* synthetic */ Object get(@NullableDecl Object obj, @NullableDecl Object obj2) {
        return super.get(obj, obj2);
    }

    @Override // com.google.common.collect.cdj, com.google.common.collect.qh4d
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.cdj, com.google.common.collect.qh4d
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // com.google.common.collect.cdj, com.google.common.collect.qh4d
    @CanIgnoreReturnValue
    @Deprecated
    public final V put(R r2, C c2, V v2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.cdj, com.google.common.collect.qh4d
    @Deprecated
    public final void putAll(qh4d<? extends R, ? extends C, ? extends V> qh4dVar) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.cdj, com.google.common.collect.qh4d
    @CanIgnoreReturnValue
    @Deprecated
    public final V remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.qh4d
    public abstract zkd<R, Map<C, V>> rowMap();

    @Override // com.google.common.collect.cdj
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // com.google.common.collect.cdj
    final Iterator<V> valuesIterator() {
        throw new AssertionError("should never be called");
    }

    final Object writeReplace() {
        return createSerializedForm();
    }

    public static <R, C, V> ukdy<R, C, V> of(R r2, C c2, V v2) {
        return new bqie(r2, c2, v2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.cdj
    public final ab<qh4d.InterfaceC4517k<R, C, V>> cellIterator() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.cdj, com.google.common.collect.qh4d
    public vep5<qh4d.InterfaceC4517k<R, C, V>> cellSet() {
        return (vep5) super.cellSet();
    }

    @Override // com.google.common.collect.qh4d
    public zkd<R, V> column(C c2) {
        com.google.common.base.jk.fti(c2, "columnKey");
        return (zkd) com.google.common.base.fu4.m15351k((zkd) columnMap().get(c2), zkd.of());
    }

    @Override // com.google.common.collect.cdj, com.google.common.collect.qh4d
    public vep5<C> columnKeySet() {
        return columnMap().keySet();
    }

    @Override // com.google.common.collect.qh4d
    public zkd<C, V> row(R r2) {
        com.google.common.base.jk.fti(r2, "rowKey");
        return (zkd) com.google.common.base.fu4.m15351k((zkd) rowMap().get(r2), zkd.of());
    }

    @Override // com.google.common.collect.cdj, com.google.common.collect.qh4d
    public vep5<R> rowKeySet() {
        return rowMap().keySet();
    }

    @Override // com.google.common.collect.cdj, com.google.common.collect.qh4d
    public z4<V> values() {
        return (z4) super.values();
    }
}
