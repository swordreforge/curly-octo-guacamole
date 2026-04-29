package com.google.common.math;

import com.android.thememanager.router.recommend.entity.UICard;
import com.google.android.exoplayer2.C3548p;
import com.google.android.exoplayer2.i9jn;
import com.google.common.base.jk;
import com.google.common.primitives.t8r;
import com.miui.clock.module.toq;
import com.miui.maml.folme.AnimatedProperty;
import java.math.RoundingMode;
import okhttp3.internal.connection.C7448g;
import wlev.InterfaceC7731k;
import wlev.InterfaceC7732q;

/* JADX INFO: renamed from: com.google.common.math.g */
/* JADX INFO: compiled from: LongMath.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq(emulated = true)
public final class C4719g {

    /* JADX INFO: renamed from: g */
    @InterfaceC7732q
    static final long f27156g = 3037000499L;

    /* JADX INFO: renamed from: k */
    @InterfaceC7732q
    static final long f27157k = 4611686018427387904L;

    /* JADX INFO: renamed from: p */
    private static final int f27159p = -545925251;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7732q
    static final long f68355toq = -5402926248376769404L;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7732q
    static final byte[] f68356zy = {19, 18, 18, 18, 18, 17, 17, 17, 16, 16, 16, com.google.common.base.zy.f68111cdj, com.google.common.base.zy.f68111cdj, com.google.common.base.zy.f68111cdj, com.google.common.base.zy.f68111cdj, com.google.common.base.zy.f25751h, com.google.common.base.zy.f25751h, com.google.common.base.zy.f25751h, com.google.common.base.zy.f68124kja0, com.google.common.base.zy.f68124kja0, com.google.common.base.zy.f68124kja0, com.google.common.base.zy.f68128n7h, com.google.common.base.zy.f68128n7h, com.google.common.base.zy.f68128n7h, com.google.common.base.zy.f68128n7h, com.google.common.base.zy.f68132qrj, com.google.common.base.zy.f68132qrj, com.google.common.base.zy.f68132qrj, 10, 10, 10, 9, 9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 0, 0};

    /* JADX INFO: renamed from: q */
    @InterfaceC7732q
    @wlev.zy
    static final long[] f27160q = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, C3548p.f21101p, C7448g.f93869ni7, 100000000000L, i9jn.f64793n7h, 10000000000000L, 100000000000000L, 1000000000000000L, 10000000000000000L, 100000000000000000L, 1000000000000000000L};

    /* JADX INFO: renamed from: n */
    @InterfaceC7732q
    @wlev.zy
    static final long[] f27158n = {3, 31, 316, 3162, 31622, 316227, 3162277, 31622776, 316227766, 3162277660L, 31622776601L, 316227766016L, 3162277660168L, 31622776601683L, 316227766016837L, 3162277660168379L, 31622776601683793L, 316227766016837933L, 3162277660168379331L};

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    static final long[] f68353f7l8 = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600, 6227020800L, 87178291200L, 1307674368000L, 20922789888000L, 355687428096000L, 6402373705728000L, 121645100408832000L, 2432902008176640000L};

    /* JADX INFO: renamed from: y */
    static final int[] f27162y = {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 3810779, 121977, 16175, 4337, 1733, 887, 534, 361, 265, toq.zy.f72000f7l8, 169, UICard.RECOMMEND_BOTTOM_LARGE_ICON_ITEM, 125, 111, 101, 94, 88, 83, 79, 76, 74, 72, 70, 69, 68, 67, 67, 66, 66, 66, 66};

    /* JADX INFO: renamed from: s */
    @InterfaceC7732q
    static final int[] f27161s = {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 2642246, 86251, 11724, 3218, 1313, 684, 419, 287, 214, 169, UICard.LARGE_ICONS_APP_SEARCH_CARD, 119, 105, 95, 87, 81, 76, 73, 70, 68, 66, 64, 63, 62, 62, 61, 61, 61};

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final long[][] f68354ld6 = {new long[]{291830, 126401071349994536L}, new long[]{885594168, 725270293939359937L, 3569819667048198375L}, new long[]{273919523040L, 15, 7363882082L, 992620450144556L}, new long[]{47636622961200L, 2, 2570940, 211991001, 3749873356L}, new long[]{7999252175582850L, 2, 4130806001517L, 149795463772692060L, 186635894390467037L, 3967304179347715805L}, new long[]{585226005592931976L, 2, 123635709730000L, 9233062284813009L, 43835965440333360L, 761179012939631437L, 1263739024124850375L}, new long[]{Long.MAX_VALUE, 2, 325, 9375, 28178, 450775, 9780504, 1795265022}};

    /* JADX INFO: renamed from: com.google.common.math.g$k */
    /* JADX INFO: compiled from: LongMath.java */
    static /* synthetic */ class k {

        /* JADX INFO: renamed from: k */
        static final /* synthetic */ int[] f27163k;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            f27163k = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27163k[RoundingMode.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27163k[RoundingMode.FLOOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f27163k[RoundingMode.UP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f27163k[RoundingMode.CEILING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f27163k[RoundingMode.HALF_DOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f27163k[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f27163k[RoundingMode.HALF_EVEN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: com.google.common.math.g$toq */
    /* JADX INFO: compiled from: LongMath.java */
    private static abstract class toq {
        public static final toq LARGE;
        public static final toq SMALL;

        /* JADX INFO: renamed from: k */
        private static final /* synthetic */ toq[] f27164k;

        /* JADX INFO: renamed from: com.google.common.math.g$toq$k */
        /* JADX INFO: compiled from: LongMath.java */
        enum k extends toq {
            k(String str, int i2) {
                super(str, i2, null);
            }

            @Override // com.google.common.math.C4719g.toq
            long mulMod(long j2, long j3, long j4) {
                return (j2 * j3) % j4;
            }

            @Override // com.google.common.math.C4719g.toq
            long squareMod(long j2, long j3) {
                return (j2 * j2) % j3;
            }
        }

        /* JADX INFO: renamed from: com.google.common.math.g$toq$toq, reason: collision with other inner class name */
        /* JADX INFO: compiled from: LongMath.java */
        enum C8012toq extends toq {
            C8012toq(String str, int i2) {
                super(str, i2, null);
            }

            /* JADX INFO: renamed from: n */
            private long m16507n(long j2, long j3) {
                int i2 = 32;
                do {
                    int iMin = Math.min(i2, Long.numberOfLeadingZeros(j2));
                    j2 = t8r.ld6(j2 << iMin, j3);
                    i2 -= iMin;
                } while (i2 > 0);
                return j2;
            }

            /* JADX INFO: renamed from: q */
            private long m16508q(long j2, long j3, long j4) {
                long j5 = j2 + j3;
                return j2 >= j4 - j3 ? j5 - j4 : j5;
            }

            @Override // com.google.common.math.C4719g.toq
            long mulMod(long j2, long j3, long j4) {
                long j5 = j2 >>> 32;
                long j6 = j3 >>> 32;
                long j7 = j2 & 4294967295L;
                long j8 = j3 & 4294967295L;
                long jM16507n = m16507n(j5 * j6, j4) + (j5 * j8);
                if (jM16507n < 0) {
                    jM16507n = t8r.ld6(jM16507n, j4);
                }
                return m16508q(m16507n(jM16507n + (j6 * j7), j4), t8r.ld6(j7 * j8, j4), j4);
            }

            @Override // com.google.common.math.C4719g.toq
            long squareMod(long j2, long j3) {
                long j4 = j2 >>> 32;
                long j5 = j2 & 4294967295L;
                long jM16507n = m16507n(j4 * j4, j3);
                long jLd6 = j4 * j5 * 2;
                if (jLd6 < 0) {
                    jLd6 = t8r.ld6(jLd6, j3);
                }
                return m16508q(m16507n(jM16507n + jLd6, j3), t8r.ld6(j5 * j5, j3), j3);
            }
        }

        static {
            k kVar = new k("SMALL", 0);
            SMALL = kVar;
            C8012toq c8012toq = new C8012toq("LARGE", 1);
            LARGE = c8012toq;
            f27164k = new toq[]{kVar, c8012toq};
        }

        private toq(String str, int i2) {
        }

        static boolean test(long j2, long j3) {
            return (j3 <= C4719g.f27156g ? SMALL : LARGE).zy(j2, j3);
        }

        private long toq(long j2, long j3, long j4) {
            long jMulMod = 1;
            while (j3 != 0) {
                if ((j3 & 1) != 0) {
                    jMulMod = mulMod(jMulMod, j2, j4);
                }
                j2 = squareMod(j2, j4);
                j3 >>= 1;
            }
            return jMulMod;
        }

        public static toq valueOf(String str) {
            return (toq) Enum.valueOf(toq.class, str);
        }

        public static toq[] values() {
            return (toq[]) f27164k.clone();
        }

        private boolean zy(long j2, long j3) {
            long j4 = j3 - 1;
            int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j4);
            long j5 = j4 >> iNumberOfTrailingZeros;
            long j6 = j2 % j3;
            if (j6 == 0) {
                return true;
            }
            long qVar = toq(j6, j5, j3);
            if (qVar == 1) {
                return true;
            }
            int i2 = 0;
            while (qVar != j4) {
                i2++;
                if (i2 == iNumberOfTrailingZeros) {
                    return false;
                }
                qVar = squareMod(qVar, j3);
            }
            return true;
        }

        abstract long mulMod(long j2, long j3, long j4);

        abstract long squareMod(long j2, long j3);

        /* synthetic */ toq(String str, int i2, k kVar) {
            this(str, i2);
        }
    }

    private C4719g() {
    }

    public static int cdj(long j2, RoundingMode roundingMode) {
        f7l8.m16495s(AnimatedProperty.PROPERTY_NAME_X, j2);
        switch (k.f27163k[roundingMode.ordinal()]) {
            case 1:
                f7l8.ld6(x2(j2));
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 64 - Long.numberOfLeadingZeros(j2 - 1);
            case 6:
            case 7:
            case 8:
                int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(j2);
                return (63 - iNumberOfLeadingZeros) + n7h(f68355toq >>> iNumberOfLeadingZeros, j2);
            default:
                throw new AssertionError("impossible");
        }
        return 63 - Long.numberOfLeadingZeros(j2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    @wlev.zy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long f7l8(long r9, long r11, java.math.RoundingMode r13) {
        /*
            com.google.common.base.jk.a9(r13)
            long r0 = r9 / r11
            long r2 = r11 * r0
            long r2 = r9 - r2
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L10
            return r0
        L10:
            long r9 = r9 ^ r11
            r7 = 63
            long r9 = r9 >> r7
            int r9 = (int) r9
            r10 = 1
            r9 = r9 | r10
            int[] r7 = com.google.common.math.C4719g.k.f27163k
            int r8 = r13.ordinal()
            r7 = r7[r8]
            r8 = 0
            switch(r7) {
                case 1: goto L5a;
                case 2: goto L61;
                case 3: goto L57;
                case 4: goto L62;
                case 5: goto L54;
                case 6: goto L29;
                case 7: goto L29;
                case 8: goto L29;
                default: goto L23;
            }
        L23:
            java.lang.AssertionError r9 = new java.lang.AssertionError
            r9.<init>()
            throw r9
        L29:
            long r2 = java.lang.Math.abs(r2)
            long r11 = java.lang.Math.abs(r11)
            long r11 = r11 - r2
            long r2 = r2 - r11
            int r11 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r11 != 0) goto L51
            java.math.RoundingMode r11 = java.math.RoundingMode.HALF_UP
            if (r13 != r11) goto L3d
            r11 = r10
            goto L3e
        L3d:
            r11 = r8
        L3e:
            java.math.RoundingMode r12 = java.math.RoundingMode.HALF_EVEN
            if (r13 != r12) goto L44
            r12 = r10
            goto L45
        L44:
            r12 = r8
        L45:
            r2 = 1
            long r2 = r2 & r0
            int r13 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r13 == 0) goto L4d
            goto L4e
        L4d:
            r10 = r8
        L4e:
            r10 = r10 & r12
            r10 = r10 | r11
            goto L62
        L51:
            if (r11 <= 0) goto L61
            goto L62
        L54:
            if (r9 <= 0) goto L61
            goto L62
        L57:
            if (r9 >= 0) goto L61
            goto L62
        L5a:
            if (r6 != 0) goto L5d
            goto L5e
        L5d:
            r10 = r8
        L5e:
            com.google.common.math.f7l8.ld6(r10)
        L61:
            r10 = r8
        L62:
            if (r10 == 0) goto L66
            long r9 = (long) r9
            long r0 = r0 + r9
        L66:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.math.C4719g.f7l8(long, long, java.math.RoundingMode):long");
    }

    static long fn3e(long j2, long j3, long j4) {
        if (j2 == 1) {
            return j3 / j4;
        }
        long jLd6 = ld6(j2, j4);
        return (j2 / jLd6) * (j3 / (j4 / jLd6));
    }

    @InterfaceC7731k
    public static long fu4(long j2, long j3) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(j2) + Long.numberOfLeadingZeros(~j2) + Long.numberOfLeadingZeros(j3) + Long.numberOfLeadingZeros(~j3);
        if (iNumberOfLeadingZeros > 65) {
            return j2 * j3;
        }
        long j4 = ((j2 ^ j3) >>> 63) + Long.MAX_VALUE;
        if ((iNumberOfLeadingZeros < 64) || ((j3 == Long.MIN_VALUE) & (j2 < 0))) {
            return j4;
        }
        long j5 = j2 * j3;
        return (j2 == 0 || j5 / j2 == j3) ? j5 : j4;
    }

    @wlev.zy
    /* JADX INFO: renamed from: g */
    public static long m16497g(long j2, long j3) {
        long j4 = j2 - j3;
        f7l8.zy(((j2 ^ j3) >= 0) | ((j2 ^ j4) >= 0), "checkedSubtract", j2, j3);
        return j4;
    }

    @wlev.zy
    /* JADX INFO: renamed from: h */
    static int m16498h(long j2) {
        byte b2 = f68356zy[Long.numberOfLeadingZeros(j2)];
        return b2 - n7h(j2, f27160q[b2]);
    }

    @wlev.zy
    /* JADX INFO: renamed from: i */
    public static long m16499i(long j2, long j3) {
        if (j3 <= 0) {
            throw new ArithmeticException("Modulus must be positive");
        }
        long j4 = j2 % j3;
        return j4 >= 0 ? j4 : j4 + j3;
    }

    /* JADX INFO: renamed from: k */
    public static long m16500k(int i2, int i3) {
        f7l8.m16492n("n", i2);
        f7l8.m16492n("k", i3);
        jk.qrj(i3 <= i2, "k (%s) > n (%s)", i3, i2);
        if (i3 > (i2 >> 1)) {
            i3 = i2 - i3;
        }
        long jFn3e = 1;
        if (i3 == 0) {
            return 1L;
        }
        if (i3 == 1) {
            return i2;
        }
        long[] jArr = f68353f7l8;
        if (i2 < jArr.length) {
            return jArr[i2] / (jArr[i3] * jArr[i2 - i3]);
        }
        int[] iArr = f27162y;
        if (i3 >= iArr.length || i2 > iArr[i3]) {
            return Long.MAX_VALUE;
        }
        int[] iArr2 = f27161s;
        if (i3 < iArr2.length && i2 <= iArr2[i3]) {
            int i4 = i2 - 1;
            long j2 = i2;
            for (int i5 = 2; i5 <= i3; i5++) {
                j2 = (j2 * ((long) i4)) / ((long) i5);
                i4--;
            }
            return j2;
        }
        long j3 = i2;
        int iCdj = cdj(j3, RoundingMode.CEILING);
        int i6 = i2 - 1;
        int i7 = iCdj;
        int i8 = 2;
        long j4 = j3;
        long j5 = 1;
        while (i8 <= i3) {
            i7 += iCdj;
            if (i7 < 63) {
                j4 *= (long) i6;
                j5 *= (long) i8;
            } else {
                jFn3e = fn3e(jFn3e, j4, j5);
                j4 = i6;
                j5 = i8;
                i7 = iCdj;
            }
            i8++;
            i6--;
        }
        return fn3e(jFn3e, j4, j5);
    }

    public static long ki(long j2, long j3) {
        return (j2 & j3) + ((j2 ^ j3) >> 1);
    }

    @wlev.zy
    public static int kja0(long j2, RoundingMode roundingMode) {
        int iN7h;
        f7l8.m16495s(AnimatedProperty.PROPERTY_NAME_X, j2);
        int iM16498h = m16498h(j2);
        long j3 = f27160q[iM16498h];
        switch (k.f27163k[roundingMode.ordinal()]) {
            case 1:
                f7l8.ld6(j2 == j3);
            case 2:
            case 3:
                return iM16498h;
            case 4:
            case 5:
                iN7h = n7h(j3, j2);
                return iM16498h + iN7h;
            case 6:
            case 7:
            case 8:
                iN7h = n7h(f27158n[iM16498h], j2);
                return iM16498h + iN7h;
            default:
                throw new AssertionError();
        }
    }

    public static long ld6(long j2, long j3) {
        f7l8.m16490g("a", j2);
        f7l8.m16490g("b", j3);
        if (j2 == 0) {
            return j3;
        }
        if (j3 == 0) {
            return j2;
        }
        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j2);
        long jNumberOfTrailingZeros = j2 >> iNumberOfTrailingZeros;
        int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(j3);
        long j4 = j3 >> iNumberOfTrailingZeros2;
        while (jNumberOfTrailingZeros != j4) {
            long j5 = jNumberOfTrailingZeros - j4;
            long j6 = (j5 >> 63) & j5;
            long j7 = (j5 - j6) - j6;
            j4 += j6;
            jNumberOfTrailingZeros = j7 >> Long.numberOfTrailingZeros(j7);
        }
        return jNumberOfTrailingZeros << Math.min(iNumberOfTrailingZeros, iNumberOfTrailingZeros2);
    }

    @wlev.zy
    /* JADX INFO: renamed from: n */
    public static long m16501n(long j2, int i2) {
        f7l8.m16492n("exponent", i2);
        long jM16503q = 1;
        if ((j2 >= -2) && (j2 <= 2)) {
            int i3 = (int) j2;
            if (i3 == -2) {
                f7l8.zy(i2 < 64, "checkedPow", j2, i2);
                return (i2 & 1) == 0 ? 1 << i2 : (-1) << i2;
            }
            if (i3 == -1) {
                return (i2 & 1) == 0 ? 1L : -1L;
            }
            if (i3 == 0) {
                return i2 == 0 ? 1L : 0L;
            }
            if (i3 == 1) {
                return 1L;
            }
            if (i3 != 2) {
                throw new AssertionError();
            }
            f7l8.zy(i2 < 63, "checkedPow", j2, i2);
            return 1 << i2;
        }
        long j3 = j2;
        int i4 = i2;
        while (i4 != 0) {
            if (i4 == 1) {
                return m16503q(jM16503q, j3);
            }
            if ((i4 & 1) != 0) {
                jM16503q = m16503q(jM16503q, j3);
            }
            long j4 = jM16503q;
            int i5 = i4 >> 1;
            if (i5 > 0) {
                f7l8.zy(-3037000499L <= j3 && j3 <= f27156g, "checkedPow", j3, i5);
                j3 *= j3;
            }
            i4 = i5;
            jM16503q = j4;
        }
        return jM16503q;
    }

    @InterfaceC7732q
    static int n7h(long j2, long j3) {
        return (int) ((~(~(j2 - j3))) >>> 63);
    }

    @InterfaceC7731k
    public static long ni7(long j2, long j3) {
        long j4 = j2 + j3;
        return (((j3 ^ j2) > 0L ? 1 : ((j3 ^ j2) == 0L ? 0 : -1)) < 0) | ((j2 ^ j4) >= 0) ? j4 : ((j4 >>> 63) ^ 1) + Long.MAX_VALUE;
    }

    @InterfaceC7731k
    public static long o1t(long j2, long j3) {
        long j4 = j2 - j3;
        return (((j3 ^ j2) > 0L ? 1 : ((j3 ^ j2) == 0L ? 0 : -1)) >= 0) | ((j2 ^ j4) >= 0) ? j4 : ((j4 >>> 63) ^ 1) + Long.MAX_VALUE;
    }

    @InterfaceC7731k
    /* JADX INFO: renamed from: p */
    public static long m16502p(long j2) {
        f7l8.m16495s(AnimatedProperty.PROPERTY_NAME_X, j2);
        return 1 << (63 - Long.numberOfLeadingZeros(j2));
    }

    /* JADX INFO: renamed from: q */
    public static long m16503q(long j2, long j3) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(j2) + Long.numberOfLeadingZeros(~j2) + Long.numberOfLeadingZeros(j3) + Long.numberOfLeadingZeros(~j3);
        if (iNumberOfLeadingZeros > 65) {
            return j2 * j3;
        }
        f7l8.zy(iNumberOfLeadingZeros >= 64, "checkedMultiply", j2, j3);
        f7l8.zy((j2 >= 0) | (j3 != Long.MIN_VALUE), "checkedMultiply", j2, j3);
        long j4 = j2 * j3;
        f7l8.zy(j2 == 0 || j4 / j2 == j3, "checkedMultiply", j2, j3);
        return j4;
    }

    @InterfaceC7731k
    @wlev.zy
    public static boolean qrj(long j2) {
        if (j2 < 2) {
            f7l8.m16490g("n", j2);
            return false;
        }
        if (j2 == 2 || j2 == 3 || j2 == 5 || j2 == 7 || j2 == 11 || j2 == 13) {
            return true;
        }
        if ((f27159p & (1 << ((int) (j2 % 30)))) != 0 || j2 % 7 == 0 || j2 % 11 == 0 || j2 % 13 == 0) {
            return false;
        }
        if (j2 < 289) {
            return true;
        }
        for (long[] jArr : f68354ld6) {
            if (j2 <= jArr[0]) {
                for (int i2 = 1; i2 < jArr.length; i2++) {
                    if (!toq.test(jArr[i2], j2)) {
                        return false;
                    }
                }
                return true;
            }
        }
        throw new AssertionError();
    }

    /* JADX INFO: renamed from: s */
    static boolean m16504s(long j2) {
        return ((long) ((int) j2)) == j2;
    }

    @wlev.zy
    public static int t8r(long j2, int i2) {
        return (int) m16499i(j2, i2);
    }

    @InterfaceC7731k
    public static long toq(long j2) {
        f7l8.m16495s(AnimatedProperty.PROPERTY_NAME_X, j2);
        if (j2 <= 4611686018427387904L) {
            return 1 << (-Long.numberOfLeadingZeros(j2 - 1));
        }
        throw new ArithmeticException("ceilingPowerOfTwo(" + j2 + ") is not representable as a long");
    }

    @wlev.zy
    public static long wvg(long j2, RoundingMode roundingMode) {
        f7l8.m16490g(AnimatedProperty.PROPERTY_NAME_X, j2);
        if (m16504s(j2)) {
            return C4723q.fu4((int) j2, roundingMode);
        }
        long jSqrt = (long) Math.sqrt(j2);
        long j3 = jSqrt * jSqrt;
        switch (k.f27163k[roundingMode.ordinal()]) {
            case 1:
                f7l8.ld6(j3 == j2);
                return jSqrt;
            case 2:
            case 3:
                return j2 < j3 ? jSqrt - 1 : jSqrt;
            case 4:
            case 5:
                return j2 > j3 ? jSqrt + 1 : jSqrt;
            case 6:
            case 7:
            case 8:
                long j4 = jSqrt - ((long) (j2 >= j3 ? 0 : 1));
                return j4 + ((long) n7h((j4 * j4) + j4, j2));
            default:
                throw new AssertionError();
        }
    }

    public static boolean x2(long j2) {
        return (j2 > 0) & ((j2 & (j2 - 1)) == 0);
    }

    @wlev.zy
    /* JADX INFO: renamed from: y */
    public static long m16505y(int i2) {
        f7l8.m16492n("n", i2);
        long[] jArr = f68353f7l8;
        if (i2 < jArr.length) {
            return jArr[i2];
        }
        return Long.MAX_VALUE;
    }

    @InterfaceC7731k
    /* JADX INFO: renamed from: z */
    public static long m16506z(long j2, int i2) {
        f7l8.m16492n("exponent", i2);
        long jFu4 = 1;
        if (!(j2 >= -2) || !(j2 <= 2)) {
            long j3 = ((j2 >>> 63) & ((long) (i2 & 1))) + Long.MAX_VALUE;
            while (i2 != 0) {
                if (i2 == 1) {
                    return fu4(jFu4, j2);
                }
                if ((i2 & 1) != 0) {
                    jFu4 = fu4(jFu4, j2);
                }
                i2 >>= 1;
                if (i2 > 0) {
                    if ((-3037000499L > j2) || (j2 > f27156g)) {
                        return j3;
                    }
                    j2 *= j2;
                }
            }
            return jFu4;
        }
        int i3 = (int) j2;
        if (i3 == -2) {
            return i2 >= 64 ? ((long) (i2 & 1)) + Long.MAX_VALUE : (i2 & 1) == 0 ? 1 << i2 : (-1) << i2;
        }
        if (i3 == -1) {
            return (i2 & 1) == 0 ? 1L : -1L;
        }
        if (i3 == 0) {
            return i2 == 0 ? 1L : 0L;
        }
        if (i3 == 1) {
            return 1L;
        }
        if (i3 != 2) {
            throw new AssertionError();
        }
        if (i2 >= 63) {
            return Long.MAX_VALUE;
        }
        return 1 << i2;
    }

    @wlev.zy
    public static long zurt(long j2, int i2) {
        f7l8.m16492n("exponent", i2);
        if (-2 > j2 || j2 > 2) {
            long j3 = 1;
            while (i2 != 0) {
                if (i2 == 1) {
                    return j3 * j2;
                }
                j3 *= (i2 & 1) == 0 ? 1L : j2;
                j2 *= j2;
                i2 >>= 1;
            }
            return j3;
        }
        int i3 = (int) j2;
        if (i3 == -2) {
            if (i2 < 64) {
                return (i2 & 1) == 0 ? 1 << i2 : -(1 << i2);
            }
            return 0L;
        }
        if (i3 == -1) {
            return (i2 & 1) == 0 ? 1L : -1L;
        }
        if (i3 == 0) {
            return i2 == 0 ? 1L : 0L;
        }
        if (i3 == 1) {
            return 1L;
        }
        if (i3 != 2) {
            throw new AssertionError();
        }
        if (i2 < 64) {
            return 1 << i2;
        }
        return 0L;
    }

    @wlev.zy
    public static long zy(long j2, long j3) {
        long j4 = j2 + j3;
        f7l8.zy(((j2 ^ j3) < 0) | ((j2 ^ j4) >= 0), "checkedAdd", j2, j3);
        return j4;
    }
}
