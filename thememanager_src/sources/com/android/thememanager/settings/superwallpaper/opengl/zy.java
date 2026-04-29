package com.android.thememanager.settings.superwallpaper.opengl;

import android.content.Context;
import android.graphics.Bitmap;
import com.android.thememanager.basemodule.utils.ki;
import com.android.thememanager.settings.superwallpaper.C2656k;
import com.android.thememanager.settings.superwallpaper.utils.C2670y;

/* JADX INFO: compiled from: LockScreenWallpaperRender.java */
/* JADX INFO: loaded from: classes2.dex */
public class zy extends C2660n {

    /* JADX INFO: renamed from: i */
    private Context f15752i;

    public zy(Context context) {
        super(context);
        this.f15752i = context;
    }

    @Override // com.android.thememanager.settings.superwallpaper.opengl.C2660n
    public Bitmap zy() {
        return ki.m7107k(this.f15748s ? C2656k.zy(this.f15752i) : C2670y.m9307n(this.f15752i));
    }
}
