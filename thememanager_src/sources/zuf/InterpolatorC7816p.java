package zuf;

import android.view.animation.Interpolator;

/* JADX INFO: renamed from: zuf.p */
/* JADX INFO: compiled from: CubicEaseInInterpolator.java */
/* JADX INFO: loaded from: classes3.dex */
public class InterpolatorC7816p implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f2) {
        return f2 * f2 * f2;
    }
}
