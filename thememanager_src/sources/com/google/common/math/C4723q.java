package com.google.common.math;

import androidx.constraintlayout.core.motion.utils.zurt;
import com.google.common.base.jk;
import com.google.common.primitives.C4746s;
import com.miui.maml.folme.AnimatedProperty;
import java.math.RoundingMode;
import miuix.view.C7385p;
import wlev.InterfaceC7731k;
import wlev.InterfaceC7732q;

/* JADX INFO: renamed from: com.google.common.math.q */
/* JADX INFO: compiled from: IntMath.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq(emulated = true)
public final class C4723q {

    /* JADX INFO: renamed from: g */
    @InterfaceC7732q
    static final int f27175g = 46340;

    /* JADX INFO: renamed from: k */
    @InterfaceC7732q
    static final int f27176k = 1073741824;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7732q
    static final int f68366toq = -1257966797;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7732q
    static final byte[] f68367zy = {9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 0, 0, 0};

    /* JADX INFO: renamed from: q */
    @InterfaceC7732q
    static final int[] f27178q = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};

    /* JADX INFO: renamed from: n */
    @InterfaceC7732q
    static final int[] f27177n = {3, 31, zurt.InterfaceC0290k.f47401cdj, 3162, 31622, 316227, 3162277, 31622776, 316227766, Integer.MAX_VALUE};

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final int[] f68365f7l8 = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600};

    /* JADX INFO: renamed from: y */
    @InterfaceC7732q
    static int[] f27179y = {Integer.MAX_VALUE, Integer.MAX_VALUE, 65536, 2345, 477, C7385p.f92248ni7, 110, 75, 58, 49, 43, 39, 37, 35, 34, 34, 33};

    /* JADX INFO: renamed from: com.google.common.math.q$k */
    /* JADX INFO: compiled from: IntMath.java */
    static /* synthetic */ class k {

        /* JADX INFO: renamed from: k */
        static final /* synthetic */ int[] f27180k;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            f27180k = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27180k[RoundingMode.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27180k[RoundingMode.FLOOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f27180k[RoundingMode.UP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f27180k[RoundingMode.CEILING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f27180k[RoundingMode.HALF_DOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f27180k[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f27180k[RoundingMode.HALF_EVEN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    private C4723q() {
    }

    public static int cdj(int i2, int i3) {
        return (i2 & i3) + ((i2 ^ i3) >> 1);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int f7l8(int r5, int r6, java.math.RoundingMode r7) {
        /*
            com.google.common.base.jk.a9(r7)
            if (r6 == 0) goto L5c
            int r0 = r5 / r6
            int r1 = r6 * r0
            int r1 = r5 - r1
            if (r1 != 0) goto Le
            return r0
        Le:
            r5 = r5 ^ r6
            int r5 = r5 >> 31
            r2 = 1
            r5 = r5 | r2
            int[] r3 = com.google.common.math.C4723q.k.f27180k
            int r4 = r7.ordinal()
            r3 = r3[r4]
            r4 = 0
            switch(r3) {
                case 1: goto L50;
                case 2: goto L57;
                case 3: goto L4d;
                case 4: goto L58;
                case 5: goto L4a;
                case 6: goto L25;
                case 7: goto L25;
                case 8: goto L25;
                default: goto L1f;
            }
        L1f:
            java.lang.AssertionError r5 = new java.lang.AssertionError
            r5.<init>()
            throw r5
        L25:
            int r1 = java.lang.Math.abs(r1)
            int r6 = java.lang.Math.abs(r6)
            int r6 = r6 - r1
            int r1 = r1 - r6
            if (r1 != 0) goto L47
            java.math.RoundingMode r6 = java.math.RoundingMode.HALF_UP
            if (r7 == r6) goto L58
            java.math.RoundingMode r6 = java.math.RoundingMode.HALF_EVEN
            if (r7 != r6) goto L3b
            r6 = r2
            goto L3c
        L3b:
            r6 = r4
        L3c:
            r7 = r0 & 1
            if (r7 == 0) goto L42
            r7 = r2
            goto L43
        L42:
            r7 = r4
        L43:
            r6 = r6 & r7
            if (r6 == 0) goto L57
            goto L58
        L47:
            if (r1 <= 0) goto L57
            goto L58
        L4a:
            if (r5 <= 0) goto L57
            goto L58
        L4d:
            if (r5 >= 0) goto L57
            goto L58
        L50:
            if (r1 != 0) goto L53
            goto L54
        L53:
            r2 = r4
        L54:
            com.google.common.math.f7l8.ld6(r2)
        L57:
            r2 = r4
        L58:
            if (r2 == 0) goto L5b
            int r0 = r0 + r5
        L5b:
            return r0
        L5c:
            java.lang.ArithmeticException r5 = new java.lang.ArithmeticException
            java.lang.String r6 = "/ by zero"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.math.C4723q.f7l8(int, int, java.math.RoundingMode):int");
    }

    @InterfaceC7731k
    public static int fn3e(int i2, int i3) {
        return C4746s.fu4(((long) i2) * ((long) i3));
    }

    @wlev.zy
    public static int fu4(int i2, RoundingMode roundingMode) {
        int iQrj;
        f7l8.m16492n(AnimatedProperty.PROPERTY_NAME_X, i2);
        int iM16550z = m16550z(i2);
        switch (k.f27180k[roundingMode.ordinal()]) {
            case 1:
                f7l8.ld6(iM16550z * iM16550z == i2);
            case 2:
            case 3:
                return iM16550z;
            case 4:
            case 5:
                iQrj = qrj(iM16550z * iM16550z, i2);
                return iM16550z + iQrj;
            case 6:
            case 7:
            case 8:
                iQrj = qrj((iM16550z * iM16550z) + iM16550z, i2);
                return iM16550z + iQrj;
            default:
                throw new AssertionError();
        }
    }

    /* JADX INFO: renamed from: g */
    public static int m16541g(int i2, int i3) {
        long j2 = ((long) i2) - ((long) i3);
        int i4 = (int) j2;
        f7l8.toq(j2 == ((long) i4), "checkedSubtract", i2, i3);
        return i4;
    }

    /* JADX INFO: renamed from: h */
    public static int m16542h(int i2, RoundingMode roundingMode) {
        f7l8.m16496y(AnimatedProperty.PROPERTY_NAME_X, i2);
        switch (k.f27180k[roundingMode.ordinal()]) {
            case 1:
                f7l8.ld6(ld6(i2));
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 32 - Integer.numberOfLeadingZeros(i2 - 1);
            case 6:
            case 7:
            case 8:
                int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i2);
                return (31 - iNumberOfLeadingZeros) + qrj(f68366toq >>> iNumberOfLeadingZeros, i2);
            default:
                throw new AssertionError();
        }
        return 31 - Integer.numberOfLeadingZeros(i2);
    }

    @InterfaceC7731k
    /* JADX INFO: renamed from: i */
    public static int m16543i(int i2, int i3) {
        return C4746s.fu4(((long) i2) + ((long) i3));
    }

    /* JADX INFO: renamed from: k */
    public static int m16544k(int i2, int i3) {
        f7l8.m16492n("n", i2);
        f7l8.m16492n("k", i3);
        int i4 = 0;
        jk.qrj(i3 <= i2, "k (%s) > n (%s)", i3, i2);
        if (i3 > (i2 >> 1)) {
            i3 = i2 - i3;
        }
        int[] iArr = f27179y;
        if (i3 >= iArr.length || i2 > iArr[i3]) {
            return Integer.MAX_VALUE;
        }
        if (i3 == 0) {
            return 1;
        }
        if (i3 == 1) {
            return i2;
        }
        long j2 = 1;
        while (i4 < i3) {
            long j3 = j2 * ((long) (i2 - i4));
            i4++;
            j2 = j3 / ((long) i4);
        }
        return (int) j2;
    }

    public static int ki(int i2, int i3) {
        if (i3 > 0) {
            int i4 = i2 % i3;
            return i4 >= 0 ? i4 : i4 + i3;
        }
        throw new ArithmeticException("Modulus " + i3 + " must be > 0");
    }

    private static int kja0(int i2) {
        byte b2 = f68367zy[Integer.numberOfLeadingZeros(i2)];
        return b2 - qrj(i2, f27178q[b2]);
    }

    public static boolean ld6(int i2) {
        return (i2 > 0) & ((i2 & (i2 + (-1))) == 0);
    }

    /* JADX INFO: renamed from: n */
    public static int m16545n(int i2, int i3) {
        f7l8.m16492n("exponent", i3);
        if (i2 == -2) {
            f7l8.toq(i3 < 32, "checkedPow", i2, i3);
            return (i3 & 1) == 0 ? 1 << i3 : (-1) << i3;
        }
        if (i2 == -1) {
            return (i3 & 1) == 0 ? 1 : -1;
        }
        if (i2 == 0) {
            return i3 == 0 ? 1 : 0;
        }
        if (i2 == 1) {
            return 1;
        }
        if (i2 == 2) {
            f7l8.toq(i3 < 31, "checkedPow", i2, i3);
            return 1 << i3;
        }
        int iM16547q = 1;
        while (i3 != 0) {
            if (i3 == 1) {
                return m16547q(iM16547q, i2);
            }
            if ((i3 & 1) != 0) {
                iM16547q = m16547q(iM16547q, i2);
            }
            i3 >>= 1;
            if (i3 > 0) {
                f7l8.toq((-46340 <= i2) & (i2 <= f27175g), "checkedPow", i2, i3);
                i2 *= i2;
            }
        }
        return iM16547q;
    }

    @wlev.zy
    public static int n7h(int i2, RoundingMode roundingMode) {
        int iQrj;
        f7l8.m16496y(AnimatedProperty.PROPERTY_NAME_X, i2);
        int iKja0 = kja0(i2);
        int i3 = f27178q[iKja0];
        switch (k.f27180k[roundingMode.ordinal()]) {
            case 1:
                f7l8.ld6(i2 == i3);
            case 2:
            case 3:
                return iKja0;
            case 4:
            case 5:
                iQrj = qrj(i3, i2);
                return iKja0 + iQrj;
            case 6:
            case 7:
            case 8:
                iQrj = qrj(f27177n[iKja0], i2);
                return iKja0 + iQrj;
            default:
                throw new AssertionError();
        }
    }

    @InterfaceC7731k
    public static int ni7(int i2, int i3) {
        return C4746s.fu4(((long) i2) - ((long) i3));
    }

    /* JADX INFO: renamed from: p */
    public static int m16546p(int i2, int i3) {
        f7l8.m16492n("a", i2);
        f7l8.m16492n("b", i3);
        if (i2 == 0) {
            return i3;
        }
        if (i3 == 0) {
            return i2;
        }
        int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(i2);
        int iNumberOfTrailingZeros2 = i2 >> iNumberOfTrailingZeros;
        int iNumberOfTrailingZeros3 = Integer.numberOfTrailingZeros(i3);
        int i4 = i3 >> iNumberOfTrailingZeros3;
        while (iNumberOfTrailingZeros2 != i4) {
            int i5 = iNumberOfTrailingZeros2 - i4;
            int i6 = (i5 >> 31) & i5;
            int i7 = (i5 - i6) - i6;
            i4 += i6;
            iNumberOfTrailingZeros2 = i7 >> Integer.numberOfTrailingZeros(i7);
        }
        return iNumberOfTrailingZeros2 << Math.min(iNumberOfTrailingZeros, iNumberOfTrailingZeros3);
    }

    /* JADX INFO: renamed from: q */
    public static int m16547q(int i2, int i3) {
        long j2 = ((long) i2) * ((long) i3);
        int i4 = (int) j2;
        f7l8.toq(j2 == ((long) i4), "checkedMultiply", i2, i3);
        return i4;
    }

    @InterfaceC7732q
    static int qrj(int i2, int i3) {
        return (~(~(i2 - i3))) >>> 31;
    }

    @InterfaceC7731k
    /* JADX INFO: renamed from: s */
    public static int m16548s(int i2) {
        f7l8.m16496y(AnimatedProperty.PROPERTY_NAME_X, i2);
        return Integer.highestOneBit(i2);
    }

    @wlev.zy
    public static int t8r(int i2, int i3) {
        f7l8.m16492n("exponent", i3);
        if (i2 == -2) {
            if (i3 < 32) {
                return (i3 & 1) == 0 ? 1 << i3 : -(1 << i3);
            }
            return 0;
        }
        if (i2 == -1) {
            return (i3 & 1) == 0 ? 1 : -1;
        }
        if (i2 == 0) {
            return i3 == 0 ? 1 : 0;
        }
        if (i2 == 1) {
            return 1;
        }
        if (i2 == 2) {
            if (i3 < 32) {
                return 1 << i3;
            }
            return 0;
        }
        int i4 = 1;
        while (i3 != 0) {
            if (i3 == 1) {
                return i2 * i4;
            }
            i4 *= (i3 & 1) == 0 ? 1 : i2;
            i2 *= i2;
            i3 >>= 1;
        }
        return i4;
    }

    @InterfaceC7731k
    public static int toq(int i2) {
        f7l8.m16496y(AnimatedProperty.PROPERTY_NAME_X, i2);
        if (i2 <= 1073741824) {
            return 1 << (-Integer.numberOfLeadingZeros(i2 - 1));
        }
        throw new ArithmeticException("ceilingPowerOfTwo(" + i2 + ") not representable as an int");
    }

    @InterfaceC7731k
    @wlev.zy
    public static boolean x2(int i2) {
        return C4719g.qrj(i2);
    }

    /* JADX INFO: renamed from: y */
    public static int m16549y(int i2) {
        f7l8.m16492n("n", i2);
        int[] iArr = f68365f7l8;
        if (i2 < iArr.length) {
            return iArr[i2];
        }
        return Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: z */
    private static int m16550z(int i2) {
        return (int) Math.sqrt(i2);
    }

    @InterfaceC7731k
    public static int zurt(int i2, int i3) {
        f7l8.m16492n("exponent", i3);
        if (i2 == -2) {
            return i3 >= 32 ? (i3 & 1) + Integer.MAX_VALUE : (i3 & 1) == 0 ? 1 << i3 : (-1) << i3;
        }
        if (i2 == -1) {
            return (i3 & 1) == 0 ? 1 : -1;
        }
        if (i2 == 0) {
            return i3 == 0 ? 1 : 0;
        }
        if (i2 == 1) {
            return 1;
        }
        if (i2 == 2) {
            if (i3 >= 31) {
                return Integer.MAX_VALUE;
            }
            return 1 << i3;
        }
        int i4 = ((i2 >>> 31) & i3 & 1) + Integer.MAX_VALUE;
        int iFn3e = 1;
        while (i3 != 0) {
            if (i3 == 1) {
                return fn3e(iFn3e, i2);
            }
            if ((i3 & 1) != 0) {
                iFn3e = fn3e(iFn3e, i2);
            }
            i3 >>= 1;
            if (i3 > 0) {
                if ((-46340 > i2) || (i2 > f27175g)) {
                    return i4;
                }
                i2 *= i2;
            }
        }
        return iFn3e;
    }

    public static int zy(int i2, int i3) {
        long j2 = ((long) i2) + ((long) i3);
        int i4 = (int) j2;
        f7l8.toq(j2 == ((long) i4), "checkedAdd", i2, i3);
        return i4;
    }
}
