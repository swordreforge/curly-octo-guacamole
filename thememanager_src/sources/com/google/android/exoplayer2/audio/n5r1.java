package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.audio.InterfaceC3262p;
import com.google.android.exoplayer2.util.C3844k;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: SilenceSkippingAudioProcessor.java */
/* JADX INFO: loaded from: classes2.dex */
public final class n5r1 extends o1t {

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    public static final long f63470fn3e = 150000;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    private static final int f63471fu4 = 0;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    public static final short f63472ni7 = 1024;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    private static final int f63473o1t = 2;

    /* JADX INFO: renamed from: z */
    private static final int f19420z = 1;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    public static final long f63474zurt = 20000;

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private int f63475cdj;

    /* JADX INFO: renamed from: h */
    private int f19421h;

    /* JADX INFO: renamed from: i */
    private long f19422i;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private int f63476ki;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private byte[] f63477kja0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private final short f63478ld6;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private byte[] f63479n7h;

    /* JADX INFO: renamed from: p */
    private final long f19423p;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private boolean f63480qrj;

    /* JADX INFO: renamed from: s */
    private final long f19424s;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private boolean f63481t8r;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private int f63482x2;

    public n5r1() {
        this(f63470fn3e, f63474zurt, f63472ni7);
    }

    private void cdj(byte[] bArr, int i2) {
        ld6(i2).put(bArr, 0, i2).flip();
        if (i2 > 0) {
            this.f63481t8r = true;
        }
    }

    /* JADX INFO: renamed from: h */
    private void m11493h(ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        ld6(iRemaining).put(byteBuffer).flip();
        if (iRemaining > 0) {
            this.f63481t8r = true;
        }
    }

    /* JADX INFO: renamed from: i */
    private void m11494i(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        int iN7h = n7h(byteBuffer);
        byteBuffer.limit(iN7h);
        this.f19422i += (long) (byteBuffer.remaining() / this.f63482x2);
        zurt(byteBuffer, this.f63477kja0, this.f63476ki);
        if (iN7h < iLimit) {
            cdj(this.f63477kja0, this.f63476ki);
            this.f19421h = 0;
            byteBuffer.limit(iLimit);
        }
    }

    private void ki(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        int iN7h = n7h(byteBuffer);
        int iPosition = iN7h - byteBuffer.position();
        byte[] bArr = this.f63479n7h;
        int length = bArr.length;
        int i2 = this.f63475cdj;
        int i3 = length - i2;
        if (iN7h < iLimit && iPosition < i3) {
            cdj(bArr, i2);
            this.f63475cdj = 0;
            this.f19421h = 0;
            return;
        }
        int iMin = Math.min(iPosition, i3);
        byteBuffer.limit(byteBuffer.position() + iMin);
        byteBuffer.get(this.f63479n7h, this.f63475cdj, iMin);
        int i4 = this.f63475cdj + iMin;
        this.f63475cdj = i4;
        byte[] bArr2 = this.f63479n7h;
        if (i4 == bArr2.length) {
            if (this.f63481t8r) {
                cdj(bArr2, this.f63476ki);
                this.f19422i += (long) ((this.f63475cdj - (this.f63476ki * 2)) / this.f63482x2);
            } else {
                this.f19422i += (long) ((i4 - this.f63476ki) / this.f63482x2);
            }
            zurt(byteBuffer, this.f63479n7h, this.f63475cdj);
            this.f63475cdj = 0;
            this.f19421h = 2;
        }
        byteBuffer.limit(iLimit);
    }

    private int n7h(ByteBuffer byteBuffer) {
        for (int iPosition = byteBuffer.position(); iPosition < byteBuffer.limit(); iPosition += 2) {
            if (Math.abs((int) byteBuffer.getShort(iPosition)) > this.f63478ld6) {
                int i2 = this.f63482x2;
                return i2 * (iPosition / i2);
            }
        }
        return byteBuffer.limit();
    }

    private int qrj(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        do {
            iLimit -= 2;
            if (iLimit < byteBuffer.position()) {
                return byteBuffer.position();
            }
        } while (Math.abs((int) byteBuffer.getShort(iLimit)) <= this.f63478ld6);
        int i2 = this.f63482x2;
        return ((iLimit / i2) * i2) + i2;
    }

    private void t8r(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        byteBuffer.limit(Math.min(iLimit, byteBuffer.position() + this.f63479n7h.length));
        int iQrj = qrj(byteBuffer);
        if (iQrj == byteBuffer.position()) {
            this.f19421h = 1;
        } else {
            byteBuffer.limit(iQrj);
            m11493h(byteBuffer);
        }
        byteBuffer.limit(iLimit);
    }

    private int x2(long j2) {
        return (int) ((j2 * ((long) this.f63496toq.f19444k)) / 1000000);
    }

    private void zurt(ByteBuffer byteBuffer, byte[] bArr, int i2) {
        int iMin = Math.min(byteBuffer.remaining(), this.f63476ki);
        int i3 = this.f63476ki - iMin;
        System.arraycopy(bArr, i2 - i3, this.f63477kja0, 0, i3);
        byteBuffer.position(byteBuffer.limit() - iMin);
        byteBuffer.get(this.f63477kja0, i3, iMin);
    }

    @Override // com.google.android.exoplayer2.audio.o1t
    public InterfaceC3262p.k f7l8(InterfaceC3262p.k kVar) throws InterfaceC3262p.toq {
        if (kVar.f63499zy == 2) {
            return this.f63480qrj ? kVar : InterfaceC3262p.k.f19443n;
        }
        throw new InterfaceC3262p.toq(kVar);
    }

    public void fn3e(boolean z2) {
        this.f63480qrj = z2;
    }

    @Override // com.google.android.exoplayer2.audio.o1t, com.google.android.exoplayer2.audio.InterfaceC3262p
    public boolean isActive() {
        return this.f63480qrj;
    }

    public long kja0() {
        return this.f19422i;
    }

    @Override // com.google.android.exoplayer2.audio.o1t
    /* JADX INFO: renamed from: p */
    protected void mo11387p() {
        this.f63480qrj = false;
        this.f63476ki = 0;
        byte[] bArr = com.google.android.exoplayer2.util.lrht.f23228g;
        this.f63479n7h = bArr;
        this.f63477kja0 = bArr;
    }

    @Override // com.google.android.exoplayer2.audio.o1t
    /* JADX INFO: renamed from: s */
    protected void mo11388s() {
        int i2 = this.f63475cdj;
        if (i2 > 0) {
            cdj(this.f63479n7h, i2);
        }
        if (this.f63481t8r) {
            return;
        }
        this.f19422i += (long) (this.f63476ki / this.f63482x2);
    }

    @Override // com.google.android.exoplayer2.audio.InterfaceC3262p
    public void toq(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining() && !m11505g()) {
            int i2 = this.f19421h;
            if (i2 == 0) {
                t8r(byteBuffer);
            } else if (i2 == 1) {
                ki(byteBuffer);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException();
                }
                m11494i(byteBuffer);
            }
        }
    }

    @Override // com.google.android.exoplayer2.audio.o1t
    /* JADX INFO: renamed from: y */
    protected void mo11389y() {
        if (this.f63480qrj) {
            this.f63482x2 = this.f63496toq.f19445q;
            int iX2 = x2(this.f19424s) * this.f63482x2;
            if (this.f63479n7h.length != iX2) {
                this.f63479n7h = new byte[iX2];
            }
            int iX22 = x2(this.f19423p) * this.f63482x2;
            this.f63476ki = iX22;
            if (this.f63477kja0.length != iX22) {
                this.f63477kja0 = new byte[iX22];
            }
        }
        this.f19421h = 0;
        this.f19422i = 0L;
        this.f63475cdj = 0;
        this.f63481t8r = false;
    }

    public n5r1(long j2, long j3, short s2) {
        C3844k.m13629k(j3 <= j2);
        this.f19424s = j2;
        this.f19423p = j3;
        this.f63478ld6 = s2;
        byte[] bArr = com.google.android.exoplayer2.util.lrht.f23228g;
        this.f63479n7h = bArr;
        this.f63477kja0 = bArr;
    }
}
