package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.audio.InterfaceC3262p;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: TrimmingAudioProcessor.java */
/* JADX INFO: loaded from: classes2.dex */
final class lrht extends o1t {

    /* JADX INFO: renamed from: h */
    private static final int f19415h = 2;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private long f63465kja0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private boolean f63466ld6;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private int f63467n7h;

    /* JADX INFO: renamed from: p */
    private int f19416p;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private byte[] f63468qrj = com.google.android.exoplayer2.util.lrht.f23228g;

    /* JADX INFO: renamed from: s */
    private int f19417s;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private int f63469x2;

    @Override // com.google.android.exoplayer2.audio.o1t
    public InterfaceC3262p.k f7l8(InterfaceC3262p.k kVar) throws InterfaceC3262p.toq {
        if (kVar.f63499zy != 2) {
            throw new InterfaceC3262p.toq(kVar);
        }
        this.f63466ld6 = true;
        return (this.f19417s == 0 && this.f19416p == 0) ? InterfaceC3262p.k.f19443n : kVar;
    }

    @Override // com.google.android.exoplayer2.audio.o1t, com.google.android.exoplayer2.audio.InterfaceC3262p
    /* JADX INFO: renamed from: k */
    public ByteBuffer mo11407k() {
        int i2;
        if (super.zy() && (i2 = this.f63467n7h) > 0) {
            ld6(i2).put(this.f63468qrj, 0, this.f63467n7h).flip();
            this.f63467n7h = 0;
        }
        return super.mo11407k();
    }

    public void n7h(int i2, int i3) {
        this.f19417s = i2;
        this.f19416p = i3;
    }

    @Override // com.google.android.exoplayer2.audio.o1t
    /* JADX INFO: renamed from: p */
    protected void mo11387p() {
        this.f63468qrj = com.google.android.exoplayer2.util.lrht.f23228g;
    }

    public void qrj() {
        this.f63465kja0 = 0L;
    }

    @Override // com.google.android.exoplayer2.audio.o1t
    /* JADX INFO: renamed from: s */
    protected void mo11388s() {
        if (this.f63466ld6) {
            int i2 = this.f63467n7h;
            if (i2 > 0) {
                this.f63465kja0 += (long) (i2 / this.f63496toq.f19445q);
            }
            this.f63467n7h = 0;
        }
    }

    @Override // com.google.android.exoplayer2.audio.InterfaceC3262p
    public void toq(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i2 = iLimit - iPosition;
        if (i2 == 0) {
            return;
        }
        int iMin = Math.min(i2, this.f63469x2);
        this.f63465kja0 += (long) (iMin / this.f63496toq.f19445q);
        this.f63469x2 -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.f63469x2 > 0) {
            return;
        }
        int i3 = i2 - iMin;
        int length = (this.f63467n7h + i3) - this.f63468qrj.length;
        ByteBuffer byteBufferLd6 = ld6(length);
        int iT8r = com.google.android.exoplayer2.util.lrht.t8r(length, 0, this.f63467n7h);
        byteBufferLd6.put(this.f63468qrj, 0, iT8r);
        int iT8r2 = com.google.android.exoplayer2.util.lrht.t8r(length - iT8r, 0, i3);
        byteBuffer.limit(byteBuffer.position() + iT8r2);
        byteBufferLd6.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i4 = i3 - iT8r2;
        int i5 = this.f63467n7h - iT8r;
        this.f63467n7h = i5;
        byte[] bArr = this.f63468qrj;
        System.arraycopy(bArr, iT8r, bArr, 0, i5);
        byteBuffer.get(this.f63468qrj, this.f63467n7h, i4);
        this.f63467n7h += i4;
        byteBufferLd6.flip();
    }

    public long x2() {
        return this.f63465kja0;
    }

    @Override // com.google.android.exoplayer2.audio.o1t
    /* JADX INFO: renamed from: y */
    protected void mo11389y() {
        if (this.f63466ld6) {
            this.f63466ld6 = false;
            int i2 = this.f19416p;
            int i3 = this.f63496toq.f19445q;
            this.f63468qrj = new byte[i2 * i3];
            this.f63469x2 = this.f19417s * i3;
        }
        this.f63467n7h = 0;
    }

    @Override // com.google.android.exoplayer2.audio.o1t, com.google.android.exoplayer2.audio.InterfaceC3262p
    public boolean zy() {
        return super.zy() && this.f63467n7h == 0;
    }
}
