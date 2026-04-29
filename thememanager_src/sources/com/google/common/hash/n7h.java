package com.google.common.hash;

import com.google.common.primitives.C4746s;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import wlev.InterfaceC7731k;

/* JADX INFO: compiled from: HashCode.java */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7731k
public abstract class n7h {

    /* JADX INFO: renamed from: k */
    private static final char[] f27018k = "0123456789abcdef".toCharArray();

    /* JADX INFO: renamed from: com.google.common.hash.n7h$k */
    /* JADX INFO: compiled from: HashCode.java */
    private static final class C4668k extends n7h implements Serializable {
        private static final long serialVersionUID = 0;
        final byte[] bytes;

        C4668k(byte[] bArr) {
            this.bytes = (byte[]) com.google.common.base.jk.a9(bArr);
        }

        @Override // com.google.common.hash.n7h
        public byte[] asBytes() {
            return (byte[]) this.bytes.clone();
        }

        @Override // com.google.common.hash.n7h
        public int asInt() {
            byte[] bArr = this.bytes;
            com.google.common.base.jk.zp(bArr.length >= 4, "HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", bArr.length);
            byte[] bArr2 = this.bytes;
            return ((bArr2[3] & 255) << 24) | (bArr2[0] & 255) | ((bArr2[1] & 255) << 8) | ((bArr2[2] & 255) << 16);
        }

        @Override // com.google.common.hash.n7h
        public long asLong() {
            byte[] bArr = this.bytes;
            com.google.common.base.jk.zp(bArr.length >= 8, "HashCode#asLong() requires >= 8 bytes (it only has %s bytes).", bArr.length);
            return padToLong();
        }

        @Override // com.google.common.hash.n7h
        public int bits() {
            return this.bytes.length * 8;
        }

        @Override // com.google.common.hash.n7h
        boolean equalsSameBits(n7h n7hVar) {
            if (this.bytes.length != n7hVar.getBytesInternal().length) {
                return false;
            }
            boolean z2 = true;
            int i2 = 0;
            while (true) {
                byte[] bArr = this.bytes;
                if (i2 >= bArr.length) {
                    return z2;
                }
                z2 &= bArr[i2] == n7hVar.getBytesInternal()[i2];
                i2++;
            }
        }

        @Override // com.google.common.hash.n7h
        byte[] getBytesInternal() {
            return this.bytes;
        }

        @Override // com.google.common.hash.n7h
        public long padToLong() {
            long j2 = this.bytes[0] & 255;
            for (int i2 = 1; i2 < Math.min(this.bytes.length, 8); i2++) {
                j2 |= (((long) this.bytes[i2]) & 255) << (i2 * 8);
            }
            return j2;
        }

        @Override // com.google.common.hash.n7h
        void writeBytesToImpl(byte[] bArr, int i2, int i3) {
            System.arraycopy(this.bytes, 0, bArr, i2, i3);
        }
    }

    /* JADX INFO: compiled from: HashCode.java */
    private static final class toq extends n7h implements Serializable {
        private static final long serialVersionUID = 0;
        final int hash;

        toq(int i2) {
            this.hash = i2;
        }

        @Override // com.google.common.hash.n7h
        public byte[] asBytes() {
            int i2 = this.hash;
            return new byte[]{(byte) i2, (byte) (i2 >> 8), (byte) (i2 >> 16), (byte) (i2 >> 24)};
        }

        @Override // com.google.common.hash.n7h
        public int asInt() {
            return this.hash;
        }

        @Override // com.google.common.hash.n7h
        public long asLong() {
            throw new IllegalStateException("this HashCode only has 32 bits; cannot create a long");
        }

        @Override // com.google.common.hash.n7h
        public int bits() {
            return 32;
        }

        @Override // com.google.common.hash.n7h
        boolean equalsSameBits(n7h n7hVar) {
            return this.hash == n7hVar.asInt();
        }

        @Override // com.google.common.hash.n7h
        public long padToLong() {
            return com.google.common.primitives.cdj.ki(this.hash);
        }

        @Override // com.google.common.hash.n7h
        void writeBytesToImpl(byte[] bArr, int i2, int i3) {
            for (int i4 = 0; i4 < i3; i4++) {
                bArr[i2 + i4] = (byte) (this.hash >> (i4 * 8));
            }
        }
    }

    /* JADX INFO: compiled from: HashCode.java */
    private static final class zy extends n7h implements Serializable {
        private static final long serialVersionUID = 0;
        final long hash;

        zy(long j2) {
            this.hash = j2;
        }

        @Override // com.google.common.hash.n7h
        public byte[] asBytes() {
            return new byte[]{(byte) this.hash, (byte) (r2 >> 8), (byte) (r2 >> 16), (byte) (r2 >> 24), (byte) (r2 >> 32), (byte) (r2 >> 40), (byte) (r2 >> 48), (byte) (r2 >> 56)};
        }

        @Override // com.google.common.hash.n7h
        public int asInt() {
            return (int) this.hash;
        }

        @Override // com.google.common.hash.n7h
        public long asLong() {
            return this.hash;
        }

        @Override // com.google.common.hash.n7h
        public int bits() {
            return 64;
        }

        @Override // com.google.common.hash.n7h
        boolean equalsSameBits(n7h n7hVar) {
            return this.hash == n7hVar.asLong();
        }

        @Override // com.google.common.hash.n7h
        public long padToLong() {
            return this.hash;
        }

        @Override // com.google.common.hash.n7h
        void writeBytesToImpl(byte[] bArr, int i2, int i3) {
            for (int i4 = 0; i4 < i3; i4++) {
                bArr[i2 + i4] = (byte) (this.hash >> (i4 * 8));
            }
        }
    }

    n7h() {
    }

    public static n7h fromBytes(byte[] bArr) {
        com.google.common.base.jk.m15380n(bArr.length >= 1, "A HashCode must contain at least 1 byte.");
        return fromBytesNoCopy((byte[]) bArr.clone());
    }

    static n7h fromBytesNoCopy(byte[] bArr) {
        return new C4668k(bArr);
    }

    public static n7h fromInt(int i2) {
        return new toq(i2);
    }

    public static n7h fromLong(long j2) {
        return new zy(j2);
    }

    public static n7h fromString(String str) {
        com.google.common.base.jk.fn3e(str.length() >= 2, "input string (%s) must have at least 2 characters", str);
        com.google.common.base.jk.fn3e(str.length() % 2 == 0, "input string (%s) must have an even number of characters", str);
        byte[] bArr = new byte[str.length() / 2];
        for (int i2 = 0; i2 < str.length(); i2 += 2) {
            bArr[i2 / 2] = (byte) ((m16356k(str.charAt(i2)) << 4) + m16356k(str.charAt(i2 + 1)));
        }
        return fromBytesNoCopy(bArr);
    }

    /* JADX INFO: renamed from: k */
    private static int m16356k(char c2) {
        if (c2 >= '0' && c2 <= '9') {
            return c2 - '0';
        }
        if (c2 >= 'a' && c2 <= 'f') {
            return (c2 - 'a') + 10;
        }
        throw new IllegalArgumentException("Illegal hexadecimal character: " + c2);
    }

    public abstract byte[] asBytes();

    public abstract int asInt();

    public abstract long asLong();

    public abstract int bits();

    public final boolean equals(@NullableDecl Object obj) {
        if (!(obj instanceof n7h)) {
            return false;
        }
        n7h n7hVar = (n7h) obj;
        return bits() == n7hVar.bits() && equalsSameBits(n7hVar);
    }

    abstract boolean equalsSameBits(n7h n7hVar);

    byte[] getBytesInternal() {
        return asBytes();
    }

    public final int hashCode() {
        if (bits() >= 32) {
            return asInt();
        }
        byte[] bytesInternal = getBytesInternal();
        int i2 = bytesInternal[0] & 255;
        for (int i3 = 1; i3 < bytesInternal.length; i3++) {
            i2 |= (bytesInternal[i3] & 255) << (i3 * 8);
        }
        return i2;
    }

    public abstract long padToLong();

    public final String toString() {
        byte[] bytesInternal = getBytesInternal();
        StringBuilder sb = new StringBuilder(bytesInternal.length * 2);
        for (byte b2 : bytesInternal) {
            char[] cArr = f27018k;
            sb.append(cArr[(b2 >> 4) & 15]);
            sb.append(cArr[b2 & com.google.common.base.zy.f68111cdj]);
        }
        return sb.toString();
    }

    @CanIgnoreReturnValue
    public int writeBytesTo(byte[] bArr, int i2, int i3) {
        int iFn3e = C4746s.fn3e(i3, bits() / 8);
        com.google.common.base.jk.ek5k(i2, i2 + iFn3e, bArr.length);
        writeBytesToImpl(bArr, i2, iFn3e);
        return iFn3e;
    }

    abstract void writeBytesToImpl(byte[] bArr, int i2, int i3);
}
