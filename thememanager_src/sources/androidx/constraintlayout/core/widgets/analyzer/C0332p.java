package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.C0341n;
import androidx.constraintlayout.core.widgets.C0345y;

/* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.analyzer.p */
/* JADX INFO: compiled from: GuidelineReference.java */
/* JADX INFO: loaded from: classes.dex */
class C0332p extends AbstractC0327h {
    public C0332p(C0341n c0341n) {
        super(c0341n);
        c0341n.f2053n.mo1255g();
        c0341n.f2046g.mo1255g();
        this.f1968g = ((C0345y) c0341n).ec();
    }

    private void fn3e(C0326g c0326g) {
        this.f1974y.f47694ld6.add(c0326g);
        c0326g.f47696x2.add(this.f1974y);
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC0327h
    /* JADX INFO: renamed from: g */
    void mo1255g() {
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
        C0326g c0326g = this.f1974y;
        if (c0326g.f47697zy && !c0326g.f1963p) {
            this.f1974y.mo1252n((int) ((c0326g.f47696x2.get(0).f47693f7l8 * ((C0345y) this.f47699toq).l05()) + 0.5f));
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC0327h
    /* JADX INFO: renamed from: n */
    public void mo1258n() {
        if (((C0345y) this.f47699toq).ec() == 1) {
            this.f47699toq.v5yj(this.f1974y.f47693f7l8);
        } else {
            this.f47699toq.ra(this.f1974y.f47693f7l8);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC0327h
    void n7h() {
        this.f1974y.f1963p = false;
        this.f1973s.f1963p = false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC0327h
    /* JADX INFO: renamed from: q */
    void mo1260q() {
        C0345y c0345y = (C0345y) this.f47699toq;
        int iO5 = c0345y.o5();
        int iRp = c0345y.rp();
        c0345y.l05();
        if (c0345y.ec() == 1) {
            if (iO5 != -1) {
                this.f1974y.f47696x2.add(this.f47699toq.f2049j.f2053n.f1974y);
                this.f47699toq.f2049j.f2053n.f1974y.f47694ld6.add(this.f1974y);
                this.f1974y.f1960g = iO5;
            } else if (iRp != -1) {
                this.f1974y.f47696x2.add(this.f47699toq.f2049j.f2053n.f1973s);
                this.f47699toq.f2049j.f2053n.f1973s.f47694ld6.add(this.f1974y);
                this.f1974y.f1960g = -iRp;
            } else {
                C0326g c0326g = this.f1974y;
                c0326g.f47695toq = true;
                c0326g.f47696x2.add(this.f47699toq.f2049j.f2053n.f1973s);
                this.f47699toq.f2049j.f2053n.f1973s.f47694ld6.add(this.f1974y);
            }
            fn3e(this.f47699toq.f2053n.f1974y);
            fn3e(this.f47699toq.f2053n.f1973s);
            return;
        }
        if (iO5 != -1) {
            this.f1974y.f47696x2.add(this.f47699toq.f2049j.f2046g.f1974y);
            this.f47699toq.f2049j.f2046g.f1974y.f47694ld6.add(this.f1974y);
            this.f1974y.f1960g = iO5;
        } else if (iRp != -1) {
            this.f1974y.f47696x2.add(this.f47699toq.f2049j.f2046g.f1973s);
            this.f47699toq.f2049j.f2046g.f1973s.f47694ld6.add(this.f1974y);
            this.f1974y.f1960g = -iRp;
        } else {
            C0326g c0326g2 = this.f1974y;
            c0326g2.f47695toq = true;
            c0326g2.f47696x2.add(this.f47699toq.f2049j.f2046g.f1973s);
            this.f47699toq.f2049j.f2046g.f1973s.f47694ld6.add(this.f1974y);
        }
        fn3e(this.f47699toq.f2046g.f1974y);
        fn3e(this.f47699toq.f2046g.f1973s);
    }
}
