package com.google.android.exoplayer2.source.chunk;

import com.google.android.exoplayer2.C3548p;
import com.google.android.exoplayer2.extractor.C3347g;
import com.google.android.exoplayer2.extractor.InterfaceC3401t;
import com.google.android.exoplayer2.xwq3;
import java.io.IOException;
import zy.dd;

/* JADX INFO: compiled from: SingleSampleMediaChunk.java */
/* JADX INFO: loaded from: classes2.dex */
public final class ki extends AbstractC3583k {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private long f65344cdj;

    /* JADX INFO: renamed from: h */
    private final xwq3 f21371h;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private boolean f65345ki;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private final int f65346kja0;

    public ki(com.google.android.exoplayer2.upstream.kja0 kja0Var, com.google.android.exoplayer2.upstream.t8r t8rVar, xwq3 xwq3Var, int i2, @dd Object obj, long j2, long j3, long j4, int i3, xwq3 xwq3Var2) {
        super(kja0Var, t8rVar, xwq3Var, i2, obj, j2, j3, C3548p.f65257toq, C3548p.f65257toq, j4);
        this.f65346kja0 = i3;
        this.f21371h = xwq3Var2;
    }

    @Override // com.google.android.exoplayer2.upstream.oc.InterfaceC3814n
    /* JADX INFO: renamed from: k */
    public void mo12654k() throws IOException {
        zy zyVarM12652p = m12652p();
        zyVarM12652p.zy(0L);
        InterfaceC3401t qVar = zyVarM12652p.toq(0, this.f65346kja0);
        qVar.mo11931q(this.f21371h);
        try {
            long jMo7270k = this.f21369s.mo7270k(this.f65338toq.m13514n(this.f65344cdj));
            if (jMo7270k != -1) {
                jMo7270k += this.f65344cdj;
            }
            C3347g c3347g = new C3347g(this.f21369s, this.f65344cdj, jMo7270k);
            for (int qVar2 = 0; qVar2 != -1; qVar2 = qVar.toq(c3347g, Integer.MAX_VALUE, true)) {
                this.f65344cdj += (long) qVar2;
            }
            qVar.mo11930n(this.f65337f7l8, 1, (int) this.f65344cdj, 0, null);
            com.google.android.exoplayer2.upstream.ki.m13484k(this.f21369s);
            this.f65345ki = true;
        } catch (Throwable th) {
            com.google.android.exoplayer2.upstream.ki.m13484k(this.f21369s);
            throw th;
        }
    }

    @Override // com.google.android.exoplayer2.source.chunk.n7h
    /* JADX INFO: renamed from: y */
    public boolean mo12655y() {
        return this.f65345ki;
    }

    @Override // com.google.android.exoplayer2.upstream.oc.InterfaceC3814n
    public void zy() {
    }
}
