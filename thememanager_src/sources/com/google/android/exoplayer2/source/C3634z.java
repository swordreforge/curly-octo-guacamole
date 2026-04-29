package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.C3548p;
import com.google.android.exoplayer2.mbx;
import com.google.android.exoplayer2.source.fti;
import com.google.android.exoplayer2.source.jk;
import com.google.android.exoplayer2.trackselection.InterfaceC3715s;
import com.google.android.exoplayer2.util.C3844k;
import java.io.IOException;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.z */
/* JADX INFO: compiled from: MaskingMediaPeriod.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C3634z implements jk, jk.InterfaceC3604k {

    /* JADX INFO: renamed from: g */
    private fti f21759g;

    /* JADX INFO: renamed from: h */
    private boolean f21760h;

    /* JADX INFO: renamed from: i */
    private long f21761i = C3548p.f65257toq;

    /* JADX INFO: renamed from: k */
    public final fti.C3596k f21762k;

    /* JADX INFO: renamed from: n */
    private final com.google.android.exoplayer2.upstream.toq f21763n;

    /* JADX INFO: renamed from: p */
    @zy.dd
    private k f21764p;

    /* JADX INFO: renamed from: q */
    private final long f21765q;

    /* JADX INFO: renamed from: s */
    @zy.dd
    private jk.InterfaceC3604k f21766s;

    /* JADX INFO: renamed from: y */
    private jk f21767y;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.z$k */
    /* JADX INFO: compiled from: MaskingMediaPeriod.java */
    public interface k {
        /* JADX INFO: renamed from: k */
        void mo12581k(fti.C3596k c3596k);

        void toq(fti.C3596k c3596k, IOException iOException);
    }

    public C3634z(fti.C3596k c3596k, com.google.android.exoplayer2.upstream.toq toqVar, long j2) {
        this.f21762k = c3596k;
        this.f21763n = toqVar;
        this.f21765q = j2;
    }

    private long cdj(long j2) {
        long j3 = this.f21761i;
        return j3 != C3548p.f65257toq ? j3 : j2;
    }

    @Override // com.google.android.exoplayer2.source.jk, com.google.android.exoplayer2.source.InterfaceC3622o
    public void f7l8(long j2) {
        ((jk) com.google.android.exoplayer2.util.lrht.ld6(this.f21767y)).f7l8(j2);
    }

    @Override // com.google.android.exoplayer2.source.jk
    public C3629x fn3e() {
        return ((jk) com.google.android.exoplayer2.util.lrht.ld6(this.f21767y)).fn3e();
    }

    public void fu4(fti ftiVar) {
        C3844k.m13633s(this.f21759g == null);
        this.f21759g = ftiVar;
    }

    @Override // com.google.android.exoplayer2.source.jk, com.google.android.exoplayer2.source.InterfaceC3622o
    /* JADX INFO: renamed from: g */
    public long mo12595g() {
        return ((jk) com.google.android.exoplayer2.util.lrht.ld6(this.f21767y)).mo12595g();
    }

    /* JADX INFO: renamed from: h */
    public long m12827h() {
        return this.f21765q;
    }

    /* JADX INFO: renamed from: i */
    public void m12828i(long j2) {
        this.f21761i = j2;
    }

    @Override // com.google.android.exoplayer2.source.jk, com.google.android.exoplayer2.source.InterfaceC3622o
    /* JADX INFO: renamed from: k */
    public boolean mo12596k() {
        jk jkVar = this.f21767y;
        return jkVar != null && jkVar.mo12596k();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC3622o.k
    /* JADX INFO: renamed from: ki, reason: merged with bridge method [inline-methods] */
    public void mo12411y(jk jkVar) {
        ((jk.InterfaceC3604k) com.google.android.exoplayer2.util.lrht.ld6(this.f21766s)).mo12411y(this);
    }

    @Override // com.google.android.exoplayer2.source.jk
    public long kja0(InterfaceC3715s[] interfaceC3715sArr, boolean[] zArr, InterfaceC3603j[] interfaceC3603jArr, boolean[] zArr2, long j2) {
        long j3;
        long j4 = this.f21761i;
        if (j4 == C3548p.f65257toq || j2 != this.f21765q) {
            j3 = j2;
        } else {
            this.f21761i = C3548p.f65257toq;
            j3 = j4;
        }
        return ((jk) com.google.android.exoplayer2.util.lrht.ld6(this.f21767y)).kja0(interfaceC3715sArr, zArr, interfaceC3603jArr, zArr2, j3);
    }

    @Override // com.google.android.exoplayer2.source.jk.InterfaceC3604k
    public void ld6(jk jkVar) {
        ((jk.InterfaceC3604k) com.google.android.exoplayer2.util.lrht.ld6(this.f21766s)).ld6(this);
        k kVar = this.f21764p;
        if (kVar != null) {
            kVar.mo12581k(this.f21762k);
        }
    }

    @Override // com.google.android.exoplayer2.source.jk, com.google.android.exoplayer2.source.InterfaceC3622o
    /* JADX INFO: renamed from: n */
    public boolean mo12597n(long j2) {
        jk jkVar = this.f21767y;
        return jkVar != null && jkVar.mo12597n(j2);
    }

    @Override // com.google.android.exoplayer2.source.jk
    public void n7h(jk.InterfaceC3604k interfaceC3604k, long j2) {
        this.f21766s = interfaceC3604k;
        jk jkVar = this.f21767y;
        if (jkVar != null) {
            jkVar.n7h(this, cdj(this.f21765q));
        }
    }

    public void ni7() {
        if (this.f21767y != null) {
            ((fti) C3844k.f7l8(this.f21759g)).mo12564g(this.f21767y);
        }
    }

    @Override // com.google.android.exoplayer2.source.jk
    /* JADX INFO: renamed from: q */
    public long mo12599q(long j2, mbx mbxVar) {
        return ((jk) com.google.android.exoplayer2.util.lrht.ld6(this.f21767y)).mo12599q(j2, mbxVar);
    }

    @Override // com.google.android.exoplayer2.source.jk
    public long qrj() {
        return ((jk) com.google.android.exoplayer2.util.lrht.ld6(this.f21767y)).qrj();
    }

    /* JADX INFO: renamed from: s */
    public long m12829s() {
        return this.f21761i;
    }

    @Override // com.google.android.exoplayer2.source.jk
    public void t8r() throws IOException {
        try {
            jk jkVar = this.f21767y;
            if (jkVar != null) {
                jkVar.t8r();
            } else {
                fti ftiVar = this.f21759g;
                if (ftiVar != null) {
                    ftiVar.n7h();
                }
            }
        } catch (IOException e2) {
            k kVar = this.f21764p;
            if (kVar == null) {
                throw e2;
            }
            if (this.f21760h) {
                return;
            }
            this.f21760h = true;
            kVar.toq(this.f21762k, e2);
        }
    }

    public void toq(fti.C3596k c3596k) {
        long jCdj = cdj(this.f21765q);
        jk jkVarMo12565k = ((fti) C3844k.f7l8(this.f21759g)).mo12565k(c3596k, this.f21763n, jCdj);
        this.f21767y = jkVarMo12565k;
        if (this.f21766s != null) {
            jkVarMo12565k.n7h(this, jCdj);
        }
    }

    @Override // com.google.android.exoplayer2.source.jk
    public long x2(long j2) {
        return ((jk) com.google.android.exoplayer2.util.lrht.ld6(this.f21767y)).x2(j2);
    }

    /* JADX INFO: renamed from: z */
    public void m12830z(k kVar) {
        this.f21764p = kVar;
    }

    @Override // com.google.android.exoplayer2.source.jk
    public void zurt(long j2, boolean z2) {
        ((jk) com.google.android.exoplayer2.util.lrht.ld6(this.f21767y)).zurt(j2, z2);
    }

    @Override // com.google.android.exoplayer2.source.jk, com.google.android.exoplayer2.source.InterfaceC3622o
    public long zy() {
        return ((jk) com.google.android.exoplayer2.util.lrht.ld6(this.f21767y)).zy();
    }
}
