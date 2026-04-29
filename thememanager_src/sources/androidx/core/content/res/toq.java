package androidx.core.content.res;

import android.graphics.Color;
import androidx.core.graphics.C0541p;
import zy.lvui;

/* JADX INFO: compiled from: CamUtils.java */
/* JADX INFO: loaded from: classes.dex */
final class toq {

    /* JADX INFO: renamed from: k */
    static final float[][] f3515k = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    static final float[][] f50419toq = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    static final float[] f50420zy = {95.047f, 100.0f, 108.883f};

    /* JADX INFO: renamed from: q */
    static final float[][] f3516q = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    private toq() {
    }

    static float f7l8(int i2) {
        float fM2348n = m2348n(Color.red(i2));
        float fM2348n2 = m2348n(Color.green(i2));
        float fM2348n3 = m2348n(Color.blue(i2));
        float[] fArr = f3516q[1];
        return (fM2348n * fArr[0]) + (fM2348n2 * fArr[1]) + (fM2348n3 * fArr[2]);
    }

    @lvui
    /* JADX INFO: renamed from: g */
    static float[] m2346g(int i2) {
        float fM2348n = m2348n(Color.red(i2));
        float fM2348n2 = m2348n(Color.green(i2));
        float fM2348n3 = m2348n(Color.blue(i2));
        float[][] fArr = f3516q;
        float[] fArr2 = fArr[0];
        float f2 = (fArr2[0] * fM2348n) + (fArr2[1] * fM2348n2) + (fArr2[2] * fM2348n3);
        float[] fArr3 = fArr[1];
        float f3 = (fArr3[0] * fM2348n) + (fArr3[1] * fM2348n2) + (fArr3[2] * fM2348n3);
        float[] fArr4 = fArr[2];
        return new float[]{f2, f3, (fM2348n * fArr4[0]) + (fM2348n2 * fArr4[1]) + (fM2348n3 * fArr4[2])};
    }

    /* JADX INFO: renamed from: k */
    static int m2347k(float f2) {
        if (f2 < 1.0f) {
            return -16777216;
        }
        if (f2 > 99.0f) {
            return -1;
        }
        float f3 = (f2 + 16.0f) / 116.0f;
        float f4 = (f2 > 8.0f ? 1 : (f2 == 8.0f ? 0 : -1)) > 0 ? f3 * f3 * f3 : f2 / 903.2963f;
        float f5 = f3 * f3 * f3;
        boolean z2 = f5 > 0.008856452f;
        float f6 = z2 ? f5 : ((f3 * 116.0f) - 16.0f) / 903.2963f;
        if (!z2) {
            f5 = ((f3 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f50420zy;
        return C0541p.f7l8(f6 * fArr[0], f4 * fArr[1], f5 * fArr[2]);
    }

    /* JADX INFO: renamed from: n */
    static float m2348n(int i2) {
        float f2 = i2 / 255.0f;
        return (f2 <= 0.04045f ? f2 / 12.92f : (float) Math.pow((f2 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    /* JADX INFO: renamed from: q */
    static float m2349q(float f2, float f3, float f4) {
        return f2 + ((f3 - f2) * f4);
    }

    static float toq(int i2) {
        return zy(f7l8(i2));
    }

    /* JADX INFO: renamed from: y */
    static float m2350y(float f2) {
        return (f2 > 8.0f ? (float) Math.pow((((double) f2) + 16.0d) / 116.0d, 3.0d) : f2 / 903.2963f) * 100.0f;
    }

    static float zy(float f2) {
        float f3 = f2 / 100.0f;
        return f3 <= 0.008856452f ? f3 * 903.2963f : (((float) Math.cbrt(f3)) * 116.0f) - 16.0f;
    }
}
