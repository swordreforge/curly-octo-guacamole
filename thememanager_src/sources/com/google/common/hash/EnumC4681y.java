package com.google.common.hash;

import com.google.common.hash.f7l8;
import com.google.common.math.C4719g;
import com.google.common.primitives.C4743p;
import com.google.common.primitives.C4746s;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLongArray;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: com.google.common.hash.y */
/* JADX INFO: compiled from: BloomFilterStrategies.java */
/* JADX INFO: loaded from: classes2.dex */
abstract class EnumC4681y implements f7l8.zy {
    public static final EnumC4681y MURMUR128_MITZ_32;
    public static final EnumC4681y MURMUR128_MITZ_64;

    /* JADX INFO: renamed from: k */
    private static final /* synthetic */ EnumC4681y[] f27042k;

    /* JADX INFO: renamed from: com.google.common.hash.y$k */
    /* JADX INFO: compiled from: BloomFilterStrategies.java */
    enum k extends EnumC4681y {
        k(String str, int i2) {
            super(str, i2, null);
        }

        @Override // com.google.common.hash.f7l8.zy
        public <T> boolean mightContain(T t2, x2<? super T> x2Var, int i2, zy zyVar) {
            long qVar = zyVar.toq();
            long jAsLong = cdj.ni7().hashObject(t2, x2Var).asLong();
            int i3 = (int) jAsLong;
            int i4 = (int) (jAsLong >>> 32);
            for (int i5 = 1; i5 <= i2; i5++) {
                int i6 = (i5 * i4) + i3;
                if (i6 < 0) {
                    i6 = ~i6;
                }
                if (!zyVar.m16376q(((long) i6) % qVar)) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.common.hash.f7l8.zy
        public <T> boolean put(T t2, x2<? super T> x2Var, int i2, zy zyVar) {
            long qVar = zyVar.toq();
            long jAsLong = cdj.ni7().hashObject(t2, x2Var).asLong();
            int i3 = (int) jAsLong;
            int i4 = (int) (jAsLong >>> 32);
            boolean zM16373g = false;
            for (int i5 = 1; i5 <= i2; i5++) {
                int i6 = (i5 * i4) + i3;
                if (i6 < 0) {
                    i6 = ~i6;
                }
                zM16373g |= zyVar.m16373g(((long) i6) % qVar);
            }
            return zM16373g;
        }
    }

    /* JADX INFO: renamed from: com.google.common.hash.y$zy */
    /* JADX INFO: compiled from: BloomFilterStrategies.java */
    static final class zy {

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private static final int f68321zy = 6;

        /* JADX INFO: renamed from: k */
        final AtomicLongArray f27043k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final zurt f68322toq;

        zy(long j2) {
            this(new long[C4746s.m16718q(C4719g.f7l8(j2, 64L, RoundingMode.CEILING))]);
        }

        public static long[] f7l8(AtomicLongArray atomicLongArray) {
            int length = atomicLongArray.length();
            long[] jArr = new long[length];
            for (int i2 = 0; i2 < length; i2++) {
                jArr[i2] = atomicLongArray.get(i2);
            }
            return jArr;
        }

        public boolean equals(@NullableDecl Object obj) {
            if (obj instanceof zy) {
                return Arrays.equals(f7l8(this.f27043k), f7l8(((zy) obj).f27043k));
            }
            return false;
        }

        /* JADX INFO: renamed from: g */
        boolean m16373g(long j2) {
            long j3;
            long j4;
            if (m16376q(j2)) {
                return false;
            }
            int i2 = (int) (j2 >>> 6);
            long j5 = 1 << ((int) j2);
            do {
                j3 = this.f27043k.get(i2);
                j4 = j3 | j5;
                if (j3 == j4) {
                    return false;
                }
            } while (!this.f27043k.compareAndSet(i2, j3, j4));
            this.f68322toq.increment();
            return true;
        }

        public int hashCode() {
            return Arrays.hashCode(f7l8(this.f27043k));
        }

        /* JADX INFO: renamed from: k */
        long m16374k() {
            return this.f68322toq.sum();
        }

        /* JADX INFO: renamed from: n */
        void m16375n(zy zyVar) {
            long j2;
            long j3;
            boolean z2;
            com.google.common.base.jk.qrj(this.f27043k.length() == zyVar.f27043k.length(), "BitArrays must be of equal length (%s != %s)", this.f27043k.length(), zyVar.f27043k.length());
            for (int i2 = 0; i2 < this.f27043k.length(); i2++) {
                long j4 = zyVar.f27043k.get(i2);
                while (true) {
                    j2 = this.f27043k.get(i2);
                    j3 = j2 | j4;
                    if (j2 != j3) {
                        if (this.f27043k.compareAndSet(i2, j2, j3)) {
                            z2 = true;
                            break;
                        }
                    } else {
                        z2 = false;
                        break;
                    }
                }
                if (z2) {
                    this.f68322toq.add(Long.bitCount(j3) - Long.bitCount(j2));
                }
            }
        }

        /* JADX INFO: renamed from: q */
        boolean m16376q(long j2) {
            return ((1 << ((int) j2)) & this.f27043k.get((int) (j2 >>> 6))) != 0;
        }

        long toq() {
            return ((long) this.f27043k.length()) * 64;
        }

        zy zy() {
            return new zy(f7l8(this.f27043k));
        }

        zy(long[] jArr) {
            com.google.common.base.jk.m15380n(jArr.length > 0, "data length is zero!");
            this.f27043k = new AtomicLongArray(jArr);
            this.f68322toq = ni7.m16357k();
            long jBitCount = 0;
            for (long j2 : jArr) {
                jBitCount += (long) Long.bitCount(j2);
            }
            this.f68322toq.add(jBitCount);
        }
    }

    static {
        k kVar = new k("MURMUR128_MITZ_32", 0);
        MURMUR128_MITZ_32 = kVar;
        EnumC4681y enumC4681y = new EnumC4681y("MURMUR128_MITZ_64", 1) { // from class: com.google.common.hash.y.toq
            {
                k kVar2 = null;
            }

            private long toq(byte[] bArr) {
                return C4743p.m16684p(bArr[7], bArr[6], bArr[5], bArr[4], bArr[3], bArr[2], bArr[1], bArr[0]);
            }

            private long zy(byte[] bArr) {
                return C4743p.m16684p(bArr[15], bArr[14], bArr[13], bArr[12], bArr[11], bArr[10], bArr[9], bArr[8]);
            }

            @Override // com.google.common.hash.f7l8.zy
            public <T> boolean mightContain(T t2, x2<? super T> x2Var, int i2, zy zyVar) {
                long qVar = zyVar.toq();
                byte[] bytesInternal = cdj.ni7().hashObject(t2, x2Var).getBytesInternal();
                long qVar2 = toq(bytesInternal);
                long jZy = zy(bytesInternal);
                for (int i3 = 0; i3 < i2; i3++) {
                    if (!zyVar.m16376q((Long.MAX_VALUE & qVar2) % qVar)) {
                        return false;
                    }
                    qVar2 += jZy;
                }
                return true;
            }

            @Override // com.google.common.hash.f7l8.zy
            public <T> boolean put(T t2, x2<? super T> x2Var, int i2, zy zyVar) {
                long qVar = zyVar.toq();
                byte[] bytesInternal = cdj.ni7().hashObject(t2, x2Var).getBytesInternal();
                long qVar2 = toq(bytesInternal);
                long jZy = zy(bytesInternal);
                boolean zM16373g = false;
                for (int i3 = 0; i3 < i2; i3++) {
                    zM16373g |= zyVar.m16373g((Long.MAX_VALUE & qVar2) % qVar);
                    qVar2 += jZy;
                }
                return zM16373g;
            }
        };
        MURMUR128_MITZ_64 = enumC4681y;
        f27042k = new EnumC4681y[]{kVar, enumC4681y};
    }

    private EnumC4681y(String str, int i2) {
    }

    public static EnumC4681y valueOf(String str) {
        return (EnumC4681y) Enum.valueOf(EnumC4681y.class, str);
    }

    public static EnumC4681y[] values() {
        return (EnumC4681y[]) f27042k.clone();
    }

    /* synthetic */ EnumC4681y(String str, int i2, k kVar) {
        this(str, i2);
    }
}
