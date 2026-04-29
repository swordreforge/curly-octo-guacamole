package androidx.core.graphics;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;
import zy.InterfaceC7830i;
import zy.dd;
import zy.hyr;
import zy.lvui;
import zy.yz;

/* JADX INFO: renamed from: androidx.core.graphics.k */
/* JADX INFO: compiled from: BitmapCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0536k {

    /* JADX INFO: renamed from: androidx.core.graphics.k$k */
    /* JADX INFO: compiled from: BitmapCompat.java */
    @hyr(17)
    static class k {
        private k() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static boolean m2498k(Bitmap bitmap) {
            return bitmap.hasMipMap();
        }

        @InterfaceC7830i
        static void toq(Bitmap bitmap, boolean z2) {
            bitmap.setHasMipMap(z2);
        }
    }

    /* JADX INFO: renamed from: androidx.core.graphics.k$n */
    /* JADX INFO: compiled from: BitmapCompat.java */
    @hyr(31)
    static class n {
        private n() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static Bitmap.Config m2499k(Bitmap bitmap) {
            return bitmap.getHardwareBuffer().getFormat() == 22 ? Bitmap.Config.RGBA_F16 : Bitmap.Config.ARGB_8888;
        }
    }

    /* JADX INFO: renamed from: androidx.core.graphics.k$q */
    /* JADX INFO: compiled from: BitmapCompat.java */
    @hyr(29)
    static class q {
        private q() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static void m2500k(Paint paint) {
            paint.setBlendMode(BlendMode.SRC);
        }
    }

    /* JADX INFO: renamed from: androidx.core.graphics.k$toq */
    /* JADX INFO: compiled from: BitmapCompat.java */
    @hyr(19)
    static class toq {
        private toq() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static int m2501k(Bitmap bitmap) {
            return bitmap.getAllocationByteCount();
        }
    }

    /* JADX INFO: renamed from: androidx.core.graphics.k$zy */
    /* JADX INFO: compiled from: BitmapCompat.java */
    @hyr(27)
    static class zy {
        private zy() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static Bitmap m2502k(Bitmap bitmap) {
            if (bitmap.getConfig() != Bitmap.Config.HARDWARE) {
                return bitmap;
            }
            Bitmap.Config configM2499k = Bitmap.Config.ARGB_8888;
            if (Build.VERSION.SDK_INT >= 31) {
                configM2499k = n.m2499k(bitmap);
            }
            return bitmap.copy(configM2499k, true);
        }

        @InterfaceC7830i
        static Bitmap toq(int i2, int i3, Bitmap bitmap, boolean z2) {
            Bitmap.Config config = bitmap.getConfig();
            ColorSpace colorSpace = bitmap.getColorSpace();
            ColorSpace colorSpace2 = ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
            if (z2 && !bitmap.getColorSpace().equals(colorSpace2)) {
                config = Bitmap.Config.RGBA_F16;
                colorSpace = colorSpace2;
            } else if (bitmap.getConfig() == Bitmap.Config.HARDWARE) {
                config = Bitmap.Config.ARGB_8888;
                if (Build.VERSION.SDK_INT >= 31) {
                    config = n.m2499k(bitmap);
                }
            }
            return Bitmap.createBitmap(i2, i3, config, bitmap.hasAlpha(), colorSpace);
        }

        @InterfaceC7830i
        static boolean zy(Bitmap bitmap) {
            return bitmap.getConfig() == Bitmap.Config.RGBA_F16 && bitmap.getColorSpace().equals(ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB));
        }
    }

    private C0536k() {
    }

    @lvui
    /* JADX INFO: renamed from: k */
    public static Bitmap m2495k(@lvui Bitmap bitmap, int i2, int i3, @dd Rect rect, boolean z2) {
        Paint paint;
        double dFloor;
        Paint paint2;
        int i4;
        Rect rect2;
        Bitmap bitmapCreateBitmap;
        if (i2 <= 0 || i3 <= 0) {
            throw new IllegalArgumentException("dstW and dstH must be > 0!");
        }
        if (rect != null && (rect.isEmpty() || rect.left < 0 || rect.right > bitmap.getWidth() || rect.top < 0 || rect.bottom > bitmap.getHeight())) {
            throw new IllegalArgumentException("srcRect must be contained by srcBm!");
        }
        int i5 = Build.VERSION.SDK_INT;
        Bitmap bitmapM2502k = i5 >= 27 ? zy.m2502k(bitmap) : bitmap;
        int iWidth = rect != null ? rect.width() : bitmap.getWidth();
        int iHeight = rect != null ? rect.height() : bitmap.getHeight();
        float f2 = i2 / iWidth;
        float f3 = i3 / iHeight;
        int i6 = rect != null ? rect.left : 0;
        int i7 = rect != null ? rect.top : 0;
        if (i6 == 0 && i7 == 0 && i2 == bitmap.getWidth() && i3 == bitmap.getHeight()) {
            return (bitmap.isMutable() && bitmap == bitmapM2502k) ? bitmap.copy(bitmap.getConfig(), true) : bitmapM2502k;
        }
        Paint paint3 = new Paint(1);
        paint3.setFilterBitmap(true);
        if (i5 >= 29) {
            q.m2500k(paint3);
        } else {
            paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        }
        if (iWidth == i2 && iHeight == i3) {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(i2, i3, bitmapM2502k.getConfig());
            new Canvas(bitmapCreateBitmap2).drawBitmap(bitmapM2502k, -i6, -i7, paint3);
            return bitmapCreateBitmap2;
        }
        double dLog = Math.log(2.0d);
        if (f2 > 1.0f) {
            paint = paint3;
            dFloor = Math.ceil(Math.log(f2) / dLog);
        } else {
            paint = paint3;
            dFloor = Math.floor(Math.log(f2) / dLog);
        }
        int i8 = (int) dFloor;
        int iCeil = (int) (f3 > 1.0f ? Math.ceil(Math.log(f3) / dLog) : Math.floor(Math.log(f3) / dLog));
        Bitmap bitmap2 = null;
        if (!z2 || i5 < 27 || zy.zy(bitmap)) {
            paint2 = paint;
            i4 = 0;
        } else {
            Bitmap qVar = zy.toq(i8 > 0 ? m2496n(iWidth, i2, 1, i8) : iWidth, iCeil > 0 ? m2496n(iHeight, i3, 1, iCeil) : iHeight, bitmap, true);
            paint2 = paint;
            new Canvas(qVar).drawBitmap(bitmapM2502k, -i6, -i7, paint2);
            i4 = 1;
            i7 = 0;
            i6 = 0;
            bitmap2 = bitmapM2502k;
            bitmapM2502k = qVar;
        }
        Rect rect3 = new Rect(i6, i7, iWidth, iHeight);
        Rect rect4 = new Rect();
        int i9 = i8;
        int i10 = iCeil;
        while (true) {
            if (i9 == 0 && i10 == 0) {
                break;
            }
            if (i9 < 0) {
                i9++;
            } else if (i9 > 0) {
                i9--;
            }
            if (i10 < 0) {
                i10++;
            } else if (i10 > 0) {
                i10--;
            }
            int i11 = i10;
            Paint paint4 = paint2;
            Rect rect5 = rect3;
            rect4.set(0, 0, m2496n(iWidth, i2, i9, i8), m2496n(iHeight, i3, i11, iCeil));
            boolean z3 = i9 == 0 && i11 == 0;
            boolean z5 = bitmap2 != null && bitmap2.getWidth() == i2 && bitmap2.getHeight() == i3;
            if (bitmap2 == null || bitmap2 == bitmap) {
                rect2 = rect4;
            } else {
                if (z2) {
                    rect2 = rect4;
                    if (Build.VERSION.SDK_INT < 27 || zy.zy(bitmap2)) {
                    }
                    Rect rect6 = rect2;
                    new Canvas(bitmapCreateBitmap).drawBitmap(bitmapM2502k, rect5, rect6, paint4);
                    rect5.set(rect6);
                    i10 = i11;
                    Bitmap bitmap3 = bitmapM2502k;
                    bitmapM2502k = bitmapCreateBitmap;
                    rect4 = rect6;
                    rect3 = rect5;
                    paint2 = paint4;
                    bitmap2 = bitmap3;
                } else {
                    rect2 = rect4;
                }
                if (!z3 || (z5 && i4 == 0)) {
                    bitmapCreateBitmap = bitmap2;
                }
                Rect rect62 = rect2;
                new Canvas(bitmapCreateBitmap).drawBitmap(bitmapM2502k, rect5, rect62, paint4);
                rect5.set(rect62);
                i10 = i11;
                Bitmap bitmap32 = bitmapM2502k;
                bitmapM2502k = bitmapCreateBitmap;
                rect4 = rect62;
                rect3 = rect5;
                paint2 = paint4;
                bitmap2 = bitmap32;
            }
            if (bitmap2 != bitmap && bitmap2 != null) {
                bitmap2.recycle();
            }
            int iM2496n = m2496n(iWidth, i2, i9 > 0 ? i4 : i9, i8);
            int iM2496n2 = m2496n(iHeight, i3, i11 > 0 ? i4 : i11, iCeil);
            if (Build.VERSION.SDK_INT >= 27) {
                bitmapCreateBitmap = zy.toq(iM2496n, iM2496n2, bitmap, z2 && !z3);
            } else {
                bitmapCreateBitmap = Bitmap.createBitmap(iM2496n, iM2496n2, bitmapM2502k.getConfig());
            }
            Rect rect622 = rect2;
            new Canvas(bitmapCreateBitmap).drawBitmap(bitmapM2502k, rect5, rect622, paint4);
            rect5.set(rect622);
            i10 = i11;
            Bitmap bitmap322 = bitmapM2502k;
            bitmapM2502k = bitmapCreateBitmap;
            rect4 = rect622;
            rect3 = rect5;
            paint2 = paint4;
            bitmap2 = bitmap322;
        }
        if (bitmap2 != bitmap && bitmap2 != null) {
            bitmap2.recycle();
        }
        return bitmapM2502k;
    }

    @yz
    /* JADX INFO: renamed from: n */
    public static int m2496n(int i2, int i3, int i4, int i5) {
        return i4 == 0 ? i3 : i4 > 0 ? i2 * (1 << (i5 - i4)) : i3 << ((-i4) - 1);
    }

    /* JADX INFO: renamed from: q */
    public static void m2497q(@lvui Bitmap bitmap, boolean z2) {
        k.toq(bitmap, z2);
    }

    public static int toq(@lvui Bitmap bitmap) {
        return toq.m2501k(bitmap);
    }

    public static boolean zy(@lvui Bitmap bitmap) {
        return k.m2498k(bitmap);
    }
}
