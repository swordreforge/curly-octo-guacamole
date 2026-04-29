package zuf;

import android.view.animation.Interpolator;

/* JADX INFO: renamed from: zuf.k */
/* JADX INFO: compiled from: BackEaseInInterpolator.java */
/* JADX INFO: loaded from: classes3.dex */
public class InterpolatorC7814k implements Interpolator {

    /* JADX INFO: renamed from: k */
    private final float f46074k;

    public InterpolatorC7814k() {
        this(0.0f);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f2) {
        float f3 = this.f46074k;
        if (f3 == 0.0f) {
            f3 = 1.70158f;
        }
        return f2 * f2 * (((1.0f + f3) * f2) - f3);
    }

    public InterpolatorC7814k(float f2) {
        this.f46074k = f2;
    }
}
