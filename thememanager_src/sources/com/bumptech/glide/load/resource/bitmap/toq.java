package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.C3087p;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3008n;
import java.io.File;
import zy.lvui;

/* JADX INFO: compiled from: BitmapDrawableEncoder.java */
/* JADX INFO: loaded from: classes2.dex */
public class toq implements com.bumptech.glide.load.qrj<BitmapDrawable> {

    /* JADX INFO: renamed from: k */
    private final InterfaceC3008n f18755k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final com.bumptech.glide.load.qrj<Bitmap> f62938toq;

    public toq(InterfaceC3008n interfaceC3008n, com.bumptech.glide.load.qrj<Bitmap> qrjVar) {
        this.f18755k = interfaceC3008n;
        this.f62938toq = qrjVar;
    }

    @Override // com.bumptech.glide.load.qrj
    @lvui
    public com.bumptech.glide.load.zy toq(@lvui C3087p c3087p) {
        return this.f62938toq.toq(c3087p);
    }

    @Override // com.bumptech.glide.load.InterfaceC3088q
    /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
    public boolean mo10926k(@lvui com.bumptech.glide.load.engine.zurt<BitmapDrawable> zurtVar, @lvui File file, @lvui C3087p c3087p) {
        return this.f62938toq.mo10926k((Bitmap) new f7l8(zurtVar.get().getBitmap(), this.f18755k), file, c3087p);
    }
}
