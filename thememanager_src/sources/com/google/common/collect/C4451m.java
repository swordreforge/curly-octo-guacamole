package com.google.common.collect;

import com.google.common.collect.m58i;
import com.google.common.collect.o05;
import com.google.common.collect.oki;
import com.google.common.collect.vy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: renamed from: com.google.common.collect.m */
/* JADX INFO: compiled from: FilteredEntryMultimap.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
class C4451m<K, V> extends AbstractC4579y<K, V> implements bf2<K, V> {

    /* JADX INFO: renamed from: p */
    final com.google.common.base.a9<? super Map.Entry<K, V>> f26355p;

    /* JADX INFO: renamed from: s */
    final lw<K, V> f26356s;

    /* JADX INFO: renamed from: com.google.common.collect.m$k */
    /* JADX INFO: compiled from: FilteredEntryMultimap.java */
    class k extends vy.AbstractC4543l<K, Collection<V>> {

        /* JADX INFO: renamed from: com.google.common.collect.m$k$k, reason: collision with other inner class name */
        /* JADX INFO: compiled from: FilteredEntryMultimap.java */
        class C7989k extends vy.t8r<K, Collection<V>> {

            /* JADX INFO: renamed from: com.google.common.collect.m$k$k$k, reason: collision with other inner class name */
            /* JADX INFO: compiled from: FilteredEntryMultimap.java */
            class C7990k extends com.google.common.collect.zy<Map.Entry<K, Collection<V>>> {

                /* JADX INFO: renamed from: n */
                final Iterator<Map.Entry<K, Collection<V>>> f26360n;

                C7990k() {
                    this.f26360n = C4451m.this.f26356s.asMap().entrySet().iterator();
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.google.common.collect.zy
                /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
                public Map.Entry<K, Collection<V>> mo15703k() {
                    while (this.f26360n.hasNext()) {
                        Map.Entry<K, Collection<V>> next = this.f26360n.next();
                        K key = next.getKey();
                        Collection collectionZy = C4451m.zy(next.getValue(), new zy(key));
                        if (!collectionZy.isEmpty()) {
                            return vy.dd(key, collectionZy);
                        }
                    }
                    return toq();
                }
            }

            C7989k() {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return new C7990k();
            }

            @Override // com.google.common.collect.vy.t8r
            /* JADX INFO: renamed from: k */
            Map<K, Collection<V>> mo15823k() {
                return k.this;
            }

            @Override // com.google.common.collect.vy.t8r, com.google.common.collect.g0ad.ld6, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean removeAll(Collection<?> collection) {
                return C4451m.this.m15819q(com.google.common.base.fti.n7h(collection));
            }

            @Override // com.google.common.collect.vy.t8r, com.google.common.collect.g0ad.ld6, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> collection) {
                return C4451m.this.m15819q(com.google.common.base.fti.cdj(com.google.common.base.fti.n7h(collection)));
            }

            @Override // com.google.common.collect.vy.t8r, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return zwy.m16119e(iterator());
            }
        }

        /* JADX INFO: renamed from: com.google.common.collect.m$k$toq */
        /* JADX INFO: compiled from: FilteredEntryMultimap.java */
        class toq extends vy.C4550t<K, Collection<V>> {
            toq() {
                super(k.this);
            }

            @Override // com.google.common.collect.vy.C4550t, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(@NullableDecl Object obj) {
                return k.this.remove(obj) != null;
            }

            @Override // com.google.common.collect.g0ad.ld6, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean removeAll(Collection<?> collection) {
                return C4451m.this.m15819q(vy.m16013f(com.google.common.base.fti.n7h(collection)));
            }

            @Override // com.google.common.collect.g0ad.ld6, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> collection) {
                return C4451m.this.m15819q(vy.m16013f(com.google.common.base.fti.cdj(com.google.common.base.fti.n7h(collection))));
            }
        }

        /* JADX INFO: renamed from: com.google.common.collect.m$k$zy */
        /* JADX INFO: compiled from: FilteredEntryMultimap.java */
        class zy extends vy.ncyb<K, Collection<V>> {
            zy() {
                super(k.this);
            }

            @Override // com.google.common.collect.vy.ncyb, java.util.AbstractCollection, java.util.Collection
            public boolean remove(@NullableDecl Object obj) {
                if (!(obj instanceof Collection)) {
                    return false;
                }
                Collection collection = (Collection) obj;
                Iterator<Map.Entry<K, Collection<V>>> it = C4451m.this.f26356s.asMap().entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry<K, Collection<V>> next = it.next();
                    Collection collectionZy = C4451m.zy(next.getValue(), new zy(next.getKey()));
                    if (!collectionZy.isEmpty() && collection.equals(collectionZy)) {
                        if (collectionZy.size() == next.getValue().size()) {
                            it.remove();
                            return true;
                        }
                        collectionZy.clear();
                        return true;
                    }
                }
                return false;
            }

            @Override // com.google.common.collect.vy.ncyb, java.util.AbstractCollection, java.util.Collection
            public boolean removeAll(Collection<?> collection) {
                return C4451m.this.m15819q(vy.i9jn(com.google.common.base.fti.n7h(collection)));
            }

            @Override // com.google.common.collect.vy.ncyb, java.util.AbstractCollection, java.util.Collection
            public boolean retainAll(Collection<?> collection) {
                return C4451m.this.m15819q(vy.i9jn(com.google.common.base.fti.cdj(com.google.common.base.fti.n7h(collection))));
            }
        }

        k() {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            C4451m.this.clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@NullableDecl Object obj) {
            return get(obj) != null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Collection<V> remove(@NullableDecl Object obj) {
            Collection<V> collection = C4451m.this.f26356s.asMap().get(obj);
            if (collection == null) {
                return null;
            }
            ArrayList arrayListCdj = wlev.cdj();
            Iterator<V> it = collection.iterator();
            while (it.hasNext()) {
                V next = it.next();
                if (C4451m.this.m15817n(obj, next)) {
                    it.remove();
                    arrayListCdj.add(next);
                }
            }
            if (arrayListCdj.isEmpty()) {
                return null;
            }
            return C4451m.this.f26356s instanceof wt ? Collections.unmodifiableSet(g0ad.m15698t(arrayListCdj)) : Collections.unmodifiableList(arrayListCdj);
        }

        @Override // com.google.common.collect.vy.AbstractC4543l
        /* JADX INFO: renamed from: k */
        Set<Map.Entry<K, Collection<V>>> mo15821k() {
            return new C7989k();
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public Collection<V> get(@NullableDecl Object obj) {
            Collection<V> collection = C4451m.this.f26356s.asMap().get(obj);
            if (collection == null) {
                return null;
            }
            Collection<V> collectionZy = C4451m.zy(collection, new zy(obj));
            if (collectionZy.isEmpty()) {
                return null;
            }
            return collectionZy;
        }

        @Override // com.google.common.collect.vy.AbstractC4543l
        /* JADX INFO: renamed from: toq */
        Set<K> mo15887y() {
            return new toq();
        }

        @Override // com.google.common.collect.vy.AbstractC4543l
        Collection<Collection<V>> zy() {
            return new zy();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.m$toq */
    /* JADX INFO: compiled from: FilteredEntryMultimap.java */
    class toq extends oki.f7l8<K, V> {

        /* JADX INFO: renamed from: com.google.common.collect.m$toq$k */
        /* JADX INFO: compiled from: FilteredEntryMultimap.java */
        class k extends m58i.AbstractC4457s<K> {

            /* JADX INFO: renamed from: com.google.common.collect.m$toq$k$k, reason: collision with other inner class name */
            /* JADX INFO: compiled from: FilteredEntryMultimap.java */
            class C7991k implements com.google.common.base.a9<Map.Entry<K, Collection<V>>> {

                /* JADX INFO: renamed from: k */
                final /* synthetic */ com.google.common.base.a9 f26365k;

                C7991k(com.google.common.base.a9 a9Var) {
                    this.f26365k = a9Var;
                }

                @Override // com.google.common.base.a9
                /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
                public boolean apply(Map.Entry<K, Collection<V>> entry) {
                    return this.f26365k.apply(m58i.ld6(entry.getKey(), entry.getValue().size()));
                }
            }

            k() {
            }

            private boolean toq(com.google.common.base.a9<? super o05.InterfaceC4482k<K>> a9Var) {
                return C4451m.this.m15819q(new C7991k(a9Var));
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<o05.InterfaceC4482k<K>> iterator() {
                return toq.this.entryIterator();
            }

            @Override // com.google.common.collect.m58i.AbstractC4457s
            /* JADX INFO: renamed from: k */
            o05<K> mo15679k() {
                return toq.this;
            }

            @Override // com.google.common.collect.g0ad.ld6, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean removeAll(Collection<?> collection) {
                return toq(com.google.common.base.fti.n7h(collection));
            }

            @Override // com.google.common.collect.g0ad.ld6, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> collection) {
                return toq(com.google.common.base.fti.cdj(com.google.common.base.fti.n7h(collection)));
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return C4451m.this.keySet().size();
            }
        }

        toq() {
            super(C4451m.this);
        }

        @Override // com.google.common.collect.AbstractC4519s, com.google.common.collect.o05
        public Set<o05.InterfaceC4482k<K>> entrySet() {
            return new k();
        }

        @Override // com.google.common.collect.oki.f7l8, com.google.common.collect.AbstractC4519s, com.google.common.collect.o05
        public int remove(@NullableDecl Object obj, int i2) {
            C4524t.toq(i2, "occurrences");
            if (i2 == 0) {
                return count(obj);
            }
            Collection<V> collection = C4451m.this.f26356s.asMap().get(obj);
            int i3 = 0;
            if (collection == null) {
                return 0;
            }
            Iterator<V> it = collection.iterator();
            while (it.hasNext()) {
                if (C4451m.this.m15817n(obj, it.next()) && (i3 = i3 + 1) <= i2) {
                    it.remove();
                }
            }
            return i3;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.m$zy */
    /* JADX INFO: compiled from: FilteredEntryMultimap.java */
    final class zy implements com.google.common.base.a9<V> {

        /* JADX INFO: renamed from: k */
        private final K f26367k;

        zy(K k2) {
            this.f26367k = k2;
        }

        @Override // com.google.common.base.a9
        public boolean apply(@NullableDecl V v2) {
            return C4451m.this.m15817n(this.f26367k, v2);
        }
    }

    C4451m(lw<K, V> lwVar, com.google.common.base.a9<? super Map.Entry<K, V>> a9Var) {
        this.f26356s = (lw) com.google.common.base.jk.a9(lwVar);
        this.f26355p = (com.google.common.base.a9) com.google.common.base.jk.a9(a9Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public boolean m15817n(K k2, V v2) {
        return this.f26355p.apply(vy.dd(k2, v2));
    }

    static <E> Collection<E> zy(Collection<E> collection, com.google.common.base.a9<? super E> a9Var) {
        return collection instanceof Set ? g0ad.m15697s((Set) collection, a9Var) : mcp.m15859n(collection, a9Var);
    }

    @Override // com.google.common.collect.lw
    public void clear() {
        entries().clear();
    }

    @Override // com.google.common.collect.lw
    public boolean containsKey(@NullableDecl Object obj) {
        return asMap().get(obj) != null;
    }

    @Override // com.google.common.collect.AbstractC4579y
    Map<K, Collection<V>> createAsMap() {
        return new k();
    }

    @Override // com.google.common.collect.AbstractC4579y
    Collection<Map.Entry<K, V>> createEntries() {
        return zy(this.f26356s.entries(), this.f26355p);
    }

    @Override // com.google.common.collect.AbstractC4579y
    Set<K> createKeySet() {
        return asMap().keySet();
    }

    @Override // com.google.common.collect.AbstractC4579y
    o05<K> createKeys() {
        return new toq();
    }

    @Override // com.google.common.collect.AbstractC4579y
    Collection<V> createValues() {
        return new i1(this);
    }

    @Override // com.google.common.collect.AbstractC4579y
    Iterator<Map.Entry<K, V>> entryIterator() {
        throw new AssertionError("should never be called");
    }

    /* JADX INFO: renamed from: g */
    Collection<V> m15818g() {
        return this.f26356s instanceof wt ? Collections.emptySet() : Collections.emptyList();
    }

    @Override // com.google.common.collect.lw
    public Collection<V> get(K k2) {
        return zy(this.f26356s.get(k2), new zy(k2));
    }

    @Override // com.google.common.collect.bf2
    /* JADX INFO: renamed from: p */
    public com.google.common.base.a9<? super Map.Entry<K, V>> mo15585p() {
        return this.f26355p;
    }

    /* JADX INFO: renamed from: q */
    boolean m15819q(com.google.common.base.a9<? super Map.Entry<K, Collection<V>>> a9Var) {
        Iterator<Map.Entry<K, Collection<V>>> it = this.f26356s.asMap().entrySet().iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            Map.Entry<K, Collection<V>> next = it.next();
            K key = next.getKey();
            Collection collectionZy = zy(next.getValue(), new zy(key));
            if (!collectionZy.isEmpty() && a9Var.apply(vy.dd(key, collectionZy))) {
                if (collectionZy.size() == next.getValue().size()) {
                    it.remove();
                } else {
                    collectionZy.clear();
                }
                z2 = true;
            }
        }
        return z2;
    }

    @Override // com.google.common.collect.lw
    public Collection<V> removeAll(@NullableDecl Object obj) {
        return (Collection) com.google.common.base.fu4.m15351k(asMap().remove(obj), m15818g());
    }

    @Override // com.google.common.collect.lw
    public int size() {
        return entries().size();
    }

    public lw<K, V> toq() {
        return this.f26356s;
    }
}
