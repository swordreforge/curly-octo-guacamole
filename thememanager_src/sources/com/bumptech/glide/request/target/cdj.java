package com.bumptech.glide.request.target;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.ImageView;
import zy.dd;

/* JADX INFO: compiled from: ThumbnailImageViewTarget.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class cdj<T> extends AbstractC3180p<T> {
    public cdj(ImageView imageView) {
        super(imageView);
    }

    @Override // com.bumptech.glide.request.target.AbstractC3180p
    protected void ni7(@dd T t2) {
        ViewGroup.LayoutParams layoutParams = ((ImageView) this.f19015q).getLayoutParams();
        Drawable drawableMo11175z = mo11175z(t2);
        if (layoutParams != null && layoutParams.width > 0 && layoutParams.height > 0) {
            drawableMo11175z = new C3183s(drawableMo11175z, layoutParams.width, layoutParams.height);
        }
        ((ImageView) this.f19015q).setImageDrawable(drawableMo11175z);
    }

    /* JADX INFO: renamed from: z */
    protected abstract Drawable mo11175z(T t2);

    @Deprecated
    public cdj(ImageView imageView, boolean z2) {
        super(imageView, z2);
    }
}
