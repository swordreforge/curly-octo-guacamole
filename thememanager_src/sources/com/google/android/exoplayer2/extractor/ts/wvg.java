package com.google.android.exoplayer2.extractor.ts;

import android.util.SparseArray;
import com.google.android.exoplayer2.C3548p;
import com.google.android.exoplayer2.extractor.InterfaceC3397p;
import com.google.android.exoplayer2.extractor.o1t;
import com.google.android.exoplayer2.extractor.ts.d3;
import com.google.android.exoplayer2.sok;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.C3847l;
import java.io.IOException;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import zy.dd;

/* JADX INFO: compiled from: PsExtractor.java */
/* JADX INFO: loaded from: classes2.dex */
public final class wvg implements InterfaceC3397p {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    static final int f64651cdj = 443;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private static final long f64652fn3e = 1048576;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    public static final int f64653fu4 = 192;

    /* JADX INFO: renamed from: h */
    static final int f20386h = 442;

    /* JADX INFO: renamed from: i */
    private static final int f20387i = 256;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    static final int f64654ki = 1;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    public static final com.google.android.exoplayer2.extractor.kja0 f64655kja0 = new com.google.android.exoplayer2.extractor.kja0() { // from class: com.google.android.exoplayer2.extractor.ts.o1t
        @Override // com.google.android.exoplayer2.extractor.kja0
        public final InterfaceC3397p[] zy() {
            return wvg.m12022g();
        }
    };

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    public static final int f64656ni7 = 189;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    public static final int f64657o1t = 224;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    static final int f64658t8r = 441;

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    public static final int f64659wvg = 240;

    /* JADX INFO: renamed from: z */
    public static final int f20388z = 224;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private static final long f64660zurt = 8192;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private final C3423z f64661f7l8;

    /* JADX INFO: renamed from: g */
    private final com.google.android.exoplayer2.util.gvn7 f20389g;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private long f64662ld6;

    /* JADX INFO: renamed from: n */
    private final SparseArray<C3421k> f20390n;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private boolean f64663n7h;

    /* JADX INFO: renamed from: p */
    private boolean f20391p;

    /* JADX INFO: renamed from: q */
    private final C3847l f20392q;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private com.google.android.exoplayer2.extractor.x2 f64664qrj;

    /* JADX INFO: renamed from: s */
    private boolean f20393s;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    @dd
    private fu4 f64665x2;

    /* JADX INFO: renamed from: y */
    private boolean f20394y;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.ts.wvg$k */
    /* JADX INFO: compiled from: PsExtractor.java */
    private static final class C3421k {

        /* JADX INFO: renamed from: s */
        private static final int f20395s = 64;

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private int f64666f7l8;

        /* JADX INFO: renamed from: g */
        private boolean f20396g;

        /* JADX INFO: renamed from: k */
        private final qrj f20397k;

        /* JADX INFO: renamed from: n */
        private boolean f20398n;

        /* JADX INFO: renamed from: q */
        private boolean f20399q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final C3847l f64667toq;

        /* JADX INFO: renamed from: y */
        private long f20400y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final com.google.android.exoplayer2.util.jp0y f64668zy = new com.google.android.exoplayer2.util.jp0y(new byte[64]);

        public C3421k(qrj qrjVar, C3847l c3847l) {
            this.f20397k = qrjVar;
            this.f64667toq = c3847l;
        }

        private void toq() {
            this.f64668zy.t8r(8);
            this.f20399q = this.f64668zy.f7l8();
            this.f20398n = this.f64668zy.f7l8();
            this.f64668zy.t8r(6);
            this.f64666f7l8 = this.f64668zy.m13627y(8);
        }

        private void zy() {
            this.f20400y = 0L;
            if (this.f20399q) {
                this.f64668zy.t8r(4);
                long jM13627y = ((long) this.f64668zy.m13627y(3)) << 30;
                this.f64668zy.t8r(1);
                long jM13627y2 = jM13627y | ((long) (this.f64668zy.m13627y(15) << 15));
                this.f64668zy.t8r(1);
                long jM13627y3 = jM13627y2 | ((long) this.f64668zy.m13627y(15));
                this.f64668zy.t8r(1);
                if (!this.f20396g && this.f20398n) {
                    this.f64668zy.t8r(4);
                    long jM13627y4 = ((long) this.f64668zy.m13627y(3)) << 30;
                    this.f64668zy.t8r(1);
                    long jM13627y5 = jM13627y4 | ((long) (this.f64668zy.m13627y(15) << 15));
                    this.f64668zy.t8r(1);
                    long jM13627y6 = jM13627y5 | ((long) this.f64668zy.m13627y(15));
                    this.f64668zy.t8r(1);
                    this.f64667toq.toq(jM13627y6);
                    this.f20396g = true;
                }
                this.f20400y = this.f64667toq.toq(jM13627y3);
            }
        }

        /* JADX INFO: renamed from: k */
        public void m12024k(com.google.android.exoplayer2.util.gvn7 gvn7Var) throws sok {
            gvn7Var.ld6(this.f64668zy.f23205k, 0, 3);
            this.f64668zy.cdj(0);
            toq();
            gvn7Var.ld6(this.f64668zy.f23205k, 0, this.f64666f7l8);
            this.f64668zy.cdj(0);
            zy();
            this.f20397k.mo11943g(this.f20400y, 4);
            this.f20397k.toq(gvn7Var);
            this.f20397k.mo11944n();
        }

        /* JADX INFO: renamed from: q */
        public void m12025q() {
            this.f20396g = false;
            this.f20397k.zy();
        }
    }

    public wvg() {
        this(new C3847l(0L));
    }

    @RequiresNonNull({"output"})
    private void f7l8(long j2) {
        if (this.f64663n7h) {
            return;
        }
        this.f64663n7h = true;
        if (this.f64661f7l8.zy() == C3548p.f65257toq) {
            this.f64664qrj.cdj(new o1t.toq(this.f64661f7l8.zy()));
            return;
        }
        fu4 fu4Var = new fu4(this.f64661f7l8.m12038q(), this.f64661f7l8.zy(), j2);
        this.f64665x2 = fu4Var;
        this.f64664qrj.cdj(fu4Var.toq());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static /* synthetic */ InterfaceC3397p[] m12022g() {
        return new InterfaceC3397p[]{new wvg()};
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC3397p
    /* JADX INFO: renamed from: k */
    public void mo11688k(long j2, long j3) {
        boolean z2 = this.f20392q.m13648n() == C3548p.f65257toq;
        if (!z2) {
            long jZy = this.f20392q.zy();
            z2 = (jZy == C3548p.f65257toq || jZy == 0 || jZy == j3) ? false : true;
        }
        if (z2) {
            this.f20392q.f7l8(j3);
        }
        fu4 fu4Var = this.f64665x2;
        if (fu4Var != null) {
            fu4Var.m11762y(j3);
        }
        for (int i2 = 0; i2 < this.f20390n.size(); i2++) {
            this.f20390n.valueAt(i2).m12025q();
        }
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC3397p
    /* JADX INFO: renamed from: q */
    public void mo11689q(com.google.android.exoplayer2.extractor.x2 x2Var) {
        this.f64664qrj = x2Var;
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC3397p
    public void release() {
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC3397p
    public boolean toq(com.google.android.exoplayer2.extractor.ld6 ld6Var) throws IOException {
        byte[] bArr = new byte[14];
        ld6Var.fn3e(bArr, 0, 14);
        if (f20386h != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        ld6Var.qrj(bArr[13] & 7);
        ld6Var.fn3e(bArr, 0, 3);
        return 1 == ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255));
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC3397p
    public int zy(com.google.android.exoplayer2.extractor.ld6 ld6Var, com.google.android.exoplayer2.extractor.fu4 fu4Var) throws IOException {
        C3844k.ld6(this.f64664qrj);
        long length = ld6Var.getLength();
        if ((length != -1) && !this.f64661f7l8.m12037n()) {
            return this.f64661f7l8.f7l8(ld6Var, fu4Var);
        }
        f7l8(length);
        fu4 fu4Var2 = this.f64665x2;
        if (fu4Var2 != null && fu4Var2.m11760q()) {
            return this.f64665x2.zy(ld6Var, fu4Var);
        }
        ld6Var.mo11730y();
        long jX2 = length != -1 ? length - ld6Var.x2() : -1L;
        if ((jX2 != -1 && jX2 < 4) || !ld6Var.f7l8(this.f20389g.m13598q(), 0, 4, true)) {
            return -1;
        }
        this.f20389g.n5r1(0);
        int iKja0 = this.f20389g.kja0();
        if (iKja0 == f64658t8r) {
            return -1;
        }
        if (iKja0 == f20386h) {
            ld6Var.fn3e(this.f20389g.m13598q(), 0, 10);
            this.f20389g.n5r1(9);
            ld6Var.cdj((this.f20389g.jp0y() & 7) + 14);
            return 0;
        }
        if (iKja0 == f64651cdj) {
            ld6Var.fn3e(this.f20389g.m13598q(), 0, 2);
            this.f20389g.n5r1(0);
            ld6Var.cdj(this.f20389g.lvui() + 6);
            return 0;
        }
        if (((iKja0 & androidx.core.view.n7h.f50847fn3e) >> 8) != 1) {
            ld6Var.cdj(1);
            return 0;
        }
        int i2 = iKja0 & 255;
        C3421k c3421k = this.f20390n.get(i2);
        if (!this.f20394y) {
            if (c3421k == null) {
                qrj n7hVar = null;
                if (i2 == 189) {
                    n7hVar = new zy();
                    this.f20393s = true;
                    this.f64662ld6 = ld6Var.getPosition();
                } else if ((i2 & 224) == 192) {
                    n7hVar = new C3412i();
                    this.f20393s = true;
                    this.f64662ld6 = ld6Var.getPosition();
                } else if ((i2 & f64659wvg) == 224) {
                    n7hVar = new n7h();
                    this.f20391p = true;
                    this.f64662ld6 = ld6Var.getPosition();
                }
                if (n7hVar != null) {
                    n7hVar.mo11945q(this.f64664qrj, new d3.C3406n(i2, 256));
                    c3421k = new C3421k(n7hVar, this.f20392q);
                    this.f20390n.put(i2, c3421k);
                }
            }
            if (ld6Var.getPosition() > ((this.f20393s && this.f20391p) ? this.f64662ld6 + 8192 : 1048576L)) {
                this.f20394y = true;
                this.f64664qrj.mo11753i();
            }
        }
        ld6Var.fn3e(this.f20389g.m13598q(), 0, 2);
        this.f20389g.n5r1(0);
        int iLvui = this.f20389g.lvui() + 6;
        if (c3421k == null) {
            ld6Var.cdj(iLvui);
        } else {
            this.f20389g.dd(iLvui);
            ld6Var.readFully(this.f20389g.m13598q(), 0, iLvui);
            this.f20389g.n5r1(6);
            c3421k.m12024k(this.f20389g);
            com.google.android.exoplayer2.util.gvn7 gvn7Var = this.f20389g;
            gvn7Var.m13595l(gvn7Var.toq());
        }
        return 0;
    }

    public wvg(C3847l c3847l) {
        this.f20392q = c3847l;
        this.f20389g = new com.google.android.exoplayer2.util.gvn7(4096);
        this.f20390n = new SparseArray<>();
        this.f64661f7l8 = new C3423z();
    }
}
