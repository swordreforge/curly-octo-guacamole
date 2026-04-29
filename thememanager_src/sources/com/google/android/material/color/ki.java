package com.google.android.material.color;

/* JADX INFO: compiled from: ViewingConditions.java */
/* JADX INFO: loaded from: classes2.dex */
final class ki {

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    public static final ki f67489ld6 = ld6(f7l8.n7h(), (float) ((((double) f7l8.m14259h(50.0f)) * 63.66197723675813d) / 100.0d), 50.0f, 2.0f, false);

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private final float[] f67490f7l8;

    /* JADX INFO: renamed from: g */
    private final float f24177g;

    /* JADX INFO: renamed from: k */
    private final float f24178k;

    /* JADX INFO: renamed from: n */
    private final float f24179n;

    /* JADX INFO: renamed from: p */
    private final float f24180p;

    /* JADX INFO: renamed from: q */
    private final float f24181q;

    /* JADX INFO: renamed from: s */
    private final float f24182s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final float f67491toq;

    /* JADX INFO: renamed from: y */
    private final float f24183y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final float f67492zy;

    private ki(float f2, float f3, float f4, float f5, float f6, float f7, float[] fArr, float f8, float f9, float f10) {
        this.f24177g = f2;
        this.f24178k = f3;
        this.f67491toq = f4;
        this.f67492zy = f5;
        this.f24181q = f6;
        this.f24179n = f7;
        this.f67490f7l8 = fArr;
        this.f24183y = f8;
        this.f24182s = f9;
        this.f24180p = f10;
    }

    static ki ld6(float[] fArr, float f2, float f3, float f4, boolean z2) {
        float[][] fArr2 = toq.f24245p;
        float f5 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f6 = fArr3[0] * f5;
        float f7 = fArr[1];
        float f8 = f6 + (fArr3[1] * f7);
        float f9 = fArr[2];
        float f10 = f8 + (fArr3[2] * f9);
        float[] fArr4 = fArr2[1];
        float f11 = (fArr4[0] * f5) + (fArr4[1] * f7) + (fArr4[2] * f9);
        float[] fArr5 = fArr2[2];
        float f12 = (f5 * fArr5[0]) + (f7 * fArr5[1]) + (f9 * fArr5[2]);
        float f13 = (f4 / 10.0f) + 0.8f;
        float fZy = ((double) f13) >= 0.9d ? C3982h.zy(0.59f, 0.69f, (f13 - 0.9f) * 10.0f) : C3982h.zy(0.525f, 0.59f, (f13 - 0.8f) * 10.0f);
        float fExp = z2 ? 1.0f : (1.0f - (((float) Math.exp(((-f2) - 42.0f) / 92.0f)) * 0.2777778f)) * f13;
        double d2 = fExp;
        if (d2 > 1.0d) {
            fExp = 1.0f;
        } else if (d2 < 0.0d) {
            fExp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f10) * fExp) + 1.0f) - fExp, (((100.0f / f11) * fExp) + 1.0f) - fExp, (((100.0f / f12) * fExp) + 1.0f) - fExp};
        float f14 = 1.0f / ((5.0f * f2) + 1.0f);
        float f15 = f14 * f14 * f14 * f14;
        float f16 = 1.0f - f15;
        float fCbrt = (f15 * f2) + (0.1f * f16 * f16 * ((float) Math.cbrt(((double) f2) * 5.0d)));
        float fM14259h = f7l8.m14259h(f3) / fArr[1];
        double d4 = fM14259h;
        float fSqrt = ((float) Math.sqrt(d4)) + 1.48f;
        float fPow = 0.725f / ((float) Math.pow(d4, 0.2d));
        float fPow2 = (float) Math.pow(((double) ((fArr6[2] * fCbrt) * f12)) / 100.0d, 0.42d);
        float[] fArr7 = {(float) Math.pow(((double) ((fArr6[0] * fCbrt) * f10)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[1] * fCbrt) * f11)) / 100.0d, 0.42d), fPow2};
        float f17 = fArr7[0];
        float f18 = (f17 * 400.0f) / (f17 + 27.13f);
        float f19 = fArr7[1];
        return new ki(fM14259h, ((f18 * 2.0f) + ((f19 * 400.0f) / (f19 + 27.13f)) + (((400.0f * fPow2) / (fPow2 + 27.13f)) * 0.05f)) * fPow, fPow, fPow, fZy, f13, fArr6, fCbrt, (float) Math.pow(fCbrt, 0.25d), fSqrt);
    }

    float f7l8() {
        return this.f24179n;
    }

    /* JADX INFO: renamed from: g */
    public float m14274g() {
        return this.f67491toq;
    }

    /* JADX INFO: renamed from: k */
    public float m14275k() {
        return this.f24178k;
    }

    /* JADX INFO: renamed from: n */
    public float m14276n() {
        return this.f24177g;
    }

    /* JADX INFO: renamed from: p */
    float m14277p() {
        return this.f24180p;
    }

    /* JADX INFO: renamed from: q */
    public float m14278q() {
        return this.f24182s;
    }

    /* JADX INFO: renamed from: s */
    public float[] m14279s() {
        return this.f67490f7l8;
    }

    float toq() {
        return this.f24181q;
    }

    /* JADX INFO: renamed from: y */
    float m14280y() {
        return this.f67492zy;
    }

    float zy() {
        return this.f24183y;
    }
}
