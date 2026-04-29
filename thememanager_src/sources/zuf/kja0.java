package zuf;

import android.view.animation.Interpolator;

/* JADX INFO: compiled from: ElasticEaseOutInterpolator.java */
/* JADX INFO: loaded from: classes3.dex */
public class kja0 implements Interpolator {

    /* JADX INFO: renamed from: k */
    private final float f46075k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final float f100814toq;

    public kja0() {
        this(0.0f, 0.0f);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f2) {
        float fAsin;
        float f3 = this.f100814toq;
        float f4 = this.f46075k;
        if (f2 == 0.0f) {
            return 0.0f;
        }
        if (f2 == 1.0f) {
            return 1.0f;
        }
        if (f3 == 0.0f) {
            f3 = 0.3f;
        }
        if (f4 == 0.0f || f4 < 1.0f) {
            fAsin = f3 / 4.0f;
            f4 = 1.0f;
        } else {
            fAsin = (float) ((((double) f3) / 6.283185307179586d) * Math.asin(1.0f / f4));
        }
        return (float) ((((double) f4) * Math.pow(2.0d, (-10.0f) * f2) * Math.sin((((double) (f2 - fAsin)) * 6.283185307179586d) / ((double) f3))) + 1.0d);
    }

    public kja0(float f2, float f3) {
        this.f46075k = f2;
        this.f100814toq = f3;
    }
}
