package com.miui.miwallpaper.material.utils;

import android.app.WallpaperColors;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import com.miui.miwallpaper.material.palette.toq;
import java.util.Objects;
import zy.a9;
import zy.hyr;
import zy.lvui;
import zy.x2;

/* JADX INFO: compiled from: MiuiWallpaperColors.java */
/* JADX INFO: loaded from: classes3.dex */
public class zy {

    /* JADX INFO: renamed from: q */
    public static final int f29582q = 4;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final int f72247toq = 112;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final int f72248zy = 12544;

    /* JADX INFO: renamed from: k */
    private static final int f29580k = Color.rgb(64, 126, 191);

    /* JADX INFO: renamed from: n */
    static final toq.zy f29581n = new C5285k();

    /* JADX INFO: renamed from: g */
    static final toq.zy f29579g = new toq();

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    static final toq.zy f72246f7l8 = new C8030zy();

    /* JADX INFO: renamed from: com.miui.miwallpaper.material.utils.zy$k */
    /* JADX INFO: compiled from: MiuiWallpaperColors.java */
    class C5285k implements toq.zy {
        C5285k() {
        }

        @Override // com.miui.miwallpaper.material.palette.toq.zy
        /* JADX INFO: renamed from: k */
        public boolean mo17924k(int i2, @lvui float[] fArr) {
            return zy.m17978g(i2, 20, 20);
        }
    }

    /* JADX INFO: compiled from: MiuiWallpaperColors.java */
    class toq implements toq.zy {
        toq() {
        }

        @Override // com.miui.miwallpaper.material.palette.toq.zy
        /* JADX INFO: renamed from: k */
        public boolean mo17924k(int i2, @lvui float[] fArr) {
            return zy.m17978g(i2, 20, 10);
        }
    }

    /* JADX INFO: renamed from: com.miui.miwallpaper.material.utils.zy$zy, reason: collision with other inner class name */
    /* JADX INFO: compiled from: MiuiWallpaperColors.java */
    class C8030zy implements toq.zy {
        C8030zy() {
        }

        @Override // com.miui.miwallpaper.material.palette.toq.zy
        /* JADX INFO: renamed from: k */
        public boolean mo17924k(int i2, @lvui float[] fArr) {
            return zy.m17978g(i2, 20, 5);
        }
    }

    public static int f7l8(Bitmap bitmap) {
        return m17984y(bitmap, new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static boolean m17978g(int i2, int i3, int i4) {
        com.miui.miwallpaper.material.hct.toq qVar = com.miui.miwallpaper.material.hct.toq.toq(i2);
        return qVar.zy() >= ((double) i3) && qVar.m17887n() <= ((double) (100 - i4)) && qVar.m17887n() >= ((double) i4);
    }

    /* JADX INFO: renamed from: k */
    public static void m17979k(@a9(from = 0, to = 255) int i2, @a9(from = 0, to = 255) int i3, @a9(from = 0, to = 255) int i4, float[] fArr) {
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
        fArr[0] = m17980n(f8, 0.0f, 360.0f);
        fArr[1] = m17980n(fAbs, 0.0f, 1.0f);
        fArr[2] = m17980n(f7, 0.0f, 1.0f);
    }

    public static int ld6(Bitmap bitmap, boolean z2) {
        return x2(bitmap, z2, new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()));
    }

    /* JADX INFO: renamed from: n */
    private static float m17980n(float f2, float f3, float f4) {
        return f2 < f3 ? f3 : f2 > f4 ? f4 : f2;
    }

    @hyr(api = 26)
    /* JADX INFO: renamed from: p */
    private static float m17981p(Color color) {
        return (color.red() * 0.299f) + (color.green() * 0.587f) + (color.blue() * 0.114f);
    }

    /* JADX INFO: renamed from: q */
    public static void m17982q(@x2 int i2, float[] fArr) {
        m17979k(Color.red(i2), Color.green(i2), Color.blue(i2), fArr);
    }

    @hyr(api = 31)
    /* JADX INFO: renamed from: s */
    public static WallpaperColors m17983s(Bitmap bitmap) {
        return new WallpaperColors(Color.valueOf(f7l8(bitmap)), null, null, ld6(bitmap, false));
    }

    @hyr(api = 26)
    public static int x2(Bitmap bitmap, boolean z2, Rect rect) {
        Bitmap bitmapCreateBitmap;
        float f2;
        float f3;
        if (bitmap == null || bitmap.getHeight() == 0 || bitmap.getWidth() == 0) {
            return 0;
        }
        int iWidth = rect.width() * rect.height();
        if (iWidth > 12544) {
            double dSqrt = Math.sqrt(12544.0d / ((double) iWidth));
            Matrix matrix = new Matrix();
            float f4 = (float) dSqrt;
            matrix.setScale(f4, f4);
            bitmapCreateBitmap = Bitmap.createBitmap(bitmap, rect.left, rect.top, rect.width(), rect.height(), matrix, false);
        } else {
            bitmapCreateBitmap = bitmap;
        }
        int width = bitmapCreateBitmap.getWidth() * bitmapCreateBitmap.getHeight();
        int[] iArr = new int[width];
        if (z2) {
            int width2 = (bitmapCreateBitmap.getWidth() * bitmapCreateBitmap.getHeight()) / 2;
            int[] iArr2 = new int[width2];
            int[] iArr3 = new int[width2];
            bitmapCreateBitmap.getPixels(iArr2, 0, bitmapCreateBitmap.getWidth(), 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight() / 2);
            bitmapCreateBitmap.getPixels(iArr3, 0, bitmapCreateBitmap.getWidth(), 0, bitmapCreateBitmap.getHeight() / 2, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight() / 2);
            f2 = 0.0f;
            f3 = 0.0f;
            for (int i2 = 0; i2 < width2; i2++) {
                f2 += ((double) m17981p(Color.valueOf(iArr2[i2]))) >= 0.7d ? 3.0f : 0.0f;
                f3 += 3.0f;
            }
            for (int i3 = 0; i3 < width2; i3++) {
                f2 += ((double) m17981p(Color.valueOf(iArr3[i3]))) >= 0.7d ? 1.0f : 0.0f;
                f3 += 1.0f;
            }
        } else {
            bitmapCreateBitmap.getPixels(iArr, 0, bitmapCreateBitmap.getWidth(), 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight());
            f2 = 0.0f;
            f3 = 0.0f;
            for (int i4 = 0; i4 < width; i4++) {
                f2 += ((double) m17981p(Color.valueOf(iArr[i4]))) >= 0.8d ? 1.0f : 0.0f;
                f3 += 1.0f;
            }
        }
        int i5 = (f3 == 0.0f || f2 / f3 <= 0.6f) ? 0 : 1;
        double d2 = 0.0d;
        bitmapCreateBitmap.getPixels(iArr, 0, bitmapCreateBitmap.getWidth(), 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight());
        float[] fArr = new float[3];
        for (int i6 = 0; i6 < width; i6++) {
            m17982q(iArr[i6], fArr);
            d2 += (double) fArr[2];
        }
        if (d2 / ((double) width) < 0.25d) {
            i5 |= 2;
        }
        return i5 | 4;
    }

    /* JADX INFO: renamed from: y */
    public static int m17984y(@lvui Bitmap bitmap, Rect rect) {
        Objects.requireNonNull(bitmap, "Bitmap can't be null");
        com.miui.miwallpaper.material.palette.toq toqVarF7l8 = com.miui.miwallpaper.material.palette.toq.zy(bitmap).m17932k(f29581n).qrj(rect.left, rect.top, rect.right, rect.bottom).m17934p(f72248zy).f7l8();
        if (toqVarF7l8.wvg().isEmpty()) {
            toqVarF7l8 = com.miui.miwallpaper.material.palette.toq.zy(bitmap).m17932k(f29579g).qrj(rect.left, rect.top, rect.right, rect.bottom).m17934p(f72248zy).f7l8();
            if (toqVarF7l8.wvg().isEmpty()) {
                toqVarF7l8 = com.miui.miwallpaper.material.palette.toq.zy(bitmap).m17932k(f72246f7l8).qrj(rect.left, rect.top, rect.right, rect.bottom).m17934p(f72248zy).f7l8();
            }
        }
        return toqVarF7l8.cdj(f29580k);
    }

    @hyr(api = 21)
    private static Size zy(int i2, int i3) {
        int i4 = i2 * i3;
        double dSqrt = i4 > 12544 ? Math.sqrt(12544.0d / ((double) i4)) : 1.0d;
        int i5 = (int) (((double) i2) * dSqrt);
        int i6 = (int) (((double) i3) * dSqrt);
        if (i5 == 0) {
            i5 = 1;
        }
        if (i6 == 0) {
            i6 = 1;
        }
        return new Size(i5, i6);
    }
}
