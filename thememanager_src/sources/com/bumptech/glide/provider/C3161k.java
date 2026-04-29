package com.bumptech.glide.provider;

import com.bumptech.glide.load.InterfaceC3088q;
import java.util.ArrayList;
import java.util.List;
import zy.dd;
import zy.lvui;

/* JADX INFO: renamed from: com.bumptech.glide.provider.k */
/* JADX INFO: compiled from: EncoderRegistry.java */
/* JADX INFO: loaded from: classes2.dex */
public class C3161k {

    /* JADX INFO: renamed from: k */
    private final List<k<?>> f18922k = new ArrayList();

    /* JADX INFO: renamed from: com.bumptech.glide.provider.k$k */
    /* JADX INFO: compiled from: EncoderRegistry.java */
    private static final class k<T> {

        /* JADX INFO: renamed from: k */
        private final Class<T> f18923k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final InterfaceC3088q<T> f63000toq;

        k(@lvui Class<T> cls, @lvui InterfaceC3088q<T> interfaceC3088q) {
            this.f18923k = cls;
            this.f63000toq = interfaceC3088q;
        }

        /* JADX INFO: renamed from: k */
        boolean m11126k(@lvui Class<?> cls) {
            return this.f18923k.isAssignableFrom(cls);
        }
    }

    /* JADX INFO: renamed from: k */
    public synchronized <T> void m11125k(@lvui Class<T> cls, @lvui InterfaceC3088q<T> interfaceC3088q) {
        this.f18922k.add(new k<>(cls, interfaceC3088q));
    }

    @dd
    public synchronized <T> InterfaceC3088q<T> toq(@lvui Class<T> cls) {
        for (k<?> kVar : this.f18922k) {
            if (kVar.m11126k(cls)) {
                return (InterfaceC3088q<T>) kVar.f63000toq;
            }
        }
        return null;
    }

    public synchronized <T> void zy(@lvui Class<T> cls, @lvui InterfaceC3088q<T> interfaceC3088q) {
        this.f18922k.add(0, new k<>(cls, interfaceC3088q));
    }
}
