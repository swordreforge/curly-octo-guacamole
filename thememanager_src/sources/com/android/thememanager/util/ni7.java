package com.android.thememanager.util;

import android.app.WallpaperColors;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import kotlin.math.C6321q;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: BitmapUtil.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ni7 {

    /* JADX INFO: renamed from: g */
    public static final int f16662g = -1;

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    public static final ni7 f16663k = new ni7();

    /* JADX INFO: renamed from: n */
    private static final int f16664n = 5;

    /* JADX INFO: renamed from: q */
    private static final int f16665q = 400;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    private static final String f61371toq = "BitmapUtil";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final int f61372zy = 400;

    private ni7() {
    }

    private final boolean cdj(Bitmap bitmap, String str, Bitmap.CompressFormat compressFormat) throws Throwable {
        FileOutputStream fileOutputStream;
        Log.i(f61371toq, "toFile: filePath=" + str);
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                File file = new File(str);
                n7h(file);
                fileOutputStream = new FileOutputStream(file);
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            bitmap.compress(compressFormat, 100, fileOutputStream);
            miuix.core.util.f7l8.zy(fileOutputStream);
            Log.i(f61371toq, "toFile: file " + str + " save completed");
            return true;
        } catch (Exception e3) {
            e = e3;
            fileOutputStream2 = fileOutputStream;
            Log.e(f61371toq, "toFile: " + e);
            miuix.core.util.f7l8.zy(fileOutputStream2);
            Log.i(f61371toq, "toFile: file " + str + " save completed");
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            miuix.core.util.f7l8.zy(fileOutputStream2);
            Log.i(f61371toq, "toFile: file " + str + " save completed");
            throw th;
        }
    }

    private final Bitmap fn3e(Bitmap bitmap, int i2, int i3) {
        Log.i(f61371toq, "tryCompress: reqWidth=" + i2 + ", reqHeight=" + i3);
        return (i2 == -1 || i3 == -1) ? bitmap : (i2 == bitmap.getWidth() && i3 == bitmap.getHeight()) ? bitmap : m9899k(bitmap, i2, i3);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ Bitmap m9897g(ni7 ni7Var, String str, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = -1;
        }
        if ((i4 & 4) != 0) {
            i3 = -1;
        }
        return ni7Var.m9904n(str, i2, i3);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ Bitmap m9898h(ni7 ni7Var, Drawable drawable, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = 0;
        }
        return ni7Var.kja0(drawable, i2, i3);
    }

    /* JADX INFO: renamed from: k */
    private final Bitmap m9899k(Bitmap bitmap, int i2, int i3) {
        boolean z2;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width <= 0 || height <= 0) {
            Log.w(f61371toq, "compress: src size invalid ! reqWidth=" + width + ", reqHeight=" + height);
            return null;
        }
        float f2 = width;
        float f3 = i2 / f2;
        float f4 = height;
        float f5 = i3 / f4;
        Log.i(f61371toq, "compress: src width=" + bitmap.getWidth() + ",height=" + bitmap.getHeight());
        if (f3 > f5) {
            z2 = true;
        } else {
            f3 = f5;
            z2 = false;
        }
        if (z2) {
            int iG1 = C6321q.g1(f4 * f3);
            int iAbs = Math.abs(iG1 - i3) / 2;
            Log.i(f61371toq, "compress: scaleByWidth:scaleHeight=" + iG1 + ", top=" + iAbs);
            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, i2, iG1, true);
            bitmap.recycle();
            return Bitmap.createBitmap(bitmapCreateScaledBitmap, 0, iAbs, i2, i3);
        }
        int iG12 = C6321q.g1(f2 * f3);
        int iAbs2 = Math.abs(iG12 - i2) / 2;
        Log.i(f61371toq, "compress: scaleByHeight:scaleWidth=" + iG12 + ", left=" + iAbs2);
        Bitmap bitmapCreateScaledBitmap2 = Bitmap.createScaledBitmap(bitmap, iG12, i3, true);
        bitmap.recycle();
        return Bitmap.createBitmap(bitmapCreateScaledBitmap2, iAbs2, 0, i2, i3);
    }

    private final void n7h(File file) {
        try {
            if (file.exists()) {
                return;
            }
            new File(file.getParent()).mkdirs();
            file.createNewFile();
        } catch (Exception unused) {
            Log.e(f61371toq, "makeParentDirExists: $e");
        }
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ Bitmap m9900p(ni7 ni7Var, InputStream inputStream, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = -1;
        }
        if ((i4 & 4) != 0) {
            i3 = -1;
        }
        return ni7Var.m9905s(inputStream, i2, i3);
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ Bitmap m9901q(ni7 ni7Var, Drawable drawable, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = -1;
        }
        if ((i4 & 4) != 0) {
            i3 = -1;
        }
        return ni7Var.zy(drawable, i2, i3);
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ Bitmap m9902y(ni7 ni7Var, String str, int i2, int i3, Bitmap.Config config, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = -1;
        }
        if ((i4 & 4) != 0) {
            i3 = -1;
        }
        if ((i4 & 8) != 0) {
            config = null;
        }
        return ni7Var.f7l8(str, i2, i3, config);
    }

    @InterfaceC7395n
    public final Bitmap f7l8(@InterfaceC7395n String str, int i2, int i3, @InterfaceC7395n Bitmap.Config config) {
        if (str == null) {
            return null;
        }
        try {
            Log.d(f61371toq, "reqWidth = " + i2);
            Log.d(f61371toq, "reqHeight = " + i3);
            BitmapFactory.Options options = new BitmapFactory.Options();
            if (config != null) {
                options.inPreferredConfig = config;
            } else {
                options.inPreferredConfig = Bitmap.Config.RGB_565;
            }
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            Log.d(f61371toq, "outHeight = " + options.outHeight);
            Log.d(f61371toq, "outWidth = " + options.outWidth);
            float fM23298i = kotlin.ranges.fn3e.m23298i(((float) options.outHeight) / ((float) i3), ((float) options.outWidth) / ((float) i2));
            Log.d(f61371toq, "inSampleSize = " + fM23298i);
            options.inSampleSize = C6321q.g1(kotlin.ranges.fn3e.m23298i(fM23298i, 1.0f));
            Log.d(f61371toq, "options.inSampleSize = " + options.inSampleSize);
            options.inJustDecodeBounds = false;
            return BitmapFactory.decodeFile(str, options);
        } catch (Exception e2) {
            Log.e(f61371toq, "fromFile: " + e2);
            return null;
        }
    }

    /* JADX INFO: renamed from: i */
    public final boolean m9903i(@InterfaceC7396q Bitmap bitmap, @InterfaceC7396q String filePath) {
        kotlin.jvm.internal.d2ok.m23075h(bitmap, "bitmap");
        kotlin.jvm.internal.d2ok.m23075h(filePath, "filePath");
        return cdj(bitmap, filePath, Bitmap.CompressFormat.WEBP_LOSSY);
    }

    @InterfaceC7396q
    public final InputStream ki(@InterfaceC7396q Bitmap bitmap) {
        kotlin.jvm.internal.d2ok.m23075h(bitmap, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        return new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
    }

    @InterfaceC7395n
    public final Bitmap kja0(@InterfaceC7396q Drawable drawable, int i2, int i3) {
        Bitmap bitmapCreateBitmap;
        kotlin.jvm.internal.d2ok.m23075h(drawable, "<this>");
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            kotlin.jvm.internal.d2ok.kja0(bitmap, "getBitmap(...)");
            return bitmap;
        }
        if (i2 > 0 || i3 > 0) {
            bitmapCreateBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
            kotlin.jvm.internal.d2ok.qrj(bitmapCreateBitmap);
        } else if (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) {
            bitmapCreateBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
            kotlin.jvm.internal.d2ok.qrj(bitmapCreateBitmap);
        } else {
            bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            kotlin.jvm.internal.d2ok.qrj(bitmapCreateBitmap);
        }
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    public final int ld6(@InterfaceC7396q Bitmap bitmap) {
        kotlin.jvm.internal.d2ok.m23075h(bitmap, "<this>");
        return (WallpaperColors.fromBitmap(bitmap).getColorHints() & 1) == 1 ? 2 : 0;
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: n */
    public final Bitmap m9904n(@InterfaceC7395n String str, int i2, int i3) {
        if (str == null) {
            return null;
        }
        try {
            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str);
            kotlin.jvm.internal.d2ok.kja0(bitmapDecodeFile, "decodeFile(...)");
            return fn3e(bitmapDecodeFile, i2, i3);
        } catch (Exception e2) {
            Log.e(f61371toq, "fromFile: " + e2);
            return null;
        }
    }

    public final boolean qrj(@InterfaceC7396q Bitmap bitmap) {
        kotlin.jvm.internal.d2ok.m23075h(bitmap, "<this>");
        return ld6(bitmap) == 2;
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: s */
    public final Bitmap m9905s(@InterfaceC7396q InputStream inputStream, int i2, int i3) {
        kotlin.jvm.internal.d2ok.m23075h(inputStream, "inputStream");
        try {
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStream);
            kotlin.jvm.internal.d2ok.kja0(bitmapDecodeStream, "decodeStream(...)");
            return fn3e(bitmapDecodeStream, i2, i3);
        } catch (Exception e2) {
            Log.e(f61371toq, "fromInputStream: " + e2);
            return null;
        }
    }

    public final boolean t8r(@InterfaceC7396q Bitmap bitmap, @InterfaceC7396q String filePath) {
        kotlin.jvm.internal.d2ok.m23075h(bitmap, "bitmap");
        kotlin.jvm.internal.d2ok.m23075h(filePath, "filePath");
        return cdj(bitmap, filePath, Bitmap.CompressFormat.JPEG);
    }

    @InterfaceC7395n
    public final Bitmap toq(@InterfaceC7395n Bitmap bitmap, int i2, int i3, int i4, int i5) {
        if (bitmap == null) {
            return null;
        }
        if (i3 <= i2 || i5 <= i4) {
            Log.w(f61371toq, "cropBitmap: size invalid! left=" + i2 + ",right=" + i3 + ",top=" + i4 + ",bottom=" + i5);
            return null;
        }
        try {
            return Bitmap.createBitmap(bitmap, i2, i4, i3 - i2, i5 - i4);
        } catch (Exception e2) {
            Log.w(f61371toq, "cropBitmap: left=" + i2 + ",right=" + i3 + ",top=" + i4 + ",bottom=" + i5 + ",width=" + Integer.valueOf(bitmap.getWidth()) + ",height=" + Integer.valueOf(bitmap.getHeight()));
            Log.e(f61371toq, "cropBitmap: ", e2);
            return null;
        }
    }

    public final boolean x2(@InterfaceC7396q Bitmap bitmap) {
        kotlin.jvm.internal.d2ok.m23075h(bitmap, "<this>");
        return ld6(bitmap) == 0;
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
            kotlin.jvm.internal.d2ok.qrj(bitmapCreateBitmap);
            return fn3e(bitmapCreateBitmap, i2, i3);
        } catch (Exception e2) {
            Log.e(f61371toq, "fromDrawable: " + e2);
            return null;
        }
    }
}
