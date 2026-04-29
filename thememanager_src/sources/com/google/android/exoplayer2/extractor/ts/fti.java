package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.C3548p;
import com.google.android.exoplayer2.util.C3847l;
import com.google.android.exoplayer2.util.lrht;
import java.io.IOException;

/* JADX INFO: compiled from: TsDurationReader.java */
/* JADX INFO: loaded from: classes2.dex */
final class fti {

    /* JADX INFO: renamed from: p */
    private static final String f20209p = "TsDurationReader";

    /* JADX INFO: renamed from: g */
    private boolean f20210g;

    /* JADX INFO: renamed from: k */
    private final int f20211k;

    /* JADX INFO: renamed from: n */
    private boolean f20212n;

    /* JADX INFO: renamed from: q */
    private boolean f20213q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final C3847l f64443toq = new C3847l(0);

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private long f64442f7l8 = C3548p.f65257toq;

    /* JADX INFO: renamed from: y */
    private long f20215y = C3548p.f65257toq;

    /* JADX INFO: renamed from: s */
    private long f20214s = C3548p.f65257toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final com.google.android.exoplayer2.util.gvn7 f64444zy = new com.google.android.exoplayer2.util.gvn7();

    fti(int i2) {
        this.f20211k = i2;
    }

    private long f7l8(com.google.android.exoplayer2.util.gvn7 gvn7Var, int i2) {
        int iM13591g = gvn7Var.m13591g();
        for (int iM13596n = gvn7Var.m13596n(); iM13596n < iM13591g; iM13596n++) {
            if (gvn7Var.m13598q()[iM13596n] == 71) {
                long jZy = oc.zy(gvn7Var, iM13596n, i2);
                if (jZy != C3548p.f65257toq) {
                    return jZy;
                }
            }
        }
        return C3548p.f65257toq;
    }

    /* JADX INFO: renamed from: g */
    private int m11958g(com.google.android.exoplayer2.extractor.ld6 ld6Var, com.google.android.exoplayer2.extractor.fu4 fu4Var, int i2) throws IOException {
        int iMin = (int) Math.min(this.f20211k, ld6Var.getLength());
        long j2 = 0;
        if (ld6Var.getPosition() != j2) {
            fu4Var.f19818k = j2;
            return 1;
        }
        this.f64444zy.dd(iMin);
        ld6Var.mo11730y();
        ld6Var.fn3e(this.f64444zy.m13598q(), 0, iMin);
        this.f64442f7l8 = f7l8(this.f64444zy, i2);
        this.f20212n = true;
        return 0;
    }

    /* JADX INFO: renamed from: k */
    private int m11959k(com.google.android.exoplayer2.extractor.ld6 ld6Var) {
        this.f64444zy.x9kr(lrht.f23228g);
        this.f20213q = true;
        ld6Var.mo11730y();
        return 0;
    }

    /* JADX INFO: renamed from: s */
    private long m11960s(com.google.android.exoplayer2.util.gvn7 gvn7Var, int i2) {
        int iM13596n = gvn7Var.m13596n();
        int iM13591g = gvn7Var.m13591g();
        for (int i3 = iM13591g - 188; i3 >= iM13596n; i3--) {
            if (oc.toq(gvn7Var.m13598q(), iM13596n, iM13591g, i3)) {
                long jZy = oc.zy(gvn7Var, i3, i2);
                if (jZy != C3548p.f65257toq) {
                    return jZy;
                }
            }
        }
        return C3548p.f65257toq;
    }

    /* JADX INFO: renamed from: y */
    private int m11961y(com.google.android.exoplayer2.extractor.ld6 ld6Var, com.google.android.exoplayer2.extractor.fu4 fu4Var, int i2) throws IOException {
        long length = ld6Var.getLength();
        int iMin = (int) Math.min(this.f20211k, length);
        long j2 = length - ((long) iMin);
        if (ld6Var.getPosition() != j2) {
            fu4Var.f19818k = j2;
            return 1;
        }
        this.f64444zy.dd(iMin);
        ld6Var.mo11730y();
        ld6Var.fn3e(this.f64444zy.m13598q(), 0, iMin);
        this.f20215y = m11960s(this.f64444zy, i2);
        this.f20210g = true;
        return 0;
    }

    /* JADX INFO: renamed from: n */
    public int m11962n(com.google.android.exoplayer2.extractor.ld6 ld6Var, com.google.android.exoplayer2.extractor.fu4 fu4Var, int i2) throws IOException {
        if (i2 <= 0) {
            return m11959k(ld6Var);
        }
        if (!this.f20210g) {
            return m11961y(ld6Var, fu4Var, i2);
        }
        if (this.f20215y == C3548p.f65257toq) {
            return m11959k(ld6Var);
        }
        if (!this.f20212n) {
            return m11958g(ld6Var, fu4Var, i2);
        }
        long j2 = this.f64442f7l8;
        if (j2 == C3548p.f65257toq) {
            return m11959k(ld6Var);
        }
        long qVar = this.f64443toq.toq(this.f20215y) - this.f64443toq.toq(j2);
        this.f20214s = qVar;
        if (qVar < 0) {
            StringBuilder sb = new StringBuilder(65);
            sb.append("Invalid duration: ");
            sb.append(qVar);
            sb.append(". Using TIME_UNSET instead.");
            com.google.android.exoplayer2.util.ni7.qrj(f20209p, sb.toString());
            this.f20214s = C3548p.f65257toq;
        }
        return m11959k(ld6Var);
    }

    /* JADX INFO: renamed from: q */
    public boolean m11963q() {
        return this.f20213q;
    }

    public long toq() {
        return this.f20214s;
    }

    public C3847l zy() {
        return this.f64443toq;
    }
}
