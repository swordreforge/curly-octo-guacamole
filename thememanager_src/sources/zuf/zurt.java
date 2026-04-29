package zuf;

import android.view.animation.Interpolator;

/* JADX INFO: compiled from: QuadraticEaseOutInterpolator.java */
/* JADX INFO: loaded from: classes3.dex */
public class zurt implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f2) {
        return (-f2) * (f2 - 2.0f);
    }
}
