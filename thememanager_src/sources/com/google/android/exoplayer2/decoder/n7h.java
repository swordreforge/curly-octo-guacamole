package com.google.android.exoplayer2.decoder;

import com.google.android.exoplayer2.decoder.AbstractC3294p;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import zy.dd;

/* JADX INFO: compiled from: SimpleDecoderOutputBuffer.java */
/* JADX INFO: loaded from: classes2.dex */
public class n7h extends AbstractC3294p {

    /* JADX INFO: renamed from: g */
    private final AbstractC3294p.k<n7h> f19597g;

    /* JADX INFO: renamed from: y */
    @dd
    public ByteBuffer f19598y;

    public n7h(AbstractC3294p.k<n7h> kVar) {
        this.f19597g = kVar;
    }

    @Override // com.google.android.exoplayer2.decoder.AbstractC3294p
    public void cdj() {
        this.f19597g.mo11571k(this);
    }

    public ByteBuffer ki(long j2, int i2) {
        this.f19600q = j2;
        ByteBuffer byteBuffer = this.f19598y;
        if (byteBuffer == null || byteBuffer.capacity() < i2) {
            this.f19598y = ByteBuffer.allocateDirect(i2).order(ByteOrder.nativeOrder());
        }
        this.f19598y.position(0);
        this.f19598y.limit(i2);
        return this.f19598y;
    }

    @Override // com.google.android.exoplayer2.decoder.AbstractC3291k
    /* JADX INFO: renamed from: s */
    public void mo11567s() {
        super.mo11567s();
        ByteBuffer byteBuffer = this.f19598y;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }
}
