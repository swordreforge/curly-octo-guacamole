package zuf;

import android.view.animation.Interpolator;

/* JADX INFO: compiled from: ElasticEaseInOutInterpolator.java */
/* JADX INFO: loaded from: classes3.dex */
public class n7h implements Interpolator {

    /* JADX INFO: renamed from: k */
    private final float f46076k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final float f100815toq;

    public n7h() {
        this(0.0f, 0.0f);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f2) {
        float fAsin;
        float f3 = this.f100815toq;
        float f4 = this.f46076k;
        if (f2 == 0.0f) {
            return 0.0f;
        }
        float f5 = f2 / 0.5f;
        if (f5 == 2.0f) {
            return 1.0f;
        }
        if (f3 == 0.0f) {
            f3 = 0.45000002f;
        }
        if (f4 == 0.0f || f4 < 1.0f) {
            fAsin = f3 / 4.0f;
            f4 = 1.0f;
        } else {
            fAsin = (float) ((((double) f3) / 6.283185307179586d) * Math.asin(1.0f / f4));
        }
        if (f5 < 1.0f) {
            return ((float) (((double) f4) * Math.pow(2.0d, 10.0f * r14) * Math.sin((((double) ((f5 - 1.0f) - fAsin)) * 6.283185307179586d) / ((double) f3)))) * (-0.5f);
        }
        return (float) ((((double) f4) * Math.pow(2.0d, (-10.0f) * r14) * Math.sin((((double) ((f5 - 1.0f) - fAsin)) * 6.283185307179586d) / ((double) f3)) * 0.5d) + 1.0d);
    }

    public n7h(float f2, float f3) {
        this.f46076k = f2;
        this.f100815toq = f3;
    }
}
