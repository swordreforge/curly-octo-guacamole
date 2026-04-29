package com.google.common.hash;

import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.nio.ByteBuffer;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: SipHashFunction.java */
/* JADX INFO: loaded from: classes2.dex */
@Immutable
final class jk extends zy implements Serializable {
    static final kja0 SIP_HASH_24 = new jk(2, 4, 506097522914230528L, 1084818905618843912L);
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: c */
    private final int f27003c;

    /* JADX INFO: renamed from: d */
    private final int f27004d;
    private final long k0;
    private final long k1;

    /* JADX INFO: renamed from: com.google.common.hash.jk$k */
    /* JADX INFO: compiled from: SipHashFunction.java */
    private static final class C4665k extends AbstractC4662g {

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        private static final int f68307x2 = 8;

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private long f68308f7l8;

        /* JADX INFO: renamed from: g */
        private long f27005g;

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        private long f68309ld6;

        /* JADX INFO: renamed from: n */
        private final int f27006n;

        /* JADX INFO: renamed from: p */
        private long f27007p;

        /* JADX INFO: renamed from: q */
        private final int f27008q;

        /* JADX INFO: renamed from: s */
        private long f27009s;

        /* JADX INFO: renamed from: y */
        private long f27010y;

        C4665k(int i2, int i3, long j2, long j3) {
            super(8);
            this.f27007p = 0L;
            this.f68309ld6 = 0L;
            this.f27008q = i2;
            this.f27006n = i3;
            this.f27005g = 8317987319222330741L ^ j2;
            this.f68308f7l8 = 7237128888997146477L ^ j3;
            this.f27010y = 7816392313619706465L ^ j2;
            this.f27009s = 8387220255154660723L ^ j3;
        }

        private void ni7(int i2) {
            for (int i3 = 0; i3 < i2; i3++) {
                long j2 = this.f27005g;
                long j3 = this.f68308f7l8;
                this.f27005g = j2 + j3;
                this.f27010y += this.f27009s;
                this.f68308f7l8 = Long.rotateLeft(j3, 13);
                long jRotateLeft = Long.rotateLeft(this.f27009s, 16);
                long j4 = this.f68308f7l8;
                long j5 = this.f27005g;
                this.f68308f7l8 = j4 ^ j5;
                this.f27009s = jRotateLeft ^ this.f27010y;
                long jRotateLeft2 = Long.rotateLeft(j5, 32);
                long j6 = this.f27010y;
                long j7 = this.f68308f7l8;
                this.f27010y = j6 + j7;
                this.f27005g = jRotateLeft2 + this.f27009s;
                this.f68308f7l8 = Long.rotateLeft(j7, 17);
                long jRotateLeft3 = Long.rotateLeft(this.f27009s, 21);
                long j8 = this.f68308f7l8;
                long j9 = this.f27010y;
                this.f68308f7l8 = j8 ^ j9;
                this.f27009s = jRotateLeft3 ^ this.f27005g;
                this.f27010y = Long.rotateLeft(j9, 32);
            }
        }

        private void zurt(long j2) {
            this.f27009s ^= j2;
            ni7(this.f27008q);
            this.f27005g = j2 ^ this.f27005g;
        }

        @Override // com.google.common.hash.AbstractC4662g
        /* JADX INFO: renamed from: h */
        public n7h mo16338h() {
            long j2 = this.f68309ld6 ^ (this.f27007p << 56);
            this.f68309ld6 = j2;
            zurt(j2);
            this.f27010y ^= 255;
            ni7(this.f27006n);
            return n7h.fromLong(((this.f27005g ^ this.f68308f7l8) ^ this.f27010y) ^ this.f27009s);
        }

        @Override // com.google.common.hash.AbstractC4662g
        /* JADX INFO: renamed from: i */
        protected void mo16339i(ByteBuffer byteBuffer) {
            this.f27007p += (long) byteBuffer.remaining();
            int i2 = 0;
            while (byteBuffer.hasRemaining()) {
                this.f68309ld6 ^= (((long) byteBuffer.get()) & 255) << i2;
                i2 += 8;
            }
        }

        @Override // com.google.common.hash.AbstractC4662g
        protected void t8r(ByteBuffer byteBuffer) {
            this.f27007p += 8;
            zurt(byteBuffer.getLong());
        }
    }

    jk(int i2, int i3, long j2, long j3) {
        com.google.common.base.jk.ld6(i2 > 0, "The number of SipRound iterations (c=%s) during Compression must be positive.", i2);
        com.google.common.base.jk.ld6(i3 > 0, "The number of SipRound iterations (d=%s) during Finalization must be positive.", i3);
        this.f27003c = i2;
        this.f27004d = i3;
        this.k0 = j2;
        this.k1 = j3;
    }

    @Override // com.google.common.hash.kja0
    public int bits() {
        return 64;
    }

    public boolean equals(@NullableDecl Object obj) {
        if (!(obj instanceof jk)) {
            return false;
        }
        jk jkVar = (jk) obj;
        return this.f27003c == jkVar.f27003c && this.f27004d == jkVar.f27004d && this.k0 == jkVar.k0 && this.k1 == jkVar.k1;
    }

    public int hashCode() {
        return (int) ((((long) ((jk.class.hashCode() ^ this.f27003c) ^ this.f27004d)) ^ this.k0) ^ this.k1);
    }

    @Override // com.google.common.hash.kja0
    public InterfaceC4663h newHasher() {
        return new C4665k(this.f27003c, this.f27004d, this.k0, this.k1);
    }

    public String toString() {
        return "Hashing.sipHash" + this.f27003c + "" + this.f27004d + "(" + this.k0 + ", " + this.k1 + ")";
    }
}
