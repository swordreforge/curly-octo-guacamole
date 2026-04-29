package com.google.common.hash;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: com.google.common.hash.q */
/* JADX INFO: compiled from: AbstractHasher.java */
/* JADX INFO: loaded from: classes2.dex */
@CanIgnoreReturnValue
abstract class AbstractC4672q implements InterfaceC4663h {
    AbstractC4672q() {
    }

    @Override // com.google.common.hash.InterfaceC4663h
    public <T> InterfaceC4663h n7h(T t2, x2<? super T> x2Var) {
        x2Var.funnel(t2, this);
        return this;
    }

    @Override // com.google.common.hash.mcp
    public InterfaceC4663h f7l8(byte[] bArr) {
        return ld6(bArr, 0, bArr.length);
    }

    @Override // com.google.common.hash.mcp
    /* JADX INFO: renamed from: g */
    public InterfaceC4663h mo16337g(long j2) {
        for (int i2 = 0; i2 < 64; i2 += 8) {
            mo16341s((byte) (j2 >>> i2));
        }
        return this;
    }

    @Override // com.google.common.hash.mcp
    /* JADX INFO: renamed from: k */
    public final InterfaceC4663h mo16343k(double d2) {
        return mo16337g(Double.doubleToRawLongBits(d2));
    }

    @Override // com.google.common.hash.mcp
    public InterfaceC4663h ld6(byte[] bArr, int i2, int i3) {
        com.google.common.base.jk.ek5k(i2, i2 + i3, bArr.length);
        for (int i4 = 0; i4 < i3; i4++) {
            mo16341s(bArr[i2 + i4]);
        }
        return this;
    }

    @Override // com.google.common.hash.mcp
    /* JADX INFO: renamed from: n */
    public InterfaceC4663h mo16340n(int i2) {
        mo16341s((byte) i2);
        mo16341s((byte) (i2 >>> 8));
        mo16341s((byte) (i2 >>> 16));
        mo16341s((byte) (i2 >>> 24));
        return this;
    }

    @Override // com.google.common.hash.mcp
    /* JADX INFO: renamed from: p */
    public InterfaceC4663h mo16344p(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i2 = 0; i2 < length; i2++) {
            mo16342y(charSequence.charAt(i2));
        }
        return this;
    }

    @Override // com.google.common.hash.mcp
    /* JADX INFO: renamed from: q */
    public final InterfaceC4663h mo16345q(boolean z2) {
        return mo16341s(z2 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.common.hash.mcp
    public InterfaceC4663h qrj(CharSequence charSequence, Charset charset) {
        return f7l8(charSequence.toString().getBytes(charset));
    }

    @Override // com.google.common.hash.mcp
    public final InterfaceC4663h toq(float f2) {
        return mo16340n(Float.floatToRawIntBits(f2));
    }

    @Override // com.google.common.hash.mcp
    public InterfaceC4663h x2(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            ld6(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            byteBuffer.position(byteBuffer.limit());
        } else {
            for (int iRemaining = byteBuffer.remaining(); iRemaining > 0; iRemaining--) {
                mo16341s(byteBuffer.get());
            }
        }
        return this;
    }

    @Override // com.google.common.hash.mcp
    /* JADX INFO: renamed from: y */
    public InterfaceC4663h mo16342y(char c2) {
        mo16341s((byte) c2);
        mo16341s((byte) (c2 >>> '\b'));
        return this;
    }

    @Override // com.google.common.hash.mcp
    public InterfaceC4663h zy(short s2) {
        mo16341s((byte) s2);
        mo16341s((byte) (s2 >>> 8));
        return this;
    }
}
