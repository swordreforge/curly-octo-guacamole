package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.C3548p;
import com.google.android.exoplayer2.audio.C3258k;
import com.google.android.exoplayer2.extractor.InterfaceC3401t;
import com.google.android.exoplayer2.extractor.ts.d3;
import com.google.android.exoplayer2.sok;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.xwq3;
import java.util.Collections;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import zy.dd;

/* JADX INFO: compiled from: LatmReader.java */
/* JADX INFO: loaded from: classes2.dex */
public final class t8r implements qrj {

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    private static final int f64633fu4 = 2;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    private static final int f64634ni7 = 1;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    private static final int f64635o1t = 1024;

    /* JADX INFO: renamed from: t */
    private static final int f20369t = 224;

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    private static final int f64636wvg = 86;

    /* JADX INFO: renamed from: z */
    private static final int f20370z = 3;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private static final int f64637zurt = 0;

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private long f64638cdj;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private int f64639f7l8;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    @dd
    private String f64640fn3e;

    /* JADX INFO: renamed from: g */
    private xwq3 f20371g;

    /* JADX INFO: renamed from: h */
    private boolean f20372h;

    /* JADX INFO: renamed from: i */
    private int f20373i;

    /* JADX INFO: renamed from: k */
    @dd
    private final String f20374k;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private int f64641ki;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private int f64642kja0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private long f64643ld6;

    /* JADX INFO: renamed from: n */
    private String f20375n;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private int f64644n7h;

    /* JADX INFO: renamed from: p */
    private int f20376p;

    /* JADX INFO: renamed from: q */
    private InterfaceC3401t f20377q;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private int f64645qrj;

    /* JADX INFO: renamed from: s */
    private int f20378s;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private long f64646t8r;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final com.google.android.exoplayer2.util.gvn7 f64647toq;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private boolean f64648x2;

    /* JADX INFO: renamed from: y */
    private int f20379y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final com.google.android.exoplayer2.util.jp0y f64649zy;

    public t8r(@dd String str) {
        this.f20374k = str;
        com.google.android.exoplayer2.util.gvn7 gvn7Var = new com.google.android.exoplayer2.util.gvn7(1024);
        this.f64647toq = gvn7Var;
        this.f64649zy = new com.google.android.exoplayer2.util.jp0y(gvn7Var.m13598q());
        this.f64643ld6 = C3548p.f65257toq;
    }

    @RequiresNonNull({"output"})
    private void f7l8(com.google.android.exoplayer2.util.jp0y jp0yVar) throws sok {
        if (!jp0yVar.f7l8()) {
            this.f64648x2 = true;
            x2(jp0yVar);
        } else if (!this.f64648x2) {
            return;
        }
        if (this.f64645qrj != 0) {
            throw sok.createForMalformedContainer(null, null);
        }
        if (this.f64644n7h != 0) {
            throw sok.createForMalformedContainer(null, null);
        }
        ld6(jp0yVar, m12017p(jp0yVar));
        if (this.f20372h) {
            jp0yVar.t8r((int) this.f64638cdj);
        }
    }

    /* JADX INFO: renamed from: k */
    private static long m12016k(com.google.android.exoplayer2.util.jp0y jp0yVar) {
        return jp0yVar.m13627y((jp0yVar.m13627y(2) + 1) * 8);
    }

    @RequiresNonNull({"output"})
    private void ld6(com.google.android.exoplayer2.util.jp0y jp0yVar, int i2) {
        int iM13623n = jp0yVar.m13623n();
        if ((iM13623n & 7) == 0) {
            this.f64647toq.n5r1(iM13623n >> 3);
        } else {
            jp0yVar.m13626s(this.f64647toq.m13598q(), 0, i2 * 8);
            this.f64647toq.n5r1(0);
        }
        this.f20377q.zy(this.f64647toq, i2);
        long j2 = this.f64643ld6;
        if (j2 != C3548p.f65257toq) {
            this.f20377q.mo11930n(j2, 1, i2, 0, null);
            this.f64643ld6 += this.f64646t8r;
        }
    }

    /* JADX INFO: renamed from: p */
    private int m12017p(com.google.android.exoplayer2.util.jp0y jp0yVar) throws sok {
        int iM13627y;
        if (this.f64642kja0 != 0) {
            throw sok.createForMalformedContainer(null, null);
        }
        int i2 = 0;
        do {
            iM13627y = jp0yVar.m13627y(8);
            i2 += iM13627y;
        } while (iM13627y == 255);
        return i2;
    }

    private void qrj(int i2) {
        this.f64647toq.dd(i2);
        this.f64649zy.kja0(this.f64647toq.m13598q());
    }

    /* JADX INFO: renamed from: s */
    private void m12018s(com.google.android.exoplayer2.util.jp0y jp0yVar) {
        int iM13627y = jp0yVar.m13627y(3);
        this.f64642kja0 = iM13627y;
        if (iM13627y == 0) {
            jp0yVar.t8r(8);
            return;
        }
        if (iM13627y == 1) {
            jp0yVar.t8r(9);
            return;
        }
        if (iM13627y == 3 || iM13627y == 4 || iM13627y == 5) {
            jp0yVar.t8r(6);
        } else {
            if (iM13627y != 6 && iM13627y != 7) {
                throw new IllegalStateException();
            }
            jp0yVar.t8r(1);
        }
    }

    @RequiresNonNull({"output"})
    private void x2(com.google.android.exoplayer2.util.jp0y jp0yVar) throws sok {
        boolean zF7l8;
        int iM13627y = jp0yVar.m13627y(1);
        int iM13627y2 = iM13627y == 1 ? jp0yVar.m13627y(1) : 0;
        this.f64645qrj = iM13627y2;
        if (iM13627y2 != 0) {
            throw sok.createForMalformedContainer(null, null);
        }
        if (iM13627y == 1) {
            m12016k(jp0yVar);
        }
        if (!jp0yVar.f7l8()) {
            throw sok.createForMalformedContainer(null, null);
        }
        this.f64644n7h = jp0yVar.m13627y(6);
        int iM13627y3 = jp0yVar.m13627y(4);
        int iM13627y4 = jp0yVar.m13627y(3);
        if (iM13627y3 != 0 || iM13627y4 != 0) {
            throw sok.createForMalformedContainer(null, null);
        }
        if (iM13627y == 0) {
            int iM13623n = jp0yVar.m13623n();
            int iM12019y = m12019y(jp0yVar);
            jp0yVar.cdj(iM13623n);
            byte[] bArr = new byte[(iM12019y + 7) / 8];
            jp0yVar.m13626s(bArr, 0, iM12019y);
            xwq3 xwq3VarA9 = new xwq3.toq().n5r1(this.f20375n).m13945m(com.google.android.exoplayer2.util.wvg.f67142wvg).d3(this.f64640fn3e).gvn7(this.f20373i).ek5k(this.f64641ki).hyr(Collections.singletonList(bArr)).m13940c(this.f20374k).a9();
            if (!xwq3VarA9.equals(this.f20371g)) {
                this.f20371g = xwq3VarA9;
                this.f64646t8r = 1024000000 / ((long) xwq3VarA9.f23668d);
                this.f20377q.mo11931q(xwq3VarA9);
            }
        } else {
            jp0yVar.t8r(((int) m12016k(jp0yVar)) - m12019y(jp0yVar));
        }
        m12018s(jp0yVar);
        boolean zF7l82 = jp0yVar.f7l8();
        this.f20372h = zF7l82;
        this.f64638cdj = 0L;
        if (zF7l82) {
            if (iM13627y == 1) {
                this.f64638cdj = m12016k(jp0yVar);
            } else {
                do {
                    zF7l8 = jp0yVar.f7l8();
                    this.f64638cdj = (this.f64638cdj << 8) + ((long) jp0yVar.m13627y(8));
                } while (zF7l8);
            }
        }
        if (jp0yVar.f7l8()) {
            jp0yVar.t8r(8);
        }
    }

    /* JADX INFO: renamed from: y */
    private int m12019y(com.google.android.exoplayer2.util.jp0y jp0yVar) throws sok {
        int qVar = jp0yVar.toq();
        C3258k.zy zyVarM11489n = C3258k.m11489n(jp0yVar, true);
        this.f64640fn3e = zyVarM11489n.f63464zy;
        this.f64641ki = zyVarM11489n.f19408k;
        this.f20373i = zyVarM11489n.f63463toq;
        return qVar - jp0yVar.toq();
    }

    @Override // com.google.android.exoplayer2.extractor.ts.qrj
    /* JADX INFO: renamed from: g */
    public void mo11943g(long j2, int i2) {
        if (j2 != C3548p.f65257toq) {
            this.f64643ld6 = j2;
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
        this.f20377q = x2Var.toq(c3406n.zy(), 1);
        this.f20375n = c3406n.toq();
    }

    @Override // com.google.android.exoplayer2.extractor.ts.qrj
    public void toq(com.google.android.exoplayer2.util.gvn7 gvn7Var) throws sok {
        C3844k.ld6(this.f20377q);
        while (gvn7Var.m13594k() > 0) {
            int i2 = this.f64639f7l8;
            if (i2 != 0) {
                if (i2 == 1) {
                    int iJp0y = gvn7Var.jp0y();
                    if ((iJp0y & 224) == 224) {
                        this.f20376p = iJp0y;
                        this.f64639f7l8 = 2;
                    } else if (iJp0y != 86) {
                        this.f64639f7l8 = 0;
                    }
                } else if (i2 == 2) {
                    int iJp0y2 = ((this.f20376p & (-225)) << 8) | gvn7Var.jp0y();
                    this.f20378s = iJp0y2;
                    if (iJp0y2 > this.f64647toq.m13598q().length) {
                        qrj(this.f20378s);
                    }
                    this.f20379y = 0;
                    this.f64639f7l8 = 3;
                } else {
                    if (i2 != 3) {
                        throw new IllegalStateException();
                    }
                    int iMin = Math.min(gvn7Var.m13594k(), this.f20378s - this.f20379y);
                    gvn7Var.ld6(this.f64649zy.f23205k, this.f20379y, iMin);
                    int i3 = this.f20379y + iMin;
                    this.f20379y = i3;
                    if (i3 == this.f20378s) {
                        this.f64649zy.cdj(0);
                        f7l8(this.f64649zy);
                        this.f64639f7l8 = 0;
                    }
                }
            } else if (gvn7Var.jp0y() == 86) {
                this.f64639f7l8 = 1;
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.qrj
    public void zy() {
        this.f64639f7l8 = 0;
        this.f64643ld6 = C3548p.f65257toq;
        this.f64648x2 = false;
    }
}
