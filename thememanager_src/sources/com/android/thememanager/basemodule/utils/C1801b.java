package com.android.thememanager.basemodule.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.config.C1724k;
import com.android.thememanager.basemodule.config.model.Config;

/* JADX INFO: renamed from: com.android.thememanager.basemodule.utils.b */
/* JADX INFO: compiled from: VideoElementDisplayHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class C1801b {

    /* JADX INFO: renamed from: k */
    private final androidx.core.graphics.drawable.x2 f10274k;

    public C1801b(Context context, int cornerRadius) {
        Resources resources = context.getResources();
        androidx.core.graphics.drawable.x2 x2VarM2430k = androidx.core.graphics.drawable.qrj.m2430k(resources, BitmapFactory.decodeResource(resources, R.drawable.video_wallpaper_mask));
        this.f10274k = x2VarM2430k;
        x2VarM2430k.qrj(cornerRadius);
        x2VarM2430k.ld6(true);
    }

    /* JADX INFO: renamed from: k */
    public Drawable m7003k() {
        return this.f10274k;
    }

    public boolean toq(int pos) {
        int i2;
        Config configLd6 = C1724k.m6723p().ld6();
        if (configLd6 == null || (i2 = configLd6.video_wallpaper_gif_interval) < 0) {
            return false;
        }
        return i2 == 0 || pos % i2 == 0;
    }
}
