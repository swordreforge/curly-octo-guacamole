package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.extractor.InterfaceC3401t;
import com.google.android.exoplayer2.util.gvn7;
import com.google.android.exoplayer2.xwq3;
import java.io.EOFException;
import java.io.IOException;
import zy.dd;

/* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.s */
/* JADX INFO: compiled from: DummyTrackOutput.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C3400s implements InterfaceC3401t {

    /* JADX INFO: renamed from: q */
    private final byte[] f20165q = new byte[4096];

    @Override // com.google.android.exoplayer2.extractor.InterfaceC3401t
    /* JADX INFO: renamed from: g */
    public void mo11928g(gvn7 gvn7Var, int i2, int i3) {
        gvn7Var.hyr(i2);
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC3401t
    /* JADX INFO: renamed from: k */
    public int mo11929k(com.google.android.exoplayer2.upstream.x2 x2Var, int i2, boolean z2, int i3) throws IOException {
        int i4 = x2Var.read(this.f20165q, 0, Math.min(this.f20165q.length, i2));
        if (i4 != -1) {
            return i4;
        }
        if (z2) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC3401t
    /* JADX INFO: renamed from: n */
    public void mo11930n(long j2, int i2, int i3, int i4, @dd InterfaceC3401t.k kVar) {
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC3401t
    /* JADX INFO: renamed from: q */
    public void mo11931q(xwq3 xwq3Var) {
    }
}
