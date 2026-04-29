package com.bumptech.glide.request.target;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import zy.lvui;

/* JADX INFO: compiled from: ImageViewTargetFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public class ld6 {
    @lvui
    /* JADX INFO: renamed from: k */
    public <Z> ki<ImageView, Z> m11202k(@lvui ImageView imageView, @lvui Class<Z> cls) {
        if (Bitmap.class.equals(cls)) {
            return new zy(imageView);
        }
        if (Drawable.class.isAssignableFrom(cls)) {
            return new f7l8(imageView);
        }
        throw new IllegalArgumentException("Unhandled class: " + cls + ", try .as*(Class).transcode(ResourceTranscoder)");
    }
}
