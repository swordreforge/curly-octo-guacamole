package com.google.android.exoplayer2.audio;

import android.os.Handler;
import android.os.SystemClock;
import com.google.android.exoplayer2.AbstractC3433g;
import com.google.android.exoplayer2.C3865v;
import com.google.android.exoplayer2.audio.fn3e;
import com.google.android.exoplayer2.audio.zurt;
import com.google.android.exoplayer2.cv06;
import com.google.android.exoplayer2.decoder.C3297s;
import com.google.android.exoplayer2.decoder.C3298y;
import com.google.android.exoplayer2.decoder.InterfaceC3289g;
import com.google.android.exoplayer2.se;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.InterfaceC3863z;
import com.google.android.exoplayer2.xwq3;
import com.google.android.exoplayer2.yqrt;
import zy.InterfaceC7842s;

/* JADX INFO: renamed from: com.google.android.exoplayer2.audio.t */
/* JADX INFO: compiled from: DecoderAudioRenderer.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3266t<T extends InterfaceC3289g<C3297s, ? extends com.google.android.exoplayer2.decoder.n7h, ? extends C3298y>> extends AbstractC3433g implements InterfaceC3863z {
    private static final int as = 1;
    private static final int bg = 2;
    private static final int bl = 0;
    private static final String in = "DecoderAudioRenderer";

    /* JADX INFO: renamed from: a */
    @zy.dd
    private T f19455a;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private boolean f63505ab;
    private boolean an;

    /* JADX INFO: renamed from: b */
    private boolean f19456b;
    private long bb;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    @zy.dd
    private com.google.android.exoplayer2.drm.qrj f63506bo;
    private boolean bp;
    private boolean bv;

    /* JADX INFO: renamed from: c */
    private final C3297s f19457c;

    /* JADX INFO: renamed from: d */
    private int f19458d;

    /* JADX INFO: renamed from: e */
    private com.google.android.exoplayer2.decoder.f7l8 f19459e;

    /* JADX INFO: renamed from: f */
    private final zurt f19460f;
    private boolean id;

    /* JADX INFO: renamed from: j */
    private xwq3 f19461j;

    /* JADX INFO: renamed from: l */
    private final fn3e.C3246k f19462l;

    /* JADX INFO: renamed from: m */
    private int f19463m;

    /* JADX INFO: renamed from: o */
    private int f19464o;

    /* JADX INFO: renamed from: u */
    @zy.dd
    private com.google.android.exoplayer2.decoder.n7h f19465u;

    /* JADX INFO: renamed from: v */
    @zy.dd
    private com.google.android.exoplayer2.drm.qrj f19466v;

    /* JADX INFO: renamed from: w */
    private boolean f19467w;

    /* JADX INFO: renamed from: x */
    @zy.dd
    private C3297s f19468x;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.t$toq */
    /* JADX INFO: compiled from: DecoderAudioRenderer.java */
    private final class toq implements zurt.zy {
        private toq() {
        }

        @Override // com.google.android.exoplayer2.audio.zurt.zy
        /* JADX INFO: renamed from: g */
        public void mo11401g() {
            AbstractC3266t.this.m11520o();
        }

        @Override // com.google.android.exoplayer2.audio.zurt.zy
        /* JADX INFO: renamed from: k */
        public void mo11402k(boolean z2) {
            AbstractC3266t.this.f19462l.mcp(z2);
        }

        @Override // com.google.android.exoplayer2.audio.zurt.zy
        /* JADX INFO: renamed from: n */
        public void mo11403n(int i2, long j2, long j3) {
            AbstractC3266t.this.f19462l.jk(i2, j2, j3);
        }

        @Override // com.google.android.exoplayer2.audio.zurt.zy
        public void toq(Exception exc) {
            com.google.android.exoplayer2.util.ni7.m13700n(AbstractC3266t.in, "Audio sink error", exc);
            AbstractC3266t.this.f19462l.x2(exc);
        }

        @Override // com.google.android.exoplayer2.audio.zurt.zy
        public void zy(long j2) {
            AbstractC3266t.this.f19462l.m11423t(j2);
        }
    }

    public AbstractC3266t() {
        this((Handler) null, (fn3e) null, new InterfaceC3262p[0]);
    }

    private void a98o() {
        long jKi = this.f19460f.ki(zy());
        if (jKi != Long.MIN_VALUE) {
            if (!this.bv) {
                jKi = Math.max(this.bb, jKi);
            }
            this.bb = jKi;
            this.bv = false;
        }
    }

    /* JADX INFO: renamed from: b */
    private void m11513b(@zy.dd com.google.android.exoplayer2.drm.qrj qrjVar) {
        com.google.android.exoplayer2.drm.qrj.m11646y(this.f19466v, qrjVar);
        this.f19466v = qrjVar;
    }

    /* JADX INFO: renamed from: c */
    private boolean m11514c() throws C3298y, zurt.C3272g, zurt.toq, com.google.android.exoplayer2.ki, zurt.C3273k {
        if (this.f19465u == null) {
            com.google.android.exoplayer2.decoder.n7h n7hVar = (com.google.android.exoplayer2.decoder.n7h) this.f19455a.toq();
            this.f19465u = n7hVar;
            if (n7hVar == null) {
                return false;
            }
            int i2 = n7hVar.f19599n;
            if (i2 > 0) {
                this.f19459e.f19557g += i2;
                this.f19460f.t8r();
            }
        }
        if (this.f19465u.n7h()) {
            if (this.f19458d == 2) {
                yz();
                hb();
                this.f63505ab = true;
            } else {
                this.f19465u.cdj();
                this.f19465u = null;
                try {
                    ek5k();
                } catch (zurt.C3272g e2) {
                    throw mcp(e2, e2.format, e2.isRecoverable, yqrt.ERROR_CODE_AUDIO_TRACK_WRITE_FAILED);
                }
            }
            return false;
        }
        if (this.f63505ab) {
            this.f19460f.fn3e(m11516e(this.f19455a).toq().m13947r(this.f19464o).dd(this.f19463m).a9(), 0, null);
            this.f63505ab = false;
        }
        zurt zurtVar = this.f19460f;
        com.google.android.exoplayer2.decoder.n7h n7hVar2 = this.f19465u;
        if (!zurtVar.qrj(n7hVar2.f19598y, n7hVar2.f19600q, 1)) {
            return false;
        }
        this.f19459e.f19559n++;
        this.f19465u.cdj();
        this.f19465u = null;
        return true;
    }

    private void ek5k() throws zurt.C3272g {
        this.id = true;
        this.f19460f.cdj();
    }

    private void hb() throws com.google.android.exoplayer2.ki {
        if (this.f19455a != null) {
            return;
        }
        y9n(this.f19466v);
        com.google.android.exoplayer2.decoder.zy zyVarF7l8 = null;
        com.google.android.exoplayer2.drm.qrj qrjVar = this.f63506bo;
        if (qrjVar != null && (zyVarF7l8 = qrjVar.f7l8()) == null && this.f63506bo.mo11610g() == null) {
            return;
        }
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            com.google.android.exoplayer2.util.n5r1.m13686k("createAudioDecoder");
            this.f19455a = (T) m11517f(this.f19461j, zyVarF7l8);
            com.google.android.exoplayer2.util.n5r1.zy();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            this.f19462l.qrj(this.f19455a.getName(), jElapsedRealtime2, jElapsedRealtime2 - jElapsedRealtime);
            this.f19459e.f19558k++;
        } catch (C3298y e2) {
            com.google.android.exoplayer2.util.ni7.m13700n(in, "Audio codec error", e2);
            this.f19462l.ld6(e2);
            throw m12067t(e2, this.f19461j, 4001);
        } catch (OutOfMemoryError e3) {
            throw m12067t(e3, this.f19461j, 4001);
        }
    }

    /* JADX INFO: renamed from: j */
    private void m11515j(C3865v c3865v) throws com.google.android.exoplayer2.ki {
        xwq3 xwq3Var = (xwq3) C3844k.f7l8(c3865v.f67166toq);
        m11513b(c3865v.f23348k);
        xwq3 xwq3Var2 = this.f19461j;
        this.f19461j = xwq3Var;
        this.f19464o = xwq3Var.f67273ab;
        this.f19463m = xwq3Var.bb;
        T t2 = this.f19455a;
        if (t2 == null) {
            hb();
            this.f19462l.cdj(this.f19461j, null);
            return;
        }
        com.google.android.exoplayer2.decoder.ld6 ld6Var = this.f19466v != this.f63506bo ? new com.google.android.exoplayer2.decoder.ld6(t2.getName(), xwq3Var2, xwq3Var, 0, 128) : hyr(t2.getName(), xwq3Var2, xwq3Var);
        if (ld6Var.f19588q == 0) {
            if (this.f19467w) {
                this.f19458d = 1;
            } else {
                yz();
                hb();
                this.f63505ab = true;
            }
        }
        this.f19462l.cdj(this.f19461j, ld6Var);
    }

    private boolean uv6() throws C3298y, com.google.android.exoplayer2.ki {
        T t2 = this.f19455a;
        if (t2 == null || this.f19458d == 2 || this.an) {
            return false;
        }
        if (this.f19468x == null) {
            C3297s c3297s = (C3297s) t2.mo11564q();
            this.f19468x = c3297s;
            if (c3297s == null) {
                return false;
            }
        }
        if (this.f19458d == 1) {
            this.f19468x.m11565h(4);
            this.f19455a.zy(this.f19468x);
            this.f19468x = null;
            this.f19458d = 2;
            return false;
        }
        C3865v c3865vA9 = a9();
        int iNcyb = ncyb(c3865vA9, this.f19468x, 0);
        if (iNcyb == -5) {
            m11515j(c3865vA9);
            return true;
        }
        if (iNcyb != -4) {
            if (iNcyb == -3) {
                return false;
            }
            throw new IllegalStateException();
        }
        if (this.f19468x.n7h()) {
            this.an = true;
            this.f19455a.zy(this.f19468x);
            this.f19468x = null;
            return false;
        }
        this.f19468x.m11579i();
        C3297s c3297s2 = this.f19468x;
        c3297s2.f19617q = this.f19461j;
        m11519m(c3297s2);
        this.f19455a.zy(this.f19468x);
        this.f19467w = true;
        this.f19459e.f63555zy++;
        this.f19468x = null;
        return true;
    }

    private void vyq() throws com.google.android.exoplayer2.ki {
        if (this.f19458d != 0) {
            yz();
            hb();
            return;
        }
        this.f19468x = null;
        com.google.android.exoplayer2.decoder.n7h n7hVar = this.f19465u;
        if (n7hVar != null) {
            n7hVar.cdj();
            this.f19465u = null;
        }
        this.f19455a.flush();
        this.f19467w = false;
    }

    private void y9n(@zy.dd com.google.android.exoplayer2.drm.qrj qrjVar) {
        com.google.android.exoplayer2.drm.qrj.m11646y(this.f63506bo, qrjVar);
        this.f63506bo = qrjVar;
    }

    private void yz() {
        this.f19468x = null;
        this.f19465u = null;
        this.f19458d = 0;
        this.f19467w = false;
        T t2 = this.f19455a;
        if (t2 != null) {
            this.f19459e.f63554toq++;
            t2.release();
            this.f19462l.n7h(this.f19455a.getName());
            this.f19455a = null;
        }
        y9n(null);
    }

    protected final boolean bf2(xwq3 xwq3Var) {
        return this.f19460f.mo11458k(xwq3Var);
    }

    @Override // com.google.android.exoplayer2.AbstractC3433g
    protected void d2ok(long j2, boolean z2) throws com.google.android.exoplayer2.ki {
        if (this.f19456b) {
            this.f19460f.mo11456h();
        } else {
            this.f19460f.flush();
        }
        this.bb = j2;
        this.bp = true;
        this.bv = true;
        this.an = false;
        this.id = false;
        if (this.f19455a != null) {
            vyq();
        }
    }

    @Override // com.google.android.exoplayer2.AbstractC3433g
    protected void dd() {
        a98o();
        this.f19460f.pause();
    }

    /* JADX INFO: renamed from: e */
    protected abstract xwq3 m11516e(T t2);

    @Override // com.google.android.exoplayer2.AbstractC3433g
    protected void eqxt(boolean z2, boolean z3) throws com.google.android.exoplayer2.ki {
        com.google.android.exoplayer2.decoder.f7l8 f7l8Var = new com.google.android.exoplayer2.decoder.f7l8();
        this.f19459e = f7l8Var;
        this.f19462l.m11422h(f7l8Var);
        if (jk().f20547k) {
            this.f19460f.mo11457i();
        } else {
            this.f19460f.mo11455g();
        }
    }

    /* JADX INFO: renamed from: f */
    protected abstract T m11517f(xwq3 xwq3Var, @zy.dd com.google.android.exoplayer2.decoder.zy zyVar) throws C3298y;

    @Override // com.google.android.exoplayer2.util.InterfaceC3863z
    public se f7l8() {
        return this.f19460f.f7l8();
    }

    protected com.google.android.exoplayer2.decoder.ld6 hyr(String str, xwq3 xwq3Var, xwq3 xwq3Var2) {
        return new com.google.android.exoplayer2.decoder.ld6(str, xwq3Var, xwq3Var2, 0, 1);
    }

    protected abstract int i1(xwq3 xwq3Var);

    @Override // com.google.android.exoplayer2.bek6
    public boolean isReady() {
        return this.f19460f.mo11459n() || (this.f19461j != null && (d3() || this.f19465u != null));
    }

    @Override // com.google.android.exoplayer2.cv06
    /* JADX INFO: renamed from: k */
    public final int mo11518k(xwq3 xwq3Var) {
        if (!com.google.android.exoplayer2.util.wvg.m13744h(xwq3Var.f23682r)) {
            return cv06.m11557p(0);
        }
        int iI1 = i1(xwq3Var);
        if (iI1 <= 2) {
            return cv06.m11557p(iI1);
        }
        return cv06.cdj(iI1, 8, com.google.android.exoplayer2.util.lrht.f23230k >= 21 ? 32 : 0);
    }

    @Override // com.google.android.exoplayer2.util.InterfaceC3863z
    public long ki() {
        if (getState() == 2) {
            a98o();
        }
        return this.bb;
    }

    @Override // com.google.android.exoplayer2.util.InterfaceC3863z
    public void ld6(se seVar) {
        this.f19460f.ld6(seVar);
    }

    public void lrht(boolean z2) {
        this.f19456b = z2;
    }

    /* JADX INFO: renamed from: m */
    protected void m11519m(C3297s c3297s) {
        if (!this.bp || c3297s.qrj()) {
            return;
        }
        if (Math.abs(c3297s.f19618s - this.bb) > 500000) {
            this.bb = c3297s.f19618s;
        }
        this.bp = false;
    }

    protected final int nn86(xwq3 xwq3Var) {
        return this.f19460f.kja0(xwq3Var);
    }

    @InterfaceC7842s
    /* JADX INFO: renamed from: o */
    protected void m11520o() {
        this.bv = true;
    }

    @Override // com.google.android.exoplayer2.AbstractC3433g, com.google.android.exoplayer2.bek6
    @zy.dd
    public InterfaceC3863z o1t() {
        return this;
    }

    @Override // com.google.android.exoplayer2.AbstractC3433g
    protected void oc() {
        this.f19461j = null;
        this.f63505ab = true;
        try {
            m11513b(null);
            yz();
            this.f19460f.reset();
        } finally {
            this.f19462l.kja0(this.f19459e);
        }
    }

    @Override // com.google.android.exoplayer2.AbstractC3433g
    /* JADX INFO: renamed from: r */
    protected void mo11400r() {
        this.f19460f.play();
    }

    @Override // com.google.android.exoplayer2.AbstractC3433g, com.google.android.exoplayer2.uj2j.toq
    public void x2(int i2, @zy.dd Object obj) throws com.google.android.exoplayer2.ki {
        if (i2 == 2) {
            this.f19460f.toq(((Float) obj).floatValue());
            return;
        }
        if (i2 == 3) {
            this.f19460f.mo11462s((C3248g) obj);
            return;
        }
        if (i2 == 6) {
            this.f19460f.mo11463y((C3271z) obj);
        } else if (i2 == 9) {
            this.f19460f.x2(((Boolean) obj).booleanValue());
        } else if (i2 != 10) {
            super.x2(i2, obj);
        } else {
            this.f19460f.mo11461q(((Integer) obj).intValue());
        }
    }

    @Override // com.google.android.exoplayer2.bek6
    public void zurt(long j2, long j3) throws com.google.android.exoplayer2.ki {
        if (this.id) {
            try {
                this.f19460f.cdj();
                return;
            } catch (zurt.C3272g e2) {
                throw mcp(e2, e2.format, e2.isRecoverable, yqrt.ERROR_CODE_AUDIO_TRACK_WRITE_FAILED);
            }
        }
        if (this.f19461j == null) {
            C3865v c3865vA9 = a9();
            this.f19457c.mo11567s();
            int iNcyb = ncyb(c3865vA9, this.f19457c, 2);
            if (iNcyb != -5) {
                if (iNcyb == -4) {
                    C3844k.m13633s(this.f19457c.n7h());
                    this.an = true;
                    try {
                        ek5k();
                        return;
                    } catch (zurt.C3272g e3) {
                        throw m12067t(e3, null, yqrt.ERROR_CODE_AUDIO_TRACK_WRITE_FAILED);
                    }
                }
                return;
            }
            m11515j(c3865vA9);
        }
        hb();
        if (this.f19455a != null) {
            try {
                com.google.android.exoplayer2.util.n5r1.m13686k("drainAndFeed");
                while (m11514c()) {
                }
                while (uv6()) {
                }
                com.google.android.exoplayer2.util.n5r1.zy();
                this.f19459e.zy();
            } catch (zurt.C3272g e4) {
                throw mcp(e4, e4.format, e4.isRecoverable, yqrt.ERROR_CODE_AUDIO_TRACK_WRITE_FAILED);
            } catch (zurt.C3273k e6) {
                throw m12067t(e6, e6.format, 5001);
            } catch (zurt.toq e7) {
                throw mcp(e7, e7.format, e7.isRecoverable, 5001);
            } catch (C3298y e8) {
                com.google.android.exoplayer2.util.ni7.m13700n(in, "Audio codec error", e8);
                this.f19462l.ld6(e8);
                throw m12067t(e8, this.f19461j, 4003);
            }
        }
    }

    @Override // com.google.android.exoplayer2.bek6
    public boolean zy() {
        return this.id && this.f19460f.zy();
    }

    public AbstractC3266t(@zy.dd Handler handler, @zy.dd fn3e fn3eVar, InterfaceC3262p... interfaceC3262pArr) {
        this(handler, fn3eVar, null, interfaceC3262pArr);
    }

    public AbstractC3266t(@zy.dd Handler handler, @zy.dd fn3e fn3eVar, @zy.dd C3270y c3270y, InterfaceC3262p... interfaceC3262pArr) {
        this(handler, fn3eVar, new gvn7(c3270y, interfaceC3262pArr));
    }

    public AbstractC3266t(@zy.dd Handler handler, @zy.dd fn3e fn3eVar, zurt zurtVar) {
        super(1);
        this.f19462l = new fn3e.C3246k(handler, fn3eVar);
        this.f19460f = zurtVar;
        zurtVar.n7h(new toq());
        this.f19457c = C3297s.zurt();
        this.f19458d = 0;
        this.f63505ab = true;
    }
}
