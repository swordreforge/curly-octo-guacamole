package com.google.common.collect;

import com.google.common.collect.o05;
import com.google.common.collect.qh4d;
import com.google.j2objc.annotations.RetainedWith;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Queue;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import wlev.InterfaceC7732q;

/* JADX INFO: compiled from: Synchronized.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq(emulated = true)
final class exv8 {

    /* JADX INFO: compiled from: Synchronized.java */
    private static final class fu4<R, C, V> extends C4360h implements qh4d<R, C, V> {

        /* JADX INFO: renamed from: com.google.common.collect.exv8$fu4$k */
        /* JADX INFO: compiled from: Synchronized.java */
        class C4358k implements com.google.common.base.t8r<Map<C, V>, Map<C, V>> {
            C4358k() {
            }

            @Override // com.google.common.base.t8r
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public Map<C, V> apply(Map<C, V> map) {
                return exv8.x2(map, fu4.this.mutex);
            }
        }

        /* JADX INFO: compiled from: Synchronized.java */
        class toq implements com.google.common.base.t8r<Map<R, V>, Map<R, V>> {
            toq() {
            }

            @Override // com.google.common.base.t8r
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public Map<R, V> apply(Map<R, V> map) {
                return exv8.x2(map, fu4.this.mutex);
            }
        }

        fu4(qh4d<R, C, V> qh4dVar, Object obj) {
            super(qh4dVar, obj);
        }

        @Override // com.google.common.collect.qh4d
        public Set<qh4d.InterfaceC4517k<R, C, V>> cellSet() {
            Set<qh4d.InterfaceC4517k<R, C, V>> setFn3e;
            synchronized (this.mutex) {
                setFn3e = exv8.fn3e(delegate().cellSet(), this.mutex);
            }
            return setFn3e;
        }

        @Override // com.google.common.collect.qh4d
        public void clear() {
            synchronized (this.mutex) {
                delegate().clear();
            }
        }

        @Override // com.google.common.collect.qh4d
        public Map<R, V> column(@NullableDecl C c2) {
            Map<R, V> mapX2;
            synchronized (this.mutex) {
                mapX2 = exv8.x2(delegate().column(c2), this.mutex);
            }
            return mapX2;
        }

        @Override // com.google.common.collect.qh4d
        public Set<C> columnKeySet() {
            Set<C> setFn3e;
            synchronized (this.mutex) {
                setFn3e = exv8.fn3e(delegate().columnKeySet(), this.mutex);
            }
            return setFn3e;
        }

        @Override // com.google.common.collect.qh4d
        public Map<C, Map<R, V>> columnMap() {
            Map<C, Map<R, V>> mapX2;
            synchronized (this.mutex) {
                mapX2 = exv8.x2(vy.ikck(delegate().columnMap(), new toq()), this.mutex);
            }
            return mapX2;
        }

        @Override // com.google.common.collect.qh4d
        public boolean contains(@NullableDecl Object obj, @NullableDecl Object obj2) {
            boolean zContains;
            synchronized (this.mutex) {
                zContains = delegate().contains(obj, obj2);
            }
            return zContains;
        }

        @Override // com.google.common.collect.qh4d
        public boolean containsColumn(@NullableDecl Object obj) {
            boolean zContainsColumn;
            synchronized (this.mutex) {
                zContainsColumn = delegate().containsColumn(obj);
            }
            return zContainsColumn;
        }

        @Override // com.google.common.collect.qh4d
        public boolean containsRow(@NullableDecl Object obj) {
            boolean zContainsRow;
            synchronized (this.mutex) {
                zContainsRow = delegate().containsRow(obj);
            }
            return zContainsRow;
        }

        @Override // com.google.common.collect.qh4d
        public boolean containsValue(@NullableDecl Object obj) {
            boolean zContainsValue;
            synchronized (this.mutex) {
                zContainsValue = delegate().containsValue(obj);
            }
            return zContainsValue;
        }

        @Override // com.google.common.collect.qh4d
        public boolean equals(@NullableDecl Object obj) {
            boolean zEquals;
            if (this == obj) {
                return true;
            }
            synchronized (this.mutex) {
                zEquals = delegate().equals(obj);
            }
            return zEquals;
        }

        @Override // com.google.common.collect.qh4d
        public V get(@NullableDecl Object obj, @NullableDecl Object obj2) {
            V v2;
            synchronized (this.mutex) {
                v2 = delegate().get(obj, obj2);
            }
            return v2;
        }

        @Override // com.google.common.collect.qh4d
        public int hashCode() {
            int iHashCode;
            synchronized (this.mutex) {
                iHashCode = delegate().hashCode();
            }
            return iHashCode;
        }

        @Override // com.google.common.collect.qh4d
        public boolean isEmpty() {
            boolean zIsEmpty;
            synchronized (this.mutex) {
                zIsEmpty = delegate().isEmpty();
            }
            return zIsEmpty;
        }

        @Override // com.google.common.collect.qh4d
        public V put(@NullableDecl R r2, @NullableDecl C c2, @NullableDecl V v2) {
            V vPut;
            synchronized (this.mutex) {
                vPut = delegate().put(r2, c2, v2);
            }
            return vPut;
        }

        @Override // com.google.common.collect.qh4d
        public void putAll(qh4d<? extends R, ? extends C, ? extends V> qh4dVar) {
            synchronized (this.mutex) {
                delegate().putAll(qh4dVar);
            }
        }

        @Override // com.google.common.collect.qh4d
        public V remove(@NullableDecl Object obj, @NullableDecl Object obj2) {
            V vRemove;
            synchronized (this.mutex) {
                vRemove = delegate().remove(obj, obj2);
            }
            return vRemove;
        }

        @Override // com.google.common.collect.qh4d
        public Map<C, V> row(@NullableDecl R r2) {
            Map<C, V> mapX2;
            synchronized (this.mutex) {
                mapX2 = exv8.x2(delegate().row(r2), this.mutex);
            }
            return mapX2;
        }

        @Override // com.google.common.collect.qh4d
        public Set<R> rowKeySet() {
            Set<R> setFn3e;
            synchronized (this.mutex) {
                setFn3e = exv8.fn3e(delegate().rowKeySet(), this.mutex);
            }
            return setFn3e;
        }

        @Override // com.google.common.collect.qh4d
        public Map<R, Map<C, V>> rowMap() {
            Map<R, Map<C, V>> mapX2;
            synchronized (this.mutex) {
                mapX2 = exv8.x2(vy.ikck(delegate().rowMap(), new C4358k()), this.mutex);
            }
            return mapX2;
        }

        @Override // com.google.common.collect.qh4d
        public int size() {
            int size;
            synchronized (this.mutex) {
                size = delegate().size();
            }
            return size;
        }

        @Override // com.google.common.collect.qh4d
        public Collection<V> values() {
            Collection<V> collectionM15675y;
            synchronized (this.mutex) {
                collectionM15675y = exv8.m15675y(delegate().values(), this.mutex);
            }
            return collectionM15675y;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.exv8.C4360h
        public qh4d<R, C, V> delegate() {
            return (qh4d) super.delegate();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.exv8$g */
    /* JADX INFO: compiled from: Synchronized.java */
    @InterfaceC7732q
    static class C4359g<E> extends C4360h implements Collection<E> {
        private static final long serialVersionUID = 0;

        @Override // java.util.Collection
        public boolean add(E e2) {
            boolean zAdd;
            synchronized (this.mutex) {
                zAdd = delegate().add(e2);
            }
            return zAdd;
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends E> collection) {
            boolean zAddAll;
            synchronized (this.mutex) {
                zAddAll = delegate().addAll(collection);
            }
            return zAddAll;
        }

        @Override // java.util.Collection
        public void clear() {
            synchronized (this.mutex) {
                delegate().clear();
            }
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            boolean zContains;
            synchronized (this.mutex) {
                zContains = delegate().contains(obj);
            }
            return zContains;
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            boolean zContainsAll;
            synchronized (this.mutex) {
                zContainsAll = delegate().containsAll(collection);
            }
            return zContainsAll;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            boolean zIsEmpty;
            synchronized (this.mutex) {
                zIsEmpty = delegate().isEmpty();
            }
            return zIsEmpty;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator<E> iterator() {
            return delegate().iterator();
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            boolean zRemove;
            synchronized (this.mutex) {
                zRemove = delegate().remove(obj);
            }
            return zRemove;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            boolean zRemoveAll;
            synchronized (this.mutex) {
                zRemoveAll = delegate().removeAll(collection);
            }
            return zRemoveAll;
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            boolean zRetainAll;
            synchronized (this.mutex) {
                zRetainAll = delegate().retainAll(collection);
            }
            return zRetainAll;
        }

        @Override // java.util.Collection
        public int size() {
            int size;
            synchronized (this.mutex) {
                size = delegate().size();
            }
            return size;
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            Object[] array;
            synchronized (this.mutex) {
                array = delegate().toArray();
            }
            return array;
        }

        private C4359g(Collection<E> collection, @NullableDecl Object obj) {
            super(collection, obj);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.exv8.C4360h
        public Collection<E> delegate() {
            return (Collection) super.delegate();
        }

        @Override // java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            T[] tArr2;
            synchronized (this.mutex) {
                tArr2 = (T[]) delegate().toArray(tArr);
            }
            return tArr2;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.exv8$h */
    /* JADX INFO: compiled from: Synchronized.java */
    static class C4360h implements Serializable {

        @wlev.zy
        private static final long serialVersionUID = 0;
        final Object delegate;
        final Object mutex;

        C4360h(Object obj, @NullableDecl Object obj2) {
            this.delegate = com.google.common.base.jk.a9(obj);
            this.mutex = obj2 == null ? this : obj2;
        }

        @wlev.zy
        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            synchronized (this.mutex) {
                objectOutputStream.defaultWriteObject();
            }
        }

        Object delegate() {
            return this.delegate;
        }

        public String toString() {
            String string;
            synchronized (this.mutex) {
                string = this.delegate.toString();
            }
            return string;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.exv8$i */
    /* JADX INFO: compiled from: Synchronized.java */
    private static class C4361i<K, V> extends x2<K, V> implements wt<K, V> {
        private static final long serialVersionUID = 0;

        @MonotonicNonNullDecl
        transient Set<Map.Entry<K, V>> entrySet;

        C4361i(wt<K, V> wtVar, @NullableDecl Object obj) {
            super(wtVar, obj);
        }

        @Override // com.google.common.collect.exv8.x2, com.google.common.collect.lw
        public Set<Map.Entry<K, V>> entries() {
            Set<Map.Entry<K, V>> set;
            synchronized (this.mutex) {
                if (this.entrySet == null) {
                    this.entrySet = exv8.fn3e(delegate().entries(), this.mutex);
                }
                set = this.entrySet;
            }
            return set;
        }

        @Override // com.google.common.collect.exv8.x2, com.google.common.collect.lw
        public Set<V> get(K k2) {
            Set<V> setFn3e;
            synchronized (this.mutex) {
                setFn3e = exv8.fn3e(delegate().get((Object) k2), this.mutex);
            }
            return setFn3e;
        }

        @Override // com.google.common.collect.exv8.x2, com.google.common.collect.lw
        public Set<V> removeAll(Object obj) {
            Set<V> setRemoveAll;
            synchronized (this.mutex) {
                setRemoveAll = delegate().removeAll(obj);
            }
            return setRemoveAll;
        }

        @Override // com.google.common.collect.exv8.x2, com.google.common.collect.lw
        public Set<V> replaceValues(K k2, Iterable<? extends V> iterable) {
            Set<V> setReplaceValues;
            synchronized (this.mutex) {
                setReplaceValues = delegate().replaceValues((Object) k2, (Iterable) iterable);
            }
            return setReplaceValues;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.exv8.x2, com.google.common.collect.exv8.C4360h
        public wt<K, V> delegate() {
            return (wt) super.delegate();
        }
    }

    /* JADX INFO: compiled from: Synchronized.java */
    private static class ki<E> extends C4366s<E> implements RandomAccess {
        private static final long serialVersionUID = 0;

        ki(List<E> list, @NullableDecl Object obj) {
            super(list, obj);
        }
    }

    /* JADX INFO: compiled from: Synchronized.java */
    private static class ld6<K, V> extends C4360h implements Map<K, V> {
        private static final long serialVersionUID = 0;

        @MonotonicNonNullDecl
        transient Set<Map.Entry<K, V>> entrySet;

        @MonotonicNonNullDecl
        transient Set<K> keySet;

        @MonotonicNonNullDecl
        transient Collection<V> values;

        ld6(Map<K, V> map, @NullableDecl Object obj) {
            super(map, obj);
        }

        @Override // java.util.Map
        public void clear() {
            synchronized (this.mutex) {
                delegate().clear();
            }
        }

        @Override // java.util.Map
        public boolean containsKey(Object obj) {
            boolean zContainsKey;
            synchronized (this.mutex) {
                zContainsKey = delegate().containsKey(obj);
            }
            return zContainsKey;
        }

        @Override // java.util.Map
        public boolean containsValue(Object obj) {
            boolean zContainsValue;
            synchronized (this.mutex) {
                zContainsValue = delegate().containsValue(obj);
            }
            return zContainsValue;
        }

        @Override // java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            Set<Map.Entry<K, V>> set;
            synchronized (this.mutex) {
                if (this.entrySet == null) {
                    this.entrySet = exv8.fn3e(delegate().entrySet(), this.mutex);
                }
                set = this.entrySet;
            }
            return set;
        }

        @Override // java.util.Map
        public boolean equals(Object obj) {
            boolean zEquals;
            if (obj == this) {
                return true;
            }
            synchronized (this.mutex) {
                zEquals = delegate().equals(obj);
            }
            return zEquals;
        }

        @Override // java.util.Map
        public V get(Object obj) {
            V v2;
            synchronized (this.mutex) {
                v2 = delegate().get(obj);
            }
            return v2;
        }

        @Override // java.util.Map
        public int hashCode() {
            int iHashCode;
            synchronized (this.mutex) {
                iHashCode = delegate().hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.Map
        public boolean isEmpty() {
            boolean zIsEmpty;
            synchronized (this.mutex) {
                zIsEmpty = delegate().isEmpty();
            }
            return zIsEmpty;
        }

        @Override // java.util.Map
        public Set<K> keySet() {
            Set<K> set;
            synchronized (this.mutex) {
                if (this.keySet == null) {
                    this.keySet = exv8.fn3e(delegate().keySet(), this.mutex);
                }
                set = this.keySet;
            }
            return set;
        }

        @Override // java.util.Map
        public V put(K k2, V v2) {
            V vPut;
            synchronized (this.mutex) {
                vPut = delegate().put(k2, v2);
            }
            return vPut;
        }

        @Override // java.util.Map
        public void putAll(Map<? extends K, ? extends V> map) {
            synchronized (this.mutex) {
                delegate().putAll(map);
            }
        }

        @Override // java.util.Map
        public V remove(Object obj) {
            V vRemove;
            synchronized (this.mutex) {
                vRemove = delegate().remove(obj);
            }
            return vRemove;
        }

        @Override // java.util.Map
        public int size() {
            int size;
            synchronized (this.mutex) {
                size = delegate().size();
            }
            return size;
        }

        @Override // java.util.Map
        public Collection<V> values() {
            Collection<V> collection;
            synchronized (this.mutex) {
                if (this.values == null) {
                    this.values = exv8.m15675y(delegate().values(), this.mutex);
                }
                collection = this.values;
            }
            return collection;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.exv8.C4360h
        public Map<K, V> delegate() {
            return (Map) super.delegate();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.exv8$n */
    /* JADX INFO: compiled from: Synchronized.java */
    @InterfaceC7732q
    static class C4363n<K, V> extends ld6<K, V> implements com.google.common.collect.ni7<K, V>, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: k */
        @MonotonicNonNullDecl
        private transient Set<V> f26107k;

        /* JADX INFO: renamed from: q */
        @RetainedWith
        @MonotonicNonNullDecl
        private transient com.google.common.collect.ni7<V, K> f26108q;

        @Override // com.google.common.collect.ni7
        public V forcePut(K k2, V v2) {
            V vForcePut;
            synchronized (this.mutex) {
                vForcePut = delegate().forcePut(k2, v2);
            }
            return vForcePut;
        }

        @Override // com.google.common.collect.ni7
        public com.google.common.collect.ni7<V, K> inverse() {
            com.google.common.collect.ni7<V, K> ni7Var;
            synchronized (this.mutex) {
                if (this.f26108q == null) {
                    this.f26108q = new C4363n(delegate().inverse(), this.mutex, this);
                }
                ni7Var = this.f26108q;
            }
            return ni7Var;
        }

        private C4363n(com.google.common.collect.ni7<K, V> ni7Var, @NullableDecl Object obj, @NullableDecl com.google.common.collect.ni7<V, K> ni7Var2) {
            super(ni7Var, obj);
            this.f26108q = ni7Var2;
        }

        @Override // com.google.common.collect.exv8.ld6, java.util.Map
        public Set<V> values() {
            Set<V> set;
            synchronized (this.mutex) {
                if (this.f26107k == null) {
                    this.f26107k = exv8.fn3e(delegate().values(), this.mutex);
                }
                set = this.f26107k;
            }
            return set;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.exv8.ld6, com.google.common.collect.exv8.C4360h
        public com.google.common.collect.ni7<K, V> delegate() {
            return (com.google.common.collect.ni7) super.delegate();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.exv8$p */
    /* JADX INFO: compiled from: Synchronized.java */
    private static class C4364p<K, V> extends x2<K, V> implements h4b<K, V> {
        private static final long serialVersionUID = 0;

        C4364p(h4b<K, V> h4bVar, @NullableDecl Object obj) {
            super(h4bVar, obj);
        }

        @Override // com.google.common.collect.exv8.x2, com.google.common.collect.lw
        public List<V> get(K k2) {
            List<V> listM15671p;
            synchronized (this.mutex) {
                listM15671p = exv8.m15671p(delegate().get((Object) k2), this.mutex);
            }
            return listM15671p;
        }

        @Override // com.google.common.collect.exv8.x2, com.google.common.collect.lw
        public List<V> removeAll(Object obj) {
            List<V> listRemoveAll;
            synchronized (this.mutex) {
                listRemoveAll = delegate().removeAll(obj);
            }
            return listRemoveAll;
        }

        @Override // com.google.common.collect.exv8.x2, com.google.common.collect.lw
        public List<V> replaceValues(K k2, Iterable<? extends V> iterable) {
            List<V> listReplaceValues;
            synchronized (this.mutex) {
                listReplaceValues = delegate().replaceValues((Object) k2, (Iterable) iterable);
            }
            return listReplaceValues;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.exv8.x2, com.google.common.collect.exv8.C4360h
        public h4b<K, V> delegate() {
            return (h4b) super.delegate();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.exv8$q */
    /* JADX INFO: compiled from: Synchronized.java */
    private static class C4365q<V> extends C4359g<Collection<V>> {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: com.google.common.collect.exv8$q$k */
        /* JADX INFO: compiled from: Synchronized.java */
        class k extends pnt2<Collection<V>, Collection<V>> {
            k(Iterator it) {
                super(it);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.collect.pnt2
            /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
            public Collection<V> mo15580k(Collection<V> collection) {
                return exv8.wvg(collection, C4365q.this.mutex);
            }
        }

        C4365q(Collection<Collection<V>> collection, @NullableDecl Object obj) {
            super(collection, obj);
        }

        @Override // com.google.common.collect.exv8.C4359g, java.util.Collection, java.lang.Iterable
        public Iterator<Collection<V>> iterator() {
            return new k(super.iterator());
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.exv8$s */
    /* JADX INFO: compiled from: Synchronized.java */
    private static class C4366s<E> extends C4359g<E> implements List<E> {
        private static final long serialVersionUID = 0;

        C4366s(List<E> list, @NullableDecl Object obj) {
            super(list, obj);
        }

        @Override // java.util.List
        public void add(int i2, E e2) {
            synchronized (this.mutex) {
                delegate().add(i2, e2);
            }
        }

        @Override // java.util.List
        public boolean addAll(int i2, Collection<? extends E> collection) {
            boolean zAddAll;
            synchronized (this.mutex) {
                zAddAll = delegate().addAll(i2, collection);
            }
            return zAddAll;
        }

        @Override // java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            boolean zEquals;
            if (obj == this) {
                return true;
            }
            synchronized (this.mutex) {
                zEquals = delegate().equals(obj);
            }
            return zEquals;
        }

        @Override // java.util.List
        public E get(int i2) {
            E e2;
            synchronized (this.mutex) {
                e2 = delegate().get(i2);
            }
            return e2;
        }

        @Override // java.util.Collection, java.util.List
        public int hashCode() {
            int iHashCode;
            synchronized (this.mutex) {
                iHashCode = delegate().hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            int iIndexOf;
            synchronized (this.mutex) {
                iIndexOf = delegate().indexOf(obj);
            }
            return iIndexOf;
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            int iLastIndexOf;
            synchronized (this.mutex) {
                iLastIndexOf = delegate().lastIndexOf(obj);
            }
            return iLastIndexOf;
        }

        @Override // java.util.List
        public ListIterator<E> listIterator() {
            return delegate().listIterator();
        }

        @Override // java.util.List
        public E remove(int i2) {
            E eRemove;
            synchronized (this.mutex) {
                eRemove = delegate().remove(i2);
            }
            return eRemove;
        }

        @Override // java.util.List
        public E set(int i2, E e2) {
            E e3;
            synchronized (this.mutex) {
                e3 = delegate().set(i2, e2);
            }
            return e3;
        }

        @Override // java.util.List
        public List<E> subList(int i2, int i3) {
            List<E> listM15671p;
            synchronized (this.mutex) {
                listM15671p = exv8.m15671p(delegate().subList(i2, i3), this.mutex);
            }
            return listM15671p;
        }

        @Override // java.util.List
        public ListIterator<E> listIterator(int i2) {
            return delegate().listIterator(i2);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.exv8.C4359g, com.google.common.collect.exv8.C4360h
        public List<E> delegate() {
            return (List) super.delegate();
        }
    }

    /* JADX INFO: compiled from: Synchronized.java */
    private static class toq<K, V> extends ld6<K, Collection<V>> {
        private static final long serialVersionUID = 0;

        @MonotonicNonNullDecl
        transient Set<Map.Entry<K, Collection<V>>> asMapEntrySet;

        @MonotonicNonNullDecl
        transient Collection<Collection<V>> asMapValues;

        toq(Map<K, Collection<V>> map, @NullableDecl Object obj) {
            super(map, obj);
        }

        @Override // com.google.common.collect.exv8.ld6, java.util.Map
        public boolean containsValue(Object obj) {
            return values().contains(obj);
        }

        @Override // com.google.common.collect.exv8.ld6, java.util.Map
        public Set<Map.Entry<K, Collection<V>>> entrySet() {
            Set<Map.Entry<K, Collection<V>>> set;
            synchronized (this.mutex) {
                if (this.asMapEntrySet == null) {
                    this.asMapEntrySet = new zy(delegate().entrySet(), this.mutex);
                }
                set = this.asMapEntrySet;
            }
            return set;
        }

        @Override // com.google.common.collect.exv8.ld6, java.util.Map
        public Collection<Collection<V>> values() {
            Collection<Collection<V>> collection;
            synchronized (this.mutex) {
                if (this.asMapValues == null) {
                    this.asMapValues = new C4365q(delegate().values(), this.mutex);
                }
                collection = this.asMapValues;
            }
            return collection;
        }

        @Override // com.google.common.collect.exv8.ld6, java.util.Map
        public Collection<V> get(Object obj) {
            Collection<V> collectionWvg;
            synchronized (this.mutex) {
                Collection collection = (Collection) super.get(obj);
                collectionWvg = collection == null ? null : exv8.wvg(collection, this.mutex);
            }
            return collectionWvg;
        }
    }

    /* JADX INFO: compiled from: Synchronized.java */
    private static class x2<K, V> extends C4360h implements lw<K, V> {
        private static final long serialVersionUID = 0;

        @MonotonicNonNullDecl
        transient Map<K, Collection<V>> asMap;

        @MonotonicNonNullDecl
        transient Collection<Map.Entry<K, V>> entries;

        @MonotonicNonNullDecl
        transient Set<K> keySet;

        @MonotonicNonNullDecl
        transient o05<K> keys;

        @MonotonicNonNullDecl
        transient Collection<V> valuesCollection;

        x2(lw<K, V> lwVar, @NullableDecl Object obj) {
            super(lwVar, obj);
        }

        @Override // com.google.common.collect.lw, com.google.common.collect.h4b
        public Map<K, Collection<V>> asMap() {
            Map<K, Collection<V>> map;
            synchronized (this.mutex) {
                if (this.asMap == null) {
                    this.asMap = new toq(delegate().asMap(), this.mutex);
                }
                map = this.asMap;
            }
            return map;
        }

        @Override // com.google.common.collect.lw
        public void clear() {
            synchronized (this.mutex) {
                delegate().clear();
            }
        }

        @Override // com.google.common.collect.lw
        public boolean containsEntry(Object obj, Object obj2) {
            boolean zContainsEntry;
            synchronized (this.mutex) {
                zContainsEntry = delegate().containsEntry(obj, obj2);
            }
            return zContainsEntry;
        }

        @Override // com.google.common.collect.lw
        public boolean containsKey(Object obj) {
            boolean zContainsKey;
            synchronized (this.mutex) {
                zContainsKey = delegate().containsKey(obj);
            }
            return zContainsKey;
        }

        @Override // com.google.common.collect.lw
        public boolean containsValue(Object obj) {
            boolean zContainsValue;
            synchronized (this.mutex) {
                zContainsValue = delegate().containsValue(obj);
            }
            return zContainsValue;
        }

        public Collection<Map.Entry<K, V>> entries() {
            Collection<Map.Entry<K, V>> collection;
            synchronized (this.mutex) {
                if (this.entries == null) {
                    this.entries = exv8.wvg(delegate().entries(), this.mutex);
                }
                collection = this.entries;
            }
            return collection;
        }

        @Override // com.google.common.collect.lw, com.google.common.collect.h4b
        public boolean equals(Object obj) {
            boolean zEquals;
            if (obj == this) {
                return true;
            }
            synchronized (this.mutex) {
                zEquals = delegate().equals(obj);
            }
            return zEquals;
        }

        public Collection<V> get(K k2) {
            Collection<V> collectionWvg;
            synchronized (this.mutex) {
                collectionWvg = exv8.wvg(delegate().get(k2), this.mutex);
            }
            return collectionWvg;
        }

        @Override // com.google.common.collect.lw
        public int hashCode() {
            int iHashCode;
            synchronized (this.mutex) {
                iHashCode = delegate().hashCode();
            }
            return iHashCode;
        }

        @Override // com.google.common.collect.lw
        public boolean isEmpty() {
            boolean zIsEmpty;
            synchronized (this.mutex) {
                zIsEmpty = delegate().isEmpty();
            }
            return zIsEmpty;
        }

        @Override // com.google.common.collect.lw
        public Set<K> keySet() {
            Set<K> set;
            synchronized (this.mutex) {
                if (this.keySet == null) {
                    this.keySet = exv8.m15674t(delegate().keySet(), this.mutex);
                }
                set = this.keySet;
            }
            return set;
        }

        @Override // com.google.common.collect.lw
        public o05<K> keys() {
            o05<K> o05Var;
            synchronized (this.mutex) {
                if (this.keys == null) {
                    this.keys = exv8.n7h(delegate().keys(), this.mutex);
                }
                o05Var = this.keys;
            }
            return o05Var;
        }

        @Override // com.google.common.collect.lw
        public boolean put(K k2, V v2) {
            boolean zPut;
            synchronized (this.mutex) {
                zPut = delegate().put(k2, v2);
            }
            return zPut;
        }

        @Override // com.google.common.collect.lw
        public boolean putAll(K k2, Iterable<? extends V> iterable) {
            boolean zPutAll;
            synchronized (this.mutex) {
                zPutAll = delegate().putAll(k2, iterable);
            }
            return zPutAll;
        }

        @Override // com.google.common.collect.lw
        public boolean remove(Object obj, Object obj2) {
            boolean zRemove;
            synchronized (this.mutex) {
                zRemove = delegate().remove(obj, obj2);
            }
            return zRemove;
        }

        public Collection<V> removeAll(Object obj) {
            Collection<V> collectionRemoveAll;
            synchronized (this.mutex) {
                collectionRemoveAll = delegate().removeAll(obj);
            }
            return collectionRemoveAll;
        }

        public Collection<V> replaceValues(K k2, Iterable<? extends V> iterable) {
            Collection<V> collectionReplaceValues;
            synchronized (this.mutex) {
                collectionReplaceValues = delegate().replaceValues(k2, iterable);
            }
            return collectionReplaceValues;
        }

        @Override // com.google.common.collect.lw
        public int size() {
            int size;
            synchronized (this.mutex) {
                size = delegate().size();
            }
            return size;
        }

        @Override // com.google.common.collect.lw
        public Collection<V> values() {
            Collection<V> collection;
            synchronized (this.mutex) {
                if (this.valuesCollection == null) {
                    this.valuesCollection = exv8.m15675y(delegate().values(), this.mutex);
                }
                collection = this.valuesCollection;
            }
            return collection;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.exv8.C4360h
        public lw<K, V> delegate() {
            return (lw) super.delegate();
        }

        @Override // com.google.common.collect.lw
        public boolean putAll(lw<? extends K, ? extends V> lwVar) {
            boolean zPutAll;
            synchronized (this.mutex) {
                zPutAll = delegate().putAll(lwVar);
            }
            return zPutAll;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.exv8$y */
    /* JADX INFO: compiled from: Synchronized.java */
    @wlev.zy
    private static class C4367y<K, V> extends C4360h implements Map.Entry<K, V> {
        private static final long serialVersionUID = 0;

        C4367y(Map.Entry<K, V> entry, @NullableDecl Object obj) {
            super(entry, obj);
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            boolean zEquals;
            synchronized (this.mutex) {
                zEquals = delegate().equals(obj);
            }
            return zEquals;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            K key;
            synchronized (this.mutex) {
                key = delegate().getKey();
            }
            return key;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            V value;
            synchronized (this.mutex) {
                value = delegate().getValue();
            }
            return value;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            int iHashCode;
            synchronized (this.mutex) {
                iHashCode = delegate().hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v2) {
            V value;
            synchronized (this.mutex) {
                value = delegate().setValue(v2);
            }
            return value;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.exv8.C4360h
        public Map.Entry<K, V> delegate() {
            return (Map.Entry) super.delegate();
        }
    }

    private exv8() {
    }

    @wlev.zy
    static <E> NavigableSet<E> cdj(NavigableSet<E> navigableSet) {
        return ki(navigableSet, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static <K, V> com.google.common.collect.ni7<K, V> f7l8(com.google.common.collect.ni7<K, V> ni7Var, @NullableDecl Object obj) {
        return ((ni7Var instanceof C4363n) || (ni7Var instanceof cfr)) ? ni7Var : new C4363n(ni7Var, obj, null);
    }

    @InterfaceC7732q
    static <E> Set<E> fn3e(Set<E> set, @NullableDecl Object obj) {
        return new t8r(set, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> SortedSet<E> fu4(SortedSet<E> sortedSet, @NullableDecl Object obj) {
        return new zurt(sortedSet, obj);
    }

    @wlev.zy
    /* JADX INFO: renamed from: h */
    static <K, V> NavigableMap<K, V> m15667h(NavigableMap<K, V> navigableMap, @NullableDecl Object obj) {
        return new n7h(navigableMap, obj);
    }

    /* JADX INFO: renamed from: i */
    static <E> Queue<E> m15668i(Queue<E> queue, @NullableDecl Object obj) {
        return queue instanceof cdj ? queue : new cdj(queue, obj);
    }

    @wlev.zy
    static <E> NavigableSet<E> ki(NavigableSet<E> navigableSet, @NullableDecl Object obj) {
        return new kja0(navigableSet, obj);
    }

    @wlev.zy
    static <K, V> NavigableMap<K, V> kja0(NavigableMap<K, V> navigableMap) {
        return m15667h(navigableMap, null);
    }

    static <K, V> h4b<K, V> ld6(h4b<K, V> h4bVar, @NullableDecl Object obj) {
        return ((h4bVar instanceof C4364p) || (h4bVar instanceof com.google.common.collect.zurt)) ? h4bVar : new C4364p(h4bVar, obj);
    }

    static <E> o05<E> n7h(o05<E> o05Var, @NullableDecl Object obj) {
        return ((o05Var instanceof qrj) || (o05Var instanceof b3e)) ? o05Var : new qrj(o05Var, obj);
    }

    static <K, V> SortedMap<K, V> ni7(SortedMap<K, V> sortedMap, @NullableDecl Object obj) {
        return new fn3e(sortedMap, obj);
    }

    static <R, C, V> qh4d<R, C, V> o1t(qh4d<R, C, V> qh4dVar, Object obj) {
        return new fu4(qh4dVar, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static <E> List<E> m15671p(List<E> list, @NullableDecl Object obj) {
        return list instanceof RandomAccess ? new ki(list, obj) : new C4366s(list, obj);
    }

    static <K, V> lw<K, V> qrj(lw<K, V> lwVar, @NullableDecl Object obj) {
        return ((lwVar instanceof x2) || (lwVar instanceof com.google.common.collect.zurt)) ? lwVar : new x2(lwVar, obj);
    }

    /* JADX INFO: renamed from: s */
    static <E> Deque<E> m15673s(Deque<E> deque, @NullableDecl Object obj) {
        return new f7l8(deque, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static <E> Set<E> m15674t(Set<E> set, @NullableDecl Object obj) {
        return set instanceof SortedSet ? fu4((SortedSet) set, obj) : fn3e(set, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @wlev.zy
    public static <K, V> Map.Entry<K, V> t8r(@NullableDecl Map.Entry<K, V> entry, @NullableDecl Object obj) {
        if (entry == null) {
            return null;
        }
        return new C4367y(entry, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> Collection<E> wvg(Collection<E> collection, @NullableDecl Object obj) {
        return collection instanceof SortedSet ? fu4((SortedSet) collection, obj) : collection instanceof Set ? fn3e((Set) collection, obj) : collection instanceof List ? m15671p((List) collection, obj) : m15675y(collection, obj);
    }

    @InterfaceC7732q
    static <K, V> Map<K, V> x2(Map<K, V> map, @NullableDecl Object obj) {
        return new ld6(map, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static <E> Collection<E> m15675y(Collection<E> collection, @NullableDecl Object obj) {
        return new C4359g(collection, obj);
    }

    /* JADX INFO: renamed from: z */
    static <K, V> xm<K, V> m15676z(xm<K, V> xmVar, @NullableDecl Object obj) {
        return xmVar instanceof ni7 ? xmVar : new ni7(xmVar, obj);
    }

    static <K, V> wt<K, V> zurt(wt<K, V> wtVar, @NullableDecl Object obj) {
        return ((wtVar instanceof C4361i) || (wtVar instanceof com.google.common.collect.zurt)) ? wtVar : new C4361i(wtVar, obj);
    }

    /* JADX INFO: compiled from: Synchronized.java */
    private static class cdj<E> extends C4359g<E> implements Queue<E> {
        private static final long serialVersionUID = 0;

        cdj(Queue<E> queue, @NullableDecl Object obj) {
            super(queue, obj);
        }

        @Override // java.util.Queue
        public E element() {
            E eElement;
            synchronized (this.mutex) {
                eElement = delegate().element();
            }
            return eElement;
        }

        @Override // java.util.Queue
        public boolean offer(E e2) {
            boolean zOffer;
            synchronized (this.mutex) {
                zOffer = delegate().offer(e2);
            }
            return zOffer;
        }

        @Override // java.util.Queue
        public E peek() {
            E ePeek;
            synchronized (this.mutex) {
                ePeek = delegate().peek();
            }
            return ePeek;
        }

        @Override // java.util.Queue
        public E poll() {
            E ePoll;
            synchronized (this.mutex) {
                ePoll = delegate().poll();
            }
            return ePoll;
        }

        @Override // java.util.Queue
        public E remove() {
            E eRemove;
            synchronized (this.mutex) {
                eRemove = delegate().remove();
            }
            return eRemove;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.exv8.C4359g, com.google.common.collect.exv8.C4360h
        public Queue<E> delegate() {
            return (Queue) super.delegate();
        }
    }

    /* JADX INFO: compiled from: Synchronized.java */
    static class fn3e<K, V> extends ld6<K, V> implements SortedMap<K, V> {
        private static final long serialVersionUID = 0;

        fn3e(SortedMap<K, V> sortedMap, @NullableDecl Object obj) {
            super(sortedMap, obj);
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
            Comparator<? super K> comparator;
            synchronized (this.mutex) {
                comparator = delegate().comparator();
            }
            return comparator;
        }

        @Override // java.util.SortedMap
        public K firstKey() {
            K kFirstKey;
            synchronized (this.mutex) {
                kFirstKey = delegate().firstKey();
            }
            return kFirstKey;
        }

        @Override // java.util.SortedMap
        public SortedMap<K, V> headMap(K k2) {
            SortedMap<K, V> sortedMapNi7;
            synchronized (this.mutex) {
                sortedMapNi7 = exv8.ni7(delegate().headMap(k2), this.mutex);
            }
            return sortedMapNi7;
        }

        @Override // java.util.SortedMap
        public K lastKey() {
            K kLastKey;
            synchronized (this.mutex) {
                kLastKey = delegate().lastKey();
            }
            return kLastKey;
        }

        @Override // java.util.SortedMap
        public SortedMap<K, V> subMap(K k2, K k3) {
            SortedMap<K, V> sortedMapNi7;
            synchronized (this.mutex) {
                sortedMapNi7 = exv8.ni7(delegate().subMap(k2, k3), this.mutex);
            }
            return sortedMapNi7;
        }

        @Override // java.util.SortedMap
        public SortedMap<K, V> tailMap(K k2) {
            SortedMap<K, V> sortedMapNi7;
            synchronized (this.mutex) {
                sortedMapNi7 = exv8.ni7(delegate().tailMap(k2), this.mutex);
            }
            return sortedMapNi7;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.exv8.ld6, com.google.common.collect.exv8.C4360h
        public SortedMap<K, V> delegate() {
            return (SortedMap) super.delegate();
        }
    }

    /* JADX INFO: compiled from: Synchronized.java */
    private static class ni7<K, V> extends C4361i<K, V> implements xm<K, V> {
        private static final long serialVersionUID = 0;

        ni7(xm<K, V> xmVar, @NullableDecl Object obj) {
            super(xmVar, obj);
        }

        @Override // com.google.common.collect.xm
        public Comparator<? super V> valueComparator() {
            Comparator<? super V> comparatorValueComparator;
            synchronized (this.mutex) {
                comparatorValueComparator = delegate().valueComparator();
            }
            return comparatorValueComparator;
        }

        @Override // com.google.common.collect.exv8.C4361i, com.google.common.collect.exv8.x2, com.google.common.collect.lw
        public SortedSet<V> get(K k2) {
            SortedSet<V> sortedSetFu4;
            synchronized (this.mutex) {
                sortedSetFu4 = exv8.fu4(delegate().get((Object) k2), this.mutex);
            }
            return sortedSetFu4;
        }

        @Override // com.google.common.collect.exv8.C4361i, com.google.common.collect.exv8.x2, com.google.common.collect.lw
        public SortedSet<V> removeAll(Object obj) {
            SortedSet<V> sortedSetRemoveAll;
            synchronized (this.mutex) {
                sortedSetRemoveAll = delegate().removeAll(obj);
            }
            return sortedSetRemoveAll;
        }

        @Override // com.google.common.collect.exv8.C4361i, com.google.common.collect.exv8.x2, com.google.common.collect.lw
        public SortedSet<V> replaceValues(K k2, Iterable<? extends V> iterable) {
            SortedSet<V> sortedSetReplaceValues;
            synchronized (this.mutex) {
                sortedSetReplaceValues = delegate().replaceValues((Object) k2, (Iterable) iterable);
            }
            return sortedSetReplaceValues;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.exv8.C4361i, com.google.common.collect.exv8.x2, com.google.common.collect.exv8.C4360h
        public xm<K, V> delegate() {
            return (xm) super.delegate();
        }
    }

    /* JADX INFO: compiled from: Synchronized.java */
    private static class qrj<E> extends C4359g<E> implements o05<E> {
        private static final long serialVersionUID = 0;

        @MonotonicNonNullDecl
        transient Set<E> elementSet;

        @MonotonicNonNullDecl
        transient Set<o05.InterfaceC4482k<E>> entrySet;

        qrj(o05<E> o05Var, @NullableDecl Object obj) {
            super(o05Var, obj);
        }

        @Override // com.google.common.collect.o05
        public int add(E e2, int i2) {
            int iAdd;
            synchronized (this.mutex) {
                iAdd = delegate().add(e2, i2);
            }
            return iAdd;
        }

        @Override // com.google.common.collect.o05
        public int count(Object obj) {
            int iCount;
            synchronized (this.mutex) {
                iCount = delegate().count(obj);
            }
            return iCount;
        }

        @Override // com.google.common.collect.o05
        public Set<E> elementSet() {
            Set<E> set;
            synchronized (this.mutex) {
                if (this.elementSet == null) {
                    this.elementSet = exv8.m15674t(delegate().elementSet(), this.mutex);
                }
                set = this.elementSet;
            }
            return set;
        }

        @Override // com.google.common.collect.o05
        public Set<o05.InterfaceC4482k<E>> entrySet() {
            Set<o05.InterfaceC4482k<E>> set;
            synchronized (this.mutex) {
                if (this.entrySet == null) {
                    this.entrySet = exv8.m15674t(delegate().entrySet(), this.mutex);
                }
                set = this.entrySet;
            }
            return set;
        }

        @Override // java.util.Collection, com.google.common.collect.o05
        public boolean equals(Object obj) {
            boolean zEquals;
            if (obj == this) {
                return true;
            }
            synchronized (this.mutex) {
                zEquals = delegate().equals(obj);
            }
            return zEquals;
        }

        @Override // java.util.Collection, com.google.common.collect.o05
        public int hashCode() {
            int iHashCode;
            synchronized (this.mutex) {
                iHashCode = delegate().hashCode();
            }
            return iHashCode;
        }

        @Override // com.google.common.collect.o05
        public int remove(Object obj, int i2) {
            int iRemove;
            synchronized (this.mutex) {
                iRemove = delegate().remove(obj, i2);
            }
            return iRemove;
        }

        @Override // com.google.common.collect.o05
        public int setCount(E e2, int i2) {
            int count;
            synchronized (this.mutex) {
                count = delegate().setCount(e2, i2);
            }
            return count;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.exv8.C4359g, com.google.common.collect.exv8.C4360h
        public o05<E> delegate() {
            return (o05) super.delegate();
        }

        @Override // com.google.common.collect.o05
        public boolean setCount(E e2, int i2, int i3) {
            boolean count;
            synchronized (this.mutex) {
                count = delegate().setCount(e2, i2, i3);
            }
            return count;
        }
    }

    /* JADX INFO: compiled from: Synchronized.java */
    static class t8r<E> extends C4359g<E> implements Set<E> {
        private static final long serialVersionUID = 0;

        t8r(Set<E> set, @NullableDecl Object obj) {
            super(set, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            boolean zEquals;
            if (obj == this) {
                return true;
            }
            synchronized (this.mutex) {
                zEquals = delegate().equals(obj);
            }
            return zEquals;
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            int iHashCode;
            synchronized (this.mutex) {
                iHashCode = delegate().hashCode();
            }
            return iHashCode;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.exv8.C4359g, com.google.common.collect.exv8.C4360h
        public Set<E> delegate() {
            return (Set) super.delegate();
        }
    }

    /* JADX INFO: compiled from: Synchronized.java */
    private static final class f7l8<E> extends cdj<E> implements Deque<E> {
        private static final long serialVersionUID = 0;

        f7l8(Deque<E> deque, @NullableDecl Object obj) {
            super(deque, obj);
        }

        @Override // java.util.Deque
        public void addFirst(E e2) {
            synchronized (this.mutex) {
                delegate().addFirst(e2);
            }
        }

        @Override // java.util.Deque
        public void addLast(E e2) {
            synchronized (this.mutex) {
                delegate().addLast(e2);
            }
        }

        @Override // java.util.Deque
        public Iterator<E> descendingIterator() {
            Iterator<E> itDescendingIterator;
            synchronized (this.mutex) {
                itDescendingIterator = delegate().descendingIterator();
            }
            return itDescendingIterator;
        }

        @Override // java.util.Deque
        public E getFirst() {
            E first;
            synchronized (this.mutex) {
                first = delegate().getFirst();
            }
            return first;
        }

        @Override // java.util.Deque
        public E getLast() {
            E last;
            synchronized (this.mutex) {
                last = delegate().getLast();
            }
            return last;
        }

        @Override // java.util.Deque
        public boolean offerFirst(E e2) {
            boolean zOfferFirst;
            synchronized (this.mutex) {
                zOfferFirst = delegate().offerFirst(e2);
            }
            return zOfferFirst;
        }

        @Override // java.util.Deque
        public boolean offerLast(E e2) {
            boolean zOfferLast;
            synchronized (this.mutex) {
                zOfferLast = delegate().offerLast(e2);
            }
            return zOfferLast;
        }

        @Override // java.util.Deque
        public E peekFirst() {
            E ePeekFirst;
            synchronized (this.mutex) {
                ePeekFirst = delegate().peekFirst();
            }
            return ePeekFirst;
        }

        @Override // java.util.Deque
        public E peekLast() {
            E ePeekLast;
            synchronized (this.mutex) {
                ePeekLast = delegate().peekLast();
            }
            return ePeekLast;
        }

        @Override // java.util.Deque
        public E pollFirst() {
            E ePollFirst;
            synchronized (this.mutex) {
                ePollFirst = delegate().pollFirst();
            }
            return ePollFirst;
        }

        @Override // java.util.Deque
        public E pollLast() {
            E ePollLast;
            synchronized (this.mutex) {
                ePollLast = delegate().pollLast();
            }
            return ePollLast;
        }

        @Override // java.util.Deque
        public E pop() {
            E ePop;
            synchronized (this.mutex) {
                ePop = delegate().pop();
            }
            return ePop;
        }

        @Override // java.util.Deque
        public void push(E e2) {
            synchronized (this.mutex) {
                delegate().push(e2);
            }
        }

        @Override // java.util.Deque
        public E removeFirst() {
            E eRemoveFirst;
            synchronized (this.mutex) {
                eRemoveFirst = delegate().removeFirst();
            }
            return eRemoveFirst;
        }

        @Override // java.util.Deque
        public boolean removeFirstOccurrence(Object obj) {
            boolean zRemoveFirstOccurrence;
            synchronized (this.mutex) {
                zRemoveFirstOccurrence = delegate().removeFirstOccurrence(obj);
            }
            return zRemoveFirstOccurrence;
        }

        @Override // java.util.Deque
        public E removeLast() {
            E eRemoveLast;
            synchronized (this.mutex) {
                eRemoveLast = delegate().removeLast();
            }
            return eRemoveLast;
        }

        @Override // java.util.Deque
        public boolean removeLastOccurrence(Object obj) {
            boolean zRemoveLastOccurrence;
            synchronized (this.mutex) {
                zRemoveLastOccurrence = delegate().removeLastOccurrence(obj);
            }
            return zRemoveLastOccurrence;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.exv8.cdj, com.google.common.collect.exv8.C4359g, com.google.common.collect.exv8.C4360h
        public Deque<E> delegate() {
            return (Deque) super.delegate();
        }
    }

    /* JADX INFO: compiled from: Synchronized.java */
    @InterfaceC7732q
    @wlev.zy
    static class kja0<E> extends zurt<E> implements NavigableSet<E> {
        private static final long serialVersionUID = 0;

        @MonotonicNonNullDecl
        transient NavigableSet<E> descendingSet;

        kja0(NavigableSet<E> navigableSet, @NullableDecl Object obj) {
            super(navigableSet, obj);
        }

        @Override // java.util.NavigableSet
        public E ceiling(E e2) {
            E eCeiling;
            synchronized (this.mutex) {
                eCeiling = delegate().ceiling(e2);
            }
            return eCeiling;
        }

        @Override // java.util.NavigableSet
        public Iterator<E> descendingIterator() {
            return delegate().descendingIterator();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> descendingSet() {
            synchronized (this.mutex) {
                NavigableSet<E> navigableSet = this.descendingSet;
                if (navigableSet != null) {
                    return navigableSet;
                }
                NavigableSet<E> navigableSetKi = exv8.ki(delegate().descendingSet(), this.mutex);
                this.descendingSet = navigableSetKi;
                return navigableSetKi;
            }
        }

        @Override // java.util.NavigableSet
        public E floor(E e2) {
            E eFloor;
            synchronized (this.mutex) {
                eFloor = delegate().floor(e2);
            }
            return eFloor;
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> headSet(E e2, boolean z2) {
            NavigableSet<E> navigableSetKi;
            synchronized (this.mutex) {
                navigableSetKi = exv8.ki(delegate().headSet(e2, z2), this.mutex);
            }
            return navigableSetKi;
        }

        @Override // java.util.NavigableSet
        public E higher(E e2) {
            E eHigher;
            synchronized (this.mutex) {
                eHigher = delegate().higher(e2);
            }
            return eHigher;
        }

        @Override // java.util.NavigableSet
        public E lower(E e2) {
            E eLower;
            synchronized (this.mutex) {
                eLower = delegate().lower(e2);
            }
            return eLower;
        }

        @Override // java.util.NavigableSet
        public E pollFirst() {
            E ePollFirst;
            synchronized (this.mutex) {
                ePollFirst = delegate().pollFirst();
            }
            return ePollFirst;
        }

        @Override // java.util.NavigableSet
        public E pollLast() {
            E ePollLast;
            synchronized (this.mutex) {
                ePollLast = delegate().pollLast();
            }
            return ePollLast;
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> subSet(E e2, boolean z2, E e3, boolean z3) {
            NavigableSet<E> navigableSetKi;
            synchronized (this.mutex) {
                navigableSetKi = exv8.ki(delegate().subSet(e2, z2, e3, z3), this.mutex);
            }
            return navigableSetKi;
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> tailSet(E e2, boolean z2) {
            NavigableSet<E> navigableSetKi;
            synchronized (this.mutex) {
                navigableSetKi = exv8.ki(delegate().tailSet(e2, z2), this.mutex);
            }
            return navigableSetKi;
        }

        @Override // com.google.common.collect.exv8.zurt, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<E> headSet(E e2) {
            return headSet(e2, false);
        }

        @Override // com.google.common.collect.exv8.zurt, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<E> tailSet(E e2) {
            return tailSet(e2, true);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.exv8.zurt, com.google.common.collect.exv8.t8r, com.google.common.collect.exv8.C4359g, com.google.common.collect.exv8.C4360h
        public NavigableSet<E> delegate() {
            return (NavigableSet) super.delegate();
        }

        @Override // com.google.common.collect.exv8.zurt, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<E> subSet(E e2, E e3) {
            return subSet(e2, true, e3, false);
        }
    }

    /* JADX INFO: compiled from: Synchronized.java */
    @InterfaceC7732q
    @wlev.zy
    static class n7h<K, V> extends fn3e<K, V> implements NavigableMap<K, V> {
        private static final long serialVersionUID = 0;

        @MonotonicNonNullDecl
        transient NavigableSet<K> descendingKeySet;

        @MonotonicNonNullDecl
        transient NavigableMap<K, V> descendingMap;

        @MonotonicNonNullDecl
        transient NavigableSet<K> navigableKeySet;

        n7h(NavigableMap<K, V> navigableMap, @NullableDecl Object obj) {
            super(navigableMap, obj);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> ceilingEntry(K k2) {
            Map.Entry<K, V> entryT8r;
            synchronized (this.mutex) {
                entryT8r = exv8.t8r(delegate().ceilingEntry(k2), this.mutex);
            }
            return entryT8r;
        }

        @Override // java.util.NavigableMap
        public K ceilingKey(K k2) {
            K kCeilingKey;
            synchronized (this.mutex) {
                kCeilingKey = delegate().ceilingKey(k2);
            }
            return kCeilingKey;
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
            synchronized (this.mutex) {
                NavigableSet<K> navigableSet = this.descendingKeySet;
                if (navigableSet != null) {
                    return navigableSet;
                }
                NavigableSet<K> navigableSetKi = exv8.ki(delegate().descendingKeySet(), this.mutex);
                this.descendingKeySet = navigableSetKi;
                return navigableSetKi;
            }
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> descendingMap() {
            synchronized (this.mutex) {
                NavigableMap<K, V> navigableMap = this.descendingMap;
                if (navigableMap != null) {
                    return navigableMap;
                }
                NavigableMap<K, V> navigableMapM15667h = exv8.m15667h(delegate().descendingMap(), this.mutex);
                this.descendingMap = navigableMapM15667h;
                return navigableMapM15667h;
            }
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> firstEntry() {
            Map.Entry<K, V> entryT8r;
            synchronized (this.mutex) {
                entryT8r = exv8.t8r(delegate().firstEntry(), this.mutex);
            }
            return entryT8r;
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> floorEntry(K k2) {
            Map.Entry<K, V> entryT8r;
            synchronized (this.mutex) {
                entryT8r = exv8.t8r(delegate().floorEntry(k2), this.mutex);
            }
            return entryT8r;
        }

        @Override // java.util.NavigableMap
        public K floorKey(K k2) {
            K kFloorKey;
            synchronized (this.mutex) {
                kFloorKey = delegate().floorKey(k2);
            }
            return kFloorKey;
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> headMap(K k2, boolean z2) {
            NavigableMap<K, V> navigableMapM15667h;
            synchronized (this.mutex) {
                navigableMapM15667h = exv8.m15667h(delegate().headMap(k2, z2), this.mutex);
            }
            return navigableMapM15667h;
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> higherEntry(K k2) {
            Map.Entry<K, V> entryT8r;
            synchronized (this.mutex) {
                entryT8r = exv8.t8r(delegate().higherEntry(k2), this.mutex);
            }
            return entryT8r;
        }

        @Override // java.util.NavigableMap
        public K higherKey(K k2) {
            K kHigherKey;
            synchronized (this.mutex) {
                kHigherKey = delegate().higherKey(k2);
            }
            return kHigherKey;
        }

        @Override // com.google.common.collect.exv8.ld6, java.util.Map
        public Set<K> keySet() {
            return navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> lastEntry() {
            Map.Entry<K, V> entryT8r;
            synchronized (this.mutex) {
                entryT8r = exv8.t8r(delegate().lastEntry(), this.mutex);
            }
            return entryT8r;
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> lowerEntry(K k2) {
            Map.Entry<K, V> entryT8r;
            synchronized (this.mutex) {
                entryT8r = exv8.t8r(delegate().lowerEntry(k2), this.mutex);
            }
            return entryT8r;
        }

        @Override // java.util.NavigableMap
        public K lowerKey(K k2) {
            K kLowerKey;
            synchronized (this.mutex) {
                kLowerKey = delegate().lowerKey(k2);
            }
            return kLowerKey;
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            synchronized (this.mutex) {
                NavigableSet<K> navigableSet = this.navigableKeySet;
                if (navigableSet != null) {
                    return navigableSet;
                }
                NavigableSet<K> navigableSetKi = exv8.ki(delegate().navigableKeySet(), this.mutex);
                this.navigableKeySet = navigableSetKi;
                return navigableSetKi;
            }
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> pollFirstEntry() {
            Map.Entry<K, V> entryT8r;
            synchronized (this.mutex) {
                entryT8r = exv8.t8r(delegate().pollFirstEntry(), this.mutex);
            }
            return entryT8r;
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> pollLastEntry() {
            Map.Entry<K, V> entryT8r;
            synchronized (this.mutex) {
                entryT8r = exv8.t8r(delegate().pollLastEntry(), this.mutex);
            }
            return entryT8r;
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> subMap(K k2, boolean z2, K k3, boolean z3) {
            NavigableMap<K, V> navigableMapM15667h;
            synchronized (this.mutex) {
                navigableMapM15667h = exv8.m15667h(delegate().subMap(k2, z2, k3, z3), this.mutex);
            }
            return navigableMapM15667h;
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> tailMap(K k2, boolean z2) {
            NavigableMap<K, V> navigableMapM15667h;
            synchronized (this.mutex) {
                navigableMapM15667h = exv8.m15667h(delegate().tailMap(k2, z2), this.mutex);
            }
            return navigableMapM15667h;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.exv8.fn3e, com.google.common.collect.exv8.ld6, com.google.common.collect.exv8.C4360h
        public NavigableMap<K, V> delegate() {
            return (NavigableMap) super.delegate();
        }

        @Override // com.google.common.collect.exv8.fn3e, java.util.SortedMap
        public SortedMap<K, V> headMap(K k2) {
            return headMap(k2, false);
        }

        @Override // com.google.common.collect.exv8.fn3e, java.util.SortedMap
        public SortedMap<K, V> subMap(K k2, K k3) {
            return subMap(k2, true, k3, false);
        }

        @Override // com.google.common.collect.exv8.fn3e, java.util.SortedMap
        public SortedMap<K, V> tailMap(K k2) {
            return tailMap(k2, true);
        }
    }

    /* JADX INFO: compiled from: Synchronized.java */
    static class zurt<E> extends t8r<E> implements SortedSet<E> {
        private static final long serialVersionUID = 0;

        zurt(SortedSet<E> sortedSet, @NullableDecl Object obj) {
            super(sortedSet, obj);
        }

        @Override // java.util.SortedSet
        public Comparator<? super E> comparator() {
            Comparator<? super E> comparator;
            synchronized (this.mutex) {
                comparator = delegate().comparator();
            }
            return comparator;
        }

        @Override // java.util.SortedSet
        public E first() {
            E eFirst;
            synchronized (this.mutex) {
                eFirst = delegate().first();
            }
            return eFirst;
        }

        public SortedSet<E> headSet(E e2) {
            SortedSet<E> sortedSetFu4;
            synchronized (this.mutex) {
                sortedSetFu4 = exv8.fu4(delegate().headSet(e2), this.mutex);
            }
            return sortedSetFu4;
        }

        @Override // java.util.SortedSet
        public E last() {
            E eLast;
            synchronized (this.mutex) {
                eLast = delegate().last();
            }
            return eLast;
        }

        public SortedSet<E> subSet(E e2, E e3) {
            SortedSet<E> sortedSetFu4;
            synchronized (this.mutex) {
                sortedSetFu4 = exv8.fu4(delegate().subSet(e2, e3), this.mutex);
            }
            return sortedSetFu4;
        }

        public SortedSet<E> tailSet(E e2) {
            SortedSet<E> sortedSetFu4;
            synchronized (this.mutex) {
                sortedSetFu4 = exv8.fu4(delegate().tailSet(e2), this.mutex);
            }
            return sortedSetFu4;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.exv8.t8r, com.google.common.collect.exv8.C4359g, com.google.common.collect.exv8.C4360h
        public SortedSet<E> delegate() {
            return (SortedSet) super.delegate();
        }
    }

    /* JADX INFO: compiled from: Synchronized.java */
    private static class zy<K, V> extends t8r<Map.Entry<K, Collection<V>>> {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: com.google.common.collect.exv8$zy$k */
        /* JADX INFO: compiled from: Synchronized.java */
        class C4368k extends pnt2<Map.Entry<K, Collection<V>>, Map.Entry<K, Collection<V>>> {

            /* JADX INFO: renamed from: com.google.common.collect.exv8$zy$k$k */
            /* JADX INFO: compiled from: Synchronized.java */
            class k extends AbstractC4531v<K, Collection<V>> {

                /* JADX INFO: renamed from: k */
                final /* synthetic */ Map.Entry f26111k;

                k(Map.Entry entry) {
                    this.f26111k = entry;
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.google.common.collect.AbstractC4531v, com.google.common.collect.qkj8
                /* JADX INFO: renamed from: ld6 */
                public Map.Entry<K, Collection<V>> delegate() {
                    return this.f26111k;
                }

                @Override // com.google.common.collect.AbstractC4531v, java.util.Map.Entry
                /* JADX INFO: renamed from: x2, reason: merged with bridge method [inline-methods] */
                public Collection<V> getValue() {
                    return exv8.wvg((Collection) this.f26111k.getValue(), zy.this.mutex);
                }
            }

            C4368k(Iterator it) {
                super(it);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.collect.pnt2
            /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, Collection<V>> mo15580k(Map.Entry<K, Collection<V>> entry) {
                return new k(entry);
            }
        }

        zy(Set<Map.Entry<K, Collection<V>>> set, @NullableDecl Object obj) {
            super(set, obj);
        }

        @Override // com.google.common.collect.exv8.C4359g, java.util.Collection
        public boolean contains(Object obj) {
            boolean zM16015h;
            synchronized (this.mutex) {
                zM16015h = vy.m16015h(delegate(), obj);
            }
            return zM16015h;
        }

        @Override // com.google.common.collect.exv8.C4359g, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            boolean zZy;
            synchronized (this.mutex) {
                zZy = mcp.zy(delegate(), collection);
            }
            return zZy;
        }

        @Override // com.google.common.collect.exv8.t8r, java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            boolean zF7l8;
            if (obj == this) {
                return true;
            }
            synchronized (this.mutex) {
                zF7l8 = g0ad.f7l8(delegate(), obj);
            }
            return zF7l8;
        }

        @Override // com.google.common.collect.exv8.C4359g, java.util.Collection, java.lang.Iterable
        public Iterator<Map.Entry<K, Collection<V>>> iterator() {
            return new C4368k(super.iterator());
        }

        @Override // com.google.common.collect.exv8.C4359g, java.util.Collection
        public boolean remove(Object obj) {
            boolean zI1;
            synchronized (this.mutex) {
                zI1 = vy.i1(delegate(), obj);
            }
            return zI1;
        }

        @Override // com.google.common.collect.exv8.C4359g, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            boolean zM16118c;
            synchronized (this.mutex) {
                zM16118c = zwy.m16118c(delegate().iterator(), collection);
            }
            return zM16118c;
        }

        @Override // com.google.common.collect.exv8.C4359g, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            boolean zUv6;
            synchronized (this.mutex) {
                zUv6 = zwy.uv6(delegate().iterator(), collection);
            }
            return zUv6;
        }

        @Override // com.google.common.collect.exv8.C4359g, java.util.Collection
        public Object[] toArray() {
            Object[] objArrX2;
            synchronized (this.mutex) {
                objArrX2 = r25n.x2(delegate());
            }
            return objArrX2;
        }

        @Override // com.google.common.collect.exv8.C4359g, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            T[] tArr2;
            synchronized (this.mutex) {
                tArr2 = (T[]) r25n.qrj(delegate(), tArr);
            }
            return tArr2;
        }
    }
}
