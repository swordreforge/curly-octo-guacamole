package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.C3548p;
import com.google.android.exoplayer2.audio.toq;
import com.google.android.exoplayer2.extractor.InterfaceC3401t;
import com.google.android.exoplayer2.extractor.ts.d3;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.lrht;
import com.google.android.exoplayer2.xwq3;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import zy.dd;

/* JADX INFO: compiled from: Ac3Reader.java */
/* JADX INFO: loaded from: classes2.dex */
public final class zy implements qrj {

    /* JADX INFO: renamed from: h */
    private static final int f20421h = 128;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private static final int f64686kja0 = 2;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private static final int f64687n7h = 1;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static final int f64688qrj = 0;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private int f64689f7l8;

    /* JADX INFO: renamed from: g */
    private int f20422g;

    /* JADX INFO: renamed from: k */
    private final com.google.android.exoplayer2.util.jp0y f20423k;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private int f64690ld6;

    /* JADX INFO: renamed from: n */
    private InterfaceC3401t f20424n;

    /* JADX INFO: renamed from: p */
    private xwq3 f20425p;

    /* JADX INFO: renamed from: q */
    private String f20426q;

    /* JADX INFO: renamed from: s */
    private long f20427s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final com.google.android.exoplayer2.util.gvn7 f64691toq;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private long f64692x2;

    /* JADX INFO: renamed from: y */
    private boolean f20428y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @dd
    private final String f64693zy;

    public zy() {
        this(null);
    }

    @RequiresNonNull({"output"})
    private void f7l8() {
        this.f20423k.cdj(0);
        toq.C7951toq c7951toqM11523n = com.google.android.exoplayer2.audio.toq.m11523n(this.f20423k);
        xwq3 xwq3Var = this.f20425p;
        if (xwq3Var == null || c7951toqM11523n.f19485q != xwq3Var.f23686v || c7951toqM11523n.f63515zy != xwq3Var.f23668d || !lrht.zy(c7951toqM11523n.f19483k, xwq3Var.f23682r)) {
            xwq3 xwq3VarA9 = new xwq3.toq().n5r1(this.f20426q).m13945m(c7951toqM11523n.f19483k).gvn7(c7951toqM11523n.f19485q).ek5k(c7951toqM11523n.f63515zy).m13940c(this.f64693zy).a9();
            this.f20425p = xwq3VarA9;
            this.f20424n.mo11931q(xwq3VarA9);
        }
        this.f64690ld6 = c7951toqM11523n.f19484n;
        this.f20427s = (((long) c7951toqM11523n.f19482g) * 1000000) / ((long) this.f20425p.f23668d);
    }

    /* JADX INFO: renamed from: k */
    private boolean m12039k(com.google.android.exoplayer2.util.gvn7 gvn7Var, byte[] bArr, int i2) {
        int iMin = Math.min(gvn7Var.m13594k(), i2 - this.f64689f7l8);
        gvn7Var.ld6(bArr, this.f64689f7l8, iMin);
        int i3 = this.f64689f7l8 + iMin;
        this.f64689f7l8 = i3;
        return i3 == i2;
    }

    /* JADX INFO: renamed from: y */
    private boolean m12040y(com.google.android.exoplayer2.util.gvn7 gvn7Var) {
        while (true) {
            if (gvn7Var.m13594k() <= 0) {
                return false;
            }
            if (this.f20428y) {
                int iJp0y = gvn7Var.jp0y();
                if (iJp0y == 119) {
                    this.f20428y = false;
                    return true;
                }
                this.f20428y = iJp0y == 11;
            } else {
                this.f20428y = gvn7Var.jp0y() == 11;
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.qrj
    /* JADX INFO: renamed from: g */
    public void mo11943g(long j2, int i2) {
        if (j2 != C3548p.f65257toq) {
            this.f64692x2 = j2;
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
        this.f20426q = c3406n.toq();
        this.f20424n = x2Var.toq(c3406n.zy(), 1);
    }

    @Override // com.google.android.exoplayer2.extractor.ts.qrj
    public void toq(com.google.android.exoplayer2.util.gvn7 gvn7Var) {
        C3844k.ld6(this.f20424n);
        while (gvn7Var.m13594k() > 0) {
            int i2 = this.f20422g;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        int iMin = Math.min(gvn7Var.m13594k(), this.f64690ld6 - this.f64689f7l8);
                        this.f20424n.zy(gvn7Var, iMin);
                        int i3 = this.f64689f7l8 + iMin;
                        this.f64689f7l8 = i3;
                        int i4 = this.f64690ld6;
                        if (i3 == i4) {
                            long j2 = this.f64692x2;
                            if (j2 != C3548p.f65257toq) {
                                this.f20424n.mo11930n(j2, 1, i4, 0, null);
                                this.f64692x2 += this.f20427s;
                            }
                            this.f20422g = 0;
                        }
                    }
                } else if (m12039k(gvn7Var, this.f64691toq.m13598q(), 128)) {
                    f7l8();
                    this.f64691toq.n5r1(0);
                    this.f20424n.zy(this.f64691toq, 128);
                    this.f20422g = 2;
                }
            } else if (m12040y(gvn7Var)) {
                this.f20422g = 1;
                this.f64691toq.m13598q()[0] = com.google.common.base.zy.f68132qrj;
                this.f64691toq.m13598q()[1] = 119;
                this.f64689f7l8 = 2;
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.qrj
    public void zy() {
        this.f20422g = 0;
        this.f64689f7l8 = 0;
        this.f20428y = false;
        this.f64692x2 = C3548p.f65257toq;
    }

    public zy(@dd String str) {
        com.google.android.exoplayer2.util.jp0y jp0yVar = new com.google.android.exoplayer2.util.jp0y(new byte[128]);
        this.f20423k = jp0yVar;
        this.f64691toq = new com.google.android.exoplayer2.util.gvn7(jp0yVar.f23205k);
        this.f20422g = 0;
        this.f64692x2 = C3548p.f65257toq;
        this.f64693zy = str;
    }
}
