package com.google.android.exoplayer2.mediacodec;

import com.google.android.exoplayer2.decoder.C3297s;
import com.google.android.exoplayer2.util.C3844k;
import java.nio.ByteBuffer;
import zy.a9;
import zy.yz;

/* JADX INFO: renamed from: com.google.android.exoplayer2.mediacodec.y */
/* JADX INFO: compiled from: BatchBuffer.java */
/* JADX INFO: loaded from: classes2.dex */
final class C3473y extends C3297s {

    /* JADX INFO: renamed from: e */
    public static final int f20728e = 32;

    /* JADX INFO: renamed from: j */
    @yz
    static final int f20729j = 3072000;

    /* JADX INFO: renamed from: c */
    private int f20730c;

    /* JADX INFO: renamed from: f */
    private int f20731f;

    /* JADX INFO: renamed from: l */
    private long f20732l;

    public C3473y() {
        super(2);
        this.f20730c = 32;
    }

    /* JADX INFO: renamed from: z */
    private boolean m12280z(C3297s c3297s) {
        ByteBuffer byteBuffer;
        if (!mcp()) {
            return true;
        }
        if (this.f20731f >= this.f20730c || c3297s.qrj() != qrj()) {
            return false;
        }
        ByteBuffer byteBuffer2 = c3297s.f19612g;
        return byteBuffer2 == null || (byteBuffer = this.f19612g) == null || byteBuffer.position() + byteBuffer2.remaining() <= f20729j;
    }

    public boolean fu4(C3297s c3297s) {
        C3844k.m13629k(!c3297s.fn3e());
        C3844k.m13629k(!c3297s.x2());
        C3844k.m13629k(!c3297s.n7h());
        if (!m12280z(c3297s)) {
            return false;
        }
        int i2 = this.f20731f;
        this.f20731f = i2 + 1;
        if (i2 == 0) {
            this.f19618s = c3297s.f19618s;
            if (c3297s.kja0()) {
                m11565h(1);
            }
        }
        if (c3297s.qrj()) {
            m11565h(Integer.MIN_VALUE);
        }
        ByteBuffer byteBuffer = c3297s.f19612g;
        if (byteBuffer != null) {
            ki(byteBuffer.remaining());
            this.f19612g.put(byteBuffer);
        }
        this.f20732l = c3297s.f19618s;
        return true;
    }

    public void jk(@a9(from = 1) int i2) {
        C3844k.m13629k(i2 > 0);
        this.f20730c = i2;
    }

    public boolean mcp() {
        return this.f20731f > 0;
    }

    public long o1t() {
        return this.f19618s;
    }

    @Override // com.google.android.exoplayer2.decoder.C3297s, com.google.android.exoplayer2.decoder.AbstractC3291k
    /* JADX INFO: renamed from: s */
    public void mo11567s() {
        super.mo11567s();
        this.f20731f = 0;
    }

    /* JADX INFO: renamed from: t */
    public int m12281t() {
        return this.f20731f;
    }

    public long wvg() {
        return this.f20732l;
    }
}
