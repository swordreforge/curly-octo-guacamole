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

/* JADX INFO: compiled from: ImmutableIntArray.java */
/* JADX INFO: loaded from: classes2.dex */
@Immutable
@wlev.toq
@InterfaceC7731k
public final class f7l8 implements Serializable {

    /* JADX INFO: renamed from: q */
    private static final f7l8 f27276q = new f7l8(new int[0]);
    private final int[] array;
    private final int end;

    /* JADX INFO: renamed from: k */
    private final transient int f27277k;

    /* JADX INFO: compiled from: ImmutableIntArray.java */
    static class toq extends AbstractList<Integer> implements RandomAccess, Serializable {
        private final f7l8 parent;

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
            int i2 = this.parent.f27277k;
            for (Object obj2 : list) {
                if (obj2 instanceof Integer) {
                    int i3 = i2 + 1;
                    if (this.parent.array[i2] == ((Integer) obj2).intValue()) {
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
            if (obj instanceof Integer) {
                return this.parent.indexOf(((Integer) obj).intValue());
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            if (obj instanceof Integer) {
                return this.parent.lastIndexOf(((Integer) obj).intValue());
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.parent.length();
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Integer> subList(int i2, int i3) {
            return this.parent.subArray(i2, i3).asList();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            return this.parent.toString();
        }

        private toq(f7l8 f7l8Var) {
            this.parent = f7l8Var;
        }

        @Override // java.util.AbstractList, java.util.List
        public Integer get(int i2) {
            return Integer.valueOf(this.parent.get(i2));
        }
    }

    /* JADX INFO: compiled from: ImmutableIntArray.java */
    @CanIgnoreReturnValue
    public static final class zy {

        /* JADX INFO: renamed from: k */
        private int[] f27278k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private int f68575toq = 0;

        zy(int i2) {
            this.f27278k = new int[i2];
        }

        private void f7l8(int i2) {
            int i3 = this.f68575toq + i2;
            int[] iArr = this.f27278k;
            if (i3 > iArr.length) {
                int[] iArr2 = new int[m16632y(iArr.length, i3)];
                System.arraycopy(this.f27278k, 0, iArr2, 0, this.f68575toq);
                this.f27278k = iArr2;
            }
        }

        /* JADX INFO: renamed from: y */
        private static int m16632y(int i2, int i3) {
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
        public f7l8 m16633g() {
            return this.f68575toq == 0 ? f7l8.f27276q : new f7l8(this.f27278k, 0, this.f68575toq);
        }

        /* JADX INFO: renamed from: k */
        public zy m16634k(int i2) {
            f7l8(1);
            int[] iArr = this.f27278k;
            int i3 = this.f68575toq;
            iArr[i3] = i2;
            this.f68575toq = i3 + 1;
            return this;
        }

        /* JADX INFO: renamed from: n */
        public zy m16635n(int[] iArr) {
            f7l8(iArr.length);
            System.arraycopy(iArr, 0, this.f27278k, this.f68575toq, iArr.length);
            this.f68575toq += iArr.length;
            return this;
        }

        /* JADX INFO: renamed from: q */
        public zy m16636q(Collection<Integer> collection) {
            f7l8(collection.size());
            for (Integer num : collection) {
                int[] iArr = this.f27278k;
                int i2 = this.f68575toq;
                this.f68575toq = i2 + 1;
                iArr[i2] = num.intValue();
            }
            return this;
        }

        public zy toq(f7l8 f7l8Var) {
            f7l8(f7l8Var.length());
            System.arraycopy(f7l8Var.array, f7l8Var.f27277k, this.f27278k, this.f68575toq, f7l8Var.length());
            this.f68575toq += f7l8Var.length();
            return this;
        }

        public zy zy(Iterable<Integer> iterable) {
            if (iterable instanceof Collection) {
                return m16636q((Collection) iterable);
            }
            Iterator<Integer> it = iterable.iterator();
            while (it.hasNext()) {
                m16634k(it.next().intValue());
            }
            return this;
        }
    }

    public static zy builder(int i2) {
        jk.ld6(i2 >= 0, "Invalid initialCapacity: %s", i2);
        return new zy(i2);
    }

    public static f7l8 copyOf(int[] iArr) {
        return iArr.length == 0 ? f27276q : new f7l8(Arrays.copyOf(iArr, iArr.length));
    }

    /* JADX INFO: renamed from: k */
    private boolean m16631k() {
        return this.f27277k > 0 || this.end < this.array.length;
    }

    public static f7l8 of() {
        return f27276q;
    }

    public List<Integer> asList() {
        return new toq();
    }

    public boolean contains(int i2) {
        return indexOf(i2) >= 0;
    }

    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f7l8)) {
            return false;
        }
        f7l8 f7l8Var = (f7l8) obj;
        if (length() != f7l8Var.length()) {
            return false;
        }
        for (int i2 = 0; i2 < length(); i2++) {
            if (get(i2) != f7l8Var.get(i2)) {
                return false;
            }
        }
        return true;
    }

    public int get(int i2) {
        jk.mcp(i2, length());
        return this.array[this.f27277k + i2];
    }

    public int hashCode() {
        int iX2 = 1;
        for (int i2 = this.f27277k; i2 < this.end; i2++) {
            iX2 = (iX2 * 31) + C4746s.x2(this.array[i2]);
        }
        return iX2;
    }

    public int indexOf(int i2) {
        for (int i3 = this.f27277k; i3 < this.end; i3++) {
            if (this.array[i3] == i2) {
                return i3 - this.f27277k;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.end == this.f27277k;
    }

    public int lastIndexOf(int i2) {
        int i3;
        int i4 = this.end;
        do {
            i4--;
            i3 = this.f27277k;
            if (i4 < i3) {
                return -1;
            }
        } while (this.array[i4] != i2);
        return i4 - i3;
    }

    public int length() {
        return this.end - this.f27277k;
    }

    Object readResolve() {
        return isEmpty() ? f27276q : this;
    }

    public f7l8 subArray(int i2, int i3) {
        jk.ek5k(i2, i3, length());
        if (i2 == i3) {
            return f27276q;
        }
        int[] iArr = this.array;
        int i4 = this.f27277k;
        return new f7l8(iArr, i2 + i4, i4 + i3);
    }

    public int[] toArray() {
        return Arrays.copyOfRange(this.array, this.f27277k, this.end);
    }

    public String toString() {
        if (isEmpty()) {
            return zurt.f43629h;
        }
        StringBuilder sb = new StringBuilder(length() * 5);
        sb.append('[');
        sb.append(this.array[this.f27277k]);
        int i2 = this.f27277k;
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

    public f7l8 trimmed() {
        return m16631k() ? new f7l8(toArray()) : this;
    }

    Object writeReplace() {
        return trimmed();
    }

    private f7l8(int[] iArr) {
        this(iArr, 0, iArr.length);
    }

    public static f7l8 copyOf(Collection<Integer> collection) {
        return collection.isEmpty() ? f27276q : new f7l8(C4746s.m16720t(collection));
    }

    public static f7l8 of(int i2) {
        return new f7l8(new int[]{i2});
    }

    private f7l8(int[] iArr, int i2, int i3) {
        this.array = iArr;
        this.f27277k = i2;
        this.end = i3;
    }

    public static zy builder() {
        return new zy(10);
    }

    public static f7l8 copyOf(Iterable<Integer> iterable) {
        if (iterable instanceof Collection) {
            return copyOf((Collection<Integer>) iterable);
        }
        return builder().zy(iterable).m16633g();
    }

    public static f7l8 of(int i2, int i3) {
        return new f7l8(new int[]{i2, i3});
    }

    public static f7l8 of(int i2, int i3, int i4) {
        return new f7l8(new int[]{i2, i3, i4});
    }

    public static f7l8 of(int i2, int i3, int i4, int i5) {
        return new f7l8(new int[]{i2, i3, i4, i5});
    }

    public static f7l8 of(int i2, int i3, int i4, int i5, int i6) {
        return new f7l8(new int[]{i2, i3, i4, i5, i6});
    }

    public static f7l8 of(int i2, int i3, int i4, int i5, int i6, int i7) {
        return new f7l8(new int[]{i2, i3, i4, i5, i6, i7});
    }

    public static f7l8 of(int i2, int... iArr) {
        jk.m15380n(iArr.length <= 2147483646, "the total number of elements must fit in an int");
        int[] iArr2 = new int[iArr.length + 1];
        iArr2[0] = i2;
        System.arraycopy(iArr, 0, iArr2, 1, iArr.length);
        return new f7l8(iArr2);
    }
}
