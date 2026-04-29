package com.google.common.collect;

import com.google.common.collect.g0ad;
import com.google.common.collect.qh4d;
import com.google.common.collect.vy;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: StandardTable.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
class ovdh<R, C, V> extends cdj<R, C, V> implements Serializable {
    private static final long serialVersionUID = 0;

    @py
    final Map<R, Map<C, V>> backingMap;

    @py
    final com.google.common.base.lvui<? extends Map<C, V>> factory;

    /* JADX INFO: renamed from: g */
    @MonotonicNonNullDecl
    private transient Map<R, Map<C, V>> f26518g;

    /* JADX INFO: renamed from: n */
    @MonotonicNonNullDecl
    private transient Set<C> f26519n;

    /* JADX INFO: renamed from: y */
    @MonotonicNonNullDecl
    private transient ovdh<R, C, V>.C4501g f26520y;

    /* JADX INFO: compiled from: StandardTable.java */
    class f7l8 extends vy.wvg<C, V> {

        /* JADX INFO: renamed from: k */
        final R f26521k;

        /* JADX INFO: renamed from: q */
        @NullableDecl
        Map<C, V> f26523q;

        /* JADX INFO: renamed from: com.google.common.collect.ovdh$f7l8$k */
        /* JADX INFO: compiled from: StandardTable.java */
        class C4500k implements Iterator<Map.Entry<C, V>> {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ Iterator f26524k;

            C4500k(Iterator it) {
                this.f26524k = it;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f26524k.hasNext();
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public Map.Entry<C, V> next() {
                return f7l8.this.m15951g((Map.Entry) this.f26524k.next());
            }

            @Override // java.util.Iterator
            public void remove() {
                this.f26524k.remove();
                f7l8.this.mo15874q();
            }
        }

        /* JADX INFO: compiled from: StandardTable.java */
        class toq extends AbstractC4531v<C, V> {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ Map.Entry f26526k;

            toq(Map.Entry entry) {
                this.f26526k = entry;
            }

            @Override // com.google.common.collect.AbstractC4531v, java.util.Map.Entry
            public boolean equals(Object obj) {
                return standardEquals(obj);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.AbstractC4531v, com.google.common.collect.qkj8
            /* JADX INFO: renamed from: ld6 */
            public Map.Entry<C, V> delegate() {
                return this.f26526k;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.AbstractC4531v, java.util.Map.Entry
            public V setValue(V v2) {
                return (V) super.setValue(com.google.common.base.jk.a9(v2));
            }
        }

        f7l8(R r2) {
            this.f26521k = (R) com.google.common.base.jk.a9(r2);
        }

        @Override // com.google.common.collect.vy.wvg, java.util.AbstractMap, java.util.Map
        public void clear() {
            Map<C, V> qVar = toq();
            if (qVar != null) {
                qVar.clear();
            }
            mo15874q();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            Map<C, V> qVar = toq();
            return (obj == null || qVar == null || !vy.m16030x(qVar, obj)) ? false : true;
        }

        /* JADX INFO: renamed from: g */
        Map.Entry<C, V> m15951g(Map.Entry<C, V> entry) {
            return new toq(entry);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V get(Object obj) {
            Map<C, V> qVar = toq();
            if (obj == null || qVar == null) {
                return null;
            }
            return (V) vy.ch(qVar, obj);
        }

        @Override // com.google.common.collect.vy.wvg
        /* JADX INFO: renamed from: k */
        Iterator<Map.Entry<C, V>> mo15684k() {
            Map<C, V> qVar = toq();
            return qVar == null ? zwy.ni7() : new C4500k(qVar.entrySet().iterator());
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V put(C c2, V v2) {
            com.google.common.base.jk.a9(c2);
            com.google.common.base.jk.a9(v2);
            Map<C, V> map = this.f26523q;
            return (map == null || map.isEmpty()) ? (V) ovdh.this.put(this.f26521k, c2, v2) : this.f26523q.put(c2, v2);
        }

        /* JADX INFO: renamed from: q */
        void mo15874q() {
            if (toq() == null || !this.f26523q.isEmpty()) {
                return;
            }
            ovdh.this.backingMap.remove(this.f26521k);
            this.f26523q = null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V remove(Object obj) {
            Map<C, V> qVar = toq();
            if (qVar == null) {
                return null;
            }
            V v2 = (V) vy.nmn5(qVar, obj);
            mo15874q();
            return v2;
        }

        @Override // com.google.common.collect.vy.wvg, java.util.AbstractMap, java.util.Map
        public int size() {
            Map<C, V> qVar = toq();
            if (qVar == null) {
                return 0;
            }
            return qVar.size();
        }

        Map<C, V> toq() {
            Map<C, V> map = this.f26523q;
            if (map != null && (!map.isEmpty() || !ovdh.this.backingMap.containsKey(this.f26521k))) {
                return this.f26523q;
            }
            Map<C, V> mapZy = zy();
            this.f26523q = mapZy;
            return mapZy;
        }

        Map<C, V> zy() {
            return ovdh.this.backingMap.get(this.f26521k);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.ovdh$g */
    /* JADX INFO: compiled from: StandardTable.java */
    private class C4501g extends vy.AbstractC4543l<C, Map<R, V>> {

        /* JADX INFO: renamed from: com.google.common.collect.ovdh$g$k */
        /* JADX INFO: compiled from: StandardTable.java */
        class k extends ovdh<R, C, V>.AbstractC4505s<Map.Entry<C, Map<R, V>>> {

            /* JADX INFO: renamed from: com.google.common.collect.ovdh$g$k$k, reason: collision with other inner class name */
            /* JADX INFO: compiled from: StandardTable.java */
            class C7996k implements com.google.common.base.t8r<C, Map<R, V>> {
                C7996k() {
                }

                @Override // com.google.common.base.t8r
                /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
                public Map<R, V> apply(C c2) {
                    return ovdh.this.column(c2);
                }
            }

            k() {
                super();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                if (!ovdh.this.containsColumn(entry.getKey())) {
                    return false;
                }
                return C4501g.this.get(entry.getKey()).equals(entry.getValue());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<C, Map<R, V>>> iterator() {
                return vy.qrj(ovdh.this.columnKeySet(), new C7996k());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                ovdh.this.zy(((Map.Entry) obj).getKey());
                return true;
            }

            @Override // com.google.common.collect.g0ad.ld6, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean removeAll(Collection<?> collection) {
                com.google.common.base.jk.a9(collection);
                return g0ad.oc(this, collection.iterator());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.g0ad.ld6, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> collection) {
                com.google.common.base.jk.a9(collection);
                boolean z2 = false;
                for (Object obj : wlev.t8r(ovdh.this.columnKeySet().iterator())) {
                    if (!collection.contains(vy.dd(obj, ovdh.this.column(obj)))) {
                        ovdh.this.zy(obj);
                        z2 = true;
                    }
                }
                return z2;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return ovdh.this.columnKeySet().size();
            }
        }

        /* JADX INFO: renamed from: com.google.common.collect.ovdh$g$toq */
        /* JADX INFO: compiled from: StandardTable.java */
        private class toq extends vy.ncyb<C, Map<R, V>> {
            toq() {
                super(C4501g.this);
            }

            @Override // com.google.common.collect.vy.ncyb, java.util.AbstractCollection, java.util.Collection
            public boolean remove(Object obj) {
                for (Map.Entry<C, Map<R, V>> entry : C4501g.this.entrySet()) {
                    if (entry.getValue().equals(obj)) {
                        ovdh.this.zy(entry.getKey());
                        return true;
                    }
                }
                return false;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.vy.ncyb, java.util.AbstractCollection, java.util.Collection
            public boolean removeAll(Collection<?> collection) {
                com.google.common.base.jk.a9(collection);
                boolean z2 = false;
                for (Object obj : wlev.t8r(ovdh.this.columnKeySet().iterator())) {
                    if (collection.contains(ovdh.this.column(obj))) {
                        ovdh.this.zy(obj);
                        z2 = true;
                    }
                }
                return z2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.vy.ncyb, java.util.AbstractCollection, java.util.Collection
            public boolean retainAll(Collection<?> collection) {
                com.google.common.base.jk.a9(collection);
                boolean z2 = false;
                for (Object obj : wlev.t8r(ovdh.this.columnKeySet().iterator())) {
                    if (!collection.contains(ovdh.this.column(obj))) {
                        ovdh.this.zy(obj);
                        z2 = true;
                    }
                }
                return z2;
            }
        }

        private C4501g() {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return ovdh.this.containsColumn(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Map<R, V> remove(Object obj) {
            if (ovdh.this.containsColumn(obj)) {
                return ovdh.this.zy(obj);
            }
            return null;
        }

        @Override // com.google.common.collect.vy.AbstractC4543l
        /* JADX INFO: renamed from: k */
        public Set<Map.Entry<C, Map<R, V>>> mo15821k() {
            return new k();
        }

        @Override // com.google.common.collect.vy.AbstractC4543l, java.util.AbstractMap, java.util.Map, java.util.SortedMap
        /* JADX INFO: renamed from: keySet */
        public Set<C> mo15886p() {
            return ovdh.this.columnKeySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public Map<R, V> get(Object obj) {
            if (ovdh.this.containsColumn(obj)) {
                return ovdh.this.column(obj);
            }
            return null;
        }

        @Override // com.google.common.collect.vy.AbstractC4543l
        Collection<Map<R, V>> zy() {
            return new toq();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.ovdh$n */
    /* JADX INFO: compiled from: StandardTable.java */
    private class C4503n extends ovdh<R, C, V>.AbstractC4505s<C> {
        private C4503n() {
            super();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return ovdh.this.containsColumn(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<C> iterator() {
            return ovdh.this.createColumnKeyIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            boolean z2 = false;
            if (obj == null) {
                return false;
            }
            Iterator<Map<C, V>> it = ovdh.this.backingMap.values().iterator();
            while (it.hasNext()) {
                Map<C, V> next = it.next();
                if (next.keySet().remove(obj)) {
                    z2 = true;
                    if (next.isEmpty()) {
                        it.remove();
                    }
                }
            }
            return z2;
        }

        @Override // com.google.common.collect.g0ad.ld6, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            com.google.common.base.jk.a9(collection);
            Iterator<Map<C, V>> it = ovdh.this.backingMap.values().iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                Map<C, V> next = it.next();
                if (zwy.m16118c(next.keySet().iterator(), collection)) {
                    z2 = true;
                    if (next.isEmpty()) {
                        it.remove();
                    }
                }
            }
            return z2;
        }

        @Override // com.google.common.collect.g0ad.ld6, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            com.google.common.base.jk.a9(collection);
            Iterator<Map<C, V>> it = ovdh.this.backingMap.values().iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                Map<C, V> next = it.next();
                if (next.keySet().retainAll(collection)) {
                    z2 = true;
                    if (next.isEmpty()) {
                        it.remove();
                    }
                }
            }
            return z2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return zwy.m16119e(iterator());
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.ovdh$q */
    /* JADX INFO: compiled from: StandardTable.java */
    private class C4504q extends com.google.common.collect.zy<C> {

        /* JADX INFO: renamed from: g */
        final Iterator<Map<C, V>> f26533g;

        /* JADX INFO: renamed from: n */
        final Map<C, V> f26534n;

        /* JADX INFO: renamed from: y */
        Iterator<Map.Entry<C, V>> f26536y;

        private C4504q() {
            this.f26534n = ovdh.this.factory.get();
            this.f26533g = ovdh.this.backingMap.values().iterator();
            this.f26536y = zwy.fn3e();
        }

        @Override // com.google.common.collect.zy
        /* JADX INFO: renamed from: k */
        protected C mo15703k() {
            while (true) {
                if (this.f26536y.hasNext()) {
                    Map.Entry<C, V> next = this.f26536y.next();
                    if (!this.f26534n.containsKey(next.getKey())) {
                        this.f26534n.put(next.getKey(), next.getValue());
                        return next.getKey();
                    }
                } else {
                    if (!this.f26533g.hasNext()) {
                        return toq();
                    }
                    this.f26536y = this.f26533g.next().entrySet().iterator();
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.ovdh$s */
    /* JADX INFO: compiled from: StandardTable.java */
    private abstract class AbstractC4505s<T> extends g0ad.ld6<T> {
        private AbstractC4505s() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            ovdh.this.backingMap.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return ovdh.this.backingMap.isEmpty();
        }
    }

    /* JADX INFO: compiled from: StandardTable.java */
    private class toq implements Iterator<qh4d.InterfaceC4517k<R, C, V>> {

        /* JADX INFO: renamed from: k */
        final Iterator<Map.Entry<R, Map<C, V>>> f26539k;

        /* JADX INFO: renamed from: n */
        Iterator<Map.Entry<C, V>> f26540n;

        /* JADX INFO: renamed from: q */
        @NullableDecl
        Map.Entry<R, Map<C, V>> f26541q;

        private toq() {
            this.f26539k = ovdh.this.backingMap.entrySet().iterator();
            this.f26540n = zwy.ni7();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f26539k.hasNext() || this.f26540n.hasNext();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public qh4d.InterfaceC4517k<R, C, V> next() {
            if (!this.f26540n.hasNext()) {
                Map.Entry<R, Map<C, V>> next = this.f26539k.next();
                this.f26541q = next;
                this.f26540n = next.getValue().entrySet().iterator();
            }
            Map.Entry<C, V> next2 = this.f26540n.next();
            return hyow.zy(this.f26541q.getKey(), next2.getKey(), next2.getValue());
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f26540n.remove();
            if (this.f26541q.getValue().isEmpty()) {
                this.f26539k.remove();
                this.f26541q = null;
            }
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.ovdh$y */
    /* JADX INFO: compiled from: StandardTable.java */
    class C4506y extends vy.AbstractC4543l<R, Map<C, V>> {

        /* JADX INFO: renamed from: com.google.common.collect.ovdh$y$k */
        /* JADX INFO: compiled from: StandardTable.java */
        class k extends ovdh<R, C, V>.AbstractC4505s<Map.Entry<R, Map<C, V>>> {

            /* JADX INFO: renamed from: com.google.common.collect.ovdh$y$k$k, reason: collision with other inner class name */
            /* JADX INFO: compiled from: StandardTable.java */
            class C7997k implements com.google.common.base.t8r<R, Map<C, V>> {
                C7997k() {
                }

                @Override // com.google.common.base.t8r
                /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
                public Map<C, V> apply(R r2) {
                    return ovdh.this.row(r2);
                }
            }

            k() {
                super();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return entry.getKey() != null && (entry.getValue() instanceof Map) && mcp.ld6(ovdh.this.backingMap.entrySet(), entry);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<R, Map<C, V>>> iterator() {
                return vy.qrj(ovdh.this.backingMap.keySet(), new C7997k());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return entry.getKey() != null && (entry.getValue() instanceof Map) && ovdh.this.backingMap.entrySet().remove(entry);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return ovdh.this.backingMap.size();
            }
        }

        C4506y() {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return ovdh.this.containsRow(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Map<C, V> remove(Object obj) {
            if (obj == null) {
                return null;
            }
            return ovdh.this.backingMap.remove(obj);
        }

        @Override // com.google.common.collect.vy.AbstractC4543l
        /* JADX INFO: renamed from: k */
        protected Set<Map.Entry<R, Map<C, V>>> mo15821k() {
            return new k();
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public Map<C, V> get(Object obj) {
            if (ovdh.this.containsRow(obj)) {
                return ovdh.this.row(obj);
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: StandardTable.java */
    private class zy extends vy.AbstractC4543l<R, V> {

        /* JADX INFO: renamed from: g */
        final C f26545g;

        /* JADX INFO: renamed from: com.google.common.collect.ovdh$zy$k */
        /* JADX INFO: compiled from: StandardTable.java */
        private class C4507k extends g0ad.ld6<Map.Entry<R, V>> {
            private C4507k() {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public void clear() {
                zy.this.m15960q(com.google.common.base.fti.zy());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return ovdh.this.m15949k(entry.getKey(), zy.this.f26545g, entry.getValue());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean isEmpty() {
                zy zyVar = zy.this;
                return !ovdh.this.containsColumn(zyVar.f26545g);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<R, V>> iterator() {
                return new toq();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return ovdh.this.m15950q(entry.getKey(), zy.this.f26545g, entry.getValue());
            }

            @Override // com.google.common.collect.g0ad.ld6, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> collection) {
                return zy.this.m15960q(com.google.common.base.fti.cdj(com.google.common.base.fti.n7h(collection)));
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                Iterator<Map<C, V>> it = ovdh.this.backingMap.values().iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    if (it.next().containsKey(zy.this.f26545g)) {
                        i2++;
                    }
                }
                return i2;
            }
        }

        /* JADX INFO: renamed from: com.google.common.collect.ovdh$zy$q */
        /* JADX INFO: compiled from: StandardTable.java */
        private class C4508q extends vy.ncyb<R, V> {
            C4508q() {
                super(zy.this);
            }

            @Override // com.google.common.collect.vy.ncyb, java.util.AbstractCollection, java.util.Collection
            public boolean remove(Object obj) {
                return obj != null && zy.this.m15960q(vy.i9jn(com.google.common.base.fti.qrj(obj)));
            }

            @Override // com.google.common.collect.vy.ncyb, java.util.AbstractCollection, java.util.Collection
            public boolean removeAll(Collection<?> collection) {
                return zy.this.m15960q(vy.i9jn(com.google.common.base.fti.n7h(collection)));
            }

            @Override // com.google.common.collect.vy.ncyb, java.util.AbstractCollection, java.util.Collection
            public boolean retainAll(Collection<?> collection) {
                return zy.this.m15960q(vy.i9jn(com.google.common.base.fti.cdj(com.google.common.base.fti.n7h(collection))));
            }
        }

        /* JADX INFO: compiled from: StandardTable.java */
        private class toq extends com.google.common.collect.zy<Map.Entry<R, V>> {

            /* JADX INFO: renamed from: n */
            final Iterator<Map.Entry<R, Map<C, V>>> f26550n;

            /* JADX INFO: renamed from: com.google.common.collect.ovdh$zy$toq$k */
            /* JADX INFO: compiled from: StandardTable.java */
            class C4509k extends com.google.common.collect.f7l8<R, V> {

                /* JADX INFO: renamed from: k */
                final /* synthetic */ Map.Entry f26551k;

                C4509k(Map.Entry entry) {
                    this.f26551k = entry;
                }

                @Override // com.google.common.collect.f7l8, java.util.Map.Entry
                public R getKey() {
                    return (R) this.f26551k.getKey();
                }

                @Override // com.google.common.collect.f7l8, java.util.Map.Entry
                public V getValue() {
                    return (V) ((Map) this.f26551k.getValue()).get(zy.this.f26545g);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.common.collect.f7l8, java.util.Map.Entry
                public V setValue(V v2) {
                    return (V) ((Map) this.f26551k.getValue()).put(zy.this.f26545g, com.google.common.base.jk.a9(v2));
                }
            }

            private toq() {
                this.f26550n = ovdh.this.backingMap.entrySet().iterator();
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.zy
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public Map.Entry<R, V> mo15703k() {
                while (this.f26550n.hasNext()) {
                    Map.Entry<R, Map<C, V>> next = this.f26550n.next();
                    if (next.getValue().containsKey(zy.this.f26545g)) {
                        return new C4509k(next);
                    }
                }
                return toq();
            }
        }

        /* JADX INFO: renamed from: com.google.common.collect.ovdh$zy$zy, reason: collision with other inner class name */
        /* JADX INFO: compiled from: StandardTable.java */
        private class C7998zy extends vy.C4550t<R, V> {
            C7998zy() {
                super(zy.this);
            }

            @Override // com.google.common.collect.vy.C4550t, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                zy zyVar = zy.this;
                return ovdh.this.contains(obj, zyVar.f26545g);
            }

            @Override // com.google.common.collect.vy.C4550t, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                zy zyVar = zy.this;
                return ovdh.this.remove(obj, zyVar.f26545g) != null;
            }

            @Override // com.google.common.collect.g0ad.ld6, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> collection) {
                return zy.this.m15960q(vy.m16013f(com.google.common.base.fti.cdj(com.google.common.base.fti.n7h(collection))));
            }
        }

        zy(C c2) {
            this.f26545g = (C) com.google.common.base.jk.a9(c2);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return ovdh.this.contains(obj, this.f26545g);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V get(Object obj) {
            return (V) ovdh.this.get(obj, this.f26545g);
        }

        @Override // com.google.common.collect.vy.AbstractC4543l
        /* JADX INFO: renamed from: k */
        Set<Map.Entry<R, V>> mo15821k() {
            return new C4507k();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V put(R r2, V v2) {
            return (V) ovdh.this.put(r2, this.f26545g, v2);
        }

        @CanIgnoreReturnValue
        /* JADX INFO: renamed from: q */
        boolean m15960q(com.google.common.base.a9<? super Map.Entry<R, V>> a9Var) {
            Iterator<Map.Entry<R, Map<C, V>>> it = ovdh.this.backingMap.entrySet().iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                Map.Entry<R, Map<C, V>> next = it.next();
                Map<C, V> value = next.getValue();
                V v2 = value.get(this.f26545g);
                if (v2 != null && a9Var.apply(vy.dd(next.getKey(), v2))) {
                    value.remove(this.f26545g);
                    z2 = true;
                    if (value.isEmpty()) {
                        it.remove();
                    }
                }
            }
            return z2;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V remove(Object obj) {
            return (V) ovdh.this.remove(obj, this.f26545g);
        }

        @Override // com.google.common.collect.vy.AbstractC4543l
        /* JADX INFO: renamed from: toq */
        Set<R> mo15887y() {
            return new C7998zy();
        }

        @Override // com.google.common.collect.vy.AbstractC4543l
        Collection<V> zy() {
            return new C4508q();
        }
    }

    ovdh(Map<R, Map<C, V>> map, com.google.common.base.lvui<? extends Map<C, V>> lvuiVar) {
        this.backingMap = map;
        this.factory = lvuiVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public boolean m15949k(Object obj, Object obj2, Object obj3) {
        return obj3 != null && obj3.equals(get(obj, obj2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public boolean m15950q(Object obj, Object obj2, Object obj3) {
        if (!m15949k(obj, obj2, obj3)) {
            return false;
        }
        remove(obj, obj2);
        return true;
    }

    private Map<C, V> toq(R r2) {
        Map<C, V> map = this.backingMap.get(r2);
        if (map != null) {
            return map;
        }
        Map<C, V> map2 = this.factory.get();
        this.backingMap.put(r2, map2);
        return map2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @CanIgnoreReturnValue
    public Map<R, V> zy(Object obj) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<R, Map<C, V>>> it = this.backingMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<R, Map<C, V>> next = it.next();
            V vRemove = next.getValue().remove(obj);
            if (vRemove != null) {
                linkedHashMap.put(next.getKey(), vRemove);
                if (next.getValue().isEmpty()) {
                    it.remove();
                }
            }
        }
        return linkedHashMap;
    }

    @Override // com.google.common.collect.cdj
    Iterator<qh4d.InterfaceC4517k<R, C, V>> cellIterator() {
        return new toq();
    }

    @Override // com.google.common.collect.cdj, com.google.common.collect.qh4d
    public Set<qh4d.InterfaceC4517k<R, C, V>> cellSet() {
        return super.cellSet();
    }

    @Override // com.google.common.collect.cdj, com.google.common.collect.qh4d
    public void clear() {
        this.backingMap.clear();
    }

    @Override // com.google.common.collect.qh4d
    public Map<R, V> column(C c2) {
        return new zy(c2);
    }

    @Override // com.google.common.collect.cdj, com.google.common.collect.qh4d
    public Set<C> columnKeySet() {
        Set<C> set = this.f26519n;
        if (set != null) {
            return set;
        }
        C4503n c4503n = new C4503n();
        this.f26519n = c4503n;
        return c4503n;
    }

    @Override // com.google.common.collect.qh4d
    public Map<C, Map<R, V>> columnMap() {
        ovdh<R, C, V>.C4501g c4501g = this.f26520y;
        if (c4501g != null) {
            return c4501g;
        }
        ovdh<R, C, V>.C4501g c4501g2 = new C4501g();
        this.f26520y = c4501g2;
        return c4501g2;
    }

    @Override // com.google.common.collect.cdj, com.google.common.collect.qh4d
    public boolean contains(@NullableDecl Object obj, @NullableDecl Object obj2) {
        return (obj == null || obj2 == null || !super.contains(obj, obj2)) ? false : true;
    }

    @Override // com.google.common.collect.cdj, com.google.common.collect.qh4d
    public boolean containsColumn(@NullableDecl Object obj) {
        if (obj == null) {
            return false;
        }
        Iterator<Map<C, V>> it = this.backingMap.values().iterator();
        while (it.hasNext()) {
            if (vy.m16030x(it.next(), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.common.collect.cdj, com.google.common.collect.qh4d
    public boolean containsRow(@NullableDecl Object obj) {
        return obj != null && vy.m16030x(this.backingMap, obj);
    }

    @Override // com.google.common.collect.cdj, com.google.common.collect.qh4d
    public boolean containsValue(@NullableDecl Object obj) {
        return obj != null && super.containsValue(obj);
    }

    Iterator<C> createColumnKeyIterator() {
        return new C4504q();
    }

    Map<R, Map<C, V>> createRowMap() {
        return new C4506y();
    }

    @Override // com.google.common.collect.cdj, com.google.common.collect.qh4d
    public V get(@NullableDecl Object obj, @NullableDecl Object obj2) {
        if (obj == null || obj2 == null) {
            return null;
        }
        return (V) super.get(obj, obj2);
    }

    @Override // com.google.common.collect.cdj, com.google.common.collect.qh4d
    public boolean isEmpty() {
        return this.backingMap.isEmpty();
    }

    @Override // com.google.common.collect.cdj, com.google.common.collect.qh4d
    @CanIgnoreReturnValue
    public V put(R r2, C c2, V v2) {
        com.google.common.base.jk.a9(r2);
        com.google.common.base.jk.a9(c2);
        com.google.common.base.jk.a9(v2);
        return toq(r2).put(c2, v2);
    }

    @Override // com.google.common.collect.cdj, com.google.common.collect.qh4d
    @CanIgnoreReturnValue
    public V remove(@NullableDecl Object obj, @NullableDecl Object obj2) {
        Map map;
        if (obj == null || obj2 == null || (map = (Map) vy.ch(this.backingMap, obj)) == null) {
            return null;
        }
        V v2 = (V) map.remove(obj2);
        if (map.isEmpty()) {
            this.backingMap.remove(obj);
        }
        return v2;
    }

    @Override // com.google.common.collect.qh4d
    public Map<C, V> row(R r2) {
        return new f7l8(r2);
    }

    @Override // com.google.common.collect.cdj, com.google.common.collect.qh4d
    public Set<R> rowKeySet() {
        return rowMap().keySet();
    }

    @Override // com.google.common.collect.qh4d
    public Map<R, Map<C, V>> rowMap() {
        Map<R, Map<C, V>> map = this.f26518g;
        if (map != null) {
            return map;
        }
        Map<R, Map<C, V>> mapCreateRowMap = createRowMap();
        this.f26518g = mapCreateRowMap;
        return mapCreateRowMap;
    }

    @Override // com.google.common.collect.qh4d
    public int size() {
        Iterator<Map<C, V>> it = this.backingMap.values().iterator();
        int size = 0;
        while (it.hasNext()) {
            size += it.next().size();
        }
        return size;
    }

    @Override // com.google.common.collect.cdj, com.google.common.collect.qh4d
    public Collection<V> values() {
        return super.values();
    }
}
