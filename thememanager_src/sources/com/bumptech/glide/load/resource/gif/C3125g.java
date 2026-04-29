package com.bumptech.glide.load.resource.gif;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.zurt;
import com.bumptech.glide.load.n7h;
import com.bumptech.glide.util.qrj;
import java.security.MessageDigest;
import zy.lvui;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.gif.g */
/* JADX INFO: compiled from: GifDrawableTransformation.java */
/* JADX INFO: loaded from: classes2.dex */
public class C3125g implements n7h<zy> {

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final n7h<Bitmap> f62959zy;

    public C3125g(n7h<Bitmap> n7hVar) {
        this.f62959zy = (n7h) qrj.m11262q(n7hVar);
    }

    @Override // com.bumptech.glide.load.f7l8
    public boolean equals(Object obj) {
        if (obj instanceof C3125g) {
            return this.f62959zy.equals(((C3125g) obj).f62959zy);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.f7l8
    public int hashCode() {
        return this.f62959zy.hashCode();
    }

    @Override // com.bumptech.glide.load.n7h
    @lvui
    /* JADX INFO: renamed from: k */
    public zurt<zy> mo6744k(@lvui Context context, @lvui zurt<zy> zurtVar, int i2, int i3) {
        zy zyVar = zurtVar.get();
        zurt<Bitmap> f7l8Var = new com.bumptech.glide.load.resource.bitmap.f7l8(zyVar.f7l8(), com.bumptech.glide.zy.m11283n(context).m11289y());
        zurt<Bitmap> zurtVarMo6744k = this.f62959zy.mo6744k(context, f7l8Var, i2, i3);
        if (!f7l8Var.equals(zurtVarMo6744k)) {
            f7l8Var.toq();
        }
        zyVar.cdj(this.f62959zy, zurtVarMo6744k.get());
        return zurtVar;
    }

    @Override // com.bumptech.glide.load.f7l8
    public void toq(@lvui MessageDigest messageDigest) {
        this.f62959zy.toq(messageDigest);
    }
}
