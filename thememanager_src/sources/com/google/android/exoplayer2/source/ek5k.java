package com.google.android.exoplayer2.source;

import android.net.Uri;
import com.google.android.exoplayer2.C3548p;
import com.google.android.exoplayer2.C3865v;
import com.google.android.exoplayer2.decoder.C3297s;
import com.google.android.exoplayer2.mbx;
import com.google.android.exoplayer2.source.fti;
import com.google.android.exoplayer2.source.jk;
import com.google.android.exoplayer2.tfm;
import com.google.android.exoplayer2.trackselection.InterfaceC3715s;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.xwq3;
import java.util.ArrayList;

/* JADX INFO: compiled from: SilenceMediaSource.java */
/* JADX INFO: loaded from: classes2.dex */
public final class ek5k extends AbstractC3605k {

    /* JADX INFO: renamed from: c */
    private static final byte[] f21457c;

    /* JADX INFO: renamed from: f */
    private static final tfm f21458f;

    /* JADX INFO: renamed from: i */
    public static final String f21459i = "SilenceMediaSource";

    /* JADX INFO: renamed from: l */
    private static final xwq3 f21460l;

    /* JADX INFO: renamed from: r */
    private static final int f21461r = 2;

    /* JADX INFO: renamed from: t */
    private static final int f21462t = 2;

    /* JADX INFO: renamed from: z */
    private static final int f21463z = 44100;

    /* JADX INFO: renamed from: h */
    private final tfm f21464h;

    /* JADX INFO: renamed from: p */
    private final long f21465p;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.ek5k$q */
    /* JADX INFO: compiled from: SilenceMediaSource.java */
    private static final class C3593q implements InterfaceC3603j {

        /* JADX INFO: renamed from: k */
        private final long f21466k;

        /* JADX INFO: renamed from: n */
        private long f21467n;

        /* JADX INFO: renamed from: q */
        private boolean f21468q;

        public C3593q(long j2) {
            this.f21466k = ek5k.d2ok(j2);
            m12691k(0L);
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC3603j
        public int cdj(long j2) {
            long j3 = this.f21467n;
            m12691k(j2);
            return (int) ((this.f21467n - j3) / ((long) ek5k.f21457c.length));
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC3603j
        public boolean isReady() {
            return true;
        }

        /* JADX INFO: renamed from: k */
        public void m12691k(long j2) {
            this.f21467n = com.google.android.exoplayer2.util.lrht.m13660i(ek5k.d2ok(j2), 0L, this.f21466k);
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC3603j
        /* JADX INFO: renamed from: s */
        public int mo12610s(C3865v c3865v, C3297s c3297s, int i2) {
            if (!this.f21468q || (i2 & 2) != 0) {
                c3865v.f67166toq = ek5k.f21460l;
                this.f21468q = true;
                return -5;
            }
            long j2 = this.f21466k;
            long j3 = this.f21467n;
            long j4 = j2 - j3;
            if (j4 == 0) {
                c3297s.f7l8(4);
                return -4;
            }
            c3297s.f19618s = ek5k.lvui(j3);
            c3297s.f7l8(1);
            int iMin = (int) Math.min(ek5k.f21457c.length, j4);
            if ((i2 & 4) == 0) {
                c3297s.ki(iMin);
                c3297s.f19612g.put(ek5k.f21457c, 0, iMin);
            }
            if ((i2 & 1) == 0) {
                this.f21467n += (long) iMin;
            }
            return -4;
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC3603j
        public void toq() {
        }
    }

    /* JADX INFO: compiled from: SilenceMediaSource.java */
    public static final class toq {

        /* JADX INFO: renamed from: k */
        private long f21469k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @zy.dd
        private Object f65368toq;

        /* JADX INFO: renamed from: k */
        public ek5k m12692k() {
            C3844k.m13633s(this.f21469k > 0);
            return new ek5k(this.f21469k, ek5k.f21458f.toq().oc(this.f65368toq).m13065k());
        }

        public toq toq(@zy.a9(from = 1) long j2) {
            this.f21469k = j2;
            return this;
        }

        public toq zy(@zy.dd Object obj) {
            this.f65368toq = obj;
            return this;
        }
    }

    /* JADX INFO: compiled from: SilenceMediaSource.java */
    private static final class zy implements jk {

        /* JADX INFO: renamed from: n */
        private static final C3629x f21470n = new C3629x(new C3564a(ek5k.f21460l));

        /* JADX INFO: renamed from: k */
        private final long f21471k;

        /* JADX INFO: renamed from: q */
        private final ArrayList<InterfaceC3603j> f21472q = new ArrayList<>();

        public zy(long j2) {
            this.f21471k = j2;
        }

        private long toq(long j2) {
            return com.google.android.exoplayer2.util.lrht.m13660i(j2, 0L, this.f21471k);
        }

        @Override // com.google.android.exoplayer2.source.jk, com.google.android.exoplayer2.source.InterfaceC3622o
        public void f7l8(long j2) {
        }

        @Override // com.google.android.exoplayer2.source.jk
        public C3629x fn3e() {
            return f21470n;
        }

        @Override // com.google.android.exoplayer2.source.jk, com.google.android.exoplayer2.source.InterfaceC3622o
        /* JADX INFO: renamed from: g */
        public long mo12595g() {
            return Long.MIN_VALUE;
        }

        @Override // com.google.android.exoplayer2.source.jk, com.google.android.exoplayer2.source.InterfaceC3622o
        /* JADX INFO: renamed from: k */
        public boolean mo12596k() {
            return false;
        }

        @Override // com.google.android.exoplayer2.source.jk
        public long kja0(InterfaceC3715s[] interfaceC3715sArr, boolean[] zArr, InterfaceC3603j[] interfaceC3603jArr, boolean[] zArr2, long j2) {
            long qVar = toq(j2);
            for (int i2 = 0; i2 < interfaceC3715sArr.length; i2++) {
                InterfaceC3603j interfaceC3603j = interfaceC3603jArr[i2];
                if (interfaceC3603j != null && (interfaceC3715sArr[i2] == null || !zArr[i2])) {
                    this.f21472q.remove(interfaceC3603j);
                    interfaceC3603jArr[i2] = null;
                }
                if (interfaceC3603jArr[i2] == null && interfaceC3715sArr[i2] != null) {
                    C3593q c3593q = new C3593q(this.f21471k);
                    c3593q.m12691k(qVar);
                    this.f21472q.add(c3593q);
                    interfaceC3603jArr[i2] = c3593q;
                    zArr2[i2] = true;
                }
            }
            return qVar;
        }

        @Override // com.google.android.exoplayer2.source.jk, com.google.android.exoplayer2.source.InterfaceC3622o
        /* JADX INFO: renamed from: n */
        public boolean mo12597n(long j2) {
            return false;
        }

        @Override // com.google.android.exoplayer2.source.jk
        public void n7h(jk.InterfaceC3604k interfaceC3604k, long j2) {
            interfaceC3604k.ld6(this);
        }

        @Override // com.google.android.exoplayer2.source.jk
        /* JADX INFO: renamed from: q */
        public long mo12599q(long j2, mbx mbxVar) {
            return toq(j2);
        }

        @Override // com.google.android.exoplayer2.source.jk
        public long qrj() {
            return C3548p.f65257toq;
        }

        @Override // com.google.android.exoplayer2.source.jk
        public void t8r() {
        }

        @Override // com.google.android.exoplayer2.source.jk
        public long x2(long j2) {
            long qVar = toq(j2);
            for (int i2 = 0; i2 < this.f21472q.size(); i2++) {
                ((C3593q) this.f21472q.get(i2)).m12691k(qVar);
            }
            return qVar;
        }

        @Override // com.google.android.exoplayer2.source.jk
        public void zurt(long j2, boolean z2) {
        }

        @Override // com.google.android.exoplayer2.source.jk, com.google.android.exoplayer2.source.InterfaceC3622o
        public long zy() {
            return Long.MIN_VALUE;
        }
    }

    static {
        xwq3 xwq3VarA9 = new xwq3.toq().m13945m(com.google.android.exoplayer2.util.wvg.f67095d3).gvn7(2).ek5k(f21463z).vyq(2).a9();
        f21460l = xwq3VarA9;
        f21458f = new tfm.zy().jk(f21459i).eqxt(Uri.EMPTY).fti(xwq3VarA9.f23682r).m13065k();
        f21457c = new byte[com.google.android.exoplayer2.util.lrht.m13674x(2, 2) * 1024];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long d2ok(long j2) {
        return ((long) com.google.android.exoplayer2.util.lrht.m13674x(2, 2)) * ((j2 * 44100) / 1000000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long lvui(long j2) {
        return ((j2 / ((long) com.google.android.exoplayer2.util.lrht.m13674x(2, 2))) * 1000000) / 44100;
    }

    @Override // com.google.android.exoplayer2.source.fti
    /* JADX INFO: renamed from: g */
    public void mo12564g(jk jkVar) {
    }

    @Override // com.google.android.exoplayer2.source.fti
    /* JADX INFO: renamed from: k */
    public jk mo12565k(fti.C3596k c3596k, com.google.android.exoplayer2.upstream.toq toqVar, long j2) {
        return new zy(this.f21465p);
    }

    @Override // com.google.android.exoplayer2.source.AbstractC3605k
    protected void mcp() {
    }

    @Override // com.google.android.exoplayer2.source.fti
    /* JADX INFO: renamed from: n */
    public tfm mo12566n() {
        return this.f21464h;
    }

    @Override // com.google.android.exoplayer2.source.fti
    public void n7h() {
    }

    @Override // com.google.android.exoplayer2.source.AbstractC3605k
    protected void wvg(@zy.dd com.google.android.exoplayer2.upstream.uv6 uv6Var) {
        m12741t(new yz(this.f21465p, true, false, false, (Object) null, this.f21464h));
    }

    public ek5k(long j2) {
        this(j2, f21458f);
    }

    private ek5k(long j2, tfm tfmVar) {
        C3844k.m13629k(j2 >= 0);
        this.f21465p = j2;
        this.f21464h = tfmVar;
    }
}
