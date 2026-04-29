package com.google.common.collect;

import com.google.common.base.C4280z;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import wlev.InterfaceC7732q;

/* JADX INFO: compiled from: CompactHashMap.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.zy
class jk<K, V> extends AbstractMap<K, V> implements Serializable {
    static final float DEFAULT_LOAD_FACTOR = 1.0f;
    static final int DEFAULT_SIZE = 3;
    static final int UNSET = -1;

    /* JADX INFO: renamed from: h */
    private static final long f26232h = 4294967295L;

    /* JADX INFO: renamed from: i */
    private static final long f26233i = -4294967296L;

    /* JADX INFO: renamed from: p */
    private static final int f26234p = 1073741824;

    @InterfaceC7732q
    @MonotonicNonNullDecl
    transient long[] entries;

    /* JADX INFO: renamed from: g */
    @MonotonicNonNullDecl
    private transient Set<K> f26235g;

    /* JADX INFO: renamed from: k */
    @MonotonicNonNullDecl
    private transient int[] f26236k;

    @InterfaceC7732q
    @MonotonicNonNullDecl
    transient Object[] keys;
    transient float loadFactor;
    transient int modCount;

    /* JADX INFO: renamed from: n */
    private transient int f26237n;

    /* JADX INFO: renamed from: q */
    private transient int f26238q;

    /* JADX INFO: renamed from: s */
    @MonotonicNonNullDecl
    private transient Collection<V> f26239s;

    @InterfaceC7732q
    @MonotonicNonNullDecl
    transient Object[] values;

    /* JADX INFO: renamed from: y */
    @MonotonicNonNullDecl
    private transient Set<Map.Entry<K, V>> f26240y;

    /* JADX INFO: compiled from: CompactHashMap.java */
    final class f7l8 extends com.google.common.collect.f7l8<K, V> {

        /* JADX INFO: renamed from: k */
        @NullableDecl
        private final K f26241k;

        /* JADX INFO: renamed from: q */
        private int f26243q;

        f7l8(int i2) {
            this.f26241k = (K) jk.this.keys[i2];
            this.f26243q = i2;
        }

        /* JADX INFO: renamed from: k */
        private void m15775k() {
            int i2 = this.f26243q;
            if (i2 == -1 || i2 >= jk.this.size() || !C4280z.m15455k(this.f26241k, jk.this.keys[this.f26243q])) {
                this.f26243q = jk.this.m15773q(this.f26241k);
            }
        }

        @Override // com.google.common.collect.f7l8, java.util.Map.Entry
        public K getKey() {
            return this.f26241k;
        }

        @Override // com.google.common.collect.f7l8, java.util.Map.Entry
        public V getValue() {
            m15775k();
            int i2 = this.f26243q;
            if (i2 == -1) {
                return null;
            }
            return (V) jk.this.values[i2];
        }

        @Override // com.google.common.collect.f7l8, java.util.Map.Entry
        public V setValue(V v2) {
            m15775k();
            int i2 = this.f26243q;
            if (i2 == -1) {
                jk.this.put(this.f26241k, v2);
                return null;
            }
            Object[] objArr = jk.this.values;
            V v3 = (V) objArr[i2];
            objArr[i2] = v2;
            return v3;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.jk$g */
    /* JADX INFO: compiled from: CompactHashMap.java */
    class C4421g extends AbstractSet<K> {
        C4421g() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            jk.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return jk.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return jk.this.keySetIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@NullableDecl Object obj) {
            int iM15773q = jk.this.m15773q(obj);
            if (iM15773q == -1) {
                return false;
            }
            jk.this.m15772p(iM15773q);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return jk.this.f26237n;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.jk$k */
    /* JADX INFO: compiled from: CompactHashMap.java */
    class C4422k extends jk<K, V>.AbstractC4423n<K> {
        C4422k() {
            super(jk.this, null);
        }

        @Override // com.google.common.collect.jk.AbstractC4423n
        K toq(int i2) {
            return (K) jk.this.keys[i2];
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.jk$q */
    /* JADX INFO: compiled from: CompactHashMap.java */
    class C4424q extends AbstractSet<Map.Entry<K, V>> {
        C4424q() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            jk.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@NullableDecl Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int iM15773q = jk.this.m15773q(entry.getKey());
            return iM15773q != -1 && C4280z.m15455k(jk.this.values[iM15773q], entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return jk.this.entrySetIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@NullableDecl Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int iM15773q = jk.this.m15773q(entry.getKey());
            if (iM15773q == -1 || !C4280z.m15455k(jk.this.values[iM15773q], entry.getValue())) {
                return false;
            }
            jk.this.m15772p(iM15773q);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return jk.this.f26237n;
        }
    }

    /* JADX INFO: compiled from: CompactHashMap.java */
    class toq extends jk<K, V>.AbstractC4423n<Map.Entry<K, V>> {
        toq() {
            super(jk.this, null);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.jk.AbstractC4423n
        /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> toq(int i2) {
            return new f7l8(i2);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.jk$y */
    /* JADX INFO: compiled from: CompactHashMap.java */
    class C4425y extends AbstractCollection<V> {
        C4425y() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            jk.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return jk.this.valuesIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return jk.this.f26237n;
        }
    }

    /* JADX INFO: compiled from: CompactHashMap.java */
    class zy extends jk<K, V>.AbstractC4423n<V> {
        zy() {
            super(jk.this, null);
        }

        @Override // com.google.common.collect.jk.AbstractC4423n
        V toq(int i2) {
            return (V) jk.this.values[i2];
        }
    }

    jk() {
        init(3, 1.0f);
    }

    public static <K, V> jk<K, V> create() {
        return new jk<>();
    }

    public static <K, V> jk<K, V> createWithExpectedSize(int i2) {
        return new jk<>(i2);
    }

    private static int[] f7l8(int i2) {
        int[] iArr = new int[i2];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    /* JADX INFO: renamed from: g */
    private static long[] m15770g(int i2) {
        long[] jArr = new long[i2];
        Arrays.fill(jArr, -1L);
        return jArr;
    }

    /* JADX INFO: renamed from: k */
    private static int m15771k(long j2) {
        return (int) (j2 >>> 32);
    }

    private void ld6(int i2) {
        int length = this.entries.length;
        if (i2 > length) {
            int iMax = Math.max(1, length >>> 1) + length;
            if (iMax < 0) {
                iMax = Integer.MAX_VALUE;
            }
            if (iMax != length) {
                resizeEntries(iMax);
            }
        }
    }

    private static long n7h(long j2, int i2) {
        return (j2 & f26233i) | (((long) i2) & f26232h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @CanIgnoreReturnValue
    /* JADX INFO: renamed from: p */
    public V m15772p(int i2) {
        return m15774y(this.keys[i2], m15771k(this.entries[i2]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public int m15773q(@NullableDecl Object obj) {
        int iM15653q = etdu.m15653q(obj);
        int qVar = this.f26236k[zy() & iM15653q];
        while (qVar != -1) {
            long j2 = this.entries[qVar];
            if (m15771k(j2) == iM15653q && C4280z.m15455k(obj, this.keys[qVar])) {
                return qVar;
            }
            qVar = toq(j2);
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        init(3, 1.0f);
        int i2 = objectInputStream.readInt();
        while (true) {
            i2--;
            if (i2 < 0) {
                return;
            } else {
                put(objectInputStream.readObject(), objectInputStream.readObject());
            }
        }
    }

    private static int toq(long j2) {
        return (int) j2;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.f26237n);
        for (int i2 = 0; i2 < this.f26237n; i2++) {
            objectOutputStream.writeObject(this.keys[i2]);
            objectOutputStream.writeObject(this.values[i2]);
        }
    }

    private void x2(int i2) {
        if (this.f26236k.length >= 1073741824) {
            this.f26238q = Integer.MAX_VALUE;
            return;
        }
        int i3 = ((int) (i2 * this.loadFactor)) + 1;
        int[] iArrF7l8 = f7l8(i2);
        long[] jArr = this.entries;
        int length = iArrF7l8.length - 1;
        for (int i4 = 0; i4 < this.f26237n; i4++) {
            int iM15771k = m15771k(jArr[i4]);
            int i5 = iM15771k & length;
            int i6 = iArrF7l8[i5];
            iArrF7l8[i5] = i4;
            jArr[i4] = (((long) iM15771k) << 32) | (((long) i6) & f26232h);
        }
        this.f26238q = i3;
        this.f26236k = iArrF7l8;
    }

    @NullableDecl
    /* JADX INFO: renamed from: y */
    private V m15774y(@NullableDecl Object obj, int i2) {
        int iZy = zy() & i2;
        int i3 = this.f26236k[iZy];
        if (i3 == -1) {
            return null;
        }
        int i4 = -1;
        while (true) {
            if (m15771k(this.entries[i3]) == i2 && C4280z.m15455k(obj, this.keys[i3])) {
                V v2 = (V) this.values[i3];
                if (i4 == -1) {
                    this.f26236k[iZy] = toq(this.entries[i3]);
                } else {
                    long[] jArr = this.entries;
                    jArr[i4] = n7h(jArr[i4], toq(jArr[i3]));
                }
                moveLastEntry(i3);
                this.f26237n--;
                this.modCount++;
                return v2;
            }
            int qVar = toq(this.entries[i3]);
            if (qVar == -1) {
                return null;
            }
            i4 = i3;
            i3 = qVar;
        }
    }

    private int zy() {
        return this.f26236k.length - 1;
    }

    void accessEntry(int i2) {
    }

    int adjustAfterRemove(int i2, int i3) {
        return i2 - 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.modCount++;
        Arrays.fill(this.keys, 0, this.f26237n, (Object) null);
        Arrays.fill(this.values, 0, this.f26237n, (Object) null);
        Arrays.fill(this.f26236k, -1);
        Arrays.fill(this.entries, -1L);
        this.f26237n = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(@NullableDecl Object obj) {
        return m15773q(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(@NullableDecl Object obj) {
        for (int i2 = 0; i2 < this.f26237n; i2++) {
            if (C4280z.m15455k(obj, this.values[i2])) {
                return true;
            }
        }
        return false;
    }

    Set<Map.Entry<K, V>> createEntrySet() {
        return new C4424q();
    }

    Set<K> createKeySet() {
        return new C4421g();
    }

    Collection<V> createValues() {
        return new C4425y();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f26240y;
        if (set != null) {
            return set;
        }
        Set<Map.Entry<K, V>> setCreateEntrySet = createEntrySet();
        this.f26240y = setCreateEntrySet;
        return setCreateEntrySet;
    }

    Iterator<Map.Entry<K, V>> entrySetIterator() {
        return new toq();
    }

    int firstEntryIndex() {
        return isEmpty() ? -1 : 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(@NullableDecl Object obj) {
        int iM15773q = m15773q(obj);
        accessEntry(iM15773q);
        if (iM15773q == -1) {
            return null;
        }
        return (V) this.values[iM15773q];
    }

    int getSuccessor(int i2) {
        int i3 = i2 + 1;
        if (i3 < this.f26237n) {
            return i3;
        }
        return -1;
    }

    void init(int i2, float f2) {
        com.google.common.base.jk.m15380n(i2 >= 0, "Initial capacity must be non-negative");
        com.google.common.base.jk.m15380n(f2 > 0.0f, "Illegal load factor");
        int iM15652k = etdu.m15652k(i2, f2);
        this.f26236k = f7l8(iM15652k);
        this.loadFactor = f2;
        this.keys = new Object[i2];
        this.values = new Object[i2];
        this.entries = m15770g(i2);
        this.f26238q = Math.max(1, (int) (iM15652k * f2));
    }

    void insertEntry(int i2, @NullableDecl K k2, @NullableDecl V v2, int i3) {
        this.entries[i2] = (((long) i3) << 32) | f26232h;
        this.keys[i2] = k2;
        this.values[i2] = v2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return this.f26237n == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.f26235g;
        if (set != null) {
            return set;
        }
        Set<K> setCreateKeySet = createKeySet();
        this.f26235g = setCreateKeySet;
        return setCreateKeySet;
    }

    Iterator<K> keySetIterator() {
        return new C4422k();
    }

    void moveLastEntry(int i2) {
        int size = size() - 1;
        if (i2 >= size) {
            this.keys[i2] = null;
            this.values[i2] = null;
            this.entries[i2] = -1;
            return;
        }
        Object[] objArr = this.keys;
        objArr[i2] = objArr[size];
        Object[] objArr2 = this.values;
        objArr2[i2] = objArr2[size];
        objArr[size] = null;
        objArr2[size] = null;
        long[] jArr = this.entries;
        long j2 = jArr[size];
        jArr[i2] = j2;
        jArr[size] = -1;
        int iM15771k = m15771k(j2) & zy();
        int[] iArr = this.f26236k;
        int i3 = iArr[iM15771k];
        if (i3 == size) {
            iArr[iM15771k] = i2;
            return;
        }
        while (true) {
            long j3 = this.entries[i3];
            int qVar = toq(j3);
            if (qVar == size) {
                this.entries[i3] = n7h(j3, i2);
                return;
            }
            i3 = qVar;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CanIgnoreReturnValue
    @NullableDecl
    public V put(@NullableDecl K k2, @NullableDecl V v2) {
        long[] jArr = this.entries;
        Object[] objArr = this.keys;
        Object[] objArr2 = this.values;
        int iM15653q = etdu.m15653q(k2);
        int iZy = zy() & iM15653q;
        int i2 = this.f26237n;
        int[] iArr = this.f26236k;
        int i3 = iArr[iZy];
        if (i3 == -1) {
            iArr[iZy] = i2;
        } else {
            while (true) {
                long j2 = jArr[i3];
                if (m15771k(j2) == iM15653q && C4280z.m15455k(k2, objArr[i3])) {
                    V v3 = (V) objArr2[i3];
                    objArr2[i3] = v2;
                    accessEntry(i3);
                    return v3;
                }
                int qVar = toq(j2);
                if (qVar == -1) {
                    jArr[i3] = n7h(j2, i2);
                    break;
                }
                i3 = qVar;
            }
        }
        if (i2 == Integer.MAX_VALUE) {
            throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
        }
        int i4 = i2 + 1;
        ld6(i4);
        insertEntry(i2, k2, v2, iM15653q);
        this.f26237n = i4;
        if (i2 >= this.f26238q) {
            x2(this.f26236k.length * 2);
        }
        this.modCount++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CanIgnoreReturnValue
    @NullableDecl
    public V remove(@NullableDecl Object obj) {
        return m15774y(obj, etdu.m15653q(obj));
    }

    void resizeEntries(int i2) {
        this.keys = Arrays.copyOf(this.keys, i2);
        this.values = Arrays.copyOf(this.values, i2);
        long[] jArr = this.entries;
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, i2);
        if (i2 > length) {
            Arrays.fill(jArrCopyOf, length, i2, -1L);
        }
        this.entries = jArrCopyOf;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f26237n;
    }

    public void trimToSize() {
        int i2 = this.f26237n;
        if (i2 < this.entries.length) {
            resizeEntries(i2);
        }
        int iMax = Math.max(1, Integer.highestOneBit((int) (i2 / this.loadFactor)));
        if (iMax < 1073741824 && ((double) i2) / ((double) iMax) > this.loadFactor) {
            iMax <<= 1;
        }
        if (iMax < this.f26236k.length) {
            x2(iMax);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.f26239s;
        if (collection != null) {
            return collection;
        }
        Collection<V> collectionCreateValues = createValues();
        this.f26239s = collectionCreateValues;
        return collectionCreateValues;
    }

    Iterator<V> valuesIterator() {
        return new zy();
    }

    jk(int i2) {
        this(i2, 1.0f);
    }

    /* JADX INFO: renamed from: com.google.common.collect.jk$n */
    /* JADX INFO: compiled from: CompactHashMap.java */
    private abstract class AbstractC4423n<T> implements Iterator<T> {

        /* JADX INFO: renamed from: k */
        int f26247k;

        /* JADX INFO: renamed from: n */
        int f26248n;

        /* JADX INFO: renamed from: q */
        int f26249q;

        private AbstractC4423n() {
            this.f26247k = jk.this.modCount;
            this.f26249q = jk.this.firstEntryIndex();
            this.f26248n = -1;
        }

        /* JADX INFO: renamed from: k */
        private void m15776k() {
            if (jk.this.modCount != this.f26247k) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f26249q >= 0;
        }

        @Override // java.util.Iterator
        public T next() {
            m15776k();
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i2 = this.f26249q;
            this.f26248n = i2;
            T qVar = toq(i2);
            this.f26249q = jk.this.getSuccessor(this.f26249q);
            return qVar;
        }

        @Override // java.util.Iterator
        public void remove() {
            m15776k();
            C4524t.m15984n(this.f26248n >= 0);
            this.f26247k++;
            jk.this.m15772p(this.f26248n);
            this.f26249q = jk.this.adjustAfterRemove(this.f26249q, this.f26248n);
            this.f26248n = -1;
        }

        abstract T toq(int i2);

        /* synthetic */ AbstractC4423n(jk jkVar, C4422k c4422k) {
            this();
        }
    }

    jk(int i2, float f2) {
        init(i2, f2);
    }
}
