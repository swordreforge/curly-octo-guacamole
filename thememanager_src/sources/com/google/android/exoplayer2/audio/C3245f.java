package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.audio.InterfaceC3262p;
import com.google.android.exoplayer2.util.C3844k;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* JADX INFO: renamed from: com.google.android.exoplayer2.audio.f */
/* JADX INFO: compiled from: SonicAudioProcessor.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C3245f implements InterfaceC3262p {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    public static final int f63325cdj = -1;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private static final float f63326ki = 1.0E-4f;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private static final int f63327t8r = 1024;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private InterfaceC3262p.k f63328f7l8;

    /* JADX INFO: renamed from: g */
    private InterfaceC3262p.k f19313g;

    /* JADX INFO: renamed from: h */
    private boolean f19314h;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private long f63329kja0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private ByteBuffer f63330ld6;

    /* JADX INFO: renamed from: n */
    private InterfaceC3262p.k f19315n;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private long f63331n7h;

    /* JADX INFO: renamed from: p */
    @zy.dd
    private hyr f19316p;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private ByteBuffer f63332qrj;

    /* JADX INFO: renamed from: s */
    private boolean f19318s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private int f63333toq;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private ShortBuffer f63334x2;

    /* JADX INFO: renamed from: y */
    private InterfaceC3262p.k f19319y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private float f63335zy = 1.0f;

    /* JADX INFO: renamed from: q */
    private float f19317q = 1.0f;

    public C3245f() {
        InterfaceC3262p.k kVar = InterfaceC3262p.k.f19443n;
        this.f19315n = kVar;
        this.f19313g = kVar;
        this.f63328f7l8 = kVar;
        this.f19319y = kVar;
        ByteBuffer byteBuffer = InterfaceC3262p.f19442k;
        this.f63330ld6 = byteBuffer;
        this.f63334x2 = byteBuffer.asShortBuffer();
        this.f63332qrj = byteBuffer;
        this.f63333toq = -1;
    }

    public void f7l8(int i2) {
        this.f63333toq = i2;
    }

    @Override // com.google.android.exoplayer2.audio.InterfaceC3262p
    public void flush() {
        if (isActive()) {
            InterfaceC3262p.k kVar = this.f19315n;
            this.f63328f7l8 = kVar;
            InterfaceC3262p.k kVar2 = this.f19313g;
            this.f19319y = kVar2;
            if (this.f19318s) {
                this.f19316p = new hyr(kVar.f19444k, kVar.f63498toq, this.f63335zy, this.f19317q, kVar2.f19444k);
            } else {
                hyr hyrVar = this.f19316p;
                if (hyrVar != null) {
                    hyrVar.m11484s();
                }
            }
        }
        this.f63332qrj = InterfaceC3262p.f19442k;
        this.f63331n7h = 0L;
        this.f63329kja0 = 0L;
        this.f19314h = false;
    }

    /* JADX INFO: renamed from: g */
    public long m11406g(long j2) {
        if (this.f63329kja0 < 1024) {
            return (long) (((double) this.f63335zy) * j2);
        }
        long jX2 = this.f63331n7h - ((long) ((hyr) C3844k.f7l8(this.f19316p)).x2());
        int i2 = this.f19319y.f19444k;
        int i3 = this.f63328f7l8.f19444k;
        return i2 == i3 ? com.google.android.exoplayer2.util.lrht.ktq(j2, jX2, this.f63329kja0) : com.google.android.exoplayer2.util.lrht.ktq(j2, jX2 * ((long) i2), this.f63329kja0 * ((long) i3));
    }

    @Override // com.google.android.exoplayer2.audio.InterfaceC3262p
    public boolean isActive() {
        return this.f19313g.f19444k != -1 && (Math.abs(this.f63335zy - 1.0f) >= 1.0E-4f || Math.abs(this.f19317q - 1.0f) >= 1.0E-4f || this.f19313g.f19444k != this.f19315n.f19444k);
    }

    @Override // com.google.android.exoplayer2.audio.InterfaceC3262p
    /* JADX INFO: renamed from: k */
    public ByteBuffer mo11407k() {
        int iLd6;
        hyr hyrVar = this.f19316p;
        if (hyrVar != null && (iLd6 = hyrVar.ld6()) > 0) {
            if (this.f63330ld6.capacity() < iLd6) {
                ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(iLd6).order(ByteOrder.nativeOrder());
                this.f63330ld6 = byteBufferOrder;
                this.f63334x2 = byteBufferOrder.asShortBuffer();
            } else {
                this.f63330ld6.clear();
                this.f63334x2.clear();
            }
            hyrVar.m11483p(this.f63334x2);
            this.f63329kja0 += (long) iLd6;
            this.f63330ld6.limit(iLd6);
            this.f63332qrj = this.f63330ld6;
        }
        ByteBuffer byteBuffer = this.f63332qrj;
        this.f63332qrj = InterfaceC3262p.f19442k;
        return byteBuffer;
    }

    @Override // com.google.android.exoplayer2.audio.InterfaceC3262p
    /* JADX INFO: renamed from: n */
    public void mo11408n() {
        hyr hyrVar = this.f19316p;
        if (hyrVar != null) {
            hyrVar.t8r();
        }
        this.f19314h = true;
    }

    @Override // com.google.android.exoplayer2.audio.InterfaceC3262p
    /* JADX INFO: renamed from: q */
    public InterfaceC3262p.k mo11409q(InterfaceC3262p.k kVar) throws InterfaceC3262p.toq {
        if (kVar.f63499zy != 2) {
            throw new InterfaceC3262p.toq(kVar);
        }
        int i2 = this.f63333toq;
        if (i2 == -1) {
            i2 = kVar.f19444k;
        }
        this.f19315n = kVar;
        InterfaceC3262p.k kVar2 = new InterfaceC3262p.k(i2, kVar.f63498toq, 2);
        this.f19313g = kVar2;
        this.f19318s = true;
        return kVar2;
    }

    @Override // com.google.android.exoplayer2.audio.InterfaceC3262p
    public void reset() {
        this.f63335zy = 1.0f;
        this.f19317q = 1.0f;
        InterfaceC3262p.k kVar = InterfaceC3262p.k.f19443n;
        this.f19315n = kVar;
        this.f19313g = kVar;
        this.f63328f7l8 = kVar;
        this.f19319y = kVar;
        ByteBuffer byteBuffer = InterfaceC3262p.f19442k;
        this.f63330ld6 = byteBuffer;
        this.f63334x2 = byteBuffer.asShortBuffer();
        this.f63332qrj = byteBuffer;
        this.f63333toq = -1;
        this.f19318s = false;
        this.f19316p = null;
        this.f63331n7h = 0L;
        this.f63329kja0 = 0L;
        this.f19314h = false;
    }

    /* JADX INFO: renamed from: s */
    public void m11410s(float f2) {
        if (this.f63335zy != f2) {
            this.f63335zy = f2;
            this.f19318s = true;
        }
    }

    @Override // com.google.android.exoplayer2.audio.InterfaceC3262p
    public void toq(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            hyr hyrVar = (hyr) C3844k.f7l8(this.f19316p);
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.f63331n7h += (long) iRemaining;
            hyrVar.m11482i(shortBufferAsShortBuffer);
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }

    /* JADX INFO: renamed from: y */
    public void m11411y(float f2) {
        if (this.f19317q != f2) {
            this.f19317q = f2;
            this.f19318s = true;
        }
    }

    @Override // com.google.android.exoplayer2.audio.InterfaceC3262p
    public boolean zy() {
        hyr hyrVar;
        return this.f19314h && ((hyrVar = this.f19316p) == null || hyrVar.ld6() == 0);
    }
}
