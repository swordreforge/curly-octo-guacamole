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
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import wlev.InterfaceC7731k;

/* JADX INFO: renamed from: com.google.common.primitives.s */
/* JADX INFO: compiled from: Ints.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
public final class C4746s {

    /* JADX INFO: renamed from: k */
    public static final int f27301k = 4;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final int f68584toq = 1073741824;

    /* JADX INFO: renamed from: com.google.common.primitives.s$k */
    /* JADX INFO: compiled from: Ints.java */
    @wlev.toq
    private static class k extends AbstractList<Integer> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        final int[] array;
        final int end;
        final int start;

        k(int[] iArr) {
            this(iArr, 0, iArr.length);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return (obj instanceof Integer) && C4746s.n7h(this.array, ((Integer) obj).intValue(), this.start, this.end) != -1;
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
            int iX2 = 1;
            for (int i2 = this.start; i2 < this.end; i2++) {
                iX2 = (iX2 * 31) + C4746s.x2(this.array[i2]);
            }
            return iX2;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            int iN7h;
            if (!(obj instanceof Integer) || (iN7h = C4746s.n7h(this.array, ((Integer) obj).intValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return iN7h - this.start;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            int iKi;
            if (!(obj instanceof Integer) || (iKi = C4746s.ki(this.array, ((Integer) obj).intValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return iKi - this.start;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.end - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Integer> subList(int i2, int i3) {
            jk.ek5k(i2, i3, size());
            if (i2 == i3) {
                return Collections.emptyList();
            }
            int[] iArr = this.array;
            int i4 = this.start;
            return new k(iArr, i2 + i4, i4 + i3);
        }

        int[] toIntArray() {
            return Arrays.copyOfRange(this.array, this.start, this.end);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 5);
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

        k(int[] iArr, int i2, int i3) {
            this.array = iArr;
            this.start = i2;
            this.end = i3;
        }

        @Override // java.util.AbstractList, java.util.List
        public Integer get(int i2) {
            jk.mcp(i2, size());
            return Integer.valueOf(this.array[this.start + i2]);
        }

        @Override // java.util.AbstractList, java.util.List
        public Integer set(int i2, Integer num) {
            jk.mcp(i2, size());
            int[] iArr = this.array;
            int i3 = this.start;
            int i4 = iArr[i3 + i2];
            iArr[i3 + i2] = ((Integer) jk.a9(num)).intValue();
            return Integer.valueOf(i4);
        }
    }

    /* JADX INFO: renamed from: com.google.common.primitives.s$toq */
    /* JADX INFO: compiled from: Ints.java */
    private static final class toq extends AbstractC4272s<String, Integer> implements Serializable {
        static final toq INSTANCE = new toq();
        private static final long serialVersionUID = 1;

        private toq() {
        }

        private Object readResolve() {
            return INSTANCE;
        }

        public String toString() {
            return "Ints.stringConverter()";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.AbstractC4272s
        public String doBackward(Integer num) {
            return num.toString();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.AbstractC4272s
        public Integer doForward(String str) {
            return Integer.decode(str);
        }
    }

    /* JADX INFO: renamed from: com.google.common.primitives.s$zy */
    /* JADX INFO: compiled from: Ints.java */
    private enum zy implements Comparator<int[]> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "Ints.lexicographicalComparator()";
        }

        @Override // java.util.Comparator
        public int compare(int[] iArr, int[] iArr2) {
            int iMin = Math.min(iArr.length, iArr2.length);
            for (int i2 = 0; i2 < iMin; i2++) {
                int iM16716n = C4746s.m16716n(iArr[i2], iArr2[i2]);
                if (iM16716n != 0) {
                    return iM16716n;
                }
            }
            return iArr.length - iArr2.length;
        }
    }

    private C4746s() {
    }

    @NullableDecl
    @InterfaceC7731k
    public static Integer a9(String str, int i2) {
        Long lMcp = C4743p.mcp(str, i2);
        if (lMcp == null || lMcp.longValue() != lMcp.intValue()) {
            return null;
        }
        return Integer.valueOf(lMcp.intValue());
    }

    public static int cdj(int[] iArr, int i2) {
        return ki(iArr, i2, 0, iArr.length);
    }

    @InterfaceC7731k
    public static int f7l8(int i2, int i3, int i4) {
        jk.qrj(i3 <= i4, "min (%s) must be less than or equal to max (%s)", i3, i4);
        return Math.min(Math.max(i2, i3), i4);
    }

    public static int fn3e(int... iArr) {
        jk.m15383q(iArr.length > 0);
        int i2 = iArr[0];
        for (int i3 = 1; i3 < iArr.length; i3++) {
            int i4 = iArr[i3];
            if (i4 < i2) {
                i2 = i4;
            }
        }
        return i2;
    }

    public static int fu4(long j2) {
        if (j2 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j2 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j2;
    }

    /* JADX INFO: renamed from: g */
    public static int[] m16712g(int[]... iArr) {
        int length = 0;
        for (int[] iArr2 : iArr) {
            length += iArr2.length;
        }
        int[] iArr3 = new int[length];
        int length2 = 0;
        for (int[] iArr4 : iArr) {
            System.arraycopy(iArr4, 0, iArr3, length2, iArr4.length);
            length2 += iArr4.length;
        }
        return iArr3;
    }

    /* JADX INFO: renamed from: h */
    public static String m16713h(String str, int... iArr) {
        jk.a9(str);
        if (iArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(iArr.length * 5);
        sb.append(iArr[0]);
        for (int i2 = 1; i2 < iArr.length; i2++) {
            sb.append(str);
            sb.append(iArr[i2]);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: i */
    public static int m16714i(int... iArr) {
        jk.m15383q(iArr.length > 0);
        int i2 = iArr[0];
        for (int i3 = 1; i3 < iArr.length; i3++) {
            int i4 = iArr[i3];
            if (i4 > i2) {
                i2 = i4;
            }
        }
        return i2;
    }

    @NullableDecl
    @InterfaceC7731k
    public static Integer jk(String str) {
        return a9(str, 10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int ki(int[] iArr, int i2, int i3, int i4) {
        for (int i5 = i4 - 1; i5 >= i3; i5--) {
            if (iArr[i5] == i2) {
                return i5;
            }
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0023, code lost:
    
        r0 = r0 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int kja0(int[] r5, int[] r6) {
        /*
            java.lang.String r0 = "array"
            com.google.common.base.jk.fti(r5, r0)
            java.lang.String r0 = "target"
            com.google.common.base.jk.fti(r6, r0)
            int r0 = r6.length
            r1 = 0
            if (r0 != 0) goto Lf
            return r1
        Lf:
            r0 = r1
        L10:
            int r2 = r5.length
            int r3 = r6.length
            int r2 = r2 - r3
            int r2 = r2 + 1
            if (r0 >= r2) goto L2a
            r2 = r1
        L18:
            int r3 = r6.length
            if (r2 >= r3) goto L29
            int r3 = r0 + r2
            r3 = r5[r3]
            r4 = r6[r2]
            if (r3 == r4) goto L26
            int r0 = r0 + 1
            goto L10
        L26:
            int r2 = r2 + 1
            goto L18
        L29:
            return r0
        L2a:
            r5 = -1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.primitives.C4746s.kja0(int[], int[]):int");
    }

    public static int ld6(byte b2, byte b3, byte b4, byte b5) {
        return (b2 << com.google.common.base.zy.f25759t) | ((b3 & 255) << 16) | ((b4 & 255) << 8) | (b5 & 255);
    }

    public static byte[] mcp(int i2) {
        return new byte[]{(byte) (i2 >> 24), (byte) (i2 >> 16), (byte) (i2 >> 8), (byte) i2};
    }

    /* JADX INFO: renamed from: n */
    public static int m16716n(int i2, int i3) {
        if (i2 < i3) {
            return -1;
        }
        return i2 > i3 ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int n7h(int[] iArr, int i2, int i3, int i4) {
        while (i3 < i4) {
            if (iArr[i3] == i2) {
                return i3;
            }
            i3++;
        }
        return -1;
    }

    public static void ni7(int[] iArr, int i2, int i3) {
        jk.a9(iArr);
        jk.ek5k(i2, i3, iArr.length);
        for (int i4 = i3 - 1; i2 < i4; i4--) {
            int i5 = iArr[i2];
            iArr[i2] = iArr[i4];
            iArr[i4] = i5;
            i2++;
        }
    }

    public static void o1t(int[] iArr, int i2, int i3) {
        jk.a9(iArr);
        jk.ek5k(i2, i3, iArr.length);
        Arrays.sort(iArr, i2, i3);
        ni7(iArr, i2, i3);
    }

    /* JADX INFO: renamed from: p */
    public static int m16717p(byte[] bArr) {
        jk.qrj(bArr.length >= 4, "array too small: %s < %s", bArr.length, 4);
        return ld6(bArr[0], bArr[1], bArr[2], bArr[3]);
    }

    /* JADX INFO: renamed from: q */
    public static int m16718q(long j2) {
        int i2 = (int) j2;
        jk.m15374h(((long) i2) == j2, "Out of range: %s", j2);
        return i2;
    }

    public static int qrj(int[] iArr, int i2) {
        return n7h(iArr, i2, 0, iArr.length);
    }

    /* JADX INFO: renamed from: s */
    public static int[] m16719s(int[] iArr, int i2, int i3) {
        jk.ld6(i2 >= 0, "Invalid minLength: %s", i2);
        jk.ld6(i3 >= 0, "Invalid padding: %s", i3);
        return iArr.length < i2 ? Arrays.copyOf(iArr, i2 + i3) : iArr;
    }

    /* JADX INFO: renamed from: t */
    public static int[] m16720t(Collection<? extends Number> collection) {
        if (collection instanceof k) {
            return ((k) collection).toIntArray();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = ((Number) jk.a9(array[i2])).intValue();
        }
        return iArr;
    }

    public static Comparator<int[]> t8r() {
        return zy.INSTANCE;
    }

    @InterfaceC7731k
    public static AbstractC4272s<String, Integer> wvg() {
        return toq.INSTANCE;
    }

    public static int x2(int i2) {
        return i2;
    }

    /* JADX INFO: renamed from: y */
    public static boolean m16721y(int[] iArr, int i2) {
        for (int i3 : iArr) {
            if (i3 == i2) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: z */
    public static void m16722z(int[] iArr) {
        jk.a9(iArr);
        o1t(iArr, 0, iArr.length);
    }

    public static void zurt(int[] iArr) {
        jk.a9(iArr);
        ni7(iArr, 0, iArr.length);
    }

    public static List<Integer> zy(int... iArr) {
        return iArr.length == 0 ? Collections.emptyList() : new k(iArr);
    }
}
