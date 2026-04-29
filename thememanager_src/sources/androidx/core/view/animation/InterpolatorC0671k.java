package androidx.core.view.animation;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.view.animation.Interpolator;

/* JADX INFO: renamed from: androidx.core.view.animation.k */
/* JADX INFO: compiled from: PathInterpolatorApi14.java */
/* JADX INFO: loaded from: classes.dex */
class InterpolatorC0671k implements Interpolator {

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final float f50752zy = 0.002f;

    /* JADX INFO: renamed from: k */
    private final float[] f3974k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final float[] f50753toq;

    InterpolatorC0671k(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int i2 = ((int) (length / 0.002f)) + 1;
        this.f3974k = new float[i2];
        this.f50753toq = new float[i2];
        float[] fArr = new float[2];
        for (int i3 = 0; i3 < i2; i3++) {
            pathMeasure.getPosTan((i3 * length) / (i2 - 1), fArr, null);
            this.f3974k[i3] = fArr[0];
            this.f50753toq[i3] = fArr[1];
        }
    }

    /* JADX INFO: renamed from: k */
    private static Path m3123k(float f2, float f3, float f4, float f5) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f2, f3, f4, f5, 1.0f, 1.0f);
        return path;
    }

    private static Path toq(float f2, float f3) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.quadTo(f2, f3, 1.0f, 1.0f);
        return path;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f2) {
        if (f2 <= 0.0f) {
            return 0.0f;
        }
        if (f2 >= 1.0f) {
            return 1.0f;
        }
        int i2 = 0;
        int length = this.f3974k.length - 1;
        while (length - i2 > 1) {
            int i3 = (i2 + length) / 2;
            if (f2 < this.f3974k[i3]) {
                length = i3;
            } else {
                i2 = i3;
            }
        }
        float[] fArr = this.f3974k;
        float f3 = fArr[length];
        float f4 = fArr[i2];
        float f5 = f3 - f4;
        if (f5 == 0.0f) {
            return this.f50753toq[i2];
        }
        float[] fArr2 = this.f50753toq;
        float f6 = fArr2[i2];
        return f6 + (((f2 - f4) / f5) * (fArr2[length] - f6));
    }

    InterpolatorC0671k(float f2, float f3) {
        this(toq(f2, f3));
    }

    InterpolatorC0671k(float f2, float f3, float f4, float f5) {
        this(m3123k(f2, f3, f4, f5));
    }
}
