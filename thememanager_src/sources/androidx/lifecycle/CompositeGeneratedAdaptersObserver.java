package androidx.lifecycle;

import androidx.lifecycle.kja0;

/* JADX INFO: loaded from: classes.dex */
class CompositeGeneratedAdaptersObserver implements fn3e {

    /* JADX INFO: renamed from: k */
    private final x2[] f4999k;

    CompositeGeneratedAdaptersObserver(x2[] x2VarArr) {
        this.f4999k = x2VarArr;
    }

    @Override // androidx.lifecycle.fn3e
    public void gvn7(@zy.lvui InterfaceC0954z interfaceC0954z, @zy.lvui kja0.toq toqVar) {
        a9 a9Var = new a9();
        for (x2 x2Var : this.f4999k) {
            x2Var.m4483k(interfaceC0954z, toqVar, false, a9Var);
        }
        for (x2 x2Var2 : this.f4999k) {
            x2Var2.m4483k(interfaceC0954z, toqVar, true, a9Var);
        }
    }
}
