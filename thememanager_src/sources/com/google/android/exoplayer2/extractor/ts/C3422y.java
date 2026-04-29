package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.C3548p;
import com.google.android.exoplayer2.extractor.C3387n;
import com.google.android.exoplayer2.extractor.InterfaceC3397p;
import com.google.android.exoplayer2.extractor.o1t;
import com.google.android.exoplayer2.extractor.ts.d3;
import com.google.android.exoplayer2.sok;
import com.google.android.exoplayer2.util.C3844k;
import java.io.EOFException;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.ts.y */
/* JADX INFO: compiled from: AdtsExtractor.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C3422y implements InterfaceC3397p {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    public static final int f64671cdj = 1;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private static final int f64672fn3e = 1000;

    /* JADX INFO: renamed from: h */
    public static final com.google.android.exoplayer2.extractor.kja0 f20405h = new com.google.android.exoplayer2.extractor.kja0() { // from class: com.google.android.exoplayer2.extractor.ts.f7l8
        @Override // com.google.android.exoplayer2.extractor.kja0
        public final InterfaceC3397p[] zy() {
            return C3422y.m12030s();
        }
    };

    /* JADX INFO: renamed from: i */
    private static final int f20406i = 8192;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    public static final int f64673ki = 2;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private static final int f64674t8r = 2048;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private final com.google.android.exoplayer2.util.gvn7 f64675f7l8;

    /* JADX INFO: renamed from: g */
    private final com.google.android.exoplayer2.util.gvn7 f20407g;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private boolean f64676kja0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private long f64677ld6;

    /* JADX INFO: renamed from: n */
    private final C3419s f20408n;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private boolean f64678n7h;

    /* JADX INFO: renamed from: p */
    private long f20409p;

    /* JADX INFO: renamed from: q */
    private final int f20410q;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private boolean f64679qrj;

    /* JADX INFO: renamed from: s */
    private com.google.android.exoplayer2.extractor.x2 f20411s;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private int f64680x2;

    /* JADX INFO: renamed from: y */
    private final com.google.android.exoplayer2.util.jp0y f20412y;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.ts.y$k */
    /* JADX INFO: compiled from: AdtsExtractor.java */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface k {
    }

    public C3422y() {
        this(0);
    }

    private static int f7l8(int i2, long j2) {
        return (int) ((((long) (i2 * 8)) * 1000000) / j2);
    }

    /* JADX INFO: renamed from: g */
    private void m12027g(com.google.android.exoplayer2.extractor.ld6 ld6Var) throws IOException {
        int iM13627y;
        if (this.f64679qrj) {
            return;
        }
        this.f64680x2 = -1;
        ld6Var.mo11730y();
        long j2 = 0;
        if (ld6Var.getPosition() == 0) {
            ld6(ld6Var);
        }
        int i2 = 0;
        int i3 = 0;
        do {
            try {
                if (!ld6Var.f7l8(this.f64675f7l8.m13598q(), 0, 2, true)) {
                    break;
                }
                this.f64675f7l8.n5r1(0);
                if (!C3419s.qrj(this.f64675f7l8.lvui())) {
                    break;
                }
                if (!ld6Var.f7l8(this.f64675f7l8.m13598q(), 0, 4, true)) {
                    break;
                }
                this.f20412y.cdj(14);
                iM13627y = this.f20412y.m13627y(13);
                if (iM13627y <= 6) {
                    this.f64679qrj = true;
                    throw sok.createForMalformedContainer("Malformed ADTS stream", null);
                }
                j2 += (long) iM13627y;
                i3++;
                if (i3 == 1000) {
                    break;
                }
            } catch (EOFException unused) {
            }
        } while (ld6Var.t8r(iM13627y - 6, true));
        i2 = i3;
        ld6Var.mo11730y();
        if (i2 > 0) {
            this.f64680x2 = (int) (j2 / ((long) i2));
        } else {
            this.f64680x2 = -1;
        }
        this.f64679qrj = true;
    }

    private int ld6(com.google.android.exoplayer2.extractor.ld6 ld6Var) throws IOException {
        int i2 = 0;
        while (true) {
            ld6Var.fn3e(this.f64675f7l8.m13598q(), 0, 10);
            this.f64675f7l8.n5r1(0);
            if (this.f64675f7l8.oc() != 4801587) {
                break;
            }
            this.f64675f7l8.hyr(3);
            int iFti = this.f64675f7l8.fti();
            i2 += iFti + 10;
            ld6Var.qrj(iFti);
        }
        ld6Var.mo11730y();
        ld6Var.qrj(i2);
        if (this.f64677ld6 == -1) {
            this.f64677ld6 = i2;
        }
        return i2;
    }

    @RequiresNonNull({"extractorOutput"})
    /* JADX INFO: renamed from: p */
    private void m12029p(long j2, boolean z2) {
        if (this.f64676kja0) {
            return;
        }
        boolean z3 = (this.f20410q & 1) != 0 && this.f64680x2 > 0;
        if (z3 && this.f20408n.ld6() == C3548p.f65257toq && !z2) {
            return;
        }
        if (!z3 || this.f20408n.ld6() == C3548p.f65257toq) {
            this.f20411s.cdj(new o1t.toq(C3548p.f65257toq));
        } else {
            this.f20411s.cdj(m12031y(j2, (this.f20410q & 2) != 0));
        }
        this.f64676kja0 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static /* synthetic */ InterfaceC3397p[] m12030s() {
        return new InterfaceC3397p[]{new C3422y()};
    }

    /* JADX INFO: renamed from: y */
    private com.google.android.exoplayer2.extractor.o1t m12031y(long j2, boolean z2) {
        return new C3387n(j2, this.f64677ld6, f7l8(this.f64680x2, this.f20408n.ld6()), this.f64680x2, z2);
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC3397p
    /* JADX INFO: renamed from: k */
    public void mo11688k(long j2, long j3) {
        this.f64678n7h = false;
        this.f20408n.zy();
        this.f20409p = j3;
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC3397p
    /* JADX INFO: renamed from: q */
    public void mo11689q(com.google.android.exoplayer2.extractor.x2 x2Var) {
        this.f20411s = x2Var;
        this.f20408n.mo11945q(x2Var, new d3.C3406n(0, 1));
        x2Var.mo11753i();
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC3397p
    public void release() {
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC3397p
    public boolean toq(com.google.android.exoplayer2.extractor.ld6 ld6Var) throws IOException {
        int iLd6 = ld6(ld6Var);
        int i2 = iLd6;
        int i3 = 0;
        int i4 = 0;
        do {
            ld6Var.fn3e(this.f64675f7l8.m13598q(), 0, 2);
            this.f64675f7l8.n5r1(0);
            if (C3419s.qrj(this.f64675f7l8.lvui())) {
                i3++;
                if (i3 >= 4 && i4 > 188) {
                    return true;
                }
                ld6Var.fn3e(this.f64675f7l8.m13598q(), 0, 4);
                this.f20412y.cdj(14);
                int iM13627y = this.f20412y.m13627y(13);
                if (iM13627y <= 6) {
                    i2++;
                    ld6Var.mo11730y();
                    ld6Var.qrj(i2);
                } else {
                    ld6Var.qrj(iM13627y - 6);
                    i4 += iM13627y;
                }
            } else {
                i2++;
                ld6Var.mo11730y();
                ld6Var.qrj(i2);
            }
            i3 = 0;
            i4 = 0;
        } while (i2 - iLd6 < 8192);
        return false;
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC3397p
    public int zy(com.google.android.exoplayer2.extractor.ld6 ld6Var, com.google.android.exoplayer2.extractor.fu4 fu4Var) throws IOException {
        C3844k.ld6(this.f20411s);
        long length = ld6Var.getLength();
        int i2 = this.f20410q;
        if (((i2 & 2) == 0 && ((i2 & 1) == 0 || length == -1)) ? false : true) {
            m12027g(ld6Var);
        }
        int i3 = ld6Var.read(this.f20407g.m13598q(), 0, 2048);
        boolean z2 = i3 == -1;
        m12029p(length, z2);
        if (z2) {
            return -1;
        }
        this.f20407g.n5r1(0);
        this.f20407g.m13595l(i3);
        if (!this.f64678n7h) {
            this.f20408n.mo11943g(this.f20409p, 4);
            this.f64678n7h = true;
        }
        this.f20408n.toq(this.f20407g);
        return 0;
    }

    public C3422y(int i2) {
        this.f20410q = (i2 & 2) != 0 ? i2 | 1 : i2;
        this.f20408n = new C3419s(true);
        this.f20407g = new com.google.android.exoplayer2.util.gvn7(2048);
        this.f64680x2 = -1;
        this.f64677ld6 = -1L;
        com.google.android.exoplayer2.util.gvn7 gvn7Var = new com.google.android.exoplayer2.util.gvn7(10);
        this.f64675f7l8 = gvn7Var;
        this.f20412y = new com.google.android.exoplayer2.util.jp0y(gvn7Var.m13598q());
    }
}
