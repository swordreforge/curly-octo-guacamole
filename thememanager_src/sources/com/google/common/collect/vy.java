package com.google.common.collect;

import com.google.common.base.AbstractC4272s;
import com.google.common.base.C4280z;
import com.google.common.collect.g0ad;
import com.google.common.collect.ga;
import com.google.common.collect.zkd;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.j2objc.annotations.RetainedWith;
import com.google.j2objc.annotations.Weak;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Properties;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import wlev.InterfaceC7731k;

/* JADX INFO: compiled from: Maps.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq(emulated = true)
public final class vy {

    /* JADX INFO: compiled from: Maps.java */
    @wlev.zy
    static class a9<K, V> extends jp0y<K, V> implements NavigableSet<K> {
        a9(NavigableMap<K, V> navigableMap) {
            super(navigableMap);
        }

        @Override // java.util.NavigableSet
        public K ceiling(K k2) {
            return mo16033k().ceilingKey(k2);
        }

        @Override // java.util.NavigableSet
        public Iterator<K> descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> descendingSet() {
            return mo16033k().descendingKeySet();
        }

        @Override // java.util.NavigableSet
        public K floor(K k2) {
            return mo16033k().floorKey(k2);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> headSet(K k2, boolean z2) {
            return mo16033k().headMap(k2, z2).navigableKeySet();
        }

        @Override // java.util.NavigableSet
        public K higher(K k2) {
            return mo16033k().higherKey(k2);
        }

        @Override // java.util.NavigableSet
        public K lower(K k2) {
            return mo16033k().lowerKey(k2);
        }

        @Override // java.util.NavigableSet
        public K pollFirst() {
            return (K) vy.hyr(mo16033k().pollFirstEntry());
        }

        @Override // java.util.NavigableSet
        public K pollLast() {
            return (K) vy.hyr(mo16033k().pollLastEntry());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> subSet(K k2, boolean z2, K k3, boolean z3) {
            return mo16033k().subMap(k2, z2, k3, z3).navigableKeySet();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> tailSet(K k2, boolean z2) {
            return mo16033k().tailMap(k2, z2).navigableKeySet();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.vy.jp0y
        /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public NavigableMap<K, V> toq() {
            return (NavigableMap) this.f26650k;
        }

        @Override // com.google.common.collect.vy.jp0y, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<K> headSet(K k2) {
            return headSet(k2, false);
        }

        @Override // com.google.common.collect.vy.jp0y, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<K> subSet(K k2, K k3) {
            return subSet(k2, true, k3, false);
        }

        @Override // com.google.common.collect.vy.jp0y, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<K> tailSet(K k2) {
            return tailSet(k2, true);
        }
    }

    /* JADX INFO: compiled from: Maps.java */
    @wlev.zy
    static abstract class cdj<K, V> extends xwq3<K, V> implements NavigableMap<K, V> {

        /* JADX INFO: renamed from: k */
        @MonotonicNonNullDecl
        private transient Comparator<? super K> f26611k;

        /* JADX INFO: renamed from: n */
        @MonotonicNonNullDecl
        private transient NavigableSet<K> f26612n;

        /* JADX INFO: renamed from: q */
        @MonotonicNonNullDecl
        private transient Set<Map.Entry<K, V>> f26613q;

        /* JADX INFO: renamed from: com.google.common.collect.vy$cdj$k */
        /* JADX INFO: compiled from: Maps.java */
        class C4534k extends t8r<K, V> {
            C4534k() {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, V>> iterator() {
                return cdj.this.x2();
            }

            @Override // com.google.common.collect.vy.t8r
            /* JADX INFO: renamed from: k */
            Map<K, V> mo15823k() {
                return cdj.this;
            }
        }

        cdj() {
        }

        /* JADX INFO: renamed from: h */
        private static <T> kx3<T> m16034h(Comparator<T> comparator) {
            return kx3.from(comparator).reverse();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> ceilingEntry(K k2) {
            return kja0().floorEntry(k2);
        }

        @Override // java.util.NavigableMap
        public K ceilingKey(K k2) {
            return kja0().floorKey(k2);
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
            Comparator<? super K> comparator = this.f26611k;
            if (comparator != null) {
                return comparator;
            }
            Comparator<? super K> comparator2 = kja0().comparator();
            if (comparator2 == null) {
                comparator2 = kx3.natural();
            }
            kx3 kx3VarM16034h = m16034h(comparator2);
            this.f26611k = kx3VarM16034h;
            return kx3VarM16034h;
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
            return kja0().navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> descendingMap() {
            return kja0();
        }

        @Override // com.google.common.collect.xwq3, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            Set<Map.Entry<K, V>> set = this.f26613q;
            if (set != null) {
                return set;
            }
            Set<Map.Entry<K, V>> setLd6 = ld6();
            this.f26613q = setLd6;
            return setLd6;
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> firstEntry() {
            return kja0().lastEntry();
        }

        @Override // java.util.SortedMap
        public K firstKey() {
            return kja0().lastKey();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> floorEntry(K k2) {
            return kja0().ceilingEntry(k2);
        }

        @Override // java.util.NavigableMap
        public K floorKey(K k2) {
            return kja0().ceilingKey(k2);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> headMap(K k2, boolean z2) {
            return kja0().tailMap(k2, z2).descendingMap();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> higherEntry(K k2) {
            return kja0().lowerEntry(k2);
        }

        @Override // java.util.NavigableMap
        public K higherKey(K k2) {
            return kja0().lowerKey(k2);
        }

        @Override // com.google.common.collect.xwq3, java.util.Map
        public Set<K> keySet() {
            return navigableKeySet();
        }

        abstract NavigableMap<K, V> kja0();

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> lastEntry() {
            return kja0().firstEntry();
        }

        @Override // java.util.SortedMap
        public K lastKey() {
            return kja0().firstKey();
        }

        Set<Map.Entry<K, V>> ld6() {
            return new C4534k();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> lowerEntry(K k2) {
            return kja0().higherEntry(k2);
        }

        @Override // java.util.NavigableMap
        public K lowerKey(K k2) {
            return kja0().higherKey(k2);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            NavigableSet<K> navigableSet = this.f26612n;
            if (navigableSet != null) {
                return navigableSet;
            }
            a9 a9Var = new a9(this);
            this.f26612n = a9Var;
            return a9Var;
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> pollFirstEntry() {
            return kja0().pollLastEntry();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> pollLastEntry() {
            return kja0().pollFirstEntry();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> subMap(K k2, boolean z2, K k3, boolean z3) {
            return kja0().subMap(k3, z3, k2, z2).descendingMap();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> tailMap(K k2, boolean z2) {
            return kja0().headMap(k2, z2).descendingMap();
        }

        @Override // com.google.common.collect.qkj8, com.google.common.collect.o05
        public String toString() {
            return standardToString();
        }

        @Override // com.google.common.collect.xwq3, java.util.Map, com.google.common.collect.ni7
        public Collection<V> values() {
            return new ncyb(this);
        }

        abstract Iterator<Map.Entry<K, V>> x2();

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.xwq3, com.google.common.collect.qkj8
        public final Map<K, V> delegate() {
            return kja0();
        }

        @Override // java.util.NavigableMap, java.util.SortedMap
        public SortedMap<K, V> headMap(K k2) {
            return headMap(k2, false);
        }

        @Override // java.util.NavigableMap, java.util.SortedMap
        public SortedMap<K, V> subMap(K k2, K k3) {
            return subMap(k2, true, k3, false);
        }

        @Override // java.util.NavigableMap, java.util.SortedMap
        public SortedMap<K, V> tailMap(K k2) {
            return tailMap(k2, true);
        }
    }

    /* JADX INFO: compiled from: Maps.java */
    private static class d2ok<K, V> extends xwq3<K, V> implements com.google.common.collect.ni7<K, V>, Serializable {
        private static final long serialVersionUID = 0;
        final com.google.common.collect.ni7<? extends K, ? extends V> delegate;

        @RetainedWith
        @MonotonicNonNullDecl
        com.google.common.collect.ni7<V, K> inverse;
        final Map<K, V> unmodifiableMap;

        @MonotonicNonNullDecl
        transient Set<V> values;

        d2ok(com.google.common.collect.ni7<? extends K, ? extends V> ni7Var, @NullableDecl com.google.common.collect.ni7<V, K> ni7Var2) {
            this.unmodifiableMap = Collections.unmodifiableMap(ni7Var);
            this.delegate = ni7Var;
            this.inverse = ni7Var2;
        }

        @Override // com.google.common.collect.ni7
        public V forcePut(K k2, V v2) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ni7
        public com.google.common.collect.ni7<V, K> inverse() {
            com.google.common.collect.ni7<V, K> ni7Var = this.inverse;
            if (ni7Var != null) {
                return ni7Var;
            }
            d2ok d2okVar = new d2ok(this.delegate.inverse(), this);
            this.inverse = d2okVar;
            return d2okVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.xwq3, com.google.common.collect.qkj8
        public Map<K, V> delegate() {
            return this.unmodifiableMap;
        }

        @Override // com.google.common.collect.xwq3, java.util.Map, com.google.common.collect.ni7
        public Set<V> values() {
            Set<V> set = this.values;
            if (set != null) {
                return set;
            }
            Set<V> setUnmodifiableSet = Collections.unmodifiableSet(this.delegate.values());
            this.values = setUnmodifiableSet;
            return setUnmodifiableSet;
        }
    }

    /* JADX INFO: compiled from: Maps.java */
    static class d3<K, V1, V2> extends wvg<K, V2> {

        /* JADX INFO: renamed from: k */
        final Map<K, V1> f26615k;

        /* JADX INFO: renamed from: q */
        final InterfaceC4539i<? super K, ? super V1, V2> f26616q;

        d3(Map<K, V1> map, InterfaceC4539i<? super K, ? super V1, V2> interfaceC4539i) {
            this.f26615k = (Map) com.google.common.base.jk.a9(map);
            this.f26616q = (InterfaceC4539i) com.google.common.base.jk.a9(interfaceC4539i);
        }

        @Override // com.google.common.collect.vy.wvg, java.util.AbstractMap, java.util.Map
        public void clear() {
            this.f26615k.clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return this.f26615k.containsKey(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V2 get(Object obj) {
            V1 v1 = this.f26615k.get(obj);
            if (v1 != null || this.f26615k.containsKey(obj)) {
                return this.f26616q.mo15947k(obj, v1);
            }
            return null;
        }

        @Override // com.google.common.collect.vy.wvg
        /* JADX INFO: renamed from: k */
        Iterator<Map.Entry<K, V2>> mo15684k() {
            return zwy.m16124j(this.f26615k.entrySet().iterator(), vy.f7l8(this.f26616q));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
            return this.f26615k.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V2 remove(Object obj) {
            if (this.f26615k.containsKey(obj)) {
                return this.f26616q.mo15947k(obj, this.f26615k.remove(obj));
            }
            return null;
        }

        @Override // com.google.common.collect.vy.wvg, java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f26615k.size();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection<V2> values() {
            return new ncyb(this);
        }
    }

    /* JADX INFO: compiled from: Maps.java */
    @wlev.zy
    static class dd<K, V> extends wo<K, V> implements NavigableMap<K, V>, Serializable {
        private final NavigableMap<K, ? extends V> delegate;

        /* JADX INFO: renamed from: k */
        @MonotonicNonNullDecl
        private transient dd<K, V> f26617k;

        dd(NavigableMap<K, ? extends V> navigableMap) {
            this.delegate = navigableMap;
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> ceilingEntry(K k2) {
            return vy.was(this.delegate.ceilingEntry(k2));
        }

        @Override // java.util.NavigableMap
        public K ceilingKey(K k2) {
            return this.delegate.ceilingKey(k2);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
            return g0ad.dd(this.delegate.descendingKeySet());
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> descendingMap() {
            dd<K, V> ddVar = this.f26617k;
            if (ddVar != null) {
                return ddVar;
            }
            dd<K, V> ddVar2 = new dd<>(this.delegate.descendingMap(), this);
            this.f26617k = ddVar2;
            return ddVar2;
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> firstEntry() {
            return vy.was(this.delegate.firstEntry());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> floorEntry(K k2) {
            return vy.was(this.delegate.floorEntry(k2));
        }

        @Override // java.util.NavigableMap
        public K floorKey(K k2) {
            return this.delegate.floorKey(k2);
        }

        @Override // com.google.common.collect.wo, java.util.SortedMap, java.util.NavigableMap
        public SortedMap<K, V> headMap(K k2) {
            return headMap(k2, false);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> higherEntry(K k2) {
            return vy.was(this.delegate.higherEntry(k2));
        }

        @Override // java.util.NavigableMap
        public K higherKey(K k2) {
            return this.delegate.higherKey(k2);
        }

        @Override // com.google.common.collect.xwq3, java.util.Map
        public Set<K> keySet() {
            return navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> lastEntry() {
            return vy.was(this.delegate.lastEntry());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> lowerEntry(K k2) {
            return vy.was(this.delegate.lowerEntry(k2));
        }

        @Override // java.util.NavigableMap
        public K lowerKey(K k2) {
            return this.delegate.lowerKey(k2);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            return g0ad.dd(this.delegate.navigableKeySet());
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, V> pollFirstEntry() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, V> pollLastEntry() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.wo, java.util.SortedMap, java.util.NavigableMap
        public SortedMap<K, V> subMap(K k2, K k3) {
            return subMap(k2, true, k3, false);
        }

        @Override // com.google.common.collect.wo, java.util.SortedMap, java.util.NavigableMap
        public SortedMap<K, V> tailMap(K k2) {
            return tailMap(k2, true);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> headMap(K k2, boolean z2) {
            return vy.g1(this.delegate.headMap(k2, z2));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> subMap(K k2, boolean z2, K k3, boolean z3) {
            return vy.g1(this.delegate.subMap(k2, z2, k3, z3));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> tailMap(K k2, boolean z2) {
            return vy.g1(this.delegate.tailMap(k2, z2));
        }

        dd(NavigableMap<K, ? extends V> navigableMap, dd<K, V> ddVar) {
            this.delegate = navigableMap;
            this.f26617k = ddVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.wo, com.google.common.collect.xwq3, com.google.common.collect.qkj8
        public SortedMap<K, V> delegate() {
            return Collections.unmodifiableSortedMap(this.delegate);
        }
    }

    /* JADX INFO: compiled from: Maps.java */
    static class eqxt<K, V1, V2> extends d3<K, V1, V2> implements SortedMap<K, V2> {
        eqxt(SortedMap<K, V1> sortedMap, InterfaceC4539i<? super K, ? super V1, V2> interfaceC4539i) {
            super(sortedMap, interfaceC4539i);
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
            return toq().comparator();
        }

        @Override // java.util.SortedMap
        public K firstKey() {
            return toq().firstKey();
        }

        @Override // java.util.SortedMap
        public SortedMap<K, V2> headMap(K k2) {
            return vy.xwq3(toq().headMap(k2), this.f26616q);
        }

        @Override // java.util.SortedMap
        public K lastKey() {
            return toq().lastKey();
        }

        @Override // java.util.SortedMap
        public SortedMap<K, V2> subMap(K k2, K k3) {
            return vy.xwq3(toq().subMap(k2, k3), this.f26616q);
        }

        @Override // java.util.SortedMap
        public SortedMap<K, V2> tailMap(K k2) {
            return vy.xwq3(toq().tailMap(k2), this.f26616q);
        }

        protected SortedMap<K, V1> toq() {
            return (SortedMap) this.f26615k;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    /* JADX INFO: compiled from: Maps.java */
    static class f7l8<K, V> extends pnt2<K, Map.Entry<K, V>> {

        /* JADX INFO: renamed from: q */
        final /* synthetic */ com.google.common.base.t8r f26618q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f7l8(Iterator it, com.google.common.base.t8r t8rVar) {
            super(it);
            this.f26618q = t8rVar;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.pnt2
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> mo15580k(K k2) {
            return vy.dd(k2, this.f26618q.apply(k2));
        }
    }

    /* JADX INFO: compiled from: Maps.java */
    static final class fn3e<K, V> extends zurt<K, V> implements com.google.common.collect.ni7<K, V> {

        /* JADX INFO: renamed from: p */
        @RetainedWith
        private final com.google.common.collect.ni7<V, K> f26619p;

        /* JADX INFO: renamed from: com.google.common.collect.vy$fn3e$k */
        /* JADX INFO: compiled from: Maps.java */
        static class C4535k implements com.google.common.base.a9<Map.Entry<V, K>> {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ com.google.common.base.a9 f26620k;

            C4535k(com.google.common.base.a9 a9Var) {
                this.f26620k = a9Var;
            }

            @Override // com.google.common.base.a9
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public boolean apply(Map.Entry<V, K> entry) {
                return this.f26620k.apply(vy.dd(entry.getValue(), entry.getKey()));
            }
        }

        fn3e(com.google.common.collect.ni7<K, V> ni7Var, com.google.common.base.a9<? super Map.Entry<K, V>> a9Var) {
            super(ni7Var, a9Var);
            this.f26619p = new fn3e(ni7Var.inverse(), m16035y(a9Var), this);
        }

        /* JADX INFO: renamed from: y */
        private static <K, V> com.google.common.base.a9<Map.Entry<V, K>> m16035y(com.google.common.base.a9<? super Map.Entry<K, V>> a9Var) {
            return new C4535k(a9Var);
        }

        @Override // com.google.common.collect.ni7
        public V forcePut(@NullableDecl K k2, @NullableDecl V v2) {
            com.google.common.base.jk.m15383q(m16043q(k2, v2));
            return m16036p().forcePut(k2, v2);
        }

        @Override // com.google.common.collect.ni7
        public com.google.common.collect.ni7<V, K> inverse() {
            return this.f26619p;
        }

        /* JADX INFO: renamed from: p */
        com.google.common.collect.ni7<K, V> m16036p() {
            return (com.google.common.collect.ni7) this.f26637g;
        }

        @Override // com.google.common.collect.vy.AbstractC4543l, java.util.AbstractMap, java.util.Map
        public Set<V> values() {
            return this.f26619p.keySet();
        }

        private fn3e(com.google.common.collect.ni7<K, V> ni7Var, com.google.common.base.a9<? super Map.Entry<K, V>> a9Var, com.google.common.collect.ni7<V, K> ni7Var2) {
            super(ni7Var, a9Var);
            this.f26619p = ni7Var2;
        }
    }

    /* JADX INFO: compiled from: Maps.java */
    private static class fti<K, V> extends kja0<K, V> implements SortedMap<K, V> {
        fti(SortedSet<K> sortedSet, com.google.common.base.t8r<? super K, V> t8rVar) {
            super(sortedSet, t8rVar);
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
            return mo16039q().comparator();
        }

        @Override // java.util.SortedMap
        public K firstKey() {
            return mo16039q().first();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.vy.kja0
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public SortedSet<K> mo16039q() {
            return (SortedSet) super.mo16039q();
        }

        @Override // java.util.SortedMap
        public SortedMap<K, V> headMap(K k2) {
            return vy.x2(mo16039q().headSet(k2), this.f26628y);
        }

        @Override // com.google.common.collect.vy.AbstractC4543l, java.util.AbstractMap, java.util.Map, java.util.SortedMap
        /* JADX INFO: renamed from: keySet */
        public Set<K> mo15886p() {
            return vy.zp(mo16039q());
        }

        @Override // java.util.SortedMap
        public K lastKey() {
            return mo16039q().last();
        }

        @Override // java.util.SortedMap
        public SortedMap<K, V> subMap(K k2, K k3) {
            return vy.x2(mo16039q().subSet(k2, k3), this.f26628y);
        }

        @Override // java.util.SortedMap
        public SortedMap<K, V> tailMap(K k2) {
            return vy.x2(mo16039q().tailSet(k2), this.f26628y);
        }
    }

    /* JADX INFO: compiled from: Maps.java */
    private static class fu4<K, V> extends zurt<K, V> implements SortedMap<K, V> {

        /* JADX INFO: renamed from: com.google.common.collect.vy$fu4$k */
        /* JADX INFO: compiled from: Maps.java */
        class C4536k extends zurt<K, V>.toq implements SortedSet<K> {
            C4536k() {
                super();
            }

            @Override // java.util.SortedSet
            public Comparator<? super K> comparator() {
                return fu4.this.ld6().comparator();
            }

            @Override // java.util.SortedSet
            public K first() {
                return (K) fu4.this.firstKey();
            }

            @Override // java.util.SortedSet
            public SortedSet<K> headSet(K k2) {
                return (SortedSet) fu4.this.headMap(k2).keySet();
            }

            @Override // java.util.SortedSet
            public K last() {
                return (K) fu4.this.lastKey();
            }

            @Override // java.util.SortedSet
            public SortedSet<K> subSet(K k2, K k3) {
                return (SortedSet) fu4.this.subMap(k2, k3).keySet();
            }

            @Override // java.util.SortedSet
            public SortedSet<K> tailSet(K k2) {
                return (SortedSet) fu4.this.tailMap(k2).keySet();
            }
        }

        fu4(SortedMap<K, V> sortedMap, com.google.common.base.a9<? super Map.Entry<K, V>> a9Var) {
            super(sortedMap, a9Var);
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
            return ld6().comparator();
        }

        @Override // java.util.SortedMap
        public K firstKey() {
            return mo15886p().iterator().next();
        }

        @Override // java.util.SortedMap
        public SortedMap<K, V> headMap(K k2) {
            return new fu4(ld6().headMap(k2), this.f26638y);
        }

        @Override // java.util.SortedMap
        public K lastKey() {
            SortedMap<K, V> sortedMapLd6 = ld6();
            while (true) {
                K kLastKey = sortedMapLd6.lastKey();
                if (m16043q(kLastKey, this.f26637g.get(kLastKey))) {
                    return kLastKey;
                }
                sortedMapLd6 = ld6().headMap(kLastKey);
            }
        }

        SortedMap<K, V> ld6() {
            return (SortedMap) this.f26637g;
        }

        @Override // com.google.common.collect.vy.AbstractC4543l, java.util.AbstractMap, java.util.Map, java.util.SortedMap
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public SortedSet<K> mo15886p() {
            return (SortedSet) super.mo15886p();
        }

        @Override // java.util.SortedMap
        public SortedMap<K, V> subMap(K k2, K k3) {
            return new fu4(ld6().subMap(k2, k3), this.f26638y);
        }

        @Override // java.util.SortedMap
        public SortedMap<K, V> tailMap(K k2) {
            return new fu4(ld6().tailMap(k2), this.f26638y);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.vy.zurt, com.google.common.collect.vy.AbstractC4543l
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public SortedSet<K> mo15887y() {
            return new C4536k();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    /* JADX INFO: renamed from: com.google.common.collect.vy$g */
    /* JADX INFO: compiled from: Maps.java */
    static class C4537g<K, V> extends pnt2<Map.Entry<K, V>, V> {
        C4537g(Iterator it) {
            super(it);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.pnt2
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public V mo15580k(Map.Entry<K, V> entry) {
            return entry.getValue();
        }
    }

    /* JADX INFO: compiled from: Maps.java */
    static class gvn7<K, V> extends mcp<K, V> implements kbj<K, V> {
        gvn7(SortedMap<K, V> sortedMap, SortedMap<K, V> sortedMap2, SortedMap<K, V> sortedMap3, SortedMap<K, ga.InterfaceC4387k<V>> sortedMap4) {
            super(sortedMap, sortedMap2, sortedMap3, sortedMap4);
        }

        @Override // com.google.common.collect.vy.mcp, com.google.common.collect.ga
        /* JADX INFO: renamed from: k */
        public SortedMap<K, V> mo15706k() {
            return (SortedMap) super.mo15706k();
        }

        @Override // com.google.common.collect.vy.mcp, com.google.common.collect.ga
        /* JADX INFO: renamed from: q */
        public SortedMap<K, V> mo15708q() {
            return (SortedMap) super.mo15708q();
        }

        @Override // com.google.common.collect.vy.mcp, com.google.common.collect.ga
        public SortedMap<K, V> toq() {
            return (SortedMap) super.toq();
        }

        @Override // com.google.common.collect.vy.mcp, com.google.common.collect.ga
        public SortedMap<K, ga.InterfaceC4387k<V>> zy() {
            return (SortedMap) super.zy();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.vy$h */
    /* JADX INFO: compiled from: Maps.java */
    private static final class C4538h<A, B> extends AbstractC4272s<A, B> implements Serializable {
        private static final long serialVersionUID = 0;
        private final com.google.common.collect.ni7<A, B> bimap;

        C4538h(com.google.common.collect.ni7<A, B> ni7Var) {
            this.bimap = (com.google.common.collect.ni7) com.google.common.base.jk.a9(ni7Var);
        }

        /* JADX INFO: renamed from: k */
        private static <X, Y> Y m16042k(com.google.common.collect.ni7<X, Y> ni7Var, X x3) {
            Y y3 = ni7Var.get(x3);
            com.google.common.base.jk.fn3e(y3 != null, "No non-null mapping present for input: %s", x3);
            return y3;
        }

        @Override // com.google.common.base.AbstractC4272s
        protected A doBackward(B b2) {
            return (A) m16042k(this.bimap.inverse(), b2);
        }

        @Override // com.google.common.base.AbstractC4272s
        protected B doForward(A a2) {
            return (B) m16042k(this.bimap, a2);
        }

        @Override // com.google.common.base.AbstractC4272s, com.google.common.base.t8r
        public boolean equals(@NullableDecl Object obj) {
            if (obj instanceof C4538h) {
                return this.bimap.equals(((C4538h) obj).bimap);
            }
            return false;
        }

        public int hashCode() {
            return this.bimap.hashCode();
        }

        public String toString() {
            return "Maps.asConverter(" + this.bimap + ")";
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.vy$i */
    /* JADX INFO: compiled from: Maps.java */
    public interface InterfaceC4539i<K, V1, V2> {
        /* JADX INFO: renamed from: k */
        V2 mo15947k(@NullableDecl K k2, @NullableDecl V1 v1);
    }

    /* JADX INFO: compiled from: Maps.java */
    @wlev.zy
    private static final class jk<K, V> extends AbstractC4510p<K, V> {

        /* JADX INFO: renamed from: k */
        private final NavigableSet<K> f26622k;

        /* JADX INFO: renamed from: q */
        private final com.google.common.base.t8r<? super K, V> f26623q;

        jk(NavigableSet<K> navigableSet, com.google.common.base.t8r<? super K, V> t8rVar) {
            this.f26622k = (NavigableSet) com.google.common.base.jk.a9(navigableSet);
            this.f26623q = (com.google.common.base.t8r) com.google.common.base.jk.a9(t8rVar);
        }

        @Override // com.google.common.collect.vy.wvg, java.util.AbstractMap, java.util.Map
        public void clear() {
            this.f26622k.clear();
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
            return this.f26622k.comparator();
        }

        @Override // com.google.common.collect.AbstractC4510p, java.util.NavigableMap
        public NavigableMap<K, V> descendingMap() {
            return vy.ld6(this.f26622k.descendingSet(), this.f26623q);
        }

        @Override // com.google.common.collect.AbstractC4510p, java.util.AbstractMap, java.util.Map
        @NullableDecl
        public V get(@NullableDecl Object obj) {
            if (com.google.common.collect.mcp.ld6(this.f26622k, obj)) {
                return this.f26623q.apply(obj);
            }
            return null;
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> headMap(K k2, boolean z2) {
            return vy.ld6(this.f26622k.headSet(k2, z2), this.f26623q);
        }

        @Override // com.google.common.collect.vy.wvg
        /* JADX INFO: renamed from: k */
        Iterator<Map.Entry<K, V>> mo15684k() {
            return vy.qrj(this.f26622k, this.f26623q);
        }

        @Override // com.google.common.collect.AbstractC4510p, java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            return vy.a98o(this.f26622k);
        }

        @Override // com.google.common.collect.vy.wvg, java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f26622k.size();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> subMap(K k2, boolean z2, K k3, boolean z3) {
            return vy.ld6(this.f26622k.subSet(k2, z2, k3, z3), this.f26623q);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> tailMap(K k2, boolean z2) {
            return vy.ld6(this.f26622k.tailSet(k2, z2), this.f26623q);
        }

        @Override // com.google.common.collect.AbstractC4510p
        Iterator<Map.Entry<K, V>> toq() {
            return descendingMap().entrySet().iterator();
        }
    }

    /* JADX INFO: compiled from: Maps.java */
    static class jp0y<K, V> extends C4550t<K, V> implements SortedSet<K> {
        jp0y(SortedMap<K, V> sortedMap) {
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
            return new jp0y(toq().headMap(k2));
        }

        @Override // java.util.SortedSet
        public K last() {
            return toq().lastKey();
        }

        public SortedSet<K> subSet(K k2, K k3) {
            return new jp0y(toq().subMap(k2, k3));
        }

        public SortedSet<K> tailSet(K k2) {
            return new jp0y(toq().tailMap(k2));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.vy.C4550t
        public SortedMap<K, V> toq() {
            return (SortedMap) super.toq();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V1, V2] */
    /* JADX INFO: renamed from: com.google.common.collect.vy$k */
    /* JADX INFO: compiled from: Maps.java */
    static class C4540k<V1, V2> implements com.google.common.base.t8r<V1, V2> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ InterfaceC4539i f26624k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ Object f26625q;

        C4540k(InterfaceC4539i interfaceC4539i, Object obj) {
            this.f26624k = interfaceC4539i;
            this.f26625q = obj;
        }

        @Override // com.google.common.base.t8r
        public V2 apply(@NullableDecl V1 v1) {
            return (V2) this.f26624k.mo15947k(this.f26625q, v1);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Maps.java */
    private static abstract class ki implements com.google.common.base.t8r<Map.Entry<?, ?>, Object> {
        public static final ki KEY;
        public static final ki VALUE;

        /* JADX INFO: renamed from: k */
        private static final /* synthetic */ ki[] f26626k;

        /* JADX INFO: renamed from: com.google.common.collect.vy$ki$k */
        /* JADX INFO: compiled from: Maps.java */
        enum C4541k extends ki {
            C4541k(String str, int i2) {
                super(str, i2, null);
            }

            @Override // com.google.common.base.t8r
            @NullableDecl
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getKey();
            }
        }

        /* JADX INFO: compiled from: Maps.java */
        enum toq extends ki {
            toq(String str, int i2) {
                super(str, i2, null);
            }

            @Override // com.google.common.base.t8r
            @NullableDecl
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getValue();
            }
        }

        static {
            C4541k c4541k = new C4541k("KEY", 0);
            KEY = c4541k;
            toq toqVar = new toq("VALUE", 1);
            VALUE = toqVar;
            f26626k = new ki[]{c4541k, toqVar};
        }

        private ki(String str, int i2) {
        }

        public static ki valueOf(String str) {
            return (ki) Enum.valueOf(ki.class, str);
        }

        public static ki[] values() {
            return (ki[]) f26626k.clone();
        }

        /* synthetic */ ki(String str, int i2, C4544n c4544n) {
            this(str, i2);
        }
    }

    /* JADX INFO: compiled from: Maps.java */
    private static class kja0<K, V> extends AbstractC4543l<K, V> {

        /* JADX INFO: renamed from: g */
        private final Set<K> f26627g;

        /* JADX INFO: renamed from: y */
        final com.google.common.base.t8r<? super K, V> f26628y;

        /* JADX INFO: renamed from: com.google.common.collect.vy$kja0$k */
        /* JADX INFO: compiled from: Maps.java */
        class C4542k extends t8r<K, V> {
            C4542k() {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, V>> iterator() {
                return vy.qrj(kja0.this.mo16039q(), kja0.this.f26628y);
            }

            @Override // com.google.common.collect.vy.t8r
            /* JADX INFO: renamed from: k */
            Map<K, V> mo15823k() {
                return kja0.this;
            }
        }

        kja0(Set<K> set, com.google.common.base.t8r<? super K, V> t8rVar) {
            this.f26627g = (Set) com.google.common.base.jk.a9(set);
            this.f26628y = (com.google.common.base.t8r) com.google.common.base.jk.a9(t8rVar);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            mo16039q().clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@NullableDecl Object obj) {
            return mo16039q().contains(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V get(@NullableDecl Object obj) {
            if (com.google.common.collect.mcp.ld6(mo16039q(), obj)) {
                return this.f26628y.apply(obj);
            }
            return null;
        }

        @Override // com.google.common.collect.vy.AbstractC4543l
        /* JADX INFO: renamed from: k */
        protected Set<Map.Entry<K, V>> mo15821k() {
            return new C4542k();
        }

        /* JADX INFO: renamed from: q */
        Set<K> mo16039q() {
            return this.f26627g;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V remove(@NullableDecl Object obj) {
            if (mo16039q().remove(obj)) {
                return this.f26628y.apply(obj);
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return mo16039q().size();
        }

        @Override // com.google.common.collect.vy.AbstractC4543l
        /* JADX INFO: renamed from: toq */
        public Set<K> mo15887y() {
            return vy.m16008a(mo16039q());
        }

        @Override // com.google.common.collect.vy.AbstractC4543l
        Collection<V> zy() {
            return com.google.common.collect.mcp.n7h(this.f26627g, this.f26628y);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.vy$l */
    /* JADX INFO: compiled from: Maps.java */
    @wlev.toq
    static abstract class AbstractC4543l<K, V> extends AbstractMap<K, V> {

        /* JADX INFO: renamed from: k */
        @MonotonicNonNullDecl
        private transient Set<Map.Entry<K, V>> f26630k;

        /* JADX INFO: renamed from: n */
        @MonotonicNonNullDecl
        private transient Collection<V> f26631n;

        /* JADX INFO: renamed from: q */
        @MonotonicNonNullDecl
        private transient Set<K> f26632q;

        AbstractC4543l() {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            Set<Map.Entry<K, V>> set = this.f26630k;
            if (set != null) {
                return set;
            }
            Set<Map.Entry<K, V>> setMo15821k = mo15821k();
            this.f26630k = setMo15821k;
            return setMo15821k;
        }

        /* JADX INFO: renamed from: k */
        abstract Set<Map.Entry<K, V>> mo15821k();

        @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
        /* JADX INFO: renamed from: keySet */
        public Set<K> mo15886p() {
            Set<K> set = this.f26632q;
            if (set != null) {
                return set;
            }
            Set<K> setMo15887y = mo15887y();
            this.f26632q = setMo15887y;
            return setMo15887y;
        }

        /* JADX INFO: renamed from: toq */
        Set<K> mo15887y() {
            return new C4550t(this);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection<V> values() {
            Collection<V> collection = this.f26631n;
            if (collection != null) {
                return collection;
            }
            Collection<V> collectionZy = zy();
            this.f26631n = collectionZy;
            return collectionZy;
        }

        Collection<V> zy() {
            return new ncyb(this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    /* JADX INFO: compiled from: Maps.java */
    static class ld6<K, V> extends com.google.common.collect.f7l8<K, V> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Map.Entry f26633k;

        ld6(Map.Entry entry) {
            this.f26633k = entry;
        }

        @Override // com.google.common.collect.f7l8, java.util.Map.Entry
        public K getKey() {
            return (K) this.f26633k.getKey();
        }

        @Override // com.google.common.collect.f7l8, java.util.Map.Entry
        public V getValue() {
            return (V) this.f26633k.getValue();
        }
    }

    /* JADX INFO: compiled from: Maps.java */
    static class lvui<K, V> extends AbstractC4572x<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: k */
        private final Collection<Map.Entry<K, V>> f26634k;

        lvui(Collection<Map.Entry<K, V>> collection) {
            this.f26634k = collection;
        }

        @Override // com.google.common.collect.AbstractC4572x, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return vy.tfm(this.f26634k.iterator());
        }

        @Override // com.google.common.collect.AbstractC4572x, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return standardToArray();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.AbstractC4572x, com.google.common.collect.qkj8
        public Collection<Map.Entry<K, V>> delegate() {
            return this.f26634k;
        }

        @Override // com.google.common.collect.AbstractC4572x, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) standardToArray(tArr);
        }
    }

    /* JADX INFO: compiled from: Maps.java */
    static class mcp<K, V> implements ga<K, V> {

        /* JADX INFO: renamed from: k */
        final Map<K, V> f26635k;

        /* JADX INFO: renamed from: q */
        final Map<K, ga.InterfaceC4387k<V>> f26636q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final Map<K, V> f68232toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        final Map<K, V> f68233zy;

        mcp(Map<K, V> map, Map<K, V> map2, Map<K, V> map3, Map<K, ga.InterfaceC4387k<V>> map4) {
            this.f26635k = vy.d8wk(map);
            this.f68232toq = vy.d8wk(map2);
            this.f68233zy = vy.d8wk(map3);
            this.f26636q = vy.d8wk(map4);
        }

        @Override // com.google.common.collect.ga
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ga)) {
                return false;
            }
            ga gaVar = (ga) obj;
            return toq().equals(gaVar.toq()) && mo15706k().equals(gaVar.mo15706k()) && mo15708q().equals(gaVar.mo15708q()) && zy().equals(gaVar.zy());
        }

        @Override // com.google.common.collect.ga
        public int hashCode() {
            return C4280z.toq(toq(), mo15706k(), mo15708q(), zy());
        }

        @Override // com.google.common.collect.ga
        /* JADX INFO: renamed from: k */
        public Map<K, V> mo15706k() {
            return this.f68232toq;
        }

        @Override // com.google.common.collect.ga
        /* JADX INFO: renamed from: n */
        public boolean mo15707n() {
            return this.f26635k.isEmpty() && this.f68232toq.isEmpty() && this.f26636q.isEmpty();
        }

        @Override // com.google.common.collect.ga
        /* JADX INFO: renamed from: q */
        public Map<K, V> mo15708q() {
            return this.f68233zy;
        }

        public String toString() {
            if (mo15707n()) {
                return "equal";
            }
            StringBuilder sb = new StringBuilder("not equal");
            if (!this.f26635k.isEmpty()) {
                sb.append(": only on left=");
                sb.append(this.f26635k);
            }
            if (!this.f68232toq.isEmpty()) {
                sb.append(": only on right=");
                sb.append(this.f68232toq);
            }
            if (!this.f26636q.isEmpty()) {
                sb.append(": value differences=");
                sb.append(this.f26636q);
            }
            return sb.toString();
        }

        @Override // com.google.common.collect.ga
        public Map<K, V> toq() {
            return this.f26635k;
        }

        @Override // com.google.common.collect.ga
        public Map<K, ga.InterfaceC4387k<V>> zy() {
            return this.f26636q;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    /* JADX INFO: renamed from: com.google.common.collect.vy$n */
    /* JADX INFO: compiled from: Maps.java */
    static class C4544n<K, V> extends pnt2<Map.Entry<K, V>, K> {
        C4544n(Iterator it) {
            super(it);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.pnt2
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public K mo15580k(Map.Entry<K, V> entry) {
            return entry.getKey();
        }
    }

    /* JADX INFO: compiled from: Maps.java */
    private static abstract class n7h<K, V> extends AbstractC4543l<K, V> {

        /* JADX INFO: renamed from: g */
        final Map<K, V> f26637g;

        /* JADX INFO: renamed from: y */
        final com.google.common.base.a9<? super Map.Entry<K, V>> f26638y;

        n7h(Map<K, V> map, com.google.common.base.a9<? super Map.Entry<K, V>> a9Var) {
            this.f26637g = map;
            this.f26638y = a9Var;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return this.f26637g.containsKey(obj) && m16043q(obj, this.f26637g.get(obj));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V get(Object obj) {
            V v2 = this.f26637g.get(obj);
            if (v2 == null || !m16043q(obj, v2)) {
                return null;
            }
            return v2;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean isEmpty() {
            return entrySet().isEmpty();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V put(K k2, V v2) {
            com.google.common.base.jk.m15383q(m16043q(k2, v2));
            return this.f26637g.put(k2, v2);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void putAll(Map<? extends K, ? extends V> map) {
            for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
                com.google.common.base.jk.m15383q(m16043q(entry.getKey(), entry.getValue()));
            }
            this.f26637g.putAll(map);
        }

        /* JADX INFO: renamed from: q */
        boolean m16043q(@NullableDecl Object obj, @NullableDecl V v2) {
            return this.f26638y.apply(vy.dd(obj, v2));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V remove(Object obj) {
            if (containsKey(obj)) {
                return this.f26637g.remove(obj);
            }
            return null;
        }

        @Override // com.google.common.collect.vy.AbstractC4543l
        Collection<V> zy() {
            return new o1t(this, this.f26637g, this.f26638y);
        }
    }

    /* JADX INFO: compiled from: Maps.java */
    static class ncyb<K, V> extends AbstractCollection<V> {

        /* JADX INFO: renamed from: k */
        @Weak
        final Map<K, V> f26639k;

        ncyb(Map<K, V> map) {
            this.f26639k = (Map) com.google.common.base.jk.a9(map);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            m16044k().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@NullableDecl Object obj) {
            return m16044k().containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return m16044k().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return vy.zsr0(m16044k().entrySet().iterator());
        }

        /* JADX INFO: renamed from: k */
        final Map<K, V> m16044k() {
            return this.f26639k;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            try {
                return super.remove(obj);
            } catch (UnsupportedOperationException unused) {
                for (Map.Entry<K, V> entry : m16044k().entrySet()) {
                    if (C4280z.m15455k(obj, entry.getValue())) {
                        m16044k().remove(entry.getKey());
                        return true;
                    }
                }
                return false;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) com.google.common.base.jk.a9(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet hashSetFn3e = g0ad.fn3e();
                for (Map.Entry<K, V> entry : m16044k().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        hashSetFn3e.add(entry.getKey());
                    }
                }
                return m16044k().keySet().removeAll(hashSetFn3e);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            try {
                return super.retainAll((Collection) com.google.common.base.jk.a9(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet hashSetFn3e = g0ad.fn3e();
                for (Map.Entry<K, V> entry : m16044k().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        hashSetFn3e.add(entry.getKey());
                    }
                }
                return m16044k().keySet().retainAll(hashSetFn3e);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return m16044k().size();
        }
    }

    /* JADX INFO: compiled from: Maps.java */
    @wlev.zy
    private static class ni7<K, V> extends AbstractC4510p<K, V> {

        /* JADX INFO: renamed from: k */
        private final NavigableMap<K, V> f26640k;

        /* JADX INFO: renamed from: n */
        private final Map<K, V> f26641n;

        /* JADX INFO: renamed from: q */
        private final com.google.common.base.a9<? super Map.Entry<K, V>> f26642q;

        /* JADX INFO: renamed from: com.google.common.collect.vy$ni7$k */
        /* JADX INFO: compiled from: Maps.java */
        class C4545k extends a9<K, V> {
            C4545k(NavigableMap navigableMap) {
                super(navigableMap);
            }

            @Override // com.google.common.collect.g0ad.ld6, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean removeAll(Collection<?> collection) {
                return zurt.m16052g(ni7.this.f26640k, ni7.this.f26642q, collection);
            }

            @Override // com.google.common.collect.g0ad.ld6, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> collection) {
                return zurt.f7l8(ni7.this.f26640k, ni7.this.f26642q, collection);
            }
        }

        ni7(NavigableMap<K, V> navigableMap, com.google.common.base.a9<? super Map.Entry<K, V>> a9Var) {
            this.f26640k = (NavigableMap) com.google.common.base.jk.a9(navigableMap);
            this.f26642q = a9Var;
            this.f26641n = new zurt(navigableMap, a9Var);
        }

        @Override // com.google.common.collect.vy.wvg, java.util.AbstractMap, java.util.Map
        public void clear() {
            this.f26641n.clear();
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
            return this.f26640k.comparator();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@NullableDecl Object obj) {
            return this.f26641n.containsKey(obj);
        }

        @Override // com.google.common.collect.AbstractC4510p, java.util.NavigableMap
        public NavigableMap<K, V> descendingMap() {
            return vy.o1t(this.f26640k.descendingMap(), this.f26642q);
        }

        @Override // com.google.common.collect.vy.wvg, java.util.AbstractMap, java.util.Map, java.util.SortedMap
        public Set<Map.Entry<K, V>> entrySet() {
            return this.f26641n.entrySet();
        }

        @Override // com.google.common.collect.AbstractC4510p, java.util.AbstractMap, java.util.Map
        @NullableDecl
        public V get(@NullableDecl Object obj) {
            return this.f26641n.get(obj);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> headMap(K k2, boolean z2) {
            return vy.o1t(this.f26640k.headMap(k2, z2), this.f26642q);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean isEmpty() {
            return !nsb.zy(this.f26640k.entrySet(), this.f26642q);
        }

        @Override // com.google.common.collect.vy.wvg
        /* JADX INFO: renamed from: k */
        Iterator<Map.Entry<K, V>> mo15684k() {
            return zwy.fu4(this.f26640k.entrySet().iterator(), this.f26642q);
        }

        @Override // com.google.common.collect.AbstractC4510p, java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            return new C4545k(this);
        }

        @Override // com.google.common.collect.AbstractC4510p, java.util.NavigableMap
        public Map.Entry<K, V> pollFirstEntry() {
            return (Map.Entry) nsb.d3(this.f26640k.entrySet(), this.f26642q);
        }

        @Override // com.google.common.collect.AbstractC4510p, java.util.NavigableMap
        public Map.Entry<K, V> pollLastEntry() {
            return (Map.Entry) nsb.d3(this.f26640k.descendingMap().entrySet(), this.f26642q);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V put(K k2, V v2) {
            return this.f26641n.put(k2, v2);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void putAll(Map<? extends K, ? extends V> map) {
            this.f26641n.putAll(map);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V remove(@NullableDecl Object obj) {
            return this.f26641n.remove(obj);
        }

        @Override // com.google.common.collect.vy.wvg, java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f26641n.size();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> subMap(K k2, boolean z2, K k3, boolean z3) {
            return vy.o1t(this.f26640k.subMap(k2, z2, k3, z3), this.f26642q);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> tailMap(K k2, boolean z2) {
            return vy.o1t(this.f26640k.tailMap(k2, z2), this.f26642q);
        }

        @Override // com.google.common.collect.AbstractC4510p
        Iterator<Map.Entry<K, V>> toq() {
            return zwy.fu4(this.f26640k.descendingMap().entrySet().iterator(), this.f26642q);
        }

        @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
        public Collection<V> values() {
            return new o1t(this, this.f26640k, this.f26642q);
        }
    }

    /* JADX INFO: compiled from: Maps.java */
    private static final class o1t<K, V> extends ncyb<K, V> {

        /* JADX INFO: renamed from: n */
        final com.google.common.base.a9<? super Map.Entry<K, V>> f26644n;

        /* JADX INFO: renamed from: q */
        final Map<K, V> f26645q;

        o1t(Map<K, V> map, Map<K, V> map2, com.google.common.base.a9<? super Map.Entry<K, V>> a9Var) {
            super(map);
            this.f26645q = map2;
            this.f26644n = a9Var;
        }

        @Override // com.google.common.collect.vy.ncyb, java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            Iterator<Map.Entry<K, V>> it = this.f26645q.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                if (this.f26644n.apply(next) && C4280z.m15455k(next.getValue(), obj)) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.collect.vy.ncyb, java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            Iterator<Map.Entry<K, V>> it = this.f26645q.entrySet().iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                if (this.f26644n.apply(next) && collection.contains(next.getValue())) {
                    it.remove();
                    z2 = true;
                }
            }
            return z2;
        }

        @Override // com.google.common.collect.vy.ncyb, java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            Iterator<Map.Entry<K, V>> it = this.f26645q.entrySet().iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                if (this.f26644n.apply(next) && !collection.contains(next.getValue())) {
                    it.remove();
                    z2 = true;
                }
            }
            return z2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray() {
            return wlev.t8r(iterator()).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) wlev.t8r(iterator()).toArray(tArr);
        }
    }

    /* JADX INFO: compiled from: Maps.java */
    @wlev.zy
    private static class oc<K, V1, V2> extends eqxt<K, V1, V2> implements NavigableMap<K, V2> {
        oc(NavigableMap<K, V1> navigableMap, InterfaceC4539i<? super K, ? super V1, V2> interfaceC4539i) {
            super(navigableMap, interfaceC4539i);
        }

        @NullableDecl
        /* JADX INFO: renamed from: y */
        private Map.Entry<K, V2> m16046y(@NullableDecl Map.Entry<K, V1> entry) {
            if (entry == null) {
                return null;
            }
            return vy.m16029v(this.f26616q, entry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V2> ceilingEntry(K k2) {
            return m16046y(toq().ceilingEntry(k2));
        }

        @Override // java.util.NavigableMap
        public K ceilingKey(K k2) {
            return toq().ceilingKey(k2);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
            return toq().descendingKeySet();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V2> descendingMap() {
            return vy.dr(toq().descendingMap(), this.f26616q);
        }

        @Override // com.google.common.collect.vy.eqxt, java.util.SortedMap
        /* JADX INFO: renamed from: f7l8, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, V2> tailMap(K k2) {
            return tailMap(k2, true);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V2> firstEntry() {
            return m16046y(toq().firstEntry());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V2> floorEntry(K k2) {
            return m16046y(toq().floorEntry(k2));
        }

        @Override // java.util.NavigableMap
        public K floorKey(K k2) {
            return toq().floorKey(k2);
        }

        @Override // com.google.common.collect.vy.eqxt, java.util.SortedMap
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, V2> subMap(K k2, K k3) {
            return subMap(k2, true, k3, false);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V2> higherEntry(K k2) {
            return m16046y(toq().higherEntry(k2));
        }

        @Override // java.util.NavigableMap
        public K higherKey(K k2) {
            return toq().higherKey(k2);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V2> lastEntry() {
            return m16046y(toq().lastEntry());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V2> lowerEntry(K k2) {
            return m16046y(toq().lowerEntry(k2));
        }

        @Override // java.util.NavigableMap
        public K lowerKey(K k2) {
            return toq().lowerKey(k2);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            return toq().navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V2> pollFirstEntry() {
            return m16046y(toq().pollFirstEntry());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V2> pollLastEntry() {
            return m16046y(toq().pollLastEntry());
        }

        @Override // com.google.common.collect.vy.eqxt, java.util.SortedMap
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, V2> headMap(K k2) {
            return headMap(k2, false);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.vy.eqxt
        /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, V1> toq() {
            return (NavigableMap) super.toq();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V2> headMap(K k2, boolean z2) {
            return vy.dr(toq().headMap(k2, z2), this.f26616q);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V2> subMap(K k2, boolean z2, K k3, boolean z3) {
            return vy.dr(toq().subMap(k2, z2, k3, z3), this.f26616q);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V2> tailMap(K k2, boolean z2) {
            return vy.dr(toq().tailMap(k2, z2), this.f26616q);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: com.google.common.collect.vy$p */
    /* JADX INFO: compiled from: Maps.java */
    static class C4546p<E> extends vq<E> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ NavigableSet f26646k;

        C4546p(NavigableSet navigableSet) {
            this.f26646k = navigableSet;
        }

        @Override // com.google.common.collect.AbstractC4572x, java.util.Collection, java.util.Queue
        public boolean add(E e2) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.AbstractC4572x, java.util.Collection
        public boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.vq, java.util.NavigableSet
        public NavigableSet<E> descendingSet() {
            return vy.a98o(super.descendingSet());
        }

        @Override // com.google.common.collect.g1, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<E> headSet(E e2) {
            return vy.zp(super.headSet(e2));
        }

        @Override // com.google.common.collect.g1, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<E> subSet(E e2, E e3) {
            return vy.zp(super.subSet(e2, e3));
        }

        @Override // com.google.common.collect.g1, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<E> tailSet(E e2) {
            return vy.zp(super.tailSet(e2));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.vq, com.google.common.collect.g1, com.google.common.collect.qo, com.google.common.collect.AbstractC4572x, com.google.common.collect.qkj8
        /* JADX INFO: renamed from: x2 */
        public NavigableSet<E> delegate() {
            return this.f26646k;
        }

        @Override // com.google.common.collect.vq, java.util.NavigableSet
        public NavigableSet<E> headSet(E e2, boolean z2) {
            return vy.a98o(super.headSet(e2, z2));
        }

        @Override // com.google.common.collect.vq, java.util.NavigableSet
        public NavigableSet<E> subSet(E e2, boolean z2, E e3, boolean z3) {
            return vy.a98o(super.subSet(e2, z2, e3, z3));
        }

        @Override // com.google.common.collect.vq, java.util.NavigableSet
        public NavigableSet<E> tailSet(E e2, boolean z2) {
            return vy.a98o(super.tailSet(e2, z2));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [K, V1, V2] */
    /* JADX INFO: renamed from: com.google.common.collect.vy$q */
    /* JADX INFO: compiled from: Maps.java */
    static class C4547q<K, V1, V2> implements com.google.common.base.t8r<Map.Entry<K, V1>, Map.Entry<K, V2>> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ InterfaceC4539i f26647k;

        C4547q(InterfaceC4539i interfaceC4539i) {
            this.f26647k = interfaceC4539i;
        }

        @Override // com.google.common.base.t8r
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V2> apply(Map.Entry<K, V1> entry) {
            return vy.m16029v(this.f26647k, entry);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [K, V1, V2] */
    /* JADX INFO: compiled from: Maps.java */
    static class qrj<K, V1, V2> implements InterfaceC4539i<K, V1, V2> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ com.google.common.base.t8r f26648k;

        qrj(com.google.common.base.t8r t8rVar) {
            this.f26648k = t8rVar;
        }

        @Override // com.google.common.collect.vy.InterfaceC4539i
        /* JADX INFO: renamed from: k */
        public V2 mo15947k(K k2, V1 v1) {
            return (V2) this.f26648k.apply(v1);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.vy$r */
    /* JADX INFO: compiled from: Maps.java */
    static class C4548r<K, V> extends lvui<K, V> implements Set<Map.Entry<K, V>> {
        C4548r(Set<Map.Entry<K, V>> set) {
            super(set);
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(@NullableDecl Object obj) {
            return g0ad.f7l8(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return g0ad.ld6(this);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.vy$t */
    /* JADX INFO: compiled from: Maps.java */
    static class C4550t<K, V> extends g0ad.ld6<K> {

        /* JADX INFO: renamed from: k */
        @Weak
        final Map<K, V> f26650k;

        C4550t(Map<K, V> map) {
            this.f26650k = (Map) com.google.common.base.jk.a9(map);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            toq().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return toq().containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return toq().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return vy.n5r1(toq().entrySet().iterator());
        }

        /* JADX INFO: renamed from: k */
        Map<K, V> toq() {
            return this.f26650k;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (!contains(obj)) {
                return false;
            }
            toq().remove(obj);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return toq().size();
        }
    }

    /* JADX INFO: compiled from: Maps.java */
    static abstract class t8r<K, V> extends g0ad.ld6<Map.Entry<K, V>> {
        t8r() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            mo15823k().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object objCh = vy.ch(mo15823k(), key);
            if (C4280z.m15455k(objCh, entry.getValue())) {
                return objCh != null || mo15823k().containsKey(key);
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return mo15823k().isEmpty();
        }

        /* JADX INFO: renamed from: k */
        abstract Map<K, V> mo15823k();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (contains(obj)) {
                return mo15823k().keySet().remove(((Map.Entry) obj).getKey());
            }
            return false;
        }

        @Override // com.google.common.collect.g0ad.ld6, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) com.google.common.base.jk.a9(collection));
            } catch (UnsupportedOperationException unused) {
                return g0ad.oc(this, collection.iterator());
            }
        }

        @Override // com.google.common.collect.g0ad.ld6, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            try {
                return super.retainAll((Collection) com.google.common.base.jk.a9(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet hashSetM15700z = g0ad.m15700z(collection.size());
                for (Object obj : collection) {
                    if (contains(obj)) {
                        hashSetM15700z.add(((Map.Entry) obj).getKey());
                    }
                }
                return mo15823k().keySet().retainAll(hashSetM15700z);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return mo15823k().size();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [K, V1, V2] */
    /* JADX INFO: compiled from: Maps.java */
    static class toq<K, V1, V2> implements com.google.common.base.t8r<Map.Entry<K, V1>, V2> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ InterfaceC4539i f26651k;

        toq(InterfaceC4539i interfaceC4539i) {
            this.f26651k = interfaceC4539i;
        }

        @Override // com.google.common.base.t8r
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public V2 apply(Map.Entry<K, V1> entry) {
            return (V2) this.f26651k.mo15947k(entry.getKey(), entry.getValue());
        }
    }

    /* JADX INFO: compiled from: Maps.java */
    static abstract class wvg<K, V> extends AbstractMap<K, V> {

        /* JADX INFO: renamed from: com.google.common.collect.vy$wvg$k */
        /* JADX INFO: compiled from: Maps.java */
        class C4551k extends t8r<K, V> {
            C4551k() {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, V>> iterator() {
                return wvg.this.mo15684k();
            }

            @Override // com.google.common.collect.vy.t8r
            /* JADX INFO: renamed from: k */
            Map<K, V> mo15823k() {
                return wvg.this;
            }
        }

        wvg() {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            zwy.m16135y(mo15684k());
        }

        @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
        public Set<Map.Entry<K, V>> entrySet() {
            return new C4551k();
        }

        /* JADX INFO: renamed from: k */
        abstract Iterator<Map.Entry<K, V>> mo15684k();

        @Override // java.util.AbstractMap, java.util.Map
        public abstract int size();
    }

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    /* JADX INFO: compiled from: Maps.java */
    static class x2<K, V> extends ab<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Iterator f26653k;

        x2(Iterator it) {
            this.f26653k = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f26653k.hasNext();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            return vy.qo((Map.Entry) this.f26653k.next());
        }
    }

    /* JADX INFO: compiled from: Maps.java */
    static class x9kr<V> implements ga.InterfaceC4387k<V> {

        /* JADX INFO: renamed from: k */
        @NullableDecl
        private final V f26654k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @NullableDecl
        private final V f68234toq;

        private x9kr(@NullableDecl V v2, @NullableDecl V v3) {
            this.f26654k = v2;
            this.f68234toq = v3;
        }

        static <V> ga.InterfaceC4387k<V> zy(@NullableDecl V v2, @NullableDecl V v3) {
            return new x9kr(v2, v3);
        }

        @Override // com.google.common.collect.ga.InterfaceC4387k
        public boolean equals(@NullableDecl Object obj) {
            if (!(obj instanceof ga.InterfaceC4387k)) {
                return false;
            }
            ga.InterfaceC4387k interfaceC4387k = (ga.InterfaceC4387k) obj;
            return C4280z.m15455k(this.f26654k, interfaceC4387k.mo15709k()) && C4280z.m15455k(this.f68234toq, interfaceC4387k.toq());
        }

        @Override // com.google.common.collect.ga.InterfaceC4387k
        public int hashCode() {
            return C4280z.toq(this.f26654k, this.f68234toq);
        }

        @Override // com.google.common.collect.ga.InterfaceC4387k
        /* JADX INFO: renamed from: k */
        public V mo15709k() {
            return this.f26654k;
        }

        public String toString() {
            return "(" + this.f26654k + ", " + this.f68234toq + ")";
        }

        @Override // com.google.common.collect.ga.InterfaceC4387k
        public V toq() {
            return this.f68234toq;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.vy$z */
    /* JADX INFO: compiled from: Maps.java */
    private static class C4553z<K, V> extends n7h<K, V> {

        /* JADX INFO: renamed from: s */
        final com.google.common.base.a9<? super K> f26656s;

        C4553z(Map<K, V> map, com.google.common.base.a9<? super K> a9Var, com.google.common.base.a9<? super Map.Entry<K, V>> a9Var2) {
            super(map, a9Var2);
            this.f26656s = a9Var;
        }

        @Override // com.google.common.collect.vy.n7h, java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return this.f26637g.containsKey(obj) && this.f26656s.apply(obj);
        }

        @Override // com.google.common.collect.vy.AbstractC4543l
        /* JADX INFO: renamed from: k */
        protected Set<Map.Entry<K, V>> mo15821k() {
            return g0ad.m15697s(this.f26637g.entrySet(), this.f26638y);
        }

        @Override // com.google.common.collect.vy.AbstractC4543l
        /* JADX INFO: renamed from: toq */
        Set<K> mo15887y() {
            return g0ad.m15697s(this.f26637g.keySet(), this.f26656s);
        }
    }

    /* JADX INFO: compiled from: Maps.java */
    static class zurt<K, V> extends n7h<K, V> {

        /* JADX INFO: renamed from: s */
        final Set<Map.Entry<K, V>> f26657s;

        /* JADX INFO: renamed from: com.google.common.collect.vy$zurt$k */
        /* JADX INFO: compiled from: Maps.java */
        private class C4554k extends qo<Map.Entry<K, V>> {

            /* JADX INFO: renamed from: com.google.common.collect.vy$zurt$k$k */
            /* JADX INFO: compiled from: Maps.java */
            class k extends pnt2<Map.Entry<K, V>, Map.Entry<K, V>> {

                /* JADX INFO: renamed from: com.google.common.collect.vy$zurt$k$k$k, reason: collision with other inner class name */
                /* JADX INFO: compiled from: Maps.java */
                class C7999k extends AbstractC4531v<K, V> {

                    /* JADX INFO: renamed from: k */
                    final /* synthetic */ Map.Entry f26660k;

                    C7999k(Map.Entry entry) {
                        this.f26660k = entry;
                    }

                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // com.google.common.collect.AbstractC4531v, com.google.common.collect.qkj8
                    /* JADX INFO: renamed from: ld6 */
                    public Map.Entry<K, V> delegate() {
                        return this.f26660k;
                    }

                    @Override // com.google.common.collect.AbstractC4531v, java.util.Map.Entry
                    public V setValue(V v2) {
                        com.google.common.base.jk.m15383q(zurt.this.m16043q(getKey(), v2));
                        return (V) super.setValue(v2);
                    }
                }

                k(Iterator it) {
                    super(it);
                }

                /* JADX INFO: Access modifiers changed from: package-private */
                @Override // com.google.common.collect.pnt2
                /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
                public Map.Entry<K, V> mo15580k(Map.Entry<K, V> entry) {
                    return new C7999k(entry);
                }
            }

            private C4554k() {
            }

            @Override // com.google.common.collect.AbstractC4572x, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, V>> iterator() {
                return new k(zurt.this.f26657s.iterator());
            }

            /* synthetic */ C4554k(zurt zurtVar, C4544n c4544n) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.qo, com.google.common.collect.AbstractC4572x, com.google.common.collect.qkj8
            public Set<Map.Entry<K, V>> delegate() {
                return zurt.this.f26657s;
            }
        }

        /* JADX INFO: compiled from: Maps.java */
        class toq extends C4550t<K, V> {
            toq() {
                super(zurt.this);
            }

            @Override // com.google.common.collect.vy.C4550t, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                if (!zurt.this.containsKey(obj)) {
                    return false;
                }
                zurt.this.f26637g.remove(obj);
                return true;
            }

            @Override // com.google.common.collect.g0ad.ld6, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean removeAll(Collection<?> collection) {
                zurt zurtVar = zurt.this;
                return zurt.m16052g(zurtVar.f26637g, zurtVar.f26638y, collection);
            }

            @Override // com.google.common.collect.g0ad.ld6, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> collection) {
                zurt zurtVar = zurt.this;
                return zurt.f7l8(zurtVar.f26637g, zurtVar.f26638y, collection);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public Object[] toArray() {
                return wlev.t8r(iterator()).toArray();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public <T> T[] toArray(T[] tArr) {
                return (T[]) wlev.t8r(iterator()).toArray(tArr);
            }
        }

        zurt(Map<K, V> map, com.google.common.base.a9<? super Map.Entry<K, V>> a9Var) {
            super(map, a9Var);
            this.f26657s = g0ad.m15697s(map.entrySet(), this.f26638y);
        }

        static <K, V> boolean f7l8(Map<K, V> map, com.google.common.base.a9<? super Map.Entry<K, V>> a9Var, Collection<?> collection) {
            Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                if (a9Var.apply(next) && !collection.contains(next.getKey())) {
                    it.remove();
                    z2 = true;
                }
            }
            return z2;
        }

        /* JADX INFO: renamed from: g */
        static <K, V> boolean m16052g(Map<K, V> map, com.google.common.base.a9<? super Map.Entry<K, V>> a9Var, Collection<?> collection) {
            Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                if (a9Var.apply(next) && collection.contains(next.getKey())) {
                    it.remove();
                    z2 = true;
                }
            }
            return z2;
        }

        @Override // com.google.common.collect.vy.AbstractC4543l
        /* JADX INFO: renamed from: k */
        protected Set<Map.Entry<K, V>> mo15821k() {
            return new C4554k(this, null);
        }

        @Override // com.google.common.collect.vy.AbstractC4543l
        /* JADX INFO: renamed from: toq */
        Set<K> mo15887y() {
            return new toq();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [K, V2] */
    /* JADX INFO: compiled from: Maps.java */
    static class zy<K, V2> extends com.google.common.collect.f7l8<K, V2> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Map.Entry f26663k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ InterfaceC4539i f26664q;

        zy(Map.Entry entry, InterfaceC4539i interfaceC4539i) {
            this.f26663k = entry;
            this.f26664q = interfaceC4539i;
        }

        @Override // com.google.common.collect.f7l8, java.util.Map.Entry
        public K getKey() {
            return (K) this.f26663k.getKey();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.f7l8, java.util.Map.Entry
        public V2 getValue() {
            return (V2) this.f26664q.mo15947k(this.f26663k.getKey(), this.f26663k.getValue());
        }
    }

    private vy() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static <E> Set<E> m16008a(Set<E> set) {
        return new C4552y(set);
    }

    private static <K, V> SortedMap<K, V> a9(fu4<K, V> fu4Var, com.google.common.base.a9<? super Map.Entry<K, V>> a9Var) {
        return new fu4(fu4Var.ld6(), com.google.common.base.fti.m15348q(fu4Var.f26638y, a9Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @wlev.zy
    public static <E> NavigableSet<E> a98o(NavigableSet<E> navigableSet) {
        return new C4546p(navigableSet);
    }

    /* JADX INFO: renamed from: b */
    static <E> Comparator<? super E> m16009b(@NullableDecl Comparator<? super E> comparator) {
        return comparator != null ? comparator : kx3.natural();
    }

    static <K, V> void bf2(Map<K, V> map, Map<? extends K, ? extends V> map2) {
        for (Map.Entry<? extends K, ? extends V> entry : map2.entrySet()) {
            map.put(entry.getKey(), entry.getValue());
        }
    }

    public static <K, V> zkd<K, V> bo(Iterable<K> iterable, com.google.common.base.t8r<? super K, V> t8rVar) {
        return y2(iterable.iterator(), t8rVar);
    }

    /* JADX INFO: renamed from: c */
    public static <K, V> ConcurrentMap<K, V> m16010c() {
        return new ConcurrentHashMap();
    }

    static String c8jq(Map<?, ?> map) {
        StringBuilder sbF7l8 = com.google.common.collect.mcp.f7l8(map.size());
        sbF7l8.append('{');
        boolean z2 = true;
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            if (!z2) {
                sbF7l8.append(", ");
            }
            z2 = false;
            sbF7l8.append(entry.getKey());
            sbF7l8.append('=');
            sbF7l8.append(entry.getValue());
        }
        sbF7l8.append('}');
        return sbF7l8.toString();
    }

    static boolean cdj(Map<?, ?> map, @NullableDecl Object obj) {
        return zwy.cdj(n5r1(map.entrySet().iterator()), obj);
    }

    static <V> V ch(Map<?, V> map, @NullableDecl Object obj) {
        com.google.common.base.jk.a9(map);
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    @wlev.zy
    /* JADX INFO: renamed from: d */
    public static <K, V1, V2> NavigableMap<K, V2> m16011d(NavigableMap<K, V1> navigableMap, com.google.common.base.t8r<? super V1, V2> t8rVar) {
        return dr(navigableMap, m16026s(t8rVar));
    }

    @wlev.zy
    public static <K, V> NavigableMap<K, V> d2ok(NavigableMap<K, V> navigableMap, com.google.common.base.a9<? super V> a9Var) {
        return o1t(navigableMap, i9jn(a9Var));
    }

    public static <K, V> SortedMap<K, V> d3(SortedMap<K, V> sortedMap, com.google.common.base.a9<? super K> a9Var) {
        return wvg(sortedMap, m16013f(a9Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <K, V> Map<K, V> d8wk(Map<K, ? extends V> map) {
        return map instanceof SortedMap ? Collections.unmodifiableSortedMap((SortedMap) map) : Collections.unmodifiableMap(map);
    }

    @wlev.toq(serializable = true)
    public static <K, V> Map.Entry<K, V> dd(@NullableDecl K k2, @NullableDecl V v2) {
        return new yqrt(k2, v2);
    }

    @wlev.zy
    public static <K, V1, V2> NavigableMap<K, V2> dr(NavigableMap<K, V1> navigableMap, InterfaceC4539i<? super K, ? super V1, V2> interfaceC4539i) {
        return new oc(navigableMap, interfaceC4539i);
    }

    /* JADX INFO: renamed from: e */
    public static <K, V> HashMap<K, V> m16012e(Map<? extends K, ? extends V> map) {
        return new HashMap<>(map);
    }

    public static <K extends Comparable, V> TreeMap<K, V> ek5k() {
        return new TreeMap<>();
    }

    public static <K, V> Map<K, V> eqxt(Map<K, V> map, com.google.common.base.a9<? super V> a9Var) {
        return m16032z(map, i9jn(a9Var));
    }

    /* JADX INFO: renamed from: f */
    static <K> com.google.common.base.a9<Map.Entry<K, ?>> m16013f(com.google.common.base.a9<? super K> a9Var) {
        return com.google.common.base.fti.m15350y(a9Var, m16019l());
    }

    static <K, V1, V2> com.google.common.base.t8r<Map.Entry<K, V1>, Map.Entry<K, V2>> f7l8(InterfaceC4539i<? super K, ? super V1, V2> interfaceC4539i) {
        com.google.common.base.jk.a9(interfaceC4539i);
        return new C4547q(interfaceC4539i);
    }

    public static <K, V> kbj<K, V> fn3e(SortedMap<K, ? extends V> sortedMap, Map<? extends K, ? extends V> map) {
        com.google.common.base.jk.a9(sortedMap);
        com.google.common.base.jk.a9(map);
        Comparator comparatorM16009b = m16009b(sortedMap.comparator());
        TreeMap treeMapYz = yz(comparatorM16009b);
        TreeMap treeMapYz2 = yz(comparatorM16009b);
        treeMapYz2.putAll(map);
        TreeMap treeMapYz3 = yz(comparatorM16009b);
        TreeMap treeMapYz4 = yz(comparatorM16009b);
        zurt(sortedMap, map, com.google.common.base.x2.equals(), treeMapYz, treeMapYz2, treeMapYz3, treeMapYz4);
        return new gvn7(treeMapYz, treeMapYz2, treeMapYz3, treeMapYz4);
    }

    public static <K, V> com.google.common.collect.ni7<K, V> fnq8(com.google.common.collect.ni7<? extends K, ? extends V> ni7Var) {
        return new d2ok(ni7Var, null);
    }

    public static <K, V> com.google.common.collect.ni7<K, V> fti(com.google.common.collect.ni7<K, V> ni7Var, com.google.common.base.a9<? super K> a9Var) {
        com.google.common.base.jk.a9(a9Var);
        return fu4(ni7Var, m16013f(a9Var));
    }

    public static <K, V> com.google.common.collect.ni7<K, V> fu4(com.google.common.collect.ni7<K, V> ni7Var, com.google.common.base.a9<? super Map.Entry<K, V>> a9Var) {
        com.google.common.base.jk.a9(ni7Var);
        com.google.common.base.jk.a9(a9Var);
        return ni7Var instanceof fn3e ? m16027t((fn3e) ni7Var, a9Var) : new fn3e(ni7Var, a9Var);
    }

    /* JADX INFO: renamed from: g */
    public static <A, B> AbstractC4272s<A, B> m16014g(com.google.common.collect.ni7<A, B> ni7Var) {
        return new C4538h(ni7Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @wlev.zy
    public static <K, V> NavigableMap<K, V> g1(NavigableMap<K, ? extends V> navigableMap) {
        com.google.common.base.jk.a9(navigableMap);
        return navigableMap instanceof dd ? navigableMap : new dd(navigableMap);
    }

    static <V> com.google.common.base.t8r<Map.Entry<?, V>, V> gbni() {
        return ki.VALUE;
    }

    @wlev.zy
    public static <K, V> NavigableMap<K, V> gvn7(NavigableMap<K, V> navigableMap, com.google.common.base.a9<? super K> a9Var) {
        return o1t(navigableMap, m16013f(a9Var));
    }

    public static <K, V1, V2> Map<K, V2> gyi(Map<K, V1> map, InterfaceC4539i<? super K, ? super V1, V2> interfaceC4539i) {
        return new d3(map, interfaceC4539i);
    }

    /* JADX INFO: renamed from: h */
    static <K, V> boolean m16015h(Collection<Map.Entry<K, V>> collection, Object obj) {
        if (obj instanceof Map.Entry) {
            return collection.contains(qo((Map.Entry) obj));
        }
        return false;
    }

    public static <K, V> IdentityHashMap<K, V> hb() {
        return new IdentityHashMap<>();
    }

    @NullableDecl
    static <K> K hyr(@NullableDecl Map.Entry<K, ?> entry) {
        if (entry == null) {
            return null;
        }
        return entry.getKey();
    }

    /* JADX INFO: renamed from: i */
    public static <K, V> ga<K, V> m16016i(Map<? extends K, ? extends V> map, Map<? extends K, ? extends V> map2, com.google.common.base.x2<? super V> x2Var) {
        com.google.common.base.jk.a9(x2Var);
        LinkedHashMap linkedHashMapM16017j = m16017j();
        LinkedHashMap linkedHashMap = new LinkedHashMap(map2);
        LinkedHashMap linkedHashMapM16017j2 = m16017j();
        LinkedHashMap linkedHashMapM16017j3 = m16017j();
        zurt(map, map2, x2Var, linkedHashMapM16017j, linkedHashMap, linkedHashMapM16017j2, linkedHashMapM16017j3);
        return new mcp(linkedHashMapM16017j, linkedHashMap, linkedHashMapM16017j2, linkedHashMapM16017j3);
    }

    static <K, V> boolean i1(Collection<Map.Entry<K, V>> collection, Object obj) {
        if (obj instanceof Map.Entry) {
            return collection.remove(qo((Map.Entry) obj));
        }
        return false;
    }

    static <V> com.google.common.base.a9<Map.Entry<?, V>> i9jn(com.google.common.base.a9<? super V> a9Var) {
        return com.google.common.base.fti.m15350y(a9Var, gbni());
    }

    public static <K, V1, V2> Map<K, V2> ikck(Map<K, V1> map, com.google.common.base.t8r<? super V1, V2> t8rVar) {
        return gyi(map, m16026s(t8rVar));
    }

    /* JADX INFO: renamed from: j */
    public static <K, V> LinkedHashMap<K, V> m16017j() {
        return new LinkedHashMap<>();
    }

    @wlev.zy
    private static <K, V> NavigableMap<K, V> jk(ni7<K, V> ni7Var, com.google.common.base.a9<? super Map.Entry<K, V>> a9Var) {
        return new ni7(((ni7) ni7Var).f26640k, com.google.common.base.fti.m15348q(((ni7) ni7Var).f26642q, a9Var));
    }

    public static <K, V> Map<K, V> jp0y(Map<K, V> map, com.google.common.base.a9<? super K> a9Var) {
        com.google.common.base.jk.a9(a9Var);
        com.google.common.base.a9 a9VarM16013f = m16013f(a9Var);
        return map instanceof n7h ? mcp((n7h) map, a9VarM16013f) : new C4553z((Map) com.google.common.base.jk.a9(map), a9Var, a9VarM16013f);
    }

    static boolean ki(Map<?, ?> map, @NullableDecl Object obj) {
        return zwy.cdj(zsr0(map.entrySet().iterator()), obj);
    }

    static int kja0(int i2) {
        if (i2 < 3) {
            C4524t.toq(i2, "expectedSize");
            return i2 + 1;
        }
        if (i2 < 1073741824) {
            return (int) ((i2 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: l */
    static <K> com.google.common.base.t8r<Map.Entry<K, ?>, K> m16019l() {
        return ki.KEY;
    }

    @wlev.zy
    public static <K, V> NavigableMap<K, V> ld6(NavigableSet<K> navigableSet, com.google.common.base.t8r<? super K, V> t8rVar) {
        return new jk(navigableSet, t8rVar);
    }

    public static <K extends Enum<K>, V> EnumMap<K, V> lrht(Class<K> cls) {
        return new EnumMap<>((Class) com.google.common.base.jk.a9(cls));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC7731k
    @wlev.zy
    public static <K extends Comparable<? super K>, V> NavigableMap<K, V> lv5(NavigableMap<K, V> navigableMap, ps<K> psVar) {
        if (navigableMap.comparator() != null && navigableMap.comparator() != kx3.natural() && psVar.hasLowerBound() && psVar.hasUpperBound()) {
            com.google.common.base.jk.m15380n(navigableMap.comparator().compare(psVar.lowerEndpoint(), psVar.upperEndpoint()) <= 0, "map is using a custom comparator which is inconsistent with the natural ordering.");
        }
        if (psVar.hasLowerBound() && psVar.hasUpperBound()) {
            Comparable comparableLowerEndpoint = psVar.lowerEndpoint();
            com.google.common.collect.fu4 fu4VarLowerBoundType = psVar.lowerBoundType();
            com.google.common.collect.fu4 fu4Var = com.google.common.collect.fu4.CLOSED;
            return navigableMap.subMap(comparableLowerEndpoint, fu4VarLowerBoundType == fu4Var, psVar.upperEndpoint(), psVar.upperBoundType() == fu4Var);
        }
        if (psVar.hasLowerBound()) {
            return navigableMap.tailMap(psVar.lowerEndpoint(), psVar.lowerBoundType() == com.google.common.collect.fu4.CLOSED);
        }
        if (psVar.hasUpperBound()) {
            return navigableMap.headMap(psVar.upperEndpoint(), psVar.upperBoundType() == com.google.common.collect.fu4.CLOSED);
        }
        return (NavigableMap) com.google.common.base.jk.a9(navigableMap);
    }

    public static <K, V> SortedMap<K, V> lvui(SortedMap<K, V> sortedMap, com.google.common.base.a9<? super V> a9Var) {
        return wvg(sortedMap, i9jn(a9Var));
    }

    /* JADX INFO: renamed from: m */
    public static <K, V> LinkedHashMap<K, V> m16020m(int i2) {
        return new LinkedHashMap<>(kja0(i2));
    }

    private static <K, V> Map<K, V> mcp(n7h<K, V> n7hVar, com.google.common.base.a9<? super Map.Entry<K, V>> a9Var) {
        return new zurt(n7hVar.f26637g, com.google.common.base.fti.m15348q(n7hVar.f26638y, a9Var));
    }

    public static <K, V1, V2> SortedMap<K, V2> mu(SortedMap<K, V1> sortedMap, com.google.common.base.t8r<? super V1, V2> t8rVar) {
        return xwq3(sortedMap, m16026s(t8rVar));
    }

    static <K, V> Iterator<K> n5r1(Iterator<Map.Entry<K, V>> it) {
        return new C4544n(it);
    }

    static <K, V1, V2> com.google.common.base.t8r<V1, V2> n7h(InterfaceC4539i<? super K, V1, V2> interfaceC4539i, K k2) {
        com.google.common.base.jk.a9(interfaceC4539i);
        return new C4540k(interfaceC4539i, k2);
    }

    static <E> zkd<E, Integer> ncyb(Collection<E> collection) {
        zkd.toq toqVar = new zkd.toq(collection.size());
        Iterator<E> it = collection.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            toqVar.mo15592q(it.next(), Integer.valueOf(i2));
            i2++;
        }
        return toqVar.mo15589k();
    }

    static boolean ni7(Map<?, ?> map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    static <V> V nmn5(Map<?, V> map, Object obj) {
        com.google.common.base.jk.a9(map);
        try {
            return map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    public static <K, V> HashMap<K, V> nn86(int i2) {
        return new HashMap<>(kja0(i2));
    }

    /* JADX INFO: renamed from: o */
    public static <K, V> LinkedHashMap<K, V> m16022o(Map<? extends K, ? extends V> map) {
        return new LinkedHashMap<>(map);
    }

    @wlev.zy
    public static <K, V> NavigableMap<K, V> o1t(NavigableMap<K, V> navigableMap, com.google.common.base.a9<? super Map.Entry<K, V>> a9Var) {
        com.google.common.base.jk.a9(a9Var);
        return navigableMap instanceof ni7 ? jk((ni7) navigableMap, a9Var) : new ni7((NavigableMap) com.google.common.base.jk.a9(navigableMap), a9Var);
    }

    public static <K, V> com.google.common.collect.ni7<K, V> oc(com.google.common.collect.ni7<K, V> ni7Var, com.google.common.base.a9<? super V> a9Var) {
        return fu4(ni7Var, i9jn(a9Var));
    }

    /* JADX INFO: renamed from: p */
    public static <K, V> Map<K, V> m16023p(Set<K> set, com.google.common.base.t8r<? super K, V> t8rVar) {
        return new kja0(set, t8rVar);
    }

    @NullableDecl
    static <V> V py(@NullableDecl Map.Entry<?, V> entry) {
        if (entry == null) {
            return null;
        }
        return entry.getValue();
    }

    @CanIgnoreReturnValue
    public static <K, V> zkd<K, V> qkj8(Iterator<V> it, com.google.common.base.t8r<? super V, K> t8rVar) {
        com.google.common.base.jk.a9(t8rVar);
        zkd.toq toqVarBuilder = zkd.builder();
        while (it.hasNext()) {
            V next = it.next();
            toqVarBuilder.mo15592q(t8rVar.apply(next), next);
        }
        try {
            return toqVarBuilder.mo15589k();
        } catch (IllegalArgumentException e2) {
            throw new IllegalArgumentException(e2.getMessage() + ". To index multiple values under a key, use Multimaps.index.");
        }
    }

    static <K, V> Map.Entry<K, V> qo(Map.Entry<? extends K, ? extends V> entry) {
        com.google.common.base.jk.a9(entry);
        return new ld6(entry);
    }

    static <K, V> Iterator<Map.Entry<K, V>> qrj(Set<K> set, com.google.common.base.t8r<? super K, V> t8rVar) {
        return new f7l8(set.iterator(), t8rVar);
    }

    @wlev.zy
    /* JADX INFO: renamed from: r */
    public static zkd<String, String> m16025r(Properties properties) {
        zkd.toq toqVarBuilder = zkd.builder();
        Enumeration<?> enumerationPropertyNames = properties.propertyNames();
        while (enumerationPropertyNames.hasMoreElements()) {
            String str = (String) enumerationPropertyNames.nextElement();
            toqVarBuilder.mo15592q(str, properties.getProperty(str));
        }
        return toqVarBuilder.mo15589k();
    }

    /* JADX INFO: renamed from: s */
    static <K, V1, V2> InterfaceC4539i<K, V1, V2> m16026s(com.google.common.base.t8r<? super V1, V2> t8rVar) {
        com.google.common.base.jk.a9(t8rVar);
        return new qrj(t8rVar);
    }

    /* JADX INFO: renamed from: t */
    private static <K, V> com.google.common.collect.ni7<K, V> m16027t(fn3e<K, V> fn3eVar, com.google.common.base.a9<? super Map.Entry<K, V>> a9Var) {
        return new fn3e(fn3eVar.m16036p(), com.google.common.base.fti.m15348q(fn3eVar.f26638y, a9Var));
    }

    public static <K, V> com.google.common.collect.ni7<K, V> t8iq(com.google.common.collect.ni7<K, V> ni7Var) {
        return exv8.f7l8(ni7Var, null);
    }

    public static <K, V> ga<K, V> t8r(Map<? extends K, ? extends V> map, Map<? extends K, ? extends V> map2) {
        return map instanceof SortedMap ? fn3e((SortedMap) map, map2) : m16016i(map, map2, com.google.common.base.x2.equals());
    }

    static <K, V> ab<Map.Entry<K, V>> tfm(Iterator<Map.Entry<K, V>> it) {
        return new x2(it);
    }

    @wlev.zy
    /* JADX INFO: renamed from: u */
    public static <K, V> NavigableMap<K, V> m16028u(NavigableMap<K, V> navigableMap) {
        return exv8.kja0(navigableMap);
    }

    public static <K extends Enum<K>, V> EnumMap<K, V> uv6(Map<K, ? extends V> map) {
        return new EnumMap<>(map);
    }

    /* JADX INFO: renamed from: v */
    static <V2, K, V1> Map.Entry<K, V2> m16029v(InterfaceC4539i<? super K, ? super V1, V2> interfaceC4539i, Map.Entry<K, V1> entry) {
        com.google.common.base.jk.a9(interfaceC4539i);
        com.google.common.base.jk.a9(entry);
        return new zy(entry, interfaceC4539i);
    }

    @CanIgnoreReturnValue
    public static <K, V> zkd<K, V> vq(Iterable<V> iterable, com.google.common.base.t8r<? super V, K> t8rVar) {
        return qkj8(iterable.iterator(), t8rVar);
    }

    public static <K, V> HashMap<K, V> vyq() {
        return new HashMap<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NullableDecl
    public static <K, V> Map.Entry<K, V> was(@NullableDecl Map.Entry<K, ? extends V> entry) {
        if (entry == null) {
            return null;
        }
        return qo(entry);
    }

    static <K, V> Set<Map.Entry<K, V>> wo(Set<Map.Entry<K, V>> set) {
        return new C4548r(Collections.unmodifiableSet(set));
    }

    public static <K, V> SortedMap<K, V> wvg(SortedMap<K, V> sortedMap, com.google.common.base.a9<? super Map.Entry<K, V>> a9Var) {
        com.google.common.base.jk.a9(a9Var);
        return sortedMap instanceof fu4 ? a9((fu4) sortedMap, a9Var) : new fu4((SortedMap) com.google.common.base.jk.a9(sortedMap), a9Var);
    }

    /* JADX INFO: renamed from: x */
    static boolean m16030x(Map<?, ?> map, Object obj) {
        com.google.common.base.jk.a9(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static <K, V> SortedMap<K, V> x2(SortedSet<K> sortedSet, com.google.common.base.t8r<? super K, V> t8rVar) {
        return new fti(sortedSet, t8rVar);
    }

    @wlev.toq(serializable = true)
    public static <K extends Enum<K>, V> zkd<K, V> x9kr(Map<K, ? extends V> map) {
        if (map instanceof kcsr) {
            return (kcsr) map;
        }
        Iterator<Map.Entry<K, ? extends V>> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return zkd.of();
        }
        Map.Entry<K, ? extends V> next = it.next();
        K key = next.getKey();
        V value = next.getValue();
        C4524t.m15983k(key, value);
        EnumMap enumMap = new EnumMap(key.getDeclaringClass());
        enumMap.put((Enum) key, (Object) value);
        while (it.hasNext()) {
            Map.Entry<K, ? extends V> next2 = it.next();
            K key2 = next2.getKey();
            V value2 = next2.getValue();
            C4524t.m15983k(key2, value2);
            enumMap.put((Enum) key2, (Object) value2);
        }
        return kcsr.asImmutable(enumMap);
    }

    public static <K, V1, V2> SortedMap<K, V2> xwq3(SortedMap<K, V1> sortedMap, InterfaceC4539i<? super K, ? super V1, V2> interfaceC4539i) {
        return new eqxt(sortedMap, interfaceC4539i);
    }

    /* JADX INFO: renamed from: y */
    static <K, V1, V2> com.google.common.base.t8r<Map.Entry<K, V1>, V2> m16031y(InterfaceC4539i<? super K, ? super V1, V2> interfaceC4539i) {
        com.google.common.base.jk.a9(interfaceC4539i);
        return new toq(interfaceC4539i);
    }

    public static <K, V> zkd<K, V> y2(Iterator<K> it, com.google.common.base.t8r<? super K, V> t8rVar) {
        com.google.common.base.jk.a9(t8rVar);
        LinkedHashMap linkedHashMapM16017j = m16017j();
        while (it.hasNext()) {
            K next = it.next();
            linkedHashMapM16017j.put(next, t8rVar.apply(next));
        }
        return zkd.copyOf((Map) linkedHashMapM16017j);
    }

    public static <K, V> TreeMap<K, V> y9n(SortedMap<K, ? extends V> sortedMap) {
        return new TreeMap<>((SortedMap) sortedMap);
    }

    public static <C, K extends C, V> TreeMap<K, V> yz(@NullableDecl Comparator<C> comparator) {
        return new TreeMap<>(comparator);
    }

    /* JADX INFO: renamed from: z */
    public static <K, V> Map<K, V> m16032z(Map<K, V> map, com.google.common.base.a9<? super Map.Entry<K, V>> a9Var) {
        com.google.common.base.jk.a9(a9Var);
        return map instanceof n7h ? mcp((n7h) map, a9Var) : new zurt((Map) com.google.common.base.jk.a9(map), a9Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> SortedSet<E> zp(SortedSet<E> sortedSet) {
        return new C4549s(sortedSet);
    }

    static <K, V> Iterator<V> zsr0(Iterator<Map.Entry<K, V>> it) {
        return new C4537g(it);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <K, V> void zurt(Map<? extends K, ? extends V> map, Map<? extends K, ? extends V> map2, com.google.common.base.x2<? super V> x2Var, Map<K, V> map3, Map<K, V> map4, Map<K, V> map5, Map<K, ga.InterfaceC4387k<V>> map6) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            K key = entry.getKey();
            V value = entry.getValue();
            if (map2.containsKey(key)) {
                V vRemove = map4.remove(key);
                if (x2Var.equivalent(value, vRemove)) {
                    map5.put(key, value);
                } else {
                    map6.put(key, x9kr.zy(value, vRemove));
                }
            } else {
                map3.put(key, value);
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: com.google.common.collect.vy$y */
    /* JADX INFO: compiled from: Maps.java */
    static class C4552y<E> extends qo<E> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Set f26655k;

        C4552y(Set set) {
            this.f26655k = set;
        }

        @Override // com.google.common.collect.AbstractC4572x, java.util.Collection, java.util.Queue
        public boolean add(E e2) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.AbstractC4572x, java.util.Collection
        public boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.qo, com.google.common.collect.AbstractC4572x, com.google.common.collect.qkj8
        public Set<E> delegate() {
            return this.f26655k;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: com.google.common.collect.vy$s */
    /* JADX INFO: compiled from: Maps.java */
    static class C4549s<E> extends g1<E> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ SortedSet f26649k;

        C4549s(SortedSet sortedSet) {
            this.f26649k = sortedSet;
        }

        @Override // com.google.common.collect.AbstractC4572x, java.util.Collection, java.util.Queue
        public boolean add(E e2) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.AbstractC4572x, java.util.Collection
        public boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.g1, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<E> headSet(E e2) {
            return vy.zp(super.headSet(e2));
        }

        @Override // com.google.common.collect.g1, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<E> subSet(E e2, E e3) {
            return vy.zp(super.subSet(e2, e3));
        }

        @Override // com.google.common.collect.g1, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<E> tailSet(E e2) {
            return vy.zp(super.tailSet(e2));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.g1, com.google.common.collect.qo, com.google.common.collect.AbstractC4572x, com.google.common.collect.qkj8
        public SortedSet<E> delegate() {
            return this.f26649k;
        }
    }
}
