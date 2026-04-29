package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.audio.InterfaceC3262p;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.google.android.exoplayer2.audio.l */
/* JADX INFO: compiled from: ResamplingAudioProcessor.java */
/* JADX INFO: loaded from: classes2.dex */
final class C3259l extends o1t {
    C3259l() {
    }

    @Override // com.google.android.exoplayer2.audio.o1t
    public InterfaceC3262p.k f7l8(InterfaceC3262p.k kVar) throws InterfaceC3262p.toq {
        int i2 = kVar.f63499zy;
        if (i2 == 3 || i2 == 2 || i2 == 268435456 || i2 == 536870912 || i2 == 805306368 || i2 == 4) {
            return i2 != 2 ? new InterfaceC3262p.k(kVar.f19444k, kVar.f63498toq, 2) : InterfaceC3262p.k.f19443n;
        }
        throw new InterfaceC3262p.toq(kVar);
    }

    @Override // com.google.android.exoplayer2.audio.InterfaceC3262p
    public void toq(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i2 = iLimit - iPosition;
        int i3 = this.f63496toq.f63499zy;
        if (i3 == 3) {
            i2 *= 2;
        } else if (i3 == 4) {
            i2 /= 2;
        } else if (i3 != 268435456) {
            if (i3 != 536870912) {
                if (i3 != 805306368) {
                    throw new IllegalStateException();
                }
                i2 /= 2;
            } else {
                i2 /= 3;
                i2 *= 2;
            }
        }
        ByteBuffer byteBufferLd6 = ld6(i2);
        int i4 = this.f63496toq.f63499zy;
        if (i4 == 3) {
            while (iPosition < iLimit) {
                byteBufferLd6.put((byte) 0);
                byteBufferLd6.put((byte) ((byteBuffer.get(iPosition) & 255) - 128));
                iPosition++;
            }
        } else if (i4 == 4) {
            while (iPosition < iLimit) {
                short sKi = (short) (com.google.android.exoplayer2.util.lrht.ki(byteBuffer.getFloat(iPosition), -1.0f, 1.0f) * 32767.0f);
                byteBufferLd6.put((byte) (sKi & 255));
                byteBufferLd6.put((byte) ((sKi >> 8) & 255));
                iPosition += 4;
            }
        } else if (i4 == 268435456) {
            while (iPosition < iLimit) {
                byteBufferLd6.put(byteBuffer.get(iPosition + 1));
                byteBufferLd6.put(byteBuffer.get(iPosition));
                iPosition += 2;
            }
        } else if (i4 == 536870912) {
            while (iPosition < iLimit) {
                byteBufferLd6.put(byteBuffer.get(iPosition + 1));
                byteBufferLd6.put(byteBuffer.get(iPosition + 2));
                iPosition += 3;
            }
        } else {
            if (i4 != 805306368) {
                throw new IllegalStateException();
            }
            while (iPosition < iLimit) {
                byteBufferLd6.put(byteBuffer.get(iPosition + 2));
                byteBufferLd6.put(byteBuffer.get(iPosition + 3));
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferLd6.flip();
    }
}
