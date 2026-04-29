package kotlin;

import kotlin.internal.InterfaceC6234g;

/* JADX INFO: compiled from: FloorDivMod.kt */
/* JADX INFO: loaded from: classes3.dex */
class dd extends C6331r {
    @kotlin.internal.f7l8
    @InterfaceC6234g
    @yz(version = "1.5")
    /* JADX INFO: renamed from: a */
    private static final long m22791a(int i2, long j2) {
        long j3 = ((long) i2) % j2;
        return j3 + (j2 & (((j3 ^ j2) & ((-j3) | j3)) >> 63));
    }

    @kotlin.internal.f7l8
    @InterfaceC6234g
    @yz(version = "1.5")
    private static final long a98o(byte b2, long j2) {
        long j3 = ((long) b2) % j2;
        return j3 + (j2 & (((j3 ^ j2) & ((-j3) | j3)) >> 63));
    }

    @kotlin.internal.f7l8
    @InterfaceC6234g
    @yz(version = "1.5")
    /* JADX INFO: renamed from: b */
    private static final int m22792b(int i2, int i3) {
        int i4 = i2 % i3;
        return i4 + (i3 & (((i4 ^ i3) & ((-i4) | i4)) >> 31));
    }

    @kotlin.internal.f7l8
    @InterfaceC6234g
    @yz(version = "1.5")
    private static final int bf2(long j2, int i2) {
        long j3 = i2;
        long j4 = j2 % j3;
        return (int) (j4 + (j3 & (((j4 ^ j3) & ((-j4) | j4)) >> 63)));
    }

    @kotlin.internal.f7l8
    @InterfaceC6234g
    @yz(version = "1.5")
    /* JADX INFO: renamed from: c */
    private static final long m22793c(long j2, int i2) {
        long j3 = i2;
        long j4 = j2 / j3;
        return ((j2 ^ j3) >= 0 || j3 * j4 == j2) ? j4 : j4 - 1;
    }

    @kotlin.internal.f7l8
    @InterfaceC6234g
    @yz(version = "1.5")
    private static final short ch(byte b2, short s2) {
        int i2 = b2 % s2;
        return (short) (i2 + (s2 & (((i2 ^ s2) & ((-i2) | i2)) >> 31)));
    }

    @kotlin.internal.f7l8
    @InterfaceC6234g
    @yz(version = "1.5")
    private static final int d2ok(byte b2, short s2) {
        int i2 = b2 / s2;
        return ((b2 ^ s2) >= 0 || s2 * i2 == b2) ? i2 : i2 - 1;
    }

    @kotlin.internal.f7l8
    @InterfaceC6234g
    @yz(version = "1.5")
    private static final int dd(int i2, short s2) {
        int i3 = i2 / s2;
        return ((i2 ^ s2) >= 0 || s2 * i3 == i2) ? i3 : i3 - 1;
    }

    @kotlin.internal.f7l8
    @InterfaceC6234g
    @yz(version = "1.5")
    /* JADX INFO: renamed from: e */
    private static final byte m22794e(byte b2, byte b3) {
        int i2 = b2 % b3;
        return (byte) (i2 + (b3 & (((i2 ^ b3) & ((-i2) | i2)) >> 31)));
    }

    @kotlin.internal.f7l8
    @InterfaceC6234g
    @yz(version = "1.5")
    private static final double ek5k(float f2, double d2) {
        double d4 = ((double) f2) % d2;
        if (d4 == 0.0d) {
            return d4;
        }
        return !(Math.signum(d4) == Math.signum(d2)) ? d4 + d2 : d4;
    }

    @kotlin.internal.f7l8
    @InterfaceC6234g
    @yz(version = "1.5")
    private static final int eqxt(byte b2, int i2) {
        int i3 = b2 / i2;
        return ((b2 ^ i2) >= 0 || i2 * i3 == b2) ? i3 : i3 - 1;
    }

    @kotlin.internal.f7l8
    @InterfaceC6234g
    @yz(version = "1.5")
    /* JADX INFO: renamed from: f */
    private static final long m22795f(long j2, byte b2) {
        long j3 = b2;
        long j4 = j2 / j3;
        return ((j2 ^ j3) >= 0 || j3 * j4 == j2) ? j4 : j4 - 1;
    }

    @kotlin.internal.f7l8
    @InterfaceC6234g
    @yz(version = "1.5")
    private static final byte hb(long j2, byte b2) {
        long j3 = j2 % b2;
        return (byte) (j3 + (r0 & (((j3 ^ r0) & ((-j3) | j3)) >> 63)));
    }

    @kotlin.internal.f7l8
    @InterfaceC6234g
    @yz(version = "1.5")
    private static final long hyr(int i2, long j2) {
        long j3 = i2;
        long j4 = j3 / j2;
        return ((j3 ^ j2) >= 0 || j2 * j4 == j3) ? j4 : j4 - 1;
    }

    @kotlin.internal.f7l8
    @InterfaceC6234g
    @yz(version = "1.5")
    private static final int i1(short s2, int i2) {
        int i3 = s2 % i2;
        return i3 + (i2 & (((i3 ^ i2) & ((-i3) | i3)) >> 31));
    }

    @kotlin.internal.f7l8
    @InterfaceC6234g
    @yz(version = "1.5")
    /* JADX INFO: renamed from: j */
    private static final byte m22796j(short s2, byte b2) {
        int i2 = s2 % b2;
        return (byte) (i2 + (b2 & (((i2 ^ b2) & ((-i2) | i2)) >> 31)));
    }

    @kotlin.internal.f7l8
    @InterfaceC6234g
    @yz(version = "1.5")
    /* JADX INFO: renamed from: l */
    private static final int m22797l(short s2, short s3) {
        int i2 = s2 / s3;
        return ((s2 ^ s3) >= 0 || s3 * i2 == s2) ? i2 : i2 - 1;
    }

    @kotlin.internal.f7l8
    @InterfaceC6234g
    @yz(version = "1.5")
    private static final long lrht(long j2, long j3) {
        long j4 = j2 / j3;
        return ((j2 ^ j3) >= 0 || j3 * j4 == j2) ? j4 : j4 - 1;
    }

    @kotlin.internal.f7l8
    @InterfaceC6234g
    @yz(version = "1.5")
    private static final short lv5(long j2, short s2) {
        long j3 = j2 % s2;
        return (short) (j3 + (r0 & (((j3 ^ r0) & ((-j3) | j3)) >> 63)));
    }

    @kotlin.internal.f7l8
    @InterfaceC6234g
    @yz(version = "1.5")
    private static final int lvui(int i2, byte b2) {
        int i3 = i2 / b2;
        return ((i2 ^ b2) >= 0 || b2 * i3 == i2) ? i3 : i3 - 1;
    }

    @kotlin.internal.f7l8
    @InterfaceC6234g
    @yz(version = "1.5")
    /* JADX INFO: renamed from: m */
    private static final double m22798m(double d2, float f2) {
        double d4 = f2;
        double d5 = d2 % d4;
        if (d5 == 0.0d) {
            return d5;
        }
        return !(Math.signum(d5) == Math.signum(d4)) ? d5 + d4 : d5;
    }

    @kotlin.internal.f7l8
    @InterfaceC6234g
    @yz(version = "1.5")
    private static final long n5r1(byte b2, long j2) {
        long j3 = b2;
        long j4 = j3 / j2;
        return ((j3 ^ j2) >= 0 || j2 * j4 == j3) ? j4 : j4 - 1;
    }

    @kotlin.internal.f7l8
    @InterfaceC6234g
    @yz(version = "1.5")
    private static final int ncyb(short s2, int i2) {
        int i3 = s2 / i2;
        return ((s2 ^ i2) >= 0 || i2 * i3 == s2) ? i3 : i3 - 1;
    }

    @kotlin.internal.f7l8
    @InterfaceC6234g
    @yz(version = "1.5")
    private static final short nmn5(int i2, short s2) {
        int i3 = i2 % s2;
        return (short) (i3 + (s2 & (((i3 ^ s2) & ((-i3) | i3)) >> 31)));
    }

    @kotlin.internal.f7l8
    @InterfaceC6234g
    @yz(version = "1.5")
    private static final byte nn86(int i2, byte b2) {
        int i3 = i2 % b2;
        return (byte) (i3 + (b2 & (((i3 ^ b2) & ((-i3) | i3)) >> 31)));
    }

    @kotlin.internal.f7l8
    @InterfaceC6234g
    @yz(version = "1.5")
    /* JADX INFO: renamed from: o */
    private static final double m22799o(double d2, double d4) {
        double d5 = d2 % d4;
        if (d5 == 0.0d) {
            return d5;
        }
        return !(Math.signum(d5) == Math.signum(d4)) ? d5 + d4 : d5;
    }

    @kotlin.internal.f7l8
    @InterfaceC6234g
    @yz(version = "1.5")
    private static final int oc(byte b2, byte b3) {
        int i2 = b2 / b3;
        return ((b2 ^ b3) >= 0 || b3 * i2 == b2) ? i2 : i2 - 1;
    }

    @kotlin.internal.f7l8
    @InterfaceC6234g
    @yz(version = "1.5")
    /* JADX INFO: renamed from: r */
    private static final int m22800r(int i2, int i3) {
        int i4 = i2 / i3;
        return ((i2 ^ i3) >= 0 || i3 * i4 == i2) ? i4 : i4 - 1;
    }

    @kotlin.internal.f7l8
    @InterfaceC6234g
    @yz(version = "1.5")
    private static final short t8iq(short s2, short s3) {
        int i2 = s2 % s3;
        return (short) (i2 + (s3 & (((i2 ^ s3) & ((-i2) | i2)) >> 31)));
    }

    @kotlin.internal.f7l8
    @InterfaceC6234g
    @yz(version = "1.5")
    private static final long uv6(long j2, short s2) {
        long j3 = s2;
        long j4 = j2 / j3;
        return ((j2 ^ j3) >= 0 || j3 * j4 == j2) ? j4 : j4 - 1;
    }

    @kotlin.internal.f7l8
    @InterfaceC6234g
    @yz(version = "1.5")
    private static final long vyq(short s2, long j2) {
        long j3 = s2;
        long j4 = j3 / j2;
        return ((j3 ^ j2) >= 0 || j2 * j4 == j3) ? j4 : j4 - 1;
    }

    @kotlin.internal.f7l8
    @InterfaceC6234g
    @yz(version = "1.5")
    /* JADX INFO: renamed from: x */
    private static final long m22801x(short s2, long j2) {
        long j3 = ((long) s2) % j2;
        return j3 + (j2 & (((j3 ^ j2) & ((-j3) | j3)) >> 63));
    }

    @kotlin.internal.f7l8
    @InterfaceC6234g
    @yz(version = "1.5")
    private static final int x9kr(short s2, byte b2) {
        int i2 = s2 / b2;
        return ((s2 ^ b2) >= 0 || b2 * i2 == s2) ? i2 : i2 - 1;
    }

    @kotlin.internal.f7l8
    @InterfaceC6234g
    @yz(version = "1.5")
    private static final int y9n(byte b2, int i2) {
        int i3 = b2 % i2;
        return i3 + (i2 & (((i3 ^ i2) & ((-i3) | i3)) >> 31));
    }

    @kotlin.internal.f7l8
    @InterfaceC6234g
    @yz(version = "1.5")
    private static final float yz(float f2, float f3) {
        float f4 = f2 % f3;
        if (f4 == 0.0f) {
            return f4;
        }
        return !(Math.signum(f4) == Math.signum(f3)) ? f4 + f3 : f4;
    }

    @kotlin.internal.f7l8
    @InterfaceC6234g
    @yz(version = "1.5")
    private static final long zp(long j2, long j3) {
        long j4 = j2 % j3;
        return j4 + (j3 & (((j4 ^ j3) & ((-j4) | j4)) >> 63));
    }
}
