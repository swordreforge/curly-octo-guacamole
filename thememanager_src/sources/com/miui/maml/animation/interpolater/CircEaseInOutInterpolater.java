package com.miui.maml.animation.interpolater;

import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes3.dex */
public class CircEaseInOutInterpolater implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f2) {
        float f3 = f2 * 2.0f;
        if (f3 < 1.0f) {
            return ((float) (Math.sqrt(1.0f - (f3 * f3)) - 1.0d)) * (-0.5f);
        }
        float f4 = f3 - 2.0f;
        return ((float) (Math.sqrt(1.0f - (f4 * f4)) + 1.0d)) * 0.5f;
    }
}
