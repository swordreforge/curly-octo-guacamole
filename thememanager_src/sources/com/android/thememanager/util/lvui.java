package com.android.thememanager.util;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.RectF;
import android.util.Log;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.basemodule.utils.C1819o;

/* JADX INFO: compiled from: FixScreenSizeUtils.java */
/* JADX INFO: loaded from: classes2.dex */
public class lvui {

    /* JADX INFO: renamed from: k */
    private static a98o.toq f16624k = null;

    /* JADX INFO: renamed from: q */
    public static final float f16625q = 4.0f;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static a98o.toq f61338toq = null;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final float f61339zy = 1.1f;

    /* JADX INFO: renamed from: k */
    public static float m9858k(Float... values) {
        if (values.length == 1) {
            return values[0].floatValue();
        }
        Float f2 = values[0];
        for (int i2 = 1; i2 < values.length; i2++) {
            if (values[i2].floatValue() < f2.floatValue()) {
                f2 = values[i2];
            }
        }
        return f2.floatValue();
    }

    /* JADX INFO: renamed from: n */
    public static Point m9859n(boolean scrollable, int width, int height, float enlargeRatio, boolean inMultiWindow) {
        a98o.toq qVar = toq(scrollable, enlargeRatio, inMultiWindow);
        if (qVar != null) {
            float f2 = width;
            float f3 = qVar.f1x;
            if (f2 < f3) {
                width = (int) f3;
                height = (int) qVar.f2y;
            } else {
                width = (int) ((f2 / f3) * f3);
                height = (int) ((width * qVar.f2y) / f3);
            }
        }
        return new Point(width, height);
    }

    /* JADX INFO: renamed from: q */
    public static Point m9860q(int imageWidth, int imageHeight, boolean isScrollable, boolean inMultiWindow) {
        Point pointZurt = inMultiWindow ? com.android.thememanager.basemodule.utils.y9n.zurt() : com.android.thememanager.basemodule.utils.y9n.fn3e();
        int iMax = Math.max(pointZurt.x, pointZurt.y);
        if (isScrollable) {
            imageWidth = (imageWidth * iMax) / imageHeight;
        } else {
            float fMax = iMax / Math.max(imageWidth, imageHeight);
            if (fMax < 1.0f) {
                imageWidth = (int) (imageWidth * fMax);
                imageHeight = (int) (imageHeight * fMax);
            }
            iMax = imageHeight;
        }
        return new Point(imageWidth, iMax);
    }

    private static a98o.toq toq(boolean scrollable, float enlargeRatio, boolean inMultiWindow) {
        a98o.toq toqVar = f61338toq;
        if (toqVar == null || enlargeRatio != toqVar.enlarge) {
            Point pointZurt = inMultiWindow ? com.android.thememanager.basemodule.utils.y9n.zurt() : com.android.thememanager.basemodule.utils.y9n.fn3e();
            int iMax = Math.max(pointZurt.x, pointZurt.y);
            int iMin = Math.min(pointZurt.x, pointZurt.y);
            int i2 = 1;
            while (i2 != 0) {
                i2 = iMax % iMin;
                iMax = iMin;
                iMin = i2;
            }
            f16624k = new a98o.toq(pointZurt.x / iMax, pointZurt.y / iMax);
            a98o.toq toqVar2 = new a98o.toq();
            f61338toq = toqVar2;
            a98o.toq toqVar3 = f16624k;
            float f2 = toqVar3.f2y;
            if (f2 % enlargeRatio == 0.0f) {
                toqVar2.f1x = toqVar3.f1x;
                toqVar2.f2y = f2 / enlargeRatio;
            } else {
                toqVar2.f1x = toqVar3.f1x * enlargeRatio;
                toqVar2.f2y = f2;
            }
            toqVar2.enlarge = enlargeRatio;
        }
        return scrollable ? f61338toq : f16624k;
    }

    public static float zy(Bitmap bitmap, int screenCount, boolean userChanged, Matrix imageMatrix) {
        int iMin = Math.min(com.android.thememanager.basemodule.utils.y9n.fn3e().x, com.android.thememanager.basemodule.utils.y9n.fn3e().y);
        int width = bitmap.getWidth();
        RectF rectF = new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
        imageMatrix.mapRect(rectF);
        int width2 = (int) (width / (bitmap.getWidth() / rectF.width()));
        if (userChanged && rectF.right - iMin >= 0.0f) {
            width2 = (int) (width2 + rectF.left);
        }
        float f2 = 1.1f;
        if (C1807g.lvui() && C1819o.ncyb(bf2.toq.toq())) {
            float fMax = Math.max(com.android.thememanager.basemodule.utils.y9n.fn3e().x, com.android.thememanager.basemodule.utils.y9n.fn3e().y) * 1.1f;
            if (width2 < fMax) {
                width2 = (int) fMax;
            }
        }
        float f3 = width2 / iMin;
        if (f3 > 1.1f && screenCount > 0) {
            f2 = f3;
        }
        float fM9858k = m9858k(Float.valueOf(f2), Float.valueOf(screenCount), Float.valueOf(4.0f));
        Log.i("FixScreenSizeUtils", "getWallpaperWidthEnlarge: " + fM9858k);
        return fM9858k;
    }
}
