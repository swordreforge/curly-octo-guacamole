package com.google.gson.internal;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: renamed from: com.google.gson.internal.s */
/* JADX INFO: compiled from: LinkedHashTreeMap.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C4907s<K, V> extends AbstractMap<K, V> implements Serializable {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    /* JADX INFO: renamed from: k */
    private static final Comparator<Comparable> f27780k = new k();
    Comparator<? super K> comparator;
    private C4907s<K, V>.q entrySet;
    final f7l8<K, V> header;
    private C4907s<K, V>.n keySet;
    int modCount;
    int size;
    f7l8<K, V>[] table;
    int threshold;

    /* JADX INFO: renamed from: com.google.gson.internal.s$g */
    /* JADX INFO: compiled from: LinkedHashTreeMap.java */
    private abstract class g<T> implements Iterator<T> {

        /* JADX INFO: renamed from: k */
        f7l8<K, V> f27791k;

        /* JADX INFO: renamed from: n */
        int f27792n;

        /* JADX INFO: renamed from: q */
        f7l8<K, V> f27793q = null;

        g() {
            this.f27791k = C4907s.this.header.f27781g;
            this.f27792n = C4907s.this.modCount;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f27791k != C4907s.this.header;
        }

        /* JADX INFO: renamed from: k */
        final f7l8<K, V> m17192k() {
            f7l8<K, V> f7l8Var = this.f27791k;
            C4907s c4907s = C4907s.this;
            if (f7l8Var == c4907s.header) {
                throw new NoSuchElementException();
            }
            if (c4907s.modCount != this.f27792n) {
                throw new ConcurrentModificationException();
            }
            this.f27791k = f7l8Var.f27781g;
            this.f27793q = f7l8Var;
            return f7l8Var;
        }

        @Override // java.util.Iterator
        public final void remove() {
            f7l8<K, V> f7l8Var = this.f27793q;
            if (f7l8Var == null) {
                throw new IllegalStateException();
            }
            C4907s.this.removeInternal(f7l8Var, true);
            this.f27793q = null;
            this.f27792n = C4907s.this.modCount;
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.s$k */
    /* JADX INFO: compiled from: LinkedHashTreeMap.java */
    class k implements Comparator<Comparable> {
        k() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.s$n */
    /* JADX INFO: compiled from: LinkedHashTreeMap.java */
    final class n extends AbstractSet<K> {

        /* JADX INFO: renamed from: com.google.gson.internal.s$n$k */
        /* JADX INFO: compiled from: LinkedHashTreeMap.java */
        class k extends C4907s<K, V>.g<K> {
            k() {
                super();
            }

            @Override // java.util.Iterator
            public K next() {
                return m17192k().f27788s;
            }
        }

        n() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C4907s.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return C4907s.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new k();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return C4907s.this.removeInternalByKey(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C4907s.this.size;
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.s$q */
    /* JADX INFO: compiled from: LinkedHashTreeMap.java */
    final class q extends AbstractSet<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: com.google.gson.internal.s$q$k */
        /* JADX INFO: compiled from: LinkedHashTreeMap.java */
        class k extends C4907s<K, V>.g<Map.Entry<K, V>> {
            k() {
                super();
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> next() {
                return m17192k();
            }
        }

        q() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C4907s.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && C4907s.this.findByEntry((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new k();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            f7l8<K, V> f7l8VarFindByEntry;
            if (!(obj instanceof Map.Entry) || (f7l8VarFindByEntry = C4907s.this.findByEntry((Map.Entry) obj)) == null) {
                return false;
            }
            C4907s.this.removeInternal(f7l8VarFindByEntry, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C4907s.this.size;
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.s$toq */
    /* JADX INFO: compiled from: LinkedHashTreeMap.java */
    static final class toq<K, V> {

        /* JADX INFO: renamed from: k */
        private f7l8<K, V> f27798k;

        /* JADX INFO: renamed from: q */
        private int f27799q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private int f68786toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private int f68787zy;

        toq() {
        }

        /* JADX INFO: renamed from: k */
        void m17194k(f7l8<K, V> f7l8Var) {
            f7l8Var.f27785n = null;
            f7l8Var.f27784k = null;
            f7l8Var.f27787q = null;
            f7l8Var.f27783i = 1;
            int i2 = this.f68786toq;
            if (i2 > 0) {
                int i3 = this.f27799q;
                if ((i3 & 1) == 0) {
                    this.f27799q = i3 + 1;
                    this.f68786toq = i2 - 1;
                    this.f68787zy++;
                }
            }
            f7l8Var.f27784k = this.f27798k;
            this.f27798k = f7l8Var;
            int i4 = this.f27799q + 1;
            this.f27799q = i4;
            int i5 = this.f68786toq;
            if (i5 > 0 && (i4 & 1) == 0) {
                this.f27799q = i4 + 1;
                this.f68786toq = i5 - 1;
                this.f68787zy++;
            }
            int i6 = 4;
            while (true) {
                int i7 = i6 - 1;
                if ((this.f27799q & i7) != i7) {
                    return;
                }
                int i8 = this.f68787zy;
                if (i8 == 0) {
                    f7l8<K, V> f7l8Var2 = this.f27798k;
                    f7l8<K, V> f7l8Var3 = f7l8Var2.f27784k;
                    f7l8<K, V> f7l8Var4 = f7l8Var3.f27784k;
                    f7l8Var3.f27784k = f7l8Var4.f27784k;
                    this.f27798k = f7l8Var3;
                    f7l8Var3.f27787q = f7l8Var4;
                    f7l8Var3.f27785n = f7l8Var2;
                    f7l8Var3.f27783i = f7l8Var2.f27783i + 1;
                    f7l8Var4.f27784k = f7l8Var3;
                    f7l8Var2.f27784k = f7l8Var3;
                } else if (i8 == 1) {
                    f7l8<K, V> f7l8Var5 = this.f27798k;
                    f7l8<K, V> f7l8Var6 = f7l8Var5.f27784k;
                    this.f27798k = f7l8Var6;
                    f7l8Var6.f27785n = f7l8Var5;
                    f7l8Var6.f27783i = f7l8Var5.f27783i + 1;
                    f7l8Var5.f27784k = f7l8Var6;
                    this.f68787zy = 0;
                } else if (i8 == 2) {
                    this.f68787zy = 0;
                }
                i6 *= 2;
            }
        }

        void toq(int i2) {
            this.f68786toq = ((Integer.highestOneBit(i2) * 2) - 1) - i2;
            this.f27799q = 0;
            this.f68787zy = 0;
            this.f27798k = null;
        }

        f7l8<K, V> zy() {
            f7l8<K, V> f7l8Var = this.f27798k;
            if (f7l8Var.f27784k == null) {
                return f7l8Var;
            }
            throw new IllegalStateException();
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.s$zy */
    /* JADX INFO: compiled from: LinkedHashTreeMap.java */
    static class zy<K, V> {

        /* JADX INFO: renamed from: k */
        private f7l8<K, V> f27800k;

        zy() {
        }

        /* JADX INFO: renamed from: k */
        public f7l8<K, V> m17195k() {
            f7l8<K, V> f7l8Var = this.f27800k;
            if (f7l8Var == null) {
                return null;
            }
            f7l8<K, V> f7l8Var2 = f7l8Var.f27784k;
            f7l8Var.f27784k = null;
            f7l8<K, V> f7l8Var3 = f7l8Var.f27785n;
            while (true) {
                f7l8<K, V> f7l8Var4 = f7l8Var2;
                f7l8Var2 = f7l8Var3;
                if (f7l8Var2 == null) {
                    this.f27800k = f7l8Var4;
                    return f7l8Var;
                }
                f7l8Var2.f27784k = f7l8Var4;
                f7l8Var3 = f7l8Var2.f27787q;
            }
        }

        void toq(f7l8<K, V> f7l8Var) {
            f7l8<K, V> f7l8Var2 = null;
            while (f7l8Var != null) {
                f7l8Var.f27784k = f7l8Var2;
                f7l8Var2 = f7l8Var;
                f7l8Var = f7l8Var.f27787q;
            }
            this.f27800k = f7l8Var2;
        }
    }

    public C4907s() {
        this(f27780k);
    }

    static <K, V> f7l8<K, V>[] doubleCapacity(f7l8<K, V>[] f7l8VarArr) {
        int length = f7l8VarArr.length;
        f7l8<K, V>[] f7l8VarArr2 = new f7l8[length * 2];
        zy zyVar = new zy();
        toq toqVar = new toq();
        toq toqVar2 = new toq();
        for (int i2 = 0; i2 < length; i2++) {
            f7l8<K, V> f7l8Var = f7l8VarArr[i2];
            if (f7l8Var != null) {
                zyVar.toq(f7l8Var);
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    f7l8<K, V> f7l8VarM17195k = zyVar.m17195k();
                    if (f7l8VarM17195k == null) {
                        break;
                    }
                    if ((f7l8VarM17195k.f27786p & length) == 0) {
                        i3++;
                    } else {
                        i4++;
                    }
                }
                toqVar.toq(i3);
                toqVar2.toq(i4);
                zyVar.toq(f7l8Var);
                while (true) {
                    f7l8<K, V> f7l8VarM17195k2 = zyVar.m17195k();
                    if (f7l8VarM17195k2 == null) {
                        break;
                    }
                    if ((f7l8VarM17195k2.f27786p & length) == 0) {
                        toqVar.m17194k(f7l8VarM17195k2);
                    } else {
                        toqVar2.m17194k(f7l8VarM17195k2);
                    }
                }
                f7l8VarArr2[i2] = i3 > 0 ? toqVar.zy() : null;
                f7l8VarArr2[i2 + length] = i4 > 0 ? toqVar2.zy() : null;
            }
        }
        return f7l8VarArr2;
    }

    private void f7l8(f7l8<K, V> f7l8Var) {
        f7l8<K, V> f7l8Var2 = f7l8Var.f27787q;
        f7l8<K, V> f7l8Var3 = f7l8Var.f27785n;
        f7l8<K, V> f7l8Var4 = f7l8Var2.f27787q;
        f7l8<K, V> f7l8Var5 = f7l8Var2.f27785n;
        f7l8Var.f27787q = f7l8Var5;
        if (f7l8Var5 != null) {
            f7l8Var5.f27784k = f7l8Var;
        }
        m17189q(f7l8Var, f7l8Var2);
        f7l8Var2.f27785n = f7l8Var;
        f7l8Var.f27784k = f7l8Var2;
        int iMax = Math.max(f7l8Var3 != null ? f7l8Var3.f27783i : 0, f7l8Var5 != null ? f7l8Var5.f27783i : 0) + 1;
        f7l8Var.f27783i = iMax;
        f7l8Var2.f27783i = Math.max(iMax, f7l8Var4 != null ? f7l8Var4.f27783i : 0) + 1;
    }

    /* JADX INFO: renamed from: g */
    private void m17187g(f7l8<K, V> f7l8Var) {
        f7l8<K, V> f7l8Var2 = f7l8Var.f27787q;
        f7l8<K, V> f7l8Var3 = f7l8Var.f27785n;
        f7l8<K, V> f7l8Var4 = f7l8Var3.f27787q;
        f7l8<K, V> f7l8Var5 = f7l8Var3.f27785n;
        f7l8Var.f27785n = f7l8Var4;
        if (f7l8Var4 != null) {
            f7l8Var4.f27784k = f7l8Var;
        }
        m17189q(f7l8Var, f7l8Var3);
        f7l8Var3.f27787q = f7l8Var;
        f7l8Var.f27784k = f7l8Var3;
        int iMax = Math.max(f7l8Var2 != null ? f7l8Var2.f27783i : 0, f7l8Var4 != null ? f7l8Var4.f27783i : 0) + 1;
        f7l8Var.f27783i = iMax;
        f7l8Var3.f27783i = Math.max(iMax, f7l8Var5 != null ? f7l8Var5.f27783i : 0) + 1;
    }

    /* JADX INFO: renamed from: k */
    private void m17188k() {
        f7l8<K, V>[] f7l8VarArrDoubleCapacity = doubleCapacity(this.table);
        this.table = f7l8VarArrDoubleCapacity;
        this.threshold = (f7l8VarArrDoubleCapacity.length / 2) + (f7l8VarArrDoubleCapacity.length / 4);
    }

    /* JADX INFO: renamed from: q */
    private void m17189q(f7l8<K, V> f7l8Var, f7l8<K, V> f7l8Var2) {
        f7l8<K, V> f7l8Var3 = f7l8Var.f27784k;
        f7l8Var.f27784k = null;
        if (f7l8Var2 != null) {
            f7l8Var2.f27784k = f7l8Var3;
        }
        if (f7l8Var3 == null) {
            int i2 = f7l8Var.f27786p;
            this.table[i2 & (r0.length - 1)] = f7l8Var2;
        } else if (f7l8Var3.f27787q == f7l8Var) {
            f7l8Var3.f27787q = f7l8Var2;
        } else {
            f7l8Var3.f27785n = f7l8Var2;
        }
    }

    private boolean toq(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    /* JADX INFO: renamed from: y */
    private static int m17190y(int i2) {
        int i3 = i2 ^ ((i2 >>> 20) ^ (i2 >>> 12));
        return (i3 >>> 4) ^ ((i3 >>> 7) ^ i3);
    }

    private void zy(f7l8<K, V> f7l8Var, boolean z2) {
        while (f7l8Var != null) {
            f7l8<K, V> f7l8Var2 = f7l8Var.f27787q;
            f7l8<K, V> f7l8Var3 = f7l8Var.f27785n;
            int i2 = f7l8Var2 != null ? f7l8Var2.f27783i : 0;
            int i3 = f7l8Var3 != null ? f7l8Var3.f27783i : 0;
            int i4 = i2 - i3;
            if (i4 == -2) {
                f7l8<K, V> f7l8Var4 = f7l8Var3.f27787q;
                f7l8<K, V> f7l8Var5 = f7l8Var3.f27785n;
                int i5 = (f7l8Var4 != null ? f7l8Var4.f27783i : 0) - (f7l8Var5 != null ? f7l8Var5.f27783i : 0);
                if (i5 == -1 || (i5 == 0 && !z2)) {
                    m17187g(f7l8Var);
                } else {
                    f7l8(f7l8Var3);
                    m17187g(f7l8Var);
                }
                if (z2) {
                    return;
                }
            } else if (i4 == 2) {
                f7l8<K, V> f7l8Var6 = f7l8Var2.f27787q;
                f7l8<K, V> f7l8Var7 = f7l8Var2.f27785n;
                int i6 = (f7l8Var6 != null ? f7l8Var6.f27783i : 0) - (f7l8Var7 != null ? f7l8Var7.f27783i : 0);
                if (i6 == 1 || (i6 == 0 && !z2)) {
                    f7l8(f7l8Var);
                } else {
                    m17187g(f7l8Var2);
                    f7l8(f7l8Var);
                }
                if (z2) {
                    return;
                }
            } else if (i4 == 0) {
                f7l8Var.f27783i = i2 + 1;
                if (z2) {
                    return;
                }
            } else {
                f7l8Var.f27783i = Math.max(i2, i3) + 1;
                if (!z2) {
                    return;
                }
            }
            f7l8Var = f7l8Var.f27784k;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        Arrays.fill(this.table, (Object) null);
        this.size = 0;
        this.modCount++;
        f7l8<K, V> f7l8Var = this.header;
        f7l8<K, V> f7l8Var2 = f7l8Var.f27781g;
        while (f7l8Var2 != f7l8Var) {
            f7l8<K, V> f7l8Var3 = f7l8Var2.f27781g;
            f7l8Var2.f27789y = null;
            f7l8Var2.f27781g = null;
            f7l8Var2 = f7l8Var3;
        }
        f7l8Var.f27789y = f7l8Var;
        f7l8Var.f27781g = f7l8Var;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return findByObject(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        C4907s<K, V>.q qVar = this.entrySet;
        if (qVar != null) {
            return qVar;
        }
        C4907s<K, V>.q qVar2 = new q();
        this.entrySet = qVar2;
        return qVar2;
    }

    f7l8<K, V> find(K k2, boolean z2) {
        int iCompareTo;
        f7l8<K, V> f7l8Var;
        Comparator<? super K> comparator = this.comparator;
        f7l8<K, V>[] f7l8VarArr = this.table;
        int iM17190y = m17190y(k2.hashCode());
        int length = (f7l8VarArr.length - 1) & iM17190y;
        f7l8<K, V> f7l8Var2 = f7l8VarArr[length];
        if (f7l8Var2 != null) {
            Comparable comparable = comparator == f27780k ? (Comparable) k2 : null;
            while (true) {
                iCompareTo = comparable != null ? comparable.compareTo(f7l8Var2.f27788s) : comparator.compare(k2, f7l8Var2.f27788s);
                if (iCompareTo == 0) {
                    return f7l8Var2;
                }
                f7l8<K, V> f7l8Var3 = iCompareTo < 0 ? f7l8Var2.f27787q : f7l8Var2.f27785n;
                if (f7l8Var3 == null) {
                    break;
                }
                f7l8Var2 = f7l8Var3;
            }
        } else {
            iCompareTo = 0;
        }
        f7l8<K, V> f7l8Var4 = f7l8Var2;
        int i2 = iCompareTo;
        if (!z2) {
            return null;
        }
        f7l8<K, V> f7l8Var5 = this.header;
        if (f7l8Var4 != null) {
            f7l8Var = new f7l8<>(f7l8Var4, k2, iM17190y, f7l8Var5, f7l8Var5.f27789y);
            if (i2 < 0) {
                f7l8Var4.f27787q = f7l8Var;
            } else {
                f7l8Var4.f27785n = f7l8Var;
            }
            zy(f7l8Var4, true);
        } else {
            if (comparator == f27780k && !(k2 instanceof Comparable)) {
                throw new ClassCastException(k2.getClass().getName() + " is not Comparable");
            }
            f7l8Var = new f7l8<>(f7l8Var4, k2, iM17190y, f7l8Var5, f7l8Var5.f27789y);
            f7l8VarArr[length] = f7l8Var;
        }
        int i3 = this.size;
        this.size = i3 + 1;
        if (i3 > this.threshold) {
            m17188k();
        }
        this.modCount++;
        return f7l8Var;
    }

    f7l8<K, V> findByEntry(Map.Entry<?, ?> entry) {
        f7l8<K, V> f7l8VarFindByObject = findByObject(entry.getKey());
        if (f7l8VarFindByObject != null && toq(f7l8VarFindByObject.f27782h, entry.getValue())) {
            return f7l8VarFindByObject;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    f7l8<K, V> findByObject(Object obj) {
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
        f7l8<K, V> f7l8VarFindByObject = findByObject(obj);
        if (f7l8VarFindByObject != null) {
            return f7l8VarFindByObject.f27782h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        C4907s<K, V>.n nVar = this.keySet;
        if (nVar != null) {
            return nVar;
        }
        C4907s<K, V>.n nVar2 = new n();
        this.keySet = nVar2;
        return nVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k2, V v2) {
        if (k2 == null) {
            throw new NullPointerException("key == null");
        }
        f7l8<K, V> f7l8VarFind = find(k2, true);
        V v3 = f7l8VarFind.f27782h;
        f7l8VarFind.f27782h = v2;
        return v3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        f7l8<K, V> f7l8VarRemoveInternalByKey = removeInternalByKey(obj);
        if (f7l8VarRemoveInternalByKey != null) {
            return f7l8VarRemoveInternalByKey.f27782h;
        }
        return null;
    }

    void removeInternal(f7l8<K, V> f7l8Var, boolean z2) {
        int i2;
        if (z2) {
            f7l8<K, V> f7l8Var2 = f7l8Var.f27789y;
            f7l8Var2.f27781g = f7l8Var.f27781g;
            f7l8Var.f27781g.f27789y = f7l8Var2;
            f7l8Var.f27789y = null;
            f7l8Var.f27781g = null;
        }
        f7l8<K, V> f7l8Var3 = f7l8Var.f27787q;
        f7l8<K, V> f7l8Var4 = f7l8Var.f27785n;
        f7l8<K, V> f7l8Var5 = f7l8Var.f27784k;
        int i3 = 0;
        if (f7l8Var3 == null || f7l8Var4 == null) {
            if (f7l8Var3 != null) {
                m17189q(f7l8Var, f7l8Var3);
                f7l8Var.f27787q = null;
            } else if (f7l8Var4 != null) {
                m17189q(f7l8Var, f7l8Var4);
                f7l8Var.f27785n = null;
            } else {
                m17189q(f7l8Var, null);
            }
            zy(f7l8Var5, false);
            this.size--;
            this.modCount++;
            return;
        }
        f7l8<K, V> qVar = f7l8Var3.f27783i > f7l8Var4.f27783i ? f7l8Var3.toq() : f7l8Var4.m17191k();
        removeInternal(qVar, false);
        f7l8<K, V> f7l8Var6 = f7l8Var.f27787q;
        if (f7l8Var6 != null) {
            i2 = f7l8Var6.f27783i;
            qVar.f27787q = f7l8Var6;
            f7l8Var6.f27784k = qVar;
            f7l8Var.f27787q = null;
        } else {
            i2 = 0;
        }
        f7l8<K, V> f7l8Var7 = f7l8Var.f27785n;
        if (f7l8Var7 != null) {
            i3 = f7l8Var7.f27783i;
            qVar.f27785n = f7l8Var7;
            f7l8Var7.f27784k = qVar;
            f7l8Var.f27785n = null;
        }
        qVar.f27783i = Math.max(i2, i3) + 1;
        m17189q(f7l8Var, qVar);
    }

    f7l8<K, V> removeInternalByKey(Object obj) {
        f7l8<K, V> f7l8VarFindByObject = findByObject(obj);
        if (f7l8VarFindByObject != null) {
            removeInternal(f7l8VarFindByObject, true);
        }
        return f7l8VarFindByObject;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.size;
    }

    public C4907s(Comparator<? super K> comparator) {
        this.size = 0;
        this.modCount = 0;
        this.comparator = comparator == null ? f27780k : comparator;
        this.header = new f7l8<>();
        f7l8<K, V>[] f7l8VarArr = new f7l8[16];
        this.table = f7l8VarArr;
        this.threshold = (f7l8VarArr.length / 2) + (f7l8VarArr.length / 4);
    }

    /* JADX INFO: renamed from: com.google.gson.internal.s$f7l8 */
    /* JADX INFO: compiled from: LinkedHashTreeMap.java */
    static final class f7l8<K, V> implements Map.Entry<K, V> {

        /* JADX INFO: renamed from: g */
        f7l8<K, V> f27781g;

        /* JADX INFO: renamed from: h */
        V f27782h;

        /* JADX INFO: renamed from: i */
        int f27783i;

        /* JADX INFO: renamed from: k */
        f7l8<K, V> f27784k;

        /* JADX INFO: renamed from: n */
        f7l8<K, V> f27785n;

        /* JADX INFO: renamed from: p */
        final int f27786p;

        /* JADX INFO: renamed from: q */
        f7l8<K, V> f27787q;

        /* JADX INFO: renamed from: s */
        final K f27788s;

        /* JADX INFO: renamed from: y */
        f7l8<K, V> f27789y;

        f7l8() {
            this.f27788s = null;
            this.f27786p = -1;
            this.f27789y = this;
            this.f27781g = this;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            K k2 = this.f27788s;
            if (k2 == null) {
                if (entry.getKey() != null) {
                    return false;
                }
            } else if (!k2.equals(entry.getKey())) {
                return false;
            }
            V v2 = this.f27782h;
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
            return this.f27788s;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f27782h;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k2 = this.f27788s;
            int iHashCode = k2 == null ? 0 : k2.hashCode();
            V v2 = this.f27782h;
            return iHashCode ^ (v2 != null ? v2.hashCode() : 0);
        }

        /* JADX INFO: renamed from: k */
        public f7l8<K, V> m17191k() {
            f7l8<K, V> f7l8Var = this;
            for (f7l8<K, V> f7l8Var2 = this.f27787q; f7l8Var2 != null; f7l8Var2 = f7l8Var2.f27787q) {
                f7l8Var = f7l8Var2;
            }
            return f7l8Var;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v2) {
            V v3 = this.f27782h;
            this.f27782h = v2;
            return v3;
        }

        public String toString() {
            return this.f27788s + "=" + this.f27782h;
        }

        public f7l8<K, V> toq() {
            f7l8<K, V> f7l8Var = this;
            for (f7l8<K, V> f7l8Var2 = this.f27785n; f7l8Var2 != null; f7l8Var2 = f7l8Var2.f27785n) {
                f7l8Var = f7l8Var2;
            }
            return f7l8Var;
        }

        f7l8(f7l8<K, V> f7l8Var, K k2, int i2, f7l8<K, V> f7l8Var2, f7l8<K, V> f7l8Var3) {
            this.f27784k = f7l8Var;
            this.f27788s = k2;
            this.f27786p = i2;
            this.f27783i = 1;
            this.f27781g = f7l8Var2;
            this.f27789y = f7l8Var3;
            f7l8Var3.f27781g = this;
            f7l8Var2.f27789y = this;
        }
    }
}
