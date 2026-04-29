package com.google.common.primitives;

import com.google.common.base.jk;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.CheckReturnValue;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import okhttp3.zurt;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import wlev.InterfaceC7731k;

/* JADX INFO: renamed from: com.google.common.primitives.y */
/* JADX INFO: compiled from: ImmutableLongArray.java */
/* JADX INFO: loaded from: classes2.dex */
@Immutable
@wlev.toq
@InterfaceC7731k
public final class C4749y implements Serializable {

    /* JADX INFO: renamed from: q */
    private static final C4749y f27307q = new C4749y(new long[0]);
    private final long[] array;
    private final int end;

    /* JADX INFO: renamed from: k */
    private final transient int f27308k;

    /* JADX INFO: renamed from: com.google.common.primitives.y$toq */
    /* JADX INFO: compiled from: ImmutableLongArray.java */
    static class toq extends AbstractList<Long> implements RandomAccess, Serializable {
        private final C4749y parent;

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return indexOf(obj) >= 0;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@NullableDecl Object obj) {
            if (obj instanceof toq) {
                return this.parent.equals(((toq) obj).parent);
            }
            if (!(obj instanceof List)) {
                return false;
            }
            List list = (List) obj;
            if (size() != list.size()) {
                return false;
            }
            int i2 = this.parent.f27308k;
            for (Object obj2 : list) {
                if (obj2 instanceof Long) {
                    int i3 = i2 + 1;
                    if (this.parent.array[i2] == ((Long) obj2).longValue()) {
                        i2 = i3;
                    }
                }
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            return this.parent.hashCode();
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            if (obj instanceof Long) {
                return this.parent.indexOf(((Long) obj).longValue());
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            if (obj instanceof Long) {
                return this.parent.lastIndexOf(((Long) obj).longValue());
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.parent.length();
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Long> subList(int i2, int i3) {
            return this.parent.subArray(i2, i3).asList();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            return this.parent.toString();
        }

        private toq(C4749y c4749y) {
            this.parent = c4749y;
        }

        @Override // java.util.AbstractList, java.util.List
        public Long get(int i2) {
            return Long.valueOf(this.parent.get(i2));
        }
    }

    /* JADX INFO: renamed from: com.google.common.primitives.y$zy */
    /* JADX INFO: compiled from: ImmutableLongArray.java */
    @CanIgnoreReturnValue
    public static final class zy {

        /* JADX INFO: renamed from: k */
        private long[] f27309k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private int f68588toq = 0;

        zy(int i2) {
            this.f27309k = new long[i2];
        }

        private void f7l8(int i2) {
            int i3 = this.f68588toq + i2;
            long[] jArr = this.f27309k;
            if (i3 > jArr.length) {
                long[] jArr2 = new long[m16744y(jArr.length, i3)];
                System.arraycopy(this.f27309k, 0, jArr2, 0, this.f68588toq);
                this.f27309k = jArr2;
            }
        }

        /* JADX INFO: renamed from: y */
        private static int m16744y(int i2, int i3) {
            if (i3 < 0) {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
            int iHighestOneBit = i2 + (i2 >> 1) + 1;
            if (iHighestOneBit < i3) {
                iHighestOneBit = Integer.highestOneBit(i3 - 1) << 1;
            }
            if (iHighestOneBit < 0) {
                return Integer.MAX_VALUE;
            }
            return iHighestOneBit;
        }

        @CheckReturnValue
        /* JADX INFO: renamed from: g */
        public C4749y m16745g() {
            return this.f68588toq == 0 ? C4749y.f27307q : new C4749y(this.f27309k, 0, this.f68588toq);
        }

        /* JADX INFO: renamed from: k */
        public zy m16746k(long j2) {
            f7l8(1);
            long[] jArr = this.f27309k;
            int i2 = this.f68588toq;
            jArr[i2] = j2;
            this.f68588toq = i2 + 1;
            return this;
        }

        /* JADX INFO: renamed from: n */
        public zy m16747n(long[] jArr) {
            f7l8(jArr.length);
            System.arraycopy(jArr, 0, this.f27309k, this.f68588toq, jArr.length);
            this.f68588toq += jArr.length;
            return this;
        }

        /* JADX INFO: renamed from: q */
        public zy m16748q(Collection<Long> collection) {
            f7l8(collection.size());
            for (Long l2 : collection) {
                long[] jArr = this.f27309k;
                int i2 = this.f68588toq;
                this.f68588toq = i2 + 1;
                jArr[i2] = l2.longValue();
            }
            return this;
        }

        public zy toq(C4749y c4749y) {
            f7l8(c4749y.length());
            System.arraycopy(c4749y.array, c4749y.f27308k, this.f27309k, this.f68588toq, c4749y.length());
            this.f68588toq += c4749y.length();
            return this;
        }

        public zy zy(Iterable<Long> iterable) {
            if (iterable instanceof Collection) {
                return m16748q((Collection) iterable);
            }
            Iterator<Long> it = iterable.iterator();
            while (it.hasNext()) {
                m16746k(it.next().longValue());
            }
            return this;
        }
    }

    public static zy builder(int i2) {
        jk.ld6(i2 >= 0, "Invalid initialCapacity: %s", i2);
        return new zy(i2);
    }

    public static C4749y copyOf(long[] jArr) {
        return jArr.length == 0 ? f27307q : new C4749y(Arrays.copyOf(jArr, jArr.length));
    }

    /* JADX INFO: renamed from: k */
    private boolean m16743k() {
        return this.f27308k > 0 || this.end < this.array.length;
    }

    public static C4749y of() {
        return f27307q;
    }

    public List<Long> asList() {
        return new toq();
    }

    public boolean contains(long j2) {
        return indexOf(j2) >= 0;
    }

    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4749y)) {
            return false;
        }
        C4749y c4749y = (C4749y) obj;
        if (length() != c4749y.length()) {
            return false;
        }
        for (int i2 = 0; i2 < length(); i2++) {
            if (get(i2) != c4749y.get(i2)) {
                return false;
            }
        }
        return true;
    }

    public long get(int i2) {
        jk.mcp(i2, length());
        return this.array[this.f27308k + i2];
    }

    public int hashCode() {
        int iLd6 = 1;
        for (int i2 = this.f27308k; i2 < this.end; i2++) {
            iLd6 = (iLd6 * 31) + C4743p.ld6(this.array[i2]);
        }
        return iLd6;
    }

    public int indexOf(long j2) {
        for (int i2 = this.f27308k; i2 < this.end; i2++) {
            if (this.array[i2] == j2) {
                return i2 - this.f27308k;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.end == this.f27308k;
    }

    public int lastIndexOf(long j2) {
        int i2;
        int i3 = this.end;
        do {
            i3--;
            i2 = this.f27308k;
            if (i3 < i2) {
                return -1;
            }
        } while (this.array[i3] != j2);
        return i3 - i2;
    }

    public int length() {
        return this.end - this.f27308k;
    }

    Object readResolve() {
        return isEmpty() ? f27307q : this;
    }

    public C4749y subArray(int i2, int i3) {
        jk.ek5k(i2, i3, length());
        if (i2 == i3) {
            return f27307q;
        }
        long[] jArr = this.array;
        int i4 = this.f27308k;
        return new C4749y(jArr, i2 + i4, i4 + i3);
    }

    public long[] toArray() {
        return Arrays.copyOfRange(this.array, this.f27308k, this.end);
    }

    public String toString() {
        if (isEmpty()) {
            return zurt.f43629h;
        }
        StringBuilder sb = new StringBuilder(length() * 5);
        sb.append('[');
        sb.append(this.array[this.f27308k]);
        int i2 = this.f27308k;
        while (true) {
            i2++;
            if (i2 >= this.end) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(", ");
            sb.append(this.array[i2]);
        }
    }

    public C4749y trimmed() {
        return m16743k() ? new C4749y(toArray()) : this;
    }

    Object writeReplace() {
        return trimmed();
    }

    private C4749y(long[] jArr) {
        this(jArr, 0, jArr.length);
    }

    public static C4749y of(long j2) {
        return new C4749y(new long[]{j2});
    }

    private C4749y(long[] jArr, int i2, int i3) {
        this.array = jArr;
        this.f27308k = i2;
        this.end = i3;
    }

    public static zy builder() {
        return new zy(10);
    }

    public static C4749y copyOf(Collection<Long> collection) {
        return collection.isEmpty() ? f27307q : new C4749y(C4743p.o1t(collection));
    }

    public static C4749y of(long j2, long j3) {
        return new C4749y(new long[]{j2, j3});
    }

    public static C4749y copyOf(Iterable<Long> iterable) {
        if (iterable instanceof Collection) {
            return copyOf((Collection<Long>) iterable);
        }
        return builder().zy(iterable).m16745g();
    }

    public static C4749y of(long j2, long j3, long j4) {
        return new C4749y(new long[]{j2, j3, j4});
    }

    public static C4749y of(long j2, long j3, long j4, long j5) {
        return new C4749y(new long[]{j2, j3, j4, j5});
    }

    public static C4749y of(long j2, long j3, long j4, long j5, long j6) {
        return new C4749y(new long[]{j2, j3, j4, j5, j6});
    }

    public static C4749y of(long j2, long j3, long j4, long j5, long j6, long j7) {
        return new C4749y(new long[]{j2, j3, j4, j5, j6, j7});
    }

    public static C4749y of(long j2, long... jArr) {
        jk.m15380n(jArr.length <= 2147483646, "the total number of elements must fit in an int");
        long[] jArr2 = new long[jArr.length + 1];
        jArr2[0] = j2;
        System.arraycopy(jArr, 0, jArr2, 1, jArr.length);
        return new C4749y(jArr2);
    }
}
