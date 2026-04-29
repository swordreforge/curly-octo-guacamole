package com.google.gson.internal;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: renamed from: com.google.gson.internal.p */
/* JADX INFO: compiled from: LinkedTreeMap.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C4904p<K, V> extends AbstractMap<K, V> implements Serializable {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    /* JADX INFO: renamed from: k */
    private static final Comparator<Comparable> f27749k = new k();
    Comparator<? super K> comparator;
    private C4904p<K, V>.toq entrySet;
    final n<K, V> header;
    private C4904p<K, V>.zy keySet;
    int modCount;
    n<K, V> root;
    int size;

    /* JADX INFO: renamed from: com.google.gson.internal.p$k */
    /* JADX INFO: compiled from: LinkedTreeMap.java */
    class k implements Comparator<Comparable> {
        k() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.p$q */
    /* JADX INFO: compiled from: LinkedTreeMap.java */
    private abstract class q<T> implements Iterator<T> {

        /* JADX INFO: renamed from: k */
        n<K, V> f27759k;

        /* JADX INFO: renamed from: n */
        int f27760n;

        /* JADX INFO: renamed from: q */
        n<K, V> f27761q = null;

        q() {
            this.f27759k = C4904p.this.header.f27750g;
            this.f27760n = C4904p.this.modCount;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f27759k != C4904p.this.header;
        }

        /* JADX INFO: renamed from: k */
        final n<K, V> m17174k() {
            n<K, V> nVar = this.f27759k;
            C4904p c4904p = C4904p.this;
            if (nVar == c4904p.header) {
                throw new NoSuchElementException();
            }
            if (c4904p.modCount != this.f27760n) {
                throw new ConcurrentModificationException();
            }
            this.f27759k = nVar.f27750g;
            this.f27761q = nVar;
            return nVar;
        }

        @Override // java.util.Iterator
        public final void remove() {
            n<K, V> nVar = this.f27761q;
            if (nVar == null) {
                throw new IllegalStateException();
            }
            C4904p.this.removeInternal(nVar, true);
            this.f27761q = null;
            this.f27760n = C4904p.this.modCount;
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.p$toq */
    /* JADX INFO: compiled from: LinkedTreeMap.java */
    class toq extends AbstractSet<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: com.google.gson.internal.p$toq$k */
        /* JADX INFO: compiled from: LinkedTreeMap.java */
        class k extends C4904p<K, V>.q<Map.Entry<K, V>> {
            k() {
                super();
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> next() {
                return m17174k();
            }
        }

        toq() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C4904p.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && C4904p.this.findByEntry((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new k();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            n<K, V> nVarFindByEntry;
            if (!(obj instanceof Map.Entry) || (nVarFindByEntry = C4904p.this.findByEntry((Map.Entry) obj)) == null) {
                return false;
            }
            C4904p.this.removeInternal(nVarFindByEntry, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C4904p.this.size;
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.p$zy */
    /* JADX INFO: compiled from: LinkedTreeMap.java */
    final class zy extends AbstractSet<K> {

        /* JADX INFO: renamed from: com.google.gson.internal.p$zy$k */
        /* JADX INFO: compiled from: LinkedTreeMap.java */
        class k extends C4904p<K, V>.q<K> {
            k() {
                super();
            }

            @Override // java.util.Iterator
            public K next() {
                return m17174k().f27756s;
            }
        }

        zy() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C4904p.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return C4904p.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new k();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return C4904p.this.removeInternalByKey(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C4904p.this.size;
        }
    }

    public C4904p() {
        this(f27749k);
    }

    /* JADX INFO: renamed from: g */
    private void m17169g(n<K, V> nVar) {
        n<K, V> nVar2 = nVar.f27755q;
        n<K, V> nVar3 = nVar.f27753n;
        n<K, V> nVar4 = nVar2.f27755q;
        n<K, V> nVar5 = nVar2.f27753n;
        nVar.f27755q = nVar5;
        if (nVar5 != null) {
            nVar5.f27752k = nVar;
        }
        zy(nVar, nVar2);
        nVar2.f27753n = nVar;
        nVar.f27752k = nVar2;
        int iMax = Math.max(nVar3 != null ? nVar3.f27751h : 0, nVar5 != null ? nVar5.f27751h : 0) + 1;
        nVar.f27751h = iMax;
        nVar2.f27751h = Math.max(iMax, nVar4 != null ? nVar4.f27751h : 0) + 1;
    }

    /* JADX INFO: renamed from: k */
    private boolean m17170k(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* JADX INFO: renamed from: q */
    private void m17171q(n<K, V> nVar) {
        n<K, V> nVar2 = nVar.f27755q;
        n<K, V> nVar3 = nVar.f27753n;
        n<K, V> nVar4 = nVar3.f27755q;
        n<K, V> nVar5 = nVar3.f27753n;
        nVar.f27753n = nVar4;
        if (nVar4 != null) {
            nVar4.f27752k = nVar;
        }
        zy(nVar, nVar3);
        nVar3.f27755q = nVar;
        nVar.f27752k = nVar3;
        int iMax = Math.max(nVar2 != null ? nVar2.f27751h : 0, nVar4 != null ? nVar4.f27751h : 0) + 1;
        nVar.f27751h = iMax;
        nVar3.f27751h = Math.max(iMax, nVar5 != null ? nVar5.f27751h : 0) + 1;
    }

    private void toq(n<K, V> nVar, boolean z2) {
        while (nVar != null) {
            n<K, V> nVar2 = nVar.f27755q;
            n<K, V> nVar3 = nVar.f27753n;
            int i2 = nVar2 != null ? nVar2.f27751h : 0;
            int i3 = nVar3 != null ? nVar3.f27751h : 0;
            int i4 = i2 - i3;
            if (i4 == -2) {
                n<K, V> nVar4 = nVar3.f27755q;
                n<K, V> nVar5 = nVar3.f27753n;
                int i5 = (nVar4 != null ? nVar4.f27751h : 0) - (nVar5 != null ? nVar5.f27751h : 0);
                if (i5 == -1 || (i5 == 0 && !z2)) {
                    m17171q(nVar);
                } else {
                    m17169g(nVar3);
                    m17171q(nVar);
                }
                if (z2) {
                    return;
                }
            } else if (i4 == 2) {
                n<K, V> nVar6 = nVar2.f27755q;
                n<K, V> nVar7 = nVar2.f27753n;
                int i6 = (nVar6 != null ? nVar6.f27751h : 0) - (nVar7 != null ? nVar7.f27751h : 0);
                if (i6 == 1 || (i6 == 0 && !z2)) {
                    m17169g(nVar);
                } else {
                    m17171q(nVar2);
                    m17169g(nVar);
                }
                if (z2) {
                    return;
                }
            } else if (i4 == 0) {
                nVar.f27751h = i2 + 1;
                if (z2) {
                    return;
                }
            } else {
                nVar.f27751h = Math.max(i2, i3) + 1;
                if (!z2) {
                    return;
                }
            }
            nVar = nVar.f27752k;
        }
    }

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    private void zy(n<K, V> nVar, n<K, V> nVar2) {
        n<K, V> nVar3 = nVar.f27752k;
        nVar.f27752k = null;
        if (nVar2 != null) {
            nVar2.f27752k = nVar3;
        }
        if (nVar3 == null) {
            this.root = nVar2;
        } else if (nVar3.f27755q == nVar) {
            nVar3.f27755q = nVar2;
        } else {
            nVar3.f27753n = nVar2;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.root = null;
        this.size = 0;
        this.modCount++;
        n<K, V> nVar = this.header;
        nVar.f27757y = nVar;
        nVar.f27750g = nVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return findByObject(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        C4904p<K, V>.toq toqVar = this.entrySet;
        if (toqVar != null) {
            return toqVar;
        }
        C4904p<K, V>.toq toqVar2 = new toq();
        this.entrySet = toqVar2;
        return toqVar2;
    }

    n<K, V> find(K k2, boolean z2) {
        int iCompareTo;
        n<K, V> nVar;
        Comparator<? super K> comparator = this.comparator;
        n<K, V> nVar2 = this.root;
        if (nVar2 != null) {
            Comparable comparable = comparator == f27749k ? (Comparable) k2 : null;
            while (true) {
                iCompareTo = comparable != null ? comparable.compareTo(nVar2.f27756s) : comparator.compare(k2, nVar2.f27756s);
                if (iCompareTo == 0) {
                    return nVar2;
                }
                n<K, V> nVar3 = iCompareTo < 0 ? nVar2.f27755q : nVar2.f27753n;
                if (nVar3 == null) {
                    break;
                }
                nVar2 = nVar3;
            }
        } else {
            iCompareTo = 0;
        }
        if (!z2) {
            return null;
        }
        n<K, V> nVar4 = this.header;
        if (nVar2 != null) {
            nVar = new n<>(nVar2, k2, nVar4, nVar4.f27757y);
            if (iCompareTo < 0) {
                nVar2.f27755q = nVar;
            } else {
                nVar2.f27753n = nVar;
            }
            toq(nVar2, true);
        } else {
            if (comparator == f27749k && !(k2 instanceof Comparable)) {
                throw new ClassCastException(k2.getClass().getName() + " is not Comparable");
            }
            nVar = new n<>(nVar2, k2, nVar4, nVar4.f27757y);
            this.root = nVar;
        }
        this.size++;
        this.modCount++;
        return nVar;
    }

    n<K, V> findByEntry(Map.Entry<?, ?> entry) {
        n<K, V> nVarFindByObject = findByObject(entry.getKey());
        if (nVarFindByObject != null && m17170k(nVarFindByObject.f27754p, entry.getValue())) {
            return nVarFindByObject;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    n<K, V> findByObject(Object obj) {
        if (obj == 0) {
            return null;
        }
        try {
            return find(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        n<K, V> nVarFindByObject = findByObject(obj);
        if (nVarFindByObject != null) {
            return nVarFindByObject.f27754p;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        C4904p<K, V>.zy zyVar = this.keySet;
        if (zyVar != null) {
            return zyVar;
        }
        C4904p<K, V>.zy zyVar2 = new zy();
        this.keySet = zyVar2;
        return zyVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k2, V v2) {
        if (k2 == null) {
            throw new NullPointerException("key == null");
        }
        n<K, V> nVarFind = find(k2, true);
        V v3 = nVarFind.f27754p;
        nVarFind.f27754p = v2;
        return v3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        n<K, V> nVarRemoveInternalByKey = removeInternalByKey(obj);
        if (nVarRemoveInternalByKey != null) {
            return nVarRemoveInternalByKey.f27754p;
        }
        return null;
    }

    void removeInternal(n<K, V> nVar, boolean z2) {
        int i2;
        if (z2) {
            n<K, V> nVar2 = nVar.f27757y;
            nVar2.f27750g = nVar.f27750g;
            nVar.f27750g.f27757y = nVar2;
        }
        n<K, V> nVar3 = nVar.f27755q;
        n<K, V> nVar4 = nVar.f27753n;
        n<K, V> nVar5 = nVar.f27752k;
        int i3 = 0;
        if (nVar3 == null || nVar4 == null) {
            if (nVar3 != null) {
                zy(nVar, nVar3);
                nVar.f27755q = null;
            } else if (nVar4 != null) {
                zy(nVar, nVar4);
                nVar.f27753n = null;
            } else {
                zy(nVar, null);
            }
            toq(nVar5, false);
            this.size--;
            this.modCount++;
            return;
        }
        n<K, V> qVar = nVar3.f27751h > nVar4.f27751h ? nVar3.toq() : nVar4.m17173k();
        removeInternal(qVar, false);
        n<K, V> nVar6 = nVar.f27755q;
        if (nVar6 != null) {
            i2 = nVar6.f27751h;
            qVar.f27755q = nVar6;
            nVar6.f27752k = qVar;
            nVar.f27755q = null;
        } else {
            i2 = 0;
        }
        n<K, V> nVar7 = nVar.f27753n;
        if (nVar7 != null) {
            i3 = nVar7.f27751h;
            qVar.f27753n = nVar7;
            nVar7.f27752k = qVar;
            nVar.f27753n = null;
        }
        qVar.f27751h = Math.max(i2, i3) + 1;
        zy(nVar, qVar);
    }

    n<K, V> removeInternalByKey(Object obj) {
        n<K, V> nVarFindByObject = findByObject(obj);
        if (nVarFindByObject != null) {
            removeInternal(nVarFindByObject, true);
        }
        return nVarFindByObject;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.size;
    }

    public C4904p(Comparator<? super K> comparator) {
        this.size = 0;
        this.modCount = 0;
        this.header = new n<>();
        this.comparator = comparator == null ? f27749k : comparator;
    }

    /* JADX INFO: renamed from: com.google.gson.internal.p$n */
    /* JADX INFO: compiled from: LinkedTreeMap.java */
    static final class n<K, V> implements Map.Entry<K, V> {

        /* JADX INFO: renamed from: g */
        n<K, V> f27750g;

        /* JADX INFO: renamed from: h */
        int f27751h;

        /* JADX INFO: renamed from: k */
        n<K, V> f27752k;

        /* JADX INFO: renamed from: n */
        n<K, V> f27753n;

        /* JADX INFO: renamed from: p */
        V f27754p;

        /* JADX INFO: renamed from: q */
        n<K, V> f27755q;

        /* JADX INFO: renamed from: s */
        final K f27756s;

        /* JADX INFO: renamed from: y */
        n<K, V> f27757y;

        n() {
            this.f27756s = null;
            this.f27757y = this;
            this.f27750g = this;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            K k2 = this.f27756s;
            if (k2 == null) {
                if (entry.getKey() != null) {
                    return false;
                }
            } else if (!k2.equals(entry.getKey())) {
                return false;
            }
            V v2 = this.f27754p;
            if (v2 == null) {
                if (entry.getValue() != null) {
                    return false;
                }
            } else if (!v2.equals(entry.getValue())) {
                return false;
            }
            return true;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f27756s;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f27754p;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k2 = this.f27756s;
            int iHashCode = k2 == null ? 0 : k2.hashCode();
            V v2 = this.f27754p;
            return iHashCode ^ (v2 != null ? v2.hashCode() : 0);
        }

        /* JADX INFO: renamed from: k */
        public n<K, V> m17173k() {
            n<K, V> nVar = this;
            for (n<K, V> nVar2 = this.f27755q; nVar2 != null; nVar2 = nVar2.f27755q) {
                nVar = nVar2;
            }
            return nVar;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v2) {
            V v3 = this.f27754p;
            this.f27754p = v2;
            return v3;
        }

        public String toString() {
            return this.f27756s + "=" + this.f27754p;
        }

        public n<K, V> toq() {
            n<K, V> nVar = this;
            for (n<K, V> nVar2 = this.f27753n; nVar2 != null; nVar2 = nVar2.f27753n) {
                nVar = nVar2;
            }
            return nVar;
        }

        n(n<K, V> nVar, K k2, n<K, V> nVar2, n<K, V> nVar3) {
            this.f27752k = nVar;
            this.f27756s = k2;
            this.f27751h = 1;
            this.f27750g = nVar2;
            this.f27757y = nVar3;
            nVar3.f27750g = this;
            nVar2.f27757y = this;
        }
    }
}
