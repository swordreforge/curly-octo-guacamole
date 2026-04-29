package com.android.thememanager.v9;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.DisplayMetrics;
import android.util.Log;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.basemodule.utils.bf2;
import com.android.thememanager.basemodule.utils.y9n;
import com.android.thememanager.util.C2755a;
import com.android.thememanager.wallpaper.C2949g;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import zy.lvui;

/* JADX INFO: compiled from: BitmapUtils.java */
/* JADX INFO: loaded from: classes2.dex */
public class toq {
    /* JADX INFO: renamed from: g */
    public static Bitmap m10204g(Bitmap bitmap, float width, float height) {
        int width2 = bitmap.getWidth();
        int height2 = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.postScale(width / width2, height / height2);
        return Bitmap.createBitmap(bitmap, 0, 0, width2, height2, matrix, true);
    }

    /* JADX INFO: renamed from: k */
    public static String m10205k(@lvui Bitmap bitmap, @lvui String path) throws Throwable {
        FileOutputStream fileOutputStream;
        File file = new File(path);
        if (file.exists()) {
            file.delete();
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            fileOutputStream = new FileOutputStream(file);
            try {
                try {
                    bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                    fileOutputStream.flush();
                    y9n.m7246g(fileOutputStream);
                    return file.getAbsolutePath();
                } catch (IOException e2) {
                    e = e2;
                    Log.i(C2755a.f16307g, "bitmap2File err ", e);
                    y9n.m7246g(fileOutputStream);
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                fileOutputStream2 = fileOutputStream;
                y9n.m7246g(fileOutputStream2);
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
            fileOutputStream = null;
        } catch (Throwable th2) {
            th = th2;
            y9n.m7246g(fileOutputStream2);
            throw th;
        }
    }

    /* JADX INFO: renamed from: n */
    public static Bitmap m10206n(Bitmap bitmap, float ratio) {
        if (bitmap == null || bitmap.isRecycled()) {
            return null;
        }
        return Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() / ratio), (int) (bitmap.getHeight() / ratio), true);
    }

    /* JADX INFO: renamed from: q */
    public static Bitmap m10207q(Context context, Matrix imageMatrix, int desireWidth, int desireHeight, Bitmap wallpaperBitmap, boolean enableWallpaperScroll, boolean userCustomized) {
        Point pointM9859n;
        RectF rectF = new RectF(0.0f, 0.0f, wallpaperBitmap.getWidth(), wallpaperBitmap.getHeight());
        imageMatrix.mapRect(rectF);
        Rect rect = new Rect();
        float width = wallpaperBitmap.getWidth() / rectF.width();
        float height = wallpaperBitmap.getHeight() / rectF.height();
        int i2 = (int) ((-rectF.left) * width);
        rect.left = i2;
        int i3 = (int) ((-rectF.top) * height);
        rect.top = i3;
        rect.right = i2 + ((int) (desireWidth * width));
        rect.bottom = i3 + ((int) (desireHeight * height));
        if (C1807g.m7081r()) {
            pointM9859n = com.android.thememanager.util.lvui.m9860q(rect.width(), rect.height(), enableWallpaperScroll, (context instanceof Activity) && ((Activity) context).isInMultiWindowMode());
        } else {
            pointM9859n = com.android.thememanager.util.lvui.m9859n(enableWallpaperScroll, rect.width(), rect.height(), com.android.thememanager.util.lvui.zy(wallpaperBitmap, bf2.toq(), userCustomized, imageMatrix), false);
        }
        Bitmap bitmapZy = zy(pointM9859n.x, pointM9859n.y, wallpaperBitmap);
        if (bitmapZy == null) {
            return null;
        }
        C1819o.f7l8(bitmapZy, context.getResources().getDisplayMetrics().densityDpi);
        Canvas canvas = new Canvas(bitmapZy);
        float[] qVar = toq(canvas, 0, new Rect(0, 0, pointM9859n.x, pointM9859n.y), rect);
        canvas.drawBitmap(wallpaperBitmap, qVar[0], qVar[1], new Paint(2));
        return bitmapZy;
    }

    private static float[] toq(Canvas canvas, int rotation, Rect dstRect, Rect cropRect) {
        canvas.rotate(rotation, canvas.getWidth() / 2, canvas.getHeight() / 2);
        float fWidth = dstRect.width() / cropRect.width();
        float fHeight = dstRect.height() / cropRect.height();
        canvas.scale(fWidth, fHeight, canvas.getWidth() / 2, canvas.getHeight() / 2);
        float[] fArr = {(-cropRect.left) * fWidth, (-cropRect.top) * fHeight};
        Matrix matrix = new Matrix();
        canvas.getMatrix().invert(matrix);
        matrix.mapPoints(fArr);
        return fArr;
    }

    private static Bitmap zy(int width, int height, Bitmap bitmap) {
        try {
            Bitmap bitmapCreateBitmap = C2949g.f7l8(bitmap.getColorSpace()) ? Bitmap.createBitmap((DisplayMetrics) null, width, height, bitmap.getConfig(), true, bitmap.getColorSpace()) : null;
            return bitmapCreateBitmap == null ? Bitmap.createBitmap(width, height, bitmap.getConfig()) : bitmapCreateBitmap;
        } catch (OutOfMemoryError e2) {
            e2.printStackTrace();
            return null;
        }
    }
}
