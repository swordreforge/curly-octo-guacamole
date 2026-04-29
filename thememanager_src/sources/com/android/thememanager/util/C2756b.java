package com.android.thememanager.util;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import miuix.security.C7323k;

/* JADX INFO: renamed from: com.android.thememanager.util.b */
/* JADX INFO: compiled from: PcModeWallpaperSetUtils.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2756b {

    /* JADX INFO: renamed from: k */
    private static final String f16312k = "PcModeWallpaperSetUtils";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final int f61197toq = 2480;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final int f61198zy = 1860;

    /* JADX INFO: renamed from: g */
    public static boolean m9609g(Matrix wallpaperMatrix, Bitmap wallpaperViewBitmap) {
        RectF rectF = new RectF(0.0f, 0.0f, wallpaperViewBitmap.getWidth(), wallpaperViewBitmap.getHeight());
        if (wallpaperMatrix != null) {
            wallpaperMatrix.mapRect(rectF);
        }
        Rect rect = new Rect();
        float width = wallpaperViewBitmap.getWidth() / rectF.width();
        float height = wallpaperViewBitmap.getHeight() / rectF.height();
        int i2 = (int) (rectF.left * width);
        rect.left = i2;
        int i3 = (int) (rectF.top * height);
        rect.top = i3;
        rect.right = i2 + ((int) (f61197toq * width));
        rect.bottom = i3 + ((int) (f61198zy * height));
        Point pointM9859n = lvui.m9859n(false, rect.width(), rect.height(), 1.0f, false);
        int i4 = pointM9859n.x;
        int i5 = pointM9859n.y;
        Bitmap bitmapZy = zy(i4, i5, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapZy);
        float[] qVar = toq(canvas, 0, new Rect(0, 0, i4, i5), rect);
        canvas.drawBitmap(wallpaperViewBitmap, qVar[0], qVar[1], new Paint(2));
        return m9610k(bitmapZy);
    }

    /* JADX INFO: renamed from: k */
    private static boolean m9610k(Bitmap cropBitmap) {
        boolean zCompress = false;
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(m9612q()));
            try {
                zCompress = cropBitmap.compress(Bitmap.CompressFormat.JPEG, 100, bufferedOutputStream);
                bufferedOutputStream.flush();
                bufferedOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
            Log.e(f16312k, "IO error");
        }
        return zCompress;
    }

    /* JADX INFO: renamed from: n */
    public static String m9611n() {
        File fileM9612q = m9612q();
        try {
            FileInputStream fileInputStream = new FileInputStream(fileM9612q);
            try {
                MappedByteBuffer map = fileInputStream.getChannel().map(FileChannel.MapMode.READ_ONLY, 0L, fileM9612q.length());
                MessageDigest messageDigest = MessageDigest.getInstance(C7323k.f90061toq);
                messageDigest.update(map);
                String string = new BigInteger(1, messageDigest.digest()).toString(16);
                fileInputStream.close();
                return string;
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException | NoSuchAlgorithmException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: q */
    private static File m9612q() {
        File file = new File("/storage/emulated/0/.PC_WALLPAPER");
        if (!file.exists()) {
            Log.d(f16312k, "mkdir ret = " + file.mkdir());
        }
        File file2 = new File(file.getAbsolutePath() + "/PC_WALLPAPER.jpg");
        Log.d(f16312k, "setReadable ret = " + file2.setReadable(true, false));
        Log.d(f16312k, "setWritable ret = " + file2.setWritable(true, false));
        if (file2.isDirectory()) {
            file2.delete();
        }
        return file2;
    }

    private static float[] toq(Canvas canvas, int rotation, Rect dstRect, Rect cropRect) {
        canvas.rotate(rotation, canvas.getWidth() / 2, canvas.getHeight() / 2);
        float fWidth = dstRect.width() / cropRect.width();
        float fHeight = dstRect.height() / cropRect.height();
        canvas.scale(fWidth, fHeight, canvas.getWidth() / 2, canvas.getHeight() / 2);
        float[] fArr = {cropRect.left * fWidth, cropRect.top * fHeight};
        Matrix matrix = new Matrix();
        canvas.getMatrix().invert(matrix);
        matrix.mapPoints(fArr);
        return fArr;
    }

    private static Bitmap zy(int width, int height, Bitmap.Config config) {
        try {
            return Bitmap.createBitmap(width, height, config);
        } catch (OutOfMemoryError e2) {
            e2.printStackTrace();
            return null;
        }
    }
}
