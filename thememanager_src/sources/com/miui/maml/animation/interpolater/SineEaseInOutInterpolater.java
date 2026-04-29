package com.miui.maml.animation.interpolater;

import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes3.dex */
public class SineEaseInOutInterpolater implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f2) {
        return ((float) (Math.cos(((double) f2) * 3.141592653589793d) - 1.0d)) * (-0.5f);
    }
}
