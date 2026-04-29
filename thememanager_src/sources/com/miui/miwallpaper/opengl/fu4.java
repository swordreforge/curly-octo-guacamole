package com.miui.miwallpaper.opengl;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;

/* JADX INFO: compiled from: MoruGlassAnimParamEnum.java */
/* JADX INFO: loaded from: classes3.dex */
public enum fu4 {
    REFRACTION(new DecelerateInterpolator(1.2f), 2700),
    PRISM(new DecelerateInterpolator(1.5f), com.google.android.exoplayer2.t8r.f65475toq),
    THIN_LINE(new DecelerateInterpolator(1.0f), 2700);

    public final long animDuration;
    public final Interpolator interpolator;

    fu4(Interpolator interpolator, long j2) {
        this.interpolator = interpolator;
        this.animDuration = j2;
    }

    public static fu4 getMoruAnimInfoById(int i2) {
        if (i2 != 0 && i2 != 1) {
            if (i2 == 3) {
                return THIN_LINE;
            }
            if (i2 != 4) {
                return PRISM;
            }
        }
        return REFRACTION;
    }
}
