package com.google.android.exoplayer2.source;

import android.net.Uri;
import android.os.Handler;
import com.google.android.exoplayer2.C3548p;
import com.google.android.exoplayer2.C3865v;
import com.google.android.exoplayer2.decoder.C3297s;
import com.google.android.exoplayer2.drm.InterfaceC3312i;
import com.google.android.exoplayer2.extractor.InterfaceC3401t;
import com.google.android.exoplayer2.extractor.o1t;
import com.google.android.exoplayer2.mbx;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.exoplayer2.sok;
import com.google.android.exoplayer2.source.hb;
import com.google.android.exoplayer2.source.jk;
import com.google.android.exoplayer2.source.lvui;
import com.google.android.exoplayer2.source.zurt;
import com.google.android.exoplayer2.trackselection.InterfaceC3715s;
import com.google.android.exoplayer2.upstream.C3794f;
import com.google.android.exoplayer2.upstream.d3;
import com.google.android.exoplayer2.upstream.oc;
import com.google.android.exoplayer2.upstream.t8r;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.C3862y;
import com.google.android.exoplayer2.xwq3;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.f */
/* JADX INFO: compiled from: ProgressiveMediaPeriod.java */
/* JADX INFO: loaded from: classes2.dex */
final class C3594f implements jk, com.google.android.exoplayer2.extractor.x2, oc.toq<k>, oc.InterfaceC3812g, hb.InterfaceC3601q {
    private static final long ba = 10000;

    /* JADX INFO: renamed from: a */
    private boolean f21477a;
    private int as;
    private boolean az;
    private boolean bb;
    private boolean bg;
    private boolean bl;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private n f65370bo;
    private boolean bp;
    private int bv;

    /* JADX INFO: renamed from: g */
    private final com.google.android.exoplayer2.upstream.d3 f21483g;

    /* JADX INFO: renamed from: h */
    private final com.google.android.exoplayer2.upstream.toq f21484h;

    /* JADX INFO: renamed from: i */
    @zy.dd
    private final String f21485i;
    private long id;

    /* JADX INFO: renamed from: j */
    @zy.dd
    private jk.InterfaceC3604k f21486j;

    /* JADX INFO: renamed from: k */
    private final Uri f21487k;

    /* JADX INFO: renamed from: n */
    private final com.google.android.exoplayer2.drm.fn3e f21490n;

    /* JADX INFO: renamed from: o */
    @zy.dd
    private IcyHeaders f21491o;

    /* JADX INFO: renamed from: p */
    private final toq f21492p;

    /* JADX INFO: renamed from: q */
    private final com.google.android.exoplayer2.upstream.kja0 f21493q;

    /* JADX INFO: renamed from: r */
    private final ncyb f21494r;

    /* JADX INFO: renamed from: s */
    private final InterfaceC3312i.k f21495s;

    /* JADX INFO: renamed from: u */
    private boolean f21497u;

    /* JADX INFO: renamed from: v */
    private com.google.android.exoplayer2.extractor.o1t f21498v;

    /* JADX INFO: renamed from: w */
    private boolean f21499w;

    /* JADX INFO: renamed from: x */
    private boolean f21500x;

    /* JADX INFO: renamed from: y */
    private final lvui.C3611k f21501y;

    /* JADX INFO: renamed from: z */
    private final long f21502z;
    private static final Map<String, String> ax = d2ok();
    private static final xwq3 bq = new xwq3.toq().n5r1("icy").m13945m(com.google.android.exoplayer2.util.wvg.f67131qkj8).a9();

    /* JADX INFO: renamed from: t */
    private final com.google.android.exoplayer2.upstream.oc f21496t = new com.google.android.exoplayer2.upstream.oc("ProgressiveMediaPeriod");

    /* JADX INFO: renamed from: l */
    private final C3862y f21488l = new C3862y();

    /* JADX INFO: renamed from: f */
    private final Runnable f21482f = new Runnable() { // from class: com.google.android.exoplayer2.source.l
        @Override // java.lang.Runnable
        public final void run() {
            this.f21567k.hyr();
        }
    };

    /* JADX INFO: renamed from: c */
    private final Runnable f21479c = new Runnable() { // from class: com.google.android.exoplayer2.source.n5r1
        @Override // java.lang.Runnable
        public final void run() {
            this.f21642k.m12696l();
        }
    };

    /* JADX INFO: renamed from: e */
    private final Handler f21481e = com.google.android.exoplayer2.util.lrht.m13676z();

    /* JADX INFO: renamed from: b */
    private q[] f21478b = new q[0];

    /* JADX INFO: renamed from: m */
    private hb[] f21489m = new hb[0];
    private long in = C3548p.f65257toq;
    private long an = -1;

    /* JADX INFO: renamed from: d */
    private long f21480d = C3548p.f65257toq;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private int f65369ab = 1;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.f$k */
    /* JADX INFO: compiled from: ProgressiveMediaPeriod.java */
    final class k implements oc.InterfaceC3814n, zurt.InterfaceC3635k {

        /* JADX INFO: renamed from: g */
        private final C3862y f21503g;

        /* JADX INFO: renamed from: n */
        private final com.google.android.exoplayer2.extractor.x2 f21505n;

        /* JADX INFO: renamed from: n7h, reason: collision with root package name */
        private boolean f65374n7h;

        /* JADX INFO: renamed from: p */
        private long f21506p;

        /* JADX INFO: renamed from: q */
        private final ncyb f21507q;

        /* JADX INFO: renamed from: qrj, reason: collision with root package name */
        @zy.dd
        private InterfaceC3401t f65375qrj;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final Uri f65376toq;

        /* JADX INFO: renamed from: y */
        private volatile boolean f21509y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final C3794f f65378zy;

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private final com.google.android.exoplayer2.extractor.fu4 f65371f7l8 = new com.google.android.exoplayer2.extractor.fu4();

        /* JADX INFO: renamed from: s */
        private boolean f21508s = true;

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        private long f65377x2 = -1;

        /* JADX INFO: renamed from: k */
        private final long f21504k = ni7.m12808k();

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        private com.google.android.exoplayer2.upstream.t8r f65373ld6 = m12707p(0);

        public k(Uri uri, com.google.android.exoplayer2.upstream.kja0 kja0Var, ncyb ncybVar, com.google.android.exoplayer2.extractor.x2 x2Var, C3862y c3862y) {
            this.f65376toq = uri;
            this.f65378zy = new C3794f(kja0Var);
            this.f21507q = ncybVar;
            this.f21505n = x2Var;
            this.f21503g = c3862y;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void ld6(long j2, long j3) {
            this.f65371f7l8.f19818k = j2;
            this.f21506p = j3;
            this.f21508s = true;
            this.f65374n7h = false;
        }

        /* JADX INFO: renamed from: p */
        private com.google.android.exoplayer2.upstream.t8r m12707p(long j2) {
            return new t8r.toq().m13521p(this.f65376toq).m13523s(j2).f7l8(C3594f.this.f21485i).zy(6).m13518g(C3594f.ax).m13519k();
        }

        @Override // com.google.android.exoplayer2.upstream.oc.InterfaceC3814n
        /* JADX INFO: renamed from: k */
        public void mo12654k() throws IOException {
            int qVar = 0;
            while (qVar == 0 && !this.f21509y) {
                try {
                    long j2 = this.f65371f7l8.f19818k;
                    com.google.android.exoplayer2.upstream.t8r t8rVarM12707p = m12707p(j2);
                    this.f65373ld6 = t8rVarM12707p;
                    long jMo7270k = this.f65378zy.mo7270k(t8rVarM12707p);
                    this.f65377x2 = jMo7270k;
                    if (jMo7270k != -1) {
                        this.f65377x2 = jMo7270k + j2;
                    }
                    C3594f.this.f21491o = IcyHeaders.m12292k(this.f65378zy.toq());
                    com.google.android.exoplayer2.upstream.x2 zurtVar = this.f65378zy;
                    if (C3594f.this.f21491o != null && C3594f.this.f21491o.f20768s != -1) {
                        zurtVar = new zurt(this.f65378zy, C3594f.this.f21491o.f20768s, this);
                        InterfaceC3401t interfaceC3401tDd = C3594f.this.dd();
                        this.f65375qrj = interfaceC3401tDd;
                        interfaceC3401tDd.mo11931q(C3594f.bq);
                    }
                    long jMo12772n = j2;
                    this.f21507q.mo12773q(zurtVar, this.f65376toq, this.f65378zy.toq(), j2, this.f65377x2, this.f21505n);
                    if (C3594f.this.f21491o != null) {
                        this.f21507q.zy();
                    }
                    if (this.f21508s) {
                        this.f21507q.mo12771k(jMo12772n, this.f21506p);
                        this.f21508s = false;
                    }
                    while (true) {
                        long j3 = jMo12772n;
                        while (qVar == 0 && !this.f21509y) {
                            try {
                                this.f21503g.m13763k();
                                qVar = this.f21507q.toq(this.f65371f7l8);
                                jMo12772n = this.f21507q.mo12772n();
                                if (jMo12772n > C3594f.this.f21502z + j3) {
                                    break;
                                }
                            } catch (InterruptedException unused) {
                                throw new InterruptedIOException();
                            }
                        }
                        this.f21503g.m13765q();
                        C3594f.this.f21481e.post(C3594f.this.f21479c);
                    }
                    if (qVar == 1) {
                        qVar = 0;
                    } else if (this.f21507q.mo12772n() != -1) {
                        this.f65371f7l8.f19818k = this.f21507q.mo12772n();
                    }
                    com.google.android.exoplayer2.upstream.ki.m13484k(this.f65378zy);
                } catch (Throwable th) {
                    if (qVar != 1 && this.f21507q.mo12772n() != -1) {
                        this.f65371f7l8.f19818k = this.f21507q.mo12772n();
                    }
                    com.google.android.exoplayer2.upstream.ki.m13484k(this.f65378zy);
                    throw th;
                }
            }
        }

        @Override // com.google.android.exoplayer2.source.zurt.InterfaceC3635k
        public void toq(com.google.android.exoplayer2.util.gvn7 gvn7Var) {
            long jMax = !this.f65374n7h ? this.f21506p : Math.max(C3594f.this.m12698r(), this.f21506p);
            int iM13594k = gvn7Var.m13594k();
            InterfaceC3401t interfaceC3401t = (InterfaceC3401t) C3844k.f7l8(this.f65375qrj);
            interfaceC3401t.zy(gvn7Var, iM13594k);
            interfaceC3401t.mo11930n(jMax, 1, iM13594k, 0, null);
            this.f65374n7h = true;
        }

        @Override // com.google.android.exoplayer2.upstream.oc.InterfaceC3814n
        public void zy() {
            this.f21509y = true;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.f$n */
    /* JADX INFO: compiled from: ProgressiveMediaPeriod.java */
    private static final class n {

        /* JADX INFO: renamed from: k */
        public final C3629x f21510k;

        /* JADX INFO: renamed from: q */
        public final boolean[] f21511q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public final boolean[] f65379toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public final boolean[] f65380zy;

        public n(C3629x c3629x, boolean[] zArr) {
            this.f21510k = c3629x;
            this.f65379toq = zArr;
            int i2 = c3629x.f21701k;
            this.f65380zy = new boolean[i2];
            this.f21511q = new boolean[i2];
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.f$q */
    /* JADX INFO: compiled from: ProgressiveMediaPeriod.java */
    private static final class q {

        /* JADX INFO: renamed from: k */
        public final int f21512k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public final boolean f65381toq;

        public q(int i2, boolean z2) {
            this.f21512k = i2;
            this.f65381toq = z2;
        }

        public boolean equals(@zy.dd Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || q.class != obj.getClass()) {
                return false;
            }
            q qVar = (q) obj;
            return this.f21512k == qVar.f21512k && this.f65381toq == qVar.f65381toq;
        }

        public int hashCode() {
            return (this.f21512k * 31) + (this.f65381toq ? 1 : 0);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.f$toq */
    /* JADX INFO: compiled from: ProgressiveMediaPeriod.java */
    interface toq {
        void ld6(long j2, boolean z2, boolean z3);
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.f$zy */
    /* JADX INFO: compiled from: ProgressiveMediaPeriod.java */
    private final class zy implements InterfaceC3603j {

        /* JADX INFO: renamed from: k */
        private final int f21513k;

        public zy(int i2) {
            this.f21513k = i2;
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC3603j
        public int cdj(long j2) {
            return C3594f.this.yz(this.f21513k, j2);
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC3603j
        public boolean isReady() {
            return C3594f.this.ncyb(this.f21513k);
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC3603j
        /* JADX INFO: renamed from: s */
        public int mo12610s(C3865v c3865v, C3297s c3297s, int i2) {
            return C3594f.this.m12702j(this.f21513k, c3865v, c3297s, i2);
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC3603j
        public void toq() throws IOException {
            C3594f.this.uv6(this.f21513k);
        }
    }

    public C3594f(Uri uri, com.google.android.exoplayer2.upstream.kja0 kja0Var, ncyb ncybVar, com.google.android.exoplayer2.drm.fn3e fn3eVar, InterfaceC3312i.k kVar, com.google.android.exoplayer2.upstream.d3 d3Var, lvui.C3611k c3611k, toq toqVar, com.google.android.exoplayer2.upstream.toq toqVar2, @zy.dd String str, int i2) {
        this.f21487k = uri;
        this.f21493q = kja0Var;
        this.f21490n = fn3eVar;
        this.f21495s = kVar;
        this.f21483g = d3Var;
        this.f21501y = c3611k;
        this.f21492p = toqVar;
        this.f21484h = toqVar2;
        this.f21485i = str;
        this.f21502z = i2;
        this.f21494r = ncybVar;
    }

    /* JADX INFO: renamed from: b */
    private boolean m12693b() {
        return this.bp || x9kr();
    }

    /* JADX INFO: renamed from: c */
    private void m12694c(int i2) {
        d3();
        boolean[] zArr = this.f65370bo.f65379toq;
        if (this.bl && zArr[i2]) {
            if (this.f21489m[i2].d2ok(false)) {
                return;
            }
            this.in = 0L;
            this.bl = false;
            this.bp = true;
            this.id = 0L;
            this.as = 0;
            for (hb hbVar : this.f21489m) {
                hbVar.lrht();
            }
            ((jk.InterfaceC3604k) C3844k.f7l8(this.f21486j)).mo12411y(this);
        }
    }

    private static Map<String, String> d2ok() {
        HashMap map = new HashMap();
        map.put(IcyHeaders.f20763p, "1");
        return Collections.unmodifiableMap(map);
    }

    @EnsuresNonNull({"trackState", "seekMap"})
    private void d3() {
        C3844k.m13633s(this.f21500x);
        C3844k.f7l8(this.f65370bo);
        C3844k.f7l8(this.f21498v);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ek5k, reason: merged with bridge method [inline-methods] */
    public void n5r1(com.google.android.exoplayer2.extractor.o1t o1tVar) {
        this.f21498v = this.f21491o == null ? o1tVar : new o1t.toq(C3548p.f65257toq);
        this.f21480d = o1tVar.mo11755s();
        boolean z2 = this.an == -1 && o1tVar.mo11755s() == C3548p.f65257toq;
        this.f21499w = z2;
        this.f65369ab = z2 ? 7 : 1;
        this.f21492p.ld6(this.f21480d, o1tVar.f7l8(), this.f21499w);
        if (this.f21500x) {
            return;
        }
        hyr();
    }

    private void eqxt(k kVar) {
        if (this.an == -1) {
            this.an = kVar.f65377x2;
        }
    }

    /* JADX INFO: renamed from: f */
    private void m12695f(int i2) {
        d3();
        n nVar = this.f65370bo;
        boolean[] zArr = nVar.f21511q;
        if (zArr[i2]) {
            return;
        }
        xwq3 qVar = nVar.f21510k.toq(i2).toq(0);
        this.f21501y.m12763s(com.google.android.exoplayer2.util.wvg.x2(qVar.f23682r), qVar, 0, null, this.id);
        zArr[i2] = true;
    }

    private InterfaceC3401t hb(q qVar) {
        int length = this.f21489m.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (qVar.equals(this.f21478b[i2])) {
                return this.f21489m[i2];
            }
        }
        hb hbVarLd6 = hb.ld6(this.f21484h, this.f21481e.getLooper(), this.f21490n, this.f21495s);
        hbVarLd6.m12732m(this);
        int i3 = length + 1;
        q[] qVarArr = (q[]) Arrays.copyOf(this.f21478b, i3);
        qVarArr[length] = qVar;
        this.f21478b = (q[]) com.google.android.exoplayer2.util.lrht.x2(qVarArr);
        hb[] hbVarArr = (hb[]) Arrays.copyOf(this.f21489m, i3);
        hbVarArr[length] = hbVarLd6;
        this.f21489m = (hb[]) com.google.android.exoplayer2.util.lrht.x2(hbVarArr);
        return hbVarLd6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hyr() {
        if (this.az || this.f21500x || !this.f21477a || this.f21498v == null) {
            return;
        }
        for (hb hbVar : this.f21489m) {
            if (hbVar.jp0y() == null) {
                return;
            }
        }
        this.f21488l.m13765q();
        int length = this.f21489m.length;
        C3564a[] c3564aArr = new C3564a[length];
        boolean[] zArr = new boolean[length];
        for (int i2 = 0; i2 < length; i2++) {
            xwq3 xwq3VarA9 = (xwq3) C3844k.f7l8(this.f21489m[i2].jp0y());
            String str = xwq3VarA9.f23682r;
            boolean zM13744h = com.google.android.exoplayer2.util.wvg.m13744h(str);
            boolean z2 = zM13744h || com.google.android.exoplayer2.util.wvg.m13745i(str);
            zArr[i2] = z2;
            this.f21497u = z2 | this.f21497u;
            IcyHeaders icyHeaders = this.f21491o;
            if (icyHeaders != null) {
                if (zM13744h || this.f21478b[i2].f65381toq) {
                    Metadata metadata = xwq3VarA9.f23690z;
                    xwq3VarA9 = xwq3VarA9.toq().uv6(metadata == null ? new Metadata(icyHeaders) : metadata.m12283k(icyHeaders)).a9();
                }
                if (zM13744h && xwq3VarA9.f23683s == -1 && xwq3VarA9.f23680p == -1 && icyHeaders.f20765k != -1) {
                    xwq3VarA9 = xwq3VarA9.toq().jp0y(icyHeaders.f20765k).a9();
                }
            }
            c3564aArr[i2] = new C3564a(xwq3VarA9.m13925q(this.f21490n.toq(xwq3VarA9)));
        }
        this.f65370bo = new n(new C3629x(c3564aArr), zArr);
        this.f21500x = true;
        ((jk.InterfaceC3604k) C3844k.f7l8(this.f21486j)).ld6(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public /* synthetic */ void m12696l() {
        if (this.az) {
            return;
        }
        ((jk.InterfaceC3604k) C3844k.f7l8(this.f21486j)).mo12411y(this);
    }

    private int lvui() {
        int iGvn7 = 0;
        for (hb hbVar : this.f21489m) {
            iGvn7 += hbVar.gvn7();
        }
        return iGvn7;
    }

    /* JADX INFO: renamed from: m */
    private boolean m12697m(boolean[] zArr, long j2) {
        int length = this.f21489m.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (!this.f21489m[i2].nn86(j2, false) && (zArr[i2] || !this.f21497u)) {
                return false;
            }
        }
        return true;
    }

    private boolean oc(k kVar, int i2) {
        com.google.android.exoplayer2.extractor.o1t o1tVar;
        if (this.an != -1 || ((o1tVar = this.f21498v) != null && o1tVar.mo11755s() != C3548p.f65257toq)) {
            this.as = i2;
            return true;
        }
        if (this.f21500x && !m12693b()) {
            this.bl = true;
            return false;
        }
        this.bp = this.f21500x;
        this.id = 0L;
        this.as = 0;
        for (hb hbVar : this.f21489m) {
            hbVar.lrht();
        }
        kVar.ld6(0L, 0L);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public long m12698r() {
        long jMax = Long.MIN_VALUE;
        for (hb hbVar : this.f21489m) {
            jMax = Math.max(jMax, hbVar.wvg());
        }
        return jMax;
    }

    private boolean x9kr() {
        return this.in != C3548p.f65257toq;
    }

    private void y9n() {
        k kVar = new k(this.f21487k, this.f21493q, this.f21494r, this, this.f21488l);
        if (this.f21500x) {
            C3844k.m13633s(x9kr());
            long j2 = this.f21480d;
            if (j2 != C3548p.f65257toq && this.in > j2) {
                this.bg = true;
                this.in = C3548p.f65257toq;
                return;
            }
            kVar.ld6(((com.google.android.exoplayer2.extractor.o1t) C3844k.f7l8(this.f21498v)).mo11754n(this.in).f20107k.f64719toq, this.in);
            for (hb hbVar : this.f21489m) {
                hbVar.m12730j(this.in);
            }
            this.in = C3548p.f65257toq;
        }
        this.as = lvui();
        this.f21501y.wvg(new ni7(kVar.f21504k, kVar.f65373ld6, this.f21496t.n7h(kVar, this, this.f21483g.toq(this.f65369ab))), 1, -1, null, 0, null, kVar.f21506p, this.f21480d);
    }

    @Override // com.google.android.exoplayer2.extractor.x2
    public void cdj(final com.google.android.exoplayer2.extractor.o1t o1tVar) {
        this.f21481e.post(new Runnable() { // from class: com.google.android.exoplayer2.source.hyr
            @Override // java.lang.Runnable
            public final void run() {
                this.f21551k.n5r1(o1tVar);
            }
        });
    }

    InterfaceC3401t dd() {
        return hb(new q(0, true));
    }

    @Override // com.google.android.exoplayer2.upstream.oc.toq
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void ld6(k kVar, long j2, long j3) {
        com.google.android.exoplayer2.extractor.o1t o1tVar;
        if (this.f21480d == C3548p.f65257toq && (o1tVar = this.f21498v) != null) {
            boolean zF7l8 = o1tVar.f7l8();
            long jM12698r = m12698r();
            long j4 = jM12698r == Long.MIN_VALUE ? 0L : jM12698r + ba;
            this.f21480d = j4;
            this.f21492p.ld6(j4, zF7l8, this.f21499w);
        }
        C3794f c3794f = kVar.f65378zy;
        ni7 ni7Var = new ni7(kVar.f21504k, kVar.f65373ld6, c3794f.ni7(), c3794f.fu4(), j2, j3, c3794f.zurt());
        this.f21483g.m13458q(kVar.f21504k);
        this.f21501y.fn3e(ni7Var, 1, -1, null, 0, null, kVar.f21506p, this.f21480d);
        eqxt(kVar);
        this.bg = true;
        ((jk.InterfaceC3604k) C3844k.f7l8(this.f21486j)).mo12411y(this);
    }

    @Override // com.google.android.exoplayer2.source.jk, com.google.android.exoplayer2.source.InterfaceC3622o
    public void f7l8(long j2) {
    }

    @Override // com.google.android.exoplayer2.source.jk
    public C3629x fn3e() {
        d3();
        return this.f65370bo.f21510k;
    }

    @Override // com.google.android.exoplayer2.source.jk, com.google.android.exoplayer2.source.InterfaceC3622o
    /* JADX INFO: renamed from: g */
    public long mo12595g() {
        long jM12698r;
        d3();
        boolean[] zArr = this.f65370bo.f65379toq;
        if (this.bg) {
            return Long.MIN_VALUE;
        }
        if (x9kr()) {
            return this.in;
        }
        if (this.f21497u) {
            int length = this.f21489m.length;
            jM12698r = Long.MAX_VALUE;
            for (int i2 = 0; i2 < length; i2++) {
                if (zArr[i2] && !this.f21489m[i2].eqxt()) {
                    jM12698r = Math.min(jM12698r, this.f21489m[i2].wvg());
                }
            }
        } else {
            jM12698r = Long.MAX_VALUE;
        }
        if (jM12698r == Long.MAX_VALUE) {
            jM12698r = m12698r();
        }
        return jM12698r == Long.MIN_VALUE ? this.id : jM12698r;
    }

    @Override // com.google.android.exoplayer2.extractor.x2
    /* JADX INFO: renamed from: i */
    public void mo11753i() {
        this.f21477a = true;
        this.f21481e.post(this.f21482f);
    }

    /* JADX INFO: renamed from: j */
    int m12702j(int i2, C3865v c3865v, C3297s c3297s, int i3) {
        if (m12693b()) {
            return -3;
        }
        m12695f(i2);
        int iHyr = this.f21489m[i2].hyr(c3865v, c3297s, i3, this.bg);
        if (iHyr == -3) {
            m12694c(i2);
        }
        return iHyr;
    }

    @Override // com.google.android.exoplayer2.source.jk, com.google.android.exoplayer2.source.InterfaceC3622o
    /* JADX INFO: renamed from: k */
    public boolean mo12596k() {
        return this.f21496t.ld6() && this.f21488l.m13764n();
    }

    @Override // com.google.android.exoplayer2.upstream.oc.InterfaceC3812g
    public void ki() {
        for (hb hbVar : this.f21489m) {
            hbVar.m12728f();
        }
        this.f21494r.release();
    }

    @Override // com.google.android.exoplayer2.source.jk
    public long kja0(InterfaceC3715s[] interfaceC3715sArr, boolean[] zArr, InterfaceC3603j[] interfaceC3603jArr, boolean[] zArr2, long j2) {
        InterfaceC3715s interfaceC3715s;
        d3();
        n nVar = this.f65370bo;
        C3629x c3629x = nVar.f21510k;
        boolean[] zArr3 = nVar.f65380zy;
        int i2 = this.bv;
        int i3 = 0;
        for (int i4 = 0; i4 < interfaceC3715sArr.length; i4++) {
            InterfaceC3603j interfaceC3603j = interfaceC3603jArr[i4];
            if (interfaceC3603j != null && (interfaceC3715sArr[i4] == null || !zArr[i4])) {
                int i5 = ((zy) interfaceC3603j).f21513k;
                C3844k.m13633s(zArr3[i5]);
                this.bv--;
                zArr3[i5] = false;
                interfaceC3603jArr[i4] = null;
            }
        }
        boolean z2 = !this.bb ? j2 == 0 : i2 != 0;
        for (int i6 = 0; i6 < interfaceC3715sArr.length; i6++) {
            if (interfaceC3603jArr[i6] == null && (interfaceC3715s = interfaceC3715sArr[i6]) != null) {
                C3844k.m13633s(interfaceC3715s.length() == 1);
                C3844k.m13633s(interfaceC3715s.mo13148y(0) == 0);
                int iZy = c3629x.zy(interfaceC3715s.qrj());
                C3844k.m13633s(!zArr3[iZy]);
                this.bv++;
                zArr3[iZy] = true;
                interfaceC3603jArr[i6] = new zy(iZy);
                zArr2[i6] = true;
                if (!z2) {
                    hb hbVar = this.f21489m[iZy];
                    z2 = (hbVar.nn86(j2, true) || hbVar.jk() == 0) ? false : true;
                }
            }
        }
        if (this.bv == 0) {
            this.bl = false;
            this.bp = false;
            if (this.f21496t.ld6()) {
                hb[] hbVarArr = this.f21489m;
                int length = hbVarArr.length;
                while (i3 < length) {
                    hbVarArr[i3].ki();
                    i3++;
                }
                this.f21496t.f7l8();
            } else {
                hb[] hbVarArr2 = this.f21489m;
                int length2 = hbVarArr2.length;
                while (i3 < length2) {
                    hbVarArr2[i3].lrht();
                    i3++;
                }
            }
        } else if (z2) {
            j2 = x2(j2);
            while (i3 < interfaceC3603jArr.length) {
                if (interfaceC3603jArr[i3] != null) {
                    zArr2[i3] = true;
                }
                i3++;
            }
        }
        this.bb = true;
        return j2;
    }

    void lrht() throws IOException {
        this.f21496t.mo13460k(this.f21483g.toq(this.f65369ab));
    }

    @Override // com.google.android.exoplayer2.source.jk, com.google.android.exoplayer2.source.InterfaceC3622o
    /* JADX INFO: renamed from: n */
    public boolean mo12597n(long j2) {
        if (this.bg || this.f21496t.m13501p() || this.bl) {
            return false;
        }
        if (this.f21500x && this.bv == 0) {
            return false;
        }
        boolean zM13762g = this.f21488l.m13762g();
        if (this.f21496t.ld6()) {
            return zM13762g;
        }
        y9n();
        return true;
    }

    @Override // com.google.android.exoplayer2.source.jk
    public void n7h(jk.InterfaceC3604k interfaceC3604k, long j2) {
        this.f21486j = interfaceC3604k;
        this.f21488l.m13762g();
        y9n();
    }

    boolean ncyb(int i2) {
        return !m12693b() && this.f21489m[i2].d2ok(this.bg);
    }

    @Override // com.google.android.exoplayer2.upstream.oc.toq
    /* JADX INFO: renamed from: nn86, reason: merged with bridge method [inline-methods] */
    public oc.zy mo12667h(k kVar, long j2, long j3, IOException iOException, int i2) {
        boolean z2;
        k kVar2;
        oc.zy zyVarM13500s;
        eqxt(kVar);
        C3794f c3794f = kVar.f65378zy;
        ni7 ni7Var = new ni7(kVar.f21504k, kVar.f65373ld6, c3794f.ni7(), c3794f.fu4(), j2, j3, c3794f.zurt());
        long jMo13457k = this.f21483g.mo13457k(new d3.C3791q(ni7Var, new wvg(1, -1, null, 0, null, com.google.android.exoplayer2.util.lrht.zwy(kVar.f21506p), com.google.android.exoplayer2.util.lrht.zwy(this.f21480d)), iOException, i2));
        if (jMo13457k == C3548p.f65257toq) {
            zyVarM13500s = com.google.android.exoplayer2.upstream.oc.f66892x2;
        } else {
            int iLvui = lvui();
            if (iLvui > this.as) {
                kVar2 = kVar;
                z2 = true;
            } else {
                z2 = false;
                kVar2 = kVar;
            }
            zyVarM13500s = oc(kVar2, iLvui) ? com.google.android.exoplayer2.upstream.oc.m13500s(z2, jMo13457k) : com.google.android.exoplayer2.upstream.oc.f66891ld6;
        }
        boolean z3 = !zyVarM13500s.zy();
        this.f21501y.ni7(ni7Var, 1, -1, null, 0, null, kVar.f21506p, this.f21480d, iOException, z3);
        if (z3) {
            this.f21483g.m13458q(kVar.f21504k);
        }
        return zyVarM13500s;
    }

    /* JADX INFO: renamed from: o */
    public void m12703o() {
        if (this.f21500x) {
            for (hb hbVar : this.f21489m) {
                hbVar.n5r1();
            }
        }
        this.f21496t.qrj(this);
        this.f21481e.removeCallbacksAndMessages(null);
        this.f21486j = null;
        this.az = true;
    }

    @Override // com.google.android.exoplayer2.source.jk
    /* JADX INFO: renamed from: q */
    public long mo12599q(long j2, mbx mbxVar) {
        d3();
        if (!this.f21498v.f7l8()) {
            return 0L;
        }
        o1t.C3388k c3388kMo11754n = this.f21498v.mo11754n(j2);
        return mbxVar.m12188k(j2, c3388kMo11754n.f20107k.f20458k, c3388kMo11754n.f64331toq.f20458k);
    }

    @Override // com.google.android.exoplayer2.source.jk
    public long qrj() {
        if (!this.bp) {
            return C3548p.f65257toq;
        }
        if (!this.bg && lvui() <= this.as) {
            return C3548p.f65257toq;
        }
        this.bp = false;
        return this.id;
    }

    @Override // com.google.android.exoplayer2.source.hb.InterfaceC3601q
    /* JADX INFO: renamed from: s */
    public void mo12704s(xwq3 xwq3Var) {
        this.f21481e.post(this.f21482f);
    }

    @Override // com.google.android.exoplayer2.source.jk
    public void t8r() throws IOException {
        lrht();
        if (this.bg && !this.f21500x) {
            throw sok.createForMalformedContainer("Loading finished before preparation is complete.", null);
        }
    }

    @Override // com.google.android.exoplayer2.extractor.x2
    public InterfaceC3401t toq(int i2, int i3) {
        return hb(new q(i2, false));
    }

    void uv6(int i2) throws IOException {
        this.f21489m[i2].dd();
        lrht();
    }

    @Override // com.google.android.exoplayer2.upstream.oc.toq
    /* JADX INFO: renamed from: vyq, reason: merged with bridge method [inline-methods] */
    public void mo12670y(k kVar, long j2, long j3, boolean z2) {
        C3794f c3794f = kVar.f65378zy;
        ni7 ni7Var = new ni7(kVar.f21504k, kVar.f65373ld6, c3794f.ni7(), c3794f.fu4(), j2, j3, c3794f.zurt());
        this.f21483g.m13458q(kVar.f21504k);
        this.f21501y.ki(ni7Var, 1, -1, null, 0, null, kVar.f21506p, this.f21480d);
        if (z2) {
            return;
        }
        eqxt(kVar);
        for (hb hbVar : this.f21489m) {
            hbVar.lrht();
        }
        if (this.bv > 0) {
            ((jk.InterfaceC3604k) C3844k.f7l8(this.f21486j)).mo12411y(this);
        }
    }

    @Override // com.google.android.exoplayer2.source.jk
    public long x2(long j2) {
        d3();
        boolean[] zArr = this.f65370bo.f65379toq;
        if (!this.f21498v.f7l8()) {
            j2 = 0;
        }
        int i2 = 0;
        this.bp = false;
        this.id = j2;
        if (x9kr()) {
            this.in = j2;
            return j2;
        }
        if (this.f65369ab != 7 && m12697m(zArr, j2)) {
            return j2;
        }
        this.bl = false;
        this.in = j2;
        this.bg = false;
        if (this.f21496t.ld6()) {
            hb[] hbVarArr = this.f21489m;
            int length = hbVarArr.length;
            while (i2 < length) {
                hbVarArr[i2].ki();
                i2++;
            }
            this.f21496t.f7l8();
        } else {
            this.f21496t.m13502y();
            hb[] hbVarArr2 = this.f21489m;
            int length2 = hbVarArr2.length;
            while (i2 < length2) {
                hbVarArr2[i2].lrht();
                i2++;
            }
        }
        return j2;
    }

    int yz(int i2, long j2) {
        if (m12693b()) {
            return 0;
        }
        m12695f(i2);
        hb hbVar = this.f21489m[i2];
        int iFti = hbVar.fti(j2, this.bg);
        hbVar.ek5k(iFti);
        if (iFti == 0) {
            m12694c(i2);
        }
        return iFti;
    }

    @Override // com.google.android.exoplayer2.source.jk
    public void zurt(long j2, boolean z2) {
        d3();
        if (x9kr()) {
            return;
        }
        boolean[] zArr = this.f65370bo.f65380zy;
        int length = this.f21489m.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.f21489m[i2].cdj(j2, z2, zArr[i2]);
        }
    }

    @Override // com.google.android.exoplayer2.source.jk, com.google.android.exoplayer2.source.InterfaceC3622o
    public long zy() {
        if (this.bv == 0) {
            return Long.MIN_VALUE;
        }
        return mo12595g();
    }
}
