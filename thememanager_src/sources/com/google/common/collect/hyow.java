package com.google.common.collect;

import com.google.common.base.C4280z;
import com.google.common.collect.qh4d;
import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import wlev.InterfaceC7731k;

/* JADX INFO: compiled from: Tables.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
public final class hyow {

    /* JADX INFO: renamed from: k */
    private static final com.google.common.base.t8r<? extends Map<?, ?>, ? extends Map<?, ?>> f26210k = new C4409k();

    /* JADX INFO: compiled from: Tables.java */
    private static class f7l8<R, C, V> extends gbni<R, C, V> implements Serializable {
        private static final long serialVersionUID = 0;
        final qh4d<? extends R, ? extends C, ? extends V> delegate;

        f7l8(qh4d<? extends R, ? extends C, ? extends V> qh4dVar) {
            this.delegate = (qh4d) com.google.common.base.jk.a9(qh4dVar);
        }

        @Override // com.google.common.collect.gbni, com.google.common.collect.qh4d
        public Set<qh4d.InterfaceC4517k<R, C, V>> cellSet() {
            return Collections.unmodifiableSet(super.cellSet());
        }

        @Override // com.google.common.collect.gbni, com.google.common.collect.qh4d
        public void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.gbni, com.google.common.collect.qh4d
        public Map<R, V> column(@NullableDecl C c2) {
            return Collections.unmodifiableMap(super.column(c2));
        }

        @Override // com.google.common.collect.gbni, com.google.common.collect.qh4d
        public Set<C> columnKeySet() {
            return Collections.unmodifiableSet(super.columnKeySet());
        }

        @Override // com.google.common.collect.gbni, com.google.common.collect.qh4d
        public Map<C, Map<R, V>> columnMap() {
            return Collections.unmodifiableMap(vy.ikck(super.columnMap(), hyow.m15746p()));
        }

        @Override // com.google.common.collect.gbni, com.google.common.collect.qh4d
        public V put(@NullableDecl R r2, @NullableDecl C c2, @NullableDecl V v2) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.gbni, com.google.common.collect.qh4d
        public void putAll(qh4d<? extends R, ? extends C, ? extends V> qh4dVar) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.gbni, com.google.common.collect.qh4d
        public V remove(@NullableDecl Object obj, @NullableDecl Object obj2) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.gbni, com.google.common.collect.qh4d
        public Map<C, V> row(@NullableDecl R r2) {
            return Collections.unmodifiableMap(super.row(r2));
        }

        @Override // com.google.common.collect.gbni, com.google.common.collect.qh4d
        public Set<R> rowKeySet() {
            return Collections.unmodifiableSet(super.rowKeySet());
        }

        @Override // com.google.common.collect.gbni, com.google.common.collect.qh4d
        public Map<R, Map<C, V>> rowMap() {
            return Collections.unmodifiableMap(vy.ikck(super.rowMap(), hyow.m15746p()));
        }

        @Override // com.google.common.collect.gbni, com.google.common.collect.qh4d
        public Collection<V> values() {
            return Collections.unmodifiableCollection(super.values());
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.gbni, com.google.common.collect.qkj8
        public qh4d<R, C, V> delegate() {
            return this.delegate;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.hyow$g */
    /* JADX INFO: compiled from: Tables.java */
    static final class C4408g<R, C, V> extends f7l8<R, C, V> implements zff0<R, C, V> {
        private static final long serialVersionUID = 0;

        public C4408g(zff0<R, ? extends C, ? extends V> zff0Var) {
            super(zff0Var);
        }

        @Override // com.google.common.collect.hyow.f7l8, com.google.common.collect.gbni, com.google.common.collect.qh4d
        public SortedSet<R> rowKeySet() {
            return Collections.unmodifiableSortedSet(delegate().rowKeySet());
        }

        @Override // com.google.common.collect.hyow.f7l8, com.google.common.collect.gbni, com.google.common.collect.qh4d
        public SortedMap<R, Map<C, V>> rowMap() {
            return Collections.unmodifiableSortedMap(vy.mu(delegate().rowMap(), hyow.m15746p()));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.hyow.f7l8, com.google.common.collect.gbni, com.google.common.collect.qkj8
        public zff0<R, C, V> delegate() {
            return (zff0) super.delegate();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.hyow$k */
    /* JADX INFO: compiled from: Tables.java */
    static class C4409k implements com.google.common.base.t8r<Map<Object, Object>, Map<Object, Object>> {
        C4409k() {
        }

        @Override // com.google.common.base.t8r
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Map<Object, Object> apply(Map<Object, Object> map) {
            return Collections.unmodifiableMap(map);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.hyow$n */
    /* JADX INFO: compiled from: Tables.java */
    private static class C4410n<C, R, V> extends cdj<C, R, V> {

        /* JADX INFO: renamed from: g */
        private static final com.google.common.base.t8r<qh4d.InterfaceC4517k<?, ?, ?>, qh4d.InterfaceC4517k<?, ?, ?>> f26211g = new k();

        /* JADX INFO: renamed from: n */
        final qh4d<R, C, V> f26212n;

        /* JADX INFO: renamed from: com.google.common.collect.hyow$n$k */
        /* JADX INFO: compiled from: Tables.java */
        static class k implements com.google.common.base.t8r<qh4d.InterfaceC4517k<?, ?, ?>, qh4d.InterfaceC4517k<?, ?, ?>> {
            k() {
            }

            @Override // com.google.common.base.t8r
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public qh4d.InterfaceC4517k<?, ?, ?> apply(qh4d.InterfaceC4517k<?, ?, ?> interfaceC4517k) {
                return hyow.zy(interfaceC4517k.getColumnKey(), interfaceC4517k.getRowKey(), interfaceC4517k.getValue());
            }
        }

        C4410n(qh4d<R, C, V> qh4dVar) {
            this.f26212n = (qh4d) com.google.common.base.jk.a9(qh4dVar);
        }

        @Override // com.google.common.collect.cdj
        Iterator<qh4d.InterfaceC4517k<C, R, V>> cellIterator() {
            return zwy.m16124j(this.f26212n.cellSet().iterator(), f26211g);
        }

        @Override // com.google.common.collect.cdj, com.google.common.collect.qh4d
        public void clear() {
            this.f26212n.clear();
        }

        @Override // com.google.common.collect.qh4d
        public Map<C, V> column(R r2) {
            return this.f26212n.row(r2);
        }

        @Override // com.google.common.collect.cdj, com.google.common.collect.qh4d
        public Set<R> columnKeySet() {
            return this.f26212n.rowKeySet();
        }

        @Override // com.google.common.collect.qh4d
        public Map<R, Map<C, V>> columnMap() {
            return this.f26212n.rowMap();
        }

        @Override // com.google.common.collect.cdj, com.google.common.collect.qh4d
        public boolean contains(@NullableDecl Object obj, @NullableDecl Object obj2) {
            return this.f26212n.contains(obj2, obj);
        }

        @Override // com.google.common.collect.cdj, com.google.common.collect.qh4d
        public boolean containsColumn(@NullableDecl Object obj) {
            return this.f26212n.containsRow(obj);
        }

        @Override // com.google.common.collect.cdj, com.google.common.collect.qh4d
        public boolean containsRow(@NullableDecl Object obj) {
            return this.f26212n.containsColumn(obj);
        }

        @Override // com.google.common.collect.cdj, com.google.common.collect.qh4d
        public boolean containsValue(@NullableDecl Object obj) {
            return this.f26212n.containsValue(obj);
        }

        @Override // com.google.common.collect.cdj, com.google.common.collect.qh4d
        public V get(@NullableDecl Object obj, @NullableDecl Object obj2) {
            return this.f26212n.get(obj2, obj);
        }

        @Override // com.google.common.collect.cdj, com.google.common.collect.qh4d
        public V put(C c2, R r2, V v2) {
            return this.f26212n.put(r2, c2, v2);
        }

        @Override // com.google.common.collect.cdj, com.google.common.collect.qh4d
        public void putAll(qh4d<? extends C, ? extends R, ? extends V> qh4dVar) {
            this.f26212n.putAll(hyow.f7l8(qh4dVar));
        }

        @Override // com.google.common.collect.cdj, com.google.common.collect.qh4d
        public V remove(@NullableDecl Object obj, @NullableDecl Object obj2) {
            return this.f26212n.remove(obj2, obj);
        }

        @Override // com.google.common.collect.qh4d
        public Map<R, V> row(C c2) {
            return this.f26212n.column(c2);
        }

        @Override // com.google.common.collect.cdj, com.google.common.collect.qh4d
        public Set<C> rowKeySet() {
            return this.f26212n.columnKeySet();
        }

        @Override // com.google.common.collect.qh4d
        public Map<C, Map<R, V>> rowMap() {
            return this.f26212n.columnMap();
        }

        @Override // com.google.common.collect.qh4d
        public int size() {
            return this.f26212n.size();
        }

        @Override // com.google.common.collect.cdj, com.google.common.collect.qh4d
        public Collection<V> values() {
            return this.f26212n.values();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.hyow$q */
    /* JADX INFO: compiled from: Tables.java */
    private static class C4411q<R, C, V1, V2> extends cdj<R, C, V2> {

        /* JADX INFO: renamed from: g */
        final com.google.common.base.t8r<? super V1, V2> f26213g;

        /* JADX INFO: renamed from: n */
        final qh4d<R, C, V1> f26214n;

        /* JADX INFO: renamed from: com.google.common.collect.hyow$q$k */
        /* JADX INFO: compiled from: Tables.java */
        class k implements com.google.common.base.t8r<qh4d.InterfaceC4517k<R, C, V1>, qh4d.InterfaceC4517k<R, C, V2>> {
            k() {
            }

            @Override // com.google.common.base.t8r
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public qh4d.InterfaceC4517k<R, C, V2> apply(qh4d.InterfaceC4517k<R, C, V1> interfaceC4517k) {
                return hyow.zy(interfaceC4517k.getRowKey(), interfaceC4517k.getColumnKey(), C4411q.this.f26213g.apply(interfaceC4517k.getValue()));
            }
        }

        /* JADX INFO: renamed from: com.google.common.collect.hyow$q$toq */
        /* JADX INFO: compiled from: Tables.java */
        class toq implements com.google.common.base.t8r<Map<C, V1>, Map<C, V2>> {
            toq() {
            }

            @Override // com.google.common.base.t8r
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public Map<C, V2> apply(Map<C, V1> map) {
                return vy.ikck(map, C4411q.this.f26213g);
            }
        }

        /* JADX INFO: renamed from: com.google.common.collect.hyow$q$zy */
        /* JADX INFO: compiled from: Tables.java */
        class zy implements com.google.common.base.t8r<Map<R, V1>, Map<R, V2>> {
            zy() {
            }

            @Override // com.google.common.base.t8r
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public Map<R, V2> apply(Map<R, V1> map) {
                return vy.ikck(map, C4411q.this.f26213g);
            }
        }

        C4411q(qh4d<R, C, V1> qh4dVar, com.google.common.base.t8r<? super V1, V2> t8rVar) {
            this.f26214n = (qh4d) com.google.common.base.jk.a9(qh4dVar);
            this.f26213g = (com.google.common.base.t8r) com.google.common.base.jk.a9(t8rVar);
        }

        @Override // com.google.common.collect.cdj
        Iterator<qh4d.InterfaceC4517k<R, C, V2>> cellIterator() {
            return zwy.m16124j(this.f26214n.cellSet().iterator(), m15752k());
        }

        @Override // com.google.common.collect.cdj, com.google.common.collect.qh4d
        public void clear() {
            this.f26214n.clear();
        }

        @Override // com.google.common.collect.qh4d
        public Map<R, V2> column(C c2) {
            return vy.ikck(this.f26214n.column(c2), this.f26213g);
        }

        @Override // com.google.common.collect.cdj, com.google.common.collect.qh4d
        public Set<C> columnKeySet() {
            return this.f26214n.columnKeySet();
        }

        @Override // com.google.common.collect.qh4d
        public Map<C, Map<R, V2>> columnMap() {
            return vy.ikck(this.f26214n.columnMap(), new zy());
        }

        @Override // com.google.common.collect.cdj, com.google.common.collect.qh4d
        public boolean contains(Object obj, Object obj2) {
            return this.f26214n.contains(obj, obj2);
        }

        @Override // com.google.common.collect.cdj
        Collection<V2> createValues() {
            return mcp.n7h(this.f26214n.values(), this.f26213g);
        }

        @Override // com.google.common.collect.cdj, com.google.common.collect.qh4d
        public V2 get(Object obj, Object obj2) {
            if (contains(obj, obj2)) {
                return this.f26213g.apply(this.f26214n.get(obj, obj2));
            }
            return null;
        }

        /* JADX INFO: renamed from: k */
        com.google.common.base.t8r<qh4d.InterfaceC4517k<R, C, V1>, qh4d.InterfaceC4517k<R, C, V2>> m15752k() {
            return new k();
        }

        @Override // com.google.common.collect.cdj, com.google.common.collect.qh4d
        public V2 put(R r2, C c2, V2 v2) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.cdj, com.google.common.collect.qh4d
        public void putAll(qh4d<? extends R, ? extends C, ? extends V2> qh4dVar) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.cdj, com.google.common.collect.qh4d
        public V2 remove(Object obj, Object obj2) {
            if (contains(obj, obj2)) {
                return this.f26213g.apply(this.f26214n.remove(obj, obj2));
            }
            return null;
        }

        @Override // com.google.common.collect.qh4d
        public Map<C, V2> row(R r2) {
            return vy.ikck(this.f26214n.row(r2), this.f26213g);
        }

        @Override // com.google.common.collect.cdj, com.google.common.collect.qh4d
        public Set<R> rowKeySet() {
            return this.f26214n.rowKeySet();
        }

        @Override // com.google.common.collect.qh4d
        public Map<R, Map<C, V2>> rowMap() {
            return vy.ikck(this.f26214n.rowMap(), new toq());
        }

        @Override // com.google.common.collect.qh4d
        public int size() {
            return this.f26214n.size();
        }
    }

    /* JADX INFO: compiled from: Tables.java */
    static abstract class toq<R, C, V> implements qh4d.InterfaceC4517k<R, C, V> {
        toq() {
        }

        @Override // com.google.common.collect.qh4d.InterfaceC4517k
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof qh4d.InterfaceC4517k)) {
                return false;
            }
            qh4d.InterfaceC4517k interfaceC4517k = (qh4d.InterfaceC4517k) obj;
            return C4280z.m15455k(getRowKey(), interfaceC4517k.getRowKey()) && C4280z.m15455k(getColumnKey(), interfaceC4517k.getColumnKey()) && C4280z.m15455k(getValue(), interfaceC4517k.getValue());
        }

        @Override // com.google.common.collect.qh4d.InterfaceC4517k
        public int hashCode() {
            return C4280z.toq(getRowKey(), getColumnKey(), getValue());
        }

        public String toString() {
            return "(" + getRowKey() + "," + getColumnKey() + ")=" + getValue();
        }
    }

    /* JADX INFO: compiled from: Tables.java */
    static final class zy<R, C, V> extends toq<R, C, V> implements Serializable {
        private static final long serialVersionUID = 0;

        @NullableDecl
        private final C columnKey;

        @NullableDecl
        private final R rowKey;

        @NullableDecl
        private final V value;

        zy(@NullableDecl R r2, @NullableDecl C c2, @NullableDecl V v2) {
            this.rowKey = r2;
            this.columnKey = c2;
            this.value = v2;
        }

        @Override // com.google.common.collect.qh4d.InterfaceC4517k
        public C getColumnKey() {
            return this.columnKey;
        }

        @Override // com.google.common.collect.qh4d.InterfaceC4517k
        public R getRowKey() {
            return this.rowKey;
        }

        @Override // com.google.common.collect.qh4d.InterfaceC4517k
        public V getValue() {
            return this.value;
        }
    }

    private hyow() {
    }

    public static <R, C, V> qh4d<C, R, V> f7l8(qh4d<R, C, V> qh4dVar) {
        return qh4dVar instanceof C4410n ? ((C4410n) qh4dVar).f26212n : new C4410n(qh4dVar);
    }

    @InterfaceC7731k
    /* JADX INFO: renamed from: g */
    public static <R, C, V1, V2> qh4d<R, C, V2> m15743g(qh4d<R, C, V1> qh4dVar, com.google.common.base.t8r<? super V1, V2> t8rVar) {
        return new C4411q(qh4dVar, t8rVar);
    }

    /* JADX INFO: renamed from: n */
    public static <R, C, V> qh4d<R, C, V> m15745n(qh4d<R, C, V> qh4dVar) {
        return exv8.o1t(qh4dVar, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static <K, V> com.google.common.base.t8r<Map<K, V>, Map<K, V>> m15746p() {
        return (com.google.common.base.t8r<Map<K, V>, Map<K, V>>) f26210k;
    }

    @InterfaceC7731k
    /* JADX INFO: renamed from: q */
    public static <R, C, V> qh4d<R, C, V> m15747q(Map<R, Map<C, V>> map, com.google.common.base.lvui<? extends Map<C, V>> lvuiVar) {
        com.google.common.base.jk.m15383q(map.isEmpty());
        com.google.common.base.jk.a9(lvuiVar);
        return new ovdh(map, lvuiVar);
    }

    /* JADX INFO: renamed from: s */
    public static <R, C, V> qh4d<R, C, V> m15748s(qh4d<? extends R, ? extends C, ? extends V> qh4dVar) {
        return new f7l8(qh4dVar);
    }

    static boolean toq(qh4d<?, ?, ?> qh4dVar, @NullableDecl Object obj) {
        if (obj == qh4dVar) {
            return true;
        }
        if (obj instanceof qh4d) {
            return qh4dVar.cellSet().equals(((qh4d) obj).cellSet());
        }
        return false;
    }

    @InterfaceC7731k
    /* JADX INFO: renamed from: y */
    public static <R, C, V> zff0<R, C, V> m15749y(zff0<R, ? extends C, ? extends V> zff0Var) {
        return new C4408g(zff0Var);
    }

    public static <R, C, V> qh4d.InterfaceC4517k<R, C, V> zy(@NullableDecl R r2, @NullableDecl C c2, @NullableDecl V v2) {
        return new zy(r2, c2, v2);
    }
}
