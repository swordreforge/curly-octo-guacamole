package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.audio.InterfaceC3262p;
import com.google.android.exoplayer2.util.C3844k;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: ChannelMappingAudioProcessor.java */
/* JADX INFO: loaded from: classes2.dex */
final class wvg extends o1t {

    /* JADX INFO: renamed from: p */
    @zy.dd
    private int[] f19493p;

    /* JADX INFO: renamed from: s */
    @zy.dd
    private int[] f19494s;

    wvg() {
    }

    @Override // com.google.android.exoplayer2.audio.o1t
    public InterfaceC3262p.k f7l8(InterfaceC3262p.k kVar) throws InterfaceC3262p.toq {
        int[] iArr = this.f19494s;
        if (iArr == null) {
            return InterfaceC3262p.k.f19443n;
        }
        if (kVar.f63499zy != 2) {
            throw new InterfaceC3262p.toq(kVar);
        }
        boolean z2 = kVar.f63498toq != iArr.length;
        int i2 = 0;
        while (i2 < iArr.length) {
            int i3 = iArr[i2];
            if (i3 >= kVar.f63498toq) {
                throw new InterfaceC3262p.toq(kVar);
            }
            z2 |= i3 != i2;
            i2++;
        }
        return z2 ? new InterfaceC3262p.k(kVar.f19444k, iArr.length, 2) : InterfaceC3262p.k.f19443n;
    }

    @Override // com.google.android.exoplayer2.audio.o1t
    /* JADX INFO: renamed from: p */
    protected void mo11387p() {
        this.f19493p = null;
        this.f19494s = null;
    }

    @Override // com.google.android.exoplayer2.audio.InterfaceC3262p
    public void toq(ByteBuffer byteBuffer) {
        int[] iArr = (int[]) C3844k.f7l8(this.f19493p);
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferLd6 = ld6(((iLimit - iPosition) / this.f63496toq.f19445q) * this.f63497zy.f19445q);
        while (iPosition < iLimit) {
            for (int i2 : iArr) {
                byteBufferLd6.putShort(byteBuffer.getShort((i2 * 2) + iPosition));
            }
            iPosition += this.f63496toq.f19445q;
        }
        byteBuffer.position(iLimit);
        byteBufferLd6.flip();
    }

    public void x2(@zy.dd int[] iArr) {
        this.f19494s = iArr;
    }

    @Override // com.google.android.exoplayer2.audio.o1t
    /* JADX INFO: renamed from: y */
    protected void mo11389y() {
        this.f19493p = this.f19494s;
    }
}
