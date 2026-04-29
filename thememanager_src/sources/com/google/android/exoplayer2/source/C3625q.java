package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.C3548p;
import com.google.android.exoplayer2.C3865v;
import com.google.android.exoplayer2.decoder.C3297s;
import com.google.android.exoplayer2.mbx;
import com.google.android.exoplayer2.source.C3619n;
import com.google.android.exoplayer2.source.jk;
import com.google.android.exoplayer2.trackselection.InterfaceC3715s;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.xwq3;
import java.io.IOException;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.q */
/* JADX INFO: compiled from: ClippingMediaPeriod.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C3625q implements jk, jk.InterfaceC3604k {

    /* JADX INFO: renamed from: g */
    private long f21680g;

    /* JADX INFO: renamed from: k */
    public final jk f21681k;

    /* JADX INFO: renamed from: n */
    private k[] f21682n = new k[0];

    /* JADX INFO: renamed from: p */
    @zy.dd
    private C3619n.toq f21683p;

    /* JADX INFO: renamed from: q */
    @zy.dd
    private jk.InterfaceC3604k f21684q;

    /* JADX INFO: renamed from: s */
    long f21685s;

    /* JADX INFO: renamed from: y */
    long f21686y;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.q$k */
    /* JADX INFO: compiled from: ClippingMediaPeriod.java */
    private final class k implements InterfaceC3603j {

        /* JADX INFO: renamed from: k */
        public final InterfaceC3603j f21687k;

        /* JADX INFO: renamed from: q */
        private boolean f21689q;

        public k(InterfaceC3603j interfaceC3603j) {
            this.f21687k = interfaceC3603j;
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC3603j
        public int cdj(long j2) {
            if (C3625q.this.m12815s()) {
                return -3;
            }
            return this.f21687k.cdj(j2);
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC3603j
        public boolean isReady() {
            return !C3625q.this.m12815s() && this.f21687k.isReady();
        }

        /* JADX INFO: renamed from: k */
        public void m12816k() {
            this.f21689q = false;
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC3603j
        /* JADX INFO: renamed from: s */
        public int mo12610s(C3865v c3865v, C3297s c3297s, int i2) {
            if (C3625q.this.m12815s()) {
                return -3;
            }
            if (this.f21689q) {
                c3297s.m11565h(4);
                return -4;
            }
            int iMo12610s = this.f21687k.mo12610s(c3865v, c3297s, i2);
            if (iMo12610s == -5) {
                xwq3 xwq3Var = (xwq3) C3844k.f7l8(c3865v.f67166toq);
                int i3 = xwq3Var.f67273ab;
                if (i3 != 0 || xwq3Var.bb != 0) {
                    C3625q c3625q = C3625q.this;
                    if (c3625q.f21686y != 0) {
                        i3 = 0;
                    }
                    c3865v.f67166toq = xwq3Var.toq().m13947r(i3).dd(c3625q.f21685s == Long.MIN_VALUE ? xwq3Var.bb : 0).a9();
                }
                return -5;
            }
            C3625q c3625q2 = C3625q.this;
            long j2 = c3625q2.f21685s;
            if (j2 == Long.MIN_VALUE || ((iMo12610s != -4 || c3297s.f19618s < j2) && !(iMo12610s == -3 && c3625q2.mo12595g() == Long.MIN_VALUE && !c3297s.f19619y))) {
                return iMo12610s;
            }
            c3297s.mo11567s();
            c3297s.m11565h(4);
            this.f21689q = true;
            return -4;
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC3603j
        public void toq() throws IOException {
            this.f21687k.toq();
        }
    }

    public C3625q(jk jkVar, boolean z2, long j2, long j3) {
        this.f21681k = jkVar;
        this.f21680g = z2 ? j2 : C3548p.f65257toq;
        this.f21686y = j2;
        this.f21685s = j3;
    }

    private static boolean ki(long j2, InterfaceC3715s[] interfaceC3715sArr) {
        if (j2 != 0) {
            for (InterfaceC3715s interfaceC3715s : interfaceC3715sArr) {
                if (interfaceC3715s != null) {
                    xwq3 xwq3VarMo13151i = interfaceC3715s.mo13151i();
                    if (!com.google.android.exoplayer2.util.wvg.m13746k(xwq3VarMo13151i.f23682r, xwq3VarMo13151i.f23673i)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private mbx toq(long j2, mbx mbxVar) {
        long jM13660i = com.google.android.exoplayer2.util.lrht.m13660i(mbxVar.f20641k, 0L, j2 - this.f21686y);
        long j3 = mbxVar.f64927toq;
        long j4 = this.f21685s;
        long jM13660i2 = com.google.android.exoplayer2.util.lrht.m13660i(j3, 0L, j4 == Long.MIN_VALUE ? Long.MAX_VALUE : j4 - j2);
        return (jM13660i == mbxVar.f20641k && jM13660i2 == mbxVar.f64927toq) ? mbxVar : new mbx(jM13660i, jM13660i2);
    }

    public void cdj(C3619n.toq toqVar) {
        this.f21683p = toqVar;
    }

    @Override // com.google.android.exoplayer2.source.jk, com.google.android.exoplayer2.source.InterfaceC3622o
    public void f7l8(long j2) {
        this.f21681k.f7l8(j2);
    }

    @Override // com.google.android.exoplayer2.source.jk
    public C3629x fn3e() {
        return this.f21681k.fn3e();
    }

    @Override // com.google.android.exoplayer2.source.jk, com.google.android.exoplayer2.source.InterfaceC3622o
    /* JADX INFO: renamed from: g */
    public long mo12595g() {
        long jMo12595g = this.f21681k.mo12595g();
        if (jMo12595g != Long.MIN_VALUE) {
            long j2 = this.f21685s;
            if (j2 == Long.MIN_VALUE || jMo12595g < j2) {
                return jMo12595g;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC3622o.k
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void mo12411y(jk jkVar) {
        ((jk.InterfaceC3604k) C3844k.f7l8(this.f21684q)).mo12411y(this);
    }

    /* JADX INFO: renamed from: i */
    public void m12814i(long j2, long j3) {
        this.f21686y = j2;
        this.f21685s = j3;
    }

    @Override // com.google.android.exoplayer2.source.jk, com.google.android.exoplayer2.source.InterfaceC3622o
    /* JADX INFO: renamed from: k */
    public boolean mo12596k() {
        return this.f21681k.mo12596k();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
    @Override // com.google.android.exoplayer2.source.jk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long kja0(com.google.android.exoplayer2.trackselection.InterfaceC3715s[] r13, boolean[] r14, com.google.android.exoplayer2.source.InterfaceC3603j[] r15, boolean[] r16, long r17) {
        /*
            r12 = this;
            r0 = r12
            r1 = r15
            int r2 = r1.length
            com.google.android.exoplayer2.source.q$k[] r2 = new com.google.android.exoplayer2.source.C3625q.k[r2]
            r0.f21682n = r2
            int r2 = r1.length
            com.google.android.exoplayer2.source.j[] r9 = new com.google.android.exoplayer2.source.InterfaceC3603j[r2]
            r10 = 0
            r2 = r10
        Lc:
            int r3 = r1.length
            r11 = 0
            if (r2 >= r3) goto L21
            com.google.android.exoplayer2.source.q$k[] r3 = r0.f21682n
            r4 = r1[r2]
            com.google.android.exoplayer2.source.q$k r4 = (com.google.android.exoplayer2.source.C3625q.k) r4
            r3[r2] = r4
            if (r4 == 0) goto L1c
            com.google.android.exoplayer2.source.j r11 = r4.f21687k
        L1c:
            r9[r2] = r11
            int r2 = r2 + 1
            goto Lc
        L21:
            com.google.android.exoplayer2.source.jk r2 = r0.f21681k
            r3 = r13
            r4 = r14
            r5 = r9
            r6 = r16
            r7 = r17
            long r2 = r2.kja0(r3, r4, r5, r6, r7)
            boolean r4 = r12.m12815s()
            if (r4 == 0) goto L43
            long r4 = r0.f21686y
            int r6 = (r17 > r4 ? 1 : (r17 == r4 ? 0 : -1))
            if (r6 != 0) goto L43
            r6 = r13
            boolean r4 = ki(r4, r13)
            if (r4 == 0) goto L43
            r4 = r2
            goto L48
        L43:
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L48:
            r0.f21680g = r4
            int r4 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r4 == 0) goto L63
            long r4 = r0.f21686y
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 < 0) goto L61
            long r4 = r0.f21685s
            r6 = -9223372036854775808
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 == 0) goto L63
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 > 0) goto L61
            goto L63
        L61:
            r4 = r10
            goto L64
        L63:
            r4 = 1
        L64:
            com.google.android.exoplayer2.util.C3844k.m13633s(r4)
        L67:
            int r4 = r1.length
            if (r10 >= r4) goto L8d
            r4 = r9[r10]
            if (r4 != 0) goto L73
            com.google.android.exoplayer2.source.q$k[] r4 = r0.f21682n
            r4[r10] = r11
            goto L84
        L73:
            com.google.android.exoplayer2.source.q$k[] r5 = r0.f21682n
            r6 = r5[r10]
            if (r6 == 0) goto L7d
            com.google.android.exoplayer2.source.j r6 = r6.f21687k
            if (r6 == r4) goto L84
        L7d:
            com.google.android.exoplayer2.source.q$k r6 = new com.google.android.exoplayer2.source.q$k
            r6.<init>(r4)
            r5[r10] = r6
        L84:
            com.google.android.exoplayer2.source.q$k[] r4 = r0.f21682n
            r4 = r4[r10]
            r1[r10] = r4
            int r10 = r10 + 1
            goto L67
        L8d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.C3625q.kja0(com.google.android.exoplayer2.trackselection.s[], boolean[], com.google.android.exoplayer2.source.j[], boolean[], long):long");
    }

    @Override // com.google.android.exoplayer2.source.jk.InterfaceC3604k
    public void ld6(jk jkVar) {
        if (this.f21683p != null) {
            return;
        }
        ((jk.InterfaceC3604k) C3844k.f7l8(this.f21684q)).ld6(this);
    }

    @Override // com.google.android.exoplayer2.source.jk, com.google.android.exoplayer2.source.InterfaceC3622o
    /* JADX INFO: renamed from: n */
    public boolean mo12597n(long j2) {
        return this.f21681k.mo12597n(j2);
    }

    @Override // com.google.android.exoplayer2.source.jk
    public void n7h(jk.InterfaceC3604k interfaceC3604k, long j2) {
        this.f21684q = interfaceC3604k;
        this.f21681k.n7h(this, j2);
    }

    @Override // com.google.android.exoplayer2.source.jk
    /* JADX INFO: renamed from: q */
    public long mo12599q(long j2, mbx mbxVar) {
        long j3 = this.f21686y;
        if (j2 == j3) {
            return j3;
        }
        return this.f21681k.mo12599q(j2, toq(j2, mbxVar));
    }

    @Override // com.google.android.exoplayer2.source.jk
    public long qrj() {
        if (m12815s()) {
            long j2 = this.f21680g;
            this.f21680g = C3548p.f65257toq;
            long jQrj = qrj();
            return jQrj != C3548p.f65257toq ? jQrj : j2;
        }
        long jQrj2 = this.f21681k.qrj();
        if (jQrj2 == C3548p.f65257toq) {
            return C3548p.f65257toq;
        }
        boolean z2 = true;
        C3844k.m13633s(jQrj2 >= this.f21686y);
        long j3 = this.f21685s;
        if (j3 != Long.MIN_VALUE && jQrj2 > j3) {
            z2 = false;
        }
        C3844k.m13633s(z2);
        return jQrj2;
    }

    /* JADX INFO: renamed from: s */
    boolean m12815s() {
        return this.f21680g != C3548p.f65257toq;
    }

    @Override // com.google.android.exoplayer2.source.jk
    public void t8r() throws IOException {
        C3619n.toq toqVar = this.f21683p;
        if (toqVar != null) {
            throw toqVar;
        }
        this.f21681k.t8r();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    @Override // com.google.android.exoplayer2.source.jk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long x2(long r6) {
        /*
            r5 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5.f21680g = r0
            com.google.android.exoplayer2.source.q$k[] r0 = r5.f21682n
            int r1 = r0.length
            r2 = 0
            r3 = r2
        Lc:
            if (r3 >= r1) goto L18
            r4 = r0[r3]
            if (r4 == 0) goto L15
            r4.m12816k()
        L15:
            int r3 = r3 + 1
            goto Lc
        L18:
            com.google.android.exoplayer2.source.jk r0 = r5.f21681k
            long r0 = r0.x2(r6)
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 == 0) goto L34
            long r6 = r5.f21686y
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 < 0) goto L35
            long r6 = r5.f21685s
            r3 = -9223372036854775808
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 == 0) goto L34
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 > 0) goto L35
        L34:
            r2 = 1
        L35:
            com.google.android.exoplayer2.util.C3844k.m13633s(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.C3625q.x2(long):long");
    }

    @Override // com.google.android.exoplayer2.source.jk
    public void zurt(long j2, boolean z2) {
        this.f21681k.zurt(j2, z2);
    }

    @Override // com.google.android.exoplayer2.source.jk, com.google.android.exoplayer2.source.InterfaceC3622o
    public long zy() {
        long jZy = this.f21681k.zy();
        if (jZy != Long.MIN_VALUE) {
            long j2 = this.f21685s;
            if (j2 == Long.MIN_VALUE || jZy < j2) {
                return jZy;
            }
        }
        return Long.MIN_VALUE;
    }
}
