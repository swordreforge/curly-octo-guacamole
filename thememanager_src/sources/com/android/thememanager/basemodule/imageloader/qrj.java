package com.android.thememanager.basemodule.imageloader;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.Log;
import com.android.thememanager.basemodule.utils.C1819o;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3008n;
import java.security.MessageDigest;
import zy.lvui;

/* JADX INFO: compiled from: MatrixBitmapTransFormation.java */
/* JADX INFO: loaded from: classes.dex */
public class qrj extends toq {

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private Matrix f57522zy;

    public qrj(Matrix matrix) {
        this.f57522zy = matrix;
    }

    /* JADX INFO: renamed from: g */
    private static void m6771g(Bitmap destB, Bitmap srcB, Matrix m2) {
        if (destB == null || srcB == null) {
            return;
        }
        Canvas canvas = new Canvas();
        canvas.setBitmap(destB);
        canvas.drawBitmap(srcB, m2, new Paint(2));
    }

    @Override // com.android.thememanager.basemodule.imageloader.toq
    /* JADX INFO: renamed from: q */
    protected boolean mo6742q() {
        return true;
    }

    @Override // com.bumptech.glide.load.f7l8
    public void toq(@lvui MessageDigest messageDigest) {
    }

    @Override // com.bumptech.glide.load.resource.bitmap.AbstractC3115y
    protected Bitmap zy(InterfaceC3008n bitmapPool, Bitmap bitmap, int targetWidth, int targetHeight) {
        if (bitmap != null) {
            try {
                int iJk = C1819o.jk(bf2.toq.toq());
                int iMcp = (C1819o.mcp(bf2.toq.toq()) * targetWidth) / iJk;
                Bitmap bitmapMo10666g = bitmapPool.mo10666g(targetWidth, iMcp, Bitmap.Config.ARGB_8888);
                m6773n(bitmap.getColorSpace(), bitmapMo10666g);
                Matrix matrix = new Matrix();
                float fMax = Math.max(targetWidth / bitmap.getWidth(), iMcp / bitmap.getHeight());
                float[] fArr = new float[9];
                this.f57522zy.getValues(fArr);
                float f2 = fMax * fArr[0];
                matrix.postScale(f2, f2);
                float f3 = (float) ((((double) targetWidth) * 1.0d) / ((double) iJk));
                matrix.postTranslate(fArr[2] * f3, fArr[5] * f3);
                m6771g(bitmapMo10666g, bitmap, matrix);
                return bitmapMo10666g;
            } catch (OutOfMemoryError e2) {
                Log.e(getClass().getSimpleName(), "OutOfMemoryError：" + e2);
            }
        }
        return bitmap;
    }
}
