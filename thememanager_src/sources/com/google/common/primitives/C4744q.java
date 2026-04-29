package com.google.common.primitives;

import com.google.common.base.AbstractC4272s;
import com.google.common.base.jk;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import wlev.InterfaceC7731k;

/* JADX INFO: renamed from: com.google.common.primitives.q */
/* JADX INFO: compiled from: Doubles.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq(emulated = true)
public final class C4744q {

    /* JADX INFO: renamed from: k */
    public static final int f27297k = 8;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @wlev.zy
    static final Pattern f68582toq = m16698s();

    /* JADX INFO: renamed from: com.google.common.primitives.q$k */
    /* JADX INFO: compiled from: Doubles.java */
    @wlev.toq
    private static class k extends AbstractList<Double> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        final double[] array;
        final int end;
        final int start;

        k(double[] dArr) {
            this(dArr, 0, dArr.length);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return (obj instanceof Double) && C4744q.x2(this.array, ((Double) obj).doubleValue(), this.start, this.end) != -1;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@NullableDecl Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof k)) {
                return super.equals(obj);
            }
            k kVar = (k) obj;
            int size = size();
            if (kVar.size() != size) {
                return false;
            }
            for (int i2 = 0; i2 < size; i2++) {
                if (this.array[this.start + i2] != kVar.array[kVar.start + i2]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int iM16696p = 1;
            for (int i2 = this.start; i2 < this.end; i2++) {
                iM16696p = (iM16696p * 31) + C4744q.m16696p(this.array[i2]);
            }
            return iM16696p;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            int iX2;
            if (!(obj instanceof Double) || (iX2 = C4744q.x2(this.array, ((Double) obj).doubleValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return iX2 - this.start;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            int iCdj;
            if (!(obj instanceof Double) || (iCdj = C4744q.cdj(this.array, ((Double) obj).doubleValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return iCdj - this.start;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.end - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Double> subList(int i2, int i3) {
            jk.ek5k(i2, i3, size());
            if (i2 == i3) {
                return Collections.emptyList();
            }
            double[] dArr = this.array;
            int i4 = this.start;
            return new k(dArr, i2 + i4, i4 + i3);
        }

        double[] toDoubleArray() {
            return Arrays.copyOfRange(this.array, this.start, this.end);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 12);
            sb.append('[');
            sb.append(this.array[this.start]);
            int i2 = this.start;
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

        k(double[] dArr, int i2, int i3) {
            this.array = dArr;
            this.start = i2;
            this.end = i3;
        }

        @Override // java.util.AbstractList, java.util.List
        public Double get(int i2) {
            jk.mcp(i2, size());
            return Double.valueOf(this.array[this.start + i2]);
        }

        @Override // java.util.AbstractList, java.util.List
        public Double set(int i2, Double d2) {
            jk.mcp(i2, size());
            double[] dArr = this.array;
            int i3 = this.start;
            double d4 = dArr[i3 + i2];
            dArr[i3 + i2] = ((Double) jk.a9(d2)).doubleValue();
            return Double.valueOf(d4);
        }
    }

    /* JADX INFO: renamed from: com.google.common.primitives.q$toq */
    /* JADX INFO: compiled from: Doubles.java */
    private static final class toq extends AbstractC4272s<String, Double> implements Serializable {
        static final toq INSTANCE = new toq();
        private static final long serialVersionUID = 1;

        private toq() {
        }

        private Object readResolve() {
            return INSTANCE;
        }

        public String toString() {
            return "Doubles.stringConverter()";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.AbstractC4272s
        public String doBackward(Double d2) {
            return d2.toString();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.AbstractC4272s
        public Double doForward(String str) {
            return Double.valueOf(str);
        }
    }

    /* JADX INFO: renamed from: com.google.common.primitives.q$zy */
    /* JADX INFO: compiled from: Doubles.java */
    private enum zy implements Comparator<double[]> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "Doubles.lexicographicalComparator()";
        }

        @Override // java.util.Comparator
        public int compare(double[] dArr, double[] dArr2) {
            int iMin = Math.min(dArr.length, dArr2.length);
            for (int i2 = 0; i2 < iMin; i2++) {
                int iCompare = Double.compare(dArr[i2], dArr2[i2]);
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            return dArr.length - dArr2.length;
        }
    }

    private C4744q() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int cdj(double[] dArr, double d2, int i2, int i3) {
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            if (dArr[i4] == d2) {
                return i4;
            }
        }
        return -1;
    }

    public static boolean f7l8(double[] dArr, double d2) {
        for (double d4 : dArr) {
            if (d4 == d2) {
                return true;
            }
        }
        return false;
    }

    public static void fn3e(double[] dArr) {
        jk.a9(dArr);
        zurt(dArr, 0, dArr.length);
    }

    public static void fu4(double[] dArr, int i2, int i3) {
        jk.a9(dArr);
        jk.ek5k(i2, i3, dArr.length);
        Arrays.sort(dArr, i2, i3);
        zurt(dArr, i2, i3);
    }

    @InterfaceC7731k
    /* JADX INFO: renamed from: g */
    public static double m16691g(double d2, double d4, double d5) {
        jk.m15391z(d4 <= d5, "min (%s) must be less than or equal to max (%s)", Double.valueOf(d4), Double.valueOf(d5));
        return Math.min(Math.max(d2, d4), d5);
    }

    /* JADX INFO: renamed from: h */
    public static int m16692h(double[] dArr, double d2) {
        return cdj(dArr, d2, 0, dArr.length);
    }

    /* JADX INFO: renamed from: i */
    public static double m16693i(double... dArr) {
        jk.m15383q(dArr.length > 0);
        double dMin = dArr[0];
        for (int i2 = 1; i2 < dArr.length; i2++) {
            dMin = Math.min(dMin, dArr[i2]);
        }
        return dMin;
    }

    public static Comparator<double[]> ki() {
        return zy.INSTANCE;
    }

    public static String kja0(String str, double... dArr) {
        jk.a9(str);
        if (dArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(dArr.length * 12);
        sb.append(dArr[0]);
        for (int i2 = 1; i2 < dArr.length; i2++) {
            sb.append(str);
            sb.append(dArr[i2]);
        }
        return sb.toString();
    }

    public static int ld6(double[] dArr, double d2) {
        return x2(dArr, d2, 0, dArr.length);
    }

    /* JADX INFO: renamed from: n */
    public static double[] m16695n(double[]... dArr) {
        int length = 0;
        for (double[] dArr2 : dArr) {
            length += dArr2.length;
        }
        double[] dArr3 = new double[length];
        int length2 = 0;
        for (double[] dArr4 : dArr) {
            System.arraycopy(dArr4, 0, dArr3, length2, dArr4.length);
            length2 += dArr4.length;
        }
        return dArr3;
    }

    public static boolean n7h(double d2) {
        return Double.NEGATIVE_INFINITY < d2 && d2 < Double.POSITIVE_INFINITY;
    }

    public static void ni7(double[] dArr) {
        jk.a9(dArr);
        fu4(dArr, 0, dArr.length);
    }

    public static double[] o1t(Collection<? extends Number> collection) {
        if (collection instanceof k) {
            return ((k) collection).toDoubleArray();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        double[] dArr = new double[length];
        for (int i2 = 0; i2 < length; i2++) {
            dArr[i2] = ((Number) jk.a9(array[i2])).doubleValue();
        }
        return dArr;
    }

    /* JADX INFO: renamed from: p */
    public static int m16696p(double d2) {
        return Double.valueOf(d2).hashCode();
    }

    /* JADX INFO: renamed from: q */
    public static int m16697q(double d2, double d4) {
        return Double.compare(d2, d4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        r0 = r0 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int qrj(double[] r7, double[] r8) {
        /*
            java.lang.String r0 = "array"
            com.google.common.base.jk.fti(r7, r0)
            java.lang.String r0 = "target"
            com.google.common.base.jk.fti(r8, r0)
            int r0 = r8.length
            r1 = 0
            if (r0 != 0) goto Lf
            return r1
        Lf:
            r0 = r1
        L10:
            int r2 = r7.length
            int r3 = r8.length
            int r2 = r2 - r3
            int r2 = r2 + 1
            if (r0 >= r2) goto L2c
            r2 = r1
        L18:
            int r3 = r8.length
            if (r2 >= r3) goto L2b
            int r3 = r0 + r2
            r3 = r7[r3]
            r5 = r8[r2]
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L28
            int r0 = r0 + 1
            goto L10
        L28:
            int r2 = r2 + 1
            goto L18
        L2b:
            return r0
        L2c:
            r7 = -1
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.primitives.C4744q.qrj(double[], double[]):int");
    }

    @wlev.zy
    /* JADX INFO: renamed from: s */
    private static Pattern m16698s() {
        return Pattern.compile(("[+-]?(?:NaN|Infinity|" + ("(?:\\d+#(?:\\.\\d*#)?|\\.\\d+#)(?:[eE][+-]?\\d+#)?[fFdD]?") + "|" + ("0[xX](?:[0-9a-fA-F]+#(?:\\.[0-9a-fA-F]*#)?|\\.[0-9a-fA-F]+#)[pP][+-]?\\d+#[fFdD]?") + ")").replace("#", "+"));
    }

    public static double t8r(double... dArr) {
        jk.m15383q(dArr.length > 0);
        double dMax = dArr[0];
        for (int i2 = 1; i2 < dArr.length; i2++) {
            dMax = Math.max(dMax, dArr[i2]);
        }
        return dMax;
    }

    @NullableDecl
    @InterfaceC7731k
    @wlev.zy
    public static Double wvg(String str) {
        if (!f68582toq.matcher(str).matches()) {
            return null;
        }
        try {
            return Double.valueOf(Double.parseDouble(str));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int x2(double[] dArr, double d2, int i2, int i3) {
        while (i2 < i3) {
            if (dArr[i2] == d2) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: y */
    public static double[] m16699y(double[] dArr, int i2, int i3) {
        jk.ld6(i2 >= 0, "Invalid minLength: %s", i2);
        jk.ld6(i3 >= 0, "Invalid padding: %s", i3);
        return dArr.length < i2 ? Arrays.copyOf(dArr, i2 + i3) : dArr;
    }

    @InterfaceC7731k
    /* JADX INFO: renamed from: z */
    public static AbstractC4272s<String, Double> m16700z() {
        return toq.INSTANCE;
    }

    public static void zurt(double[] dArr, int i2, int i3) {
        jk.a9(dArr);
        jk.ek5k(i2, i3, dArr.length);
        for (int i4 = i3 - 1; i2 < i4; i4--) {
            double d2 = dArr[i2];
            dArr[i2] = dArr[i4];
            dArr[i4] = d2;
            i2++;
        }
    }

    public static List<Double> zy(double... dArr) {
        return dArr.length == 0 ? Collections.emptyList() : new k(dArr);
    }
}
