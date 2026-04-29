package com.google.android.exoplayer2.source;

import android.net.Uri;
import com.google.android.exoplayer2.pc;
import com.google.android.exoplayer2.source.fti;
import com.google.android.exoplayer2.tfm;
import com.google.android.exoplayer2.upstream.C3821t;
import com.google.android.exoplayer2.upstream.kja0;
import com.google.android.exoplayer2.upstream.t8r;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.xwq3;
import com.google.common.collect.se;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.b */
/* JADX INFO: compiled from: SingleSampleMediaSource.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C3577b extends AbstractC3605k {

    /* JADX INFO: renamed from: c */
    @zy.dd
    private com.google.android.exoplayer2.upstream.uv6 f21322c;

    /* JADX INFO: renamed from: f */
    private final tfm f21323f;

    /* JADX INFO: renamed from: h */
    private final kja0.InterfaceC3804k f21324h;

    /* JADX INFO: renamed from: i */
    private final xwq3 f21325i;

    /* JADX INFO: renamed from: l */
    private final pc f21326l;

    /* JADX INFO: renamed from: p */
    private final com.google.android.exoplayer2.upstream.t8r f21327p;

    /* JADX INFO: renamed from: r */
    private final boolean f21328r;

    /* JADX INFO: renamed from: t */
    private final com.google.android.exoplayer2.upstream.d3 f21329t;

    /* JADX INFO: renamed from: z */
    private final long f21330z;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.b$toq */
    /* JADX INFO: compiled from: SingleSampleMediaSource.java */
    public static final class toq {

        /* JADX INFO: renamed from: k */
        private final kja0.InterfaceC3804k f21331k;

        /* JADX INFO: renamed from: n */
        @zy.dd
        private String f21332n;

        /* JADX INFO: renamed from: q */
        @zy.dd
        private Object f21333q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private com.google.android.exoplayer2.upstream.d3 f65332toq = new C3821t();

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private boolean f65333zy = true;

        public toq(kja0.InterfaceC3804k interfaceC3804k) {
            this.f21331k = (kja0.InterfaceC3804k) C3844k.f7l8(interfaceC3804k);
        }

        /* JADX INFO: renamed from: k */
        public C3577b m12628k(tfm.ld6 ld6Var, long j2) {
            return new C3577b(this.f21332n, ld6Var, this.f21331k, j2, this.f65332toq, this.f65333zy, this.f21333q);
        }

        /* JADX INFO: renamed from: n */
        public toq m12629n(boolean z2) {
            this.f65333zy = z2;
            return this;
        }

        /* JADX INFO: renamed from: q */
        public toq m12630q(@zy.dd String str) {
            this.f21332n = str;
            return this;
        }

        public toq toq(@zy.dd com.google.android.exoplayer2.upstream.d3 d3Var) {
            if (d3Var == null) {
                d3Var = new C3821t();
            }
            this.f65332toq = d3Var;
            return this;
        }

        public toq zy(@zy.dd Object obj) {
            this.f21333q = obj;
            return this;
        }
    }

    @Override // com.google.android.exoplayer2.source.fti
    /* JADX INFO: renamed from: g */
    public void mo12564g(jk jkVar) {
        ((y9n) jkVar).m12823i();
    }

    @Override // com.google.android.exoplayer2.source.fti
    /* JADX INFO: renamed from: k */
    public jk mo12565k(fti.C3596k c3596k, com.google.android.exoplayer2.upstream.toq toqVar, long j2) {
        return new y9n(this.f21327p, this.f21324h, this.f21322c, this.f21325i, this.f21330z, this.f21329t, fn3e(c3596k), this.f21328r);
    }

    @Override // com.google.android.exoplayer2.source.AbstractC3605k
    protected void mcp() {
    }

    @Override // com.google.android.exoplayer2.source.fti
    /* JADX INFO: renamed from: n */
    public tfm mo12566n() {
        return this.f21323f;
    }

    @Override // com.google.android.exoplayer2.source.fti
    public void n7h() {
    }

    @Override // com.google.android.exoplayer2.source.AbstractC3605k
    protected void wvg(@zy.dd com.google.android.exoplayer2.upstream.uv6 uv6Var) {
        this.f21322c = uv6Var;
        m12741t(this.f21326l);
    }

    private C3577b(@zy.dd String str, tfm.ld6 ld6Var, kja0.InterfaceC3804k interfaceC3804k, long j2, com.google.android.exoplayer2.upstream.d3 d3Var, boolean z2, @zy.dd Object obj) {
        this.f21324h = interfaceC3804k;
        this.f21330z = j2;
        this.f21329t = d3Var;
        this.f21328r = z2;
        tfm tfmVarM13065k = new tfm.zy().eqxt(Uri.EMPTY).jk(ld6Var.f22181k.toString()).gvn7(se.of(ld6Var)).oc(obj).m13065k();
        this.f21323f = tfmVarM13065k;
        this.f21325i = new xwq3.toq().n5r1(str).m13945m((String) com.google.common.base.fu4.m15351k(ld6Var.f65982toq, com.google.android.exoplayer2.util.wvg.f23296b)).m13940c(ld6Var.f65983zy).yz(ld6Var.f22183q).m13943j(ld6Var.f22182n).m13942f(ld6Var.f22180g).a9();
        this.f21327p = new t8r.toq().m13521p(ld6Var.f22181k).zy(1).m13519k();
        this.f21326l = new yz(j2, true, false, false, (Object) null, tfmVarM13065k);
    }
}
