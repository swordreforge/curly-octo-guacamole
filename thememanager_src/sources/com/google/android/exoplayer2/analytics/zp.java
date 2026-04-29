package com.google.android.exoplayer2.analytics;

import android.os.Looper;
import android.util.SparseArray;
import com.google.android.exoplayer2.analytics.InterfaceC3239x;
import com.google.android.exoplayer2.audio.C3248g;
import com.google.android.exoplayer2.drm.InterfaceC3312i;
import com.google.android.exoplayer2.gc3c;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.pc;
import com.google.android.exoplayer2.pjz9;
import com.google.android.exoplayer2.source.C3629x;
import com.google.android.exoplayer2.source.fti;
import com.google.android.exoplayer2.tfm;
import com.google.android.exoplayer2.upstream.InterfaceC3808n;
import com.google.android.exoplayer2.util.C3839h;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.InterfaceC3850n;
import com.google.android.exoplayer2.util.zurt;
import com.google.android.exoplayer2.video.InterfaceC3894z;
import com.google.android.exoplayer2.was;
import com.google.android.exoplayer2.xwq3;
import com.google.android.exoplayer2.yqrt;
import com.google.common.base.C4280z;
import com.google.common.collect.nsb;
import com.google.common.collect.se;
import com.google.common.collect.zkd;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import zy.InterfaceC7842s;

/* JADX INFO: compiled from: AnalyticsCollector.java */
/* JADX INFO: loaded from: classes2.dex */
public class zp implements gc3c.InterfaceC3440y, com.google.android.exoplayer2.audio.fn3e, InterfaceC3894z, com.google.android.exoplayer2.source.lvui, InterfaceC3808n.k, InterfaceC3312i {

    /* JADX INFO: renamed from: g */
    private final C3242k f19278g;

    /* JADX INFO: renamed from: h */
    private com.google.android.exoplayer2.util.ki f19279h;

    /* JADX INFO: renamed from: i */
    private boolean f19280i;

    /* JADX INFO: renamed from: k */
    private final InterfaceC3850n f19281k;

    /* JADX INFO: renamed from: n */
    private final pc.C3550q f19282n;

    /* JADX INFO: renamed from: p */
    private gc3c f19283p;

    /* JADX INFO: renamed from: q */
    private final pc.toq f19284q;

    /* JADX INFO: renamed from: s */
    private com.google.android.exoplayer2.util.zurt<InterfaceC3239x> f19285s;

    /* JADX INFO: renamed from: y */
    private final SparseArray<InterfaceC3239x.toq> f19286y;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.analytics.zp$k */
    /* JADX INFO: compiled from: AnalyticsCollector.java */
    private static final class C3242k {

        /* JADX INFO: renamed from: g */
        private fti.C3596k f19287g;

        /* JADX INFO: renamed from: k */
        private final pc.toq f19288k;

        /* JADX INFO: renamed from: n */
        private fti.C3596k f19289n;

        /* JADX INFO: renamed from: q */
        @zy.dd
        private fti.C3596k f19290q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private se<fti.C3596k> f63307toq = se.of();

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private zkd<fti.C3596k, pc> f63308zy = zkd.of();

        public C3242k(pc.toq toqVar) {
            this.f19288k = toqVar;
        }

        private void qrj(pc pcVar) {
            zkd.toq<fti.C3596k, pc> toqVarBuilder = zkd.builder();
            if (this.f63307toq.isEmpty()) {
                toq(toqVarBuilder, this.f19289n, pcVar);
                if (!C4280z.m15455k(this.f19287g, this.f19289n)) {
                    toq(toqVarBuilder, this.f19287g, pcVar);
                }
                if (!C4280z.m15455k(this.f19290q, this.f19289n) && !C4280z.m15455k(this.f19290q, this.f19287g)) {
                    toq(toqVarBuilder, this.f19290q, pcVar);
                }
            } else {
                for (int i2 = 0; i2 < this.f63307toq.size(); i2++) {
                    toq(toqVarBuilder, this.f63307toq.get(i2), pcVar);
                }
                if (!this.f63307toq.contains(this.f19290q)) {
                    toq(toqVarBuilder, this.f19290q, pcVar);
                }
            }
            this.f63308zy = toqVarBuilder.mo15589k();
        }

        /* JADX INFO: renamed from: s */
        private static boolean m11380s(fti.C3596k c3596k, @zy.dd Object obj, boolean z2, int i2, int i3, int i4) {
            if (c3596k.f21225k.equals(obj)) {
                return (z2 && c3596k.f65325toq == i2 && c3596k.f65326zy == i3) || (!z2 && c3596k.f65325toq == -1 && c3596k.f21226n == i4);
            }
            return false;
        }

        private void toq(zkd.toq<fti.C3596k, pc> toqVar, @zy.dd fti.C3596k c3596k, pc pcVar) {
            if (c3596k == null) {
                return;
            }
            if (pcVar.mo12147g(c3596k.f21225k) != -1) {
                toqVar.mo15592q(c3596k, pcVar);
                return;
            }
            pc pcVar2 = this.f63308zy.get(c3596k);
            if (pcVar2 != null) {
                toqVar.mo15592q(c3596k, pcVar2);
            }
        }

        @zy.dd
        private static fti.C3596k zy(gc3c gc3cVar, se<fti.C3596k> seVar, @zy.dd fti.C3596k c3596k, pc.toq toqVar) {
            pc pcVarD8wk = gc3cVar.d8wk();
            int iKtq = gc3cVar.ktq();
            Object objT8r = pcVarD8wk.ni7() ? null : pcVarD8wk.t8r(iKtq);
            int iF7l8 = (gc3cVar.mo12088r() || pcVarD8wk.ni7()) ? -1 : pcVarD8wk.m12485p(iKtq, toqVar).f7l8(com.google.android.exoplayer2.util.lrht.v0af(gc3cVar.getCurrentPosition()) - toqVar.ki());
            for (int i2 = 0; i2 < seVar.size(); i2++) {
                fti.C3596k c3596k2 = seVar.get(i2);
                if (m11380s(c3596k2, objT8r, gc3cVar.mo12088r(), gc3cVar.mo12091v(), gc3cVar.h7am(), iF7l8)) {
                    return c3596k2;
                }
            }
            if (seVar.isEmpty() && c3596k != null) {
                if (m11380s(c3596k, objT8r, gc3cVar.mo12088r(), gc3cVar.mo12091v(), gc3cVar.h7am(), iF7l8)) {
                    return c3596k;
                }
            }
            return null;
        }

        @zy.dd
        public fti.C3596k f7l8() {
            return this.f19289n;
        }

        @zy.dd
        /* JADX INFO: renamed from: g */
        public pc m11381g(fti.C3596k c3596k) {
            return this.f63308zy.get(c3596k);
        }

        public void ld6(List<fti.C3596k> list, @zy.dd fti.C3596k c3596k, gc3c gc3cVar) {
            this.f63307toq = se.copyOf((Collection) list);
            if (!list.isEmpty()) {
                this.f19289n = list.get(0);
                this.f19287g = (fti.C3596k) C3844k.f7l8(c3596k);
            }
            if (this.f19290q == null) {
                this.f19290q = zy(gc3cVar, this.f63307toq, this.f19289n, this.f19288k);
            }
            qrj(gc3cVar.d8wk());
        }

        @zy.dd
        /* JADX INFO: renamed from: n */
        public fti.C3596k m11382n() {
            if (this.f63307toq.isEmpty()) {
                return null;
            }
            return (fti.C3596k) nsb.ni7(this.f63307toq);
        }

        /* JADX INFO: renamed from: p */
        public void m11383p(gc3c gc3cVar) {
            this.f19290q = zy(gc3cVar, this.f63307toq, this.f19289n, this.f19288k);
        }

        @zy.dd
        /* JADX INFO: renamed from: q */
        public fti.C3596k m11384q() {
            return this.f19290q;
        }

        public void x2(gc3c gc3cVar) {
            this.f19290q = zy(gc3cVar, this.f63307toq, this.f19289n, this.f19288k);
            qrj(gc3cVar.d8wk());
        }

        @zy.dd
        /* JADX INFO: renamed from: y */
        public fti.C3596k m11385y() {
            return this.f19287g;
        }
    }

    public zp(InterfaceC3850n interfaceC3850n) {
        this.f19281k = (InterfaceC3850n) C3844k.f7l8(interfaceC3850n);
        this.f19285s = new com.google.android.exoplayer2.util.zurt<>(com.google.android.exoplayer2.util.lrht.uv6(), interfaceC3850n, new zurt.toq() { // from class: com.google.android.exoplayer2.analytics.p
            @Override // com.google.android.exoplayer2.util.zurt.toq
            /* JADX INFO: renamed from: k */
            public final void mo11290k(Object obj, C3839h c3839h) {
                zp.lw((InterfaceC3239x) obj, c3839h);
            }
        });
        pc.toq toqVar = new pc.toq();
        this.f19284q = toqVar;
        this.f19282n = new pc.C3550q();
        this.f19278g = new C3242k(toqVar);
        this.f19286y = new SparseArray<>();
    }

    private InterfaceC3239x.toq a5id() {
        return ga(this.f19278g.m11385y());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b8(InterfaceC3239x.toq toqVar, com.google.android.exoplayer2.decoder.f7l8 f7l8Var, InterfaceC3239x interfaceC3239x) {
        interfaceC3239x.mo11347s(toqVar, f7l8Var);
        interfaceC3239x.ld6(toqVar, 1, f7l8Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b9ub(InterfaceC3239x.toq toqVar, com.google.android.exoplayer2.decoder.f7l8 f7l8Var, InterfaceC3239x interfaceC3239x) {
        interfaceC3239x.lrht(toqVar, f7l8Var);
        interfaceC3239x.gyi(toqVar, 1, f7l8Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void bih(InterfaceC3239x.toq toqVar, boolean z2, InterfaceC3239x interfaceC3239x) {
        interfaceC3239x.f7l8(toqVar, z2);
        interfaceC3239x.dr(toqVar, z2);
    }

    private InterfaceC3239x.toq dxef(int i2, @zy.dd fti.C3596k c3596k) {
        C3844k.f7l8(this.f19283p);
        if (c3596k != null) {
            return this.f19278g.m11381g(c3596k) != null ? ga(c3596k) : wlev(pc.f21113k, i2, c3596k);
        }
        pc pcVarD8wk = this.f19283p.d8wk();
        if (!(i2 < pcVarD8wk.zurt())) {
            pcVarD8wk = pc.f21113k;
        }
        return wlev(pcVarD8wk, i2, null);
    }

    private InterfaceC3239x.toq e5() {
        return ga(this.f19278g.m11382n());
    }

    private InterfaceC3239x.toq ga(@zy.dd fti.C3596k c3596k) {
        C3844k.f7l8(this.f19283p);
        pc pcVarM11381g = c3596k == null ? null : this.f19278g.m11381g(c3596k);
        if (c3596k != null && pcVarM11381g != null) {
            return wlev(pcVarM11381g, pcVarM11381g.x2(c3596k.f21225k, this.f19284q).f21151n, c3596k);
        }
        int iLw = this.f19283p.lw();
        pc pcVarD8wk = this.f19283p.d8wk();
        if (!(iLw < pcVarD8wk.zurt())) {
            pcVarD8wk = pc.f21113k;
        }
        return wlev(pcVarD8wk, iLw, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lk(InterfaceC3239x.toq toqVar, com.google.android.exoplayer2.decoder.f7l8 f7l8Var, InterfaceC3239x interfaceC3239x) {
        interfaceC3239x.uv6(toqVar, f7l8Var);
        interfaceC3239x.ld6(toqVar, 2, f7l8Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lw(InterfaceC3239x interfaceC3239x, C3839h c3839h) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void m58i(InterfaceC3239x.toq toqVar, String str, long j2, long j3, InterfaceC3239x interfaceC3239x) {
        interfaceC3239x.qrj(toqVar, str, j2);
        interfaceC3239x.vyq(toqVar, str, j3, j2);
        interfaceC3239x.ncyb(toqVar, 1, str, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void nme(InterfaceC3239x.toq toqVar, xwq3 xwq3Var, com.google.android.exoplayer2.decoder.ld6 ld6Var, InterfaceC3239x interfaceC3239x) {
        interfaceC3239x.ek5k(toqVar, xwq3Var);
        interfaceC3239x.mo11349u(toqVar, xwq3Var, ld6Var);
        interfaceC3239x.m11346r(toqVar, 1, xwq3Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void nnh(InterfaceC3239x.toq toqVar, int i2, InterfaceC3239x interfaceC3239x) {
        interfaceC3239x.gvn7(toqVar);
        interfaceC3239x.zy(toqVar, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void nyj() {
        final InterfaceC3239x.toq toqVarH4b = h4b();
        z4j7(toqVarH4b, InterfaceC3239x.f19256o, new zurt.InterfaceC3864k() { // from class: com.google.android.exoplayer2.analytics.f
            @Override // com.google.android.exoplayer2.util.zurt.InterfaceC3864k
            public final void invoke(Object obj) {
                ((InterfaceC3239x) obj).hb(toqVarH4b);
            }
        });
        this.f19285s.m13771s();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void ob(InterfaceC3239x.toq toqVar, int i2, gc3c.x2 x2Var, gc3c.x2 x2Var2, InterfaceC3239x interfaceC3239x) {
        interfaceC3239x.n5r1(toqVar, i2);
        interfaceC3239x.ch(toqVar, x2Var, x2Var2, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void tjz5(gc3c gc3cVar, InterfaceC3239x interfaceC3239x, C3839h c3839h) {
        interfaceC3239x.kja0(gc3cVar, new InterfaceC3239x.zy(c3839h, this.f19286y));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void vwb(InterfaceC3239x.toq toqVar, com.google.android.exoplayer2.decoder.f7l8 f7l8Var, InterfaceC3239x interfaceC3239x) {
        interfaceC3239x.oc(toqVar, f7l8Var);
        interfaceC3239x.gyi(toqVar, 2, f7l8Var);
    }

    private InterfaceC3239x.toq vy() {
        return ga(this.f19278g.f7l8());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void wtop(InterfaceC3239x.toq toqVar, com.google.android.exoplayer2.video.wvg wvgVar, InterfaceC3239x interfaceC3239x) {
        interfaceC3239x.mo11324j(toqVar, wvgVar);
        interfaceC3239x.lvui(toqVar, wvgVar.f23577k, wvgVar.f23579q, wvgVar.f23578n, wvgVar.f23576g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void xtb7(InterfaceC3239x.toq toqVar, String str, long j2, long j3, InterfaceC3239x interfaceC3239x) {
        interfaceC3239x.t8iq(toqVar, str, j2);
        interfaceC3239x.wvg(toqVar, str, j3, j2);
        interfaceC3239x.ncyb(toqVar, 2, str, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void xzl(InterfaceC3239x.toq toqVar, xwq3 xwq3Var, com.google.android.exoplayer2.decoder.ld6 ld6Var, InterfaceC3239x interfaceC3239x) {
        interfaceC3239x.t8r(toqVar, xwq3Var);
        interfaceC3239x.mo11348t(toqVar, xwq3Var, ld6Var);
        interfaceC3239x.m11346r(toqVar, 2, xwq3Var);
    }

    @Override // com.google.android.exoplayer2.source.lvui
    /* JADX INFO: renamed from: a */
    public final void mo11361a(int i2, @zy.dd fti.C3596k c3596k, final com.google.android.exoplayer2.source.ni7 ni7Var, final com.google.android.exoplayer2.source.wvg wvgVar) {
        final InterfaceC3239x.toq toqVarDxef = dxef(i2, c3596k);
        z4j7(toqVarDxef, 1001, new zurt.InterfaceC3864k() { // from class: com.google.android.exoplayer2.analytics.fti
            @Override // com.google.android.exoplayer2.util.zurt.InterfaceC3864k
            public final void invoke(Object obj) {
                ((InterfaceC3239x) obj).zp(toqVarDxef, ni7Var, wvgVar);
            }
        });
    }

    @Override // com.google.android.exoplayer2.source.lvui
    public final void a9(int i2, @zy.dd fti.C3596k c3596k, final com.google.android.exoplayer2.source.ni7 ni7Var, final com.google.android.exoplayer2.source.wvg wvgVar) {
        final InterfaceC3239x.toq toqVarDxef = dxef(i2, c3596k);
        z4j7(toqVarDxef, 1000, new zurt.InterfaceC3864k() { // from class: com.google.android.exoplayer2.analytics.fn3e
            @Override // com.google.android.exoplayer2.util.zurt.InterfaceC3864k
            public final void invoke(Object obj) {
                ((InterfaceC3239x) obj).x9kr(toqVarDxef, ni7Var, wvgVar);
            }
        });
    }

    @Override // com.google.android.exoplayer2.gc3c.InterfaceC3434g
    public void a98o(final long j2) {
        final InterfaceC3239x.toq toqVarH4b = h4b();
        z4j7(toqVarH4b, 18, new zurt.InterfaceC3864k() { // from class: com.google.android.exoplayer2.analytics.o1t
            @Override // com.google.android.exoplayer2.util.zurt.InterfaceC3864k
            public final void invoke(Object obj) {
                ((InterfaceC3239x) obj).m11350v(toqVarH4b, j2);
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC3312i
    /* JADX INFO: renamed from: b */
    public final void mo11362b(int i2, @zy.dd fti.C3596k c3596k) {
        final InterfaceC3239x.toq toqVarDxef = dxef(i2, c3596k);
        z4j7(toqVarDxef, InterfaceC3239x.f63290vyq, new zurt.InterfaceC3864k() { // from class: com.google.android.exoplayer2.analytics.kja0
            @Override // com.google.android.exoplayer2.util.zurt.InterfaceC3864k
            public final void invoke(Object obj) {
                ((InterfaceC3239x) obj).yz(toqVarDxef);
            }
        });
    }

    @InterfaceC7842s
    public void bap7(InterfaceC3239x interfaceC3239x) {
        C3844k.f7l8(interfaceC3239x);
        this.f19285s.zy(interfaceC3239x);
    }

    @Override // com.google.android.exoplayer2.audio.fn3e
    public final void bf2(final Exception exc) {
        final InterfaceC3239x.toq toqVarA5id = a5id();
        z4j7(toqVarA5id, InterfaceC3239x.f19254m, new zurt.InterfaceC3864k() { // from class: com.google.android.exoplayer2.analytics.m
            @Override // com.google.android.exoplayer2.util.zurt.InterfaceC3864k
            public final void invoke(Object obj) {
                ((InterfaceC3239x) obj).a98o(toqVarA5id, exc);
            }
        });
    }

    @Override // com.google.android.exoplayer2.gc3c.InterfaceC3440y
    /* JADX INFO: renamed from: c */
    public void mo11363c(final int i2, final int i3) {
        final InterfaceC3239x.toq toqVarA5id = a5id();
        z4j7(toqVarA5id, InterfaceC3239x.f63276lrht, new zurt.InterfaceC3864k() { // from class: com.google.android.exoplayer2.analytics.h
            @Override // com.google.android.exoplayer2.util.zurt.InterfaceC3864k
            public final void invoke(Object obj) {
                ((InterfaceC3239x) obj).fn3e(toqVarA5id, i2, i3);
            }
        });
    }

    @Override // com.google.android.exoplayer2.gc3c.InterfaceC3440y
    public final void cdj(final com.google.android.exoplayer2.video.wvg wvgVar) {
        final InterfaceC3239x.toq toqVarA5id = a5id();
        z4j7(toqVarA5id, InterfaceC3239x.f19245c, new zurt.InterfaceC3864k() { // from class: com.google.android.exoplayer2.analytics.n5r1
            @Override // com.google.android.exoplayer2.util.zurt.InterfaceC3864k
            public final void invoke(Object obj) {
                zp.wtop(toqVarA5id, wvgVar, (InterfaceC3239x) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.audio.fn3e
    public final void ch(final int i2, final long j2, final long j3) {
        final InterfaceC3239x.toq toqVarA5id = a5id();
        z4j7(toqVarA5id, 1012, new zurt.InterfaceC3864k() { // from class: com.google.android.exoplayer2.analytics.j
            @Override // com.google.android.exoplayer2.util.zurt.InterfaceC3864k
            public final void invoke(Object obj) {
                ((InterfaceC3239x) obj).mo11337c(toqVarA5id, i2, j2, j3);
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC3312i
    public final void d3(int i2, @zy.dd fti.C3596k c3596k) {
        final InterfaceC3239x.toq toqVarDxef = dxef(i2, c3596k);
        z4j7(toqVarDxef, InterfaceC3239x.f63269hb, new zurt.InterfaceC3864k() { // from class: com.google.android.exoplayer2.analytics.s
            @Override // com.google.android.exoplayer2.util.zurt.InterfaceC3864k
            public final void invoke(Object obj) {
                ((InterfaceC3239x) obj).eqxt(toqVarDxef);
            }
        });
    }

    @Override // com.google.android.exoplayer2.gc3c.InterfaceC3434g
    /* JADX INFO: renamed from: e */
    public final void mo11364e() {
        final InterfaceC3239x.toq toqVarH4b = h4b();
        z4j7(toqVarH4b, -1, new zurt.InterfaceC3864k() { // from class: com.google.android.exoplayer2.analytics.k
            @Override // com.google.android.exoplayer2.util.zurt.InterfaceC3864k
            public final void invoke(Object obj) {
                ((InterfaceC3239x) obj).dd(toqVarH4b);
            }
        });
    }

    @Override // com.google.android.exoplayer2.gc3c.InterfaceC3440y
    public final void ek5k(final C3248g c3248g) {
        final InterfaceC3239x.toq toqVarA5id = a5id();
        z4j7(toqVarA5id, 1016, new zurt.InterfaceC3864k() { // from class: com.google.android.exoplayer2.analytics.x9kr
            @Override // com.google.android.exoplayer2.util.zurt.InterfaceC3864k
            public final void invoke(Object obj) {
                ((InterfaceC3239x) obj).nn86(toqVarA5id, c3248g);
            }
        });
    }

    public final void f3f() {
        if (this.f19280i) {
            return;
        }
        final InterfaceC3239x.toq toqVarH4b = h4b();
        this.f19280i = true;
        z4j7(toqVarH4b, -1, new zurt.InterfaceC3864k() { // from class: com.google.android.exoplayer2.analytics.dd
            @Override // com.google.android.exoplayer2.util.zurt.InterfaceC3864k
            public final void invoke(Object obj) {
                ((InterfaceC3239x) obj).fti(toqVarH4b);
            }
        });
    }

    @Override // com.google.android.exoplayer2.audio.fn3e
    public final void f7l8(final com.google.android.exoplayer2.decoder.f7l8 f7l8Var) {
        final InterfaceC3239x.toq toqVarA5id = a5id();
        z4j7(toqVarA5id, 1008, new zurt.InterfaceC3864k() { // from class: com.google.android.exoplayer2.analytics.i
            @Override // com.google.android.exoplayer2.util.zurt.InterfaceC3864k
            public final void invoke(Object obj) {
                zp.b8(toqVarA5id, f7l8Var, (InterfaceC3239x) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.gc3c.InterfaceC3440y, com.google.android.exoplayer2.gc3c.InterfaceC3434g
    public final void fn3e(final boolean z2) {
        final InterfaceC3239x.toq toqVarH4b = h4b();
        z4j7(toqVarH4b, 3, new zurt.InterfaceC3864k() { // from class: com.google.android.exoplayer2.analytics.hyr
            @Override // com.google.android.exoplayer2.util.zurt.InterfaceC3864k
            public final void invoke(Object obj) {
                zp.bih(toqVarH4b, z2, (InterfaceC3239x) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC3808n.k
    public final void fti(final int i2, final long j2, final long j3) {
        final InterfaceC3239x.toq toqVarE5 = e5();
        z4j7(toqVarE5, 1006, new zurt.InterfaceC3864k() { // from class: com.google.android.exoplayer2.analytics.lvui
            @Override // com.google.android.exoplayer2.util.zurt.InterfaceC3864k
            public final void invoke(Object obj) {
                ((InterfaceC3239x) obj).d2ok(toqVarE5, i2, j2, j3);
            }
        });
    }

    @Override // com.google.android.exoplayer2.gc3c.InterfaceC3440y, com.google.android.exoplayer2.gc3c.InterfaceC3434g
    /* JADX INFO: renamed from: g */
    public final void mo11365g(final int i2) {
        final InterfaceC3239x.toq toqVarH4b = h4b();
        z4j7(toqVarH4b, 6, new zurt.InterfaceC3864k() { // from class: com.google.android.exoplayer2.analytics.gvn7
            @Override // com.google.android.exoplayer2.util.zurt.InterfaceC3864k
            public final void invoke(Object obj) {
                ((InterfaceC3239x) obj).mo11340g(toqVarH4b, i2);
            }
        });
    }

    @Override // com.google.android.exoplayer2.audio.fn3e
    public final void gvn7(final String str, final long j2, final long j3) {
        final InterfaceC3239x.toq toqVarA5id = a5id();
        z4j7(toqVarA5id, 1009, new zurt.InterfaceC3864k() { // from class: com.google.android.exoplayer2.analytics.t
            @Override // com.google.android.exoplayer2.util.zurt.InterfaceC3864k
            public final void invoke(Object obj) {
                zp.m58i(toqVarA5id, str, j3, j2, (InterfaceC3239x) obj);
            }
        });
    }

    protected final InterfaceC3239x.toq h4b() {
        return ga(this.f19278g.m11384q());
    }

    @Override // com.google.android.exoplayer2.gc3c.InterfaceC3440y
    public final void hb(final float f2) {
        final InterfaceC3239x.toq toqVarA5id = a5id();
        z4j7(toqVarA5id, 1019, new zurt.InterfaceC3864k() { // from class: com.google.android.exoplayer2.analytics.r
            @Override // com.google.android.exoplayer2.util.zurt.InterfaceC3864k
            public final void invoke(Object obj) {
                ((InterfaceC3239x) obj).y9n(toqVarA5id, f2);
            }
        });
    }

    @Override // com.google.android.exoplayer2.video.InterfaceC3894z
    public final void hyr(final com.google.android.exoplayer2.decoder.f7l8 f7l8Var) {
        final InterfaceC3239x.toq toqVarVy = vy();
        z4j7(toqVarVy, 1025, new zurt.InterfaceC3864k() { // from class: com.google.android.exoplayer2.analytics.a9
            @Override // com.google.android.exoplayer2.util.zurt.InterfaceC3864k
            public final void invoke(Object obj) {
                zp.vwb(toqVarVy, f7l8Var, (InterfaceC3239x) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.source.lvui
    /* JADX INFO: renamed from: i */
    public final void mo11366i(int i2, @zy.dd fti.C3596k c3596k, final com.google.android.exoplayer2.source.wvg wvgVar) {
        final InterfaceC3239x.toq toqVarDxef = dxef(i2, c3596k);
        z4j7(toqVarDxef, 1004, new zurt.InterfaceC3864k() { // from class: com.google.android.exoplayer2.analytics.nn86
            @Override // com.google.android.exoplayer2.util.zurt.InterfaceC3864k
            public final void invoke(Object obj) {
                ((InterfaceC3239x) obj).mo11322a(toqVarDxef, wvgVar);
            }
        });
    }

    @InterfaceC7842s
    public void i3x9() {
        ((com.google.android.exoplayer2.util.ki) C3844k.ld6(this.f19279h)).ld6(new Runnable() { // from class: com.google.android.exoplayer2.analytics.jp0y
            @Override // java.lang.Runnable
            public final void run() {
                this.f19161k.nyj();
            }
        });
    }

    @Override // com.google.android.exoplayer2.video.InterfaceC3894z
    /* JADX INFO: renamed from: j */
    public final void mo11367j(final int i2, final long j2) {
        final InterfaceC3239x.toq toqVarVy = vy();
        z4j7(toqVarVy, InterfaceC3239x.f63281ncyb, new zurt.InterfaceC3864k() { // from class: com.google.android.exoplayer2.analytics.a98o
            @Override // com.google.android.exoplayer2.util.zurt.InterfaceC3864k
            public final void invoke(Object obj) {
                ((InterfaceC3239x) obj).ni7(toqVarVy, i2, j2);
            }
        });
    }

    @Override // com.google.android.exoplayer2.audio.fn3e
    public final void jp0y(final String str) {
        final InterfaceC3239x.toq toqVarA5id = a5id();
        z4j7(toqVarA5id, 1013, new zurt.InterfaceC3864k() { // from class: com.google.android.exoplayer2.analytics.d3
            @Override // com.google.android.exoplayer2.util.zurt.InterfaceC3864k
            public final void invoke(Object obj) {
                ((InterfaceC3239x) obj).nmn5(toqVarA5id, str);
            }
        });
    }

    @Override // com.google.android.exoplayer2.gc3c.InterfaceC3440y, com.google.android.exoplayer2.audio.fn3e
    /* JADX INFO: renamed from: k */
    public final void mo11368k(final boolean z2) {
        final InterfaceC3239x.toq toqVarA5id = a5id();
        z4j7(toqVarA5id, 1017, new zurt.InterfaceC3864k() { // from class: com.google.android.exoplayer2.analytics.ni7
            @Override // com.google.android.exoplayer2.util.zurt.InterfaceC3864k
            public final void invoke(Object obj) {
                ((InterfaceC3239x) obj).mo11353z(toqVarA5id, z2);
            }
        });
    }

    @Override // com.google.android.exoplayer2.gc3c.InterfaceC3440y, com.google.android.exoplayer2.gc3c.InterfaceC3434g
    public void kja0(final long j2) {
        final InterfaceC3239x.toq toqVarH4b = h4b();
        z4j7(toqVarH4b, 16, new zurt.InterfaceC3864k() { // from class: com.google.android.exoplayer2.analytics.n
            @Override // com.google.android.exoplayer2.util.zurt.InterfaceC3864k
            public final void invoke(Object obj) {
                ((InterfaceC3239x) obj).d3(toqVarH4b, j2);
            }
        });
    }

    public final void kt06(List<fti.C3596k> list, @zy.dd fti.C3596k c3596k) {
        this.f19278g.ld6(list, c3596k, (gc3c) C3844k.f7l8(this.f19283p));
    }

    @InterfaceC7842s
    public void kz28(final gc3c gc3cVar, Looper looper) {
        C3844k.m13633s(this.f19283p == null || this.f19278g.f63307toq.isEmpty());
        this.f19283p = (gc3c) C3844k.f7l8(gc3cVar);
        this.f19279h = this.f19281k.zy(looper, null);
        this.f19285s = this.f19285s.m13770q(looper, new zurt.toq() { // from class: com.google.android.exoplayer2.analytics.ld6
            @Override // com.google.android.exoplayer2.util.zurt.toq
            /* JADX INFO: renamed from: k */
            public final void mo11290k(Object obj, C3839h c3839h) {
                this.f19168k.tjz5(gc3cVar, (InterfaceC3239x) obj, c3839h);
            }
        });
    }

    @Override // com.google.android.exoplayer2.video.InterfaceC3894z
    /* JADX INFO: renamed from: l */
    public final void mo11369l(final Exception exc) {
        final InterfaceC3239x.toq toqVarA5id = a5id();
        z4j7(toqVarA5id, InterfaceC3239x.f63262ek5k, new zurt.InterfaceC3864k() { // from class: com.google.android.exoplayer2.analytics.eqxt
            @Override // com.google.android.exoplayer2.util.zurt.InterfaceC3864k
            public final void invoke(Object obj) {
                ((InterfaceC3239x) obj).jk(toqVarA5id, exc);
            }
        });
    }

    @Override // com.google.android.exoplayer2.gc3c.InterfaceC3440y, com.google.android.exoplayer2.gc3c.InterfaceC3434g
    public final void ld6(final int i2) {
        final InterfaceC3239x.toq toqVarH4b = h4b();
        z4j7(toqVarH4b, 4, new zurt.InterfaceC3864k() { // from class: com.google.android.exoplayer2.analytics.vyq
            @Override // com.google.android.exoplayer2.util.zurt.InterfaceC3864k
            public final void invoke(Object obj) {
                ((InterfaceC3239x) obj).cdj(toqVarH4b, i2);
            }
        });
    }

    @Override // com.google.android.exoplayer2.audio.fn3e
    public final void lrht(final com.google.android.exoplayer2.decoder.f7l8 f7l8Var) {
        final InterfaceC3239x.toq toqVarVy = vy();
        z4j7(toqVarVy, 1014, new zurt.InterfaceC3864k() { // from class: com.google.android.exoplayer2.analytics.bf2
            @Override // com.google.android.exoplayer2.util.zurt.InterfaceC3864k
            public final void invoke(Object obj) {
                zp.b9ub(toqVarVy, f7l8Var, (InterfaceC3239x) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.video.InterfaceC3894z
    public final void lv5(final long j2, final int i2) {
        final InterfaceC3239x.toq toqVarVy = vy();
        z4j7(toqVarVy, InterfaceC3239x.f63270hyr, new zurt.InterfaceC3864k() { // from class: com.google.android.exoplayer2.analytics.qrj
            @Override // com.google.android.exoplayer2.util.zurt.InterfaceC3864k
            public final void invoke(Object obj) {
                ((InterfaceC3239x) obj).toq(toqVarVy, j2, i2);
            }
        });
    }

    @Override // com.google.android.exoplayer2.gc3c.InterfaceC3434g
    /* JADX INFO: renamed from: m */
    public final void mo6500m(final boolean z2, final int i2) {
        final InterfaceC3239x.toq toqVarH4b = h4b();
        z4j7(toqVarH4b, -1, new zurt.InterfaceC3864k() { // from class: com.google.android.exoplayer2.analytics.zy
            @Override // com.google.android.exoplayer2.util.zurt.InterfaceC3864k
            public final void invoke(Object obj) {
                ((InterfaceC3239x) obj).m11341h(toqVarH4b, z2, i2);
            }
        });
    }

    @Override // com.google.android.exoplayer2.gc3c.InterfaceC3440y, com.google.android.exoplayer2.gc3c.InterfaceC3434g
    public void mcp(final boolean z2) {
        final InterfaceC3239x.toq toqVarH4b = h4b();
        z4j7(toqVarH4b, 7, new zurt.InterfaceC3864k() { // from class: com.google.android.exoplayer2.analytics.ek5k
            @Override // com.google.android.exoplayer2.util.zurt.InterfaceC3864k
            public final void invoke(Object obj) {
                ((InterfaceC3239x) obj).i1(toqVarH4b, z2);
            }
        });
    }

    @Override // com.google.android.exoplayer2.gc3c.InterfaceC3440y, com.google.android.exoplayer2.gc3c.InterfaceC3434g
    /* JADX INFO: renamed from: n */
    public final void mo11370n(final gc3c.x2 x2Var, final gc3c.x2 x2Var2, final int i2) {
        if (i2 == 1) {
            this.f19280i = false;
        }
        this.f19278g.m11383p((gc3c) C3844k.f7l8(this.f19283p));
        final InterfaceC3239x.toq toqVarH4b = h4b();
        z4j7(toqVarH4b, 11, new zurt.InterfaceC3864k() { // from class: com.google.android.exoplayer2.analytics.ncyb
            @Override // com.google.android.exoplayer2.util.zurt.InterfaceC3864k
            public final void invoke(Object obj) {
                zp.ob(toqVarH4b, i2, x2Var, x2Var2, (InterfaceC3239x) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.gc3c.InterfaceC3434g
    public final void n5r1(final C3629x c3629x, final com.google.android.exoplayer2.trackselection.kja0 kja0Var) {
        final InterfaceC3239x.toq toqVarH4b = h4b();
        z4j7(toqVarH4b, 2, new zurt.InterfaceC3864k() { // from class: com.google.android.exoplayer2.analytics.y9n
            @Override // com.google.android.exoplayer2.util.zurt.InterfaceC3864k
            public final void invoke(Object obj) {
                ((InterfaceC3239x) obj).bf2(toqVarH4b, c3629x, kja0Var);
            }
        });
    }

    @Override // com.google.android.exoplayer2.gc3c.InterfaceC3440y
    public final void n7h(final Metadata metadata) {
        final InterfaceC3239x.toq toqVarH4b = h4b();
        z4j7(toqVarH4b, 1007, new zurt.InterfaceC3864k() { // from class: com.google.android.exoplayer2.analytics.n7h
            @Override // com.google.android.exoplayer2.util.zurt.InterfaceC3864k
            public final void invoke(Object obj) {
                ((InterfaceC3239x) obj).n7h(toqVarH4b, metadata);
            }
        });
    }

    @Override // com.google.android.exoplayer2.audio.fn3e
    public final void ncyb(final long j2) {
        final InterfaceC3239x.toq toqVarA5id = a5id();
        z4j7(toqVarA5id, 1011, new zurt.InterfaceC3864k() { // from class: com.google.android.exoplayer2.analytics.yz
            @Override // com.google.android.exoplayer2.util.zurt.InterfaceC3864k
            public final void invoke(Object obj) {
                ((InterfaceC3239x) obj).m11342i(toqVarA5id, j2);
            }
        });
    }

    @Override // com.google.android.exoplayer2.gc3c.InterfaceC3440y, com.google.android.exoplayer2.gc3c.InterfaceC3434g
    public final void ni7(final yqrt yqrtVar) {
        com.google.android.exoplayer2.source.a9 a9Var;
        final InterfaceC3239x.toq toqVarGa = (!(yqrtVar instanceof com.google.android.exoplayer2.ki) || (a9Var = ((com.google.android.exoplayer2.ki) yqrtVar).mediaPeriodId) == null) ? null : ga(new fti.C3596k(a9Var));
        if (toqVarGa == null) {
            toqVarGa = h4b();
        }
        z4j7(toqVarGa, 10, new zurt.InterfaceC3864k() { // from class: com.google.android.exoplayer2.analytics.x2
            @Override // com.google.android.exoplayer2.util.zurt.InterfaceC3864k
            public final void invoke(Object obj) {
                ((InterfaceC3239x) obj).mo11344l(toqVarGa, yqrtVar);
            }
        });
    }

    @Override // com.google.android.exoplayer2.source.lvui
    public final void nmn5(int i2, @zy.dd fti.C3596k c3596k, final com.google.android.exoplayer2.source.ni7 ni7Var, final com.google.android.exoplayer2.source.wvg wvgVar, final IOException iOException, final boolean z2) {
        final InterfaceC3239x.toq toqVarDxef = dxef(i2, c3596k);
        z4j7(toqVarDxef, 1003, new zurt.InterfaceC3864k() { // from class: com.google.android.exoplayer2.analytics.ki
            @Override // com.google.android.exoplayer2.util.zurt.InterfaceC3864k
            public final void invoke(Object obj) {
                ((InterfaceC3239x) obj).mo11325p(toqVarDxef, ni7Var, wvgVar, iOException, z2);
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC3312i
    public final void nn86(int i2, @zy.dd fti.C3596k c3596k, final Exception exc) {
        final InterfaceC3239x.toq toqVarDxef = dxef(i2, c3596k);
        z4j7(toqVarDxef, InterfaceC3239x.f19246e, new zurt.InterfaceC3864k() { // from class: com.google.android.exoplayer2.analytics.wvg
            @Override // com.google.android.exoplayer2.util.zurt.InterfaceC3864k
            public final void invoke(Object obj) {
                ((InterfaceC3239x) obj).mo11326q(toqVarDxef, exc);
            }
        });
    }

    @Override // com.google.android.exoplayer2.audio.fn3e
    /* JADX INFO: renamed from: o */
    public final void mo11371o(final xwq3 xwq3Var, @zy.dd final com.google.android.exoplayer2.decoder.ld6 ld6Var) {
        final InterfaceC3239x.toq toqVarA5id = a5id();
        z4j7(toqVarA5id, 1010, new zurt.InterfaceC3864k() { // from class: com.google.android.exoplayer2.analytics.cdj
            @Override // com.google.android.exoplayer2.util.zurt.InterfaceC3864k
            public final void invoke(Object obj) {
                zp.nme(toqVarA5id, xwq3Var, ld6Var, (InterfaceC3239x) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.gc3c.InterfaceC3440y, com.google.android.exoplayer2.gc3c.InterfaceC3434g
    public final void o1t(@zy.dd final tfm tfmVar, final int i2) {
        final InterfaceC3239x.toq toqVarH4b = h4b();
        z4j7(toqVarH4b, 1, new zurt.InterfaceC3864k() { // from class: com.google.android.exoplayer2.analytics.zurt
            @Override // com.google.android.exoplayer2.util.zurt.InterfaceC3864k
            public final void invoke(Object obj) {
                ((InterfaceC3239x) obj).jp0y(toqVarH4b, tfmVar, i2);
            }
        });
    }

    @Override // com.google.android.exoplayer2.gc3c.InterfaceC3440y
    public final void oc(final int i2) {
        final InterfaceC3239x.toq toqVarA5id = a5id();
        z4j7(toqVarA5id, 1015, new zurt.InterfaceC3864k() { // from class: com.google.android.exoplayer2.analytics.hb
            @Override // com.google.android.exoplayer2.util.zurt.InterfaceC3864k
            public final void invoke(Object obj) {
                ((InterfaceC3239x) obj).ki(toqVarA5id, i2);
            }
        });
    }

    @Override // com.google.android.exoplayer2.gc3c.InterfaceC3440y, com.google.android.exoplayer2.gc3c.InterfaceC3434g
    public final void onRepeatModeChanged(final int i2) {
        final InterfaceC3239x.toq toqVarH4b = h4b();
        z4j7(toqVarH4b, 8, new zurt.InterfaceC3864k() { // from class: com.google.android.exoplayer2.analytics.toq
            @Override // com.google.android.exoplayer2.util.zurt.InterfaceC3864k
            public final void invoke(Object obj) {
                ((InterfaceC3239x) obj).mo11338e(toqVarH4b, i2);
            }
        });
    }

    @Override // com.google.android.exoplayer2.gc3c.InterfaceC3440y, com.google.android.exoplayer2.gc3c.InterfaceC3434g
    /* JADX INFO: renamed from: p */
    public final void mo11372p(pc pcVar, final int i2) {
        this.f19278g.x2((gc3c) C3844k.f7l8(this.f19283p));
        final InterfaceC3239x.toq toqVarH4b = h4b();
        z4j7(toqVarH4b, 0, new zurt.InterfaceC3864k() { // from class: com.google.android.exoplayer2.analytics.g
            @Override // com.google.android.exoplayer2.util.zurt.InterfaceC3864k
            public final void invoke(Object obj) {
                ((InterfaceC3239x) obj).a9(toqVarH4b, i2);
            }
        });
    }

    @Override // com.google.android.exoplayer2.gc3c.InterfaceC3440y, com.google.android.exoplayer2.gc3c.InterfaceC3434g
    /* JADX INFO: renamed from: q */
    public final void mo11373q(final com.google.android.exoplayer2.se seVar) {
        final InterfaceC3239x.toq toqVarH4b = h4b();
        z4j7(toqVarH4b, 12, new zurt.InterfaceC3864k() { // from class: com.google.android.exoplayer2.analytics.oc
            @Override // com.google.android.exoplayer2.util.zurt.InterfaceC3864k
            public final void invoke(Object obj) {
                ((InterfaceC3239x) obj).mo11339f(toqVarH4b, seVar);
            }
        });
    }

    @Override // com.google.android.exoplayer2.gc3c.InterfaceC3440y, com.google.android.exoplayer2.gc3c.InterfaceC3434g
    public final void qrj(final boolean z2) {
        final InterfaceC3239x.toq toqVarH4b = h4b();
        z4j7(toqVarH4b, 9, new zurt.InterfaceC3864k() { // from class: com.google.android.exoplayer2.analytics.t8r
            @Override // com.google.android.exoplayer2.util.zurt.InterfaceC3864k
            public final void invoke(Object obj) {
                ((InterfaceC3239x) obj).zurt(toqVarH4b, z2);
            }
        });
    }

    @Override // com.google.android.exoplayer2.gc3c.InterfaceC3440y, com.google.android.exoplayer2.gc3c.InterfaceC3434g
    /* JADX INFO: renamed from: s */
    public void mo11374s(final gc3c.zy zyVar) {
        final InterfaceC3239x.toq toqVarH4b = h4b();
        z4j7(toqVarH4b, 13, new zurt.InterfaceC3864k() { // from class: com.google.android.exoplayer2.analytics.uv6
            @Override // com.google.android.exoplayer2.util.zurt.InterfaceC3864k
            public final void invoke(Object obj) {
                ((InterfaceC3239x) obj).y2(toqVarH4b, zyVar);
            }
        });
    }

    @Override // com.google.android.exoplayer2.gc3c.InterfaceC3440y, com.google.android.exoplayer2.gc3c.InterfaceC3434g
    /* JADX INFO: renamed from: t */
    public void mo11375t(final was wasVar) {
        final InterfaceC3239x.toq toqVarH4b = h4b();
        z4j7(toqVarH4b, 15, new zurt.InterfaceC3864k() { // from class: com.google.android.exoplayer2.analytics.lrht
            @Override // com.google.android.exoplayer2.util.zurt.InterfaceC3864k
            public final void invoke(Object obj) {
                ((InterfaceC3239x) obj).bo(toqVarH4b, wasVar);
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC3312i
    public final void t8iq(int i2, @zy.dd fti.C3596k c3596k) {
        final InterfaceC3239x.toq toqVarDxef = dxef(i2, c3596k);
        z4j7(toqVarDxef, InterfaceC3239x.f63283nn86, new zurt.InterfaceC3864k() { // from class: com.google.android.exoplayer2.analytics.z
            @Override // com.google.android.exoplayer2.util.zurt.InterfaceC3864k
            public final void invoke(Object obj) {
                ((InterfaceC3239x) obj).mo11345n(toqVarDxef);
            }
        });
    }

    @Override // com.google.android.exoplayer2.video.InterfaceC3894z
    public final void t8r(final String str, final long j2, final long j3) {
        final InterfaceC3239x.toq toqVarA5id = a5id();
        z4j7(toqVarA5id, 1021, new zurt.InterfaceC3864k() { // from class: com.google.android.exoplayer2.analytics.b
            @Override // com.google.android.exoplayer2.util.zurt.InterfaceC3864k
            public final void invoke(Object obj) {
                zp.xtb7(toqVarA5id, str, j3, j2, (InterfaceC3239x) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.audio.fn3e
    public final void toq(final Exception exc) {
        final InterfaceC3239x.toq toqVarA5id = a5id();
        z4j7(toqVarA5id, 1018, new zurt.InterfaceC3864k() { // from class: com.google.android.exoplayer2.analytics.l
            @Override // com.google.android.exoplayer2.util.zurt.InterfaceC3864k
            public final void invoke(Object obj) {
                ((InterfaceC3239x) obj).fu4(toqVarA5id, exc);
            }
        });
    }

    @InterfaceC7842s
    public void vss1(InterfaceC3239x interfaceC3239x) {
        this.f19285s.m13769p(interfaceC3239x);
    }

    @Override // com.google.android.exoplayer2.source.lvui
    public final void vyq(int i2, @zy.dd fti.C3596k c3596k, final com.google.android.exoplayer2.source.wvg wvgVar) {
        final InterfaceC3239x.toq toqVarDxef = dxef(i2, c3596k);
        z4j7(toqVarDxef, 1005, new zurt.InterfaceC3864k() { // from class: com.google.android.exoplayer2.analytics.d2ok
            @Override // com.google.android.exoplayer2.util.zurt.InterfaceC3864k
            public final void invoke(Object obj) {
                ((InterfaceC3239x) obj).mo11351x(toqVarDxef, wvgVar);
            }
        });
    }

    @RequiresNonNull({"player"})
    protected final InterfaceC3239x.toq wlev(pc pcVar, int i2, @zy.dd fti.C3596k c3596k) {
        long jN2t;
        fti.C3596k c3596k2 = pcVar.ni7() ? null : c3596k;
        long jMo13575q = this.f19281k.mo13575q();
        boolean z2 = pcVar.equals(this.f19283p.d8wk()) && i2 == this.f19283p.lw();
        long jM12489n = 0;
        if (c3596k2 != null && c3596k2.zy()) {
            if (z2 && this.f19283p.mo12091v() == c3596k2.f65325toq && this.f19283p.h7am() == c3596k2.f65326zy) {
                jM12489n = this.f19283p.getCurrentPosition();
            }
        } else {
            if (z2) {
                jN2t = this.f19283p.n2t();
                return new InterfaceC3239x.toq(jMo13575q, pcVar, i2, c3596k2, jN2t, this.f19283p.d8wk(), this.f19283p.lw(), this.f19278g.m11384q(), this.f19283p.getCurrentPosition(), this.f19283p.x9kr());
            }
            if (!pcVar.ni7()) {
                jM12489n = pcVar.m12484i(i2, this.f19282n).m12489n();
            }
        }
        jN2t = jM12489n;
        return new InterfaceC3239x.toq(jMo13575q, pcVar, i2, c3596k2, jN2t, this.f19283p.d8wk(), this.f19283p.lw(), this.f19278g.m11384q(), this.f19283p.getCurrentPosition(), this.f19283p.x9kr());
    }

    @Override // com.google.android.exoplayer2.gc3c.InterfaceC3440y, com.google.android.exoplayer2.gc3c.InterfaceC3434g
    public final void wvg(final boolean z2, final int i2) {
        final InterfaceC3239x.toq toqVarH4b = h4b();
        z4j7(toqVarH4b, 5, new zurt.InterfaceC3864k() { // from class: com.google.android.exoplayer2.analytics.a
            @Override // com.google.android.exoplayer2.util.zurt.InterfaceC3864k
            public final void invoke(Object obj) {
                ((InterfaceC3239x) obj).o1t(toqVarH4b, z2, i2);
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC3312i
    /* JADX INFO: renamed from: x */
    public final void mo11376x(int i2, @zy.dd fti.C3596k c3596k) {
        final InterfaceC3239x.toq toqVarDxef = dxef(i2, c3596k);
        z4j7(toqVarDxef, InterfaceC3239x.f19251j, new zurt.InterfaceC3864k() { // from class: com.google.android.exoplayer2.analytics.e
            @Override // com.google.android.exoplayer2.util.zurt.InterfaceC3864k
            public final void invoke(Object obj) {
                ((InterfaceC3239x) obj).hyr(toqVarDxef);
            }
        });
    }

    @Override // com.google.android.exoplayer2.gc3c.InterfaceC3440y, com.google.android.exoplayer2.gc3c.InterfaceC3434g
    public void x2(final was wasVar) {
        final InterfaceC3239x.toq toqVarH4b = h4b();
        z4j7(toqVarH4b, 14, new zurt.InterfaceC3864k() { // from class: com.google.android.exoplayer2.analytics.jk
            @Override // com.google.android.exoplayer2.util.zurt.InterfaceC3864k
            public final void invoke(Object obj) {
                ((InterfaceC3239x) obj).m11352y(toqVarH4b, wasVar);
            }
        });
    }

    @Override // com.google.android.exoplayer2.video.InterfaceC3894z
    public final void x9kr(final xwq3 xwq3Var, @zy.dd final com.google.android.exoplayer2.decoder.ld6 ld6Var) {
        final InterfaceC3239x.toq toqVarA5id = a5id();
        z4j7(toqVarA5id, InterfaceC3239x.f63293x9kr, new zurt.InterfaceC3864k() { // from class: com.google.android.exoplayer2.analytics.f7l8
            @Override // com.google.android.exoplayer2.util.zurt.InterfaceC3864k
            public final void invoke(Object obj) {
                zp.xzl(toqVarA5id, xwq3Var, ld6Var, (InterfaceC3239x) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.gc3c.InterfaceC3440y, com.google.android.exoplayer2.gc3c.InterfaceC3434g
    /* JADX INFO: renamed from: y */
    public void mo11377y(final pjz9 pjz9Var) {
        final InterfaceC3239x.toq toqVarH4b = h4b();
        z4j7(toqVarH4b, 2, new zurt.InterfaceC3864k() { // from class: com.google.android.exoplayer2.analytics.i1
            @Override // com.google.android.exoplayer2.util.zurt.InterfaceC3864k
            public final void invoke(Object obj) {
                ((InterfaceC3239x) obj).x2(toqVarH4b, pjz9Var);
            }
        });
    }

    @Override // com.google.android.exoplayer2.video.InterfaceC3894z
    public final void y9n(final com.google.android.exoplayer2.decoder.f7l8 f7l8Var) {
        final InterfaceC3239x.toq toqVarA5id = a5id();
        z4j7(toqVarA5id, 1020, new zurt.InterfaceC3864k() { // from class: com.google.android.exoplayer2.analytics.c
            @Override // com.google.android.exoplayer2.util.zurt.InterfaceC3864k
            public final void invoke(Object obj) {
                zp.lk(toqVarA5id, f7l8Var, (InterfaceC3239x) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.video.InterfaceC3894z
    public final void yz(final Object obj, final long j2) {
        final InterfaceC3239x.toq toqVarA5id = a5id();
        z4j7(toqVarA5id, InterfaceC3239x.f19247f, new zurt.InterfaceC3864k() { // from class: com.google.android.exoplayer2.analytics.y
            @Override // com.google.android.exoplayer2.util.zurt.InterfaceC3864k
            public final void invoke(Object obj2) {
                ((InterfaceC3239x) obj2).c8jq(toqVarA5id, obj, j2);
            }
        });
    }

    @Override // com.google.android.exoplayer2.gc3c.InterfaceC3440y, com.google.android.exoplayer2.gc3c.InterfaceC3434g
    /* JADX INFO: renamed from: z */
    public void mo11378z(final long j2) {
        final InterfaceC3239x.toq toqVarH4b = h4b();
        z4j7(toqVarH4b, 17, new zurt.InterfaceC3864k() { // from class: com.google.android.exoplayer2.analytics.fu4
            @Override // com.google.android.exoplayer2.util.zurt.InterfaceC3864k
            public final void invoke(Object obj) {
                ((InterfaceC3239x) obj).mcp(toqVarH4b, j2);
            }
        });
    }

    protected final void z4j7(InterfaceC3239x.toq toqVar, int i2, zurt.InterfaceC3864k<InterfaceC3239x> interfaceC3864k) {
        this.f19286y.put(i2, toqVar);
        this.f19285s.ld6(i2, interfaceC3864k);
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC3312i
    public final void zp(int i2, @zy.dd fti.C3596k c3596k, final int i3) {
        final InterfaceC3239x.toq toqVarDxef = dxef(i2, c3596k);
        z4j7(toqVarDxef, InterfaceC3239x.f63289uv6, new zurt.InterfaceC3864k() { // from class: com.google.android.exoplayer2.analytics.mcp
            @Override // com.google.android.exoplayer2.util.zurt.InterfaceC3864k
            public final void invoke(Object obj) {
                zp.nnh(toqVarDxef, i3, (InterfaceC3239x) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.source.lvui
    public final void zurt(int i2, @zy.dd fti.C3596k c3596k, final com.google.android.exoplayer2.source.ni7 ni7Var, final com.google.android.exoplayer2.source.wvg wvgVar) {
        final InterfaceC3239x.toq toqVarDxef = dxef(i2, c3596k);
        z4j7(toqVarDxef, 1002, new zurt.InterfaceC3864k() { // from class: com.google.android.exoplayer2.analytics.o
            @Override // com.google.android.exoplayer2.util.zurt.InterfaceC3864k
            public final void invoke(Object obj) {
                ((InterfaceC3239x) obj).mo11336b(toqVarDxef, ni7Var, wvgVar);
            }
        });
    }

    @Override // com.google.android.exoplayer2.video.InterfaceC3894z
    public final void zy(final String str) {
        final InterfaceC3239x.toq toqVarA5id = a5id();
        z4j7(toqVarA5id, 1024, new zurt.InterfaceC3864k() { // from class: com.google.android.exoplayer2.analytics.q
            @Override // com.google.android.exoplayer2.util.zurt.InterfaceC3864k
            public final void invoke(Object obj) {
                ((InterfaceC3239x) obj).mo11343k(toqVarA5id, str);
            }
        });
    }
}
