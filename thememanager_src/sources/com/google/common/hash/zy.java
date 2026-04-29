package com.google.common.hash;

import com.google.errorprone.annotations.Immutable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: AbstractHashFunction.java */
/* JADX INFO: loaded from: classes2.dex */
@Immutable
abstract class zy implements kja0 {
    zy() {
    }

    @Override // com.google.common.hash.kja0
    public n7h hashBytes(byte[] bArr) {
        return hashBytes(bArr, 0, bArr.length);
    }

    @Override // com.google.common.hash.kja0
    public n7h hashInt(int i2) {
        return newHasher(4).mo16340n(i2).kja0();
    }

    @Override // com.google.common.hash.kja0
    public n7h hashLong(long j2) {
        return newHasher(8).mo16337g(j2).kja0();
    }

    @Override // com.google.common.hash.kja0
    public <T> n7h hashObject(T t2, x2<? super T> x2Var) {
        return newHasher().n7h(t2, x2Var).kja0();
    }

    @Override // com.google.common.hash.kja0
    public n7h hashString(CharSequence charSequence, Charset charset) {
        return newHasher().qrj(charSequence, charset).kja0();
    }

    @Override // com.google.common.hash.kja0
    public n7h hashUnencodedChars(CharSequence charSequence) {
        return newHasher(charSequence.length() * 2).mo16344p(charSequence).kja0();
    }

    @Override // com.google.common.hash.kja0
    public InterfaceC4663h newHasher(int i2) {
        com.google.common.base.jk.ld6(i2 >= 0, "expectedInputSize must be >= 0 but was %s", i2);
        return newHasher();
    }

    @Override // com.google.common.hash.kja0
    public n7h hashBytes(byte[] bArr, int i2, int i3) {
        com.google.common.base.jk.ek5k(i2, i2 + i3, bArr.length);
        return newHasher(i3).ld6(bArr, i2, i3).kja0();
    }

    @Override // com.google.common.hash.kja0
    public n7h hashBytes(ByteBuffer byteBuffer) {
        return newHasher(byteBuffer.remaining()).x2(byteBuffer).kja0();
    }
}
