package zuf;

import android.view.animation.Interpolator;

/* JADX INFO: renamed from: zuf.n */
/* JADX INFO: compiled from: BounceEaseInOutInterpolator.java */
/* JADX INFO: loaded from: classes3.dex */
public class InterpolatorC7815n implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f2) {
        return f2 < 0.5f ? new InterpolatorC7817q().getInterpolation(f2 * 2.0f) * 0.5f : (new InterpolatorC7811g().getInterpolation((f2 * 2.0f) - 1.0f) * 0.5f) + 0.5f;
    }
}
