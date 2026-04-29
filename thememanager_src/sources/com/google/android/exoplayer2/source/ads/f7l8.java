package com.google.android.exoplayer2.source.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.exoplayer2.C3548p;
import com.google.android.exoplayer2.pc;
import com.google.android.exoplayer2.source.C3634z;
import com.google.android.exoplayer2.source.InterfaceC3626r;
import com.google.android.exoplayer2.source.ads.InterfaceC3571q;
import com.google.android.exoplayer2.source.ads.zy;
import com.google.android.exoplayer2.source.fti;
import com.google.android.exoplayer2.source.jk;
import com.google.android.exoplayer2.source.ni7;
import com.google.android.exoplayer2.tfm;
import com.google.android.exoplayer2.upstream.t8r;
import com.google.android.exoplayer2.upstream.uv6;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.lrht;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import zy.dd;

/* JADX INFO: compiled from: AdsMediaSource.java */
/* JADX INFO: loaded from: classes2.dex */
public final class f7l8 extends com.google.android.exoplayer2.source.f7l8<fti.C3596k> {

    /* JADX INFO: renamed from: x */
    private static final fti.C3596k f21228x = new fti.C3596k(new Object());

    /* JADX INFO: renamed from: b */
    @dd
    private com.google.android.exoplayer2.source.ads.zy f21230b;

    /* JADX INFO: renamed from: c */
    private final Object f21231c;

    /* JADX INFO: renamed from: f */
    private final t8r f21233f;

    /* JADX INFO: renamed from: l */
    private final com.google.android.exoplayer2.ui.toq f21235l;

    /* JADX INFO: renamed from: m */
    @dd
    private pc f21236m;

    /* JADX INFO: renamed from: o */
    @dd
    private C3566q f21237o;

    /* JADX INFO: renamed from: r */
    private final InterfaceC3571q f21238r;

    /* JADX INFO: renamed from: t */
    private final InterfaceC3626r f21239t;

    /* JADX INFO: renamed from: z */
    private final fti f21240z;

    /* JADX INFO: renamed from: e */
    private final Handler f21232e = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: j */
    private final pc.toq f21234j = new pc.toq();

    /* JADX INFO: renamed from: a */
    private toq[][] f21229a = new toq[0][];

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.ads.f7l8$k */
    /* JADX INFO: compiled from: AdsMediaSource.java */
    public static final class C3565k extends IOException {
        public static final int TYPE_AD = 0;
        public static final int TYPE_AD_GROUP = 1;
        public static final int TYPE_ALL_ADS = 2;
        public static final int TYPE_UNEXPECTED = 3;
        public final int type;

        /* JADX INFO: renamed from: com.google.android.exoplayer2.source.ads.f7l8$k$k */
        /* JADX INFO: compiled from: AdsMediaSource.java */
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface k {
        }

        private C3565k(int i2, Exception exc) {
            super(exc);
            this.type = i2;
        }

        public static C3565k createForAd(Exception exc) {
            return new C3565k(0, exc);
        }

        public static C3565k createForAdGroup(Exception exc, int i2) {
            StringBuilder sb = new StringBuilder(35);
            sb.append("Failed to load ad group ");
            sb.append(i2);
            return new C3565k(1, new IOException(sb.toString(), exc));
        }

        public static C3565k createForAllAds(Exception exc) {
            return new C3565k(2, exc);
        }

        public static C3565k createForUnexpected(RuntimeException runtimeException) {
            return new C3565k(3, runtimeException);
        }

        public RuntimeException getRuntimeExceptionForUnexpected() {
            C3844k.m13633s(this.type == 3);
            return (RuntimeException) C3844k.f7l8(getCause());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.ads.f7l8$q */
    /* JADX INFO: compiled from: AdsMediaSource.java */
    final class C3566q implements InterfaceC3571q.k {

        /* JADX INFO: renamed from: k */
        private final Handler f21241k = lrht.m13676z();

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private volatile boolean f65327toq;

        public C3566q() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: g */
        public /* synthetic */ void m12569g(com.google.android.exoplayer2.source.ads.zy zyVar) {
            if (this.f65327toq) {
                return;
            }
            f7l8.this.bf2(zyVar);
        }

        public void f7l8() {
            this.f65327toq = true;
            this.f21241k.removeCallbacksAndMessages(null);
        }

        @Override // com.google.android.exoplayer2.source.ads.InterfaceC3571q.k
        /* JADX INFO: renamed from: k */
        public void mo12571k(final com.google.android.exoplayer2.source.ads.zy zyVar) {
            if (this.f65327toq) {
                return;
            }
            this.f21241k.post(new Runnable() { // from class: com.google.android.exoplayer2.source.ads.p
                @Override // java.lang.Runnable
                public final void run() {
                    this.f21254k.m12569g(zyVar);
                }
            });
        }

        @Override // com.google.android.exoplayer2.source.ads.InterfaceC3571q.k
        /* JADX INFO: renamed from: q */
        public void mo12572q(C3565k c3565k, t8r t8rVar) {
            if (this.f65327toq) {
                return;
            }
            f7l8.this.fn3e(null).fu4(new ni7(ni7.m12808k(), t8rVar, SystemClock.elapsedRealtime()), 6, c3565k, true);
        }
    }

    /* JADX INFO: compiled from: AdsMediaSource.java */
    private final class toq {

        /* JADX INFO: renamed from: k */
        private final fti.C3596k f21243k;

        /* JADX INFO: renamed from: n */
        private pc f21244n;

        /* JADX INFO: renamed from: q */
        private fti f21245q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final List<C3634z> f65329toq = new ArrayList();

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private Uri f65330zy;

        public toq(fti.C3596k c3596k) {
            this.f21243k = c3596k;
        }

        public void f7l8() {
            if (m12576q()) {
                f7l8.this.x9kr(this.f21243k);
            }
        }

        /* JADX INFO: renamed from: g */
        public boolean m12573g() {
            return this.f65329toq.isEmpty();
        }

        /* JADX INFO: renamed from: k */
        public jk m12574k(fti.C3596k c3596k, com.google.android.exoplayer2.upstream.toq toqVar, long j2) {
            C3634z c3634z = new C3634z(c3596k, toqVar, j2);
            this.f65329toq.add(c3634z);
            fti ftiVar = this.f21245q;
            if (ftiVar != null) {
                c3634z.fu4(ftiVar);
                c3634z.m12830z(f7l8.this.new zy((Uri) C3844k.f7l8(this.f65330zy)));
            }
            pc pcVar = this.f21244n;
            if (pcVar != null) {
                c3634z.toq(new fti.C3596k(pcVar.t8r(0), c3596k.f21227q));
            }
            return c3634z;
        }

        /* JADX INFO: renamed from: n */
        public void m12575n(fti ftiVar, Uri uri) {
            this.f21245q = ftiVar;
            this.f65330zy = uri;
            for (int i2 = 0; i2 < this.f65329toq.size(); i2++) {
                C3634z c3634z = this.f65329toq.get(i2);
                c3634z.fu4(ftiVar);
                c3634z.m12830z(f7l8.this.new zy(uri));
            }
            f7l8.this.dd(this.f21243k, ftiVar);
        }

        /* JADX INFO: renamed from: q */
        public boolean m12576q() {
            return this.f21245q != null;
        }

        public long toq() {
            pc pcVar = this.f21244n;
            return pcVar == null ? C3548p.f65257toq : pcVar.m12485p(0, f7l8.this.f21234j).n7h();
        }

        /* JADX INFO: renamed from: y */
        public void m12577y(C3634z c3634z) {
            this.f65329toq.remove(c3634z);
            c3634z.ni7();
        }

        public void zy(pc pcVar) {
            C3844k.m13629k(pcVar.qrj() == 1);
            if (this.f21244n == null) {
                Object objT8r = pcVar.t8r(0);
                for (int i2 = 0; i2 < this.f65329toq.size(); i2++) {
                    C3634z c3634z = this.f65329toq.get(i2);
                    c3634z.toq(new fti.C3596k(objT8r, c3634z.f21762k.f21227q));
                }
            }
            this.f21244n = pcVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: AdsMediaSource.java */
    final class zy implements C3634z.k {

        /* JADX INFO: renamed from: k */
        private final Uri f21246k;

        public zy(Uri uri) {
            this.f21246k = uri;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: g */
        public /* synthetic */ void m12578g(fti.C3596k c3596k, IOException iOException) {
            f7l8.this.f21238r.m12585q(f7l8.this, c3596k.f65325toq, c3596k.f65326zy, iOException);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: n */
        public /* synthetic */ void m12579n(fti.C3596k c3596k) {
            f7l8.this.f21238r.m12583k(f7l8.this, c3596k.f65325toq, c3596k.f65326zy);
        }

        @Override // com.google.android.exoplayer2.source.C3634z.k
        /* JADX INFO: renamed from: k */
        public void mo12581k(final fti.C3596k c3596k) {
            f7l8.this.f21232e.post(new Runnable() { // from class: com.google.android.exoplayer2.source.ads.y
                @Override // java.lang.Runnable
                public final void run() {
                    this.f21287k.m12579n(c3596k);
                }
            });
        }

        @Override // com.google.android.exoplayer2.source.C3634z.k
        public void toq(final fti.C3596k c3596k, final IOException iOException) {
            f7l8.this.fn3e(c3596k).fu4(new ni7(ni7.m12808k(), new t8r(this.f21246k), SystemClock.elapsedRealtime()), 6, C3565k.createForAd(iOException), true);
            f7l8.this.f21232e.post(new Runnable() { // from class: com.google.android.exoplayer2.source.ads.s
                @Override // java.lang.Runnable
                public final void run() {
                    this.f21256k.m12578g(c3596k, iOException);
                }
            });
        }
    }

    public f7l8(fti ftiVar, t8r t8rVar, Object obj, InterfaceC3626r interfaceC3626r, InterfaceC3571q interfaceC3571q, com.google.android.exoplayer2.ui.toq toqVar) {
        this.f21240z = ftiVar;
        this.f21239t = interfaceC3626r;
        this.f21238r = interfaceC3571q;
        this.f21235l = toqVar;
        this.f21233f = t8rVar;
        this.f21231c = obj;
        interfaceC3571q.m12582g(interfaceC3626r.mo12637q());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bf2(com.google.android.exoplayer2.source.ads.zy zyVar) {
        com.google.android.exoplayer2.source.ads.zy zyVar2 = this.f21230b;
        if (zyVar2 == null) {
            toq[][] toqVarArr = new toq[zyVar.f21304q][];
            this.f21229a = toqVarArr;
            Arrays.fill(toqVarArr, new toq[0]);
        } else {
            C3844k.m13633s(zyVar.f21304q == zyVar2.f21304q);
        }
        this.f21230b = zyVar;
        yz();
        y9n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void ek5k(C3566q c3566q) {
        this.f21238r.m12584n(this, c3566q);
    }

    /* JADX INFO: renamed from: j */
    private long[][] m12561j() {
        long[][] jArr = new long[this.f21229a.length][];
        int i2 = 0;
        while (true) {
            toq[][] toqVarArr = this.f21229a;
            if (i2 >= toqVarArr.length) {
                return jArr;
            }
            jArr[i2] = new long[toqVarArr[i2].length];
            int i3 = 0;
            while (true) {
                toq[] toqVarArr2 = this.f21229a[i2];
                if (i3 < toqVarArr2.length) {
                    toq toqVar = toqVarArr2[i3];
                    jArr[i2][i3] = toqVar == null ? C3548p.f65257toq : toqVar.toq();
                    i3++;
                }
            }
            i2++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ void m12563m(C3566q c3566q) {
        this.f21238r.zy(this, this.f21233f, this.f21231c, this.f21235l, c3566q);
    }

    private void y9n() {
        pc pcVar = this.f21236m;
        com.google.android.exoplayer2.source.ads.zy zyVar = this.f21230b;
        if (zyVar == null || pcVar == null) {
            return;
        }
        if (zyVar.f21304q == 0) {
            m12741t(pcVar);
        } else {
            this.f21230b = zyVar.x2(m12561j());
            m12741t(new n7h(pcVar, this.f21230b));
        }
    }

    private void yz() {
        Uri uri;
        com.google.android.exoplayer2.source.ads.zy zyVar = this.f21230b;
        if (zyVar == null) {
            return;
        }
        for (int i2 = 0; i2 < this.f21229a.length; i2++) {
            int i3 = 0;
            while (true) {
                toq[] toqVarArr = this.f21229a[i2];
                if (i3 < toqVarArr.length) {
                    toq toqVar = toqVarArr[i3];
                    zy.C3576k c3576kM12619q = zyVar.m12619q(i2);
                    if (toqVar != null && !toqVar.m12576q()) {
                        Uri[] uriArr = c3576kM12619q.f21317n;
                        if (i3 < uriArr.length && (uri = uriArr[i3]) != null) {
                            tfm.zy zyVarEqxt = new tfm.zy().eqxt(uri);
                            tfm.C3701y c3701y = this.f21240z.mo12566n().f22150q;
                            if (c3701y != null) {
                                zyVarEqxt.qrj(c3701y.f65992zy);
                            }
                            toqVar.m12575n(this.f21239t.zy(zyVarEqxt.m13065k()), uri);
                        }
                    }
                    i3++;
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.source.fti
    /* JADX INFO: renamed from: g */
    public void mo12564g(jk jkVar) {
        C3634z c3634z = (C3634z) jkVar;
        fti.C3596k c3596k = c3634z.f21762k;
        if (!c3596k.zy()) {
            c3634z.ni7();
            return;
        }
        toq toqVar = (toq) C3844k.f7l8(this.f21229a[c3596k.f65325toq][c3596k.f65326zy]);
        toqVar.m12577y(c3634z);
        if (toqVar.m12573g()) {
            toqVar.f7l8();
            this.f21229a[c3596k.f65325toq][c3596k.f65326zy] = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.source.f7l8
    /* JADX INFO: renamed from: i1, reason: merged with bridge method [inline-methods] */
    public void lvui(fti.C3596k c3596k, fti ftiVar, pc pcVar) {
        if (c3596k.zy()) {
            ((toq) C3844k.f7l8(this.f21229a[c3596k.f65325toq][c3596k.f65326zy])).zy(pcVar);
        } else {
            C3844k.m13629k(pcVar.qrj() == 1);
            this.f21236m = pcVar;
        }
        y9n();
    }

    @Override // com.google.android.exoplayer2.source.fti
    /* JADX INFO: renamed from: k */
    public jk mo12565k(fti.C3596k c3596k, com.google.android.exoplayer2.upstream.toq toqVar, long j2) {
        if (((com.google.android.exoplayer2.source.ads.zy) C3844k.f7l8(this.f21230b)).f21304q <= 0 || !c3596k.zy()) {
            C3634z c3634z = new C3634z(c3596k, toqVar, j2);
            c3634z.fu4(this.f21240z);
            c3634z.toq(c3596k);
            return c3634z;
        }
        int i2 = c3596k.f65325toq;
        int i3 = c3596k.f65326zy;
        toq[][] toqVarArr = this.f21229a;
        toq[] toqVarArr2 = toqVarArr[i2];
        if (toqVarArr2.length <= i3) {
            toqVarArr[i2] = (toq[]) Arrays.copyOf(toqVarArr2, i3 + 1);
        }
        toq toqVar2 = this.f21229a[i2][i3];
        if (toqVar2 == null) {
            toqVar2 = new toq(c3596k);
            this.f21229a[i2][i3] = toqVar2;
            yz();
        }
        return toqVar2.m12574k(c3596k, toqVar, j2);
    }

    @Override // com.google.android.exoplayer2.source.f7l8, com.google.android.exoplayer2.source.AbstractC3605k
    protected void mcp() {
        super.mcp();
        final C3566q c3566q = (C3566q) C3844k.f7l8(this.f21237o);
        this.f21237o = null;
        c3566q.f7l8();
        this.f21236m = null;
        this.f21230b = null;
        this.f21229a = new toq[0][];
        this.f21232e.post(new Runnable() { // from class: com.google.android.exoplayer2.source.ads.n
            @Override // java.lang.Runnable
            public final void run() {
                this.f21251k.ek5k(c3566q);
            }
        });
    }

    @Override // com.google.android.exoplayer2.source.fti
    /* JADX INFO: renamed from: n */
    public tfm mo12566n() {
        return this.f21240z.mo12566n();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.source.f7l8
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public fti.C3596k gvn7(fti.C3596k c3596k, fti.C3596k c3596k2) {
        return c3596k.zy() ? c3596k : c3596k2;
    }

    @Override // com.google.android.exoplayer2.source.f7l8, com.google.android.exoplayer2.source.AbstractC3605k
    protected void wvg(@dd uv6 uv6Var) {
        super.wvg(uv6Var);
        final C3566q c3566q = new C3566q();
        this.f21237o = c3566q;
        dd(f21228x, this.f21240z);
        this.f21232e.post(new Runnable() { // from class: com.google.android.exoplayer2.source.ads.g
            @Override // java.lang.Runnable
            public final void run() {
                this.f21247k.m12563m(c3566q);
            }
        });
    }
}
