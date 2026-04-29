package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.analyzer.C0326g;

/* JADX INFO: compiled from: DimensionDependency.java */
/* JADX INFO: loaded from: classes.dex */
class f7l8 extends C0326g {

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    public int f47692qrj;

    public f7l8(AbstractC0327h abstractC0327h) {
        super(abstractC0327h);
        if (abstractC0327h instanceof x2) {
            this.f1962n = C0326g.k.HORIZONTAL_DIMENSION;
        } else {
            this.f1962n = C0326g.k.VERTICAL_DIMENSION;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.C0326g
    /* JADX INFO: renamed from: n */
    public void mo1252n(int i2) {
        if (this.f1963p) {
            return;
        }
        this.f1963p = true;
        this.f47693f7l8 = i2;
        for (InterfaceC0333q interfaceC0333q : this.f47694ld6) {
            interfaceC0333q.mo1253k(interfaceC0333q);
        }
    }
}
