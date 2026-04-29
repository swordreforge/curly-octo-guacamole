package zuf;

import android.view.animation.Interpolator;

/* JADX INFO: renamed from: zuf.y */
/* JADX INFO: compiled from: CirclularEaseInOutInterpolator.java */
/* JADX INFO: loaded from: classes3.dex */
public class InterpolatorC7820y implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f2) {
        float f3;
        double dSqrt;
        float f4 = f2 * 2.0f;
        if (f4 < 1.0f) {
            f3 = -0.5f;
            dSqrt = Math.sqrt(1.0f - (f4 * f4)) - 1.0d;
        } else {
            float f5 = f4 - 2.0f;
            f3 = 0.5f;
            dSqrt = Math.sqrt(1.0f - (f5 * f5)) + 1.0d;
        }
        return ((float) dSqrt) * f3;
    }
}
