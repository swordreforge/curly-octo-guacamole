package androidx.constraintlayout.core;

import androidx.constraintlayout.core.C0296n;
import androidx.constraintlayout.core.C0307s;
import java.util.ArrayList;

/* JADX INFO: compiled from: ArrayRow.java */
/* JADX INFO: loaded from: classes.dex */
public class toq implements C0296n.k {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final boolean f47689f7l8 = false;

    /* JADX INFO: renamed from: y */
    private static final boolean f1955y = false;

    /* JADX INFO: renamed from: n */
    public InterfaceC0325k f1958n;

    /* JADX INFO: renamed from: k */
    C0307s f1957k = null;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    float f47690toq = 0.0f;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    boolean f47691zy = false;

    /* JADX INFO: renamed from: q */
    ArrayList<C0307s> f1959q = new ArrayList<>();

    /* JADX INFO: renamed from: g */
    boolean f1956g = false;

    /* JADX INFO: renamed from: androidx.constraintlayout.core.toq$k */
    /* JADX INFO: compiled from: ArrayRow.java */
    public interface InterfaceC0325k {
        void cdj(float f2);

        void clear();

        C0307s f7l8(int i2);

        /* JADX INFO: renamed from: g */
        boolean mo918g(C0307s c0307s);

        /* JADX INFO: renamed from: h */
        float mo919h(C0307s c0307s);

        float kja0(int i2);

        int ld6();

        /* JADX INFO: renamed from: n */
        int mo922n(C0307s c0307s);

        void n7h(C0307s c0307s, float f2);

        /* JADX INFO: renamed from: p */
        float mo923p(C0307s c0307s, boolean z2);

        /* JADX INFO: renamed from: q */
        int mo924q();

        float qrj(toq toqVar, boolean z2);

        /* JADX INFO: renamed from: s */
        void mo925s();

        void x2();

        /* JADX INFO: renamed from: y */
        void mo926y(C0307s c0307s, float f2, boolean z2);
    }

    public toq() {
    }

    private boolean o1t(C0307s c0307s, C0296n c0296n) {
        return c0307s.f1865l <= 1;
    }

    /* JADX INFO: renamed from: t */
    private C0307s m1245t(boolean[] zArr, C0307s c0307s) {
        C0307s.toq toqVar;
        int iMo924q = this.f1958n.mo924q();
        C0307s c0307s2 = null;
        float f2 = 0.0f;
        for (int i2 = 0; i2 < iMo924q; i2++) {
            float fKja0 = this.f1958n.kja0(i2);
            if (fKja0 < 0.0f) {
                C0307s c0307sF7l8 = this.f1958n.f7l8(i2);
                if ((zArr == null || !zArr[c0307sF7l8.f1866n]) && c0307sF7l8 != c0307s && (((toqVar = c0307sF7l8.f1873z) == C0307s.toq.SLACK || toqVar == C0307s.toq.ERROR) && fKja0 < f2)) {
                    f2 = fKja0;
                    c0307s2 = c0307sF7l8;
                }
            }
        }
        return c0307s2;
    }

    int a9() {
        return (this.f1957k != null ? 4 : 0) + 4 + 4 + this.f1958n.ld6();
    }

    public toq cdj(C0307s c0307s, int i2) {
        if (i2 < 0) {
            this.f47690toq = i2 * (-1);
            this.f1958n.n7h(c0307s, 1.0f);
        } else {
            this.f47690toq = i2;
            this.f1958n.n7h(c0307s, -1.0f);
        }
        return this;
    }

    @Override // androidx.constraintlayout.core.C0296n.k
    public void clear() {
        this.f1958n.clear();
        this.f1957k = null;
        this.f47690toq = 0.0f;
    }

    public toq f7l8(C0296n c0296n, int i2) {
        this.f1958n.n7h(c0296n.t8r(i2, "ep"), 1.0f);
        this.f1958n.n7h(c0296n.t8r(i2, "em"), -1.0f);
        return this;
    }

    public toq fn3e(C0307s c0307s, C0307s c0307s2, C0307s c0307s3, int i2) {
        boolean z2 = false;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 *= -1;
                z2 = true;
            }
            this.f47690toq = i2;
        }
        if (z2) {
            this.f1958n.n7h(c0307s, 1.0f);
            this.f1958n.n7h(c0307s2, -1.0f);
            this.f1958n.n7h(c0307s3, 1.0f);
        } else {
            this.f1958n.n7h(c0307s, -1.0f);
            this.f1958n.n7h(c0307s2, 1.0f);
            this.f1958n.n7h(c0307s3, -1.0f);
        }
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    java.lang.String fti() {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.toq.fti():java.lang.String");
    }

    boolean fu4() {
        C0307s c0307s = this.f1957k;
        return c0307s != null && (c0307s.f1873z == C0307s.toq.UNRESTRICTED || this.f47690toq >= 0.0f);
    }

    @Override // androidx.constraintlayout.core.C0296n.k
    /* JADX INFO: renamed from: g */
    public void mo1126g(C0307s c0307s) {
        int i2 = c0307s.f1872y;
        float f2 = 1.0f;
        if (i2 != 1) {
            if (i2 == 2) {
                f2 = 1000.0f;
            } else if (i2 == 3) {
                f2 = 1000000.0f;
            } else if (i2 == 4) {
                f2 = 1.0E9f;
            } else if (i2 == 5) {
                f2 = 1.0E12f;
            }
        }
        this.f1958n.n7h(c0307s, f2);
    }

    @Override // androidx.constraintlayout.core.C0296n.k
    public C0307s getKey() {
        return this.f1957k;
    }

    /* JADX INFO: renamed from: h */
    public toq m1246h(float f2, float f3, float f4, C0307s c0307s, C0307s c0307s2, C0307s c0307s3, C0307s c0307s4) {
        this.f47690toq = 0.0f;
        if (f3 == 0.0f || f2 == f4) {
            this.f1958n.n7h(c0307s, 1.0f);
            this.f1958n.n7h(c0307s2, -1.0f);
            this.f1958n.n7h(c0307s4, 1.0f);
            this.f1958n.n7h(c0307s3, -1.0f);
        } else if (f2 == 0.0f) {
            this.f1958n.n7h(c0307s, 1.0f);
            this.f1958n.n7h(c0307s2, -1.0f);
        } else if (f4 == 0.0f) {
            this.f1958n.n7h(c0307s3, 1.0f);
            this.f1958n.n7h(c0307s4, -1.0f);
        } else {
            float f5 = (f2 / f3) / (f4 / f3);
            this.f1958n.n7h(c0307s, 1.0f);
            this.f1958n.n7h(c0307s2, -1.0f);
            this.f1958n.n7h(c0307s4, f5);
            this.f1958n.n7h(c0307s3, -f5);
        }
        return this;
    }

    /* JADX INFO: renamed from: i */
    public toq m1247i(C0307s c0307s, C0307s c0307s2, C0307s c0307s3, int i2) {
        boolean z2 = false;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 *= -1;
                z2 = true;
            }
            this.f47690toq = i2;
        }
        if (z2) {
            this.f1958n.n7h(c0307s, 1.0f);
            this.f1958n.n7h(c0307s2, -1.0f);
            this.f1958n.n7h(c0307s3, -1.0f);
        } else {
            this.f1958n.n7h(c0307s, -1.0f);
            this.f1958n.n7h(c0307s2, 1.0f);
            this.f1958n.n7h(c0307s3, 1.0f);
        }
        return this;
    }

    @Override // androidx.constraintlayout.core.C0296n.k
    public boolean isEmpty() {
        return this.f1957k == null && this.f47690toq == 0.0f && this.f1958n.mo924q() == 0;
    }

    public void jk() {
        this.f1957k = null;
        this.f1958n.clear();
        this.f47690toq = 0.0f;
        this.f1956g = false;
    }

    public void jp0y(C0296n c0296n, C0307s c0307s, boolean z2) {
        if (c0307s == null || !c0307s.f1859f) {
            return;
        }
        float fMo919h = this.f1958n.mo919h(c0307s);
        this.f47690toq += c0307s.f1858e * fMo919h;
        this.f1958n.mo923p(c0307s, z2);
        if (z2) {
            c0307s.m1153p(this);
        }
        this.f1958n.mo926y(c0296n.f47577n7h.f2095q[c0307s.f1857c], fMo919h, z2);
        if (C0296n.f47564fu4 && this.f1958n.mo924q() == 0) {
            this.f1956g = true;
            c0296n.f1809k = true;
        }
    }

    @Override // androidx.constraintlayout.core.C0296n.k
    /* JADX INFO: renamed from: k */
    public void mo1127k(C0296n c0296n, C0307s c0307s, boolean z2) {
        if (c0307s == null || !c0307s.f1867p) {
            return;
        }
        this.f47690toq += c0307s.f1870s * this.f1958n.mo919h(c0307s);
        this.f1958n.mo923p(c0307s, z2);
        if (z2) {
            c0307s.m1153p(this);
        }
        if (C0296n.f47564fu4 && this.f1958n.mo924q() == 0) {
            this.f1956g = true;
            c0296n.f1809k = true;
        }
    }

    public toq ki(C0307s c0307s, C0307s c0307s2, int i2) {
        boolean z2 = false;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 *= -1;
                z2 = true;
            }
            this.f47690toq = i2;
        }
        if (z2) {
            this.f1958n.n7h(c0307s, 1.0f);
            this.f1958n.n7h(c0307s2, -1.0f);
        } else {
            this.f1958n.n7h(c0307s, -1.0f);
            this.f1958n.n7h(c0307s2, 1.0f);
        }
        return this;
    }

    public toq kja0(float f2, float f3, float f4, C0307s c0307s, int i2, C0307s c0307s2, int i3, C0307s c0307s3, int i4, C0307s c0307s4, int i5) {
        if (f3 == 0.0f || f2 == f4) {
            this.f47690toq = ((-i2) - i3) + i4 + i5;
            this.f1958n.n7h(c0307s, 1.0f);
            this.f1958n.n7h(c0307s2, -1.0f);
            this.f1958n.n7h(c0307s4, 1.0f);
            this.f1958n.n7h(c0307s3, -1.0f);
        } else {
            float f5 = (f2 / f3) / (f4 / f3);
            this.f47690toq = ((-i2) - i3) + (i4 * f5) + (i5 * f5);
            this.f1958n.n7h(c0307s, 1.0f);
            this.f1958n.n7h(c0307s2, -1.0f);
            this.f1958n.n7h(c0307s4, f5);
            this.f1958n.n7h(c0307s3, -f5);
        }
        return this;
    }

    toq ld6(C0307s c0307s, C0307s c0307s2, int i2, float f2, C0307s c0307s3, C0307s c0307s4, int i3) {
        if (c0307s2 == c0307s3) {
            this.f1958n.n7h(c0307s, 1.0f);
            this.f1958n.n7h(c0307s4, 1.0f);
            this.f1958n.n7h(c0307s2, -2.0f);
            return this;
        }
        if (f2 == 0.5f) {
            this.f1958n.n7h(c0307s, 1.0f);
            this.f1958n.n7h(c0307s2, -1.0f);
            this.f1958n.n7h(c0307s3, -1.0f);
            this.f1958n.n7h(c0307s4, 1.0f);
            if (i2 > 0 || i3 > 0) {
                this.f47690toq = (-i2) + i3;
            }
        } else if (f2 <= 0.0f) {
            this.f1958n.n7h(c0307s, -1.0f);
            this.f1958n.n7h(c0307s2, 1.0f);
            this.f47690toq = i2;
        } else if (f2 >= 1.0f) {
            this.f1958n.n7h(c0307s4, -1.0f);
            this.f1958n.n7h(c0307s3, 1.0f);
            this.f47690toq = -i3;
        } else {
            float f3 = 1.0f - f2;
            this.f1958n.n7h(c0307s, f3 * 1.0f);
            this.f1958n.n7h(c0307s2, f3 * (-1.0f));
            this.f1958n.n7h(c0307s3, (-1.0f) * f2);
            this.f1958n.n7h(c0307s4, 1.0f * f2);
            if (i2 > 0 || i3 > 0) {
                this.f47690toq = ((-i2) * f3) + (i3 * f2);
            }
        }
        return this;
    }

    void mcp(C0307s c0307s) {
        C0307s c0307s2 = this.f1957k;
        if (c0307s2 != null) {
            this.f1958n.n7h(c0307s2, -1.0f);
            this.f1957k.f1860g = -1;
            this.f1957k = null;
        }
        float fMo923p = this.f1958n.mo923p(c0307s, true) * (-1.0f);
        this.f1957k = c0307s;
        if (fMo923p == 1.0f) {
            return;
        }
        this.f47690toq /= fMo923p;
        this.f1958n.cdj(fMo923p);
    }

    @Override // androidx.constraintlayout.core.C0296n.k
    /* JADX INFO: renamed from: n */
    public C0307s mo1128n(C0296n c0296n, boolean[] zArr) {
        return m1245t(zArr, null);
    }

    public toq n7h(C0307s c0307s, C0307s c0307s2, C0307s c0307s3, C0307s c0307s4, float f2) {
        this.f1958n.n7h(c0307s, -1.0f);
        this.f1958n.n7h(c0307s2, 1.0f);
        this.f1958n.n7h(c0307s3, f2);
        this.f1958n.n7h(c0307s4, -f2);
        return this;
    }

    void ni7() {
        float f2 = this.f47690toq;
        if (f2 < 0.0f) {
            this.f47690toq = f2 * (-1.0f);
            this.f1958n.mo925s();
        }
    }

    /* JADX INFO: renamed from: p */
    C0307s m1248p(C0296n c0296n) {
        int iMo924q = this.f1958n.mo924q();
        C0307s c0307s = null;
        boolean z2 = false;
        boolean z3 = false;
        float f2 = 0.0f;
        float f3 = 0.0f;
        C0307s c0307s2 = null;
        for (int i2 = 0; i2 < iMo924q; i2++) {
            float fKja0 = this.f1958n.kja0(i2);
            C0307s c0307sF7l8 = this.f1958n.f7l8(i2);
            if (c0307sF7l8.f1873z == C0307s.toq.UNRESTRICTED) {
                if (c0307s == null || f2 > fKja0) {
                    boolean zO1t = o1t(c0307sF7l8, c0296n);
                    z2 = zO1t;
                    f2 = fKja0;
                    c0307s = c0307sF7l8;
                } else if (!z2 && o1t(c0307sF7l8, c0296n)) {
                    f2 = fKja0;
                    c0307s = c0307sF7l8;
                    z2 = true;
                }
            } else if (c0307s == null && fKja0 < 0.0f) {
                if (c0307s2 == null || f3 > fKja0) {
                    boolean zO1t2 = o1t(c0307sF7l8, c0296n);
                    z3 = zO1t2;
                    f3 = fKja0;
                    c0307s2 = c0307sF7l8;
                } else if (!z3 && o1t(c0307sF7l8, c0296n)) {
                    f3 = fKja0;
                    c0307s2 = c0307sF7l8;
                    z3 = true;
                }
            }
        }
        return c0307s != null ? c0307s : c0307s2;
    }

    @Override // androidx.constraintlayout.core.C0296n.k
    /* JADX INFO: renamed from: q */
    public void mo1129q(C0296n.k kVar) {
        if (kVar instanceof toq) {
            toq toqVar = (toq) kVar;
            this.f1957k = null;
            this.f1958n.clear();
            for (int i2 = 0; i2 < toqVar.f1958n.mo924q(); i2++) {
                this.f1958n.mo926y(toqVar.f1958n.f7l8(i2), toqVar.f1958n.kja0(i2), true);
            }
        }
    }

    toq qrj(C0307s c0307s, C0307s c0307s2, float f2) {
        this.f1958n.n7h(c0307s, -1.0f);
        this.f1958n.n7h(c0307s2, f2);
        return this;
    }

    /* JADX INFO: renamed from: s */
    boolean m1249s(C0296n c0296n) {
        boolean z2;
        C0307s c0307sM1248p = m1248p(c0296n);
        if (c0307sM1248p == null) {
            z2 = true;
        } else {
            mcp(c0307sM1248p);
            z2 = false;
        }
        if (this.f1958n.mo924q() == 0) {
            this.f1956g = true;
        }
        return z2;
    }

    public toq t8r(C0307s c0307s, int i2, C0307s c0307s2) {
        this.f47690toq = i2;
        this.f1958n.n7h(c0307s, -1.0f);
        return this;
    }

    public String toString() {
        return fti();
    }

    @Override // androidx.constraintlayout.core.C0296n.k
    public void toq(C0296n c0296n) {
        if (c0296n.f47574f7l8.length == 0) {
            return;
        }
        boolean z2 = false;
        while (!z2) {
            int iMo924q = this.f1958n.mo924q();
            for (int i2 = 0; i2 < iMo924q; i2++) {
                C0307s c0307sF7l8 = this.f1958n.f7l8(i2);
                if (c0307sF7l8.f1860g != -1 || c0307sF7l8.f1867p || c0307sF7l8.f1859f) {
                    this.f1959q.add(c0307sF7l8);
                }
            }
            int size = this.f1959q.size();
            if (size > 0) {
                for (int i3 = 0; i3 < size; i3++) {
                    C0307s c0307s = this.f1959q.get(i3);
                    if (c0307s.f1867p) {
                        mo1127k(c0296n, c0307s, true);
                    } else if (c0307s.f1859f) {
                        jp0y(c0296n, c0307s, true);
                    } else {
                        zy(c0296n, c0296n.f47574f7l8[c0307s.f1860g], true);
                    }
                }
                this.f1959q.clear();
            } else {
                z2 = true;
            }
        }
        if (C0296n.f47564fu4 && this.f1957k != null && this.f1958n.mo924q() == 0) {
            this.f1956g = true;
            c0296n.f1809k = true;
        }
    }

    public C0307s wvg(C0307s c0307s) {
        return m1245t(null, c0307s);
    }

    toq x2(C0307s c0307s, int i2) {
        this.f1957k = c0307s;
        float f2 = i2;
        c0307s.f1870s = f2;
        this.f47690toq = f2;
        this.f1956g = true;
        return this;
    }

    /* JADX INFO: renamed from: y */
    toq m1250y(C0307s c0307s, int i2) {
        this.f1958n.n7h(c0307s, i2);
        return this;
    }

    /* JADX INFO: renamed from: z */
    boolean m1251z(C0307s c0307s) {
        return this.f1958n.mo918g(c0307s);
    }

    public toq zurt(C0307s c0307s, C0307s c0307s2, C0307s c0307s3, C0307s c0307s4, float f2) {
        this.f1958n.n7h(c0307s3, 0.5f);
        this.f1958n.n7h(c0307s4, 0.5f);
        this.f1958n.n7h(c0307s, -0.5f);
        this.f1958n.n7h(c0307s2, -0.5f);
        this.f47690toq = -f2;
        return this;
    }

    @Override // androidx.constraintlayout.core.C0296n.k
    public void zy(C0296n c0296n, toq toqVar, boolean z2) {
        this.f47690toq += toqVar.f47690toq * this.f1958n.qrj(toqVar, z2);
        if (z2) {
            toqVar.f1957k.m1153p(this);
        }
        if (C0296n.f47564fu4 && this.f1957k != null && this.f1958n.mo924q() == 0) {
            this.f1956g = true;
            c0296n.f1809k = true;
        }
    }

    public toq(zy zyVar) {
        this.f1958n = new C0264k(this, zyVar);
    }
}
