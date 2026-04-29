package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3008n;
import java.security.MessageDigest;
import zy.lvui;

/* JADX INFO: compiled from: DrawableTransformation.java */
/* JADX INFO: loaded from: classes2.dex */
public class t8r implements com.bumptech.glide.load.n7h<Drawable> {

    /* JADX INFO: renamed from: q */
    private final boolean f18754q;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final com.bumptech.glide.load.n7h<Bitmap> f62937zy;

    public t8r(com.bumptech.glide.load.n7h<Bitmap> n7hVar, boolean z2) {
        this.f62937zy = n7hVar;
        this.f18754q = z2;
    }

    /* JADX INFO: renamed from: q */
    private com.bumptech.glide.load.engine.zurt<Drawable> m11007q(Context context, com.bumptech.glide.load.engine.zurt<Bitmap> zurtVar) {
        return o1t.m10996g(context.getResources(), zurtVar);
    }

    @Override // com.bumptech.glide.load.f7l8
    public boolean equals(Object obj) {
        if (obj instanceof t8r) {
            return this.f62937zy.equals(((t8r) obj).f62937zy);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.f7l8
    public int hashCode() {
        return this.f62937zy.hashCode();
    }

    @Override // com.bumptech.glide.load.n7h
    @lvui
    /* JADX INFO: renamed from: k */
    public com.bumptech.glide.load.engine.zurt<Drawable> mo6744k(@lvui Context context, @lvui com.bumptech.glide.load.engine.zurt<Drawable> zurtVar, int i2, int i3) {
        InterfaceC3008n interfaceC3008nM11289y = com.bumptech.glide.zy.m11283n(context).m11289y();
        Drawable drawable = zurtVar.get();
        com.bumptech.glide.load.engine.zurt<Bitmap> zurtVarM10976k = ki.m10976k(interfaceC3008nM11289y, drawable, i2, i3);
        if (zurtVarM10976k != null) {
            com.bumptech.glide.load.engine.zurt<Bitmap> zurtVarMo6744k = this.f62937zy.mo6744k(context, zurtVarM10976k, i2, i3);
            if (!zurtVarMo6744k.equals(zurtVarM10976k)) {
                return m11007q(context, zurtVarMo6744k);
            }
            zurtVarMo6744k.toq();
            return zurtVar;
        }
        if (!this.f18754q) {
            return zurtVar;
        }
        throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
    }

    @Override // com.bumptech.glide.load.f7l8
    public void toq(@lvui MessageDigest messageDigest) {
        this.f62937zy.toq(messageDigest);
    }

    public com.bumptech.glide.load.n7h<BitmapDrawable> zy() {
        return this;
    }
}
