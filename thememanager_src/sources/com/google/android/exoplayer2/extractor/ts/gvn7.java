package com.google.android.exoplayer2.extractor.ts;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.google.android.exoplayer2.C3548p;
import com.google.android.exoplayer2.extractor.InterfaceC3397p;
import com.google.android.exoplayer2.extractor.o1t;
import com.google.android.exoplayer2.extractor.ts.d3;
import com.google.android.exoplayer2.sok;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.C3847l;
import com.google.android.exoplayer2.util.lrht;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import zy.dd;

/* JADX INFO: compiled from: TsExtractor.java */
/* JADX INFO: loaded from: classes2.dex */
public final class gvn7 implements InterfaceC3397p {

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    public static final int f64455a9 = 15;

    /* JADX INFO: renamed from: c */
    private static final int f20227c = 0;

    /* JADX INFO: renamed from: d2ok, reason: collision with root package name */
    public static final int f64456d2ok = 2;

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    public static final int f64457d3 = 130;

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    public static final int f64458dd = 36;

    /* JADX INFO: renamed from: e */
    private static final long f20228e = 1094921524;

    /* JADX INFO: renamed from: eqxt, reason: collision with root package name */
    public static final int f64459eqxt = 172;

    /* JADX INFO: renamed from: f */
    public static final int f20229f = 71;

    /* JADX INFO: renamed from: fti, reason: collision with root package name */
    public static final int f64460fti = 17;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    public static final int f64461fu4 = 0;

    /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
    public static final int f64462gvn7 = 138;

    /* JADX INFO: renamed from: hb, reason: collision with root package name */
    private static final int f64463hb = 9400;

    /* JADX INFO: renamed from: hyr, reason: collision with root package name */
    public static final int f64464hyr = 257;

    /* JADX INFO: renamed from: j */
    private static final int f20230j = 5;

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    public static final int f64465jk = 4;

    /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
    public static final int f64466jp0y = 129;

    /* JADX INFO: renamed from: l */
    public static final int f20231l = 89;

    /* JADX INFO: renamed from: lrht, reason: collision with root package name */
    private static final int f64467lrht = 8192;

    /* JADX INFO: renamed from: lvui, reason: collision with root package name */
    public static final int f64468lvui = 16;

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    public static final int f64469mcp = 3;

    /* JADX INFO: renamed from: n5r1, reason: collision with root package name */
    public static final int f64470n5r1 = 128;

    /* JADX INFO: renamed from: ncyb, reason: collision with root package name */
    public static final int f64471ncyb = 134;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    public static final com.google.android.exoplayer2.extractor.kja0 f64472ni7 = new com.google.android.exoplayer2.extractor.kja0() { // from class: com.google.android.exoplayer2.extractor.ts.jp0y
        @Override // com.google.android.exoplayer2.extractor.kja0
        public final InterfaceC3397p[] zy() {
            return gvn7.ni7();
        }
    };

    /* JADX INFO: renamed from: nn86, reason: collision with root package name */
    private static final long f64473nn86 = 1212503619;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    public static final int f64474o1t = 2;

    /* JADX INFO: renamed from: oc, reason: collision with root package name */
    public static final int f64475oc = 135;

    /* JADX INFO: renamed from: r */
    public static final int f20232r = 27;

    /* JADX INFO: renamed from: t */
    public static final int f20233t = 112800;

    /* JADX INFO: renamed from: uv6, reason: collision with root package name */
    private static final long f64476uv6 = 1094921523;

    /* JADX INFO: renamed from: vyq, reason: collision with root package name */
    private static final long f64477vyq = 1161904947;

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    public static final int f64478wvg = 188;

    /* JADX INFO: renamed from: x9kr, reason: collision with root package name */
    public static final int f64479x9kr = 21;

    /* JADX INFO: renamed from: z */
    public static final int f20234z = 1;

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private boolean f64480cdj;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private final com.google.android.exoplayer2.util.gvn7 f64481f7l8;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private int f64482fn3e;

    /* JADX INFO: renamed from: g */
    private final List<C3847l> f20235g;

    /* JADX INFO: renamed from: h */
    private int f20236h;

    /* JADX INFO: renamed from: i */
    @dd
    private d3 f20237i;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private boolean f64483ki;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private com.google.android.exoplayer2.extractor.x2 f64484kja0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private final SparseBooleanArray f64485ld6;

    /* JADX INFO: renamed from: n */
    private final int f20238n;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private a9 f64486n7h;

    /* JADX INFO: renamed from: p */
    private final SparseArray<d3> f20239p;

    /* JADX INFO: renamed from: q */
    private final int f20240q;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private final fti f64487qrj;

    /* JADX INFO: renamed from: s */
    private final d3.zy f20241s;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private boolean f64488t8r;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private final SparseBooleanArray f64489x2;

    /* JADX INFO: renamed from: y */
    private final SparseIntArray f20242y;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private int f64490zurt;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.ts.gvn7$k */
    /* JADX INFO: compiled from: TsExtractor.java */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC3410k {
    }

    /* JADX INFO: compiled from: TsExtractor.java */
    private class toq implements InterfaceC3420t {

        /* JADX INFO: renamed from: k */
        private final com.google.android.exoplayer2.util.jp0y f20243k = new com.google.android.exoplayer2.util.jp0y(new byte[4]);

        public toq() {
        }

        @Override // com.google.android.exoplayer2.extractor.ts.InterfaceC3420t
        /* JADX INFO: renamed from: k */
        public void mo11976k(C3847l c3847l, com.google.android.exoplayer2.extractor.x2 x2Var, d3.C3406n c3406n) {
        }

        @Override // com.google.android.exoplayer2.extractor.ts.InterfaceC3420t
        public void toq(com.google.android.exoplayer2.util.gvn7 gvn7Var) {
            if (gvn7Var.jp0y() == 0 && (gvn7Var.jp0y() & 128) != 0) {
                gvn7Var.hyr(6);
                int iM13594k = gvn7Var.m13594k() / 4;
                for (int i2 = 0; i2 < iM13594k; i2++) {
                    gvn7Var.m13600s(this.f20243k, 4);
                    int iM13627y = this.f20243k.m13627y(16);
                    this.f20243k.t8r(3);
                    if (iM13627y == 0) {
                        this.f20243k.t8r(13);
                    } else {
                        int iM13627y2 = this.f20243k.m13627y(13);
                        if (gvn7.this.f20239p.get(iM13627y2) == null) {
                            gvn7.this.f20239p.put(iM13627y2, new mcp(gvn7.this.new zy(iM13627y2)));
                            gvn7.ld6(gvn7.this);
                        }
                    }
                }
                if (gvn7.this.f20240q != 2) {
                    gvn7.this.f20239p.remove(0);
                }
            }
        }
    }

    /* JADX INFO: compiled from: TsExtractor.java */
    private class zy implements InterfaceC3420t {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private static final int f64492f7l8 = 10;

        /* JADX INFO: renamed from: g */
        private static final int f20244g = 5;

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        private static final int f64493ld6 = 123;

        /* JADX INFO: renamed from: n7h, reason: collision with root package name */
        private static final int f64494n7h = 21;

        /* JADX INFO: renamed from: p */
        private static final int f20245p = 122;

        /* JADX INFO: renamed from: qrj, reason: collision with root package name */
        private static final int f64495qrj = 89;

        /* JADX INFO: renamed from: s */
        private static final int f20246s = 111;

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        private static final int f64496x2 = 127;

        /* JADX INFO: renamed from: y */
        private static final int f20247y = 106;

        /* JADX INFO: renamed from: q */
        private final int f20250q;

        /* JADX INFO: renamed from: k */
        private final com.google.android.exoplayer2.util.jp0y f20248k = new com.google.android.exoplayer2.util.jp0y(new byte[5]);

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final SparseArray<d3> f64497toq = new SparseArray<>();

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final SparseIntArray f64498zy = new SparseIntArray();

        public zy(int i2) {
            this.f20250q = i2;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0057  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x005d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private com.google.android.exoplayer2.extractor.ts.d3.toq zy(com.google.android.exoplayer2.util.gvn7 r14, int r15) {
            /*
                Method dump skipped, instruction units count: 205
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.ts.gvn7.zy.zy(com.google.android.exoplayer2.util.gvn7, int):com.google.android.exoplayer2.extractor.ts.d3$toq");
        }

        @Override // com.google.android.exoplayer2.extractor.ts.InterfaceC3420t
        /* JADX INFO: renamed from: k */
        public void mo11976k(C3847l c3847l, com.google.android.exoplayer2.extractor.x2 x2Var, d3.C3406n c3406n) {
        }

        @Override // com.google.android.exoplayer2.extractor.ts.InterfaceC3420t
        public void toq(com.google.android.exoplayer2.util.gvn7 gvn7Var) {
            C3847l c3847l;
            if (gvn7Var.jp0y() != 2) {
                return;
            }
            if (gvn7.this.f20240q == 1 || gvn7.this.f20240q == 2 || gvn7.this.f20236h == 1) {
                c3847l = (C3847l) gvn7.this.f20235g.get(0);
            } else {
                c3847l = new C3847l(((C3847l) gvn7.this.f20235g.get(0)).zy());
                gvn7.this.f20235g.add(c3847l);
            }
            if ((gvn7Var.jp0y() & 128) == 0) {
                return;
            }
            gvn7Var.hyr(1);
            int iLvui = gvn7Var.lvui();
            int i2 = 3;
            gvn7Var.hyr(3);
            gvn7Var.m13600s(this.f20248k, 2);
            this.f20248k.t8r(3);
            int i3 = 13;
            gvn7.this.f64490zurt = this.f20248k.m13627y(13);
            gvn7Var.m13600s(this.f20248k, 2);
            int i4 = 4;
            this.f20248k.t8r(4);
            gvn7Var.hyr(this.f20248k.m13627y(12));
            if (gvn7.this.f20240q == 2 && gvn7.this.f20237i == null) {
                d3.toq toqVar = new d3.toq(21, null, null, lrht.f23228g);
                gvn7 gvn7Var2 = gvn7.this;
                gvn7Var2.f20237i = gvn7Var2.f20241s.toq(21, toqVar);
                if (gvn7.this.f20237i != null) {
                    gvn7.this.f20237i.mo11950k(c3847l, gvn7.this.f64484kja0, new d3.C3406n(iLvui, 21, 8192));
                }
            }
            this.f64497toq.clear();
            this.f64498zy.clear();
            int iM13594k = gvn7Var.m13594k();
            while (iM13594k > 0) {
                gvn7Var.m13600s(this.f20248k, 5);
                int iM13627y = this.f20248k.m13627y(8);
                this.f20248k.t8r(i2);
                int iM13627y2 = this.f20248k.m13627y(i3);
                this.f20248k.t8r(i4);
                int iM13627y3 = this.f20248k.m13627y(12);
                d3.toq toqVarZy = zy(gvn7Var, iM13627y3);
                if (iM13627y == 6 || iM13627y == 5) {
                    iM13627y = toqVarZy.f20203k;
                }
                iM13594k -= iM13627y3 + 5;
                int i5 = gvn7.this.f20240q == 2 ? iM13627y : iM13627y2;
                if (!gvn7.this.f64485ld6.get(i5)) {
                    d3 qVar = (gvn7.this.f20240q == 2 && iM13627y == 21) ? gvn7.this.f20237i : gvn7.this.f20241s.toq(iM13627y, toqVarZy);
                    if (gvn7.this.f20240q != 2 || iM13627y2 < this.f64498zy.get(i5, 8192)) {
                        this.f64498zy.put(i5, iM13627y2);
                        this.f64497toq.put(i5, qVar);
                    }
                }
                i2 = 3;
                i4 = 4;
                i3 = 13;
            }
            int size = this.f64498zy.size();
            for (int i6 = 0; i6 < size; i6++) {
                int iKeyAt = this.f64498zy.keyAt(i6);
                int iValueAt = this.f64498zy.valueAt(i6);
                gvn7.this.f64485ld6.put(iKeyAt, true);
                gvn7.this.f64489x2.put(iValueAt, true);
                d3 d3VarValueAt = this.f64497toq.valueAt(i6);
                if (d3VarValueAt != null) {
                    if (d3VarValueAt != gvn7.this.f20237i) {
                        d3VarValueAt.mo11950k(c3847l, gvn7.this.f64484kja0, new d3.C3406n(iLvui, iKeyAt, 8192));
                    }
                    gvn7.this.f20239p.put(iValueAt, d3VarValueAt);
                }
            }
            if (gvn7.this.f20240q == 2) {
                if (gvn7.this.f64480cdj) {
                    return;
                }
                gvn7.this.f64484kja0.mo11753i();
                gvn7.this.f20236h = 0;
                gvn7.this.f64480cdj = true;
                return;
            }
            gvn7.this.f20239p.remove(this.f20250q);
            gvn7 gvn7Var3 = gvn7.this;
            gvn7Var3.f20236h = gvn7Var3.f20240q == 1 ? 0 : gvn7.this.f20236h - 1;
            if (gvn7.this.f20236h == 0) {
                gvn7.this.f64484kja0.mo11753i();
                gvn7.this.f64480cdj = true;
            }
        }
    }

    public gvn7() {
        this(0);
    }

    private boolean fn3e(com.google.android.exoplayer2.extractor.ld6 ld6Var) throws IOException {
        byte[] bArrM13598q = this.f64481f7l8.m13598q();
        if (9400 - this.f64481f7l8.m13596n() < 188) {
            int iM13594k = this.f64481f7l8.m13594k();
            if (iM13594k > 0) {
                System.arraycopy(bArrM13598q, this.f64481f7l8.m13596n(), bArrM13598q, 0, iM13594k);
            }
            this.f64481f7l8.ncyb(bArrM13598q, iM13594k);
        }
        while (this.f64481f7l8.m13594k() < 188) {
            int iM13591g = this.f64481f7l8.m13591g();
            int i2 = ld6Var.read(bArrM13598q, iM13591g, 9400 - iM13591g);
            if (i2 == -1) {
                return false;
            }
            this.f64481f7l8.m13595l(iM13591g + i2);
        }
        return true;
    }

    private void fu4(long j2) {
        if (this.f64483ki) {
            return;
        }
        this.f64483ki = true;
        if (this.f64487qrj.toq() == C3548p.f65257toq) {
            this.f64484kja0.cdj(new o1t.toq(this.f64487qrj.toq()));
            return;
        }
        a9 a9Var = new a9(this.f64487qrj.zy(), this.f64487qrj.toq(), j2, this.f64490zurt, this.f20238n);
        this.f64486n7h = a9Var;
        this.f64484kja0.cdj(a9Var.toq());
    }

    static /* synthetic */ int ld6(gvn7 gvn7Var) {
        int i2 = gvn7Var.f20236h;
        gvn7Var.f20236h = i2 + 1;
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InterfaceC3397p[] ni7() {
        return new InterfaceC3397p[]{new gvn7()};
    }

    private boolean o1t(int i2) {
        return this.f20240q == 2 || this.f64480cdj || !this.f64489x2.get(i2, false);
    }

    /* JADX INFO: renamed from: z */
    private void m11975z() {
        this.f64485ld6.clear();
        this.f20239p.clear();
        SparseArray<d3> sparseArrayMo11953k = this.f20241s.mo11953k();
        int size = sparseArrayMo11953k.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f20239p.put(sparseArrayMo11953k.keyAt(i2), sparseArrayMo11953k.valueAt(i2));
        }
        this.f20239p.put(0, new mcp(new toq()));
        this.f20237i = null;
    }

    private int zurt() throws sok {
        int iM13596n = this.f64481f7l8.m13596n();
        int iM13591g = this.f64481f7l8.m13591g();
        int iM12005k = oc.m12005k(this.f64481f7l8.m13598q(), iM13596n, iM13591g);
        this.f64481f7l8.n5r1(iM12005k);
        int i2 = iM12005k + f64478wvg;
        if (i2 > iM13591g) {
            int i3 = this.f64482fn3e + (iM12005k - iM13596n);
            this.f64482fn3e = i3;
            if (this.f20240q == 2 && i3 > 376) {
                throw sok.createForMalformedContainer("Cannot find sync byte. Most likely not a Transport Stream.", null);
            }
        } else {
            this.f64482fn3e = 0;
        }
        return i2;
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC3397p
    /* JADX INFO: renamed from: k */
    public void mo11688k(long j2, long j3) {
        a9 a9Var;
        C3844k.m13633s(this.f20240q != 2);
        int size = this.f20235g.size();
        for (int i2 = 0; i2 < size; i2++) {
            C3847l c3847l = this.f20235g.get(i2);
            boolean z2 = c3847l.m13648n() == C3548p.f65257toq;
            if (!z2) {
                long jZy = c3847l.zy();
                z2 = (jZy == C3548p.f65257toq || jZy == 0 || jZy == j3) ? false : true;
            }
            if (z2) {
                c3847l.f7l8(j3);
            }
        }
        if (j3 != 0 && (a9Var = this.f64486n7h) != null) {
            a9Var.m11762y(j3);
        }
        this.f64481f7l8.dd(0);
        this.f20242y.clear();
        for (int i3 = 0; i3 < this.f20239p.size(); i3++) {
            this.f20239p.valueAt(i3).zy();
        }
        this.f64482fn3e = 0;
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC3397p
    /* JADX INFO: renamed from: q */
    public void mo11689q(com.google.android.exoplayer2.extractor.x2 x2Var) {
        this.f64484kja0 = x2Var;
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC3397p
    public void release() {
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC3397p
    public boolean toq(com.google.android.exoplayer2.extractor.ld6 ld6Var) throws IOException {
        boolean z2;
        byte[] bArrM13598q = this.f64481f7l8.m13598q();
        ld6Var.fn3e(bArrM13598q, 0, 940);
        for (int i2 = 0; i2 < 188; i2++) {
            int i3 = 0;
            while (true) {
                if (i3 >= 5) {
                    z2 = true;
                    break;
                }
                if (bArrM13598q[(i3 * f64478wvg) + i2] != 71) {
                    z2 = false;
                    break;
                }
                i3++;
            }
            if (z2) {
                ld6Var.cdj(i2);
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC3397p
    public int zy(com.google.android.exoplayer2.extractor.ld6 ld6Var, com.google.android.exoplayer2.extractor.fu4 fu4Var) throws IOException {
        long length = ld6Var.getLength();
        if (this.f64480cdj) {
            if (((length == -1 || this.f20240q == 2) ? false : true) && !this.f64487qrj.m11963q()) {
                return this.f64487qrj.m11962n(ld6Var, fu4Var, this.f64490zurt);
            }
            fu4(length);
            if (this.f64488t8r) {
                this.f64488t8r = false;
                mo11688k(0L, 0L);
                if (ld6Var.getPosition() != 0) {
                    fu4Var.f19818k = 0L;
                    return 1;
                }
            }
            a9 a9Var = this.f64486n7h;
            if (a9Var != null && a9Var.m11760q()) {
                return this.f64486n7h.zy(ld6Var, fu4Var);
            }
        }
        if (!fn3e(ld6Var)) {
            return -1;
        }
        int iZurt = zurt();
        int iM13591g = this.f64481f7l8.m13591g();
        if (iZurt > iM13591g) {
            return 0;
        }
        int iKja0 = this.f64481f7l8.kja0();
        if ((8388608 & iKja0) != 0) {
            this.f64481f7l8.n5r1(iZurt);
            return 0;
        }
        int i2 = ((4194304 & iKja0) != 0 ? 1 : 0) | 0;
        int i3 = (2096896 & iKja0) >> 8;
        boolean z2 = (iKja0 & 32) != 0;
        d3 d3Var = (iKja0 & 16) != 0 ? this.f20239p.get(i3) : null;
        if (d3Var == null) {
            this.f64481f7l8.n5r1(iZurt);
            return 0;
        }
        if (this.f20240q != 2) {
            int i4 = iKja0 & 15;
            int i5 = this.f20242y.get(i3, i4 - 1);
            this.f20242y.put(i3, i4);
            if (i5 == i4) {
                this.f64481f7l8.n5r1(iZurt);
                return 0;
            }
            if (i4 != ((i5 + 1) & 15)) {
                d3Var.zy();
            }
        }
        if (z2) {
            int iJp0y = this.f64481f7l8.jp0y();
            i2 |= (this.f64481f7l8.jp0y() & 64) != 0 ? 2 : 0;
            this.f64481f7l8.hyr(iJp0y - 1);
        }
        boolean z3 = this.f64480cdj;
        if (o1t(i3)) {
            this.f64481f7l8.m13595l(iZurt);
            d3Var.toq(this.f64481f7l8, i2);
            this.f64481f7l8.m13595l(iM13591g);
        }
        if (this.f20240q != 2 && !z3 && this.f64480cdj && length != -1) {
            this.f64488t8r = true;
        }
        this.f64481f7l8.n5r1(iZurt);
        return 0;
    }

    public gvn7(int i2) {
        this(1, i2, f20233t);
    }

    public gvn7(int i2, int i3, int i4) {
        this(i2, new C3847l(0L), new C3417p(i3), i4);
    }

    public gvn7(int i2, C3847l c3847l, d3.zy zyVar) {
        this(i2, c3847l, zyVar, f20233t);
    }

    public gvn7(int i2, C3847l c3847l, d3.zy zyVar, int i3) {
        this.f20241s = (d3.zy) C3844k.f7l8(zyVar);
        this.f20238n = i3;
        this.f20240q = i2;
        if (i2 != 1 && i2 != 2) {
            ArrayList arrayList = new ArrayList();
            this.f20235g = arrayList;
            arrayList.add(c3847l);
        } else {
            this.f20235g = Collections.singletonList(c3847l);
        }
        this.f64481f7l8 = new com.google.android.exoplayer2.util.gvn7(new byte[f64463hb], 0);
        this.f64485ld6 = new SparseBooleanArray();
        this.f64489x2 = new SparseBooleanArray();
        this.f20239p = new SparseArray<>();
        this.f20242y = new SparseIntArray();
        this.f64487qrj = new fti(i3);
        this.f64484kja0 = com.google.android.exoplayer2.extractor.x2.we;
        this.f64490zurt = -1;
        m11975z();
    }
}
