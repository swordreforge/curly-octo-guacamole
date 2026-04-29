package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.C0341n;
import androidx.constraintlayout.core.widgets.C0343q;
import androidx.constraintlayout.core.widgets.InterfaceC0344s;
import androidx.constraintlayout.core.widgets.analyzer.AbstractC0327h;
import androidx.constraintlayout.core.widgets.analyzer.C0326g;

/* JADX INFO: compiled from: VerticalWidgetRun.java */
/* JADX INFO: loaded from: classes.dex */
public class n7h extends AbstractC0327h {

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    public C0326g f47710ld6;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    f7l8 f47711x2;

    /* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.analyzer.n7h$k */
    /* JADX INFO: compiled from: VerticalWidgetRun.java */
    static /* synthetic */ class C0331k {

        /* JADX INFO: renamed from: k */
        static final /* synthetic */ int[] f1994k;

        static {
            int[] iArr = new int[AbstractC0327h.toq.values().length];
            f1994k = iArr;
            try {
                iArr[AbstractC0327h.toq.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1994k[AbstractC0327h.toq.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1994k[AbstractC0327h.toq.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public n7h(C0341n c0341n) {
        super(c0341n);
        C0326g c0326g = new C0326g(this);
        this.f47710ld6 = c0326g;
        this.f47711x2 = null;
        this.f1974y.f1962n = C0326g.k.TOP;
        this.f1973s.f1962n = C0326g.k.BOTTOM;
        c0326g.f1962n = C0326g.k.BASELINE;
        this.f1968g = 1;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC0327h
    /* JADX INFO: renamed from: g */
    void mo1255g() {
        this.f47700zy = null;
        this.f1974y.zy();
        this.f1973s.zy();
        this.f47710ld6.zy();
        this.f1970n.zy();
        this.f47698f7l8 = false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC0327h
    /* JADX INFO: renamed from: h */
    boolean mo1256h() {
        return this.f1972q != C0341n.toq.MATCH_CONSTRAINT || this.f47699toq.f47881fu4 == 0;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC0327h, androidx.constraintlayout.core.widgets.analyzer.InterfaceC0333q
    /* JADX INFO: renamed from: k */
    public void mo1253k(InterfaceC0333q interfaceC0333q) {
        float f2;
        float fWvg;
        float fWvg2;
        int i2;
        int i3 = C0331k.f1994k[this.f1971p.ordinal()];
        if (i3 == 1) {
            t8r(interfaceC0333q);
        } else if (i3 == 2) {
            ki(interfaceC0333q);
        } else if (i3 == 3) {
            C0341n c0341n = this.f47699toq;
            cdj(interfaceC0333q, c0341n.f2051l, c0341n.f47887hyr, 1);
            return;
        }
        f7l8 f7l8Var = this.f1970n;
        if (f7l8Var.f47697zy && !f7l8Var.f1963p && this.f1972q == C0341n.toq.MATCH_CONSTRAINT) {
            C0341n c0341n2 = this.f47699toq;
            int i4 = c0341n2.f47881fu4;
            if (i4 == 2) {
                C0341n c0341nM1318f = c0341n2.m1318f();
                if (c0341nM1318f != null) {
                    if (c0341nM1318f.f2046g.f1970n.f1963p) {
                        this.f1970n.mo1252n((int) ((r7.f47693f7l8 * this.f47699toq.f47863a9) + 0.5f));
                    }
                }
            } else if (i4 == 3 && c0341n2.f2053n.f1970n.f1963p) {
                int iM1327t = c0341n2.m1327t();
                if (iM1327t == -1) {
                    C0341n c0341n3 = this.f47699toq;
                    f2 = c0341n3.f2053n.f1970n.f47693f7l8;
                    fWvg = c0341n3.wvg();
                } else if (iM1327t == 0) {
                    fWvg2 = r7.f2053n.f1970n.f47693f7l8 * this.f47699toq.wvg();
                    i2 = (int) (fWvg2 + 0.5f);
                    this.f1970n.mo1252n(i2);
                } else if (iM1327t != 1) {
                    i2 = 0;
                    this.f1970n.mo1252n(i2);
                } else {
                    C0341n c0341n4 = this.f47699toq;
                    f2 = c0341n4.f2053n.f1970n.f47693f7l8;
                    fWvg = c0341n4.wvg();
                }
                fWvg2 = f2 / fWvg;
                i2 = (int) (fWvg2 + 0.5f);
                this.f1970n.mo1252n(i2);
            }
        }
        C0326g c0326g = this.f1974y;
        if (c0326g.f47697zy) {
            C0326g c0326g2 = this.f1973s;
            if (c0326g2.f47697zy) {
                if (c0326g.f1963p && c0326g2.f1963p && this.f1970n.f1963p) {
                    return;
                }
                if (!this.f1970n.f1963p && this.f1972q == C0341n.toq.MATCH_CONSTRAINT) {
                    C0341n c0341n5 = this.f47699toq;
                    if (c0341n5.f47906ni7 == 0 && !c0341n5.mu()) {
                        C0326g c0326g3 = this.f1974y.f47696x2.get(0);
                        C0326g c0326g4 = this.f1973s.f47696x2.get(0);
                        int i5 = c0326g3.f47693f7l8;
                        C0326g c0326g5 = this.f1974y;
                        int i6 = i5 + c0326g5.f1960g;
                        int i7 = c0326g4.f47693f7l8 + this.f1973s.f1960g;
                        c0326g5.mo1252n(i6);
                        this.f1973s.mo1252n(i7);
                        this.f1970n.mo1252n(i7 - i6);
                        return;
                    }
                }
                if (!this.f1970n.f1963p && this.f1972q == C0341n.toq.MATCH_CONSTRAINT && this.f1969k == 1 && this.f1974y.f47696x2.size() > 0 && this.f1973s.f47696x2.size() > 0) {
                    C0326g c0326g6 = this.f1974y.f47696x2.get(0);
                    int i8 = (this.f1973s.f47696x2.get(0).f47693f7l8 + this.f1973s.f1960g) - (c0326g6.f47693f7l8 + this.f1974y.f1960g);
                    f7l8 f7l8Var2 = this.f1970n;
                    int i9 = f7l8Var2.f47692qrj;
                    if (i8 < i9) {
                        f7l8Var2.mo1252n(i8);
                    } else {
                        f7l8Var2.mo1252n(i9);
                    }
                }
                if (this.f1970n.f1963p && this.f1974y.f47696x2.size() > 0 && this.f1973s.f47696x2.size() > 0) {
                    C0326g c0326g7 = this.f1974y.f47696x2.get(0);
                    C0326g c0326g8 = this.f1973s.f47696x2.get(0);
                    int i10 = c0326g7.f47693f7l8 + this.f1974y.f1960g;
                    int i11 = c0326g8.f47693f7l8 + this.f1973s.f1960g;
                    float fYz = this.f47699toq.yz();
                    if (c0326g7 == c0326g8) {
                        i10 = c0326g7.f47693f7l8;
                        i11 = c0326g8.f47693f7l8;
                        fYz = 0.5f;
                    }
                    this.f1974y.mo1252n((int) (i10 + 0.5f + (((i11 - i10) - this.f1970n.f47693f7l8) * fYz)));
                    this.f1973s.mo1252n(this.f1974y.f47693f7l8 + this.f1970n.f47693f7l8);
                }
            }
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC0327h
    /* JADX INFO: renamed from: n */
    public void mo1258n() {
        C0326g c0326g = this.f1974y;
        if (c0326g.f1963p) {
            this.f47699toq.ra(c0326g.f47693f7l8);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC0327h
    void n7h() {
        this.f47698f7l8 = false;
        this.f1974y.zy();
        this.f1974y.f1963p = false;
        this.f1973s.zy();
        this.f1973s.f1963p = false;
        this.f47710ld6.zy();
        this.f47710ld6.f1963p = false;
        this.f1970n.f1963p = false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC0327h
    /* JADX INFO: renamed from: q */
    void mo1260q() {
        C0341n c0341nM1318f;
        C0341n c0341nM1318f2;
        C0341n c0341n = this.f47699toq;
        if (c0341n.f2050k) {
            this.f1970n.mo1252n(c0341n.jk());
        }
        if (!this.f1970n.f1963p) {
            this.f1972q = this.f47699toq.bf2();
            if (this.f47699toq.nmn5()) {
                this.f47711x2 = new C0328k(this);
            }
            C0341n.toq toqVar = this.f1972q;
            if (toqVar != C0341n.toq.MATCH_CONSTRAINT) {
                if (toqVar == C0341n.toq.MATCH_PARENT && (c0341nM1318f2 = this.f47699toq.m1318f()) != null && c0341nM1318f2.bf2() == C0341n.toq.FIXED) {
                    int iJk = (c0341nM1318f2.jk() - this.f47699toq.f2051l.f7l8()) - this.f47699toq.f47887hyr.f7l8();
                    toq(this.f1974y, c0341nM1318f2.f2046g.f1974y, this.f47699toq.f2051l.f7l8());
                    toq(this.f1973s, c0341nM1318f2.f2046g.f1973s, -this.f47699toq.f47887hyr.f7l8());
                    this.f1970n.mo1252n(iJk);
                    return;
                }
                if (this.f1972q == C0341n.toq.FIXED) {
                    this.f1970n.mo1252n(this.f47699toq.jk());
                }
            }
        } else if (this.f1972q == C0341n.toq.MATCH_PARENT && (c0341nM1318f = this.f47699toq.m1318f()) != null && c0341nM1318f.bf2() == C0341n.toq.FIXED) {
            toq(this.f1974y, c0341nM1318f.f2046g.f1974y, this.f47699toq.f2051l.f7l8());
            toq(this.f1973s, c0341nM1318f.f2046g.f1973s, -this.f47699toq.f47887hyr.f7l8());
            return;
        }
        f7l8 f7l8Var = this.f1970n;
        boolean z2 = f7l8Var.f1963p;
        if (z2) {
            C0341n c0341n2 = this.f47699toq;
            if (c0341n2.f2050k) {
                C0343q[] c0343qArr = c0341n2.f47922vyq;
                C0343q c0343q = c0343qArr[2];
                C0343q c0343q2 = c0343q.f2068g;
                if (c0343q2 != null && c0343qArr[3].f2068g != null) {
                    if (c0341n2.mu()) {
                        this.f1974y.f1960g = this.f47699toq.f47922vyq[2].f7l8();
                        this.f1973s.f1960g = -this.f47699toq.f47922vyq[3].f7l8();
                    } else {
                        C0326g c0326gM1262y = m1262y(this.f47699toq.f47922vyq[2]);
                        if (c0326gM1262y != null) {
                            toq(this.f1974y, c0326gM1262y, this.f47699toq.f47922vyq[2].f7l8());
                        }
                        C0326g c0326gM1262y2 = m1262y(this.f47699toq.f47922vyq[3]);
                        if (c0326gM1262y2 != null) {
                            toq(this.f1973s, c0326gM1262y2, -this.f47699toq.f47922vyq[3].f7l8());
                        }
                        this.f1974y.f47695toq = true;
                        this.f1973s.f47695toq = true;
                    }
                    if (this.f47699toq.nmn5()) {
                        toq(this.f47710ld6, this.f1974y, this.f47699toq.m1321i());
                        return;
                    }
                    return;
                }
                if (c0343q2 != null) {
                    C0326g c0326gM1262y3 = m1262y(c0343q);
                    if (c0326gM1262y3 != null) {
                        toq(this.f1974y, c0326gM1262y3, this.f47699toq.f47922vyq[2].f7l8());
                        toq(this.f1973s, this.f1974y, this.f1970n.f47693f7l8);
                        if (this.f47699toq.nmn5()) {
                            toq(this.f47710ld6, this.f1974y, this.f47699toq.m1321i());
                            return;
                        }
                        return;
                    }
                    return;
                }
                C0343q c0343q3 = c0343qArr[3];
                if (c0343q3.f2068g != null) {
                    C0326g c0326gM1262y4 = m1262y(c0343q3);
                    if (c0326gM1262y4 != null) {
                        toq(this.f1973s, c0326gM1262y4, -this.f47699toq.f47922vyq[3].f7l8());
                        toq(this.f1974y, this.f1973s, -this.f1970n.f47693f7l8);
                    }
                    if (this.f47699toq.nmn5()) {
                        toq(this.f47710ld6, this.f1974y, this.f47699toq.m1321i());
                        return;
                    }
                    return;
                }
                C0343q c0343q4 = c0343qArr[4];
                if (c0343q4.f2068g != null) {
                    C0326g c0326gM1262y5 = m1262y(c0343q4);
                    if (c0326gM1262y5 != null) {
                        toq(this.f47710ld6, c0326gM1262y5, 0);
                        toq(this.f1974y, this.f47710ld6, -this.f47699toq.m1321i());
                        toq(this.f1973s, this.f1974y, this.f1970n.f47693f7l8);
                        return;
                    }
                    return;
                }
                if ((c0341n2 instanceof InterfaceC0344s) || c0341n2.m1318f() == null || this.f47699toq.ki(C0343q.toq.CENTER).f2068g != null) {
                    return;
                }
                toq(this.f1974y, this.f47699toq.m1318f().f2046g.f1974y, this.f47699toq.ch());
                toq(this.f1973s, this.f1974y, this.f1970n.f47693f7l8);
                if (this.f47699toq.nmn5()) {
                    toq(this.f47710ld6, this.f1974y, this.f47699toq.m1321i());
                    return;
                }
                return;
            }
        }
        if (z2 || this.f1972q != C0341n.toq.MATCH_CONSTRAINT) {
            f7l8Var.toq(this);
        } else {
            C0341n c0341n3 = this.f47699toq;
            int i2 = c0341n3.f47881fu4;
            if (i2 == 2) {
                C0341n c0341nM1318f3 = c0341n3.m1318f();
                if (c0341nM1318f3 != null) {
                    f7l8 f7l8Var2 = c0341nM1318f3.f2046g.f1970n;
                    this.f1970n.f47696x2.add(f7l8Var2);
                    f7l8Var2.f47694ld6.add(this.f1970n);
                    f7l8 f7l8Var3 = this.f1970n;
                    f7l8Var3.f47695toq = true;
                    f7l8Var3.f47694ld6.add(this.f1974y);
                    this.f1970n.f47694ld6.add(this.f1973s);
                }
            } else if (i2 == 3 && !c0341n3.mu()) {
                C0341n c0341n4 = this.f47699toq;
                if (c0341n4.f47906ni7 != 3) {
                    f7l8 f7l8Var4 = c0341n4.f2053n.f1970n;
                    this.f1970n.f47696x2.add(f7l8Var4);
                    f7l8Var4.f47694ld6.add(this.f1970n);
                    f7l8 f7l8Var5 = this.f1970n;
                    f7l8Var5.f47695toq = true;
                    f7l8Var5.f47694ld6.add(this.f1974y);
                    this.f1970n.f47694ld6.add(this.f1973s);
                }
            }
        }
        C0341n c0341n5 = this.f47699toq;
        C0343q[] c0343qArr2 = c0341n5.f47922vyq;
        C0343q c0343q5 = c0343qArr2[2];
        C0343q c0343q6 = c0343q5.f2068g;
        if (c0343q6 != null && c0343qArr2[3].f2068g != null) {
            if (c0341n5.mu()) {
                this.f1974y.f1960g = this.f47699toq.f47922vyq[2].f7l8();
                this.f1973s.f1960g = -this.f47699toq.f47922vyq[3].f7l8();
            } else {
                C0326g c0326gM1262y6 = m1262y(this.f47699toq.f47922vyq[2]);
                C0326g c0326gM1262y7 = m1262y(this.f47699toq.f47922vyq[3]);
                if (c0326gM1262y6 != null) {
                    c0326gM1262y6.toq(this);
                }
                if (c0326gM1262y7 != null) {
                    c0326gM1262y7.toq(this);
                }
                this.f1971p = AbstractC0327h.toq.CENTER;
            }
            if (this.f47699toq.nmn5()) {
                zy(this.f47710ld6, this.f1974y, 1, this.f47711x2);
            }
        } else if (c0343q6 != null) {
            C0326g c0326gM1262y8 = m1262y(c0343q5);
            if (c0326gM1262y8 != null) {
                toq(this.f1974y, c0326gM1262y8, this.f47699toq.f47922vyq[2].f7l8());
                zy(this.f1973s, this.f1974y, 1, this.f1970n);
                if (this.f47699toq.nmn5()) {
                    zy(this.f47710ld6, this.f1974y, 1, this.f47711x2);
                }
                C0341n.toq toqVar2 = this.f1972q;
                C0341n.toq toqVar3 = C0341n.toq.MATCH_CONSTRAINT;
                if (toqVar2 == toqVar3 && this.f47699toq.wvg() > 0.0f) {
                    x2 x2Var = this.f47699toq.f2053n;
                    if (x2Var.f1972q == toqVar3) {
                        x2Var.f1970n.f47694ld6.add(this.f1970n);
                        this.f1970n.f47696x2.add(this.f47699toq.f2053n.f1970n);
                        this.f1970n.f1961k = this;
                    }
                }
            }
        } else {
            C0343q c0343q7 = c0343qArr2[3];
            if (c0343q7.f2068g != null) {
                C0326g c0326gM1262y9 = m1262y(c0343q7);
                if (c0326gM1262y9 != null) {
                    toq(this.f1973s, c0326gM1262y9, -this.f47699toq.f47922vyq[3].f7l8());
                    zy(this.f1974y, this.f1973s, -1, this.f1970n);
                    if (this.f47699toq.nmn5()) {
                        zy(this.f47710ld6, this.f1974y, 1, this.f47711x2);
                    }
                }
            } else {
                C0343q c0343q8 = c0343qArr2[4];
                if (c0343q8.f2068g != null) {
                    C0326g c0326gM1262y10 = m1262y(c0343q8);
                    if (c0326gM1262y10 != null) {
                        toq(this.f47710ld6, c0326gM1262y10, 0);
                        zy(this.f1974y, this.f47710ld6, -1, this.f47711x2);
                        zy(this.f1973s, this.f1974y, 1, this.f1970n);
                    }
                } else if (!(c0341n5 instanceof InterfaceC0344s) && c0341n5.m1318f() != null) {
                    toq(this.f1974y, this.f47699toq.m1318f().f2046g.f1974y, this.f47699toq.ch());
                    zy(this.f1973s, this.f1974y, 1, this.f1970n);
                    if (this.f47699toq.nmn5()) {
                        zy(this.f47710ld6, this.f1974y, 1, this.f47711x2);
                    }
                    C0341n.toq toqVar4 = this.f1972q;
                    C0341n.toq toqVar5 = C0341n.toq.MATCH_CONSTRAINT;
                    if (toqVar4 == toqVar5 && this.f47699toq.wvg() > 0.0f) {
                        x2 x2Var2 = this.f47699toq.f2053n;
                        if (x2Var2.f1972q == toqVar5) {
                            x2Var2.f1970n.f47694ld6.add(this.f1970n);
                            this.f1970n.f47696x2.add(this.f47699toq.f2053n.f1970n);
                            this.f1970n.f1961k = this;
                        }
                    }
                }
            }
        }
        if (this.f1970n.f47696x2.size() == 0) {
            this.f1970n.f47697zy = true;
        }
    }

    public String toString() {
        return "VerticalRun " + this.f47699toq.m1332z();
    }
}
