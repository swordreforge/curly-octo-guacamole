package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.extractor.ts.d3;
import com.google.android.exoplayer2.util.C3847l;
import com.google.android.exoplayer2.util.lrht;

/* JADX INFO: compiled from: SectionReader.java */
/* JADX INFO: loaded from: classes2.dex */
public final class mcp implements d3 {

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final int f64572ld6 = 32;

    /* JADX INFO: renamed from: p */
    private static final int f20319p = 3;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final int f64573x2 = 4098;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private int f64574f7l8;

    /* JADX INFO: renamed from: g */
    private int f20320g;

    /* JADX INFO: renamed from: n */
    private final com.google.android.exoplayer2.util.gvn7 f20321n = new com.google.android.exoplayer2.util.gvn7(32);

    /* JADX INFO: renamed from: q */
    private final InterfaceC3420t f20322q;

    /* JADX INFO: renamed from: s */
    private boolean f20323s;

    /* JADX INFO: renamed from: y */
    private boolean f20324y;

    public mcp(InterfaceC3420t interfaceC3420t) {
        this.f20322q = interfaceC3420t;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.d3
    /* JADX INFO: renamed from: k */
    public void mo11950k(C3847l c3847l, com.google.android.exoplayer2.extractor.x2 x2Var, d3.C3406n c3406n) {
        this.f20322q.mo11976k(c3847l, x2Var, c3406n);
        this.f20323s = true;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.d3
    public void toq(com.google.android.exoplayer2.util.gvn7 gvn7Var, int i2) {
        boolean z2 = (i2 & 1) != 0;
        int iM13596n = z2 ? gvn7Var.m13596n() + gvn7Var.jp0y() : -1;
        if (this.f20323s) {
            if (!z2) {
                return;
            }
            this.f20323s = false;
            gvn7Var.n5r1(iM13596n);
            this.f64574f7l8 = 0;
        }
        while (gvn7Var.m13594k() > 0) {
            int i3 = this.f64574f7l8;
            if (i3 < 3) {
                if (i3 == 0) {
                    int iJp0y = gvn7Var.jp0y();
                    gvn7Var.n5r1(gvn7Var.m13596n() - 1);
                    if (iJp0y == 255) {
                        this.f20323s = true;
                        return;
                    }
                }
                int iMin = Math.min(gvn7Var.m13594k(), 3 - this.f64574f7l8);
                gvn7Var.ld6(this.f20321n.m13598q(), this.f64574f7l8, iMin);
                int i4 = this.f64574f7l8 + iMin;
                this.f64574f7l8 = i4;
                if (i4 == 3) {
                    this.f20321n.n5r1(0);
                    this.f20321n.m13595l(3);
                    this.f20321n.hyr(1);
                    int iJp0y2 = this.f20321n.jp0y();
                    int iJp0y3 = this.f20321n.jp0y();
                    this.f20324y = (iJp0y2 & 128) != 0;
                    this.f20320g = (((iJp0y2 & 15) << 8) | iJp0y3) + 3;
                    int qVar = this.f20321n.toq();
                    int i5 = this.f20320g;
                    if (qVar < i5) {
                        this.f20321n.zy(Math.min(4098, Math.max(i5, this.f20321n.toq() * 2)));
                    }
                }
            } else {
                int iMin2 = Math.min(gvn7Var.m13594k(), this.f20320g - this.f64574f7l8);
                gvn7Var.ld6(this.f20321n.m13598q(), this.f64574f7l8, iMin2);
                int i6 = this.f64574f7l8 + iMin2;
                this.f64574f7l8 = i6;
                int i7 = this.f20320g;
                if (i6 != i7) {
                    continue;
                } else {
                    if (!this.f20324y) {
                        this.f20321n.m13595l(i7);
                    } else {
                        if (lrht.zurt(this.f20321n.m13598q(), 0, this.f20320g, -1) != 0) {
                            this.f20323s = true;
                            return;
                        }
                        this.f20321n.m13595l(this.f20320g - 4);
                    }
                    this.f20321n.n5r1(0);
                    this.f20322q.toq(this.f20321n);
                    this.f64574f7l8 = 0;
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.d3
    public void zy() {
        this.f20323s = true;
    }
}
