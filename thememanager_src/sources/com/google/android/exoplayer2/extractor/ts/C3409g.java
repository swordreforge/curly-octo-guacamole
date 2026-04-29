package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.C3548p;
import com.google.android.exoplayer2.audio.zy;
import com.google.android.exoplayer2.extractor.InterfaceC3401t;
import com.google.android.exoplayer2.extractor.ts.d3;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.xwq3;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import zy.dd;

/* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.ts.g */
/* JADX INFO: compiled from: Ac4Reader.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C3409g implements qrj {

    /* JADX INFO: renamed from: h */
    private static final int f20219h = 2;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private static final int f64447kja0 = 1;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private static final int f64448n7h = 0;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private int f64449f7l8;

    /* JADX INFO: renamed from: g */
    private int f20220g;

    /* JADX INFO: renamed from: k */
    private final com.google.android.exoplayer2.util.jp0y f20221k;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private xwq3 f64450ld6;

    /* JADX INFO: renamed from: n */
    private InterfaceC3401t f20222n;

    /* JADX INFO: renamed from: p */
    private long f20223p;

    /* JADX INFO: renamed from: q */
    private String f20224q;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private long f64451qrj;

    /* JADX INFO: renamed from: s */
    private boolean f20225s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final com.google.android.exoplayer2.util.gvn7 f64452toq;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private int f64453x2;

    /* JADX INFO: renamed from: y */
    private boolean f20226y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @dd
    private final String f64454zy;

    public C3409g() {
        this(null);
    }

    @RequiresNonNull({"output"})
    private void f7l8() {
        this.f20221k.cdj(0);
        zy.toq toqVarM11544q = com.google.android.exoplayer2.audio.zy.m11544q(this.f20221k);
        xwq3 xwq3Var = this.f64450ld6;
        if (xwq3Var == null || toqVarM11544q.f63541zy != xwq3Var.f23686v || toqVarM11544q.f63540toq != xwq3Var.f23668d || !com.google.android.exoplayer2.util.wvg.f67097dd.equals(xwq3Var.f23682r)) {
            xwq3 xwq3VarA9 = new xwq3.toq().n5r1(this.f20224q).m13945m(com.google.android.exoplayer2.util.wvg.f67097dd).gvn7(toqVarM11544q.f63541zy).ek5k(toqVarM11544q.f63540toq).m13940c(this.f64454zy).a9();
            this.f64450ld6 = xwq3VarA9;
            this.f20222n.mo11931q(xwq3VarA9);
        }
        this.f64453x2 = toqVarM11544q.f19523q;
        this.f20223p = (((long) toqVarM11544q.f19522n) * 1000000) / ((long) this.f64450ld6.f23668d);
    }

    /* JADX INFO: renamed from: k */
    private boolean m11966k(com.google.android.exoplayer2.util.gvn7 gvn7Var, byte[] bArr, int i2) {
        int iMin = Math.min(gvn7Var.m13594k(), i2 - this.f64449f7l8);
        gvn7Var.ld6(bArr, this.f64449f7l8, iMin);
        int i3 = this.f64449f7l8 + iMin;
        this.f64449f7l8 = i3;
        return i3 == i2;
    }

    /* JADX INFO: renamed from: y */
    private boolean m11967y(com.google.android.exoplayer2.util.gvn7 gvn7Var) {
        int iJp0y;
        while (true) {
            if (gvn7Var.m13594k() <= 0) {
                return false;
            }
            if (this.f20226y) {
                iJp0y = gvn7Var.jp0y();
                this.f20226y = iJp0y == 172;
                if (iJp0y == 64 || iJp0y == 65) {
                    break;
                }
            } else {
                this.f20226y = gvn7Var.jp0y() == 172;
            }
        }
        this.f20225s = iJp0y == 65;
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.qrj
    /* JADX INFO: renamed from: g */
    public void mo11943g(long j2, int i2) {
        if (j2 != C3548p.f65257toq) {
            this.f64451qrj = j2;
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
        this.f20224q = c3406n.toq();
        this.f20222n = x2Var.toq(c3406n.zy(), 1);
    }

    @Override // com.google.android.exoplayer2.extractor.ts.qrj
    public void toq(com.google.android.exoplayer2.util.gvn7 gvn7Var) {
        C3844k.ld6(this.f20222n);
        while (gvn7Var.m13594k() > 0) {
            int i2 = this.f20220g;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        int iMin = Math.min(gvn7Var.m13594k(), this.f64453x2 - this.f64449f7l8);
                        this.f20222n.zy(gvn7Var, iMin);
                        int i3 = this.f64449f7l8 + iMin;
                        this.f64449f7l8 = i3;
                        int i4 = this.f64453x2;
                        if (i3 == i4) {
                            long j2 = this.f64451qrj;
                            if (j2 != C3548p.f65257toq) {
                                this.f20222n.mo11930n(j2, 1, i4, 0, null);
                                this.f64451qrj += this.f20223p;
                            }
                            this.f20220g = 0;
                        }
                    }
                } else if (m11966k(gvn7Var, this.f64452toq.m13598q(), 16)) {
                    f7l8();
                    this.f64452toq.n5r1(0);
                    this.f20222n.zy(this.f64452toq, 16);
                    this.f20220g = 2;
                }
            } else if (m11967y(gvn7Var)) {
                this.f20220g = 1;
                this.f64452toq.m13598q()[0] = -84;
                this.f64452toq.m13598q()[1] = (byte) (this.f20225s ? 65 : 64);
                this.f64449f7l8 = 2;
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.qrj
    public void zy() {
        this.f20220g = 0;
        this.f64449f7l8 = 0;
        this.f20226y = false;
        this.f20225s = false;
        this.f64451qrj = C3548p.f65257toq;
    }

    public C3409g(@dd String str) {
        com.google.android.exoplayer2.util.jp0y jp0yVar = new com.google.android.exoplayer2.util.jp0y(new byte[16]);
        this.f20221k = jp0yVar;
        this.f64452toq = new com.google.android.exoplayer2.util.gvn7(jp0yVar.f23205k);
        this.f20220g = 0;
        this.f64449f7l8 = 0;
        this.f20226y = false;
        this.f20225s = false;
        this.f64451qrj = C3548p.f65257toq;
        this.f64454zy = str;
    }
}
