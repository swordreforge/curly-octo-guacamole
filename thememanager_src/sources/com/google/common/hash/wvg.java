package com.google.common.hash;

import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: Murmur3_128HashFunction.java */
/* JADX INFO: loaded from: classes2.dex */
@Immutable
final class wvg extends zy implements Serializable {
    private static final long serialVersionUID = 0;
    private final int seed;
    static final kja0 MURMUR3_128 = new wvg(0);
    static final kja0 GOOD_FAST_HASH_128 = new wvg(cdj.f26989k);

    /* JADX INFO: renamed from: com.google.common.hash.wvg$k */
    /* JADX INFO: compiled from: Murmur3_128HashFunction.java */
    private static final class C4680k extends AbstractC4662g {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private static final int f68320f7l8 = 16;

        /* JADX INFO: renamed from: s */
        private static final long f27037s = 5545529020109919103L;

        /* JADX INFO: renamed from: y */
        private static final long f27038y = -8663945395140668459L;

        /* JADX INFO: renamed from: g */
        private int f27039g;

        /* JADX INFO: renamed from: n */
        private long f27040n;

        /* JADX INFO: renamed from: q */
        private long f27041q;

        C4680k(int i2) {
            super(16);
            long j2 = i2;
            this.f27041q = j2;
            this.f27040n = j2;
            this.f27039g = 0;
        }

        private static long fu4(long j2) {
            return Long.rotateLeft(j2 * f27038y, 31) * f27037s;
        }

        private static long ni7(long j2) {
            long j3 = (j2 ^ (j2 >>> 33)) * (-49064778989728563L);
            long j4 = (j3 ^ (j3 >>> 33)) * (-4265267296055464877L);
            return j4 ^ (j4 >>> 33);
        }

        /* JADX INFO: renamed from: z */
        private static long m16372z(long j2) {
            return Long.rotateLeft(j2 * f27037s, 33) * f27038y;
        }

        private void zurt(long j2, long j3) {
            long jFu4 = fu4(j2) ^ this.f27041q;
            this.f27041q = jFu4;
            long jRotateLeft = Long.rotateLeft(jFu4, 27);
            long j4 = this.f27040n;
            this.f27041q = ((jRotateLeft + j4) * 5) + 1390208809;
            long jM16372z = m16372z(j3) ^ j4;
            this.f27040n = jM16372z;
            this.f27040n = ((Long.rotateLeft(jM16372z, 31) + this.f27041q) * 5) + 944331445;
        }

        @Override // com.google.common.hash.AbstractC4662g
        /* JADX INFO: renamed from: h */
        public n7h mo16338h() {
            long j2 = this.f27041q;
            int i2 = this.f27039g;
            long j3 = j2 ^ ((long) i2);
            long j4 = this.f27040n ^ ((long) i2);
            long j5 = j3 + j4;
            this.f27041q = j5;
            this.f27040n = j4 + j5;
            this.f27041q = ni7(j5);
            long jNi7 = ni7(this.f27040n);
            long j6 = this.f27041q + jNi7;
            this.f27041q = j6;
            this.f27040n = jNi7 + j6;
            return n7h.fromBytesNoCopy(ByteBuffer.wrap(new byte[16]).order(ByteOrder.LITTLE_ENDIAN).putLong(this.f27041q).putLong(this.f27040n).array());
        }

        @Override // com.google.common.hash.AbstractC4662g
        /* JADX INFO: renamed from: i */
        protected void mo16339i(ByteBuffer byteBuffer) {
            long jM16653h;
            long jM16653h2;
            long jM16653h3;
            long jM16653h4;
            long jM16653h5;
            long jM16653h6;
            long jM16653h7;
            long jM16653h8;
            long jM16653h9;
            long jM16653h10;
            long jM16653h11;
            long jM16653h12;
            long jM16653h13;
            long jM16653h14;
            this.f27039g += byteBuffer.remaining();
            long j2 = 0;
            switch (byteBuffer.remaining()) {
                case 1:
                    jM16653h = 0;
                    jM16653h7 = ((long) com.google.common.primitives.kja0.m16653h(byteBuffer.get(0))) ^ jM16653h;
                    this.f27041q ^= fu4(jM16653h7);
                    this.f27040n ^= m16372z(j2);
                    return;
                case 2:
                    jM16653h2 = 0;
                    jM16653h = jM16653h2 ^ (((long) com.google.common.primitives.kja0.m16653h(byteBuffer.get(1))) << 8);
                    jM16653h7 = ((long) com.google.common.primitives.kja0.m16653h(byteBuffer.get(0))) ^ jM16653h;
                    this.f27041q ^= fu4(jM16653h7);
                    this.f27040n ^= m16372z(j2);
                    return;
                case 3:
                    jM16653h3 = 0;
                    jM16653h2 = jM16653h3 ^ (((long) com.google.common.primitives.kja0.m16653h(byteBuffer.get(2))) << 16);
                    jM16653h = jM16653h2 ^ (((long) com.google.common.primitives.kja0.m16653h(byteBuffer.get(1))) << 8);
                    jM16653h7 = ((long) com.google.common.primitives.kja0.m16653h(byteBuffer.get(0))) ^ jM16653h;
                    this.f27041q ^= fu4(jM16653h7);
                    this.f27040n ^= m16372z(j2);
                    return;
                case 4:
                    jM16653h4 = 0;
                    jM16653h3 = jM16653h4 ^ (((long) com.google.common.primitives.kja0.m16653h(byteBuffer.get(3))) << 24);
                    jM16653h2 = jM16653h3 ^ (((long) com.google.common.primitives.kja0.m16653h(byteBuffer.get(2))) << 16);
                    jM16653h = jM16653h2 ^ (((long) com.google.common.primitives.kja0.m16653h(byteBuffer.get(1))) << 8);
                    jM16653h7 = ((long) com.google.common.primitives.kja0.m16653h(byteBuffer.get(0))) ^ jM16653h;
                    this.f27041q ^= fu4(jM16653h7);
                    this.f27040n ^= m16372z(j2);
                    return;
                case 5:
                    jM16653h5 = 0;
                    jM16653h4 = jM16653h5 ^ (((long) com.google.common.primitives.kja0.m16653h(byteBuffer.get(4))) << 32);
                    jM16653h3 = jM16653h4 ^ (((long) com.google.common.primitives.kja0.m16653h(byteBuffer.get(3))) << 24);
                    jM16653h2 = jM16653h3 ^ (((long) com.google.common.primitives.kja0.m16653h(byteBuffer.get(2))) << 16);
                    jM16653h = jM16653h2 ^ (((long) com.google.common.primitives.kja0.m16653h(byteBuffer.get(1))) << 8);
                    jM16653h7 = ((long) com.google.common.primitives.kja0.m16653h(byteBuffer.get(0))) ^ jM16653h;
                    this.f27041q ^= fu4(jM16653h7);
                    this.f27040n ^= m16372z(j2);
                    return;
                case 6:
                    jM16653h6 = 0;
                    jM16653h5 = jM16653h6 ^ (((long) com.google.common.primitives.kja0.m16653h(byteBuffer.get(5))) << 40);
                    jM16653h4 = jM16653h5 ^ (((long) com.google.common.primitives.kja0.m16653h(byteBuffer.get(4))) << 32);
                    jM16653h3 = jM16653h4 ^ (((long) com.google.common.primitives.kja0.m16653h(byteBuffer.get(3))) << 24);
                    jM16653h2 = jM16653h3 ^ (((long) com.google.common.primitives.kja0.m16653h(byteBuffer.get(2))) << 16);
                    jM16653h = jM16653h2 ^ (((long) com.google.common.primitives.kja0.m16653h(byteBuffer.get(1))) << 8);
                    jM16653h7 = ((long) com.google.common.primitives.kja0.m16653h(byteBuffer.get(0))) ^ jM16653h;
                    this.f27041q ^= fu4(jM16653h7);
                    this.f27040n ^= m16372z(j2);
                    return;
                case 7:
                    jM16653h6 = (((long) com.google.common.primitives.kja0.m16653h(byteBuffer.get(6))) << 48) ^ 0;
                    jM16653h5 = jM16653h6 ^ (((long) com.google.common.primitives.kja0.m16653h(byteBuffer.get(5))) << 40);
                    jM16653h4 = jM16653h5 ^ (((long) com.google.common.primitives.kja0.m16653h(byteBuffer.get(4))) << 32);
                    jM16653h3 = jM16653h4 ^ (((long) com.google.common.primitives.kja0.m16653h(byteBuffer.get(3))) << 24);
                    jM16653h2 = jM16653h3 ^ (((long) com.google.common.primitives.kja0.m16653h(byteBuffer.get(2))) << 16);
                    jM16653h = jM16653h2 ^ (((long) com.google.common.primitives.kja0.m16653h(byteBuffer.get(1))) << 8);
                    jM16653h7 = ((long) com.google.common.primitives.kja0.m16653h(byteBuffer.get(0))) ^ jM16653h;
                    this.f27041q ^= fu4(jM16653h7);
                    this.f27040n ^= m16372z(j2);
                    return;
                case 8:
                    jM16653h8 = 0;
                    jM16653h7 = byteBuffer.getLong() ^ 0;
                    j2 = jM16653h8;
                    this.f27041q ^= fu4(jM16653h7);
                    this.f27040n ^= m16372z(j2);
                    return;
                case 9:
                    jM16653h9 = 0;
                    jM16653h8 = jM16653h9 ^ ((long) com.google.common.primitives.kja0.m16653h(byteBuffer.get(8)));
                    jM16653h7 = byteBuffer.getLong() ^ 0;
                    j2 = jM16653h8;
                    this.f27041q ^= fu4(jM16653h7);
                    this.f27040n ^= m16372z(j2);
                    return;
                case 10:
                    jM16653h10 = 0;
                    jM16653h9 = jM16653h10 ^ (((long) com.google.common.primitives.kja0.m16653h(byteBuffer.get(9))) << 8);
                    jM16653h8 = jM16653h9 ^ ((long) com.google.common.primitives.kja0.m16653h(byteBuffer.get(8)));
                    jM16653h7 = byteBuffer.getLong() ^ 0;
                    j2 = jM16653h8;
                    this.f27041q ^= fu4(jM16653h7);
                    this.f27040n ^= m16372z(j2);
                    return;
                case 11:
                    jM16653h11 = 0;
                    jM16653h10 = jM16653h11 ^ (((long) com.google.common.primitives.kja0.m16653h(byteBuffer.get(10))) << 16);
                    jM16653h9 = jM16653h10 ^ (((long) com.google.common.primitives.kja0.m16653h(byteBuffer.get(9))) << 8);
                    jM16653h8 = jM16653h9 ^ ((long) com.google.common.primitives.kja0.m16653h(byteBuffer.get(8)));
                    jM16653h7 = byteBuffer.getLong() ^ 0;
                    j2 = jM16653h8;
                    this.f27041q ^= fu4(jM16653h7);
                    this.f27040n ^= m16372z(j2);
                    return;
                case 12:
                    jM16653h12 = 0;
                    jM16653h11 = jM16653h12 ^ (((long) com.google.common.primitives.kja0.m16653h(byteBuffer.get(11))) << 24);
                    jM16653h10 = jM16653h11 ^ (((long) com.google.common.primitives.kja0.m16653h(byteBuffer.get(10))) << 16);
                    jM16653h9 = jM16653h10 ^ (((long) com.google.common.primitives.kja0.m16653h(byteBuffer.get(9))) << 8);
                    jM16653h8 = jM16653h9 ^ ((long) com.google.common.primitives.kja0.m16653h(byteBuffer.get(8)));
                    jM16653h7 = byteBuffer.getLong() ^ 0;
                    j2 = jM16653h8;
                    this.f27041q ^= fu4(jM16653h7);
                    this.f27040n ^= m16372z(j2);
                    return;
                case 13:
                    jM16653h13 = 0;
                    jM16653h12 = jM16653h13 ^ (((long) com.google.common.primitives.kja0.m16653h(byteBuffer.get(12))) << 32);
                    jM16653h11 = jM16653h12 ^ (((long) com.google.common.primitives.kja0.m16653h(byteBuffer.get(11))) << 24);
                    jM16653h10 = jM16653h11 ^ (((long) com.google.common.primitives.kja0.m16653h(byteBuffer.get(10))) << 16);
                    jM16653h9 = jM16653h10 ^ (((long) com.google.common.primitives.kja0.m16653h(byteBuffer.get(9))) << 8);
                    jM16653h8 = jM16653h9 ^ ((long) com.google.common.primitives.kja0.m16653h(byteBuffer.get(8)));
                    jM16653h7 = byteBuffer.getLong() ^ 0;
                    j2 = jM16653h8;
                    this.f27041q ^= fu4(jM16653h7);
                    this.f27040n ^= m16372z(j2);
                    return;
                case 14:
                    jM16653h14 = 0;
                    jM16653h13 = jM16653h14 ^ (((long) com.google.common.primitives.kja0.m16653h(byteBuffer.get(13))) << 40);
                    jM16653h12 = jM16653h13 ^ (((long) com.google.common.primitives.kja0.m16653h(byteBuffer.get(12))) << 32);
                    jM16653h11 = jM16653h12 ^ (((long) com.google.common.primitives.kja0.m16653h(byteBuffer.get(11))) << 24);
                    jM16653h10 = jM16653h11 ^ (((long) com.google.common.primitives.kja0.m16653h(byteBuffer.get(10))) << 16);
                    jM16653h9 = jM16653h10 ^ (((long) com.google.common.primitives.kja0.m16653h(byteBuffer.get(9))) << 8);
                    jM16653h8 = jM16653h9 ^ ((long) com.google.common.primitives.kja0.m16653h(byteBuffer.get(8)));
                    jM16653h7 = byteBuffer.getLong() ^ 0;
                    j2 = jM16653h8;
                    this.f27041q ^= fu4(jM16653h7);
                    this.f27040n ^= m16372z(j2);
                    return;
                case 15:
                    jM16653h14 = (((long) com.google.common.primitives.kja0.m16653h(byteBuffer.get(14))) << 48) ^ 0;
                    jM16653h13 = jM16653h14 ^ (((long) com.google.common.primitives.kja0.m16653h(byteBuffer.get(13))) << 40);
                    jM16653h12 = jM16653h13 ^ (((long) com.google.common.primitives.kja0.m16653h(byteBuffer.get(12))) << 32);
                    jM16653h11 = jM16653h12 ^ (((long) com.google.common.primitives.kja0.m16653h(byteBuffer.get(11))) << 24);
                    jM16653h10 = jM16653h11 ^ (((long) com.google.common.primitives.kja0.m16653h(byteBuffer.get(10))) << 16);
                    jM16653h9 = jM16653h10 ^ (((long) com.google.common.primitives.kja0.m16653h(byteBuffer.get(9))) << 8);
                    jM16653h8 = jM16653h9 ^ ((long) com.google.common.primitives.kja0.m16653h(byteBuffer.get(8)));
                    jM16653h7 = byteBuffer.getLong() ^ 0;
                    j2 = jM16653h8;
                    this.f27041q ^= fu4(jM16653h7);
                    this.f27040n ^= m16372z(j2);
                    return;
                default:
                    throw new AssertionError("Should never get here.");
            }
        }

        @Override // com.google.common.hash.AbstractC4662g
        protected void t8r(ByteBuffer byteBuffer) {
            zurt(byteBuffer.getLong(), byteBuffer.getLong());
            this.f27039g += 16;
        }
    }

    wvg(int i2) {
        this.seed = i2;
    }

    @Override // com.google.common.hash.kja0
    public int bits() {
        return 128;
    }

    public boolean equals(@NullableDecl Object obj) {
        return (obj instanceof wvg) && this.seed == ((wvg) obj).seed;
    }

    public int hashCode() {
        return wvg.class.hashCode() ^ this.seed;
    }

    @Override // com.google.common.hash.kja0
    public InterfaceC4663h newHasher() {
        return new C4680k(this.seed);
    }

    public String toString() {
        return "Hashing.murmur3_128(" + this.seed + ")";
    }
}
