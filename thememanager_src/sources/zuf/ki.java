package zuf;

import android.view.animation.Interpolator;

/* JADX INFO: compiled from: ExponentialEaseOutInterpolator.java */
/* JADX INFO: loaded from: classes3.dex */
public class ki implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f2) {
        if (f2 == 1.0f) {
            return 1.0f;
        }
        return (float) ((-Math.pow(2.0d, f2 * (-10.0f))) + 1.0d);
    }
}
