package com.android.thememanager.lockscreen.lock.wallpaper;

import android.app.WallpaperColors;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.io.InputStream;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: BitmapUtil.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class toq {

    /* JADX INFO: renamed from: g */
    public static final int f12528g = -1;

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    public static final toq f12529k = new toq();

    /* JADX INFO: renamed from: n */
    private static final int f12530n = 5;

    /* JADX INFO: renamed from: q */
    private static final int f12531q = 400;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    private static final String f60407toq = "BitmapUtil";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final int f60408zy = 400;

    private toq() {
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ Bitmap m8154g(toq toqVar, String str, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = -1;
        }
        if ((i4 & 4) != 0) {
            i3 = -1;
        }
        return toqVar.m8158n(str, i2, i3);
    }

    /* JADX INFO: renamed from: k */
    private final Bitmap m8155k(Bitmap bitmap, int i2, int i3) {
        boolean z2;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width <= 0 || height <= 0) {
            Log.w(f60407toq, "compress: src size invalid ! reqWidth=" + width + ", reqHeight=" + height);
            return null;
        }
        float f2 = width;
        float f3 = i2 / f2;
        float f4 = height;
        float f5 = i3 / f4;
        Log.i(f60407toq, "compress: src width=" + bitmap.getWidth() + ",height=" + bitmap.getHeight());
        if (f3 > f5) {
            z2 = true;
        } else {
            f3 = f5;
            z2 = false;
        }
        if (z2) {
            int i4 = (int) (f4 * f3);
            int iAbs = Math.abs(i4 - i3) / 2;
            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, i2, i4, true);
            bitmap.recycle();
            return Bitmap.createBitmap(bitmapCreateScaledBitmap, 0, iAbs, i2, i3);
        }
        int i5 = (int) (f2 * f3);
        int iAbs2 = Math.abs(i5 - i2) / 2;
        Bitmap bitmapCreateScaledBitmap2 = Bitmap.createScaledBitmap(bitmap, i5, i3, true);
        bitmap.recycle();
        return Bitmap.createBitmap(bitmapCreateScaledBitmap2, iAbs2, 0, i2, i3);
    }

    private final Bitmap n7h(Bitmap bitmap, int i2, int i3) {
        Log.i(f60407toq, "tryCompress: reqWidth=" + i2 + ", reqHeight=" + i3);
        return (i2 == -1 || i3 == -1) ? bitmap : (i2 == bitmap.getWidth() && i3 == bitmap.getHeight()) ? bitmap : m8155k(bitmap, i2, i3);
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ Bitmap m8156q(toq toqVar, Drawable drawable, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = -1;
        }
        if ((i4 & 4) != 0) {
            i3 = -1;
        }
        return toqVar.zy(drawable, i2, i3);
    }

    public static /* synthetic */ Bitmap qrj(toq toqVar, Drawable drawable, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = 0;
        }
        return toqVar.x2(drawable, i2, i3);
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ Bitmap m8157y(toq toqVar, InputStream inputStream, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = -1;
        }
        if ((i4 & 4) != 0) {
            i3 = -1;
        }
        return toqVar.f7l8(inputStream, i2, i3);
    }

    @InterfaceC7395n
    public final Bitmap f7l8(@InterfaceC7396q InputStream inputStream, int i2, int i3) {
        d2ok.m23075h(inputStream, "inputStream");
        try {
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStream);
            d2ok.kja0(bitmapDecodeStream, "decodeStream(...)");
            return n7h(bitmapDecodeStream, i2, i3);
        } catch (Exception e2) {
            Log.e(f60407toq, "fromInputStream: " + e2);
            return null;
        }
    }

    public final boolean ld6(@InterfaceC7396q Bitmap bitmap) {
        d2ok.m23075h(bitmap, "<this>");
        return m8160s(bitmap) == 2;
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: n */
    public final Bitmap m8158n(@InterfaceC7395n String str, int i2, int i3) {
        if (str == null) {
            return null;
        }
        try {
            Log.e(f60407toq, "fromFile: " + str);
            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str);
            d2ok.kja0(bitmapDecodeFile, "decodeFile(...)");
            return n7h(bitmapDecodeFile, i2, i3);
        } catch (Exception e2) {
            Log.e(f60407toq, "fromFile: " + e2);
            return null;
        }
    }

    /* JADX INFO: renamed from: p */
    public final boolean m8159p(@InterfaceC7396q Bitmap bitmap) {
        d2ok.m23075h(bitmap, "<this>");
        return m8160s(bitmap) == 0;
    }

    /* JADX INFO: renamed from: s */
    public final int m8160s(@InterfaceC7396q Bitmap bitmap) {
        d2ok.m23075h(bitmap, "<this>");
        return (WallpaperColors.fromBitmap(bitmap).getColorHints() & 1) == 1 ? 2 : 0;
    }

    @InterfaceC7395n
    public final Bitmap toq(@InterfaceC7395n Bitmap bitmap, int i2, int i3, int i4, int i5) {
        if (bitmap == null) {
            return null;
        }
        if (i3 > i2 && i5 > i4) {
            return Bitmap.createBitmap(bitmap, i2, i4, i3 - i2, i5 - i4);
        }
        Log.w(f60407toq, "cropBitmap: size invalid! left=" + i2 + ",right=" + i3 + ",top=" + i4 + ",bottom=" + i5);
        return null;
    }

    @InterfaceC7395n
    public final Bitmap x2(@InterfaceC7396q Drawable drawable, int i2, int i3) {
        Bitmap bitmapCreateBitmap;
        d2ok.m23075h(drawable, "<this>");
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            d2ok.kja0(bitmap, "getBitmap(...)");
            return bitmap;
        }
        if (i2 > 0 || i3 > 0) {
            bitmapCreateBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
            d2ok.qrj(bitmapCreateBitmap);
        } else if (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) {
            bitmapCreateBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
            d2ok.qrj(bitmapCreateBitmap);
        } else {
            bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            d2ok.qrj(bitmapCreateBitmap);
        }
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    @InterfaceC7395n
    public final Bitmap zy(@InterfaceC7395n Drawable drawable, int i2, int i3) {
        if (drawable == null) {
            return null;
        }
        try {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            drawable.draw(canvas);
            d2ok.qrj(bitmapCreateBitmap);
            return n7h(bitmapCreateBitmap, i2, i3);
        } catch (Exception e2) {
            Log.e(f60407toq, "fromDrawable: " + e2);
            return null;
        }
    }
}
