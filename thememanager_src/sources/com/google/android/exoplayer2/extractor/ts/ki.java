package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.C3548p;
import com.google.android.exoplayer2.extractor.InterfaceC3401t;
import com.google.android.exoplayer2.extractor.ts.d3;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.xwq3;

/* JADX INFO: compiled from: Id3Reader.java */
/* JADX INFO: loaded from: classes2.dex */
public final class ki implements qrj {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final String f64542f7l8 = "Id3Reader";

    /* JADX INFO: renamed from: g */
    private int f20285g;

    /* JADX INFO: renamed from: n */
    private int f20287n;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private InterfaceC3401t f64543toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private boolean f64544zy;

    /* JADX INFO: renamed from: k */
    private final com.google.android.exoplayer2.util.gvn7 f20286k = new com.google.android.exoplayer2.util.gvn7(10);

    /* JADX INFO: renamed from: q */
    private long f20288q = C3548p.f65257toq;

    @Override // com.google.android.exoplayer2.extractor.ts.qrj
    /* JADX INFO: renamed from: g */
    public void mo11943g(long j2, int i2) {
        if ((i2 & 4) == 0) {
            return;
        }
        this.f64544zy = true;
        if (j2 != C3548p.f65257toq) {
            this.f20288q = j2;
        }
        this.f20287n = 0;
        this.f20285g = 0;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.qrj
    /* JADX INFO: renamed from: n */
    public void mo11944n() {
        int i2;
        C3844k.ld6(this.f64543toq);
        if (this.f64544zy && (i2 = this.f20287n) != 0 && this.f20285g == i2) {
            long j2 = this.f20288q;
            if (j2 != C3548p.f65257toq) {
                this.f64543toq.mo11930n(j2, 1, i2, 0, null);
            }
            this.f64544zy = false;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.qrj
    /* JADX INFO: renamed from: q */
    public void mo11945q(com.google.android.exoplayer2.extractor.x2 x2Var, d3.C3406n c3406n) {
        c3406n.m11952k();
        InterfaceC3401t qVar = x2Var.toq(c3406n.zy(), 5);
        this.f64543toq = qVar;
        qVar.mo11931q(new xwq3.toq().n5r1(c3406n.toq()).m13945m(com.google.android.exoplayer2.util.wvg.f67093ch).a9());
    }

    @Override // com.google.android.exoplayer2.extractor.ts.qrj
    public void toq(com.google.android.exoplayer2.util.gvn7 gvn7Var) {
        C3844k.ld6(this.f64543toq);
        if (this.f64544zy) {
            int iM13594k = gvn7Var.m13594k();
            int i2 = this.f20285g;
            if (i2 < 10) {
                int iMin = Math.min(iM13594k, 10 - i2);
                System.arraycopy(gvn7Var.m13598q(), gvn7Var.m13596n(), this.f20286k.m13598q(), this.f20285g, iMin);
                if (this.f20285g + iMin == 10) {
                    this.f20286k.n5r1(0);
                    if (73 != this.f20286k.jp0y() || 68 != this.f20286k.jp0y() || 51 != this.f20286k.jp0y()) {
                        com.google.android.exoplayer2.util.ni7.qrj(f64542f7l8, "Discarding invalid ID3 tag");
                        this.f64544zy = false;
                        return;
                    } else {
                        this.f20286k.hyr(3);
                        this.f20287n = this.f20286k.fti() + 10;
                    }
                }
            }
            int iMin2 = Math.min(iM13594k, this.f20287n - this.f20285g);
            this.f64543toq.zy(gvn7Var, iMin2);
            this.f20285g += iMin2;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.qrj
    public void zy() {
        this.f64544zy = false;
        this.f20288q = C3548p.f65257toq;
    }
}
