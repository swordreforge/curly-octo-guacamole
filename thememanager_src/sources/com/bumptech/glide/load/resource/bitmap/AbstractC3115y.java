package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3008n;
import zy.lvui;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.y */
/* JADX INFO: compiled from: BitmapTransformation.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3115y implements com.bumptech.glide.load.n7h<Bitmap> {
    @Override // com.bumptech.glide.load.n7h
    @lvui
    /* JADX INFO: renamed from: k */
    public final com.bumptech.glide.load.engine.zurt<Bitmap> mo6744k(@lvui Context context, @lvui com.bumptech.glide.load.engine.zurt<Bitmap> zurtVar, int i2, int i3) {
        if (!com.bumptech.glide.util.kja0.ni7(i2, i3)) {
            throw new IllegalArgumentException("Cannot apply transformation on width: " + i2 + " or height: " + i3 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
        }
        InterfaceC3008n interfaceC3008nM11289y = com.bumptech.glide.zy.m11283n(context).m11289y();
        Bitmap bitmap = zurtVar.get();
        if (i2 == Integer.MIN_VALUE) {
            i2 = bitmap.getWidth();
        }
        if (i3 == Integer.MIN_VALUE) {
            i3 = bitmap.getHeight();
        }
        Bitmap bitmapZy = zy(interfaceC3008nM11289y, bitmap, i2, i3);
        return bitmap.equals(bitmapZy) ? zurtVar : f7l8.m10956g(bitmapZy, interfaceC3008nM11289y);
    }

    protected abstract Bitmap zy(@lvui InterfaceC3008n interfaceC3008n, @lvui Bitmap bitmap, int i2, int i3);
}
