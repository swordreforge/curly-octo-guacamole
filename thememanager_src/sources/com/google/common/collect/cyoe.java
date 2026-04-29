package com.google.common.collect;

import com.google.common.collect.qh4d;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: RegularImmutableTable.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
abstract class cyoe<R, C, V> extends ukdy<R, C, V> {

    /* JADX INFO: renamed from: com.google.common.collect.cyoe$k */
    /* JADX INFO: compiled from: RegularImmutableTable.java */
    static class C4332k implements Comparator<qh4d.InterfaceC4517k<R, C, V>> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Comparator f26032k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ Comparator f26033q;

        C4332k(Comparator comparator, Comparator comparator2) {
            this.f26032k = comparator;
            this.f26033q = comparator2;
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public int compare(qh4d.InterfaceC4517k<R, C, V> interfaceC4517k, qh4d.InterfaceC4517k<R, C, V> interfaceC4517k2) {
            Comparator comparator = this.f26032k;
            int iCompare = comparator == null ? 0 : comparator.compare(interfaceC4517k.getRowKey(), interfaceC4517k2.getRowKey());
            if (iCompare != 0) {
                return iCompare;
            }
            Comparator comparator2 = this.f26033q;
            if (comparator2 == null) {
                return 0;
            }
            return comparator2.compare(interfaceC4517k.getColumnKey(), interfaceC4517k2.getColumnKey());
        }
    }

    /* JADX INFO: compiled from: RegularImmutableTable.java */
    private final class toq extends ebn<qh4d.InterfaceC4517k<R, C, V>> {
        private toq() {
        }

        @Override // com.google.common.collect.z4, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.o05
        public boolean contains(@NullableDecl Object obj) {
            if (!(obj instanceof qh4d.InterfaceC4517k)) {
                return false;
            }
            qh4d.InterfaceC4517k interfaceC4517k = (qh4d.InterfaceC4517k) obj;
            Object obj2 = cyoe.this.get(interfaceC4517k.getRowKey(), interfaceC4517k.getColumnKey());
            return obj2 != null && obj2.equals(interfaceC4517k.getValue());
        }

        @Override // com.google.common.collect.z4
        boolean isPartialView() {
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return cyoe.this.size();
        }

        /* synthetic */ toq(cyoe cyoeVar, C4332k c4332k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.ebn
        public qh4d.InterfaceC4517k<R, C, V> get(int i2) {
            return cyoe.this.getCell(i2);
        }
    }

    /* JADX INFO: compiled from: RegularImmutableTable.java */
    private final class zy extends se<V> {
        private zy() {
        }

        @Override // java.util.List
        public V get(int i2) {
            return (V) cyoe.this.getValue(i2);
        }

        @Override // com.google.common.collect.z4
        boolean isPartialView() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return cyoe.this.size();
        }

        /* synthetic */ zy(cyoe cyoeVar, C4332k c4332k) {
            this();
        }
    }

    cyoe() {
    }

    static <R, C, V> cyoe<R, C, V> forCells(List<qh4d.InterfaceC4517k<R, C, V>> list, @NullableDecl Comparator<? super R> comparator, @NullableDecl Comparator<? super C> comparator2) {
        com.google.common.base.jk.a9(list);
        if (comparator != null || comparator2 != null) {
            Collections.sort(list, new C4332k(comparator, comparator2));
        }
        return toq(list, comparator, comparator2);
    }

    static <R, C, V> cyoe<R, C, V> forOrderedComponents(se<qh4d.InterfaceC4517k<R, C, V>> seVar, vep5<R> vep5Var, vep5<C> vep5Var2) {
        return ((long) seVar.size()) > (((long) vep5Var.size()) * ((long) vep5Var2.size())) / 2 ? new C4437l(seVar, vep5Var, vep5Var2) : new mj(seVar, vep5Var, vep5Var2);
    }

    private static <R, C, V> cyoe<R, C, V> toq(Iterable<qh4d.InterfaceC4517k<R, C, V>> iterable, @NullableDecl Comparator<? super R> comparator, @NullableDecl Comparator<? super C> comparator2) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        se seVarCopyOf = se.copyOf(iterable);
        for (qh4d.InterfaceC4517k<R, C, V> interfaceC4517k : iterable) {
            linkedHashSet.add(interfaceC4517k.getRowKey());
            linkedHashSet2.add(interfaceC4517k.getColumnKey());
        }
        return forOrderedComponents(seVarCopyOf, comparator == null ? vep5.copyOf((Collection) linkedHashSet) : vep5.copyOf((Collection) se.sortedCopyOf(comparator, linkedHashSet)), comparator2 == null ? vep5.copyOf((Collection) linkedHashSet2) : vep5.copyOf((Collection) se.sortedCopyOf(comparator2, linkedHashSet2)));
    }

    final void checkNoDuplicate(R r2, C c2, V v2, V v3) {
        com.google.common.base.jk.wvg(v2 == null, "Duplicate key: (row=%s, column=%s), values: [%s, %s].", r2, c2, v3, v2);
    }

    abstract qh4d.InterfaceC4517k<R, C, V> getCell(int i2);

    abstract V getValue(int i2);

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.ukdy, com.google.common.collect.cdj
    public final vep5<qh4d.InterfaceC4517k<R, C, V>> createCellSet() {
        return isEmpty() ? vep5.of() : new toq(this, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.ukdy, com.google.common.collect.cdj
    public final z4<V> createValues() {
        return isEmpty() ? se.of() : new zy(this, null);
    }

    static <R, C, V> cyoe<R, C, V> forCells(Iterable<qh4d.InterfaceC4517k<R, C, V>> iterable) {
        return toq(iterable, null, null);
    }
}
