package com.google.common.collect;

import com.google.common.collect.AbstractC4579y;
import com.google.common.collect.oki;
import com.google.common.collect.vy;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: renamed from: com.google.common.collect.n */
/* JADX INFO: compiled from: AbstractMapBasedMultimap.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
abstract class AbstractC4469n<K, V> extends AbstractC4579y<K, V> implements Serializable {
    private static final long serialVersionUID = 2447537837011683357L;

    /* JADX INFO: renamed from: p */
    private transient int f26432p;

    /* JADX INFO: renamed from: s */
    private transient Map<K, Collection<V>> f26433s;

    /* JADX INFO: renamed from: com.google.common.collect.n$f7l8 */
    /* JADX INFO: compiled from: AbstractMapBasedMultimap.java */
    class f7l8 extends AbstractC4469n<K, V>.p implements NavigableSet<K> {
        f7l8(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        @Override // java.util.NavigableSet
        public K ceiling(K k2) {
            return toq().ceilingKey(k2);
        }

        @Override // java.util.NavigableSet
        public Iterator<K> descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> descendingSet() {
            return new f7l8(toq().descendingMap());
        }

        @Override // com.google.common.collect.AbstractC4469n.p, java.util.SortedSet, java.util.NavigableSet
        /* JADX INFO: renamed from: f7l8, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> tailSet(K k2) {
            return tailSet(k2, true);
        }

        @Override // java.util.NavigableSet
        public K floor(K k2) {
            return toq().floorKey(k2);
        }

        @Override // com.google.common.collect.AbstractC4469n.p, java.util.SortedSet, java.util.NavigableSet
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> subSet(K k2, K k3) {
            return subSet(k2, true, k3, false);
        }

        @Override // java.util.NavigableSet
        public K higher(K k2) {
            return toq().higherKey(k2);
        }

        @Override // java.util.NavigableSet
        public K lower(K k2) {
            return toq().lowerKey(k2);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.AbstractC4469n.p
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> toq() {
            return (NavigableMap) super.toq();
        }

        @Override // java.util.NavigableSet
        public K pollFirst() {
            return (K) zwy.m16120f(iterator());
        }

        @Override // java.util.NavigableSet
        public K pollLast() {
            return (K) zwy.m16120f(descendingIterator());
        }

        @Override // com.google.common.collect.AbstractC4469n.p, java.util.SortedSet, java.util.NavigableSet
        /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> headSet(K k2) {
            return headSet(k2, false);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> headSet(K k2, boolean z2) {
            return new f7l8(toq().headMap(k2, z2));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> subSet(K k2, boolean z2, K k3, boolean z3) {
            return new f7l8(toq().subMap(k2, z2, k3, z3));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> tailSet(K k2, boolean z2) {
            return new f7l8(toq().tailMap(k2, z2));
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.n$g */
    /* JADX INFO: compiled from: AbstractMapBasedMultimap.java */
    class g extends AbstractC4469n<K, V>.s implements NavigableMap<K, Collection<V>> {
        g(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        @Override // com.google.common.collect.AbstractC4469n.s, java.util.SortedMap, java.util.NavigableMap
        /* JADX INFO: renamed from: cdj, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> subMap(K k2, K k3) {
            return subMap(k2, true, k3, false);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> ceilingEntry(K k2) {
            Map.Entry<K, Collection<V>> entryCeilingEntry = ld6().ceilingEntry(k2);
            if (entryCeilingEntry == null) {
                return null;
            }
            return f7l8(entryCeilingEntry);
        }

        @Override // java.util.NavigableMap
        public K ceilingKey(K k2) {
            return ld6().ceilingKey(k2);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
            return descendingMap().navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> descendingMap() {
            return new g(ld6().descendingMap());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> firstEntry() {
            Map.Entry<K, Collection<V>> entryFirstEntry = ld6().firstEntry();
            if (entryFirstEntry == null) {
                return null;
            }
            return f7l8(entryFirstEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> floorEntry(K k2) {
            Map.Entry<K, Collection<V>> entryFloorEntry = ld6().floorEntry(k2);
            if (entryFloorEntry == null) {
                return null;
            }
            return f7l8(entryFloorEntry);
        }

        @Override // java.util.NavigableMap
        public K floorKey(K k2) {
            return ld6().floorKey(k2);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.AbstractC4469n.s
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> ld6() {
            return (NavigableMap) super.ld6();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> higherEntry(K k2) {
            Map.Entry<K, Collection<V>> entryHigherEntry = ld6().higherEntry(k2);
            if (entryHigherEntry == null) {
                return null;
            }
            return f7l8(entryHigherEntry);
        }

        @Override // java.util.NavigableMap
        public K higherKey(K k2) {
            return ld6().higherKey(k2);
        }

        Map.Entry<K, Collection<V>> kja0(Iterator<Map.Entry<K, Collection<V>>> it) {
            if (!it.hasNext()) {
                return null;
            }
            Map.Entry<K, Collection<V>> next = it.next();
            Collection<V> collectionCreateCollection = AbstractC4469n.this.createCollection();
            collectionCreateCollection.addAll(next.getValue());
            it.remove();
            return vy.dd(next.getKey(), AbstractC4469n.this.unmodifiableCollectionSubclass(collectionCreateCollection));
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> lastEntry() {
            Map.Entry<K, Collection<V>> entryLastEntry = ld6().lastEntry();
            if (entryLastEntry == null) {
                return null;
            }
            return f7l8(entryLastEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> lowerEntry(K k2) {
            Map.Entry<K, Collection<V>> entryLowerEntry = ld6().lowerEntry(k2);
            if (entryLowerEntry == null) {
                return null;
            }
            return f7l8(entryLowerEntry);
        }

        @Override // java.util.NavigableMap
        public K lowerKey(K k2) {
            return ld6().lowerKey(k2);
        }

        @Override // com.google.common.collect.AbstractC4469n.s, java.util.SortedMap, java.util.NavigableMap
        /* JADX INFO: renamed from: n7h, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> headMap(K k2) {
            return headMap(k2, false);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            return mo15886p();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> pollFirstEntry() {
            return kja0(entrySet().iterator());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> pollLastEntry() {
            return kja0(descendingMap().entrySet().iterator());
        }

        @Override // com.google.common.collect.AbstractC4469n.s, java.util.SortedMap, java.util.NavigableMap
        /* JADX INFO: renamed from: t8r, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> tailMap(K k2) {
            return tailMap(k2, true);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.AbstractC4469n.s
        /* JADX INFO: renamed from: x2, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public NavigableSet<K> mo15887y() {
            return new f7l8(ld6());
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> headMap(K k2, boolean z2) {
            return new g(ld6().headMap(k2, z2));
        }

        @Override // com.google.common.collect.AbstractC4469n.s
        /* JADX INFO: renamed from: keySet, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> mo15886p() {
            return (NavigableSet) super.mo15886p();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> subMap(K k2, boolean z2, K k3, boolean z3) {
            return new g(ld6().subMap(k2, z2, k3, z3));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> tailMap(K k2, boolean z2) {
            return new g(ld6().tailMap(k2, z2));
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.n$k */
    /* JADX INFO: compiled from: AbstractMapBasedMultimap.java */
    class k extends AbstractC4469n<K, V>.q<V> {
        k() {
            super();
        }

        @Override // com.google.common.collect.AbstractC4469n.q
        /* JADX INFO: renamed from: k */
        V mo15888k(K k2, V v2) {
            return v2;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.n$kja0 */
    /* JADX INFO: compiled from: AbstractMapBasedMultimap.java */
    class kja0 extends AbstractC4469n<K, V>.ld6 implements SortedSet<V> {
        kja0(@NullableDecl K k2, SortedSet<V> sortedSet, @NullableDecl AbstractC4469n<K, V>.ld6 ld6Var) {
            super(k2, sortedSet, ld6Var);
        }

        @Override // java.util.SortedSet
        public Comparator<? super V> comparator() {
            return mo15889y().comparator();
        }

        @Override // java.util.SortedSet
        public V first() {
            m15890g();
            return mo15889y().first();
        }

        @Override // java.util.SortedSet
        public SortedSet<V> headSet(V v2) {
            m15890g();
            return new kja0(m15892n(), mo15889y().headSet(v2), toq() == null ? this : toq());
        }

        @Override // java.util.SortedSet
        public V last() {
            m15890g();
            return mo15889y().last();
        }

        @Override // java.util.SortedSet
        public SortedSet<V> subSet(V v2, V v3) {
            m15890g();
            return new kja0(m15892n(), mo15889y().subSet(v2, v3), toq() == null ? this : toq());
        }

        @Override // java.util.SortedSet
        public SortedSet<V> tailSet(V v2) {
            m15890g();
            return new kja0(m15892n(), mo15889y().tailSet(v2), toq() == null ? this : toq());
        }

        /* JADX INFO: renamed from: y */
        SortedSet<V> mo15889y() {
            return (SortedSet) zy();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.n$n */
    /* JADX INFO: compiled from: AbstractMapBasedMultimap.java */
    private class n extends vy.C4550t<K, Collection<V>> {

        /* JADX INFO: renamed from: com.google.common.collect.n$n$k */
        /* JADX INFO: compiled from: AbstractMapBasedMultimap.java */
        class k implements Iterator<K> {

            /* JADX INFO: renamed from: k */
            @NullableDecl
            Map.Entry<K, Collection<V>> f26447k;

            /* JADX INFO: renamed from: q */
            final /* synthetic */ Iterator f26449q;

            k(Iterator it) {
                this.f26449q = it;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f26449q.hasNext();
            }

            @Override // java.util.Iterator
            public K next() {
                Map.Entry<K, Collection<V>> entry = (Map.Entry) this.f26449q.next();
                this.f26447k = entry;
                return entry.getKey();
            }

            @Override // java.util.Iterator
            public void remove() {
                C4524t.m15984n(this.f26447k != null);
                Collection<V> value = this.f26447k.getValue();
                this.f26449q.remove();
                AbstractC4469n.this.f26432p -= value.size();
                value.clear();
                this.f26447k = null;
            }
        }

        n(Map<K, Collection<V>> map) {
            super(map);
        }

        @Override // com.google.common.collect.vy.C4550t, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            zwy.m16135y(iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return toq().keySet().containsAll(collection);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public boolean equals(@NullableDecl Object obj) {
            return this == obj || toq().keySet().equals(obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public int hashCode() {
            return toq().keySet().hashCode();
        }

        @Override // com.google.common.collect.vy.C4550t, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new k(toq().entrySet().iterator());
        }

        @Override // com.google.common.collect.vy.C4550t, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int size;
            Collection<V> collectionRemove = toq().remove(obj);
            if (collectionRemove != null) {
                size = collectionRemove.size();
                collectionRemove.clear();
                AbstractC4469n.this.f26432p -= size;
            } else {
                size = 0;
            }
            return size > 0;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.n$n7h */
    /* JADX INFO: compiled from: AbstractMapBasedMultimap.java */
    class n7h extends AbstractC4469n<K, V>.ld6 implements Set<V> {
        n7h(@NullableDecl K k2, Set<V> set) {
            super(k2, set, null);
        }

        @Override // com.google.common.collect.AbstractC4469n.ld6, java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zD3 = g0ad.d3((Set) this.f26441q, collection);
            if (zD3) {
                int size2 = this.f26441q.size();
                AbstractC4469n.this.f26432p += size2 - size;
                f7l8();
            }
            return zD3;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.n$p */
    /* JADX INFO: compiled from: AbstractMapBasedMultimap.java */
    private class p extends AbstractC4469n<K, V>.n implements SortedSet<K> {
        p(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        @Override // java.util.SortedSet
        public Comparator<? super K> comparator() {
            return toq().comparator();
        }

        @Override // java.util.SortedSet
        public K first() {
            return toq().firstKey();
        }

        public SortedSet<K> headSet(K k2) {
            return new p(toq().headMap(k2));
        }

        @Override // java.util.SortedSet
        public K last() {
            return toq().lastKey();
        }

        public SortedSet<K> subSet(K k2, K k3) {
            return new p(toq().subMap(k2, k3));
        }

        public SortedSet<K> tailSet(K k2) {
            return new p(toq().tailMap(k2));
        }

        SortedMap<K, Collection<V>> toq() {
            return (SortedMap) super.toq();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.n$q */
    /* JADX INFO: compiled from: AbstractMapBasedMultimap.java */
    private abstract class q<T> implements Iterator<T> {

        /* JADX INFO: renamed from: k */
        final Iterator<Map.Entry<K, Collection<V>>> f26453k;

        /* JADX INFO: renamed from: q */
        @NullableDecl
        K f26455q = null;

        /* JADX INFO: renamed from: n */
        @MonotonicNonNullDecl
        Collection<V> f26454n = null;

        /* JADX INFO: renamed from: g */
        Iterator<V> f26452g = zwy.ni7();

        q() {
            this.f26453k = AbstractC4469n.this.f26433s.entrySet().iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f26453k.hasNext() || this.f26452g.hasNext();
        }

        /* JADX INFO: renamed from: k */
        abstract T mo15888k(K k2, V v2);

        @Override // java.util.Iterator
        public T next() {
            if (!this.f26452g.hasNext()) {
                Map.Entry<K, Collection<V>> next = this.f26453k.next();
                this.f26455q = next.getKey();
                Collection<V> value = next.getValue();
                this.f26454n = value;
                this.f26452g = value.iterator();
            }
            return mo15888k(this.f26455q, this.f26452g.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f26452g.remove();
            if (this.f26454n.isEmpty()) {
                this.f26453k.remove();
            }
            AbstractC4469n.access$210(AbstractC4469n.this);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.n$qrj */
    /* JADX INFO: compiled from: AbstractMapBasedMultimap.java */
    class qrj extends AbstractC4469n<K, V>.kja0 implements NavigableSet<V> {
        qrj(@NullableDecl K k2, NavigableSet<V> navigableSet, @NullableDecl AbstractC4469n<K, V>.ld6 ld6Var) {
            super(k2, navigableSet, ld6Var);
        }

        /* JADX INFO: renamed from: p */
        private NavigableSet<V> m15894p(NavigableSet<V> navigableSet) {
            return new qrj(this.f26439k, navigableSet, toq() == null ? this : toq());
        }

        @Override // java.util.NavigableSet
        public V ceiling(V v2) {
            return mo15889y().ceiling(v2);
        }

        @Override // java.util.NavigableSet
        public Iterator<V> descendingIterator() {
            return new ld6.k(mo15889y().descendingIterator());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<V> descendingSet() {
            return m15894p(mo15889y().descendingSet());
        }

        @Override // java.util.NavigableSet
        public V floor(V v2) {
            return mo15889y().floor(v2);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<V> headSet(V v2, boolean z2) {
            return m15894p(mo15889y().headSet(v2, z2));
        }

        @Override // java.util.NavigableSet
        public V higher(V v2) {
            return mo15889y().higher(v2);
        }

        @Override // java.util.NavigableSet
        public V lower(V v2) {
            return mo15889y().lower(v2);
        }

        @Override // java.util.NavigableSet
        public V pollFirst() {
            return (V) zwy.m16120f(iterator());
        }

        @Override // java.util.NavigableSet
        public V pollLast() {
            return (V) zwy.m16120f(descendingIterator());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.AbstractC4469n.kja0
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public NavigableSet<V> mo15889y() {
            return (NavigableSet) super.mo15889y();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<V> subSet(V v2, boolean z2, V v3, boolean z3) {
            return m15894p(mo15889y().subSet(v2, z2, v3, z3));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<V> tailSet(V v2, boolean z2) {
            return m15894p(mo15889y().tailSet(v2, z2));
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.n$s */
    /* JADX INFO: compiled from: AbstractMapBasedMultimap.java */
    private class s extends AbstractC4469n<K, V>.zy implements SortedMap<K, Collection<V>> {

        /* JADX INFO: renamed from: s */
        @MonotonicNonNullDecl
        SortedSet<K> f26459s;

        s(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
            return ld6().comparator();
        }

        @Override // java.util.SortedMap
        public K firstKey() {
            return ld6().firstKey();
        }

        public SortedMap<K, Collection<V>> headMap(K k2) {
            return new s(ld6().headMap(k2));
        }

        @Override // java.util.SortedMap
        public K lastKey() {
            return ld6().lastKey();
        }

        SortedMap<K, Collection<V>> ld6() {
            return (SortedMap) this.f26464g;
        }

        @Override // com.google.common.collect.AbstractC4469n.zy, com.google.common.collect.vy.AbstractC4543l, java.util.AbstractMap, java.util.Map, java.util.SortedMap
        /* JADX INFO: renamed from: p */
        public SortedSet<K> mo15886p() {
            SortedSet<K> sortedSet = this.f26459s;
            if (sortedSet != null) {
                return sortedSet;
            }
            SortedSet<K> sortedSetMo15887y = mo15887y();
            this.f26459s = sortedSetMo15887y;
            return sortedSetMo15887y;
        }

        public SortedMap<K, Collection<V>> subMap(K k2, K k3) {
            return new s(ld6().subMap(k2, k3));
        }

        public SortedMap<K, Collection<V>> tailMap(K k2) {
            return new s(ld6().tailMap(k2));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.vy.AbstractC4543l
        /* JADX INFO: renamed from: y */
        public SortedSet<K> mo15887y() {
            return new p(ld6());
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.n$toq */
    /* JADX INFO: compiled from: AbstractMapBasedMultimap.java */
    class toq extends AbstractC4469n<K, V>.q<Map.Entry<K, V>> {
        toq() {
            super();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.AbstractC4469n.q
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> mo15888k(K k2, V v2) {
            return vy.dd(k2, v2);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.n$y */
    /* JADX INFO: compiled from: AbstractMapBasedMultimap.java */
    private class y extends AbstractC4469n<K, V>.x2 implements RandomAccess {
        y(@NullableDecl K k2, List<V> list, @NullableDecl AbstractC4469n<K, V>.ld6 ld6Var) {
            super(k2, list, ld6Var);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.n$zy */
    /* JADX INFO: compiled from: AbstractMapBasedMultimap.java */
    private class zy extends vy.AbstractC4543l<K, Collection<V>> {

        /* JADX INFO: renamed from: g */
        final transient Map<K, Collection<V>> f26464g;

        /* JADX INFO: renamed from: com.google.common.collect.n$zy$k */
        /* JADX INFO: compiled from: AbstractMapBasedMultimap.java */
        class k extends vy.t8r<K, Collection<V>> {
            k() {
            }

            @Override // com.google.common.collect.vy.t8r, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                return mcp.ld6(zy.this.f26464g.entrySet(), obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return zy.this.new toq();
            }

            @Override // com.google.common.collect.vy.t8r
            /* JADX INFO: renamed from: k */
            Map<K, Collection<V>> mo15823k() {
                return zy.this;
            }

            @Override // com.google.common.collect.vy.t8r, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                AbstractC4469n.this.m15882q(((Map.Entry) obj).getKey());
                return true;
            }
        }

        /* JADX INFO: renamed from: com.google.common.collect.n$zy$toq */
        /* JADX INFO: compiled from: AbstractMapBasedMultimap.java */
        class toq implements Iterator<Map.Entry<K, Collection<V>>> {

            /* JADX INFO: renamed from: k */
            final Iterator<Map.Entry<K, Collection<V>>> f26467k;

            /* JADX INFO: renamed from: q */
            @NullableDecl
            Collection<V> f26469q;

            toq() {
                this.f26467k = zy.this.f26464g.entrySet().iterator();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f26467k.hasNext();
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, Collection<V>> next() {
                Map.Entry<K, Collection<V>> next = this.f26467k.next();
                this.f26469q = next.getValue();
                return zy.this.f7l8(next);
            }

            @Override // java.util.Iterator
            public void remove() {
                C4524t.m15984n(this.f26469q != null);
                this.f26467k.remove();
                AbstractC4469n.this.f26432p -= this.f26469q.size();
                this.f26469q.clear();
                this.f26469q = null;
            }
        }

        zy(Map<K, Collection<V>> map) {
            this.f26464g = map;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            if (this.f26464g == AbstractC4469n.this.f26433s) {
                AbstractC4469n.this.clear();
            } else {
                zwy.m16135y(new toq());
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return vy.m16030x(this.f26464g, obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean equals(@NullableDecl Object obj) {
            return this == obj || this.f26464g.equals(obj);
        }

        Map.Entry<K, Collection<V>> f7l8(Map.Entry<K, Collection<V>> entry) {
            K key = entry.getKey();
            return vy.dd(key, AbstractC4469n.this.wrapCollection(key, entry.getValue()));
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Collection<V> remove(Object obj) {
            Collection<V> collectionRemove = this.f26464g.remove(obj);
            if (collectionRemove == null) {
                return null;
            }
            Collection<V> collectionCreateCollection = AbstractC4469n.this.createCollection();
            collectionCreateCollection.addAll(collectionRemove);
            AbstractC4469n.this.f26432p -= collectionRemove.size();
            collectionRemove.clear();
            return collectionCreateCollection;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int hashCode() {
            return this.f26464g.hashCode();
        }

        @Override // com.google.common.collect.vy.AbstractC4543l
        /* JADX INFO: renamed from: k */
        protected Set<Map.Entry<K, Collection<V>>> mo15821k() {
            return new k();
        }

        @Override // com.google.common.collect.vy.AbstractC4543l, java.util.AbstractMap, java.util.Map, java.util.SortedMap
        /* JADX INFO: renamed from: keySet */
        public Set<K> mo15886p() {
            return AbstractC4469n.this.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public Collection<V> get(Object obj) {
            Collection<V> collection = (Collection) vy.ch(this.f26464g, obj);
            if (collection == null) {
                return null;
            }
            return AbstractC4469n.this.wrapCollection(obj, collection);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f26464g.size();
        }

        @Override // java.util.AbstractMap
        public String toString() {
            return this.f26464g.toString();
        }
    }

    protected AbstractC4469n(Map<K, Collection<V>> map) {
        com.google.common.base.jk.m15383q(map.isEmpty());
        this.f26433s = map;
    }

    static /* synthetic */ int access$208(AbstractC4469n abstractC4469n) {
        int i2 = abstractC4469n.f26432p;
        abstractC4469n.f26432p = i2 + 1;
        return i2;
    }

    static /* synthetic */ int access$210(AbstractC4469n abstractC4469n) {
        int i2 = abstractC4469n.f26432p;
        abstractC4469n.f26432p = i2 - 1;
        return i2;
    }

    /* JADX INFO: renamed from: k */
    private Collection<V> m15881k(@NullableDecl K k2) {
        Collection<V> collection = this.f26433s.get(k2);
        if (collection != null) {
            return collection;
        }
        Collection<V> collectionCreateCollection = createCollection(k2);
        this.f26433s.put(k2, collectionCreateCollection);
        return collectionCreateCollection;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public void m15882q(Object obj) {
        Collection collection = (Collection) vy.nmn5(this.f26433s, obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.f26432p -= size;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> Iterator<E> zy(Collection<E> collection) {
        return collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    Map<K, Collection<V>> backingMap() {
        return this.f26433s;
    }

    @Override // com.google.common.collect.lw
    public void clear() {
        Iterator<Collection<V>> it = this.f26433s.values().iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
        this.f26433s.clear();
        this.f26432p = 0;
    }

    @Override // com.google.common.collect.lw
    public boolean containsKey(@NullableDecl Object obj) {
        return this.f26433s.containsKey(obj);
    }

    @Override // com.google.common.collect.AbstractC4579y
    Map<K, Collection<V>> createAsMap() {
        return new zy(this.f26433s);
    }

    abstract Collection<V> createCollection();

    Collection<V> createCollection(@NullableDecl K k2) {
        return createCollection();
    }

    @Override // com.google.common.collect.AbstractC4579y
    Collection<Map.Entry<K, V>> createEntries() {
        return this instanceof wt ? new AbstractC4579y.toq() : new AbstractC4579y.k();
    }

    @Override // com.google.common.collect.AbstractC4579y
    Set<K> createKeySet() {
        return new n(this.f26433s);
    }

    @Override // com.google.common.collect.AbstractC4579y
    o05<K> createKeys() {
        return new oki.f7l8(this);
    }

    final Map<K, Collection<V>> createMaybeNavigableAsMap() {
        Map<K, Collection<V>> map = this.f26433s;
        return map instanceof NavigableMap ? new g((NavigableMap) this.f26433s) : map instanceof SortedMap ? new s((SortedMap) this.f26433s) : new zy(this.f26433s);
    }

    final Set<K> createMaybeNavigableKeySet() {
        Map<K, Collection<V>> map = this.f26433s;
        return map instanceof NavigableMap ? new f7l8((NavigableMap) this.f26433s) : map instanceof SortedMap ? new p((SortedMap) this.f26433s) : new n(this.f26433s);
    }

    Collection<V> createUnmodifiableEmptyCollection() {
        return (Collection<V>) unmodifiableCollectionSubclass(createCollection());
    }

    @Override // com.google.common.collect.AbstractC4579y
    Collection<V> createValues() {
        return new AbstractC4579y.zy();
    }

    @Override // com.google.common.collect.AbstractC4579y, com.google.common.collect.lw
    public Collection<Map.Entry<K, V>> entries() {
        return super.entries();
    }

    @Override // com.google.common.collect.AbstractC4579y
    Iterator<Map.Entry<K, V>> entryIterator() {
        return new toq();
    }

    @Override // com.google.common.collect.lw
    public Collection<V> get(@NullableDecl K k2) {
        Collection<V> collectionCreateCollection = this.f26433s.get(k2);
        if (collectionCreateCollection == null) {
            collectionCreateCollection = createCollection(k2);
        }
        return wrapCollection(k2, collectionCreateCollection);
    }

    @Override // com.google.common.collect.AbstractC4579y, com.google.common.collect.lw
    public boolean put(@NullableDecl K k2, @NullableDecl V v2) {
        Collection<V> collection = this.f26433s.get(k2);
        if (collection != null) {
            if (!collection.add(v2)) {
                return false;
            }
            this.f26432p++;
            return true;
        }
        Collection<V> collectionCreateCollection = createCollection(k2);
        if (!collectionCreateCollection.add(v2)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.f26432p++;
        this.f26433s.put(k2, collectionCreateCollection);
        return true;
    }

    @Override // com.google.common.collect.lw
    public Collection<V> removeAll(@NullableDecl Object obj) {
        Collection<V> collectionRemove = this.f26433s.remove(obj);
        if (collectionRemove == null) {
            return createUnmodifiableEmptyCollection();
        }
        Collection collectionCreateCollection = createCollection();
        collectionCreateCollection.addAll(collectionRemove);
        this.f26432p -= collectionRemove.size();
        collectionRemove.clear();
        return (Collection<V>) unmodifiableCollectionSubclass(collectionCreateCollection);
    }

    @Override // com.google.common.collect.AbstractC4579y, com.google.common.collect.lw
    public Collection<V> replaceValues(@NullableDecl K k2, Iterable<? extends V> iterable) {
        Iterator<? extends V> it = iterable.iterator();
        if (!it.hasNext()) {
            return removeAll(k2);
        }
        Collection<V> collectionM15881k = m15881k(k2);
        Collection<V> collectionCreateCollection = createCollection();
        collectionCreateCollection.addAll(collectionM15881k);
        this.f26432p -= collectionM15881k.size();
        collectionM15881k.clear();
        while (it.hasNext()) {
            if (collectionM15881k.add(it.next())) {
                this.f26432p++;
            }
        }
        return (Collection<V>) unmodifiableCollectionSubclass(collectionCreateCollection);
    }

    final void setMap(Map<K, Collection<V>> map) {
        this.f26433s = map;
        this.f26432p = 0;
        for (Collection<V> collection : map.values()) {
            com.google.common.base.jk.m15383q(!collection.isEmpty());
            this.f26432p += collection.size();
        }
    }

    @Override // com.google.common.collect.lw
    public int size() {
        return this.f26432p;
    }

    <E> Collection<E> unmodifiableCollectionSubclass(Collection<E> collection) {
        return Collections.unmodifiableCollection(collection);
    }

    @Override // com.google.common.collect.AbstractC4579y
    Iterator<V> valueIterator() {
        return new k();
    }

    @Override // com.google.common.collect.AbstractC4579y, com.google.common.collect.lw
    public Collection<V> values() {
        return super.values();
    }

    Collection<V> wrapCollection(@NullableDecl K k2, Collection<V> collection) {
        return new ld6(k2, collection, null);
    }

    final List<V> wrapList(@NullableDecl K k2, List<V> list, @NullableDecl AbstractC4469n<K, V>.ld6 ld6Var) {
        return list instanceof RandomAccess ? new y(k2, list, ld6Var) : new x2(k2, list, ld6Var);
    }

    /* JADX INFO: renamed from: com.google.common.collect.n$ld6 */
    /* JADX INFO: compiled from: AbstractMapBasedMultimap.java */
    class ld6 extends AbstractCollection<V> {

        /* JADX INFO: renamed from: g */
        @NullableDecl
        final Collection<V> f26438g;

        /* JADX INFO: renamed from: k */
        @NullableDecl
        final K f26439k;

        /* JADX INFO: renamed from: n */
        @NullableDecl
        final AbstractC4469n<K, V>.ld6 f26440n;

        /* JADX INFO: renamed from: q */
        Collection<V> f26441q;

        ld6(@NullableDecl K k2, Collection<V> collection, @NullableDecl AbstractC4469n<K, V>.ld6 ld6Var) {
            this.f26439k = k2;
            this.f26441q = collection;
            this.f26440n = ld6Var;
            this.f26438g = ld6Var == null ? null : ld6Var.zy();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(V v2) {
            m15890g();
            boolean zIsEmpty = this.f26441q.isEmpty();
            boolean zAdd = this.f26441q.add(v2);
            if (zAdd) {
                AbstractC4469n.access$208(AbstractC4469n.this);
                if (zIsEmpty) {
                    m15891k();
                }
            }
            return zAdd;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zAddAll = this.f26441q.addAll(collection);
            if (zAddAll) {
                int size2 = this.f26441q.size();
                AbstractC4469n.this.f26432p += size2 - size;
                if (size == 0) {
                    m15891k();
                }
            }
            return zAddAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            int size = size();
            if (size == 0) {
                return;
            }
            this.f26441q.clear();
            AbstractC4469n.this.f26432p -= size;
            f7l8();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            m15890g();
            return this.f26441q.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            m15890g();
            return this.f26441q.containsAll(collection);
        }

        @Override // java.util.Collection
        public boolean equals(@NullableDecl Object obj) {
            if (obj == this) {
                return true;
            }
            m15890g();
            return this.f26441q.equals(obj);
        }

        void f7l8() {
            AbstractC4469n<K, V>.ld6 ld6Var = this.f26440n;
            if (ld6Var != null) {
                ld6Var.f7l8();
            } else if (this.f26441q.isEmpty()) {
                AbstractC4469n.this.f26433s.remove(this.f26439k);
            }
        }

        /* JADX INFO: renamed from: g */
        void m15890g() {
            Collection<V> collection;
            AbstractC4469n<K, V>.ld6 ld6Var = this.f26440n;
            if (ld6Var != null) {
                ld6Var.m15890g();
                if (this.f26440n.zy() != this.f26438g) {
                    throw new ConcurrentModificationException();
                }
            } else {
                if (!this.f26441q.isEmpty() || (collection = (Collection) AbstractC4469n.this.f26433s.get(this.f26439k)) == null) {
                    return;
                }
                this.f26441q = collection;
            }
        }

        @Override // java.util.Collection
        public int hashCode() {
            m15890g();
            return this.f26441q.hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            m15890g();
            return new k();
        }

        /* JADX INFO: renamed from: k */
        void m15891k() {
            AbstractC4469n<K, V>.ld6 ld6Var = this.f26440n;
            if (ld6Var != null) {
                ld6Var.m15891k();
            } else {
                AbstractC4469n.this.f26433s.put(this.f26439k, this.f26441q);
            }
        }

        /* JADX INFO: renamed from: n */
        K m15892n() {
            return this.f26439k;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            m15890g();
            boolean zRemove = this.f26441q.remove(obj);
            if (zRemove) {
                AbstractC4469n.access$210(AbstractC4469n.this);
                f7l8();
            }
            return zRemove;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zRemoveAll = this.f26441q.removeAll(collection);
            if (zRemoveAll) {
                int size2 = this.f26441q.size();
                AbstractC4469n.this.f26432p += size2 - size;
                f7l8();
            }
            return zRemoveAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            com.google.common.base.jk.a9(collection);
            int size = size();
            boolean zRetainAll = this.f26441q.retainAll(collection);
            if (zRetainAll) {
                int size2 = this.f26441q.size();
                AbstractC4469n.this.f26432p += size2 - size;
                f7l8();
            }
            return zRetainAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            m15890g();
            return this.f26441q.size();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            m15890g();
            return this.f26441q.toString();
        }

        AbstractC4469n<K, V>.ld6 toq() {
            return this.f26440n;
        }

        Collection<V> zy() {
            return this.f26441q;
        }

        /* JADX INFO: renamed from: com.google.common.collect.n$ld6$k */
        /* JADX INFO: compiled from: AbstractMapBasedMultimap.java */
        class k implements Iterator<V> {

            /* JADX INFO: renamed from: k */
            final Iterator<V> f26443k;

            /* JADX INFO: renamed from: q */
            final Collection<V> f26445q;

            k() {
                Collection<V> collection = ld6.this.f26441q;
                this.f26445q = collection;
                this.f26443k = AbstractC4469n.zy(collection);
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                toq();
                return this.f26443k.hasNext();
            }

            /* JADX INFO: renamed from: k */
            Iterator<V> m15893k() {
                toq();
                return this.f26443k;
            }

            @Override // java.util.Iterator
            public V next() {
                toq();
                return this.f26443k.next();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.f26443k.remove();
                AbstractC4469n.access$210(AbstractC4469n.this);
                ld6.this.f7l8();
            }

            void toq() {
                ld6.this.m15890g();
                if (ld6.this.f26441q != this.f26445q) {
                    throw new ConcurrentModificationException();
                }
            }

            k(Iterator<V> it) {
                this.f26445q = ld6.this.f26441q;
                this.f26443k = it;
            }
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.n$x2 */
    /* JADX INFO: compiled from: AbstractMapBasedMultimap.java */
    class x2 extends AbstractC4469n<K, V>.ld6 implements List<V> {

        /* JADX INFO: renamed from: com.google.common.collect.n$x2$k */
        /* JADX INFO: compiled from: AbstractMapBasedMultimap.java */
        private class k extends AbstractC4469n<K, V>.ld6.k implements ListIterator<V> {
            k() {
                super();
            }

            private ListIterator<V> zy() {
                return (ListIterator) m15893k();
            }

            @Override // java.util.ListIterator
            public void add(V v2) {
                boolean zIsEmpty = x2.this.isEmpty();
                zy().add(v2);
                AbstractC4469n.access$208(AbstractC4469n.this);
                if (zIsEmpty) {
                    x2.this.m15891k();
                }
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return zy().hasPrevious();
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return zy().nextIndex();
            }

            @Override // java.util.ListIterator
            public V previous() {
                return zy().previous();
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return zy().previousIndex();
            }

            @Override // java.util.ListIterator
            public void set(V v2) {
                zy().set(v2);
            }

            public k(int i2) {
                super(x2.this.m15896y().listIterator(i2));
            }
        }

        x2(@NullableDecl K k2, List<V> list, @NullableDecl AbstractC4469n<K, V>.ld6 ld6Var) {
            super(k2, list, ld6Var);
        }

        @Override // java.util.List
        public void add(int i2, V v2) {
            m15890g();
            boolean zIsEmpty = zy().isEmpty();
            m15896y().add(i2, v2);
            AbstractC4469n.access$208(AbstractC4469n.this);
            if (zIsEmpty) {
                m15891k();
            }
        }

        @Override // java.util.List
        public boolean addAll(int i2, Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zAddAll = m15896y().addAll(i2, collection);
            if (zAddAll) {
                int size2 = zy().size();
                AbstractC4469n.this.f26432p += size2 - size;
                if (size == 0) {
                    m15891k();
                }
            }
            return zAddAll;
        }

        @Override // java.util.List
        public V get(int i2) {
            m15890g();
            return m15896y().get(i2);
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            m15890g();
            return m15896y().indexOf(obj);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            m15890g();
            return m15896y().lastIndexOf(obj);
        }

        @Override // java.util.List
        public ListIterator<V> listIterator() {
            m15890g();
            return new k();
        }

        @Override // java.util.List
        public V remove(int i2) {
            m15890g();
            V vRemove = m15896y().remove(i2);
            AbstractC4469n.access$210(AbstractC4469n.this);
            f7l8();
            return vRemove;
        }

        @Override // java.util.List
        public V set(int i2, V v2) {
            m15890g();
            return m15896y().set(i2, v2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.List
        public List<V> subList(int i2, int i3) {
            m15890g();
            return AbstractC4469n.this.wrapList(m15892n(), m15896y().subList(i2, i3), toq() == null ? this : toq());
        }

        /* JADX INFO: renamed from: y */
        List<V> m15896y() {
            return (List) zy();
        }

        @Override // java.util.List
        public ListIterator<V> listIterator(int i2) {
            m15890g();
            return new k(i2);
        }
    }
}
