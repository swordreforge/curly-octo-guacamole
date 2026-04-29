package zuf;

import android.view.animation.Interpolator;

/* JADX INFO: compiled from: BackEaseInOutInterpolator.java */
/* JADX INFO: loaded from: classes3.dex */
public class toq implements Interpolator {

    /* JADX INFO: renamed from: k */
    private final float f46078k;

    public toq() {
        this(0.0f);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f2) {
        float f3 = this.f46078k;
        if (f3 == 0.0f) {
            f3 = 1.70158f;
        }
        float f4 = f2 * 2.0f;
        if (f4 < 1.0f) {
            float f5 = (float) (((double) f3) * 1.525d);
            return f4 * f4 * (((1.0f + f5) * f4) - f5) * 0.5f;
        }
        float f6 = f4 - 2.0f;
        float f7 = (float) (((double) f3) * 1.525d);
        return ((f6 * f6 * (((1.0f + f7) * f6) + f7)) + 2.0f) * 0.5f;
    }

    public toq(float f2) {
        this.f46078k = f2;
    }
}
