package com.bumptech.glide.request.target;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import zy.dd;

/* JADX INFO: compiled from: DrawableImageViewTarget.java */
/* JADX INFO: loaded from: classes2.dex */
public class f7l8 extends AbstractC3180p<Drawable> {
    public f7l8(ImageView imageView) {
        super(imageView);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.request.target.AbstractC3180p
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void ni7(@dd Drawable drawable) {
        ((ImageView) this.f19015q).setImageDrawable(drawable);
    }

    @Deprecated
    public f7l8(ImageView imageView, boolean z2) {
        super(imageView, z2);
    }
}
