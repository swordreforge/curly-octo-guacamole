package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.AbstractC3449k;
import com.google.android.exoplayer2.pc;
import com.google.android.exoplayer2.source.InterfaceC3612m;
import com.google.android.exoplayer2.source.fti;
import com.google.android.exoplayer2.tfm;
import com.google.android.exoplayer2.util.C3844k;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: LoopingMediaSource.java */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class fu4 extends f7l8<Void> {

    /* JADX INFO: renamed from: l */
    private final Map<jk, fti.C3596k> f21524l;

    /* JADX INFO: renamed from: r */
    private final Map<fti.C3596k, fti.C3596k> f21525r;

    /* JADX INFO: renamed from: t */
    private final int f21526t;

    /* JADX INFO: renamed from: z */
    private final o1t f21527z;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.fu4$k */
    /* JADX INFO: compiled from: LoopingMediaSource.java */
    private static final class C3597k extends fn3e {
        public C3597k(pc pcVar) {
            super(pcVar);
        }

        @Override // com.google.android.exoplayer2.source.fn3e, com.google.android.exoplayer2.pc
        public int ki(int i2, int i3, boolean z2) {
            int iKi = this.f21523s.ki(i2, i3, z2);
            return iKi == -1 ? f7l8(z2) : iKi;
        }

        @Override // com.google.android.exoplayer2.source.fn3e, com.google.android.exoplayer2.pc
        /* JADX INFO: renamed from: s */
        public int mo12149s(int i2, int i3, boolean z2) {
            int iMo12149s = this.f21523s.mo12149s(i2, i3, z2);
            return iMo12149s == -1 ? mo12148n(z2) : iMo12149s;
        }
    }

    /* JADX INFO: compiled from: LoopingMediaSource.java */
    private static final class toq extends AbstractC3449k {

        /* JADX INFO: renamed from: i */
        private final pc f21528i;

        /* JADX INFO: renamed from: r */
        private final int f21529r;

        /* JADX INFO: renamed from: t */
        private final int f21530t;

        /* JADX INFO: renamed from: z */
        private final int f21531z;

        public toq(pc pcVar, int i2) {
            super(false, new InterfaceC3612m.toq(i2));
            this.f21528i = pcVar;
            int iQrj = pcVar.qrj();
            this.f21531z = iQrj;
            this.f21530t = pcVar.zurt();
            this.f21529r = i2;
            if (iQrj > 0) {
                C3844k.m13631p(i2 <= Integer.MAX_VALUE / iQrj, "LoopingMediaSource contains too many periods");
            }
        }

        @Override // com.google.android.exoplayer2.AbstractC3449k
        protected pc d2ok(int i2) {
            return this.f21528i;
        }

        @Override // com.google.android.exoplayer2.AbstractC3449k
        protected int d3(int i2) {
            return i2 * this.f21530t;
        }

        @Override // com.google.android.exoplayer2.AbstractC3449k
        protected Object fti(int i2) {
            return Integer.valueOf(i2);
        }

        @Override // com.google.android.exoplayer2.AbstractC3449k
        protected int gvn7(int i2) {
            return i2 * this.f21531z;
        }

        @Override // com.google.android.exoplayer2.AbstractC3449k
        protected int mcp(int i2) {
            return i2 / this.f21530t;
        }

        @Override // com.google.android.exoplayer2.pc
        public int qrj() {
            return this.f21531z * this.f21529r;
        }

        @Override // com.google.android.exoplayer2.AbstractC3449k
        /* JADX INFO: renamed from: t */
        protected int mo12146t(int i2) {
            return i2 / this.f21531z;
        }

        @Override // com.google.android.exoplayer2.AbstractC3449k
        protected int wvg(Object obj) {
            if (obj instanceof Integer) {
                return ((Integer) obj).intValue();
            }
            return -1;
        }

        @Override // com.google.android.exoplayer2.pc
        public int zurt() {
            return this.f21530t * this.f21529r;
        }
    }

    public fu4(fti ftiVar) {
        this(ftiVar, Integer.MAX_VALUE);
    }

    @Override // com.google.android.exoplayer2.source.fti
    /* JADX INFO: renamed from: g */
    public void mo12564g(jk jkVar) {
        this.f21527z.mo12564g(jkVar);
        fti.C3596k c3596kRemove = this.f21524l.remove(jkVar);
        if (c3596kRemove != null) {
            this.f21525r.remove(c3596kRemove);
        }
    }

    @Override // com.google.android.exoplayer2.source.fti
    @zy.dd
    /* JADX INFO: renamed from: h */
    public pc mo12713h() {
        return this.f21526t != Integer.MAX_VALUE ? new toq(this.f21527z.m12811f(), this.f21526t) : new C3597k(this.f21527z.m12811f());
    }

    @Override // com.google.android.exoplayer2.source.fti
    /* JADX INFO: renamed from: k */
    public jk mo12565k(fti.C3596k c3596k, com.google.android.exoplayer2.upstream.toq toqVar, long j2) {
        if (this.f21526t == Integer.MAX_VALUE) {
            return this.f21527z.mo12565k(c3596k, toqVar, j2);
        }
        fti.C3596k c3596kMo12557k = c3596k.mo12557k(AbstractC3449k.jk(c3596k.f21225k));
        this.f21525r.put(c3596kMo12557k, c3596k);
        C3634z c3634zMo12565k = this.f21527z.mo12565k(c3596kMo12557k, toqVar, j2);
        this.f21524l.put(c3634zMo12565k, c3596kMo12557k);
        return c3634zMo12565k;
    }

    @Override // com.google.android.exoplayer2.source.fti
    public boolean kja0() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.source.f7l8
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void lvui(Void r1, fti ftiVar, pc pcVar) {
        m12741t(this.f21526t != Integer.MAX_VALUE ? new toq(pcVar, this.f21526t) : new C3597k(pcVar));
    }

    @Override // com.google.android.exoplayer2.source.fti
    /* JADX INFO: renamed from: n */
    public tfm mo12566n() {
        return this.f21527z.mo12566n();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.source.f7l8
    @zy.dd
    /* JADX INFO: renamed from: ncyb, reason: merged with bridge method [inline-methods] */
    public fti.C3596k gvn7(Void r2, fti.C3596k c3596k) {
        return this.f21526t != Integer.MAX_VALUE ? this.f21525r.get(c3596k) : c3596k;
    }

    @Override // com.google.android.exoplayer2.source.f7l8, com.google.android.exoplayer2.source.AbstractC3605k
    protected void wvg(@zy.dd com.google.android.exoplayer2.upstream.uv6 uv6Var) {
        super.wvg(uv6Var);
        dd(null, this.f21527z);
    }

    public fu4(fti ftiVar, int i2) {
        C3844k.m13629k(i2 > 0);
        this.f21527z = new o1t(ftiVar, false);
        this.f21526t = i2;
        this.f21525r = new HashMap();
        this.f21524l = new HashMap();
    }
}
