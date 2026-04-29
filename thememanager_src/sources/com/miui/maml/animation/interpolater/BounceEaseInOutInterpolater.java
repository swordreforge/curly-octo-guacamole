package com.miui.maml.animation.interpolater;

import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes3.dex */
public class BounceEaseInOutInterpolater implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f2) {
        return f2 < 0.5f ? BounceEaseInInterpolater.getInterpolationImp(f2 * 2.0f) * 0.5f : (BounceEaseOutInterpolater.getInterpolationImp((f2 * 2.0f) - 1.0f) * 0.5f) + 0.5f;
    }
}
