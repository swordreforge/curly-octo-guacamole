package com.bumptech.glide.request.target;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* JADX INFO: renamed from: com.bumptech.glide.request.target.q */
/* JADX INFO: compiled from: BitmapThumbnailImageViewTarget.java */
/* JADX INFO: loaded from: classes2.dex */
public class C3181q extends cdj<Bitmap> {
    public C3181q(ImageView imageView) {
        super(imageView);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.request.target.cdj
    /* JADX INFO: renamed from: o1t, reason: merged with bridge method [inline-methods] */
    public Drawable mo11175z(Bitmap bitmap) {
        return new BitmapDrawable(((ImageView) this.f19015q).getResources(), bitmap);
    }

    @Deprecated
    public C3181q(ImageView imageView, boolean z2) {
        super(imageView, z2);
    }
}
