package zuf;

import android.view.animation.Interpolator;

/* JADX INFO: renamed from: zuf.h */
/* JADX INFO: compiled from: ExponentialEaseInInterpolator.java */
/* JADX INFO: loaded from: classes3.dex */
public class InterpolatorC7812h implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        return (float) Math.pow(2.0d, (f2 - 1.0f) * 10.0f);
    }
}
