package com.google.common.math;

import com.google.common.base.jk;
import com.google.common.primitives.C4744q;
import com.google.common.primitives.C4746s;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import wlev.InterfaceC7731k;

/* JADX INFO: renamed from: com.google.common.math.p */
/* JADX INFO: compiled from: Quantiles.java */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7731k
@wlev.zy
public final class C4722p {

    /* JADX INFO: renamed from: com.google.common.math.p$q */
    /* JADX INFO: compiled from: Quantiles.java */
    public static final class q {

        /* JADX INFO: renamed from: k */
        private final int f27172k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final int[] f68363toq;

        /* JADX INFO: renamed from: k */
        public Map<Integer, Double> m16534k(Collection<? extends Number> collection) {
            return m16535n(C4744q.o1t(collection));
        }

        /* JADX INFO: renamed from: n */
        public Map<Integer, Double> m16535n(double... dArr) {
            int i2 = 0;
            jk.m15380n(dArr.length > 0, "Cannot calculate quantiles of an empty dataset");
            if (C4722p.m16530p(dArr)) {
                HashMap map = new HashMap();
                int[] iArr = this.f68363toq;
                int length = iArr.length;
                while (i2 < length) {
                    map.put(Integer.valueOf(iArr[i2]), Double.valueOf(Double.NaN));
                    i2++;
                }
                return Collections.unmodifiableMap(map);
            }
            int[] iArr2 = this.f68363toq;
            int[] iArr3 = new int[iArr2.length];
            int[] iArr4 = new int[iArr2.length];
            int[] iArr5 = new int[iArr2.length * 2];
            int i3 = 0;
            int i4 = 0;
            while (true) {
                int[] iArr6 = this.f68363toq;
                if (i3 >= iArr6.length) {
                    break;
                }
                long length2 = ((long) iArr6[i3]) * ((long) (dArr.length - 1));
                int iF7l8 = (int) C4719g.f7l8(length2, this.f27172k, RoundingMode.DOWN);
                int i5 = (int) (length2 - (((long) iF7l8) * ((long) this.f27172k)));
                iArr3[i3] = iF7l8;
                iArr4[i3] = i5;
                iArr5[i4] = iF7l8;
                i4++;
                if (i5 != 0) {
                    iArr5[i4] = iF7l8 + 1;
                    i4++;
                }
                i3++;
            }
            Arrays.sort(iArr5, 0, i4);
            C4722p.m16527i(iArr5, 0, i4 - 1, dArr, 0, dArr.length - 1);
            HashMap map2 = new HashMap();
            while (true) {
                int[] iArr7 = this.f68363toq;
                if (i2 >= iArr7.length) {
                    return Collections.unmodifiableMap(map2);
                }
                int i6 = iArr3[i2];
                int i7 = iArr4[i2];
                if (i7 == 0) {
                    map2.put(Integer.valueOf(iArr7[i2]), Double.valueOf(dArr[i6]));
                } else {
                    map2.put(Integer.valueOf(iArr7[i2]), Double.valueOf(C4722p.ld6(dArr[i6], dArr[i6 + 1], i7, this.f27172k)));
                }
                i2++;
            }
        }

        /* JADX INFO: renamed from: q */
        public Map<Integer, Double> m16536q(long... jArr) {
            return m16535n(C4722p.qrj(jArr));
        }

        public Map<Integer, Double> toq(double... dArr) {
            return m16535n((double[]) dArr.clone());
        }

        public Map<Integer, Double> zy(int... iArr) {
            return m16535n(C4722p.x2(iArr));
        }

        private q(int i2, int[] iArr) {
            for (int i3 : iArr) {
                C4722p.m16533y(i3, i2);
            }
            this.f27172k = i2;
            this.f68363toq = iArr;
        }
    }

    /* JADX INFO: renamed from: com.google.common.math.p$toq */
    /* JADX INFO: compiled from: Quantiles.java */
    public static final class toq {

        /* JADX INFO: renamed from: k */
        private final int f27173k;

        /* JADX INFO: renamed from: k */
        public zy m16537k(int i2) {
            return new zy(this.f27173k, i2);
        }

        public q toq(Collection<Integer> collection) {
            return new q(this.f27173k, C4746s.m16720t(collection));
        }

        public q zy(int... iArr) {
            return new q(this.f27173k, (int[]) iArr.clone());
        }

        private toq(int i2) {
            jk.m15380n(i2 > 0, "Quantile scale must be positive");
            this.f27173k = i2;
        }
    }

    /* JADX INFO: renamed from: com.google.common.math.p$zy */
    /* JADX INFO: compiled from: Quantiles.java */
    public static final class zy {

        /* JADX INFO: renamed from: k */
        private final int f27174k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final int f68364toq;

        /* JADX INFO: renamed from: k */
        public double m16538k(Collection<? extends Number> collection) {
            return m16539n(C4744q.o1t(collection));
        }

        /* JADX INFO: renamed from: n */
        public double m16539n(double... dArr) {
            jk.m15380n(dArr.length > 0, "Cannot calculate quantiles of an empty dataset");
            if (C4722p.m16530p(dArr)) {
                return Double.NaN;
            }
            long length = ((long) this.f68364toq) * ((long) (dArr.length - 1));
            int iF7l8 = (int) C4719g.f7l8(length, this.f27174k, RoundingMode.DOWN);
            int i2 = (int) (length - (((long) iF7l8) * ((long) this.f27174k)));
            C4722p.fn3e(iF7l8, dArr, 0, dArr.length - 1);
            if (i2 == 0) {
                return dArr[iF7l8];
            }
            int i3 = iF7l8 + 1;
            C4722p.fn3e(i3, dArr, i3, dArr.length - 1);
            return C4722p.ld6(dArr[iF7l8], dArr[i3], i2, this.f27174k);
        }

        /* JADX INFO: renamed from: q */
        public double m16540q(long... jArr) {
            return m16539n(C4722p.qrj(jArr));
        }

        public double toq(double... dArr) {
            return m16539n((double[]) dArr.clone());
        }

        public double zy(int... iArr) {
            return m16539n(C4722p.x2(iArr));
        }

        private zy(int i2, int i3) {
            C4722p.m16533y(i3, i2);
            this.f27174k = i2;
            this.f68364toq = i3;
        }
    }

    public static toq cdj() {
        return t8r(100);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void fn3e(int i2, double[] dArr, int i3, int i4) {
        if (i2 != i3) {
            while (i4 > i3) {
                int iM16526h = m16526h(dArr, i3, i4);
                if (iM16526h >= i2) {
                    i4 = iM16526h - 1;
                }
                if (iM16526h <= i2) {
                    i3 = iM16526h + 1;
                }
            }
            return;
        }
        int i5 = i3;
        for (int i6 = i3 + 1; i6 <= i4; i6++) {
            if (dArr[i5] > dArr[i6]) {
                i5 = i6;
            }
        }
        if (i5 != i3) {
            zurt(dArr, i5, i3);
        }
    }

    /* JADX INFO: renamed from: h */
    private static int m16526h(double[] dArr, int i2, int i3) {
        kja0(dArr, i2, i3);
        double d2 = dArr[i2];
        int i4 = i3;
        while (i3 > i2) {
            if (dArr[i3] > d2) {
                zurt(dArr, i4, i3);
                i4--;
            }
            i3--;
        }
        zurt(dArr, i2, i4);
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static void m16527i(int[] iArr, int i2, int i3, double[] dArr, int i4, int i5) {
        int iM16532s = m16532s(iArr, i2, i3, i4, i5);
        int i6 = iArr[iM16532s];
        fn3e(i6, dArr, i4, i5);
        int i7 = iM16532s - 1;
        while (i7 >= i2 && iArr[i7] == i6) {
            i7--;
        }
        if (i7 >= i2) {
            m16527i(iArr, i2, i7, dArr, i4, i6 - 1);
        }
        int i8 = iM16532s + 1;
        while (i8 <= i3 && iArr[i8] == i6) {
            i8++;
        }
        if (i8 <= i3) {
            m16527i(iArr, i8, i3, dArr, i6 + 1, i5);
        }
    }

    public static toq ki() {
        return t8r(4);
    }

    private static void kja0(double[] dArr, int i2, int i3) {
        int i4 = (i2 + i3) >>> 1;
        double d2 = dArr[i3];
        double d4 = dArr[i4];
        boolean z2 = d2 < d4;
        double d5 = dArr[i2];
        boolean z3 = d4 < d5;
        boolean z5 = d2 < d5;
        if (z2 == z3) {
            zurt(dArr, i4, i2);
        } else if (z2 != z5) {
            zurt(dArr, i2, i3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static double ld6(double d2, double d4, double d5, double d6) {
        if (d2 == Double.NEGATIVE_INFINITY) {
            return d4 == Double.POSITIVE_INFINITY ? Double.NaN : Double.NEGATIVE_INFINITY;
        }
        if (d4 == Double.POSITIVE_INFINITY) {
            return Double.POSITIVE_INFINITY;
        }
        return d2 + (((d4 - d2) * d5) / d6);
    }

    public static zy n7h() {
        return t8r(2).m16537k(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static boolean m16530p(double... dArr) {
        for (double d2 : dArr) {
            if (Double.isNaN(d2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static double[] qrj(long[] jArr) {
        int length = jArr.length;
        double[] dArr = new double[length];
        for (int i2 = 0; i2 < length; i2++) {
            dArr[i2] = jArr[i2];
        }
        return dArr;
    }

    /* JADX INFO: renamed from: s */
    private static int m16532s(int[] iArr, int i2, int i3, int i4, int i5) {
        if (i2 == i3) {
            return i2;
        }
        int i6 = i4 + i5;
        int i7 = i6 >>> 1;
        while (i3 > i2 + 1) {
            int i8 = (i2 + i3) >>> 1;
            int i9 = iArr[i8];
            if (i9 > i7) {
                i3 = i8;
            } else {
                if (i9 >= i7) {
                    return i8;
                }
                i2 = i8;
            }
        }
        return (i6 - iArr[i2]) - iArr[i3] > 0 ? i3 : i2;
    }

    public static toq t8r(int i2) {
        return new toq(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static double[] x2(int[] iArr) {
        int length = iArr.length;
        double[] dArr = new double[length];
        for (int i2 = 0; i2 < length; i2++) {
            dArr[i2] = iArr[i2];
        }
        return dArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static void m16533y(int i2, int i3) {
        if (i2 < 0 || i2 > i3) {
            throw new IllegalArgumentException("Quantile indexes must be between 0 and the scale, which is " + i3);
        }
    }

    private static void zurt(double[] dArr, int i2, int i3) {
        double d2 = dArr[i2];
        dArr[i2] = dArr[i3];
        dArr[i3] = d2;
    }
}
