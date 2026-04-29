package com.bumptech.glide.util.pool;

import android.util.Log;
import androidx.core.util.qrj;
import java.util.ArrayList;
import java.util.List;
import zy.lvui;

/* JADX INFO: renamed from: com.bumptech.glide.util.pool.k */
/* JADX INFO: compiled from: FactoryPools.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C3205k {

    /* JADX INFO: renamed from: k */
    private static final String f19090k = "FactoryPools";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final int f63080toq = 20;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final f7l8<Object> f63081zy = new k();

    /* JADX INFO: renamed from: com.bumptech.glide.util.pool.k$f7l8 */
    /* JADX INFO: compiled from: FactoryPools.java */
    public interface f7l8<T> {
        /* JADX INFO: renamed from: k */
        void mo11249k(@lvui T t2);
    }

    /* JADX INFO: renamed from: com.bumptech.glide.util.pool.k$g */
    /* JADX INFO: compiled from: FactoryPools.java */
    public interface g {
        @lvui
        /* JADX INFO: renamed from: q */
        com.bumptech.glide.util.pool.zy mo10724q();
    }

    /* JADX INFO: renamed from: com.bumptech.glide.util.pool.k$k */
    /* JADX INFO: compiled from: FactoryPools.java */
    class k implements f7l8<Object> {
        k() {
        }

        @Override // com.bumptech.glide.util.pool.C3205k.f7l8
        /* JADX INFO: renamed from: k */
        public void mo11249k(@lvui Object obj) {
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.util.pool.k$n */
    /* JADX INFO: compiled from: FactoryPools.java */
    private static final class n<T> implements qrj.InterfaceC0641k<T> {

        /* JADX INFO: renamed from: k */
        private final q<T> f19091k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final f7l8<T> f63082toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final qrj.InterfaceC0641k<T> f63083zy;

        n(@lvui qrj.InterfaceC0641k<T> interfaceC0641k, @lvui q<T> qVar, @lvui f7l8<T> f7l8Var) {
            this.f63083zy = interfaceC0641k;
            this.f19091k = qVar;
            this.f63082toq = f7l8Var;
        }

        @Override // androidx.core.util.qrj.InterfaceC0641k
        /* JADX INFO: renamed from: k */
        public T mo2983k() {
            T tMo2983k = this.f63083zy.mo2983k();
            if (tMo2983k == null) {
                tMo2983k = this.f19091k.mo10723k();
                if (Log.isLoggable(C3205k.f19090k, 2)) {
                    Log.v(C3205k.f19090k, "Created new " + tMo2983k.getClass());
                }
            }
            if (tMo2983k instanceof g) {
                ((g) tMo2983k).mo10724q().toq(false);
            }
            return tMo2983k;
        }

        @Override // androidx.core.util.qrj.InterfaceC0641k
        public boolean toq(@lvui T t2) {
            if (t2 instanceof g) {
                ((g) t2).mo10724q().toq(true);
            }
            this.f63082toq.mo11249k(t2);
            return this.f63083zy.toq(t2);
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.util.pool.k$q */
    /* JADX INFO: compiled from: FactoryPools.java */
    public interface q<T> {
        /* JADX INFO: renamed from: k */
        T mo10723k();
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.bumptech.glide.util.pool.k$toq */
    /* JADX INFO: compiled from: FactoryPools.java */
    class toq<T> implements q<List<T>> {
        toq() {
        }

        @Override // com.bumptech.glide.util.pool.C3205k.q
        @lvui
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public List<T> mo10723k() {
            return new ArrayList();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.bumptech.glide.util.pool.k$zy */
    /* JADX INFO: compiled from: FactoryPools.java */
    class zy<T> implements f7l8<List<T>> {
        zy() {
        }

        @Override // com.bumptech.glide.util.pool.C3205k.f7l8
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void mo11249k(@lvui List<T> list) {
            list.clear();
        }
    }

    private C3205k() {
    }

    @lvui
    public static <T> qrj.InterfaceC0641k<List<T>> f7l8(int i2) {
        return toq(new qrj.zy(i2), new toq(), new zy());
    }

    @lvui
    /* JADX INFO: renamed from: g */
    public static <T> qrj.InterfaceC0641k<List<T>> m11245g() {
        return f7l8(20);
    }

    @lvui
    /* JADX INFO: renamed from: k */
    private static <T extends g> qrj.InterfaceC0641k<T> m11246k(@lvui qrj.InterfaceC0641k<T> interfaceC0641k, @lvui q<T> qVar) {
        return toq(interfaceC0641k, qVar, zy());
    }

    @lvui
    /* JADX INFO: renamed from: n */
    public static <T extends g> qrj.InterfaceC0641k<T> m11247n(int i2, @lvui q<T> qVar) {
        return m11246k(new qrj.zy(i2), qVar);
    }

    @lvui
    /* JADX INFO: renamed from: q */
    public static <T extends g> qrj.InterfaceC0641k<T> m11248q(int i2, @lvui q<T> qVar) {
        return m11246k(new qrj.toq(i2), qVar);
    }

    @lvui
    private static <T> qrj.InterfaceC0641k<T> toq(@lvui qrj.InterfaceC0641k<T> interfaceC0641k, @lvui q<T> qVar, @lvui f7l8<T> f7l8Var) {
        return new n(interfaceC0641k, qVar, f7l8Var);
    }

    @lvui
    private static <T> f7l8<T> zy() {
        return (f7l8<T>) f63081zy;
    }
}
