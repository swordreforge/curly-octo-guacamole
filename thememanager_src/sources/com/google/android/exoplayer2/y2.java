package com.google.android.exoplayer2;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.exoplayer2.bek6;
import com.google.android.exoplayer2.drm.qrj;
import com.google.android.exoplayer2.m4;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.pc;
import com.google.android.exoplayer2.qrj;
import com.google.android.exoplayer2.source.C3629x;
import com.google.android.exoplayer2.source.InterfaceC3603j;
import com.google.android.exoplayer2.source.InterfaceC3612m;
import com.google.android.exoplayer2.source.fti;
import com.google.android.exoplayer2.source.jk;
import com.google.android.exoplayer2.tfm;
import com.google.android.exoplayer2.trackselection.InterfaceC3715s;
import com.google.android.exoplayer2.trackselection.zurt;
import com.google.android.exoplayer2.uj2j;
import com.google.android.exoplayer2.upstream.C3796h;
import com.google.android.exoplayer2.upstream.InterfaceC3808n;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.InterfaceC3850n;
import com.google.common.collect.g0ad;
import com.google.common.collect.se;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import zy.InterfaceC7839p;

/* JADX INFO: compiled from: ExoPlayerImplInternal.java */
/* JADX INFO: loaded from: classes2.dex */
final class y2 implements Handler.Callback, jk.InterfaceC3604k, zurt.InterfaceC3717k, m4.InterfaceC3456q, qrj.InterfaceC3553k, uj2j.InterfaceC3769k {
    private static final String ad = "ExoPlayerImplInternal";
    private static final int aj = 3;
    private static final int am = 0;
    private static final int ar = 6;
    private static final int ay = 1;
    private static final int bc = 7;
    private static final int bd = 9;
    private static final int be = 2;
    private static final int bs = 4;
    private static final int bu = 8;
    private static final int cw14 = 23;
    private static final long d1cy = 2000;
    private static final int dy = 16;
    private static final int hp = 22;
    private static final int k0 = 5;
    private static final int k6e = 18;
    private static final int mjvl = 21;
    private static final int ndjo = 1000;
    private static final int q7k9 = 10;
    private static final int s8y = 20;
    private static final int sk1t = 15;
    private static final int tgs = 12;
    private static final int th6 = 25;
    private static final int tlhn = 10;
    private static final int vb6 = 17;
    private static final int w97r = 11;
    private static final int xk5 = 19;
    private static final int xy8 = 24;
    private static final int yl25 = 13;
    private static final int zmmu = 14;

    /* JADX INFO: renamed from: a */
    private final qkj8 f23707a;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private boolean f67294ab;
    private long ac;
    private boolean an;
    private int as;
    private boolean ax;
    private long az;

    /* JADX INFO: renamed from: b */
    private final m4 f23708b;
    private int ba;
    private boolean bb;

    @zy.dd
    private C3906y bg;
    private boolean bl;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private kcsr f67295bo;
    private boolean bp;

    @zy.dd
    private ki bq;
    private int bv;

    /* JADX INFO: renamed from: c */
    private final qrj f23709c;

    /* JADX INFO: renamed from: d */
    private boolean f23710d;

    /* JADX INFO: renamed from: e */
    private final ArrayList<C3905q> f23711e;

    /* JADX INFO: renamed from: f */
    private final boolean f23712f;

    /* JADX INFO: renamed from: g */
    private final com.google.android.exoplayer2.trackselection.zurt f23713g;

    /* JADX INFO: renamed from: h */
    private final com.google.android.exoplayer2.util.ki f23714h;

    /* JADX INFO: renamed from: i */
    private final HandlerThread f23715i;
    private boolean id;
    private boolean in;

    /* JADX INFO: renamed from: j */
    private final InterfaceC3850n f23716j;

    /* JADX INFO: renamed from: k */
    private final bek6[] f23717k;

    /* JADX INFO: renamed from: l */
    private final long f23718l;

    /* JADX INFO: renamed from: m */
    private final i9jn f23719m;

    /* JADX INFO: renamed from: n */
    private final cv06[] f23720n;

    /* JADX INFO: renamed from: o */
    private final InterfaceC3902g f23721o;

    /* JADX INFO: renamed from: p */
    private final InterfaceC3808n f23722p;

    /* JADX INFO: renamed from: q */
    private final Set<bek6> f23723q;

    /* JADX INFO: renamed from: r */
    private final pc.toq f23724r;

    /* JADX INFO: renamed from: s */
    private final fnq8 f23725s;

    /* JADX INFO: renamed from: t */
    private final pc.C3550q f23726t;

    /* JADX INFO: renamed from: u */
    private mbx f23727u;

    /* JADX INFO: renamed from: v */
    private C3904n f23728v;

    /* JADX INFO: renamed from: w */
    private boolean f23729w;

    /* JADX INFO: renamed from: x */
    private final long f23730x;

    /* JADX INFO: renamed from: y */
    private final com.google.android.exoplayer2.trackselection.ni7 f23731y;

    /* JADX INFO: renamed from: z */
    private final Looper f23732z;

    /* JADX INFO: compiled from: ExoPlayerImplInternal.java */
    private static final class f7l8 {

        /* JADX INFO: renamed from: g */
        public final boolean f23733g;

        /* JADX INFO: renamed from: k */
        public final fti.C3596k f23734k;

        /* JADX INFO: renamed from: n */
        public final boolean f23735n;

        /* JADX INFO: renamed from: q */
        public final boolean f23736q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public final long f67296toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public final long f67297zy;

        public f7l8(fti.C3596k c3596k, long j2, long j3, boolean z2, boolean z3, boolean z5) {
            this.f23734k = c3596k;
            this.f67296toq = j2;
            this.f67297zy = j3;
            this.f23736q = z2;
            this.f23735n = z3;
            this.f23733g = z5;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.y2$g */
    /* JADX INFO: compiled from: ExoPlayerImplInternal.java */
    public interface InterfaceC3902g {
        /* JADX INFO: renamed from: k */
        void mo11545k(C3904n c3904n);
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.y2$k */
    /* JADX INFO: compiled from: ExoPlayerImplInternal.java */
    class C3903k implements bek6.zy {
        C3903k() {
        }

        @Override // com.google.android.exoplayer2.bek6.zy
        /* JADX INFO: renamed from: k */
        public void mo11555k() {
            y2.this.f23714h.qrj(2);
        }

        @Override // com.google.android.exoplayer2.bek6.zy
        public void toq(long j2) {
            if (j2 >= 2000) {
                y2.this.in = true;
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.y2$n */
    /* JADX INFO: compiled from: ExoPlayerImplInternal.java */
    public static final class C3904n {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        public int f67298f7l8;

        /* JADX INFO: renamed from: g */
        public boolean f23738g;

        /* JADX INFO: renamed from: k */
        private boolean f23739k;

        /* JADX INFO: renamed from: n */
        public int f23740n;

        /* JADX INFO: renamed from: q */
        public boolean f23741q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public kcsr f67299toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public int f67300zy;

        public C3904n(kcsr kcsrVar) {
            this.f67299toq = kcsrVar;
        }

        /* JADX INFO: renamed from: n */
        public void m13972n(int i2) {
            if (this.f23741q && this.f23740n != 5) {
                C3844k.m13629k(i2 == 5);
                return;
            }
            this.f23739k = true;
            this.f23741q = true;
            this.f23740n = i2;
        }

        /* JADX INFO: renamed from: q */
        public void m13973q(kcsr kcsrVar) {
            this.f23739k |= this.f67299toq != kcsrVar;
            this.f67299toq = kcsrVar;
        }

        public void toq(int i2) {
            this.f23739k |= i2 > 0;
            this.f67300zy += i2;
        }

        public void zy(int i2) {
            this.f23739k = true;
            this.f23738g = true;
            this.f67298f7l8 = i2;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.y2$q */
    /* JADX INFO: compiled from: ExoPlayerImplInternal.java */
    private static final class C3905q implements Comparable<C3905q> {

        /* JADX INFO: renamed from: g */
        @zy.dd
        public Object f23742g;

        /* JADX INFO: renamed from: k */
        public final uj2j f23743k;

        /* JADX INFO: renamed from: n */
        public long f23744n;

        /* JADX INFO: renamed from: q */
        public int f23745q;

        public C3905q(uj2j uj2jVar) {
            this.f23743k = uj2jVar;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public int compareTo(C3905q c3905q) {
            Object obj = this.f23742g;
            if ((obj == null) != (c3905q.f23742g == null)) {
                return obj != null ? -1 : 1;
            }
            if (obj == null) {
                return 0;
            }
            int i2 = this.f23745q - c3905q.f23745q;
            return i2 != 0 ? i2 : com.google.android.exoplayer2.util.lrht.cdj(this.f23744n, c3905q.f23744n);
        }

        public void zy(int i2, long j2, Object obj) {
            this.f23745q = i2;
            this.f23744n = j2;
            this.f23742g = obj;
        }
    }

    /* JADX INFO: compiled from: ExoPlayerImplInternal.java */
    private static final class toq {

        /* JADX INFO: renamed from: k */
        private final List<m4.zy> f23746k;

        /* JADX INFO: renamed from: q */
        private final long f23747q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final InterfaceC3612m f67301toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final int f67302zy;

        /* synthetic */ toq(List list, InterfaceC3612m interfaceC3612m, int i2, long j2, C3903k c3903k) {
            this(list, interfaceC3612m, i2, j2);
        }

        private toq(List<m4.zy> list, InterfaceC3612m interfaceC3612m, int i2, long j2) {
            this.f23746k = list;
            this.f67301toq = interfaceC3612m;
            this.f67302zy = i2;
            this.f23747q = j2;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.y2$y */
    /* JADX INFO: compiled from: ExoPlayerImplInternal.java */
    private static final class C3906y {

        /* JADX INFO: renamed from: k */
        public final pc f23748k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public final int f67303toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public final long f67304zy;

        public C3906y(pc pcVar, int i2, long j2) {
            this.f23748k = pcVar;
            this.f67303toq = i2;
            this.f67304zy = j2;
        }
    }

    /* JADX INFO: compiled from: ExoPlayerImplInternal.java */
    private static class zy {

        /* JADX INFO: renamed from: k */
        public final int f23749k;

        /* JADX INFO: renamed from: q */
        public final InterfaceC3612m f23750q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public final int f67305toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public final int f67306zy;

        public zy(int i2, int i3, int i4, InterfaceC3612m interfaceC3612m) {
            this.f23749k = i2;
            this.f67305toq = i3;
            this.f67306zy = i4;
            this.f23750q = interfaceC3612m;
        }
    }

    public y2(bek6[] bek6VarArr, com.google.android.exoplayer2.trackselection.zurt zurtVar, com.google.android.exoplayer2.trackselection.ni7 ni7Var, fnq8 fnq8Var, InterfaceC3808n interfaceC3808n, int i2, boolean z2, @zy.dd com.google.android.exoplayer2.analytics.zp zpVar, mbx mbxVar, qkj8 qkj8Var, long j2, boolean z3, Looper looper, InterfaceC3850n interfaceC3850n, InterfaceC3902g interfaceC3902g) {
        this.f23721o = interfaceC3902g;
        this.f23717k = bek6VarArr;
        this.f23713g = zurtVar;
        this.f23731y = ni7Var;
        this.f23725s = fnq8Var;
        this.f23722p = interfaceC3808n;
        this.bv = i2;
        this.an = z2;
        this.f23727u = mbxVar;
        this.f23707a = qkj8Var;
        this.f23730x = j2;
        this.ac = j2;
        this.f23729w = z3;
        this.f23716j = interfaceC3850n;
        this.f23718l = fnq8Var.toq();
        this.f23712f = fnq8Var.mo12061k();
        kcsr kcsrVarLd6 = kcsr.ld6(ni7Var);
        this.f67295bo = kcsrVarLd6;
        this.f23728v = new C3904n(kcsrVarLd6);
        this.f23720n = new cv06[bek6VarArr.length];
        for (int i3 = 0; i3 < bek6VarArr.length; i3++) {
            bek6VarArr[i3].setIndex(i3);
            this.f23720n[i3] = bek6VarArr[i3].mo11549h();
        }
        this.f23709c = new qrj(this, interfaceC3850n);
        this.f23711e = new ArrayList<>();
        this.f23723q = g0ad.o1t();
        this.f23726t = new pc.C3550q();
        this.f23724r = new pc.toq();
        zurtVar.zy(this, interfaceC3808n);
        this.ax = true;
        Handler handler = new Handler(looper);
        this.f23719m = new i9jn(zpVar, handler);
        this.f23708b = new m4(this, zpVar, handler);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.f23715i = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.f23732z = looper2;
        this.f23714h = interfaceC3850n.zy(looper2, this);
    }

    private long a9(long j2) {
        gbni gbniVarM12121p = this.f23719m.m12121p();
        if (gbniVarM12121p == null) {
            return 0L;
        }
        return Math.max(0L, j2 - gbniVarM12121p.m12077z(this.az));
    }

    private void a98o() {
        this.f23728v.toq(1);
        t8iq(false, false, false, true);
        this.f23725s.zy();
        zkd(this.f67295bo.f20587k.ni7() ? 4 : 2);
        this.f23708b.m12186z(this.f23722p.zy());
        this.f23714h.qrj(2);
    }

    /* JADX INFO: renamed from: b */
    private void m13949b() {
        for (gbni gbniVarM12120h = this.f23719m.m12120h(); gbniVarM12120h != null; gbniVarM12120h = gbniVarM12120h.m12074p()) {
            for (InterfaceC3715s interfaceC3715s : gbniVarM12120h.kja0().f66061zy) {
                if (interfaceC3715s != null) {
                    interfaceC3715s.zurt();
                }
            }
        }
    }

    private boolean b3e(pc pcVar, fti.C3596k c3596k) {
        if (c3596k.zy() || pcVar.ni7()) {
            return false;
        }
        pcVar.m12484i(pcVar.x2(c3596k.f21225k, this.f23724r).f21151n, this.f23726t);
        if (!this.f23726t.ld6()) {
            return false;
        }
        pc.C3550q c3550q = this.f23726t;
        return c3550q.f21131i && c3550q.f21139s != C3548p.f65257toq;
    }

    private void bek6() throws ki {
        this.bb = false;
        this.f23709c.m12527n();
        for (bek6 bek6Var : this.f23717k) {
            if (ncyb(bek6Var)) {
                bek6Var.start();
            }
        }
    }

    private void bo(long j2) throws ki {
        gbni gbniVarM12120h = this.f23719m.m12120h();
        long jO1t = gbniVarM12120h == null ? j2 + i9jn.f64793n7h : gbniVarM12120h.o1t(j2);
        this.az = jO1t;
        this.f23709c.zy(jO1t);
        for (bek6 bek6Var : this.f23717k) {
            if (ncyb(bek6Var)) {
                bek6Var.mo11554z(this.az);
            }
        }
        yz();
    }

    private void bwp(boolean z2) throws ki {
        this.an = z2;
        if (!this.f23719m.gvn7(this.f67295bo.f20587k, z2)) {
            mu(true);
        }
        gvn7(false);
    }

    private boolean bz2() {
        gbni gbniVarM12120h;
        gbni gbniVarM12074p;
        return jz5() && !this.f67294ab && (gbniVarM12120h = this.f23719m.m12120h()) != null && (gbniVarM12074p = gbniVarM12120h.m12074p()) != null && this.az >= gbniVarM12074p.qrj() && gbniVarM12074p.f64723f7l8;
    }

    /* JADX INFO: renamed from: c */
    private void m13950c() {
        boolean zUj2j = uj2j();
        this.bp = zUj2j;
        if (zUj2j) {
            this.f23719m.m12121p().m12075q(this.az);
        }
        mbx();
    }

    private static boolean c8jq(C3905q c3905q, pc pcVar, pc pcVar2, int i2, boolean z2, pc.C3550q c3550q, pc.toq toqVar) {
        Object obj = c3905q.f23742g;
        if (obj == null) {
            Pair<Object, Long> pairXwq3 = xwq3(pcVar, new C3906y(c3905q.f23743k.m13353p(), c3905q.f23743k.m13348g(), c3905q.f23743k.m13356y() == Long.MIN_VALUE ? C3548p.f65257toq : com.google.android.exoplayer2.util.lrht.v0af(c3905q.f23743k.m13356y())), false, i2, z2, c3550q, toqVar);
            if (pairXwq3 == null) {
                return false;
            }
            c3905q.zy(pcVar.mo12147g(pairXwq3.first), ((Long) pairXwq3.second).longValue(), pairXwq3.first);
            if (c3905q.f23743k.m13356y() == Long.MIN_VALUE) {
                y2(pcVar, c3905q, c3550q, toqVar);
            }
            return true;
        }
        int iMo12147g = pcVar.mo12147g(obj);
        if (iMo12147g == -1) {
            return false;
        }
        if (c3905q.f23743k.m13356y() == Long.MIN_VALUE) {
            y2(pcVar, c3905q, c3550q, toqVar);
            return true;
        }
        c3905q.f23745q = iMo12147g;
        pcVar2.x2(c3905q.f23742g, toqVar);
        if (toqVar.f21154s && pcVar2.m12484i(toqVar.f21151n, c3550q).f21126c == pcVar2.mo12147g(c3905q.f23742g)) {
            Pair<Object, Long> pairN7h = pcVar.n7h(c3550q, toqVar, pcVar.x2(c3905q.f23742g, toqVar).f21151n, c3905q.f23744n + toqVar.ki());
            c3905q.zy(pcVar.mo12147g(pairN7h.first), ((Long) pairN7h.second).longValue(), pairN7h.first);
        }
        return true;
    }

    private void cdj(int i2, boolean z2) throws ki {
        bek6 bek6Var = this.f23717k[i2];
        if (ncyb(bek6Var)) {
            return;
        }
        gbni gbniVarCdj = this.f23719m.cdj();
        boolean z3 = gbniVarCdj == this.f23719m.m12120h();
        com.google.android.exoplayer2.trackselection.ni7 ni7VarKja0 = gbniVarCdj.kja0();
        h7am h7amVar = ni7VarKja0.f66060toq[i2];
        xwq3[] xwq3VarArrM13968z = m13968z(ni7VarKja0.f66061zy[i2]);
        boolean z5 = jz5() && this.f67295bo.f20588n == 3;
        boolean z6 = !z2 && z5;
        this.as++;
        this.f23723q.add(bek6Var);
        bek6Var.mo11550i(h7amVar, xwq3VarArrM13968z, gbniVarCdj.f64730zy[i2], this.az, z6, z3, gbniVarCdj.qrj(), gbniVarCdj.x2());
        bek6Var.x2(11, new C3903k());
        this.f23709c.toq(bek6Var);
        if (z5) {
            bek6Var.start();
        }
    }

    private void d2ok(se seVar, boolean z2) throws ki {
        eqxt(seVar, seVar.f21216k, true, z2);
    }

    private void d3(pc pcVar, boolean z2) throws Throwable {
        int i2;
        int i3;
        boolean z3;
        f7l8 f7l8VarDr = dr(pcVar, this.f67295bo, this.bg, this.f23719m, this.bv, this.an, this.f23726t, this.f23724r);
        fti.C3596k c3596k = f7l8VarDr.f23734k;
        long j2 = f7l8VarDr.f67297zy;
        boolean z5 = f7l8VarDr.f23736q;
        long jQkj8 = f7l8VarDr.f67296toq;
        boolean z6 = (this.f67295bo.f64852toq.equals(c3596k) && jQkj8 == this.f67295bo.f64851t8r) ? false : true;
        C3906y c3906y = null;
        long j3 = C3548p.f65257toq;
        try {
            if (f7l8VarDr.f23735n) {
                if (this.f67295bo.f20588n != 1) {
                    zkd(4);
                }
                t8iq(false, false, false, true);
            }
            try {
                if (z6) {
                    i3 = 4;
                    z3 = false;
                    if (!pcVar.ni7()) {
                        for (gbni gbniVarM12120h = this.f23719m.m12120h(); gbniVarM12120h != null; gbniVarM12120h = gbniVarM12120h.m12074p()) {
                            if (gbniVarM12120h.f20481g.f23761k.equals(c3596k)) {
                                gbniVarM12120h.f20481g = this.f23719m.ki(pcVar, gbniVarM12120h.f20481g);
                                gbniVarM12120h.wvg();
                            }
                        }
                        jQkj8 = qkj8(c3596k, jQkj8, z5);
                    }
                } else {
                    try {
                        i3 = 4;
                        z3 = false;
                        if (!this.f23719m.fti(pcVar, this.az, wvg())) {
                            mu(false);
                        }
                    } catch (Throwable th) {
                        th = th;
                        i2 = 4;
                        kcsr kcsrVar = this.f67295bo;
                        pc pcVar2 = kcsrVar.f20587k;
                        fti.C3596k c3596k2 = kcsrVar.f64852toq;
                        if (f7l8VarDr.f23733g) {
                            j3 = jQkj8;
                        }
                        C3906y c3906y2 = c3906y;
                        jbh(pcVar, c3596k, pcVar2, c3596k2, j3);
                        if (z6 || j2 != this.f67295bo.f64854zy) {
                            kcsr kcsrVar2 = this.f67295bo;
                            Object obj = kcsrVar2.f64852toq.f21225k;
                            pc pcVar3 = kcsrVar2.f20587k;
                            this.f67295bo = lvui(c3596k, jQkj8, j2, this.f67295bo.f20590q, z6 && z2 && !pcVar3.ni7() && !pcVar3.x2(obj, this.f23724r).f21154s, pcVar.mo12147g(obj) == -1 ? i2 : 3);
                        }
                        m13965u();
                        gyi(pcVar, this.f67295bo.f20587k);
                        this.f67295bo = this.f67295bo.m12153p(pcVar);
                        if (!pcVar.ni7()) {
                            this.bg = c3906y2;
                        }
                        gvn7(false);
                        throw th;
                    }
                }
                kcsr kcsrVar3 = this.f67295bo;
                jbh(pcVar, c3596k, kcsrVar3.f20587k, kcsrVar3.f64852toq, f7l8VarDr.f23733g ? jQkj8 : -9223372036854775807L);
                if (z6 || j2 != this.f67295bo.f64854zy) {
                    kcsr kcsrVar4 = this.f67295bo;
                    Object obj2 = kcsrVar4.f64852toq.f21225k;
                    pc pcVar4 = kcsrVar4.f20587k;
                    this.f67295bo = lvui(c3596k, jQkj8, j2, this.f67295bo.f20590q, (!z6 || !z2 || pcVar4.ni7() || pcVar4.x2(obj2, this.f23724r).f21154s) ? z3 : true, pcVar.mo12147g(obj2) == -1 ? i3 : 3);
                }
                m13965u();
                gyi(pcVar, this.f67295bo.f20587k);
                this.f67295bo = this.f67295bo.m12153p(pcVar);
                if (!pcVar.ni7()) {
                    this.bg = null;
                }
                gvn7(z3);
            } catch (Throwable th2) {
                th = th2;
                c3906y = null;
            }
        } catch (Throwable th3) {
            th = th3;
            i2 = 4;
        }
    }

    private void d8wk(long j2) {
        for (bek6 bek6Var : this.f23717k) {
            if (bek6Var.ni7() != null) {
                g1(bek6Var, j2);
            }
        }
    }

    private boolean dd() {
        gbni gbniVarCdj = this.f23719m.cdj();
        if (!gbniVarCdj.f20485q) {
            return false;
        }
        int i2 = 0;
        while (true) {
            bek6[] bek6VarArr = this.f23717k;
            if (i2 >= bek6VarArr.length) {
                return true;
            }
            bek6 bek6Var = bek6VarArr[i2];
            InterfaceC3603j interfaceC3603j = gbniVarCdj.f64730zy[i2];
            if (bek6Var.ni7() != interfaceC3603j || (interfaceC3603j != null && !bek6Var.mo11548g() && !m13962r(bek6Var, gbniVarCdj))) {
                break;
            }
            i2++;
        }
        return false;
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    private synchronized void m28267do(com.google.common.base.lvui<Boolean> lvuiVar, long j2) {
        long jMo13575q = this.f23716j.mo13575q() + j2;
        boolean z2 = false;
        while (!lvuiVar.get().booleanValue() && j2 > 0) {
            try {
                this.f23716j.mo13574n();
                wait(j2);
            } catch (InterruptedException unused) {
                z2 = true;
            }
            j2 = jMo13575q - this.f23716j.mo13575q();
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.google.android.exoplayer2.y2.f7l8 dr(com.google.android.exoplayer2.pc r30, com.google.android.exoplayer2.kcsr r31, @zy.dd com.google.android.exoplayer2.y2.C3906y r32, com.google.android.exoplayer2.i9jn r33, int r34, boolean r35, com.google.android.exoplayer2.pc.C3550q r36, com.google.android.exoplayer2.pc.toq r37) {
        /*
            Method dump skipped, instruction units count: 521
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.y2.dr(com.google.android.exoplayer2.pc, com.google.android.exoplayer2.kcsr, com.google.android.exoplayer2.y2$y, com.google.android.exoplayer2.i9jn, int, boolean, com.google.android.exoplayer2.pc$q, com.google.android.exoplayer2.pc$toq):com.google.android.exoplayer2.y2$f7l8");
    }

    /* JADX INFO: renamed from: e */
    private void m13951e() throws ki {
        zsr0 zsr0VarKja0;
        this.f23719m.m12122z(this.az);
        if (this.f23719m.jk() && (zsr0VarKja0 = this.f23719m.kja0(this.az, this.f67295bo)) != null) {
            gbni gbniVarF7l8 = this.f23719m.f7l8(this.f23720n, this.f23713g, this.f23725s.mo12060g(), this.f23708b, zsr0VarKja0, this.f23731y);
            gbniVarF7l8.f20482k.n7h(this, zsr0VarKja0.f67308toq);
            if (this.f23719m.m12120h() == gbniVarF7l8) {
                bo(zsr0VarKja0.f67308toq);
            }
            gvn7(false);
        }
        if (!this.bp) {
            m13950c();
        } else {
            this.bp = x9kr();
            mbx();
        }
    }

    private void eqxt(se seVar, float f2, boolean z2, boolean z3) throws ki {
        if (z2) {
            if (z3) {
                this.f23728v.toq(1);
            }
            this.f67295bo = this.f67295bo.f7l8(seVar);
        }
        ixz(seVar.f21216k);
        for (bek6 bek6Var : this.f23717k) {
            if (bek6Var != null) {
                bek6Var.t8r(f2, seVar.f21216k);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ void m13952f(uj2j uj2jVar) {
        try {
            n7h(uj2jVar);
        } catch (ki e2) {
            com.google.android.exoplayer2.util.ni7.m13700n(ad, "Unexpected error delivering message on external thread.", e2);
            throw new RuntimeException(e2);
        }
    }

    private long fnq8(fti.C3596k c3596k, long j2, boolean z2, boolean z3) throws ki {
        vep5();
        this.bb = false;
        if (z3 || this.f67295bo.f20588n == 3) {
            zkd(2);
        }
        gbni gbniVarM12120h = this.f23719m.m12120h();
        gbni gbniVarM12074p = gbniVarM12120h;
        while (gbniVarM12074p != null && !c3596k.equals(gbniVarM12074p.f20481g.f23761k)) {
            gbniVarM12074p = gbniVarM12074p.m12074p();
        }
        if (z2 || gbniVarM12120h != gbniVarM12074p || (gbniVarM12074p != null && gbniVarM12074p.o1t(j2) < 0)) {
            for (bek6 bek6Var : this.f23717k) {
                kja0(bek6Var);
            }
            if (gbniVarM12074p != null) {
                while (this.f23719m.m12120h() != gbniVarM12074p) {
                    this.f23719m.toq();
                }
                this.f23719m.o1t(gbniVarM12074p);
                gbniVarM12074p.fu4(i9jn.f64793n7h);
                ki();
            }
        }
        if (gbniVarM12074p != null) {
            this.f23719m.o1t(gbniVarM12074p);
            if (!gbniVarM12074p.f20485q) {
                gbniVarM12074p.f20481g = gbniVarM12074p.f20481g.toq(j2);
            } else if (gbniVarM12074p.f20483n) {
                long jX2 = gbniVarM12074p.f20482k.x2(j2);
                gbniVarM12074p.f20482k.zurt(jX2 - this.f23718l, this.f23712f);
                j2 = jX2;
            }
            bo(j2);
            m13950c();
        } else {
            this.f23719m.m12119g();
            bo(j2);
        }
        gvn7(false);
        this.f23714h.qrj(2);
        return j2;
    }

    private void fti(com.google.android.exoplayer2.source.jk jkVar) {
        if (this.f23719m.zurt(jkVar)) {
            this.f23719m.m12122z(this.az);
            m13950c();
        }
    }

    private long fu4() {
        kcsr kcsrVar = this.f67295bo;
        return o1t(kcsrVar.f20587k, kcsrVar.f64852toq.f21225k, kcsrVar.f64851t8r);
    }

    private void g1(bek6 bek6Var, long j2) {
        bek6Var.mo11553y();
        if (bek6Var instanceof com.google.android.exoplayer2.text.kja0) {
            ((com.google.android.exoplayer2.text.kja0) bek6Var).nn86(j2);
        }
    }

    private void gbni(boolean z2, @zy.dd AtomicBoolean atomicBoolean) {
        if (this.id != z2) {
            this.id = z2;
            if (!z2) {
                for (bek6 bek6Var : this.f23717k) {
                    if (!ncyb(bek6Var) && this.f23723q.remove(bek6Var)) {
                        bek6Var.reset();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    private void gc3c(InterfaceC3612m interfaceC3612m) throws Throwable {
        this.f23728v.toq(1);
        d3(this.f23708b.fti(interfaceC3612m), false);
    }

    private void gvn7(boolean z2) {
        gbni gbniVarM12121p = this.f23719m.m12121p();
        fti.C3596k c3596k = gbniVarM12121p == null ? this.f67295bo.f64852toq : gbniVarM12121p.f20481g.f23761k;
        boolean z3 = !this.f67295bo.f64848ld6.equals(c3596k);
        if (z3) {
            this.f67295bo = this.f67295bo.toq(c3596k);
        }
        kcsr kcsrVar = this.f67295bo;
        kcsrVar.f64844cdj = gbniVarM12121p == null ? kcsrVar.f64851t8r : gbniVarM12121p.m12076s();
        this.f67295bo.f64846ki = jk();
        if ((z3 || z2) && gbniVarM12121p != null && gbniVarM12121p.f20485q) {
            yl(gbniVarM12121p.n7h(), gbniVarM12121p.kja0());
        }
    }

    private void gyi(pc pcVar, pc pcVar2) {
        if (pcVar.ni7() && pcVar2.ni7()) {
            return;
        }
        for (int size = this.f23711e.size() - 1; size >= 0; size--) {
            if (!c8jq(this.f23711e.get(size), pcVar, pcVar2, this.bv, this.an, this.f23726t, this.f23724r)) {
                this.f23711e.get(size).f23743k.qrj(false);
                this.f23711e.remove(size);
            }
        }
        Collections.sort(this.f23711e);
    }

    /* JADX INFO: renamed from: h */
    private void m13954h() throws IOException, ki {
        boolean z2;
        boolean z3;
        int i2;
        boolean z5;
        long qVar = this.f23716j.toq();
        uc();
        int i3 = this.f67295bo.f20588n;
        if (i3 == 1 || i3 == 4) {
            this.f23714h.kja0(2);
            return;
        }
        gbni gbniVarM12120h = this.f23719m.m12120h();
        if (gbniVarM12120h == null) {
            ikck(qVar, 10L);
            return;
        }
        com.google.android.exoplayer2.util.n5r1.m13686k("doSomeWork");
        wx16();
        if (gbniVarM12120h.f20485q) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() * 1000;
            gbniVarM12120h.f20482k.zurt(this.f67295bo.f64851t8r - this.f23718l, this.f23712f);
            z2 = true;
            z3 = true;
            int i4 = 0;
            while (true) {
                bek6[] bek6VarArr = this.f23717k;
                if (i4 >= bek6VarArr.length) {
                    break;
                }
                bek6 bek6Var = bek6VarArr[i4];
                if (ncyb(bek6Var)) {
                    bek6Var.zurt(this.az, jElapsedRealtime);
                    z2 = z2 && bek6Var.zy();
                    boolean z6 = gbniVarM12120h.f64730zy[i4] != bek6Var.ni7();
                    boolean z7 = z6 || (!z6 && bek6Var.mo11548g()) || bek6Var.isReady() || bek6Var.zy();
                    z3 = z3 && z7;
                    if (!z7) {
                        bek6Var.qrj();
                    }
                }
                i4++;
            }
        } else {
            gbniVarM12120h.f20482k.t8r();
            z2 = true;
            z3 = true;
        }
        long j2 = gbniVarM12120h.f20481g.f23762n;
        boolean z8 = z2 && gbniVarM12120h.f20485q && (j2 == C3548p.f65257toq || j2 <= this.f67295bo.f64851t8r);
        if (z8 && this.f67294ab) {
            this.f67294ab = false;
            v0af(false, this.f67295bo.f64850qrj, false, 5);
        }
        if (z8 && gbniVarM12120h.f20481g.f23764s) {
            zkd(4);
            vep5();
        } else if (this.f67295bo.f20588n == 2 && ktq(z3)) {
            zkd(3);
            this.bq = null;
            if (jz5()) {
                bek6();
            }
        } else if (this.f67295bo.f20588n == 3 && (this.as != 0 ? !z3 : !m13957l())) {
            this.bb = jz5();
            zkd(2);
            if (this.bb) {
                m13949b();
                this.f23707a.mo12164q();
            }
            vep5();
        }
        if (this.f67295bo.f20588n == 2) {
            int i5 = 0;
            while (true) {
                bek6[] bek6VarArr2 = this.f23717k;
                if (i5 >= bek6VarArr2.length) {
                    break;
                }
                if (ncyb(bek6VarArr2[i5]) && this.f23717k[i5].ni7() == gbniVarM12120h.f64730zy[i5]) {
                    this.f23717k[i5].qrj();
                }
                i5++;
            }
            kcsr kcsrVar = this.f67295bo;
            if (!kcsrVar.f64845f7l8 && kcsrVar.f64846ki < 500000 && x9kr()) {
                throw new IllegalStateException("Playback stuck buffering and not loading");
            }
        }
        boolean z9 = this.bl;
        kcsr kcsrVar2 = this.f67295bo;
        if (z9 != kcsrVar2.f64847kja0) {
            this.f67295bo = kcsrVar2.m12154q(z9);
        }
        if ((jz5() && this.f67295bo.f20588n == 3) || (i2 = this.f67295bo.f20588n) == 2) {
            z5 = !uv6(qVar, 10L);
        } else {
            if (this.as == 0 || i2 == 4) {
                this.f23714h.kja0(2);
            } else {
                ikck(qVar, 1000L);
            }
            z5 = false;
        }
        kcsr kcsrVar3 = this.f67295bo;
        if (kcsrVar3.f20586h != z5) {
            this.f67295bo = kcsrVar3.m12155s(z5);
        }
        this.in = false;
        com.google.android.exoplayer2.util.n5r1.zy();
    }

    private void h7am(boolean z2, boolean z3) {
        t8iq(z2 || !this.id, false, true, false);
        this.f23728v.toq(z3 ? 1 : 0);
        this.f23725s.f7l8();
        zkd(1);
    }

    private void hb() {
        gbni gbniVarCdj = this.f23719m.cdj();
        if (gbniVarCdj == null) {
            return;
        }
        int i2 = 0;
        if (gbniVarCdj.m12074p() != null && !this.f67294ab) {
            if (dd()) {
                if (gbniVarCdj.m12074p().f20485q || this.az >= gbniVarCdj.m12074p().qrj()) {
                    com.google.android.exoplayer2.trackselection.ni7 ni7VarKja0 = gbniVarCdj.kja0();
                    gbni gbniVarZy = this.f23719m.zy();
                    com.google.android.exoplayer2.trackselection.ni7 ni7VarKja02 = gbniVarZy.kja0();
                    if (gbniVarZy.f20485q && gbniVarZy.f20482k.qrj() != C3548p.f65257toq) {
                        d8wk(gbniVarZy.qrj());
                        return;
                    }
                    for (int i3 = 0; i3 < this.f23717k.length; i3++) {
                        boolean zZy = ni7VarKja0.zy(i3);
                        boolean zZy2 = ni7VarKja02.zy(i3);
                        if (zZy && !this.f23717k[i3].n7h()) {
                            boolean z2 = this.f23720n[i3].mo11551n() == -2;
                            h7am h7amVar = ni7VarKja0.f66060toq[i3];
                            h7am h7amVar2 = ni7VarKja02.f66060toq[i3];
                            if (!zZy2 || !h7amVar2.equals(h7amVar) || z2) {
                                g1(this.f23717k[i3], gbniVarZy.qrj());
                            }
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (!gbniVarCdj.f20481g.f23764s && !this.f67294ab) {
            return;
        }
        while (true) {
            bek6[] bek6VarArr = this.f23717k;
            if (i2 >= bek6VarArr.length) {
                return;
            }
            bek6 bek6Var = bek6VarArr[i2];
            InterfaceC3603j interfaceC3603j = gbniVarCdj.f64730zy[i2];
            if (interfaceC3603j != null && bek6Var.ni7() == interfaceC3603j && bek6Var.mo11548g()) {
                long j2 = gbniVarCdj.f20481g.f23762n;
                g1(bek6Var, (j2 == C3548p.f65257toq || j2 == Long.MIN_VALUE) ? -9223372036854775807L : gbniVarCdj.x2() + gbniVarCdj.f20481g.f23762n);
            }
            i2++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean hyr() {
        return Boolean.valueOf(this.f23710d);
    }

    /* JADX INFO: renamed from: i */
    private void m13955i(bek6 bek6Var) throws ki {
        if (bek6Var.getState() == 2) {
            bek6Var.stop();
        }
    }

    private void i9jn(boolean z2) {
        if (z2 == this.bl) {
            return;
        }
        this.bl = z2;
        kcsr kcsrVar = this.f67295bo;
        int i2 = kcsrVar.f20588n;
        if (z2 || i2 == 4 || i2 == 1) {
            this.f67295bo = kcsrVar.m12154q(z2);
        } else {
            this.f23714h.qrj(2);
        }
    }

    private void ikck(long j2, long j3) {
        this.f23714h.kja0(2);
        this.f23714h.n7h(2, j2 + j3);
    }

    private void ixz(float f2) {
        for (gbni gbniVarM12120h = this.f23719m.m12120h(); gbniVarM12120h != null; gbniVarM12120h = gbniVarM12120h.m12074p()) {
            for (InterfaceC3715s interfaceC3715s : gbniVarM12120h.kja0().f66061zy) {
                if (interfaceC3715s != null) {
                    interfaceC3715s.mo13136s(f2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: j */
    private void m13956j() throws ki {
        gbni gbniVarCdj = this.f23719m.cdj();
        if (gbniVarCdj == null || this.f23719m.m12120h() == gbniVarCdj || gbniVarCdj.f64723f7l8 || !nmn5()) {
            return;
        }
        ki();
    }

    private void jbh(pc pcVar, fti.C3596k c3596k, pc pcVar2, fti.C3596k c3596k2, long j2) {
        if (pcVar.ni7() || !b3e(pcVar, c3596k)) {
            float f2 = this.f23709c.f7l8().f21216k;
            se seVar = this.f67295bo.f64849n7h;
            if (f2 != seVar.f21216k) {
                this.f23709c.ld6(seVar);
                return;
            }
            return;
        }
        pcVar.m12484i(pcVar.x2(c3596k.f21225k, this.f23724r).f21151n, this.f23726t);
        this.f23707a.mo12162k((tfm.f7l8) com.google.android.exoplayer2.util.lrht.ld6(this.f23726t.f21140t));
        if (j2 != C3548p.f65257toq) {
            this.f23707a.mo12163n(o1t(pcVar, c3596k.f21225k, j2));
            return;
        }
        if (com.google.android.exoplayer2.util.lrht.zy(pcVar2.ni7() ? null : pcVar2.m12484i(pcVar2.x2(c3596k2.f21225k, this.f23724r).f21151n, this.f23726t).f21133k, this.f23726t.f21133k)) {
            return;
        }
        this.f23707a.mo12163n(C3548p.f65257toq);
    }

    private long jk() {
        return a9(this.f67295bo.f64844cdj);
    }

    private void jp0y(IOException iOException, int i2) {
        ki kiVarCreateForSource = ki.createForSource(iOException, i2);
        gbni gbniVarM12120h = this.f23719m.m12120h();
        if (gbniVarM12120h != null) {
            kiVarCreateForSource = kiVarCreateForSource.copyWithMediaPeriodId(gbniVarM12120h.f20481g.f23761k);
        }
        com.google.android.exoplayer2.util.ni7.m13700n(ad, "Playback error", kiVarCreateForSource);
        h7am(false, false);
        this.f67295bo = this.f67295bo.m12150g(kiVarCreateForSource);
    }

    private boolean jz5() {
        kcsr kcsrVar = this.f67295bo;
        return kcsrVar.f64853x2 && kcsrVar.f64850qrj == 0;
    }

    private void ki() throws ki {
        t8r(new boolean[this.f23717k.length]);
    }

    private void kja0(bek6 bek6Var) throws ki {
        if (ncyb(bek6Var)) {
            this.f23709c.m12526k(bek6Var);
            m13955i(bek6Var);
            bek6Var.mo11552q();
            this.as--;
        }
    }

    private boolean ktq(boolean z2) {
        if (this.as == 0) {
            return m13957l();
        }
        if (!z2) {
            return false;
        }
        kcsr kcsrVar = this.f67295bo;
        if (!kcsrVar.f64845f7l8) {
            return true;
        }
        long jZy = b3e(kcsrVar.f20587k, this.f23719m.m12120h().f20481g.f23761k) ? this.f23707a.zy() : C3548p.f65257toq;
        gbni gbniVarM12121p = this.f23719m.m12121p();
        return (gbniVarM12121p.cdj() && gbniVarM12121p.f20481g.f23764s) || (gbniVarM12121p.f20481g.f23761k.zy() && !gbniVarM12121p.f20485q) || this.f23725s.mo12062n(jk(), this.f23709c.f7l8().f21216k, this.bb, jZy);
    }

    /* JADX INFO: renamed from: l */
    private boolean m13957l() {
        gbni gbniVarM12120h = this.f23719m.m12120h();
        long j2 = gbniVarM12120h.f20481g.f23762n;
        return gbniVarM12120h.f20485q && (j2 == C3548p.f65257toq || this.f67295bo.f64851t8r < j2 || !jz5());
    }

    private void lrht() {
        this.f23728v.m13973q(this.f67295bo);
        if (this.f23728v.f23739k) {
            this.f23721o.mo11545k(this.f23728v);
            this.f23728v = new C3904n(this.f67295bo);
        }
    }

    private void lv5() throws ki {
        float f2 = this.f23709c.f7l8().f21216k;
        gbni gbniVarCdj = this.f23719m.cdj();
        boolean z2 = true;
        for (gbni gbniVarM12120h = this.f23719m.m12120h(); gbniVarM12120h != null && gbniVarM12120h.f20485q; gbniVarM12120h = gbniVarM12120h.m12074p()) {
            com.google.android.exoplayer2.trackselection.ni7 ni7VarZurt = gbniVarM12120h.zurt(f2, this.f67295bo.f20587k);
            if (!ni7VarZurt.m13149k(gbniVarM12120h.kja0())) {
                if (z2) {
                    gbni gbniVarM12120h2 = this.f23719m.m12120h();
                    boolean zO1t = this.f23719m.o1t(gbniVarM12120h2);
                    boolean[] zArr = new boolean[this.f23717k.length];
                    long qVar = gbniVarM12120h2.toq(ni7VarZurt, this.f67295bo.f64851t8r, zO1t, zArr);
                    kcsr kcsrVar = this.f67295bo;
                    boolean z3 = (kcsrVar.f20588n == 4 || qVar == kcsrVar.f64851t8r) ? false : true;
                    kcsr kcsrVar2 = this.f67295bo;
                    this.f67295bo = lvui(kcsrVar2.f64852toq, qVar, kcsrVar2.f64854zy, kcsrVar2.f20590q, z3, 5);
                    if (z3) {
                        bo(qVar);
                    }
                    boolean[] zArr2 = new boolean[this.f23717k.length];
                    int i2 = 0;
                    while (true) {
                        bek6[] bek6VarArr = this.f23717k;
                        if (i2 >= bek6VarArr.length) {
                            break;
                        }
                        bek6 bek6Var = bek6VarArr[i2];
                        boolean zNcyb = ncyb(bek6Var);
                        zArr2[i2] = zNcyb;
                        InterfaceC3603j interfaceC3603j = gbniVarM12120h2.f64730zy[i2];
                        if (zNcyb) {
                            if (interfaceC3603j != bek6Var.ni7()) {
                                kja0(bek6Var);
                            } else if (zArr[i2]) {
                                bek6Var.mo11554z(this.az);
                            }
                        }
                        i2++;
                    }
                    t8r(zArr2);
                } else {
                    this.f23719m.o1t(gbniVarM12120h);
                    if (gbniVarM12120h.f20485q) {
                        gbniVarM12120h.m12073k(ni7VarZurt, Math.max(gbniVarM12120h.f20481g.f67308toq, gbniVarM12120h.m12077z(this.az)), false);
                    }
                }
                gvn7(true);
                if (this.f67295bo.f20588n != 4) {
                    m13950c();
                    wx16();
                    this.f23714h.qrj(2);
                    return;
                }
                return;
            }
            if (gbniVarM12120h == gbniVarCdj) {
                z2 = false;
            }
        }
    }

    @InterfaceC7839p
    private kcsr lvui(fti.C3596k c3596k, long j2, long j3, long j4, boolean z2, int i2) {
        List<Metadata> listOf;
        C3629x c3629x;
        com.google.android.exoplayer2.trackselection.ni7 ni7Var;
        this.ax = (!this.ax && j2 == this.f67295bo.f64851t8r && c3596k.equals(this.f67295bo.f64852toq)) ? false : true;
        m13965u();
        kcsr kcsrVar = this.f67295bo;
        C3629x c3629x2 = kcsrVar.f20592y;
        com.google.android.exoplayer2.trackselection.ni7 ni7Var2 = kcsrVar.f20591s;
        List<Metadata> list = kcsrVar.f20589p;
        if (this.f23708b.m12182i()) {
            gbni gbniVarM12120h = this.f23719m.m12120h();
            C3629x c3629xN7h = gbniVarM12120h == null ? C3629x.f21698g : gbniVarM12120h.n7h();
            com.google.android.exoplayer2.trackselection.ni7 ni7VarKja0 = gbniVarM12120h == null ? this.f23731y : gbniVarM12120h.kja0();
            com.google.common.collect.se<Metadata> seVarNi7 = ni7(ni7VarKja0.f66061zy);
            if (gbniVarM12120h != null) {
                zsr0 zsr0Var = gbniVarM12120h.f20481g;
                if (zsr0Var.f67309zy != j3) {
                    gbniVarM12120h.f20481g = zsr0Var.m13977k(j3);
                }
            }
            c3629x = c3629xN7h;
            ni7Var = ni7VarKja0;
            listOf = seVarNi7;
        } else if (c3596k.equals(this.f67295bo.f64852toq)) {
            listOf = list;
            c3629x = c3629x2;
            ni7Var = ni7Var2;
        } else {
            c3629x = C3629x.f21698g;
            ni7Var = this.f23731y;
            listOf = com.google.common.collect.se.of();
        }
        if (z2) {
            this.f23728v.m13972n(i2);
        }
        return this.f67295bo.zy(c3596k, j2, j3, j4, jk(), c3629x, ni7Var, listOf);
    }

    /* JADX INFO: renamed from: m */
    private void m13958m(zy zyVar) throws Throwable {
        this.f23728v.toq(1);
        d3(this.f23708b.fu4(zyVar.f23749k, zyVar.f67305toq, zyVar.f67306zy, zyVar.f23750q), false);
    }

    private void mbx() {
        gbni gbniVarM12121p = this.f23719m.m12121p();
        boolean z2 = this.bp || (gbniVarM12121p != null && gbniVarM12121p.f20482k.mo12596k());
        kcsr kcsrVar = this.f67295bo;
        if (z2 != kcsrVar.f64845f7l8) {
            this.f67295bo = kcsrVar.m12151k(z2);
        }
    }

    private void mu(boolean z2) throws ki {
        fti.C3596k c3596k = this.f23719m.m12120h().f20481g.f23761k;
        long jFnq8 = fnq8(c3596k, this.f67295bo.f64851t8r, true, false);
        if (jFnq8 != this.f67295bo.f64851t8r) {
            kcsr kcsrVar = this.f67295bo;
            this.f67295bo = lvui(c3596k, jFnq8, kcsrVar.f64854zy, kcsrVar.f20590q, z2, 5);
        }
    }

    private static boolean n5r1(kcsr kcsrVar, pc.toq toqVar) {
        fti.C3596k c3596k = kcsrVar.f64852toq;
        pc pcVar = kcsrVar.f20587k;
        return pcVar.ni7() || pcVar.x2(c3596k.f21225k, toqVar).f21154s;
    }

    private void n7h(uj2j uj2jVar) throws ki {
        if (uj2jVar.x2()) {
            return;
        }
        try {
            uj2jVar.m13355s().x2(uj2jVar.ld6(), uj2jVar.f7l8());
        } finally {
            uj2jVar.qrj(true);
        }
    }

    private static boolean ncyb(bek6 bek6Var) {
        return bek6Var.getState() != 0;
    }

    private com.google.common.collect.se<Metadata> ni7(InterfaceC3715s[] interfaceC3715sArr) {
        se.C4520k c4520k = new se.C4520k();
        boolean z2 = false;
        for (InterfaceC3715s interfaceC3715s : interfaceC3715sArr) {
            if (interfaceC3715s != null) {
                Metadata metadata = interfaceC3715s.f7l8(0).f23690z;
                if (metadata == null) {
                    c4520k.mo15569k(new Metadata(new Metadata.Entry[0]));
                } else {
                    c4520k.mo15569k(metadata);
                    z2 = true;
                }
            }
        }
        return z2 ? c4520k.mo15570n() : com.google.common.collect.se.of();
    }

    private boolean nmn5() throws ki {
        gbni gbniVarCdj = this.f23719m.cdj();
        com.google.android.exoplayer2.trackselection.ni7 ni7VarKja0 = gbniVarCdj.kja0();
        int i2 = 0;
        boolean z2 = false;
        while (true) {
            bek6[] bek6VarArr = this.f23717k;
            if (i2 >= bek6VarArr.length) {
                return !z2;
            }
            bek6 bek6Var = bek6VarArr[i2];
            if (ncyb(bek6Var)) {
                boolean z3 = bek6Var.ni7() != gbniVarCdj.f64730zy[i2];
                if (!ni7VarKja0.zy(i2) || z3) {
                    if (!bek6Var.n7h()) {
                        bek6Var.kja0(m13968z(ni7VarKja0.f66061zy[i2]), gbniVarCdj.f64730zy[i2], gbniVarCdj.qrj(), gbniVarCdj.x2());
                    } else if (bek6Var.zy()) {
                        kja0(bek6Var);
                    } else {
                        z2 = true;
                    }
                }
            }
            i2++;
        }
    }

    private void nn86() throws ki {
        boolean z2 = false;
        while (bz2()) {
            if (z2) {
                lrht();
            }
            gbni gbniVarM12120h = this.f23719m.m12120h();
            gbni qVar = this.f23719m.toq();
            zsr0 zsr0Var = qVar.f20481g;
            fti.C3596k c3596k = zsr0Var.f23761k;
            long j2 = zsr0Var.f67308toq;
            kcsr kcsrVarLvui = lvui(c3596k, j2, zsr0Var.f67309zy, j2, true, 0);
            this.f67295bo = kcsrVarLvui;
            pc pcVar = kcsrVarLvui.f20587k;
            jbh(pcVar, qVar.f20481g.f23761k, pcVar, gbniVarM12120h.f20481g.f23761k, C3548p.f65257toq);
            m13965u();
            wx16();
            z2 = true;
        }
    }

    /* JADX INFO: renamed from: o */
    private void m13960o() throws Throwable {
        d3(this.f23708b.m12183p(), true);
    }

    private long o1t(pc pcVar, Object obj, long j2) {
        pcVar.m12484i(pcVar.x2(obj, this.f23724r).f21151n, this.f23726t);
        pc.C3550q c3550q = this.f23726t;
        if (c3550q.f21139s != C3548p.f65257toq && c3550q.ld6()) {
            pc.C3550q c3550q2 = this.f23726t;
            if (c3550q2.f21131i) {
                return com.google.android.exoplayer2.util.lrht.v0af(c3550q2.m12491q() - this.f23726t.f21139s) - (j2 + this.f23724r.ki());
            }
        }
        return C3548p.f65257toq;
    }

    private void oc(com.google.android.exoplayer2.source.jk jkVar) throws ki {
        if (this.f23719m.zurt(jkVar)) {
            gbni gbniVarM12121p = this.f23719m.m12121p();
            gbniVarM12121p.m12071h(this.f23709c.f7l8().f21216k, this.f67295bo.f20587k);
            yl(gbniVarM12121p.n7h(), gbniVarM12121p.kja0());
            if (gbniVarM12121p == this.f23719m.m12120h()) {
                bo(gbniVarM12121p.f20481g.f67308toq);
                ki();
                kcsr kcsrVar = this.f67295bo;
                fti.C3596k c3596k = kcsrVar.f64852toq;
                long j2 = gbniVarM12121p.f20481g.f67308toq;
                this.f67295bo = lvui(c3596k, j2, kcsrVar.f64854zy, j2, false, 5);
            }
            m13950c();
        }
    }

    /* JADX INFO: renamed from: p */
    private void m13961p(toq toqVar, int i2) throws Throwable {
        this.f23728v.toq(1);
        m4 m4Var = this.f23708b;
        if (i2 == -1) {
            i2 = m4Var.ki();
        }
        d3(m4Var.m12181g(i2, toqVar.f23746k, toqVar.f67301toq), false);
    }

    private long qkj8(fti.C3596k c3596k, long j2, boolean z2) throws ki {
        return fnq8(c3596k, j2, this.f23719m.m12120h() != this.f23719m.cdj(), z2);
    }

    private void qo(uj2j uj2jVar) throws ki {
        if (uj2jVar.m13356y() == C3548p.f65257toq) {
            tfm(uj2jVar);
            return;
        }
        if (this.f67295bo.f20587k.ni7()) {
            this.f23711e.add(new C3905q(uj2jVar));
            return;
        }
        C3905q c3905q = new C3905q(uj2jVar);
        pc pcVar = this.f67295bo.f20587k;
        if (!c8jq(c3905q, pcVar, pcVar, this.bv, this.an, this.f23726t, this.f23724r)) {
            uj2jVar.qrj(false);
        } else {
            this.f23711e.add(c3905q);
            Collections.sort(this.f23711e);
        }
    }

    private void qrj() throws ki {
        mu(true);
    }

    /* JADX INFO: renamed from: r */
    private boolean m13962r(bek6 bek6Var, gbni gbniVar) {
        gbni gbniVarM12074p = gbniVar.m12074p();
        return gbniVar.f20481g.f23760g && gbniVarM12074p.f20485q && ((bek6Var instanceof com.google.android.exoplayer2.text.kja0) || bek6Var.fu4() >= gbniVarM12074p.qrj());
    }

    private void r8s8(boolean z2) throws ki {
        this.f23729w = z2;
        m13965u();
        if (!this.f67294ab || this.f23719m.cdj() == this.f23719m.m12120h()) {
            return;
        }
        mu(true);
        gvn7(false);
    }

    private void sok(se seVar) throws ki {
        this.f23709c.ld6(seVar);
        d2ok(this.f23709c.f7l8(), true);
    }

    /* JADX INFO: renamed from: t */
    private Pair<fti.C3596k, Long> m13964t(pc pcVar) {
        if (pcVar.ni7()) {
            return Pair.create(kcsr.x2(), 0L);
        }
        Pair<Object, Long> pairN7h = pcVar.n7h(this.f23726t, this.f23724r, pcVar.mo12148n(this.an), C3548p.f65257toq);
        fti.C3596k c3596kWvg = this.f23719m.wvg(pcVar, pairN7h.first, 0L);
        long jLongValue = ((Long) pairN7h.second).longValue();
        if (c3596kWvg.zy()) {
            pcVar.x2(c3596kWvg.f21225k, this.f23724r);
            jLongValue = c3596kWvg.f65326zy == this.f23724r.kja0(c3596kWvg.f65325toq) ? this.f23724r.m12499p() : 0L;
        }
        return Pair.create(c3596kWvg, Long.valueOf(jLongValue));
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a2 A[PHI: r4 r5 r7
      0x00a2: PHI (r4v3 com.google.android.exoplayer2.source.fti$k) = (r4v2 com.google.android.exoplayer2.source.fti$k), (r4v9 com.google.android.exoplayer2.source.fti$k) binds: [B:30:0x0079, B:32:0x009e] A[DONT_GENERATE, DONT_INLINE]
      0x00a2: PHI (r5v2 long) = (r5v1 long), (r5v5 long) binds: [B:30:0x0079, B:32:0x009e] A[DONT_GENERATE, DONT_INLINE]
      0x00a2: PHI (r7v3 long) = (r7v2 long), (r7v5 long) binds: [B:30:0x0079, B:32:0x009e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void t8iq(boolean r30, boolean r31, boolean r32, boolean r33) {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.y2.t8iq(boolean, boolean, boolean, boolean):void");
    }

    private void t8r(boolean[] zArr) throws ki {
        gbni gbniVarCdj = this.f23719m.cdj();
        com.google.android.exoplayer2.trackselection.ni7 ni7VarKja0 = gbniVarCdj.kja0();
        for (int i2 = 0; i2 < this.f23717k.length; i2++) {
            if (!ni7VarKja0.zy(i2) && this.f23723q.remove(this.f23717k[i2])) {
                this.f23717k[i2].reset();
            }
        }
        for (int i3 = 0; i3 < this.f23717k.length; i3++) {
            if (ni7VarKja0.zy(i3)) {
                cdj(i3, zArr[i3]);
            }
        }
        gbniVarCdj.f64723f7l8 = true;
    }

    private void tfm(uj2j uj2jVar) throws ki {
        if (uj2jVar.m13352n() != this.f23732z) {
            this.f23714h.f7l8(15, uj2jVar).mo13642k();
            return;
        }
        n7h(uj2jVar);
        int i2 = this.f67295bo.f20588n;
        if (i2 == 3 || i2 == 2) {
            this.f23714h.qrj(2);
        }
    }

    /* JADX INFO: renamed from: u */
    private void m13965u() {
        gbni gbniVarM12120h = this.f23719m.m12120h();
        this.f67294ab = gbniVarM12120h != null && gbniVarM12120h.f20481g.f23765y && this.f23729w;
    }

    private void uc() throws IOException, ki {
        if (this.f67295bo.f20587k.ni7() || !this.f23708b.m12182i()) {
            return;
        }
        m13951e();
        hb();
        m13956j();
        nn86();
    }

    private boolean uj2j() {
        if (!x9kr()) {
            return false;
        }
        gbni gbniVarM12121p = this.f23719m.m12121p();
        return this.f23725s.mo12064s(gbniVarM12121p == this.f23719m.m12120h() ? gbniVarM12121p.m12077z(this.az) : gbniVarM12121p.m12077z(this.az) - gbniVarM12121p.f20481g.f67308toq, a9(gbniVarM12121p.ld6()), this.f23709c.f7l8().f21216k);
    }

    private boolean uv6(long j2, long j3) {
        if (this.bl && this.in) {
            return false;
        }
        ikck(j2, j3);
        return true;
    }

    @zy.dd
    /* JADX INFO: renamed from: v */
    static Object m13966v(pc.C3550q c3550q, pc.toq toqVar, int i2, boolean z2, Object obj, pc pcVar, pc pcVar2) {
        int iMo12147g = pcVar.mo12147g(obj);
        int iQrj = pcVar.qrj();
        int iM12486y = iMo12147g;
        int iMo12147g2 = -1;
        for (int i3 = 0; i3 < iQrj && iMo12147g2 == -1; i3++) {
            iM12486y = pcVar.m12486y(iM12486y, toqVar, c3550q, i2, z2);
            if (iM12486y == -1) {
                break;
            }
            iMo12147g2 = pcVar2.mo12147g(pcVar.t8r(iM12486y));
        }
        if (iMo12147g2 == -1) {
            return null;
        }
        return pcVar2.t8r(iMo12147g2);
    }

    private void v0af(boolean z2, int i2, boolean z3, int i3) throws ki {
        this.f23728v.toq(z3 ? 1 : 0);
        this.f23728v.zy(i3);
        this.f67295bo = this.f67295bo.m12152n(z2, i2);
        this.bb = false;
        y9n(z2);
        if (!jz5()) {
            vep5();
            wx16();
            return;
        }
        int i4 = this.f67295bo.f20588n;
        if (i4 == 3) {
            bek6();
            this.f23714h.qrj(2);
        } else if (i4 == 2) {
            this.f23714h.qrj(2);
        }
    }

    private void vep5() throws ki {
        this.f23709c.m12525g();
        for (bek6 bek6Var : this.f23717k) {
            if (ncyb(bek6Var)) {
                m13955i(bek6Var);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00ac A[Catch: all -> 0x0148, TryCatch #1 {all -> 0x0148, blocks: (B:22:0x00a2, B:24:0x00ac, B:27:0x00b2, B:29:0x00b8, B:30:0x00bb, B:32:0x00c1, B:34:0x00cb, B:36:0x00d3, B:40:0x00db, B:42:0x00e5, B:44:0x00f5, B:48:0x00ff, B:52:0x0111, B:56:0x011a), top: B:74:0x00a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void vq(com.google.android.exoplayer2.y2.C3906y r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.y2.vq(com.google.android.exoplayer2.y2$y):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0045, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0074, code lost:
    
        r3 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void vyq(long r8, long r10) throws com.google.android.exoplayer2.ki {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.y2.vyq(long, long):void");
    }

    private void w831(int i2) throws ki {
        this.bv = i2;
        if (!this.f23719m.jp0y(this.f67295bo.f20587k, i2)) {
            mu(true);
        }
        gvn7(false);
    }

    private void wo(final uj2j uj2jVar) {
        Looper looperM13352n = uj2jVar.m13352n();
        if (looperM13352n.getThread().isAlive()) {
            this.f23716j.zy(looperM13352n, null).ld6(new Runnable() { // from class: com.google.android.exoplayer2.u
                @Override // java.lang.Runnable
                public final void run() {
                    this.f22349k.m13952f(uj2jVar);
                }
            });
        } else {
            com.google.android.exoplayer2.util.ni7.qrj("TAG", "Trying to send message on a dead thread.");
            uj2jVar.qrj(false);
        }
    }

    private long wvg() {
        gbni gbniVarCdj = this.f23719m.cdj();
        if (gbniVarCdj == null) {
            return 0L;
        }
        long jX2 = gbniVarCdj.x2();
        if (!gbniVarCdj.f20485q) {
            return jX2;
        }
        int i2 = 0;
        while (true) {
            bek6[] bek6VarArr = this.f23717k;
            if (i2 >= bek6VarArr.length) {
                return jX2;
            }
            if (ncyb(bek6VarArr[i2]) && this.f23717k[i2].ni7() == gbniVarCdj.f64730zy[i2]) {
                long jFu4 = this.f23717k[i2].fu4();
                if (jFu4 == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                jX2 = Math.max(jFu4, jX2);
            }
            i2++;
        }
    }

    private void wx16() throws ki {
        gbni gbniVarM12120h = this.f23719m.m12120h();
        if (gbniVarM12120h == null) {
            return;
        }
        long jQrj = gbniVarM12120h.f20485q ? gbniVarM12120h.f20482k.qrj() : -9223372036854775807L;
        if (jQrj != C3548p.f65257toq) {
            bo(jQrj);
            if (jQrj != this.f67295bo.f64851t8r) {
                kcsr kcsrVar = this.f67295bo;
                this.f67295bo = lvui(kcsrVar.f64852toq, jQrj, kcsrVar.f64854zy, jQrj, true, 5);
            }
        } else {
            long jM12528y = this.f23709c.m12528y(gbniVarM12120h != this.f23719m.cdj());
            this.az = jM12528y;
            long jM12077z = gbniVarM12120h.m12077z(jM12528y);
            vyq(this.f67295bo.f64851t8r, jM12077z);
            this.f67295bo.f64851t8r = jM12077z;
        }
        this.f67295bo.f64844cdj = this.f23719m.m12121p().m12076s();
        this.f67295bo.f64846ki = jk();
        kcsr kcsrVar2 = this.f67295bo;
        if (kcsrVar2.f64853x2 && kcsrVar2.f20588n == 3 && b3e(kcsrVar2.f20587k, kcsrVar2.f64852toq) && this.f67295bo.f64849n7h.f21216k == 1.0f) {
            float qVar = this.f23707a.toq(fu4(), jk());
            if (this.f23709c.f7l8().f21216k != qVar) {
                this.f23709c.ld6(this.f67295bo.f64849n7h.m12550n(qVar));
                eqxt(this.f67295bo.f64849n7h, this.f23709c.f7l8().f21216k, false, false);
            }
        }
    }

    /* JADX INFO: renamed from: x */
    private void m13967x(int i2, int i3, InterfaceC3612m interfaceC3612m) throws Throwable {
        this.f23728v.toq(1);
        d3(this.f23708b.mcp(i2, i3, interfaceC3612m), false);
    }

    private boolean x9kr() {
        gbni gbniVarM12121p = this.f23719m.m12121p();
        return (gbniVarM12121p == null || gbniVarM12121p.ld6() == Long.MIN_VALUE) ? false : true;
    }

    @zy.dd
    private static Pair<Object, Long> xwq3(pc pcVar, C3906y c3906y, boolean z2, int i2, boolean z3, pc.C3550q c3550q, pc.toq toqVar) {
        Pair<Object, Long> pairN7h;
        Object objM13966v;
        pc pcVar2 = c3906y.f23748k;
        if (pcVar.ni7()) {
            return null;
        }
        pc pcVar3 = pcVar2.ni7() ? pcVar : pcVar2;
        try {
            pairN7h = pcVar3.n7h(c3550q, toqVar, c3906y.f67303toq, c3906y.f67304zy);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (pcVar.equals(pcVar3)) {
            return pairN7h;
        }
        if (pcVar.mo12147g(pairN7h.first) != -1) {
            return (pcVar3.x2(pairN7h.first, toqVar).f21154s && pcVar3.m12484i(toqVar.f21151n, c3550q).f21126c == pcVar3.mo12147g(pairN7h.first)) ? pcVar.n7h(c3550q, toqVar, pcVar.x2(pairN7h.first, toqVar).f21151n, c3906y.f67304zy) : pairN7h;
        }
        if (z2 && (objM13966v = m13966v(c3550q, toqVar, i2, z3, pairN7h.first, pcVar3, pcVar)) != null) {
            return pcVar.n7h(c3550q, toqVar, pcVar.x2(objM13966v, toqVar).f21151n, C3548p.f65257toq);
        }
        return null;
    }

    private static void y2(pc pcVar, C3905q c3905q, pc.C3550q c3550q, pc.toq toqVar) {
        int i2 = pcVar.m12484i(pcVar.x2(c3905q.f23742g, toqVar).f21151n, c3550q).f21127e;
        Object obj = pcVar.ld6(i2, toqVar, true).f21153q;
        long j2 = toqVar.f21149g;
        c3905q.zy(i2, j2 != C3548p.f65257toq ? j2 - 1 : Long.MAX_VALUE, obj);
    }

    private void y9n(boolean z2) {
        for (gbni gbniVarM12120h = this.f23719m.m12120h(); gbniVarM12120h != null; gbniVarM12120h = gbniVarM12120h.m12074p()) {
            for (InterfaceC3715s interfaceC3715s : gbniVarM12120h.kja0().f66061zy) {
                if (interfaceC3715s != null) {
                    interfaceC3715s.n7h(z2);
                }
            }
        }
    }

    private void yl(C3629x c3629x, com.google.android.exoplayer2.trackselection.ni7 ni7Var) {
        this.f23725s.mo12063q(this.f23717k, c3629x, ni7Var.f66061zy);
    }

    private void yqrt(mbx mbxVar) {
        this.f23727u = mbxVar;
    }

    private void yz() {
        for (gbni gbniVarM12120h = this.f23719m.m12120h(); gbniVarM12120h != null; gbniVarM12120h = gbniVarM12120h.m12074p()) {
            for (InterfaceC3715s interfaceC3715s : gbniVarM12120h.kja0().f66061zy) {
                if (interfaceC3715s != null) {
                    interfaceC3715s.ld6();
                }
            }
        }
    }

    /* JADX INFO: renamed from: z */
    private static xwq3[] m13968z(InterfaceC3715s interfaceC3715s) {
        int length = interfaceC3715s != null ? interfaceC3715s.length() : 0;
        xwq3[] xwq3VarArr = new xwq3[length];
        for (int i2 = 0; i2 < length; i2++) {
            xwq3VarArr[i2] = interfaceC3715s.f7l8(i2);
        }
        return xwq3VarArr;
    }

    private void zkd(int i2) {
        kcsr kcsrVar = this.f67295bo;
        if (kcsrVar.f20588n != i2) {
            this.f67295bo = kcsrVar.m12156y(i2);
        }
    }

    private void zp() {
        t8iq(true, false, true, false);
        this.f23725s.mo12065y();
        zkd(1);
        this.f23715i.quit();
        synchronized (this) {
            this.f23710d = true;
            notifyAll();
        }
    }

    private void zsr0(toq toqVar) throws Throwable {
        this.f23728v.toq(1);
        if (toqVar.f67302zy != -1) {
            this.bg = new C3906y(new jz5(toqVar.f23746k, toqVar.f67301toq), toqVar.f67302zy, toqVar.f23747q);
        }
        d3(this.f23708b.a9(toqVar.f23746k, toqVar.f67301toq), false);
    }

    /* JADX INFO: renamed from: a */
    public synchronized boolean m13969a() {
        if (!this.f23710d && this.f23715i.isAlive()) {
            this.f23714h.qrj(7);
            m28267do(new com.google.common.base.lvui() { // from class: com.google.android.exoplayer2.t8iq
                @Override // com.google.common.base.lvui
                public final Object get() {
                    return this.f21773k.hyr();
                }
            }, this.f23730x);
            return this.f23710d;
        }
        return true;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC3622o.k
    /* JADX INFO: renamed from: bf2, reason: merged with bridge method [inline-methods] */
    public void mo12411y(com.google.android.exoplayer2.source.jk jkVar) {
        this.f23714h.f7l8(9, jkVar).mo13642k();
    }

    public void cfr(int i2) {
        this.f23714h.mo13638p(11, i2, 0).mo13642k();
    }

    public void ch(int i2, int i3, InterfaceC3612m interfaceC3612m) {
        this.f23714h.mo13635g(20, i2, i3, interfaceC3612m).mo13642k();
    }

    public void cv06() {
        this.f23714h.zy(6).mo13642k();
    }

    /* JADX INFO: renamed from: d */
    public void m13970d(pc pcVar, int i2, long j2) {
        this.f23714h.f7l8(3, new C3906y(pcVar, i2, j2)).mo13642k();
    }

    public void ek5k(int i2, int i3, int i4, InterfaceC3612m interfaceC3612m) {
        this.f23714h.f7l8(19, new zy(i2, i3, i4, interfaceC3612m)).mo13642k();
    }

    public void etdu(se seVar) {
        this.f23714h.f7l8(4, seVar).mo13642k();
    }

    public void fn3e(long j2) {
        this.ac = j2;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) throws Throwable {
        int i2;
        gbni gbniVarCdj;
        try {
            switch (message.what) {
                case 0:
                    a98o();
                    break;
                case 1:
                    v0af(message.arg1 != 0, message.arg2, true, 1);
                    break;
                case 2:
                    m13954h();
                    break;
                case 3:
                    vq((C3906y) message.obj);
                    break;
                case 4:
                    sok((se) message.obj);
                    break;
                case 5:
                    yqrt((mbx) message.obj);
                    break;
                case 6:
                    h7am(false, true);
                    break;
                case 7:
                    zp();
                    return true;
                case 8:
                    oc((com.google.android.exoplayer2.source.jk) message.obj);
                    break;
                case 9:
                    fti((com.google.android.exoplayer2.source.jk) message.obj);
                    break;
                case 10:
                    lv5();
                    break;
                case 11:
                    w831(message.arg1);
                    break;
                case 12:
                    bwp(message.arg1 != 0);
                    break;
                case 13:
                    gbni(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    qo((uj2j) message.obj);
                    break;
                case 15:
                    wo((uj2j) message.obj);
                    break;
                case 16:
                    d2ok((se) message.obj, false);
                    break;
                case 17:
                    zsr0((toq) message.obj);
                    break;
                case 18:
                    m13961p((toq) message.obj, message.arg1);
                    break;
                case 19:
                    m13958m((zy) message.obj);
                    break;
                case 20:
                    m13967x(message.arg1, message.arg2, (InterfaceC3612m) message.obj);
                    break;
                case 21:
                    gc3c((InterfaceC3612m) message.obj);
                    break;
                case 22:
                    m13960o();
                    break;
                case 23:
                    r8s8(message.arg1 != 0);
                    break;
                case 24:
                    i9jn(message.arg1 == 1);
                    break;
                case 25:
                    qrj();
                    break;
                default:
                    return false;
            }
        } catch (qrj.C3318k e2) {
            jp0y(e2, e2.errorCode);
        } catch (ki e3) {
            e = e3;
            if (e.type == 1 && (gbniVarCdj = this.f23719m.cdj()) != null) {
                e = e.copyWithMediaPeriodId(gbniVarCdj.f20481g.f23761k);
            }
            if (e.isRecoverable && this.bq == null) {
                com.google.android.exoplayer2.util.ni7.n7h(ad, "Recoverable renderer error", e);
                this.bq = e;
                com.google.android.exoplayer2.util.ki kiVar = this.f23714h;
                kiVar.mo13639q(kiVar.f7l8(25, e));
            } else {
                ki kiVar2 = this.bq;
                if (kiVar2 != null) {
                    kiVar2.addSuppressed(e);
                    e = this.bq;
                }
                com.google.android.exoplayer2.util.ni7.m13700n(ad, "Playback error", e);
                h7am(true, false);
                this.f67295bo = this.f67295bo.m12150g(e);
            }
        } catch (sok e4) {
            int i3 = e4.dataType;
            if (i3 == 1) {
                i2 = e4.contentIsMalformed ? 3001 : 3003;
            } else {
                if (i3 == 4) {
                    i2 = e4.contentIsMalformed ? 3002 : yqrt.ERROR_CODE_PARSING_MANIFEST_UNSUPPORTED;
                }
                jp0y(e4, i);
            }
            i = i2;
            jp0y(e4, i);
        } catch (com.google.android.exoplayer2.source.toq e6) {
            jp0y(e6, 1002);
        } catch (C3796h e7) {
            jp0y(e7, e7.reason);
        } catch (IOException e8) {
            jp0y(e8, 2000);
        } catch (RuntimeException e9) {
            ki kiVarCreateForUnexpected = ki.createForUnexpected(e9, ((e9 instanceof IllegalStateException) || (e9 instanceof IllegalArgumentException)) ? 1004 : 1000);
            com.google.android.exoplayer2.util.ni7.m13700n(ad, "Playback error", kiVarCreateForUnexpected);
            h7am(true, false);
            this.f67295bo = this.f67295bo.m12150g(kiVarCreateForUnexpected);
        }
        lrht();
        return true;
    }

    public void i1() {
        this.f23714h.zy(0).mo13642k();
    }

    @Override // com.google.android.exoplayer2.trackselection.zurt.InterfaceC3717k
    /* JADX INFO: renamed from: k */
    public void mo12454k() {
        this.f23714h.qrj(10);
    }

    public void kcsr(boolean z2) {
        this.f23714h.mo13638p(12, z2 ? 1 : 0, 0).mo13642k();
    }

    @Override // com.google.android.exoplayer2.source.jk.InterfaceC3604k
    public void ld6(com.google.android.exoplayer2.source.jk jkVar) {
        this.f23714h.f7l8(8, jkVar).mo13642k();
    }

    public void ltg8(boolean z2) {
        this.f23714h.mo13638p(23, z2 ? 1 : 0, 0).mo13642k();
    }

    public void m4(boolean z2, int i2) {
        this.f23714h.mo13638p(1, z2 ? 1 : 0, i2).mo13642k();
    }

    public Looper mcp() {
        return this.f23732z;
    }

    public void py(List<m4.zy> list, int i2, long j2, InterfaceC3612m interfaceC3612m) {
        this.f23714h.f7l8(17, new toq(list, interfaceC3612m, i2, j2, null)).mo13642k();
    }

    @Override // com.google.android.exoplayer2.qrj.InterfaceC3553k
    /* JADX INFO: renamed from: q */
    public void mo12529q(se seVar) {
        this.f23714h.f7l8(16, seVar).mo13642k();
    }

    public void se(InterfaceC3612m interfaceC3612m) {
        this.f23714h.f7l8(21, interfaceC3612m).mo13642k();
    }

    @Override // com.google.android.exoplayer2.m4.InterfaceC3456q
    public void toq() {
        this.f23714h.qrj(22);
    }

    public synchronized boolean was(boolean z2) {
        if (!this.f23710d && this.f23715i.isAlive()) {
            if (z2) {
                this.f23714h.mo13638p(13, 1, 0).mo13642k();
                return true;
            }
            final AtomicBoolean atomicBoolean = new AtomicBoolean();
            this.f23714h.mo13635g(13, 0, 0, atomicBoolean).mo13642k();
            m28267do(new com.google.common.base.lvui() { // from class: com.google.android.exoplayer2.bo
                @Override // com.google.common.base.lvui
                public final Object get() {
                    return Boolean.valueOf(atomicBoolean.get());
                }
            }, this.ac);
            return atomicBoolean.get();
        }
        return true;
    }

    public void x2(int i2, List<m4.zy> list, InterfaceC3612m interfaceC3612m) {
        this.f23714h.mo13635g(18, i2, 0, new toq(list, interfaceC3612m, -1, C3548p.f65257toq, null)).mo13642k();
    }

    public void z4(mbx mbxVar) {
        this.f23714h.f7l8(5, mbxVar).mo13642k();
    }

    public void zurt(boolean z2) {
        this.f23714h.mo13638p(24, z2 ? 1 : 0, 0).mo13642k();
    }

    @Override // com.google.android.exoplayer2.uj2j.InterfaceC3769k
    public synchronized void zy(uj2j uj2jVar) {
        if (!this.f23710d && this.f23715i.isAlive()) {
            this.f23714h.f7l8(14, uj2jVar).mo13642k();
            return;
        }
        com.google.android.exoplayer2.util.ni7.qrj(ad, "Ignoring messages sent after release.");
        uj2jVar.qrj(false);
    }
}
