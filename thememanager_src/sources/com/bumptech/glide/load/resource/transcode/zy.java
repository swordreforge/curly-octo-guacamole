package com.bumptech.glide.load.resource.transcode;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.C3087p;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3008n;
import com.bumptech.glide.load.engine.zurt;
import zy.dd;
import zy.lvui;

/* JADX INFO: compiled from: DrawableBytesTranscoder.java */
/* JADX INFO: loaded from: classes2.dex */
public final class zy implements InterfaceC3136n<Drawable, byte[]> {

    /* JADX INFO: renamed from: k */
    private final InterfaceC3008n f18836k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final InterfaceC3136n<Bitmap, byte[]> f62973toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final InterfaceC3136n<com.bumptech.glide.load.resource.gif.zy, byte[]> f62974zy;

    public zy(@lvui InterfaceC3008n interfaceC3008n, @lvui InterfaceC3136n<Bitmap, byte[]> interfaceC3136n, @lvui InterfaceC3136n<com.bumptech.glide.load.resource.gif.zy, byte[]> interfaceC3136n2) {
        this.f18836k = interfaceC3008n;
        this.f62973toq = interfaceC3136n;
        this.f62974zy = interfaceC3136n2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @lvui
    private static zurt<com.bumptech.glide.load.resource.gif.zy> toq(@lvui zurt<Drawable> zurtVar) {
        return zurtVar;
    }

    @Override // com.bumptech.glide.load.resource.transcode.InterfaceC3136n
    @dd
    /* JADX INFO: renamed from: k */
    public zurt<byte[]> mo11064k(@lvui zurt<Drawable> zurtVar, @lvui C3087p c3087p) {
        Drawable drawable = zurtVar.get();
        if (drawable instanceof BitmapDrawable) {
            return this.f62973toq.mo11064k(com.bumptech.glide.load.resource.bitmap.f7l8.m10956g(((BitmapDrawable) drawable).getBitmap(), this.f18836k), c3087p);
        }
        if (drawable instanceof com.bumptech.glide.load.resource.gif.zy) {
            return this.f62974zy.mo11064k(toq(zurtVar), c3087p);
        }
        return null;
    }
}
