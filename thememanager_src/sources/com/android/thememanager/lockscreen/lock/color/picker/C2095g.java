package com.android.thememanager.lockscreen.lock.color.picker;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.constraintlayout.core.motion.utils.zurt;
import java.util.Map;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7396q;
import zy.hyr;

/* JADX INFO: renamed from: com.android.thememanager.lockscreen.lock.color.picker.g */
/* JADX INFO: compiled from: DoodleAutoColorPicker.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C2095g extends ld6 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2095g(@InterfaceC7396q Context context) {
        super(context);
        d2ok.m23075h(context, "context");
    }

    @Override // com.android.thememanager.lockscreen.lock.color.picker.AbstractC2097k
    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public String mo8059k() {
        return "doodle";
    }

    @Override // com.android.thememanager.lockscreen.lock.color.picker.ld6
    @InterfaceC7396q
    @hyr(31)
    public ColorData n7h(@InterfaceC7396q Bitmap wallpaper, int i2) {
        d2ok.m23075h(wallpaper, "wallpaper");
        boolean z2 = !AbstractC2097k.ld6(this, wallpaper, f7l8(x2.CLOCK), 0, 0, 12, null);
        Map mapM8060n = AbstractC2097k.m8060n(this, wallpaper, f7l8(x2.DEFAULT), 0, 0, 12, null);
        return i2 != 1 ? i2 != 2 ? new ColorData(C2098n.m8066k(mapM8060n, "secondary60"), C2098n.m8066k(mapM8060n, "secondary10"), C2098n.m8066k(mapM8060n, "primary70"), C2098n.m8066k(mapM8060n, "primary40"), z2, false, mapM8060n, false, null, i2, zurt.zy.f47483cdj, null) : new ColorData(C2098n.m8066k(mapM8060n, "primary18"), C2098n.m8066k(mapM8060n, "secondary60"), C2098n.m8066k(mapM8060n, "primary85"), C2098n.m8066k(mapM8060n, "primary60"), z2, false, mapM8060n, false, null, i2, zurt.zy.f47483cdj, null) : new ColorData(C2098n.m8066k(mapM8060n, "primary7"), C2098n.m8066k(mapM8060n, "primary97"), C2098n.m8066k(mapM8060n, "primary70"), C2098n.m8066k(mapM8060n, "primary30"), z2, false, mapM8060n, false, null, i2, zurt.zy.f47483cdj, null);
    }
}
