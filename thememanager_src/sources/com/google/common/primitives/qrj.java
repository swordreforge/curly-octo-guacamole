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
import kotlin.jvm.internal.ch;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import wlev.InterfaceC7731k;

/* JADX INFO: compiled from: Shorts.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq(emulated = true)
public final class qrj {

    /* JADX INFO: renamed from: k */
    public static final int f27299k = 2;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final short f68583toq = 16384;

    /* JADX INFO: renamed from: com.google.common.primitives.qrj$k */
    /* JADX INFO: compiled from: Shorts.java */
    private enum EnumC4745k implements Comparator<short[]> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "Shorts.lexicographicalComparator()";
        }

        @Override // java.util.Comparator
        public int compare(short[] sArr, short[] sArr2) {
            int iMin = Math.min(sArr.length, sArr2.length);
            for (int i2 = 0; i2 < iMin; i2++) {
                int iM16705n = qrj.m16705n(sArr[i2], sArr2[i2]);
                if (iM16705n != 0) {
                    return iM16705n;
                }
            }
            return sArr.length - sArr2.length;
        }
    }

    /* JADX INFO: compiled from: Shorts.java */
    @wlev.toq
    private static class toq extends AbstractList<Short> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        final short[] array;
        final int end;
        final int start;

        toq(short[] sArr) {
            this(sArr, 0, sArr.length);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@NullableDecl Object obj) {
            return (obj instanceof Short) && qrj.n7h(this.array, ((Short) obj).shortValue(), this.start, this.end) != -1;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@NullableDecl Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof toq)) {
                return super.equals(obj);
            }
            toq toqVar = (toq) obj;
            int size = size();
            if (toqVar.size() != size) {
                return false;
            }
            for (int i2 = 0; i2 < size; i2++) {
                if (this.array[this.start + i2] != toqVar.array[toqVar.start + i2]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int iX2 = 1;
            for (int i2 = this.start; i2 < this.end; i2++) {
                iX2 = (iX2 * 31) + qrj.x2(this.array[i2]);
            }
            return iX2;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@NullableDecl Object obj) {
            int iN7h;
            if (!(obj instanceof Short) || (iN7h = qrj.n7h(this.array, ((Short) obj).shortValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return iN7h - this.start;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(@NullableDecl Object obj) {
            int iKi;
            if (!(obj instanceof Short) || (iKi = qrj.ki(this.array, ((Short) obj).shortValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return iKi - this.start;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.end - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Short> subList(int i2, int i3) {
            jk.ek5k(i2, i3, size());
            if (i2 == i3) {
                return Collections.emptyList();
            }
            short[] sArr = this.array;
            int i4 = this.start;
            return new toq(sArr, i2 + i4, i4 + i3);
        }

        short[] toShortArray() {
            return Arrays.copyOfRange(this.array, this.start, this.end);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 6);
            sb.append('[');
            sb.append((int) this.array[this.start]);
            int i2 = this.start;
            while (true) {
                i2++;
                if (i2 >= this.end) {
                    sb.append(']');
                    return sb.toString();
                }
                sb.append(", ");
                sb.append((int) this.array[i2]);
            }
        }

        toq(short[] sArr, int i2, int i3) {
            this.array = sArr;
            this.start = i2;
            this.end = i3;
        }

        @Override // java.util.AbstractList, java.util.List
        public Short get(int i2) {
            jk.mcp(i2, size());
            return Short.valueOf(this.array[this.start + i2]);
        }

        @Override // java.util.AbstractList, java.util.List
        public Short set(int i2, Short sh) {
            jk.mcp(i2, size());
            short[] sArr = this.array;
            int i3 = this.start;
            short s2 = sArr[i3 + i2];
            sArr[i3 + i2] = ((Short) jk.a9(sh)).shortValue();
            return Short.valueOf(s2);
        }
    }

    /* JADX INFO: compiled from: Shorts.java */
    private static final class zy extends AbstractC4272s<String, Short> implements Serializable {
        static final zy INSTANCE = new zy();
        private static final long serialVersionUID = 1;

        private zy() {
        }

        private Object readResolve() {
            return INSTANCE;
        }

        public String toString() {
            return "Shorts.stringConverter()";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.AbstractC4272s
        public String doBackward(Short sh) {
            return sh.toString();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.AbstractC4272s
        public Short doForward(String str) {
            return Short.decode(str);
        }
    }

    private qrj() {
    }

    public static int cdj(short[] sArr, short s2) {
        return ki(sArr, s2, 0, sArr.length);
    }

    @InterfaceC7731k
    public static short f7l8(short s2, short s3, short s4) {
        jk.qrj(s3 <= s4, "min (%s) must be less than or equal to max (%s)", s3, s4);
        return s2 < s3 ? s3 : s2 < s4 ? s2 : s4;
    }

    public static short fn3e(short... sArr) {
        jk.m15383q(sArr.length > 0);
        short s2 = sArr[0];
        for (int i2 = 1; i2 < sArr.length; i2++) {
            short s3 = sArr[i2];
            if (s3 < s2) {
                s2 = s3;
            }
        }
        return s2;
    }

    public static short fu4(long j2) {
        return j2 > 32767 ? ch.f81833zy : j2 < -32768 ? ch.f81832toq : (short) j2;
    }

    /* JADX INFO: renamed from: g */
    public static short[] m16701g(short[]... sArr) {
        int length = 0;
        for (short[] sArr2 : sArr) {
            length += sArr2.length;
        }
        short[] sArr3 = new short[length];
        int length2 = 0;
        for (short[] sArr4 : sArr) {
            System.arraycopy(sArr4, 0, sArr3, length2, sArr4.length);
            length2 += sArr4.length;
        }
        return sArr3;
    }

    /* JADX INFO: renamed from: h */
    public static String m16702h(String str, short... sArr) {
        jk.a9(str);
        if (sArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(sArr.length * 6);
        sb.append((int) sArr[0]);
        for (int i2 = 1; i2 < sArr.length; i2++) {
            sb.append(str);
            sb.append((int) sArr[i2]);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: i */
    public static short m16703i(short... sArr) {
        jk.m15383q(sArr.length > 0);
        short s2 = sArr[0];
        for (int i2 = 1; i2 < sArr.length; i2++) {
            short s3 = sArr[i2];
            if (s3 > s2) {
                s2 = s3;
            }
        }
        return s2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int ki(short[] sArr, short s2, int i2, int i3) {
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            if (sArr[i4] == s2) {
                return i4;
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
    public static int kja0(short[] r5, short[] r6) {
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
            short r3 = r5[r3]
            short r4 = r6[r2]
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.primitives.qrj.kja0(short[], short[]):int");
    }

    @wlev.zy
    public static short ld6(byte b2, byte b3) {
        return (short) ((b2 << 8) | (b3 & 255));
    }

    @wlev.zy
    public static byte[] mcp(short s2) {
        return new byte[]{(byte) (s2 >> 8), (byte) s2};
    }

    /* JADX INFO: renamed from: n */
    public static int m16705n(short s2, short s3) {
        return s2 - s3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int n7h(short[] sArr, short s2, int i2, int i3) {
        while (i2 < i3) {
            if (sArr[i2] == s2) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static void ni7(short[] sArr, int i2, int i3) {
        jk.a9(sArr);
        jk.ek5k(i2, i3, sArr.length);
        for (int i4 = i3 - 1; i2 < i4; i4--) {
            short s2 = sArr[i2];
            sArr[i2] = sArr[i4];
            sArr[i4] = s2;
            i2++;
        }
    }

    public static void o1t(short[] sArr, int i2, int i3) {
        jk.a9(sArr);
        jk.ek5k(i2, i3, sArr.length);
        Arrays.sort(sArr, i2, i3);
        ni7(sArr, i2, i3);
    }

    @wlev.zy
    /* JADX INFO: renamed from: p */
    public static short m16706p(byte[] bArr) {
        jk.qrj(bArr.length >= 2, "array too small: %s < %s", bArr.length, 2);
        return ld6(bArr[0], bArr[1]);
    }

    /* JADX INFO: renamed from: q */
    public static short m16707q(long j2) {
        short s2 = (short) j2;
        jk.m15374h(((long) s2) == j2, "Out of range: %s", j2);
        return s2;
    }

    public static int qrj(short[] sArr, short s2) {
        return n7h(sArr, s2, 0, sArr.length);
    }

    /* JADX INFO: renamed from: s */
    public static short[] m16708s(short[] sArr, int i2, int i3) {
        jk.ld6(i2 >= 0, "Invalid minLength: %s", i2);
        jk.ld6(i3 >= 0, "Invalid padding: %s", i3);
        return sArr.length < i2 ? Arrays.copyOf(sArr, i2 + i3) : sArr;
    }

    /* JADX INFO: renamed from: t */
    public static short[] m16709t(Collection<? extends Number> collection) {
        if (collection instanceof toq) {
            return ((toq) collection).toShortArray();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        short[] sArr = new short[length];
        for (int i2 = 0; i2 < length; i2++) {
            sArr[i2] = ((Number) jk.a9(array[i2])).shortValue();
        }
        return sArr;
    }

    public static Comparator<short[]> t8r() {
        return EnumC4745k.INSTANCE;
    }

    @InterfaceC7731k
    public static AbstractC4272s<String, Short> wvg() {
        return zy.INSTANCE;
    }

    public static int x2(short s2) {
        return s2;
    }

    /* JADX INFO: renamed from: y */
    public static boolean m16710y(short[] sArr, short s2) {
        for (short s3 : sArr) {
            if (s3 == s2) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: z */
    public static void m16711z(short[] sArr) {
        jk.a9(sArr);
        o1t(sArr, 0, sArr.length);
    }

    public static void zurt(short[] sArr) {
        jk.a9(sArr);
        ni7(sArr, 0, sArr.length);
    }

    public static List<Short> zy(short... sArr) {
        return sArr.length == 0 ? Collections.emptyList() : new toq(sArr);
    }
}
