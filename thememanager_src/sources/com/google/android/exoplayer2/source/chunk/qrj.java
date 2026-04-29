package com.google.android.exoplayer2.source.chunk;

import com.google.android.exoplayer2.C3548p;
import com.google.android.exoplayer2.extractor.C3347g;
import com.google.android.exoplayer2.source.chunk.f7l8;
import com.google.android.exoplayer2.upstream.C3794f;
import com.google.android.exoplayer2.xwq3;
import java.io.IOException;
import zy.dd;

/* JADX INFO: compiled from: InitializationChunk.java */
/* JADX INFO: loaded from: classes2.dex */
public final class qrj extends AbstractC3581g {

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private f7l8.toq f65352ld6;

    /* JADX INFO: renamed from: p */
    private final f7l8 f21393p;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private volatile boolean f65353qrj;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private long f65354x2;

    public qrj(com.google.android.exoplayer2.upstream.kja0 kja0Var, com.google.android.exoplayer2.upstream.t8r t8rVar, xwq3 xwq3Var, int i2, @dd Object obj, f7l8 f7l8Var) {
        super(kja0Var, t8rVar, 2, xwq3Var, i2, obj, C3548p.f65257toq, C3548p.f65257toq);
        this.f21393p = f7l8Var;
    }

    public void f7l8(f7l8.toq toqVar) {
        this.f65352ld6 = toqVar;
    }

    @Override // com.google.android.exoplayer2.upstream.oc.InterfaceC3814n
    /* JADX INFO: renamed from: k */
    public void mo12654k() throws IOException {
        if (this.f65354x2 == 0) {
            this.f21393p.zy(this.f65352ld6, C3548p.f65257toq, C3548p.f65257toq);
        }
        try {
            com.google.android.exoplayer2.upstream.t8r t8rVarM13514n = this.f65338toq.m13514n(this.f65354x2);
            C3794f c3794f = this.f21369s;
            C3347g c3347g = new C3347g(c3794f, t8rVarM13514n.f66911f7l8, c3794f.mo7270k(t8rVarM13514n));
            while (!this.f65353qrj && this.f21393p.mo12645k(c3347g)) {
                try {
                } finally {
                    this.f65354x2 = c3347g.getPosition() - this.f65338toq.f66911f7l8;
                }
            }
        } finally {
            com.google.android.exoplayer2.upstream.ki.m13484k(this.f21369s);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.oc.InterfaceC3814n
    public void zy() {
        this.f65353qrj = true;
    }
}
