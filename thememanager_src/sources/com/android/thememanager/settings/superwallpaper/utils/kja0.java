package com.android.thememanager.settings.superwallpaper.utils;

import android.app.WallpaperInfo;
import android.app.WallpaperManager;
import android.content.Context;
import android.graphics.Bitmap;
import java.io.File;

/* JADX INFO: compiled from: WallpaperUtils.java */
/* JADX INFO: loaded from: classes2.dex */
public class kja0 {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final int f60972f7l8 = 400;

    /* JADX INFO: renamed from: g */
    private static final int f15771g = 5;

    /* JADX INFO: renamed from: k */
    public static final String f15772k = "com.miui.miwallpaper.MiWallpaper";

    /* JADX INFO: renamed from: n */
    public static final int f15773n = 0;

    /* JADX INFO: renamed from: q */
    public static final String f15774q = "/data/system/theme_magic/video/video_wallpaper_desktop_thumbnail_small.jpg";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final String f60973toq = "com.miui.miwallpaper.superwallpaper.MamlSuperWallpaper";

    /* JADX INFO: renamed from: y */
    private static final int f15775y = 400;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final String f60974zy = "/data/system/theme_magic/video/video_wallpaper_desktop_thumbnail.jpg";

    private kja0() {
    }

    /* JADX INFO: renamed from: k */
    public static int m9272k(Bitmap b2) {
        return (b2.getWidth() < 400 || b2.getHeight() < 400) ? 1 : 5;
    }

    public static WallpaperInfo toq(Context context) {
        return ((WallpaperManager) context.getSystemService("wallpaper")).getWallpaperInfo();
    }

    public static boolean zy() {
        return new File(f60974zy).exists();
    }
}
