package zuf;

import android.view.animation.Interpolator;

/* JADX INFO: compiled from: CirclularEaseInInterpolator.java */
/* JADX INFO: loaded from: classes3.dex */
public class f7l8 implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f2) {
        return -((float) (Math.sqrt(1.0f - (f2 * f2)) - 1.0d));
    }
}
