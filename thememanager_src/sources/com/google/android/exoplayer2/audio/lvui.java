package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.audio.InterfaceC3262p;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: FloatResamplingAudioProcessor.java */
/* JADX INFO: loaded from: classes2.dex */
final class lvui extends o1t {

    /* JADX INFO: renamed from: p */
    private static final double f19418p = 4.656612875245797E-10d;

    /* JADX INFO: renamed from: s */
    private static final int f19419s = Float.floatToIntBits(Float.NaN);

    lvui() {
    }

    private static void x2(int i2, ByteBuffer byteBuffer) {
        int iFloatToIntBits = Float.floatToIntBits((float) (((double) i2) * f19418p));
        if (iFloatToIntBits == f19419s) {
            iFloatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(iFloatToIntBits);
    }

    @Override // com.google.android.exoplayer2.audio.o1t
    public InterfaceC3262p.k f7l8(InterfaceC3262p.k kVar) throws InterfaceC3262p.toq {
        int i2 = kVar.f63499zy;
        if (com.google.android.exoplayer2.util.lrht.fnq8(i2)) {
            return i2 != 4 ? new InterfaceC3262p.k(kVar.f19444k, kVar.f63498toq, 4) : InterfaceC3262p.k.f19443n;
        }
        throw new InterfaceC3262p.toq(kVar);
    }

    @Override // com.google.android.exoplayer2.audio.InterfaceC3262p
    public void toq(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferLd6;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i2 = iLimit - iPosition;
        int i3 = this.f63496toq.f63499zy;
        if (i3 == 536870912) {
            byteBufferLd6 = ld6((i2 / 3) * 4);
            while (iPosition < iLimit) {
                x2(((byteBuffer.get(iPosition) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition + 2) & 255) << 24), byteBufferLd6);
                iPosition += 3;
            }
        } else {
            if (i3 != 805306368) {
                throw new IllegalStateException();
            }
            byteBufferLd6 = ld6(i2);
            while (iPosition < iLimit) {
                x2((byteBuffer.get(iPosition) & 255) | ((byteBuffer.get(iPosition + 1) & 255) << 8) | ((byteBuffer.get(iPosition + 2) & 255) << 16) | ((byteBuffer.get(iPosition + 3) & 255) << 24), byteBufferLd6);
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferLd6.flip();
    }
}
