package com.google.android.exoplayer2.extractor.rawcc;

import com.google.android.exoplayer2.C3548p;
import com.google.android.exoplayer2.extractor.InterfaceC3397p;
import com.google.android.exoplayer2.extractor.InterfaceC3401t;
import com.google.android.exoplayer2.extractor.fu4;
import com.google.android.exoplayer2.extractor.ld6;
import com.google.android.exoplayer2.extractor.o1t;
import com.google.android.exoplayer2.extractor.x2;
import com.google.android.exoplayer2.sok;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.gvn7;
import com.google.android.exoplayer2.xwq3;
import java.io.IOException;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.rawcc.k */
/* JADX INFO: compiled from: RawCcExtractor.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C3399k implements InterfaceC3397p {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private static final int f64381cdj = 0;

    /* JADX INFO: renamed from: h */
    private static final int f20158h = 8;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private static final int f64382ki = 1;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private static final int f64383kja0 = 4;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private static final int f64384n7h = 1380139777;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static final int f64385qrj = 8;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private static final int f64386t8r = 2;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final int f64387x2 = 9;

    /* JADX INFO: renamed from: g */
    private InterfaceC3401t f20159g;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private int f64389ld6;

    /* JADX INFO: renamed from: p */
    private int f20161p;

    /* JADX INFO: renamed from: q */
    private final xwq3 f20162q;

    /* JADX INFO: renamed from: s */
    private long f20163s;

    /* JADX INFO: renamed from: y */
    private int f20164y;

    /* JADX INFO: renamed from: n */
    private final gvn7 f20160n = new gvn7(9);

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private int f64388f7l8 = 0;

    public C3399k(xwq3 xwq3Var) {
        this.f20162q = xwq3Var;
    }

    private boolean f7l8(ld6 ld6Var) throws IOException {
        int i2 = this.f20164y;
        if (i2 == 0) {
            this.f20160n.dd(5);
            if (!ld6Var.mo11729p(this.f20160n.m13598q(), 0, 5, true)) {
                return false;
            }
            this.f20163s = (this.f20160n.d3() * 1000) / 45;
        } else {
            if (i2 != 1) {
                StringBuilder sb = new StringBuilder(39);
                sb.append("Unsupported version number: ");
                sb.append(i2);
                throw sok.createForMalformedContainer(sb.toString(), null);
            }
            this.f20160n.dd(9);
            if (!ld6Var.mo11729p(this.f20160n.m13598q(), 0, 9, true)) {
                return false;
            }
            this.f20163s = this.f20160n.o1t();
        }
        this.f20161p = this.f20160n.jp0y();
        this.f64389ld6 = 0;
        return true;
    }

    @RequiresNonNull({"trackOutput"})
    /* JADX INFO: renamed from: g */
    private void m11926g(ld6 ld6Var) throws IOException {
        while (this.f20161p > 0) {
            this.f20160n.dd(3);
            ld6Var.readFully(this.f20160n.m13598q(), 0, 3);
            this.f20159g.zy(this.f20160n, 3);
            this.f64389ld6 += 3;
            this.f20161p--;
        }
        int i2 = this.f64389ld6;
        if (i2 > 0) {
            this.f20159g.mo11930n(this.f20163s, 1, i2, 0, null);
        }
    }

    /* JADX INFO: renamed from: n */
    private boolean m11927n(ld6 ld6Var) throws IOException {
        this.f20160n.dd(8);
        if (!ld6Var.mo11729p(this.f20160n.m13598q(), 0, 8, true)) {
            return false;
        }
        if (this.f20160n.kja0() != f64384n7h) {
            throw new IOException("Input not RawCC");
        }
        this.f20164y = this.f20160n.jp0y();
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC3397p
    /* JADX INFO: renamed from: k */
    public void mo11688k(long j2, long j3) {
        this.f64388f7l8 = 0;
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC3397p
    /* JADX INFO: renamed from: q */
    public void mo11689q(x2 x2Var) {
        x2Var.cdj(new o1t.toq(C3548p.f65257toq));
        InterfaceC3401t qVar = x2Var.toq(0, 3);
        this.f20159g = qVar;
        qVar.mo11931q(this.f20162q);
        x2Var.mo11753i();
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC3397p
    public void release() {
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC3397p
    public boolean toq(ld6 ld6Var) throws IOException {
        this.f20160n.dd(8);
        ld6Var.fn3e(this.f20160n.m13598q(), 0, 8);
        return this.f20160n.kja0() == f64384n7h;
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC3397p
    public int zy(ld6 ld6Var, fu4 fu4Var) throws IOException {
        C3844k.ld6(this.f20159g);
        while (true) {
            int i2 = this.f64388f7l8;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException();
                    }
                    m11926g(ld6Var);
                    this.f64388f7l8 = 1;
                    return 0;
                }
                if (!f7l8(ld6Var)) {
                    this.f64388f7l8 = 0;
                    return -1;
                }
                this.f64388f7l8 = 2;
            } else {
                if (!m11927n(ld6Var)) {
                    return -1;
                }
                this.f64388f7l8 = 1;
            }
        }
    }
}
