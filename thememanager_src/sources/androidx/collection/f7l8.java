package androidx.collection;

/* JADX INFO: compiled from: ContainerHelpers.java */
/* JADX INFO: loaded from: classes.dex */
class f7l8 {

    /* JADX INFO: renamed from: k */
    static final int[] f1317k = new int[0];

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    static final long[] f47029toq = new long[0];

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    static final Object[] f47030zy = new Object[0];

    private f7l8() {
    }

    /* JADX INFO: renamed from: g */
    public static int m813g(int i2) {
        return m816q(i2 * 8) / 8;
    }

    /* JADX INFO: renamed from: k */
    static int m814k(int[] iArr, int i2, int i3) {
        int i4 = i2 - 1;
        int i5 = 0;
        while (i5 <= i4) {
            int i6 = (i5 + i4) >>> 1;
            int i7 = iArr[i6];
            if (i7 < i3) {
                i5 = i6 + 1;
            } else {
                if (i7 <= i3) {
                    return i6;
                }
                i4 = i6 - 1;
            }
        }
        return ~i5;
    }

    /* JADX INFO: renamed from: n */
    public static int m815n(int i2) {
        return m816q(i2 * 4) / 4;
    }

    /* JADX INFO: renamed from: q */
    public static int m816q(int i2) {
        for (int i3 = 4; i3 < 32; i3++) {
            int i4 = (1 << i3) - 12;
            if (i2 <= i4) {
                return i4;
            }
        }
        return i2;
    }

    static int toq(long[] jArr, int i2, long j2) {
        int i3 = i2 - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            long j3 = jArr[i5];
            if (j3 < j2) {
                i4 = i5 + 1;
            } else {
                if (j3 <= j2) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }

    public static boolean zy(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }
}
