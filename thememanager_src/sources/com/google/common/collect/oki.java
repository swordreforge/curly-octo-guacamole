package com.google.common.collect;

import com.google.common.collect.AbstractC4469n;
import com.google.common.collect.AbstractC4579y;
import com.google.common.collect.g0ad;
import com.google.common.collect.gc3c;
import com.google.common.collect.m58i;
import com.google.common.collect.o05;
import com.google.common.collect.vy;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.j2objc.annotations.Weak;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedSet;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import wlev.InterfaceC7731k;

/* JADX INFO: compiled from: Multimaps.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq(emulated = true)
public final class oki {

    /* JADX INFO: compiled from: Multimaps.java */
    static class f7l8<K, V> extends AbstractC4519s<K> {

        /* JADX INFO: renamed from: n */
        @Weak
        final lw<K, V> f26503n;

        /* JADX INFO: renamed from: com.google.common.collect.oki$f7l8$k */
        /* JADX INFO: compiled from: Multimaps.java */
        class C4491k extends pnt2<Map.Entry<K, Collection<V>>, o05.InterfaceC4482k<K>> {

            /* JADX INFO: renamed from: com.google.common.collect.oki$f7l8$k$k */
            /* JADX INFO: compiled from: Multimaps.java */
            class k extends m58i.AbstractC4452g<K> {

                /* JADX INFO: renamed from: k */
                final /* synthetic */ Map.Entry f26505k;

                k(Map.Entry entry) {
                    this.f26505k = entry;
                }

                @Override // com.google.common.collect.o05.InterfaceC4482k
                public int getCount() {
                    return ((Collection) this.f26505k.getValue()).size();
                }

                @Override // com.google.common.collect.o05.InterfaceC4482k
                public K getElement() {
                    return (K) this.f26505k.getKey();
                }
            }

            C4491k(Iterator it) {
                super(it);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.collect.pnt2
            /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
            public o05.InterfaceC4482k<K> mo15580k(Map.Entry<K, Collection<V>> entry) {
                return new k(entry);
            }
        }

        f7l8(lw<K, V> lwVar) {
            this.f26503n = lwVar;
        }

        @Override // com.google.common.collect.AbstractC4519s, java.util.AbstractCollection, java.util.Collection
        public void clear() {
            this.f26503n.clear();
        }

        @Override // com.google.common.collect.AbstractC4519s, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.o05
        public boolean contains(@NullableDecl Object obj) {
            return this.f26503n.containsKey(obj);
        }

        @Override // com.google.common.collect.o05
        public int count(@NullableDecl Object obj) {
            Collection collection = (Collection) vy.ch(this.f26503n.asMap(), obj);
            if (collection == null) {
                return 0;
            }
            return collection.size();
        }

        @Override // com.google.common.collect.AbstractC4519s
        int distinctElements() {
            return this.f26503n.asMap().size();
        }

        @Override // com.google.common.collect.AbstractC4519s
        Iterator<K> elementIterator() {
            throw new AssertionError("should never be called");
        }

        @Override // com.google.common.collect.AbstractC4519s, com.google.common.collect.o05
        public Set<K> elementSet() {
            return this.f26503n.keySet();
        }

        @Override // com.google.common.collect.AbstractC4519s
        Iterator<o05.InterfaceC4482k<K>> entryIterator() {
            return new C4491k(this.f26503n.asMap().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.o05
        public Iterator<K> iterator() {
            return vy.n5r1(this.f26503n.entries().iterator());
        }

        @Override // com.google.common.collect.AbstractC4519s, com.google.common.collect.o05
        public int remove(@NullableDecl Object obj, int i2) {
            C4524t.toq(i2, "occurrences");
            if (i2 == 0) {
                return count(obj);
            }
            Collection collection = (Collection) vy.ch(this.f26503n.asMap(), obj);
            if (collection == null) {
                return 0;
            }
            int size = collection.size();
            if (i2 >= size) {
                collection.clear();
            } else {
                Iterator it = collection.iterator();
                for (int i3 = 0; i3 < i2; i3++) {
                    it.next();
                    it.remove();
                }
            }
            return size;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.o05
        public int size() {
            return this.f26503n.size();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.oki$g */
    /* JADX INFO: compiled from: Multimaps.java */
    static abstract class AbstractC4492g<K, V> extends AbstractCollection<Map.Entry<K, V>> {
        AbstractC4492g() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            mo15941k().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@NullableDecl Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return mo15941k().containsEntry(entry.getKey(), entry.getValue());
        }

        /* JADX INFO: renamed from: k */
        abstract lw<K, V> mo15941k();

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(@NullableDecl Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return mo15941k().remove(entry.getKey(), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return mo15941k().size();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.oki$k */
    /* JADX INFO: compiled from: Multimaps.java */
    static final class C4493k<K, V> extends vy.AbstractC4543l<K, Collection<V>> {

        /* JADX INFO: renamed from: g */
        @Weak
        private final lw<K, V> f26507g;

        /* JADX INFO: renamed from: com.google.common.collect.oki$k$k */
        /* JADX INFO: compiled from: Multimaps.java */
        class k extends vy.t8r<K, Collection<V>> {

            /* JADX INFO: renamed from: com.google.common.collect.oki$k$k$k, reason: collision with other inner class name */
            /* JADX INFO: compiled from: Multimaps.java */
            class C7994k implements com.google.common.base.t8r<K, Collection<V>> {
                C7994k() {
                }

                @Override // com.google.common.base.t8r
                /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
                public Collection<V> apply(K k2) {
                    return C4493k.this.f26507g.get(k2);
                }
            }

            k() {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return vy.qrj(C4493k.this.f26507g.keySet(), new C7994k());
            }

            @Override // com.google.common.collect.vy.t8r
            /* JADX INFO: renamed from: k */
            Map<K, Collection<V>> mo15823k() {
                return C4493k.this;
            }

            @Override // com.google.common.collect.vy.t8r, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                C4493k.this.m15944y(((Map.Entry) obj).getKey());
                return true;
            }
        }

        C4493k(lw<K, V> lwVar) {
            this.f26507g = (lw) com.google.common.base.jk.a9(lwVar);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            this.f26507g.clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return this.f26507g.containsKey(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: f7l8, reason: merged with bridge method [inline-methods] */
        public Collection<V> remove(Object obj) {
            if (containsKey(obj)) {
                return this.f26507g.removeAll(obj);
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Collection<V> get(Object obj) {
            if (containsKey(obj)) {
                return this.f26507g.get(obj);
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean isEmpty() {
            return this.f26507g.isEmpty();
        }

        @Override // com.google.common.collect.vy.AbstractC4543l
        /* JADX INFO: renamed from: k */
        protected Set<Map.Entry<K, Collection<V>>> mo15821k() {
            return new k();
        }

        @Override // com.google.common.collect.vy.AbstractC4543l, java.util.AbstractMap, java.util.Map, java.util.SortedMap
        /* JADX INFO: renamed from: keySet */
        public Set<K> mo15886p() {
            return this.f26507g.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f26507g.keySet().size();
        }

        /* JADX INFO: renamed from: y */
        void m15944y(Object obj) {
            this.f26507g.keySet().remove(obj);
        }
    }

    /* JADX INFO: compiled from: Multimaps.java */
    private static class ld6<K, V> extends x2<K, V> implements h4b<K, V> {
        private static final long serialVersionUID = 0;

        ld6(h4b<K, V> h4bVar) {
            super(h4bVar);
        }

        @Override // com.google.common.collect.oki.x2, com.google.common.collect.ikck, com.google.common.collect.lw
        public List<V> get(K k2) {
            return Collections.unmodifiableList(delegate().get((Object) k2));
        }

        @Override // com.google.common.collect.oki.x2, com.google.common.collect.ikck, com.google.common.collect.lw
        public List<V> removeAll(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.oki.x2, com.google.common.collect.ikck, com.google.common.collect.lw
        public List<V> replaceValues(K k2, Iterable<? extends V> iterable) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.oki.x2, com.google.common.collect.ikck, com.google.common.collect.qkj8
        public h4b<K, V> delegate() {
            return (h4b) super.delegate();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.oki$p */
    /* JADX INFO: compiled from: Multimaps.java */
    private static class C4495p<K, V1, V2> extends AbstractC4579y<K, V2> {

        /* JADX INFO: renamed from: p */
        final vy.InterfaceC4539i<? super K, ? super V1, V2> f26510p;

        /* JADX INFO: renamed from: s */
        final lw<K, V1> f26511s;

        /* JADX INFO: renamed from: com.google.common.collect.oki$p$k */
        /* JADX INFO: compiled from: Multimaps.java */
        class k implements vy.InterfaceC4539i<K, Collection<V1>, Collection<V2>> {
            k() {
            }

            @Override // com.google.common.collect.vy.InterfaceC4539i
            /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
            public Collection<V2> mo15947k(K k2, Collection<V1> collection) {
                return C4495p.this.mo15946k(k2, collection);
            }
        }

        C4495p(lw<K, V1> lwVar, vy.InterfaceC4539i<? super K, ? super V1, V2> interfaceC4539i) {
            this.f26511s = (lw) com.google.common.base.jk.a9(lwVar);
            this.f26510p = (vy.InterfaceC4539i) com.google.common.base.jk.a9(interfaceC4539i);
        }

        @Override // com.google.common.collect.lw
        public void clear() {
            this.f26511s.clear();
        }

        @Override // com.google.common.collect.lw
        public boolean containsKey(Object obj) {
            return this.f26511s.containsKey(obj);
        }

        @Override // com.google.common.collect.AbstractC4579y
        Map<K, Collection<V2>> createAsMap() {
            return vy.gyi(this.f26511s.asMap(), new k());
        }

        @Override // com.google.common.collect.AbstractC4579y
        Collection<Map.Entry<K, V2>> createEntries() {
            return new AbstractC4579y.k();
        }

        @Override // com.google.common.collect.AbstractC4579y
        Set<K> createKeySet() {
            return this.f26511s.keySet();
        }

        @Override // com.google.common.collect.AbstractC4579y
        o05<K> createKeys() {
            return this.f26511s.keys();
        }

        @Override // com.google.common.collect.AbstractC4579y
        Collection<V2> createValues() {
            return mcp.n7h(this.f26511s.entries(), vy.m16031y(this.f26510p));
        }

        @Override // com.google.common.collect.AbstractC4579y
        Iterator<Map.Entry<K, V2>> entryIterator() {
            return zwy.m16124j(this.f26511s.entries().iterator(), vy.f7l8(this.f26510p));
        }

        @Override // com.google.common.collect.lw
        public Collection<V2> get(K k2) {
            return mo15946k(k2, this.f26511s.get(k2));
        }

        @Override // com.google.common.collect.AbstractC4579y, com.google.common.collect.lw
        public boolean isEmpty() {
            return this.f26511s.isEmpty();
        }

        /* JADX INFO: renamed from: k */
        Collection<V2> mo15946k(K k2, Collection<V1> collection) {
            com.google.common.base.t8r t8rVarN7h = vy.n7h(this.f26510p, k2);
            return collection instanceof List ? wlev.jk((List) collection, t8rVarN7h) : mcp.n7h(collection, t8rVarN7h);
        }

        @Override // com.google.common.collect.AbstractC4579y, com.google.common.collect.lw
        public boolean put(K k2, V2 v2) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.AbstractC4579y, com.google.common.collect.lw
        public boolean putAll(K k2, Iterable<? extends V2> iterable) {
            throw new UnsupportedOperationException();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.AbstractC4579y, com.google.common.collect.lw
        public boolean remove(Object obj, Object obj2) {
            return get(obj).remove(obj2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.lw
        public Collection<V2> removeAll(Object obj) {
            return mo15946k(obj, this.f26511s.removeAll(obj));
        }

        @Override // com.google.common.collect.AbstractC4579y, com.google.common.collect.lw
        public Collection<V2> replaceValues(K k2, Iterable<? extends V2> iterable) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.lw
        public int size() {
            return this.f26511s.size();
        }

        @Override // com.google.common.collect.AbstractC4579y, com.google.common.collect.lw
        public boolean putAll(lw<? extends K, ? extends V2> lwVar) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.oki$q */
    /* JADX INFO: compiled from: Multimaps.java */
    private static class C4496q<K, V> extends com.google.common.collect.qrj<K, V> {

        @wlev.zy
        private static final long serialVersionUID = 0;
        transient com.google.common.base.lvui<? extends Set<V>> factory;

        C4496q(Map<K, Collection<V>> map, com.google.common.base.lvui<? extends Set<V>> lvuiVar) {
            super(map);
            this.factory = (com.google.common.base.lvui) com.google.common.base.jk.a9(lvuiVar);
        }

        @wlev.zy
        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            this.factory = (com.google.common.base.lvui) objectInputStream.readObject();
            setMap((Map) objectInputStream.readObject());
        }

        @wlev.zy
        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.factory);
            objectOutputStream.writeObject(backingMap());
        }

        @Override // com.google.common.collect.AbstractC4469n, com.google.common.collect.AbstractC4579y
        Map<K, Collection<V>> createAsMap() {
            return createMaybeNavigableAsMap();
        }

        @Override // com.google.common.collect.AbstractC4469n, com.google.common.collect.AbstractC4579y
        Set<K> createKeySet() {
            return createMaybeNavigableKeySet();
        }

        @Override // com.google.common.collect.qrj, com.google.common.collect.AbstractC4469n
        <E> Collection<E> unmodifiableCollectionSubclass(Collection<E> collection) {
            return collection instanceof NavigableSet ? g0ad.dd((NavigableSet) collection) : collection instanceof SortedSet ? Collections.unmodifiableSortedSet((SortedSet) collection) : Collections.unmodifiableSet((Set) collection);
        }

        @Override // com.google.common.collect.qrj, com.google.common.collect.AbstractC4469n
        Collection<V> wrapCollection(K k2, Collection<V> collection) {
            return collection instanceof NavigableSet ? new AbstractC4469n.qrj(k2, (NavigableSet) collection, null) : collection instanceof SortedSet ? new AbstractC4469n.kja0(k2, (SortedSet) collection, null) : new AbstractC4469n.n7h(k2, (Set) collection);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.qrj, com.google.common.collect.AbstractC4469n
        public Set<V> createCollection() {
            return this.factory.get();
        }
    }

    /* JADX INFO: compiled from: Multimaps.java */
    private static class qrj<K, V> extends x2<K, V> implements wt<K, V> {
        private static final long serialVersionUID = 0;

        qrj(wt<K, V> wtVar) {
            super(wtVar);
        }

        @Override // com.google.common.collect.oki.x2, com.google.common.collect.ikck, com.google.common.collect.lw
        public Set<Map.Entry<K, V>> entries() {
            return vy.wo(delegate().entries());
        }

        @Override // com.google.common.collect.oki.x2, com.google.common.collect.ikck, com.google.common.collect.lw
        public Set<V> get(K k2) {
            return Collections.unmodifiableSet(delegate().get((Object) k2));
        }

        @Override // com.google.common.collect.oki.x2, com.google.common.collect.ikck, com.google.common.collect.lw
        public Set<V> removeAll(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.oki.x2, com.google.common.collect.ikck, com.google.common.collect.lw
        public Set<V> replaceValues(K k2, Iterable<? extends V> iterable) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.oki.x2, com.google.common.collect.ikck, com.google.common.collect.qkj8
        public wt<K, V> delegate() {
            return (wt) super.delegate();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.oki$s */
    /* JADX INFO: compiled from: Multimaps.java */
    private static final class C4497s<K, V1, V2> extends C4495p<K, V1, V2> implements h4b<K, V2> {
        C4497s(h4b<K, V1> h4bVar, vy.InterfaceC4539i<? super K, ? super V1, V2> interfaceC4539i) {
            super(h4bVar, interfaceC4539i);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.oki.C4495p
        /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
        public List<V2> mo15946k(K k2, Collection<V1> collection) {
            return wlev.jk((List) collection, vy.n7h(this.f26510p, k2));
        }

        @Override // com.google.common.collect.oki.C4495p, com.google.common.collect.lw
        public List<V2> get(K k2) {
            return mo15946k(k2, this.f26511s.get(k2));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.oki.C4495p, com.google.common.collect.lw
        public List<V2> removeAll(Object obj) {
            return mo15946k(obj, this.f26511s.removeAll(obj));
        }

        @Override // com.google.common.collect.oki.C4495p, com.google.common.collect.AbstractC4579y, com.google.common.collect.lw
        public List<V2> replaceValues(K k2, Iterable<? extends V2> iterable) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: compiled from: Multimaps.java */
    private static class toq<K, V> extends AbstractC4516q<K, V> {

        @wlev.zy
        private static final long serialVersionUID = 0;
        transient com.google.common.base.lvui<? extends List<V>> factory;

        toq(Map<K, Collection<V>> map, com.google.common.base.lvui<? extends List<V>> lvuiVar) {
            super(map);
            this.factory = (com.google.common.base.lvui) com.google.common.base.jk.a9(lvuiVar);
        }

        @wlev.zy
        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            this.factory = (com.google.common.base.lvui) objectInputStream.readObject();
            setMap((Map) objectInputStream.readObject());
        }

        @wlev.zy
        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.factory);
            objectOutputStream.writeObject(backingMap());
        }

        @Override // com.google.common.collect.AbstractC4469n, com.google.common.collect.AbstractC4579y
        Map<K, Collection<V>> createAsMap() {
            return createMaybeNavigableAsMap();
        }

        @Override // com.google.common.collect.AbstractC4469n, com.google.common.collect.AbstractC4579y
        Set<K> createKeySet() {
            return createMaybeNavigableKeySet();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.AbstractC4516q, com.google.common.collect.AbstractC4469n
        public List<V> createCollection() {
            return this.factory.get();
        }
    }

    /* JADX INFO: compiled from: Multimaps.java */
    private static class x2<K, V> extends ikck<K, V> implements Serializable {
        private static final long serialVersionUID = 0;
        final lw<K, V> delegate;

        @MonotonicNonNullDecl
        transient Collection<Map.Entry<K, V>> entries;

        @MonotonicNonNullDecl
        transient Set<K> keySet;

        @MonotonicNonNullDecl
        transient o05<K> keys;

        @MonotonicNonNullDecl
        transient Map<K, Collection<V>> map;

        @MonotonicNonNullDecl
        transient Collection<V> values;

        /* JADX INFO: renamed from: com.google.common.collect.oki$x2$k */
        /* JADX INFO: compiled from: Multimaps.java */
        class C4498k implements com.google.common.base.t8r<Collection<V>, Collection<V>> {
            C4498k() {
            }

            @Override // com.google.common.base.t8r
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public Collection<V> apply(Collection<V> collection) {
                return oki.dd(collection);
            }
        }

        x2(lw<K, V> lwVar) {
            this.delegate = (lw) com.google.common.base.jk.a9(lwVar);
        }

        @Override // com.google.common.collect.ikck, com.google.common.collect.lw, com.google.common.collect.h4b
        public Map<K, Collection<V>> asMap() {
            Map<K, Collection<V>> map = this.map;
            if (map != null) {
                return map;
            }
            Map<K, Collection<V>> mapUnmodifiableMap = Collections.unmodifiableMap(vy.ikck(this.delegate.asMap(), new C4498k()));
            this.map = mapUnmodifiableMap;
            return mapUnmodifiableMap;
        }

        @Override // com.google.common.collect.ikck, com.google.common.collect.lw
        public void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ikck, com.google.common.collect.lw
        public Collection<Map.Entry<K, V>> entries() {
            Collection<Map.Entry<K, V>> collection = this.entries;
            if (collection != null) {
                return collection;
            }
            Collection<Map.Entry<K, V>> collectionJp0y = oki.jp0y(this.delegate.entries());
            this.entries = collectionJp0y;
            return collectionJp0y;
        }

        @Override // com.google.common.collect.ikck, com.google.common.collect.lw
        public Collection<V> get(K k2) {
            return oki.dd(this.delegate.get(k2));
        }

        @Override // com.google.common.collect.ikck, com.google.common.collect.lw
        public Set<K> keySet() {
            Set<K> set = this.keySet;
            if (set != null) {
                return set;
            }
            Set<K> setUnmodifiableSet = Collections.unmodifiableSet(this.delegate.keySet());
            this.keySet = setUnmodifiableSet;
            return setUnmodifiableSet;
        }

        @Override // com.google.common.collect.ikck, com.google.common.collect.lw
        public o05<K> keys() {
            o05<K> o05Var = this.keys;
            if (o05Var != null) {
                return o05Var;
            }
            o05<K> o05VarWvg = m58i.wvg(this.delegate.keys());
            this.keys = o05VarWvg;
            return o05VarWvg;
        }

        @Override // com.google.common.collect.ikck, com.google.common.collect.lw
        public boolean put(K k2, V v2) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ikck, com.google.common.collect.lw
        public boolean putAll(K k2, Iterable<? extends V> iterable) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ikck, com.google.common.collect.lw
        public boolean remove(Object obj, Object obj2) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ikck, com.google.common.collect.lw
        public Collection<V> removeAll(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ikck, com.google.common.collect.lw
        public Collection<V> replaceValues(K k2, Iterable<? extends V> iterable) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ikck, com.google.common.collect.lw
        public Collection<V> values() {
            Collection<V> collection = this.values;
            if (collection != null) {
                return collection;
            }
            Collection<V> collectionUnmodifiableCollection = Collections.unmodifiableCollection(this.delegate.values());
            this.values = collectionUnmodifiableCollection;
            return collectionUnmodifiableCollection;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.ikck, com.google.common.collect.qkj8
        public lw<K, V> delegate() {
            return this.delegate;
        }

        @Override // com.google.common.collect.ikck, com.google.common.collect.lw
        public boolean putAll(lw<? extends K, ? extends V> lwVar) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.oki$y */
    /* JADX INFO: compiled from: Multimaps.java */
    private static class C4499y<K, V> extends AbstractC4579y<K, V> implements wt<K, V>, Serializable {
        private static final long serialVersionUID = 7845222491160860175L;
        final Map<K, V> map;

        /* JADX INFO: renamed from: com.google.common.collect.oki$y$k */
        /* JADX INFO: compiled from: Multimaps.java */
        class k extends g0ad.ld6<V> {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ Object f26514k;

            /* JADX INFO: renamed from: com.google.common.collect.oki$y$k$k, reason: collision with other inner class name */
            /* JADX INFO: compiled from: Multimaps.java */
            class C7995k implements Iterator<V> {

                /* JADX INFO: renamed from: k */
                int f26516k;

                C7995k() {
                }

                @Override // java.util.Iterator
                public boolean hasNext() {
                    if (this.f26516k == 0) {
                        k kVar = k.this;
                        if (C4499y.this.map.containsKey(kVar.f26514k)) {
                            return true;
                        }
                    }
                    return false;
                }

                @Override // java.util.Iterator
                public V next() {
                    if (!hasNext()) {
                        throw new NoSuchElementException();
                    }
                    this.f26516k++;
                    k kVar = k.this;
                    return C4499y.this.map.get(kVar.f26514k);
                }

                @Override // java.util.Iterator
                public void remove() {
                    C4524t.m15984n(this.f26516k == 1);
                    this.f26516k = -1;
                    k kVar = k.this;
                    C4499y.this.map.remove(kVar.f26514k);
                }
            }

            k(Object obj) {
                this.f26514k = obj;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<V> iterator() {
                return new C7995k();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return C4499y.this.map.containsKey(this.f26514k) ? 1 : 0;
            }
        }

        C4499y(Map<K, V> map) {
            this.map = (Map) com.google.common.base.jk.a9(map);
        }

        @Override // com.google.common.collect.lw
        public void clear() {
            this.map.clear();
        }

        @Override // com.google.common.collect.AbstractC4579y, com.google.common.collect.lw
        public boolean containsEntry(Object obj, Object obj2) {
            return this.map.entrySet().contains(vy.dd(obj, obj2));
        }

        @Override // com.google.common.collect.lw
        public boolean containsKey(Object obj) {
            return this.map.containsKey(obj);
        }

        @Override // com.google.common.collect.AbstractC4579y, com.google.common.collect.lw
        public boolean containsValue(Object obj) {
            return this.map.containsValue(obj);
        }

        @Override // com.google.common.collect.AbstractC4579y
        Map<K, Collection<V>> createAsMap() {
            return new C4493k(this);
        }

        @Override // com.google.common.collect.AbstractC4579y
        Collection<Map.Entry<K, V>> createEntries() {
            throw new AssertionError("unreachable");
        }

        @Override // com.google.common.collect.AbstractC4579y
        Set<K> createKeySet() {
            return this.map.keySet();
        }

        @Override // com.google.common.collect.AbstractC4579y
        o05<K> createKeys() {
            return new f7l8(this);
        }

        @Override // com.google.common.collect.AbstractC4579y
        Collection<V> createValues() {
            return this.map.values();
        }

        @Override // com.google.common.collect.AbstractC4579y
        Iterator<Map.Entry<K, V>> entryIterator() {
            return this.map.entrySet().iterator();
        }

        @Override // com.google.common.collect.AbstractC4579y, com.google.common.collect.lw
        public int hashCode() {
            return this.map.hashCode();
        }

        @Override // com.google.common.collect.AbstractC4579y, com.google.common.collect.lw
        public boolean put(K k2, V v2) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.AbstractC4579y, com.google.common.collect.lw
        public boolean putAll(K k2, Iterable<? extends V> iterable) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.AbstractC4579y, com.google.common.collect.lw
        public boolean remove(Object obj, Object obj2) {
            return this.map.entrySet().remove(vy.dd(obj, obj2));
        }

        @Override // com.google.common.collect.lw
        public int size() {
            return this.map.size();
        }

        @Override // com.google.common.collect.AbstractC4579y, com.google.common.collect.lw
        public Set<Map.Entry<K, V>> entries() {
            return this.map.entrySet();
        }

        @Override // com.google.common.collect.lw
        public Set<V> get(K k2) {
            return new k(k2);
        }

        @Override // com.google.common.collect.AbstractC4579y, com.google.common.collect.lw
        public boolean putAll(lw<? extends K, ? extends V> lwVar) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.lw
        public Set<V> removeAll(Object obj) {
            HashSet hashSet = new HashSet(2);
            if (!this.map.containsKey(obj)) {
                return hashSet;
            }
            hashSet.add(this.map.remove(obj));
            return hashSet;
        }

        @Override // com.google.common.collect.AbstractC4579y, com.google.common.collect.lw
        public Set<V> replaceValues(K k2, Iterable<? extends V> iterable) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: compiled from: Multimaps.java */
    private static class zy<K, V> extends AbstractC4469n<K, V> {

        @wlev.zy
        private static final long serialVersionUID = 0;
        transient com.google.common.base.lvui<? extends Collection<V>> factory;

        zy(Map<K, Collection<V>> map, com.google.common.base.lvui<? extends Collection<V>> lvuiVar) {
            super(map);
            this.factory = (com.google.common.base.lvui) com.google.common.base.jk.a9(lvuiVar);
        }

        @wlev.zy
        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            this.factory = (com.google.common.base.lvui) objectInputStream.readObject();
            setMap((Map) objectInputStream.readObject());
        }

        @wlev.zy
        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.factory);
            objectOutputStream.writeObject(backingMap());
        }

        @Override // com.google.common.collect.AbstractC4469n, com.google.common.collect.AbstractC4579y
        Map<K, Collection<V>> createAsMap() {
            return createMaybeNavigableAsMap();
        }

        @Override // com.google.common.collect.AbstractC4469n
        protected Collection<V> createCollection() {
            return this.factory.get();
        }

        @Override // com.google.common.collect.AbstractC4469n, com.google.common.collect.AbstractC4579y
        Set<K> createKeySet() {
            return createMaybeNavigableKeySet();
        }

        @Override // com.google.common.collect.AbstractC4469n
        <E> Collection<E> unmodifiableCollectionSubclass(Collection<E> collection) {
            return collection instanceof NavigableSet ? g0ad.dd((NavigableSet) collection) : collection instanceof SortedSet ? Collections.unmodifiableSortedSet((SortedSet) collection) : collection instanceof Set ? Collections.unmodifiableSet((Set) collection) : collection instanceof List ? Collections.unmodifiableList((List) collection) : Collections.unmodifiableCollection(collection);
        }

        @Override // com.google.common.collect.AbstractC4469n
        Collection<V> wrapCollection(K k2, Collection<V> collection) {
            return collection instanceof List ? wrapList(k2, (List) collection, null) : collection instanceof NavigableSet ? new AbstractC4469n.qrj(k2, (NavigableSet) collection, null) : collection instanceof SortedSet ? new AbstractC4469n.kja0(k2, (SortedSet) collection, null) : collection instanceof Set ? new AbstractC4469n.n7h(k2, (Set) collection) : new AbstractC4469n.ld6(k2, collection, null);
        }
    }

    private oki() {
    }

    public static <K, V1, V2> h4b<K, V2> a9(h4b<K, V1> h4bVar, com.google.common.base.t8r<? super V1, V2> t8rVar) {
        com.google.common.base.jk.a9(t8rVar);
        return mcp(h4bVar, vy.m16026s(t8rVar));
    }

    public static <K, V> wt<K, V> cdj(Map<K, V> map) {
        return new C4499y(map);
    }

    @Deprecated
    public static <K, V> wt<K, V> d2ok(mbx<K, V> mbxVar) {
        return (wt) com.google.common.base.jk.a9(mbxVar);
    }

    public static <K, V> h4b<K, V> d3(h4b<K, V> h4bVar) {
        return ((h4bVar instanceof ld6) || (h4bVar instanceof gc3c)) ? h4bVar : new ld6(h4bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <V> Collection<V> dd(Collection<V> collection) {
        return collection instanceof SortedSet ? Collections.unmodifiableSortedSet((SortedSet) collection) : collection instanceof Set ? Collections.unmodifiableSet((Set) collection) : collection instanceof List ? Collections.unmodifiableList((List) collection) : Collections.unmodifiableCollection(collection);
    }

    public static <K, V> lw<K, V> eqxt(lw<K, V> lwVar) {
        return ((lwVar instanceof x2) || (lwVar instanceof ktq)) ? lwVar : new x2(lwVar);
    }

    static boolean f7l8(lw<?, ?> lwVar, @NullableDecl Object obj) {
        if (obj == lwVar) {
            return true;
        }
        if (obj instanceof lw) {
            return lwVar.asMap().equals(((lw) obj).asMap());
        }
        return false;
    }

    public static <K, V> h4b<K, V> fn3e(Map<K, Collection<V>> map, com.google.common.base.lvui<? extends List<V>> lvuiVar) {
        return new toq(map, lvuiVar);
    }

    public static <K, V1, V2> lw<K, V2> fti(lw<K, V1> lwVar, com.google.common.base.t8r<? super V1, V2> t8rVar) {
        com.google.common.base.jk.a9(t8rVar);
        return jk(lwVar, vy.m16026s(t8rVar));
    }

    public static <K, V> xm<K, V> fu4(Map<K, Collection<V>> map, com.google.common.base.lvui<? extends SortedSet<V>> lvuiVar) {
        return new C4494n(map, lvuiVar);
    }

    @InterfaceC7731k
    /* JADX INFO: renamed from: g */
    public static <K, V> Map<K, SortedSet<V>> m15929g(xm<K, V> xmVar) {
        return xmVar.asMap();
    }

    @Deprecated
    public static <K, V> h4b<K, V> gvn7(gc3c<K, V> gc3cVar) {
        return (h4b) com.google.common.base.jk.a9(gc3cVar);
    }

    /* JADX INFO: renamed from: h */
    public static <K, V> wt<K, V> m15930h(wt<K, V> wtVar, com.google.common.base.a9<? super V> a9Var) {
        return m15937s(wtVar, vy.i9jn(a9Var));
    }

    @CanIgnoreReturnValue
    /* JADX INFO: renamed from: i */
    public static <K, V, M extends lw<K, V>> M m15931i(lw<? extends V, ? extends K> lwVar, M m2) {
        com.google.common.base.jk.a9(m2);
        for (Map.Entry<? extends V, ? extends K> entry : lwVar.entries()) {
            m2.put(entry.getValue(), entry.getKey());
        }
        return m2;
    }

    public static <K, V1, V2> lw<K, V2> jk(lw<K, V1> lwVar, vy.InterfaceC4539i<? super K, ? super V1, V2> interfaceC4539i) {
        return new C4495p(lwVar, interfaceC4539i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <K, V> Collection<Map.Entry<K, V>> jp0y(Collection<Map.Entry<K, V>> collection) {
        return collection instanceof Set ? vy.wo((Set) collection) : new vy.lvui(Collections.unmodifiableCollection(collection));
    }

    public static <K, V> gc3c<K, V> ki(Iterable<V> iterable, com.google.common.base.t8r<? super V, K> t8rVar) {
        return t8r(iterable.iterator(), t8rVar);
    }

    public static <K, V> lw<K, V> kja0(lw<K, V> lwVar, com.google.common.base.a9<? super V> a9Var) {
        return m15939y(lwVar, vy.i9jn(a9Var));
    }

    private static <K, V> wt<K, V> ld6(a98o<K, V> a98oVar, com.google.common.base.a9<? super Map.Entry<K, V>> a9Var) {
        return new ek5k(a98oVar.toq(), com.google.common.base.fti.m15348q(a98oVar.mo15585p(), a9Var));
    }

    public static <K, V> wt<K, V> lvui(wt<K, V> wtVar) {
        return ((wtVar instanceof qrj) || (wtVar instanceof mbx)) ? wtVar : new qrj(wtVar);
    }

    public static <K, V1, V2> h4b<K, V2> mcp(h4b<K, V1> h4bVar, vy.InterfaceC4539i<? super K, ? super V1, V2> interfaceC4539i) {
        return new C4497s(h4bVar, interfaceC4539i);
    }

    @InterfaceC7731k
    /* JADX INFO: renamed from: n */
    public static <K, V> Map<K, Set<V>> m15933n(wt<K, V> wtVar) {
        return wtVar.asMap();
    }

    public static <K, V> wt<K, V> n7h(wt<K, V> wtVar, com.google.common.base.a9<? super K> a9Var) {
        if (!(wtVar instanceof C4313b)) {
            return wtVar instanceof a98o ? ld6((a98o) wtVar, vy.m16013f(a9Var)) : new C4313b(wtVar, a9Var);
        }
        C4313b c4313b = (C4313b) wtVar;
        return new C4313b(c4313b.toq(), com.google.common.base.fti.m15348q(c4313b.f26740p, a9Var));
    }

    public static <K, V> wt<K, V> ni7(Map<K, Collection<V>> map, com.google.common.base.lvui<? extends Set<V>> lvuiVar) {
        return new C4496q(map, lvuiVar);
    }

    public static <K, V> lw<K, V> o1t(lw<K, V> lwVar) {
        return exv8.qrj(lwVar, null);
    }

    @Deprecated
    public static <K, V> lw<K, V> oc(ktq<K, V> ktqVar) {
        return (lw) com.google.common.base.jk.a9(ktqVar);
    }

    /* JADX INFO: renamed from: p */
    private static <K, V> lw<K, V> m15934p(bf2<K, V> bf2Var, com.google.common.base.a9<? super Map.Entry<K, V>> a9Var) {
        return new C4451m(bf2Var.toq(), com.google.common.base.fti.m15348q(bf2Var.mo15585p(), a9Var));
    }

    @InterfaceC7731k
    /* JADX INFO: renamed from: q */
    public static <K, V> Map<K, Collection<V>> m15935q(lw<K, V> lwVar) {
        return lwVar.asMap();
    }

    public static <K, V> lw<K, V> qrj(lw<K, V> lwVar, com.google.common.base.a9<? super K> a9Var) {
        if (lwVar instanceof wt) {
            return n7h((wt) lwVar, a9Var);
        }
        if (lwVar instanceof h4b) {
            return x2((h4b) lwVar, a9Var);
        }
        if (!(lwVar instanceof y9n)) {
            return lwVar instanceof bf2 ? m15934p((bf2) lwVar, vy.m16013f(a9Var)) : new y9n(lwVar, a9Var);
        }
        y9n y9nVar = (y9n) lwVar;
        return new y9n(y9nVar.f26741s, com.google.common.base.fti.m15348q(y9nVar.f26740p, a9Var));
    }

    /* JADX INFO: renamed from: r */
    public static <K, V> xm<K, V> m15936r(xm<K, V> xmVar) {
        return xmVar instanceof n7h ? xmVar : new n7h(xmVar);
    }

    /* JADX INFO: renamed from: s */
    public static <K, V> wt<K, V> m15937s(wt<K, V> wtVar, com.google.common.base.a9<? super Map.Entry<K, V>> a9Var) {
        com.google.common.base.jk.a9(a9Var);
        return wtVar instanceof a98o ? ld6((a98o) wtVar, a9Var) : new ek5k((wt) com.google.common.base.jk.a9(wtVar), a9Var);
    }

    /* JADX INFO: renamed from: t */
    public static <K, V> xm<K, V> m15938t(xm<K, V> xmVar) {
        return exv8.m15676z(xmVar, null);
    }

    public static <K, V> gc3c<K, V> t8r(Iterator<V> it, com.google.common.base.t8r<? super V, K> t8rVar) {
        com.google.common.base.jk.a9(t8rVar);
        gc3c.C4388k c4388kBuilder = gc3c.builder();
        while (it.hasNext()) {
            V next = it.next();
            com.google.common.base.jk.fti(next, it);
            c4388kBuilder.mo15711g(t8rVar.apply(next), next);
        }
        return c4388kBuilder.mo15714k();
    }

    public static <K, V> wt<K, V> wvg(wt<K, V> wtVar) {
        return exv8.zurt(wtVar, null);
    }

    public static <K, V> h4b<K, V> x2(h4b<K, V> h4bVar, com.google.common.base.a9<? super K> a9Var) {
        if (!(h4bVar instanceof yz)) {
            return new yz(h4bVar, a9Var);
        }
        yz yzVar = (yz) h4bVar;
        return new yz(yzVar.toq(), com.google.common.base.fti.m15348q(yzVar.f26740p, a9Var));
    }

    /* JADX INFO: renamed from: y */
    public static <K, V> lw<K, V> m15939y(lw<K, V> lwVar, com.google.common.base.a9<? super Map.Entry<K, V>> a9Var) {
        com.google.common.base.jk.a9(a9Var);
        return lwVar instanceof wt ? m15937s((wt) lwVar, a9Var) : lwVar instanceof bf2 ? m15934p((bf2) lwVar, a9Var) : new C4451m((lw) com.google.common.base.jk.a9(lwVar), a9Var);
    }

    /* JADX INFO: renamed from: z */
    public static <K, V> h4b<K, V> m15940z(h4b<K, V> h4bVar) {
        return exv8.ld6(h4bVar, null);
    }

    public static <K, V> lw<K, V> zurt(Map<K, Collection<V>> map, com.google.common.base.lvui<? extends Collection<V>> lvuiVar) {
        return new zy(map, lvuiVar);
    }

    @InterfaceC7731k
    public static <K, V> Map<K, List<V>> zy(h4b<K, V> h4bVar) {
        return h4bVar.asMap();
    }

    /* JADX INFO: renamed from: com.google.common.collect.oki$n */
    /* JADX INFO: compiled from: Multimaps.java */
    private static class C4494n<K, V> extends AbstractC4400h<K, V> {

        @wlev.zy
        private static final long serialVersionUID = 0;
        transient com.google.common.base.lvui<? extends SortedSet<V>> factory;
        transient Comparator<? super V> valueComparator;

        C4494n(Map<K, Collection<V>> map, com.google.common.base.lvui<? extends SortedSet<V>> lvuiVar) {
            super(map);
            this.factory = (com.google.common.base.lvui) com.google.common.base.jk.a9(lvuiVar);
            this.valueComparator = lvuiVar.get().comparator();
        }

        @wlev.zy
        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            com.google.common.base.lvui<? extends SortedSet<V>> lvuiVar = (com.google.common.base.lvui) objectInputStream.readObject();
            this.factory = lvuiVar;
            this.valueComparator = lvuiVar.get().comparator();
            setMap((Map) objectInputStream.readObject());
        }

        @wlev.zy
        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.factory);
            objectOutputStream.writeObject(backingMap());
        }

        @Override // com.google.common.collect.AbstractC4469n, com.google.common.collect.AbstractC4579y
        Map<K, Collection<V>> createAsMap() {
            return createMaybeNavigableAsMap();
        }

        @Override // com.google.common.collect.AbstractC4469n, com.google.common.collect.AbstractC4579y
        Set<K> createKeySet() {
            return createMaybeNavigableKeySet();
        }

        @Override // com.google.common.collect.xm
        public Comparator<? super V> valueComparator() {
            return this.valueComparator;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.AbstractC4400h, com.google.common.collect.qrj, com.google.common.collect.AbstractC4469n
        public SortedSet<V> createCollection() {
            return this.factory.get();
        }
    }

    /* JADX INFO: compiled from: Multimaps.java */
    private static class n7h<K, V> extends qrj<K, V> implements xm<K, V> {
        private static final long serialVersionUID = 0;

        n7h(xm<K, V> xmVar) {
            super(xmVar);
        }

        @Override // com.google.common.collect.xm
        public Comparator<? super V> valueComparator() {
            return delegate().valueComparator();
        }

        @Override // com.google.common.collect.oki.qrj, com.google.common.collect.oki.x2, com.google.common.collect.ikck, com.google.common.collect.lw
        public SortedSet<V> get(K k2) {
            return Collections.unmodifiableSortedSet(delegate().get((Object) k2));
        }

        @Override // com.google.common.collect.oki.qrj, com.google.common.collect.oki.x2, com.google.common.collect.ikck, com.google.common.collect.lw
        public SortedSet<V> removeAll(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.oki.qrj, com.google.common.collect.oki.x2, com.google.common.collect.ikck, com.google.common.collect.lw
        public SortedSet<V> replaceValues(K k2, Iterable<? extends V> iterable) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.oki.qrj, com.google.common.collect.oki.x2, com.google.common.collect.ikck, com.google.common.collect.qkj8
        public xm<K, V> delegate() {
            return (xm) super.delegate();
        }
    }
}
