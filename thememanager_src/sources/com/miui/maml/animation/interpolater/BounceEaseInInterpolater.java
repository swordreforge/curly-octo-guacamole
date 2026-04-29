package com.miui.maml.animation.interpolater;

import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes3.dex */
public class BounceEaseInInterpolater implements Interpolator {
    public static float getInterpolationImp(float f2) {
        return 1.0f - BounceEaseOutInterpolater.getInterpolationImp(1.0f - f2);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f2) {
        return getInterpolationImp(f2);
    }
}
