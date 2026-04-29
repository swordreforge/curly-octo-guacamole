package zuf;

import android.view.animation.Interpolator;

/* JADX INFO: renamed from: zuf.q */
/* JADX INFO: compiled from: BounceEaseInInterpolator.java */
/* JADX INFO: loaded from: classes3.dex */
public class InterpolatorC7817q implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f2) {
        return 1.0f - new InterpolatorC7811g().getInterpolation(1.0f - f2);
    }
}
