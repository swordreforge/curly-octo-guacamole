package com.google.common.primitives;

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

/* JADX INFO: compiled from: Chars.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq(emulated = true)
public final class zy {

    /* JADX INFO: renamed from: k */
    public static final int f27310k = 2;

    /* JADX INFO: renamed from: com.google.common.primitives.zy$k */
    /* JADX INFO: compiled from: Chars.java */
    @wlev.toq
    private static class C4750k extends AbstractList<Character> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        final char[] array;
        final int end;
        final int start;

        C4750k(char[] cArr) {
            this(cArr, 0, cArr.length);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return (obj instanceof Character) && zy.n7h(this.array, ((Character) obj).charValue(), this.start, this.end) != -1;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@NullableDecl Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C4750k)) {
                return super.equals(obj);
            }
            C4750k c4750k = (C4750k) obj;
            int size = size();
            if (c4750k.size() != size) {
                return false;
            }
            for (int i2 = 0; i2 < size; i2++) {
                if (this.array[this.start + i2] != c4750k.array[c4750k.start + i2]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int iX2 = 1;
            for (int i2 = this.start; i2 < this.end; i2++) {
                iX2 = (iX2 * 31) + zy.x2(this.array[i2]);
            }
            return iX2;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            int iN7h;
            if (!(obj instanceof Character) || (iN7h = zy.n7h(this.array, ((Character) obj).charValue(), this.start, this.end)) < 0) {
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
            if (!(obj instanceof Character) || (iKi = zy.ki(this.array, ((Character) obj).charValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return iKi - this.start;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.end - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Character> subList(int i2, int i3) {
            jk.ek5k(i2, i3, size());
            if (i2 == i3) {
                return Collections.emptyList();
            }
            char[] cArr = this.array;
            int i4 = this.start;
            return new C4750k(cArr, i2 + i4, i4 + i3);
        }

        char[] toCharArray() {
            return Arrays.copyOfRange(this.array, this.start, this.end);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 3);
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

        C4750k(char[] cArr, int i2, int i3) {
            this.array = cArr;
            this.start = i2;
            this.end = i3;
        }

        @Override // java.util.AbstractList, java.util.List
        public Character get(int i2) {
            jk.mcp(i2, size());
            return Character.valueOf(this.array[this.start + i2]);
        }

        @Override // java.util.AbstractList, java.util.List
        public Character set(int i2, Character ch2) {
            jk.mcp(i2, size());
            char[] cArr = this.array;
            int i3 = this.start;
            char c2 = cArr[i3 + i2];
            cArr[i3 + i2] = ((Character) jk.a9(ch2)).charValue();
            return Character.valueOf(c2);
        }
    }

    /* JADX INFO: compiled from: Chars.java */
    private enum toq implements Comparator<char[]> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "Chars.lexicographicalComparator()";
        }

        @Override // java.util.Comparator
        public int compare(char[] cArr, char[] cArr2) {
            int iMin = Math.min(cArr.length, cArr2.length);
            for (int i2 = 0; i2 < iMin; i2++) {
                int iM16753n = zy.m16753n(cArr[i2], cArr2[i2]);
                if (iM16753n != 0) {
                    return iM16753n;
                }
            }
            return cArr.length - cArr2.length;
        }
    }

    private zy() {
    }

    public static int cdj(char[] cArr, char c2) {
        return ki(cArr, c2, 0, cArr.length);
    }

    @InterfaceC7731k
    public static char f7l8(char c2, char c3, char c4) {
        jk.f7l8(c3 <= c4, "min (%s) must be less than or equal to max (%s)", c3, c4);
        return c2 < c3 ? c3 : c2 < c4 ? c2 : c4;
    }

    public static char fn3e(char... cArr) {
        jk.m15383q(cArr.length > 0);
        char c2 = cArr[0];
        for (int i2 = 1; i2 < cArr.length; i2++) {
            char c3 = cArr[i2];
            if (c3 < c2) {
                c2 = c3;
            }
        }
        return c2;
    }

    public static char fu4(long j2) {
        if (j2 > okhttp3.internal.ws.f7l8.f43390i) {
            return kotlin.jvm.internal.ki.f81842zy;
        }
        if (j2 < 0) {
            return (char) 0;
        }
        return (char) j2;
    }

    /* JADX INFO: renamed from: g */
    public static char[] m16749g(char[]... cArr) {
        int length = 0;
        for (char[] cArr2 : cArr) {
            length += cArr2.length;
        }
        char[] cArr3 = new char[length];
        int length2 = 0;
        for (char[] cArr4 : cArr) {
            System.arraycopy(cArr4, 0, cArr3, length2, cArr4.length);
            length2 += cArr4.length;
        }
        return cArr3;
    }

    /* JADX INFO: renamed from: h */
    public static String m16750h(String str, char... cArr) {
        jk.a9(str);
        int length = cArr.length;
        if (length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder((str.length() * (length - 1)) + length);
        sb.append(cArr[0]);
        for (int i2 = 1; i2 < length; i2++) {
            sb.append(str);
            sb.append(cArr[i2]);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: i */
    public static char m16751i(char... cArr) {
        jk.m15383q(cArr.length > 0);
        char c2 = cArr[0];
        for (int i2 = 1; i2 < cArr.length; i2++) {
            char c3 = cArr[i2];
            if (c3 > c2) {
                c2 = c3;
            }
        }
        return c2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int ki(char[] cArr, char c2, int i2, int i3) {
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            if (cArr[i4] == c2) {
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
    public static int kja0(char[] r5, char[] r6) {
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
            char r3 = r5[r3]
            char r4 = r6[r2]
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.primitives.zy.kja0(char[], char[]):int");
    }

    @wlev.zy
    public static char ld6(byte b2, byte b3) {
        return (char) ((b2 << 8) | (b3 & 255));
    }

    /* JADX INFO: renamed from: n */
    public static int m16753n(char c2, char c3) {
        return c2 - c3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int n7h(char[] cArr, char c2, int i2, int i3) {
        while (i2 < i3) {
            if (cArr[i2] == c2) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static void ni7(char[] cArr, int i2, int i3) {
        jk.a9(cArr);
        jk.ek5k(i2, i3, cArr.length);
        for (int i4 = i3 - 1; i2 < i4; i4--) {
            char c2 = cArr[i2];
            cArr[i2] = cArr[i4];
            cArr[i4] = c2;
            i2++;
        }
    }

    public static void o1t(char[] cArr, int i2, int i3) {
        jk.a9(cArr);
        jk.ek5k(i2, i3, cArr.length);
        Arrays.sort(cArr, i2, i3);
        ni7(cArr, i2, i3);
    }

    @wlev.zy
    /* JADX INFO: renamed from: p */
    public static char m16754p(byte[] bArr) {
        jk.qrj(bArr.length >= 2, "array too small: %s < %s", bArr.length, 2);
        return ld6(bArr[0], bArr[1]);
    }

    /* JADX INFO: renamed from: q */
    public static char m16755q(long j2) {
        char c2 = (char) j2;
        jk.m15374h(((long) c2) == j2, "Out of range: %s", j2);
        return c2;
    }

    public static int qrj(char[] cArr, char c2) {
        return n7h(cArr, c2, 0, cArr.length);
    }

    /* JADX INFO: renamed from: s */
    public static char[] m16756s(char[] cArr, int i2, int i3) {
        jk.ld6(i2 >= 0, "Invalid minLength: %s", i2);
        jk.ld6(i3 >= 0, "Invalid padding: %s", i3);
        return cArr.length < i2 ? Arrays.copyOf(cArr, i2 + i3) : cArr;
    }

    @wlev.zy
    /* JADX INFO: renamed from: t */
    public static byte[] m16757t(char c2) {
        return new byte[]{(byte) (c2 >> '\b'), (byte) c2};
    }

    public static Comparator<char[]> t8r() {
        return toq.INSTANCE;
    }

    public static char[] wvg(Collection<Character> collection) {
        if (collection instanceof C4750k) {
            return ((C4750k) collection).toCharArray();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        char[] cArr = new char[length];
        for (int i2 = 0; i2 < length; i2++) {
            cArr[i2] = ((Character) jk.a9(array[i2])).charValue();
        }
        return cArr;
    }

    public static int x2(char c2) {
        return c2;
    }

    /* JADX INFO: renamed from: y */
    public static boolean m16758y(char[] cArr, char c2) {
        for (char c3 : cArr) {
            if (c3 == c2) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: z */
    public static void m16759z(char[] cArr) {
        jk.a9(cArr);
        o1t(cArr, 0, cArr.length);
    }

    public static void zurt(char[] cArr) {
        jk.a9(cArr);
        ni7(cArr, 0, cArr.length);
    }

    public static List<Character> zy(char... cArr) {
        return cArr.length == 0 ? Collections.emptyList() : new C4750k(cArr);
    }
}
