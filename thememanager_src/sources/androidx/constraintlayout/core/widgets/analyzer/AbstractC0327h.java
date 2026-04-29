package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.C0341n;
import androidx.constraintlayout.core.widgets.C0343q;

/* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.analyzer.h */
/* JADX INFO: compiled from: WidgetRun.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0327h implements InterfaceC0333q {

    /* JADX INFO: renamed from: k */
    public int f1969k;

    /* JADX INFO: renamed from: q */
    protected C0341n.toq f1972q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    C0341n f47699toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    qrj f47700zy;

    /* JADX INFO: renamed from: n */
    f7l8 f1970n = new f7l8(this);

    /* JADX INFO: renamed from: g */
    public int f1968g = 0;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    boolean f47698f7l8 = false;

    /* JADX INFO: renamed from: y */
    public C0326g f1974y = new C0326g(this);

    /* JADX INFO: renamed from: s */
    public C0326g f1973s = new C0326g(this);

    /* JADX INFO: renamed from: p */
    protected toq f1971p = toq.NONE;

    /* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.analyzer.h$k */
    /* JADX INFO: compiled from: WidgetRun.java */
    static /* synthetic */ class k {

        /* JADX INFO: renamed from: k */
        static final /* synthetic */ int[] f1975k;

        static {
            int[] iArr = new int[C0343q.toq.values().length];
            f1975k = iArr;
            try {
                iArr[C0343q.toq.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1975k[C0343q.toq.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1975k[C0343q.toq.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1975k[C0343q.toq.BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1975k[C0343q.toq.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.analyzer.h$toq */
    /* JADX INFO: compiled from: WidgetRun.java */
    enum toq {
        NONE,
        START,
        END,
        CENTER
    }

    public AbstractC0327h(C0341n c0341n) {
        this.f47699toq = c0341n;
    }

    private void kja0(int i2, int i3) {
        int i4 = this.f1969k;
        if (i4 == 0) {
            this.f1970n.mo1252n(f7l8(i3, i2));
            return;
        }
        if (i4 == 1) {
            this.f1970n.mo1252n(Math.min(f7l8(this.f1970n.f47692qrj, i2), i3));
            return;
        }
        if (i4 == 2) {
            C0341n c0341nM1318f = this.f47699toq.m1318f();
            if (c0341nM1318f != null) {
                if ((i2 == 0 ? c0341nM1318f.f2053n : c0341nM1318f.f2046g).f1970n.f1963p) {
                    C0341n c0341n = this.f47699toq;
                    this.f1970n.mo1252n(f7l8((int) ((r9.f47693f7l8 * (i2 == 0 ? c0341n.f2059t : c0341n.f47863a9)) + 0.5f), i2));
                    return;
                }
                return;
            }
            return;
        }
        if (i4 != 3) {
            return;
        }
        C0341n c0341n2 = this.f47699toq;
        AbstractC0327h abstractC0327h = c0341n2.f2053n;
        C0341n.toq toqVar = abstractC0327h.f1972q;
        C0341n.toq toqVar2 = C0341n.toq.MATCH_CONSTRAINT;
        if (toqVar == toqVar2 && abstractC0327h.f1969k == 3) {
            n7h n7hVar = c0341n2.f2046g;
            if (n7hVar.f1972q == toqVar2 && n7hVar.f1969k == 3) {
                return;
            }
        }
        if (i2 == 0) {
            abstractC0327h = c0341n2.f2046g;
        }
        if (abstractC0327h.f1970n.f1963p) {
            float fWvg = c0341n2.wvg();
            this.f1970n.mo1252n(i2 == 1 ? (int) ((abstractC0327h.f1970n.f47693f7l8 / fWvg) + 0.5f) : (int) ((fWvg * abstractC0327h.f1970n.f47693f7l8) + 0.5f));
        }
    }

    protected void cdj(InterfaceC0333q interfaceC0333q, C0343q c0343q, C0343q c0343q2, int i2) {
        C0326g c0326gM1262y = m1262y(c0343q);
        C0326g c0326gM1262y2 = m1262y(c0343q2);
        if (c0326gM1262y.f1963p && c0326gM1262y2.f1963p) {
            int iF7l8 = c0326gM1262y.f47693f7l8 + c0343q.f7l8();
            int iF7l82 = c0326gM1262y2.f47693f7l8 - c0343q2.f7l8();
            int i3 = iF7l82 - iF7l8;
            if (!this.f1970n.f1963p && this.f1972q == C0341n.toq.MATCH_CONSTRAINT) {
                kja0(i2, i3);
            }
            f7l8 f7l8Var = this.f1970n;
            if (f7l8Var.f1963p) {
                if (f7l8Var.f47693f7l8 == i3) {
                    this.f1974y.mo1252n(iF7l8);
                    this.f1973s.mo1252n(iF7l82);
                    return;
                }
                C0341n c0341n = this.f47699toq;
                float fA9 = i2 == 0 ? c0341n.a9() : c0341n.yz();
                if (c0326gM1262y == c0326gM1262y2) {
                    iF7l8 = c0326gM1262y.f47693f7l8;
                    iF7l82 = c0326gM1262y2.f47693f7l8;
                    fA9 = 0.5f;
                }
                this.f1974y.mo1252n((int) (iF7l8 + 0.5f + (((iF7l82 - iF7l8) - this.f1970n.f47693f7l8) * fA9)));
                this.f1973s.mo1252n(this.f1974y.f47693f7l8 + this.f1970n.f47693f7l8);
            }
        }
    }

    protected final int f7l8(int i2, int i3) {
        int iMax;
        if (i3 == 0) {
            C0341n c0341n = this.f47699toq;
            int i4 = c0341n.f47925wvg;
            iMax = Math.max(c0341n.f47909o1t, i2);
            if (i4 > 0) {
                iMax = Math.min(i4, i2);
            }
            if (iMax == i2) {
                return i2;
            }
        } else {
            C0341n c0341n2 = this.f47699toq;
            int i5 = c0341n2.f47891jk;
            iMax = Math.max(c0341n2.f47901mcp, i2);
            if (i5 > 0) {
                iMax = Math.min(i5, i2);
            }
            if (iMax == i2) {
                return i2;
            }
        }
        return iMax;
    }

    /* JADX INFO: renamed from: g */
    abstract void mo1255g();

    /* JADX INFO: renamed from: h */
    abstract boolean mo1256h();

    /* JADX INFO: renamed from: i */
    public long m1257i(int i2) {
        int i3;
        f7l8 f7l8Var = this.f1970n;
        if (!f7l8Var.f1963p) {
            return 0L;
        }
        long j2 = f7l8Var.f47693f7l8;
        if (ld6()) {
            i3 = this.f1974y.f1960g - this.f1973s.f1960g;
        } else {
            if (i2 != 0) {
                return j2 - ((long) this.f1973s.f1960g);
            }
            i3 = this.f1974y.f1960g;
        }
        return j2 + ((long) i3);
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.InterfaceC0333q
    /* JADX INFO: renamed from: k */
    public void mo1253k(InterfaceC0333q interfaceC0333q) {
    }

    protected void ki(InterfaceC0333q interfaceC0333q) {
    }

    public boolean ld6() {
        int size = this.f1974y.f47696x2.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            if (this.f1974y.f47696x2.get(i3).f1964q != this) {
                i2++;
            }
        }
        int size2 = this.f1973s.f47696x2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            if (this.f1973s.f47696x2.get(i4).f1964q != this) {
                i2++;
            }
        }
        return i2 >= 2;
    }

    /* JADX INFO: renamed from: n */
    abstract void mo1258n();

    abstract void n7h();

    /* JADX INFO: renamed from: p */
    public long mo1259p() {
        if (this.f1970n.f1963p) {
            return r0.f47693f7l8;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: q */
    abstract void mo1260q();

    public boolean qrj() {
        return this.f47698f7l8;
    }

    /* JADX INFO: renamed from: s */
    protected final C0326g m1261s(C0343q c0343q, int i2) {
        C0343q c0343q2 = c0343q.f2068g;
        if (c0343q2 == null) {
            return null;
        }
        C0341n c0341n = c0343q2.f2071q;
        AbstractC0327h abstractC0327h = i2 == 0 ? c0341n.f2053n : c0341n.f2046g;
        int i3 = k.f1975k[c0343q2.f2070n.ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 5) {
                        return null;
                    }
                }
            }
            return abstractC0327h.f1973s;
        }
        return abstractC0327h.f1974y;
    }

    protected void t8r(InterfaceC0333q interfaceC0333q) {
    }

    protected final void toq(C0326g c0326g, C0326g c0326g2, int i2) {
        c0326g.f47696x2.add(c0326g2);
        c0326g.f1960g = i2;
        c0326g2.f47694ld6.add(c0326g);
    }

    public boolean x2() {
        return this.f1970n.f1963p;
    }

    /* JADX INFO: renamed from: y */
    protected final C0326g m1262y(C0343q c0343q) {
        C0343q c0343q2 = c0343q.f2068g;
        if (c0343q2 == null) {
            return null;
        }
        C0341n c0341n = c0343q2.f2071q;
        int i2 = k.f1975k[c0343q2.f2070n.ordinal()];
        if (i2 == 1) {
            return c0341n.f2053n.f1974y;
        }
        if (i2 == 2) {
            return c0341n.f2053n.f1973s;
        }
        if (i2 == 3) {
            return c0341n.f2046g.f1974y;
        }
        if (i2 == 4) {
            return c0341n.f2046g.f47710ld6;
        }
        if (i2 != 5) {
            return null;
        }
        return c0341n.f2046g.f1973s;
    }

    protected final void zy(C0326g c0326g, C0326g c0326g2, int i2, f7l8 f7l8Var) {
        c0326g.f47696x2.add(c0326g2);
        c0326g.f47696x2.add(this.f1970n);
        c0326g.f1966y = i2;
        c0326g.f1965s = f7l8Var;
        c0326g2.f47694ld6.add(c0326g);
        f7l8Var.f47694ld6.add(c0326g);
    }
}
