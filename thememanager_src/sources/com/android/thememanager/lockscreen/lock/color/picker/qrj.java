package com.android.thememanager.lockscreen.lock.color.picker;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import java.util.Map;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7396q;
import zy.hyr;

/* JADX INFO: compiled from: RhombusAutoColorPicker.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class qrj extends AbstractC2097k {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qrj(@InterfaceC7396q Context context) {
        super(context);
        d2ok.m23075h(context, "context");
    }

    @Override // com.android.thememanager.lockscreen.lock.color.picker.AbstractC2097k
    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public String mo8059k() {
        return "rhombus";
    }

    @Override // com.android.thememanager.lockscreen.lock.color.picker.AbstractC2097k
    @InterfaceC7396q
    @hyr(31)
    public ColorData qrj(@InterfaceC7396q Bitmap wallpaper) {
        d2ok.m23075h(wallpaper, "wallpaper");
        x2 x2Var = x2.CLOCK;
        boolean zLd6 = AbstractC2097k.ld6(this, wallpaper, f7l8(x2Var), 0, 0, 12, null);
        boolean zLd62 = AbstractC2097k.ld6(this, wallpaper, f7l8(x2.STATUS_BAR), 0, 0, 12, null);
        Map mapM8060n = AbstractC2097k.m8060n(this, wallpaper, f7l8(x2Var), 0, 0, 12, null);
        Log.d(toq.f12365k, "pickColor isDarkClockArea=" + zLd6);
        return new ColorData(0, 0, 0, 0, !zLd6, !zLd62, mapM8060n, false, null, 0, 911, null);
    }
}
