package com.android.thememanager.settings.superwallpaper.wallpaper;

import android.app.WallpaperManager;
import android.content.Context;
import android.graphics.Bitmap;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: WallpaperManagerCompat.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class toq {

    /* JADX INFO: renamed from: q */
    public static final int f15815q = 2;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final int f61008zy = 1;

    /* JADX INFO: renamed from: k */
    protected final String f15816k = "WallpaperCompat";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    protected WallpaperManager f61009toq;

    toq(Context context) {
        this.f61009toq = WallpaperManager.getInstance(context);
    }

    /* JADX INFO: renamed from: k */
    public static toq m9322k(Context context) {
        Context applicationContext = context.getApplicationContext();
        return com.android.thememanager.settings.superwallpaper.utils.zy.f7l8() ? new C2672n(applicationContext) : com.android.thememanager.settings.superwallpaper.utils.zy.f15809k ? new C2673q(applicationContext) : new zy(applicationContext);
    }

    public Bitmap toq() {
        try {
            return (Bitmap) bek6.toq.n7h(WallpaperManager.class, "getBitmap", new Class[0]).invoke(this.f61009toq, new Object[0]);
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
            return null;
        } catch (NoSuchMethodException e3) {
            e3.printStackTrace();
            return null;
        } catch (InvocationTargetException e4) {
            e4.printStackTrace();
            return null;
        }
    }

    public abstract int zy(Bitmap bitmap);
}
