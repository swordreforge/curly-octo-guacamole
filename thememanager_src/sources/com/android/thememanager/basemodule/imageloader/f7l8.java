package com.android.thememanager.basemodule.imageloader;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.Log;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3008n;
import com.bumptech.glide.load.resource.bitmap.jp0y;
import com.miui.maml.folme.AnimatedProperty;
import java.security.MessageDigest;
import zy.lvui;

/* JADX INFO: compiled from: FitCenterTransform.java */
/* JADX INFO: loaded from: classes.dex */
public class f7l8 extends toq {

    /* JADX INFO: renamed from: n */
    private static final byte[] f9917n = f7l8.class.getName().getBytes(com.bumptech.glide.load.f7l8.f62824toq);

    /* JADX INFO: renamed from: q */
    private static final String f9918q = "com.android.thememanager.basemodule.imageloader.f7l8";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String f57514zy = "FitCenterTransform";

    @lvui
    private static Bitmap.Config f7l8(@lvui Bitmap bitmap) {
        return bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888;
    }

    /* JADX INFO: renamed from: g */
    private static void m6741g(@lvui Bitmap inBitmap, @lvui Bitmap targetBitmap, Matrix matrix) {
        Canvas canvas = new Canvas(targetBitmap);
        canvas.drawBitmap(inBitmap, matrix, new Paint(6));
        canvas.setBitmap(null);
    }

    @Override // com.android.thememanager.basemodule.imageloader.toq
    /* JADX INFO: renamed from: q */
    protected boolean mo6742q() {
        return true;
    }

    @Override // com.bumptech.glide.load.f7l8
    public void toq(@lvui MessageDigest messageDigest) {
        messageDigest.update(f9917n);
    }

    @Override // com.bumptech.glide.load.resource.bitmap.AbstractC3115y
    protected Bitmap zy(@lvui InterfaceC3008n pool, @lvui Bitmap inBitmap, int width, int height) {
        if (inBitmap.getWidth() == width && inBitmap.getHeight() == height) {
            if (Log.isLoggable(f57514zy, 2)) {
                Log.v(f57514zy, "requested target size matches input, returning input");
            }
            return inBitmap;
        }
        float fMin = Math.min(width / inBitmap.getWidth(), height / inBitmap.getHeight());
        int iRound = Math.round(inBitmap.getWidth() * fMin);
        int iRound2 = Math.round(inBitmap.getHeight() * fMin);
        if (inBitmap.getWidth() == iRound && inBitmap.getHeight() == iRound2) {
            if (Log.isLoggable(f57514zy, 2)) {
                Log.v(f57514zy, "adjusted target size matches input, returning input");
            }
            return inBitmap;
        }
        Bitmap bitmapMo10666g = pool.mo10666g((int) (inBitmap.getWidth() * fMin), (int) (inBitmap.getHeight() * fMin), f7l8(inBitmap));
        m6773n(inBitmap.getColorSpace(), bitmapMo10666g);
        jp0y.m10968i(inBitmap, bitmapMo10666g);
        if (Log.isLoggable(f57514zy, 2)) {
            Log.v(f57514zy, "request: " + width + AnimatedProperty.PROPERTY_NAME_X + height);
            Log.v(f57514zy, "toFit:   " + inBitmap.getWidth() + AnimatedProperty.PROPERTY_NAME_X + inBitmap.getHeight());
            Log.v(f57514zy, "toReuse: " + bitmapMo10666g.getWidth() + AnimatedProperty.PROPERTY_NAME_X + bitmapMo10666g.getHeight());
            StringBuilder sb = new StringBuilder();
            sb.append("minPct:   ");
            sb.append(fMin);
            Log.v(f57514zy, sb.toString());
        }
        Matrix matrix = new Matrix();
        matrix.setScale(fMin, fMin);
        m6741g(inBitmap, bitmapMo10666g, matrix);
        return bitmapMo10666g;
    }
}
