package zuf;

import android.view.animation.Interpolator;

/* JADX INFO: compiled from: ExponentialEaseInOutInterpolator.java */
/* JADX INFO: loaded from: classes3.dex */
public class cdj implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        if (f2 == 1.0f) {
            return 1.0f;
        }
        return ((float) (f2 * 2.0f < 1.0f ? Math.pow(2.0d, (r6 - 1.0f) * 10.0f) : (-Math.pow(2.0d, (r6 - 1.0f) * (-10.0f))) + 2.0d)) * 0.5f;
    }
}
