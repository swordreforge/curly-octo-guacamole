package com.google.common.collect;

import com.google.common.collect.qh4d;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.AbstractCollection;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: AbstractTable.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
abstract class cdj<R, C, V> implements qh4d<R, C, V> {

    /* JADX INFO: renamed from: k */
    @MonotonicNonNullDecl
    private transient Set<qh4d.InterfaceC4517k<R, C, V>> f26019k;

    /* JADX INFO: renamed from: q */
    @MonotonicNonNullDecl
    private transient Collection<V> f26020q;

    /* JADX INFO: renamed from: com.google.common.collect.cdj$k */
    /* JADX INFO: compiled from: AbstractTable.java */
    class C4325k extends pnt2<qh4d.InterfaceC4517k<R, C, V>, V> {
        C4325k(Iterator it) {
            super(it);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.pnt2
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public V mo15580k(qh4d.InterfaceC4517k<R, C, V> interfaceC4517k) {
            return interfaceC4517k.getValue();
        }
    }

    /* JADX INFO: compiled from: AbstractTable.java */
    class toq extends AbstractSet<qh4d.InterfaceC4517k<R, C, V>> {
        toq() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            cdj.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof qh4d.InterfaceC4517k)) {
                return false;
            }
            qh4d.InterfaceC4517k interfaceC4517k = (qh4d.InterfaceC4517k) obj;
            Map map = (Map) vy.ch(cdj.this.rowMap(), interfaceC4517k.getRowKey());
            return map != null && mcp.ld6(map.entrySet(), vy.dd(interfaceC4517k.getColumnKey(), interfaceC4517k.getValue()));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<qh4d.InterfaceC4517k<R, C, V>> iterator() {
            return cdj.this.cellIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@NullableDecl Object obj) {
            if (!(obj instanceof qh4d.InterfaceC4517k)) {
                return false;
            }
            qh4d.InterfaceC4517k interfaceC4517k = (qh4d.InterfaceC4517k) obj;
            Map map = (Map) vy.ch(cdj.this.rowMap(), interfaceC4517k.getRowKey());
            return map != null && mcp.x2(map.entrySet(), vy.dd(interfaceC4517k.getColumnKey(), interfaceC4517k.getValue()));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return cdj.this.size();
        }
    }

    /* JADX INFO: compiled from: AbstractTable.java */
    class zy extends AbstractCollection<V> {
        zy() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            cdj.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return cdj.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return cdj.this.valuesIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return cdj.this.size();
        }
    }

    cdj() {
    }

    abstract Iterator<qh4d.InterfaceC4517k<R, C, V>> cellIterator();

    @Override // com.google.common.collect.qh4d
    public Set<qh4d.InterfaceC4517k<R, C, V>> cellSet() {
        Set<qh4d.InterfaceC4517k<R, C, V>> set = this.f26019k;
        if (set != null) {
            return set;
        }
        Set<qh4d.InterfaceC4517k<R, C, V>> setCreateCellSet = createCellSet();
        this.f26019k = setCreateCellSet;
        return setCreateCellSet;
    }

    @Override // com.google.common.collect.qh4d
    public void clear() {
        zwy.m16135y(cellSet().iterator());
    }

    @Override // com.google.common.collect.qh4d
    public Set<C> columnKeySet() {
        return columnMap().keySet();
    }

    @Override // com.google.common.collect.qh4d
    public boolean contains(@NullableDecl Object obj, @NullableDecl Object obj2) {
        Map map = (Map) vy.ch(rowMap(), obj);
        return map != null && vy.m16030x(map, obj2);
    }

    @Override // com.google.common.collect.qh4d
    public boolean containsColumn(@NullableDecl Object obj) {
        return vy.m16030x(columnMap(), obj);
    }

    @Override // com.google.common.collect.qh4d
    public boolean containsRow(@NullableDecl Object obj) {
        return vy.m16030x(rowMap(), obj);
    }

    @Override // com.google.common.collect.qh4d
    public boolean containsValue(@NullableDecl Object obj) {
        Iterator<Map<C, V>> it = rowMap().values().iterator();
        while (it.hasNext()) {
            if (it.next().containsValue(obj)) {
                return true;
            }
        }
        return false;
    }

    Set<qh4d.InterfaceC4517k<R, C, V>> createCellSet() {
        return new toq();
    }

    Collection<V> createValues() {
        return new zy();
    }

    @Override // com.google.common.collect.qh4d
    public boolean equals(@NullableDecl Object obj) {
        return hyow.toq(this, obj);
    }

    @Override // com.google.common.collect.qh4d
    public V get(@NullableDecl Object obj, @NullableDecl Object obj2) {
        Map map = (Map) vy.ch(rowMap(), obj);
        if (map == null) {
            return null;
        }
        return (V) vy.ch(map, obj2);
    }

    @Override // com.google.common.collect.qh4d
    public int hashCode() {
        return cellSet().hashCode();
    }

    @Override // com.google.common.collect.qh4d
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // com.google.common.collect.qh4d
    @CanIgnoreReturnValue
    public V put(R r2, C c2, V v2) {
        return row(r2).put(c2, v2);
    }

    @Override // com.google.common.collect.qh4d
    public void putAll(qh4d<? extends R, ? extends C, ? extends V> qh4dVar) {
        for (qh4d.InterfaceC4517k<? extends R, ? extends C, ? extends V> interfaceC4517k : qh4dVar.cellSet()) {
            put(interfaceC4517k.getRowKey(), interfaceC4517k.getColumnKey(), interfaceC4517k.getValue());
        }
    }

    @Override // com.google.common.collect.qh4d
    @CanIgnoreReturnValue
    public V remove(@NullableDecl Object obj, @NullableDecl Object obj2) {
        Map map = (Map) vy.ch(rowMap(), obj);
        if (map == null) {
            return null;
        }
        return (V) vy.nmn5(map, obj2);
    }

    @Override // com.google.common.collect.qh4d
    public Set<R> rowKeySet() {
        return rowMap().keySet();
    }

    public String toString() {
        return rowMap().toString();
    }

    @Override // com.google.common.collect.qh4d
    public Collection<V> values() {
        Collection<V> collection = this.f26020q;
        if (collection != null) {
            return collection;
        }
        Collection<V> collectionCreateValues = createValues();
        this.f26020q = collectionCreateValues;
        return collectionCreateValues;
    }

    Iterator<V> valuesIterator() {
        return new C4325k(cellSet().iterator());
    }
}
