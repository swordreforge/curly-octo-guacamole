package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.bumptech.glide.load.engine.bitmap_recycle.C3003g;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3008n;
import java.util.concurrent.locks.Lock;
import zy.dd;

/* JADX INFO: compiled from: DrawableToBitmapConverter.java */
/* JADX INFO: loaded from: classes2.dex */
final class ki {

    /* JADX INFO: renamed from: k */
    private static final String f18716k = "DrawableToBitmap";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final InterfaceC3008n f62903toq = new C3106k();

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.ki$k */
    /* JADX INFO: compiled from: DrawableToBitmapConverter.java */
    class C3106k extends C3003g {
        C3106k() {
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.C3003g, com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3008n
        /* JADX INFO: renamed from: q */
        public void mo10669q(Bitmap bitmap) {
        }
    }

    private ki() {
    }

    @dd
    /* JADX INFO: renamed from: k */
    static com.bumptech.glide.load.engine.zurt<Bitmap> m10976k(InterfaceC3008n interfaceC3008n, Drawable drawable, int i2, int i3) {
        Bitmap qVar;
        Drawable current = drawable.getCurrent();
        boolean z2 = false;
        if (current instanceof BitmapDrawable) {
            qVar = ((BitmapDrawable) current).getBitmap();
        } else if (current instanceof Animatable) {
            qVar = null;
        } else {
            qVar = toq(interfaceC3008n, current, i2, i3);
            z2 = true;
        }
        if (!z2) {
            interfaceC3008n = f62903toq;
        }
        return f7l8.m10956g(qVar, interfaceC3008n);
    }

    @dd
    private static Bitmap toq(InterfaceC3008n interfaceC3008n, Drawable drawable, int i2, int i3) {
        if (i2 == Integer.MIN_VALUE && drawable.getIntrinsicWidth() <= 0) {
            if (Log.isLoggable(f18716k, 5)) {
                Log.w(f18716k, "Unable to draw " + drawable + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width");
            }
            return null;
        }
        if (i3 == Integer.MIN_VALUE && drawable.getIntrinsicHeight() <= 0) {
            if (Log.isLoggable(f18716k, 5)) {
                Log.w(f18716k, "Unable to draw " + drawable + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height");
            }
            return null;
        }
        if (drawable.getIntrinsicWidth() > 0) {
            i2 = drawable.getIntrinsicWidth();
        }
        if (drawable.getIntrinsicHeight() > 0) {
            i3 = drawable.getIntrinsicHeight();
        }
        Lock lockM10973s = jp0y.m10973s();
        lockM10973s.lock();
        Bitmap bitmapMo10666g = interfaceC3008n.mo10666g(i2, i3, Bitmap.Config.ARGB_8888);
        try {
            Canvas canvas = new Canvas(bitmapMo10666g);
            drawable.setBounds(0, 0, i2, i3);
            drawable.draw(canvas);
            canvas.setBitmap(null);
            return bitmapMo10666g;
        } finally {
            lockM10973s.unlock();
        }
    }
}
