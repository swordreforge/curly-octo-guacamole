package com.bumptech.glide.load.resource.transcode;

import java.util.ArrayList;
import java.util.List;
import zy.lvui;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.transcode.g */
/* JADX INFO: compiled from: TranscoderRegistry.java */
/* JADX INFO: loaded from: classes2.dex */
public class C3134g {

    /* JADX INFO: renamed from: k */
    private final List<k<?, ?>> f18832k = new ArrayList();

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.transcode.g$k */
    /* JADX INFO: compiled from: TranscoderRegistry.java */
    private static final class k<Z, R> {

        /* JADX INFO: renamed from: k */
        final Class<Z> f18833k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final Class<R> f62970toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        final InterfaceC3136n<Z, R> f62971zy;

        k(@lvui Class<Z> cls, @lvui Class<R> cls2, @lvui InterfaceC3136n<Z, R> interfaceC3136n) {
            this.f18833k = cls;
            this.f62970toq = cls2;
            this.f62971zy = interfaceC3136n;
        }

        /* JADX INFO: renamed from: k */
        public boolean m11066k(@lvui Class<?> cls, @lvui Class<?> cls2) {
            return this.f18833k.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f62970toq);
        }
    }

    @lvui
    /* JADX INFO: renamed from: k */
    public synchronized <Z, R> InterfaceC3136n<Z, R> m11065k(@lvui Class<Z> cls, @lvui Class<R> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return f7l8.toq();
        }
        for (k<?, ?> kVar : this.f18832k) {
            if (kVar.m11066k(cls, cls2)) {
                return (InterfaceC3136n<Z, R>) kVar.f62971zy;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
    }

    @lvui
    public synchronized <Z, R> List<Class<R>> toq(@lvui Class<Z> cls, @lvui Class<R> cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (k<?, ?> kVar : this.f18832k) {
            if (kVar.m11066k(cls, cls2) && !arrayList.contains(kVar.f62970toq)) {
                arrayList.add(kVar.f62970toq);
            }
        }
        return arrayList;
    }

    public synchronized <Z, R> void zy(@lvui Class<Z> cls, @lvui Class<R> cls2, @lvui InterfaceC3136n<Z, R> interfaceC3136n) {
        this.f18832k.add(new k<>(cls, cls2, interfaceC3136n));
    }
}
