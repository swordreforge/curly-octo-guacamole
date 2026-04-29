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

/* JADX INFO: renamed from: com.google.common.primitives.p */
/* JADX INFO: compiled from: Longs.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
public final class C4743p {

    /* JADX INFO: renamed from: k */
    public static final int f27294k = 8;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final long f68581toq = 4611686018427387904L;

    /* JADX INFO: renamed from: com.google.common.primitives.p$k */
    /* JADX INFO: compiled from: Longs.java */
    static final class k {

        /* JADX INFO: renamed from: k */
        private static final byte[] f27295k;

        static {
            byte[] bArr = new byte[128];
            Arrays.fill(bArr, (byte) -1);
            for (int i2 = 0; i2 <= 9; i2++) {
                bArr[i2 + 48] = (byte) i2;
            }
            for (int i3 = 0; i3 <= 26; i3++) {
                byte b2 = (byte) (i3 + 10);
                bArr[i3 + 65] = b2;
                bArr[i3 + 97] = b2;
            }
            f27295k = bArr;
        }

        private k() {
        }

        /* JADX INFO: renamed from: k */
        static int m16690k(char c2) {
            if (c2 < 128) {
                return f27295k[c2];
            }
            return -1;
        }
    }

    /* JADX INFO: renamed from: com.google.common.primitives.p$q */
    /* JADX INFO: compiled from: Longs.java */
    private static final class q extends AbstractC4272s<String, Long> implements Serializable {
        static final q INSTANCE = new q();
        private static final long serialVersionUID = 1;

        private q() {
        }

        private Object readResolve() {
            return INSTANCE;
        }

        public String toString() {
            return "Longs.stringConverter()";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.AbstractC4272s
        public String doBackward(Long l2) {
            return l2.toString();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.AbstractC4272s
        public Long doForward(String str) {
            return Long.decode(str);
        }
    }

    /* JADX INFO: renamed from: com.google.common.primitives.p$toq */
    /* JADX INFO: compiled from: Longs.java */
    private enum toq implements Comparator<long[]> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "Longs.lexicographicalComparator()";
        }

        @Override // java.util.Comparator
        public int compare(long[] jArr, long[] jArr2) {
            int iMin = Math.min(jArr.length, jArr2.length);
            for (int i2 = 0; i2 < iMin; i2++) {
                int iM16685q = C4743p.m16685q(jArr[i2], jArr2[i2]);
                if (iM16685q != 0) {
                    return iM16685q;
                }
            }
            return jArr.length - jArr2.length;
        }
    }

    /* JADX INFO: renamed from: com.google.common.primitives.p$zy */
    /* JADX INFO: compiled from: Longs.java */
    @wlev.toq
    private static class zy extends AbstractList<Long> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        final long[] array;
        final int end;
        final int start;

        zy(long[] jArr) {
            this(jArr, 0, jArr.length);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return (obj instanceof Long) && C4743p.qrj(this.array, ((Long) obj).longValue(), this.start, this.end) != -1;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@NullableDecl Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof zy)) {
                return super.equals(obj);
            }
            zy zyVar = (zy) obj;
            int size = size();
            if (zyVar.size() != size) {
                return false;
            }
            for (int i2 = 0; i2 < size; i2++) {
                if (this.array[this.start + i2] != zyVar.array[zyVar.start + i2]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int iLd6 = 1;
            for (int i2 = this.start; i2 < this.end; i2++) {
                iLd6 = (iLd6 * 31) + C4743p.ld6(this.array[i2]);
            }
            return iLd6;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            int iQrj;
            if (!(obj instanceof Long) || (iQrj = C4743p.qrj(this.array, ((Long) obj).longValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return iQrj - this.start;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            int iCdj;
            if (!(obj instanceof Long) || (iCdj = C4743p.cdj(this.array, ((Long) obj).longValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return iCdj - this.start;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.end - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Long> subList(int i2, int i3) {
            jk.ek5k(i2, i3, size());
            if (i2 == i3) {
                return Collections.emptyList();
            }
            long[] jArr = this.array;
            int i4 = this.start;
            return new zy(jArr, i2 + i4, i4 + i3);
        }

        long[] toLongArray() {
            return Arrays.copyOfRange(this.array, this.start, this.end);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 10);
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

        zy(long[] jArr, int i2, int i3) {
            this.array = jArr;
            this.start = i2;
            this.end = i3;
        }

        @Override // java.util.AbstractList, java.util.List
        public Long get(int i2) {
            jk.mcp(i2, size());
            return Long.valueOf(this.array[this.start + i2]);
        }

        @Override // java.util.AbstractList, java.util.List
        public Long set(int i2, Long l2) {
            jk.mcp(i2, size());
            long[] jArr = this.array;
            int i3 = this.start;
            long j2 = jArr[i3 + i2];
            jArr[i3 + i2] = ((Long) jk.a9(l2)).longValue();
            return Long.valueOf(j2);
        }
    }

    private C4743p() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int cdj(long[] jArr, long j2, int i2, int i3) {
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            if (jArr[i4] == j2) {
                return i4;
            }
        }
        return -1;
    }

    public static boolean f7l8(long[] jArr, long j2) {
        for (long j3 : jArr) {
            if (j3 == j2) {
                return true;
            }
        }
        return false;
    }

    public static void fn3e(long[] jArr) {
        jk.a9(jArr);
        zurt(jArr, 0, jArr.length);
    }

    public static void fu4(long[] jArr, int i2, int i3) {
        jk.a9(jArr);
        jk.ek5k(i2, i3, jArr.length);
        Arrays.sort(jArr, i2, i3);
        zurt(jArr, i2, i3);
    }

    @InterfaceC7731k
    /* JADX INFO: renamed from: g */
    public static long m16679g(long j2, long j3, long j4) {
        jk.t8r(j3 <= j4, "min (%s) must be less than or equal to max (%s)", j3, j4);
        return Math.min(Math.max(j2, j3), j4);
    }

    /* JADX INFO: renamed from: h */
    public static int m16680h(long[] jArr, long j2) {
        return cdj(jArr, j2, 0, jArr.length);
    }

    /* JADX INFO: renamed from: i */
    public static long m16681i(long... jArr) {
        jk.m15383q(jArr.length > 0);
        long j2 = jArr[0];
        for (int i2 = 1; i2 < jArr.length; i2++) {
            long j3 = jArr[i2];
            if (j3 < j2) {
                j2 = j3;
            }
        }
        return j2;
    }

    public static Comparator<long[]> ki() {
        return toq.INSTANCE;
    }

    public static String kja0(String str, long... jArr) {
        jk.a9(str);
        if (jArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(jArr.length * 10);
        sb.append(jArr[0]);
        for (int i2 = 1; i2 < jArr.length; i2++) {
            sb.append(str);
            sb.append(jArr[i2]);
        }
        return sb.toString();
    }

    public static int ld6(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    @NullableDecl
    @InterfaceC7731k
    public static Long mcp(String str, int i2) {
        if (((String) jk.a9(str)).isEmpty()) {
            return null;
        }
        if (i2 < 2 || i2 > 36) {
            throw new IllegalArgumentException("radix must be between MIN_RADIX and MAX_RADIX but was " + i2);
        }
        int i3 = str.charAt(0) == '-' ? 1 : 0;
        if (i3 == str.length()) {
            return null;
        }
        int i4 = i3 + 1;
        int iM16690k = k.m16690k(str.charAt(i3));
        if (iM16690k < 0 || iM16690k >= i2) {
            return null;
        }
        long j2 = -iM16690k;
        long j3 = i2;
        long j4 = Long.MIN_VALUE / j3;
        while (i4 < str.length()) {
            int i5 = i4 + 1;
            int iM16690k2 = k.m16690k(str.charAt(i4));
            if (iM16690k2 < 0 || iM16690k2 >= i2 || j2 < j4) {
                return null;
            }
            long j5 = j2 * j3;
            long j6 = iM16690k2;
            if (j5 < j6 - Long.MIN_VALUE) {
                return null;
            }
            j2 = j5 - j6;
            i4 = i5;
        }
        if (i3 != 0) {
            return Long.valueOf(j2);
        }
        if (j2 == Long.MIN_VALUE) {
            return null;
        }
        return Long.valueOf(-j2);
    }

    /* JADX INFO: renamed from: n */
    public static long[] m16683n(long[]... jArr) {
        int length = 0;
        for (long[] jArr2 : jArr) {
            length += jArr2.length;
        }
        long[] jArr3 = new long[length];
        int length2 = 0;
        for (long[] jArr4 : jArr) {
            System.arraycopy(jArr4, 0, jArr3, length2, jArr4.length);
            length2 += jArr4.length;
        }
        return jArr3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        r0 = r0 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int n7h(long[] r7, long[] r8) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.primitives.C4743p.n7h(long[], long[]):int");
    }

    public static void ni7(long[] jArr) {
        jk.a9(jArr);
        fu4(jArr, 0, jArr.length);
    }

    public static long[] o1t(Collection<? extends Number> collection) {
        if (collection instanceof zy) {
            return ((zy) collection).toLongArray();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        long[] jArr = new long[length];
        for (int i2 = 0; i2 < length; i2++) {
            jArr[i2] = ((Number) jk.a9(array[i2])).longValue();
        }
        return jArr;
    }

    /* JADX INFO: renamed from: p */
    public static long m16684p(byte b2, byte b3, byte b4, byte b5, byte b6, byte b9, byte b10, byte b11) {
        return ((((long) b3) & 255) << 48) | ((((long) b2) & 255) << 56) | ((((long) b4) & 255) << 40) | ((((long) b5) & 255) << 32) | ((((long) b6) & 255) << 24) | ((((long) b9) & 255) << 16) | ((((long) b10) & 255) << 8) | (((long) b11) & 255);
    }

    /* JADX INFO: renamed from: q */
    public static int m16685q(long j2, long j3) {
        if (j2 < j3) {
            return -1;
        }
        return j2 > j3 ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int qrj(long[] jArr, long j2, int i2, int i3) {
        while (i2 < i3) {
            if (jArr[i2] == j2) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: s */
    public static long m16686s(byte[] bArr) {
        jk.qrj(bArr.length >= 8, "array too small: %s < %s", bArr.length, 8);
        return m16684p(bArr[0], bArr[1], bArr[2], bArr[3], bArr[4], bArr[5], bArr[6], bArr[7]);
    }

    @NullableDecl
    @InterfaceC7731k
    /* JADX INFO: renamed from: t */
    public static Long m16687t(String str) {
        return mcp(str, 10);
    }

    public static long t8r(long... jArr) {
        jk.m15383q(jArr.length > 0);
        long j2 = jArr[0];
        for (int i2 = 1; i2 < jArr.length; i2++) {
            long j3 = jArr[i2];
            if (j3 > j2) {
                j2 = j3;
            }
        }
        return j2;
    }

    public static byte[] wvg(long j2) {
        byte[] bArr = new byte[8];
        for (int i2 = 7; i2 >= 0; i2--) {
            bArr[i2] = (byte) (255 & j2);
            j2 >>= 8;
        }
        return bArr;
    }

    public static int x2(long[] jArr, long j2) {
        return qrj(jArr, j2, 0, jArr.length);
    }

    /* JADX INFO: renamed from: y */
    public static long[] m16688y(long[] jArr, int i2, int i3) {
        jk.ld6(i2 >= 0, "Invalid minLength: %s", i2);
        jk.ld6(i3 >= 0, "Invalid padding: %s", i3);
        return jArr.length < i2 ? Arrays.copyOf(jArr, i2 + i3) : jArr;
    }

    @InterfaceC7731k
    /* JADX INFO: renamed from: z */
    public static AbstractC4272s<String, Long> m16689z() {
        return q.INSTANCE;
    }

    public static void zurt(long[] jArr, int i2, int i3) {
        jk.a9(jArr);
        jk.ek5k(i2, i3, jArr.length);
        for (int i4 = i3 - 1; i2 < i4; i4--) {
            long j2 = jArr[i2];
            jArr[i2] = jArr[i4];
            jArr[i4] = j2;
            i2++;
        }
    }

    public static List<Long> zy(long... jArr) {
        return jArr.length == 0 ? Collections.emptyList() : new zy(jArr);
    }
}
