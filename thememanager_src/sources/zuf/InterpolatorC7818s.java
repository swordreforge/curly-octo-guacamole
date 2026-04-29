package zuf;

import android.view.animation.Interpolator;

/* JADX INFO: renamed from: zuf.s */
/* JADX INFO: compiled from: CirclularEaseOutInterpolator.java */
/* JADX INFO: loaded from: classes3.dex */
public class InterpolatorC7818s implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f2) {
        float f3 = f2 - 1.0f;
        return (float) Math.sqrt(1.0f - (f3 * f3));
    }
}
