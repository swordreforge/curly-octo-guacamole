package androidx.lifecycle;

import p032p.InterfaceC7598k;

/* JADX INFO: renamed from: androidx.lifecycle.f */
/* JADX INFO: compiled from: Transformations.java */
/* JADX INFO: loaded from: classes.dex */
public class C0927f {

    /* JADX INFO: Add missing generic type declarations: [X] */
    /* JADX INFO: renamed from: androidx.lifecycle.f$k */
    /* JADX INFO: compiled from: Transformations.java */
    static class k<X> implements jp0y<X> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ jk f5080k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ InterfaceC7598k f51579toq;

        k(jk jkVar, InterfaceC7598k interfaceC7598k) {
            this.f5080k = jkVar;
            this.f51579toq = interfaceC7598k;
        }

        @Override // androidx.lifecycle.jp0y
        public void toq(@zy.dd X x3) {
            this.f5080k.cdj(this.f51579toq.apply(x3));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [X] */
    /* JADX INFO: renamed from: androidx.lifecycle.f$toq */
    /* JADX INFO: compiled from: Transformations.java */
    static class toq<X> implements jp0y<X> {

        /* JADX INFO: renamed from: k */
        LiveData<Y> f5081k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ InterfaceC7598k f51580toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        final /* synthetic */ jk f51581zy;

        /* JADX INFO: Add missing generic type declarations: [Y] */
        /* JADX INFO: renamed from: androidx.lifecycle.f$toq$k */
        /* JADX INFO: compiled from: Transformations.java */
        class k<Y> implements jp0y<Y> {
            k() {
            }

            @Override // androidx.lifecycle.jp0y
            public void toq(@zy.dd Y y3) {
                toq.this.f51581zy.cdj(y3);
            }
        }

        toq(InterfaceC7598k interfaceC7598k, jk jkVar) {
            this.f51580toq = interfaceC7598k;
            this.f51581zy = jkVar;
        }

        @Override // androidx.lifecycle.jp0y
        public void toq(@zy.dd X x3) {
            LiveData<Y> liveData = (LiveData) this.f51580toq.apply(x3);
            Object obj = this.f5081k;
            if (obj == liveData) {
                return;
            }
            if (obj != null) {
                this.f51581zy.t8r(obj);
            }
            this.f5081k = liveData;
            if (liveData != 0) {
                this.f51581zy.ki(liveData, new k());
            }
        }
    }

    private C0927f() {
    }

    @zy.oc
    /* JADX INFO: renamed from: k */
    public static <X, Y> LiveData<Y> m4440k(@zy.lvui LiveData<X> liveData, @zy.lvui InterfaceC7598k<X, Y> interfaceC7598k) {
        jk jkVar = new jk();
        jkVar.ki(liveData, new k(jkVar, interfaceC7598k));
        return jkVar;
    }

    @zy.oc
    public static <X, Y> LiveData<Y> toq(@zy.lvui LiveData<X> liveData, @zy.lvui InterfaceC7598k<X, LiveData<Y>> interfaceC7598k) {
        jk jkVar = new jk();
        jkVar.ki(liveData, new toq(interfaceC7598k, jkVar));
        return jkVar;
    }
}
