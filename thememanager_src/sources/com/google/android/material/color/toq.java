package com.google.android.material.color;

/* JADX INFO: compiled from: Cam16.java */
/* JADX INFO: loaded from: classes2.dex */
final class toq {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private final float f67545f7l8;

    /* JADX INFO: renamed from: g */
    private final float f24246g;

    /* JADX INFO: renamed from: k */
    private final float f24247k;

    /* JADX INFO: renamed from: n */
    private final float f24248n;

    /* JADX INFO: renamed from: q */
    private final float f24249q;

    /* JADX INFO: renamed from: s */
    private final float f24250s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final float f67546toq;

    /* JADX INFO: renamed from: y */
    private final float f24251y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final float f67547zy;

    /* JADX INFO: renamed from: p */
    static final float[][] f24245p = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    static final float[][] f67544ld6 = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    private toq(float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10) {
        this.f24247k = f2;
        this.f67546toq = f3;
        this.f67547zy = f4;
        this.f24249q = f5;
        this.f24248n = f6;
        this.f24246g = f7;
        this.f67545f7l8 = f8;
        this.f24251y = f9;
        this.f24250s = f10;
    }

    public static toq f7l8(float f2, float f3, float f4, ki kiVar) {
        double d2 = f3;
        double d4 = f4;
        double dExpm1 = (Math.expm1(Math.hypot(d2, d4) * 0.02280000038444996d) / 0.02280000038444996d) / ((double) kiVar.m14278q());
        double dAtan2 = Math.atan2(d4, d2) * 57.29577951308232d;
        if (dAtan2 < 0.0d) {
            dAtan2 += 360.0d;
        }
        return m14338n(f2 / (1.0f - ((f2 - 100.0f) * 0.007f)), (float) dExpm1, (float) dAtan2, kiVar);
    }

    /* JADX INFO: renamed from: g */
    public static toq m14337g(float f2, float f3, float f4) {
        return f7l8(f2, f3, f4, ki.f67489ld6);
    }

    /* JADX INFO: renamed from: n */
    private static toq m14338n(float f2, float f3, float f4, ki kiVar) {
        float qVar = (4.0f / kiVar.toq()) * ((float) Math.sqrt(((double) f2) / 100.0d)) * (kiVar.m14275k() + 4.0f) * kiVar.m14278q();
        float fM14278q = f3 * kiVar.m14278q();
        float fSqrt = ((float) Math.sqrt(((f3 / ((float) Math.sqrt(r4))) * kiVar.toq()) / (kiVar.m14275k() + 4.0f))) * 50.0f;
        float f5 = (1.7f * f2) / ((0.007f * f2) + 1.0f);
        float fLog1p = ((float) Math.log1p(((double) fM14278q) * 0.0228d)) * 43.85965f;
        double d2 = (3.1415927f * f4) / 180.0f;
        return new toq(f4, f3, f2, qVar, fM14278q, fSqrt, f5, fLog1p * ((float) Math.cos(d2)), fLog1p * ((float) Math.sin(d2)));
    }

    /* JADX INFO: renamed from: q */
    static toq m14339q(float f2, float f3, float f4) {
        return m14338n(f2, f3, f4, ki.f67489ld6);
    }

    public static toq toq(int i2) {
        return zy(i2, ki.f67489ld6);
    }

    static toq zy(int i2, ki kiVar) {
        float fLd6 = f7l8.ld6(((16711680 & i2) >> 16) / 255.0f) * 100.0f;
        float fLd62 = f7l8.ld6(((65280 & i2) >> 8) / 255.0f) * 100.0f;
        float fLd63 = f7l8.ld6((i2 & 255) / 255.0f) * 100.0f;
        float f2 = (0.41233894f * fLd6) + (0.35762063f * fLd62) + (0.18051042f * fLd63);
        float f3 = (0.2126f * fLd6) + (0.7152f * fLd62) + (0.0722f * fLd63);
        float f4 = (fLd6 * 0.01932141f) + (fLd62 * 0.11916382f) + (fLd63 * 0.9503448f);
        float[][] fArr = f24245p;
        float[] fArr2 = fArr[0];
        float f5 = (fArr2[0] * f2) + (fArr2[1] * f3) + (fArr2[2] * f4);
        float[] fArr3 = fArr[1];
        float f6 = (fArr3[0] * f2) + (fArr3[1] * f3) + (fArr3[2] * f4);
        float[] fArr4 = fArr[2];
        float f7 = (f2 * fArr4[0]) + (f3 * fArr4[1]) + (f4 * fArr4[2]);
        float f8 = kiVar.m14279s()[0] * f5;
        float f9 = kiVar.m14279s()[1] * f6;
        float f10 = kiVar.m14279s()[2] * f7;
        float fPow = (float) Math.pow(((double) (kiVar.zy() * Math.abs(f8))) / 100.0d, 0.42d);
        float fPow2 = (float) Math.pow(((double) (kiVar.zy() * Math.abs(f9))) / 100.0d, 0.42d);
        float fPow3 = (float) Math.pow(((double) (kiVar.zy() * Math.abs(f10))) / 100.0d, 0.42d);
        float fSignum = ((Math.signum(f8) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f9) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f10) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d2 = fSignum3;
        float f11 = ((float) (((((double) fSignum) * 11.0d) + (((double) fSignum2) * (-12.0d))) + d2)) / 11.0f;
        float f12 = ((float) (((double) (fSignum + fSignum2)) - (d2 * 2.0d))) / 9.0f;
        float f13 = fSignum2 * 20.0f;
        float f14 = (((fSignum * 20.0f) + f13) + (21.0f * fSignum3)) / 20.0f;
        float f15 = (((fSignum * 40.0f) + f13) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f12, f11)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f16 = (3.1415927f * fAtan2) / 180.0f;
        float fPow4 = ((float) Math.pow((f15 * kiVar.m14274g()) / kiVar.m14275k(), kiVar.toq() * kiVar.m14277p())) * 100.0f;
        float qVar = (4.0f / kiVar.toq()) * ((float) Math.sqrt(fPow4 / 100.0f)) * (kiVar.m14275k() + 4.0f) * kiVar.m14278q();
        float fPow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, kiVar.m14276n()), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(Math.toRadians(((double) fAtan2) < 20.14d ? 360.0f + fAtan2 : fAtan2) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * kiVar.f7l8()) * kiVar.m14280y()) * ((float) Math.hypot(r5, r1))) / (f14 + 0.305f), 0.9d)) * ((float) Math.sqrt(((double) fPow4) / 100.0d));
        float fM14278q = fPow5 * kiVar.m14278q();
        float fSqrt = ((float) Math.sqrt((r1 * kiVar.toq()) / (kiVar.m14275k() + 4.0f))) * 50.0f;
        float f17 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog1p = ((float) Math.log1p(0.0228f * fM14278q)) * 43.85965f;
        double d4 = f16;
        return new toq(fAtan2, fPow5, fPow4, qVar, fM14278q, fSqrt, f17, fLog1p * ((float) Math.cos(d4)), fLog1p * ((float) Math.sin(d4)));
    }

    public float cdj() {
        return this.f24246g;
    }

    /* JADX INFO: renamed from: h */
    public float m14340h() {
        return this.f24249q;
    }

    /* JADX INFO: renamed from: k */
    float m14341k(toq toqVar) {
        float fN7h = n7h() - toqVar.n7h();
        float fM14344y = m14344y() - toqVar.m14344y();
        float fM14343s = m14343s() - toqVar.m14343s();
        return (float) (Math.pow(Math.sqrt((fN7h * fN7h) + (fM14344y * fM14344y) + (fM14343s * fM14343s)), 0.63d) * 1.41d);
    }

    int ki(ki kiVar) {
        float fPow = (float) Math.pow(((double) ((((double) m14342p()) == 0.0d || ((double) qrj()) == 0.0d) ? 0.0f : m14342p() / ((float) Math.sqrt(((double) qrj()) / 100.0d)))) / Math.pow(1.64d - Math.pow(0.29d, kiVar.m14276n()), 0.73d), 1.1111111111111112d);
        double dLd6 = (ld6() * 3.1415927f) / 180.0f;
        float fCos = ((float) (Math.cos(2.0d + dLd6) + 3.8d)) * 0.25f;
        float fM14275k = kiVar.m14275k() * ((float) Math.pow(((double) qrj()) / 100.0d, (1.0d / ((double) kiVar.toq())) / ((double) kiVar.m14277p())));
        float fF7l8 = fCos * 3846.1538f * kiVar.f7l8() * kiVar.m14280y();
        float fM14274g = fM14275k / kiVar.m14274g();
        float fSin = (float) Math.sin(dLd6);
        float fCos2 = (float) Math.cos(dLd6);
        float f2 = (((0.305f + fM14274g) * 23.0f) * fPow) / (((fF7l8 * 23.0f) + ((11.0f * fPow) * fCos2)) + ((fPow * 108.0f) * fSin));
        float f3 = fCos2 * f2;
        float f4 = f2 * fSin;
        float f5 = fM14274g * 460.0f;
        float f6 = (((451.0f * f3) + f5) + (288.0f * f4)) / 1403.0f;
        float f7 = ((f5 - (891.0f * f3)) - (261.0f * f4)) / 1403.0f;
        float fSignum = Math.signum(f6) * (100.0f / kiVar.zy()) * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f6)) * 27.13d) / (400.0d - ((double) Math.abs(f6)))), 2.380952380952381d));
        float fSignum2 = Math.signum(f7) * (100.0f / kiVar.zy()) * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f7)) * 27.13d) / (400.0d - ((double) Math.abs(f7)))), 2.380952380952381d));
        float fSignum3 = Math.signum(((f5 - (f3 * 220.0f)) - (f4 * 6300.0f)) / 1403.0f) * (100.0f / kiVar.zy()) * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(r6)) * 27.13d) / (400.0d - ((double) Math.abs(r6)))), 2.380952380952381d));
        float f8 = fSignum / kiVar.m14279s()[0];
        float f9 = fSignum2 / kiVar.m14279s()[1];
        float f10 = fSignum3 / kiVar.m14279s()[2];
        float[][] fArr = f67544ld6;
        float[] fArr2 = fArr[0];
        float f11 = (fArr2[0] * f8) + (fArr2[1] * f9) + (fArr2[2] * f10);
        float[] fArr3 = fArr[1];
        float f12 = (fArr3[0] * f8) + (fArr3[1] * f9) + (fArr3[2] * f10);
        float[] fArr4 = fArr[2];
        return f7l8.m14264s(f11, f12, (f8 * fArr4[0]) + (f9 * fArr4[1]) + (f10 * fArr4[2]));
    }

    public float kja0() {
        return this.f24248n;
    }

    public float ld6() {
        return this.f24247k;
    }

    public float n7h() {
        return this.f67545f7l8;
    }

    /* JADX INFO: renamed from: p */
    public float m14342p() {
        return this.f67546toq;
    }

    public float qrj() {
        return this.f67547zy;
    }

    /* JADX INFO: renamed from: s */
    public float m14343s() {
        return this.f24250s;
    }

    public int x2() {
        return ki(ki.f67489ld6);
    }

    /* JADX INFO: renamed from: y */
    public float m14344y() {
        return this.f24251y;
    }
}
