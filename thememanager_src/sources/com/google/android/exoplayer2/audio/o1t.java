package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.audio.InterfaceC3262p;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import zy.InterfaceC7842s;

/* JADX INFO: compiled from: BaseAudioProcessor.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class o1t implements InterfaceC3262p {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private ByteBuffer f63495f7l8;

    /* JADX INFO: renamed from: g */
    private ByteBuffer f19438g;

    /* JADX INFO: renamed from: n */
    private InterfaceC3262p.k f19439n;

    /* JADX INFO: renamed from: q */
    private InterfaceC3262p.k f19440q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    protected InterfaceC3262p.k f63496toq;

    /* JADX INFO: renamed from: y */
    private boolean f19441y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    protected InterfaceC3262p.k f63497zy;

    public o1t() {
        ByteBuffer byteBuffer = InterfaceC3262p.f19442k;
        this.f19438g = byteBuffer;
        this.f63495f7l8 = byteBuffer;
        InterfaceC3262p.k kVar = InterfaceC3262p.k.f19443n;
        this.f19440q = kVar;
        this.f19439n = kVar;
        this.f63496toq = kVar;
        this.f63497zy = kVar;
    }

    protected InterfaceC3262p.k f7l8(InterfaceC3262p.k kVar) throws InterfaceC3262p.toq {
        return InterfaceC3262p.k.f19443n;
    }

    @Override // com.google.android.exoplayer2.audio.InterfaceC3262p
    public final void flush() {
        this.f63495f7l8 = InterfaceC3262p.f19442k;
        this.f19441y = false;
        this.f63496toq = this.f19440q;
        this.f63497zy = this.f19439n;
        mo11389y();
    }

    /* JADX INFO: renamed from: g */
    protected final boolean m11505g() {
        return this.f63495f7l8.hasRemaining();
    }

    @Override // com.google.android.exoplayer2.audio.InterfaceC3262p
    public boolean isActive() {
        return this.f19439n != InterfaceC3262p.k.f19443n;
    }

    @Override // com.google.android.exoplayer2.audio.InterfaceC3262p
    @InterfaceC7842s
    /* JADX INFO: renamed from: k */
    public ByteBuffer mo11407k() {
        ByteBuffer byteBuffer = this.f63495f7l8;
        this.f63495f7l8 = InterfaceC3262p.f19442k;
        return byteBuffer;
    }

    protected final ByteBuffer ld6(int i2) {
        if (this.f19438g.capacity() < i2) {
            this.f19438g = ByteBuffer.allocateDirect(i2).order(ByteOrder.nativeOrder());
        } else {
            this.f19438g.clear();
        }
        ByteBuffer byteBuffer = this.f19438g;
        this.f63495f7l8 = byteBuffer;
        return byteBuffer;
    }

    @Override // com.google.android.exoplayer2.audio.InterfaceC3262p
    /* JADX INFO: renamed from: n */
    public final void mo11408n() {
        this.f19441y = true;
        mo11388s();
    }

    /* JADX INFO: renamed from: p */
    protected void mo11387p() {
    }

    @Override // com.google.android.exoplayer2.audio.InterfaceC3262p
    /* JADX INFO: renamed from: q */
    public final InterfaceC3262p.k mo11409q(InterfaceC3262p.k kVar) throws InterfaceC3262p.toq {
        this.f19440q = kVar;
        this.f19439n = f7l8(kVar);
        return isActive() ? this.f19439n : InterfaceC3262p.k.f19443n;
    }

    @Override // com.google.android.exoplayer2.audio.InterfaceC3262p
    public final void reset() {
        flush();
        this.f19438g = InterfaceC3262p.f19442k;
        InterfaceC3262p.k kVar = InterfaceC3262p.k.f19443n;
        this.f19440q = kVar;
        this.f19439n = kVar;
        this.f63496toq = kVar;
        this.f63497zy = kVar;
        mo11387p();
    }

    /* JADX INFO: renamed from: s */
    protected void mo11388s() {
    }

    /* JADX INFO: renamed from: y */
    protected void mo11389y() {
    }

    @Override // com.google.android.exoplayer2.audio.InterfaceC3262p
    @InterfaceC7842s
    public boolean zy() {
        return this.f19441y && this.f63495f7l8 == InterfaceC3262p.f19442k;
    }
}
