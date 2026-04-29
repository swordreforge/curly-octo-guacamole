package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3008n;
import zy.dd;
import zy.lvui;

/* JADX INFO: compiled from: LazyBitmapDrawableResource.java */
/* JADX INFO: loaded from: classes2.dex */
public final class o1t implements com.bumptech.glide.load.engine.zurt<BitmapDrawable>, com.bumptech.glide.load.engine.ki {

    /* JADX INFO: renamed from: k */
    private final Resources f18744k;

    /* JADX INFO: renamed from: q */
    private final com.bumptech.glide.load.engine.zurt<Bitmap> f18745q;

    private o1t(@lvui Resources resources, @lvui com.bumptech.glide.load.engine.zurt<Bitmap> zurtVar) {
        this.f18744k = (Resources) com.bumptech.glide.util.qrj.m11262q(resources);
        this.f18745q = (com.bumptech.glide.load.engine.zurt) com.bumptech.glide.util.qrj.m11262q(zurtVar);
    }

    @Deprecated
    public static o1t f7l8(Context context, Bitmap bitmap) {
        return (o1t) m10996g(context.getResources(), f7l8.m10956g(bitmap, com.bumptech.glide.zy.m11283n(context).m11289y()));
    }

    @dd
    /* JADX INFO: renamed from: g */
    public static com.bumptech.glide.load.engine.zurt<BitmapDrawable> m10996g(@lvui Resources resources, @dd com.bumptech.glide.load.engine.zurt<Bitmap> zurtVar) {
        if (zurtVar == null) {
            return null;
        }
        return new o1t(resources, zurtVar);
    }

    @Deprecated
    /* JADX INFO: renamed from: y */
    public static o1t m10997y(Resources resources, InterfaceC3008n interfaceC3008n, Bitmap bitmap) {
        return (o1t) m10996g(resources, f7l8.m10956g(bitmap, interfaceC3008n));
    }

    @Override // com.bumptech.glide.load.engine.ki
    /* JADX INFO: renamed from: k */
    public void mo10781k() {
        com.bumptech.glide.load.engine.zurt<Bitmap> zurtVar = this.f18745q;
        if (zurtVar instanceof com.bumptech.glide.load.engine.ki) {
            ((com.bumptech.glide.load.engine.ki) zurtVar).mo10781k();
        }
    }

    @Override // com.bumptech.glide.load.engine.zurt
    @lvui
    /* JADX INFO: renamed from: n */
    public Class<BitmapDrawable> mo10765n() {
        return BitmapDrawable.class;
    }

    @Override // com.bumptech.glide.load.engine.zurt
    @lvui
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public BitmapDrawable get() {
        return new BitmapDrawable(this.f18744k, this.f18745q.get());
    }

    @Override // com.bumptech.glide.load.engine.zurt
    public void toq() {
        this.f18745q.toq();
    }

    @Override // com.bumptech.glide.load.engine.zurt
    public int zy() {
        return this.f18745q.zy();
    }
}
