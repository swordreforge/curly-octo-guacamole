package com.bumptech.glide.load.engine;

import com.bumptech.glide.C3157n;
import com.bumptech.glide.EnumC3159p;
import com.bumptech.glide.load.C3087p;
import com.bumptech.glide.load.InterfaceC3088q;
import com.bumptech.glide.load.data.InterfaceC2998n;
import com.bumptech.glide.load.engine.RunnableC3047y;
import com.bumptech.glide.load.engine.cache.InterfaceC3016k;
import com.bumptech.glide.load.model.kja0;
import com.bumptech.glide.x2;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: DecodeHelper.java */
/* JADX INFO: loaded from: classes2.dex */
final class f7l8<Transcode> {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private boolean f62761cdj;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private Class<?> f62762f7l8;

    /* JADX INFO: renamed from: g */
    private int f18357g;

    /* JADX INFO: renamed from: h */
    private AbstractC3039p f18358h;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private boolean f62763ki;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private EnumC3159p f62764kja0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private Class<Transcode> f62765ld6;

    /* JADX INFO: renamed from: n */
    private int f18360n;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private com.bumptech.glide.load.f7l8 f62766n7h;

    /* JADX INFO: renamed from: p */
    private Map<Class<?>, com.bumptech.glide.load.n7h<?>> f18361p;

    /* JADX INFO: renamed from: q */
    private Object f18362q;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private boolean f62767qrj;

    /* JADX INFO: renamed from: s */
    private C3087p f18363s;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private boolean f62769x2;

    /* JADX INFO: renamed from: y */
    private RunnableC3047y.n f18364y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private C3157n f62770zy;

    /* JADX INFO: renamed from: k */
    private final List<kja0.C3063k<?>> f18359k = new ArrayList();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final List<com.bumptech.glide.load.f7l8> f62768toq = new ArrayList();

    f7l8() {
    }

    <X> InterfaceC3088q<X> cdj(X x3) throws x2.C3211n {
        return this.f62770zy.m11121s().qrj(x3);
    }

    List<kja0.C3063k<?>> f7l8() {
        if (!this.f62769x2) {
            this.f62769x2 = true;
            this.f18359k.clear();
            List listM11276s = this.f62770zy.m11121s().m11276s(this.f18362q);
            int size = listM11276s.size();
            for (int i2 = 0; i2 < size; i2++) {
                kja0.C3063k<?> qVar = ((com.bumptech.glide.load.model.kja0) listM11276s.get(i2)).toq(this.f18362q, this.f18360n, this.f18357g, this.f18363s);
                if (qVar != null) {
                    this.f18359k.add(qVar);
                }
            }
        }
        return this.f18359k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    boolean fn3e(Class<?> cls) {
        return m10761y(cls) != null;
    }

    boolean fu4() {
        return this.f62763ki;
    }

    /* JADX INFO: renamed from: g */
    int m10753g() {
        return this.f18357g;
    }

    /* JADX INFO: renamed from: h */
    com.bumptech.glide.load.f7l8 m10754h() {
        return this.f62766n7h;
    }

    /* JADX INFO: renamed from: i */
    int m10755i() {
        return this.f18360n;
    }

    /* JADX INFO: renamed from: k */
    void m10756k() {
        this.f62770zy = null;
        this.f18362q = null;
        this.f62766n7h = null;
        this.f62762f7l8 = null;
        this.f62765ld6 = null;
        this.f18363s = null;
        this.f62764kja0 = null;
        this.f18361p = null;
        this.f18358h = null;
        this.f18359k.clear();
        this.f62769x2 = false;
        this.f62768toq.clear();
        this.f62767qrj = false;
    }

    Class<?> ki() {
        return this.f62765ld6;
    }

    <T> InterfaceC2998n<T> kja0(T t2) {
        return this.f62770zy.m11121s().x2(t2);
    }

    C3087p ld6() {
        return this.f18363s;
    }

    /* JADX INFO: renamed from: n */
    AbstractC3039p m10757n() {
        return this.f18358h;
    }

    <Z> com.bumptech.glide.load.qrj<Z> n7h(zurt<Z> zurtVar) {
        return this.f62770zy.m11121s().ld6(zurtVar);
    }

    boolean ni7(zurt<?> zurtVar) {
        return this.f62770zy.m11121s().n7h(zurtVar);
    }

    /* JADX INFO: renamed from: p */
    List<com.bumptech.glide.load.model.kja0<File, ?>> m10758p(File file) throws x2.zy {
        return this.f62770zy.m11121s().m11276s(file);
    }

    /* JADX INFO: renamed from: q */
    InterfaceC3016k m10759q() {
        return this.f18364y.mo10791k();
    }

    List<Class<?>> qrj() {
        return this.f62770zy.m11121s().m11274p(this.f18362q.getClass(), this.f62762f7l8, this.f62765ld6);
    }

    /* JADX INFO: renamed from: s */
    Class<?> m10760s() {
        return this.f18362q.getClass();
    }

    <Z> com.bumptech.glide.load.n7h<Z> t8r(Class<Z> cls) {
        com.bumptech.glide.load.n7h<Z> n7hVar = (com.bumptech.glide.load.n7h) this.f18361p.get(cls);
        if (n7hVar == null) {
            Iterator<Map.Entry<Class<?>, com.bumptech.glide.load.n7h<?>>> it = this.f18361p.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<Class<?>, com.bumptech.glide.load.n7h<?>> next = it.next();
                if (next.getKey().isAssignableFrom(cls)) {
                    n7hVar = (com.bumptech.glide.load.n7h) next.getValue();
                    break;
                }
            }
        }
        if (n7hVar != null) {
            return n7hVar;
        }
        if (!this.f18361p.isEmpty() || !this.f62761cdj) {
            return com.bumptech.glide.load.resource.zy.zy();
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }

    com.bumptech.glide.load.engine.bitmap_recycle.toq toq() {
        return this.f62770zy.toq();
    }

    EnumC3159p x2() {
        return this.f62764kja0;
    }

    /* JADX INFO: renamed from: y */
    <Data> C3032i<Data, ?, Transcode> m10761y(Class<Data> cls) {
        return this.f62770zy.m11121s().m11277y(cls, this.f62762f7l8, this.f62765ld6);
    }

    /* JADX INFO: renamed from: z */
    boolean m10762z(com.bumptech.glide.load.f7l8 f7l8Var) {
        List<kja0.C3063k<?>> listF7l8 = f7l8();
        int size = listF7l8.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (listF7l8.get(i2).f18594k.equals(f7l8Var)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    <R> void zurt(C3157n c3157n, Object obj, com.bumptech.glide.load.f7l8 f7l8Var, int i2, int i3, AbstractC3039p abstractC3039p, Class<?> cls, Class<R> cls2, EnumC3159p enumC3159p, C3087p c3087p, Map<Class<?>, com.bumptech.glide.load.n7h<?>> map, boolean z2, boolean z3, RunnableC3047y.n nVar) {
        this.f62770zy = c3157n;
        this.f18362q = obj;
        this.f62766n7h = f7l8Var;
        this.f18360n = i2;
        this.f18357g = i3;
        this.f18358h = abstractC3039p;
        this.f62762f7l8 = cls;
        this.f18364y = nVar;
        this.f62765ld6 = cls2;
        this.f62764kja0 = enumC3159p;
        this.f18363s = c3087p;
        this.f18361p = map;
        this.f62761cdj = z2;
        this.f62763ki = z3;
    }

    List<com.bumptech.glide.load.f7l8> zy() {
        if (!this.f62767qrj) {
            this.f62767qrj = true;
            this.f62768toq.clear();
            List<kja0.C3063k<?>> listF7l8 = f7l8();
            int size = listF7l8.size();
            for (int i2 = 0; i2 < size; i2++) {
                kja0.C3063k<?> c3063k = listF7l8.get(i2);
                if (!this.f62768toq.contains(c3063k.f18594k)) {
                    this.f62768toq.add(c3063k.f18594k);
                }
                for (int i3 = 0; i3 < c3063k.f62839toq.size(); i3++) {
                    if (!this.f62768toq.contains(c3063k.f62839toq.get(i3))) {
                        this.f62768toq.add(c3063k.f62839toq.get(i3));
                    }
                }
            }
        }
        return this.f62768toq;
    }
}
