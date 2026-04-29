package com.android.thememanager.lockscreen.lock.color.picker;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7396q;
import zy.hyr;

/* JADX INFO: compiled from: ClassicAutoColorPicker.kt */
/* JADX INFO: loaded from: classes2.dex */
public class zy extends AbstractC2097k {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zy(@InterfaceC7396q Context context) {
        super(context);
        d2ok.m23075h(context, "context");
    }

    @Override // com.android.thememanager.lockscreen.lock.color.picker.AbstractC2097k
    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public String mo8059k() {
        return "classic";
    }

    @Override // com.android.thememanager.lockscreen.lock.color.picker.AbstractC2097k
    @InterfaceC7396q
    @hyr(31)
    public ColorData qrj(@InterfaceC7396q Bitmap wallpaper) {
        d2ok.m23075h(wallpaper, "wallpaper");
        x2 x2Var = x2.CLOCK;
        boolean zLd6 = AbstractC2097k.ld6(this, wallpaper, f7l8(x2Var), 0, 0, 12, null);
        Log.d("ClassicPicker", "pickColor isDarkClockArea=" + zLd6);
        return new ColorData(0, 0, 0, 0, !zLd6, false, AbstractC2097k.m8060n(this, wallpaper, f7l8(x2Var), 0, 0, 12, null), false, null, 0, 943, null);
    }
}
