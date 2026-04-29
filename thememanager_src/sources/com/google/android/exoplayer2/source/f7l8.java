package com.google.android.exoplayer2.source;

import android.os.Handler;
import com.google.android.exoplayer2.drm.InterfaceC3312i;
import com.google.android.exoplayer2.pc;
import com.google.android.exoplayer2.source.fti;
import com.google.android.exoplayer2.source.lvui;
import com.google.android.exoplayer2.util.C3844k;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import zy.InterfaceC7842s;

/* JADX INFO: compiled from: CompositeMediaSource.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class f7l8<T> extends AbstractC3605k {

    /* JADX INFO: renamed from: h */
    @zy.dd
    private Handler f21515h;

    /* JADX INFO: renamed from: i */
    @zy.dd
    private com.google.android.exoplayer2.upstream.uv6 f21516i;

    /* JADX INFO: renamed from: p */
    private final HashMap<T, toq<T>> f21517p = new HashMap<>();

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.f7l8$k */
    /* JADX INFO: compiled from: CompositeMediaSource.java */
    private final class C3595k implements lvui, InterfaceC3312i {

        /* JADX INFO: renamed from: k */
        @com.google.android.exoplayer2.util.hyr
        private final T f21519k;

        /* JADX INFO: renamed from: n */
        private InterfaceC3312i.k f21520n;

        /* JADX INFO: renamed from: q */
        private lvui.C3611k f21521q;

        public C3595k(@com.google.android.exoplayer2.util.hyr T t2) {
            this.f21521q = f7l8.this.fn3e(null);
            this.f21520n = f7l8.this.ki(null);
            this.f21519k = t2;
        }

        /* JADX INFO: renamed from: k */
        private boolean m12712k(int i2, @zy.dd fti.C3596k c3596k) {
            fti.C3596k c3596kGvn7;
            if (c3596k != null) {
                c3596kGvn7 = f7l8.this.gvn7(this.f21519k, c3596k);
                if (c3596kGvn7 == null) {
                    return false;
                }
            } else {
                c3596kGvn7 = null;
            }
            int iD2ok = f7l8.this.d2ok(this.f21519k, i2);
            lvui.C3611k c3611k = this.f21521q;
            if (c3611k.f21599k != iD2ok || !com.google.android.exoplayer2.util.lrht.zy(c3611k.f65422toq, c3596kGvn7)) {
                this.f21521q = f7l8.this.t8r(iD2ok, c3596kGvn7, 0L);
            }
            InterfaceC3312i.k kVar = this.f21520n;
            if (kVar.f19660k == iD2ok && com.google.android.exoplayer2.util.lrht.zy(kVar.f63617toq, c3596kGvn7)) {
                return true;
            }
            this.f21520n = f7l8.this.cdj(iD2ok, c3596kGvn7);
            return true;
        }

        private wvg toq(wvg wvgVar) {
            long jOc = f7l8.this.oc(this.f21519k, wvgVar.f21694g);
            long jOc2 = f7l8.this.oc(this.f21519k, wvgVar.f65466f7l8);
            return (jOc == wvgVar.f21694g && jOc2 == wvgVar.f65466f7l8) ? wvgVar : new wvg(wvgVar.f21695k, wvgVar.f65467toq, wvgVar.f65468zy, wvgVar.f21697q, wvgVar.f21696n, jOc, jOc2);
        }

        @Override // com.google.android.exoplayer2.source.lvui
        /* JADX INFO: renamed from: a */
        public void mo11361a(int i2, @zy.dd fti.C3596k c3596k, ni7 ni7Var, wvg wvgVar) {
            if (m12712k(i2, c3596k)) {
                this.f21521q.zurt(ni7Var, toq(wvgVar));
            }
        }

        @Override // com.google.android.exoplayer2.source.lvui
        public void a9(int i2, @zy.dd fti.C3596k c3596k, ni7 ni7Var, wvg wvgVar) {
            if (m12712k(i2, c3596k)) {
                this.f21521q.m12764t(ni7Var, toq(wvgVar));
            }
        }

        @Override // com.google.android.exoplayer2.drm.InterfaceC3312i
        /* JADX INFO: renamed from: b */
        public void mo11362b(int i2, @zy.dd fti.C3596k c3596k) {
            if (m12712k(i2, c3596k)) {
                this.f21520n.m11637y();
            }
        }

        @Override // com.google.android.exoplayer2.drm.InterfaceC3312i
        public void d3(int i2, @zy.dd fti.C3596k c3596k) {
            if (m12712k(i2, c3596k)) {
                this.f21520n.m11636s();
            }
        }

        @Override // com.google.android.exoplayer2.source.lvui
        /* JADX INFO: renamed from: i */
        public void mo11366i(int i2, @zy.dd fti.C3596k c3596k, wvg wvgVar) {
            if (m12712k(i2, c3596k)) {
                this.f21521q.m12762p(toq(wvgVar));
            }
        }

        @Override // com.google.android.exoplayer2.source.lvui
        public void nmn5(int i2, @zy.dd fti.C3596k c3596k, ni7 ni7Var, wvg wvgVar, IOException iOException, boolean z2) {
            if (m12712k(i2, c3596k)) {
                this.f21521q.m12765z(ni7Var, toq(wvgVar), iOException, z2);
            }
        }

        @Override // com.google.android.exoplayer2.drm.InterfaceC3312i
        public void nn86(int i2, @zy.dd fti.C3596k c3596k, Exception exc) {
            if (m12712k(i2, c3596k)) {
                this.f21520n.x2(exc);
            }
        }

        @Override // com.google.android.exoplayer2.drm.InterfaceC3312i
        public void t8iq(int i2, @zy.dd fti.C3596k c3596k) {
            if (m12712k(i2, c3596k)) {
                this.f21520n.m11635p();
            }
        }

        @Override // com.google.android.exoplayer2.source.lvui
        public void vyq(int i2, @zy.dd fti.C3596k c3596k, wvg wvgVar) {
            if (m12712k(i2, c3596k)) {
                this.f21521q.a9(toq(wvgVar));
            }
        }

        @Override // com.google.android.exoplayer2.drm.InterfaceC3312i
        /* JADX INFO: renamed from: x */
        public void mo11376x(int i2, @zy.dd fti.C3596k c3596k) {
            if (m12712k(i2, c3596k)) {
                this.f21520n.qrj();
            }
        }

        @Override // com.google.android.exoplayer2.drm.InterfaceC3312i
        public void zp(int i2, @zy.dd fti.C3596k c3596k, int i3) {
            if (m12712k(i2, c3596k)) {
                this.f21520n.ld6(i3);
            }
        }

        @Override // com.google.android.exoplayer2.source.lvui
        public void zurt(int i2, @zy.dd fti.C3596k c3596k, ni7 ni7Var, wvg wvgVar) {
            if (m12712k(i2, c3596k)) {
                this.f21521q.t8r(ni7Var, toq(wvgVar));
            }
        }
    }

    /* JADX INFO: compiled from: CompositeMediaSource.java */
    private static final class toq<T> {

        /* JADX INFO: renamed from: k */
        public final fti f21522k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public final fti.toq f65382toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public final f7l8<T>.C3595k f65383zy;

        public toq(fti ftiVar, fti.toq toqVar, f7l8<T>.C3595k c3595k) {
            this.f21522k = ftiVar;
            this.f65382toq = toqVar;
            this.f65383zy = c3595k;
        }
    }

    protected f7l8() {
    }

    protected int d2ok(@com.google.android.exoplayer2.util.hyr T t2, int i2) {
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void dd(@com.google.android.exoplayer2.util.hyr final T t2, fti ftiVar) {
        C3844k.m13629k(!this.f21517p.containsKey(t2));
        fti.toq toqVar = new fti.toq() { // from class: com.google.android.exoplayer2.source.g
            @Override // com.google.android.exoplayer2.source.fti.toq
            /* JADX INFO: renamed from: s */
            public final void mo12410s(fti ftiVar2, pc pcVar) {
                this.f21532k.lvui(t2, ftiVar2, pcVar);
            }
        };
        C3595k c3595k = new C3595k(t2);
        this.f21517p.put(t2, new toq<>(ftiVar, toqVar, c3595k));
        ftiVar.zy((Handler) C3844k.f7l8(this.f21515h), c3595k);
        ftiVar.x2((Handler) C3844k.f7l8(this.f21515h), c3595k);
        ftiVar.f7l8(toqVar, this.f21516i);
        if (o1t()) {
            return;
        }
        ftiVar.mo12714p(toqVar);
    }

    protected final void fti(@com.google.android.exoplayer2.util.hyr T t2) {
        toq toqVar = (toq) C3844k.f7l8(this.f21517p.get(t2));
        toqVar.f21522k.mo12714p(toqVar.f65382toq);
    }

    @Override // com.google.android.exoplayer2.source.AbstractC3605k
    @InterfaceC7842s
    protected void fu4() {
        for (toq<T> toqVar : this.f21517p.values()) {
            toqVar.f21522k.mo12714p(toqVar.f65382toq);
        }
    }

    @zy.dd
    protected fti.C3596k gvn7(@com.google.android.exoplayer2.util.hyr T t2, fti.C3596k c3596k) {
        return c3596k;
    }

    protected final void jp0y(@com.google.android.exoplayer2.util.hyr T t2) {
        toq toqVar = (toq) C3844k.f7l8(this.f21517p.get(t2));
        toqVar.f21522k.mo12716y(toqVar.f65382toq);
    }

    @Override // com.google.android.exoplayer2.source.AbstractC3605k
    @InterfaceC7842s
    protected void mcp() {
        for (toq<T> toqVar : this.f21517p.values()) {
            toqVar.f21522k.toq(toqVar.f65382toq);
            toqVar.f21522k.mo12715q(toqVar.f65383zy);
            toqVar.f21522k.qrj(toqVar.f65383zy);
        }
        this.f21517p.clear();
    }

    @Override // com.google.android.exoplayer2.source.fti
    @InterfaceC7842s
    public void n7h() throws IOException {
        Iterator<toq<T>> it = this.f21517p.values().iterator();
        while (it.hasNext()) {
            it.next().f21522k.n7h();
        }
    }

    protected long oc(@com.google.android.exoplayer2.util.hyr T t2, long j2) {
        return j2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public abstract void lvui(@com.google.android.exoplayer2.util.hyr T t2, fti ftiVar, pc pcVar);

    @Override // com.google.android.exoplayer2.source.AbstractC3605k
    @InterfaceC7842s
    protected void wvg(@zy.dd com.google.android.exoplayer2.upstream.uv6 uv6Var) {
        this.f21516i = uv6Var;
        this.f21515h = com.google.android.exoplayer2.util.lrht.m13676z();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void x9kr(@com.google.android.exoplayer2.util.hyr T t2) {
        toq toqVar = (toq) C3844k.f7l8(this.f21517p.remove(t2));
        toqVar.f21522k.toq(toqVar.f65382toq);
        toqVar.f21522k.mo12715q(toqVar.f65383zy);
        toqVar.f21522k.qrj(toqVar.f65383zy);
    }

    @Override // com.google.android.exoplayer2.source.AbstractC3605k
    @InterfaceC7842s
    /* JADX INFO: renamed from: z */
    protected void mo12594z() {
        for (toq<T> toqVar : this.f21517p.values()) {
            toqVar.f21522k.mo12716y(toqVar.f65382toq);
        }
    }
}
