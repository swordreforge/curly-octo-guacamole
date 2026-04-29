package zuf;

import android.view.animation.Interpolator;

/* JADX INFO: compiled from: QuarticEaseInOutInterpolator.java */
/* JADX INFO: loaded from: classes3.dex */
public class fu4 implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f2) {
        float f3 = f2 * 2.0f;
        if (f3 < 1.0f) {
            return 0.5f * f3 * f3 * f3 * f3;
        }
        float f4 = f3 - 2.0f;
        return ((((f4 * f4) * f4) * f4) - 2.0f) * (-0.5f);
    }
}
