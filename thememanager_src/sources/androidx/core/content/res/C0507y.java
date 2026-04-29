package androidx.core.content.res;

import java.lang.reflect.Array;

/* JADX INFO: renamed from: androidx.core.content.res.y */
/* JADX INFO: compiled from: GrowingArrayUtils.java */
/* JADX INFO: loaded from: classes.dex */
final class C0507y {
    private C0507y() {
    }

    public static long[] f7l8(long[] jArr, int i2, int i3, long j2) {
        if (i2 + 1 <= jArr.length) {
            System.arraycopy(jArr, i3, jArr, i3 + 1, i2 - i3);
            jArr[i3] = j2;
            return jArr;
        }
        long[] jArr2 = new long[m2353n(i2)];
        System.arraycopy(jArr, 0, jArr2, 0, i3);
        jArr2[i3] = j2;
        System.arraycopy(jArr, i3, jArr2, i3 + 1, jArr.length - i3);
        return jArr2;
    }

    /* JADX INFO: renamed from: g */
    public static int[] m2351g(int[] iArr, int i2, int i3, int i4) {
        if (i2 + 1 <= iArr.length) {
            System.arraycopy(iArr, i3, iArr, i3 + 1, i2 - i3);
            iArr[i3] = i4;
            return iArr;
        }
        int[] iArr2 = new int[m2353n(i2)];
        System.arraycopy(iArr, 0, iArr2, 0, i3);
        iArr2[i3] = i4;
        System.arraycopy(iArr, i3, iArr2, i3 + 1, iArr.length - i3);
        return iArr2;
    }

    /* JADX INFO: renamed from: k */
    public static int[] m2352k(int[] iArr, int i2, int i3) {
        if (i2 + 1 > iArr.length) {
            int[] iArr2 = new int[m2353n(i2)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            iArr = iArr2;
        }
        iArr[i2] = i3;
        return iArr;
    }

    /* JADX INFO: renamed from: n */
    public static int m2353n(int i2) {
        if (i2 <= 4) {
            return 8;
        }
        return i2 * 2;
    }

    /* JADX INFO: renamed from: q */
    public static boolean[] m2354q(boolean[] zArr, int i2, boolean z2) {
        if (i2 + 1 > zArr.length) {
            boolean[] zArr2 = new boolean[m2353n(i2)];
            System.arraycopy(zArr, 0, zArr2, 0, i2);
            zArr = zArr2;
        }
        zArr[i2] = z2;
        return zArr;
    }

    /* JADX INFO: renamed from: s */
    public static boolean[] m2355s(boolean[] zArr, int i2, int i3, boolean z2) {
        if (i2 + 1 <= zArr.length) {
            System.arraycopy(zArr, i3, zArr, i3 + 1, i2 - i3);
            zArr[i3] = z2;
            return zArr;
        }
        boolean[] zArr2 = new boolean[m2353n(i2)];
        System.arraycopy(zArr, 0, zArr2, 0, i3);
        zArr2[i3] = z2;
        System.arraycopy(zArr, i3, zArr2, i3 + 1, zArr.length - i3);
        return zArr2;
    }

    public static long[] toq(long[] jArr, int i2, long j2) {
        if (i2 + 1 > jArr.length) {
            long[] jArr2 = new long[m2353n(i2)];
            System.arraycopy(jArr, 0, jArr2, 0, i2);
            jArr = jArr2;
        }
        jArr[i2] = j2;
        return jArr;
    }

    /* JADX INFO: renamed from: y */
    public static <T> T[] m2356y(T[] tArr, int i2, int i3, T t2) {
        if (i2 + 1 <= tArr.length) {
            System.arraycopy(tArr, i3, tArr, i3 + 1, i2 - i3);
            tArr[i3] = t2;
            return tArr;
        }
        T[] tArr2 = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), m2353n(i2)));
        System.arraycopy(tArr, 0, tArr2, 0, i3);
        tArr2[i3] = t2;
        System.arraycopy(tArr, i3, tArr2, i3 + 1, tArr.length - i3);
        return tArr2;
    }

    public static <T> T[] zy(T[] tArr, int i2, T t2) {
        if (i2 + 1 > tArr.length) {
            Object[] objArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), m2353n(i2));
            System.arraycopy(tArr, 0, objArr, 0, i2);
            tArr = (T[]) objArr;
        }
        tArr[i2] = t2;
        return tArr;
    }
}
