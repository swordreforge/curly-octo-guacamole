package zuf;

import android.view.animation.Interpolator;

/* JADX INFO: compiled from: BackEaseOutInterpolator.java */
/* JADX INFO: loaded from: classes3.dex */
public class zy implements Interpolator {

    /* JADX INFO: renamed from: k */
    private final float f46079k;

    public zy() {
        this(0.0f);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f2) {
        float f3 = this.f46079k;
        if (f3 == 0.0f) {
            f3 = 1.70158f;
        }
        float f4 = f2 - 1.0f;
        return (f4 * f4 * (((f3 + 1.0f) * f4) + f3)) + 1.0f;
    }

    public zy(float f2) {
        this.f46079k = f2;
    }
}
