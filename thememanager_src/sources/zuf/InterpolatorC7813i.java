package zuf;

import android.view.animation.Interpolator;

/* JADX INFO: renamed from: zuf.i */
/* JADX INFO: compiled from: QuadraticEaseInInterpolator.java */
/* JADX INFO: loaded from: classes3.dex */
public class InterpolatorC7813i implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f2) {
        return f2 * f2;
    }
}
