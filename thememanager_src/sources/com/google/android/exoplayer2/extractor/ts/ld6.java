package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.C3548p;
import com.google.android.exoplayer2.extractor.InterfaceC3401t;
import com.google.android.exoplayer2.extractor.ts.d3;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.xwq3;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import zy.dd;

/* JADX INFO: compiled from: DtsReader.java */
/* JADX INFO: loaded from: classes2.dex */
public final class ld6 implements qrj {

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private static final int f64564kja0 = 18;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private static final int f64565n7h = 2;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static final int f64566qrj = 1;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final int f64567x2 = 0;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private int f64568f7l8;

    /* JADX INFO: renamed from: g */
    private int f20312g;

    /* JADX INFO: renamed from: p */
    private int f20315p;

    /* JADX INFO: renamed from: q */
    private InterfaceC3401t f20316q;

    /* JADX INFO: renamed from: s */
    private xwq3 f20317s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @dd
    private final String f64570toq;

    /* JADX INFO: renamed from: y */
    private long f20318y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private String f64571zy;

    /* JADX INFO: renamed from: k */
    private final com.google.android.exoplayer2.util.gvn7 f20313k = new com.google.android.exoplayer2.util.gvn7(new byte[18]);

    /* JADX INFO: renamed from: n */
    private int f20314n = 0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private long f64569ld6 = C3548p.f65257toq;

    public ld6(@dd String str) {
        this.f64570toq = str;
    }

    @RequiresNonNull({"output"})
    private void f7l8() {
        byte[] bArrM13598q = this.f20313k.m13598q();
        if (this.f20317s == null) {
            xwq3 xwq3VarF7l8 = com.google.android.exoplayer2.audio.d2ok.f7l8(bArrM13598q, this.f64571zy, this.f64570toq, null);
            this.f20317s = xwq3VarF7l8;
            this.f20316q.mo11931q(xwq3VarF7l8);
        }
        this.f20315p = com.google.android.exoplayer2.audio.d2ok.m11395k(bArrM13598q);
        this.f20318y = (int) ((((long) com.google.android.exoplayer2.audio.d2ok.m11394g(bArrM13598q)) * 1000000) / ((long) this.f20317s.f23668d));
    }

    /* JADX INFO: renamed from: k */
    private boolean m11996k(com.google.android.exoplayer2.util.gvn7 gvn7Var, byte[] bArr, int i2) {
        int iMin = Math.min(gvn7Var.m13594k(), i2 - this.f20312g);
        gvn7Var.ld6(bArr, this.f20312g, iMin);
        int i3 = this.f20312g + iMin;
        this.f20312g = i3;
        return i3 == i2;
    }

    /* JADX INFO: renamed from: y */
    private boolean m11997y(com.google.android.exoplayer2.util.gvn7 gvn7Var) {
        while (gvn7Var.m13594k() > 0) {
            int i2 = this.f64568f7l8 << 8;
            this.f64568f7l8 = i2;
            int iJp0y = i2 | gvn7Var.jp0y();
            this.f64568f7l8 = iJp0y;
            if (com.google.android.exoplayer2.audio.d2ok.m11397q(iJp0y)) {
                byte[] bArrM13598q = this.f20313k.m13598q();
                int i3 = this.f64568f7l8;
                bArrM13598q[0] = (byte) ((i3 >> 24) & 255);
                bArrM13598q[1] = (byte) ((i3 >> 16) & 255);
                bArrM13598q[2] = (byte) ((i3 >> 8) & 255);
                bArrM13598q[3] = (byte) (i3 & 255);
                this.f20312g = 4;
                this.f64568f7l8 = 0;
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.qrj
    /* JADX INFO: renamed from: g */
    public void mo11943g(long j2, int i2) {
        if (j2 != C3548p.f65257toq) {
            this.f64569ld6 = j2;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.qrj
    /* JADX INFO: renamed from: n */
    public void mo11944n() {
    }

    @Override // com.google.android.exoplayer2.extractor.ts.qrj
    /* JADX INFO: renamed from: q */
    public void mo11945q(com.google.android.exoplayer2.extractor.x2 x2Var, d3.C3406n c3406n) {
        c3406n.m11952k();
        this.f64571zy = c3406n.toq();
        this.f20316q = x2Var.toq(c3406n.zy(), 1);
    }

    @Override // com.google.android.exoplayer2.extractor.ts.qrj
    public void toq(com.google.android.exoplayer2.util.gvn7 gvn7Var) {
        C3844k.ld6(this.f20316q);
        while (gvn7Var.m13594k() > 0) {
            int i2 = this.f20314n;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException();
                    }
                    int iMin = Math.min(gvn7Var.m13594k(), this.f20315p - this.f20312g);
                    this.f20316q.zy(gvn7Var, iMin);
                    int i3 = this.f20312g + iMin;
                    this.f20312g = i3;
                    int i4 = this.f20315p;
                    if (i3 == i4) {
                        long j2 = this.f64569ld6;
                        if (j2 != C3548p.f65257toq) {
                            this.f20316q.mo11930n(j2, 1, i4, 0, null);
                            this.f64569ld6 += this.f20318y;
                        }
                        this.f20314n = 0;
                    }
                } else if (m11996k(gvn7Var, this.f20313k.m13598q(), 18)) {
                    f7l8();
                    this.f20313k.n5r1(0);
                    this.f20316q.zy(this.f20313k, 18);
                    this.f20314n = 2;
                }
            } else if (m11997y(gvn7Var)) {
                this.f20314n = 1;
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.qrj
    public void zy() {
        this.f20314n = 0;
        this.f20312g = 0;
        this.f64568f7l8 = 0;
        this.f64569ld6 = C3548p.f65257toq;
    }
}
