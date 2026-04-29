package com.google.android.exoplayer2;

import android.os.Handler;
import android.util.Pair;
import com.google.android.exoplayer2.pc;
import com.google.android.exoplayer2.source.fti;
import com.google.android.exoplayer2.util.C3844k;
import com.google.common.collect.se;

/* JADX INFO: compiled from: MediaPeriodQueue.java */
/* JADX INFO: loaded from: classes2.dex */
final class i9jn {

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private static final int f64792kja0 = 100;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    public static final long f64793n7h = 1000000000000L;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private boolean f64794f7l8;

    /* JADX INFO: renamed from: g */
    private int f20551g;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private int f64795ld6;

    /* JADX INFO: renamed from: n */
    private long f20553n;

    /* JADX INFO: renamed from: p */
    @zy.dd
    private gbni f20554p;

    /* JADX INFO: renamed from: q */
    private final Handler f20555q;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private long f64796qrj;

    /* JADX INFO: renamed from: s */
    @zy.dd
    private gbni f20556s;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    @zy.dd
    private Object f64798x2;

    /* JADX INFO: renamed from: y */
    @zy.dd
    private gbni f20557y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @zy.dd
    private final com.google.android.exoplayer2.analytics.zp f64799zy;

    /* JADX INFO: renamed from: k */
    private final pc.toq f20552k = new pc.toq();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final pc.C3550q f64797toq = new pc.C3550q();

    public i9jn(@zy.dd com.google.android.exoplayer2.analytics.zp zpVar, Handler handler) {
        this.f64799zy = zpVar;
        this.f20555q = handler;
    }

    private boolean a9(pc pcVar) {
        gbni gbniVarM12074p = this.f20557y;
        if (gbniVarM12074p == null) {
            return true;
        }
        int iMo12147g = pcVar.mo12147g(gbniVarM12074p.f64728toq);
        while (true) {
            iMo12147g = pcVar.m12486y(iMo12147g, this.f20552k, this.f64797toq, this.f20551g, this.f64794f7l8);
            while (gbniVarM12074p.m12074p() != null && !gbniVarM12074p.f20481g.f67307f7l8) {
                gbniVarM12074p = gbniVarM12074p.m12074p();
            }
            gbni gbniVarM12074p2 = gbniVarM12074p.m12074p();
            if (iMo12147g == -1 || gbniVarM12074p2 == null || pcVar.mo12147g(gbniVarM12074p2.f64728toq) != iMo12147g) {
                break;
            }
            gbniVarM12074p = gbniVarM12074p2;
        }
        boolean zO1t = o1t(gbniVarM12074p);
        gbniVarM12074p.f20481g = ki(pcVar, gbniVarM12074p.f20481g);
        return !zO1t;
    }

    private boolean fn3e(pc pcVar, fti.C3596k c3596k) {
        if (t8r(c3596k)) {
            return pcVar.m12484i(pcVar.x2(c3596k.f21225k, this.f20552k).f21151n, this.f64797toq).f21127e == pcVar.mo12147g(c3596k.f21225k);
        }
        return false;
    }

    private void fu4() {
        if (this.f64799zy != null) {
            final se.C4520k c4520kBuilder = com.google.common.collect.se.builder();
            for (gbni gbniVarM12074p = this.f20557y; gbniVarM12074p != null; gbniVarM12074p = gbniVarM12074p.m12074p()) {
                c4520kBuilder.mo15569k(gbniVarM12074p.f20481g.f23761k);
            }
            gbni gbniVar = this.f20556s;
            final fti.C3596k c3596k = gbniVar == null ? null : gbniVar.f20481g.f23761k;
            this.f20555q.post(new Runnable() { // from class: com.google.android.exoplayer2.py
                @Override // java.lang.Runnable
                public final void run() {
                    this.f21173k.ni7(c4520kBuilder, c3596k);
                }
            });
        }
    }

    /* JADX INFO: renamed from: i */
    private boolean m12112i(pc pcVar, fti.C3596k c3596k, boolean z2) {
        int iMo12147g = pcVar.mo12147g(c3596k.f21225k);
        return !pcVar.m12484i(pcVar.m12485p(iMo12147g, this.f20552k).f21151n, this.f64797toq).f21131i && pcVar.fu4(iMo12147g, this.f20552k, this.f64797toq, this.f20551g, this.f64794f7l8) && z2;
    }

    @zy.dd
    private zsr0 ld6(pc pcVar, fti.C3596k c3596k, long j2, long j3) {
        pcVar.x2(c3596k.f21225k, this.f20552k);
        return c3596k.zy() ? x2(pcVar, c3596k.f21225k, c3596k.f65325toq, c3596k.f65326zy, j2, c3596k.f21227q) : qrj(pcVar, c3596k.f21225k, j3, j2, c3596k.f21227q);
    }

    private long mcp(pc pcVar, Object obj) {
        int iMo12147g;
        int i2 = pcVar.x2(obj, this.f20552k).f21151n;
        Object obj2 = this.f64798x2;
        if (obj2 != null && (iMo12147g = pcVar.mo12147g(obj2)) != -1 && pcVar.m12485p(iMo12147g, this.f20552k).f21151n == i2) {
            return this.f64796qrj;
        }
        for (gbni gbniVarM12074p = this.f20557y; gbniVarM12074p != null; gbniVarM12074p = gbniVarM12074p.m12074p()) {
            if (gbniVarM12074p.f64728toq.equals(obj)) {
                return gbniVarM12074p.f20481g.f23761k.f21227q;
            }
        }
        for (gbni gbniVarM12074p2 = this.f20557y; gbniVarM12074p2 != null; gbniVarM12074p2 = gbniVarM12074p2.m12074p()) {
            int iMo12147g2 = pcVar.mo12147g(gbniVarM12074p2.f64728toq);
            if (iMo12147g2 != -1 && pcVar.m12485p(iMo12147g2, this.f20552k).f21151n == i2) {
                return gbniVarM12074p2.f20481g.f23761k.f21227q;
            }
        }
        long j2 = this.f20553n;
        this.f20553n = 1 + j2;
        if (this.f20557y == null) {
            this.f64798x2 = obj;
            this.f64796qrj = j2;
        }
        return j2;
    }

    /* JADX INFO: renamed from: n */
    private boolean m12114n(zsr0 zsr0Var, zsr0 zsr0Var2) {
        return zsr0Var.f67308toq == zsr0Var2.f67308toq && zsr0Var.f23761k.equals(zsr0Var2.f23761k);
    }

    private long n7h(pc pcVar, Object obj, int i2) {
        pcVar.x2(obj, this.f20552k);
        long jM12501s = this.f20552k.m12501s(i2);
        return jM12501s == Long.MIN_VALUE ? this.f20552k.f21149g : jM12501s + this.f20552k.x2(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void ni7(se.C4520k c4520k, fti.C3596k c3596k) {
        this.f64799zy.kt06(c4520k.mo15570n(), c3596k);
    }

    /* JADX INFO: renamed from: q */
    private boolean m12115q(long j2, long j3) {
        return j2 == C3548p.f65257toq || j2 == j3;
    }

    private zsr0 qrj(pc pcVar, Object obj, long j2, long j3, long j4) {
        long jMax = j2;
        pcVar.x2(obj, this.f20552k);
        int iF7l8 = this.f20552k.f7l8(jMax);
        fti.C3596k c3596k = new fti.C3596k(obj, j4, iF7l8);
        boolean zT8r = t8r(c3596k);
        boolean zFn3e = fn3e(pcVar, c3596k);
        boolean zM12112i = m12112i(pcVar, c3596k, zT8r);
        boolean z2 = iF7l8 != -1 && this.f20552k.fn3e(iF7l8);
        long jM12501s = iF7l8 != -1 ? this.f20552k.m12501s(iF7l8) : -9223372036854775807L;
        long j5 = (jM12501s == C3548p.f65257toq || jM12501s == Long.MIN_VALUE) ? this.f20552k.f21149g : jM12501s;
        if (j5 != C3548p.f65257toq && jMax >= j5) {
            jMax = Math.max(0L, j5 - 1);
        }
        return new zsr0(c3596k, jMax, j3, jM12501s, j5, z2, zT8r, zFn3e, zM12112i);
    }

    @zy.dd
    /* JADX INFO: renamed from: s */
    private zsr0 m12116s(pc pcVar, gbni gbniVar, long j2) {
        long j3;
        zsr0 zsr0Var = gbniVar.f20481g;
        long jX2 = (gbniVar.x2() + zsr0Var.f23762n) - j2;
        if (zsr0Var.f67307f7l8) {
            long j4 = 0;
            int iM12486y = pcVar.m12486y(pcVar.mo12147g(zsr0Var.f23761k.f21225k), this.f20552k, this.f64797toq, this.f20551g, this.f64794f7l8);
            if (iM12486y == -1) {
                return null;
            }
            int i2 = pcVar.ld6(iM12486y, this.f20552k, true).f21151n;
            Object obj = this.f20552k.f21153q;
            long j5 = zsr0Var.f23761k.f21227q;
            if (pcVar.m12484i(i2, this.f64797toq).f21126c == iM12486y) {
                Pair<Object, Long> pairKja0 = pcVar.kja0(this.f64797toq, this.f20552k, i2, C3548p.f65257toq, Math.max(0L, jX2));
                if (pairKja0 == null) {
                    return null;
                }
                obj = pairKja0.first;
                long jLongValue = ((Long) pairKja0.second).longValue();
                gbni gbniVarM12074p = gbniVar.m12074p();
                if (gbniVarM12074p == null || !gbniVarM12074p.f64728toq.equals(obj)) {
                    j5 = this.f20553n;
                    this.f20553n = 1 + j5;
                } else {
                    j5 = gbniVarM12074p.f20481g.f23761k.f21227q;
                }
                j3 = jLongValue;
                j4 = C3548p.f65257toq;
            } else {
                j3 = 0;
            }
            return ld6(pcVar, m12117t(pcVar, obj, j3, j5, this.f20552k), j4, j3);
        }
        fti.C3596k c3596k = zsr0Var.f23761k;
        pcVar.x2(c3596k.f21225k, this.f20552k);
        if (!c3596k.zy()) {
            int iKja0 = this.f20552k.kja0(c3596k.f21226n);
            if (iKja0 != this.f20552k.m12500q(c3596k.f21226n)) {
                return x2(pcVar, c3596k.f21225k, c3596k.f21226n, iKja0, zsr0Var.f23762n, c3596k.f21227q);
            }
            return qrj(pcVar, c3596k.f21225k, n7h(pcVar, c3596k.f21225k, c3596k.f21226n), zsr0Var.f23762n, c3596k.f21227q);
        }
        int i3 = c3596k.f65325toq;
        int iM12500q = this.f20552k.m12500q(i3);
        if (iM12500q == -1) {
            return null;
        }
        int iM12496h = this.f20552k.m12496h(i3, c3596k.f65326zy);
        if (iM12496h < iM12500q) {
            return x2(pcVar, c3596k.f21225k, i3, iM12496h, zsr0Var.f67309zy, c3596k.f21227q);
        }
        long jLongValue2 = zsr0Var.f67309zy;
        if (jLongValue2 == C3548p.f65257toq) {
            pc.C3550q c3550q = this.f64797toq;
            pc.toq toqVar = this.f20552k;
            Pair<Object, Long> pairKja02 = pcVar.kja0(c3550q, toqVar, toqVar.f21151n, C3548p.f65257toq, Math.max(0L, jX2));
            if (pairKja02 == null) {
                return null;
            }
            jLongValue2 = ((Long) pairKja02.second).longValue();
        }
        return qrj(pcVar, c3596k.f21225k, Math.max(n7h(pcVar, c3596k.f21225k, c3596k.f65325toq), jLongValue2), zsr0Var.f67309zy, c3596k.f21227q);
    }

    /* JADX INFO: renamed from: t */
    private static fti.C3596k m12117t(pc pcVar, Object obj, long j2, long j3, pc.toq toqVar) {
        pcVar.x2(obj, toqVar);
        int iM12502y = toqVar.m12502y(j2);
        return iM12502y == -1 ? new fti.C3596k(obj, j3, toqVar.f7l8(j2)) : new fti.C3596k(obj, iM12502y, toqVar.kja0(iM12502y), j3);
    }

    private boolean t8r(fti.C3596k c3596k) {
        return !c3596k.zy() && c3596k.f21226n == -1;
    }

    private zsr0 x2(pc pcVar, Object obj, int i2, int i3, long j2, long j3) {
        fti.C3596k c3596k = new fti.C3596k(obj, i2, i3, j3);
        long jM12498n = pcVar.x2(c3596k.f21225k, this.f20552k).m12498n(c3596k.f65325toq, c3596k.f65326zy);
        long jM12499p = i3 == this.f20552k.kja0(i2) ? this.f20552k.m12499p() : 0L;
        return new zsr0(c3596k, (jM12498n == C3548p.f65257toq || jM12499p < jM12498n) ? jM12499p : Math.max(0L, jM12498n - 1), j2, C3548p.f65257toq, jM12498n, this.f20552k.fn3e(c3596k.f65325toq), false, false, false);
    }

    @zy.dd
    /* JADX INFO: renamed from: y */
    private zsr0 m12118y(kcsr kcsrVar) {
        return ld6(kcsrVar.f20587k, kcsrVar.f64852toq, kcsrVar.f64854zy, kcsrVar.f64851t8r);
    }

    @zy.dd
    public gbni cdj() {
        return this.f20556s;
    }

    public gbni f7l8(cv06[] cv06VarArr, com.google.android.exoplayer2.trackselection.zurt zurtVar, com.google.android.exoplayer2.upstream.toq toqVar, m4 m4Var, zsr0 zsr0Var, com.google.android.exoplayer2.trackselection.ni7 ni7Var) {
        gbni gbniVar = this.f20554p;
        gbni gbniVar2 = new gbni(cv06VarArr, gbniVar == null ? f64793n7h : (gbniVar.x2() + this.f20554p.f20481g.f23762n) - zsr0Var.f67308toq, zurtVar, toqVar, m4Var, zsr0Var, ni7Var);
        gbni gbniVar3 = this.f20554p;
        if (gbniVar3 != null) {
            gbniVar3.ni7(gbniVar2);
        } else {
            this.f20557y = gbniVar2;
            this.f20556s = gbniVar2;
        }
        this.f64798x2 = null;
        this.f20554p = gbniVar2;
        this.f64795ld6++;
        fu4();
        return gbniVar2;
    }

    public boolean fti(pc pcVar, long j2, long j3) {
        zsr0 zsr0VarKi;
        gbni gbniVarM12074p = this.f20557y;
        gbni gbniVar = null;
        while (gbniVarM12074p != null) {
            zsr0 zsr0Var = gbniVarM12074p.f20481g;
            if (gbniVar == null) {
                zsr0VarKi = ki(pcVar, zsr0Var);
            } else {
                zsr0 zsr0VarM12116s = m12116s(pcVar, gbniVar, j2);
                if (zsr0VarM12116s == null) {
                    return !o1t(gbniVar);
                }
                if (!m12114n(zsr0Var, zsr0VarM12116s)) {
                    return !o1t(gbniVar);
                }
                zsr0VarKi = zsr0VarM12116s;
            }
            gbniVarM12074p.f20481g = zsr0VarKi.m13977k(zsr0Var.f67309zy);
            if (!m12115q(zsr0Var.f23762n, zsr0VarKi.f23762n)) {
                gbniVarM12074p.wvg();
                long j4 = zsr0VarKi.f23762n;
                return (o1t(gbniVarM12074p) || (gbniVarM12074p == this.f20556s && !gbniVarM12074p.f20481g.f23760g && ((j3 > Long.MIN_VALUE ? 1 : (j3 == Long.MIN_VALUE ? 0 : -1)) == 0 || (j3 > ((j4 > C3548p.f65257toq ? 1 : (j4 == C3548p.f65257toq ? 0 : -1)) == 0 ? Long.MAX_VALUE : gbniVarM12074p.o1t(j4)) ? 1 : (j3 == ((j4 > C3548p.f65257toq ? 1 : (j4 == C3548p.f65257toq ? 0 : -1)) == 0 ? Long.MAX_VALUE : gbniVarM12074p.o1t(j4)) ? 0 : -1)) >= 0))) ? false : true;
            }
            gbniVar = gbniVarM12074p;
            gbniVarM12074p = gbniVarM12074p.m12074p();
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    public void m12119g() {
        if (this.f64795ld6 == 0) {
            return;
        }
        gbni gbniVarM12074p = (gbni) C3844k.ld6(this.f20557y);
        this.f64798x2 = gbniVarM12074p.f64728toq;
        this.f64796qrj = gbniVarM12074p.f20481g.f23761k.f21227q;
        while (gbniVarM12074p != null) {
            gbniVarM12074p.m12072i();
            gbniVarM12074p = gbniVarM12074p.m12074p();
        }
        this.f20557y = null;
        this.f20554p = null;
        this.f20556s = null;
        this.f64795ld6 = 0;
        fu4();
    }

    public boolean gvn7(pc pcVar, boolean z2) {
        this.f64794f7l8 = z2;
        return a9(pcVar);
    }

    @zy.dd
    /* JADX INFO: renamed from: h */
    public gbni m12120h() {
        return this.f20557y;
    }

    public boolean jk() {
        gbni gbniVar = this.f20554p;
        return gbniVar == null || (!gbniVar.f20481g.f23764s && gbniVar.cdj() && this.f20554p.f20481g.f23762n != C3548p.f65257toq && this.f64795ld6 < 100);
    }

    public boolean jp0y(pc pcVar, int i2) {
        this.f20551g = i2;
        return a9(pcVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.android.exoplayer2.zsr0 ki(com.google.android.exoplayer2.pc r19, com.google.android.exoplayer2.zsr0 r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            com.google.android.exoplayer2.source.fti$k r3 = r2.f23761k
            boolean r12 = r0.t8r(r3)
            boolean r13 = r0.fn3e(r1, r3)
            boolean r14 = r0.m12112i(r1, r3, r12)
            com.google.android.exoplayer2.source.fti$k r4 = r2.f23761k
            java.lang.Object r4 = r4.f21225k
            com.google.android.exoplayer2.pc$toq r5 = r0.f20552k
            r1.x2(r4, r5)
            boolean r1 = r3.zy()
            r4 = -1
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L35
            int r1 = r3.f21226n
            if (r1 != r4) goto L2e
            goto L35
        L2e:
            com.google.android.exoplayer2.pc$toq r7 = r0.f20552k
            long r7 = r7.m12501s(r1)
            goto L36
        L35:
            r7 = r5
        L36:
            boolean r1 = r3.zy()
            if (r1 == 0) goto L48
            com.google.android.exoplayer2.pc$toq r1 = r0.f20552k
            int r5 = r3.f65325toq
            int r6 = r3.f65326zy
            long r5 = r1.m12498n(r5, r6)
        L46:
            r9 = r5
            goto L5c
        L48:
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 == 0) goto L55
            r5 = -9223372036854775808
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 != 0) goto L53
            goto L55
        L53:
            r9 = r7
            goto L5c
        L55:
            com.google.android.exoplayer2.pc$toq r1 = r0.f20552k
            long r5 = r1.n7h()
            goto L46
        L5c:
            boolean r1 = r3.zy()
            if (r1 == 0) goto L6c
            com.google.android.exoplayer2.pc$toq r1 = r0.f20552k
            int r4 = r3.f65325toq
            boolean r1 = r1.fn3e(r4)
        L6a:
            r11 = r1
            goto L7c
        L6c:
            int r1 = r3.f21226n
            if (r1 == r4) goto L7a
            com.google.android.exoplayer2.pc$toq r4 = r0.f20552k
            boolean r1 = r4.fn3e(r1)
            if (r1 == 0) goto L7a
            r1 = 1
            goto L6a
        L7a:
            r1 = 0
            goto L6a
        L7c:
            com.google.android.exoplayer2.zsr0 r15 = new com.google.android.exoplayer2.zsr0
            long r4 = r2.f67308toq
            long r1 = r2.f67309zy
            r16 = r1
            r1 = r15
            r2 = r3
            r3 = r4
            r5 = r16
            r1.<init>(r2, r3, r5, r7, r9, r11, r12, r13, r14)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.i9jn.ki(com.google.android.exoplayer2.pc, com.google.android.exoplayer2.zsr0):com.google.android.exoplayer2.zsr0");
    }

    @zy.dd
    public zsr0 kja0(long j2, kcsr kcsrVar) {
        gbni gbniVar = this.f20554p;
        return gbniVar == null ? m12118y(kcsrVar) : m12116s(kcsrVar.f20587k, gbniVar, j2);
    }

    public boolean o1t(gbni gbniVar) {
        boolean z2 = false;
        C3844k.m13633s(gbniVar != null);
        if (gbniVar.equals(this.f20554p)) {
            return false;
        }
        this.f20554p = gbniVar;
        while (gbniVar.m12074p() != null) {
            gbniVar = gbniVar.m12074p();
            if (gbniVar == this.f20556s) {
                this.f20556s = this.f20557y;
                z2 = true;
            }
            gbniVar.m12072i();
            this.f64795ld6--;
        }
        this.f20554p.ni7(null);
        fu4();
        return z2;
    }

    @zy.dd
    /* JADX INFO: renamed from: p */
    public gbni m12121p() {
        return this.f20554p;
    }

    @zy.dd
    public gbni toq() {
        gbni gbniVar = this.f20557y;
        if (gbniVar == null) {
            return null;
        }
        if (gbniVar == this.f20556s) {
            this.f20556s = gbniVar.m12074p();
        }
        this.f20557y.m12072i();
        int i2 = this.f64795ld6 - 1;
        this.f64795ld6 = i2;
        if (i2 == 0) {
            this.f20554p = null;
            gbni gbniVar2 = this.f20557y;
            this.f64798x2 = gbniVar2.f64728toq;
            this.f64796qrj = gbniVar2.f20481g.f23761k.f21227q;
        }
        this.f20557y = this.f20557y.m12074p();
        fu4();
        return this.f20557y;
    }

    public fti.C3596k wvg(pc pcVar, Object obj, long j2) {
        return m12117t(pcVar, obj, j2, mcp(pcVar, obj), this.f20552k);
    }

    /* JADX INFO: renamed from: z */
    public void m12122z(long j2) {
        gbni gbniVar = this.f20554p;
        if (gbniVar != null) {
            gbniVar.t8r(j2);
        }
    }

    public boolean zurt(com.google.android.exoplayer2.source.jk jkVar) {
        gbni gbniVar = this.f20554p;
        return gbniVar != null && gbniVar.f20482k == jkVar;
    }

    public gbni zy() {
        gbni gbniVar = this.f20556s;
        C3844k.m13633s((gbniVar == null || gbniVar.m12074p() == null) ? false : true);
        this.f20556s = this.f20556s.m12074p();
        fu4();
        return this.f20556s;
    }
}
