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

/* JADX INFO: renamed from: com.google.common.primitives.g */
/* JADX INFO: compiled from: ImmutableDoubleArray.java */
/* JADX INFO: loaded from: classes2.dex */
@Immutable
@wlev.toq
@InterfaceC7731k
public final class C4736g implements Serializable {

    /* JADX INFO: renamed from: q */
    private static final C4736g f27279q = new C4736g(new double[0]);
    private final double[] array;
    private final int end;

    /* JADX INFO: renamed from: k */
    private final transient int f27280k;

    /* JADX INFO: renamed from: com.google.common.primitives.g$toq */
    /* JADX INFO: compiled from: ImmutableDoubleArray.java */
    static class toq extends AbstractList<Double> implements RandomAccess, Serializable {
        private final C4736g parent;

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
            int i2 = this.parent.f27280k;
            for (Object obj2 : list) {
                if (obj2 instanceof Double) {
                    int i3 = i2 + 1;
                    if (C4736g.m16637k(this.parent.array[i2], ((Double) obj2).doubleValue())) {
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
            if (obj instanceof Double) {
                return this.parent.indexOf(((Double) obj).doubleValue());
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            if (obj instanceof Double) {
                return this.parent.lastIndexOf(((Double) obj).doubleValue());
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.parent.length();
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Double> subList(int i2, int i3) {
            return this.parent.subArray(i2, i3).asList();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            return this.parent.toString();
        }

        private toq(C4736g c4736g) {
            this.parent = c4736g;
        }

        @Override // java.util.AbstractList, java.util.List
        public Double get(int i2) {
            return Double.valueOf(this.parent.get(i2));
        }
    }

    /* JADX INFO: renamed from: com.google.common.primitives.g$zy */
    /* JADX INFO: compiled from: ImmutableDoubleArray.java */
    @CanIgnoreReturnValue
    public static final class zy {

        /* JADX INFO: renamed from: k */
        private double[] f27281k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private int f68576toq = 0;

        zy(int i2) {
            this.f27281k = new double[i2];
        }

        private void f7l8(int i2) {
            int i3 = this.f68576toq + i2;
            double[] dArr = this.f27281k;
            if (i3 > dArr.length) {
                double[] dArr2 = new double[m16638y(dArr.length, i3)];
                System.arraycopy(this.f27281k, 0, dArr2, 0, this.f68576toq);
                this.f27281k = dArr2;
            }
        }

        /* JADX INFO: renamed from: y */
        private static int m16638y(int i2, int i3) {
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
        public C4736g m16639g() {
            return this.f68576toq == 0 ? C4736g.f27279q : new C4736g(this.f27281k, 0, this.f68576toq);
        }

        /* JADX INFO: renamed from: k */
        public zy m16640k(double d2) {
            f7l8(1);
            double[] dArr = this.f27281k;
            int i2 = this.f68576toq;
            dArr[i2] = d2;
            this.f68576toq = i2 + 1;
            return this;
        }

        /* JADX INFO: renamed from: n */
        public zy m16641n(double[] dArr) {
            f7l8(dArr.length);
            System.arraycopy(dArr, 0, this.f27281k, this.f68576toq, dArr.length);
            this.f68576toq += dArr.length;
            return this;
        }

        /* JADX INFO: renamed from: q */
        public zy m16642q(Collection<Double> collection) {
            f7l8(collection.size());
            for (Double d2 : collection) {
                double[] dArr = this.f27281k;
                int i2 = this.f68576toq;
                this.f68576toq = i2 + 1;
                dArr[i2] = d2.doubleValue();
            }
            return this;
        }

        public zy toq(C4736g c4736g) {
            f7l8(c4736g.length());
            System.arraycopy(c4736g.array, c4736g.f27280k, this.f27281k, this.f68576toq, c4736g.length());
            this.f68576toq += c4736g.length();
            return this;
        }

        public zy zy(Iterable<Double> iterable) {
            if (iterable instanceof Collection) {
                return m16642q((Collection) iterable);
            }
            Iterator<Double> it = iterable.iterator();
            while (it.hasNext()) {
                m16640k(it.next().doubleValue());
            }
            return this;
        }
    }

    public static zy builder(int i2) {
        jk.ld6(i2 >= 0, "Invalid initialCapacity: %s", i2);
        return new zy(i2);
    }

    public static C4736g copyOf(double[] dArr) {
        return dArr.length == 0 ? f27279q : new C4736g(Arrays.copyOf(dArr, dArr.length));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static boolean m16637k(double d2, double d4) {
        return Double.doubleToLongBits(d2) == Double.doubleToLongBits(d4);
    }

    public static C4736g of() {
        return f27279q;
    }

    private boolean toq() {
        return this.f27280k > 0 || this.end < this.array.length;
    }

    public List<Double> asList() {
        return new toq();
    }

    public boolean contains(double d2) {
        return indexOf(d2) >= 0;
    }

    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4736g)) {
            return false;
        }
        C4736g c4736g = (C4736g) obj;
        if (length() != c4736g.length()) {
            return false;
        }
        for (int i2 = 0; i2 < length(); i2++) {
            if (!m16637k(get(i2), c4736g.get(i2))) {
                return false;
            }
        }
        return true;
    }

    public double get(int i2) {
        jk.mcp(i2, length());
        return this.array[this.f27280k + i2];
    }

    public int hashCode() {
        int iM16696p = 1;
        for (int i2 = this.f27280k; i2 < this.end; i2++) {
            iM16696p = (iM16696p * 31) + C4744q.m16696p(this.array[i2]);
        }
        return iM16696p;
    }

    public int indexOf(double d2) {
        for (int i2 = this.f27280k; i2 < this.end; i2++) {
            if (m16637k(this.array[i2], d2)) {
                return i2 - this.f27280k;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.end == this.f27280k;
    }

    public int lastIndexOf(double d2) {
        int i2 = this.end;
        do {
            i2--;
            if (i2 < this.f27280k) {
                return -1;
            }
        } while (!m16637k(this.array[i2], d2));
        return i2 - this.f27280k;
    }

    public int length() {
        return this.end - this.f27280k;
    }

    Object readResolve() {
        return isEmpty() ? f27279q : this;
    }

    public C4736g subArray(int i2, int i3) {
        jk.ek5k(i2, i3, length());
        if (i2 == i3) {
            return f27279q;
        }
        double[] dArr = this.array;
        int i4 = this.f27280k;
        return new C4736g(dArr, i2 + i4, i4 + i3);
    }

    public double[] toArray() {
        return Arrays.copyOfRange(this.array, this.f27280k, this.end);
    }

    public String toString() {
        if (isEmpty()) {
            return zurt.f43629h;
        }
        StringBuilder sb = new StringBuilder(length() * 5);
        sb.append('[');
        sb.append(this.array[this.f27280k]);
        int i2 = this.f27280k;
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

    public C4736g trimmed() {
        return toq() ? new C4736g(toArray()) : this;
    }

    Object writeReplace() {
        return trimmed();
    }

    private C4736g(double[] dArr) {
        this(dArr, 0, dArr.length);
    }

    public static C4736g of(double d2) {
        return new C4736g(new double[]{d2});
    }

    private C4736g(double[] dArr, int i2, int i3) {
        this.array = dArr;
        this.f27280k = i2;
        this.end = i3;
    }

    public static zy builder() {
        return new zy(10);
    }

    public static C4736g copyOf(Collection<Double> collection) {
        return collection.isEmpty() ? f27279q : new C4736g(C4744q.o1t(collection));
    }

    public static C4736g of(double d2, double d4) {
        return new C4736g(new double[]{d2, d4});
    }

    public static C4736g copyOf(Iterable<Double> iterable) {
        if (iterable instanceof Collection) {
            return copyOf((Collection<Double>) iterable);
        }
        return builder().zy(iterable).m16639g();
    }

    public static C4736g of(double d2, double d4, double d5) {
        return new C4736g(new double[]{d2, d4, d5});
    }

    public static C4736g of(double d2, double d4, double d5, double d6) {
        return new C4736g(new double[]{d2, d4, d5, d6});
    }

    public static C4736g of(double d2, double d4, double d5, double d6, double d7) {
        return new C4736g(new double[]{d2, d4, d5, d6, d7});
    }

    public static C4736g of(double d2, double d4, double d5, double d6, double d7, double d8) {
        return new C4736g(new double[]{d2, d4, d5, d6, d7, d8});
    }

    public static C4736g of(double d2, double... dArr) {
        jk.m15380n(dArr.length <= 2147483646, "the total number of elements must fit in an int");
        double[] dArr2 = new double[dArr.length + 1];
        dArr2[0] = d2;
        System.arraycopy(dArr, 0, dArr2, 1, dArr.length);
        return new C4736g(dArr2);
    }
}
