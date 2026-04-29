package com.google.android.exoplayer2;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import com.google.android.exoplayer2.audio.C3248g;
import com.google.android.exoplayer2.gc3c;
import com.google.android.exoplayer2.m4;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.pc;
import com.google.android.exoplayer2.source.C3629x;
import com.google.android.exoplayer2.source.InterfaceC3612m;
import com.google.android.exoplayer2.source.InterfaceC3626r;
import com.google.android.exoplayer2.source.fti;
import com.google.android.exoplayer2.t8r;
import com.google.android.exoplayer2.trackselection.C3707i;
import com.google.android.exoplayer2.trackselection.InterfaceC3715s;
import com.google.android.exoplayer2.uj2j;
import com.google.android.exoplayer2.upstream.InterfaceC3808n;
import com.google.android.exoplayer2.util.C3839h;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.InterfaceC3850n;
import com.google.android.exoplayer2.util.zurt;
import com.google.android.exoplayer2.y2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: ExoPlayerImpl.java */
/* JADX INFO: loaded from: classes2.dex */
final class lv5 extends AbstractC3518n {

    /* JADX INFO: renamed from: yl, reason: collision with root package name */
    private static final String f64877yl = "ExoPlayerImpl";

    /* JADX INFO: renamed from: b3e, reason: collision with root package name */
    private was f64878b3e;

    /* JADX INFO: renamed from: bek6, reason: collision with root package name */
    private was f64879bek6;

    /* JADX INFO: renamed from: bwp, reason: collision with root package name */
    private int f64880bwp;

    /* JADX INFO: renamed from: bz2, reason: collision with root package name */
    private mbx f64881bz2;

    /* JADX INFO: renamed from: cfr, reason: collision with root package name */
    private final long f64882cfr;

    /* JADX INFO: renamed from: cv06, reason: collision with root package name */
    private was f64883cv06;

    /* JADX INFO: renamed from: d8wk, reason: collision with root package name */
    private final com.google.android.exoplayer2.util.ki f64884d8wk;

    /* JADX INFO: renamed from: etdu, reason: collision with root package name */
    private final InterfaceC3808n f64885etdu;

    /* JADX INFO: renamed from: fnq8, reason: collision with root package name */
    final com.google.android.exoplayer2.trackselection.ni7 f64886fnq8;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    private final y2.InterfaceC3902g f64887g1;

    /* JADX INFO: renamed from: gbni, reason: collision with root package name */
    private final com.google.android.exoplayer2.util.zurt<gc3c.InterfaceC3434g> f64888gbni;

    /* JADX INFO: renamed from: gc3c, reason: collision with root package name */
    private int f64889gc3c;

    /* JADX INFO: renamed from: h7am, reason: collision with root package name */
    private kcsr f64890h7am;

    /* JADX INFO: renamed from: i9jn, reason: collision with root package name */
    private final List<C3453k> f64891i9jn;

    /* JADX INFO: renamed from: jbh, reason: collision with root package name */
    private long f64892jbh;

    /* JADX INFO: renamed from: jz5, reason: collision with root package name */
    private boolean f64893jz5;

    /* JADX INFO: renamed from: kcsr, reason: collision with root package name */
    private int f64894kcsr;

    /* JADX INFO: renamed from: ktq, reason: collision with root package name */
    private gc3c.zy f64895ktq;

    /* JADX INFO: renamed from: ltg8, reason: collision with root package name */
    private final boolean f64896ltg8;

    /* JADX INFO: renamed from: m4, reason: collision with root package name */
    @zy.dd
    private final com.google.android.exoplayer2.analytics.zp f64897m4;

    /* JADX INFO: renamed from: mbx, reason: collision with root package name */
    private int f64898mbx;

    /* JADX INFO: renamed from: py, reason: collision with root package name */
    private final pc.toq f64899py;

    /* JADX INFO: renamed from: qo, reason: collision with root package name */
    final gc3c.zy f64900qo;

    /* JADX INFO: renamed from: r8s8, reason: collision with root package name */
    private final InterfaceC3626r f64901r8s8;

    /* JADX INFO: renamed from: se, reason: collision with root package name */
    private boolean f64902se;

    /* JADX INFO: renamed from: sok, reason: collision with root package name */
    private final long f64903sok;

    /* JADX INFO: renamed from: tfm, reason: collision with root package name */
    private final bek6[] f64904tfm;

    /* JADX INFO: renamed from: uj2j, reason: collision with root package name */
    private InterfaceC3612m f64905uj2j;

    /* JADX INFO: renamed from: v0af, reason: collision with root package name */
    private final Looper f64906v0af;

    /* JADX INFO: renamed from: vep5, reason: collision with root package name */
    private int f64907vep5;

    /* JADX INFO: renamed from: w831, reason: collision with root package name */
    private final InterfaceC3850n f64908w831;

    /* JADX INFO: renamed from: was, reason: collision with root package name */
    private final y2 f64909was;

    /* JADX INFO: renamed from: wo, reason: collision with root package name */
    private final com.google.android.exoplayer2.trackselection.zurt f64910wo;

    /* JADX INFO: renamed from: yqrt, reason: collision with root package name */
    private boolean f64911yqrt;

    /* JADX INFO: renamed from: z4, reason: collision with root package name */
    private int f64912z4;

    /* JADX INFO: renamed from: zkd, reason: collision with root package name */
    private boolean f64913zkd;

    /* JADX INFO: renamed from: zsr0, reason: collision with root package name */
    private final CopyOnWriteArraySet<t8r.toq> f64914zsr0;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.lv5$k */
    /* JADX INFO: compiled from: ExoPlayerImpl.java */
    private static final class C3453k implements ltg8 {

        /* JADX INFO: renamed from: k */
        private final Object f20620k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private pc f64915toq;

        public C3453k(Object obj, pc pcVar) {
            this.f20620k = obj;
            this.f64915toq = pcVar;
        }

        @Override // com.google.android.exoplayer2.ltg8
        /* JADX INFO: renamed from: k */
        public Object mo12171k() {
            return this.f20620k;
        }

        @Override // com.google.android.exoplayer2.ltg8
        public pc toq() {
            return this.f64915toq;
        }
    }

    static {
        c8jq.m11556k("goog.exo.exoplayer");
    }

    @SuppressLint({"HandlerLeak"})
    public lv5(bek6[] bek6VarArr, com.google.android.exoplayer2.trackselection.zurt zurtVar, InterfaceC3626r interfaceC3626r, fnq8 fnq8Var, InterfaceC3808n interfaceC3808n, @zy.dd com.google.android.exoplayer2.analytics.zp zpVar, boolean z2, mbx mbxVar, long j2, long j3, qkj8 qkj8Var, long j4, boolean z3, InterfaceC3850n interfaceC3850n, Looper looper, @zy.dd gc3c gc3cVar, gc3c.zy zyVar) {
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str = com.google.android.exoplayer2.util.lrht.f23231n;
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 30 + String.valueOf(str).length());
        sb.append("Init ");
        sb.append(hexString);
        sb.append(" [");
        sb.append(c8jq.f63544zy);
        sb.append("] [");
        sb.append(str);
        sb.append("]");
        com.google.android.exoplayer2.util.ni7.m13704y(f64877yl, sb.toString());
        C3844k.m13633s(bek6VarArr.length > 0);
        this.f64904tfm = (bek6[]) C3844k.f7l8(bek6VarArr);
        this.f64910wo = (com.google.android.exoplayer2.trackselection.zurt) C3844k.f7l8(zurtVar);
        this.f64901r8s8 = interfaceC3626r;
        this.f64885etdu = interfaceC3808n;
        this.f64897m4 = zpVar;
        this.f64896ltg8 = z2;
        this.f64881bz2 = mbxVar;
        this.f64903sok = j2;
        this.f64882cfr = j3;
        this.f64893jz5 = z3;
        this.f64906v0af = looper;
        this.f64908w831 = interfaceC3850n;
        this.f64912z4 = 0;
        final gc3c gc3cVar2 = gc3cVar != null ? gc3cVar : this;
        this.f64888gbni = new com.google.android.exoplayer2.util.zurt<>(looper, interfaceC3850n, new zurt.toq() { // from class: com.google.android.exoplayer2.y9n
            @Override // com.google.android.exoplayer2.util.zurt.toq
            /* JADX INFO: renamed from: k */
            public final void mo11290k(Object obj, C3839h c3839h) {
                lv5.z4j7(gc3cVar2, (gc3c.InterfaceC3434g) obj, c3839h);
            }
        });
        this.f64914zsr0 = new CopyOnWriteArraySet<>();
        this.f64891i9jn = new ArrayList();
        this.f64905uj2j = new InterfaceC3612m.k(0);
        com.google.android.exoplayer2.trackselection.ni7 ni7Var = new com.google.android.exoplayer2.trackselection.ni7(new h7am[bek6VarArr.length], new InterfaceC3715s[bek6VarArr.length], pjz9.f21162q, null);
        this.f64886fnq8 = ni7Var;
        this.f64899py = new pc.toq();
        gc3c.zy zyVarM12104g = new gc3c.zy.C3441k().zy(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 20, 30).m12106n(29, zurtVar.mo13093n()).toq(zyVar).m12104g();
        this.f64900qo = zyVarM12104g;
        this.f64895ktq = new gc3c.zy.C3441k().toq(zyVarM12104g).m12105k(4).m12105k(10).m12104g();
        was wasVar = was.xk5;
        this.f64878b3e = wasVar;
        this.f64879bek6 = wasVar;
        this.f64883cv06 = wasVar;
        this.f64907vep5 = -1;
        this.f64884d8wk = interfaceC3850n.zy(looper, null);
        y2.InterfaceC3902g interfaceC3902g = new y2.InterfaceC3902g() { // from class: com.google.android.exoplayer2.b
            @Override // com.google.android.exoplayer2.y2.InterfaceC3902g
            /* JADX INFO: renamed from: k */
            public final void mo11545k(y2.C3904n c3904n) {
                this.f19524k.kt06(c3904n);
            }
        };
        this.f64887g1 = interfaceC3902g;
        this.f64890h7am = kcsr.ld6(ni7Var);
        if (zpVar != null) {
            zpVar.kz28(gc3cVar2, looper);
            ngy(zpVar);
            interfaceC3808n.f7l8(new Handler(looper), zpVar);
        }
        this.f64909was = new y2(bek6VarArr, zurtVar, ni7Var, fnq8Var, interfaceC3808n, this.f64912z4, this.f64911yqrt, zpVar, mbxVar, qkj8Var, j4, z3, looper, interfaceC3850n, interfaceC3902g);
    }

    @zy.dd
    private Pair<Object, Long> ab(pc pcVar, pc pcVar2) {
        long jN2t = n2t();
        if (pcVar.ni7() || pcVar2.ni7()) {
            boolean z2 = !pcVar.ni7() && pcVar2.ni7();
            int iWtop = z2 ? -1 : wtop();
            if (z2) {
                jN2t = -9223372036854775807L;
            }
            return c25(pcVar2, iWtop, jN2t);
        }
        Pair<Object, Long> pairN7h = pcVar.n7h(this.f65002qkj8, this.f64899py, lw(), com.google.android.exoplayer2.util.lrht.v0af(jN2t));
        Object obj = ((Pair) com.google.android.exoplayer2.util.lrht.ld6(pairN7h)).first;
        if (pcVar2.mo12147g(obj) != -1) {
            return pairN7h;
        }
        Object objM13966v = y2.m13966v(this.f65002qkj8, this.f64899py, this.f64912z4, this.f64911yqrt, obj, pcVar, pcVar2);
        if (objM13966v == null) {
            return c25(pcVar2, -1, C3548p.f65257toq);
        }
        pcVar2.x2(objM13966v, this.f64899py);
        int i2 = this.f64899py.f21151n;
        return c25(pcVar2, i2, pcVar2.m12484i(i2, this.f65002qkj8).m12489n());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void anhx(kcsr kcsrVar, gc3c.InterfaceC3434g interfaceC3434g) {
        interfaceC3434g.ld6(kcsrVar.f20588n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b2(kcsr kcsrVar, gc3c.InterfaceC3434g interfaceC3434g) {
        interfaceC3434g.mo11373q(kcsrVar.f64849n7h);
    }

    @zy.dd
    private Pair<Object, Long> c25(pc pcVar, int i2, long j2) {
        if (pcVar.ni7()) {
            this.f64907vep5 = i2;
            if (j2 == C3548p.f65257toq) {
                j2 = 0;
            }
            this.f64892jbh = j2;
            this.f64898mbx = 0;
            return null;
        }
        if (i2 == -1 || i2 >= pcVar.zurt()) {
            i2 = pcVar.mo12148n(this.f64911yqrt);
            j2 = pcVar.m12484i(i2, this.f65002qkj8).m12489n();
        }
        return pcVar.n7h(this.f65002qkj8, this.f64899py, i2, com.google.android.exoplayer2.util.lrht.v0af(j2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d1ts(gc3c.InterfaceC3434g interfaceC3434g) {
        interfaceC3434g.x2(this.f64878b3e);
    }

    private void erbd() {
        gc3c.zy zyVar = this.f64895ktq;
        gc3c.zy zyVarBih = bih(this.f64900qo);
        this.f64895ktq = zyVarBih;
        if (zyVarBih.equals(zyVar)) {
            return;
        }
        this.f64888gbni.m13772y(13, new zurt.InterfaceC3864k() { // from class: com.google.android.exoplayer2.ek5k
            @Override // com.google.android.exoplayer2.util.zurt.InterfaceC3864k
            public final void invoke(Object obj) {
                this.f19728k.zuf((gc3c.InterfaceC3434g) obj);
            }
        });
    }

    private gc3c.x2 f3f(int i2, kcsr kcsrVar, int i3) {
        int i4;
        int iMo12147g;
        Object obj;
        tfm tfmVar;
        Object obj2;
        long jI3x9;
        long jI3x92;
        pc.toq toqVar = new pc.toq();
        if (kcsrVar.f20587k.ni7()) {
            i4 = i3;
            iMo12147g = -1;
            obj = null;
            tfmVar = null;
            obj2 = null;
        } else {
            Object obj3 = kcsrVar.f64852toq.f21225k;
            kcsrVar.f20587k.x2(obj3, toqVar);
            int i5 = toqVar.f21151n;
            i4 = i5;
            obj2 = obj3;
            iMo12147g = kcsrVar.f20587k.mo12147g(obj3);
            obj = kcsrVar.f20587k.m12484i(i5, this.f65002qkj8).f21133k;
            tfmVar = this.f65002qkj8.f21135n;
        }
        if (i2 == 0) {
            jI3x9 = toqVar.f21155y + toqVar.f21149g;
            if (kcsrVar.f64852toq.zy()) {
                fti.C3596k c3596k = kcsrVar.f64852toq;
                jI3x9 = toqVar.m12498n(c3596k.f65325toq, c3596k.f65326zy);
                jI3x92 = i3x9(kcsrVar);
            } else {
                if (kcsrVar.f64852toq.f21226n != -1 && this.f64890h7am.f64852toq.zy()) {
                    jI3x9 = i3x9(this.f64890h7am);
                }
                jI3x92 = jI3x9;
            }
        } else if (kcsrVar.f64852toq.zy()) {
            jI3x9 = kcsrVar.f64851t8r;
            jI3x92 = i3x9(kcsrVar);
        } else {
            jI3x9 = toqVar.f21155y + kcsrVar.f64851t8r;
            jI3x92 = jI3x9;
        }
        long jZwy = com.google.android.exoplayer2.util.lrht.zwy(jI3x9);
        long jZwy2 = com.google.android.exoplayer2.util.lrht.zwy(jI3x92);
        fti.C3596k c3596k2 = kcsrVar.f64852toq;
        return new gc3c.x2(obj, i4, tfmVar, obj2, iMo12147g, jZwy, jZwy2, c3596k2.f65325toq, c3596k2.f65326zy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void fh(kcsr kcsrVar, gc3c.InterfaceC3434g interfaceC3434g) {
        interfaceC3434g.jk(kcsrVar.f64845f7l8);
        interfaceC3434g.fn3e(kcsrVar.f64845f7l8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void ge(kcsr kcsrVar, gc3c.InterfaceC3434g interfaceC3434g) {
        interfaceC3434g.mo11365g(kcsrVar.f64850qrj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void i1an(gc3c.InterfaceC3434g interfaceC3434g) {
        interfaceC3434g.ni7(ki.createForUnexpected(new gyi(1), 1003));
    }

    private static long i3x9(kcsr kcsrVar) {
        pc.C3550q c3550q = new pc.C3550q();
        pc.toq toqVar = new pc.toq();
        kcsrVar.f20587k.x2(kcsrVar.f64852toq.f21225k, toqVar);
        return kcsrVar.f64854zy == C3548p.f65257toq ? kcsrVar.f20587k.m12484i(toqVar.f21151n, c3550q).m12488g() : toqVar.ki() + kcsrVar.f64854zy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void j3y2(kcsr kcsrVar, int i2, gc3c.InterfaceC3434g interfaceC3434g) {
        interfaceC3434g.wvg(kcsrVar.f64853x2, i2);
    }

    private void k4jz(List<com.google.android.exoplayer2.source.fti> list, int i2, long j2, boolean z2) {
        int i3;
        long j3;
        int iWtop = wtop();
        long currentPosition = getCurrentPosition();
        this.f64894kcsr++;
        if (!this.f64891i9jn.isEmpty()) {
            m28(0, this.f64891i9jn.size());
        }
        List<m4.zy> listXblq = xblq(0, list);
        pc pcVarXtb7 = xtb7();
        if (!pcVarXtb7.ni7() && i2 >= pcVarXtb7.zurt()) {
            throw new vq(pcVarXtb7, i2, j2);
        }
        if (z2) {
            int iMo12148n = pcVarXtb7.mo12148n(this.f64911yqrt);
            j3 = C3548p.f65257toq;
            i3 = iMo12148n;
        } else if (i2 == -1) {
            i3 = iWtop;
            j3 = currentPosition;
        } else {
            i3 = i2;
            j3 = j2;
        }
        kcsr kcsrVarZ8 = z8(this.f64890h7am, pcVarXtb7, c25(pcVarXtb7, i3, j3));
        int i4 = kcsrVarZ8.f20588n;
        if (i3 != -1 && i4 != 1) {
            i4 = (pcVarXtb7.ni7() || i3 >= pcVarXtb7.zurt()) ? 4 : 2;
        }
        kcsr kcsrVarM12156y = kcsrVarZ8.m12156y(i4);
        this.f64909was.py(listXblq, i3, com.google.android.exoplayer2.util.lrht.v0af(j3), this.f64905uj2j);
        zxq(kcsrVarM12156y, 0, 1, false, (this.f64890h7am.f64852toq.f21225k.equals(kcsrVarM12156y.f64852toq.f21225k) || this.f64890h7am.f20587k.ni7()) ? false : true, 4, xzl(kcsrVarM12156y), -1);
    }

    private kcsr kjd(int i2, int i3) {
        boolean z2 = false;
        C3844k.m13629k(i2 >= 0 && i3 >= i2 && i3 <= this.f64891i9jn.size());
        int iLw = lw();
        pc pcVarD8wk = d8wk();
        int size = this.f64891i9jn.size();
        this.f64894kcsr++;
        m28(i2, i3);
        pc pcVarXtb7 = xtb7();
        kcsr kcsrVarZ8 = z8(this.f64890h7am, pcVarXtb7, ab(pcVarD8wk, pcVarXtb7));
        int i4 = kcsrVarZ8.f20588n;
        if (i4 != 1 && i4 != 4 && i2 < i3 && i3 == size && iLw >= kcsrVarZ8.f20587k.zurt()) {
            z2 = true;
        }
        if (z2) {
            kcsrVarZ8 = kcsrVarZ8.m12156y(4);
        }
        this.f64909was.ch(i2, i3, this.f64905uj2j);
        return kcsrVarZ8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void kl7m(kcsr kcsrVar, gc3c.InterfaceC3434g interfaceC3434g) {
        interfaceC3434g.ki(kcsrVar.f20585g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void kq(kcsr kcsrVar, gc3c.InterfaceC3434g interfaceC3434g) {
        interfaceC3434g.mo6500m(kcsrVar.f64853x2, kcsrVar.f20588n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void kt06(final y2.C3904n c3904n) {
        this.f64884d8wk.ld6(new Runnable() { // from class: com.google.android.exoplayer2.l
            @Override // java.lang.Runnable
            public final void run() {
                this.f20599k.kz28(c3904n);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void le7(kcsr kcsrVar, com.google.android.exoplayer2.trackselection.kja0 kja0Var, gc3c.InterfaceC3434g interfaceC3434g) {
        interfaceC3434g.n5r1(kcsrVar.f20592y, kja0Var);
    }

    private void m28(int i2, int i3) {
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            this.f64891i9jn.remove(i4);
        }
        this.f64905uj2j = this.f64905uj2j.mo12767k(i2, i3);
    }

    private long mete(pc pcVar, fti.C3596k c3596k, long j2) {
        pcVar.x2(c3596k.f21225k, this.f64899py);
        return j2 + this.f64899py.ki();
    }

    private List<com.google.android.exoplayer2.source.fti> mi1u(List<tfm> list) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            arrayList.add(this.f64901r8s8.zy(list.get(i2)));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void mub(kcsr kcsrVar, gc3c.InterfaceC3434g interfaceC3434g) {
        interfaceC3434g.mo11377y(kcsrVar.f20591s.f22337q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: nyj, reason: merged with bridge method [inline-methods] */
    public void kz28(y2.C3904n c3904n) {
        long j2;
        boolean z2;
        long jMete;
        int i2 = this.f64894kcsr - c3904n.f67300zy;
        this.f64894kcsr = i2;
        boolean z3 = true;
        if (c3904n.f23741q) {
            this.f64880bwp = c3904n.f23740n;
            this.f64902se = true;
        }
        if (c3904n.f23738g) {
            this.f64889gc3c = c3904n.f67298f7l8;
        }
        if (i2 == 0) {
            pc pcVar = c3904n.f67299toq.f20587k;
            if (!this.f64890h7am.f20587k.ni7() && pcVar.ni7()) {
                this.f64907vep5 = -1;
                this.f64892jbh = 0L;
                this.f64898mbx = 0;
            }
            if (!pcVar.ni7()) {
                List<pc> listLvui = ((jz5) pcVar).lvui();
                C3844k.m13633s(listLvui.size() == this.f64891i9jn.size());
                for (int i3 = 0; i3 < listLvui.size(); i3++) {
                    this.f64891i9jn.get(i3).f64915toq = listLvui.get(i3);
                }
            }
            if (this.f64902se) {
                if (c3904n.f67299toq.f64852toq.equals(this.f64890h7am.f64852toq) && c3904n.f67299toq.f20590q == this.f64890h7am.f64851t8r) {
                    z3 = false;
                }
                if (z3) {
                    if (pcVar.ni7() || c3904n.f67299toq.f64852toq.zy()) {
                        jMete = c3904n.f67299toq.f20590q;
                    } else {
                        kcsr kcsrVar = c3904n.f67299toq;
                        jMete = mete(pcVar, kcsrVar.f64852toq, kcsrVar.f20590q);
                    }
                    j2 = jMete;
                } else {
                    j2 = -9223372036854775807L;
                }
                z2 = z3;
            } else {
                j2 = -9223372036854775807L;
                z2 = false;
            }
            this.f64902se = false;
            zxq(c3904n.f67299toq, 1, this.f64889gc3c, false, z2, this.f64880bwp, j2, -1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void oph(kcsr kcsrVar, gc3c.InterfaceC3434g interfaceC3434g) {
        interfaceC3434g.ni7(kcsrVar.f20585g);
    }

    private was pnt2() {
        tfm tfmVarMo12086l = mo12086l();
        return tfmVarMo12086l == null ? this.f64883cv06 : this.f64883cv06.toq().d3(tfmVarMo12086l.f22152y).jp0y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void sc(int i2, gc3c.x2 x2Var, gc3c.x2 x2Var2, gc3c.InterfaceC3434g interfaceC3434g) {
        interfaceC3434g.uv6(i2);
        interfaceC3434g.mo11370n(x2Var, x2Var2, i2);
    }

    private gc3c.x2 tjz5(long j2) {
        int iMo12147g;
        tfm tfmVar;
        Object obj;
        int iLw = lw();
        Object obj2 = null;
        if (this.f64890h7am.f20587k.ni7()) {
            iMo12147g = -1;
            tfmVar = null;
            obj = null;
        } else {
            kcsr kcsrVar = this.f64890h7am;
            Object obj3 = kcsrVar.f64852toq.f21225k;
            kcsrVar.f20587k.x2(obj3, this.f64899py);
            iMo12147g = this.f64890h7am.f20587k.mo12147g(obj3);
            obj = obj3;
            obj2 = this.f64890h7am.f20587k.m12484i(iLw, this.f65002qkj8).f21133k;
            tfmVar = this.f65002qkj8.f21135n;
        }
        long jZwy = com.google.android.exoplayer2.util.lrht.zwy(j2);
        long jZwy2 = this.f64890h7am.f64852toq.zy() ? com.google.android.exoplayer2.util.lrht.zwy(i3x9(this.f64890h7am)) : jZwy;
        fti.C3596k c3596k = this.f64890h7am.f64852toq;
        return new gc3c.x2(obj2, iLw, tfmVar, obj, iMo12147g, jZwy, jZwy2, c3596k.f65325toq, c3596k.f65326zy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void uo(gc3c.InterfaceC3434g interfaceC3434g) {
        interfaceC3434g.mo11375t(this.f64879bek6);
    }

    private static boolean vss1(kcsr kcsrVar) {
        return kcsrVar.f20588n == 3 && kcsrVar.f64853x2 && kcsrVar.f64850qrj == 0;
    }

    private Pair<Boolean, Integer> vwb(kcsr kcsrVar, kcsr kcsrVar2, boolean z2, int i2, boolean z3) {
        pc pcVar = kcsrVar2.f20587k;
        pc pcVar2 = kcsrVar.f20587k;
        if (pcVar2.ni7() && pcVar.ni7()) {
            return new Pair<>(Boolean.FALSE, -1);
        }
        int i3 = 3;
        if (pcVar2.ni7() != pcVar.ni7()) {
            return new Pair<>(Boolean.TRUE, 3);
        }
        if (pcVar.m12484i(pcVar.x2(kcsrVar2.f64852toq.f21225k, this.f64899py).f21151n, this.f65002qkj8).f21133k.equals(pcVar2.m12484i(pcVar2.x2(kcsrVar.f64852toq.f21225k, this.f64899py).f21151n, this.f65002qkj8).f21133k)) {
            return (z2 && i2 == 0 && kcsrVar2.f64852toq.f21227q < kcsrVar.f64852toq.f21227q) ? new Pair<>(Boolean.TRUE, 0) : new Pair<>(Boolean.FALSE, -1);
        }
        if (z2 && i2 == 0) {
            i3 = 1;
        } else if (z2 && i2 == 1) {
            i3 = 2;
        } else if (!z3) {
            throw new IllegalStateException();
        }
        return new Pair<>(Boolean.TRUE, Integer.valueOf(i3));
    }

    private int wtop() {
        if (this.f64890h7am.f20587k.ni7()) {
            return this.f64907vep5;
        }
        kcsr kcsrVar = this.f64890h7am;
        return kcsrVar.f20587k.x2(kcsrVar.f64852toq.f21225k, this.f64899py).f21151n;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void x7o(kcsr kcsrVar, int i2, gc3c.InterfaceC3434g interfaceC3434g) {
        interfaceC3434g.mo11372p(kcsrVar.f20587k, i2);
    }

    private List<m4.zy> xblq(int i2, List<com.google.android.exoplayer2.source.fti> list) {
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < list.size(); i3++) {
            m4.zy zyVar = new m4.zy(list.get(i3), this.f64896ltg8);
            arrayList.add(zyVar);
            this.f64891i9jn.add(i3 + i2, new C3453k(zyVar.f64923toq, zyVar.f20635k.m12811f()));
        }
        this.f64905uj2j = this.f64905uj2j.f7l8(i2, arrayList.size());
        return arrayList;
    }

    private pc xtb7() {
        return new jz5(this.f64891i9jn, this.f64905uj2j);
    }

    private long xzl(kcsr kcsrVar) {
        return kcsrVar.f20587k.ni7() ? com.google.android.exoplayer2.util.lrht.v0af(this.f64892jbh) : kcsrVar.f64852toq.zy() ? kcsrVar.f64851t8r : mete(kcsrVar.f20587k, kcsrVar.f64852toq, kcsrVar.f64851t8r);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void z4j7(gc3c gc3cVar, gc3c.InterfaceC3434g interfaceC3434g, C3839h c3839h) {
        interfaceC3434g.fu4(gc3cVar, new gc3c.f7l8(c3839h));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void z5(kcsr kcsrVar, gc3c.InterfaceC3434g interfaceC3434g) {
        interfaceC3434g.mcp(vss1(kcsrVar));
    }

    private kcsr z8(kcsr kcsrVar, pc pcVar, @zy.dd Pair<Object, Long> pair) {
        C3844k.m13629k(pcVar.ni7() || pair != null);
        pc pcVar2 = kcsrVar.f20587k;
        kcsr kcsrVarM12153p = kcsrVar.m12153p(pcVar);
        if (pcVar.ni7()) {
            fti.C3596k c3596kX2 = kcsr.x2();
            long jV0af = com.google.android.exoplayer2.util.lrht.v0af(this.f64892jbh);
            kcsr qVar = kcsrVarM12153p.zy(c3596kX2, jV0af, jV0af, jV0af, 0L, C3629x.f21698g, this.f64886fnq8, com.google.common.collect.se.of()).toq(c3596kX2);
            qVar.f64844cdj = qVar.f64851t8r;
            return qVar;
        }
        Object obj = kcsrVarM12153p.f64852toq.f21225k;
        boolean z2 = !obj.equals(((Pair) com.google.android.exoplayer2.util.lrht.ld6(pair)).first);
        fti.C3596k c3596k = z2 ? new fti.C3596k(pair.first) : kcsrVarM12153p.f64852toq;
        long jLongValue = ((Long) pair.second).longValue();
        long jV0af2 = com.google.android.exoplayer2.util.lrht.v0af(n2t());
        if (!pcVar2.ni7()) {
            jV0af2 -= pcVar2.x2(obj, this.f64899py).ki();
        }
        if (z2 || jLongValue < jV0af2) {
            C3844k.m13633s(!c3596k.zy());
            kcsr qVar2 = kcsrVarM12153p.zy(c3596k, jLongValue, jLongValue, jLongValue, 0L, z2 ? C3629x.f21698g : kcsrVarM12153p.f20592y, z2 ? this.f64886fnq8 : kcsrVarM12153p.f20591s, z2 ? com.google.common.collect.se.of() : kcsrVarM12153p.f20589p).toq(c3596k);
            qVar2.f64844cdj = jLongValue;
            return qVar2;
        }
        if (jLongValue == jV0af2) {
            int iMo12147g = pcVar.mo12147g(kcsrVarM12153p.f64848ld6.f21225k);
            if (iMo12147g == -1 || pcVar.m12485p(iMo12147g, this.f64899py).f21151n != pcVar.x2(c3596k.f21225k, this.f64899py).f21151n) {
                pcVar.x2(c3596k.f21225k, this.f64899py);
                long jM12498n = c3596k.zy() ? this.f64899py.m12498n(c3596k.f65325toq, c3596k.f65326zy) : this.f64899py.f21149g;
                kcsrVarM12153p = kcsrVarM12153p.zy(c3596k, kcsrVarM12153p.f64851t8r, kcsrVarM12153p.f64851t8r, kcsrVarM12153p.f20590q, jM12498n - kcsrVarM12153p.f64851t8r, kcsrVarM12153p.f20592y, kcsrVarM12153p.f20591s, kcsrVarM12153p.f20589p).toq(c3596k);
                kcsrVarM12153p.f64844cdj = jM12498n;
            }
        } else {
            C3844k.m13633s(!c3596k.zy());
            long jMax = Math.max(0L, kcsrVarM12153p.f64846ki - (jLongValue - jV0af2));
            long j2 = kcsrVarM12153p.f64844cdj;
            if (kcsrVarM12153p.f64848ld6.equals(kcsrVarM12153p.f64852toq)) {
                j2 = jLongValue + jMax;
            }
            kcsrVarM12153p = kcsrVarM12153p.zy(c3596k, jLongValue, jLongValue, jLongValue, jMax, kcsrVarM12153p.f20592y, kcsrVarM12153p.f20591s, kcsrVarM12153p.f20589p);
            kcsrVarM12153p.f64844cdj = j2;
        }
        return kcsrVarM12153p;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void zuf(gc3c.InterfaceC3434g interfaceC3434g) {
        interfaceC3434g.mo11374s(this.f64895ktq);
    }

    private void zxq(final kcsr kcsrVar, final int i2, final int i3, boolean z2, boolean z3, final int i4, long j2, int i5) {
        kcsr kcsrVar2 = this.f64890h7am;
        this.f64890h7am = kcsrVar;
        Pair<Boolean, Integer> pairVwb = vwb(kcsrVar, kcsrVar2, z3, i4, !kcsrVar2.f20587k.equals(kcsrVar.f20587k));
        boolean zBooleanValue = ((Boolean) pairVwb.first).booleanValue();
        final int iIntValue = ((Integer) pairVwb.second).intValue();
        was wasVarPnt2 = this.f64878b3e;
        final tfm tfmVar = null;
        if (zBooleanValue) {
            if (!kcsrVar.f20587k.ni7()) {
                tfmVar = kcsrVar.f20587k.m12484i(kcsrVar.f20587k.x2(kcsrVar.f64852toq.f21225k, this.f64899py).f21151n, this.f65002qkj8).f21135n;
            }
            this.f64883cv06 = was.xk5;
        }
        if (zBooleanValue || !kcsrVar2.f20589p.equals(kcsrVar.f20589p)) {
            this.f64883cv06 = this.f64883cv06.toq().eqxt(kcsrVar.f20589p).jp0y();
            wasVarPnt2 = pnt2();
        }
        boolean z5 = !wasVarPnt2.equals(this.f64878b3e);
        this.f64878b3e = wasVarPnt2;
        if (!kcsrVar2.f20587k.equals(kcsrVar.f20587k)) {
            this.f64888gbni.m13772y(0, new zurt.InterfaceC3864k() { // from class: com.google.android.exoplayer2.i1
                @Override // com.google.android.exoplayer2.util.zurt.InterfaceC3864k
                public final void invoke(Object obj) {
                    lv5.x7o(kcsrVar, i2, (gc3c.InterfaceC3434g) obj);
                }
            });
        }
        if (z3) {
            final gc3c.x2 x2VarF3f = f3f(i4, kcsrVar2, i5);
            final gc3c.x2 x2VarTjz5 = tjz5(j2);
            this.f64888gbni.m13772y(11, new zurt.InterfaceC3864k() { // from class: com.google.android.exoplayer2.n5r1
                @Override // com.google.android.exoplayer2.util.zurt.InterfaceC3864k
                public final void invoke(Object obj) {
                    lv5.sc(i4, x2VarF3f, x2VarTjz5, (gc3c.InterfaceC3434g) obj);
                }
            });
        }
        if (zBooleanValue) {
            this.f64888gbni.m13772y(1, new zurt.InterfaceC3864k() { // from class: com.google.android.exoplayer2.hyr
                @Override // com.google.android.exoplayer2.util.zurt.InterfaceC3864k
                public final void invoke(Object obj) {
                    ((gc3c.InterfaceC3434g) obj).o1t(tfmVar, iIntValue);
                }
            });
        }
        if (kcsrVar2.f20585g != kcsrVar.f20585g) {
            this.f64888gbni.m13772y(10, new zurt.InterfaceC3864k() { // from class: com.google.android.exoplayer2.f
                @Override // com.google.android.exoplayer2.util.zurt.InterfaceC3864k
                public final void invoke(Object obj) {
                    lv5.kl7m(kcsrVar, (gc3c.InterfaceC3434g) obj);
                }
            });
            if (kcsrVar.f20585g != null) {
                this.f64888gbni.m13772y(10, new zurt.InterfaceC3864k() { // from class: com.google.android.exoplayer2.c
                    @Override // com.google.android.exoplayer2.util.zurt.InterfaceC3864k
                    public final void invoke(Object obj) {
                        lv5.oph(kcsrVar, (gc3c.InterfaceC3434g) obj);
                    }
                });
            }
        }
        com.google.android.exoplayer2.trackselection.ni7 ni7Var = kcsrVar2.f20591s;
        com.google.android.exoplayer2.trackselection.ni7 ni7Var2 = kcsrVar.f20591s;
        if (ni7Var != ni7Var2) {
            this.f64910wo.mo13140g(ni7Var2.f22336n);
            final com.google.android.exoplayer2.trackselection.kja0 kja0Var = new com.google.android.exoplayer2.trackselection.kja0(kcsrVar.f20591s.f66061zy);
            this.f64888gbni.m13772y(2, new zurt.InterfaceC3864k() { // from class: com.google.android.exoplayer2.lrht
                @Override // com.google.android.exoplayer2.util.zurt.InterfaceC3864k
                public final void invoke(Object obj) {
                    lv5.le7(kcsrVar, kja0Var, (gc3c.InterfaceC3434g) obj);
                }
            });
            this.f64888gbni.m13772y(2, new zurt.InterfaceC3864k() { // from class: com.google.android.exoplayer2.uv6
                @Override // com.google.android.exoplayer2.util.zurt.InterfaceC3864k
                public final void invoke(Object obj) {
                    lv5.mub(kcsrVar, (gc3c.InterfaceC3434g) obj);
                }
            });
        }
        if (z5) {
            final was wasVar = this.f64878b3e;
            this.f64888gbni.m13772y(14, new zurt.InterfaceC3864k() { // from class: com.google.android.exoplayer2.vyq
                @Override // com.google.android.exoplayer2.util.zurt.InterfaceC3864k
                public final void invoke(Object obj) {
                    ((gc3c.InterfaceC3434g) obj).x2(wasVar);
                }
            });
        }
        if (kcsrVar2.f64845f7l8 != kcsrVar.f64845f7l8) {
            this.f64888gbni.m13772y(3, new zurt.InterfaceC3864k() { // from class: com.google.android.exoplayer2.e
                @Override // com.google.android.exoplayer2.util.zurt.InterfaceC3864k
                public final void invoke(Object obj) {
                    lv5.fh(kcsrVar, (gc3c.InterfaceC3434g) obj);
                }
            });
        }
        if (kcsrVar2.f20588n != kcsrVar.f20588n || kcsrVar2.f64853x2 != kcsrVar.f64853x2) {
            this.f64888gbni.m13772y(-1, new zurt.InterfaceC3864k() { // from class: com.google.android.exoplayer2.nn86
                @Override // com.google.android.exoplayer2.util.zurt.InterfaceC3864k
                public final void invoke(Object obj) {
                    lv5.kq(kcsrVar, (gc3c.InterfaceC3434g) obj);
                }
            });
        }
        if (kcsrVar2.f20588n != kcsrVar.f20588n) {
            this.f64888gbni.m13772y(4, new zurt.InterfaceC3864k() { // from class: com.google.android.exoplayer2.a98o
                @Override // com.google.android.exoplayer2.util.zurt.InterfaceC3864k
                public final void invoke(Object obj) {
                    lv5.anhx(kcsrVar, (gc3c.InterfaceC3434g) obj);
                }
            });
        }
        if (kcsrVar2.f64853x2 != kcsrVar.f64853x2) {
            this.f64888gbni.m13772y(5, new zurt.InterfaceC3864k() { // from class: com.google.android.exoplayer2.a
                @Override // com.google.android.exoplayer2.util.zurt.InterfaceC3864k
                public final void invoke(Object obj) {
                    lv5.j3y2(kcsrVar, i3, (gc3c.InterfaceC3434g) obj);
                }
            });
        }
        if (kcsrVar2.f64850qrj != kcsrVar.f64850qrj) {
            this.f64888gbni.m13772y(6, new zurt.InterfaceC3864k() { // from class: com.google.android.exoplayer2.zp
                @Override // com.google.android.exoplayer2.util.zurt.InterfaceC3864k
                public final void invoke(Object obj) {
                    lv5.ge(kcsrVar, (gc3c.InterfaceC3434g) obj);
                }
            });
        }
        if (vss1(kcsrVar2) != vss1(kcsrVar)) {
            this.f64888gbni.m13772y(7, new zurt.InterfaceC3864k() { // from class: com.google.android.exoplayer2.x
                @Override // com.google.android.exoplayer2.util.zurt.InterfaceC3864k
                public final void invoke(Object obj) {
                    lv5.z5(kcsrVar, (gc3c.InterfaceC3434g) obj);
                }
            });
        }
        if (!kcsrVar2.f64849n7h.equals(kcsrVar.f64849n7h)) {
            this.f64888gbni.m13772y(12, new zurt.InterfaceC3864k() { // from class: com.google.android.exoplayer2.ch
                @Override // com.google.android.exoplayer2.util.zurt.InterfaceC3864k
                public final void invoke(Object obj) {
                    lv5.b2(kcsrVar, (gc3c.InterfaceC3434g) obj);
                }
            });
        }
        if (z2) {
            this.f64888gbni.m13772y(-1, new zurt.InterfaceC3864k() { // from class: com.google.android.exoplayer2.nmn5
                @Override // com.google.android.exoplayer2.util.zurt.InterfaceC3864k
                public final void invoke(Object obj) {
                    ((gc3c.InterfaceC3434g) obj).mo11364e();
                }
            });
        }
        erbd();
        this.f64888gbni.m13768n();
        if (kcsrVar2.f64847kja0 != kcsrVar.f64847kja0) {
            Iterator<t8r.toq> it = this.f64914zsr0.iterator();
            while (it.hasNext()) {
                it.next().m12834b(kcsrVar.f64847kja0);
            }
        }
        if (kcsrVar2.f20586h != kcsrVar.f20586h) {
            Iterator<t8r.toq> it2 = this.f64914zsr0.iterator();
            while (it2.hasNext()) {
                it2.next().eqxt(kcsrVar.f20586h);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m12172a(List<com.google.android.exoplayer2.source.fti> list) {
        c8jq(list, true);
    }

    public boolean a5id() {
        return this.f64890h7am.f20586h;
    }

    @Override // com.google.android.exoplayer2.gc3c
    public void a9(@zy.dd TextureView textureView) {
    }

    @Override // com.google.android.exoplayer2.gc3c
    public void b8(int i2, int i3, int i4) {
        C3844k.m13629k(i2 >= 0 && i2 <= i3 && i3 <= this.f64891i9jn.size() && i4 >= 0);
        pc pcVarD8wk = d8wk();
        this.f64894kcsr++;
        int iMin = Math.min(i4, this.f64891i9jn.size() - (i3 - i2));
        com.google.android.exoplayer2.util.lrht.m4(this.f64891i9jn, i2, i3, iMin);
        pc pcVarXtb7 = xtb7();
        kcsr kcsrVarZ8 = z8(this.f64890h7am, pcVarXtb7, ab(pcVarD8wk, pcVarXtb7));
        this.f64909was.ek5k(i2, i3, iMin, this.f64905uj2j);
        zxq(kcsrVarZ8, 0, 1, false, false, 5, C3548p.f65257toq, -1);
    }

    @Override // com.google.android.exoplayer2.gc3c
    @Deprecated
    public void bwp(boolean z2) {
        nc(z2, null);
    }

    @Override // com.google.android.exoplayer2.gc3c
    public long bz2() {
        return C3548p.f65176gcp;
    }

    public void c8jq(List<com.google.android.exoplayer2.source.fti> list, boolean z2) {
        k4jz(list, -1, C3548p.f65257toq, z2);
    }

    @Override // com.google.android.exoplayer2.gc3c
    public void cfr(int i2, long j2) {
        pc pcVar = this.f64890h7am.f20587k;
        if (i2 < 0 || (!pcVar.ni7() && i2 >= pcVar.zurt())) {
            throw new vq(pcVar, i2, j2);
        }
        this.f64894kcsr++;
        if (mo12088r()) {
            com.google.android.exoplayer2.util.ni7.qrj(f64877yl, "seekTo ignored because an ad is playing");
            y2.C3904n c3904n = new y2.C3904n(this.f64890h7am);
            c3904n.toq(1);
            this.f64887g1.mo11545k(c3904n);
            return;
        }
        int i3 = getPlaybackState() != 1 ? 2 : 1;
        int iLw = lw();
        kcsr kcsrVarZ8 = z8(this.f64890h7am.m12156y(i3), pcVar, c25(pcVar, i2, j2));
        this.f64909was.m13970d(pcVar, i2, com.google.android.exoplayer2.util.lrht.v0af(j2));
        zxq(kcsrVarZ8, 0, 1, true, true, 1, xzl(kcsrVarZ8), iLw);
    }

    @Override // com.google.android.exoplayer2.gc3c
    public void d3() {
    }

    @Override // com.google.android.exoplayer2.gc3c
    public pc d8wk() {
        return this.f64890h7am.f20587k;
    }

    public Looper dxef() {
        return this.f64909was.mcp();
    }

    @Override // com.google.android.exoplayer2.gc3c
    /* JADX INFO: renamed from: e */
    public void mo12081e(gc3c.InterfaceC3440y interfaceC3440y) {
        zma(interfaceC3440y);
    }

    @Override // com.google.android.exoplayer2.gc3c
    public was e5() {
        return this.f64879bek6;
    }

    @Override // com.google.android.exoplayer2.gc3c
    public void ebn(List<tfm> list, int i2, long j2) {
        qkj8(mi1u(list), i2, j2);
    }

    @Override // com.google.android.exoplayer2.gc3c
    public boolean eqxt() {
        return false;
    }

    public boolean etdu() {
        return this.f64893jz5;
    }

    public uj2j ew(uj2j.toq toqVar) {
        return new uj2j(this.f64909was, toqVar, this.f64890h7am.f20587k, lw(), this.f64908w831, this.f64909was.mcp());
    }

    /* JADX INFO: renamed from: f */
    public void m12173f(com.google.android.exoplayer2.source.fti ftiVar) {
        mbx(Collections.singletonList(ftiVar));
    }

    @Override // com.google.android.exoplayer2.gc3c
    public se f7l8() {
        return this.f64890h7am.f64849n7h;
    }

    @Override // com.google.android.exoplayer2.gc3c
    public com.google.android.exoplayer2.video.wvg fti() {
        return com.google.android.exoplayer2.video.wvg.f23568i;
    }

    @Override // com.google.android.exoplayer2.gc3c
    public void fu4(@zy.dd SurfaceHolder surfaceHolder) {
    }

    @Override // com.google.android.exoplayer2.gc3c
    public Looper g1() {
        return this.f64906v0af;
    }

    @Override // com.google.android.exoplayer2.gc3c
    public void ga(final C3707i c3707i) {
        if (!this.f64910wo.mo13093n() || c3707i.equals(this.f64910wo.toq())) {
            return;
        }
        this.f64910wo.mo13094y(c3707i);
        this.f64888gbni.m13772y(19, new zurt.InterfaceC3864k() { // from class: com.google.android.exoplayer2.m
            @Override // com.google.android.exoplayer2.util.zurt.InterfaceC3864k
            public final void invoke(Object obj) {
                ((gc3c.InterfaceC3434g) obj).mo12096f(c3707i);
            }
        });
    }

    @Override // com.google.android.exoplayer2.gc3c
    public C3707i gbni() {
        return this.f64910wo.toq();
    }

    public int gc3c() {
        return this.f64904tfm.length;
    }

    @Override // com.google.android.exoplayer2.gc3c
    public long getCurrentPosition() {
        return com.google.android.exoplayer2.util.lrht.zwy(xzl(this.f64890h7am));
    }

    @Override // com.google.android.exoplayer2.gc3c
    public long getDuration() {
        if (!mo12088r()) {
            return jz5();
        }
        kcsr kcsrVar = this.f64890h7am;
        fti.C3596k c3596k = kcsrVar.f64852toq;
        kcsrVar.f20587k.x2(c3596k.f21225k, this.f64899py);
        return com.google.android.exoplayer2.util.lrht.zwy(this.f64899py.m12498n(c3596k.f65325toq, c3596k.f65326zy));
    }

    @Override // com.google.android.exoplayer2.gc3c
    public int getPlaybackState() {
        return this.f64890h7am.f20588n;
    }

    @Override // com.google.android.exoplayer2.gc3c
    public int getRepeatMode() {
        return this.f64912z4;
    }

    @Override // com.google.android.exoplayer2.gc3c
    public C3443h gvn7() {
        return C3443h.f20541s;
    }

    public void gyi(boolean z2) {
        this.f64909was.zurt(z2);
    }

    @Override // com.google.android.exoplayer2.gc3c
    /* JADX INFO: renamed from: h */
    public void mo12082h(@zy.dd SurfaceView surfaceView) {
    }

    @Override // com.google.android.exoplayer2.gc3c
    public long h4b() {
        if (!mo12088r()) {
            return mo12092w();
        }
        kcsr kcsrVar = this.f64890h7am;
        return kcsrVar.f64848ld6.equals(kcsrVar.f64852toq) ? com.google.android.exoplayer2.util.lrht.zwy(this.f64890h7am.f64844cdj) : getDuration();
    }

    @Override // com.google.android.exoplayer2.gc3c
    public int h7am() {
        if (mo12088r()) {
            return this.f64890h7am.f64852toq.f65326zy;
        }
        return -1;
    }

    public void hyow(gc3c.InterfaceC3434g interfaceC3434g) {
        this.f64888gbni.zy(interfaceC3434g);
    }

    @zy.dd
    public com.google.android.exoplayer2.trackselection.zurt hyr() {
        return this.f64910wo;
    }

    @Override // com.google.android.exoplayer2.gc3c
    /* JADX INFO: renamed from: i */
    public void mo12083i(boolean z2) {
    }

    public void i1(t8r.toq toqVar) {
        this.f64914zsr0.add(toqVar);
    }

    public int i9jn(int i2) {
        return this.f64904tfm[i2].mo11551n();
    }

    @Override // com.google.android.exoplayer2.gc3c
    public long ij() {
        return this.f64882cfr;
    }

    @Override // com.google.android.exoplayer2.gc3c
    public boolean ix() {
        return this.f64911yqrt;
    }

    public void ixz(t8r.toq toqVar) {
        this.f64914zsr0.remove(toqVar);
    }

    @Override // com.google.android.exoplayer2.gc3c
    /* JADX INFO: renamed from: j */
    public void mo12084j(List<tfm> list, boolean z2) {
        c8jq(mi1u(list), z2);
    }

    @Override // com.google.android.exoplayer2.gc3c
    public float jp0y() {
        return 1.0f;
    }

    @Override // com.google.android.exoplayer2.gc3c
    /* JADX INFO: renamed from: k */
    public boolean mo12085k() {
        return this.f64890h7am.f64845f7l8;
    }

    @Override // com.google.android.exoplayer2.gc3c
    public void kcsr(final boolean z2) {
        if (this.f64911yqrt != z2) {
            this.f64911yqrt = z2;
            this.f64909was.kcsr(z2);
            this.f64888gbni.m13772y(9, new zurt.InterfaceC3864k() { // from class: com.google.android.exoplayer2.bf2
                @Override // com.google.android.exoplayer2.util.zurt.InterfaceC3864k
                public final void invoke(Object obj) {
                    ((gc3c.InterfaceC3434g) obj).qrj(z2);
                }
            });
            erbd();
            this.f64888gbni.m13768n();
        }
    }

    @Override // com.google.android.exoplayer2.gc3c
    public long kiv() {
        return this.f64903sok;
    }

    @Override // com.google.android.exoplayer2.gc3c
    public void kja0() {
    }

    @Override // com.google.android.exoplayer2.gc3c
    public int ktq() {
        if (this.f64890h7am.f20587k.ni7()) {
            return this.f64898mbx;
        }
        kcsr kcsrVar = this.f64890h7am;
        return kcsrVar.f20587k.mo12147g(kcsrVar.f64852toq.f21225k);
    }

    @Override // com.google.android.exoplayer2.gc3c
    public void ld6(se seVar) {
        if (seVar == null) {
            seVar = se.f21212g;
        }
        if (this.f64890h7am.f64849n7h.equals(seVar)) {
            return;
        }
        kcsr kcsrVarF7l8 = this.f64890h7am.f7l8(seVar);
        this.f64894kcsr++;
        this.f64909was.etdu(seVar);
        zxq(kcsrVarF7l8, 0, 1, false, false, 5, C3548p.f65257toq, -1);
    }

    @Override // com.google.android.exoplayer2.gc3c
    public void lh(int i2, List<tfm> list) {
        uj2j(Math.min(i2, this.f64891i9jn.size()), mi1u(list));
    }

    public void lk(long j2) {
        this.f64909was.fn3e(j2);
    }

    @Override // com.google.android.exoplayer2.gc3c
    public void lvui(int i2) {
    }

    @Override // com.google.android.exoplayer2.gc3c
    public int lw() {
        int iWtop = wtop();
        if (iWtop == -1) {
            return 0;
        }
        return iWtop;
    }

    /* JADX INFO: renamed from: m */
    public void m12174m(int i2, com.google.android.exoplayer2.source.fti ftiVar) {
        uj2j(i2, Collections.singletonList(ftiVar));
    }

    @Deprecated
    public void m4(com.google.android.exoplayer2.source.fti ftiVar, boolean z2, boolean z3) {
        v5yj(ftiVar, z2);
        prepare();
    }

    public mbx m58i() {
        return this.f64881bz2;
    }

    public void mbx(List<com.google.android.exoplayer2.source.fti> list) {
        uj2j(this.f64891i9jn.size(), list);
    }

    @Deprecated
    public void mu(com.google.android.exoplayer2.source.fti ftiVar) {
        vyq(ftiVar);
        prepare();
    }

    @Override // com.google.android.exoplayer2.gc3c
    public long n2t() {
        if (!mo12088r()) {
            return getCurrentPosition();
        }
        kcsr kcsrVar = this.f64890h7am;
        kcsrVar.f20587k.x2(kcsrVar.f64852toq.f21225k, this.f64899py);
        kcsr kcsrVar2 = this.f64890h7am;
        return kcsrVar2.f64854zy == C3548p.f65257toq ? kcsrVar2.f20587k.m12484i(lw(), this.f65002qkj8).m12489n() : this.f64899py.cdj() + com.google.android.exoplayer2.util.lrht.zwy(this.f64890h7am.f64854zy);
    }

    public InterfaceC3850n n5r1() {
        return this.f64908w831;
    }

    @Override // com.google.android.exoplayer2.gc3c
    public void n7h(@zy.dd Surface surface) {
    }

    public void nc(boolean z2, @zy.dd ki kiVar) {
        kcsr qVar;
        if (z2) {
            qVar = kjd(0, this.f64891i9jn.size()).m12150g(null);
        } else {
            kcsr kcsrVar = this.f64890h7am;
            qVar = kcsrVar.toq(kcsrVar.f64852toq);
            qVar.f64844cdj = qVar.f64851t8r;
            qVar.f64846ki = 0L;
        }
        kcsr kcsrVarM12156y = qVar.m12156y(1);
        if (kiVar != null) {
            kcsrVarM12156y = kcsrVarM12156y.m12150g(kiVar);
        }
        kcsr kcsrVar2 = kcsrVarM12156y;
        this.f64894kcsr++;
        this.f64909was.cv06();
        zxq(kcsrVar2, 0, 1, false, kcsrVar2.f20587k.ni7() && !this.f64890h7am.f20587k.ni7(), 4, xzl(kcsrVar2), -1);
    }

    @Override // com.google.android.exoplayer2.gc3c
    public void ngy(gc3c.InterfaceC3440y interfaceC3440y) {
        hyow(interfaceC3440y);
    }

    @Override // com.google.android.exoplayer2.gc3c
    public void ni7(@zy.dd TextureView textureView) {
    }

    @Override // com.google.android.exoplayer2.gc3c
    public void nmn5(boolean z2) {
        vg(z2, 0, 1);
    }

    @Override // com.google.android.exoplayer2.gc3c
    public void nsb(was wasVar) {
        C3844k.f7l8(wasVar);
        if (wasVar.equals(this.f64879bek6)) {
            return;
        }
        this.f64879bek6 = wasVar;
        this.f64888gbni.ld6(15, new zurt.InterfaceC3864k() { // from class: com.google.android.exoplayer2.j
            @Override // com.google.android.exoplayer2.util.zurt.InterfaceC3864k
            public final void invoke(Object obj) {
                this.f20562k.uo((gc3c.InterfaceC3434g) obj);
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public void m12175o(boolean z2) {
        if (this.f64913zkd != z2) {
            this.f64913zkd = z2;
            if (this.f64909was.was(z2)) {
                return;
            }
            nc(false, ki.createForUnexpected(new gyi(2), 1003));
        }
    }

    @Override // com.google.android.exoplayer2.gc3c
    public void oc(@zy.dd SurfaceView surfaceView) {
    }

    @Override // com.google.android.exoplayer2.gc3c
    public void prepare() {
        kcsr kcsrVar = this.f64890h7am;
        if (kcsrVar.f20588n != 1) {
            return;
        }
        kcsr kcsrVarM12150g = kcsrVar.m12150g(null);
        kcsr kcsrVarM12156y = kcsrVarM12150g.m12156y(kcsrVarM12150g.f20587k.ni7() ? 4 : 2);
        this.f64894kcsr++;
        this.f64909was.i1();
        zxq(kcsrVarM12156y, 1, 1, false, false, 5, C3548p.f65257toq, -1);
    }

    @Override // com.google.android.exoplayer2.gc3c
    public com.google.android.exoplayer2.trackselection.kja0 py() {
        return new com.google.android.exoplayer2.trackselection.kja0(this.f64890h7am.f20591s.f66061zy);
    }

    public void qkj8(List<com.google.android.exoplayer2.source.fti> list, int i2, long j2) {
        k4jz(list, i2, j2, false);
    }

    @Override // com.google.android.exoplayer2.gc3c
    public int qo() {
        return this.f64890h7am.f64850qrj;
    }

    @Override // com.google.android.exoplayer2.gc3c
    public void qrj(@zy.dd Surface surface) {
    }

    @Override // com.google.android.exoplayer2.gc3c
    /* JADX INFO: renamed from: r */
    public boolean mo12088r() {
        return this.f64890h7am.f64852toq.zy();
    }

    public void r8s8(com.google.android.exoplayer2.source.fti ftiVar, long j2) {
        qkj8(Collections.singletonList(ftiVar), 0, j2);
    }

    @Override // com.google.android.exoplayer2.gc3c
    public was ra() {
        return this.f64878b3e;
    }

    @Override // com.google.android.exoplayer2.gc3c
    public void release() {
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str = com.google.android.exoplayer2.util.lrht.f23231n;
        String qVar = c8jq.toq();
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 36 + String.valueOf(str).length() + String.valueOf(qVar).length());
        sb.append("Release ");
        sb.append(hexString);
        sb.append(" [");
        sb.append(c8jq.f63544zy);
        sb.append("] [");
        sb.append(str);
        sb.append("] [");
        sb.append(qVar);
        sb.append("]");
        com.google.android.exoplayer2.util.ni7.m13704y(f64877yl, sb.toString());
        if (!this.f64909was.m13969a()) {
            this.f64888gbni.ld6(10, new zurt.InterfaceC3864k() { // from class: com.google.android.exoplayer2.hb
                @Override // com.google.android.exoplayer2.util.zurt.InterfaceC3864k
                public final void invoke(Object obj) {
                    lv5.i1an((gc3c.InterfaceC3434g) obj);
                }
            });
        }
        this.f64888gbni.m13771s();
        this.f64884d8wk.mo13641y(null);
        com.google.android.exoplayer2.analytics.zp zpVar = this.f64897m4;
        if (zpVar != null) {
            this.f64885etdu.mo12413q(zpVar);
        }
        kcsr kcsrVarM12156y = this.f64890h7am.m12156y(1);
        this.f64890h7am = kcsrVarM12156y;
        kcsr qVar2 = kcsrVarM12156y.toq(kcsrVarM12156y.f64852toq);
        this.f64890h7am = qVar2;
        qVar2.f64844cdj = qVar2.f64851t8r;
        this.f64890h7am.f64846ki = 0L;
    }

    @Override // com.google.android.exoplayer2.gc3c
    /* JADX INFO: renamed from: s */
    public C3248g mo12089s() {
        return C3248g.f19336s;
    }

    public void sb1e(Metadata metadata) {
        this.f64883cv06 = this.f64883cv06.toq().oc(metadata).jp0y();
        was wasVarPnt2 = pnt2();
        if (wasVarPnt2.equals(this.f64878b3e)) {
            return;
        }
        this.f64878b3e = wasVarPnt2;
        this.f64888gbni.ld6(14, new zurt.InterfaceC3864k() { // from class: com.google.android.exoplayer2.yz
            @Override // com.google.android.exoplayer2.util.zurt.InterfaceC3864k
            public final void invoke(Object obj) {
                this.f23757k.d1ts((gc3c.InterfaceC3434g) obj);
            }
        });
    }

    public void se(@zy.dd mbx mbxVar) {
        if (mbxVar == null) {
            mbxVar = mbx.f64925f7l8;
        }
        if (this.f64881bz2.equals(mbxVar)) {
            return;
        }
        this.f64881bz2 = mbxVar;
        this.f64909was.z4(mbxVar);
    }

    @Override // com.google.android.exoplayer2.gc3c
    public void setRepeatMode(final int i2) {
        if (this.f64912z4 != i2) {
            this.f64912z4 = i2;
            this.f64909was.cfr(i2);
            this.f64888gbni.m13772y(8, new zurt.InterfaceC3864k() { // from class: com.google.android.exoplayer2.o
                @Override // com.google.android.exoplayer2.util.zurt.InterfaceC3864k
                public final void invoke(Object obj) {
                    ((gc3c.InterfaceC3434g) obj).onRepeatModeChanged(i2);
                }
            });
            erbd();
            this.f64888gbni.m13768n();
        }
    }

    @Override // com.google.android.exoplayer2.gc3c
    public void stop() {
        bwp(false);
    }

    @Override // com.google.android.exoplayer2.gc3c
    public pjz9 tfm() {
        return this.f64890h7am.f20591s.f22337q;
    }

    @Override // com.google.android.exoplayer2.gc3c
    public void toq(float f2) {
    }

    public void uj2j(int i2, List<com.google.android.exoplayer2.source.fti> list) {
        C3844k.m13629k(i2 >= 0);
        pc pcVarD8wk = d8wk();
        this.f64894kcsr++;
        List<m4.zy> listXblq = xblq(i2, list);
        pc pcVarXtb7 = xtb7();
        kcsr kcsrVarZ8 = z8(this.f64890h7am, pcVarXtb7, ab(pcVarD8wk, pcVarXtb7));
        this.f64909was.x2(i2, listXblq, this.f64905uj2j);
        zxq(kcsrVarZ8, 0, 1, false, false, 5, C3548p.f65257toq, -1);
    }

    @Override // com.google.android.exoplayer2.gc3c
    /* JADX INFO: renamed from: v */
    public int mo12091v() {
        if (mo12088r()) {
            return this.f64890h7am.f64852toq.f65325toq;
        }
        return -1;
    }

    @Deprecated
    public void v0af() {
        prepare();
    }

    public void v5yj(com.google.android.exoplayer2.source.fti ftiVar, boolean z2) {
        c8jq(Collections.singletonList(ftiVar), z2);
    }

    public void vg(boolean z2, int i2, int i3) {
        kcsr kcsrVar = this.f64890h7am;
        if (kcsrVar.f64853x2 == z2 && kcsrVar.f64850qrj == i2) {
            return;
        }
        this.f64894kcsr++;
        kcsr kcsrVarM12152n = kcsrVar.m12152n(z2, i2);
        this.f64909was.m4(z2, i2);
        zxq(kcsrVarM12152n, 0, i3, false, false, 5, C3548p.f65257toq, -1);
    }

    public void vq(boolean z2) {
        if (this.f64893jz5 == z2) {
            return;
        }
        this.f64893jz5 = z2;
        this.f64909was.ltg8(z2);
    }

    public void vy(InterfaceC3612m interfaceC3612m) {
        pc pcVarXtb7 = xtb7();
        kcsr kcsrVarZ8 = z8(this.f64890h7am, pcVarXtb7, c25(pcVarXtb7, lw(), getCurrentPosition()));
        this.f64894kcsr++;
        this.f64905uj2j = interfaceC3612m;
        this.f64909was.se(interfaceC3612m);
        zxq(kcsrVarZ8, 0, 1, false, false, 5, C3548p.f65257toq, -1);
    }

    public void vyq(com.google.android.exoplayer2.source.fti ftiVar) {
        m12172a(Collections.singletonList(ftiVar));
    }

    @Override // com.google.android.exoplayer2.gc3c
    /* JADX INFO: renamed from: w */
    public long mo12092w() {
        if (this.f64890h7am.f20587k.ni7()) {
            return this.f64892jbh;
        }
        kcsr kcsrVar = this.f64890h7am;
        if (kcsrVar.f64848ld6.f21227q != kcsrVar.f64852toq.f21227q) {
            return kcsrVar.f20587k.m12484i(lw(), this.f65002qkj8).f7l8();
        }
        long j2 = kcsrVar.f64844cdj;
        if (this.f64890h7am.f64848ld6.zy()) {
            kcsr kcsrVar2 = this.f64890h7am;
            pc.toq toqVarX2 = kcsrVar2.f20587k.x2(kcsrVar2.f64848ld6.f21225k, this.f64899py);
            long jM12501s = toqVarX2.m12501s(this.f64890h7am.f64848ld6.f65325toq);
            j2 = jM12501s == Long.MIN_VALUE ? toqVarX2.f21149g : jM12501s;
        }
        kcsr kcsrVar3 = this.f64890h7am;
        return com.google.android.exoplayer2.util.lrht.zwy(mete(kcsrVar3.f20587k, kcsrVar3.f64848ld6, j2));
    }

    @Override // com.google.android.exoplayer2.gc3c
    public gc3c.zy w831() {
        return this.f64895ktq;
    }

    @Override // com.google.android.exoplayer2.gc3c
    public C3629x wo() {
        return this.f64890h7am.f20592y;
    }

    @Override // com.google.android.exoplayer2.gc3c
    public int wvg() {
        return 0;
    }

    @Override // com.google.android.exoplayer2.gc3c
    public long x9kr() {
        return com.google.android.exoplayer2.util.lrht.zwy(this.f64890h7am.f64846ki);
    }

    @Override // com.google.android.exoplayer2.gc3c
    public boolean yqrt() {
        return this.f64890h7am.f64853x2;
    }

    @Override // com.google.android.exoplayer2.gc3c
    /* JADX INFO: renamed from: z617, reason: merged with bridge method [inline-methods] */
    public com.google.common.collect.se<com.google.android.exoplayer2.text.toq> ki() {
        return com.google.common.collect.se.of();
    }

    public void zma(gc3c.InterfaceC3434g interfaceC3434g) {
        this.f64888gbni.m13769p(interfaceC3434g);
    }

    @Override // com.google.android.exoplayer2.gc3c
    public void zp(int i2, int i3) {
        kcsr kcsrVarKjd = kjd(i2, Math.min(i3, this.f64891i9jn.size()));
        zxq(kcsrVarKjd, 0, 1, false, !kcsrVarKjd.f64852toq.f21225k.equals(this.f64890h7am.f64852toq.f21225k), 4, xzl(kcsrVarKjd), -1);
    }

    @Override // com.google.android.exoplayer2.gc3c
    public void zurt() {
    }

    @Override // com.google.android.exoplayer2.gc3c
    public void zy(@zy.dd SurfaceHolder surfaceHolder) {
    }

    @Override // com.google.android.exoplayer2.gc3c
    @zy.dd
    /* JADX INFO: renamed from: n */
    public ki mo12087n() {
        return this.f64890h7am.f20585g;
    }
}
