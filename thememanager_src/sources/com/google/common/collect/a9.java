package com.google.common.collect;

import com.google.common.base.C4280z;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: CompactHashSet.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.zy
class a9<E> extends AbstractSet<E> implements Serializable {
    static final int UNSET = -1;

    /* JADX INFO: renamed from: h */
    private static final long f25950h = -4294967296L;

    /* JADX INFO: renamed from: i */
    private static final int f25951i = 3;

    /* JADX INFO: renamed from: p */
    private static final long f25952p = 4294967295L;

    /* JADX INFO: renamed from: s */
    private static final float f25953s = 1.0f;

    /* JADX INFO: renamed from: y */
    private static final int f25954y = 1073741824;

    @MonotonicNonNullDecl
    transient Object[] elements;

    /* JADX INFO: renamed from: g */
    private transient int f25955g;

    /* JADX INFO: renamed from: k */
    @MonotonicNonNullDecl
    private transient int[] f25956k;
    transient float loadFactor;
    transient int modCount;

    /* JADX INFO: renamed from: n */
    private transient int f25957n;

    /* JADX INFO: renamed from: q */
    @MonotonicNonNullDecl
    private transient long[] f25958q;

    /* JADX INFO: renamed from: com.google.common.collect.a9$k */
    /* JADX INFO: compiled from: CompactHashSet.java */
    class C4312k implements Iterator<E> {

        /* JADX INFO: renamed from: k */
        int f25960k;

        /* JADX INFO: renamed from: n */
        int f25961n = -1;

        /* JADX INFO: renamed from: q */
        int f25962q;

        C4312k() {
            this.f25960k = a9.this.modCount;
            this.f25962q = a9.this.firstEntryIndex();
        }

        /* JADX INFO: renamed from: k */
        private void m15567k() {
            if (a9.this.modCount != this.f25960k) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f25962q >= 0;
        }

        @Override // java.util.Iterator
        public E next() {
            m15567k();
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i2 = this.f25962q;
            this.f25961n = i2;
            a9 a9Var = a9.this;
            E e2 = (E) a9Var.elements[i2];
            this.f25962q = a9Var.getSuccessor(i2);
            return e2;
        }

        @Override // java.util.Iterator
        public void remove() {
            m15567k();
            C4524t.m15984n(this.f25961n >= 0);
            this.f25960k++;
            a9 a9Var = a9.this;
            a9Var.f7l8(a9Var.elements[this.f25961n], a9.m15562k(a9Var.f25958q[this.f25961n]));
            this.f25962q = a9.this.adjustAfterRemove(this.f25962q, this.f25961n);
            this.f25961n = -1;
        }
    }

    a9() {
        init(3, 1.0f);
    }

    public static <E> a9<E> create() {
        return new a9<>();
    }

    public static <E> a9<E> createWithExpectedSize(int i2) {
        return new a9<>(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @CanIgnoreReturnValue
    public boolean f7l8(Object obj, int i2) {
        int iZy = zy() & i2;
        int i3 = this.f25956k[iZy];
        if (i3 == -1) {
            return false;
        }
        int i4 = -1;
        while (true) {
            if (m15562k(this.f25958q[i3]) == i2 && C4280z.m15455k(obj, this.elements[i3])) {
                if (i4 == -1) {
                    this.f25956k[iZy] = toq(this.f25958q[i3]);
                } else {
                    long[] jArr = this.f25958q;
                    jArr[i4] = m15564p(jArr[i4], toq(jArr[i3]));
                }
                moveEntry(i3);
                this.f25955g--;
                this.modCount++;
                return true;
            }
            int qVar = toq(this.f25958q[i3]);
            if (qVar == -1) {
                return false;
            }
            i4 = i3;
            i3 = qVar;
        }
    }

    /* JADX INFO: renamed from: g */
    private static int[] m15561g(int i2) {
        int[] iArr = new int[i2];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static int m15562k(long j2) {
        return (int) (j2 >>> 32);
    }

    /* JADX INFO: renamed from: n */
    private static long[] m15563n(int i2) {
        long[] jArr = new long[i2];
        Arrays.fill(jArr, -1L);
        return jArr;
    }

    /* JADX INFO: renamed from: p */
    private static long m15564p(long j2, int i2) {
        return (j2 & f25950h) | (((long) i2) & f25952p);
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
                add(objectInputStream.readObject());
            }
        }
    }

    /* JADX INFO: renamed from: s */
    private void m15565s(int i2) {
        if (this.f25956k.length >= 1073741824) {
            this.f25957n = Integer.MAX_VALUE;
            return;
        }
        int i3 = ((int) (i2 * this.loadFactor)) + 1;
        int[] iArrM15561g = m15561g(i2);
        long[] jArr = this.f25958q;
        int length = iArrM15561g.length - 1;
        for (int i4 = 0; i4 < this.f25955g; i4++) {
            int iM15562k = m15562k(jArr[i4]);
            int i5 = iM15562k & length;
            int i6 = iArrM15561g[i5];
            iArrM15561g[i5] = i4;
            jArr[i4] = (((long) iM15562k) << 32) | (((long) i6) & f25952p);
        }
        this.f25957n = i3;
        this.f25956k = iArrM15561g;
    }

    private static int toq(long j2) {
        return (int) j2;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.f25955g);
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            objectOutputStream.writeObject(it.next());
        }
    }

    /* JADX INFO: renamed from: y */
    private void m15566y(int i2) {
        int length = this.f25958q.length;
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

    private int zy() {
        return this.f25956k.length - 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @CanIgnoreReturnValue
    public boolean add(@NullableDecl E e2) {
        long[] jArr = this.f25958q;
        Object[] objArr = this.elements;
        int iM15653q = etdu.m15653q(e2);
        int iZy = zy() & iM15653q;
        int i2 = this.f25955g;
        int[] iArr = this.f25956k;
        int i3 = iArr[iZy];
        if (i3 == -1) {
            iArr[iZy] = i2;
        } else {
            while (true) {
                long j2 = jArr[i3];
                if (m15562k(j2) == iM15653q && C4280z.m15455k(e2, objArr[i3])) {
                    return false;
                }
                int qVar = toq(j2);
                if (qVar == -1) {
                    jArr[i3] = m15564p(j2, i2);
                    break;
                }
                i3 = qVar;
            }
        }
        if (i2 == Integer.MAX_VALUE) {
            throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
        }
        int i4 = i2 + 1;
        m15566y(i4);
        insertEntry(i2, e2, iM15653q);
        this.f25955g = i4;
        if (i2 >= this.f25957n) {
            m15565s(this.f25956k.length * 2);
        }
        this.modCount++;
        return true;
    }

    int adjustAfterRemove(int i2, int i3) {
        return i2 - 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.modCount++;
        Arrays.fill(this.elements, 0, this.f25955g, (Object) null);
        Arrays.fill(this.f25956k, -1);
        Arrays.fill(this.f25958q, -1L);
        this.f25955g = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@NullableDecl Object obj) {
        int iM15653q = etdu.m15653q(obj);
        int qVar = this.f25956k[zy() & iM15653q];
        while (qVar != -1) {
            long j2 = this.f25958q[qVar];
            if (m15562k(j2) == iM15653q && C4280z.m15455k(obj, this.elements[qVar])) {
                return true;
            }
            qVar = toq(j2);
        }
        return false;
    }

    int firstEntryIndex() {
        return isEmpty() ? -1 : 0;
    }

    int getSuccessor(int i2) {
        int i3 = i2 + 1;
        if (i3 < this.f25955g) {
            return i3;
        }
        return -1;
    }

    void init(int i2, float f2) {
        com.google.common.base.jk.m15380n(i2 >= 0, "Initial capacity must be non-negative");
        com.google.common.base.jk.m15380n(f2 > 0.0f, "Illegal load factor");
        int iM15652k = etdu.m15652k(i2, f2);
        this.f25956k = m15561g(iM15652k);
        this.loadFactor = f2;
        this.elements = new Object[i2];
        this.f25958q = m15563n(i2);
        this.f25957n = Math.max(1, (int) (iM15652k * f2));
    }

    void insertEntry(int i2, E e2, int i3) {
        this.f25958q[i2] = (((long) i3) << 32) | f25952p;
        this.elements[i2] = e2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f25955g == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return new C4312k();
    }

    void moveEntry(int i2) {
        int size = size() - 1;
        if (i2 >= size) {
            this.elements[i2] = null;
            this.f25958q[i2] = -1;
            return;
        }
        Object[] objArr = this.elements;
        objArr[i2] = objArr[size];
        objArr[size] = null;
        long[] jArr = this.f25958q;
        long j2 = jArr[size];
        jArr[i2] = j2;
        jArr[size] = -1;
        int iM15562k = m15562k(j2) & zy();
        int[] iArr = this.f25956k;
        int i3 = iArr[iM15562k];
        if (i3 == size) {
            iArr[iM15562k] = i2;
            return;
        }
        while (true) {
            long j3 = this.f25958q[i3];
            int qVar = toq(j3);
            if (qVar == size) {
                this.f25958q[i3] = m15564p(j3, i2);
                return;
            }
            i3 = qVar;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @CanIgnoreReturnValue
    public boolean remove(@NullableDecl Object obj) {
        return f7l8(obj, etdu.m15653q(obj));
    }

    void resizeEntries(int i2) {
        this.elements = Arrays.copyOf(this.elements, i2);
        long[] jArr = this.f25958q;
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, i2);
        if (i2 > length) {
            Arrays.fill(jArrCopyOf, length, i2, -1L);
        }
        this.f25958q = jArrCopyOf;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f25955g;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public Object[] toArray() {
        return Arrays.copyOf(this.elements, this.f25955g);
    }

    public void trimToSize() {
        int i2 = this.f25955g;
        if (i2 < this.f25958q.length) {
            resizeEntries(i2);
        }
        int iMax = Math.max(1, Integer.highestOneBit((int) (i2 / this.loadFactor)));
        if (iMax < 1073741824 && ((double) i2) / ((double) iMax) > this.loadFactor) {
            iMax <<= 1;
        }
        if (iMax < this.f25956k.length) {
            m15565s(iMax);
        }
    }

    public static <E> a9<E> create(Collection<? extends E> collection) {
        a9<E> a9VarCreateWithExpectedSize = createWithExpectedSize(collection.size());
        a9VarCreateWithExpectedSize.addAll(collection);
        return a9VarCreateWithExpectedSize;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @CanIgnoreReturnValue
    public <T> T[] toArray(T[] tArr) {
        return (T[]) r25n.n7h(this.elements, 0, this.f25955g, tArr);
    }

    a9(int i2) {
        init(i2, 1.0f);
    }

    public static <E> a9<E> create(E... eArr) {
        a9<E> a9VarCreateWithExpectedSize = createWithExpectedSize(eArr.length);
        Collections.addAll(a9VarCreateWithExpectedSize, eArr);
        return a9VarCreateWithExpectedSize;
    }
}
