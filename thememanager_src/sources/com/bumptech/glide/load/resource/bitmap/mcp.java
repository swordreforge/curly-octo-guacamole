package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.bumptech.glide.load.C3087p;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3008n;
import zy.dd;
import zy.lvui;

/* JADX INFO: compiled from: ResourceBitmapDecoder.java */
/* JADX INFO: loaded from: classes2.dex */
public class mcp implements com.bumptech.glide.load.x2<Uri, Bitmap> {

    /* JADX INFO: renamed from: k */
    private final com.bumptech.glide.load.resource.drawable.f7l8 f18731k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final InterfaceC3008n f62921toq;

    public mcp(com.bumptech.glide.load.resource.drawable.f7l8 f7l8Var, InterfaceC3008n interfaceC3008n) {
        this.f18731k = f7l8Var;
        this.f62921toq = interfaceC3008n;
    }

    @Override // com.bumptech.glide.load.x2
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public boolean mo10948k(@lvui Uri uri, @lvui C3087p c3087p) {
        return "android.resource".equals(uri.getScheme());
    }

    @Override // com.bumptech.glide.load.x2
    @dd
    /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
    public com.bumptech.glide.load.engine.zurt<Bitmap> toq(@lvui Uri uri, int i2, int i3, @lvui C3087p c3087p) {
        com.bumptech.glide.load.engine.zurt<Drawable> qVar = this.f18731k.toq(uri, i2, i3, c3087p);
        if (qVar == null) {
            return null;
        }
        return ki.m10976k(this.f62921toq, qVar.get(), i2, i3);
    }
}
