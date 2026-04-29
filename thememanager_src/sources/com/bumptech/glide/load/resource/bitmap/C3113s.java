package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.AbstractC2977h;
import com.bumptech.glide.request.transition.zy;
import zy.lvui;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.s */
/* JADX INFO: compiled from: BitmapTransitionOptions.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C3113s extends AbstractC2977h<C3113s, Bitmap> {
    @lvui
    public static C3113s fn3e() {
        return new C3113s().n7h();
    }

    @lvui
    public static C3113s fu4(@lvui com.bumptech.glide.request.transition.zy zyVar) {
        return new C3113s().ki(zyVar);
    }

    @lvui
    /* JADX INFO: renamed from: i */
    public static C3113s m11002i(@lvui com.bumptech.glide.request.transition.f7l8<Bitmap> f7l8Var) {
        return new C3113s().m10613s(f7l8Var);
    }

    @lvui
    public static C3113s ni7(@lvui zy.C3193k c3193k) {
        return new C3113s().cdj(c3193k);
    }

    @lvui
    /* JADX INFO: renamed from: z */
    public static C3113s m11003z(@lvui com.bumptech.glide.request.transition.f7l8<Drawable> f7l8Var) {
        return new C3113s().t8r(f7l8Var);
    }

    @lvui
    public static C3113s zurt(int i2) {
        return new C3113s().kja0(i2);
    }

    @lvui
    public C3113s cdj(@lvui zy.C3193k c3193k) {
        return t8r(c3193k.m11214k());
    }

    @Override // com.bumptech.glide.AbstractC2977h
    public boolean equals(Object obj) {
        return (obj instanceof C3113s) && super.equals(obj);
    }

    @Override // com.bumptech.glide.AbstractC2977h
    public int hashCode() {
        return super.hashCode();
    }

    @lvui
    public C3113s ki(@lvui com.bumptech.glide.request.transition.zy zyVar) {
        return t8r(zyVar);
    }

    @lvui
    public C3113s kja0(int i2) {
        return cdj(new zy.C3193k(i2));
    }

    @lvui
    public C3113s n7h() {
        return cdj(new zy.C3193k());
    }

    @lvui
    public C3113s t8r(@lvui com.bumptech.glide.request.transition.f7l8<Drawable> f7l8Var) {
        return m10613s(new com.bumptech.glide.request.transition.toq(f7l8Var));
    }
}
