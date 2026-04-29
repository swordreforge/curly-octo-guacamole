package com.google.common.collect;

import com.google.common.collect.vy;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: TreeBasedTable.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq(serializable = true)
public class mi1u<R, C, V> extends cn02<R, C, V> {
    private static final long serialVersionUID = 0;
    private final Comparator<? super C> columnComparator;

    /* JADX INFO: renamed from: com.google.common.collect.mi1u$k */
    /* JADX INFO: compiled from: TreeBasedTable.java */
    class C4466k implements com.google.common.base.t8r<Map<C, V>, Iterator<C>> {
        C4466k() {
        }

        @Override // com.google.common.base.t8r
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Iterator<C> apply(Map<C, V> map) {
            return map.keySet().iterator();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.mi1u$q */
    /* JADX INFO: compiled from: TreeBasedTable.java */
    private class C4467q extends ovdh<R, C, V>.f7l8 implements SortedMap<C, V> {

        /* JADX INFO: renamed from: g */
        @NullableDecl
        final C f26419g;

        /* JADX INFO: renamed from: s */
        @NullableDecl
        transient SortedMap<C, V> f26421s;

        /* JADX INFO: renamed from: y */
        @NullableDecl
        final C f26422y;

        C4467q(mi1u mi1uVar, R r2) {
            this(r2, null, null);
        }

        @Override // java.util.SortedMap
        public Comparator<? super C> comparator() {
            return mi1u.this.columnComparator();
        }

        @Override // com.google.common.collect.ovdh.f7l8, java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return x2(obj) && super.containsKey(obj);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.ovdh.f7l8
        /* JADX INFO: renamed from: f7l8, reason: merged with bridge method [inline-methods] */
        public SortedMap<C, V> toq() {
            return (SortedMap) super.toq();
        }

        @Override // java.util.SortedMap
        public C firstKey() {
            if (toq() != null) {
                return toq().firstKey();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.SortedMap
        public SortedMap<C, V> headMap(C c2) {
            com.google.common.base.jk.m15383q(x2(com.google.common.base.jk.a9(c2)));
            return new C4467q(this.f26521k, this.f26419g, c2);
        }

        @Override // java.util.SortedMap
        public C lastKey() {
            if (toq() != null) {
                return toq().lastKey();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
        /* JADX INFO: renamed from: ld6, reason: merged with bridge method [inline-methods] */
        public SortedSet<C> keySet() {
            return new vy.jp0y(this);
        }

        SortedMap<C, V> n7h() {
            SortedMap<C, V> sortedMap = this.f26421s;
            if (sortedMap == null || (sortedMap.isEmpty() && mi1u.this.backingMap.containsKey(this.f26521k))) {
                this.f26421s = (SortedMap) mi1u.this.backingMap.get(this.f26521k);
            }
            return this.f26421s;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.ovdh.f7l8
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public SortedMap<C, V> zy() {
            SortedMap<C, V> sortedMapN7h = n7h();
            if (sortedMapN7h == null) {
                return null;
            }
            C c2 = this.f26419g;
            if (c2 != null) {
                sortedMapN7h = sortedMapN7h.tailMap(c2);
            }
            C c3 = this.f26422y;
            return c3 != null ? sortedMapN7h.headMap(c3) : sortedMapN7h;
        }

        @Override // com.google.common.collect.ovdh.f7l8, java.util.AbstractMap, java.util.Map
        public V put(C c2, V v2) {
            com.google.common.base.jk.m15383q(x2(com.google.common.base.jk.a9(c2)));
            return (V) super.put(c2, v2);
        }

        @Override // com.google.common.collect.ovdh.f7l8
        /* JADX INFO: renamed from: q */
        void mo15874q() {
            if (n7h() == null || !this.f26421s.isEmpty()) {
                return;
            }
            mi1u.this.backingMap.remove(this.f26521k);
            this.f26421s = null;
            this.f26523q = null;
        }

        @Override // java.util.SortedMap
        public SortedMap<C, V> subMap(C c2, C c3) {
            com.google.common.base.jk.m15383q(x2(com.google.common.base.jk.a9(c2)) && x2(com.google.common.base.jk.a9(c3)));
            return new C4467q(this.f26521k, c2, c3);
        }

        @Override // java.util.SortedMap
        public SortedMap<C, V> tailMap(C c2) {
            com.google.common.base.jk.m15383q(x2(com.google.common.base.jk.a9(c2)));
            return new C4467q(this.f26521k, c2, this.f26422y);
        }

        boolean x2(@NullableDecl Object obj) {
            C c2;
            C c3;
            return obj != null && ((c2 = this.f26419g) == null || m15875y(c2, obj) <= 0) && ((c3 = this.f26422y) == null || m15875y(c3, obj) > 0);
        }

        /* JADX INFO: renamed from: y */
        int m15875y(Object obj, Object obj2) {
            return comparator().compare(obj, obj2);
        }

        C4467q(R r2, @NullableDecl C c2, @NullableDecl C c3) {
            super(r2);
            this.f26419g = c2;
            this.f26422y = c3;
            com.google.common.base.jk.m15383q(c2 == null || c3 == null || m15875y(c2, c3) <= 0);
        }
    }

    /* JADX INFO: compiled from: TreeBasedTable.java */
    class toq extends com.google.common.collect.zy<C> {

        /* JADX INFO: renamed from: g */
        final /* synthetic */ Iterator f26423g;

        /* JADX INFO: renamed from: n */
        @NullableDecl
        C f26424n;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Comparator f26426y;

        toq(Iterator it, Comparator comparator) {
            this.f26423g = it;
            this.f26426y = comparator;
        }

        @Override // com.google.common.collect.zy
        /* JADX INFO: renamed from: k */
        protected C mo15703k() {
            while (this.f26423g.hasNext()) {
                C c2 = (C) this.f26423g.next();
                C c3 = this.f26424n;
                if (!(c3 != null && this.f26426y.compare(c2, c3) == 0)) {
                    this.f26424n = c2;
                    return c2;
                }
            }
            this.f26424n = null;
            return toq();
        }
    }

    /* JADX INFO: compiled from: TreeBasedTable.java */
    private static class zy<C, V> implements com.google.common.base.lvui<TreeMap<C, V>>, Serializable {
        private static final long serialVersionUID = 0;
        final Comparator<? super C> comparator;

        zy(Comparator<? super C> comparator) {
            this.comparator = comparator;
        }

        @Override // com.google.common.base.lvui
        public TreeMap<C, V> get() {
            return new TreeMap<>(this.comparator);
        }
    }

    mi1u(Comparator<? super R> comparator, Comparator<? super C> comparator2) {
        super(new TreeMap(comparator), new zy(comparator2));
        this.columnComparator = comparator2;
    }

    public static <R extends Comparable, C extends Comparable, V> mi1u<R, C, V> create() {
        return new mi1u<>(kx3.natural(), kx3.natural());
    }

    @Override // com.google.common.collect.ovdh, com.google.common.collect.cdj, com.google.common.collect.qh4d
    public /* bridge */ /* synthetic */ Set cellSet() {
        return super.cellSet();
    }

    @Override // com.google.common.collect.ovdh, com.google.common.collect.cdj, com.google.common.collect.qh4d
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ovdh, com.google.common.collect.qh4d
    public /* bridge */ /* synthetic */ Map column(Object obj) {
        return super.column(obj);
    }

    @Deprecated
    public Comparator<? super C> columnComparator() {
        return this.columnComparator;
    }

    @Override // com.google.common.collect.ovdh, com.google.common.collect.cdj, com.google.common.collect.qh4d
    public /* bridge */ /* synthetic */ Set columnKeySet() {
        return super.columnKeySet();
    }

    @Override // com.google.common.collect.ovdh, com.google.common.collect.qh4d
    public /* bridge */ /* synthetic */ Map columnMap() {
        return super.columnMap();
    }

    @Override // com.google.common.collect.ovdh, com.google.common.collect.cdj, com.google.common.collect.qh4d
    public /* bridge */ /* synthetic */ boolean contains(@NullableDecl Object obj, @NullableDecl Object obj2) {
        return super.contains(obj, obj2);
    }

    @Override // com.google.common.collect.ovdh, com.google.common.collect.cdj, com.google.common.collect.qh4d
    public /* bridge */ /* synthetic */ boolean containsColumn(@NullableDecl Object obj) {
        return super.containsColumn(obj);
    }

    @Override // com.google.common.collect.ovdh, com.google.common.collect.cdj, com.google.common.collect.qh4d
    public /* bridge */ /* synthetic */ boolean containsRow(@NullableDecl Object obj) {
        return super.containsRow(obj);
    }

    @Override // com.google.common.collect.ovdh, com.google.common.collect.cdj, com.google.common.collect.qh4d
    public /* bridge */ /* synthetic */ boolean containsValue(@NullableDecl Object obj) {
        return super.containsValue(obj);
    }

    @Override // com.google.common.collect.ovdh
    Iterator<C> createColumnKeyIterator() {
        Comparator<? super C> comparatorColumnComparator = columnComparator();
        return new toq(zwy.dd(nsb.m15901f(this.backingMap.values(), new C4466k()), comparatorColumnComparator), comparatorColumnComparator);
    }

    @Override // com.google.common.collect.cdj, com.google.common.collect.qh4d
    public /* bridge */ /* synthetic */ boolean equals(@NullableDecl Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.common.collect.ovdh, com.google.common.collect.cdj, com.google.common.collect.qh4d
    public /* bridge */ /* synthetic */ Object get(@NullableDecl Object obj, @NullableDecl Object obj2) {
        return super.get(obj, obj2);
    }

    @Override // com.google.common.collect.cdj, com.google.common.collect.qh4d
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.ovdh, com.google.common.collect.cdj, com.google.common.collect.qh4d
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ovdh, com.google.common.collect.cdj, com.google.common.collect.qh4d
    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2, Object obj3) {
        return super.put(obj, obj2, obj3);
    }

    @Override // com.google.common.collect.cdj, com.google.common.collect.qh4d
    public /* bridge */ /* synthetic */ void putAll(qh4d qh4dVar) {
        super.putAll(qh4dVar);
    }

    @Override // com.google.common.collect.ovdh, com.google.common.collect.cdj, com.google.common.collect.qh4d
    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ Object remove(@NullableDecl Object obj, @NullableDecl Object obj2) {
        return super.remove(obj, obj2);
    }

    @Deprecated
    public Comparator<? super R> rowComparator() {
        return rowKeySet().comparator();
    }

    @Override // com.google.common.collect.ovdh, com.google.common.collect.qh4d
    public /* bridge */ /* synthetic */ int size() {
        return super.size();
    }

    @Override // com.google.common.collect.cdj
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // com.google.common.collect.ovdh, com.google.common.collect.cdj, com.google.common.collect.qh4d
    public /* bridge */ /* synthetic */ Collection values() {
        return super.values();
    }

    public static <R, C, V> mi1u<R, C, V> create(Comparator<? super R> comparator, Comparator<? super C> comparator2) {
        com.google.common.base.jk.a9(comparator);
        com.google.common.base.jk.a9(comparator2);
        return new mi1u<>(comparator, comparator2);
    }

    @Override // com.google.common.collect.ovdh, com.google.common.collect.qh4d
    public SortedMap<C, V> row(R r2) {
        return new C4467q(this, r2);
    }

    @Override // com.google.common.collect.cn02, com.google.common.collect.ovdh, com.google.common.collect.cdj, com.google.common.collect.qh4d
    public SortedSet<R> rowKeySet() {
        return super.rowKeySet();
    }

    @Override // com.google.common.collect.cn02, com.google.common.collect.ovdh, com.google.common.collect.qh4d
    public SortedMap<R, Map<C, V>> rowMap() {
        return super.rowMap();
    }

    public static <R, C, V> mi1u<R, C, V> create(mi1u<R, C, ? extends V> mi1uVar) {
        mi1u<R, C, V> mi1uVar2 = new mi1u<>(mi1uVar.rowComparator(), mi1uVar.columnComparator());
        mi1uVar2.putAll(mi1uVar);
        return mi1uVar2;
    }
}
