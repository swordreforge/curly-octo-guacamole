package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.C0341n;
import androidx.constraintlayout.core.widgets.C0343q;
import androidx.constraintlayout.core.widgets.InterfaceC0344s;
import androidx.constraintlayout.core.widgets.analyzer.AbstractC0327h;
import androidx.constraintlayout.core.widgets.analyzer.C0326g;

/* JADX INFO: compiled from: HorizontalWidgetRun.java */
/* JADX INFO: loaded from: classes.dex */
public class x2 extends AbstractC0327h {

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static int[] f47727ld6 = new int[2];

    /* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.analyzer.x2$k */
    /* JADX INFO: compiled from: HorizontalWidgetRun.java */
    static /* synthetic */ class C0336k {

        /* JADX INFO: renamed from: k */
        static final /* synthetic */ int[] f2017k;

        static {
            int[] iArr = new int[AbstractC0327h.toq.values().length];
            f2017k = iArr;
            try {
                iArr[AbstractC0327h.toq.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2017k[AbstractC0327h.toq.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2017k[AbstractC0327h.toq.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public x2(C0341n c0341n) {
        super(c0341n);
        this.f1974y.f1962n = C0326g.k.LEFT;
        this.f1973s.f1962n = C0326g.k.RIGHT;
        this.f1968g = 0;
    }

    private void fn3e(int[] iArr, int i2, int i3, int i4, int i5, float f2, int i6) {
        int i7 = i3 - i2;
        int i8 = i5 - i4;
        if (i6 != -1) {
            if (i6 == 0) {
                iArr[0] = (int) ((i8 * f2) + 0.5f);
                iArr[1] = i8;
                return;
            } else {
                if (i6 != 1) {
                    return;
                }
                iArr[0] = i7;
                iArr[1] = (int) ((i7 * f2) + 0.5f);
                return;
            }
        }
        int i9 = (int) ((i8 * f2) + 0.5f);
        int i10 = (int) ((i7 / f2) + 0.5f);
        if (i9 <= i7) {
            iArr[0] = i9;
            iArr[1] = i8;
        } else if (i10 <= i8) {
            iArr[0] = i7;
            iArr[1] = i10;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC0327h
    /* JADX INFO: renamed from: g */
    void mo1255g() {
        this.f47700zy = null;
        this.f1974y.zy();
        this.f1973s.zy();
        this.f1970n.zy();
        this.f47698f7l8 = false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC0327h
    /* JADX INFO: renamed from: h */
    boolean mo1256h() {
        return this.f1972q != C0341n.toq.MATCH_CONSTRAINT || this.f47699toq.f47906ni7 == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x02de  */
    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC0327h, androidx.constraintlayout.core.widgets.analyzer.InterfaceC0333q
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo1253k(androidx.constraintlayout.core.widgets.analyzer.InterfaceC0333q r17) {
        /*
            Method dump skipped, instruction units count: 1087
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.x2.mo1253k(androidx.constraintlayout.core.widgets.analyzer.q):void");
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC0327h
    /* JADX INFO: renamed from: n */
    public void mo1258n() {
        C0326g c0326g = this.f1974y;
        if (c0326g.f1963p) {
            this.f47699toq.v5yj(c0326g.f47693f7l8);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC0327h
    void n7h() {
        this.f47698f7l8 = false;
        this.f1974y.zy();
        this.f1974y.f1963p = false;
        this.f1973s.zy();
        this.f1973s.f1963p = false;
        this.f1970n.f1963p = false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC0327h
    /* JADX INFO: renamed from: q */
    void mo1260q() {
        C0341n c0341nM1318f;
        C0341n c0341nM1318f2;
        C0341n c0341n = this.f47699toq;
        if (c0341n.f2050k) {
            this.f1970n.mo1252n(c0341n.m1313a());
        }
        if (this.f1970n.f1963p) {
            C0341n.toq toqVar = this.f1972q;
            C0341n.toq toqVar2 = C0341n.toq.MATCH_PARENT;
            if (toqVar == toqVar2 && (c0341nM1318f = this.f47699toq.m1318f()) != null && (c0341nM1318f.gvn7() == C0341n.toq.FIXED || c0341nM1318f.gvn7() == toqVar2)) {
                toq(this.f1974y, c0341nM1318f.f2053n.f1974y, this.f47699toq.f47905ncyb.f7l8());
                toq(this.f1973s, c0341nM1318f.f2053n.f1973s, -this.f47699toq.f47903n5r1.f7l8());
                return;
            }
        } else {
            C0341n.toq toqVarGvn7 = this.f47699toq.gvn7();
            this.f1972q = toqVarGvn7;
            if (toqVarGvn7 != C0341n.toq.MATCH_CONSTRAINT) {
                C0341n.toq toqVar3 = C0341n.toq.MATCH_PARENT;
                if (toqVarGvn7 == toqVar3 && (c0341nM1318f2 = this.f47699toq.m1318f()) != null && (c0341nM1318f2.gvn7() == C0341n.toq.FIXED || c0341nM1318f2.gvn7() == toqVar3)) {
                    int iM1313a = (c0341nM1318f2.m1313a() - this.f47699toq.f47905ncyb.f7l8()) - this.f47699toq.f47903n5r1.f7l8();
                    toq(this.f1974y, c0341nM1318f2.f2053n.f1974y, this.f47699toq.f47905ncyb.f7l8());
                    toq(this.f1973s, c0341nM1318f2.f2053n.f1973s, -this.f47699toq.f47903n5r1.f7l8());
                    this.f1970n.mo1252n(iM1313a);
                    return;
                }
                if (this.f1972q == C0341n.toq.FIXED) {
                    this.f1970n.mo1252n(this.f47699toq.m1313a());
                }
            }
        }
        f7l8 f7l8Var = this.f1970n;
        if (f7l8Var.f1963p) {
            C0341n c0341n2 = this.f47699toq;
            if (c0341n2.f2050k) {
                C0343q[] c0343qArr = c0341n2.f47922vyq;
                C0343q c0343q = c0343qArr[0];
                C0343q c0343q2 = c0343q.f2068g;
                if (c0343q2 != null && c0343qArr[1].f2068g != null) {
                    if (c0341n2.ikck()) {
                        this.f1974y.f1960g = this.f47699toq.f47922vyq[0].f7l8();
                        this.f1973s.f1960g = -this.f47699toq.f47922vyq[1].f7l8();
                        return;
                    }
                    C0326g c0326gM1262y = m1262y(this.f47699toq.f47922vyq[0]);
                    if (c0326gM1262y != null) {
                        toq(this.f1974y, c0326gM1262y, this.f47699toq.f47922vyq[0].f7l8());
                    }
                    C0326g c0326gM1262y2 = m1262y(this.f47699toq.f47922vyq[1]);
                    if (c0326gM1262y2 != null) {
                        toq(this.f1973s, c0326gM1262y2, -this.f47699toq.f47922vyq[1].f7l8());
                    }
                    this.f1974y.f47695toq = true;
                    this.f1973s.f47695toq = true;
                    return;
                }
                if (c0343q2 != null) {
                    C0326g c0326gM1262y3 = m1262y(c0343q);
                    if (c0326gM1262y3 != null) {
                        toq(this.f1974y, c0326gM1262y3, this.f47699toq.f47922vyq[0].f7l8());
                        toq(this.f1973s, this.f1974y, this.f1970n.f47693f7l8);
                        return;
                    }
                    return;
                }
                C0343q c0343q3 = c0343qArr[1];
                if (c0343q3.f2068g != null) {
                    C0326g c0326gM1262y4 = m1262y(c0343q3);
                    if (c0326gM1262y4 != null) {
                        toq(this.f1973s, c0326gM1262y4, -this.f47699toq.f47922vyq[1].f7l8());
                        toq(this.f1974y, this.f1973s, -this.f1970n.f47693f7l8);
                        return;
                    }
                    return;
                }
                if ((c0341n2 instanceof InterfaceC0344s) || c0341n2.m1318f() == null || this.f47699toq.ki(C0343q.toq.CENTER).f2068g != null) {
                    return;
                }
                toq(this.f1974y, this.f47699toq.m1318f().f2053n.f1974y, this.f47699toq.m1331x());
                toq(this.f1973s, this.f1974y, this.f1970n.f47693f7l8);
                return;
            }
        }
        if (this.f1972q == C0341n.toq.MATCH_CONSTRAINT) {
            C0341n c0341n3 = this.f47699toq;
            int i2 = c0341n3.f47906ni7;
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
            } else if (i2 == 3) {
                if (c0341n3.f47881fu4 == 3) {
                    this.f1974y.f1961k = this;
                    this.f1973s.f1961k = this;
                    n7h n7hVar = c0341n3.f2046g;
                    n7hVar.f1974y.f1961k = this;
                    n7hVar.f1973s.f1961k = this;
                    f7l8Var.f1961k = this;
                    if (c0341n3.mu()) {
                        this.f1970n.f47696x2.add(this.f47699toq.f2046g.f1970n);
                        this.f47699toq.f2046g.f1970n.f47694ld6.add(this.f1970n);
                        n7h n7hVar2 = this.f47699toq.f2046g;
                        n7hVar2.f1970n.f1961k = this;
                        this.f1970n.f47696x2.add(n7hVar2.f1974y);
                        this.f1970n.f47696x2.add(this.f47699toq.f2046g.f1973s);
                        this.f47699toq.f2046g.f1974y.f47694ld6.add(this.f1970n);
                        this.f47699toq.f2046g.f1973s.f47694ld6.add(this.f1970n);
                    } else if (this.f47699toq.ikck()) {
                        this.f47699toq.f2046g.f1970n.f47696x2.add(this.f1970n);
                        this.f1970n.f47694ld6.add(this.f47699toq.f2046g.f1970n);
                    } else {
                        this.f47699toq.f2046g.f1970n.f47696x2.add(this.f1970n);
                    }
                } else {
                    f7l8 f7l8Var4 = c0341n3.f2046g.f1970n;
                    f7l8Var.f47696x2.add(f7l8Var4);
                    f7l8Var4.f47694ld6.add(this.f1970n);
                    this.f47699toq.f2046g.f1974y.f47694ld6.add(this.f1970n);
                    this.f47699toq.f2046g.f1973s.f47694ld6.add(this.f1970n);
                    f7l8 f7l8Var5 = this.f1970n;
                    f7l8Var5.f47695toq = true;
                    f7l8Var5.f47694ld6.add(this.f1974y);
                    this.f1970n.f47694ld6.add(this.f1973s);
                    this.f1974y.f47696x2.add(this.f1970n);
                    this.f1973s.f47696x2.add(this.f1970n);
                }
            }
        }
        C0341n c0341n4 = this.f47699toq;
        C0343q[] c0343qArr2 = c0341n4.f47922vyq;
        C0343q c0343q4 = c0343qArr2[0];
        C0343q c0343q5 = c0343q4.f2068g;
        if (c0343q5 != null && c0343qArr2[1].f2068g != null) {
            if (c0341n4.ikck()) {
                this.f1974y.f1960g = this.f47699toq.f47922vyq[0].f7l8();
                this.f1973s.f1960g = -this.f47699toq.f47922vyq[1].f7l8();
                return;
            }
            C0326g c0326gM1262y5 = m1262y(this.f47699toq.f47922vyq[0]);
            C0326g c0326gM1262y6 = m1262y(this.f47699toq.f47922vyq[1]);
            if (c0326gM1262y5 != null) {
                c0326gM1262y5.toq(this);
            }
            if (c0326gM1262y6 != null) {
                c0326gM1262y6.toq(this);
            }
            this.f1971p = AbstractC0327h.toq.CENTER;
            return;
        }
        if (c0343q5 != null) {
            C0326g c0326gM1262y7 = m1262y(c0343q4);
            if (c0326gM1262y7 != null) {
                toq(this.f1974y, c0326gM1262y7, this.f47699toq.f47922vyq[0].f7l8());
                zy(this.f1973s, this.f1974y, 1, this.f1970n);
                return;
            }
            return;
        }
        C0343q c0343q6 = c0343qArr2[1];
        if (c0343q6.f2068g != null) {
            C0326g c0326gM1262y8 = m1262y(c0343q6);
            if (c0326gM1262y8 != null) {
                toq(this.f1973s, c0326gM1262y8, -this.f47699toq.f47922vyq[1].f7l8());
                zy(this.f1974y, this.f1973s, -1, this.f1970n);
                return;
            }
            return;
        }
        if ((c0341n4 instanceof InterfaceC0344s) || c0341n4.m1318f() == null) {
            return;
        }
        toq(this.f1974y, this.f47699toq.m1318f().f2053n.f1974y, this.f47699toq.m1331x());
        zy(this.f1973s, this.f1974y, 1, this.f1970n);
    }

    public String toString() {
        return "HorizontalRun " + this.f47699toq.m1332z();
    }
}
