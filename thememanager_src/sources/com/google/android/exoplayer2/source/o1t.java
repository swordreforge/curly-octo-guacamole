package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.C3548p;
import com.google.android.exoplayer2.pc;
import com.google.android.exoplayer2.source.fti;
import com.google.android.exoplayer2.tfm;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: compiled from: MaskingMediaSource.java */
/* JADX INFO: loaded from: classes2.dex */
public final class o1t extends f7l8<Void> {

    /* JADX INFO: renamed from: c */
    @zy.dd
    private C3634z f21662c;

    /* JADX INFO: renamed from: e */
    private boolean f21663e;

    /* JADX INFO: renamed from: f */
    private C3623k f21664f;

    /* JADX INFO: renamed from: j */
    private boolean f21665j;

    /* JADX INFO: renamed from: l */
    private final pc.toq f21666l;

    /* JADX INFO: renamed from: o */
    private boolean f21667o;

    /* JADX INFO: renamed from: r */
    private final pc.C3550q f21668r;

    /* JADX INFO: renamed from: t */
    private final boolean f21669t;

    /* JADX INFO: renamed from: z */
    private final fti f21670z;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.o1t$k */
    /* JADX INFO: compiled from: MaskingMediaSource.java */
    private static final class C3623k extends fn3e {

        /* JADX INFO: renamed from: i */
        public static final Object f21671i = new Object();

        /* JADX INFO: renamed from: h */
        @zy.dd
        private final Object f21672h;

        /* JADX INFO: renamed from: p */
        @zy.dd
        private final Object f21673p;

        private C3623k(pc pcVar, @zy.dd Object obj, @zy.dd Object obj2) {
            super(pcVar);
            this.f21673p = obj;
            this.f21672h = obj2;
        }

        public static C3623k jk(pc pcVar, @zy.dd Object obj, @zy.dd Object obj2) {
            return new C3623k(pcVar, obj, obj2);
        }

        public static C3623k mcp(tfm tfmVar) {
            return new C3623k(new toq(tfmVar), pc.C3550q.f21121o, f21671i);
        }

        public pc a9() {
            return this.f21523s;
        }

        @Override // com.google.android.exoplayer2.source.fn3e, com.google.android.exoplayer2.pc
        public pc.C3550q fn3e(int i2, pc.C3550q c3550q, long j2) {
            this.f21523s.fn3e(i2, c3550q, j2);
            if (com.google.android.exoplayer2.util.lrht.zy(c3550q.f21133k, this.f21673p)) {
                c3550q.f21133k = pc.C3550q.f21121o;
            }
            return c3550q;
        }

        @Override // com.google.android.exoplayer2.source.fn3e, com.google.android.exoplayer2.pc
        /* JADX INFO: renamed from: g */
        public int mo12147g(Object obj) {
            Object obj2;
            pc pcVar = this.f21523s;
            if (f21671i.equals(obj) && (obj2 = this.f21672h) != null) {
                obj = obj2;
            }
            return pcVar.mo12147g(obj);
        }

        @Override // com.google.android.exoplayer2.source.fn3e, com.google.android.exoplayer2.pc
        public pc.toq ld6(int i2, pc.toq toqVar, boolean z2) {
            this.f21523s.ld6(i2, toqVar, z2);
            if (com.google.android.exoplayer2.util.lrht.zy(toqVar.f21153q, this.f21672h) && z2) {
                toqVar.f21153q = f21671i;
            }
            return toqVar;
        }

        /* JADX INFO: renamed from: t */
        public C3623k m12812t(pc pcVar) {
            return new C3623k(pcVar, this.f21673p, this.f21672h);
        }

        @Override // com.google.android.exoplayer2.source.fn3e, com.google.android.exoplayer2.pc
        public Object t8r(int i2) {
            Object objT8r = this.f21523s.t8r(i2);
            return com.google.android.exoplayer2.util.lrht.zy(objT8r, this.f21672h) ? f21671i : objT8r;
        }
    }

    /* JADX INFO: compiled from: MaskingMediaSource.java */
    @zy.yz
    public static final class toq extends pc {

        /* JADX INFO: renamed from: s */
        private final tfm f21674s;

        public toq(tfm tfmVar) {
            this.f21674s = tfmVar;
        }

        @Override // com.google.android.exoplayer2.pc
        public pc.C3550q fn3e(int i2, pc.C3550q c3550q, long j2) {
            c3550q.qrj(pc.C3550q.f21121o, this.f21674s, null, C3548p.f65257toq, C3548p.f65257toq, C3548p.f65257toq, false, true, null, 0L, C3548p.f65257toq, 0, 0, 0L);
            c3550q.f21138r = true;
            return c3550q;
        }

        @Override // com.google.android.exoplayer2.pc
        /* JADX INFO: renamed from: g */
        public int mo12147g(Object obj) {
            return obj == C3623k.f21671i ? 0 : -1;
        }

        @Override // com.google.android.exoplayer2.pc
        public pc.toq ld6(int i2, pc.toq toqVar, boolean z2) {
            toqVar.fu4(z2 ? 0 : null, z2 ? C3623k.f21671i : null, 0, C3548p.f65257toq, 0L, com.google.android.exoplayer2.source.ads.zy.f21298r, true);
            return toqVar;
        }

        @Override // com.google.android.exoplayer2.pc
        public int qrj() {
            return 1;
        }

        @Override // com.google.android.exoplayer2.pc
        public Object t8r(int i2) {
            return C3623k.f21671i;
        }

        @Override // com.google.android.exoplayer2.pc
        public int zurt() {
            return 1;
        }
    }

    public o1t(fti ftiVar, boolean z2) {
        this.f21670z = ftiVar;
        this.f21669t = z2 && ftiVar.kja0();
        this.f21668r = new pc.C3550q();
        this.f21666l = new pc.toq();
        pc pcVarMo12713h = ftiVar.mo12713h();
        if (pcVarMo12713h == null) {
            this.f21664f = C3623k.mcp(ftiVar.mo12566n());
        } else {
            this.f21664f = C3623k.jk(pcVarMo12713h, null, null);
            this.f21667o = true;
        }
    }

    /* JADX INFO: renamed from: l */
    private Object m12809l(Object obj) {
        return (this.f21664f.f21672h == null || !this.f21664f.f21672h.equals(obj)) ? obj : C3623k.f21671i;
    }

    @RequiresNonNull({"unpreparedMaskingMediaPeriod"})
    private void lrht(long j2) {
        C3634z c3634z = this.f21662c;
        int iMo12147g = this.f21664f.mo12147g(c3634z.f21762k.f21225k);
        if (iMo12147g == -1) {
            return;
        }
        long j3 = this.f21664f.m12485p(iMo12147g, this.f21666l).f21149g;
        if (j3 != C3548p.f65257toq && j2 >= j3) {
            j2 = Math.max(0L, j3 - 1);
        }
        c3634z.m12828i(j2);
    }

    private Object n5r1(Object obj) {
        return (this.f21664f.f21672h == null || !obj.equals(C3623k.f21671i)) ? obj : this.f21664f.f21672h;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.exoplayer2.source.f7l8
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void lvui(java.lang.Void r13, com.google.android.exoplayer2.source.fti r14, com.google.android.exoplayer2.pc r15) {
        /*
            r12 = this;
            boolean r13 = r12.f21665j
            if (r13 == 0) goto L19
            com.google.android.exoplayer2.source.o1t$k r13 = r12.f21664f
            com.google.android.exoplayer2.source.o1t$k r13 = r13.m12812t(r15)
            r12.f21664f = r13
            com.google.android.exoplayer2.source.z r13 = r12.f21662c
            if (r13 == 0) goto Lae
            long r13 = r13.m12829s()
            r12.lrht(r13)
            goto Lae
        L19:
            boolean r13 = r15.ni7()
            if (r13 == 0) goto L36
            boolean r13 = r12.f21667o
            if (r13 == 0) goto L2a
            com.google.android.exoplayer2.source.o1t$k r13 = r12.f21664f
            com.google.android.exoplayer2.source.o1t$k r13 = r13.m12812t(r15)
            goto L32
        L2a:
            java.lang.Object r13 = com.google.android.exoplayer2.pc.C3550q.f21121o
            java.lang.Object r14 = com.google.android.exoplayer2.source.o1t.C3623k.f21671i
            com.google.android.exoplayer2.source.o1t$k r13 = com.google.android.exoplayer2.source.o1t.C3623k.jk(r15, r13, r14)
        L32:
            r12.f21664f = r13
            goto Lae
        L36:
            com.google.android.exoplayer2.pc$q r13 = r12.f21668r
            r14 = 0
            r15.m12484i(r14, r13)
            com.google.android.exoplayer2.pc$q r13 = r12.f21668r
            long r0 = r13.m12488g()
            com.google.android.exoplayer2.pc$q r13 = r12.f21668r
            java.lang.Object r13 = r13.f21133k
            com.google.android.exoplayer2.source.z r2 = r12.f21662c
            if (r2 == 0) goto L74
            long r2 = r2.m12827h()
            com.google.android.exoplayer2.source.o1t$k r4 = r12.f21664f
            com.google.android.exoplayer2.source.z r5 = r12.f21662c
            com.google.android.exoplayer2.source.fti$k r5 = r5.f21762k
            java.lang.Object r5 = r5.f21225k
            com.google.android.exoplayer2.pc$toq r6 = r12.f21666l
            r4.x2(r5, r6)
            com.google.android.exoplayer2.pc$toq r4 = r12.f21666l
            long r4 = r4.ki()
            long r4 = r4 + r2
            com.google.android.exoplayer2.source.o1t$k r2 = r12.f21664f
            com.google.android.exoplayer2.pc$q r3 = r12.f21668r
            com.google.android.exoplayer2.pc$q r14 = r2.m12484i(r14, r3)
            long r2 = r14.m12488g()
            int r14 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r14 == 0) goto L74
            r10 = r4
            goto L75
        L74:
            r10 = r0
        L75:
            com.google.android.exoplayer2.pc$q r7 = r12.f21668r
            com.google.android.exoplayer2.pc$toq r8 = r12.f21666l
            r9 = 0
            r6 = r15
            android.util.Pair r14 = r6.n7h(r7, r8, r9, r10)
            java.lang.Object r0 = r14.first
            java.lang.Object r14 = r14.second
            java.lang.Long r14 = (java.lang.Long) r14
            long r1 = r14.longValue()
            boolean r14 = r12.f21667o
            if (r14 == 0) goto L94
            com.google.android.exoplayer2.source.o1t$k r13 = r12.f21664f
            com.google.android.exoplayer2.source.o1t$k r13 = r13.m12812t(r15)
            goto L98
        L94:
            com.google.android.exoplayer2.source.o1t$k r13 = com.google.android.exoplayer2.source.o1t.C3623k.jk(r15, r13, r0)
        L98:
            r12.f21664f = r13
            com.google.android.exoplayer2.source.z r13 = r12.f21662c
            if (r13 == 0) goto Lae
            r12.lrht(r1)
            com.google.android.exoplayer2.source.fti$k r13 = r13.f21762k
            java.lang.Object r14 = r13.f21225k
            java.lang.Object r14 = r12.n5r1(r14)
            com.google.android.exoplayer2.source.fti$k r13 = r13.mo12557k(r14)
            goto Laf
        Lae:
            r13 = 0
        Laf:
            r14 = 1
            r12.f21667o = r14
            r12.f21665j = r14
            com.google.android.exoplayer2.source.o1t$k r14 = r12.f21664f
            r12.m12741t(r14)
            if (r13 == 0) goto Lc6
            com.google.android.exoplayer2.source.z r14 = r12.f21662c
            java.lang.Object r14 = com.google.android.exoplayer2.util.C3844k.f7l8(r14)
            com.google.android.exoplayer2.source.z r14 = (com.google.android.exoplayer2.source.C3634z) r14
            r14.toq(r13)
        Lc6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.o1t.lvui(java.lang.Void, com.google.android.exoplayer2.source.fti, com.google.android.exoplayer2.pc):void");
    }

    /* JADX INFO: renamed from: f */
    public pc m12811f() {
        return this.f21664f;
    }

    @Override // com.google.android.exoplayer2.source.fti
    /* JADX INFO: renamed from: g */
    public void mo12564g(jk jkVar) {
        ((C3634z) jkVar).ni7();
        if (jkVar == this.f21662c) {
            this.f21662c = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.source.f7l8
    @zy.dd
    /* JADX INFO: renamed from: hyr, reason: merged with bridge method [inline-methods] */
    public fti.C3596k gvn7(Void r1, fti.C3596k c3596k) {
        return c3596k.mo12557k(m12809l(c3596k.f21225k));
    }

    @Override // com.google.android.exoplayer2.source.f7l8, com.google.android.exoplayer2.source.AbstractC3605k
    public void mcp() {
        this.f21665j = false;
        this.f21663e = false;
        super.mcp();
    }

    @Override // com.google.android.exoplayer2.source.fti
    /* JADX INFO: renamed from: n */
    public tfm mo12566n() {
        return this.f21670z.mo12566n();
    }

    @Override // com.google.android.exoplayer2.source.f7l8, com.google.android.exoplayer2.source.fti
    public void n7h() {
    }

    @Override // com.google.android.exoplayer2.source.fti
    /* JADX INFO: renamed from: ncyb, reason: merged with bridge method [inline-methods] */
    public C3634z mo12565k(fti.C3596k c3596k, com.google.android.exoplayer2.upstream.toq toqVar, long j2) {
        C3634z c3634z = new C3634z(c3596k, toqVar, j2);
        c3634z.fu4(this.f21670z);
        if (this.f21665j) {
            c3634z.toq(c3596k.mo12557k(n5r1(c3596k.f21225k)));
        } else {
            this.f21662c = c3634z;
            if (!this.f21663e) {
                this.f21663e = true;
                dd(null, this.f21670z);
            }
        }
        return c3634z;
    }

    @Override // com.google.android.exoplayer2.source.f7l8, com.google.android.exoplayer2.source.AbstractC3605k
    public void wvg(@zy.dd com.google.android.exoplayer2.upstream.uv6 uv6Var) {
        super.wvg(uv6Var);
        if (this.f21669t) {
            return;
        }
        this.f21663e = true;
        dd(null, this.f21670z);
    }
}
