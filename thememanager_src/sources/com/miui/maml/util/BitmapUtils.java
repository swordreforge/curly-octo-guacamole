package com.miui.maml.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import androidx.core.content.C0498q;
import androidx.vectordrawable.graphics.drawable.C1257s;
import zy.fn3e;

/* JADX INFO: loaded from: classes3.dex */
public class BitmapUtils {
    private static final int sColorByteSize = 4;
    private static volatile Paint sCutPaint;

    public static Bitmap composeIcon(Bitmap bitmap, Bitmap bitmap2) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int byteCount = bitmap.getByteCount() / 4;
        int rowBytes = bitmap.getRowBytes() / 4;
        int[] iArr = new int[byteCount];
        bitmap.getPixels(iArr, 0, rowBytes, 0, 0, width, height);
        bitmap.recycle();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawBitmap(iArr, 0, rowBytes, 0, 0, width, height, true, (Paint) null);
        if (bitmap2 != null) {
            if (sCutPaint == null) {
                synchronized (BitmapUtils.class) {
                    if (sCutPaint == null) {
                        Paint paint = new Paint();
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
                        sCutPaint = paint;
                    }
                }
            }
            canvas.drawBitmap(bitmap2, 0.0f, 0.0f, sCutPaint);
            bitmapCreateBitmap.getPixels(iArr, 0, rowBytes, 0, 0, width, height);
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        }
        canvas.drawBitmap(iArr, 0, rowBytes, 0, 0, width, height, true, (Paint) null);
        return bitmapCreateBitmap;
    }

    public static Bitmap drawableToBitmap(Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    public static Bitmap getBitmapFromDrawable(Context context, @fn3e int i2, int i3, int i4) {
        Drawable drawableM2259s = C0498q.m2259s(context, i2);
        if (!(drawableM2259s instanceof BitmapDrawable) && !(drawableM2259s instanceof VectorDrawable) && !(drawableM2259s instanceof C1257s)) {
            throw new IllegalArgumentException("unsupported drawable type");
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i3, i4, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawableM2259s.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawableM2259s.draw(canvas);
        return bitmapCreateBitmap;
    }
}
