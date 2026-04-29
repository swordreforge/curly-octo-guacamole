package kotlin.random;

import java.io.Serializable;
import kotlin.internal.qrj;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.lv5;
import kotlin.jvm.internal.ni7;
import kotlin.ranges.x2;
import kotlin.yz;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlin.random.g */
/* JADX INFO: compiled from: Random.kt */
/* JADX INFO: loaded from: classes3.dex */
@lv5({"SMAP\nRandom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Random.kt\nkotlin/random/Random\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,383:1\n1#2:384\n*E\n"})
@yz(version = "1.3")
public abstract class AbstractC6332g {

    @InterfaceC7396q
    public static final k Default = new k(null);

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private static final AbstractC6332g f36494k = qrj.f36293k.toq();

    /* JADX INFO: renamed from: kotlin.random.g$k */
    /* JADX INFO: compiled from: Random.kt */
    public static final class k extends AbstractC6332g implements Serializable {

        /* JADX INFO: renamed from: kotlin.random.g$k$k, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Random.kt */
        private static final class C8059k implements Serializable {

            @InterfaceC7396q
            public static final C8059k INSTANCE = new C8059k();
            private static final long serialVersionUID = 0;

            private C8059k() {
            }

            private final Object readResolve() {
                return AbstractC6332g.Default;
            }
        }

        private k() {
        }

        public /* synthetic */ k(ni7 ni7Var) {
            this();
        }

        private final Object writeReplace() {
            return C8059k.INSTANCE;
        }

        @Override // kotlin.random.AbstractC6332g
        public int nextBits(int i2) {
            return AbstractC6332g.f36494k.nextBits(i2);
        }

        @Override // kotlin.random.AbstractC6332g
        public boolean nextBoolean() {
            return AbstractC6332g.f36494k.nextBoolean();
        }

        @Override // kotlin.random.AbstractC6332g
        @InterfaceC7396q
        public byte[] nextBytes(@InterfaceC7396q byte[] array) {
            d2ok.m23075h(array, "array");
            return AbstractC6332g.f36494k.nextBytes(array);
        }

        @Override // kotlin.random.AbstractC6332g
        public double nextDouble() {
            return AbstractC6332g.f36494k.nextDouble();
        }

        @Override // kotlin.random.AbstractC6332g
        public float nextFloat() {
            return AbstractC6332g.f36494k.nextFloat();
        }

        @Override // kotlin.random.AbstractC6332g
        public int nextInt() {
            return AbstractC6332g.f36494k.nextInt();
        }

        @Override // kotlin.random.AbstractC6332g
        public long nextLong() {
            return AbstractC6332g.f36494k.nextLong();
        }

        @Override // kotlin.random.AbstractC6332g
        @InterfaceC7396q
        public byte[] nextBytes(int i2) {
            return AbstractC6332g.f36494k.nextBytes(i2);
        }

        @Override // kotlin.random.AbstractC6332g
        public double nextDouble(double d2) {
            return AbstractC6332g.f36494k.nextDouble(d2);
        }

        @Override // kotlin.random.AbstractC6332g
        public int nextInt(int i2) {
            return AbstractC6332g.f36494k.nextInt(i2);
        }

        @Override // kotlin.random.AbstractC6332g
        public long nextLong(long j2) {
            return AbstractC6332g.f36494k.nextLong(j2);
        }

        @Override // kotlin.random.AbstractC6332g
        @InterfaceC7396q
        public byte[] nextBytes(@InterfaceC7396q byte[] array, int i2, int i3) {
            d2ok.m23075h(array, "array");
            return AbstractC6332g.f36494k.nextBytes(array, i2, i3);
        }

        @Override // kotlin.random.AbstractC6332g
        public double nextDouble(double d2, double d4) {
            return AbstractC6332g.f36494k.nextDouble(d2, d4);
        }

        @Override // kotlin.random.AbstractC6332g
        public int nextInt(int i2, int i3) {
            return AbstractC6332g.f36494k.nextInt(i2, i3);
        }

        @Override // kotlin.random.AbstractC6332g
        public long nextLong(long j2, long j3) {
            return AbstractC6332g.f36494k.nextLong(j2, j3);
        }
    }

    public static /* synthetic */ byte[] nextBytes$default(AbstractC6332g abstractC6332g, byte[] bArr, int i2, int i3, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: nextBytes");
        }
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = bArr.length;
        }
        return abstractC6332g.nextBytes(bArr, i2, i3);
    }

    public abstract int nextBits(int i2);

    public boolean nextBoolean() {
        return nextBits(1) != 0;
    }

    @InterfaceC7396q
    public byte[] nextBytes(@InterfaceC7396q byte[] array, int i2, int i3) {
        d2ok.m23075h(array, "array");
        if (!(new x2(0, array.length).x2(i2) && new x2(0, array.length).x2(i3))) {
            throw new IllegalArgumentException(("fromIndex (" + i2 + ") or toIndex (" + i3 + ") are out of range: 0.." + array.length + '.').toString());
        }
        if (!(i2 <= i3)) {
            throw new IllegalArgumentException(("fromIndex (" + i2 + ") must be not greater than toIndex (" + i3 + ").").toString());
        }
        int i4 = (i3 - i2) / 4;
        for (int i5 = 0; i5 < i4; i5++) {
            int iNextInt = nextInt();
            array[i2] = (byte) iNextInt;
            array[i2 + 1] = (byte) (iNextInt >>> 8);
            array[i2 + 2] = (byte) (iNextInt >>> 16);
            array[i2 + 3] = (byte) (iNextInt >>> 24);
            i2 += 4;
        }
        int i6 = i3 - i2;
        int iNextBits = nextBits(i6 * 8);
        for (int i7 = 0; i7 < i6; i7++) {
            array[i2 + i7] = (byte) (iNextBits >>> (i7 * 8));
        }
        return array;
    }

    public double nextDouble() {
        return C6334n.m23277q(nextBits(26), nextBits(27));
    }

    public float nextFloat() {
        return nextBits(24) / 1.6777216E7f;
    }

    public int nextInt() {
        return nextBits(32);
    }

    public long nextLong() {
        return (((long) nextInt()) << 32) + ((long) nextInt());
    }

    public double nextDouble(double d2) {
        return nextDouble(0.0d, d2);
    }

    public int nextInt(int i2) {
        return nextInt(0, i2);
    }

    public long nextLong(long j2) {
        return nextLong(0L, j2);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public double nextDouble(double r7, double r9) {
        /*
            r6 = this;
            kotlin.random.f7l8.m23273q(r7, r9)
            double r0 = r9 - r7
            boolean r2 = java.lang.Double.isInfinite(r0)
            if (r2 == 0) goto L3d
            boolean r2 = java.lang.Double.isInfinite(r7)
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L1b
            boolean r2 = java.lang.Double.isNaN(r7)
            if (r2 != 0) goto L1b
            r2 = r3
            goto L1c
        L1b:
            r2 = r4
        L1c:
            if (r2 == 0) goto L3d
            boolean r2 = java.lang.Double.isInfinite(r9)
            if (r2 != 0) goto L2b
            boolean r2 = java.lang.Double.isNaN(r9)
            if (r2 != 0) goto L2b
            goto L2c
        L2b:
            r3 = r4
        L2c:
            if (r3 == 0) goto L3d
            double r0 = r6.nextDouble()
            r2 = 2
            double r2 = (double) r2
            double r4 = r9 / r2
            double r2 = r7 / r2
            double r4 = r4 - r2
            double r0 = r0 * r4
            double r7 = r7 + r0
            double r7 = r7 + r0
            goto L43
        L3d:
            double r2 = r6.nextDouble()
            double r2 = r2 * r0
            double r7 = r7 + r2
        L43:
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 < 0) goto L4d
            r7 = -4503599627370496(0xfff0000000000000, double:-Infinity)
            double r7 = java.lang.Math.nextAfter(r9, r7)
        L4d:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.random.AbstractC6332g.nextDouble(double, double):double");
    }

    public int nextInt(int i2, int i3) {
        int iNextInt;
        int i4;
        int iNextBits;
        int iNextInt2;
        boolean z2;
        f7l8.m23271n(i2, i3);
        int i5 = i3 - i2;
        if (i5 > 0 || i5 == Integer.MIN_VALUE) {
            if (((-i5) & i5) == i5) {
                iNextBits = nextBits(f7l8.f7l8(i5));
            } else {
                do {
                    iNextInt = nextInt() >>> 1;
                    i4 = iNextInt % i5;
                } while ((iNextInt - i4) + (i5 - 1) < 0);
                iNextBits = i4;
            }
            return i2 + iNextBits;
        }
        do {
            iNextInt2 = nextInt();
            z2 = false;
            if (i2 <= iNextInt2 && iNextInt2 < i3) {
                z2 = true;
            }
        } while (!z2);
        return iNextInt2;
    }

    public long nextLong(long j2, long j3) {
        long jNextLong;
        boolean z2;
        long jNextLong2;
        long j4;
        long jNextBits;
        int iNextInt;
        f7l8.m23269g(j2, j3);
        long j5 = j3 - j2;
        if (j5 <= 0) {
            do {
                jNextLong = nextLong();
                z2 = false;
                if (j2 <= jNextLong && jNextLong < j3) {
                    z2 = true;
                }
            } while (!z2);
            return jNextLong;
        }
        if (((-j5) & j5) == j5) {
            int i2 = (int) j5;
            int i3 = (int) (j5 >>> 32);
            if (i2 != 0) {
                iNextInt = nextBits(f7l8.f7l8(i2));
            } else if (i3 == 1) {
                iNextInt = nextInt();
            } else {
                jNextBits = (((long) nextBits(f7l8.f7l8(i3))) << 32) + (((long) nextInt()) & 4294967295L);
            }
            jNextBits = ((long) iNextInt) & 4294967295L;
        } else {
            do {
                jNextLong2 = nextLong() >>> 1;
                j4 = jNextLong2 % j5;
            } while ((jNextLong2 - j4) + (j5 - 1) < 0);
            jNextBits = j4;
        }
        return j2 + jNextBits;
    }

    @InterfaceC7396q
    public byte[] nextBytes(@InterfaceC7396q byte[] array) {
        d2ok.m23075h(array, "array");
        return nextBytes(array, 0, array.length);
    }

    @InterfaceC7396q
    public byte[] nextBytes(int i2) {
        return nextBytes(new byte[i2]);
    }
}
