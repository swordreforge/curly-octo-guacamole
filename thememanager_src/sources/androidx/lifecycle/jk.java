package androidx.lifecycle;

import java.util.Iterator;
import java.util.Map;
import zy.InterfaceC7842s;

/* JADX INFO: compiled from: MediatorLiveData.java */
/* JADX INFO: loaded from: classes.dex */
public class jk<T> extends fti<T> {

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private androidx.arch.core.internal.toq<LiveData<?>, C0932k<?>> f51583qrj = new androidx.arch.core.internal.toq<>();

    /* JADX INFO: renamed from: androidx.lifecycle.jk$k */
    /* JADX INFO: compiled from: MediatorLiveData.java */
    private static class C0932k<V> implements jp0y<V> {

        /* JADX INFO: renamed from: k */
        final LiveData<V> f5090k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final jp0y<? super V> f51584toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        int f51585zy = -1;

        C0932k(LiveData<V> liveData, jp0y<? super V> jp0yVar) {
            this.f5090k = liveData;
            this.f51584toq = jp0yVar;
        }

        /* JADX INFO: renamed from: q */
        void m4446q() {
            this.f5090k.kja0(this);
        }

        @Override // androidx.lifecycle.jp0y
        public void toq(@zy.dd V v2) {
            if (this.f51585zy != this.f5090k.f7l8()) {
                this.f51585zy = this.f5090k.f7l8();
                this.f51584toq.toq(v2);
            }
        }

        void zy() {
            this.f5090k.ld6(this);
        }
    }

    @zy.oc
    public <S> void ki(@zy.lvui LiveData<S> liveData, @zy.lvui jp0y<? super S> jp0yVar) {
        C0932k<?> c0932k = new C0932k<>(liveData, jp0yVar);
        C0932k<?> c0932kF7l8 = this.f51583qrj.f7l8(liveData, c0932k);
        if (c0932kF7l8 != null && c0932kF7l8.f51584toq != jp0yVar) {
            throw new IllegalArgumentException("This source was already added with the different observer");
        }
        if (c0932kF7l8 == null && m4393y()) {
            c0932k.zy();
        }
    }

    @Override // androidx.lifecycle.LiveData
    @InterfaceC7842s
    protected void qrj() {
        Iterator<Map.Entry<LiveData<?>, C0932k<?>>> it = this.f51583qrj.iterator();
        while (it.hasNext()) {
            it.next().getValue().m4446q();
        }
    }

    @zy.oc
    public <S> void t8r(@zy.lvui LiveData<S> liveData) {
        C0932k<?> c0932kMo770y = this.f51583qrj.mo770y(liveData);
        if (c0932kMo770y != null) {
            c0932kMo770y.m4446q();
        }
    }

    @Override // androidx.lifecycle.LiveData
    @InterfaceC7842s
    protected void x2() {
        Iterator<Map.Entry<LiveData<?>, C0932k<?>>> it = this.f51583qrj.iterator();
        while (it.hasNext()) {
            it.next().getValue().zy();
        }
    }
}
