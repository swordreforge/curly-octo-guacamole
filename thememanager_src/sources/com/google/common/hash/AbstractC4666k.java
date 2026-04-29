package com.google.common.hash;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: com.google.common.hash.k */
/* JADX INFO: compiled from: AbstractByteHasher.java */
/* JADX INFO: loaded from: classes2.dex */
@CanIgnoreReturnValue
abstract class AbstractC4666k extends AbstractC4672q {

    /* JADX INFO: renamed from: k */
    private final ByteBuffer f27011k = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);

    AbstractC4666k() {
    }

    /* JADX INFO: renamed from: h */
    private InterfaceC4663h m16346h(int i2) {
        try {
            mo16347i(this.f27011k.array(), 0, i2);
            return this;
        } finally {
            this.f27011k.clear();
        }
    }

    protected abstract void cdj(byte b2);

    /* JADX INFO: renamed from: i */
    protected void mo16347i(byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            cdj(bArr[i4]);
        }
    }

    protected void ki(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            mo16347i(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            byteBuffer.position(byteBuffer.limit());
        } else {
            for (int iRemaining = byteBuffer.remaining(); iRemaining > 0; iRemaining--) {
                cdj(byteBuffer.get());
            }
        }
    }

    protected void t8r(byte[] bArr) {
        mo16347i(bArr, 0, bArr.length);
    }

    @Override // com.google.common.hash.AbstractC4672q, com.google.common.hash.mcp
    public InterfaceC4663h f7l8(byte[] bArr) {
        com.google.common.base.jk.a9(bArr);
        t8r(bArr);
        return this;
    }

    @Override // com.google.common.hash.AbstractC4672q, com.google.common.hash.mcp
    /* JADX INFO: renamed from: g */
    public InterfaceC4663h mo16337g(long j2) {
        this.f27011k.putLong(j2);
        return m16346h(8);
    }

    @Override // com.google.common.hash.AbstractC4672q, com.google.common.hash.mcp
    public InterfaceC4663h ld6(byte[] bArr, int i2, int i3) {
        com.google.common.base.jk.ek5k(i2, i2 + i3, bArr.length);
        mo16347i(bArr, i2, i3);
        return this;
    }

    @Override // com.google.common.hash.AbstractC4672q, com.google.common.hash.mcp
    /* JADX INFO: renamed from: n */
    public InterfaceC4663h mo16340n(int i2) {
        this.f27011k.putInt(i2);
        return m16346h(4);
    }

    @Override // com.google.common.hash.mcp
    /* JADX INFO: renamed from: s */
    public InterfaceC4663h mo16341s(byte b2) {
        cdj(b2);
        return this;
    }

    @Override // com.google.common.hash.AbstractC4672q, com.google.common.hash.mcp
    public InterfaceC4663h x2(ByteBuffer byteBuffer) {
        ki(byteBuffer);
        return this;
    }

    @Override // com.google.common.hash.AbstractC4672q, com.google.common.hash.mcp
    /* JADX INFO: renamed from: y */
    public InterfaceC4663h mo16342y(char c2) {
        this.f27011k.putChar(c2);
        return m16346h(2);
    }

    @Override // com.google.common.hash.AbstractC4672q, com.google.common.hash.mcp
    public InterfaceC4663h zy(short s2) {
        this.f27011k.putShort(s2);
        return m16346h(2);
    }
}
