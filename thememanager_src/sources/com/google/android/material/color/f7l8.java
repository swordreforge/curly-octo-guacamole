package com.google.android.material.color;

import com.android.thememanager.share.C2706p;
import java.util.Arrays;

/* JADX INFO: compiled from: ColorUtils.java */
/* JADX INFO: loaded from: classes2.dex */
final class f7l8 {

    /* JADX INFO: renamed from: k */
    private static final float[] f24173k = {95.047f, 100.0f, 108.883f};

    private f7l8() {
    }

    public static int f7l8(int i2, int i3, int i4) {
        return (((((i2 & 255) << 16) | (-16777216)) | ((i3 & 255) << 8)) | (i4 & 255)) >>> 0;
    }

    /* JADX INFO: renamed from: g */
    public static int m14258g(float f2) {
        float f3 = (f2 + 16.0f) / 116.0f;
        float f4 = f3 * f3 * f3;
        boolean z2 = f4 > 0.008856452f;
        float f5 = (f2 > 8.0f ? 1 : (f2 == 8.0f ? 0 : -1)) > 0 ? f4 : f2 / 903.2963f;
        float f6 = z2 ? f4 : ((f3 * 116.0f) - 16.0f) / 903.2963f;
        if (!z2) {
            f4 = ((f3 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f24173k;
        return m14265y(new float[]{f6 * fArr[0], f5 * fArr[1], f4 * fArr[2]});
    }

    /* JADX INFO: renamed from: h */
    public static float m14259h(float f2) {
        return (f2 > 8.0f ? (float) Math.pow((((double) f2) + 16.0d) / 116.0d, 3.0d) : f2 / 903.2963f) * 100.0f;
    }

    /* JADX INFO: renamed from: k */
    public static int m14260k(int i2) {
        return i2 & 255;
    }

    public static float[] kja0(int i2) {
        float fLd6 = ld6(qrj(i2) / 255.0f) * 100.0f;
        float fLd62 = ld6(zy(i2) / 255.0f) * 100.0f;
        float fLd63 = ld6(m14260k(i2) / 255.0f) * 100.0f;
        return new float[]{(0.41233894f * fLd6) + (0.35762063f * fLd62) + (0.18051042f * fLd63), (0.2126f * fLd6) + (0.7152f * fLd62) + (0.0722f * fLd63), (fLd6 * 0.01932141f) + (fLd62 * 0.11916382f) + (fLd63 * 0.9503448f)};
    }

    public static float ld6(float f2) {
        return f2 <= 0.04045f ? f2 / 12.92f : (float) Math.pow((f2 + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    /* JADX INFO: renamed from: n */
    public static int m14261n(double d2, double d4, double d5) {
        double d6 = (d2 + 16.0d) / 116.0d;
        double d7 = (d4 / 500.0d) + d6;
        double d8 = d6 - (d5 / 200.0d);
        double d9 = d7 * d7 * d7;
        if (d9 <= 0.008856451679035631d) {
            d9 = ((d7 * 116.0d) - 16.0d) / 903.2962962962963d;
        }
        double d10 = d2 > 8.0d ? d6 * d6 * d6 : d2 / 903.2962962962963d;
        double d11 = d8 * d8 * d8;
        if (d11 <= 0.008856451679035631d) {
            d11 = ((d8 * 116.0d) - 16.0d) / 903.2962962962963d;
        }
        float[] fArr = f24173k;
        return m14264s((float) (d9 * ((double) fArr[0])), (float) (d10 * ((double) fArr[1])), (float) (d11 * ((double) fArr[2])));
    }

    public static final float[] n7h() {
        return Arrays.copyOf(f24173k, 3);
    }

    /* JADX INFO: renamed from: p */
    public static double[] m14262p(int i2) {
        float[] fArrKja0 = kja0(i2);
        float f2 = fArrKja0[1];
        float[] fArr = f24173k;
        double d2 = f2 / fArr[1];
        double dCbrt = d2 > 0.008856451679035631d ? Math.cbrt(d2) : ((d2 * 903.2962962962963d) + 16.0d) / 116.0d;
        double d4 = fArrKja0[0] / fArr[0];
        double dCbrt2 = d4 > 0.008856451679035631d ? Math.cbrt(d4) : ((d4 * 903.2962962962963d) + 16.0d) / 116.0d;
        double d5 = fArrKja0[2] / fArr[2];
        return new double[]{(116.0d * dCbrt) - 16.0d, (dCbrt2 - dCbrt) * 500.0d, (dCbrt - (d5 > 0.008856451679035631d ? Math.cbrt(d5) : ((d5 * 903.2962962962963d) + 16.0d) / 116.0d)) * 200.0d};
    }

    /* JADX INFO: renamed from: q */
    public static String m14263q(int i2) {
        return String.format("#%02x%02x%02x", Integer.valueOf(qrj(i2)), Integer.valueOf(zy(i2)), Integer.valueOf(m14260k(i2)));
    }

    public static int qrj(int i2) {
        return (i2 & C2706p.f61107fn3e) >> 16;
    }

    /* JADX INFO: renamed from: s */
    public static int m14264s(float f2, float f3, float f4) {
        float f5 = f2 / 100.0f;
        float f6 = f3 / 100.0f;
        float f7 = f4 / 100.0f;
        float f8 = (3.2406f * f5) + ((-1.5372f) * f6) + ((-0.4986f) * f7);
        float f9 = ((-0.9689f) * f5) + (1.8758f * f6) + (0.0415f * f7);
        float f10 = (f5 * 0.0557f) + (f6 * (-0.204f)) + (f7 * 1.057f);
        return f7l8(Math.max(Math.min(255, Math.round(toq(f8) * 255.0f)), 0), Math.max(Math.min(255, Math.round(toq(f9) * 255.0f)), 0), Math.max(Math.min(255, Math.round(toq(f10) * 255.0f)), 0));
    }

    public static float toq(float f2) {
        return f2 <= 0.0031308f ? f2 * 12.92f : (((float) Math.pow(f2, 0.4166666567325592d)) * 1.055f) - 0.055f;
    }

    public static float x2(int i2) {
        return (float) m14262p(i2)[0];
    }

    /* JADX INFO: renamed from: y */
    public static int m14265y(float[] fArr) {
        return m14264s(fArr[0], fArr[1], fArr[2]);
    }

    public static int zy(int i2) {
        return (i2 & 65280) >> 8;
    }
}
