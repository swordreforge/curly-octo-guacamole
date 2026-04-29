package zuf;

import android.view.animation.Interpolator;

/* JADX INFO: compiled from: SineEaseOutInterpolator.java */
/* JADX INFO: loaded from: classes3.dex */
public class a9 implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f2) {
        return (float) Math.sin(((double) f2) * 1.5707963267948966d);
    }
}
