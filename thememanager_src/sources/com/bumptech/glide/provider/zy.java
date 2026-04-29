package com.bumptech.glide.provider;

import androidx.collection.C0247k;
import com.bumptech.glide.load.engine.C3032i;
import com.bumptech.glide.load.engine.C3043s;
import com.bumptech.glide.load.resource.transcode.f7l8;
import com.bumptech.glide.util.x2;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import zy.dd;

/* JADX INFO: compiled from: LoadPathCache.java */
/* JADX INFO: loaded from: classes2.dex */
public class zy {

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final C3032i<?, ?, ?> f63005zy = new C3032i<>(Object.class, Object.class, Object.class, Collections.singletonList(new C3043s(Object.class, Object.class, Object.class, Collections.emptyList(), new f7l8(), null)), null);

    /* JADX INFO: renamed from: k */
    private final C0247k<x2, C3032i<?, ?, ?>> f18928k = new C0247k<>();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final AtomicReference<x2> f63006toq = new AtomicReference<>();

    private x2 toq(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        x2 andSet = this.f63006toq.getAndSet(null);
        if (andSet == null) {
            andSet = new x2();
        }
        andSet.toq(cls, cls2, cls3);
        return andSet;
    }

    @dd
    /* JADX INFO: renamed from: k */
    public <Data, TResource, Transcode> C3032i<Data, TResource, Transcode> m11134k(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        C3032i<Data, TResource, Transcode> c3032i;
        x2 qVar = toq(cls, cls2, cls3);
        synchronized (this.f18928k) {
            c3032i = (C3032i) this.f18928k.get(qVar);
        }
        this.f63006toq.set(qVar);
        return c3032i;
    }

    /* JADX INFO: renamed from: q */
    public void m11135q(Class<?> cls, Class<?> cls2, Class<?> cls3, @dd C3032i<?, ?, ?> c3032i) {
        synchronized (this.f18928k) {
            C0247k<x2, C3032i<?, ?, ?>> c0247k = this.f18928k;
            x2 x2Var = new x2(cls, cls2, cls3);
            if (c3032i == null) {
                c3032i = f63005zy;
            }
            c0247k.put(x2Var, c3032i);
        }
    }

    public boolean zy(@dd C3032i<?, ?, ?> c3032i) {
        return f63005zy.equals(c3032i);
    }
}
