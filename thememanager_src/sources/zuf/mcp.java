package zuf;

import android.view.animation.Interpolator;

/* JADX INFO: compiled from: SineEaseInInterpolator.java */
/* JADX INFO: loaded from: classes3.dex */
public class mcp implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f2) {
        return (-((float) Math.cos(((double) f2) * 1.5707963267948966d))) + 1.0f;
    }
}
