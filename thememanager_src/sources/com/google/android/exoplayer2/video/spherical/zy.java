package com.google.android.exoplayer2.video.spherical;

import android.opengl.Matrix;
import com.google.android.exoplayer2.util.ncyb;

/* JADX INFO: compiled from: FrameRotationQueue.java */
/* JADX INFO: loaded from: classes2.dex */
final class zy {

    /* JADX INFO: renamed from: q */
    private boolean f23562q;

    /* JADX INFO: renamed from: k */
    private final float[] f23561k = new float[16];

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final float[] f67223toq = new float[16];

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final ncyb<float[]> f67224zy = new ncyb<>();

    /* JADX INFO: renamed from: k */
    public static void m13860k(float[] fArr, float[] fArr2) {
        Matrix.setIdentityM(fArr, 0);
        float f2 = fArr2[10];
        float f3 = fArr2[8];
        float fSqrt = (float) Math.sqrt((f2 * f2) + (f3 * f3));
        float f4 = fArr2[10];
        fArr[0] = f4 / fSqrt;
        float f5 = fArr2[8];
        fArr[2] = f5 / fSqrt;
        fArr[8] = (-f5) / fSqrt;
        fArr[10] = f4 / fSqrt;
    }

    private static void toq(float[] fArr, float[] fArr2) {
        float f2 = fArr2[0];
        float f3 = -fArr2[1];
        float f4 = -fArr2[2];
        float length = Matrix.length(f2, f3, f4);
        if (length != 0.0f) {
            Matrix.setRotateM(fArr, 0, (float) Math.toDegrees(length), f2 / length, f3 / length, f4 / length);
        } else {
            Matrix.setIdentityM(fArr, 0);
        }
    }

    /* JADX INFO: renamed from: n */
    public void m13861n(long j2, float[] fArr) {
        this.f67224zy.m13695k(j2, fArr);
    }

    /* JADX INFO: renamed from: q */
    public void m13862q() {
        this.f67224zy.zy();
        this.f23562q = false;
    }

    public boolean zy(float[] fArr, long j2) {
        float[] fArrM13696p = this.f67224zy.m13696p(j2);
        if (fArrM13696p == null) {
            return false;
        }
        toq(this.f67223toq, fArrM13696p);
        if (!this.f23562q) {
            m13860k(this.f23561k, this.f67223toq);
            this.f23562q = true;
        }
        Matrix.multiplyMM(fArr, 0, this.f23561k, 0, this.f67223toq, 0);
        return true;
    }
}
