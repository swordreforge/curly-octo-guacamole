package androidx.collection;

import java.lang.reflect.Array;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import zy.dd;
import zy.lvui;

/* JADX INFO: renamed from: androidx.collection.k */
/* JADX INFO: compiled from: ArrayMap.java */
/* JADX INFO: loaded from: classes.dex */
public class C0247k<K, V> extends qrj<K, V> implements Map<K, V> {

    /* JADX INFO: renamed from: c */
    @dd
    C0247k<K, V>.n f1320c;

    /* JADX INFO: renamed from: f */
    @dd
    C0247k<K, V>.zy f1321f;

    /* JADX INFO: renamed from: l */
    @dd
    C0247k<K, V>.k f1322l;

    /* JADX INFO: renamed from: androidx.collection.k$g */
    /* JADX INFO: compiled from: ArrayMap.java */
    final class g extends AbstractC0255y<V> {
        g() {
            super(C0247k.this.f1362n);
        }

        @Override // androidx.collection.AbstractC0255y
        /* JADX INFO: renamed from: k */
        protected V mo825k(int i2) {
            return C0247k.this.m873h(i2);
        }

        @Override // androidx.collection.AbstractC0255y
        protected void toq(int i2) {
            C0247k.this.n7h(i2);
        }
    }

    /* JADX INFO: renamed from: androidx.collection.k$k */
    /* JADX INFO: compiled from: ArrayMap.java */
    final class k extends AbstractSet<Map.Entry<K, V>> {
        k() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new q();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C0247k.this.f1362n;
        }
    }

    /* JADX INFO: renamed from: androidx.collection.k$q */
    /* JADX INFO: compiled from: ArrayMap.java */
    final class q implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* JADX INFO: renamed from: k */
        int f1327k;

        /* JADX INFO: renamed from: n */
        boolean f1328n;

        /* JADX INFO: renamed from: q */
        int f1329q = -1;

        q() {
            this.f1327k = C0247k.this.f1362n - 1;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!this.f1328n) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return f7l8.zy(entry.getKey(), C0247k.this.ld6(this.f1329q)) && f7l8.zy(entry.getValue(), C0247k.this.m873h(this.f1329q));
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            if (this.f1328n) {
                return C0247k.this.ld6(this.f1329q);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            if (this.f1328n) {
                return C0247k.this.m873h(this.f1329q);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f1329q < this.f1327k;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            if (!this.f1328n) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            K kLd6 = C0247k.this.ld6(this.f1329q);
            V vM873h = C0247k.this.m873h(this.f1329q);
            return (kLd6 == null ? 0 : kLd6.hashCode()) ^ (vM873h != null ? vM873h.hashCode() : 0);
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f1329q++;
            this.f1328n = true;
            return this;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f1328n) {
                throw new IllegalStateException();
            }
            C0247k.this.n7h(this.f1329q);
            this.f1329q--;
            this.f1327k--;
            this.f1328n = false;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v2) {
            if (this.f1328n) {
                return C0247k.this.kja0(this.f1329q, v2);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* JADX INFO: renamed from: androidx.collection.k$toq */
    /* JADX INFO: compiled from: ArrayMap.java */
    final class toq extends AbstractC0255y<K> {
        toq() {
            super(C0247k.this.f1362n);
        }

        @Override // androidx.collection.AbstractC0255y
        /* JADX INFO: renamed from: k */
        protected K mo825k(int i2) {
            return C0247k.this.ld6(i2);
        }

        @Override // androidx.collection.AbstractC0255y
        protected void toq(int i2) {
            C0247k.this.n7h(i2);
        }
    }

    public C0247k() {
    }

    static <T> boolean t8r(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public boolean cdj(@lvui Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Map
    @lvui
    public Set<Map.Entry<K, V>> entrySet() {
        C0247k<K, V>.k kVar = this.f1322l;
        if (kVar != null) {
            return kVar;
        }
        C0247k<K, V>.k kVar2 = new k();
        this.f1322l = kVar2;
        return kVar2;
    }

    public boolean fn3e(@lvui Collection<?> collection) {
        int i2 = this.f1362n;
        for (int i3 = i2 - 1; i3 >= 0; i3--) {
            if (!collection.contains(ld6(i3))) {
                n7h(i3);
            }
        }
        return i2 != this.f1362n;
    }

    /* JADX INFO: renamed from: i */
    public boolean m824i(@lvui Collection<?> collection) {
        int i2 = this.f1362n;
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
        return i2 != this.f1362n;
    }

    @Override // java.util.Map
    @lvui
    public Set<K> keySet() {
        C0247k<K, V>.zy zyVar = this.f1321f;
        if (zyVar != null) {
            return zyVar;
        }
        C0247k<K, V>.zy zyVar2 = new zy();
        this.f1321f = zyVar2;
        return zyVar2;
    }

    @Override // java.util.Map
    public void putAll(@lvui Map<? extends K, ? extends V> map) {
        zy(this.f1362n + map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    @lvui
    public Collection<V> values() {
        C0247k<K, V>.n nVar = this.f1320c;
        if (nVar != null) {
            return nVar;
        }
        C0247k<K, V>.n nVar2 = new n();
        this.f1320c = nVar2;
        return nVar2;
    }

    <T> T[] zurt(T[] tArr, int i2) {
        int i3 = this.f1362n;
        if (tArr.length < i3) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i3));
        }
        for (int i4 = 0; i4 < i3; i4++) {
            tArr[i4] = this.f1363q[(i4 << 1) + i2];
        }
        if (tArr.length > i3) {
            tArr[i3] = null;
        }
        return tArr;
    }

    public C0247k(int i2) {
        super(i2);
    }

    /* JADX INFO: renamed from: androidx.collection.k$n */
    /* JADX INFO: compiled from: ArrayMap.java */
    final class n implements Collection<V> {
        n() {
        }

        @Override // java.util.Collection
        public boolean add(V v2) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public void clear() {
            C0247k.this.clear();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return C0247k.this.m874p(obj) >= 0;
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return C0247k.this.isEmpty();
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new g();
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            int iM874p = C0247k.this.m874p(obj);
            if (iM874p < 0) {
                return false;
            }
            C0247k.this.n7h(iM874p);
            return true;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            int i2 = C0247k.this.f1362n;
            int i3 = 0;
            boolean z2 = false;
            while (i3 < i2) {
                if (collection.contains(C0247k.this.m873h(i3))) {
                    C0247k.this.n7h(i3);
                    i3--;
                    i2--;
                    z2 = true;
                }
                i3++;
            }
            return z2;
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            int i2 = C0247k.this.f1362n;
            int i3 = 0;
            boolean z2 = false;
            while (i3 < i2) {
                if (!collection.contains(C0247k.this.m873h(i3))) {
                    C0247k.this.n7h(i3);
                    i3--;
                    i2--;
                    z2 = true;
                }
                i3++;
            }
            return z2;
        }

        @Override // java.util.Collection
        public int size() {
            return C0247k.this.f1362n;
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            int i2 = C0247k.this.f1362n;
            Object[] objArr = new Object[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                objArr[i3] = C0247k.this.m873h(i3);
            }
            return objArr;
        }

        @Override // java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) C0247k.this.zurt(tArr, 1);
        }
    }

    /* JADX INFO: renamed from: androidx.collection.k$zy */
    /* JADX INFO: compiled from: ArrayMap.java */
    final class zy implements Set<K> {
        zy() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(K k2) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            C0247k.this.clear();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return C0247k.this.containsKey(obj);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return C0247k.this.cdj(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return C0247k.t8r(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int iHashCode = 0;
            for (int i2 = C0247k.this.f1362n - 1; i2 >= 0; i2--) {
                K kLd6 = C0247k.this.ld6(i2);
                iHashCode += kLd6 == null ? 0 : kLd6.hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return C0247k.this.isEmpty();
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<K> iterator() {
            return new toq();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int iF7l8 = C0247k.this.f7l8(obj);
            if (iF7l8 < 0) {
                return false;
            }
            C0247k.this.n7h(iF7l8);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            return C0247k.this.m824i(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            return C0247k.this.fn3e(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return C0247k.this.f1362n;
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            int i2 = C0247k.this.f1362n;
            Object[] objArr = new Object[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                objArr[i3] = C0247k.this.ld6(i3);
            }
            return objArr;
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) C0247k.this.zurt(tArr, 0);
        }
    }

    public C0247k(qrj qrjVar) {
        super(qrjVar);
    }
}
