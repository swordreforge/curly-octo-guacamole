package com.google.common.math;

import com.google.common.base.jk;
import com.miui.maml.folme.AnimatedProperty;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import wlev.InterfaceC7731k;
import wlev.InterfaceC7732q;

/* JADX INFO: renamed from: com.google.common.math.k */
/* JADX INFO: compiled from: BigIntegerMath.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq(emulated = true)
public final class C4720k {

    /* JADX INFO: renamed from: k */
    @InterfaceC7732q
    static final int f27165k = 256;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7732q
    static final BigInteger f68357toq = new BigInteger("16a09e667f3bcc908b2fb1366ea957d3e3adec17512775099da2f590b0667322a", 16);

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final double f68358zy = Math.log(10.0d);

    /* JADX INFO: renamed from: q */
    private static final double f27166q = Math.log(2.0d);

    /* JADX INFO: renamed from: com.google.common.math.k$k */
    /* JADX INFO: compiled from: BigIntegerMath.java */
    static /* synthetic */ class k {

        /* JADX INFO: renamed from: k */
        static final /* synthetic */ int[] f27167k;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            f27167k = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27167k[RoundingMode.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27167k[RoundingMode.FLOOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f27167k[RoundingMode.UP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f27167k[RoundingMode.CEILING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f27167k[RoundingMode.HALF_DOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f27167k[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f27167k[RoundingMode.HALF_EVEN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    private C4720k() {
    }

    public static boolean f7l8(BigInteger bigInteger) {
        jk.a9(bigInteger);
        return bigInteger.signum() > 0 && bigInteger.getLowestSetBit() == bigInteger.bitLength() - 1;
    }

    @InterfaceC7731k
    /* JADX INFO: renamed from: g */
    public static BigInteger m16509g(BigInteger bigInteger) {
        return BigInteger.ZERO.setBit(ld6(bigInteger, RoundingMode.FLOOR));
    }

    /* JADX INFO: renamed from: k */
    public static BigInteger m16510k(int i2, int i3) {
        int i4;
        f7l8.m16492n("n", i2);
        f7l8.m16492n("k", i3);
        int i5 = 1;
        jk.qrj(i3 <= i2, "k (%s) > n (%s)", i3, i2);
        if (i3 > (i2 >> 1)) {
            i3 = i2 - i3;
        }
        int[] iArr = C4719g.f27162y;
        if (i3 < iArr.length && i2 <= iArr[i3]) {
            return BigInteger.valueOf(C4719g.m16500k(i2, i3));
        }
        BigInteger bigIntegerDivide = BigInteger.ONE;
        long j2 = i2;
        long j3 = 1;
        int iCdj = C4719g.cdj(j2, RoundingMode.CEILING);
        while (true) {
            int i6 = iCdj;
            while (i5 < i3) {
                i4 = i2 - i5;
                i5++;
                i6 += iCdj;
                if (i6 >= 63) {
                    break;
                }
                j2 *= (long) i4;
                j3 *= (long) i5;
            }
            return bigIntegerDivide.multiply(BigInteger.valueOf(j2)).divide(BigInteger.valueOf(j3));
            bigIntegerDivide = bigIntegerDivide.multiply(BigInteger.valueOf(j2)).divide(BigInteger.valueOf(j3));
            j2 = i4;
            j3 = i5;
        }
    }

    public static int ld6(BigInteger bigInteger, RoundingMode roundingMode) {
        f7l8.m16493p(AnimatedProperty.PROPERTY_NAME_X, (BigInteger) jk.a9(bigInteger));
        int iBitLength = bigInteger.bitLength() - 1;
        switch (k.f27167k[roundingMode.ordinal()]) {
            case 1:
                f7l8.ld6(f7l8(bigInteger));
            case 2:
            case 3:
                return iBitLength;
            case 4:
            case 5:
                return f7l8(bigInteger) ? iBitLength : iBitLength + 1;
            case 6:
            case 7:
            case 8:
                return iBitLength < 256 ? bigInteger.compareTo(f68357toq.shiftRight(256 - iBitLength)) <= 0 ? iBitLength : iBitLength + 1 : bigInteger.pow(2).bitLength() + (-1) < (iBitLength * 2) + 1 ? iBitLength : iBitLength + 1;
            default:
                throw new AssertionError();
        }
    }

    @wlev.zy
    /* JADX INFO: renamed from: n */
    static boolean m16511n(BigInteger bigInteger) {
        return bigInteger.bitLength() <= 63;
    }

    @wlev.zy
    private static BigInteger n7h(BigInteger bigInteger) {
        BigInteger bigIntegerShiftLeft;
        int iLd6 = ld6(bigInteger, RoundingMode.FLOOR);
        if (iLd6 < 1023) {
            bigIntegerShiftLeft = qrj(bigInteger);
        } else {
            int i2 = (iLd6 - 52) & (-2);
            bigIntegerShiftLeft = qrj(bigInteger.shiftRight(i2)).shiftLeft(i2 >> 1);
        }
        BigInteger bigIntegerShiftRight = bigIntegerShiftLeft.add(bigInteger.divide(bigIntegerShiftLeft)).shiftRight(1);
        if (bigIntegerShiftLeft.equals(bigIntegerShiftRight)) {
            return bigIntegerShiftLeft;
        }
        while (true) {
            BigInteger bigIntegerShiftRight2 = bigIntegerShiftRight.add(bigInteger.divide(bigIntegerShiftRight)).shiftRight(1);
            if (bigIntegerShiftRight2.compareTo(bigIntegerShiftRight) >= 0) {
                return bigIntegerShiftRight;
            }
            bigIntegerShiftRight = bigIntegerShiftRight2;
        }
    }

    @wlev.zy
    /* JADX INFO: renamed from: p */
    public static int m16512p(BigInteger bigInteger, RoundingMode roundingMode) {
        int iCompareTo;
        f7l8.m16493p(AnimatedProperty.PROPERTY_NAME_X, bigInteger);
        if (m16511n(bigInteger)) {
            return C4719g.kja0(bigInteger.longValue(), roundingMode);
        }
        int iLd6 = (int) ((((double) ld6(bigInteger, RoundingMode.FLOOR)) * f27166q) / f68358zy);
        BigInteger bigIntegerPow = BigInteger.TEN.pow(iLd6);
        int iCompareTo2 = bigIntegerPow.compareTo(bigInteger);
        if (iCompareTo2 > 0) {
            do {
                iLd6--;
                bigIntegerPow = bigIntegerPow.divide(BigInteger.TEN);
                iCompareTo = bigIntegerPow.compareTo(bigInteger);
            } while (iCompareTo > 0);
        } else {
            BigInteger bigIntegerMultiply = BigInteger.TEN.multiply(bigIntegerPow);
            int i2 = iCompareTo2;
            int iCompareTo3 = bigIntegerMultiply.compareTo(bigInteger);
            while (iCompareTo3 <= 0) {
                iLd6++;
                BigInteger bigIntegerMultiply2 = BigInteger.TEN.multiply(bigIntegerMultiply);
                int iCompareTo4 = bigIntegerMultiply2.compareTo(bigInteger);
                BigInteger bigInteger2 = bigIntegerMultiply;
                bigIntegerMultiply = bigIntegerMultiply2;
                bigIntegerPow = bigInteger2;
                i2 = iCompareTo3;
                iCompareTo3 = iCompareTo4;
            }
            iCompareTo = i2;
        }
        switch (k.f27167k[roundingMode.ordinal()]) {
            case 1:
                f7l8.ld6(iCompareTo == 0);
            case 2:
            case 3:
                return iLd6;
            case 4:
            case 5:
                return bigIntegerPow.equals(bigInteger) ? iLd6 : iLd6 + 1;
            case 6:
            case 7:
            case 8:
                return bigInteger.pow(2).compareTo(bigIntegerPow.pow(2).multiply(BigInteger.TEN)) <= 0 ? iLd6 : iLd6 + 1;
            default:
                throw new AssertionError();
        }
    }

    /* JADX INFO: renamed from: q */
    public static BigInteger m16513q(int i2) {
        f7l8.m16492n("n", i2);
        long[] jArr = C4719g.f68353f7l8;
        if (i2 < jArr.length) {
            return BigInteger.valueOf(jArr[i2]);
        }
        ArrayList arrayList = new ArrayList(C4723q.f7l8(C4723q.m16542h(i2, RoundingMode.CEILING) * i2, 64, RoundingMode.CEILING));
        int length = jArr.length;
        long j2 = jArr[length - 1];
        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j2);
        long j3 = j2 >> iNumberOfTrailingZeros;
        int iCdj = C4719g.cdj(j3, RoundingMode.FLOOR) + 1;
        long j4 = length;
        int iCdj2 = C4719g.cdj(j4, RoundingMode.FLOOR) + 1;
        int i3 = 1 << (iCdj2 - 1);
        while (j4 <= i2) {
            if ((j4 & ((long) i3)) != 0) {
                i3 <<= 1;
                iCdj2++;
            }
            int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(j4);
            long j5 = j4 >> iNumberOfTrailingZeros2;
            iNumberOfTrailingZeros += iNumberOfTrailingZeros2;
            if ((iCdj2 - iNumberOfTrailingZeros2) + iCdj >= 64) {
                arrayList.add(BigInteger.valueOf(j3));
                j3 = 1;
            }
            j3 *= j5;
            iCdj = C4719g.cdj(j3, RoundingMode.FLOOR) + 1;
            j4++;
        }
        if (j3 > 1) {
            arrayList.add(BigInteger.valueOf(j3));
        }
        return m16515y(arrayList).shiftLeft(iNumberOfTrailingZeros);
    }

    @wlev.zy
    private static BigInteger qrj(BigInteger bigInteger) {
        return toq.kja0(Math.sqrt(zy.m16576k(bigInteger)), RoundingMode.HALF_EVEN);
    }

    /* JADX INFO: renamed from: s */
    static BigInteger m16514s(List<BigInteger> list, int i2, int i3) {
        int i4 = i3 - i2;
        if (i4 == 0) {
            return BigInteger.ONE;
        }
        if (i4 == 1) {
            return list.get(i2);
        }
        if (i4 == 2) {
            return list.get(i2).multiply(list.get(i2 + 1));
        }
        if (i4 == 3) {
            return list.get(i2).multiply(list.get(i2 + 1)).multiply(list.get(i2 + 2));
        }
        int i5 = (i3 + i2) >>> 1;
        return m16514s(list, i2, i5).multiply(m16514s(list, i5, i3));
    }

    @InterfaceC7731k
    public static BigInteger toq(BigInteger bigInteger) {
        return BigInteger.ZERO.setBit(ld6(bigInteger, RoundingMode.CEILING));
    }

    @wlev.zy
    public static BigInteger x2(BigInteger bigInteger, RoundingMode roundingMode) {
        f7l8.f7l8(AnimatedProperty.PROPERTY_NAME_X, bigInteger);
        if (m16511n(bigInteger)) {
            return BigInteger.valueOf(C4719g.wvg(bigInteger.longValue(), roundingMode));
        }
        BigInteger bigIntegerN7h = n7h(bigInteger);
        switch (k.f27167k[roundingMode.ordinal()]) {
            case 1:
                f7l8.ld6(bigIntegerN7h.pow(2).equals(bigInteger));
            case 2:
            case 3:
                return bigIntegerN7h;
            case 4:
            case 5:
                int iIntValue = bigIntegerN7h.intValue();
                return iIntValue * iIntValue == bigInteger.intValue() && bigIntegerN7h.pow(2).equals(bigInteger) ? bigIntegerN7h : bigIntegerN7h.add(BigInteger.ONE);
            case 6:
            case 7:
            case 8:
                return bigIntegerN7h.pow(2).add(bigIntegerN7h).compareTo(bigInteger) >= 0 ? bigIntegerN7h : bigIntegerN7h.add(BigInteger.ONE);
            default:
                throw new AssertionError();
        }
    }

    /* JADX INFO: renamed from: y */
    static BigInteger m16515y(List<BigInteger> list) {
        return m16514s(list, 0, list.size());
    }

    @wlev.zy
    public static BigInteger zy(BigInteger bigInteger, BigInteger bigInteger2, RoundingMode roundingMode) {
        return new BigDecimal(bigInteger).divide(new BigDecimal(bigInteger2), 0, roundingMode).toBigIntegerExact();
    }
}
