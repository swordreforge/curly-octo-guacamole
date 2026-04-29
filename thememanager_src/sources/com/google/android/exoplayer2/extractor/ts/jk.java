package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.extractor.InterfaceC3401t;
import com.google.android.exoplayer2.extractor.ts.d3;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.xwq3;
import java.util.List;

/* JADX INFO: compiled from: SeiReader.java */
/* JADX INFO: loaded from: classes2.dex */
public final class jk {

    /* JADX INFO: renamed from: k */
    private final List<xwq3> f20284k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final InterfaceC3401t[] f64541toq;

    public jk(List<xwq3> list) {
        this.f20284k = list;
        this.f64541toq = new InterfaceC3401t[list.size()];
    }

    /* JADX INFO: renamed from: k */
    public void m11991k(long j2, com.google.android.exoplayer2.util.gvn7 gvn7Var) {
        com.google.android.exoplayer2.extractor.zy.m12058k(j2, gvn7Var, this.f64541toq);
    }

    public void toq(com.google.android.exoplayer2.extractor.x2 x2Var, d3.C3406n c3406n) {
        for (int i2 = 0; i2 < this.f64541toq.length; i2++) {
            c3406n.m11952k();
            InterfaceC3401t qVar = x2Var.toq(c3406n.zy(), 3);
            xwq3 xwq3Var = this.f20284k.get(i2);
            String str = xwq3Var.f23682r;
            boolean z2 = com.google.android.exoplayer2.util.wvg.f67127nmn5.equals(str) || com.google.android.exoplayer2.util.wvg.f67119lv5.equals(str);
            String strValueOf = String.valueOf(str);
            C3844k.toq(z2, strValueOf.length() != 0 ? "Invalid closed caption mime type provided: ".concat(strValueOf) : new String("Invalid closed caption mime type provided: "));
            String qVar2 = xwq3Var.f23675k;
            if (qVar2 == null) {
                qVar2 = c3406n.toq();
            }
            qVar.mo11931q(new xwq3.toq().n5r1(qVar2).m13945m(str).yz(xwq3Var.f23671g).m13940c(xwq3Var.f23678n).fti(xwq3Var.bp).hyr(xwq3Var.f23670f).a9());
            this.f64541toq[i2] = qVar;
        }
    }
}
