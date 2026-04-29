package com.android.thememanager.lockscreen.lock.color.picker;

import android.content.Context;
import android.graphics.Bitmap;
import com.android.thememanager.settings.superwallpaper.utils.C2670y;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: RandomAutoColorPicker.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class ld6 extends AbstractC2097k {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ld6(@InterfaceC7396q Context context) {
        super(context);
        d2ok.m23075h(context, "context");
    }

    @InterfaceC7396q
    public abstract ColorData n7h(@InterfaceC7396q Bitmap bitmap, int i2);

    @Override // com.android.thememanager.lockscreen.lock.color.picker.AbstractC2097k
    @InterfaceC7396q
    public final ColorData qrj(@InterfaceC7396q Bitmap wallpaper) {
        d2ok.m23075h(wallpaper, "wallpaper");
        return n7h(wallpaper, C2670y.zy());
    }
}
