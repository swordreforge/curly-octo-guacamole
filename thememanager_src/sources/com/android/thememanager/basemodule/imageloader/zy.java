package com.android.thememanager.basemodule.imageloader;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3008n;
import java.security.MessageDigest;
import zy.lvui;

/* JADX INFO: compiled from: CropBottomToUpTransform.java */
/* JADX INFO: loaded from: classes.dex */
public class zy extends toq {

    /* JADX INFO: renamed from: q */
    private static final byte[] f9959q = zy.class.getName().getBytes(com.bumptech.glide.load.f7l8.f62824toq);

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String f57552zy = "com.android.thememanager.basemodule.imageloader.zy";

    /* JADX INFO: renamed from: g */
    private Bitmap m6813g(InterfaceC3008n pool, Bitmap source) {
        if (source == null) {
            return null;
        }
        Bitmap bitmapMo10666g = pool.mo10666g(source.getWidth(), source.getHeight(), Bitmap.Config.ARGB_8888);
        m6773n(source.getColorSpace(), bitmapMo10666g);
        Canvas canvas = new Canvas(bitmapMo10666g);
        Paint paint = new Paint();
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new BitmapShader(source, tileMode, tileMode));
        paint.setAntiAlias(true);
        RectF rectF = new RectF(0.0f, 0.0f, source.getWidth(), source.getHeight());
        canvas.scale(1.0f, 1.05f, source.getWidth() / 2, source.getHeight());
        canvas.drawRect(rectF, paint);
        return bitmapMo10666g;
    }

    @Override // com.android.thememanager.basemodule.imageloader.toq
    /* JADX INFO: renamed from: q */
    protected boolean mo6742q() {
        return true;
    }

    @Override // com.bumptech.glide.load.f7l8
    public void toq(@lvui MessageDigest messageDigest) {
        messageDigest.update(f9959q);
    }

    @Override // com.bumptech.glide.load.resource.bitmap.AbstractC3115y
    protected Bitmap zy(@lvui InterfaceC3008n pool, @lvui Bitmap toTransform, int outWidth, int outHeight) {
        return m6813g(pool, toTransform);
    }
}
