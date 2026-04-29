package com.android.thememanager.share.wechat;

import android.R;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.android.thememanager.C2082k;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3008n;
import com.bumptech.glide.util.kja0;
import java.security.MessageDigest;
import zy.lvui;

/* JADX INFO: compiled from: WechatShareQRTransformation.java */
/* JADX INFO: loaded from: classes2.dex */
public class f7l8 extends com.android.thememanager.basemodule.imageloader.toq {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final byte[] f61128f7l8 = f7l8.class.getName().getBytes(com.bumptech.glide.load.f7l8.f62824toq);

    /* JADX INFO: renamed from: g */
    private static final String f16059g = "com.android.thememanager.share.wechat.f7l8";

    /* JADX INFO: renamed from: n */
    private final String f16060n;

    /* JADX INFO: renamed from: q */
    private final String f16061q;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final Bitmap f61129zy;

    public f7l8(Bitmap backgroundBitmap, String title, String des) {
        this.f61129zy = backgroundBitmap;
        this.f16061q = title == null ? "" : title;
        this.f16060n = des == null ? "" : des;
    }

    @Override // com.bumptech.glide.load.f7l8
    public boolean equals(Object o2) {
        if (this == o2) {
            return true;
        }
        if (o2 == null || getClass() != o2.getClass()) {
            return false;
        }
        f7l8 f7l8Var = (f7l8) o2;
        if (this.f16061q.equals(f7l8Var.f16061q)) {
            return this.f16060n.equals(f7l8Var.f16060n);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.f7l8
    public int hashCode() {
        return kja0.kja0(f16059g.hashCode()) + this.f16061q.hashCode() + this.f16060n.hashCode();
    }

    @Override // com.android.thememanager.basemodule.imageloader.toq
    /* JADX INFO: renamed from: q */
    protected boolean mo6742q() {
        return false;
    }

    @Override // com.bumptech.glide.load.f7l8
    public void toq(@lvui MessageDigest messageDigest) {
        messageDigest.update(f61128f7l8);
        messageDigest.update(this.f16061q.getBytes());
        messageDigest.update(this.f16060n.getBytes());
    }

    @Override // com.bumptech.glide.load.resource.bitmap.AbstractC3115y
    protected Bitmap zy(@lvui InterfaceC3008n pool, @lvui Bitmap toTransform, int outWidth, int outHeight) {
        Resources resources = C2082k.zy().toq().getResources();
        Bitmap bitmapMo10666g = pool.mo10666g(1080, 1920, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapMo10666g);
        canvas.drawColor(resources.getColor(R.color.white));
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(this.f61129zy, 1000, (int) ((1000 / this.f61129zy.getWidth()) * this.f61129zy.getHeight()), false);
        Rect rect = new Rect(0, 0, bitmapCreateScaledBitmap.getWidth(), 1621);
        Rect rect2 = new Rect(rect);
        rect2.offset(40, 40);
        canvas.drawBitmap(bitmapCreateScaledBitmap, rect, rect2, (Paint) null);
        Bitmap bitmapCreateScaledBitmap2 = Bitmap.createScaledBitmap(toTransform, 190, 190, true);
        Rect rect3 = new Rect(0, 0, 190, 190);
        rect3.offsetTo(rect2.left, rect2.bottom + 32);
        canvas.drawBitmap(bitmapCreateScaledBitmap2, (Rect) null, rect3, (Paint) null);
        Paint paint = new Paint();
        paint.setColor(resources.getColor(com.android.thememanager.R.color.resource_search_header_text_color));
        paint.setTextSize(51.0f);
        paint.setAntiAlias(true);
        canvas.drawText(this.f16061q, rect3.right + 34, rect2.bottom + 117, paint);
        paint.setColor(resources.getColor(com.android.thememanager.R.color.wechat_share));
        paint.setTextSize(36.0f);
        canvas.drawText(this.f16060n, rect3.right + 34, rect2.bottom + 173, paint);
        return bitmapMo10666g;
    }
}
