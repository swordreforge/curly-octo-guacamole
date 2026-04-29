package com.miui.miwallpaper;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: BitmapUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public class toq {
    /* JADX INFO: renamed from: k */
    public static void m18076k(Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        bitmap.recycle();
    }
}
