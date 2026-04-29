package com.airbnb.lottie.parser.moshi;

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

/* JADX INFO: renamed from: com.airbnb.lottie.parser.moshi.g */
/* JADX INFO: compiled from: LinkedHashTreeMap.java */
/* JADX INFO: loaded from: classes.dex */
final class C1488g<K, V> extends AbstractMap<K, V> implements Serializable {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    /* JADX INFO: renamed from: k */
    private static final Comparator<Comparable> f8162k = new k();
    Comparator<? super K> comparator;
    private C1488g<K, V>.q entrySet;
    final f7l8<K, V> header;
    private C1488g<K, V>.n keySet;
    int modCount;
    int size;
    f7l8<K, V>[] table;
    int threshold;

    /* JADX INFO: renamed from: com.airbnb.lottie.parser.moshi.g$g */
    /* JADX INFO: compiled from: LinkedHashTreeMap.java */
    abstract class g<T> implements Iterator<T> {

        /* JADX INFO: renamed from: k */
        f7l8<K, V> f8173k;

        /* JADX INFO: renamed from: n */
        int f8174n;

        /* JADX INFO: renamed from: q */
        f7l8<K, V> f8175q = null;

        g() {
            this.f8173k = C1488g.this.header.f8163g;
            this.f8174n = C1488g.this.modCount;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f8173k != C1488g.this.header;
        }

        /* JADX INFO: renamed from: k */
        final f7l8<K, V> m6165k() {
            f7l8<K, V> f7l8Var = this.f8173k;
            C1488g c1488g = C1488g.this;
            if (f7l8Var == c1488g.header) {
                throw new NoSuchElementException();
            }
            if (c1488g.modCount != this.f8174n) {
                throw new ConcurrentModificationException();
            }
            this.f8173k = f7l8Var.f8163g;
            this.f8175q = f7l8Var;
            return f7l8Var;
        }

        @Override // java.util.Iterator
        public final void remove() {
            f7l8<K, V> f7l8Var = this.f8175q;
            if (f7l8Var == null) {
                throw new IllegalStateException();
            }
            C1488g.this.removeInternal(f7l8Var, true);
            this.f8175q = null;
            this.f8174n = C1488g.this.modCount;
        }
    }

    /* JADX INFO: renamed from: com.airbnb.lottie.parser.moshi.g$k */
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

    /* JADX INFO: renamed from: com.airbnb.lottie.parser.moshi.g$n */
    /* JADX INFO: compiled from: LinkedHashTreeMap.java */
    final class n extends AbstractSet<K> {

        /* JADX INFO: renamed from: com.airbnb.lottie.parser.moshi.g$n$k */
        /* JADX INFO: compiled from: LinkedHashTreeMap.java */
        class k extends C1488g<K, V>.g<K> {
            k() {
                super();
            }

            @Override // java.util.Iterator
            public K next() {
                return m6165k().f8170s;
            }
        }

        n() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C1488g.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return C1488g.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new k();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return C1488g.this.removeInternalByKey(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C1488g.this.size;
        }
    }

    /* JADX INFO: renamed from: com.airbnb.lottie.parser.moshi.g$q */
    /* JADX INFO: compiled from: LinkedHashTreeMap.java */
    final class q extends AbstractSet<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: com.airbnb.lottie.parser.moshi.g$q$k */
        /* JADX INFO: compiled from: LinkedHashTreeMap.java */
        class k extends C1488g<K, V>.g<Map.Entry<K, V>> {
            k() {
                super();
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> next() {
                return m6165k();
            }
        }

        q() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C1488g.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && C1488g.this.findByEntry((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new k();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            f7l8<K, V> f7l8VarFindByEntry;
            if (!(obj instanceof Map.Entry) || (f7l8VarFindByEntry = C1488g.this.findByEntry((Map.Entry) obj)) == null) {
                return false;
            }
            C1488g.this.removeInternal(f7l8VarFindByEntry, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C1488g.this.size;
        }
    }

    /* JADX INFO: renamed from: com.airbnb.lottie.parser.moshi.g$toq */
    /* JADX INFO: compiled from: LinkedHashTreeMap.java */
    static final class toq<K, V> {

        /* JADX INFO: renamed from: k */
        private f7l8<K, V> f8180k;

        /* JADX INFO: renamed from: q */
        private int f8181q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private int f56164toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private int f56165zy;

        toq() {
        }

        /* JADX INFO: renamed from: k */
        void m6167k(f7l8<K, V> f7l8Var) {
            f7l8Var.f8167n = null;
            f7l8Var.f8166k = null;
            f7l8Var.f8169q = null;
            f7l8Var.f8165i = 1;
            int i2 = this.f56164toq;
            if (i2 > 0) {
                int i3 = this.f8181q;
                if ((i3 & 1) == 0) {
                    this.f8181q = i3 + 1;
                    this.f56164toq = i2 - 1;
                    this.f56165zy++;
                }
            }
            f7l8Var.f8166k = this.f8180k;
            this.f8180k = f7l8Var;
            int i4 = this.f8181q + 1;
            this.f8181q = i4;
            int i5 = this.f56164toq;
            if (i5 > 0 && (i4 & 1) == 0) {
                this.f8181q = i4 + 1;
                this.f56164toq = i5 - 1;
                this.f56165zy++;
            }
            int i6 = 4;
            while (true) {
                int i7 = i6 - 1;
                if ((this.f8181q & i7) != i7) {
                    return;
                }
                int i8 = this.f56165zy;
                if (i8 == 0) {
                    f7l8<K, V> f7l8Var2 = this.f8180k;
                    f7l8<K, V> f7l8Var3 = f7l8Var2.f8166k;
                    f7l8<K, V> f7l8Var4 = f7l8Var3.f8166k;
                    f7l8Var3.f8166k = f7l8Var4.f8166k;
                    this.f8180k = f7l8Var3;
                    f7l8Var3.f8169q = f7l8Var4;
                    f7l8Var3.f8167n = f7l8Var2;
                    f7l8Var3.f8165i = f7l8Var2.f8165i + 1;
                    f7l8Var4.f8166k = f7l8Var3;
                    f7l8Var2.f8166k = f7l8Var3;
                } else if (i8 == 1) {
                    f7l8<K, V> f7l8Var5 = this.f8180k;
                    f7l8<K, V> f7l8Var6 = f7l8Var5.f8166k;
                    this.f8180k = f7l8Var6;
                    f7l8Var6.f8167n = f7l8Var5;
                    f7l8Var6.f8165i = f7l8Var5.f8165i + 1;
                    f7l8Var5.f8166k = f7l8Var6;
                    this.f56165zy = 0;
                } else if (i8 == 2) {
                    this.f56165zy = 0;
                }
                i6 *= 2;
            }
        }

        void toq(int i2) {
            this.f56164toq = ((Integer.highestOneBit(i2) * 2) - 1) - i2;
            this.f8181q = 0;
            this.f56165zy = 0;
            this.f8180k = null;
        }

        f7l8<K, V> zy() {
            f7l8<K, V> f7l8Var = this.f8180k;
            if (f7l8Var.f8166k == null) {
                return f7l8Var;
            }
            throw new IllegalStateException();
        }
    }

    /* JADX INFO: renamed from: com.airbnb.lottie.parser.moshi.g$zy */
    /* JADX INFO: compiled from: LinkedHashTreeMap.java */
    static class zy<K, V> {

        /* JADX INFO: renamed from: k */
        private f7l8<K, V> f8182k;

        zy() {
        }

        /* JADX INFO: renamed from: k */
        public f7l8<K, V> m6168k() {
            f7l8<K, V> f7l8Var = this.f8182k;
            if (f7l8Var == null) {
                return null;
            }
            f7l8<K, V> f7l8Var2 = f7l8Var.f8166k;
            f7l8Var.f8166k = null;
            f7l8<K, V> f7l8Var3 = f7l8Var.f8167n;
            while (true) {
                f7l8<K, V> f7l8Var4 = f7l8Var2;
                f7l8Var2 = f7l8Var3;
                if (f7l8Var2 == null) {
                    this.f8182k = f7l8Var4;
                    return f7l8Var;
                }
                f7l8Var2.f8166k = f7l8Var4;
                f7l8Var3 = f7l8Var2.f8169q;
            }
        }

        void toq(f7l8<K, V> f7l8Var) {
            f7l8<K, V> f7l8Var2 = null;
            while (f7l8Var != null) {
                f7l8Var.f8166k = f7l8Var2;
                f7l8Var2 = f7l8Var;
                f7l8Var = f7l8Var.f8169q;
            }
            this.f8182k = f7l8Var2;
        }
    }

    C1488g() {
        this(null);
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
                    f7l8<K, V> f7l8VarM6168k = zyVar.m6168k();
                    if (f7l8VarM6168k == null) {
                        break;
                    }
                    if ((f7l8VarM6168k.f8168p & length) == 0) {
                        i3++;
                    } else {
                        i4++;
                    }
                }
                toqVar.toq(i3);
                toqVar2.toq(i4);
                zyVar.toq(f7l8Var);
                while (true) {
                    f7l8<K, V> f7l8VarM6168k2 = zyVar.m6168k();
                    if (f7l8VarM6168k2 == null) {
                        break;
                    }
                    if ((f7l8VarM6168k2.f8168p & length) == 0) {
                        toqVar.m6167k(f7l8VarM6168k2);
                    } else {
                        toqVar2.m6167k(f7l8VarM6168k2);
                    }
                }
                f7l8VarArr2[i2] = i3 > 0 ? toqVar.zy() : null;
                f7l8VarArr2[i2 + length] = i4 > 0 ? toqVar2.zy() : null;
            }
        }
        return f7l8VarArr2;
    }

    private void f7l8(f7l8<K, V> f7l8Var) {
        f7l8<K, V> f7l8Var2 = f7l8Var.f8169q;
        f7l8<K, V> f7l8Var3 = f7l8Var.f8167n;
        f7l8<K, V> f7l8Var4 = f7l8Var2.f8169q;
        f7l8<K, V> f7l8Var5 = f7l8Var2.f8167n;
        f7l8Var.f8169q = f7l8Var5;
        if (f7l8Var5 != null) {
            f7l8Var5.f8166k = f7l8Var;
        }
        m6162q(f7l8Var, f7l8Var2);
        f7l8Var2.f8167n = f7l8Var;
        f7l8Var.f8166k = f7l8Var2;
        int iMax = Math.max(f7l8Var3 != null ? f7l8Var3.f8165i : 0, f7l8Var5 != null ? f7l8Var5.f8165i : 0) + 1;
        f7l8Var.f8165i = iMax;
        f7l8Var2.f8165i = Math.max(iMax, f7l8Var4 != null ? f7l8Var4.f8165i : 0) + 1;
    }

    /* JADX INFO: renamed from: g */
    private void m6160g(f7l8<K, V> f7l8Var) {
        f7l8<K, V> f7l8Var2 = f7l8Var.f8169q;
        f7l8<K, V> f7l8Var3 = f7l8Var.f8167n;
        f7l8<K, V> f7l8Var4 = f7l8Var3.f8169q;
        f7l8<K, V> f7l8Var5 = f7l8Var3.f8167n;
        f7l8Var.f8167n = f7l8Var4;
        if (f7l8Var4 != null) {
            f7l8Var4.f8166k = f7l8Var;
        }
        m6162q(f7l8Var, f7l8Var3);
        f7l8Var3.f8169q = f7l8Var;
        f7l8Var.f8166k = f7l8Var3;
        int iMax = Math.max(f7l8Var2 != null ? f7l8Var2.f8165i : 0, f7l8Var4 != null ? f7l8Var4.f8165i : 0) + 1;
        f7l8Var.f8165i = iMax;
        f7l8Var3.f8165i = Math.max(iMax, f7l8Var5 != null ? f7l8Var5.f8165i : 0) + 1;
    }

    /* JADX INFO: renamed from: k */
    private void m6161k() {
        f7l8<K, V>[] f7l8VarArrDoubleCapacity = doubleCapacity(this.table);
        this.table = f7l8VarArrDoubleCapacity;
        this.threshold = (f7l8VarArrDoubleCapacity.length / 2) + (f7l8VarArrDoubleCapacity.length / 4);
    }

    /* JADX INFO: renamed from: q */
    private void m6162q(f7l8<K, V> f7l8Var, f7l8<K, V> f7l8Var2) {
        f7l8<K, V> f7l8Var3 = f7l8Var.f8166k;
        f7l8Var.f8166k = null;
        if (f7l8Var2 != null) {
            f7l8Var2.f8166k = f7l8Var3;
        }
        if (f7l8Var3 == null) {
            int i2 = f7l8Var.f8168p;
            this.table[i2 & (r0.length - 1)] = f7l8Var2;
        } else if (f7l8Var3.f8169q == f7l8Var) {
            f7l8Var3.f8169q = f7l8Var2;
        } else {
            f7l8Var3.f8167n = f7l8Var2;
        }
    }

    private boolean toq(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    /* JADX INFO: renamed from: y */
    private static int m6163y(int i2) {
        int i3 = i2 ^ ((i2 >>> 20) ^ (i2 >>> 12));
        return (i3 >>> 4) ^ ((i3 >>> 7) ^ i3);
    }

    private void zy(f7l8<K, V> f7l8Var, boolean z2) {
        while (f7l8Var != null) {
            f7l8<K, V> f7l8Var2 = f7l8Var.f8169q;
            f7l8<K, V> f7l8Var3 = f7l8Var.f8167n;
            int i2 = f7l8Var2 != null ? f7l8Var2.f8165i : 0;
            int i3 = f7l8Var3 != null ? f7l8Var3.f8165i : 0;
            int i4 = i2 - i3;
            if (i4 == -2) {
                f7l8<K, V> f7l8Var4 = f7l8Var3.f8169q;
                f7l8<K, V> f7l8Var5 = f7l8Var3.f8167n;
                int i5 = (f7l8Var4 != null ? f7l8Var4.f8165i : 0) - (f7l8Var5 != null ? f7l8Var5.f8165i : 0);
                if (i5 == -1 || (i5 == 0 && !z2)) {
                    m6160g(f7l8Var);
                } else {
                    f7l8(f7l8Var3);
                    m6160g(f7l8Var);
                }
                if (z2) {
                    return;
                }
            } else if (i4 == 2) {
                f7l8<K, V> f7l8Var6 = f7l8Var2.f8169q;
                f7l8<K, V> f7l8Var7 = f7l8Var2.f8167n;
                int i6 = (f7l8Var6 != null ? f7l8Var6.f8165i : 0) - (f7l8Var7 != null ? f7l8Var7.f8165i : 0);
                if (i6 == 1 || (i6 == 0 && !z2)) {
                    f7l8(f7l8Var);
                } else {
                    m6160g(f7l8Var2);
                    f7l8(f7l8Var);
                }
                if (z2) {
                    return;
                }
            } else if (i4 == 0) {
                f7l8Var.f8165i = i2 + 1;
                if (z2) {
                    return;
                }
            } else {
                f7l8Var.f8165i = Math.max(i2, i3) + 1;
                if (!z2) {
                    return;
                }
            }
            f7l8Var = f7l8Var.f8166k;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        Arrays.fill(this.table, (Object) null);
        this.size = 0;
        this.modCount++;
        f7l8<K, V> f7l8Var = this.header;
        f7l8<K, V> f7l8Var2 = f7l8Var.f8163g;
        while (f7l8Var2 != f7l8Var) {
            f7l8<K, V> f7l8Var3 = f7l8Var2.f8163g;
            f7l8Var2.f8171y = null;
            f7l8Var2.f8163g = null;
            f7l8Var2 = f7l8Var3;
        }
        f7l8Var.f8171y = f7l8Var;
        f7l8Var.f8163g = f7l8Var;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return findByObject(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        C1488g<K, V>.q qVar = this.entrySet;
        if (qVar != null) {
            return qVar;
        }
        C1488g<K, V>.q qVar2 = new q();
        this.entrySet = qVar2;
        return qVar2;
    }

    f7l8<K, V> find(K k2, boolean z2) {
        int iCompareTo;
        f7l8<K, V> f7l8Var;
        Comparator<? super K> comparator = this.comparator;
        f7l8<K, V>[] f7l8VarArr = this.table;
        int iM6163y = m6163y(k2.hashCode());
        int length = (f7l8VarArr.length - 1) & iM6163y;
        f7l8<K, V> f7l8Var2 = f7l8VarArr[length];
        if (f7l8Var2 != null) {
            Comparable comparable = comparator == f8162k ? (Comparable) k2 : null;
            while (true) {
                iCompareTo = comparable != null ? comparable.compareTo(f7l8Var2.f8170s) : comparator.compare(k2, f7l8Var2.f8170s);
                if (iCompareTo == 0) {
                    return f7l8Var2;
                }
                f7l8<K, V> f7l8Var3 = iCompareTo < 0 ? f7l8Var2.f8169q : f7l8Var2.f8167n;
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
            f7l8Var = new f7l8<>(f7l8Var4, k2, iM6163y, f7l8Var5, f7l8Var5.f8171y);
            if (i2 < 0) {
                f7l8Var4.f8169q = f7l8Var;
            } else {
                f7l8Var4.f8167n = f7l8Var;
            }
            zy(f7l8Var4, true);
        } else {
            if (comparator == f8162k && !(k2 instanceof Comparable)) {
                throw new ClassCastException(k2.getClass().getName() + " is not Comparable");
            }
            f7l8Var = new f7l8<>(f7l8Var4, k2, iM6163y, f7l8Var5, f7l8Var5.f8171y);
            f7l8VarArr[length] = f7l8Var;
        }
        int i3 = this.size;
        this.size = i3 + 1;
        if (i3 > this.threshold) {
            m6161k();
        }
        this.modCount++;
        return f7l8Var;
    }

    f7l8<K, V> findByEntry(Map.Entry<?, ?> entry) {
        f7l8<K, V> f7l8VarFindByObject = findByObject(entry.getKey());
        if (f7l8VarFindByObject != null && toq(f7l8VarFindByObject.f8164h, entry.getValue())) {
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
            return f7l8VarFindByObject.f8164h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        C1488g<K, V>.n nVar = this.keySet;
        if (nVar != null) {
            return nVar;
        }
        C1488g<K, V>.n nVar2 = new n();
        this.keySet = nVar2;
        return nVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k2, V v2) {
        if (k2 == null) {
            throw new NullPointerException("key == null");
        }
        f7l8<K, V> f7l8VarFind = find(k2, true);
        V v3 = f7l8VarFind.f8164h;
        f7l8VarFind.f8164h = v2;
        return v3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        f7l8<K, V> f7l8VarRemoveInternalByKey = removeInternalByKey(obj);
        if (f7l8VarRemoveInternalByKey != null) {
            return f7l8VarRemoveInternalByKey.f8164h;
        }
        return null;
    }

    void removeInternal(f7l8<K, V> f7l8Var, boolean z2) {
        int i2;
        if (z2) {
            f7l8<K, V> f7l8Var2 = f7l8Var.f8171y;
            f7l8Var2.f8163g = f7l8Var.f8163g;
            f7l8Var.f8163g.f8171y = f7l8Var2;
            f7l8Var.f8171y = null;
            f7l8Var.f8163g = null;
        }
        f7l8<K, V> f7l8Var3 = f7l8Var.f8169q;
        f7l8<K, V> f7l8Var4 = f7l8Var.f8167n;
        f7l8<K, V> f7l8Var5 = f7l8Var.f8166k;
        int i3 = 0;
        if (f7l8Var3 == null || f7l8Var4 == null) {
            if (f7l8Var3 != null) {
                m6162q(f7l8Var, f7l8Var3);
                f7l8Var.f8169q = null;
            } else if (f7l8Var4 != null) {
                m6162q(f7l8Var, f7l8Var4);
                f7l8Var.f8167n = null;
            } else {
                m6162q(f7l8Var, null);
            }
            zy(f7l8Var5, false);
            this.size--;
            this.modCount++;
            return;
        }
        f7l8<K, V> qVar = f7l8Var3.f8165i > f7l8Var4.f8165i ? f7l8Var3.toq() : f7l8Var4.m6164k();
        removeInternal(qVar, false);
        f7l8<K, V> f7l8Var6 = f7l8Var.f8169q;
        if (f7l8Var6 != null) {
            i2 = f7l8Var6.f8165i;
            qVar.f8169q = f7l8Var6;
            f7l8Var6.f8166k = qVar;
            f7l8Var.f8169q = null;
        } else {
            i2 = 0;
        }
        f7l8<K, V> f7l8Var7 = f7l8Var.f8167n;
        if (f7l8Var7 != null) {
            i3 = f7l8Var7.f8165i;
            qVar.f8167n = f7l8Var7;
            f7l8Var7.f8166k = qVar;
            f7l8Var.f8167n = null;
        }
        qVar.f8165i = Math.max(i2, i3) + 1;
        m6162q(f7l8Var, qVar);
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

    C1488g(Comparator<? super K> comparator) {
        this.size = 0;
        this.modCount = 0;
        this.comparator = comparator == null ? f8162k : comparator;
        this.header = new f7l8<>();
        f7l8<K, V>[] f7l8VarArr = new f7l8[16];
        this.table = f7l8VarArr;
        this.threshold = (f7l8VarArr.length / 2) + (f7l8VarArr.length / 4);
    }

    /* JADX INFO: renamed from: com.airbnb.lottie.parser.moshi.g$f7l8 */
    /* JADX INFO: compiled from: LinkedHashTreeMap.java */
    static final class f7l8<K, V> implements Map.Entry<K, V> {

        /* JADX INFO: renamed from: g */
        f7l8<K, V> f8163g;

        /* JADX INFO: renamed from: h */
        V f8164h;

        /* JADX INFO: renamed from: i */
        int f8165i;

        /* JADX INFO: renamed from: k */
        f7l8<K, V> f8166k;

        /* JADX INFO: renamed from: n */
        f7l8<K, V> f8167n;

        /* JADX INFO: renamed from: p */
        final int f8168p;

        /* JADX INFO: renamed from: q */
        f7l8<K, V> f8169q;

        /* JADX INFO: renamed from: s */
        final K f8170s;

        /* JADX INFO: renamed from: y */
        f7l8<K, V> f8171y;

        f7l8() {
            this.f8170s = null;
            this.f8168p = -1;
            this.f8171y = this;
            this.f8163g = this;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            K k2 = this.f8170s;
            if (k2 == null) {
                if (entry.getKey() != null) {
                    return false;
                }
            } else if (!k2.equals(entry.getKey())) {
                return false;
            }
            V v2 = this.f8164h;
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
            return this.f8170s;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f8164h;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k2 = this.f8170s;
            int iHashCode = k2 == null ? 0 : k2.hashCode();
            V v2 = this.f8164h;
            return iHashCode ^ (v2 != null ? v2.hashCode() : 0);
        }

        /* JADX INFO: renamed from: k */
        public f7l8<K, V> m6164k() {
            f7l8<K, V> f7l8Var = this;
            for (f7l8<K, V> f7l8Var2 = this.f8169q; f7l8Var2 != null; f7l8Var2 = f7l8Var2.f8169q) {
                f7l8Var = f7l8Var2;
            }
            return f7l8Var;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v2) {
            V v3 = this.f8164h;
            this.f8164h = v2;
            return v3;
        }

        public String toString() {
            return this.f8170s + "=" + this.f8164h;
        }

        public f7l8<K, V> toq() {
            f7l8<K, V> f7l8Var = this;
            for (f7l8<K, V> f7l8Var2 = this.f8167n; f7l8Var2 != null; f7l8Var2 = f7l8Var2.f8167n) {
                f7l8Var = f7l8Var2;
            }
            return f7l8Var;
        }

        f7l8(f7l8<K, V> f7l8Var, K k2, int i2, f7l8<K, V> f7l8Var2, f7l8<K, V> f7l8Var3) {
            this.f8166k = f7l8Var;
            this.f8170s = k2;
            this.f8168p = i2;
            this.f8165i = 1;
            this.f8163g = f7l8Var2;
            this.f8171y = f7l8Var3;
            f7l8Var3.f8163g = this;
            f7l8Var2.f8171y = this;
        }
    }
}
