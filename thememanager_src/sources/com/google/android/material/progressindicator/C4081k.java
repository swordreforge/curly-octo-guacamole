package com.google.android.material.progressindicator;

import android.content.ContentResolver;
import android.provider.Settings;
import zy.lvui;
import zy.uv6;
import zy.yz;

/* JADX INFO: renamed from: com.google.android.material.progressindicator.k */
/* JADX INFO: compiled from: AnimatorDurationScaleProvider.java */
/* JADX INFO: loaded from: classes2.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP})
public class C4081k {

    /* JADX INFO: renamed from: k */
    private static float f24817k = 1.0f;

    @yz
    public static void toq(float f2) {
        f24817k = f2;
    }

    /* JADX INFO: renamed from: k */
    public float m14703k(@lvui ContentResolver contentResolver) {
        return Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
    }
}
