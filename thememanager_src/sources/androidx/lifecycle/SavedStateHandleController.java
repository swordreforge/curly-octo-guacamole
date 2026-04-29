package androidx.lifecycle;

import androidx.lifecycle.kja0;

/* JADX INFO: loaded from: classes.dex */
final class SavedStateHandleController implements fn3e {

    /* JADX INFO: renamed from: k */
    private final String f5036k;

    /* JADX INFO: renamed from: n */
    private final dd f5037n;

    /* JADX INFO: renamed from: q */
    private boolean f5038q = false;

    SavedStateHandleController(String str, dd ddVar) {
        this.f5036k = str;
        this.f5037n = ddVar;
    }

    @Override // androidx.lifecycle.fn3e
    public void gvn7(@zy.lvui InterfaceC0954z interfaceC0954z, @zy.lvui kja0.toq toqVar) {
        if (toqVar == kja0.toq.ON_DESTROY) {
            this.f5038q = false;
            interfaceC0954z.getLifecycle().zy(this);
        }
    }

    /* JADX INFO: renamed from: k */
    void m4397k(androidx.savedstate.zy zyVar, kja0 kja0Var) {
        if (this.f5038q) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f5038q = true;
        kja0Var.mo4451k(this);
        zyVar.m5240p(this.f5036k, this.f5037n.kja0());
    }

    dd toq() {
        return this.f5037n;
    }

    boolean zy() {
        return this.f5038q;
    }
}
