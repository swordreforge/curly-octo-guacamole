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

/* JADX INFO: renamed from: com.google.common.primitives.n */
/* JADX INFO: compiled from: Floats.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq(emulated = true)
public final class C4741n {

    /* JADX INFO: renamed from: k */
    public static final int f27290k = 4;

    /* JADX INFO: renamed from: com.google.common.primitives.n$k */
    /* JADX INFO: compiled from: Floats.java */
    @wlev.toq
    private static class k extends AbstractList<Float> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        final float[] array;
        final int end;
        final int start;

        k(float[] fArr) {
            this(fArr, 0, fArr.length);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return (obj instanceof Float) && C4741n.ld6(this.array, ((Float) obj).floatValue(), this.start, this.end) != -1;
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
            int iM16670s = 1;
            for (int i2 = this.start; i2 < this.end; i2++) {
                iM16670s = (iM16670s * 31) + C4741n.m16670s(this.array[i2]);
            }
            return iM16670s;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            int iLd6;
            if (!(obj instanceof Float) || (iLd6 = C4741n.ld6(this.array, ((Float) obj).floatValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return iLd6 - this.start;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            int iM16664h;
            if (!(obj instanceof Float) || (iM16664h = C4741n.m16664h(this.array, ((Float) obj).floatValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return iM16664h - this.start;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.end - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Float> subList(int i2, int i3) {
            jk.ek5k(i2, i3, size());
            if (i2 == i3) {
                return Collections.emptyList();
            }
            float[] fArr = this.array;
            int i4 = this.start;
            return new k(fArr, i2 + i4, i4 + i3);
        }

        float[] toFloatArray() {
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

        k(float[] fArr, int i2, int i3) {
            this.array = fArr;
            this.start = i2;
            this.end = i3;
        }

        @Override // java.util.AbstractList, java.util.List
        public Float get(int i2) {
            jk.mcp(i2, size());
            return Float.valueOf(this.array[this.start + i2]);
        }

        @Override // java.util.AbstractList, java.util.List
        public Float set(int i2, Float f2) {
            jk.mcp(i2, size());
            float[] fArr = this.array;
            int i3 = this.start;
            float f3 = fArr[i3 + i2];
            fArr[i3 + i2] = ((Float) jk.a9(f2)).floatValue();
            return Float.valueOf(f3);
        }
    }

    /* JADX INFO: renamed from: com.google.common.primitives.n$toq */
    /* JADX INFO: compiled from: Floats.java */
    private static final class toq extends AbstractC4272s<String, Float> implements Serializable {
        static final toq INSTANCE = new toq();
        private static final long serialVersionUID = 1;

        private toq() {
        }

        private Object readResolve() {
            return INSTANCE;
        }

        public String toString() {
            return "Floats.stringConverter()";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.AbstractC4272s
        public String doBackward(Float f2) {
            return f2.toString();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.AbstractC4272s
        public Float doForward(String str) {
            return Float.valueOf(str);
        }
    }

    /* JADX INFO: renamed from: com.google.common.primitives.n$zy */
    /* JADX INFO: compiled from: Floats.java */
    private enum zy implements Comparator<float[]> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "Floats.lexicographicalComparator()";
        }

        @Override // java.util.Comparator
        public int compare(float[] fArr, float[] fArr2) {
            int iMin = Math.min(fArr.length, fArr2.length);
            for (int i2 = 0; i2 < iMin; i2++) {
                int iCompare = Float.compare(fArr[i2], fArr2[i2]);
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            return fArr.length - fArr2.length;
        }
    }

    private C4741n() {
    }

    public static Comparator<float[]> cdj() {
        return zy.INSTANCE;
    }

    public static boolean f7l8(float[] fArr, float f2) {
        for (float f3 : fArr) {
            if (f3 == f2) {
                return true;
            }
        }
        return false;
    }

    public static void fn3e(float[] fArr, int i2, int i3) {
        jk.a9(fArr);
        jk.ek5k(i2, i3, fArr.length);
        for (int i4 = i3 - 1; i2 < i4; i4--) {
            float f2 = fArr[i2];
            fArr[i2] = fArr[i4];
            fArr[i4] = f2;
            i2++;
        }
    }

    @InterfaceC7731k
    public static AbstractC4272s<String, Float> fu4() {
        return toq.INSTANCE;
    }

    @InterfaceC7731k
    /* JADX INFO: renamed from: g */
    public static float m16663g(float f2, float f3, float f4) {
        jk.m15391z(f3 <= f4, "min (%s) must be less than or equal to max (%s)", Float.valueOf(f3), Float.valueOf(f4));
        return Math.min(Math.max(f2, f3), f4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static int m16664h(float[] fArr, float f2, int i2, int i3) {
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            if (fArr[i4] == f2) {
                return i4;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: i */
    public static void m16665i(float[] fArr) {
        jk.a9(fArr);
        fn3e(fArr, 0, fArr.length);
    }

    public static float ki(float... fArr) {
        jk.m15383q(fArr.length > 0);
        float fMax = fArr[0];
        for (int i2 = 1; i2 < fArr.length; i2++) {
            fMax = Math.max(fMax, fArr[i2]);
        }
        return fMax;
    }

    public static int kja0(float[] fArr, float f2) {
        return m16664h(fArr, f2, 0, fArr.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int ld6(float[] fArr, float f2, int i2, int i3) {
        while (i2 < i3) {
            if (fArr[i2] == f2) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: n */
    public static float[] m16667n(float[]... fArr) {
        int length = 0;
        for (float[] fArr2 : fArr) {
            length += fArr2.length;
        }
        float[] fArr3 = new float[length];
        int length2 = 0;
        for (float[] fArr4 : fArr) {
            System.arraycopy(fArr4, 0, fArr3, length2, fArr4.length);
            length2 += fArr4.length;
        }
        return fArr3;
    }

    public static String n7h(String str, float... fArr) {
        jk.a9(str);
        if (fArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(fArr.length * 12);
        sb.append(fArr[0]);
        for (int i2 = 1; i2 < fArr.length; i2++) {
            sb.append(str);
            sb.append(fArr[i2]);
        }
        return sb.toString();
    }

    public static void ni7(float[] fArr, int i2, int i3) {
        jk.a9(fArr);
        jk.ek5k(i2, i3, fArr.length);
        Arrays.sort(fArr, i2, i3);
        fn3e(fArr, i2, i3);
    }

    @NullableDecl
    @InterfaceC7731k
    @wlev.zy
    public static Float o1t(String str) {
        if (!C4744q.f68582toq.matcher(str).matches()) {
            return null;
        }
        try {
            return Float.valueOf(Float.parseFloat(str));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: p */
    public static int m16668p(float[] fArr, float f2) {
        return ld6(fArr, f2, 0, fArr.length);
    }

    /* JADX INFO: renamed from: q */
    public static int m16669q(float f2, float f3) {
        return Float.compare(f2, f3);
    }

    public static boolean qrj(float f2) {
        return Float.NEGATIVE_INFINITY < f2 && f2 < Float.POSITIVE_INFINITY;
    }

    /* JADX INFO: renamed from: s */
    public static int m16670s(float f2) {
        return Float.valueOf(f2).hashCode();
    }

    public static float t8r(float... fArr) {
        jk.m15383q(fArr.length > 0);
        float fMin = fArr[0];
        for (int i2 = 1; i2 < fArr.length; i2++) {
            fMin = Math.min(fMin, fArr[i2]);
        }
        return fMin;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        r0 = r0 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int x2(float[] r5, float[] r6) {
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
            if (r0 >= r2) goto L2c
            r2 = r1
        L18:
            int r3 = r6.length
            if (r2 >= r3) goto L2b
            int r3 = r0 + r2
            r3 = r5[r3]
            r4 = r6[r2]
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 == 0) goto L28
            int r0 = r0 + 1
            goto L10
        L28:
            int r2 = r2 + 1
            goto L18
        L2b:
            return r0
        L2c:
            r5 = -1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.primitives.C4741n.x2(float[], float[]):int");
    }

    /* JADX INFO: renamed from: y */
    public static float[] m16671y(float[] fArr, int i2, int i3) {
        jk.ld6(i2 >= 0, "Invalid minLength: %s", i2);
        jk.ld6(i3 >= 0, "Invalid padding: %s", i3);
        return fArr.length < i2 ? Arrays.copyOf(fArr, i2 + i3) : fArr;
    }

    /* JADX INFO: renamed from: z */
    public static float[] m16672z(Collection<? extends Number> collection) {
        if (collection instanceof k) {
            return ((k) collection).toFloatArray();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        float[] fArr = new float[length];
        for (int i2 = 0; i2 < length; i2++) {
            fArr[i2] = ((Number) jk.a9(array[i2])).floatValue();
        }
        return fArr;
    }

    public static void zurt(float[] fArr) {
        jk.a9(fArr);
        ni7(fArr, 0, fArr.length);
    }

    public static List<Float> zy(float... fArr) {
        return fArr.length == 0 ? Collections.emptyList() : new k(fArr);
    }
}
