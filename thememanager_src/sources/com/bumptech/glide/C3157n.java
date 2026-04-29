package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import android.widget.ImageView;
import com.bumptech.glide.request.C3173s;
import com.bumptech.glide.request.InterfaceC3194y;
import com.bumptech.glide.request.target.ki;
import com.bumptech.glide.util.C3209y;
import com.bumptech.glide.zy;
import java.util.List;
import java.util.Map;
import zy.dd;
import zy.lvui;
import zy.o1t;
import zy.yz;

/* JADX INFO: renamed from: com.bumptech.glide.n */
/* JADX INFO: compiled from: GlideContext.java */
/* JADX INFO: loaded from: classes2.dex */
public class C3157n extends ContextWrapper {

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    @yz
    static final AbstractC2977h<?, ?> f62994ld6 = new toq();

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.ld6 f62995f7l8;

    /* JADX INFO: renamed from: g */
    private final Map<Class<?>, AbstractC2977h<?, ?>> f18911g;

    /* JADX INFO: renamed from: k */
    private final com.bumptech.glide.load.engine.bitmap_recycle.toq f18912k;

    /* JADX INFO: renamed from: n */
    private final List<InterfaceC3194y<Object>> f18913n;

    /* JADX INFO: renamed from: p */
    @o1t("this")
    @dd
    private C3173s f18914p;

    /* JADX INFO: renamed from: q */
    private final zy.InterfaceC3214k f18915q;

    /* JADX INFO: renamed from: s */
    private final int f18916s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final C3209y.toq<x2> f62996toq;

    /* JADX INFO: renamed from: y */
    private final C2972g f18917y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final com.bumptech.glide.request.target.ld6 f62997zy;

    public C3157n(@lvui Context context, @lvui com.bumptech.glide.load.engine.bitmap_recycle.toq toqVar, @lvui C3209y.toq<x2> toqVar2, @lvui com.bumptech.glide.request.target.ld6 ld6Var, @lvui zy.InterfaceC3214k interfaceC3214k, @lvui Map<Class<?>, AbstractC2977h<?, ?>> map, @lvui List<InterfaceC3194y<Object>> list, @lvui com.bumptech.glide.load.engine.ld6 ld6Var2, @lvui C2972g c2972g, int i2) {
        super(context.getApplicationContext());
        this.f18912k = toqVar;
        this.f62997zy = ld6Var;
        this.f18915q = interfaceC3214k;
        this.f18913n = list;
        this.f18911g = map;
        this.f62995f7l8 = ld6Var2;
        this.f18917y = c2972g;
        this.f18916s = i2;
        this.f62996toq = C3209y.m11265k(toqVar2);
    }

    public C2972g f7l8() {
        return this.f18917y;
    }

    @lvui
    /* JADX INFO: renamed from: g */
    public com.bumptech.glide.load.engine.ld6 m11117g() {
        return this.f62995f7l8;
    }

    @lvui
    /* JADX INFO: renamed from: k */
    public <X> ki<ImageView, X> m11118k(@lvui ImageView imageView, @lvui Class<X> cls) {
        return this.f62997zy.m11202k(imageView, cls);
    }

    @lvui
    /* JADX INFO: renamed from: n */
    public <T> AbstractC2977h<?, T> m11119n(@lvui Class<T> cls) {
        AbstractC2977h<?, T> abstractC2977h = (AbstractC2977h) this.f18911g.get(cls);
        if (abstractC2977h == null) {
            for (Map.Entry<Class<?>, AbstractC2977h<?, ?>> entry : this.f18911g.entrySet()) {
                if (entry.getKey().isAssignableFrom(cls)) {
                    abstractC2977h = (AbstractC2977h) entry.getValue();
                }
            }
        }
        return abstractC2977h == null ? (AbstractC2977h<?, T>) f62994ld6 : abstractC2977h;
    }

    /* JADX INFO: renamed from: q */
    public synchronized C3173s m11120q() {
        if (this.f18914p == null) {
            this.f18914p = this.f18915q.build().lv5();
        }
        return this.f18914p;
    }

    @lvui
    /* JADX INFO: renamed from: s */
    public x2 m11121s() {
        return this.f62996toq.get();
    }

    @lvui
    public com.bumptech.glide.load.engine.bitmap_recycle.toq toq() {
        return this.f18912k;
    }

    /* JADX INFO: renamed from: y */
    public int m11122y() {
        return this.f18916s;
    }

    public List<InterfaceC3194y<Object>> zy() {
        return this.f18913n;
    }
}
