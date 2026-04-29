package com.google.android.exoplayer2.extractor.ts;

import android.util.SparseArray;
import com.google.android.exoplayer2.C3548p;
import com.google.android.exoplayer2.extractor.InterfaceC3401t;
import com.google.android.exoplayer2.extractor.ts.d3;
import com.google.android.exoplayer2.util.C3838g;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.C3856t;
import com.google.android.exoplayer2.util.lrht;
import com.google.android.exoplayer2.xwq3;
import java.util.ArrayList;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import zy.dd;

/* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.ts.h */
/* JADX INFO: compiled from: H264Reader.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C3411h implements qrj {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private static final int f64499cdj = 7;

    /* JADX INFO: renamed from: h */
    private static final int f20251h = 6;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private static final int f64500ki = 8;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private long f64501f7l8;

    /* JADX INFO: renamed from: k */
    private final jk f20253k;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private toq f64503ld6;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private boolean f64504n7h;

    /* JADX INFO: renamed from: p */
    private InterfaceC3401t f20255p;

    /* JADX INFO: renamed from: s */
    private String f20257s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final boolean f64506toq;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private boolean f64507x2;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final boolean f64508zy;

    /* JADX INFO: renamed from: y */
    private final boolean[] f20258y = new boolean[3];

    /* JADX INFO: renamed from: q */
    private final fn3e f20256q = new fn3e(7, 128);

    /* JADX INFO: renamed from: n */
    private final fn3e f20254n = new fn3e(8, 128);

    /* JADX INFO: renamed from: g */
    private final fn3e f20252g = new fn3e(6, 128);

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private long f64505qrj = C3548p.f65257toq;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private final com.google.android.exoplayer2.util.gvn7 f64502kja0 = new com.google.android.exoplayer2.util.gvn7();

    /* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.ts.h$toq */
    /* JADX INFO: compiled from: H264Reader.java */
    private static final class toq {

        /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
        private static final int f64509fn3e = 2;

        /* JADX INFO: renamed from: i */
        private static final int f20259i = 1;

        /* JADX INFO: renamed from: ni7, reason: collision with root package name */
        private static final int f64510ni7 = 9;

        /* JADX INFO: renamed from: t8r, reason: collision with root package name */
        private static final int f64511t8r = 128;

        /* JADX INFO: renamed from: zurt, reason: collision with root package name */
        private static final int f64512zurt = 5;

        /* JADX INFO: renamed from: cdj, reason: collision with root package name */
        private long f64513cdj;

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private byte[] f64514f7l8;

        /* JADX INFO: renamed from: g */
        private final com.google.android.exoplayer2.util.d3 f20260g;

        /* JADX INFO: renamed from: h */
        private long f20261h;

        /* JADX INFO: renamed from: k */
        private final InterfaceC3401t f20262k;

        /* JADX INFO: renamed from: ki, reason: collision with root package name */
        private boolean f64515ki;

        /* JADX INFO: renamed from: kja0, reason: collision with root package name */
        private boolean f64516kja0;

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        private boolean f64517ld6;

        /* JADX INFO: renamed from: n7h, reason: collision with root package name */
        private k f64518n7h;

        /* JADX INFO: renamed from: p */
        private long f20264p;

        /* JADX INFO: renamed from: qrj, reason: collision with root package name */
        private k f64519qrj;

        /* JADX INFO: renamed from: s */
        private int f20266s;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final boolean f64520toq;

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        private long f64521x2;

        /* JADX INFO: renamed from: y */
        private int f20267y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final boolean f64522zy;

        /* JADX INFO: renamed from: q */
        private final SparseArray<C3856t.zy> f20265q = new SparseArray<>();

        /* JADX INFO: renamed from: n */
        private final SparseArray<C3856t.toq> f20263n = new SparseArray<>();

        /* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.ts.h$toq$k */
        /* JADX INFO: compiled from: H264Reader.java */
        private static final class k {

            /* JADX INFO: renamed from: cdj, reason: collision with root package name */
            private static final int f64523cdj = 2;

            /* JADX INFO: renamed from: ki, reason: collision with root package name */
            private static final int f64524ki = 7;

            /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
            private int f64525f7l8;

            /* JADX INFO: renamed from: g */
            private int f20268g;

            /* JADX INFO: renamed from: h */
            private int f20269h;

            /* JADX INFO: renamed from: k */
            private boolean f20270k;

            /* JADX INFO: renamed from: kja0, reason: collision with root package name */
            private int f64526kja0;

            /* JADX INFO: renamed from: ld6, reason: collision with root package name */
            private boolean f64527ld6;

            /* JADX INFO: renamed from: n */
            private int f20271n;

            /* JADX INFO: renamed from: n7h, reason: collision with root package name */
            private int f64528n7h;

            /* JADX INFO: renamed from: p */
            private boolean f20272p;

            /* JADX INFO: renamed from: q */
            private int f20273q;

            /* JADX INFO: renamed from: qrj, reason: collision with root package name */
            private int f64529qrj;

            /* JADX INFO: renamed from: s */
            private boolean f20274s;

            /* JADX INFO: renamed from: toq, reason: collision with root package name */
            private boolean f64530toq;

            /* JADX INFO: renamed from: x2, reason: collision with root package name */
            private int f64531x2;

            /* JADX INFO: renamed from: y */
            private boolean f20275y;

            /* JADX INFO: renamed from: zy, reason: collision with root package name */
            @dd
            private C3856t.zy f64532zy;

            private k() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public boolean zy(k kVar) {
                int i2;
                int i3;
                int i4;
                boolean z2;
                if (!this.f20270k) {
                    return false;
                }
                if (!kVar.f20270k) {
                    return true;
                }
                C3856t.zy zyVar = (C3856t.zy) C3844k.ld6(this.f64532zy);
                C3856t.zy zyVar2 = (C3856t.zy) C3844k.ld6(kVar.f64532zy);
                return (this.f20268g == kVar.f20268g && this.f64525f7l8 == kVar.f64525f7l8 && this.f20275y == kVar.f20275y && (!this.f20274s || !kVar.f20274s || this.f20272p == kVar.f20272p) && (((i2 = this.f20273q) == (i3 = kVar.f20273q) || (i2 != 0 && i3 != 0)) && (((i4 = zyVar.f67078ld6) != 0 || zyVar2.f67078ld6 != 0 || (this.f64529qrj == kVar.f64529qrj && this.f64528n7h == kVar.f64528n7h)) && ((i4 != 1 || zyVar2.f67078ld6 != 1 || (this.f64526kja0 == kVar.f64526kja0 && this.f20269h == kVar.f20269h)) && (z2 = this.f64527ld6) == kVar.f64527ld6 && (!z2 || this.f64531x2 == kVar.f64531x2))))) ? false : true;
            }

            /* JADX INFO: renamed from: g */
            public void m11986g(int i2) {
                this.f20271n = i2;
                this.f64530toq = true;
            }

            /* JADX INFO: renamed from: n */
            public void m11987n(C3856t.zy zyVar, int i2, int i3, int i4, int i5, boolean z2, boolean z3, boolean z5, boolean z6, int i6, int i7, int i8, int i9, int i10) {
                this.f64532zy = zyVar;
                this.f20273q = i2;
                this.f20271n = i3;
                this.f20268g = i4;
                this.f64525f7l8 = i5;
                this.f20275y = z2;
                this.f20274s = z3;
                this.f20272p = z5;
                this.f64527ld6 = z6;
                this.f64531x2 = i6;
                this.f64529qrj = i7;
                this.f64528n7h = i8;
                this.f64526kja0 = i9;
                this.f20269h = i10;
                this.f20270k = true;
                this.f64530toq = true;
            }

            /* JADX INFO: renamed from: q */
            public boolean m11988q() {
                int i2;
                return this.f64530toq && ((i2 = this.f20271n) == 7 || i2 == 2);
            }

            public void toq() {
                this.f64530toq = false;
                this.f20270k = false;
            }
        }

        public toq(InterfaceC3401t interfaceC3401t, boolean z2, boolean z3) {
            this.f20262k = interfaceC3401t;
            this.f64520toq = z2;
            this.f64522zy = z3;
            this.f64519qrj = new k();
            this.f64518n7h = new k();
            byte[] bArr = new byte[128];
            this.f64514f7l8 = bArr;
            this.f20260g = new com.google.android.exoplayer2.util.d3(bArr, 0, 0);
            f7l8();
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
        private void m11980q(int i2) {
            long j2 = this.f64513cdj;
            if (j2 == C3548p.f65257toq) {
                return;
            }
            boolean z2 = this.f64515ki;
            this.f20262k.mo11930n(j2, z2 ? 1 : 0, (int) (this.f20264p - this.f20261h), i2, null);
        }

        public void f7l8() {
            this.f64517ld6 = false;
            this.f64516kja0 = false;
            this.f64518n7h.toq();
        }

        /* JADX INFO: renamed from: g */
        public void m11981g(C3856t.zy zyVar) {
            this.f20265q.append(zyVar.f23287q, zyVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:53:0x00ff  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0102  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x0106  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0118  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x011e  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x0152  */
        /* JADX INFO: renamed from: k */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void m11982k(byte[] r24, int r25, int r26) {
            /*
                Method dump skipped, instruction units count: 414
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.ts.C3411h.toq.m11982k(byte[], int, int):void");
        }

        /* JADX INFO: renamed from: n */
        public void m11983n(C3856t.toq toqVar) {
            this.f20263n.append(toqVar.f23282k, toqVar);
        }

        public boolean toq(long j2, int i2, boolean z2, boolean z3) {
            boolean z5 = false;
            if (this.f20266s == 9 || (this.f64522zy && this.f64518n7h.zy(this.f64519qrj))) {
                if (z2 && this.f64516kja0) {
                    m11980q(i2 + ((int) (j2 - this.f20264p)));
                }
                this.f20261h = this.f20264p;
                this.f64513cdj = this.f64521x2;
                this.f64515ki = false;
                this.f64516kja0 = true;
            }
            if (this.f64520toq) {
                z3 = this.f64518n7h.m11988q();
            }
            boolean z6 = this.f64515ki;
            int i3 = this.f20266s;
            if (i3 == 5 || (z3 && i3 == 1)) {
                z5 = true;
            }
            boolean z7 = z6 | z5;
            this.f64515ki = z7;
            return z7;
        }

        /* JADX INFO: renamed from: y */
        public void m11984y(long j2, int i2, long j3) {
            this.f20266s = i2;
            this.f64521x2 = j3;
            this.f20264p = j2;
            if (!this.f64520toq || i2 != 1) {
                if (!this.f64522zy) {
                    return;
                }
                if (i2 != 5 && i2 != 1 && i2 != 2) {
                    return;
                }
            }
            k kVar = this.f64519qrj;
            this.f64519qrj = this.f64518n7h;
            this.f64518n7h = kVar;
            kVar.toq();
            this.f20267y = 0;
            this.f64517ld6 = true;
        }

        public boolean zy() {
            return this.f64522zy;
        }
    }

    public C3411h(jk jkVar, boolean z2, boolean z3) {
        this.f20253k = jkVar;
        this.f64506toq = z2;
        this.f64508zy = z3;
    }

    @RequiresNonNull({"output", "sampleReader"})
    private void f7l8(long j2, int i2, int i3, long j3) {
        if (!this.f64507x2 || this.f64503ld6.zy()) {
            this.f20256q.toq(i3);
            this.f20254n.toq(i3);
            if (this.f64507x2) {
                if (this.f20256q.zy()) {
                    fn3e fn3eVar = this.f20256q;
                    this.f64503ld6.m11981g(C3856t.x2(fn3eVar.f20208q, 3, fn3eVar.f20207n));
                    this.f20256q.m11957q();
                } else if (this.f20254n.zy()) {
                    fn3e fn3eVar2 = this.f20254n;
                    this.f64503ld6.m11983n(C3856t.m13729p(fn3eVar2.f20208q, 3, fn3eVar2.f20207n));
                    this.f20254n.m11957q();
                }
            } else if (this.f20256q.zy() && this.f20254n.zy()) {
                ArrayList arrayList = new ArrayList();
                fn3e fn3eVar3 = this.f20256q;
                arrayList.add(Arrays.copyOf(fn3eVar3.f20208q, fn3eVar3.f20207n));
                fn3e fn3eVar4 = this.f20254n;
                arrayList.add(Arrays.copyOf(fn3eVar4.f20208q, fn3eVar4.f20207n));
                fn3e fn3eVar5 = this.f20256q;
                C3856t.zy zyVarX2 = C3856t.x2(fn3eVar5.f20208q, 3, fn3eVar5.f20207n);
                fn3e fn3eVar6 = this.f20254n;
                C3856t.toq toqVarM13729p = C3856t.m13729p(fn3eVar6.f20208q, 3, fn3eVar6.f20207n);
                this.f20255p.mo11931q(new xwq3.toq().n5r1(this.f20257s).m13945m(com.google.android.exoplayer2.util.wvg.f23310p).d3(C3838g.m13586k(zyVarX2.f23284k, zyVarX2.f67080toq, zyVarX2.f67082zy)).bf2(zyVarX2.f23285n).ncyb(zyVarX2.f23283g).nn86(zyVarX2.f67077f7l8).hyr(arrayList).a9());
                this.f64507x2 = true;
                this.f64503ld6.m11981g(zyVarX2);
                this.f64503ld6.m11983n(toqVarM13729p);
                this.f20256q.m11957q();
                this.f20254n.m11957q();
            }
        }
        if (this.f20252g.toq(i3)) {
            fn3e fn3eVar7 = this.f20252g;
            this.f64502kja0.ncyb(this.f20252g.f20208q, C3856t.cdj(fn3eVar7.f20208q, fn3eVar7.f20207n));
            this.f64502kja0.n5r1(4);
            this.f20253k.m11991k(j3, this.f64502kja0);
        }
        if (this.f64503ld6.toq(j2, i2, this.f64507x2, this.f64504n7h)) {
            this.f64504n7h = false;
        }
    }

    @EnsuresNonNull({"output", "sampleReader"})
    /* JADX INFO: renamed from: k */
    private void m11977k() {
        C3844k.ld6(this.f20255p);
        lrht.ld6(this.f64503ld6);
    }

    @RequiresNonNull({"sampleReader"})
    /* JADX INFO: renamed from: s */
    private void m11978s(long j2, int i2, long j3) {
        if (!this.f64507x2 || this.f64503ld6.zy()) {
            this.f20256q.m11956n(i2);
            this.f20254n.m11956n(i2);
        }
        this.f20252g.m11956n(i2);
        this.f64503ld6.m11984y(j2, i2, j3);
    }

    @RequiresNonNull({"sampleReader"})
    /* JADX INFO: renamed from: y */
    private void m11979y(byte[] bArr, int i2, int i3) {
        if (!this.f64507x2 || this.f64503ld6.zy()) {
            this.f20256q.m11955k(bArr, i2, i3);
            this.f20254n.m11955k(bArr, i2, i3);
        }
        this.f20252g.m11955k(bArr, i2, i3);
        this.f64503ld6.m11982k(bArr, i2, i3);
    }

    @Override // com.google.android.exoplayer2.extractor.ts.qrj
    /* JADX INFO: renamed from: g */
    public void mo11943g(long j2, int i2) {
        if (j2 != C3548p.f65257toq) {
            this.f64505qrj = j2;
        }
        this.f64504n7h |= (i2 & 2) != 0;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.qrj
    /* JADX INFO: renamed from: n */
    public void mo11944n() {
    }

    @Override // com.google.android.exoplayer2.extractor.ts.qrj
    /* JADX INFO: renamed from: q */
    public void mo11945q(com.google.android.exoplayer2.extractor.x2 x2Var, d3.C3406n c3406n) {
        c3406n.m11952k();
        this.f20257s = c3406n.toq();
        InterfaceC3401t qVar = x2Var.toq(c3406n.zy(), 2);
        this.f20255p = qVar;
        this.f64503ld6 = new toq(qVar, this.f64506toq, this.f64508zy);
        this.f20253k.toq(x2Var, c3406n);
    }

    @Override // com.google.android.exoplayer2.extractor.ts.qrj
    public void toq(com.google.android.exoplayer2.util.gvn7 gvn7Var) {
        m11977k();
        int iM13596n = gvn7Var.m13596n();
        int iM13591g = gvn7Var.m13591g();
        byte[] bArrM13598q = gvn7Var.m13598q();
        this.f64501f7l8 += (long) gvn7Var.m13594k();
        this.f20255p.zy(gvn7Var, gvn7Var.m13594k());
        while (true) {
            int iZy = C3856t.zy(bArrM13598q, iM13596n, iM13591g, this.f20258y);
            if (iZy == iM13591g) {
                m11979y(bArrM13598q, iM13596n, iM13591g);
                return;
            }
            int iM13725g = C3856t.m13725g(bArrM13598q, iZy);
            int i2 = iZy - iM13596n;
            if (i2 > 0) {
                m11979y(bArrM13598q, iM13596n, iZy);
            }
            int i3 = iM13591g - iZy;
            long j2 = this.f64501f7l8 - ((long) i3);
            f7l8(j2, i3, i2 < 0 ? -i2 : 0, this.f64505qrj);
            m11978s(j2, iM13725g, this.f64505qrj);
            iM13596n = iZy + 3;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.qrj
    public void zy() {
        this.f64501f7l8 = 0L;
        this.f64504n7h = false;
        this.f64505qrj = C3548p.f65257toq;
        C3856t.m13727k(this.f20258y);
        this.f20256q.m11957q();
        this.f20254n.m11957q();
        this.f20252g.m11957q();
        toq toqVar = this.f64503ld6;
        if (toqVar != null) {
            toqVar.f7l8();
        }
    }
}
