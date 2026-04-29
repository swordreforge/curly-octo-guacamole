package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.C3548p;
import com.google.android.exoplayer2.audio.x9kr;
import com.google.android.exoplayer2.extractor.InterfaceC3401t;
import com.google.android.exoplayer2.extractor.ts.d3;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.xwq3;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import zy.dd;

/* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.ts.i */
/* JADX INFO: compiled from: MpegAudioReader.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C3412i implements qrj {

    /* JADX INFO: renamed from: h */
    private static final int f20276h = 4;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private static final int f64533kja0 = 2;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private static final int f64534n7h = 1;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static final int f64535qrj = 0;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private int f64536f7l8;

    /* JADX INFO: renamed from: g */
    private int f20277g;

    /* JADX INFO: renamed from: k */
    private final com.google.android.exoplayer2.util.gvn7 f20278k;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private int f64537ld6;

    /* JADX INFO: renamed from: n */
    private String f20279n;

    /* JADX INFO: renamed from: p */
    private long f20280p;

    /* JADX INFO: renamed from: q */
    private InterfaceC3401t f20281q;

    /* JADX INFO: renamed from: s */
    private boolean f20282s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final x9kr.C3269k f64538toq;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private long f64539x2;

    /* JADX INFO: renamed from: y */
    private boolean f20283y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @dd
    private final String f64540zy;

    public C3412i() {
        this(null);
    }

    @RequiresNonNull({"output"})
    private void f7l8(com.google.android.exoplayer2.util.gvn7 gvn7Var) {
        int iMin = Math.min(gvn7Var.m13594k(), this.f64537ld6 - this.f64536f7l8);
        this.f20281q.zy(gvn7Var, iMin);
        int i2 = this.f64536f7l8 + iMin;
        this.f64536f7l8 = i2;
        int i3 = this.f64537ld6;
        if (i2 < i3) {
            return;
        }
        long j2 = this.f64539x2;
        if (j2 != C3548p.f65257toq) {
            this.f20281q.mo11930n(j2, 1, i3, 0, null);
            this.f64539x2 += this.f20280p;
        }
        this.f64536f7l8 = 0;
        this.f20277g = 0;
    }

    /* JADX INFO: renamed from: k */
    private void m11989k(com.google.android.exoplayer2.util.gvn7 gvn7Var) {
        byte[] bArrM13598q = gvn7Var.m13598q();
        int iM13591g = gvn7Var.m13591g();
        for (int iM13596n = gvn7Var.m13596n(); iM13596n < iM13591g; iM13596n++) {
            byte b2 = bArrM13598q[iM13596n];
            boolean z2 = (b2 & 255) == 255;
            boolean z3 = this.f20282s && (b2 & 224) == 224;
            this.f20282s = z2;
            if (z3) {
                gvn7Var.n5r1(iM13596n + 1);
                this.f20282s = false;
                this.f20278k.m13598q()[1] = bArrM13598q[iM13596n];
                this.f64536f7l8 = 2;
                this.f20277g = 1;
                return;
            }
        }
        gvn7Var.n5r1(iM13591g);
    }

    @RequiresNonNull({"output"})
    /* JADX INFO: renamed from: y */
    private void m11990y(com.google.android.exoplayer2.util.gvn7 gvn7Var) {
        int iMin = Math.min(gvn7Var.m13594k(), 4 - this.f64536f7l8);
        gvn7Var.ld6(this.f20278k.m13598q(), this.f64536f7l8, iMin);
        int i2 = this.f64536f7l8 + iMin;
        this.f64536f7l8 = i2;
        if (i2 < 4) {
            return;
        }
        this.f20278k.n5r1(0);
        if (!this.f64538toq.m11535k(this.f20278k.kja0())) {
            this.f64536f7l8 = 0;
            this.f20277g = 1;
            return;
        }
        x9kr.C3269k c3269k = this.f64538toq;
        this.f64537ld6 = c3269k.f63529zy;
        if (!this.f20283y) {
            this.f20280p = (((long) c3269k.f63527f7l8) * 1000000) / ((long) c3269k.f19508q);
            this.f20281q.mo11931q(new xwq3.toq().n5r1(this.f20279n).m13945m(this.f64538toq.f63528toq).lrht(4096).gvn7(this.f64538toq.f19507n).ek5k(this.f64538toq.f19508q).m13940c(this.f64540zy).a9());
            this.f20283y = true;
        }
        this.f20278k.n5r1(0);
        this.f20281q.zy(this.f20278k, 4);
        this.f20277g = 2;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.qrj
    /* JADX INFO: renamed from: g */
    public void mo11943g(long j2, int i2) {
        if (j2 != C3548p.f65257toq) {
            this.f64539x2 = j2;
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
        this.f20279n = c3406n.toq();
        this.f20281q = x2Var.toq(c3406n.zy(), 1);
    }

    @Override // com.google.android.exoplayer2.extractor.ts.qrj
    public void toq(com.google.android.exoplayer2.util.gvn7 gvn7Var) {
        C3844k.ld6(this.f20281q);
        while (gvn7Var.m13594k() > 0) {
            int i2 = this.f20277g;
            if (i2 == 0) {
                m11989k(gvn7Var);
            } else if (i2 == 1) {
                m11990y(gvn7Var);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException();
                }
                f7l8(gvn7Var);
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.qrj
    public void zy() {
        this.f20277g = 0;
        this.f64536f7l8 = 0;
        this.f20282s = false;
        this.f64539x2 = C3548p.f65257toq;
    }

    public C3412i(@dd String str) {
        this.f20277g = 0;
        com.google.android.exoplayer2.util.gvn7 gvn7Var = new com.google.android.exoplayer2.util.gvn7(4);
        this.f20278k = gvn7Var;
        gvn7Var.m13598q()[0] = -1;
        this.f64538toq = new x9kr.C3269k();
        this.f64539x2 = C3548p.f65257toq;
        this.f64540zy = str;
    }
}
