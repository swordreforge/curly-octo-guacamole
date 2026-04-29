package com.google.common.collect;

import com.google.common.base.C4280z;
import com.google.common.collect.z4;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.j2objc.annotations.RetainedWith;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: HashBiMap.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
public final class ltg8<K, V> extends AbstractMap<K, V> implements ni7<K, V>, Serializable {

    /* JADX INFO: renamed from: f */
    private static final int f26315f = -2;

    /* JADX INFO: renamed from: l */
    private static final int f26316l = -1;

    /* JADX INFO: renamed from: g */
    private transient int[] f26317g;

    /* JADX INFO: renamed from: h */
    private transient int[] f26318h;

    /* JADX INFO: renamed from: i */
    private transient Set<K> f26319i;

    /* JADX INFO: renamed from: k */
    private transient int[] f26320k;
    transient K[] keys;
    transient int modCount;

    /* JADX INFO: renamed from: n */
    private transient int[] f26321n;

    /* JADX INFO: renamed from: p */
    private transient int[] f26322p;

    /* JADX INFO: renamed from: q */
    private transient int[] f26323q;

    /* JADX INFO: renamed from: r */
    @RetainedWith
    @MonotonicNonNullDecl
    private transient ni7<V, K> f26324r;

    /* JADX INFO: renamed from: s */
    @NullableDecl
    private transient int f26325s;
    transient int size;

    /* JADX INFO: renamed from: t */
    private transient Set<Map.Entry<K, V>> f26326t;
    transient V[] values;

    /* JADX INFO: renamed from: y */
    @NullableDecl
    private transient int f26327y;

    /* JADX INFO: renamed from: z */
    private transient Set<V> f26328z;

    /* JADX INFO: compiled from: HashBiMap.java */
    final class f7l8 extends AbstractC4447y<K, V, V> {
        f7l8() {
            super(ltg8.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@NullableDecl Object obj) {
            return ltg8.this.containsValue(obj);
        }

        @Override // com.google.common.collect.ltg8.AbstractC4447y
        /* JADX INFO: renamed from: k */
        V mo15810k(int i2) {
            return ltg8.this.values[i2];
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@NullableDecl Object obj) {
            int iM15653q = etdu.m15653q(obj);
            int iFindEntryByValue = ltg8.this.findEntryByValue(obj, iM15653q);
            if (iFindEntryByValue == -1) {
                return false;
            }
            ltg8.this.removeEntryValueHashKnown(iFindEntryByValue, iM15653q);
            return true;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.ltg8$g */
    /* JADX INFO: compiled from: HashBiMap.java */
    final class C4443g extends AbstractC4447y<K, V, K> {
        C4443g() {
            super(ltg8.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@NullableDecl Object obj) {
            return ltg8.this.containsKey(obj);
        }

        @Override // com.google.common.collect.ltg8.AbstractC4447y
        /* JADX INFO: renamed from: k */
        K mo15810k(int i2) {
            return ltg8.this.keys[i2];
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@NullableDecl Object obj) {
            int iM15653q = etdu.m15653q(obj);
            int iFindEntryByKey = ltg8.this.findEntryByKey(obj, iM15653q);
            if (iFindEntryByKey == -1) {
                return false;
            }
            ltg8.this.removeEntryKeyHashKnown(iFindEntryByKey, iM15653q);
            return true;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.ltg8$k */
    /* JADX INFO: compiled from: HashBiMap.java */
    final class C4444k extends com.google.common.collect.f7l8<K, V> {

        /* JADX INFO: renamed from: k */
        @NullableDecl
        final K f26331k;

        /* JADX INFO: renamed from: q */
        int f26333q;

        C4444k(int i2) {
            this.f26331k = ltg8.this.keys[i2];
            this.f26333q = i2;
        }

        @Override // com.google.common.collect.f7l8, java.util.Map.Entry
        public K getKey() {
            return this.f26331k;
        }

        @Override // com.google.common.collect.f7l8, java.util.Map.Entry
        @NullableDecl
        public V getValue() {
            m15811k();
            int i2 = this.f26333q;
            if (i2 == -1) {
                return null;
            }
            return ltg8.this.values[i2];
        }

        /* JADX INFO: renamed from: k */
        void m15811k() {
            int i2 = this.f26333q;
            if (i2 != -1) {
                ltg8 ltg8Var = ltg8.this;
                if (i2 <= ltg8Var.size && C4280z.m15455k(ltg8Var.keys[i2], this.f26331k)) {
                    return;
                }
            }
            this.f26333q = ltg8.this.findEntryByKey(this.f26331k);
        }

        @Override // com.google.common.collect.f7l8, java.util.Map.Entry
        public V setValue(V v2) {
            m15811k();
            int i2 = this.f26333q;
            if (i2 == -1) {
                return (V) ltg8.this.put(this.f26331k, v2);
            }
            V v3 = ltg8.this.values[i2];
            if (C4280z.m15455k(v3, v2)) {
                return v2;
            }
            ltg8.this.kja0(this.f26333q, v2, false);
            return v3;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.ltg8$n */
    /* JADX INFO: compiled from: HashBiMap.java */
    static class C4445n<K, V> extends AbstractC4447y<K, V, Map.Entry<V, K>> {
        C4445n(ltg8<K, V> ltg8Var) {
            super(ltg8Var);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@NullableDecl Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int iFindEntryByValue = this.f26338k.findEntryByValue(key);
            return iFindEntryByValue != -1 && C4280z.m15455k(this.f26338k.keys[iFindEntryByValue], value);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int iM15653q = etdu.m15653q(key);
            int iFindEntryByValue = this.f26338k.findEntryByValue(key, iM15653q);
            if (iFindEntryByValue == -1 || !C4280z.m15455k(this.f26338k.keys[iFindEntryByValue], value)) {
                return false;
            }
            this.f26338k.removeEntryValueHashKnown(iFindEntryByValue, iM15653q);
            return true;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.ltg8.AbstractC4447y
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public Map.Entry<V, K> mo15810k(int i2) {
            return new toq(this.f26338k, i2);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.ltg8$q */
    /* JADX INFO: compiled from: HashBiMap.java */
    static class C4446q<K, V> extends AbstractMap<V, K> implements ni7<V, K>, Serializable {
        private final ltg8<K, V> forward;

        /* JADX INFO: renamed from: k */
        private transient Set<Map.Entry<V, K>> f26334k;

        C4446q(ltg8<K, V> ltg8Var) {
            this.forward = ltg8Var;
        }

        @wlev.zy("serialization")
        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            ((ltg8) this.forward).f26324r = this;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            this.forward.clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@NullableDecl Object obj) {
            return this.forward.containsValue(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsValue(@NullableDecl Object obj) {
            return this.forward.containsKey(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<V, K>> entrySet() {
            Set<Map.Entry<V, K>> set = this.f26334k;
            if (set != null) {
                return set;
            }
            C4445n c4445n = new C4445n(this.forward);
            this.f26334k = c4445n;
            return c4445n;
        }

        @Override // com.google.common.collect.ni7
        @CanIgnoreReturnValue
        @NullableDecl
        public K forcePut(@NullableDecl V v2, @NullableDecl K k2) {
            return this.forward.putInverse(v2, k2, true);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @NullableDecl
        public K get(@NullableDecl Object obj) {
            return this.forward.getInverse(obj);
        }

        @Override // com.google.common.collect.ni7
        public ni7<K, V> inverse() {
            return this.forward;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<V> keySet() {
            return this.forward.values();
        }

        @Override // java.util.AbstractMap, java.util.Map, com.google.common.collect.ni7
        @CanIgnoreReturnValue
        @NullableDecl
        public K put(@NullableDecl V v2, @NullableDecl K k2) {
            return this.forward.putInverse(v2, k2, false);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CanIgnoreReturnValue
        @NullableDecl
        public K remove(@NullableDecl Object obj) {
            return this.forward.removeInverse(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.forward.size;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<K> values() {
            return this.forward.keySet();
        }
    }

    /* JADX INFO: compiled from: HashBiMap.java */
    static final class toq<K, V> extends com.google.common.collect.f7l8<V, K> {

        /* JADX INFO: renamed from: k */
        final ltg8<K, V> f26335k;

        /* JADX INFO: renamed from: n */
        int f26336n;

        /* JADX INFO: renamed from: q */
        final V f26337q;

        toq(ltg8<K, V> ltg8Var, int i2) {
            this.f26335k = ltg8Var;
            this.f26337q = ltg8Var.values[i2];
            this.f26336n = i2;
        }

        /* JADX INFO: renamed from: k */
        private void m15812k() {
            int i2 = this.f26336n;
            if (i2 != -1) {
                ltg8<K, V> ltg8Var = this.f26335k;
                if (i2 <= ltg8Var.size && C4280z.m15455k(this.f26337q, ltg8Var.values[i2])) {
                    return;
                }
            }
            this.f26336n = this.f26335k.findEntryByValue(this.f26337q);
        }

        @Override // com.google.common.collect.f7l8, java.util.Map.Entry
        public V getKey() {
            return this.f26337q;
        }

        @Override // com.google.common.collect.f7l8, java.util.Map.Entry
        public K getValue() {
            m15812k();
            int i2 = this.f26336n;
            if (i2 == -1) {
                return null;
            }
            return this.f26335k.keys[i2];
        }

        @Override // com.google.common.collect.f7l8, java.util.Map.Entry
        public K setValue(K k2) {
            m15812k();
            int i2 = this.f26336n;
            if (i2 == -1) {
                return this.f26335k.putInverse(this.f26337q, k2, false);
            }
            K k3 = this.f26335k.keys[i2];
            if (C4280z.m15455k(k3, k2)) {
                return k2;
            }
            this.f26335k.n7h(this.f26336n, k2, false);
            return k3;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.ltg8$y */
    /* JADX INFO: compiled from: HashBiMap.java */
    static abstract class AbstractC4447y<K, V, T> extends AbstractSet<T> {

        /* JADX INFO: renamed from: k */
        final ltg8<K, V> f26338k;

        /* JADX INFO: renamed from: com.google.common.collect.ltg8$y$k */
        /* JADX INFO: compiled from: HashBiMap.java */
        class k implements Iterator<T> {

            /* JADX INFO: renamed from: g */
            private int f26339g;

            /* JADX INFO: renamed from: k */
            private int f26340k;

            /* JADX INFO: renamed from: n */
            private int f26341n;

            /* JADX INFO: renamed from: q */
            private int f26342q = -1;

            k() {
                this.f26340k = ((ltg8) AbstractC4447y.this.f26338k).f26327y;
                ltg8<K, V> ltg8Var = AbstractC4447y.this.f26338k;
                this.f26341n = ltg8Var.modCount;
                this.f26339g = ltg8Var.size;
            }

            /* JADX INFO: renamed from: k */
            private void m15813k() {
                if (AbstractC4447y.this.f26338k.modCount != this.f26341n) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                m15813k();
                return this.f26340k != -2 && this.f26339g > 0;
            }

            @Override // java.util.Iterator
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                T t2 = (T) AbstractC4447y.this.mo15810k(this.f26340k);
                this.f26342q = this.f26340k;
                this.f26340k = ((ltg8) AbstractC4447y.this.f26338k).f26318h[this.f26340k];
                this.f26339g--;
                return t2;
            }

            @Override // java.util.Iterator
            public void remove() {
                m15813k();
                C4524t.m15984n(this.f26342q != -1);
                AbstractC4447y.this.f26338k.removeEntry(this.f26342q);
                int i2 = this.f26340k;
                ltg8<K, V> ltg8Var = AbstractC4447y.this.f26338k;
                if (i2 == ltg8Var.size) {
                    this.f26340k = this.f26342q;
                }
                this.f26342q = -1;
                this.f26341n = ltg8Var.modCount;
            }
        }

        AbstractC4447y(ltg8<K, V> ltg8Var) {
            this.f26338k = ltg8Var;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            this.f26338k.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<T> iterator() {
            return new k();
        }

        /* JADX INFO: renamed from: k */
        abstract T mo15810k(int i2);

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f26338k.size;
        }
    }

    /* JADX INFO: compiled from: HashBiMap.java */
    final class zy extends AbstractC4447y<K, V, Map.Entry<K, V>> {
        zy() {
            super(ltg8.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@NullableDecl Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int iFindEntryByKey = ltg8.this.findEntryByKey(key);
            return iFindEntryByKey != -1 && C4280z.m15455k(value, ltg8.this.values[iFindEntryByKey]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @CanIgnoreReturnValue
        public boolean remove(@NullableDecl Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int iM15653q = etdu.m15653q(key);
            int iFindEntryByKey = ltg8.this.findEntryByKey(key, iM15653q);
            if (iFindEntryByKey == -1 || !C4280z.m15455k(value, ltg8.this.values[iFindEntryByKey])) {
                return false;
            }
            ltg8.this.removeEntryKeyHashKnown(iFindEntryByKey, iM15653q);
            return true;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.ltg8.AbstractC4447y
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> mo15810k(int i2) {
            return new C4444k(i2);
        }
    }

    private ltg8(int i2) {
        init(i2);
    }

    public static <K, V> ltg8<K, V> create() {
        return create(16);
    }

    private static int[] f7l8(int[] iArr, int i2) {
        int length = iArr.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, i2);
        Arrays.fill(iArrCopyOf, length, i2, -1);
        return iArrCopyOf;
    }

    /* JADX INFO: renamed from: g */
    private void m15804g(int i2) {
        int[] iArr = this.f26321n;
        if (iArr.length < i2) {
            int iM16103g = z4.toq.m16103g(iArr.length, i2);
            this.keys = (K[]) Arrays.copyOf(this.keys, iM16103g);
            this.values = (V[]) Arrays.copyOf(this.values, iM16103g);
            this.f26321n = f7l8(this.f26321n, iM16103g);
            this.f26317g = f7l8(this.f26317g, iM16103g);
            this.f26322p = f7l8(this.f26322p, iM16103g);
            this.f26318h = f7l8(this.f26318h, iM16103g);
        }
        if (this.f26320k.length < i2) {
            int iM15652k = etdu.m15652k(i2, 1.0d);
            this.f26320k = toq(iM15652k);
            this.f26323q = toq(iM15652k);
            for (int i3 = 0; i3 < this.size; i3++) {
                int iM15806k = m15806k(etdu.m15653q(this.keys[i3]));
                int[] iArr2 = this.f26321n;
                int[] iArr3 = this.f26320k;
                iArr2[i3] = iArr3[iM15806k];
                iArr3[iM15806k] = i3;
                int iM15806k2 = m15806k(etdu.m15653q(this.values[i3]));
                int[] iArr4 = this.f26317g;
                int[] iArr5 = this.f26323q;
                iArr4[i3] = iArr5[iM15806k2];
                iArr5[iM15806k2] = i3;
            }
        }
    }

    /* JADX INFO: renamed from: h */
    private void m15805h(int i2, int i3) {
        if (i2 == -2) {
            this.f26327y = i3;
        } else {
            this.f26318h[i2] = i3;
        }
        if (i3 == -2) {
            this.f26325s = i2;
        } else {
            this.f26322p[i3] = i2;
        }
    }

    /* JADX INFO: renamed from: k */
    private int m15806k(int i2) {
        return i2 & (this.f26320k.length - 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kja0(int i2, @NullableDecl V v2, boolean z2) {
        com.google.common.base.jk.m15383q(i2 != -1);
        int iM15653q = etdu.m15653q(v2);
        int iFindEntryByValue = findEntryByValue(v2, iM15653q);
        if (iFindEntryByValue != -1) {
            if (!z2) {
                throw new IllegalArgumentException("Value already present in map: " + v2);
            }
            removeEntryValueHashKnown(iFindEntryByValue, iM15653q);
            if (i2 == this.size) {
                i2 = iFindEntryByValue;
            }
        }
        m15808q(i2, etdu.m15653q(this.values[i2]));
        this.values[i2] = v2;
        m15807p(i2, iM15653q);
    }

    private void ld6(int i2, int i3) {
        int i4;
        int i5;
        if (i2 == i3) {
            return;
        }
        int i6 = this.f26322p[i2];
        int i7 = this.f26318h[i2];
        m15805h(i6, i3);
        m15805h(i3, i7);
        K[] kArr = this.keys;
        K k2 = kArr[i2];
        V[] vArr = this.values;
        V v2 = vArr[i2];
        kArr[i3] = k2;
        vArr[i3] = v2;
        int iM15806k = m15806k(etdu.m15653q(k2));
        int[] iArr = this.f26320k;
        int i8 = iArr[iM15806k];
        if (i8 == i2) {
            iArr[iM15806k] = i3;
        } else {
            int i9 = this.f26321n[i8];
            while (true) {
                i4 = i8;
                i8 = i9;
                if (i8 == i2) {
                    break;
                } else {
                    i9 = this.f26321n[i8];
                }
            }
            this.f26321n[i4] = i3;
        }
        int[] iArr2 = this.f26321n;
        iArr2[i3] = iArr2[i2];
        iArr2[i2] = -1;
        int iM15806k2 = m15806k(etdu.m15653q(v2));
        int[] iArr3 = this.f26323q;
        int i10 = iArr3[iM15806k2];
        if (i10 == i2) {
            iArr3[iM15806k2] = i3;
        } else {
            int i11 = this.f26317g[i10];
            while (true) {
                i5 = i10;
                i10 = i11;
                if (i10 == i2) {
                    break;
                } else {
                    i11 = this.f26317g[i10];
                }
            }
            this.f26317g[i5] = i3;
        }
        int[] iArr4 = this.f26317g;
        iArr4[i3] = iArr4[i2];
        iArr4[i2] = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n7h(int i2, @NullableDecl K k2, boolean z2) {
        com.google.common.base.jk.m15383q(i2 != -1);
        int iM15653q = etdu.m15653q(k2);
        int iFindEntryByKey = findEntryByKey(k2, iM15653q);
        int i3 = this.f26325s;
        int i4 = -2;
        if (iFindEntryByKey != -1) {
            if (!z2) {
                throw new IllegalArgumentException("Key already present in map: " + k2);
            }
            i3 = this.f26322p[iFindEntryByKey];
            i4 = this.f26318h[iFindEntryByKey];
            removeEntryKeyHashKnown(iFindEntryByKey, iM15653q);
            if (i2 == this.size) {
                i2 = iFindEntryByKey;
            }
        }
        if (i3 == i2) {
            i3 = this.f26322p[i2];
        } else if (i3 == this.size) {
            i3 = iFindEntryByKey;
        }
        if (i4 == i2) {
            iFindEntryByKey = this.f26318h[i2];
        } else if (i4 != this.size) {
            iFindEntryByKey = i4;
        }
        m15805h(this.f26322p[i2], this.f26318h[i2]);
        zy(i2, etdu.m15653q(this.keys[i2]));
        this.keys[i2] = k2;
        m15809y(i2, etdu.m15653q(k2));
        m15805h(i3, i2);
        m15805h(i2, iFindEntryByKey);
    }

    /* JADX INFO: renamed from: p */
    private void m15807p(int i2, int i3) {
        com.google.common.base.jk.m15383q(i2 != -1);
        int iM15806k = m15806k(i3);
        int[] iArr = this.f26317g;
        int[] iArr2 = this.f26323q;
        iArr[i2] = iArr2[iM15806k];
        iArr2[iM15806k] = i2;
    }

    /* JADX INFO: renamed from: q */
    private void m15808q(int i2, int i3) {
        com.google.common.base.jk.m15383q(i2 != -1);
        int iM15806k = m15806k(i3);
        int[] iArr = this.f26323q;
        int i4 = iArr[iM15806k];
        if (i4 == i2) {
            int[] iArr2 = this.f26317g;
            iArr[iM15806k] = iArr2[i2];
            iArr2[i2] = -1;
            return;
        }
        int i5 = this.f26317g[i4];
        while (true) {
            int i6 = i4;
            i4 = i5;
            if (i4 == -1) {
                throw new AssertionError("Expected to find entry with value " + this.values[i2]);
            }
            if (i4 == i2) {
                int[] iArr3 = this.f26317g;
                iArr3[i6] = iArr3[i2];
                iArr3[i2] = -1;
                return;
            }
            i5 = this.f26317g[i4];
        }
    }

    @wlev.zy
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int iM15650y = el.m15650y(objectInputStream);
        init(16);
        el.zy(this, objectInputStream, iM15650y);
    }

    private static int[] toq(int i2) {
        int[] iArr = new int[i2];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    @wlev.zy
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        el.m15649s(this, objectOutputStream);
    }

    private void x2(int i2, int i3, int i4) {
        com.google.common.base.jk.m15383q(i2 != -1);
        zy(i2, i3);
        m15808q(i2, i4);
        m15805h(this.f26322p[i2], this.f26318h[i2]);
        ld6(this.size - 1, i2);
        K[] kArr = this.keys;
        int i5 = this.size;
        kArr[i5 - 1] = null;
        this.values[i5 - 1] = null;
        this.size = i5 - 1;
        this.modCount++;
    }

    /* JADX INFO: renamed from: y */
    private void m15809y(int i2, int i3) {
        com.google.common.base.jk.m15383q(i2 != -1);
        int iM15806k = m15806k(i3);
        int[] iArr = this.f26321n;
        int[] iArr2 = this.f26320k;
        iArr[i2] = iArr2[iM15806k];
        iArr2[iM15806k] = i2;
    }

    private void zy(int i2, int i3) {
        com.google.common.base.jk.m15383q(i2 != -1);
        int iM15806k = m15806k(i3);
        int[] iArr = this.f26320k;
        int i4 = iArr[iM15806k];
        if (i4 == i2) {
            int[] iArr2 = this.f26321n;
            iArr[iM15806k] = iArr2[i2];
            iArr2[i2] = -1;
            return;
        }
        int i5 = this.f26321n[i4];
        while (true) {
            int i6 = i4;
            i4 = i5;
            if (i4 == -1) {
                throw new AssertionError("Expected to find entry with key " + this.keys[i2]);
            }
            if (i4 == i2) {
                int[] iArr3 = this.f26321n;
                iArr3[i6] = iArr3[i2];
                iArr3[i2] = -1;
                return;
            }
            i5 = this.f26321n[i4];
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        Arrays.fill(this.keys, 0, this.size, (Object) null);
        Arrays.fill(this.values, 0, this.size, (Object) null);
        Arrays.fill(this.f26320k, -1);
        Arrays.fill(this.f26323q, -1);
        Arrays.fill(this.f26321n, 0, this.size, -1);
        Arrays.fill(this.f26317g, 0, this.size, -1);
        Arrays.fill(this.f26322p, 0, this.size, -1);
        Arrays.fill(this.f26318h, 0, this.size, -1);
        this.size = 0;
        this.f26327y = -2;
        this.f26325s = -2;
        this.modCount++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(@NullableDecl Object obj) {
        return findEntryByKey(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(@NullableDecl Object obj) {
        return findEntryByValue(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f26326t;
        if (set != null) {
            return set;
        }
        zy zyVar = new zy();
        this.f26326t = zyVar;
        return zyVar;
    }

    int findEntry(@NullableDecl Object obj, int i2, int[] iArr, int[] iArr2, Object[] objArr) {
        int i3 = iArr[m15806k(i2)];
        while (i3 != -1) {
            if (C4280z.m15455k(objArr[i3], obj)) {
                return i3;
            }
            i3 = iArr2[i3];
        }
        return -1;
    }

    int findEntryByKey(@NullableDecl Object obj) {
        return findEntryByKey(obj, etdu.m15653q(obj));
    }

    int findEntryByValue(@NullableDecl Object obj) {
        return findEntryByValue(obj, etdu.m15653q(obj));
    }

    @Override // com.google.common.collect.ni7
    @CanIgnoreReturnValue
    @NullableDecl
    public V forcePut(@NullableDecl K k2, @NullableDecl V v2) {
        return put(k2, v2, true);
    }

    @Override // java.util.AbstractMap, java.util.Map
    @NullableDecl
    public V get(@NullableDecl Object obj) {
        int iFindEntryByKey = findEntryByKey(obj);
        if (iFindEntryByKey == -1) {
            return null;
        }
        return this.values[iFindEntryByKey];
    }

    @NullableDecl
    K getInverse(@NullableDecl Object obj) {
        int iFindEntryByValue = findEntryByValue(obj);
        if (iFindEntryByValue == -1) {
            return null;
        }
        return this.keys[iFindEntryByValue];
    }

    void init(int i2) {
        C4524t.toq(i2, "expectedSize");
        int iM15652k = etdu.m15652k(i2, 1.0d);
        this.size = 0;
        this.keys = (K[]) new Object[i2];
        this.values = (V[]) new Object[i2];
        this.f26320k = toq(iM15652k);
        this.f26323q = toq(iM15652k);
        this.f26321n = toq(i2);
        this.f26317g = toq(i2);
        this.f26327y = -2;
        this.f26325s = -2;
        this.f26322p = toq(i2);
        this.f26318h = toq(i2);
    }

    @Override // com.google.common.collect.ni7
    public ni7<V, K> inverse() {
        ni7<V, K> ni7Var = this.f26324r;
        if (ni7Var != null) {
            return ni7Var;
        }
        C4446q c4446q = new C4446q(this);
        this.f26324r = c4446q;
        return c4446q;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.f26319i;
        if (set != null) {
            return set;
        }
        C4443g c4443g = new C4443g();
        this.f26319i = c4443g;
        return c4443g;
    }

    @Override // java.util.AbstractMap, java.util.Map, com.google.common.collect.ni7
    @CanIgnoreReturnValue
    public V put(@NullableDecl K k2, @NullableDecl V v2) {
        return put(k2, v2, false);
    }

    @NullableDecl
    K putInverse(@NullableDecl V v2, @NullableDecl K k2, boolean z2) {
        int iM15653q = etdu.m15653q(v2);
        int iFindEntryByValue = findEntryByValue(v2, iM15653q);
        if (iFindEntryByValue != -1) {
            K k3 = this.keys[iFindEntryByValue];
            if (C4280z.m15455k(k3, k2)) {
                return k2;
            }
            n7h(iFindEntryByValue, k2, z2);
            return k3;
        }
        int i2 = this.f26325s;
        int iM15653q2 = etdu.m15653q(k2);
        int iFindEntryByKey = findEntryByKey(k2, iM15653q2);
        if (!z2) {
            com.google.common.base.jk.fn3e(iFindEntryByKey == -1, "Key already present: %s", k2);
        } else if (iFindEntryByKey != -1) {
            i2 = this.f26322p[iFindEntryByKey];
            removeEntryKeyHashKnown(iFindEntryByKey, iM15653q2);
        }
        m15804g(this.size + 1);
        K[] kArr = this.keys;
        int i3 = this.size;
        kArr[i3] = k2;
        this.values[i3] = v2;
        m15809y(i3, iM15653q2);
        m15807p(this.size, iM15653q);
        int i4 = i2 == -2 ? this.f26327y : this.f26318h[i2];
        m15805h(i2, this.size);
        m15805h(this.size, i4);
        this.size++;
        this.modCount++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CanIgnoreReturnValue
    @NullableDecl
    public V remove(@NullableDecl Object obj) {
        int iM15653q = etdu.m15653q(obj);
        int iFindEntryByKey = findEntryByKey(obj, iM15653q);
        if (iFindEntryByKey == -1) {
            return null;
        }
        V v2 = this.values[iFindEntryByKey];
        removeEntryKeyHashKnown(iFindEntryByKey, iM15653q);
        return v2;
    }

    void removeEntry(int i2) {
        removeEntryKeyHashKnown(i2, etdu.m15653q(this.keys[i2]));
    }

    void removeEntryKeyHashKnown(int i2, int i3) {
        x2(i2, i3, etdu.m15653q(this.values[i2]));
    }

    void removeEntryValueHashKnown(int i2, int i3) {
        x2(i2, etdu.m15653q(this.keys[i2]), i3);
    }

    @NullableDecl
    K removeInverse(@NullableDecl Object obj) {
        int iM15653q = etdu.m15653q(obj);
        int iFindEntryByValue = findEntryByValue(obj, iM15653q);
        if (iFindEntryByValue == -1) {
            return null;
        }
        K k2 = this.keys[iFindEntryByValue];
        removeEntryValueHashKnown(iFindEntryByValue, iM15653q);
        return k2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.size;
    }

    public static <K, V> ltg8<K, V> create(int i2) {
        return new ltg8<>(i2);
    }

    int findEntryByKey(@NullableDecl Object obj, int i2) {
        return findEntry(obj, i2, this.f26320k, this.f26321n, this.keys);
    }

    int findEntryByValue(@NullableDecl Object obj, int i2) {
        return findEntry(obj, i2, this.f26323q, this.f26317g, this.values);
    }

    @NullableDecl
    V put(@NullableDecl K k2, @NullableDecl V v2, boolean z2) {
        int iM15653q = etdu.m15653q(k2);
        int iFindEntryByKey = findEntryByKey(k2, iM15653q);
        if (iFindEntryByKey != -1) {
            V v3 = this.values[iFindEntryByKey];
            if (C4280z.m15455k(v3, v2)) {
                return v2;
            }
            kja0(iFindEntryByKey, v2, z2);
            return v3;
        }
        int iM15653q2 = etdu.m15653q(v2);
        int iFindEntryByValue = findEntryByValue(v2, iM15653q2);
        if (!z2) {
            com.google.common.base.jk.fn3e(iFindEntryByValue == -1, "Value already present: %s", v2);
        } else if (iFindEntryByValue != -1) {
            removeEntryValueHashKnown(iFindEntryByValue, iM15653q2);
        }
        m15804g(this.size + 1);
        K[] kArr = this.keys;
        int i2 = this.size;
        kArr[i2] = k2;
        this.values[i2] = v2;
        m15809y(i2, iM15653q);
        m15807p(this.size, iM15653q2);
        m15805h(this.f26325s, this.size);
        m15805h(this.size, -2);
        this.size++;
        this.modCount++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<V> values() {
        Set<V> set = this.f26328z;
        if (set != null) {
            return set;
        }
        f7l8 f7l8Var = new f7l8();
        this.f26328z = f7l8Var;
        return f7l8Var;
    }

    public static <K, V> ltg8<K, V> create(Map<? extends K, ? extends V> map) {
        ltg8<K, V> ltg8VarCreate = create(map.size());
        ltg8VarCreate.putAll(map);
        return ltg8VarCreate;
    }
}
