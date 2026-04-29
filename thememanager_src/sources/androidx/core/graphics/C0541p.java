package androidx.core.graphics;

import android.graphics.Color;
import androidx.core.view.C0683f;
import java.util.Objects;
import zy.InterfaceC7830i;
import zy.hyr;
import zy.lvui;
import zy.yz;

/* JADX INFO: renamed from: androidx.core.graphics.p */
/* JADX INFO: compiled from: ColorUtils.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0541p {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final int f50481f7l8 = 1;

    /* JADX INFO: renamed from: g */
    private static final int f3582g = 10;

    /* JADX INFO: renamed from: k */
    private static final double f3583k = 95.047d;

    /* JADX INFO: renamed from: n */
    private static final double f3584n = 903.3d;

    /* JADX INFO: renamed from: q */
    private static final double f3585q = 0.008856d;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final double f50482toq = 100.0d;

    /* JADX INFO: renamed from: y */
    private static final ThreadLocal<double[]> f3586y = new ThreadLocal<>();

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final double f50483zy = 108.883d;

    /* JADX INFO: renamed from: androidx.core.graphics.p$k */
    /* JADX INFO: compiled from: ColorUtils.java */
    @hyr(26)
    static class k {
        private k() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static Color m2545k(Color color, Color color2) {
            if (!Objects.equals(color.getModel(), color2.getModel())) {
                throw new IllegalArgumentException("Color models must match (" + color.getModel() + " vs. " + color2.getModel() + ")");
            }
            if (!Objects.equals(color2.getColorSpace(), color.getColorSpace())) {
                color = color.convert(color2.getColorSpace());
            }
            float[] components = color.getComponents();
            float[] components2 = color2.getComponents();
            float fAlpha = color.alpha();
            float fAlpha2 = color2.alpha() * (1.0f - fAlpha);
            int componentCount = color2.getComponentCount() - 1;
            float f2 = fAlpha + fAlpha2;
            components2[componentCount] = f2;
            if (f2 > 0.0f) {
                fAlpha /= f2;
                fAlpha2 /= f2;
            }
            for (int i2 = 0; i2 < componentCount; i2++) {
                components2[i2] = (components[i2] * fAlpha) + (components2[i2] * fAlpha2);
            }
            return Color.valueOf(components2, color2.getColorSpace());
        }
    }

    private C0541p() {
    }

    public static void cdj(@zy.x2 int i2, @lvui double[] dArr) {
        m2538n(Color.red(i2), Color.green(i2), Color.blue(i2), dArr);
    }

    @zy.x2
    public static int f7l8(@zy.zurt(from = 0.0d, to = f3583k) double d2, @zy.zurt(from = 0.0d, to = f50482toq) double d4, @zy.zurt(from = 0.0d, to = f50483zy) double d5) {
        double d6 = (((3.2406d * d2) + ((-1.5372d) * d4)) + ((-0.4986d) * d5)) / f50482toq;
        double d7 = ((((-0.9689d) * d2) + (1.8758d * d4)) + (0.0415d * d5)) / f50482toq;
        double d8 = (((0.0557d * d2) + ((-0.204d) * d4)) + (1.057d * d5)) / f50482toq;
        return Color.rgb(fu4((int) Math.round((d6 > 0.0031308d ? (Math.pow(d6, 0.4166666666666667d) * 1.055d) - 0.055d : d6 * 12.92d) * 255.0d), 0, 255), fu4((int) Math.round((d7 > 0.0031308d ? (Math.pow(d7, 0.4166666666666667d) * 1.055d) - 0.055d : d7 * 12.92d) * 255.0d), 0, 255), fu4((int) Math.round((d8 > 0.0031308d ? (Math.pow(d8, 0.4166666666666667d) * 1.055d) - 0.055d : d8 * 12.92d) * 255.0d), 0, 255));
    }

    @hyr(26)
    @lvui
    public static Color fn3e(@lvui Color color, @lvui Color color2) {
        return k.m2545k(color, color2);
    }

    private static int fu4(int i2, int i3, int i4) {
        return i2 < i3 ? i3 : Math.min(i2, i4);
    }

    /* JADX INFO: renamed from: g */
    public static void m2534g(@zy.a9(from = 0, to = 255) int i2, @zy.a9(from = 0, to = 255) int i3, @zy.a9(from = 0, to = 255) int i4, @lvui double[] dArr) {
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outXyz must have a length of 3.");
        }
        double d2 = ((double) i2) / 255.0d;
        double dPow = d2 < 0.04045d ? d2 / 12.92d : Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
        double d4 = ((double) i3) / 255.0d;
        double dPow2 = d4 < 0.04045d ? d4 / 12.92d : Math.pow((d4 + 0.055d) / 1.055d, 2.4d);
        double d5 = ((double) i4) / 255.0d;
        double dPow3 = d5 < 0.04045d ? d5 / 12.92d : Math.pow((d5 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.4124d * dPow) + (0.3576d * dPow2) + (0.1805d * dPow3)) * f50482toq;
        dArr[1] = ((0.2126d * dPow) + (0.7152d * dPow2) + (0.0722d * dPow3)) * f50482toq;
        dArr[2] = ((dPow * 0.0193d) + (dPow2 * 0.1192d) + (dPow3 * 0.9505d)) * f50482toq;
    }

    /* JADX INFO: renamed from: h */
    public static void m2535h(@zy.x2 int i2, @lvui float[] fArr) {
        m2540q(Color.red(i2), Color.green(i2), Color.blue(i2), fArr);
    }

    /* JADX INFO: renamed from: i */
    public static int m2536i(@zy.x2 int i2, @zy.x2 int i3) {
        int iAlpha = Color.alpha(i3);
        int iAlpha2 = Color.alpha(i2);
        int iT8r = t8r(iAlpha2, iAlpha);
        return Color.argb(iT8r, zurt(Color.red(i2), iAlpha2, Color.red(i3), iAlpha, iT8r), zurt(Color.green(i2), iAlpha2, Color.green(i3), iAlpha, iT8r), zurt(Color.blue(i2), iAlpha2, Color.blue(i3), iAlpha, iT8r));
    }

    @zy.x2
    /* JADX INFO: renamed from: k */
    public static int m2537k(@lvui float[] fArr) {
        int iRound;
        int iRound2;
        int iRound3;
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[2];
        float fAbs = (1.0f - Math.abs((f4 * 2.0f) - 1.0f)) * f3;
        float f5 = f4 - (0.5f * fAbs);
        float fAbs2 = (1.0f - Math.abs(((f2 / 60.0f) % 2.0f) - 1.0f)) * fAbs;
        switch (((int) f2) / 60) {
            case 0:
                iRound = Math.round((fAbs + f5) * 255.0f);
                iRound2 = Math.round((fAbs2 + f5) * 255.0f);
                iRound3 = Math.round(f5 * 255.0f);
                break;
            case 1:
                iRound = Math.round((fAbs2 + f5) * 255.0f);
                iRound2 = Math.round((fAbs + f5) * 255.0f);
                iRound3 = Math.round(f5 * 255.0f);
                break;
            case 2:
                iRound = Math.round(f5 * 255.0f);
                iRound2 = Math.round((fAbs + f5) * 255.0f);
                iRound3 = Math.round((fAbs2 + f5) * 255.0f);
                break;
            case 3:
                iRound = Math.round(f5 * 255.0f);
                iRound2 = Math.round((fAbs2 + f5) * 255.0f);
                iRound3 = Math.round((fAbs + f5) * 255.0f);
                break;
            case 4:
                iRound = Math.round((fAbs2 + f5) * 255.0f);
                iRound2 = Math.round(f5 * 255.0f);
                iRound3 = Math.round((fAbs + f5) * 255.0f);
                break;
            case 5:
            case 6:
                iRound = Math.round((fAbs + f5) * 255.0f);
                iRound2 = Math.round(f5 * 255.0f);
                iRound3 = Math.round((fAbs2 + f5) * 255.0f);
                break;
            default:
                iRound3 = 0;
                iRound = 0;
                iRound2 = 0;
                break;
        }
        return Color.rgb(fu4(iRound, 0, 255), fu4(iRound2, 0, 255), fu4(iRound3, 0, 255));
    }

    public static void ki(@zy.x2 int i2, @lvui double[] dArr) {
        m2534g(Color.red(i2), Color.green(i2), Color.blue(i2), dArr);
    }

    @yz
    static float kja0(float f2, float f3, float f4) {
        if (Math.abs(f3 - f2) > 180.0f) {
            if (f3 > f2) {
                f2 += 360.0f;
            } else {
                f3 += 360.0f;
            }
        }
        return (f2 + ((f3 - f2) * f4)) % 360.0f;
    }

    public static void ld6(@lvui double[] dArr, @lvui double[] dArr2, @zy.zurt(from = 0.0d, to = 1.0d) double d2, @lvui double[] dArr3) {
        if (dArr3.length != 3) {
            throw new IllegalArgumentException("outResult must have a length of 3.");
        }
        double d4 = 1.0d - d2;
        dArr3[0] = (dArr[0] * d4) + (dArr2[0] * d2);
        dArr3[1] = (dArr[1] * d4) + (dArr2[1] * d2);
        dArr3[2] = (dArr[2] * d4) + (dArr2[2] * d2);
    }

    /* JADX INFO: renamed from: n */
    public static void m2538n(@zy.a9(from = 0, to = 255) int i2, @zy.a9(from = 0, to = 255) int i3, @zy.a9(from = 0, to = 255) int i4, @lvui double[] dArr) {
        m2534g(i2, i3, i4, dArr);
        m2543y(dArr[0], dArr[1], dArr[2], dArr);
    }

    public static int n7h(@zy.x2 int i2, @zy.x2 int i3, float f2) {
        int i4 = 255;
        if (Color.alpha(i3) != 255) {
            throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i3));
        }
        double d2 = f2;
        if (x2(m2542t(i2, 255), i3) < d2) {
            return -1;
        }
        int i5 = 0;
        for (int i6 = 0; i6 <= 10 && i4 - i5 > 1; i6++) {
            int i7 = (i5 + i4) / 2;
            if (x2(m2542t(i2, i7), i3) < d2) {
                i5 = i7;
            } else {
                i4 = i7;
            }
        }
        return i4;
    }

    private static float ni7(float f2, float f3, float f4) {
        return f2 < f3 ? f3 : Math.min(f2, f4);
    }

    private static double[] o1t() {
        ThreadLocal<double[]> threadLocal = f3586y;
        double[] dArr = threadLocal.get();
        if (dArr != null) {
            return dArr;
        }
        double[] dArr2 = new double[3];
        threadLocal.set(dArr2);
        return dArr2;
    }

    /* JADX INFO: renamed from: p */
    public static void m2539p(@lvui float[] fArr, @lvui float[] fArr2, @zy.zurt(from = 0.0d, to = 1.0d) float f2, @lvui float[] fArr3) {
        if (fArr3.length != 3) {
            throw new IllegalArgumentException("result must have a length of 3.");
        }
        float f3 = 1.0f - f2;
        fArr3[0] = kja0(fArr[0], fArr2[0], f2);
        fArr3[1] = (fArr[1] * f3) + (fArr2[1] * f2);
        fArr3[2] = (fArr[2] * f3) + (fArr2[2] * f2);
    }

    /* JADX INFO: renamed from: q */
    public static void m2540q(@zy.a9(from = 0, to = 255) int i2, @zy.a9(from = 0, to = 255) int i3, @zy.a9(from = 0, to = 255) int i4, @lvui float[] fArr) {
        float f2;
        float fAbs;
        float f3 = i2 / 255.0f;
        float f4 = i3 / 255.0f;
        float f5 = i4 / 255.0f;
        float fMax = Math.max(f3, Math.max(f4, f5));
        float fMin = Math.min(f3, Math.min(f4, f5));
        float f6 = fMax - fMin;
        float f7 = (fMax + fMin) / 2.0f;
        if (fMax == fMin) {
            f2 = 0.0f;
            fAbs = 0.0f;
        } else {
            f2 = fMax == f3 ? ((f4 - f5) / f6) % 6.0f : fMax == f4 ? ((f5 - f3) / f6) + 2.0f : 4.0f + ((f3 - f4) / f6);
            fAbs = f6 / (1.0f - Math.abs((2.0f * f7) - 1.0f));
        }
        float f8 = (f2 * 60.0f) % 360.0f;
        if (f8 < 0.0f) {
            f8 += 360.0f;
        }
        fArr[0] = ni7(f8, 0.0f, 360.0f);
        fArr[1] = ni7(fAbs, 0.0f, 1.0f);
        fArr[2] = ni7(f7, 0.0f, 1.0f);
    }

    @zy.zurt(from = 0.0d, to = 1.0d)
    public static double qrj(@zy.x2 int i2) {
        double[] dArrO1t = o1t();
        ki(i2, dArrO1t);
        return dArrO1t[1] / f50482toq;
    }

    @zy.x2
    /* JADX INFO: renamed from: s */
    public static int m2541s(@zy.x2 int i2, @zy.x2 int i3, @zy.zurt(from = 0.0d, to = 1.0d) float f2) {
        float f3 = 1.0f - f2;
        return Color.argb((int) ((Color.alpha(i2) * f3) + (Color.alpha(i3) * f2)), (int) ((Color.red(i2) * f3) + (Color.red(i3) * f2)), (int) ((Color.green(i2) * f3) + (Color.green(i3) * f2)), (int) ((Color.blue(i2) * f3) + (Color.blue(i3) * f2)));
    }

    @zy.x2
    /* JADX INFO: renamed from: t */
    public static int m2542t(@zy.x2 int i2, @zy.a9(from = 0, to = 255) int i3) {
        if (i3 < 0 || i3 > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i2 & C0683f.f50797t8r) | (i3 << 24);
    }

    private static int t8r(int i2, int i3) {
        return 255 - (((255 - i3) * (255 - i2)) / 255);
    }

    @zy.x2
    public static int toq(@zy.zurt(from = 0.0d, to = f50482toq) double d2, @zy.zurt(from = -128.0d, to = 127.0d) double d4, @zy.zurt(from = -128.0d, to = 127.0d) double d5) {
        double[] dArrO1t = o1t();
        zy(d2, d4, d5, dArrO1t);
        return f7l8(dArrO1t[0], dArrO1t[1], dArrO1t[2]);
    }

    private static double wvg(double d2) {
        return d2 > f3585q ? Math.pow(d2, 0.3333333333333333d) : ((d2 * f3584n) + 16.0d) / 116.0d;
    }

    public static double x2(@zy.x2 int i2, @zy.x2 int i3) {
        if (Color.alpha(i3) != 255) {
            throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i3));
        }
        if (Color.alpha(i2) < 255) {
            i2 = m2536i(i2, i3);
        }
        double dQrj = qrj(i2) + 0.05d;
        double dQrj2 = qrj(i3) + 0.05d;
        return Math.max(dQrj, dQrj2) / Math.min(dQrj, dQrj2);
    }

    /* JADX INFO: renamed from: y */
    public static void m2543y(@zy.zurt(from = 0.0d, to = f3583k) double d2, @zy.zurt(from = 0.0d, to = f50482toq) double d4, @zy.zurt(from = 0.0d, to = f50483zy) double d5, @lvui double[] dArr) {
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outLab must have a length of 3.");
        }
        double dWvg = wvg(d2 / f3583k);
        double dWvg2 = wvg(d4 / f50482toq);
        double dWvg3 = wvg(d5 / f50483zy);
        dArr[0] = Math.max(0.0d, (116.0d * dWvg2) - 16.0d);
        dArr[1] = (dWvg - dWvg2) * 500.0d;
        dArr[2] = (dWvg2 - dWvg3) * 200.0d;
    }

    /* JADX INFO: renamed from: z */
    public static double m2544z(@lvui double[] dArr, @lvui double[] dArr2) {
        return Math.sqrt(Math.pow(dArr[0] - dArr2[0], 2.0d) + Math.pow(dArr[1] - dArr2[1], 2.0d) + Math.pow(dArr[2] - dArr2[2], 2.0d));
    }

    private static int zurt(int i2, int i3, int i4, int i5, int i6) {
        if (i6 == 0) {
            return 0;
        }
        return (((i2 * 255) * i3) + ((i4 * i5) * (255 - i3))) / (i6 * 255);
    }

    public static void zy(@zy.zurt(from = 0.0d, to = f50482toq) double d2, @zy.zurt(from = -128.0d, to = 127.0d) double d4, @zy.zurt(from = -128.0d, to = 127.0d) double d5, @lvui double[] dArr) {
        double d6 = (d2 + 16.0d) / 116.0d;
        double d7 = (d4 / 500.0d) + d6;
        double d8 = d6 - (d5 / 200.0d);
        double dPow = Math.pow(d7, 3.0d);
        if (dPow <= f3585q) {
            dPow = ((d7 * 116.0d) - 16.0d) / f3584n;
        }
        double dPow2 = d2 > 7.9996247999999985d ? Math.pow(d6, 3.0d) : d2 / f3584n;
        double dPow3 = Math.pow(d8, 3.0d);
        if (dPow3 <= f3585q) {
            dPow3 = ((d8 * 116.0d) - 16.0d) / f3584n;
        }
        dArr[0] = dPow * f3583k;
        dArr[1] = dPow2 * f50482toq;
        dArr[2] = dPow3 * f50483zy;
    }
}
