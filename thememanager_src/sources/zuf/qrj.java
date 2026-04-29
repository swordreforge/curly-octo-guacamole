package zuf;

import android.view.animation.Interpolator;

/* JADX INFO: compiled from: ElasticEaseInInterpolator.java */
/* JADX INFO: loaded from: classes3.dex */
public class qrj implements Interpolator {

    /* JADX INFO: renamed from: k */
    private final float f46077k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final float f100816toq;

    public qrj() {
        this(0.0f, 0.0f);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f2) {
        float fAsin;
        float f3 = this.f100816toq;
        float f4 = this.f46077k;
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
        return -((float) (((double) f4) * Math.pow(2.0d, 10.0f * r13) * Math.sin((((double) ((f2 - 1.0f) - fAsin)) * 6.283185307179586d) / ((double) f3))));
    }

    public qrj(float f2, float f3) {
        this.f46077k = f2;
        this.f100816toq = f3;
    }
}
