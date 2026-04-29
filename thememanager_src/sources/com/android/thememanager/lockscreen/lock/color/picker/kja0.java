package com.android.thememanager.lockscreen.lock.color.picker;

import android.content.Context;
import android.graphics.Bitmap;
import java.util.Map;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7396q;
import zy.hyr;

/* JADX INFO: compiled from: SmartFrameAutoColorPicker.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class kja0 extends ld6 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kja0(@InterfaceC7396q Context context) {
        super(context);
        d2ok.m23075h(context, "context");
    }

    @Override // com.android.thememanager.lockscreen.lock.color.picker.AbstractC2097k
    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public String mo8059k() {
        return "smart_frame";
    }

    @Override // com.android.thememanager.lockscreen.lock.color.picker.ld6
    @InterfaceC7396q
    @hyr(30)
    public ColorData n7h(@InterfaceC7396q Bitmap wallpaper, int i2) {
        d2ok.m23075h(wallpaper, "wallpaper");
        Map mapM8060n = AbstractC2097k.m8060n(this, wallpaper, f7l8(x2.DEFAULT), 0, 0, 12, null);
        return i2 != 1 ? i2 != 2 ? new ColorData(0, C2098n.m8066k(mapM8060n, "secondary20"), 0, 0, false, false, mapM8060n, false, null, i2, 445, null) : new ColorData(0, C2098n.m8066k(mapM8060n, "secondary60"), 0, 0, false, false, mapM8060n, false, null, i2, 445, null) : new ColorData(0, C2098n.m8066k(mapM8060n, "secondary97"), 0, 0, false, false, mapM8060n, false, null, i2, 445, null);
    }
}
