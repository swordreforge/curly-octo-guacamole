package com.bumptech.glide.provider;

import com.bumptech.glide.load.qrj;
import java.util.ArrayList;
import java.util.List;
import zy.dd;
import zy.lvui;

/* JADX INFO: renamed from: com.bumptech.glide.provider.g */
/* JADX INFO: compiled from: ResourceEncoderRegistry.java */
/* JADX INFO: loaded from: classes2.dex */
public class C3160g {

    /* JADX INFO: renamed from: k */
    private final List<k<?>> f18920k = new ArrayList();

    /* JADX INFO: renamed from: com.bumptech.glide.provider.g$k */
    /* JADX INFO: compiled from: ResourceEncoderRegistry.java */
    private static final class k<T> {

        /* JADX INFO: renamed from: k */
        private final Class<T> f18921k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final qrj<T> f62999toq;

        k(@lvui Class<T> cls, @lvui qrj<T> qrjVar) {
            this.f18921k = cls;
            this.f62999toq = qrjVar;
        }

        /* JADX INFO: renamed from: k */
        boolean m11124k(@lvui Class<?> cls) {
            return this.f18921k.isAssignableFrom(cls);
        }
    }

    /* JADX INFO: renamed from: k */
    public synchronized <Z> void m11123k(@lvui Class<Z> cls, @lvui qrj<Z> qrjVar) {
        this.f18920k.add(new k<>(cls, qrjVar));
    }

    @dd
    public synchronized <Z> qrj<Z> toq(@lvui Class<Z> cls) {
        int size = this.f18920k.size();
        for (int i2 = 0; i2 < size; i2++) {
            k<?> kVar = this.f18920k.get(i2);
            if (kVar.m11124k(cls)) {
                return (qrj<Z>) kVar.f62999toq;
            }
        }
        return null;
    }

    public synchronized <Z> void zy(@lvui Class<Z> cls, @lvui qrj<Z> qrjVar) {
        this.f18920k.add(0, new k<>(cls, qrjVar));
    }
}
