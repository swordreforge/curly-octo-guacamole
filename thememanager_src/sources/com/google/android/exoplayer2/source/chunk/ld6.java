package com.google.android.exoplayer2.source.chunk;

import com.google.android.exoplayer2.C3548p;
import com.google.android.exoplayer2.extractor.C3347g;
import com.google.android.exoplayer2.source.chunk.f7l8;
import com.google.android.exoplayer2.upstream.C3794f;
import com.google.android.exoplayer2.xwq3;
import java.io.IOException;
import zy.dd;

/* JADX INFO: compiled from: ContainerMediaChunk.java */
/* JADX INFO: loaded from: classes2.dex */
public class ld6 extends AbstractC3583k {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private final f7l8 f65347cdj;

    /* JADX INFO: renamed from: h */
    private final long f21373h;

    /* JADX INFO: renamed from: i */
    private boolean f21374i;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private long f65348ki;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private final int f65349kja0;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private volatile boolean f65350t8r;

    public ld6(com.google.android.exoplayer2.upstream.kja0 kja0Var, com.google.android.exoplayer2.upstream.t8r t8rVar, xwq3 xwq3Var, int i2, @dd Object obj, long j2, long j3, long j4, long j5, long j6, int i3, long j7, f7l8 f7l8Var) {
        super(kja0Var, t8rVar, xwq3Var, i2, obj, j2, j3, j4, j5, j6);
        this.f65349kja0 = i3;
        this.f21373h = j7;
        this.f65347cdj = f7l8Var;
    }

    @Override // com.google.android.exoplayer2.source.chunk.n7h
    public long f7l8() {
        return this.f21392p + ((long) this.f65349kja0);
    }

    @Override // com.google.android.exoplayer2.upstream.oc.InterfaceC3814n
    /* JADX INFO: renamed from: k */
    public final void mo12654k() throws IOException {
        if (this.f65348ki == 0) {
            zy zyVarM12652p = m12652p();
            zyVarM12652p.zy(this.f21373h);
            f7l8 f7l8Var = this.f65347cdj;
            f7l8.toq toqVarX2 = x2(zyVarM12652p);
            long j2 = this.f65340ld6;
            long j3 = j2 == C3548p.f65257toq ? -9223372036854775807L : j2 - this.f21373h;
            long j4 = this.f65343x2;
            f7l8Var.zy(toqVarX2, j3, j4 == C3548p.f65257toq ? -9223372036854775807L : j4 - this.f21373h);
        }
        try {
            com.google.android.exoplayer2.upstream.t8r t8rVarM13514n = this.f65338toq.m13514n(this.f65348ki);
            C3794f c3794f = this.f21369s;
            C3347g c3347g = new C3347g(c3794f, t8rVarM13514n.f66911f7l8, c3794f.mo7270k(t8rVarM13514n));
            do {
                try {
                    if (this.f65350t8r) {
                        break;
                    }
                } finally {
                    this.f65348ki = c3347g.getPosition() - this.f65338toq.f66911f7l8;
                }
            } while (this.f65347cdj.mo12645k(c3347g));
            com.google.android.exoplayer2.upstream.ki.m13484k(this.f21369s);
            this.f21374i = !this.f65350t8r;
        } catch (Throwable th) {
            com.google.android.exoplayer2.upstream.ki.m13484k(this.f21369s);
            throw th;
        }
    }

    protected f7l8.toq x2(zy zyVar) {
        return zyVar;
    }

    @Override // com.google.android.exoplayer2.source.chunk.n7h
    /* JADX INFO: renamed from: y */
    public boolean mo12655y() {
        return this.f21374i;
    }

    @Override // com.google.android.exoplayer2.upstream.oc.InterfaceC3814n
    public final void zy() {
        this.f65350t8r = true;
    }
}
