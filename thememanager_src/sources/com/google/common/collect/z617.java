package com.google.common.collect;

import com.google.common.collect.vy;
import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NoSuchElementException;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import wlev.InterfaceC7731k;

/* JADX INFO: compiled from: TreeRangeMap.java */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7731k
@wlev.zy
public final class z617<K extends Comparable, V> implements ra<K, V> {

    /* JADX INFO: renamed from: q */
    private static final ra f26755q = new C4583k();

    /* JADX INFO: renamed from: k */
    private final NavigableMap<ncyb<K>, zy<K, V>> f26756k = vy.ek5k();

    /* JADX INFO: renamed from: com.google.common.collect.z617$k */
    /* JADX INFO: compiled from: TreeRangeMap.java */
    static class C4583k implements ra {
        C4583k() {
        }

        @Override // com.google.common.collect.ra
        public Map<ps, Object> asDescendingMapOfRanges() {
            return Collections.emptyMap();
        }

        @Override // com.google.common.collect.ra
        public Map<ps, Object> asMapOfRanges() {
            return Collections.emptyMap();
        }

        @Override // com.google.common.collect.ra
        public void clear() {
        }

        @Override // com.google.common.collect.ra
        @NullableDecl
        public Object get(Comparable comparable) {
            return null;
        }

        @Override // com.google.common.collect.ra
        @NullableDecl
        public Map.Entry<ps, Object> getEntry(Comparable comparable) {
            return null;
        }

        @Override // com.google.common.collect.ra
        public void put(ps psVar, Object obj) {
            com.google.common.base.jk.a9(psVar);
            throw new IllegalArgumentException("Cannot insert range " + psVar + " into an empty subRangeMap");
        }

        @Override // com.google.common.collect.ra
        public void putAll(ra raVar) {
            if (!raVar.asMapOfRanges().isEmpty()) {
                throw new IllegalArgumentException("Cannot putAll(nonEmptyRangeMap) into an empty subRangeMap");
            }
        }

        @Override // com.google.common.collect.ra
        public void putCoalescing(ps psVar, Object obj) {
            com.google.common.base.jk.a9(psVar);
            throw new IllegalArgumentException("Cannot insert range " + psVar + " into an empty subRangeMap");
        }

        @Override // com.google.common.collect.ra
        public void remove(ps psVar) {
            com.google.common.base.jk.a9(psVar);
        }

        @Override // com.google.common.collect.ra
        public ps span() {
            throw new NoSuchElementException();
        }

        @Override // com.google.common.collect.ra
        public ra subRangeMap(ps psVar) {
            com.google.common.base.jk.a9(psVar);
            return this;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.z617$q */
    /* JADX INFO: compiled from: TreeRangeMap.java */
    private class C4584q implements ra<K, V> {

        /* JADX INFO: renamed from: k */
        private final ps<K> f26757k;

        /* JADX INFO: renamed from: com.google.common.collect.z617$q$k */
        /* JADX INFO: compiled from: TreeRangeMap.java */
        class k extends z617<K, V>.C4584q.toq {

            /* JADX INFO: renamed from: com.google.common.collect.z617$q$k$k, reason: collision with other inner class name */
            /* JADX INFO: compiled from: TreeRangeMap.java */
            class C8000k extends com.google.common.collect.zy<Map.Entry<ps<K>, V>> {

                /* JADX INFO: renamed from: n */
                final /* synthetic */ Iterator f26761n;

                C8000k(Iterator it) {
                    this.f26761n = it;
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.google.common.collect.zy
                /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
                public Map.Entry<ps<K>, V> mo15703k() {
                    if (!this.f26761n.hasNext()) {
                        return (Map.Entry) toq();
                    }
                    zy zyVar = (zy) this.f26761n.next();
                    return zyVar.m16114q().compareTo((ncyb) C4584q.this.f26757k.lowerBound) <= 0 ? (Map.Entry) toq() : vy.dd(zyVar.getKey().intersection(C4584q.this.f26757k), zyVar.getValue());
                }
            }

            k() {
                super();
            }

            @Override // com.google.common.collect.z617.C4584q.toq
            Iterator<Map.Entry<ps<K>, V>> toq() {
                return C4584q.this.f26757k.isEmpty() ? zwy.fn3e() : new C8000k(z617.this.f26756k.headMap(C4584q.this.f26757k.upperBound, false).descendingMap().values().iterator());
            }
        }

        /* JADX INFO: renamed from: com.google.common.collect.z617$q$toq */
        /* JADX INFO: compiled from: TreeRangeMap.java */
        class toq extends AbstractMap<ps<K>, V> {

            /* JADX INFO: renamed from: com.google.common.collect.z617$q$toq$k */
            /* JADX INFO: compiled from: TreeRangeMap.java */
            class k extends vy.C4550t<ps<K>, V> {
                k(Map map) {
                    super(map);
                }

                @Override // com.google.common.collect.vy.C4550t, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean remove(@NullableDecl Object obj) {
                    return toq.this.remove(obj) != null;
                }

                @Override // com.google.common.collect.g0ad.ld6, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean retainAll(Collection<?> collection) {
                    return toq.this.zy(com.google.common.base.fti.m15350y(com.google.common.base.fti.cdj(com.google.common.base.fti.n7h(collection)), vy.m16019l()));
                }
            }

            /* JADX INFO: renamed from: com.google.common.collect.z617$q$toq$q */
            /* JADX INFO: compiled from: TreeRangeMap.java */
            class q extends vy.ncyb<ps<K>, V> {
                q(Map map) {
                    super(map);
                }

                @Override // com.google.common.collect.vy.ncyb, java.util.AbstractCollection, java.util.Collection
                public boolean removeAll(Collection<?> collection) {
                    return toq.this.zy(com.google.common.base.fti.m15350y(com.google.common.base.fti.n7h(collection), vy.gbni()));
                }

                @Override // com.google.common.collect.vy.ncyb, java.util.AbstractCollection, java.util.Collection
                public boolean retainAll(Collection<?> collection) {
                    return toq.this.zy(com.google.common.base.fti.m15350y(com.google.common.base.fti.cdj(com.google.common.base.fti.n7h(collection)), vy.gbni()));
                }
            }

            /* JADX INFO: renamed from: com.google.common.collect.z617$q$toq$toq, reason: collision with other inner class name */
            /* JADX INFO: compiled from: TreeRangeMap.java */
            class C8001toq extends vy.t8r<ps<K>, V> {
                C8001toq() {
                }

                @Override // com.google.common.collect.vy.t8r, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean isEmpty() {
                    return !iterator().hasNext();
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                public Iterator<Map.Entry<ps<K>, V>> iterator() {
                    return toq.this.toq();
                }

                @Override // com.google.common.collect.vy.t8r
                /* JADX INFO: renamed from: k */
                Map<ps<K>, V> mo15823k() {
                    return toq.this;
                }

                @Override // com.google.common.collect.vy.t8r, com.google.common.collect.g0ad.ld6, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean retainAll(Collection<?> collection) {
                    return toq.this.zy(com.google.common.base.fti.cdj(com.google.common.base.fti.n7h(collection)));
                }

                @Override // com.google.common.collect.vy.t8r, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public int size() {
                    return zwy.m16119e(iterator());
                }
            }

            /* JADX INFO: renamed from: com.google.common.collect.z617$q$toq$zy */
            /* JADX INFO: compiled from: TreeRangeMap.java */
            class zy extends com.google.common.collect.zy<Map.Entry<ps<K>, V>> {

                /* JADX INFO: renamed from: n */
                final /* synthetic */ Iterator f26767n;

                zy(Iterator it) {
                    this.f26767n = it;
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.google.common.collect.zy
                /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
                public Map.Entry<ps<K>, V> mo15703k() {
                    while (this.f26767n.hasNext()) {
                        zy zyVar = (zy) this.f26767n.next();
                        if (zyVar.zy().compareTo((ncyb) C4584q.this.f26757k.upperBound) >= 0) {
                            return (Map.Entry) toq();
                        }
                        if (zyVar.m16114q().compareTo((ncyb) C4584q.this.f26757k.lowerBound) > 0) {
                            return vy.dd(zyVar.getKey().intersection(C4584q.this.f26757k), zyVar.getValue());
                        }
                    }
                    return (Map.Entry) toq();
                }
            }

            toq() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public boolean zy(com.google.common.base.a9<? super Map.Entry<ps<K>, V>> a9Var) {
                ArrayList arrayListCdj = wlev.cdj();
                for (Map.Entry<ps<K>, V> entry : entrySet()) {
                    if (a9Var.apply(entry)) {
                        arrayListCdj.add(entry.getKey());
                    }
                }
                Iterator it = arrayListCdj.iterator();
                while (it.hasNext()) {
                    z617.this.remove((ps) it.next());
                }
                return !arrayListCdj.isEmpty();
            }

            @Override // java.util.AbstractMap, java.util.Map
            public void clear() {
                C4584q.this.clear();
            }

            @Override // java.util.AbstractMap, java.util.Map
            public boolean containsKey(Object obj) {
                return get(obj) != null;
            }

            @Override // java.util.AbstractMap, java.util.Map
            public Set<Map.Entry<ps<K>, V>> entrySet() {
                return new C8001toq();
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // java.util.AbstractMap, java.util.Map
            public V get(Object obj) {
                zy zyVar;
                try {
                    if (obj instanceof ps) {
                        ps psVar = (ps) obj;
                        if (C4584q.this.f26757k.encloses(psVar) && !psVar.isEmpty()) {
                            if (psVar.lowerBound.compareTo((ncyb) C4584q.this.f26757k.lowerBound) == 0) {
                                Map.Entry entryFloorEntry = z617.this.f26756k.floorEntry(psVar.lowerBound);
                                zyVar = entryFloorEntry != null ? (zy) entryFloorEntry.getValue() : null;
                            } else {
                                zyVar = (zy) z617.this.f26756k.get(psVar.lowerBound);
                            }
                            if (zyVar != null && zyVar.getKey().isConnected(C4584q.this.f26757k) && zyVar.getKey().intersection(C4584q.this.f26757k).equals(psVar)) {
                                return (V) zyVar.getValue();
                            }
                        }
                    }
                } catch (ClassCastException unused) {
                }
                return null;
            }

            @Override // java.util.AbstractMap, java.util.Map
            public Set<ps<K>> keySet() {
                return new k(this);
            }

            @Override // java.util.AbstractMap, java.util.Map
            public V remove(Object obj) {
                V v2 = (V) get(obj);
                if (v2 == null) {
                    return null;
                }
                z617.this.remove((ps) obj);
                return v2;
            }

            Iterator<Map.Entry<ps<K>, V>> toq() {
                if (C4584q.this.f26757k.isEmpty()) {
                    return zwy.fn3e();
                }
                return new zy(z617.this.f26756k.tailMap((ncyb) com.google.common.base.fu4.m15351k(z617.this.f26756k.floorKey(C4584q.this.f26757k.lowerBound), C4584q.this.f26757k.lowerBound), true).values().iterator());
            }

            @Override // java.util.AbstractMap, java.util.Map
            public Collection<V> values() {
                return new q(this);
            }
        }

        C4584q(ps<K> psVar) {
            this.f26757k = psVar;
        }

        @Override // com.google.common.collect.ra
        public Map<ps<K>, V> asDescendingMapOfRanges() {
            return new k();
        }

        @Override // com.google.common.collect.ra
        public Map<ps<K>, V> asMapOfRanges() {
            return new toq();
        }

        @Override // com.google.common.collect.ra
        public void clear() {
            z617.this.remove(this.f26757k);
        }

        @Override // com.google.common.collect.ra
        public boolean equals(@NullableDecl Object obj) {
            if (obj instanceof ra) {
                return asMapOfRanges().equals(((ra) obj).asMapOfRanges());
            }
            return false;
        }

        @Override // com.google.common.collect.ra
        @NullableDecl
        public V get(K k2) {
            if (this.f26757k.contains(k2)) {
                return (V) z617.this.get(k2);
            }
            return null;
        }

        @Override // com.google.common.collect.ra
        @NullableDecl
        public Map.Entry<ps<K>, V> getEntry(K k2) {
            Map.Entry<ps<K>, V> entry;
            if (!this.f26757k.contains(k2) || (entry = z617.this.getEntry(k2)) == null) {
                return null;
            }
            return vy.dd(entry.getKey().intersection(this.f26757k), entry.getValue());
        }

        @Override // com.google.common.collect.ra
        public int hashCode() {
            return asMapOfRanges().hashCode();
        }

        @Override // com.google.common.collect.ra
        public void put(ps<K> psVar, V v2) {
            com.google.common.base.jk.m15391z(this.f26757k.encloses(psVar), "Cannot put range %s into a subRangeMap(%s)", psVar, this.f26757k);
            z617.this.put(psVar, v2);
        }

        @Override // com.google.common.collect.ra
        public void putAll(ra<K, V> raVar) {
            if (raVar.asMapOfRanges().isEmpty()) {
                return;
            }
            ps<K> psVarSpan = raVar.span();
            com.google.common.base.jk.m15391z(this.f26757k.encloses(psVarSpan), "Cannot putAll rangeMap with span %s into a subRangeMap(%s)", psVarSpan, this.f26757k);
            z617.this.putAll(raVar);
        }

        @Override // com.google.common.collect.ra
        public void putCoalescing(ps<K> psVar, V v2) {
            if (z617.this.f26756k.isEmpty() || psVar.isEmpty() || !this.f26757k.encloses(psVar)) {
                put(psVar, v2);
            } else {
                put(z617.this.m16106n(psVar, com.google.common.base.jk.a9(v2)).intersection(this.f26757k), v2);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // com.google.common.collect.ra
        public void remove(ps<K> psVar) {
            if (psVar.isConnected(this.f26757k)) {
                z617.this.remove(psVar.intersection(this.f26757k));
            }
        }

        @Override // com.google.common.collect.ra
        public ps<K> span() {
            ncyb ncybVar;
            Map.Entry entryFloorEntry = z617.this.f26756k.floorEntry(this.f26757k.lowerBound);
            if (entryFloorEntry == null || ((zy) entryFloorEntry.getValue()).m16114q().compareTo((ncyb) this.f26757k.lowerBound) <= 0) {
                ncybVar = (ncyb) z617.this.f26756k.ceilingKey(this.f26757k.lowerBound);
                if (ncybVar == null || ncybVar.compareTo((ncyb) this.f26757k.upperBound) >= 0) {
                    throw new NoSuchElementException();
                }
            } else {
                ncybVar = this.f26757k.lowerBound;
            }
            Map.Entry entryLowerEntry = z617.this.f26756k.lowerEntry(this.f26757k.upperBound);
            if (entryLowerEntry != null) {
                return ps.create(ncybVar, ((zy) entryLowerEntry.getValue()).m16114q().compareTo((ncyb) this.f26757k.upperBound) >= 0 ? this.f26757k.upperBound : ((zy) entryLowerEntry.getValue()).m16114q());
            }
            throw new NoSuchElementException();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // com.google.common.collect.ra
        public ra<K, V> subRangeMap(ps<K> psVar) {
            return !psVar.isConnected(this.f26757k) ? z617.this.f7l8() : z617.this.subRangeMap(psVar.intersection(this.f26757k));
        }

        @Override // com.google.common.collect.ra
        public String toString() {
            return asMapOfRanges().toString();
        }
    }

    /* JADX INFO: compiled from: TreeRangeMap.java */
    private final class toq extends vy.wvg<ps<K>, V> {

        /* JADX INFO: renamed from: k */
        final Iterable<Map.Entry<ps<K>, V>> f26768k;

        toq(Iterable<zy<K, V>> iterable) {
            this.f26768k = iterable;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@NullableDecl Object obj) {
            return get(obj) != null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V get(@NullableDecl Object obj) {
            if (!(obj instanceof ps)) {
                return null;
            }
            ps psVar = (ps) obj;
            zy zyVar = (zy) z617.this.f26756k.get(psVar.lowerBound);
            if (zyVar == null || !zyVar.getKey().equals(psVar)) {
                return null;
            }
            return (V) zyVar.getValue();
        }

        @Override // com.google.common.collect.vy.wvg
        /* JADX INFO: renamed from: k */
        Iterator<Map.Entry<ps<K>, V>> mo15684k() {
            return this.f26768k.iterator();
        }

        @Override // com.google.common.collect.vy.wvg, java.util.AbstractMap, java.util.Map
        public int size() {
            return z617.this.f26756k.size();
        }
    }

    /* JADX INFO: compiled from: TreeRangeMap.java */
    private static final class zy<K extends Comparable, V> extends f7l8<ps<K>, V> {

        /* JADX INFO: renamed from: k */
        private final ps<K> f26770k;

        /* JADX INFO: renamed from: q */
        private final V f26771q;

        zy(ncyb<K> ncybVar, ncyb<K> ncybVar2, V v2) {
            this(ps.create(ncybVar, ncybVar2), v2);
        }

        @Override // com.google.common.collect.f7l8, java.util.Map.Entry
        public V getValue() {
            return this.f26771q;
        }

        /* JADX INFO: renamed from: k */
        public boolean m16113k(K k2) {
            return this.f26770k.contains(k2);
        }

        /* JADX INFO: renamed from: q */
        ncyb<K> m16114q() {
            return (ncyb<K>) this.f26770k.upperBound;
        }

        @Override // com.google.common.collect.f7l8, java.util.Map.Entry
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public ps<K> getKey() {
            return this.f26770k;
        }

        ncyb<K> zy() {
            return (ncyb<K>) this.f26770k.lowerBound;
        }

        zy(ps<K> psVar, V v2) {
            this.f26770k = psVar;
            this.f26771q = v2;
        }
    }

    private z617() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ra<K, V> f7l8() {
        return f26755q;
    }

    /* JADX INFO: renamed from: g */
    public static <K extends Comparable, V> z617<K, V> m16104g() {
        return new z617<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX INFO: renamed from: n */
    public ps<K> m16106n(ps<K> psVar, V v2) {
        return m16107q(m16107q(psVar, v2, this.f26756k.lowerEntry((ncyb<K>) psVar.lowerBound)), v2, this.f26756k.floorEntry((ncyb<K>) psVar.upperBound));
    }

    /* JADX INFO: renamed from: q */
    private static <K extends Comparable, V> ps<K> m16107q(ps<K> psVar, V v2, @NullableDecl Map.Entry<ncyb<K>, zy<K, V>> entry) {
        return (entry != null && entry.getValue().getKey().isConnected(psVar) && entry.getValue().getValue().equals(v2)) ? (ps<K>) psVar.span(entry.getValue().getKey()) : psVar;
    }

    /* JADX INFO: renamed from: y */
    private void m16108y(ncyb<K> ncybVar, ncyb<K> ncybVar2, V v2) {
        this.f26756k.put(ncybVar, new zy<>(ncybVar, ncybVar2, v2));
    }

    @Override // com.google.common.collect.ra
    public Map<ps<K>, V> asDescendingMapOfRanges() {
        return new toq(this.f26756k.descendingMap().values());
    }

    @Override // com.google.common.collect.ra
    public Map<ps<K>, V> asMapOfRanges() {
        return new toq(this.f26756k.values());
    }

    @Override // com.google.common.collect.ra
    public void clear() {
        this.f26756k.clear();
    }

    @Override // com.google.common.collect.ra
    public boolean equals(@NullableDecl Object obj) {
        if (obj instanceof ra) {
            return asMapOfRanges().equals(((ra) obj).asMapOfRanges());
        }
        return false;
    }

    @Override // com.google.common.collect.ra
    @NullableDecl
    public V get(K k2) {
        Map.Entry<ps<K>, V> entry = getEntry(k2);
        if (entry == null) {
            return null;
        }
        return entry.getValue();
    }

    @Override // com.google.common.collect.ra
    @NullableDecl
    public Map.Entry<ps<K>, V> getEntry(K k2) {
        Map.Entry<ncyb<K>, zy<K, V>> entryFloorEntry = this.f26756k.floorEntry(ncyb.belowValue(k2));
        if (entryFloorEntry == null || !entryFloorEntry.getValue().m16113k(k2)) {
            return null;
        }
        return entryFloorEntry.getValue();
    }

    @Override // com.google.common.collect.ra
    public int hashCode() {
        return asMapOfRanges().hashCode();
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.google.common.collect.ra
    public void put(ps<K> psVar, V v2) {
        if (psVar.isEmpty()) {
            return;
        }
        com.google.common.base.jk.a9(v2);
        remove(psVar);
        this.f26756k.put((ncyb<K>) psVar.lowerBound, new zy<>(psVar, v2));
    }

    @Override // com.google.common.collect.ra
    public void putAll(ra<K, V> raVar) {
        for (Map.Entry<ps<K>, V> entry : raVar.asMapOfRanges().entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ra
    public void putCoalescing(ps<K> psVar, V v2) {
        if (this.f26756k.isEmpty()) {
            put(psVar, v2);
        } else {
            put(m16106n(psVar, com.google.common.base.jk.a9(v2)), v2);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.google.common.collect.ra
    public void remove(ps<K> psVar) {
        if (psVar.isEmpty()) {
            return;
        }
        Map.Entry<ncyb<K>, zy<K, V>> entryLowerEntry = this.f26756k.lowerEntry((ncyb<K>) psVar.lowerBound);
        if (entryLowerEntry != null) {
            zy<K, V> value = entryLowerEntry.getValue();
            if (value.m16114q().compareTo((ncyb) psVar.lowerBound) > 0) {
                if (value.m16114q().compareTo((ncyb) psVar.upperBound) > 0) {
                    m16108y(psVar.upperBound, value.m16114q(), entryLowerEntry.getValue().getValue());
                }
                m16108y(value.zy(), psVar.lowerBound, entryLowerEntry.getValue().getValue());
            }
        }
        Map.Entry<ncyb<K>, zy<K, V>> entryLowerEntry2 = this.f26756k.lowerEntry((ncyb<K>) psVar.upperBound);
        if (entryLowerEntry2 != null) {
            zy<K, V> value2 = entryLowerEntry2.getValue();
            if (value2.m16114q().compareTo((ncyb) psVar.upperBound) > 0) {
                m16108y(psVar.upperBound, value2.m16114q(), entryLowerEntry2.getValue().getValue());
            }
        }
        this.f26756k.subMap((ncyb<K>) psVar.lowerBound, (ncyb<K>) psVar.upperBound).clear();
    }

    @Override // com.google.common.collect.ra
    public ps<K> span() {
        Map.Entry<ncyb<K>, zy<K, V>> entryFirstEntry = this.f26756k.firstEntry();
        Map.Entry<ncyb<K>, zy<K, V>> entryLastEntry = this.f26756k.lastEntry();
        if (entryFirstEntry != null) {
            return ps.create(entryFirstEntry.getValue().getKey().lowerBound, entryLastEntry.getValue().getKey().upperBound);
        }
        throw new NoSuchElementException();
    }

    @Override // com.google.common.collect.ra
    public ra<K, V> subRangeMap(ps<K> psVar) {
        return psVar.equals(ps.all()) ? this : new C4584q(psVar);
    }

    @Override // com.google.common.collect.ra
    public String toString() {
        return this.f26756k.values().toString();
    }
}
