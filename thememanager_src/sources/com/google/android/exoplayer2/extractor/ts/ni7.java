package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.C3548p;
import com.google.android.exoplayer2.extractor.ts.d3;
import com.google.android.exoplayer2.sok;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.C3847l;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import zy.dd;

/* JADX INFO: compiled from: PesReader.java */
/* JADX INFO: loaded from: classes2.dex */
public final class ni7 implements d3 {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private static final int f64591cdj = 0;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private static final int f64592fn3e = 9;

    /* JADX INFO: renamed from: h */
    private static final String f20343h = "PesReader";

    /* JADX INFO: renamed from: i */
    private static final int f20344i = 3;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private static final int f64593ki = 1;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    private static final int f64594ni7 = 10;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private static final int f64595t8r = 2;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private static final int f64596zurt = 10;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private int f64597f7l8;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private long f64598kja0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private boolean f64599ld6;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private boolean f64600n7h;

    /* JADX INFO: renamed from: p */
    private boolean f20347p;

    /* JADX INFO: renamed from: q */
    private final qrj f20348q;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private int f64601qrj;

    /* JADX INFO: renamed from: s */
    private boolean f20349s;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private int f64602x2;

    /* JADX INFO: renamed from: y */
    private C3847l f20350y;

    /* JADX INFO: renamed from: n */
    private final com.google.android.exoplayer2.util.jp0y f20346n = new com.google.android.exoplayer2.util.jp0y(new byte[10]);

    /* JADX INFO: renamed from: g */
    private int f20345g = 0;

    public ni7(qrj qrjVar) {
        this.f20348q = qrjVar;
    }

    private void f7l8(int i2) {
        this.f20345g = i2;
        this.f64597f7l8 = 0;
    }

    @RequiresNonNull({"timestampAdjuster"})
    /* JADX INFO: renamed from: g */
    private void m12002g() {
        this.f20346n.cdj(0);
        this.f64598kja0 = C3548p.f65257toq;
        if (this.f20349s) {
            this.f20346n.t8r(4);
            long jM13627y = ((long) this.f20346n.m13627y(3)) << 30;
            this.f20346n.t8r(1);
            long jM13627y2 = jM13627y | ((long) (this.f20346n.m13627y(15) << 15));
            this.f20346n.t8r(1);
            long jM13627y3 = jM13627y2 | ((long) this.f20346n.m13627y(15));
            this.f20346n.t8r(1);
            if (!this.f64599ld6 && this.f20347p) {
                this.f20346n.t8r(4);
                long jM13627y4 = ((long) this.f20346n.m13627y(3)) << 30;
                this.f20346n.t8r(1);
                long jM13627y5 = jM13627y4 | ((long) (this.f20346n.m13627y(15) << 15));
                this.f20346n.t8r(1);
                long jM13627y6 = jM13627y5 | ((long) this.f20346n.m13627y(15));
                this.f20346n.t8r(1);
                this.f20350y.toq(jM13627y6);
                this.f64599ld6 = true;
            }
            this.f64598kja0 = this.f20350y.toq(jM13627y3);
        }
    }

    /* JADX INFO: renamed from: n */
    private boolean m12003n() {
        this.f20346n.cdj(0);
        int iM13627y = this.f20346n.m13627y(24);
        if (iM13627y != 1) {
            StringBuilder sb = new StringBuilder(41);
            sb.append("Unexpected start code prefix: ");
            sb.append(iM13627y);
            com.google.android.exoplayer2.util.ni7.qrj(f20343h, sb.toString());
            this.f64601qrj = -1;
            return false;
        }
        this.f20346n.t8r(8);
        int iM13627y2 = this.f20346n.m13627y(16);
        this.f20346n.t8r(5);
        this.f64600n7h = this.f20346n.f7l8();
        this.f20346n.t8r(2);
        this.f20349s = this.f20346n.f7l8();
        this.f20347p = this.f20346n.f7l8();
        this.f20346n.t8r(6);
        int iM13627y3 = this.f20346n.m13627y(8);
        this.f64602x2 = iM13627y3;
        if (iM13627y2 == 0) {
            this.f64601qrj = -1;
        } else {
            int i2 = ((iM13627y2 + 6) - 9) - iM13627y3;
            this.f64601qrj = i2;
            if (i2 < 0) {
                StringBuilder sb2 = new StringBuilder(47);
                sb2.append("Found negative packet payload size: ");
                sb2.append(i2);
                com.google.android.exoplayer2.util.ni7.qrj(f20343h, sb2.toString());
                this.f64601qrj = -1;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: q */
    private boolean m12004q(com.google.android.exoplayer2.util.gvn7 gvn7Var, @dd byte[] bArr, int i2) {
        int iMin = Math.min(gvn7Var.m13594k(), i2 - this.f64597f7l8);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            gvn7Var.hyr(iMin);
        } else {
            gvn7Var.ld6(bArr, this.f64597f7l8, iMin);
        }
        int i3 = this.f64597f7l8 + iMin;
        this.f64597f7l8 = i3;
        return i3 == i2;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.d3
    /* JADX INFO: renamed from: k */
    public void mo11950k(C3847l c3847l, com.google.android.exoplayer2.extractor.x2 x2Var, d3.C3406n c3406n) {
        this.f20350y = c3847l;
        this.f20348q.mo11945q(x2Var, c3406n);
    }

    @Override // com.google.android.exoplayer2.extractor.ts.d3
    public final void toq(com.google.android.exoplayer2.util.gvn7 gvn7Var, int i2) throws sok {
        C3844k.ld6(this.f20350y);
        if ((i2 & 1) != 0) {
            int i3 = this.f20345g;
            if (i3 != 0 && i3 != 1) {
                if (i3 == 2) {
                    com.google.android.exoplayer2.util.ni7.qrj(f20343h, "Unexpected start indicator reading extended header");
                } else {
                    if (i3 != 3) {
                        throw new IllegalStateException();
                    }
                    int i4 = this.f64601qrj;
                    if (i4 != -1) {
                        StringBuilder sb = new StringBuilder(59);
                        sb.append("Unexpected start indicator: expected ");
                        sb.append(i4);
                        sb.append(" more bytes");
                        com.google.android.exoplayer2.util.ni7.qrj(f20343h, sb.toString());
                    }
                    this.f20348q.mo11944n();
                }
            }
            f7l8(1);
        }
        while (gvn7Var.m13594k() > 0) {
            int i5 = this.f20345g;
            if (i5 != 0) {
                if (i5 != 1) {
                    if (i5 == 2) {
                        if (m12004q(gvn7Var, this.f20346n.f23205k, Math.min(10, this.f64602x2)) && m12004q(gvn7Var, null, this.f64602x2)) {
                            m12002g();
                            i2 |= this.f64600n7h ? 4 : 0;
                            this.f20348q.mo11943g(this.f64598kja0, i2);
                            f7l8(3);
                        }
                    } else {
                        if (i5 != 3) {
                            throw new IllegalStateException();
                        }
                        int iM13594k = gvn7Var.m13594k();
                        int i6 = this.f64601qrj;
                        int i7 = i6 != -1 ? iM13594k - i6 : 0;
                        if (i7 > 0) {
                            iM13594k -= i7;
                            gvn7Var.m13595l(gvn7Var.m13596n() + iM13594k);
                        }
                        this.f20348q.toq(gvn7Var);
                        int i8 = this.f64601qrj;
                        if (i8 != -1) {
                            int i9 = i8 - iM13594k;
                            this.f64601qrj = i9;
                            if (i9 == 0) {
                                this.f20348q.mo11944n();
                                f7l8(1);
                            }
                        }
                    }
                } else if (m12004q(gvn7Var, this.f20346n.f23205k, 9)) {
                    f7l8(m12003n() ? 2 : 0);
                }
            } else {
                gvn7Var.hyr(gvn7Var.m13594k());
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.d3
    public final void zy() {
        this.f20345g = 0;
        this.f64597f7l8 = 0;
        this.f64599ld6 = false;
        this.f20348q.zy();
    }
}
