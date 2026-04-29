package com.google.common.hash;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: com.google.common.hash.g */
/* JADX INFO: compiled from: AbstractStreamingHasher.java */
/* JADX INFO: loaded from: classes2.dex */
@CanIgnoreReturnValue
abstract class AbstractC4662g extends AbstractC4672q {

    /* JADX INFO: renamed from: k */
    private final ByteBuffer f27002k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final int f68305toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final int f68306zy;

    protected AbstractC4662g(int i2) {
        this(i2, i2);
    }

    private void cdj() {
        this.f27002k.flip();
        while (this.f27002k.remaining() >= this.f68306zy) {
            t8r(this.f27002k);
        }
        this.f27002k.compact();
    }

    private InterfaceC4663h fn3e(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() <= this.f27002k.remaining()) {
            this.f27002k.put(byteBuffer);
            ki();
            return this;
        }
        int iPosition = this.f68305toq - this.f27002k.position();
        for (int i2 = 0; i2 < iPosition; i2++) {
            this.f27002k.put(byteBuffer.get());
        }
        cdj();
        while (byteBuffer.remaining() >= this.f68306zy) {
            t8r(byteBuffer);
        }
        this.f27002k.put(byteBuffer);
        return this;
    }

    private void ki() {
        if (this.f27002k.remaining() < 8) {
            cdj();
        }
    }

    /* JADX INFO: renamed from: h */
    protected abstract n7h mo16338h();

    /* JADX INFO: renamed from: i */
    protected void mo16339i(ByteBuffer byteBuffer) {
        byteBuffer.position(byteBuffer.limit());
        byteBuffer.limit(this.f68306zy + 7);
        while (true) {
            int iPosition = byteBuffer.position();
            int i2 = this.f68306zy;
            if (iPosition >= i2) {
                byteBuffer.limit(i2);
                byteBuffer.flip();
                t8r(byteBuffer);
                return;
            }
            byteBuffer.putLong(0L);
        }
    }

    @Override // com.google.common.hash.InterfaceC4663h
    public final n7h kja0() {
        cdj();
        this.f27002k.flip();
        if (this.f27002k.remaining() > 0) {
            mo16339i(this.f27002k);
            ByteBuffer byteBuffer = this.f27002k;
            byteBuffer.position(byteBuffer.limit());
        }
        return mo16338h();
    }

    protected abstract void t8r(ByteBuffer byteBuffer);

    protected AbstractC4662g(int i2, int i3) {
        com.google.common.base.jk.m15383q(i3 % i2 == 0);
        this.f27002k = ByteBuffer.allocate(i3 + 7).order(ByteOrder.LITTLE_ENDIAN);
        this.f68305toq = i3;
        this.f68306zy = i2;
    }

    @Override // com.google.common.hash.AbstractC4672q, com.google.common.hash.mcp
    /* JADX INFO: renamed from: g */
    public final InterfaceC4663h mo16337g(long j2) {
        this.f27002k.putLong(j2);
        ki();
        return this;
    }

    @Override // com.google.common.hash.AbstractC4672q, com.google.common.hash.mcp
    public final InterfaceC4663h ld6(byte[] bArr, int i2, int i3) {
        return fn3e(ByteBuffer.wrap(bArr, i2, i3).order(ByteOrder.LITTLE_ENDIAN));
    }

    @Override // com.google.common.hash.AbstractC4672q, com.google.common.hash.mcp
    /* JADX INFO: renamed from: n */
    public final InterfaceC4663h mo16340n(int i2) {
        this.f27002k.putInt(i2);
        ki();
        return this;
    }

    @Override // com.google.common.hash.mcp
    /* JADX INFO: renamed from: s */
    public final InterfaceC4663h mo16341s(byte b2) {
        this.f27002k.put(b2);
        ki();
        return this;
    }

    @Override // com.google.common.hash.AbstractC4672q, com.google.common.hash.mcp
    public final InterfaceC4663h x2(ByteBuffer byteBuffer) {
        ByteOrder byteOrderOrder = byteBuffer.order();
        try {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            return fn3e(byteBuffer);
        } finally {
            byteBuffer.order(byteOrderOrder);
        }
    }

    @Override // com.google.common.hash.AbstractC4672q, com.google.common.hash.mcp
    /* JADX INFO: renamed from: y */
    public final InterfaceC4663h mo16342y(char c2) {
        this.f27002k.putChar(c2);
        ki();
        return this;
    }

    @Override // com.google.common.hash.AbstractC4672q, com.google.common.hash.mcp
    public final InterfaceC4663h zy(short s2) {
        this.f27002k.putShort(s2);
        ki();
        return this;
    }
}
