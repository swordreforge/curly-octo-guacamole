package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.C3548p;
import com.google.android.exoplayer2.C3865v;
import com.google.android.exoplayer2.decoder.C3297s;
import com.google.android.exoplayer2.mbx;
import com.google.android.exoplayer2.source.jk;
import com.google.android.exoplayer2.source.lvui;
import com.google.android.exoplayer2.trackselection.InterfaceC3715s;
import com.google.android.exoplayer2.upstream.C3794f;
import com.google.android.exoplayer2.upstream.d3;
import com.google.android.exoplayer2.upstream.kja0;
import com.google.android.exoplayer2.upstream.oc;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.xwq3;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: SingleSampleMediaPeriod.java */
/* JADX INFO: loaded from: classes2.dex */
final class y9n implements jk, oc.toq<zy> {

    /* JADX INFO: renamed from: c */
    private static final String f21720c = "SingleSampleMediaPeriod";

    /* JADX INFO: renamed from: e */
    private static final int f21721e = 1024;

    /* JADX INFO: renamed from: f */
    int f21722f;

    /* JADX INFO: renamed from: g */
    private final com.google.android.exoplayer2.upstream.d3 f21723g;

    /* JADX INFO: renamed from: h */
    private final long f21724h;

    /* JADX INFO: renamed from: k */
    private final com.google.android.exoplayer2.upstream.t8r f21726k;

    /* JADX INFO: renamed from: l */
    byte[] f21727l;

    /* JADX INFO: renamed from: n */
    @zy.dd
    private final com.google.android.exoplayer2.upstream.uv6 f21728n;

    /* JADX INFO: renamed from: q */
    private final kja0.InterfaceC3804k f21730q;

    /* JADX INFO: renamed from: r */
    boolean f21731r;

    /* JADX INFO: renamed from: s */
    private final C3629x f21732s;

    /* JADX INFO: renamed from: t */
    final boolean f21733t;

    /* JADX INFO: renamed from: y */
    private final lvui.C3611k f21734y;

    /* JADX INFO: renamed from: z */
    final xwq3 f21735z;

    /* JADX INFO: renamed from: p */
    private final ArrayList<toq> f21729p = new ArrayList<>();

    /* JADX INFO: renamed from: i */
    final com.google.android.exoplayer2.upstream.oc f21725i = new com.google.android.exoplayer2.upstream.oc(f21720c);

    /* JADX INFO: compiled from: SingleSampleMediaPeriod.java */
    private final class toq implements InterfaceC3603j {

        /* JADX INFO: renamed from: g */
        private static final int f21736g = 0;

        /* JADX INFO: renamed from: s */
        private static final int f21737s = 2;

        /* JADX INFO: renamed from: y */
        private static final int f21738y = 1;

        /* JADX INFO: renamed from: k */
        private int f21739k;

        /* JADX INFO: renamed from: q */
        private boolean f21741q;

        private toq() {
        }

        /* JADX INFO: renamed from: k */
        private void m12825k() {
            if (this.f21741q) {
                return;
            }
            y9n.this.f21734y.m12763s(com.google.android.exoplayer2.util.wvg.x2(y9n.this.f21735z.f23682r), y9n.this.f21735z, 0, null, 0L);
            this.f21741q = true;
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC3603j
        public int cdj(long j2) {
            m12825k();
            if (j2 <= 0 || this.f21739k == 2) {
                return 0;
            }
            this.f21739k = 2;
            return 1;
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC3603j
        public boolean isReady() {
            return y9n.this.f21731r;
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC3603j
        /* JADX INFO: renamed from: s */
        public int mo12610s(C3865v c3865v, C3297s c3297s, int i2) {
            m12825k();
            y9n y9nVar = y9n.this;
            boolean z2 = y9nVar.f21731r;
            if (z2 && y9nVar.f21727l == null) {
                this.f21739k = 2;
            }
            int i3 = this.f21739k;
            if (i3 == 2) {
                c3297s.f7l8(4);
                return -4;
            }
            if ((i2 & 2) != 0 || i3 == 0) {
                c3865v.f67166toq = y9nVar.f21735z;
                this.f21739k = 1;
                return -5;
            }
            if (!z2) {
                return -3;
            }
            C3844k.f7l8(y9nVar.f21727l);
            c3297s.f7l8(1);
            c3297s.f19618s = 0L;
            if ((i2 & 4) == 0) {
                c3297s.ki(y9n.this.f21722f);
                ByteBuffer byteBuffer = c3297s.f19612g;
                y9n y9nVar2 = y9n.this;
                byteBuffer.put(y9nVar2.f21727l, 0, y9nVar2.f21722f);
            }
            if ((i2 & 1) == 0) {
                this.f21739k = 2;
            }
            return -4;
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC3603j
        public void toq() throws IOException {
            y9n y9nVar = y9n.this;
            if (y9nVar.f21733t) {
                return;
            }
            y9nVar.f21725i.toq();
        }

        public void zy() {
            if (this.f21739k == 2) {
                this.f21739k = 1;
            }
        }
    }

    /* JADX INFO: compiled from: SingleSampleMediaPeriod.java */
    static final class zy implements oc.InterfaceC3814n {

        /* JADX INFO: renamed from: k */
        public final long f21742k = ni7.m12808k();

        /* JADX INFO: renamed from: q */
        @zy.dd
        private byte[] f21743q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public final com.google.android.exoplayer2.upstream.t8r f65469toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final C3794f f65470zy;

        public zy(com.google.android.exoplayer2.upstream.t8r t8rVar, com.google.android.exoplayer2.upstream.kja0 kja0Var) {
            this.f65469toq = t8rVar;
            this.f65470zy = new C3794f(kja0Var);
        }

        @Override // com.google.android.exoplayer2.upstream.oc.InterfaceC3814n
        /* JADX INFO: renamed from: k */
        public void mo12654k() throws IOException {
            this.f65470zy.m13461z();
            try {
                this.f65470zy.mo7270k(this.f65469toq);
                int i2 = 0;
                while (i2 != -1) {
                    int iZurt = (int) this.f65470zy.zurt();
                    byte[] bArr = this.f21743q;
                    if (bArr == null) {
                        this.f21743q = new byte[1024];
                    } else if (iZurt == bArr.length) {
                        this.f21743q = Arrays.copyOf(bArr, bArr.length * 2);
                    }
                    C3794f c3794f = this.f65470zy;
                    byte[] bArr2 = this.f21743q;
                    i2 = c3794f.read(bArr2, iZurt, bArr2.length - iZurt);
                }
            } finally {
                com.google.android.exoplayer2.upstream.ki.m13484k(this.f65470zy);
            }
        }

        @Override // com.google.android.exoplayer2.upstream.oc.InterfaceC3814n
        public void zy() {
        }
    }

    public y9n(com.google.android.exoplayer2.upstream.t8r t8rVar, kja0.InterfaceC3804k interfaceC3804k, @zy.dd com.google.android.exoplayer2.upstream.uv6 uv6Var, xwq3 xwq3Var, long j2, com.google.android.exoplayer2.upstream.d3 d3Var, lvui.C3611k c3611k, boolean z2) {
        this.f21726k = t8rVar;
        this.f21730q = interfaceC3804k;
        this.f21728n = uv6Var;
        this.f21735z = xwq3Var;
        this.f21724h = j2;
        this.f21723g = d3Var;
        this.f21734y = c3611k;
        this.f21733t = z2;
        this.f21732s = new C3629x(new C3564a(xwq3Var));
    }

    @Override // com.google.android.exoplayer2.upstream.oc.toq
    /* JADX INFO: renamed from: cdj, reason: merged with bridge method [inline-methods] */
    public void ld6(zy zyVar, long j2, long j3) {
        this.f21722f = (int) zyVar.f65470zy.zurt();
        this.f21727l = (byte[]) C3844k.f7l8(zyVar.f21743q);
        this.f21731r = true;
        C3794f c3794f = zyVar.f65470zy;
        ni7 ni7Var = new ni7(zyVar.f21742k, zyVar.f65469toq, c3794f.ni7(), c3794f.fu4(), j2, j3, this.f21722f);
        this.f21723g.m13458q(zyVar.f21742k);
        this.f21734y.fn3e(ni7Var, 1, -1, this.f21735z, 0, null, 0L, this.f21724h);
    }

    @Override // com.google.android.exoplayer2.source.jk, com.google.android.exoplayer2.source.InterfaceC3622o
    public void f7l8(long j2) {
    }

    @Override // com.google.android.exoplayer2.source.jk
    public C3629x fn3e() {
        return this.f21732s;
    }

    @Override // com.google.android.exoplayer2.source.jk, com.google.android.exoplayer2.source.InterfaceC3622o
    /* JADX INFO: renamed from: g */
    public long mo12595g() {
        return this.f21731r ? Long.MIN_VALUE : 0L;
    }

    /* JADX INFO: renamed from: i */
    public void m12823i() {
        this.f21725i.x2();
    }

    @Override // com.google.android.exoplayer2.source.jk, com.google.android.exoplayer2.source.InterfaceC3622o
    /* JADX INFO: renamed from: k */
    public boolean mo12596k() {
        return this.f21725i.ld6();
    }

    @Override // com.google.android.exoplayer2.upstream.oc.toq
    /* JADX INFO: renamed from: ki, reason: merged with bridge method [inline-methods] */
    public oc.zy mo12667h(zy zyVar, long j2, long j3, IOException iOException, int i2) {
        oc.zy zyVarM13500s;
        C3794f c3794f = zyVar.f65470zy;
        ni7 ni7Var = new ni7(zyVar.f21742k, zyVar.f65469toq, c3794f.ni7(), c3794f.fu4(), j2, j3, c3794f.zurt());
        long jMo13457k = this.f21723g.mo13457k(new d3.C3791q(ni7Var, new wvg(1, -1, this.f21735z, 0, null, 0L, com.google.android.exoplayer2.util.lrht.zwy(this.f21724h)), iOException, i2));
        boolean z2 = jMo13457k == C3548p.f65257toq || i2 >= this.f21723g.toq(1);
        if (this.f21733t && z2) {
            com.google.android.exoplayer2.util.ni7.n7h(f21720c, "Loading failed, treating as end-of-stream.", iOException);
            this.f21731r = true;
            zyVarM13500s = com.google.android.exoplayer2.upstream.oc.f66891ld6;
        } else {
            zyVarM13500s = jMo13457k != C3548p.f65257toq ? com.google.android.exoplayer2.upstream.oc.m13500s(false, jMo13457k) : com.google.android.exoplayer2.upstream.oc.f66892x2;
        }
        oc.zy zyVar2 = zyVarM13500s;
        boolean z3 = !zyVar2.zy();
        this.f21734y.ni7(ni7Var, 1, -1, this.f21735z, 0, null, 0L, this.f21724h, iOException, z3);
        if (z3) {
            this.f21723g.m13458q(zyVar.f21742k);
        }
        return zyVar2;
    }

    @Override // com.google.android.exoplayer2.source.jk
    public long kja0(InterfaceC3715s[] interfaceC3715sArr, boolean[] zArr, InterfaceC3603j[] interfaceC3603jArr, boolean[] zArr2, long j2) {
        for (int i2 = 0; i2 < interfaceC3715sArr.length; i2++) {
            InterfaceC3603j interfaceC3603j = interfaceC3603jArr[i2];
            if (interfaceC3603j != null && (interfaceC3715sArr[i2] == null || !zArr[i2])) {
                this.f21729p.remove(interfaceC3603j);
                interfaceC3603jArr[i2] = null;
            }
            if (interfaceC3603jArr[i2] == null && interfaceC3715sArr[i2] != null) {
                toq toqVar = new toq();
                this.f21729p.add(toqVar);
                interfaceC3603jArr[i2] = toqVar;
                zArr2[i2] = true;
            }
        }
        return j2;
    }

    @Override // com.google.android.exoplayer2.source.jk, com.google.android.exoplayer2.source.InterfaceC3622o
    /* JADX INFO: renamed from: n */
    public boolean mo12597n(long j2) {
        if (this.f21731r || this.f21725i.ld6() || this.f21725i.m13501p()) {
            return false;
        }
        com.google.android.exoplayer2.upstream.kja0 kja0VarMo7265k = this.f21730q.mo7265k();
        com.google.android.exoplayer2.upstream.uv6 uv6Var = this.f21728n;
        if (uv6Var != null) {
            kja0VarMo7265k.mo7271n(uv6Var);
        }
        zy zyVar = new zy(this.f21726k, kja0VarMo7265k);
        this.f21734y.wvg(new ni7(zyVar.f21742k, this.f21726k, this.f21725i.n7h(zyVar, this, this.f21723g.toq(1))), 1, -1, this.f21735z, 0, null, 0L, this.f21724h);
        return true;
    }

    @Override // com.google.android.exoplayer2.source.jk
    public void n7h(jk.InterfaceC3604k interfaceC3604k, long j2) {
        interfaceC3604k.ld6(this);
    }

    @Override // com.google.android.exoplayer2.source.jk
    /* JADX INFO: renamed from: q */
    public long mo12599q(long j2, mbx mbxVar) {
        return j2;
    }

    @Override // com.google.android.exoplayer2.source.jk
    public long qrj() {
        return C3548p.f65257toq;
    }

    @Override // com.google.android.exoplayer2.upstream.oc.toq
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void mo12670y(zy zyVar, long j2, long j3, boolean z2) {
        C3794f c3794f = zyVar.f65470zy;
        ni7 ni7Var = new ni7(zyVar.f21742k, zyVar.f65469toq, c3794f.ni7(), c3794f.fu4(), j2, j3, c3794f.zurt());
        this.f21723g.m13458q(zyVar.f21742k);
        this.f21734y.ki(ni7Var, 1, -1, null, 0, null, 0L, this.f21724h);
    }

    @Override // com.google.android.exoplayer2.source.jk
    public void t8r() {
    }

    @Override // com.google.android.exoplayer2.source.jk
    public long x2(long j2) {
        for (int i2 = 0; i2 < this.f21729p.size(); i2++) {
            this.f21729p.get(i2).zy();
        }
        return j2;
    }

    @Override // com.google.android.exoplayer2.source.jk
    public void zurt(long j2, boolean z2) {
    }

    @Override // com.google.android.exoplayer2.source.jk, com.google.android.exoplayer2.source.InterfaceC3622o
    public long zy() {
        return (this.f21731r || this.f21725i.ld6()) ? Long.MIN_VALUE : 0L;
    }
}
