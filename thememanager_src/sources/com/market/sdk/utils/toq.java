package com.market.sdk.utils;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.renderscript.RenderScript;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: compiled from: BitmapFactory.java */
/* JADX INFO: loaded from: classes3.dex */
public class toq extends BitmapFactory {

    /* JADX INFO: renamed from: k */
    static RenderScript f28234k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    static Object f69020toq = new Object();

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final Paint f69021zy;

    /* JADX INFO: renamed from: com.market.sdk.utils.toq$k */
    /* JADX INFO: compiled from: BitmapFactory.java */
    class C5018k extends ContextWrapper {
        C5018k(Context context) {
            super(context);
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public Context getApplicationContext() {
            return this;
        }
    }

    static {
        Paint paint = new Paint(1);
        f69021zy = paint;
        paint.setFilterBitmap(true);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    protected toq() throws InstantiationException {
        throw new InstantiationException("Cannot instantiate utility class");
    }

    public static Bitmap f7l8(Bitmap bitmap, int i2, int i3) {
        if (bitmap == null) {
            return null;
        }
        if (bitmap.getWidth() == i2 && bitmap.getHeight() == i3) {
            return bitmap;
        }
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        if (bitmap.getConfig() != null) {
            config = bitmap.getConfig();
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i3, config);
        m17494y(bitmap, bitmapCreateBitmap);
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m17489g(Bitmap bitmap, String str, boolean z2) throws Throwable {
        if (bitmap == null) {
            return false;
        }
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(str);
            try {
                bitmap.compress(z2 ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG, 100, fileOutputStream2);
                fileOutputStream2.close();
                return true;
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: k */
    private static Bitmap m17490k(Bitmap bitmap) {
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        if (bitmap.getConfig() != null) {
            config = bitmap.getConfig();
        }
        return Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), config);
    }

    /* JADX INFO: renamed from: n */
    public static boolean m17491n(Bitmap bitmap, String str) throws IOException {
        return m17489g(bitmap, str, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005d, code lost:
    
        r2 = m17493s(r2);
     */
    /* JADX INFO: renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.graphics.Bitmap m17492q(android.graphics.Bitmap r10, android.graphics.Bitmap r11, int r12) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.market.sdk.utils.toq.m17492q(android.graphics.Bitmap, android.graphics.Bitmap, int):android.graphics.Bitmap");
    }

    /* JADX INFO: renamed from: s */
    private static Bitmap m17493s(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width == 0 || height == 0) {
            return bitmap;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        paint.setFlags(3);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        if (!bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return bitmapCreateBitmap;
    }

    public static Bitmap toq(Bitmap bitmap, int i2) {
        Bitmap bitmapM17490k = m17490k(bitmap);
        zy(bitmap, bitmapM17490k, i2);
        return bitmapM17490k;
    }

    /* JADX INFO: renamed from: y */
    public static Bitmap m17494y(Bitmap bitmap, Bitmap bitmap2) {
        if (bitmap == null || bitmap2 == null) {
            return null;
        }
        if (bitmap.getWidth() == bitmap2.getWidth() && bitmap.getHeight() == bitmap2.getHeight()) {
            return bitmap;
        }
        Canvas canvas = new Canvas(bitmap2);
        canvas.drawARGB(0, 0, 0, 0);
        Paint paint = new Paint();
        paint.setFilterBitmap(true);
        paint.setAntiAlias(true);
        paint.setDither(true);
        canvas.drawBitmap(bitmap, new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()), new Rect(0, 0, bitmap2.getWidth(), bitmap2.getHeight()), paint);
        return bitmap2;
    }

    public static Bitmap zy(Bitmap bitmap, Bitmap bitmap2, int i2) {
        if (bitmap == null) {
            return null;
        }
        if (bitmap2 == null || bitmap.getWidth() != bitmap2.getWidth() || bitmap.getHeight() != bitmap2.getHeight()) {
            bitmap2 = m17490k(bitmap);
        }
        m17492q(bitmap, bitmap2, i2);
        return bitmap2;
    }
}
