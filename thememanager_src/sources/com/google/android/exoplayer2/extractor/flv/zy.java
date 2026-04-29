package com.google.android.exoplayer2.extractor.flv;

import com.google.android.exoplayer2.C3548p;
import com.google.android.exoplayer2.extractor.InterfaceC3397p;
import com.google.android.exoplayer2.extractor.fu4;
import com.google.android.exoplayer2.extractor.kja0;
import com.google.android.exoplayer2.extractor.ld6;
import com.google.android.exoplayer2.extractor.o1t;
import com.google.android.exoplayer2.extractor.x2;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.gvn7;
import java.io.IOException;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: compiled from: FlvExtractor.java */
/* JADX INFO: loaded from: classes2.dex */
public final class zy implements InterfaceC3397p {

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private static final int f63740fn3e = 1;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    private static final int f63741fu4 = 4;

    /* JADX INFO: renamed from: i */
    public static final kja0 f19805i = new kja0() { // from class: com.google.android.exoplayer2.extractor.flv.toq
        @Override // com.google.android.exoplayer2.extractor.kja0
        public final InterfaceC3397p[] zy() {
            return zy.m11723y();
        }
    };

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    private static final int f63742jk = 4607062;

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    private static final int f63743mcp = 18;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    private static final int f63744ni7 = 3;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    private static final int f63745o1t = 11;

    /* JADX INFO: renamed from: t */
    private static final int f19806t = 9;

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    private static final int f63746wvg = 8;

    /* JADX INFO: renamed from: z */
    private static final int f19807z = 9;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private static final int f63747zurt = 2;

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private boolean f63748cdj;

    /* JADX INFO: renamed from: h */
    private long f19809h;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private C3344k f63750ki;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private int f63751kja0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private boolean f63752ld6;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private int f63753n7h;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private int f63754qrj;

    /* JADX INFO: renamed from: s */
    private x2 f19813s;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private C3343g f63755t8r;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private long f63756x2;

    /* JADX INFO: renamed from: q */
    private final gvn7 f19812q = new gvn7(4);

    /* JADX INFO: renamed from: n */
    private final gvn7 f19810n = new gvn7(9);

    /* JADX INFO: renamed from: g */
    private final gvn7 f19808g = new gvn7(11);

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private final gvn7 f63749f7l8 = new gvn7();

    /* JADX INFO: renamed from: y */
    private final C3346q f19814y = new C3346q();

    /* JADX INFO: renamed from: p */
    private int f19811p = 1;

    private long f7l8() {
        if (this.f63752ld6) {
            return this.f63756x2 + this.f19809h;
        }
        if (this.f19814y.m11718n() == C3548p.f65257toq) {
            return 0L;
        }
        return this.f19809h;
    }

    @RequiresNonNull({"extractorOutput"})
    /* JADX INFO: renamed from: g */
    private void m11719g() {
        if (this.f63748cdj) {
            return;
        }
        this.f19813s.cdj(new o1t.toq(C3548p.f65257toq));
        this.f63748cdj = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008b  */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"extractorOutput"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean ld6(com.google.android.exoplayer2.extractor.ld6 r10) throws java.io.IOException {
        /*
            r9 = this;
            long r0 = r9.f7l8()
            int r2 = r9.f63753n7h
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = 0
            r6 = 1
            r7 = 8
            if (r2 != r7) goto L24
            com.google.android.exoplayer2.extractor.flv.k r7 = r9.f63750ki
            if (r7 == 0) goto L24
            r9.m11719g()
            com.google.android.exoplayer2.extractor.flv.k r2 = r9.f63750ki
            com.google.android.exoplayer2.util.gvn7 r10 = r9.m11722s(r10)
            boolean r5 = r2.m11712k(r10, r0)
        L22:
            r10 = r6
            goto L75
        L24:
            r7 = 9
            if (r2 != r7) goto L3a
            com.google.android.exoplayer2.extractor.flv.g r7 = r9.f63755t8r
            if (r7 == 0) goto L3a
            r9.m11719g()
            com.google.android.exoplayer2.extractor.flv.g r2 = r9.f63755t8r
            com.google.android.exoplayer2.util.gvn7 r10 = r9.m11722s(r10)
            boolean r5 = r2.m11712k(r10, r0)
            goto L22
        L3a:
            r7 = 18
            if (r2 != r7) goto L6f
            boolean r2 = r9.f63748cdj
            if (r2 != 0) goto L6f
            com.google.android.exoplayer2.extractor.flv.q r2 = r9.f19814y
            com.google.android.exoplayer2.util.gvn7 r10 = r9.m11722s(r10)
            boolean r5 = r2.m11712k(r10, r0)
            com.google.android.exoplayer2.extractor.flv.q r10 = r9.f19814y
            long r0 = r10.m11718n()
            int r10 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r10 == 0) goto L22
            com.google.android.exoplayer2.extractor.x2 r10 = r9.f19813s
            com.google.android.exoplayer2.extractor.ni7 r2 = new com.google.android.exoplayer2.extractor.ni7
            com.google.android.exoplayer2.extractor.flv.q r7 = r9.f19814y
            long[] r7 = r7.m11717g()
            com.google.android.exoplayer2.extractor.flv.q r8 = r9.f19814y
            long[] r8 = r8.f7l8()
            r2.<init>(r7, r8, r0)
            r10.cdj(r2)
            r9.f63748cdj = r6
            goto L22
        L6f:
            int r0 = r9.f63751kja0
            r10.cdj(r0)
            r10 = r5
        L75:
            boolean r0 = r9.f63752ld6
            if (r0 != 0) goto L8f
            if (r5 == 0) goto L8f
            r9.f63752ld6 = r6
            com.google.android.exoplayer2.extractor.flv.q r0 = r9.f19814y
            long r0 = r0.m11718n()
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L8b
            long r0 = r9.f19809h
            long r0 = -r0
            goto L8d
        L8b:
            r0 = 0
        L8d:
            r9.f63756x2 = r0
        L8f:
            r0 = 4
            r9.f63754qrj = r0
            r0 = 2
            r9.f19811p = r0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.flv.zy.ld6(com.google.android.exoplayer2.extractor.ld6):boolean");
    }

    @RequiresNonNull({"extractorOutput"})
    /* JADX INFO: renamed from: p */
    private boolean m11721p(ld6 ld6Var) throws IOException {
        if (!ld6Var.mo11729p(this.f19810n.m13598q(), 0, 9, true)) {
            return false;
        }
        this.f19810n.n5r1(0);
        this.f19810n.hyr(4);
        int iJp0y = this.f19810n.jp0y();
        boolean z2 = (iJp0y & 4) != 0;
        boolean z3 = (iJp0y & 1) != 0;
        if (z2 && this.f63750ki == null) {
            this.f63750ki = new C3344k(this.f19813s.toq(8, 1));
        }
        if (z3 && this.f63755t8r == null) {
            this.f63755t8r = new C3343g(this.f19813s.toq(9, 2));
        }
        this.f19813s.mo11753i();
        this.f63754qrj = (this.f19810n.kja0() - 9) + 4;
        this.f19811p = 2;
        return true;
    }

    private void qrj(ld6 ld6Var) throws IOException {
        ld6Var.cdj(this.f63754qrj);
        this.f63754qrj = 0;
        this.f19811p = 3;
    }

    /* JADX INFO: renamed from: s */
    private gvn7 m11722s(ld6 ld6Var) throws IOException {
        if (this.f63751kja0 > this.f63749f7l8.toq()) {
            gvn7 gvn7Var = this.f63749f7l8;
            gvn7Var.ncyb(new byte[Math.max(gvn7Var.toq() * 2, this.f63751kja0)], 0);
        } else {
            this.f63749f7l8.n5r1(0);
        }
        this.f63749f7l8.m13595l(this.f63751kja0);
        ld6Var.readFully(this.f63749f7l8.m13598q(), 0, this.f63751kja0);
        return this.f63749f7l8;
    }

    private boolean x2(ld6 ld6Var) throws IOException {
        if (!ld6Var.mo11729p(this.f19808g.m13598q(), 0, 11, true)) {
            return false;
        }
        this.f19808g.n5r1(0);
        this.f63753n7h = this.f19808g.jp0y();
        this.f63751kja0 = this.f19808g.oc();
        this.f19809h = this.f19808g.oc();
        this.f19809h = (((long) (this.f19808g.jp0y() << 24)) | this.f19809h) * 1000;
        this.f19808g.hyr(3);
        this.f19811p = 4;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static /* synthetic */ InterfaceC3397p[] m11723y() {
        return new InterfaceC3397p[]{new zy()};
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC3397p
    /* JADX INFO: renamed from: k */
    public void mo11688k(long j2, long j3) {
        if (j2 == 0) {
            this.f19811p = 1;
            this.f63752ld6 = false;
        } else {
            this.f19811p = 3;
        }
        this.f63754qrj = 0;
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC3397p
    /* JADX INFO: renamed from: q */
    public void mo11689q(x2 x2Var) {
        this.f19813s = x2Var;
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC3397p
    public void release() {
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC3397p
    public boolean toq(ld6 ld6Var) throws IOException {
        ld6Var.fn3e(this.f19812q.m13598q(), 0, 3);
        this.f19812q.n5r1(0);
        if (this.f19812q.oc() != f63742jk) {
            return false;
        }
        ld6Var.fn3e(this.f19812q.m13598q(), 0, 2);
        this.f19812q.n5r1(0);
        if ((this.f19812q.lvui() & 250) != 0) {
            return false;
        }
        ld6Var.fn3e(this.f19812q.m13598q(), 0, 4);
        this.f19812q.n5r1(0);
        int iKja0 = this.f19812q.kja0();
        ld6Var.mo11730y();
        ld6Var.qrj(iKja0);
        ld6Var.fn3e(this.f19812q.m13598q(), 0, 4);
        this.f19812q.n5r1(0);
        return this.f19812q.kja0() == 0;
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC3397p
    public int zy(ld6 ld6Var, fu4 fu4Var) throws IOException {
        C3844k.ld6(this.f19813s);
        while (true) {
            int i2 = this.f19811p;
            if (i2 != 1) {
                if (i2 == 2) {
                    qrj(ld6Var);
                } else if (i2 != 3) {
                    if (i2 != 4) {
                        throw new IllegalStateException();
                    }
                    if (ld6(ld6Var)) {
                        return 0;
                    }
                } else if (!x2(ld6Var)) {
                    return -1;
                }
            } else if (!m11721p(ld6Var)) {
                return -1;
            }
        }
    }
}
