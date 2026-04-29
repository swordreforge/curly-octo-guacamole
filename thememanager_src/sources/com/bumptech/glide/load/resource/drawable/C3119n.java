package com.bumptech.glide.load.resource.drawable;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.AbstractC2977h;
import com.bumptech.glide.request.transition.zy;
import zy.lvui;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.drawable.n */
/* JADX INFO: compiled from: DrawableTransitionOptions.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C3119n extends AbstractC2977h<C3119n, Drawable> {
    @lvui
    public static C3119n fn3e(int i2) {
        return new C3119n().kja0(i2);
    }

    @lvui
    /* JADX INFO: renamed from: i */
    public static C3119n m11023i() {
        return new C3119n().n7h();
    }

    @lvui
    public static C3119n ni7(@lvui com.bumptech.glide.request.transition.zy zyVar) {
        return new C3119n().ki(zyVar);
    }

    @lvui
    public static C3119n t8r(@lvui com.bumptech.glide.request.transition.f7l8<Drawable> f7l8Var) {
        return new C3119n().m10613s(f7l8Var);
    }

    @lvui
    public static C3119n zurt(@lvui zy.C3193k c3193k) {
        return new C3119n().cdj(c3193k);
    }

    @lvui
    public C3119n cdj(@lvui zy.C3193k c3193k) {
        return ki(c3193k.m11214k());
    }

    @Override // com.bumptech.glide.AbstractC2977h
    public boolean equals(Object obj) {
        return (obj instanceof C3119n) && super.equals(obj);
    }

    @Override // com.bumptech.glide.AbstractC2977h
    public int hashCode() {
        return super.hashCode();
    }

    @lvui
    public C3119n ki(@lvui com.bumptech.glide.request.transition.zy zyVar) {
        return m10613s(zyVar);
    }

    @lvui
    public C3119n kja0(int i2) {
        return cdj(new zy.C3193k(i2));
    }

    @lvui
    public C3119n n7h() {
        return cdj(new zy.C3193k());
    }
}
