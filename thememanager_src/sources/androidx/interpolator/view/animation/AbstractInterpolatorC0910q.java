package androidx.interpolator.view.animation;

import android.view.animation.Interpolator;

/* JADX INFO: renamed from: androidx.interpolator.view.animation.q */
/* JADX INFO: compiled from: LookupTableInterpolator.java */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractInterpolatorC0910q implements Interpolator {

    /* JADX INFO: renamed from: k */
    private final float[] f4998k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final float f51557toq;

    protected AbstractInterpolatorC0910q(float[] fArr) {
        this.f4998k = fArr;
        this.f51557toq = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f2) {
        if (f2 >= 1.0f) {
            return 1.0f;
        }
        if (f2 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f4998k;
        int iMin = Math.min((int) ((fArr.length - 1) * f2), fArr.length - 2);
        float f3 = this.f51557toq;
        float f4 = (f2 - (iMin * f3)) / f3;
        float[] fArr2 = this.f4998k;
        float f5 = fArr2[iMin];
        return f5 + (f4 * (fArr2[iMin + 1] - f5));
    }
}
