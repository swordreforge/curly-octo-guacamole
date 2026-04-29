package com.bumptech.glide.request.target;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* JADX INFO: compiled from: BitmapImageViewTarget.java */
/* JADX INFO: loaded from: classes2.dex */
public class zy extends AbstractC3180p<Bitmap> {
    public zy(ImageView imageView) {
        super(imageView);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.request.target.AbstractC3180p
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void ni7(Bitmap bitmap) {
        ((ImageView) this.f19015q).setImageBitmap(bitmap);
    }

    @Deprecated
    public zy(ImageView imageView, boolean z2) {
        super(imageView, z2);
    }
}
