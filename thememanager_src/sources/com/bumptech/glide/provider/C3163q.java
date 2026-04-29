package com.bumptech.glide.provider;

import androidx.collection.C0247k;
import com.bumptech.glide.util.x2;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import zy.dd;
import zy.lvui;

/* JADX INFO: renamed from: com.bumptech.glide.provider.q */
/* JADX INFO: compiled from: ModelToResourceClassCache.java */
/* JADX INFO: loaded from: classes2.dex */
public class C3163q {

    /* JADX INFO: renamed from: k */
    private final AtomicReference<x2> f18926k = new AtomicReference<>();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final C0247k<x2, List<Class<?>>> f63004toq = new C0247k<>();

    /* JADX INFO: renamed from: k */
    public void m11132k() {
        synchronized (this.f63004toq) {
            this.f63004toq.clear();
        }
    }

    @dd
    public List<Class<?>> toq(@lvui Class<?> cls, @lvui Class<?> cls2, @lvui Class<?> cls3) {
        List<Class<?>> list;
        x2 andSet = this.f18926k.getAndSet(null);
        if (andSet == null) {
            andSet = new x2(cls, cls2, cls3);
        } else {
            andSet.toq(cls, cls2, cls3);
        }
        synchronized (this.f63004toq) {
            list = this.f63004toq.get(andSet);
        }
        this.f18926k.set(andSet);
        return list;
    }

    public void zy(@lvui Class<?> cls, @lvui Class<?> cls2, @lvui Class<?> cls3, @lvui List<Class<?>> list) {
        synchronized (this.f63004toq) {
            this.f63004toq.put(new x2(cls, cls2, cls3), list);
        }
    }
}
