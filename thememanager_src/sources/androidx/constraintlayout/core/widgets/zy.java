package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.C0341n;
import java.util.ArrayList;

/* JADX INFO: compiled from: ChainHead.java */
/* JADX INFO: loaded from: classes.dex */
public class zy {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private boolean f47973cdj;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    protected C0341n f47974f7l8;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    protected boolean f47975fn3e;

    /* JADX INFO: renamed from: g */
    protected C0341n f2080g;

    /* JADX INFO: renamed from: h */
    private int f2081h;

    /* JADX INFO: renamed from: i */
    protected boolean f2082i;

    /* JADX INFO: renamed from: k */
    protected C0341n f2083k;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    protected boolean f47976ki;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    boolean f47977kja0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    protected float f47978ld6 = 0.0f;

    /* JADX INFO: renamed from: n */
    protected C0341n f2084n;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    int f47979n7h;

    /* JADX INFO: renamed from: p */
    protected int f2085p;

    /* JADX INFO: renamed from: q */
    protected C0341n f2086q;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    int f47980qrj;

    /* JADX INFO: renamed from: s */
    protected int f2087s;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    protected boolean f47981t8r;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    protected C0341n f47982toq;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    int f47983x2;

    /* JADX INFO: renamed from: y */
    protected ArrayList<C0341n> f2088y;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private boolean f47984zurt;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    protected C0341n f47985zy;

    public zy(C0341n c0341n, int i2, boolean z2) {
        this.f2083k = c0341n;
        this.f2081h = i2;
        this.f47973cdj = z2;
    }

    private static boolean ld6(C0341n c0341n, int i2) {
        int i3;
        return c0341n.a98o() != 8 && c0341n.f47886hb[i2] == C0341n.toq.MATCH_CONSTRAINT && ((i3 = c0341n.f2064z[i2]) == 0 || i3 == 3);
    }

    private void toq() {
        int i2 = this.f2081h * 2;
        C0341n c0341n = this.f2083k;
        this.f47977kja0 = true;
        C0341n c0341n2 = c0341n;
        boolean z2 = false;
        while (!z2) {
            this.f2087s++;
            C0341n[] c0341nArr = c0341n.f47911py;
            int i3 = this.f2081h;
            C0341n c0341n3 = null;
            c0341nArr[i3] = null;
            c0341n.f47933zsr0[i3] = null;
            if (c0341n.a98o() != 8) {
                this.f47983x2++;
                C0341n.toq toqVarO1t = c0341n.o1t(this.f2081h);
                C0341n.toq toqVar = C0341n.toq.MATCH_CONSTRAINT;
                if (toqVarO1t != toqVar) {
                    this.f47980qrj += c0341n.lvui(this.f2081h);
                }
                int iF7l8 = this.f47980qrj + c0341n.f47922vyq[i2].f7l8();
                this.f47980qrj = iF7l8;
                int i4 = i2 + 1;
                this.f47980qrj = iF7l8 + c0341n.f47922vyq[i4].f7l8();
                int iF7l82 = this.f47979n7h + c0341n.f47922vyq[i2].f7l8();
                this.f47979n7h = iF7l82;
                this.f47979n7h = iF7l82 + c0341n.f47922vyq[i4].f7l8();
                if (this.f47982toq == null) {
                    this.f47982toq = c0341n;
                }
                this.f2086q = c0341n;
                C0341n.toq[] toqVarArr = c0341n.f47886hb;
                int i5 = this.f2081h;
                if (toqVarArr[i5] == toqVar) {
                    int i6 = c0341n.f2064z[i5];
                    if (i6 == 0 || i6 == 3 || i6 == 2) {
                        this.f2085p++;
                        float f2 = c0341n.f47883gbni[i5];
                        if (f2 > 0.0f) {
                            this.f47978ld6 += f2;
                        }
                        if (ld6(c0341n, i5)) {
                            if (f2 < 0.0f) {
                                this.f47976ki = true;
                            } else {
                                this.f47981t8r = true;
                            }
                            if (this.f2088y == null) {
                                this.f2088y = new ArrayList<>();
                            }
                            this.f2088y.add(c0341n);
                        }
                        if (this.f2080g == null) {
                            this.f2080g = c0341n;
                        }
                        C0341n c0341n4 = this.f47974f7l8;
                        if (c0341n4 != null) {
                            c0341n4.f47933zsr0[this.f2081h] = c0341n;
                        }
                        this.f47974f7l8 = c0341n;
                    }
                    if (this.f2081h == 0) {
                        if (c0341n.f47906ni7 != 0 || c0341n.f47909o1t != 0 || c0341n.f47925wvg != 0) {
                            this.f47977kja0 = false;
                        }
                    } else if (c0341n.f47881fu4 != 0 || c0341n.f47901mcp != 0 || c0341n.f47891jk != 0) {
                        this.f47977kja0 = false;
                    }
                    if (c0341n.f47875ek5k != 0.0f) {
                        this.f47977kja0 = false;
                        this.f47975fn3e = true;
                    }
                }
            }
            if (c0341n2 != c0341n) {
                c0341n2.f47911py[this.f2081h] = c0341n;
            }
            C0343q c0343q = c0341n.f47922vyq[i2 + 1].f2068g;
            if (c0343q != null) {
                C0341n c0341n5 = c0343q.f2071q;
                C0343q c0343q2 = c0341n5.f47922vyq[i2].f2068g;
                if (c0343q2 != null && c0343q2.f2071q == c0341n) {
                    c0341n3 = c0341n5;
                }
            }
            if (c0341n3 == null) {
                c0341n3 = c0341n;
                z2 = true;
            }
            c0341n2 = c0341n;
            c0341n = c0341n3;
        }
        C0341n c0341n6 = this.f47982toq;
        if (c0341n6 != null) {
            this.f47980qrj -= c0341n6.f47922vyq[i2].f7l8();
        }
        C0341n c0341n7 = this.f2086q;
        if (c0341n7 != null) {
            this.f47980qrj -= c0341n7.f47922vyq[i2 + 1].f7l8();
        }
        this.f47985zy = c0341n;
        if (this.f2081h == 0 && this.f47973cdj) {
            this.f2084n = c0341n;
        } else {
            this.f2084n = this.f2083k;
        }
        this.f2082i = this.f47981t8r && this.f47976ki;
    }

    public C0341n f7l8() {
        return this.f47985zy;
    }

    /* JADX INFO: renamed from: g */
    public C0341n m1350g() {
        return this.f2084n;
    }

    /* JADX INFO: renamed from: k */
    public void m1351k() {
        if (!this.f47984zurt) {
            toq();
        }
        this.f47984zurt = true;
    }

    /* JADX INFO: renamed from: n */
    public C0341n m1352n() {
        return this.f47982toq;
    }

    /* JADX INFO: renamed from: p */
    public float m1353p() {
        return this.f47978ld6;
    }

    /* JADX INFO: renamed from: q */
    public C0341n m1354q() {
        return this.f2080g;
    }

    /* JADX INFO: renamed from: s */
    public C0341n m1355s() {
        return this.f2086q;
    }

    /* JADX INFO: renamed from: y */
    public C0341n m1356y() {
        return this.f47974f7l8;
    }

    public C0341n zy() {
        return this.f2083k;
    }
}
