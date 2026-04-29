package zuf;

import android.view.animation.Interpolator;

/* JADX INFO: compiled from: QuarticEaseInInterpolator.java */
/* JADX INFO: loaded from: classes3.dex */
public class ni7 implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f2) {
        return f2 * f2 * f2 * f2;
    }
}
