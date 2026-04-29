package com.bumptech.glide.load.resource.gif;

import android.graphics.Bitmap;
import com.bumptech.glide.gifdecoder.InterfaceC2974k;
import com.bumptech.glide.load.C3087p;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3008n;
import com.bumptech.glide.load.engine.zurt;
import com.bumptech.glide.load.x2;
import zy.lvui;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.gif.y */
/* JADX INFO: compiled from: GifFrameResourceDecoder.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C3131y implements x2<InterfaceC2974k, Bitmap> {

    /* JADX INFO: renamed from: k */
    private final InterfaceC3008n f18808k;

    public C3131y(InterfaceC3008n interfaceC3008n) {
        this.f18808k = interfaceC3008n;
    }

    @Override // com.bumptech.glide.load.x2
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public boolean mo10948k(@lvui InterfaceC2974k interfaceC2974k, @lvui C3087p c3087p) {
        return true;
    }

    @Override // com.bumptech.glide.load.x2
    /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
    public zurt<Bitmap> toq(@lvui InterfaceC2974k interfaceC2974k, int i2, int i3, @lvui C3087p c3087p) {
        return com.bumptech.glide.load.resource.bitmap.f7l8.m10956g(interfaceC2974k.zy(), this.f18808k);
    }
}
