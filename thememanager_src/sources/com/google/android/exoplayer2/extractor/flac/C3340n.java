package com.google.android.exoplayer2.extractor.flac;

import com.google.android.exoplayer2.extractor.C3348h;
import com.google.android.exoplayer2.extractor.InterfaceC3397p;
import com.google.android.exoplayer2.extractor.InterfaceC3401t;
import com.google.android.exoplayer2.extractor.cdj;
import com.google.android.exoplayer2.extractor.fu4;
import com.google.android.exoplayer2.extractor.ki;
import com.google.android.exoplayer2.extractor.kja0;
import com.google.android.exoplayer2.extractor.ld6;
import com.google.android.exoplayer2.extractor.o1t;
import com.google.android.exoplayer2.extractor.t8r;
import com.google.android.exoplayer2.extractor.x2;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.gvn7;
import com.google.android.exoplayer2.util.lrht;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import zy.dd;

/* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.flac.n */
/* JADX INFO: compiled from: FlacExtractor.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C3340n implements InterfaceC3397p {

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private static final int f63702fn3e = 1;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    private static final int f63703fu4 = 4;

    /* JADX INFO: renamed from: i */
    private static final int f19769i = 0;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    public static final kja0 f63704ki = new kja0() { // from class: com.google.android.exoplayer2.extractor.flac.q
        @Override // com.google.android.exoplayer2.extractor.kja0
        public final InterfaceC3397p[] zy() {
            return C3340n.m11707p();
        }
    };

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    private static final int f63705ni7 = 3;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    private static final int f63706o1t = 32768;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    public static final int f63707t8r = 1;

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    private static final int f63708wvg = -1;

    /* JADX INFO: renamed from: z */
    private static final int f19770z = 5;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private static final int f63709zurt = 2;

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private long f63710cdj;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private final C3348h.k f63711f7l8;

    /* JADX INFO: renamed from: g */
    private final boolean f19771g;

    /* JADX INFO: renamed from: h */
    private int f19772h;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private toq f63712kja0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    @dd
    private Metadata f63713ld6;

    /* JADX INFO: renamed from: n */
    private final gvn7 f19773n;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private int f63714n7h;

    /* JADX INFO: renamed from: p */
    private int f19774p;

    /* JADX INFO: renamed from: q */
    private final byte[] f19775q;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private int f63715qrj;

    /* JADX INFO: renamed from: s */
    private InterfaceC3401t f19776s;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private t8r f63716x2;

    /* JADX INFO: renamed from: y */
    private x2 f19777y;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.flac.n$k */
    /* JADX INFO: compiled from: FlacExtractor.java */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface k {
    }

    public C3340n() {
        this(0);
    }

    private void f7l8(ld6 ld6Var) throws IOException {
        this.f63714n7h = cdj.toq(ld6Var);
        ((x2) lrht.ld6(this.f19777y)).cdj(m11709y(ld6Var.getPosition(), ld6Var.getLength()));
        this.f19774p = 5;
    }

    /* JADX INFO: renamed from: g */
    private long m11705g(gvn7 gvn7Var, boolean z2) {
        boolean zM11735q;
        C3844k.f7l8(this.f63716x2);
        int iM13596n = gvn7Var.m13596n();
        while (iM13596n <= gvn7Var.m13591g() - 16) {
            gvn7Var.n5r1(iM13596n);
            if (C3348h.m11735q(gvn7Var, this.f63716x2, this.f63714n7h, this.f63711f7l8)) {
                gvn7Var.n5r1(iM13596n);
                return this.f63711f7l8.f19825k;
            }
            iM13596n++;
        }
        if (!z2) {
            gvn7Var.n5r1(iM13596n);
            return -1L;
        }
        while (iM13596n <= gvn7Var.m13591g() - this.f63715qrj) {
            gvn7Var.n5r1(iM13596n);
            try {
                zM11735q = C3348h.m11735q(gvn7Var, this.f63716x2, this.f63714n7h, this.f63711f7l8);
            } catch (IndexOutOfBoundsException unused) {
                zM11735q = false;
            }
            if (gvn7Var.m13596n() <= gvn7Var.m13591g() ? zM11735q : false) {
                gvn7Var.n5r1(iM13596n);
                return this.f63711f7l8.f19825k;
            }
            iM13596n++;
        }
        gvn7Var.n5r1(gvn7Var.m13591g());
        return -1L;
    }

    private void kja0(ld6 ld6Var) throws IOException {
        cdj.m11693p(ld6Var);
        this.f19774p = 3;
    }

    private void ld6() {
        ((InterfaceC3401t) lrht.ld6(this.f19776s)).mo11930n((this.f63710cdj * 1000000) / ((long) ((t8r) lrht.ld6(this.f63716x2)).f20171n), 1, this.f19772h, 0, null);
    }

    private void n7h(ld6 ld6Var) throws IOException {
        cdj.C3336k c3336k = new cdj.C3336k(this.f63716x2);
        boolean zM11692n = false;
        while (!zM11692n) {
            zM11692n = cdj.m11692n(ld6Var, c3336k);
            this.f63716x2 = (t8r) lrht.ld6(c3336k.f19760k);
        }
        C3844k.f7l8(this.f63716x2);
        this.f63715qrj = Math.max(this.f63716x2.f64401zy, 6);
        ((InterfaceC3401t) lrht.ld6(this.f19776s)).mo11931q(this.f63716x2.m11937s(this.f19775q, this.f63713ld6));
        this.f19774p = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static /* synthetic */ InterfaceC3397p[] m11707p() {
        return new InterfaceC3397p[]{new C3340n()};
    }

    private void qrj(ld6 ld6Var) throws IOException {
        this.f63713ld6 = cdj.m11694q(ld6Var, !this.f19771g);
        this.f19774p = 1;
    }

    /* JADX INFO: renamed from: s */
    private void m11708s(ld6 ld6Var) throws IOException {
        byte[] bArr = this.f19775q;
        ld6Var.fn3e(bArr, 0, bArr.length);
        ld6Var.mo11730y();
        this.f19774p = 2;
    }

    private int x2(ld6 ld6Var, fu4 fu4Var) throws IOException {
        boolean z2;
        C3844k.f7l8(this.f19776s);
        C3844k.f7l8(this.f63716x2);
        toq toqVar = this.f63712kja0;
        if (toqVar != null && toqVar.m11760q()) {
            return this.f63712kja0.zy(ld6Var, fu4Var);
        }
        if (this.f63710cdj == -1) {
            this.f63710cdj = C3348h.m11736s(ld6Var, this.f63716x2);
            return 0;
        }
        int iM13591g = this.f19773n.m13591g();
        if (iM13591g < 32768) {
            int i2 = ld6Var.read(this.f19773n.m13598q(), iM13591g, 32768 - iM13591g);
            z2 = i2 == -1;
            if (!z2) {
                this.f19773n.m13595l(iM13591g + i2);
            } else if (this.f19773n.m13594k() == 0) {
                ld6();
                return -1;
            }
        } else {
            z2 = false;
        }
        int iM13596n = this.f19773n.m13596n();
        int i3 = this.f19772h;
        int i4 = this.f63715qrj;
        if (i3 < i4) {
            gvn7 gvn7Var = this.f19773n;
            gvn7Var.hyr(Math.min(i4 - i3, gvn7Var.m13594k()));
        }
        long jM11705g = m11705g(this.f19773n, z2);
        int iM13596n2 = this.f19773n.m13596n() - iM13596n;
        this.f19773n.n5r1(iM13596n);
        this.f19776s.zy(this.f19773n, iM13596n2);
        this.f19772h += iM13596n2;
        if (jM11705g != -1) {
            ld6();
            this.f19772h = 0;
            this.f63710cdj = jM11705g;
        }
        if (this.f19773n.m13594k() < 16) {
            int iM13594k = this.f19773n.m13594k();
            System.arraycopy(this.f19773n.m13598q(), this.f19773n.m13596n(), this.f19773n.m13598q(), 0, iM13594k);
            this.f19773n.n5r1(0);
            this.f19773n.m13595l(iM13594k);
        }
        return 0;
    }

    /* JADX INFO: renamed from: y */
    private o1t m11709y(long j2, long j3) {
        C3844k.f7l8(this.f63716x2);
        t8r t8rVar = this.f63716x2;
        if (t8rVar.f64398ld6 != null) {
            return new ki(t8rVar, j2);
        }
        if (j3 == -1 || t8rVar.f20172p <= 0) {
            return new o1t.toq(t8rVar.m11938y());
        }
        toq toqVar = new toq(t8rVar, this.f63714n7h, j2, j3);
        this.f63712kja0 = toqVar;
        return toqVar.toq();
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC3397p
    /* JADX INFO: renamed from: k */
    public void mo11688k(long j2, long j3) {
        if (j2 == 0) {
            this.f19774p = 0;
        } else {
            toq toqVar = this.f63712kja0;
            if (toqVar != null) {
                toqVar.m11762y(j3);
            }
        }
        this.f63710cdj = j3 != 0 ? -1L : 0L;
        this.f19772h = 0;
        this.f19773n.dd(0);
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC3397p
    /* JADX INFO: renamed from: q */
    public void mo11689q(x2 x2Var) {
        this.f19777y = x2Var;
        this.f19776s = x2Var.toq(0, 1);
        x2Var.mo11753i();
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC3397p
    public void release() {
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC3397p
    public boolean toq(ld6 ld6Var) throws IOException {
        cdj.zy(ld6Var, false);
        return cdj.m11691k(ld6Var);
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC3397p
    public int zy(ld6 ld6Var, fu4 fu4Var) throws IOException {
        int i2 = this.f19774p;
        if (i2 == 0) {
            qrj(ld6Var);
            return 0;
        }
        if (i2 == 1) {
            m11708s(ld6Var);
            return 0;
        }
        if (i2 == 2) {
            kja0(ld6Var);
            return 0;
        }
        if (i2 == 3) {
            n7h(ld6Var);
            return 0;
        }
        if (i2 == 4) {
            f7l8(ld6Var);
            return 0;
        }
        if (i2 == 5) {
            return x2(ld6Var, fu4Var);
        }
        throw new IllegalStateException();
    }

    public C3340n(int i2) {
        this.f19775q = new byte[42];
        this.f19773n = new gvn7(new byte[32768], 0);
        this.f19771g = (i2 & 1) != 0;
        this.f63711f7l8 = new C3348h.k();
        this.f19774p = 0;
    }
}
