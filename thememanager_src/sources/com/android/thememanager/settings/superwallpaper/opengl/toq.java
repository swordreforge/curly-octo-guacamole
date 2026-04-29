package com.android.thememanager.settings.superwallpaper.opengl;

import android.app.WallpaperManager;
import android.content.Context;
import android.content.pm.ServiceInfo;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import com.android.thememanager.basemodule.utils.ki;
import com.android.thememanager.settings.superwallpaper.C2656k;
import com.android.thememanager.settings.superwallpaper.utils.f7l8;
import com.miui.maml.widget.edit.MamlutilKt;

/* JADX INFO: compiled from: HomeWallpaperRender.java */
/* JADX INFO: loaded from: classes2.dex */
public class toq extends C2660n {

    /* JADX INFO: renamed from: i */
    private WallpaperManager f15751i;

    public toq(Context context) {
        super(context);
        this.f15751i = (WallpaperManager) this.f15747q.getSystemService("wallpaper");
    }

    @Override // com.android.thememanager.settings.superwallpaper.opengl.C2660n
    public Bitmap zy() {
        if (!this.f15748s) {
            return f7l8.m9254g(this.f15747q, this.f15751i);
        }
        int iM9242n = C2656k.m9242n(this.f15747q, this.f15746p);
        Drawable drawableLoadDrawable = null;
        if (this.f15751i.getWallpaperInfo() != null && this.f15751i.getWallpaperInfo().getServiceInfo() != null && this.f15751i.getWallpaperInfo().getServiceInfo().metaData != null) {
            ServiceInfo serviceInfo = this.f15751i.getWallpaperInfo().getServiceInfo();
            if (com.android.thememanager.settings.superwallpaper.basesuperwallpaper.toq.x2().qrj() || com.android.thememanager.settings.superwallpaper.basesuperwallpaper.toq.x2().kja0()) {
                drawableLoadDrawable = Icon.createWithResource(serviceInfo.packageName, serviceInfo.metaData.getInt("home_small_preview_" + iM9242n + MamlutilKt.PREVIEW_DARK_SUF)).loadDrawable(this.f15747q);
            } else {
                drawableLoadDrawable = Icon.createWithResource(serviceInfo.packageName, serviceInfo.metaData.getInt("home_small_preview_" + iM9242n)).loadDrawable(this.f15747q);
            }
        }
        return ki.m7107k(drawableLoadDrawable);
    }
}
