package com.google.common.hash;

import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* JADX INFO: compiled from: MessageDigestHashFunction.java */
/* JADX INFO: loaded from: classes2.dex */
@Immutable
final class o1t extends com.google.common.hash.zy implements Serializable {
    private final int bytes;
    private final MessageDigest prototype;
    private final boolean supportsClone;
    private final String toString;

    /* JADX INFO: compiled from: MessageDigestHashFunction.java */
    private static final class toq extends AbstractC4666k {

        /* JADX INFO: renamed from: q */
        private boolean f27020q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final MessageDigest f68311toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final int f68312zy;

        private void fn3e() {
            com.google.common.base.jk.y9n(!this.f27020q, "Cannot re-use a Hasher after calling hash() on it");
        }

        @Override // com.google.common.hash.AbstractC4666k
        protected void cdj(byte b2) {
            fn3e();
            this.f68311toq.update(b2);
        }

        @Override // com.google.common.hash.AbstractC4666k
        /* JADX INFO: renamed from: i */
        protected void mo16347i(byte[] bArr, int i2, int i3) {
            fn3e();
            this.f68311toq.update(bArr, i2, i3);
        }

        @Override // com.google.common.hash.AbstractC4666k
        protected void ki(ByteBuffer byteBuffer) {
            fn3e();
            this.f68311toq.update(byteBuffer);
        }

        @Override // com.google.common.hash.InterfaceC4663h
        public n7h kja0() {
            fn3e();
            this.f27020q = true;
            return this.f68312zy == this.f68311toq.getDigestLength() ? n7h.fromBytesNoCopy(this.f68311toq.digest()) : n7h.fromBytesNoCopy(Arrays.copyOf(this.f68311toq.digest(), this.f68312zy));
        }

        private toq(MessageDigest messageDigest, int i2) {
            this.f68311toq = messageDigest;
            this.f68312zy = i2;
        }
    }

    /* JADX INFO: compiled from: MessageDigestHashFunction.java */
    private static final class zy implements Serializable {
        private static final long serialVersionUID = 0;
        private final String algorithmName;
        private final int bytes;
        private final String toString;

        private Object readResolve() {
            return new o1t(this.algorithmName, this.bytes, this.toString);
        }

        private zy(String str, int i2, String str2) {
            this.algorithmName = str;
            this.bytes = i2;
            this.toString = str2;
        }
    }

    o1t(String str, String str2) {
        MessageDigest messageDigestM16360k = m16360k(str);
        this.prototype = messageDigestM16360k;
        this.bytes = messageDigestM16360k.getDigestLength();
        this.toString = (String) com.google.common.base.jk.a9(str2);
        this.supportsClone = toq(messageDigestM16360k);
    }

    /* JADX INFO: renamed from: k */
    private static MessageDigest m16360k(String str) {
        try {
            return MessageDigest.getInstance(str);
        } catch (NoSuchAlgorithmException e2) {
            throw new AssertionError(e2);
        }
    }

    private static boolean toq(MessageDigest messageDigest) {
        try {
            messageDigest.clone();
            return true;
        } catch (CloneNotSupportedException unused) {
            return false;
        }
    }

    @Override // com.google.common.hash.kja0
    public int bits() {
        return this.bytes * 8;
    }

    @Override // com.google.common.hash.kja0
    public InterfaceC4663h newHasher() {
        if (this.supportsClone) {
            try {
                return new toq((MessageDigest) this.prototype.clone(), this.bytes);
            } catch (CloneNotSupportedException unused) {
            }
        }
        return new toq(m16360k(this.prototype.getAlgorithm()), this.bytes);
    }

    public String toString() {
        return this.toString;
    }

    Object writeReplace() {
        return new zy(this.prototype.getAlgorithm(), this.bytes, this.toString);
    }

    o1t(String str, int i2, String str2) {
        this.toString = (String) com.google.common.base.jk.a9(str2);
        MessageDigest messageDigestM16360k = m16360k(str);
        this.prototype = messageDigestM16360k;
        int digestLength = messageDigestM16360k.getDigestLength();
        com.google.common.base.jk.qrj(i2 >= 4 && i2 <= digestLength, "bytes (%s) must be >= 4 and < %s", i2, digestLength);
        this.bytes = i2;
        this.supportsClone = toq(messageDigestM16360k);
    }
}
