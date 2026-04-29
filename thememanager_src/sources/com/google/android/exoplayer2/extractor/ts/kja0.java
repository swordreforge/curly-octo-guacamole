package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.C3548p;
import com.google.android.exoplayer2.extractor.InterfaceC3401t;
import com.google.android.exoplayer2.extractor.ts.d3;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.C3856t;
import com.google.android.exoplayer2.util.lrht;
import com.google.android.exoplayer2.xwq3;
import java.util.Arrays;
import java.util.Collections;
import zy.dd;

/* JADX INFO: compiled from: H263Reader.java */
/* JADX INFO: loaded from: classes2.dex */
public final class kja0 implements qrj {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private static final int f64545cdj = 182;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private static final int f64546fn3e = 0;

    /* JADX INFO: renamed from: h */
    private static final int f20289h = 181;

    /* JADX INFO: renamed from: i */
    private static final float[] f20290i = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private static final int f64547ki = 31;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private static final int f64548kja0 = 179;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private static final int f64549n7h = 178;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static final int f64550qrj = 176;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private static final int f64551t8r = -1;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final String f64552x2 = "H263Reader";

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private long f64553f7l8;

    /* JADX INFO: renamed from: g */
    private toq f20291g;

    /* JADX INFO: renamed from: k */
    @dd
    private final eqxt f20292k;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private long f64554ld6;

    /* JADX INFO: renamed from: n */
    @dd
    private final fn3e f20293n;

    /* JADX INFO: renamed from: p */
    private boolean f20294p;

    /* JADX INFO: renamed from: q */
    private final C3414k f20295q;

    /* JADX INFO: renamed from: s */
    private InterfaceC3401t f20296s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @dd
    private final com.google.android.exoplayer2.util.gvn7 f64555toq;

    /* JADX INFO: renamed from: y */
    private String f20297y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final boolean[] f64556zy;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.ts.kja0$k */
    /* JADX INFO: compiled from: H263Reader.java */
    private static final class C3414k {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private static final int f64557f7l8 = 0;

        /* JADX INFO: renamed from: g */
        private static final byte[] f20298g = {0, 0, 1};

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        private static final int f64558ld6 = 4;

        /* JADX INFO: renamed from: p */
        private static final int f20299p = 3;

        /* JADX INFO: renamed from: s */
        private static final int f20300s = 2;

        /* JADX INFO: renamed from: y */
        private static final int f20301y = 1;

        /* JADX INFO: renamed from: k */
        private boolean f20302k;

        /* JADX INFO: renamed from: n */
        public byte[] f20303n;

        /* JADX INFO: renamed from: q */
        public int f20304q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private int f64559toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public int f64560zy;

        public C3414k(int i2) {
            this.f20303n = new byte[i2];
        }

        /* JADX INFO: renamed from: k */
        public void m11993k(byte[] bArr, int i2, int i3) {
            if (this.f20302k) {
                int i4 = i3 - i2;
                byte[] bArr2 = this.f20303n;
                int length = bArr2.length;
                int i5 = this.f64560zy;
                if (length < i5 + i4) {
                    this.f20303n = Arrays.copyOf(bArr2, (i5 + i4) * 2);
                }
                System.arraycopy(bArr, i2, this.f20303n, this.f64560zy, i4);
                this.f64560zy += i4;
            }
        }

        public boolean toq(int i2, int i3) {
            int i4 = this.f64559toq;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 != 4) {
                                throw new IllegalStateException();
                            }
                            if (i2 == kja0.f64548kja0 || i2 == kja0.f20289h) {
                                this.f64560zy -= i3;
                                this.f20302k = false;
                                return true;
                            }
                        } else if ((i2 & wvg.f64659wvg) != 32) {
                            com.google.android.exoplayer2.util.ni7.qrj(kja0.f64552x2, "Unexpected start code value");
                            zy();
                        } else {
                            this.f20304q = this.f64560zy;
                            this.f64559toq = 4;
                        }
                    } else if (i2 > 31) {
                        com.google.android.exoplayer2.util.ni7.qrj(kja0.f64552x2, "Unexpected start code value");
                        zy();
                    } else {
                        this.f64559toq = 3;
                    }
                } else if (i2 != kja0.f20289h) {
                    com.google.android.exoplayer2.util.ni7.qrj(kja0.f64552x2, "Unexpected start code value");
                    zy();
                } else {
                    this.f64559toq = 2;
                }
            } else if (i2 == kja0.f64550qrj) {
                this.f64559toq = 1;
                this.f20302k = true;
            }
            byte[] bArr = f20298g;
            m11993k(bArr, 0, bArr.length);
            return false;
        }

        public void zy() {
            this.f20302k = false;
            this.f64560zy = 0;
            this.f64559toq = 0;
        }
    }

    /* JADX INFO: compiled from: H263Reader.java */
    private static final class toq {

        /* JADX INFO: renamed from: p */
        private static final int f20305p = 0;

        /* JADX INFO: renamed from: s */
        private static final int f20306s = 1;

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private long f64561f7l8;

        /* JADX INFO: renamed from: g */
        private int f20307g;

        /* JADX INFO: renamed from: k */
        private final InterfaceC3401t f20308k;

        /* JADX INFO: renamed from: n */
        private int f20309n;

        /* JADX INFO: renamed from: q */
        private boolean f20310q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private boolean f64562toq;

        /* JADX INFO: renamed from: y */
        private long f20311y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private boolean f64563zy;

        public toq(InterfaceC3401t interfaceC3401t) {
            this.f20308k = interfaceC3401t;
        }

        /* JADX INFO: renamed from: k */
        public void m11994k(byte[] bArr, int i2, int i3) {
            if (this.f64563zy) {
                int i4 = this.f20307g;
                int i5 = (i2 + 1) - i4;
                if (i5 >= i3) {
                    this.f20307g = i4 + (i3 - i2);
                } else {
                    this.f20310q = ((bArr[i5] & 192) >> 6) == 0;
                    this.f64563zy = false;
                }
            }
        }

        /* JADX INFO: renamed from: q */
        public void m11995q() {
            this.f64562toq = false;
            this.f64563zy = false;
            this.f20310q = false;
            this.f20309n = -1;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public void toq(long j2, int i2, boolean z2) {
            if (this.f20309n == kja0.f64545cdj && z2 && this.f64562toq) {
                long j3 = this.f20311y;
                if (j3 != C3548p.f65257toq) {
                    this.f20308k.mo11930n(j3, this.f20310q ? 1 : 0, (int) (j2 - this.f64561f7l8), i2, null);
                }
            }
            if (this.f20309n != kja0.f64548kja0) {
                this.f64561f7l8 = j2;
            }
        }

        public void zy(int i2, long j2) {
            this.f20309n = i2;
            this.f20310q = false;
            this.f64562toq = i2 == kja0.f64545cdj || i2 == kja0.f64548kja0;
            this.f64563zy = i2 == kja0.f64545cdj;
            this.f20307g = 0;
            this.f20311y = j2;
        }
    }

    public kja0() {
        this(null);
    }

    /* JADX INFO: renamed from: k */
    private static xwq3 m11992k(C3414k c3414k, int i2, String str) {
        byte[] bArrCopyOf = Arrays.copyOf(c3414k.f20303n, c3414k.f64560zy);
        com.google.android.exoplayer2.util.jp0y jp0yVar = new com.google.android.exoplayer2.util.jp0y(bArrCopyOf);
        jp0yVar.m13622i(i2);
        jp0yVar.m13622i(4);
        jp0yVar.ki();
        jp0yVar.t8r(8);
        if (jp0yVar.f7l8()) {
            jp0yVar.t8r(4);
            jp0yVar.t8r(3);
        }
        int iM13627y = jp0yVar.m13627y(4);
        float f2 = 1.0f;
        if (iM13627y == 15) {
            int iM13627y2 = jp0yVar.m13627y(8);
            int iM13627y3 = jp0yVar.m13627y(8);
            if (iM13627y3 == 0) {
                com.google.android.exoplayer2.util.ni7.qrj(f64552x2, "Invalid aspect ratio");
            } else {
                f2 = iM13627y2 / iM13627y3;
            }
        } else {
            float[] fArr = f20290i;
            if (iM13627y < fArr.length) {
                f2 = fArr[iM13627y];
            } else {
                com.google.android.exoplayer2.util.ni7.qrj(f64552x2, "Invalid aspect ratio");
            }
        }
        if (jp0yVar.f7l8()) {
            jp0yVar.t8r(2);
            jp0yVar.t8r(1);
            if (jp0yVar.f7l8()) {
                jp0yVar.t8r(15);
                jp0yVar.ki();
                jp0yVar.t8r(15);
                jp0yVar.ki();
                jp0yVar.t8r(15);
                jp0yVar.ki();
                jp0yVar.t8r(3);
                jp0yVar.t8r(11);
                jp0yVar.ki();
                jp0yVar.t8r(15);
                jp0yVar.ki();
            }
        }
        if (jp0yVar.m13627y(2) != 0) {
            com.google.android.exoplayer2.util.ni7.qrj(f64552x2, "Unhandled video object layer shape");
        }
        jp0yVar.ki();
        int iM13627y4 = jp0yVar.m13627y(16);
        jp0yVar.ki();
        if (jp0yVar.f7l8()) {
            if (iM13627y4 == 0) {
                com.google.android.exoplayer2.util.ni7.qrj(f64552x2, "Invalid vop_increment_time_resolution");
            } else {
                int i3 = 0;
                for (int i4 = iM13627y4 - 1; i4 > 0; i4 >>= 1) {
                    i3++;
                }
                jp0yVar.t8r(i3);
            }
        }
        jp0yVar.ki();
        int iM13627y5 = jp0yVar.m13627y(13);
        jp0yVar.ki();
        int iM13627y6 = jp0yVar.m13627y(13);
        jp0yVar.ki();
        jp0yVar.ki();
        return new xwq3.toq().n5r1(str).m13945m(com.google.android.exoplayer2.util.wvg.f23302h).bf2(iM13627y5).ncyb(iM13627y6).nn86(f2).hyr(Collections.singletonList(bArrCopyOf)).a9();
    }

    @Override // com.google.android.exoplayer2.extractor.ts.qrj
    /* JADX INFO: renamed from: g */
    public void mo11943g(long j2, int i2) {
        if (j2 != C3548p.f65257toq) {
            this.f64554ld6 = j2;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.qrj
    /* JADX INFO: renamed from: n */
    public void mo11944n() {
    }

    @Override // com.google.android.exoplayer2.extractor.ts.qrj
    /* JADX INFO: renamed from: q */
    public void mo11945q(com.google.android.exoplayer2.extractor.x2 x2Var, d3.C3406n c3406n) {
        c3406n.m11952k();
        this.f20297y = c3406n.toq();
        InterfaceC3401t qVar = x2Var.toq(c3406n.zy(), 2);
        this.f20296s = qVar;
        this.f20291g = new toq(qVar);
        eqxt eqxtVar = this.f20292k;
        if (eqxtVar != null) {
            eqxtVar.toq(x2Var, c3406n);
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.qrj
    public void toq(com.google.android.exoplayer2.util.gvn7 gvn7Var) {
        C3844k.ld6(this.f20291g);
        C3844k.ld6(this.f20296s);
        int iM13596n = gvn7Var.m13596n();
        int iM13591g = gvn7Var.m13591g();
        byte[] bArrM13598q = gvn7Var.m13598q();
        this.f64553f7l8 += (long) gvn7Var.m13594k();
        this.f20296s.zy(gvn7Var, gvn7Var.m13594k());
        while (true) {
            int iZy = C3856t.zy(bArrM13598q, iM13596n, iM13591g, this.f64556zy);
            if (iZy == iM13591g) {
                break;
            }
            int i2 = iZy + 3;
            int i3 = gvn7Var.m13598q()[i2] & 255;
            int i4 = iZy - iM13596n;
            int i5 = 0;
            if (!this.f20294p) {
                if (i4 > 0) {
                    this.f20295q.m11993k(bArrM13598q, iM13596n, iZy);
                }
                if (this.f20295q.toq(i3, i4 < 0 ? -i4 : 0)) {
                    InterfaceC3401t interfaceC3401t = this.f20296s;
                    C3414k c3414k = this.f20295q;
                    interfaceC3401t.mo11931q(m11992k(c3414k, c3414k.f20304q, (String) C3844k.f7l8(this.f20297y)));
                    this.f20294p = true;
                }
            }
            this.f20291g.m11994k(bArrM13598q, iM13596n, iZy);
            fn3e fn3eVar = this.f20293n;
            if (fn3eVar != null) {
                if (i4 > 0) {
                    fn3eVar.m11955k(bArrM13598q, iM13596n, iZy);
                } else {
                    i5 = -i4;
                }
                if (this.f20293n.toq(i5)) {
                    fn3e fn3eVar2 = this.f20293n;
                    ((com.google.android.exoplayer2.util.gvn7) lrht.ld6(this.f64555toq)).ncyb(this.f20293n.f20208q, C3856t.cdj(fn3eVar2.f20208q, fn3eVar2.f20207n));
                    ((eqxt) lrht.ld6(this.f20292k)).m11954k(this.f64554ld6, this.f64555toq);
                }
                if (i3 == f64549n7h && gvn7Var.m13598q()[iZy + 2] == 1) {
                    this.f20293n.m11956n(i3);
                }
            }
            int i6 = iM13591g - iZy;
            this.f20291g.toq(this.f64553f7l8 - ((long) i6), i6, this.f20294p);
            this.f20291g.zy(i3, this.f64554ld6);
            iM13596n = i2;
        }
        if (!this.f20294p) {
            this.f20295q.m11993k(bArrM13598q, iM13596n, iM13591g);
        }
        this.f20291g.m11994k(bArrM13598q, iM13596n, iM13591g);
        fn3e fn3eVar3 = this.f20293n;
        if (fn3eVar3 != null) {
            fn3eVar3.m11955k(bArrM13598q, iM13596n, iM13591g);
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.qrj
    public void zy() {
        C3856t.m13727k(this.f64556zy);
        this.f20295q.zy();
        toq toqVar = this.f20291g;
        if (toqVar != null) {
            toqVar.m11995q();
        }
        fn3e fn3eVar = this.f20293n;
        if (fn3eVar != null) {
            fn3eVar.m11957q();
        }
        this.f64553f7l8 = 0L;
        this.f64554ld6 = C3548p.f65257toq;
    }

    kja0(@dd eqxt eqxtVar) {
        this.f20292k = eqxtVar;
        this.f64556zy = new boolean[4];
        this.f20295q = new C3414k(128);
        this.f64554ld6 = C3548p.f65257toq;
        if (eqxtVar != null) {
            this.f20293n = new fn3e(f64549n7h, 128);
            this.f64555toq = new com.google.android.exoplayer2.util.gvn7();
        } else {
            this.f20293n = null;
            this.f64555toq = null;
        }
    }
}
