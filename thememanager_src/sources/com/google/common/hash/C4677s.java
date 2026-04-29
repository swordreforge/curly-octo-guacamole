package com.google.common.hash;

import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.util.zip.Checksum;

/* JADX INFO: renamed from: com.google.common.hash.s */
/* JADX INFO: compiled from: ChecksumHashFunction.java */
/* JADX INFO: loaded from: classes2.dex */
@Immutable
final class C4677s extends zy implements Serializable {
    private static final long serialVersionUID = 0;
    private final int bits;
    private final InterfaceC4664i<? extends Checksum> checksumSupplier;
    private final String toString;

    /* JADX INFO: renamed from: com.google.common.hash.s$toq */
    /* JADX INFO: compiled from: ChecksumHashFunction.java */
    private final class toq extends AbstractC4666k {

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final Checksum f68315toq;

        @Override // com.google.common.hash.AbstractC4666k
        protected void cdj(byte b2) {
            this.f68315toq.update(b2);
        }

        @Override // com.google.common.hash.AbstractC4666k
        /* JADX INFO: renamed from: i */
        protected void mo16347i(byte[] bArr, int i2, int i3) {
            this.f68315toq.update(bArr, i2, i3);
        }

        @Override // com.google.common.hash.InterfaceC4663h
        public n7h kja0() {
            long value = this.f68315toq.getValue();
            return C4677s.this.bits == 32 ? n7h.fromInt((int) value) : n7h.fromLong(value);
        }

        private toq(Checksum checksum) {
            this.f68315toq = (Checksum) com.google.common.base.jk.a9(checksum);
        }
    }

    C4677s(InterfaceC4664i<? extends Checksum> interfaceC4664i, int i2, String str) {
        this.checksumSupplier = (InterfaceC4664i) com.google.common.base.jk.a9(interfaceC4664i);
        com.google.common.base.jk.ld6(i2 == 32 || i2 == 64, "bits (%s) must be either 32 or 64", i2);
        this.bits = i2;
        this.toString = (String) com.google.common.base.jk.a9(str);
    }

    @Override // com.google.common.hash.kja0
    public int bits() {
        return this.bits;
    }

    @Override // com.google.common.hash.kja0
    public InterfaceC4663h newHasher() {
        return new toq(this.checksumSupplier.get());
    }

    public String toString() {
        return this.toString;
    }
}
