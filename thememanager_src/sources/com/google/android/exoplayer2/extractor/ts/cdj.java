package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.C3548p;
import com.google.android.exoplayer2.extractor.InterfaceC3401t;
import com.google.android.exoplayer2.extractor.ts.d3;
import com.google.android.exoplayer2.util.C3838g;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.C3856t;
import com.google.android.exoplayer2.util.lrht;
import com.google.android.exoplayer2.xwq3;
import java.util.Collections;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import zy.dd;

/* JADX INFO: compiled from: H265Reader.java */
/* JADX INFO: loaded from: classes2.dex */
public final class cdj implements qrj {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private static final int f64408cdj = 16;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private static final int f64409fn3e = 34;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    private static final int f64410fu4 = 40;

    /* JADX INFO: renamed from: h */
    private static final int f20181h = 9;

    /* JADX INFO: renamed from: i */
    private static final int f20182i = 33;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private static final int f64411ki = 21;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private static final String f64412kja0 = "H265Reader";

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    private static final int f64413ni7 = 39;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private static final int f64414t8r = 32;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private static final int f64415zurt = 35;

    /* JADX INFO: renamed from: k */
    private final jk f20184k;

    /* JADX INFO: renamed from: n */
    private boolean f20185n;

    /* JADX INFO: renamed from: q */
    private C3404k f20187q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private String f64420toq;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private long f64421x2;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private InterfaceC3401t f64422zy;

    /* JADX INFO: renamed from: g */
    private final boolean[] f20183g = new boolean[3];

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private final fn3e f64416f7l8 = new fn3e(32, 128);

    /* JADX INFO: renamed from: y */
    private final fn3e f20189y = new fn3e(33, 128);

    /* JADX INFO: renamed from: s */
    private final fn3e f20188s = new fn3e(34, 128);

    /* JADX INFO: renamed from: p */
    private final fn3e f20186p = new fn3e(39, 128);

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private final fn3e f64417ld6 = new fn3e(40, 128);

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private long f64419qrj = C3548p.f65257toq;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private final com.google.android.exoplayer2.util.gvn7 f64418n7h = new com.google.android.exoplayer2.util.gvn7();

    /* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.ts.cdj$k */
    /* JADX INFO: compiled from: H265Reader.java */
    private static final class C3404k {

        /* JADX INFO: renamed from: n7h, reason: collision with root package name */
        private static final int f64423n7h = 2;

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private boolean f64424f7l8;

        /* JADX INFO: renamed from: g */
        private boolean f20190g;

        /* JADX INFO: renamed from: k */
        private final InterfaceC3401t f20191k;

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        private long f64425ld6;

        /* JADX INFO: renamed from: n */
        private long f20192n;

        /* JADX INFO: renamed from: p */
        private boolean f20193p;

        /* JADX INFO: renamed from: q */
        private int f20194q;

        /* JADX INFO: renamed from: qrj, reason: collision with root package name */
        private boolean f64426qrj;

        /* JADX INFO: renamed from: s */
        private boolean f20195s;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private long f64427toq;

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        private long f64428x2;

        /* JADX INFO: renamed from: y */
        private boolean f20196y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private boolean f64429zy;

        public C3404k(InterfaceC3401t interfaceC3401t) {
            this.f20191k = interfaceC3401t;
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
        /* JADX INFO: renamed from: q */
        private void m11946q(int i2) {
            long j2 = this.f64428x2;
            if (j2 == C3548p.f65257toq) {
                return;
            }
            boolean z2 = this.f64426qrj;
            this.f20191k.mo11930n(j2, z2 ? 1 : 0, (int) (this.f64427toq - this.f64425ld6), i2, null);
        }

        private static boolean toq(int i2) {
            return (32 <= i2 && i2 <= 35) || i2 == 39;
        }

        private static boolean zy(int i2) {
            return i2 < 32 || i2 == 40;
        }

        public void f7l8(long j2, int i2, int i3, long j3, boolean z2) {
            this.f64424f7l8 = false;
            this.f20196y = false;
            this.f20192n = j3;
            this.f20194q = 0;
            this.f64427toq = j2;
            if (!zy(i3)) {
                if (this.f20195s && !this.f20193p) {
                    if (z2) {
                        m11946q(i2);
                    }
                    this.f20195s = false;
                }
                if (toq(i3)) {
                    this.f20196y = !this.f20193p;
                    this.f20193p = true;
                }
            }
            boolean z3 = i3 >= 16 && i3 <= 21;
            this.f64429zy = z3;
            this.f20190g = z3 || i3 <= 9;
        }

        /* JADX INFO: renamed from: g */
        public void m11947g() {
            this.f20190g = false;
            this.f64424f7l8 = false;
            this.f20196y = false;
            this.f20195s = false;
            this.f20193p = false;
        }

        /* JADX INFO: renamed from: k */
        public void m11948k(long j2, int i2, boolean z2) {
            if (this.f20193p && this.f64424f7l8) {
                this.f64426qrj = this.f64429zy;
                this.f20193p = false;
            } else if (this.f20196y || this.f64424f7l8) {
                if (z2 && this.f20195s) {
                    m11946q(i2 + ((int) (j2 - this.f64427toq)));
                }
                this.f64425ld6 = this.f64427toq;
                this.f64428x2 = this.f20192n;
                this.f64426qrj = this.f64429zy;
                this.f20195s = true;
            }
        }

        /* JADX INFO: renamed from: n */
        public void m11949n(byte[] bArr, int i2, int i3) {
            if (this.f20190g) {
                int i4 = this.f20194q;
                int i5 = (i2 + 2) - i4;
                if (i5 >= i3) {
                    this.f20194q = i4 + (i3 - i2);
                } else {
                    this.f64424f7l8 = (bArr[i5] & 128) != 0;
                    this.f20190g = false;
                }
            }
        }
    }

    public cdj(jk jkVar) {
        this.f20184k = jkVar;
    }

    @RequiresNonNull({"output", "sampleReader"})
    private void f7l8(long j2, int i2, int i3, long j3) {
        this.f20187q.m11948k(j2, i2, this.f20185n);
        if (!this.f20185n) {
            this.f64416f7l8.toq(i3);
            this.f20189y.toq(i3);
            this.f20188s.toq(i3);
            if (this.f64416f7l8.zy() && this.f20189y.zy() && this.f20188s.zy()) {
                this.f64422zy.mo11931q(m11941s(this.f64420toq, this.f64416f7l8, this.f20189y, this.f20188s));
                this.f20185n = true;
            }
        }
        if (this.f20186p.toq(i3)) {
            fn3e fn3eVar = this.f20186p;
            this.f64418n7h.ncyb(this.f20186p.f20208q, C3856t.cdj(fn3eVar.f20208q, fn3eVar.f20207n));
            this.f64418n7h.hyr(5);
            this.f20184k.m11991k(j3, this.f64418n7h);
        }
        if (this.f64417ld6.toq(i3)) {
            fn3e fn3eVar2 = this.f64417ld6;
            this.f64418n7h.ncyb(this.f64417ld6.f20208q, C3856t.cdj(fn3eVar2.f20208q, fn3eVar2.f20207n));
            this.f64418n7h.hyr(5);
            this.f20184k.m11991k(j3, this.f64418n7h);
        }
    }

    @EnsuresNonNull({"output", "sampleReader"})
    /* JADX INFO: renamed from: k */
    private void m11939k() {
        C3844k.ld6(this.f64422zy);
        lrht.ld6(this.f20187q);
    }

    private static void ld6(com.google.android.exoplayer2.util.d3 d3Var) {
        int iM13572y = d3Var.m13572y();
        boolean zM13570q = false;
        int i2 = 0;
        for (int i3 = 0; i3 < iM13572y; i3++) {
            if (i3 != 0) {
                zM13570q = d3Var.m13570q();
            }
            if (zM13570q) {
                d3Var.ld6();
                d3Var.m13572y();
                for (int i4 = 0; i4 <= i2; i4++) {
                    if (d3Var.m13570q()) {
                        d3Var.ld6();
                    }
                }
            } else {
                int iM13572y2 = d3Var.m13572y();
                int iM13572y3 = d3Var.m13572y();
                int i5 = iM13572y2 + iM13572y3;
                for (int i6 = 0; i6 < iM13572y2; i6++) {
                    d3Var.m13572y();
                    d3Var.ld6();
                }
                for (int i7 = 0; i7 < iM13572y3; i7++) {
                    d3Var.m13572y();
                    d3Var.ld6();
                }
                i2 = i5;
            }
        }
    }

    /* JADX INFO: renamed from: p */
    private static void m11940p(com.google.android.exoplayer2.util.d3 d3Var) {
        for (int i2 = 0; i2 < 4; i2++) {
            int i3 = 0;
            while (i3 < 6) {
                int i4 = 1;
                if (d3Var.m13570q()) {
                    int iMin = Math.min(64, 1 << ((i2 << 1) + 4));
                    if (i2 > 1) {
                        d3Var.f7l8();
                    }
                    for (int i5 = 0; i5 < iMin; i5++) {
                        d3Var.f7l8();
                    }
                } else {
                    d3Var.m13572y();
                }
                if (i2 == 3) {
                    i4 = 3;
                }
                i3 += i4;
            }
        }
    }

    /* JADX INFO: renamed from: s */
    private static xwq3 m11941s(@dd String str, fn3e fn3eVar, fn3e fn3eVar2, fn3e fn3eVar3) {
        int i2 = fn3eVar.f20207n;
        byte[] bArr = new byte[fn3eVar2.f20207n + i2 + fn3eVar3.f20207n];
        System.arraycopy(fn3eVar.f20208q, 0, bArr, 0, i2);
        System.arraycopy(fn3eVar2.f20208q, 0, bArr, fn3eVar.f20207n, fn3eVar2.f20207n);
        System.arraycopy(fn3eVar3.f20208q, 0, bArr, fn3eVar.f20207n + fn3eVar2.f20207n, fn3eVar3.f20207n);
        com.google.android.exoplayer2.util.d3 d3Var = new com.google.android.exoplayer2.util.d3(fn3eVar2.f20208q, 0, fn3eVar2.f20207n);
        d3Var.x2(44);
        int iM13569n = d3Var.m13569n(3);
        d3Var.ld6();
        int iM13569n2 = d3Var.m13569n(2);
        boolean zM13570q = d3Var.m13570q();
        int iM13569n3 = d3Var.m13569n(5);
        int i3 = 0;
        for (int i4 = 0; i4 < 32; i4++) {
            if (d3Var.m13570q()) {
                i3 |= 1 << i4;
            }
        }
        int[] iArr = new int[6];
        for (int i5 = 0; i5 < 6; i5++) {
            iArr[i5] = d3Var.m13569n(8);
        }
        int iM13569n4 = d3Var.m13569n(8);
        int i6 = 0;
        for (int i7 = 0; i7 < iM13569n; i7++) {
            if (d3Var.m13570q()) {
                i6 += 89;
            }
            if (d3Var.m13570q()) {
                i6 += 8;
            }
        }
        d3Var.x2(i6);
        if (iM13569n > 0) {
            d3Var.x2((8 - iM13569n) * 2);
        }
        d3Var.m13572y();
        int iM13572y = d3Var.m13572y();
        if (iM13572y == 3) {
            d3Var.ld6();
        }
        int iM13572y2 = d3Var.m13572y();
        int iM13572y3 = d3Var.m13572y();
        if (d3Var.m13570q()) {
            int iM13572y4 = d3Var.m13572y();
            int iM13572y5 = d3Var.m13572y();
            int iM13572y6 = d3Var.m13572y();
            int iM13572y7 = d3Var.m13572y();
            iM13572y2 -= ((iM13572y == 1 || iM13572y == 2) ? 2 : 1) * (iM13572y4 + iM13572y5);
            iM13572y3 -= (iM13572y == 1 ? 2 : 1) * (iM13572y6 + iM13572y7);
        }
        d3Var.m13572y();
        d3Var.m13572y();
        int iM13572y8 = d3Var.m13572y();
        for (int i8 = d3Var.m13570q() ? 0 : iM13569n; i8 <= iM13569n; i8++) {
            d3Var.m13572y();
            d3Var.m13572y();
            d3Var.m13572y();
        }
        d3Var.m13572y();
        d3Var.m13572y();
        d3Var.m13572y();
        d3Var.m13572y();
        d3Var.m13572y();
        d3Var.m13572y();
        if (d3Var.m13570q() && d3Var.m13570q()) {
            m11940p(d3Var);
        }
        d3Var.x2(2);
        if (d3Var.m13570q()) {
            d3Var.x2(8);
            d3Var.m13572y();
            d3Var.m13572y();
            d3Var.ld6();
        }
        ld6(d3Var);
        if (d3Var.m13570q()) {
            for (int i9 = 0; i9 < d3Var.m13572y(); i9++) {
                d3Var.x2(iM13572y8 + 4 + 1);
            }
        }
        d3Var.x2(2);
        float f2 = 1.0f;
        if (d3Var.m13570q()) {
            if (d3Var.m13570q()) {
                int iM13569n5 = d3Var.m13569n(8);
                if (iM13569n5 == 255) {
                    int iM13569n6 = d3Var.m13569n(16);
                    int iM13569n7 = d3Var.m13569n(16);
                    if (iM13569n6 != 0 && iM13569n7 != 0) {
                        f2 = iM13569n6 / iM13569n7;
                    }
                } else {
                    float[] fArr = C3856t.f23272q;
                    if (iM13569n5 < fArr.length) {
                        f2 = fArr[iM13569n5];
                    } else {
                        StringBuilder sb = new StringBuilder(46);
                        sb.append("Unexpected aspect_ratio_idc value: ");
                        sb.append(iM13569n5);
                        com.google.android.exoplayer2.util.ni7.qrj(f64412kja0, sb.toString());
                    }
                }
            }
            if (d3Var.m13570q()) {
                d3Var.ld6();
            }
            if (d3Var.m13570q()) {
                d3Var.x2(4);
                if (d3Var.m13570q()) {
                    d3Var.x2(24);
                }
            }
            if (d3Var.m13570q()) {
                d3Var.m13572y();
                d3Var.m13572y();
            }
            d3Var.ld6();
            if (d3Var.m13570q()) {
                iM13572y3 *= 2;
            }
        }
        return new xwq3.toq().n5r1(str).m13945m(com.google.android.exoplayer2.util.wvg.f67117ld6).d3(C3838g.zy(iM13569n2, zM13570q, iM13569n3, i3, iArr, iM13569n4)).bf2(iM13572y2).ncyb(iM13572y3).nn86(f2).hyr(Collections.singletonList(bArr)).a9();
    }

    @RequiresNonNull({"sampleReader"})
    private void x2(long j2, int i2, int i3, long j3) {
        this.f20187q.f7l8(j2, i2, i3, j3, this.f20185n);
        if (!this.f20185n) {
            this.f64416f7l8.m11956n(i3);
            this.f20189y.m11956n(i3);
            this.f20188s.m11956n(i3);
        }
        this.f20186p.m11956n(i3);
        this.f64417ld6.m11956n(i3);
    }

    @RequiresNonNull({"sampleReader"})
    /* JADX INFO: renamed from: y */
    private void m11942y(byte[] bArr, int i2, int i3) {
        this.f20187q.m11949n(bArr, i2, i3);
        if (!this.f20185n) {
            this.f64416f7l8.m11955k(bArr, i2, i3);
            this.f20189y.m11955k(bArr, i2, i3);
            this.f20188s.m11955k(bArr, i2, i3);
        }
        this.f20186p.m11955k(bArr, i2, i3);
        this.f64417ld6.m11955k(bArr, i2, i3);
    }

    @Override // com.google.android.exoplayer2.extractor.ts.qrj
    /* JADX INFO: renamed from: g */
    public void mo11943g(long j2, int i2) {
        if (j2 != C3548p.f65257toq) {
            this.f64419qrj = j2;
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
        this.f64420toq = c3406n.toq();
        InterfaceC3401t qVar = x2Var.toq(c3406n.zy(), 2);
        this.f64422zy = qVar;
        this.f20187q = new C3404k(qVar);
        this.f20184k.toq(x2Var, c3406n);
    }

    @Override // com.google.android.exoplayer2.extractor.ts.qrj
    public void toq(com.google.android.exoplayer2.util.gvn7 gvn7Var) {
        m11939k();
        while (gvn7Var.m13594k() > 0) {
            int iM13596n = gvn7Var.m13596n();
            int iM13591g = gvn7Var.m13591g();
            byte[] bArrM13598q = gvn7Var.m13598q();
            this.f64421x2 += (long) gvn7Var.m13594k();
            this.f64422zy.zy(gvn7Var, gvn7Var.m13594k());
            while (iM13596n < iM13591g) {
                int iZy = C3856t.zy(bArrM13598q, iM13596n, iM13591g, this.f20183g);
                if (iZy == iM13591g) {
                    m11942y(bArrM13598q, iM13596n, iM13591g);
                    return;
                }
                int iM13728n = C3856t.m13728n(bArrM13598q, iZy);
                int i2 = iZy - iM13596n;
                if (i2 > 0) {
                    m11942y(bArrM13598q, iM13596n, iZy);
                }
                int i3 = iM13591g - iZy;
                long j2 = this.f64421x2 - ((long) i3);
                f7l8(j2, i3, i2 < 0 ? -i2 : 0, this.f64419qrj);
                x2(j2, i3, iM13728n, this.f64419qrj);
                iM13596n = iZy + 3;
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.qrj
    public void zy() {
        this.f64421x2 = 0L;
        this.f64419qrj = C3548p.f65257toq;
        C3856t.m13727k(this.f20183g);
        this.f64416f7l8.m11957q();
        this.f20189y.m11957q();
        this.f20188s.m11957q();
        this.f20186p.m11957q();
        this.f64417ld6.m11957q();
        C3404k c3404k = this.f20187q;
        if (c3404k != null) {
            c3404k.m11947g();
        }
    }
}
