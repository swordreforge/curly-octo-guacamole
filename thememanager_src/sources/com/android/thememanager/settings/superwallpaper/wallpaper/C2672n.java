package com.android.thememanager.settings.superwallpaper.wallpaper;

import android.annotation.TargetApi;
import android.app.WallpaperColors;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.util.Log;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: com.android.thememanager.settings.superwallpaper.wallpaper.n */
/* JADX INFO: compiled from: WallpaperManagerCompatVOMR1.java */
/* JADX INFO: loaded from: classes2.dex */
@TargetApi(27)
public class C2672n extends C2673q {

    /* JADX INFO: renamed from: n */
    private Method f15814n;

    C2672n(Context context) {
        super(context);
        try {
            this.f15814n = WallpaperColors.class.getDeclaredMethod("getColorHints", new Class[0]);
        } catch (Exception e2) {
            Log.e("WallpaperCompat", "getColorHints not available", e2);
        }
    }

    /* JADX INFO: renamed from: q */
    private C2671k m9321q(WallpaperColors colors) {
        if (colors == null) {
            return null;
        }
        Color primaryColor = colors.getPrimaryColor();
        Color secondaryColor = colors.getSecondaryColor();
        Color tertiaryColor = colors.getTertiaryColor();
        int iIntValue = 0;
        int argb = primaryColor != null ? primaryColor.toArgb() : 0;
        int argb2 = secondaryColor != null ? secondaryColor.toArgb() : 0;
        int argb3 = tertiaryColor != null ? tertiaryColor.toArgb() : 0;
        try {
            Method method = this.f15814n;
            if (method != null) {
                iIntValue = ((Integer) method.invoke(colors, new Object[0])).intValue();
            }
        } catch (Exception e2) {
            Log.e("WallpaperCompat", "error calling color hints", e2);
        }
        return new C2671k(argb, argb2, argb3, iIntValue);
    }

    @Override // com.android.thememanager.settings.superwallpaper.wallpaper.C2673q, com.android.thememanager.settings.superwallpaper.wallpaper.zy, com.android.thememanager.settings.superwallpaper.wallpaper.toq
    public int zy(Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            Log.w("WallpaperCompat", "getWallpaperColorMode error bitmap is recycled or bitmap is " + bitmap);
        } else {
            C2671k c2671kM9321q = m9321q(WallpaperColors.fromBitmap(bitmap));
            if (c2671kM9321q != null) {
                int qVar = c2671kM9321q.toq();
                Log.d("WallpaperCompat", "getWallpaperColorMode, staticWallpaperColorMode=" + qVar);
                return qVar;
            }
        }
        return super.zy(bitmap);
    }
}
