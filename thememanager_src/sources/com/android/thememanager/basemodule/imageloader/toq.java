package com.android.thememanager.basemodule.imageloader;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.os.Build;
import com.android.thememanager.wallpaper.C2949g;
import com.bumptech.glide.load.resource.bitmap.AbstractC3115y;

/* JADX INFO: compiled from: BaseBitmapTransformation.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class toq extends AbstractC3115y {
    /* JADX INFO: renamed from: n */
    protected void m6773n(ColorSpace colorSpace, Bitmap transform) {
        if (mo6742q() && C2949g.f17747k.ld6() && Build.VERSION.SDK_INT >= 29) {
            transform.setColorSpace(colorSpace);
        }
    }

    /* JADX INFO: renamed from: q */
    protected abstract boolean mo6742q();
}
