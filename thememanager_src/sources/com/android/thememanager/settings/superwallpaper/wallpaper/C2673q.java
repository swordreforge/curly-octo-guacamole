package com.android.thememanager.settings.superwallpaper.wallpaper;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import com.android.thememanager.settings.superwallpaper.utils.kja0;
import miuix.graphics.C7111k;

/* JADX INFO: renamed from: com.android.thememanager.settings.superwallpaper.wallpaper.q */
/* JADX INFO: compiled from: WallpaperManagerCompatVL.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2673q extends zy {
    C2673q(Context context) {
        super(context);
    }

    @Override // com.android.thememanager.settings.superwallpaper.wallpaper.zy, com.android.thememanager.settings.superwallpaper.wallpaper.toq
    public int zy(Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            Log.w("WallpaperCompat", "getWallpaperColorMode error return super value,bitmap is recycler or bitmap = " + bitmap);
            return super.zy(bitmap);
        }
        int iWvg = C7111k.wvg(bitmap, kja0.m9272k(bitmap));
        Log.d("WallpaperCompat", "getWallpaperColorMode, colorMode=" + iWvg);
        return iWvg;
    }
}
