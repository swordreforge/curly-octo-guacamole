package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.security.MessageDigest;
import zy.lvui;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.q */
/* JADX INFO: compiled from: BitmapDrawableTransformation.java */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class C3112q implements com.bumptech.glide.load.n7h<BitmapDrawable> {

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final com.bumptech.glide.load.n7h<Drawable> f62935zy;

    public C3112q(com.bumptech.glide.load.n7h<Bitmap> n7hVar) {
        this.f62935zy = (com.bumptech.glide.load.n7h) com.bumptech.glide.util.qrj.m11262q(new t8r(n7hVar, false));
    }

    /* JADX INFO: renamed from: q */
    private static com.bumptech.glide.load.engine.zurt<Drawable> m11001q(com.bumptech.glide.load.engine.zurt<BitmapDrawable> zurtVar) {
        return zurtVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static com.bumptech.glide.load.engine.zurt<BitmapDrawable> zy(com.bumptech.glide.load.engine.zurt<Drawable> zurtVar) {
        if (zurtVar.get() instanceof BitmapDrawable) {
            return zurtVar;
        }
        throw new IllegalArgumentException("Wrapped transformation unexpectedly returned a non BitmapDrawable resource: " + zurtVar.get());
    }

    @Override // com.bumptech.glide.load.f7l8
    public boolean equals(Object obj) {
        if (obj instanceof C3112q) {
            return this.f62935zy.equals(((C3112q) obj).f62935zy);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.f7l8
    public int hashCode() {
        return this.f62935zy.hashCode();
    }

    @Override // com.bumptech.glide.load.n7h
    @lvui
    /* JADX INFO: renamed from: k */
    public com.bumptech.glide.load.engine.zurt<BitmapDrawable> mo6744k(@lvui Context context, @lvui com.bumptech.glide.load.engine.zurt<BitmapDrawable> zurtVar, int i2, int i3) {
        return zy(this.f62935zy.mo6744k(context, m11001q(zurtVar), i2, i3));
    }

    @Override // com.bumptech.glide.load.f7l8
    public void toq(@lvui MessageDigest messageDigest) {
        this.f62935zy.toq(messageDigest);
    }
}
