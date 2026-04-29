package com.google.common.hash;

import com.google.errorprone.annotations.Immutable;
import java.nio.ByteBuffer;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;

/* JADX INFO: renamed from: com.google.common.hash.z */
/* JADX INFO: compiled from: MacHashFunction.java */
/* JADX INFO: loaded from: classes2.dex */
@Immutable
final class C4682z extends zy {

    /* JADX INFO: renamed from: g */
    private final int f27044g;

    /* JADX INFO: renamed from: k */
    private final Mac f27045k;

    /* JADX INFO: renamed from: n */
    private final String f27046n;

    /* JADX INFO: renamed from: q */
    private final Key f27047q;

    /* JADX INFO: renamed from: y */
    private final boolean f27048y;

    /* JADX INFO: renamed from: com.google.common.hash.z$toq */
    /* JADX INFO: compiled from: MacHashFunction.java */
    private static final class toq extends AbstractC4666k {

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final Mac f68323toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private boolean f68324zy;

        private void fn3e() {
            com.google.common.base.jk.y9n(!this.f68324zy, "Cannot re-use a Hasher after calling hash() on it");
        }

        @Override // com.google.common.hash.AbstractC4666k
        protected void cdj(byte b2) {
            fn3e();
            this.f68323toq.update(b2);
        }

        @Override // com.google.common.hash.AbstractC4666k
        /* JADX INFO: renamed from: i */
        protected void mo16347i(byte[] bArr, int i2, int i3) {
            fn3e();
            this.f68323toq.update(bArr, i2, i3);
        }

        @Override // com.google.common.hash.AbstractC4666k
        protected void ki(ByteBuffer byteBuffer) {
            fn3e();
            com.google.common.base.jk.a9(byteBuffer);
            this.f68323toq.update(byteBuffer);
        }

        @Override // com.google.common.hash.InterfaceC4663h
        public n7h kja0() {
            fn3e();
            this.f68324zy = true;
            return n7h.fromBytesNoCopy(this.f68323toq.doFinal());
        }

        @Override // com.google.common.hash.AbstractC4666k
        protected void t8r(byte[] bArr) {
            fn3e();
            this.f68323toq.update(bArr);
        }

        private toq(Mac mac) {
            this.f68323toq = mac;
        }
    }

    C4682z(String str, Key key, String str2) {
        Mac macM16377k = m16377k(str, key);
        this.f27045k = macM16377k;
        this.f27047q = (Key) com.google.common.base.jk.a9(key);
        this.f27046n = (String) com.google.common.base.jk.a9(str2);
        this.f27044g = macM16377k.getMacLength() * 8;
        this.f27048y = toq(macM16377k);
    }

    /* JADX INFO: renamed from: k */
    private static Mac m16377k(String str, Key key) {
        try {
            Mac mac = Mac.getInstance(str);
            mac.init(key);
            return mac;
        } catch (InvalidKeyException e2) {
            throw new IllegalArgumentException(e2);
        } catch (NoSuchAlgorithmException e3) {
            throw new IllegalStateException(e3);
        }
    }

    private static boolean toq(Mac mac) {
        try {
            mac.clone();
            return true;
        } catch (CloneNotSupportedException unused) {
            return false;
        }
    }

    @Override // com.google.common.hash.kja0
    public int bits() {
        return this.f27044g;
    }

    @Override // com.google.common.hash.kja0
    public InterfaceC4663h newHasher() {
        if (this.f27048y) {
            try {
                return new toq((Mac) this.f27045k.clone());
            } catch (CloneNotSupportedException unused) {
            }
        }
        return new toq(m16377k(this.f27045k.getAlgorithm(), this.f27047q));
    }

    public String toString() {
        return this.f27046n;
    }
}
