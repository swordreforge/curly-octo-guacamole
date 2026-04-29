package androidx.lifecycle;

import androidx.lifecycle.kja0;
import androidx.lifecycle.zy;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
class ReflectiveGenericLifecycleObserver implements fn3e {

    /* JADX INFO: renamed from: k */
    private final Object f5026k;

    /* JADX INFO: renamed from: q */
    private final zy.C0955k f5027q;

    ReflectiveGenericLifecycleObserver(Object obj) {
        this.f5026k = obj;
        this.f5027q = zy.f51604zy.zy(obj.getClass());
    }

    @Override // androidx.lifecycle.fn3e
    public void gvn7(@zy.lvui InterfaceC0954z interfaceC0954z, @zy.lvui kja0.toq toqVar) {
        this.f5027q.m4497k(interfaceC0954z, toqVar, this.f5026k);
    }
}
