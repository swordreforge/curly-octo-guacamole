package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.C3548p;
import com.google.android.exoplayer2.extractor.InterfaceC3401t;
import com.google.android.exoplayer2.extractor.ts.d3;
import com.google.android.exoplayer2.xwq3;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: DvbSubtitleReader.java */
/* JADX INFO: loaded from: classes2.dex */
public final class x2 implements qrj {

    /* JADX INFO: renamed from: g */
    private long f20401g = C3548p.f65257toq;

    /* JADX INFO: renamed from: k */
    private final List<d3.C3405k> f20402k;

    /* JADX INFO: renamed from: n */
    private int f20403n;

    /* JADX INFO: renamed from: q */
    private int f20404q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final InterfaceC3401t[] f64669toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private boolean f64670zy;

    public x2(List<d3.C3405k> list) {
        this.f20402k = list;
        this.f64669toq = new InterfaceC3401t[list.size()];
    }

    /* JADX INFO: renamed from: k */
    private boolean m12026k(com.google.android.exoplayer2.util.gvn7 gvn7Var, int i2) {
        if (gvn7Var.m13594k() == 0) {
            return false;
        }
        if (gvn7Var.jp0y() != i2) {
            this.f64670zy = false;
        }
        this.f20404q--;
        return this.f64670zy;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.qrj
    /* JADX INFO: renamed from: g */
    public void mo11943g(long j2, int i2) {
        if ((i2 & 4) == 0) {
            return;
        }
        this.f64670zy = true;
        if (j2 != C3548p.f65257toq) {
            this.f20401g = j2;
        }
        this.f20403n = 0;
        this.f20404q = 2;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.qrj
    /* JADX INFO: renamed from: n */
    public void mo11944n() {
        if (this.f64670zy) {
            if (this.f20401g != C3548p.f65257toq) {
                for (InterfaceC3401t interfaceC3401t : this.f64669toq) {
                    interfaceC3401t.mo11930n(this.f20401g, 1, this.f20403n, 0, null);
                }
            }
            this.f64670zy = false;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.qrj
    /* JADX INFO: renamed from: q */
    public void mo11945q(com.google.android.exoplayer2.extractor.x2 x2Var, d3.C3406n c3406n) {
        for (int i2 = 0; i2 < this.f64669toq.length; i2++) {
            d3.C3405k c3405k = this.f20402k.get(i2);
            c3406n.m11952k();
            InterfaceC3401t qVar = x2Var.toq(c3406n.zy(), 3);
            qVar.mo11931q(new xwq3.toq().n5r1(c3406n.toq()).m13945m(com.google.android.exoplayer2.util.wvg.f67122mu).hyr(Collections.singletonList(c3405k.f64433zy)).m13940c(c3405k.f20198k).a9());
            this.f64669toq[i2] = qVar;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.qrj
    public void toq(com.google.android.exoplayer2.util.gvn7 gvn7Var) {
        if (this.f64670zy) {
            if (this.f20404q != 2 || m12026k(gvn7Var, 32)) {
                if (this.f20404q != 1 || m12026k(gvn7Var, 0)) {
                    int iM13596n = gvn7Var.m13596n();
                    int iM13594k = gvn7Var.m13594k();
                    for (InterfaceC3401t interfaceC3401t : this.f64669toq) {
                        gvn7Var.n5r1(iM13596n);
                        interfaceC3401t.zy(gvn7Var, iM13594k);
                    }
                    this.f20403n += iM13594k;
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.qrj
    public void zy() {
        this.f64670zy = false;
        this.f20401g = C3548p.f65257toq;
    }
}
