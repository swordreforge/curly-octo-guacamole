package com.android.thememanager.settings.superwallpaper.wallpaper;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;

/* JADX INFO: compiled from: WallpaperManagerCompatDefault.java */
/* JADX INFO: loaded from: classes2.dex */
public class zy extends toq {
    zy(Context context) {
        super(context);
    }

    @Override // com.android.thememanager.settings.superwallpaper.wallpaper.toq
    public int zy(Bitmap bitmap) {
        Log.d("WallpaperCompat", "getWallpaperColorMode, return DEFAULT_WALLPAPER_COLOR_MODE");
        return 0;
    }
}
