package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.extractor.InterfaceC3401t;
import com.google.android.exoplayer2.extractor.ts.d3;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.xwq3;
import java.util.List;

/* JADX INFO: compiled from: UserDataReader.java */
/* JADX INFO: loaded from: classes2.dex */
final class eqxt {

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final int f64438zy = 434;

    /* JADX INFO: renamed from: k */
    private final List<xwq3> f20205k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final InterfaceC3401t[] f64439toq;

    public eqxt(List<xwq3> list) {
        this.f20205k = list;
        this.f64439toq = new InterfaceC3401t[list.size()];
    }

    /* JADX INFO: renamed from: k */
    public void m11954k(long j2, com.google.android.exoplayer2.util.gvn7 gvn7Var) {
        if (gvn7Var.m13594k() < 9) {
            return;
        }
        int iKja0 = gvn7Var.kja0();
        int iKja02 = gvn7Var.kja0();
        int iJp0y = gvn7Var.jp0y();
        if (iKja0 == f64438zy && iKja02 == 1195456820 && iJp0y == 3) {
            com.google.android.exoplayer2.extractor.zy.toq(j2, gvn7Var, this.f64439toq);
        }
    }

    public void toq(com.google.android.exoplayer2.extractor.x2 x2Var, d3.C3406n c3406n) {
        for (int i2 = 0; i2 < this.f64439toq.length; i2++) {
            c3406n.m11952k();
            InterfaceC3401t qVar = x2Var.toq(c3406n.zy(), 3);
            xwq3 xwq3Var = this.f20205k.get(i2);
            String str = xwq3Var.f23682r;
            boolean z2 = com.google.android.exoplayer2.util.wvg.f67127nmn5.equals(str) || com.google.android.exoplayer2.util.wvg.f67119lv5.equals(str);
            String strValueOf = String.valueOf(str);
            C3844k.toq(z2, strValueOf.length() != 0 ? "Invalid closed caption mime type provided: ".concat(strValueOf) : new String("Invalid closed caption mime type provided: "));
            qVar.mo11931q(new xwq3.toq().n5r1(c3406n.toq()).m13945m(str).yz(xwq3Var.f23671g).m13940c(xwq3Var.f23678n).fti(xwq3Var.bp).hyr(xwq3Var.f23670f).a9());
            this.f64439toq[i2] = qVar;
        }
    }
}
