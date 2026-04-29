package zuf;

import android.view.animation.Interpolator;

/* JADX INFO: compiled from: CubicEaseOutInterpolator.java */
/* JADX INFO: loaded from: classes3.dex */
public class x2 implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f2) {
        float f3 = f2 - 1.0f;
        return (f3 * f3 * f3) + 1.0f;
    }
}
