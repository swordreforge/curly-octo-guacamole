package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.C3548p;
import com.google.android.exoplayer2.audio.C3258k;
import com.google.android.exoplayer2.extractor.C3400s;
import com.google.android.exoplayer2.extractor.InterfaceC3401t;
import com.google.android.exoplayer2.extractor.ts.d3;
import com.google.android.exoplayer2.sok;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.lrht;
import com.google.android.exoplayer2.xwq3;
import java.util.Arrays;
import java.util.Collections;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import zy.dd;

/* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.ts.s */
/* JADX INFO: compiled from: AdtsReader.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C3419s implements qrj {

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    private static final int f64606a9 = 256;

    /* JADX INFO: renamed from: d2ok, reason: collision with root package name */
    private static final int f64607d2ok = -1;

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    private static final int f64608d3 = 10;

    /* JADX INFO: renamed from: eqxt, reason: collision with root package name */
    private static final byte[] f64609eqxt = {73, 68, 51};

    /* JADX INFO: renamed from: fti, reason: collision with root package name */
    private static final int f64610fti = 512;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    private static final int f64611fu4 = 1;

    /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
    private static final int f64612gvn7 = 1024;

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    private static final int f64613jk = 8;

    /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
    private static final int f64614jp0y = 768;

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    private static final int f64615mcp = 2;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    private static final int f64616ni7 = 0;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    private static final int f64617o1t = 3;

    /* JADX INFO: renamed from: oc, reason: collision with root package name */
    private static final int f64618oc = 6;

    /* JADX INFO: renamed from: t */
    private static final int f20358t = 5;

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    private static final int f64619wvg = 4;

    /* JADX INFO: renamed from: z */
    private static final int f20359z = 2;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private static final String f64620zurt = "AdtsReader";

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private long f64621cdj;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private InterfaceC3401t f64622f7l8;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private long f64623fn3e;

    /* JADX INFO: renamed from: g */
    private InterfaceC3401t f20360g;

    /* JADX INFO: renamed from: h */
    private boolean f20361h;

    /* JADX INFO: renamed from: i */
    private InterfaceC3401t f20362i;

    /* JADX INFO: renamed from: k */
    private final boolean f20363k;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private int f64624ki;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private int f64625kja0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private boolean f64626ld6;

    /* JADX INFO: renamed from: n */
    private String f20364n;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private int f64627n7h;

    /* JADX INFO: renamed from: p */
    private int f20365p;

    /* JADX INFO: renamed from: q */
    @dd
    private final String f20366q;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private int f64628qrj;

    /* JADX INFO: renamed from: s */
    private int f20367s;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private long f64629t8r;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final com.google.android.exoplayer2.util.jp0y f64630toq;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private boolean f64631x2;

    /* JADX INFO: renamed from: y */
    private int f20368y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final com.google.android.exoplayer2.util.gvn7 f64632zy;

    public C3419s(boolean z2) {
        this(z2, null);
    }

    private void cdj() {
        this.f64631x2 = false;
        t8r();
    }

    private void f7l8(com.google.android.exoplayer2.util.gvn7 gvn7Var) {
        if (gvn7Var.m13594k() == 0) {
            return;
        }
        this.f64630toq.f23205k[0] = gvn7Var.m13598q()[gvn7Var.m13596n()];
        this.f64630toq.cdj(2);
        int iM13627y = this.f64630toq.m13627y(4);
        int i2 = this.f64627n7h;
        if (i2 != -1 && iM13627y != i2) {
            cdj();
            return;
        }
        if (!this.f64631x2) {
            this.f64631x2 = true;
            this.f64628qrj = this.f64625kja0;
            this.f64627n7h = iM13627y;
        }
        m12011i();
    }

    private void fn3e() {
        this.f20368y = 2;
        this.f20367s = f64609eqxt.length;
        this.f64624ki = 0;
        this.f64632zy.n5r1(0);
    }

    @RequiresNonNull({"currentOutput"})
    /* JADX INFO: renamed from: h */
    private void m12010h(com.google.android.exoplayer2.util.gvn7 gvn7Var) {
        int iMin = Math.min(gvn7Var.m13594k(), this.f64624ki - this.f20367s);
        this.f20362i.zy(gvn7Var, iMin);
        int i2 = this.f20367s + iMin;
        this.f20367s = i2;
        int i3 = this.f64624ki;
        if (i2 == i3) {
            long j2 = this.f64629t8r;
            if (j2 != C3548p.f65257toq) {
                this.f20362i.mo11930n(j2, 1, i3, 0, null);
                this.f64629t8r += this.f64623fn3e;
            }
            t8r();
        }
    }

    /* JADX INFO: renamed from: i */
    private void m12011i() {
        this.f20368y = 3;
        this.f20367s = 0;
    }

    @EnsuresNonNull({"output", "currentOutput", "id3Output"})
    /* JADX INFO: renamed from: k */
    private void m12012k() {
        C3844k.f7l8(this.f20360g);
        lrht.ld6(this.f20362i);
        lrht.ld6(this.f64622f7l8);
    }

    private void ki() {
        this.f20368y = 1;
        this.f20367s = 0;
    }

    @RequiresNonNull({"id3Output"})
    private void kja0() {
        this.f64622f7l8.zy(this.f64632zy, 10);
        this.f64632zy.n5r1(6);
        zurt(this.f64622f7l8, 0L, 10, this.f64632zy.fti() + 10);
    }

    @RequiresNonNull({"output"})
    private void n7h() throws sok {
        this.f64630toq.cdj(0);
        if (this.f20361h) {
            this.f64630toq.t8r(10);
        } else {
            int iM13627y = this.f64630toq.m13627y(2) + 1;
            if (iM13627y != 2) {
                StringBuilder sb = new StringBuilder(61);
                sb.append("Detected audio object type: ");
                sb.append(iM13627y);
                sb.append(", but assuming AAC LC.");
                com.google.android.exoplayer2.util.ni7.qrj(f64620zurt, sb.toString());
                iM13627y = 2;
            }
            this.f64630toq.t8r(5);
            byte[] qVar = C3258k.toq(iM13627y, this.f64627n7h, this.f64630toq.m13627y(3));
            C3258k.zy zyVarM11487g = C3258k.m11487g(qVar);
            xwq3 xwq3VarA9 = new xwq3.toq().n5r1(this.f20364n).m13945m(com.google.android.exoplayer2.util.wvg.f67142wvg).d3(zyVarM11487g.f63464zy).gvn7(zyVarM11487g.f63463toq).ek5k(zyVarM11487g.f19408k).hyr(Collections.singletonList(qVar)).m13940c(this.f20366q).a9();
            this.f64621cdj = 1024000000 / ((long) xwq3VarA9.f23668d);
            this.f20360g.mo11931q(xwq3VarA9);
            this.f20361h = true;
        }
        this.f64630toq.t8r(4);
        int iM13627y2 = (this.f64630toq.m13627y(13) - 2) - 5;
        if (this.f64626ld6) {
            iM13627y2 -= 2;
        }
        zurt(this.f20360g, this.f64621cdj, 0, iM13627y2);
    }

    private boolean ni7(com.google.android.exoplayer2.util.gvn7 gvn7Var, byte[] bArr, int i2) {
        if (gvn7Var.m13594k() < i2) {
            return false;
        }
        gvn7Var.ld6(bArr, 0, i2);
        return true;
    }

    /* JADX INFO: renamed from: p */
    private void m12013p(com.google.android.exoplayer2.util.gvn7 gvn7Var) {
        byte[] bArrM13598q = gvn7Var.m13598q();
        int iM13596n = gvn7Var.m13596n();
        int iM13591g = gvn7Var.m13591g();
        while (iM13596n < iM13591g) {
            int i2 = iM13596n + 1;
            int i3 = bArrM13598q[iM13596n] & 255;
            if (this.f20365p == 512 && x2((byte) -1, (byte) i3) && (this.f64631x2 || m12015y(gvn7Var, i2 - 2))) {
                this.f64625kja0 = (i3 & 8) >> 3;
                this.f64626ld6 = (i3 & 1) == 0;
                if (this.f64631x2) {
                    m12011i();
                } else {
                    ki();
                }
                gvn7Var.n5r1(i2);
                return;
            }
            int i4 = this.f20365p;
            int i5 = i3 | i4;
            if (i5 == 329) {
                this.f20365p = f64614jp0y;
            } else if (i5 == 511) {
                this.f20365p = 512;
            } else if (i5 == 836) {
                this.f20365p = 1024;
            } else if (i5 == 1075) {
                fn3e();
                gvn7Var.n5r1(i2);
                return;
            } else if (i4 != 256) {
                this.f20365p = 256;
                i2--;
            }
            iM13596n = i2;
        }
        gvn7Var.n5r1(iM13596n);
    }

    public static boolean qrj(int i2) {
        return (i2 & 65526) == 65520;
    }

    /* JADX INFO: renamed from: s */
    private boolean m12014s(com.google.android.exoplayer2.util.gvn7 gvn7Var, byte[] bArr, int i2) {
        int iMin = Math.min(gvn7Var.m13594k(), i2 - this.f20367s);
        gvn7Var.ld6(bArr, this.f20367s, iMin);
        int i3 = this.f20367s + iMin;
        this.f20367s = i3;
        return i3 == i2;
    }

    private void t8r() {
        this.f20368y = 0;
        this.f20367s = 0;
        this.f20365p = 256;
    }

    private boolean x2(byte b2, byte b3) {
        return qrj(((b2 & 255) << 8) | (b3 & 255));
    }

    /* JADX INFO: renamed from: y */
    private boolean m12015y(com.google.android.exoplayer2.util.gvn7 gvn7Var, int i2) {
        gvn7Var.n5r1(i2 + 1);
        if (!ni7(gvn7Var, this.f64630toq.f23205k, 1)) {
            return false;
        }
        this.f64630toq.cdj(4);
        int iM13627y = this.f64630toq.m13627y(1);
        int i3 = this.f64628qrj;
        if (i3 != -1 && iM13627y != i3) {
            return false;
        }
        if (this.f64627n7h != -1) {
            if (!ni7(gvn7Var, this.f64630toq.f23205k, 1)) {
                return true;
            }
            this.f64630toq.cdj(2);
            if (this.f64630toq.m13627y(4) != this.f64627n7h) {
                return false;
            }
            gvn7Var.n5r1(i2 + 2);
        }
        if (!ni7(gvn7Var, this.f64630toq.f23205k, 4)) {
            return true;
        }
        this.f64630toq.cdj(14);
        int iM13627y2 = this.f64630toq.m13627y(13);
        if (iM13627y2 < 7) {
            return false;
        }
        byte[] bArrM13598q = gvn7Var.m13598q();
        int iM13591g = gvn7Var.m13591g();
        int i4 = i2 + iM13627y2;
        if (i4 >= iM13591g) {
            return true;
        }
        byte b2 = bArrM13598q[i4];
        if (b2 == -1) {
            int i5 = i4 + 1;
            if (i5 == iM13591g) {
                return true;
            }
            return x2((byte) -1, bArrM13598q[i5]) && ((bArrM13598q[i5] & 8) >> 3) == iM13627y;
        }
        if (b2 != 73) {
            return false;
        }
        int i6 = i4 + 1;
        if (i6 == iM13591g) {
            return true;
        }
        if (bArrM13598q[i6] != 68) {
            return false;
        }
        int i7 = i4 + 2;
        return i7 == iM13591g || bArrM13598q[i7] == 51;
    }

    private void zurt(InterfaceC3401t interfaceC3401t, long j2, int i2, int i3) {
        this.f20368y = 4;
        this.f20367s = i2;
        this.f20362i = interfaceC3401t;
        this.f64623fn3e = j2;
        this.f64624ki = i3;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.qrj
    /* JADX INFO: renamed from: g */
    public void mo11943g(long j2, int i2) {
        if (j2 != C3548p.f65257toq) {
            this.f64629t8r = j2;
        }
    }

    public long ld6() {
        return this.f64621cdj;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.qrj
    /* JADX INFO: renamed from: n */
    public void mo11944n() {
    }

    @Override // com.google.android.exoplayer2.extractor.ts.qrj
    /* JADX INFO: renamed from: q */
    public void mo11945q(com.google.android.exoplayer2.extractor.x2 x2Var, d3.C3406n c3406n) {
        c3406n.m11952k();
        this.f20364n = c3406n.toq();
        InterfaceC3401t qVar = x2Var.toq(c3406n.zy(), 1);
        this.f20360g = qVar;
        this.f20362i = qVar;
        if (!this.f20363k) {
            this.f64622f7l8 = new C3400s();
            return;
        }
        c3406n.m11952k();
        InterfaceC3401t qVar2 = x2Var.toq(c3406n.zy(), 5);
        this.f64622f7l8 = qVar2;
        qVar2.mo11931q(new xwq3.toq().n5r1(c3406n.toq()).m13945m(com.google.android.exoplayer2.util.wvg.f67093ch).a9());
    }

    @Override // com.google.android.exoplayer2.extractor.ts.qrj
    public void toq(com.google.android.exoplayer2.util.gvn7 gvn7Var) throws sok {
        m12012k();
        while (gvn7Var.m13594k() > 0) {
            int i2 = this.f20368y;
            if (i2 == 0) {
                m12013p(gvn7Var);
            } else if (i2 == 1) {
                f7l8(gvn7Var);
            } else if (i2 != 2) {
                if (i2 == 3) {
                    if (m12014s(gvn7Var, this.f64630toq.f23205k, this.f64626ld6 ? 7 : 5)) {
                        n7h();
                    }
                } else {
                    if (i2 != 4) {
                        throw new IllegalStateException();
                    }
                    m12010h(gvn7Var);
                }
            } else if (m12014s(gvn7Var, this.f64632zy.m13598q(), 10)) {
                kja0();
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.qrj
    public void zy() {
        this.f64629t8r = C3548p.f65257toq;
        cdj();
    }

    public C3419s(boolean z2, @dd String str) {
        this.f64630toq = new com.google.android.exoplayer2.util.jp0y(new byte[7]);
        this.f64632zy = new com.google.android.exoplayer2.util.gvn7(Arrays.copyOf(f64609eqxt, 10));
        t8r();
        this.f64628qrj = -1;
        this.f64627n7h = -1;
        this.f64621cdj = C3548p.f65257toq;
        this.f64629t8r = C3548p.f65257toq;
        this.f20363k = z2;
        this.f20366q = str;
    }
}
