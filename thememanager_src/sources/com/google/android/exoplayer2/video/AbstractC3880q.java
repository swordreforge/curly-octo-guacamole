package com.google.android.exoplayer2.video;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import com.google.android.exoplayer2.AbstractC3433g;
import com.google.android.exoplayer2.C3548p;
import com.google.android.exoplayer2.C3865v;
import com.google.android.exoplayer2.decoder.C3297s;
import com.google.android.exoplayer2.decoder.C3298y;
import com.google.android.exoplayer2.decoder.InterfaceC3289g;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.lrht;
import com.google.android.exoplayer2.util.n5r1;
import com.google.android.exoplayer2.util.ncyb;
import com.google.android.exoplayer2.video.InterfaceC3894z;
import com.google.android.exoplayer2.xwq3;
import zy.InterfaceC7842s;
import zy.dd;

/* JADX INFO: renamed from: com.google.android.exoplayer2.video.q */
/* JADX INFO: compiled from: DecoderVideoRenderer.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3880q extends AbstractC3433g {
    private static final int ar = 1;
    private static final int bc = 2;
    private static final String bs = "DecoderVideoRenderer";
    private static final int k0 = 0;

    /* JADX INFO: renamed from: a */
    private C3297s f23454a;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    @dd
    private com.google.android.exoplayer2.drm.qrj f67198ab;
    private int ac;
    private int ad;
    protected com.google.android.exoplayer2.decoder.f7l8 aj;
    private int am;
    private boolean an;
    private long as;

    @dd
    private wvg ax;
    private long ay;
    private boolean az;

    /* JADX INFO: renamed from: b */
    @dd
    private InterfaceC3289g<C3297s, ? extends com.google.android.exoplayer2.decoder.kja0, ? extends C3298y> f23455b;
    private boolean ba;

    @dd
    private com.google.android.exoplayer2.drm.qrj bb;
    private long be;
    private boolean bg;
    private long bl;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    @dd
    private Object f67199bo;
    private int bp;
    private long bq;
    private boolean bv;

    /* JADX INFO: renamed from: c */
    private final InterfaceC3894z.k f23456c;

    /* JADX INFO: renamed from: d */
    @dd
    private InterfaceC3879p f23457d;

    /* JADX INFO: renamed from: e */
    private final ncyb<xwq3> f23458e;

    /* JADX INFO: renamed from: f */
    private final int f23459f;
    private boolean id;
    private boolean in;

    /* JADX INFO: renamed from: j */
    private final C3297s f23460j;

    /* JADX INFO: renamed from: l */
    private final long f23461l;

    /* JADX INFO: renamed from: m */
    private xwq3 f23462m;

    /* JADX INFO: renamed from: o */
    private xwq3 f23463o;

    /* JADX INFO: renamed from: u */
    private int f23464u;

    /* JADX INFO: renamed from: v */
    @dd
    private Surface f23465v;

    /* JADX INFO: renamed from: w */
    @dd
    private ld6 f23466w;

    /* JADX INFO: renamed from: x */
    private com.google.android.exoplayer2.decoder.kja0 f23467x;

    protected AbstractC3880q(long j2, @dd Handler handler, @dd InterfaceC3894z interfaceC3894z, int i2) {
        super(2);
        this.f23461l = j2;
        this.f23459f = i2;
        this.as = C3548p.f65257toq;
        m13818f();
        this.f23458e = new ncyb<>();
        this.f23460j = C3297s.zurt();
        this.f23456c = new InterfaceC3894z.k(handler, interfaceC3894z);
        this.bp = 0;
        this.f23464u = -1;
    }

    /* JADX INFO: renamed from: a */
    private void m13816a() {
        m13818f();
        hyr();
    }

    private void a98o() {
        bf2();
        hyr();
        if (getState() == 2) {
            c8jq();
        }
    }

    /* JADX INFO: renamed from: b */
    private void m13817b() {
        if (this.an) {
            this.f23456c.wvg(this.f67199bo);
        }
    }

    private void bf2() {
        wvg wvgVar = this.ax;
        if (wvgVar != null) {
            this.f23456c.jk(wvgVar);
        }
    }

    private void bo(@dd com.google.android.exoplayer2.drm.qrj qrjVar) {
        com.google.android.exoplayer2.drm.qrj.m11646y(this.f67198ab, qrjVar);
        this.f67198ab = qrjVar;
    }

    private void c8jq() {
        this.as = this.f23461l > 0 ? SystemClock.elapsedRealtime() + this.f23461l : C3548p.f65257toq;
    }

    private void dr(@dd com.google.android.exoplayer2.drm.qrj qrjVar) {
        com.google.android.exoplayer2.drm.qrj.m11646y(this.bb, qrjVar);
        this.bb = qrjVar;
    }

    private void ek5k() {
        if (this.ac > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.f23456c.n7h(this.ac, jElapsedRealtime - this.bq);
            this.ac = 0;
            this.bq = jElapsedRealtime;
        }
    }

    /* JADX INFO: renamed from: f */
    private void m13818f() {
        this.ax = null;
    }

    private static boolean hb(long j2) {
        return j2 < -30000;
    }

    private void hyr() {
        this.an = false;
    }

    /* JADX INFO: renamed from: j */
    private static boolean m13819j(long j2) {
        return j2 < -500000;
    }

    private boolean lrht(long j2, long j3) throws C3298y, com.google.android.exoplayer2.ki {
        if (this.f23467x == null) {
            com.google.android.exoplayer2.decoder.kja0 qVar = this.f23455b.toq();
            this.f23467x = qVar;
            if (qVar == null) {
                return false;
            }
            com.google.android.exoplayer2.decoder.f7l8 f7l8Var = this.aj;
            int i2 = f7l8Var.f19557g;
            int i3 = qVar.f19599n;
            f7l8Var.f19557g = i2 + i3;
            this.am -= i3;
        }
        if (!this.f23467x.n7h()) {
            boolean zNmn5 = nmn5(j2, j3);
            if (zNmn5) {
                m13827x(this.f23467x.f19600q);
                this.f23467x = null;
            }
            return zNmn5;
        }
        if (this.bp == 2) {
            lv5();
            m13820m();
        } else {
            this.f23467x.cdj();
            this.f23467x = null;
            this.ba = true;
        }
        return false;
    }

    /* JADX INFO: renamed from: m */
    private void m13820m() throws com.google.android.exoplayer2.ki {
        if (this.f23455b != null) {
            return;
        }
        bo(this.bb);
        com.google.android.exoplayer2.decoder.zy zyVarF7l8 = null;
        com.google.android.exoplayer2.drm.qrj qrjVar = this.f67198ab;
        if (qrjVar != null && (zyVarF7l8 = qrjVar.f7l8()) == null && this.f67198ab.mo11610g() == null) {
            return;
        }
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.f23455b = m13821c(this.f23463o, zyVarF7l8);
            y2(this.f23464u);
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            this.f23456c.ld6(this.f23455b.getName(), jElapsedRealtime2, jElapsedRealtime2 - jElapsedRealtime);
            this.aj.f19558k++;
        } catch (C3298y e2) {
            com.google.android.exoplayer2.util.ni7.m13700n(bs, "Video codec error", e2);
            this.f23456c.mcp(e2);
            throw m12067t(e2, this.f23463o, 4001);
        } catch (OutOfMemoryError e3) {
            throw m12067t(e3, this.f23463o, 4001);
        }
    }

    private boolean nmn5(long j2, long j3) throws C3298y, com.google.android.exoplayer2.ki {
        if (this.bl == C3548p.f65257toq) {
            this.bl = j2;
        }
        long j4 = this.f23467x.f19600q - j2;
        if (!nn86()) {
            if (!hb(j4)) {
                return false;
            }
            m13822d(this.f23467x);
            return true;
        }
        long j5 = this.f23467x.f19600q - this.be;
        xwq3 xwq3VarM13696p = this.f23458e.m13696p(j5);
        if (xwq3VarM13696p != null) {
            this.f23462m = xwq3VarM13696p;
        }
        long jElapsedRealtime = (SystemClock.elapsedRealtime() * 1000) - this.ay;
        boolean z2 = getState() == 2;
        if ((this.in ? !this.an : z2 || this.id) || (z2 && ikck(j4, jElapsedRealtime))) {
            t8iq(this.f23467x, j5, this.f23462m);
            return true;
        }
        if (!z2 || j2 == this.bl || (xwq3(j4, j3) && m13824o(j2))) {
            return false;
        }
        if (m13826v(j4, j3)) {
            uv6(this.f23467x);
            return true;
        }
        if (j4 < 30000) {
            t8iq(this.f23467x, j5, this.f23462m);
            return true;
        }
        return false;
    }

    private boolean nn86() {
        return this.f23464u != -1;
    }

    private boolean vyq() throws C3298y, com.google.android.exoplayer2.ki {
        InterfaceC3289g<C3297s, ? extends com.google.android.exoplayer2.decoder.kja0, ? extends C3298y> interfaceC3289g = this.f23455b;
        if (interfaceC3289g == null || this.bp == 2 || this.az) {
            return false;
        }
        if (this.f23454a == null) {
            C3297s c3297sMo11564q = interfaceC3289g.mo11564q();
            this.f23454a = c3297sMo11564q;
            if (c3297sMo11564q == null) {
                return false;
            }
        }
        if (this.bp == 1) {
            this.f23454a.m11565h(4);
            this.f23455b.zy(this.f23454a);
            this.f23454a = null;
            this.bp = 2;
            return false;
        }
        C3865v c3865vA9 = a9();
        int iNcyb = ncyb(c3865vA9, this.f23454a, 0);
        if (iNcyb == -5) {
            i1(c3865vA9);
            return true;
        }
        if (iNcyb != -4) {
            if (iNcyb == -3) {
                return false;
            }
            throw new IllegalStateException();
        }
        if (this.f23454a.n7h()) {
            this.az = true;
            this.f23455b.zy(this.f23454a);
            this.f23454a = null;
            return false;
        }
        if (this.bg) {
            this.f23458e.m13695k(this.f23454a.f19618s, this.f23463o);
            this.bg = false;
        }
        this.f23454a.m11579i();
        C3297s c3297s = this.f23454a;
        c3297s.f19617q = this.f23463o;
        ch(c3297s);
        this.f23455b.zy(this.f23454a);
        this.am++;
        this.bv = true;
        this.aj.f63555zy++;
        this.f23454a = null;
        return true;
    }

    private void y9n(int i2, int i3) {
        wvg wvgVar = this.ax;
        if (wvgVar != null && wvgVar.f23577k == i2 && wvgVar.f23579q == i3) {
            return;
        }
        wvg wvgVar2 = new wvg(i2, i3);
        this.ax = wvgVar2;
        this.f23456c.jk(wvgVar2);
    }

    private void yz() {
        this.in = true;
        if (this.an) {
            return;
        }
        this.an = true;
        this.f23456c.wvg(this.f67199bo);
    }

    private void zp() {
        bf2();
        m13817b();
    }

    /* JADX INFO: renamed from: c */
    protected abstract InterfaceC3289g<C3297s, ? extends com.google.android.exoplayer2.decoder.kja0, ? extends C3298y> m13821c(xwq3 xwq3Var, @dd com.google.android.exoplayer2.decoder.zy zyVar) throws C3298y;

    protected void ch(C3297s c3297s) {
    }

    /* JADX INFO: renamed from: d */
    protected void m13822d(com.google.android.exoplayer2.decoder.kja0 kja0Var) {
        this.aj.f19557g++;
        kja0Var.cdj();
    }

    @Override // com.google.android.exoplayer2.AbstractC3433g
    protected void d2ok(long j2, boolean z2) throws com.google.android.exoplayer2.ki {
        this.az = false;
        this.ba = false;
        hyr();
        this.bl = C3548p.f65257toq;
        this.ad = 0;
        if (this.f23455b != null) {
            m13823e();
        }
        if (z2) {
            c8jq();
        } else {
            this.as = C3548p.f65257toq;
        }
        this.f23458e.zy();
    }

    @Override // com.google.android.exoplayer2.AbstractC3433g
    protected void dd() {
        this.as = C3548p.f65257toq;
        ek5k();
    }

    @InterfaceC7842s
    /* JADX INFO: renamed from: e */
    protected void m13823e() throws com.google.android.exoplayer2.ki {
        this.am = 0;
        if (this.bp != 0) {
            lv5();
            m13820m();
            return;
        }
        this.f23454a = null;
        com.google.android.exoplayer2.decoder.kja0 kja0Var = this.f23467x;
        if (kja0Var != null) {
            kja0Var.cdj();
            this.f23467x = null;
        }
        this.f23455b.flush();
        this.bv = false;
    }

    @Override // com.google.android.exoplayer2.AbstractC3433g
    protected void eqxt(boolean z2, boolean z3) throws com.google.android.exoplayer2.ki {
        com.google.android.exoplayer2.decoder.f7l8 f7l8Var = new com.google.android.exoplayer2.decoder.f7l8();
        this.aj = f7l8Var;
        this.f23456c.kja0(f7l8Var);
        this.id = z3;
        this.in = false;
    }

    protected final void gyi(@dd Object obj) {
        if (obj instanceof Surface) {
            this.f23465v = (Surface) obj;
            this.f23457d = null;
            this.f23464u = 1;
        } else if (obj instanceof InterfaceC3879p) {
            this.f23465v = null;
            this.f23457d = (InterfaceC3879p) obj;
            this.f23464u = 0;
        } else {
            this.f23465v = null;
            this.f23457d = null;
            this.f23464u = -1;
            obj = null;
        }
        if (this.f67199bo == obj) {
            if (obj != null) {
                zp();
                return;
            }
            return;
        }
        this.f67199bo = obj;
        if (obj == null) {
            m13816a();
            return;
        }
        if (this.f23455b != null) {
            y2(this.f23464u);
        }
        a98o();
    }

    @InterfaceC7842s
    protected void i1(C3865v c3865v) throws com.google.android.exoplayer2.ki {
        this.bg = true;
        xwq3 xwq3Var = (xwq3) C3844k.f7l8(c3865v.f67166toq);
        dr(c3865v.f23348k);
        xwq3 xwq3Var2 = this.f23463o;
        this.f23463o = xwq3Var;
        InterfaceC3289g<C3297s, ? extends com.google.android.exoplayer2.decoder.kja0, ? extends C3298y> interfaceC3289g = this.f23455b;
        if (interfaceC3289g == null) {
            m13820m();
            this.f23456c.m13873h(this.f23463o, null);
            return;
        }
        com.google.android.exoplayer2.decoder.ld6 ld6Var = this.bb != this.f67198ab ? new com.google.android.exoplayer2.decoder.ld6(interfaceC3289g.getName(), xwq3Var2, xwq3Var, 0, 128) : n5r1(interfaceC3289g.getName(), xwq3Var2, xwq3Var);
        if (ld6Var.f19588q == 0) {
            if (this.bv) {
                this.bp = 1;
            } else {
                lv5();
                m13820m();
            }
        }
        this.f23456c.m13873h(this.f23463o, ld6Var);
    }

    protected boolean ikck(long j2, long j3) {
        return hb(j2) && j3 > 100000;
    }

    @Override // com.google.android.exoplayer2.bek6
    public boolean isReady() {
        if (this.f23463o != null && ((d3() || this.f23467x != null) && (this.an || !nn86()))) {
            this.as = C3548p.f65257toq;
            return true;
        }
        if (this.as == C3548p.f65257toq) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.as) {
            return true;
        }
        this.as = C3548p.f65257toq;
        return false;
    }

    @InterfaceC7842s
    protected void lv5() {
        this.f23454a = null;
        this.f23467x = null;
        this.bp = 0;
        this.bv = false;
        this.am = 0;
        InterfaceC3289g<C3297s, ? extends com.google.android.exoplayer2.decoder.kja0, ? extends C3298y> interfaceC3289g = this.f23455b;
        if (interfaceC3289g != null) {
            this.aj.f63554toq++;
            interfaceC3289g.release();
            this.f23456c.x2(this.f23455b.getName());
            this.f23455b = null;
        }
        bo(null);
    }

    protected void mu(int i2) {
        com.google.android.exoplayer2.decoder.f7l8 f7l8Var = this.aj;
        f7l8Var.f63552f7l8 += i2;
        this.ac += i2;
        int i3 = this.ad + i2;
        this.ad = i3;
        f7l8Var.f19563y = Math.max(i3, f7l8Var.f19563y);
        int i4 = this.f23459f;
        if (i4 <= 0 || this.ac < i4) {
            return;
        }
        ek5k();
    }

    protected com.google.android.exoplayer2.decoder.ld6 n5r1(String str, xwq3 xwq3Var, xwq3 xwq3Var2) {
        return new com.google.android.exoplayer2.decoder.ld6(str, xwq3Var, xwq3Var2, 0, 1);
    }

    /* JADX INFO: renamed from: o */
    protected boolean m13824o(long j2) throws com.google.android.exoplayer2.ki {
        int iM12066l = m12066l(j2);
        if (iM12066l == 0) {
            return false;
        }
        this.aj.f19562s++;
        mu(this.am + iM12066l);
        m13823e();
        return true;
    }

    @Override // com.google.android.exoplayer2.AbstractC3433g
    protected void oc() {
        this.f23463o = null;
        m13818f();
        hyr();
        try {
            dr(null);
            lv5();
        } finally {
            this.f23456c.qrj(this.aj);
        }
    }

    @Override // com.google.android.exoplayer2.AbstractC3433g
    /* JADX INFO: renamed from: r */
    protected void mo11400r() {
        this.ac = 0;
        this.bq = SystemClock.elapsedRealtime();
        this.ay = SystemClock.elapsedRealtime() * 1000;
    }

    protected void t8iq(com.google.android.exoplayer2.decoder.kja0 kja0Var, long j2, xwq3 xwq3Var) throws C3298y {
        ld6 ld6Var = this.f23466w;
        if (ld6Var != null) {
            ld6Var.mo12133k(j2, System.nanoTime(), xwq3Var, null);
        }
        this.ay = lrht.v0af(SystemClock.elapsedRealtime() * 1000);
        int i2 = kja0Var.f19578y;
        boolean z2 = i2 == 1 && this.f23465v != null;
        boolean z3 = i2 == 0 && this.f23457d != null;
        if (!z3 && !z2) {
            uv6(kja0Var);
            return;
        }
        y9n(kja0Var.f19574p, kja0Var.f19571h);
        if (z3) {
            this.f23457d.setOutputBuffer(kja0Var);
        } else {
            m13825u(kja0Var, this.f23465v);
        }
        this.ad = 0;
        this.aj.f19559n++;
        yz();
    }

    /* JADX INFO: renamed from: u */
    protected abstract void m13825u(com.google.android.exoplayer2.decoder.kja0 kja0Var, Surface surface) throws C3298y;

    protected void uv6(com.google.android.exoplayer2.decoder.kja0 kja0Var) {
        mu(1);
        kja0Var.cdj();
    }

    /* JADX INFO: renamed from: v */
    protected boolean m13826v(long j2, long j3) {
        return hb(j2);
    }

    @InterfaceC7842s
    /* JADX INFO: renamed from: x */
    protected void m13827x(long j2) {
        this.am--;
    }

    @Override // com.google.android.exoplayer2.AbstractC3433g, com.google.android.exoplayer2.uj2j.toq
    public void x2(int i2, @dd Object obj) throws com.google.android.exoplayer2.ki {
        if (i2 == 1) {
            gyi(obj);
        } else if (i2 == 7) {
            this.f23466w = (ld6) obj;
        } else {
            super.x2(i2, obj);
        }
    }

    @Override // com.google.android.exoplayer2.AbstractC3433g
    protected void x9kr(xwq3[] xwq3VarArr, long j2, long j3) throws com.google.android.exoplayer2.ki {
        this.be = j3;
        super.x9kr(xwq3VarArr, j2, j3);
    }

    protected boolean xwq3(long j2, long j3) {
        return m13819j(j2);
    }

    protected abstract void y2(int i2);

    @Override // com.google.android.exoplayer2.bek6
    public void zurt(long j2, long j3) throws com.google.android.exoplayer2.ki {
        if (this.ba) {
            return;
        }
        if (this.f23463o == null) {
            C3865v c3865vA9 = a9();
            this.f23460j.mo11567s();
            int iNcyb = ncyb(c3865vA9, this.f23460j, 2);
            if (iNcyb != -5) {
                if (iNcyb == -4) {
                    C3844k.m13633s(this.f23460j.n7h());
                    this.az = true;
                    this.ba = true;
                    return;
                }
                return;
            }
            i1(c3865vA9);
        }
        m13820m();
        if (this.f23455b != null) {
            try {
                n5r1.m13686k("drainAndFeed");
                while (lrht(j2, j3)) {
                }
                while (vyq()) {
                }
                n5r1.zy();
                this.aj.zy();
            } catch (C3298y e2) {
                com.google.android.exoplayer2.util.ni7.m13700n(bs, "Video codec error", e2);
                this.f23456c.mcp(e2);
                throw m12067t(e2, this.f23463o, 4003);
            }
        }
    }

    @Override // com.google.android.exoplayer2.bek6
    public boolean zy() {
        return this.ba;
    }
}
