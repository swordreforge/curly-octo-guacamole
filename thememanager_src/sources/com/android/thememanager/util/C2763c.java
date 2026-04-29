package com.android.thememanager.util;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import androidx.exifinterface.media.C0846k;
import com.android.thememanager.library.util.app.C2088k;
import com.android.thememanager.wallpaper.C2949g;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import miui.util.InputStreamLoader;
import miuix.core.util.C7083n;

/* JADX INFO: renamed from: com.android.thememanager.util.c */
/* JADX INFO: compiled from: ImageUtils.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2763c {

    /* JADX INFO: renamed from: k */
    private static final String f16348k = "ImageUtils";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static byte[] f61206toq = {-119, 80, 78, 71, com.google.common.base.zy.f68124kja0, 10, com.google.common.base.zy.f68121jk, 10};

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static byte[] f61207zy = {82, 73, 70, 70, 0, 0, 0, 0, 87, 69, 66, 80};

    /* JADX INFO: renamed from: com.android.thememanager.util.c$k */
    /* JADX INFO: compiled from: ImageUtils.java */
    public static class k {

        /* JADX INFO: renamed from: g */
        public boolean f16349g;

        /* JADX INFO: renamed from: k */
        public int f16350k;

        /* JADX INFO: renamed from: n */
        public Rect f16351n;

        /* JADX INFO: renamed from: q */
        public int f16352q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public int f61208toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public int f61209zy;

        public k() {
        }

        public k(int rx, int ry, int borderWidth, int borderColor) {
            this.f16350k = rx;
            this.f61208toq = ry;
            this.f61209zy = borderWidth;
            this.f16352q = borderColor;
        }

        public k(k cOpt) {
            this.f16350k = cOpt.f16350k;
            this.f61208toq = cOpt.f61208toq;
            this.f61209zy = cOpt.f61209zy;
            this.f16352q = cOpt.f16352q;
            this.f16351n = cOpt.f16351n;
            this.f16349g = cOpt.f16349g;
        }
    }

    public static Bitmap a9(Bitmap srcBmp, int destWidth, int destHeight, k cOpt) {
        if (cOpt == null) {
            cOpt = new k();
        }
        Bitmap bitmapCreateBitmap = null;
        try {
            int width = srcBmp.getWidth();
            int height = srcBmp.getHeight();
            if (width == destWidth && height == destHeight && cOpt.f16350k <= 0 && cOpt.f61208toq <= 0 && cOpt.f61209zy <= 0) {
                return srcBmp;
            }
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            if (srcBmp.getConfig() != null) {
                config = srcBmp.getConfig();
            }
            bitmapCreateBitmap = Bitmap.createBitmap(destWidth, destHeight, config);
            f7l8(srcBmp, bitmapCreateBitmap, cOpt);
        } catch (Exception | OutOfMemoryError unused) {
        }
        return bitmapCreateBitmap;
    }

    public static BitmapFactory.Options cdj() {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDither = false;
        options.inJustDecodeBounds = false;
        options.inSampleSize = 1;
        options.inScaled = false;
        return options;
    }

    public static boolean f7l8(Bitmap srcBmp, Bitmap destBmp, k cOpt) {
        if (srcBmp == null || destBmp == null || srcBmp == destBmp) {
            return false;
        }
        k kVar = cOpt == null ? new k() : cOpt;
        Rect rect = kVar.f16351n;
        if (rect == null) {
            rect = new Rect(0, 0, srcBmp.getWidth(), srcBmp.getHeight());
        }
        int iM9648k = m9648k(0, srcBmp.getWidth() - 1, rect.left);
        int iM9648k2 = m9648k(iM9648k, srcBmp.getWidth(), rect.right);
        int iM9648k3 = m9648k(0, srcBmp.getHeight() - 1, rect.top);
        int iM9648k4 = m9648k(iM9648k3, srcBmp.getHeight(), rect.bottom);
        int i2 = iM9648k2 - iM9648k;
        int i3 = iM9648k4 - iM9648k3;
        int width = destBmp.getWidth();
        int height = destBmp.getHeight();
        kVar.f61209zy = m9648k(0, Math.min(width, height) / 2, kVar.f61209zy);
        kVar.f16350k = m9648k(0, width / 2, kVar.f16350k);
        kVar.f61208toq = m9648k(0, height / 2, kVar.f61208toq);
        Paint paint = new Paint();
        Canvas canvas = new Canvas(destBmp);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        canvas.drawPaint(paint);
        paint.setFilterBitmap(true);
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setXfermode(null);
        int i4 = kVar.f16350k;
        int i5 = kVar.f61209zy;
        if (i4 - i5 > 0 && kVar.f61208toq - i5 > 0) {
            int i6 = kVar.f61209zy;
            RectF rectF = new RectF(i6, i6, width - i6, height - i6);
            int i7 = kVar.f16350k;
            int i8 = kVar.f61209zy;
            canvas.drawRoundRect(rectF, i7 - i8, kVar.f61208toq - i8, paint);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        }
        int i9 = kVar.f61209zy;
        float f2 = i2;
        float f3 = width - (i9 * 2);
        float f4 = i3;
        float f5 = height - (i9 * 2);
        float fMin = Math.min((f2 * 1.0f) / f3, (1.0f * f4) / f5);
        int i10 = (int) ((f2 - (f3 * fMin)) / 2.0f);
        int i11 = (int) ((f4 - (f5 * fMin)) / 2.0f);
        Rect rect2 = new Rect(iM9648k + i10, iM9648k3 + i11, iM9648k2 - i10, iM9648k4 - i11);
        int i12 = kVar.f61209zy;
        canvas.drawBitmap(srcBmp, rect2, new Rect(i12, i12, width - i12, height - i12), paint);
        if (kVar.f61209zy > 0) {
            int i13 = kVar.f16352q;
            if ((i13 >>> 24) != 0) {
                paint.setColor(i13);
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
                canvas.drawRoundRect(new RectF(0.0f, 0.0f, width, height), kVar.f16350k, kVar.f61208toq, paint);
            }
        }
        if (!kVar.f16349g) {
            return true;
        }
        srcBmp.recycle();
        return true;
    }

    public static boolean fn3e(InputStreamLoader streamLoader) {
        return zurt(ki(streamLoader, f61206toq.length));
    }

    public static Bitmap fti(Bitmap srcBmp, int destWidth, int destHeight, boolean recycleSrcBmp) {
        k kVar = new k();
        kVar.f16349g = recycleSrcBmp;
        return a9(srcBmp, destWidth, destHeight, kVar);
    }

    public static boolean fu4(InputStreamLoader streamLoader) {
        return m9655z(ki(streamLoader, f61207zy.length));
    }

    /* JADX INFO: renamed from: g */
    public static Bitmap m9645g(Bitmap bitmap, int width, int height) {
        try {
            return Bitmap.createBitmap((DisplayMetrics) null, width, height, bitmap.getConfig(), true, bitmap.getColorSpace());
        } catch (OutOfMemoryError e2) {
            e2.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: h */
    public static Bitmap m9646h(String path, BitmapFactory.Options decodeOption) {
        int iQrj;
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(path, decodeOption);
        return (bitmapDecodeFile == null || (iQrj = qrj(path)) == 0) ? bitmapDecodeFile : o1t(bitmapDecodeFile, iQrj);
    }

    /* JADX INFO: renamed from: i */
    public static void m9647i(Context context, View view) {
        if (!(context instanceof Activity)) {
            com.bumptech.glide.zy.a9(context).o1t(view);
        } else if (((Activity) context).isDestroyed()) {
            Log.w(f16348k, "glideClear: activity is destory");
        } else {
            com.bumptech.glide.zy.a9(context).o1t(view);
        }
    }

    private static boolean jk(InputStreamLoader streamLoader, String path) {
        try {
            C7083n.m25589q(streamLoader.get(), new File(path));
            streamLoader.close();
            return true;
        } catch (Exception unused) {
            if (streamLoader != null) {
                streamLoader.close();
            }
            return false;
        } catch (Throwable th) {
            if (streamLoader != null) {
                streamLoader.close();
            }
            throw th;
        }
    }

    public static void jp0y(ColorSpace colorSpace, Bitmap transform) {
        if (colorSpace == null || transform == null || !colorSpace.isWideGamut() || !C2949g.f17747k.ld6() || Build.VERSION.SDK_INT < 29) {
            return;
        }
        transform.setColorSpace(colorSpace);
    }

    /* JADX INFO: renamed from: k */
    private static int m9648k(int minValue, int maxValue, int value) {
        return Math.min(maxValue, Math.max(minValue, value));
    }

    private static byte[] ki(InputStreamLoader streamLoader, int imageHeaderLength) {
        byte[] bArr = new byte[imageHeaderLength];
        try {
            if (streamLoader.get().read(bArr) < imageHeaderLength) {
                streamLoader.close();
                return null;
            }
        } catch (Exception unused) {
            if (streamLoader != null) {
            }
            return bArr;
        } catch (Throwable th) {
            if (streamLoader != null) {
                streamLoader.close();
            }
            throw th;
        }
        streamLoader.close();
        return bArr;
    }

    public static final BitmapFactory.Options kja0(InputStreamLoader streamLoader) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        try {
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeStream(streamLoader.get(), null, options);
        } catch (Exception unused) {
        } catch (Throwable th) {
            streamLoader.close();
            throw th;
        }
        streamLoader.close();
        return options;
    }

    public static Bitmap ld6(InputStreamLoader streamLoader, int destWidth, int destHeight, Bitmap reusedBitmap) {
        Bitmap bitmapDecodeStream = null;
        if (reusedBitmap != null && !reusedBitmap.isRecycled()) {
            BitmapFactory.Options optionsKja0 = kja0(streamLoader);
            if (optionsKja0.outWidth == reusedBitmap.getWidth() && optionsKja0.outHeight == reusedBitmap.getHeight()) {
                try {
                    BitmapFactory.Options optionsCdj = cdj();
                    optionsCdj.inBitmap = reusedBitmap;
                    optionsCdj.inSampleSize = 1;
                    bitmapDecodeStream = BitmapFactory.decodeStream(streamLoader.get(), null, optionsCdj);
                } catch (Exception | OutOfMemoryError unused) {
                } catch (Throwable th) {
                    streamLoader.close();
                    throw th;
                }
                streamLoader.close();
            }
        }
        return bitmapDecodeStream != null ? (destWidth <= 0 || destHeight <= 0) ? bitmapDecodeStream : fti(bitmapDecodeStream, destWidth, destHeight, true) : m9650p(streamLoader, destWidth, destHeight);
    }

    public static boolean mcp(Bitmap bitmap, String path, boolean saveToPng, int quality) throws Throwable {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            if (bitmap != null) {
                try {
                    fileOutputStream = new FileOutputStream(path);
                    if (quality < 0 || quality > 100) {
                        quality = 100;
                    }
                } catch (Exception e2) {
                    e = e2;
                }
                try {
                    bitmap.compress(saveToPng ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG, quality, fileOutputStream);
                    com.android.thememanager.basemodule.utils.y9n.m7246g(fileOutputStream);
                    return true;
                } catch (Exception e3) {
                    e = e3;
                    fileOutputStream2 = fileOutputStream;
                    e.printStackTrace();
                    com.android.thememanager.basemodule.utils.y9n.m7246g(fileOutputStream2);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream2 = fileOutputStream;
                    com.android.thememanager.basemodule.utils.y9n.m7246g(fileOutputStream2);
                    throw th;
                }
            }
            com.android.thememanager.basemodule.utils.y9n.m7246g(fileOutputStream2);
            return false;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: n */
    public static Bitmap m9649n(@zy.fn3e int drawableId) {
        Drawable drawableZy = androidx.appcompat.widget.ld6.toq().zy(C2088k.m8026k(), drawableId);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawableZy.getIntrinsicWidth(), drawableZy.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawableZy.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawableZy.draw(canvas);
        return bitmapCreateBitmap;
    }

    public static final BitmapFactory.Options n7h(String filePath) {
        return kja0(new InputStreamLoader(filePath));
    }

    @zy.y9n
    public static boolean ni7(Bitmap bitmap, int degree) {
        if (bitmap == null) {
            return false;
        }
        int width = bitmap.getWidth() / degree;
        int height = bitmap.getHeight() / degree;
        Pair[][] pairArr = (Pair[][]) Array.newInstance((Class<?>) Pair.class, degree, degree);
        for (int i2 = 0; i2 < pairArr.length; i2++) {
            int i3 = 0;
            while (true) {
                Pair[] pairArr2 = pairArr[i2];
                if (i3 < pairArr2.length) {
                    pairArr2[i3] = new Pair(Integer.valueOf(i2 * width), Integer.valueOf(i3 * height));
                    i3++;
                }
            }
        }
        for (Pair[] pairArr3 : pairArr) {
            for (Pair pair : pairArr3) {
                if (Color.alpha(bitmap.getPixel(((Integer) pair.first).intValue(), ((Integer) pair.second).intValue())) != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    private static Bitmap o1t(Bitmap src, int degree) {
        Bitmap bitmapCreateBitmap;
        Matrix matrix = new Matrix();
        matrix.postRotate(degree);
        try {
            bitmapCreateBitmap = Bitmap.createBitmap(src, 0, 0, src.getWidth(), src.getHeight(), matrix, true);
        } catch (OutOfMemoryError e2) {
            Log.e(C2755a.f16307g, "Rotate bitmap error ." + e2);
            bitmapCreateBitmap = null;
        }
        if (bitmapCreateBitmap == null) {
            bitmapCreateBitmap = src;
        }
        if (src != bitmapCreateBitmap) {
            src.recycle();
        }
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: p */
    public static Bitmap m9650p(InputStreamLoader streamLoader, int destWidth, int destHeight) {
        int i2 = destWidth * destHeight * 2;
        if (destWidth <= 0 || destHeight <= 0) {
            i2 = -1;
        }
        Bitmap bitmapM9652s = m9652s(streamLoader, i2);
        return i2 > 0 ? fti(bitmapM9652s, destWidth, destHeight, true) : bitmapM9652s;
    }

    /* JADX INFO: renamed from: q */
    public static int m9651q(InputStreamLoader streamLoader, int pixelSize) {
        int i2 = 1;
        if (pixelSize > 0) {
            BitmapFactory.Options optionsKja0 = kja0(streamLoader);
            while (i2 * 2 <= Math.sqrt((((double) optionsKja0.outWidth) * ((double) optionsKja0.outHeight)) / ((double) pixelSize))) {
                i2 <<= 1;
            }
        }
        return i2;
    }

    public static int qrj(String path) {
        int i2;
        try {
            int iX2 = new C0846k(path).x2(C0846k.f51303mcp, 1);
            if (iX2 == 3) {
                i2 = 180;
            } else if (iX2 == 6) {
                i2 = 90;
            } else {
                if (iX2 != 8) {
                    return 0;
                }
                i2 = 270;
            }
            return i2;
        } catch (IOException e2) {
            Log.e(C2755a.f16307g, "Get bitmap degree error." + e2);
            return 0;
        }
    }

    /* JADX INFO: renamed from: s */
    public static final Bitmap m9652s(InputStreamLoader streamLoader, int pixelSize) {
        return x2(streamLoader, pixelSize, false);
    }

    /* JADX INFO: renamed from: t */
    public static boolean m9653t(Bitmap bitmap, String path) {
        return mcp(bitmap, path, false, 100);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0059 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String t8r(java.lang.String r5) throws java.lang.Throwable {
        /*
            boolean r0 = p029m.zy.toq(r5)
            java.lang.String r1 = ""
            if (r0 == 0) goto L10
            java.lang.String r5 = "ImageUtils"
            java.lang.String r0 = "getImageTypeFormNet: path is empty"
            android.util.Log.d(r5, r0)
            return r1
        L10:
            r0 = 0
            java.net.URL r2 = new java.net.URL     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L44
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L44
            java.net.URLConnection r5 = r2.openConnection()     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L44
            r5.connect()     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L44
            java.io.InputStream r5 = r5.getInputStream()     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L44
            android.graphics.BitmapFactory$Options r2 = new android.graphics.BitmapFactory$Options     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L56
            r2.<init>()     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L56
            r3 = 1
            r2.inJustDecodeBounds = r3     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L56
            android.graphics.BitmapFactory.decodeStream(r5, r0, r2)     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L56
            java.lang.String r0 = r2.outMimeType     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L56
            if (r5 == 0) goto L38
            r5.close()     // Catch: java.io.IOException -> L34
            goto L38
        L34:
            r5 = move-exception
            r5.printStackTrace()
        L38:
            if (r0 != 0) goto L3b
            goto L3c
        L3b:
            r1 = r0
        L3c:
            return r1
        L3d:
            r0 = move-exception
            goto L48
        L3f:
            r5 = move-exception
            r4 = r0
            r0 = r5
            r5 = r4
            goto L57
        L44:
            r5 = move-exception
            r4 = r0
            r0 = r5
            r5 = r4
        L48:
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L56
            if (r5 == 0) goto L55
            r5.close()     // Catch: java.io.IOException -> L51
            goto L55
        L51:
            r5 = move-exception
            r5.printStackTrace()
        L55:
            return r1
        L56:
            r0 = move-exception
        L57:
            if (r5 == 0) goto L61
            r5.close()     // Catch: java.io.IOException -> L5d
            goto L61
        L5d:
            r5 = move-exception
            r5.printStackTrace()
        L61:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.util.C2763c.t8r(java.lang.String):java.lang.String");
    }

    public static byte[] toq(final Bitmap bmp, final boolean needRecycle) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bmp.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        if (needRecycle) {
            bmp.recycle();
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        try {
            byteArrayOutputStream.close();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return byteArray;
    }

    public static boolean wvg(InputStreamLoader streamLoader, String path, int destWidth, int destHeight) throws Throwable {
        BitmapFactory.Options optionsKja0;
        int i2;
        int i3;
        if (streamLoader == null || path == null || destWidth < 1 || destHeight < 1 || (i2 = (optionsKja0 = kja0(streamLoader)).outWidth) <= 0 || (i3 = optionsKja0.outHeight) <= 0) {
            return false;
        }
        if (i2 == destWidth && i3 == destHeight) {
            return jk(streamLoader, path);
        }
        Bitmap bitmapM9650p = m9650p(streamLoader, destWidth, destHeight);
        if (bitmapM9650p == null) {
            return false;
        }
        boolean zMcp = mcp(bitmapM9650p, path, fn3e(streamLoader), 100);
        bitmapM9650p.recycle();
        return zMcp;
    }

    public static final Bitmap x2(InputStreamLoader streamLoader, int size, boolean isCustomSampleSize) {
        Bitmap bitmapDecodeStream;
        BitmapFactory.Options optionsCdj = cdj();
        if (!isCustomSampleSize) {
            size = m9651q(streamLoader, size);
        }
        optionsCdj.inSampleSize = size;
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            bitmapDecodeStream = null;
            if (i2 >= 3) {
                break;
            }
            try {
                try {
                    bitmapDecodeStream = BitmapFactory.decodeStream(streamLoader.get(), null, optionsCdj);
                    break;
                } catch (Exception unused) {
                } catch (OutOfMemoryError unused2) {
                    System.gc();
                    optionsCdj.inSampleSize *= 2;
                    streamLoader.close();
                    i2 = i3;
                }
            } finally {
                streamLoader.close();
            }
        }
        return bitmapDecodeStream;
    }

    /* JADX INFO: renamed from: y */
    public static boolean m9654y(Bitmap srcBmp, Bitmap destBmp, boolean recycleSrcBmp) {
        k kVar = new k();
        kVar.f16349g = recycleSrcBmp;
        return f7l8(srcBmp, destBmp, kVar);
    }

    /* JADX INFO: renamed from: z */
    private static boolean m9655z(byte[] webpHead) {
        if (webpHead == null || webpHead.length < f61207zy.length) {
            return false;
        }
        int i2 = 0;
        while (true) {
            byte[] bArr = f61207zy;
            if (i2 >= bArr.length) {
                return true;
            }
            byte b2 = bArr[i2];
            if (b2 != 0 && webpHead[i2] != b2) {
                return false;
            }
            i2++;
        }
    }

    private static boolean zurt(byte[] pngHead) {
        if (pngHead == null || pngHead.length < f61206toq.length) {
            return false;
        }
        int i2 = 0;
        while (true) {
            byte[] bArr = f61206toq;
            if (i2 >= bArr.length) {
                return true;
            }
            if (pngHead[i2] != bArr[i2]) {
                return false;
            }
            i2++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap zy(android.graphics.Bitmap r7, int r8, boolean r9, java.lang.Object... r10) {
        /*
            r0 = 0
            if (r7 != 0) goto L4
            return r0
        L4:
            android.graphics.BitmapFactory$Options r1 = new android.graphics.BitmapFactory$Options
            r1.<init>()
            int r2 = r10.length
            r3 = 0
        Lb:
            if (r3 >= r2) goto L49
            r4 = r10[r3]
            boolean r5 = r4 instanceof java.lang.Integer
            if (r5 == 0) goto L23
            r5 = r4
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r6 = r5.intValue()
            if (r6 <= 0) goto L23
            int r4 = r5.intValue()
            r1.inSampleSize = r4
            goto L46
        L23:
            boolean r5 = r4 instanceof android.graphics.Bitmap.Config
            if (r5 == 0) goto L2c
            android.graphics.Bitmap$Config r4 = (android.graphics.Bitmap.Config) r4
            r1.inPreferredConfig = r4
            goto L46
        L2c:
            boolean r5 = r4 instanceof android.util.Pair
            if (r5 == 0) goto L46
            android.util.Pair r4 = (android.util.Pair) r4
            java.lang.Object r5 = r4.first
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r1.outWidth = r5
            java.lang.Object r4 = r4.second
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r1.outHeight = r4
        L46:
            int r3 = r3 + 1
            goto Lb
        L49:
            r10 = 100
            if (r8 > 0) goto L4f
            r8 = r10
            goto L57
        L4f:
            int r2 = r7.getDensity()
            int r2 = r2 * r8
            int r2 = r2 / r10
            r1.inDensity = r2
        L57:
            java.io.ByteArrayOutputStream r10 = new java.io.ByteArrayOutputStream
            r10.<init>()
            if (r9 == 0) goto L61
            android.graphics.Bitmap$CompressFormat r9 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch: java.lang.Exception -> L74
            goto L63
        L61:
            android.graphics.Bitmap$CompressFormat r9 = android.graphics.Bitmap.CompressFormat.PNG     // Catch: java.lang.Exception -> L74
        L63:
            r7.compress(r9, r8, r10)     // Catch: java.lang.Exception -> L74
            java.io.ByteArrayInputStream r7 = new java.io.ByteArrayInputStream     // Catch: java.lang.Exception -> L74
            byte[] r8 = r10.toByteArray()     // Catch: java.lang.Exception -> L74
            r7.<init>(r8)     // Catch: java.lang.Exception -> L74
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeStream(r7, r0, r1)     // Catch: java.lang.Exception -> L74
            goto L78
        L74:
            r7 = move-exception
            r7.printStackTrace()
        L78:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.util.C2763c.zy(android.graphics.Bitmap, int, boolean, java.lang.Object[]):android.graphics.Bitmap");
    }
}
