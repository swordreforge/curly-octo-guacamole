package ikck;

import androidx.lifecycle.InterfaceC0954z;
import ikck.toq;
import ikck.toq.zy;
import zy.dd;
import zy.lvui;

/* JADX INFO: renamed from: ikck.k */
/* JADX INFO: compiled from: AbstractPresenter.java */
/* JADX INFO: loaded from: classes2.dex */
public class C6096k<T extends toq.zy> implements toq.InterfaceC8049toq {

    /* JADX INFO: renamed from: k */
    private T f35784k;

    /* JADX INFO: renamed from: q */
    private InterfaceC0954z f35785q;

    public C6096k(@lvui T view) {
        this.f35784k = view;
    }

    @Override // ikck.toq.InterfaceC8049toq
    public void jp0y(@dd InterfaceC0954z lifecycleOwner) {
        this.f35785q = lifecycleOwner;
    }

    @dd
    /* JADX INFO: renamed from: k */
    public InterfaceC0954z m22378k() {
        return this.f35785q;
    }

    public T toq() {
        return this.f35784k;
    }
}
