package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.C0340k;
import androidx.constraintlayout.core.widgets.C0341n;
import androidx.constraintlayout.core.widgets.analyzer.C0326g;
import java.util.Iterator;

/* JADX INFO: compiled from: HelperReferences.java */
/* JADX INFO: loaded from: classes.dex */
class ld6 extends AbstractC0327h {
    public ld6(C0341n c0341n) {
        super(c0341n);
    }

    private void fn3e(C0326g c0326g) {
        this.f1974y.f47694ld6.add(c0326g);
        c0326g.f47696x2.add(this.f1974y);
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC0327h
    /* JADX INFO: renamed from: g */
    void mo1255g() {
        this.f47700zy = null;
        this.f1974y.zy();
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC0327h
    /* JADX INFO: renamed from: h */
    boolean mo1256h() {
        return false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC0327h, androidx.constraintlayout.core.widgets.analyzer.InterfaceC0333q
    /* JADX INFO: renamed from: k */
    public void mo1253k(InterfaceC0333q interfaceC0333q) {
        C0340k c0340k = (C0340k) this.f47699toq;
        int iRp = c0340k.rp();
        Iterator<C0326g> it = this.f1974y.f47696x2.iterator();
        int i2 = 0;
        int i3 = -1;
        while (it.hasNext()) {
            int i4 = it.next().f47693f7l8;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (iRp == 0 || iRp == 2) {
            this.f1974y.mo1252n(i3 + c0340k.l05());
        } else {
            this.f1974y.mo1252n(i2 + c0340k.l05());
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC0327h
    /* JADX INFO: renamed from: n */
    public void mo1258n() {
        C0341n c0341n = this.f47699toq;
        if (c0341n instanceof C0340k) {
            int iRp = ((C0340k) c0341n).rp();
            if (iRp == 0 || iRp == 1) {
                this.f47699toq.v5yj(this.f1974y.f47693f7l8);
            } else {
                this.f47699toq.ra(this.f1974y.f47693f7l8);
            }
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC0327h
    void n7h() {
        this.f1974y.f1963p = false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC0327h
    /* JADX INFO: renamed from: q */
    void mo1260q() {
        C0341n c0341n = this.f47699toq;
        if (c0341n instanceof C0340k) {
            this.f1974y.f47695toq = true;
            C0340k c0340k = (C0340k) c0341n;
            int iRp = c0340k.rp();
            boolean zYw = c0340k.yw();
            int i2 = 0;
            if (iRp == 0) {
                this.f1974y.f1962n = C0326g.k.LEFT;
                while (i2 < c0340k.f47951zwy) {
                    C0341n c0341n2 = c0340k.f47950nsb[i2];
                    if (zYw || c0341n2.a98o() != 8) {
                        C0326g c0326g = c0341n2.f2053n.f1974y;
                        c0326g.f47694ld6.add(this.f1974y);
                        this.f1974y.f47696x2.add(c0326g);
                    }
                    i2++;
                }
                fn3e(this.f47699toq.f2053n.f1974y);
                fn3e(this.f47699toq.f2053n.f1973s);
                return;
            }
            if (iRp == 1) {
                this.f1974y.f1962n = C0326g.k.RIGHT;
                while (i2 < c0340k.f47951zwy) {
                    C0341n c0341n3 = c0340k.f47950nsb[i2];
                    if (zYw || c0341n3.a98o() != 8) {
                        C0326g c0326g2 = c0341n3.f2053n.f1973s;
                        c0326g2.f47694ld6.add(this.f1974y);
                        this.f1974y.f47696x2.add(c0326g2);
                    }
                    i2++;
                }
                fn3e(this.f47699toq.f2053n.f1974y);
                fn3e(this.f47699toq.f2053n.f1973s);
                return;
            }
            if (iRp == 2) {
                this.f1974y.f1962n = C0326g.k.TOP;
                while (i2 < c0340k.f47951zwy) {
                    C0341n c0341n4 = c0340k.f47950nsb[i2];
                    if (zYw || c0341n4.a98o() != 8) {
                        C0326g c0326g3 = c0341n4.f2046g.f1974y;
                        c0326g3.f47694ld6.add(this.f1974y);
                        this.f1974y.f47696x2.add(c0326g3);
                    }
                    i2++;
                }
                fn3e(this.f47699toq.f2046g.f1974y);
                fn3e(this.f47699toq.f2046g.f1973s);
                return;
            }
            if (iRp != 3) {
                return;
            }
            this.f1974y.f1962n = C0326g.k.BOTTOM;
            while (i2 < c0340k.f47951zwy) {
                C0341n c0341n5 = c0340k.f47950nsb[i2];
                if (zYw || c0341n5.a98o() != 8) {
                    C0326g c0326g4 = c0341n5.f2046g.f1973s;
                    c0326g4.f47694ld6.add(this.f1974y);
                    this.f1974y.f47696x2.add(c0326g4);
                }
                i2++;
            }
            fn3e(this.f47699toq.f2046g.f1974y);
            fn3e(this.f47699toq.f2046g.f1973s);
        }
    }
}
