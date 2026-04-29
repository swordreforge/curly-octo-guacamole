package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.C3548p;
import com.google.android.exoplayer2.extractor.InterfaceC3401t;
import com.google.android.exoplayer2.extractor.ts.d3;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.C3847l;
import com.google.android.exoplayer2.util.lrht;
import com.google.android.exoplayer2.xwq3;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: compiled from: PassthroughSectionPayloadReader.java */
/* JADX INFO: loaded from: classes2.dex */
public final class zurt implements InterfaceC3420t {

    /* JADX INFO: renamed from: k */
    private xwq3 f20420k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private C3847l f64684toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private InterfaceC3401t f64685zy;

    public zurt(String str) {
        this.f20420k = new xwq3.toq().m13945m(str).a9();
    }

    @EnsuresNonNull({"timestampAdjuster", "output"})
    private void zy() {
        C3844k.ld6(this.f64684toq);
        lrht.ld6(this.f64685zy);
    }

    @Override // com.google.android.exoplayer2.extractor.ts.InterfaceC3420t
    /* JADX INFO: renamed from: k */
    public void mo11976k(C3847l c3847l, com.google.android.exoplayer2.extractor.x2 x2Var, d3.C3406n c3406n) {
        this.f64684toq = c3847l;
        c3406n.m11952k();
        InterfaceC3401t qVar = x2Var.toq(c3406n.zy(), 5);
        this.f64685zy = qVar;
        qVar.mo11931q(this.f20420k);
    }

    @Override // com.google.android.exoplayer2.extractor.ts.InterfaceC3420t
    public void toq(com.google.android.exoplayer2.util.gvn7 gvn7Var) {
        zy();
        long jM13649q = this.f64684toq.m13649q();
        long jM13648n = this.f64684toq.m13648n();
        if (jM13649q == C3548p.f65257toq || jM13648n == C3548p.f65257toq) {
            return;
        }
        xwq3 xwq3Var = this.f20420k;
        if (jM13648n != xwq3Var.f23669e) {
            xwq3 xwq3VarA9 = xwq3Var.toq().m13939b(jM13648n).a9();
            this.f20420k = xwq3VarA9;
            this.f64685zy.mo11931q(xwq3VarA9);
        }
        int iM13594k = gvn7Var.m13594k();
        this.f64685zy.zy(gvn7Var, iM13594k);
        this.f64685zy.mo11930n(jM13649q, 1, iM13594k, 0, null);
    }
}
