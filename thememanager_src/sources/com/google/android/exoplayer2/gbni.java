package com.google.android.exoplayer2;

import com.google.android.exoplayer2.source.C3602i;
import com.google.android.exoplayer2.source.C3625q;
import com.google.android.exoplayer2.source.C3629x;
import com.google.android.exoplayer2.source.InterfaceC3603j;
import com.google.android.exoplayer2.source.fti;
import com.google.android.exoplayer2.trackselection.InterfaceC3715s;
import com.google.android.exoplayer2.util.C3844k;

/* JADX INFO: compiled from: MediaPeriodHolder.java */
/* JADX INFO: loaded from: classes2.dex */
final class gbni {

    /* JADX INFO: renamed from: h */
    private static final String f20480h = "MediaPeriodHolder";

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public boolean f64723f7l8;

    /* JADX INFO: renamed from: g */
    public zsr0 f20481g;

    /* JADX INFO: renamed from: k */
    public final com.google.android.exoplayer2.source.jk f20482k;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private long f64724kja0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private final m4 f64725ld6;

    /* JADX INFO: renamed from: n */
    public boolean f20483n;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private com.google.android.exoplayer2.trackselection.ni7 f64726n7h;

    /* JADX INFO: renamed from: p */
    private final com.google.android.exoplayer2.trackselection.zurt f20484p;

    /* JADX INFO: renamed from: q */
    public boolean f20485q;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private C3629x f64727qrj;

    /* JADX INFO: renamed from: s */
    private final cv06[] f20486s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public final Object f64728toq;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    @zy.dd
    private gbni f64729x2;

    /* JADX INFO: renamed from: y */
    private final boolean[] f20487y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public final InterfaceC3603j[] f64730zy;

    public gbni(cv06[] cv06VarArr, long j2, com.google.android.exoplayer2.trackselection.zurt zurtVar, com.google.android.exoplayer2.upstream.toq toqVar, m4 m4Var, zsr0 zsr0Var, com.google.android.exoplayer2.trackselection.ni7 ni7Var) {
        this.f20486s = cv06VarArr;
        this.f64724kja0 = j2;
        this.f20484p = zurtVar;
        this.f64725ld6 = m4Var;
        fti.C3596k c3596k = zsr0Var.f23761k;
        this.f64728toq = c3596k.f21225k;
        this.f20481g = zsr0Var;
        this.f64727qrj = C3629x.f21698g;
        this.f64726n7h = ni7Var;
        this.f64730zy = new InterfaceC3603j[cv06VarArr.length];
        this.f20487y = new boolean[cv06VarArr.length];
        this.f20482k = m12069n(c3596k, m4Var, toqVar, zsr0Var.f67308toq, zsr0Var.f23763q);
    }

    private void f7l8(InterfaceC3603j[] interfaceC3603jArr) {
        int i2 = 0;
        while (true) {
            cv06[] cv06VarArr = this.f20486s;
            if (i2 >= cv06VarArr.length) {
                return;
            }
            if (cv06VarArr[i2].mo11551n() == -2) {
                interfaceC3603jArr[i2] = null;
            }
            i2++;
        }
    }

    private static void fn3e(m4 m4Var, com.google.android.exoplayer2.source.jk jkVar) {
        try {
            if (jkVar instanceof C3625q) {
                m4Var.m12185t(((C3625q) jkVar).f21681k);
            } else {
                m4Var.m12185t(jkVar);
            }
        } catch (RuntimeException e2) {
            com.google.android.exoplayer2.util.ni7.m13700n(f20480h, "Period release failed.", e2);
        }
    }

    /* JADX INFO: renamed from: g */
    private void m12068g() {
        if (!ki()) {
            return;
        }
        int i2 = 0;
        while (true) {
            com.google.android.exoplayer2.trackselection.ni7 ni7Var = this.f64726n7h;
            if (i2 >= ni7Var.f22335k) {
                return;
            }
            boolean zZy = ni7Var.zy(i2);
            InterfaceC3715s interfaceC3715s = this.f64726n7h.f66061zy[i2];
            if (zZy && interfaceC3715s != null) {
                interfaceC3715s.mo13135q();
            }
            i2++;
        }
    }

    private boolean ki() {
        return this.f64729x2 == null;
    }

    /* JADX INFO: renamed from: n */
    private static com.google.android.exoplayer2.source.jk m12069n(fti.C3596k c3596k, m4 m4Var, com.google.android.exoplayer2.upstream.toq toqVar, long j2, long j3) {
        com.google.android.exoplayer2.source.jk jkVarM12184s = m4Var.m12184s(c3596k, toqVar, j2);
        return j3 != C3548p.f65257toq ? new C3625q(jkVarM12184s, true, 0L, j3) : jkVarM12184s;
    }

    /* JADX INFO: renamed from: y */
    private void m12070y() {
        if (!ki()) {
            return;
        }
        int i2 = 0;
        while (true) {
            com.google.android.exoplayer2.trackselection.ni7 ni7Var = this.f64726n7h;
            if (i2 >= ni7Var.f22335k) {
                return;
            }
            boolean zZy = ni7Var.zy(i2);
            InterfaceC3715s interfaceC3715s = this.f64726n7h.f66061zy[i2];
            if (zZy && interfaceC3715s != null) {
                interfaceC3715s.kja0();
            }
            i2++;
        }
    }

    private void zy(InterfaceC3603j[] interfaceC3603jArr) {
        int i2 = 0;
        while (true) {
            cv06[] cv06VarArr = this.f20486s;
            if (i2 >= cv06VarArr.length) {
                return;
            }
            if (cv06VarArr[i2].mo11551n() == -2 && this.f64726n7h.zy(i2)) {
                interfaceC3603jArr[i2] = new C3602i();
            }
            i2++;
        }
    }

    public boolean cdj() {
        return this.f20485q && (!this.f20483n || this.f20482k.mo12595g() == Long.MIN_VALUE);
    }

    public void fu4(long j2) {
        this.f64724kja0 = j2;
    }

    /* JADX INFO: renamed from: h */
    public void m12071h(float f2, pc pcVar) throws ki {
        this.f20485q = true;
        this.f64727qrj = this.f20482k.fn3e();
        com.google.android.exoplayer2.trackselection.ni7 ni7VarZurt = zurt(f2, pcVar);
        zsr0 zsr0Var = this.f20481g;
        long jMax = zsr0Var.f67308toq;
        long j2 = zsr0Var.f23762n;
        if (j2 != C3548p.f65257toq && jMax >= j2) {
            jMax = Math.max(0L, j2 - 1);
        }
        long jM12073k = m12073k(ni7VarZurt, jMax, false);
        long j3 = this.f64724kja0;
        zsr0 zsr0Var2 = this.f20481g;
        this.f64724kja0 = j3 + (zsr0Var2.f67308toq - jM12073k);
        this.f20481g = zsr0Var2.toq(jM12073k);
    }

    /* JADX INFO: renamed from: i */
    public void m12072i() {
        m12068g();
        fn3e(this.f64725ld6, this.f20482k);
    }

    /* JADX INFO: renamed from: k */
    public long m12073k(com.google.android.exoplayer2.trackselection.ni7 ni7Var, long j2, boolean z2) {
        return toq(ni7Var, j2, z2, new boolean[this.f20486s.length]);
    }

    public com.google.android.exoplayer2.trackselection.ni7 kja0() {
        return this.f64726n7h;
    }

    public long ld6() {
        if (this.f20485q) {
            return this.f20482k.zy();
        }
        return 0L;
    }

    public C3629x n7h() {
        return this.f64727qrj;
    }

    public void ni7(@zy.dd gbni gbniVar) {
        if (gbniVar == this.f64729x2) {
            return;
        }
        m12068g();
        this.f64729x2 = gbniVar;
        m12070y();
    }

    public long o1t(long j2) {
        return j2 + x2();
    }

    @zy.dd
    /* JADX INFO: renamed from: p */
    public gbni m12074p() {
        return this.f64729x2;
    }

    /* JADX INFO: renamed from: q */
    public void m12075q(long j2) {
        C3844k.m13633s(ki());
        this.f20482k.mo12597n(m12077z(j2));
    }

    public long qrj() {
        return this.f20481g.f67308toq + this.f64724kja0;
    }

    /* JADX INFO: renamed from: s */
    public long m12076s() {
        if (!this.f20485q) {
            return this.f20481g.f67308toq;
        }
        long jMo12595g = this.f20483n ? this.f20482k.mo12595g() : Long.MIN_VALUE;
        return jMo12595g == Long.MIN_VALUE ? this.f20481g.f23762n : jMo12595g;
    }

    public void t8r(long j2) {
        C3844k.m13633s(ki());
        if (this.f20485q) {
            this.f20482k.f7l8(m12077z(j2));
        }
    }

    public long toq(com.google.android.exoplayer2.trackselection.ni7 ni7Var, long j2, boolean z2, boolean[] zArr) {
        int i2 = 0;
        while (true) {
            boolean z3 = true;
            if (i2 >= ni7Var.f22335k) {
                break;
            }
            boolean[] zArr2 = this.f20487y;
            if (z2 || !ni7Var.toq(this.f64726n7h, i2)) {
                z3 = false;
            }
            zArr2[i2] = z3;
            i2++;
        }
        f7l8(this.f64730zy);
        m12068g();
        this.f64726n7h = ni7Var;
        m12070y();
        long jKja0 = this.f20482k.kja0(ni7Var.f66061zy, this.f20487y, this.f64730zy, zArr, j2);
        zy(this.f64730zy);
        this.f20483n = false;
        int i3 = 0;
        while (true) {
            InterfaceC3603j[] interfaceC3603jArr = this.f64730zy;
            if (i3 >= interfaceC3603jArr.length) {
                return jKja0;
            }
            if (interfaceC3603jArr[i3] != null) {
                C3844k.m13633s(ni7Var.zy(i3));
                if (this.f20486s[i3].mo11551n() != -2) {
                    this.f20483n = true;
                }
            } else {
                C3844k.m13633s(ni7Var.f66061zy[i3] == null);
            }
            i3++;
        }
    }

    public void wvg() {
        com.google.android.exoplayer2.source.jk jkVar = this.f20482k;
        if (jkVar instanceof C3625q) {
            long j2 = this.f20481g.f23763q;
            if (j2 == C3548p.f65257toq) {
                j2 = Long.MIN_VALUE;
            }
            ((C3625q) jkVar).m12814i(0L, j2);
        }
    }

    public long x2() {
        return this.f64724kja0;
    }

    /* JADX INFO: renamed from: z */
    public long m12077z(long j2) {
        return j2 - x2();
    }

    public com.google.android.exoplayer2.trackselection.ni7 zurt(float f2, pc pcVar) throws ki {
        com.google.android.exoplayer2.trackselection.ni7 ni7VarF7l8 = this.f20484p.f7l8(this.f20486s, n7h(), this.f20481g.f23761k, pcVar);
        for (InterfaceC3715s interfaceC3715s : ni7VarF7l8.f66061zy) {
            if (interfaceC3715s != null) {
                interfaceC3715s.mo13136s(f2);
            }
        }
        return ni7VarF7l8;
    }
}
