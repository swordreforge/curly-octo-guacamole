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

/* JADX INFO: renamed from: com.google.common.primitives.k */
/* JADX INFO: compiled from: Booleans.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
public final class C4739k {

    /* JADX INFO: renamed from: com.google.common.primitives.k$k */
    /* JADX INFO: compiled from: Booleans.java */
    @wlev.toq
    private static class k extends AbstractList<Boolean> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        final boolean[] array;
        final int end;
        final int start;

        k(boolean[] zArr) {
            this(zArr, 0, zArr.length);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return (obj instanceof Boolean) && C4739k.x2(this.array, ((Boolean) obj).booleanValue(), this.start, this.end) != -1;
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
            int iM16648p = 1;
            for (int i2 = this.start; i2 < this.end; i2++) {
                iM16648p = (iM16648p * 31) + C4739k.m16648p(this.array[i2]);
            }
            return iM16648p;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            int iX2;
            if (!(obj instanceof Boolean) || (iX2 = C4739k.x2(this.array, ((Boolean) obj).booleanValue(), this.start, this.end)) < 0) {
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
            int iM16644h;
            if (!(obj instanceof Boolean) || (iM16644h = C4739k.m16644h(this.array, ((Boolean) obj).booleanValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return iM16644h - this.start;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.end - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Boolean> subList(int i2, int i3) {
            jk.ek5k(i2, i3, size());
            if (i2 == i3) {
                return Collections.emptyList();
            }
            boolean[] zArr = this.array;
            int i4 = this.start;
            return new k(zArr, i2 + i4, i4 + i3);
        }

        boolean[] toBooleanArray() {
            return Arrays.copyOfRange(this.array, this.start, this.end);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 7);
            sb.append(this.array[this.start] ? "[true" : "[false");
            int i2 = this.start;
            while (true) {
                i2++;
                if (i2 >= this.end) {
                    sb.append(']');
                    return sb.toString();
                }
                sb.append(this.array[i2] ? ", true" : ", false");
            }
        }

        k(boolean[] zArr, int i2, int i3) {
            this.array = zArr;
            this.start = i2;
            this.end = i3;
        }

        @Override // java.util.AbstractList, java.util.List
        public Boolean get(int i2) {
            jk.mcp(i2, size());
            return Boolean.valueOf(this.array[this.start + i2]);
        }

        @Override // java.util.AbstractList, java.util.List
        public Boolean set(int i2, Boolean bool) {
            jk.mcp(i2, size());
            boolean[] zArr = this.array;
            int i3 = this.start;
            boolean z2 = zArr[i3 + i2];
            zArr[i3 + i2] = ((Boolean) jk.a9(bool)).booleanValue();
            return Boolean.valueOf(z2);
        }
    }

    /* JADX INFO: renamed from: com.google.common.primitives.k$toq */
    /* JADX INFO: compiled from: Booleans.java */
    private enum toq implements Comparator<Boolean> {
        TRUE_FIRST(1, "Booleans.trueFirst()"),
        FALSE_FIRST(-1, "Booleans.falseFirst()");

        private final String toString;
        private final int trueValue;

        toq(int i2, String str) {
            this.trueValue = i2;
            this.toString = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.toString;
        }

        @Override // java.util.Comparator
        public int compare(Boolean bool, Boolean bool2) {
            return (bool2.booleanValue() ? this.trueValue : 0) - (bool.booleanValue() ? this.trueValue : 0);
        }
    }

    /* JADX INFO: renamed from: com.google.common.primitives.k$zy */
    /* JADX INFO: compiled from: Booleans.java */
    private enum zy implements Comparator<boolean[]> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "Booleans.lexicographicalComparator()";
        }

        @Override // java.util.Comparator
        public int compare(boolean[] zArr, boolean[] zArr2) {
            int iMin = Math.min(zArr.length, zArr2.length);
            for (int i2 = 0; i2 < iMin; i2++) {
                int iM16649q = C4739k.m16649q(zArr[i2], zArr2[i2]);
                if (iM16649q != 0) {
                    return iM16649q;
                }
            }
            return zArr.length - zArr2.length;
        }
    }

    private C4739k() {
    }

    public static Comparator<boolean[]> cdj() {
        return zy.INSTANCE;
    }

    @InterfaceC7731k
    public static int f7l8(boolean... zArr) {
        int i2 = 0;
        for (boolean z2 : zArr) {
            if (z2) {
                i2++;
            }
        }
        return i2;
    }

    @InterfaceC7731k
    public static Comparator<Boolean> fn3e() {
        return toq.TRUE_FIRST;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m16643g(boolean[] zArr, boolean z2) {
        for (boolean z3 : zArr) {
            if (z3 == z2) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static int m16644h(boolean[] zArr, boolean z2, int i2, int i3) {
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            if (zArr[i4] == z2) {
                return i4;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: i */
    public static boolean[] m16645i(Collection<Boolean> collection) {
        if (collection instanceof k) {
            return ((k) collection).toBooleanArray();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        boolean[] zArr = new boolean[length];
        for (int i2 = 0; i2 < length; i2++) {
            zArr[i2] = ((Boolean) jk.a9(array[i2])).booleanValue();
        }
        return zArr;
    }

    public static void ki(boolean[] zArr) {
        jk.a9(zArr);
        t8r(zArr, 0, zArr.length);
    }

    public static int kja0(boolean[] zArr, boolean z2) {
        return m16644h(zArr, z2, 0, zArr.length);
    }

    public static int ld6(boolean[] zArr, boolean z2) {
        return x2(zArr, z2, 0, zArr.length);
    }

    /* JADX INFO: renamed from: n */
    public static boolean[] m16647n(boolean[]... zArr) {
        int length = 0;
        for (boolean[] zArr2 : zArr) {
            length += zArr2.length;
        }
        boolean[] zArr3 = new boolean[length];
        int length2 = 0;
        for (boolean[] zArr4 : zArr) {
            System.arraycopy(zArr4, 0, zArr3, length2, zArr4.length);
            length2 += zArr4.length;
        }
        return zArr3;
    }

    public static String n7h(String str, boolean... zArr) {
        jk.a9(str);
        if (zArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(zArr.length * 7);
        sb.append(zArr[0]);
        for (int i2 = 1; i2 < zArr.length; i2++) {
            sb.append(str);
            sb.append(zArr[i2]);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: p */
    public static int m16648p(boolean z2) {
        return z2 ? 1231 : 1237;
    }

    /* JADX INFO: renamed from: q */
    public static int m16649q(boolean z2, boolean z3) {
        if (z2 == z3) {
            return 0;
        }
        return z2 ? 1 : -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0023, code lost:
    
        r0 = r0 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int qrj(boolean[] r5, boolean[] r6) {
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
            boolean r3 = r5[r3]
            boolean r4 = r6[r2]
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.primitives.C4739k.qrj(boolean[], boolean[]):int");
    }

    @InterfaceC7731k
    /* JADX INFO: renamed from: s */
    public static Comparator<Boolean> m16650s() {
        return toq.FALSE_FIRST;
    }

    public static void t8r(boolean[] zArr, int i2, int i3) {
        jk.a9(zArr);
        jk.ek5k(i2, i3, zArr.length);
        for (int i4 = i3 - 1; i2 < i4; i4--) {
            boolean z2 = zArr[i2];
            zArr[i2] = zArr[i4];
            zArr[i4] = z2;
            i2++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int x2(boolean[] zArr, boolean z2, int i2, int i3) {
        while (i2 < i3) {
            if (zArr[i2] == z2) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: y */
    public static boolean[] m16651y(boolean[] zArr, int i2, int i3) {
        jk.ld6(i2 >= 0, "Invalid minLength: %s", i2);
        jk.ld6(i3 >= 0, "Invalid padding: %s", i3);
        return zArr.length < i2 ? Arrays.copyOf(zArr, i2 + i3) : zArr;
    }

    public static List<Boolean> zy(boolean... zArr) {
        return zArr.length == 0 ? Collections.emptyList() : new k(zArr);
    }
}
