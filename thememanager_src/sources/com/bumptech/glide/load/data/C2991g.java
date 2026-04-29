package com.bumptech.glide.load.data;

import com.bumptech.glide.load.data.InterfaceC2998n;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import zy.lvui;

/* JADX INFO: renamed from: com.bumptech.glide.load.data.g */
/* JADX INFO: compiled from: DataRewinderRegistry.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2991g {

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final InterfaceC2998n.k<?> f62695toq = new k();

    /* JADX INFO: renamed from: k */
    private final Map<Class<?>, InterfaceC2998n.k<?>> f18212k = new HashMap();

    /* JADX INFO: renamed from: com.bumptech.glide.load.data.g$k */
    /* JADX INFO: compiled from: DataRewinderRegistry.java */
    class k implements InterfaceC2998n.k<Object> {
        k() {
        }

        @Override // com.bumptech.glide.load.data.InterfaceC2998n.k
        @lvui
        /* JADX INFO: renamed from: k */
        public Class<Object> mo10632k() {
            throw new UnsupportedOperationException("Not implemented");
        }

        @Override // com.bumptech.glide.load.data.InterfaceC2998n.k
        @lvui
        public InterfaceC2998n<Object> toq(@lvui Object obj) {
            return new toq(obj);
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.data.g$toq */
    /* JADX INFO: compiled from: DataRewinderRegistry.java */
    private static final class toq implements InterfaceC2998n<Object> {

        /* JADX INFO: renamed from: k */
        private final Object f18213k;

        toq(@lvui Object obj) {
            this.f18213k = obj;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC2998n
        @lvui
        /* JADX INFO: renamed from: k */
        public Object mo10630k() {
            return this.f18213k;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC2998n
        public void toq() {
        }
    }

    @lvui
    /* JADX INFO: renamed from: k */
    public synchronized <T> InterfaceC2998n<T> m10633k(@lvui T t2) {
        InterfaceC2998n.k<?> kVar;
        com.bumptech.glide.util.qrj.m11262q(t2);
        kVar = this.f18212k.get(t2.getClass());
        if (kVar == null) {
            Iterator<InterfaceC2998n.k<?>> it = this.f18212k.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                InterfaceC2998n.k<?> next = it.next();
                if (next.mo10632k().isAssignableFrom(t2.getClass())) {
                    kVar = next;
                    break;
                }
            }
        }
        if (kVar == null) {
            kVar = f62695toq;
        }
        return (InterfaceC2998n<T>) kVar.toq(t2);
    }

    public synchronized void toq(@lvui InterfaceC2998n.k<?> kVar) {
        this.f18212k.put(kVar.mo10632k(), kVar);
    }
}
