package com.google.android.exoplayer2.source.ads;

import android.os.Handler;
import android.util.Pair;
import com.google.android.exoplayer2.C3548p;
import com.google.android.exoplayer2.C3865v;
import com.google.android.exoplayer2.decoder.C3297s;
import com.google.android.exoplayer2.drm.InterfaceC3312i;
import com.google.android.exoplayer2.mbx;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.pc;
import com.google.android.exoplayer2.source.AbstractC3605k;
import com.google.android.exoplayer2.source.C3564a;
import com.google.android.exoplayer2.source.C3602i;
import com.google.android.exoplayer2.source.C3629x;
import com.google.android.exoplayer2.source.InterfaceC3603j;
import com.google.android.exoplayer2.source.ads.zy;
import com.google.android.exoplayer2.source.fn3e;
import com.google.android.exoplayer2.source.fti;
import com.google.android.exoplayer2.source.jk;
import com.google.android.exoplayer2.source.lvui;
import com.google.android.exoplayer2.source.ni7;
import com.google.android.exoplayer2.source.wvg;
import com.google.android.exoplayer2.tfm;
import com.google.android.exoplayer2.trackselection.InterfaceC3715s;
import com.google.android.exoplayer2.upstream.uv6;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.lrht;
import com.google.android.exoplayer2.xwq3;
import com.google.common.collect.h4b;
import com.google.common.collect.nsb;
import com.google.common.collect.t8r;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import zy.dd;
import zy.o1t;

/* JADX INFO: compiled from: ServerSideInsertedAdsMediaSource.java */
/* JADX INFO: loaded from: classes2.dex */
public final class x2 extends AbstractC3605k implements fti.toq, lvui, InterfaceC3312i {

    /* JADX INFO: renamed from: l */
    @dd
    private pc f21262l;

    /* JADX INFO: renamed from: p */
    private final fti f21263p;

    /* JADX INFO: renamed from: r */
    @dd
    private C3574q f21264r;

    /* JADX INFO: renamed from: t */
    @o1t("this")
    @dd
    private Handler f21265t;

    /* JADX INFO: renamed from: h */
    private final h4b<Long, C3574q> f21260h = t8r.create();

    /* JADX INFO: renamed from: f */
    private com.google.android.exoplayer2.source.ads.zy f21259f = com.google.android.exoplayer2.source.ads.zy.f21298r;

    /* JADX INFO: renamed from: i */
    private final lvui.C3611k f21261i = fn3e(null);

    /* JADX INFO: renamed from: z */
    private final InterfaceC3312i.k f21266z = ki(null);

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.ads.x2$k */
    /* JADX INFO: compiled from: ServerSideInsertedAdsMediaSource.java */
    private static final class C3573k implements jk {

        /* JADX INFO: renamed from: g */
        public final InterfaceC3312i.k f21267g;

        /* JADX INFO: renamed from: k */
        public final C3574q f21268k;

        /* JADX INFO: renamed from: n */
        public final lvui.C3611k f21269n;

        /* JADX INFO: renamed from: p */
        public boolean[] f21270p = new boolean[0];

        /* JADX INFO: renamed from: q */
        public final fti.C3596k f21271q;

        /* JADX INFO: renamed from: s */
        public long f21272s;

        /* JADX INFO: renamed from: y */
        public jk.InterfaceC3604k f21273y;

        public C3573k(C3574q c3574q, fti.C3596k c3596k, lvui.C3611k c3611k, InterfaceC3312i.k kVar) {
            this.f21268k = c3574q;
            this.f21271q = c3596k;
            this.f21269n = c3611k;
            this.f21267g = kVar;
        }

        @Override // com.google.android.exoplayer2.source.jk, com.google.android.exoplayer2.source.InterfaceC3622o
        public void f7l8(long j2) {
            this.f21268k.a9(this, j2);
        }

        @Override // com.google.android.exoplayer2.source.jk
        public C3629x fn3e() {
            return this.f21268k.cdj();
        }

        @Override // com.google.android.exoplayer2.source.jk, com.google.android.exoplayer2.source.InterfaceC3622o
        /* JADX INFO: renamed from: g */
        public long mo12595g() {
            return this.f21268k.m12605p(this);
        }

        @Override // com.google.android.exoplayer2.source.jk, com.google.android.exoplayer2.source.InterfaceC3622o
        /* JADX INFO: renamed from: k */
        public boolean mo12596k() {
            return this.f21268k.ki(this);
        }

        @Override // com.google.android.exoplayer2.source.jk
        public long kja0(InterfaceC3715s[] interfaceC3715sArr, boolean[] zArr, InterfaceC3603j[] interfaceC3603jArr, boolean[] zArr2, long j2) {
            if (this.f21270p.length == 0) {
                this.f21270p = new boolean[interfaceC3603jArr.length];
            }
            return this.f21268k.d3(this, interfaceC3715sArr, zArr, interfaceC3603jArr, zArr2, j2);
        }

        @Override // com.google.android.exoplayer2.source.jk, com.google.android.exoplayer2.source.InterfaceC3622o
        /* JADX INFO: renamed from: n */
        public boolean mo12597n(long j2) {
            return this.f21268k.m12604n(this, j2);
        }

        @Override // com.google.android.exoplayer2.source.jk
        public void n7h(jk.InterfaceC3604k interfaceC3604k, long j2) {
            this.f21273y = interfaceC3604k;
            this.f21268k.m12608t(this, j2);
        }

        @Override // com.google.android.exoplayer2.source.jk
        /* JADX INFO: renamed from: p */
        public List<StreamKey> mo12598p(List<InterfaceC3715s> list) {
            return this.f21268k.kja0(list);
        }

        @Override // com.google.android.exoplayer2.source.jk
        /* JADX INFO: renamed from: q */
        public long mo12599q(long j2, mbx mbxVar) {
            return this.f21268k.m12607s(this, j2, mbxVar);
        }

        @Override // com.google.android.exoplayer2.source.jk
        public long qrj() {
            return this.f21268k.jk(this);
        }

        @Override // com.google.android.exoplayer2.source.jk
        public void t8r() throws IOException {
            this.f21268k.ni7();
        }

        @Override // com.google.android.exoplayer2.source.jk
        public long x2(long j2) {
            return this.f21268k.gvn7(this, j2);
        }

        @Override // com.google.android.exoplayer2.source.jk
        public void zurt(long j2, boolean z2) {
            this.f21268k.m12602g(this, j2, z2);
        }

        @Override // com.google.android.exoplayer2.source.jk, com.google.android.exoplayer2.source.InterfaceC3622o
        public long zy() {
            return this.f21268k.n7h(this);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.ads.x2$q */
    /* JADX INFO: compiled from: ServerSideInsertedAdsMediaSource.java */
    private static final class C3574q implements jk.InterfaceC3604k {

        /* JADX INFO: renamed from: g */
        private com.google.android.exoplayer2.source.ads.zy f21274g;

        /* JADX INFO: renamed from: k */
        private final jk f21277k;

        /* JADX INFO: renamed from: p */
        private boolean f21279p;

        /* JADX INFO: renamed from: s */
        private boolean f21281s;

        /* JADX INFO: renamed from: y */
        @dd
        private C3573k f21282y;

        /* JADX INFO: renamed from: q */
        private final List<C3573k> f21280q = new ArrayList();

        /* JADX INFO: renamed from: n */
        private final Map<Long, Pair<ni7, wvg>> f21278n = new HashMap();

        /* JADX INFO: renamed from: h */
        public InterfaceC3715s[] f21275h = new InterfaceC3715s[0];

        /* JADX INFO: renamed from: i */
        public InterfaceC3603j[] f21276i = new InterfaceC3603j[0];

        /* JADX INFO: renamed from: z */
        public wvg[] f21283z = new wvg[0];

        public C3574q(jk jkVar, com.google.android.exoplayer2.source.ads.zy zyVar) {
            this.f21277k = jkVar;
            this.f21274g = zyVar;
        }

        private int f7l8(wvg wvgVar) {
            String str;
            if (wvgVar.f65468zy == null) {
                return -1;
            }
            int i2 = 0;
            loop0: while (true) {
                InterfaceC3715s[] interfaceC3715sArr = this.f21275h;
                if (i2 >= interfaceC3715sArr.length) {
                    return -1;
                }
                InterfaceC3715s interfaceC3715s = interfaceC3715sArr[i2];
                if (interfaceC3715s != null) {
                    C3564a c3564aQrj = interfaceC3715s.qrj();
                    boolean z2 = wvgVar.f65467toq == 0 && c3564aQrj.equals(cdj().toq(0));
                    for (int i3 = 0; i3 < c3564aQrj.f21222k; i3++) {
                        xwq3 qVar = c3564aQrj.toq(i3);
                        if (qVar.equals(wvgVar.f65468zy) || (z2 && (str = qVar.f23675k) != null && str.equals(wvgVar.f65468zy.f23675k))) {
                            break loop0;
                        }
                    }
                }
                i2++;
            }
            return i2;
        }

        private void fn3e(C3573k c3573k, int i2) {
            wvg wvgVar;
            boolean[] zArr = c3573k.f21270p;
            if (zArr[i2] || (wvgVar = this.f21283z[i2]) == null) {
                return;
            }
            zArr[i2] = true;
            c3573k.f21269n.m12762p(x2.gvn7(c3573k, wvgVar, this.f21274g));
        }

        /* JADX INFO: renamed from: h */
        private long m12600h(C3573k c3573k, long j2) {
            long j3 = c3573k.f21272s;
            return j2 < j3 ? qrj.f7l8(j3, c3573k.f21271q, this.f21274g) - (c3573k.f21272s - j2) : qrj.f7l8(j2, c3573k.f21271q, this.f21274g);
        }

        private long qrj(C3573k c3573k, long j2) {
            if (j2 == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            long jZy = qrj.zy(j2, c3573k.f21271q, this.f21274g);
            if (jZy >= x2.d2ok(c3573k, this.f21274g)) {
                return Long.MIN_VALUE;
            }
            return jZy;
        }

        public void a9(C3573k c3573k, long j2) {
            this.f21277k.f7l8(m12600h(c3573k, j2));
        }

        public C3629x cdj() {
            return this.f21277k.fn3e();
        }

        public long d3(C3573k c3573k, InterfaceC3715s[] interfaceC3715sArr, boolean[] zArr, InterfaceC3603j[] interfaceC3603jArr, boolean[] zArr2, long j2) {
            c3573k.f21272s = j2;
            if (!c3573k.equals(this.f21280q.get(0))) {
                for (int i2 = 0; i2 < interfaceC3715sArr.length; i2++) {
                    InterfaceC3715s interfaceC3715s = interfaceC3715sArr[i2];
                    boolean z2 = true;
                    if (interfaceC3715s != null) {
                        if (zArr[i2] && interfaceC3603jArr[i2] != null) {
                            z2 = false;
                        }
                        zArr2[i2] = z2;
                        if (z2) {
                            interfaceC3603jArr[i2] = lrht.zy(this.f21275h[i2], interfaceC3715s) ? new toq(c3573k, i2) : new C3602i();
                        }
                    } else {
                        interfaceC3603jArr[i2] = null;
                        zArr2[i2] = true;
                    }
                }
                return j2;
            }
            this.f21275h = (InterfaceC3715s[]) Arrays.copyOf(interfaceC3715sArr, interfaceC3715sArr.length);
            long jF7l8 = qrj.f7l8(j2, c3573k.f21271q, this.f21274g);
            InterfaceC3603j[] interfaceC3603jArr2 = this.f21276i;
            InterfaceC3603j[] interfaceC3603jArr3 = interfaceC3603jArr2.length == 0 ? new InterfaceC3603j[interfaceC3715sArr.length] : (InterfaceC3603j[]) Arrays.copyOf(interfaceC3603jArr2, interfaceC3603jArr2.length);
            long jKja0 = this.f21277k.kja0(interfaceC3715sArr, zArr, interfaceC3603jArr3, zArr2, jF7l8);
            this.f21276i = (InterfaceC3603j[]) Arrays.copyOf(interfaceC3603jArr3, interfaceC3603jArr3.length);
            this.f21283z = (wvg[]) Arrays.copyOf(this.f21283z, interfaceC3603jArr3.length);
            for (int i3 = 0; i3 < interfaceC3603jArr3.length; i3++) {
                if (interfaceC3603jArr3[i3] == null) {
                    interfaceC3603jArr[i3] = null;
                    this.f21283z[i3] = null;
                } else if (interfaceC3603jArr[i3] == null || zArr2[i3]) {
                    interfaceC3603jArr[i3] = new toq(c3573k, i3);
                    this.f21283z[i3] = null;
                }
            }
            return qrj.zy(jKja0, c3573k.f21271q, this.f21274g);
        }

        public void eqxt(com.google.android.exoplayer2.source.ads.zy zyVar) {
            this.f21274g = zyVar;
        }

        public void fti(fti ftiVar) {
            ftiVar.mo12564g(this.f21277k);
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC3622o.k
        /* JADX INFO: renamed from: fu4, reason: merged with bridge method [inline-methods] */
        public void mo12411y(jk jkVar) {
            C3573k c3573k = this.f21282y;
            if (c3573k == null) {
                return;
            }
            ((jk.InterfaceC3604k) C3844k.f7l8(c3573k.f21273y)).mo12411y(this.f21282y);
        }

        /* JADX INFO: renamed from: g */
        public void m12602g(C3573k c3573k, long j2, boolean z2) {
            this.f21277k.zurt(qrj.f7l8(j2, c3573k.f21271q, this.f21274g), z2);
        }

        public long gvn7(C3573k c3573k, long j2) {
            return qrj.zy(this.f21277k.x2(qrj.f7l8(j2, c3573k.f21271q, this.f21274g)), c3573k.f21271q, this.f21274g);
        }

        /* JADX INFO: renamed from: i */
        public boolean m12603i() {
            return this.f21280q.isEmpty();
        }

        public long jk(C3573k c3573k) {
            if (!c3573k.equals(this.f21280q.get(0))) {
                return C3548p.f65257toq;
            }
            long jQrj = this.f21277k.qrj();
            return jQrj == C3548p.f65257toq ? C3548p.f65257toq : qrj.zy(jQrj, c3573k.f21271q, this.f21274g);
        }

        public void jp0y(C3573k c3573k) {
            if (c3573k.equals(this.f21282y)) {
                this.f21282y = null;
                this.f21278n.clear();
            }
            this.f21280q.remove(c3573k);
        }

        public boolean ki(C3573k c3573k) {
            return c3573k.equals(this.f21282y) && this.f21277k.mo12596k();
        }

        public List<StreamKey> kja0(List<InterfaceC3715s> list) {
            return this.f21277k.mo12598p(list);
        }

        @Override // com.google.android.exoplayer2.source.jk.InterfaceC3604k
        public void ld6(jk jkVar) {
            this.f21279p = true;
            for (int i2 = 0; i2 < this.f21280q.size(); i2++) {
                C3573k c3573k = this.f21280q.get(i2);
                jk.InterfaceC3604k interfaceC3604k = c3573k.f21273y;
                if (interfaceC3604k != null) {
                    interfaceC3604k.ld6(c3573k);
                }
            }
        }

        public int mcp(C3573k c3573k, int i2, C3865v c3865v, C3297s c3297s, int i3) {
            int iMo12610s = ((InterfaceC3603j) lrht.ld6(this.f21276i[i2])).mo12610s(c3865v, c3297s, i3 | 1 | 4);
            long jQrj = qrj(c3573k, c3297s.f19618s);
            if ((iMo12610s == -4 && jQrj == Long.MIN_VALUE) || (iMo12610s == -3 && m12605p(c3573k) == Long.MIN_VALUE && !c3297s.f19619y)) {
                fn3e(c3573k, i2);
                c3297s.mo11567s();
                c3297s.f7l8(4);
                return -4;
            }
            if (iMo12610s == -4) {
                fn3e(c3573k, i2);
                ((InterfaceC3603j) lrht.ld6(this.f21276i[i2])).mo12610s(c3865v, c3297s, i3);
                c3297s.f19618s = jQrj;
            }
            return iMo12610s;
        }

        /* JADX INFO: renamed from: n */
        public boolean m12604n(C3573k c3573k, long j2) {
            C3573k c3573k2 = this.f21282y;
            if (c3573k2 != null && !c3573k.equals(c3573k2)) {
                for (Pair<ni7, wvg> pair : this.f21278n.values()) {
                    c3573k2.f21269n.zurt((ni7) pair.first, x2.gvn7(c3573k2, (wvg) pair.second, this.f21274g));
                    c3573k.f21269n.m12764t((ni7) pair.first, x2.gvn7(c3573k, (wvg) pair.second, this.f21274g));
                }
            }
            this.f21282y = c3573k;
            return this.f21277k.mo12597n(m12600h(c3573k, j2));
        }

        public long n7h(C3573k c3573k) {
            return qrj(c3573k, this.f21277k.zy());
        }

        public void ni7() throws IOException {
            this.f21277k.t8r();
        }

        public void o1t(ni7 ni7Var) {
            this.f21278n.remove(Long.valueOf(ni7Var.f21659k));
        }

        public int oc(C3573k c3573k, int i2, long j2) {
            return ((InterfaceC3603j) lrht.ld6(this.f21276i[i2])).cdj(qrj.f7l8(j2, c3573k.f21271q, this.f21274g));
        }

        /* JADX INFO: renamed from: p */
        public long m12605p(C3573k c3573k) {
            return qrj(c3573k, this.f21277k.mo12595g());
        }

        /* JADX INFO: renamed from: q */
        public boolean m12606q(fti.C3596k c3596k, long j2) {
            C3573k c3573k = (C3573k) nsb.ni7(this.f21280q);
            return qrj.f7l8(j2, c3596k, this.f21274g) == qrj.f7l8(x2.d2ok(c3573k, this.f21274g), c3573k.f21271q, this.f21274g);
        }

        /* JADX INFO: renamed from: s */
        public long m12607s(C3573k c3573k, long j2, mbx mbxVar) {
            return qrj.zy(this.f21277k.mo12599q(qrj.f7l8(j2, c3573k.f21271q, this.f21274g), mbxVar), c3573k.f21271q, this.f21274g);
        }

        /* JADX INFO: renamed from: t */
        public void m12608t(C3573k c3573k, long j2) {
            c3573k.f21272s = j2;
            if (this.f21281s) {
                if (this.f21279p) {
                    ((jk.InterfaceC3604k) C3844k.f7l8(c3573k.f21273y)).ld6(c3573k);
                }
            } else {
                this.f21281s = true;
                this.f21277k.n7h(this, qrj.f7l8(j2, c3573k.f21271q, this.f21274g));
            }
        }

        public boolean t8r(int i2) {
            return ((InterfaceC3603j) lrht.ld6(this.f21276i[i2])).isReady();
        }

        public void wvg(ni7 ni7Var, wvg wvgVar) {
            this.f21278n.put(Long.valueOf(ni7Var.f21659k), Pair.create(ni7Var, wvgVar));
        }

        @dd
        public C3573k x2(@dd wvg wvgVar) {
            if (wvgVar == null || wvgVar.f21694g == C3548p.f65257toq) {
                return null;
            }
            for (int i2 = 0; i2 < this.f21280q.size(); i2++) {
                C3573k c3573k = this.f21280q.get(i2);
                long jZy = qrj.zy(lrht.v0af(wvgVar.f21694g), c3573k.f21271q, this.f21274g);
                long jD2ok = x2.d2ok(c3573k, this.f21274g);
                if (jZy >= 0 && jZy < jD2ok) {
                    return c3573k;
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: z */
        public void m12609z(C3573k c3573k, wvg wvgVar) {
            int iF7l8 = f7l8(wvgVar);
            if (iF7l8 != -1) {
                this.f21283z[iF7l8] = wvgVar;
                c3573k.f21270p[iF7l8] = true;
            }
        }

        public void zurt(int i2) throws IOException {
            ((InterfaceC3603j) lrht.ld6(this.f21276i[i2])).toq();
        }

        public void zy(C3573k c3573k) {
            this.f21280q.add(c3573k);
        }
    }

    /* JADX INFO: compiled from: ServerSideInsertedAdsMediaSource.java */
    private static final class toq implements InterfaceC3603j {

        /* JADX INFO: renamed from: k */
        private final C3573k f21284k;

        /* JADX INFO: renamed from: q */
        private final int f21285q;

        public toq(C3573k c3573k, int i2) {
            this.f21284k = c3573k;
            this.f21285q = i2;
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC3603j
        public int cdj(long j2) {
            C3573k c3573k = this.f21284k;
            return c3573k.f21268k.oc(c3573k, this.f21285q, j2);
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC3603j
        public boolean isReady() {
            return this.f21284k.f21268k.t8r(this.f21285q);
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC3603j
        /* JADX INFO: renamed from: s */
        public int mo12610s(C3865v c3865v, C3297s c3297s, int i2) {
            C3573k c3573k = this.f21284k;
            return c3573k.f21268k.mcp(c3573k, this.f21285q, c3865v, c3297s, i2);
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC3603j
        public void toq() throws IOException {
            this.f21284k.f21268k.zurt(this.f21285q);
        }
    }

    /* JADX INFO: compiled from: ServerSideInsertedAdsMediaSource.java */
    private static final class zy extends fn3e {

        /* JADX INFO: renamed from: p */
        private final com.google.android.exoplayer2.source.ads.zy f21286p;

        public zy(pc pcVar, com.google.android.exoplayer2.source.ads.zy zyVar) {
            super(pcVar);
            C3844k.m13633s(pcVar.qrj() == 1);
            C3844k.m13633s(pcVar.zurt() == 1);
            this.f21286p = zyVar;
        }

        @Override // com.google.android.exoplayer2.source.fn3e, com.google.android.exoplayer2.pc
        public pc.C3550q fn3e(int i2, pc.C3550q c3550q, long j2) {
            super.fn3e(i2, c3550q, j2);
            long jM12588n = qrj.m12588n(c3550q.f21132j, -1, this.f21286p);
            long j3 = c3550q.f21128f;
            if (j3 == C3548p.f65257toq) {
                long j4 = this.f21286p.f21301g;
                if (j4 != C3548p.f65257toq) {
                    c3550q.f21128f = j4 - jM12588n;
                }
            } else {
                c3550q.f21128f = qrj.m12588n(c3550q.f21132j + j3, -1, this.f21286p) - jM12588n;
            }
            c3550q.f21132j = jM12588n;
            return c3550q;
        }

        @Override // com.google.android.exoplayer2.source.fn3e, com.google.android.exoplayer2.pc
        public pc.toq ld6(int i2, pc.toq toqVar, boolean z2) {
            super.ld6(i2, toqVar, z2);
            long j2 = toqVar.f21149g;
            toqVar.fu4(toqVar.f21150k, toqVar.f21153q, toqVar.f21151n, j2 == C3548p.f65257toq ? this.f21286p.f21301g : qrj.m12588n(j2, -1, this.f21286p), -qrj.m12588n(-toqVar.ki(), -1, this.f21286p), this.f21286p, toqVar.f21154s);
            return toqVar;
        }
    }

    public x2(fti ftiVar) {
        this.f21263p = ftiVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long d2ok(C3573k c3573k, com.google.android.exoplayer2.source.ads.zy zyVar) {
        fti.C3596k c3596k = c3573k.f21271q;
        if (c3596k.zy()) {
            zy.C3576k c3576kM12619q = zyVar.m12619q(c3596k.f65325toq);
            if (c3576kM12619q.f21319q == -1) {
                return 0L;
            }
            return c3576kM12619q.f21321y[c3596k.f65326zy];
        }
        int i2 = c3596k.f21226n;
        if (i2 == -1) {
            return Long.MAX_VALUE;
        }
        long j2 = zyVar.m12619q(i2).f21316k;
        if (j2 == Long.MIN_VALUE) {
            return Long.MAX_VALUE;
        }
        return j2;
    }

    private void dd() {
        C3574q c3574q = this.f21264r;
        if (c3574q != null) {
            c3574q.fti(this.f21263p);
            this.f21264r = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static wvg gvn7(C3573k c3573k, wvg wvgVar, com.google.android.exoplayer2.source.ads.zy zyVar) {
        return new wvg(wvgVar.f21695k, wvgVar.f65467toq, wvgVar.f65468zy, wvgVar.f21697q, wvgVar.f21696n, oc(wvgVar.f21694g, c3573k, zyVar), oc(wvgVar.f65466f7l8, c3573k, zyVar));
    }

    @dd
    private C3573k lvui(@dd fti.C3596k c3596k, @dd wvg wvgVar, boolean z2) {
        if (c3596k == null) {
            return null;
        }
        List<C3574q> list = this.f21260h.get(Long.valueOf(c3596k.f21227q));
        if (list.isEmpty()) {
            return null;
        }
        if (z2) {
            C3574q c3574q = (C3574q) nsb.ni7(list);
            return c3574q.f21282y != null ? c3574q.f21282y : (C3573k) nsb.ni7(c3574q.f21280q);
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            C3573k c3573kX2 = list.get(i2).x2(wvgVar);
            if (c3573kX2 != null) {
                return c3573kX2;
            }
        }
        return (C3573k) list.get(0).f21280q.get(0);
    }

    private static long oc(long j2, C3573k c3573k, com.google.android.exoplayer2.source.ads.zy zyVar) {
        if (j2 == C3548p.f65257toq) {
            return C3548p.f65257toq;
        }
        long jV0af = lrht.v0af(j2);
        fti.C3596k c3596k = c3573k.f21271q;
        return lrht.zwy(c3596k.zy() ? qrj.m12590q(jV0af, c3596k.f65325toq, c3596k.f65326zy, zyVar) : qrj.m12588n(jV0af, -1, zyVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public /* synthetic */ void m12593r(com.google.android.exoplayer2.source.ads.zy zyVar) {
        Iterator<C3574q> it = this.f21260h.values().iterator();
        while (it.hasNext()) {
            it.next().eqxt(zyVar);
        }
        C3574q c3574q = this.f21264r;
        if (c3574q != null) {
            c3574q.eqxt(zyVar);
        }
        this.f21259f = zyVar;
        if (this.f21262l != null) {
            m12741t(new zy(this.f21262l, zyVar));
        }
    }

    @Override // com.google.android.exoplayer2.source.lvui
    /* JADX INFO: renamed from: a */
    public void mo11361a(int i2, @dd fti.C3596k c3596k, ni7 ni7Var, wvg wvgVar) {
        C3573k c3573kLvui = lvui(c3596k, wvgVar, true);
        if (c3573kLvui == null) {
            this.f21261i.zurt(ni7Var, wvgVar);
        } else {
            c3573kLvui.f21268k.o1t(ni7Var);
            c3573kLvui.f21269n.zurt(ni7Var, gvn7(c3573kLvui, wvgVar, this.f21259f));
        }
    }

    @Override // com.google.android.exoplayer2.source.lvui
    public void a9(int i2, @dd fti.C3596k c3596k, ni7 ni7Var, wvg wvgVar) {
        C3573k c3573kLvui = lvui(c3596k, wvgVar, true);
        if (c3573kLvui == null) {
            this.f21261i.m12764t(ni7Var, wvgVar);
        } else {
            c3573kLvui.f21268k.wvg(ni7Var, wvgVar);
            c3573kLvui.f21269n.m12764t(ni7Var, gvn7(c3573kLvui, wvgVar, this.f21259f));
        }
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC3312i
    /* JADX INFO: renamed from: b */
    public void mo11362b(int i2, @dd fti.C3596k c3596k) {
        C3573k c3573kLvui = lvui(c3596k, null, false);
        if (c3573kLvui == null) {
            this.f21266z.m11637y();
        } else {
            c3573kLvui.f21267g.m11637y();
        }
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC3312i
    public void d3(int i2, @dd fti.C3596k c3596k) {
        C3573k c3573kLvui = lvui(c3596k, null, false);
        if (c3573kLvui == null) {
            this.f21266z.m11636s();
        } else {
            c3573kLvui.f21267g.m11636s();
        }
    }

    @Override // com.google.android.exoplayer2.source.AbstractC3605k
    protected void fu4() {
        dd();
        this.f21263p.mo12714p(this);
    }

    @Override // com.google.android.exoplayer2.source.fti
    /* JADX INFO: renamed from: g */
    public void mo12564g(jk jkVar) {
        C3573k c3573k = (C3573k) jkVar;
        c3573k.f21268k.jp0y(c3573k);
        if (c3573k.f21268k.m12603i()) {
            this.f21260h.remove(Long.valueOf(c3573k.f21271q.f21227q), c3573k.f21268k);
            if (this.f21260h.isEmpty()) {
                this.f21264r = c3573k.f21268k;
            } else {
                c3573k.f21268k.fti(this.f21263p);
            }
        }
    }

    @Override // com.google.android.exoplayer2.source.lvui
    /* JADX INFO: renamed from: i */
    public void mo11366i(int i2, @dd fti.C3596k c3596k, wvg wvgVar) {
        C3573k c3573kLvui = lvui(c3596k, wvgVar, false);
        if (c3573kLvui == null) {
            this.f21261i.m12762p(wvgVar);
        } else {
            c3573kLvui.f21268k.m12609z(c3573kLvui, wvgVar);
            c3573kLvui.f21269n.m12762p(gvn7(c3573kLvui, wvgVar, this.f21259f));
        }
    }

    @Override // com.google.android.exoplayer2.source.fti
    /* JADX INFO: renamed from: k */
    public jk mo12565k(fti.C3596k c3596k, com.google.android.exoplayer2.upstream.toq toqVar, long j2) {
        C3574q c3574q = this.f21264r;
        if (c3574q != null) {
            this.f21264r = null;
            this.f21260h.put(Long.valueOf(c3596k.f21227q), c3574q);
        } else {
            c3574q = (C3574q) nsb.fu4(this.f21260h.get(Long.valueOf(c3596k.f21227q)), null);
            if (c3574q == null || !c3574q.m12606q(c3596k, j2)) {
                c3574q = new C3574q(this.f21263p.mo12565k(new fti.C3596k(c3596k.f21225k, c3596k.f21227q), toqVar, qrj.f7l8(j2, c3596k, this.f21259f)), this.f21259f);
                this.f21260h.put(Long.valueOf(c3596k.f21227q), c3574q);
            }
        }
        C3573k c3573k = new C3573k(c3574q, c3596k, fn3e(c3596k), ki(c3596k));
        c3574q.zy(c3573k);
        return c3573k;
    }

    @Override // com.google.android.exoplayer2.source.AbstractC3605k
    protected void mcp() {
        dd();
        this.f21262l = null;
        synchronized (this) {
            this.f21265t = null;
        }
        this.f21263p.toq(this);
        this.f21263p.mo12715q(this);
        this.f21263p.qrj(this);
    }

    @Override // com.google.android.exoplayer2.source.fti
    /* JADX INFO: renamed from: n */
    public tfm mo12566n() {
        return this.f21263p.mo12566n();
    }

    @Override // com.google.android.exoplayer2.source.fti
    public void n7h() throws IOException {
        this.f21263p.n7h();
    }

    @Override // com.google.android.exoplayer2.source.lvui
    public void nmn5(int i2, @dd fti.C3596k c3596k, ni7 ni7Var, wvg wvgVar, IOException iOException, boolean z2) {
        C3573k c3573kLvui = lvui(c3596k, wvgVar, true);
        if (c3573kLvui == null) {
            this.f21261i.m12765z(ni7Var, wvgVar, iOException, z2);
            return;
        }
        if (z2) {
            c3573kLvui.f21268k.o1t(ni7Var);
        }
        c3573kLvui.f21269n.m12765z(ni7Var, gvn7(c3573kLvui, wvgVar, this.f21259f), iOException, z2);
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC3312i
    public void nn86(int i2, @dd fti.C3596k c3596k, Exception exc) {
        C3573k c3573kLvui = lvui(c3596k, null, false);
        if (c3573kLvui == null) {
            this.f21266z.x2(exc);
        } else {
            c3573kLvui.f21267g.x2(exc);
        }
    }

    @Override // com.google.android.exoplayer2.source.fti.toq
    /* JADX INFO: renamed from: s */
    public void mo12410s(fti ftiVar, pc pcVar) {
        this.f21262l = pcVar;
        if (com.google.android.exoplayer2.source.ads.zy.f21298r.equals(this.f21259f)) {
            return;
        }
        m12741t(new zy(pcVar, this.f21259f));
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC3312i
    public void t8iq(int i2, @dd fti.C3596k c3596k) {
        C3573k c3573kLvui = lvui(c3596k, null, false);
        if (c3573kLvui == null) {
            this.f21266z.m11635p();
        } else {
            c3573kLvui.f21267g.m11635p();
        }
    }

    @Override // com.google.android.exoplayer2.source.lvui
    public void vyq(int i2, fti.C3596k c3596k, wvg wvgVar) {
        C3573k c3573kLvui = lvui(c3596k, wvgVar, false);
        if (c3573kLvui == null) {
            this.f21261i.a9(wvgVar);
        } else {
            c3573kLvui.f21269n.a9(gvn7(c3573kLvui, wvgVar, this.f21259f));
        }
    }

    @Override // com.google.android.exoplayer2.source.AbstractC3605k
    protected void wvg(@dd uv6 uv6Var) {
        Handler handlerM13676z = lrht.m13676z();
        synchronized (this) {
            this.f21265t = handlerM13676z;
        }
        this.f21263p.zy(handlerM13676z, this);
        this.f21263p.x2(handlerM13676z, this);
        this.f21263p.f7l8(this, uv6Var);
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC3312i
    /* JADX INFO: renamed from: x */
    public void mo11376x(int i2, @dd fti.C3596k c3596k) {
        C3573k c3573kLvui = lvui(c3596k, null, false);
        if (c3573kLvui == null) {
            this.f21266z.qrj();
        } else {
            c3573kLvui.f21267g.qrj();
        }
    }

    public void x9kr(final com.google.android.exoplayer2.source.ads.zy zyVar) {
        C3844k.m13629k(zyVar.f21304q >= this.f21259f.f21304q);
        for (int i2 = zyVar.f21306y; i2 < zyVar.f21304q; i2++) {
            zy.C3576k c3576kM12619q = zyVar.m12619q(i2);
            C3844k.m13629k(c3576kM12619q.f21318p);
            if (i2 < this.f21259f.f21304q) {
                C3844k.m13629k(qrj.toq(zyVar, i2) >= qrj.toq(this.f21259f, i2));
            }
            if (c3576kM12619q.f21316k == Long.MIN_VALUE) {
                C3844k.m13629k(qrj.toq(zyVar, i2) == 0);
            }
        }
        synchronized (this) {
            Handler handler = this.f21265t;
            if (handler == null) {
                this.f21259f = zyVar;
            } else {
                handler.post(new Runnable() { // from class: com.google.android.exoplayer2.source.ads.ld6
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f21249k.m12593r(zyVar);
                    }
                });
            }
        }
    }

    @Override // com.google.android.exoplayer2.source.AbstractC3605k
    /* JADX INFO: renamed from: z */
    protected void mo12594z() {
        this.f21263p.mo12716y(this);
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC3312i
    public void zp(int i2, @dd fti.C3596k c3596k, int i3) {
        C3573k c3573kLvui = lvui(c3596k, null, true);
        if (c3573kLvui == null) {
            this.f21266z.ld6(i3);
        } else {
            c3573kLvui.f21267g.ld6(i3);
        }
    }

    @Override // com.google.android.exoplayer2.source.lvui
    public void zurt(int i2, @dd fti.C3596k c3596k, ni7 ni7Var, wvg wvgVar) {
        C3573k c3573kLvui = lvui(c3596k, wvgVar, true);
        if (c3573kLvui == null) {
            this.f21261i.t8r(ni7Var, wvgVar);
        } else {
            c3573kLvui.f21268k.o1t(ni7Var);
            c3573kLvui.f21269n.t8r(ni7Var, gvn7(c3573kLvui, wvgVar, this.f21259f));
        }
    }
}
