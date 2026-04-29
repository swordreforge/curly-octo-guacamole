package zuf;

import android.view.animation.Interpolator;

/* JADX INFO: compiled from: SineEaseInOutInterpolator.java */
/* JADX INFO: loaded from: classes3.dex */
public class jk implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f2) {
        return ((float) (Math.cos(((double) f2) * 3.141592653589793d) - 1.0d)) * (-0.5f);
    }
}
