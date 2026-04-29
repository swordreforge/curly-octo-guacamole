package com.bumptech.glide.load.resource.bitmap;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.load.C3087p;
import com.bumptech.glide.load.C3138s;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3008n;
import com.bumptech.glide.load.resource.bitmap.AbstractC3101h;
import com.bumptech.glide.load.resource.bitmap.fu4;
import com.bumptech.glide.util.C3208s;
import com.miui.maml.folme.AnimatedProperty;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import zy.dd;
import zy.hyr;
import zy.yz;

/* JADX INFO: compiled from: Downsampler.java */
/* JADX INFO: loaded from: classes2.dex */
public final class cdj {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private static final Queue<BitmapFactory.Options> f62866cdj;

    /* JADX INFO: renamed from: g */
    static final String f18667g = "Downsampler";

    /* JADX INFO: renamed from: h */
    private static final Set<ImageHeaderParser.ImageType> f18668h;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private static final toq f62868kja0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    public static final C3138s<Boolean> f62869ld6;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private static final Set<String> f62870n7h;

    /* JADX INFO: renamed from: p */
    public static final C3138s<Boolean> f18669p;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static final String f62871qrj = "image/x-ico";

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final String f62872x2 = "image/vnd.wap.wbmp";

    /* JADX INFO: renamed from: k */
    private final InterfaceC3008n f18672k;

    /* JADX INFO: renamed from: n */
    private final ni7 f18673n = ni7.m10992q();

    /* JADX INFO: renamed from: q */
    private final List<ImageHeaderParser> f18674q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final DisplayMetrics f62873toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.bitmap_recycle.toq f62874zy;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static final C3138s<com.bumptech.glide.load.toq> f62867f7l8 = C3138s.f7l8("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", com.bumptech.glide.load.toq.DEFAULT);

    /* JADX INFO: renamed from: y */
    public static final C3138s<com.bumptech.glide.load.ld6> f18671y = C3138s.m11067g("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace");

    /* JADX INFO: renamed from: s */
    @Deprecated
    public static final C3138s<AbstractC3101h> f18670s = AbstractC3101h.f18703y;

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.cdj$k */
    /* JADX INFO: compiled from: Downsampler.java */
    class C3089k implements toq {
        C3089k() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.cdj.toq
        /* JADX INFO: renamed from: k */
        public void mo10941k(InterfaceC3008n interfaceC3008n, Bitmap bitmap) {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.cdj.toq
        public void toq() {
        }
    }

    /* JADX INFO: compiled from: Downsampler.java */
    public interface toq {
        /* JADX INFO: renamed from: k */
        void mo10941k(InterfaceC3008n interfaceC3008n, Bitmap bitmap) throws IOException;

        void toq();
    }

    static {
        Boolean bool = Boolean.FALSE;
        f18669p = C3138s.f7l8("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", bool);
        f62869ld6 = C3138s.f7l8("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", bool);
        f62870n7h = Collections.unmodifiableSet(new HashSet(Arrays.asList(f62872x2, f62871qrj)));
        f62868kja0 = new C3089k();
        f18668h = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
        f62866cdj = com.bumptech.glide.util.kja0.m11225g(0);
    }

    public cdj(List<ImageHeaderParser> list, DisplayMetrics displayMetrics, InterfaceC3008n interfaceC3008n, com.bumptech.glide.load.engine.bitmap_recycle.toq toqVar) {
        this.f18674q = list;
        this.f62873toq = (DisplayMetrics) com.bumptech.glide.util.qrj.m11262q(displayMetrics);
        this.f18672k = (InterfaceC3008n) com.bumptech.glide.util.qrj.m11262q(interfaceC3008n);
        this.f62874zy = (com.bumptech.glide.load.engine.bitmap_recycle.toq) com.bumptech.glide.util.qrj.m11262q(toqVar);
    }

    private static String cdj(BitmapFactory.Options options) {
        return qrj(options.inBitmap);
    }

    private static boolean fn3e(int i2) {
        return i2 == 90 || i2 == 270;
    }

    private static IOException fu4(IllegalArgumentException illegalArgumentException, int i2, int i3, String str, BitmapFactory.Options options) {
        return new IOException("Exception decoding bitmap, outWidth: " + i2 + ", outHeight: " + i3 + ", outMimeType: " + str + ", inBitmap: " + cdj(options), illegalArgumentException);
    }

    /* JADX INFO: renamed from: h */
    private static int[] m10930h(fu4 fu4Var, BitmapFactory.Options options, toq toqVar, InterfaceC3008n interfaceC3008n) throws IOException {
        options.inJustDecodeBounds = true;
        x2(fu4Var, options, toqVar, interfaceC3008n);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    /* JADX INFO: renamed from: k */
    private static int m10931k(double d2) {
        int iKja0 = kja0(d2);
        int iWvg = wvg(((double) iKja0) * d2);
        return wvg((d2 / ((double) (iWvg / iKja0))) * ((double) iWvg));
    }

    private static int kja0(double d2) {
        if (d2 > 1.0d) {
            d2 = 1.0d / d2;
        }
        return (int) Math.round(d2 * 2.147483647E9d);
    }

    private Bitmap ld6(fu4 fu4Var, BitmapFactory.Options options, AbstractC3101h abstractC3101h, com.bumptech.glide.load.toq toqVar, com.bumptech.glide.load.ld6 ld6Var, boolean z2, int i2, int i3, boolean z3, toq toqVar2) throws IOException {
        int i4;
        int i5;
        String str;
        ColorSpace colorSpace;
        int iRound;
        int iRound2;
        long qVar = C3208s.toq();
        int[] iArrM10930h = m10930h(fu4Var, options, toqVar2, this.f18672k);
        boolean z5 = false;
        int i6 = iArrM10930h[0];
        int i7 = iArrM10930h[1];
        String str2 = options.outMimeType;
        boolean z6 = (i6 == -1 || i7 == -1) ? false : z2;
        int iZy = fu4Var.zy();
        int iM10971p = jp0y.m10971p(iZy);
        boolean zQrj = jp0y.qrj(iZy);
        if (i2 == Integer.MIN_VALUE) {
            i4 = i3;
            i5 = fn3e(iM10971p) ? i7 : i6;
        } else {
            i4 = i3;
            i5 = i2;
        }
        int i8 = i4 == Integer.MIN_VALUE ? fn3e(iM10971p) ? i6 : i7 : i4;
        ImageHeaderParser.ImageType imageTypeMo10960q = fu4Var.mo10960q();
        zy(imageTypeMo10960q, fu4Var, toqVar2, this.f18672k, abstractC3101h, iM10971p, i6, i7, i5, i8, options);
        toq(fu4Var, toqVar, z6, zQrj, options, i5, i8);
        int i9 = Build.VERSION.SDK_INT;
        int i10 = options.inSampleSize;
        if (mcp(imageTypeMo10960q)) {
            if (i6 < 0 || i7 < 0 || !z3) {
                float f2 = zurt(options) ? options.inTargetDensity / options.inDensity : 1.0f;
                int i11 = options.inSampleSize;
                float f3 = i11;
                int iCeil = (int) Math.ceil(i6 / f3);
                int iCeil2 = (int) Math.ceil(i7 / f3);
                iRound = Math.round(iCeil * f2);
                iRound2 = Math.round(iCeil2 * f2);
                str = f18667g;
                if (Log.isLoggable(str, 2)) {
                    Log.v(str, "Calculated target [" + iRound + AnimatedProperty.PROPERTY_NAME_X + iRound2 + "] for source [" + i6 + AnimatedProperty.PROPERTY_NAME_X + i7 + "], sampleSize: " + i11 + ", targetDensity: " + options.inTargetDensity + ", density: " + options.inDensity + ", density multiplier: " + f2);
                }
            } else {
                str = f18667g;
                iRound = i5;
                iRound2 = i8;
            }
            if (iRound > 0 && iRound2 > 0) {
                m10933t(options, this.f18672k, iRound, iRound2);
            }
        } else {
            str = f18667g;
        }
        if (ld6Var != null) {
            if (i9 >= 28) {
                if (ld6Var == com.bumptech.glide.load.ld6.DISPLAY_P3 && (colorSpace = options.outColorSpace) != null && colorSpace.isWideGamut()) {
                    z5 = true;
                }
                options.inPreferredColorSpace = ColorSpace.get(z5 ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB);
            } else {
                options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
            }
        }
        Bitmap bitmapX2 = x2(fu4Var, options, toqVar2, this.f18672k);
        toqVar2.mo10941k(this.f18672k, bitmapX2);
        if (Log.isLoggable(str, 2)) {
            ni7(i6, i7, str2, options, bitmapX2, i2, i3, qVar);
        }
        Bitmap bitmapKja0 = null;
        if (bitmapX2 != null) {
            bitmapX2.setDensity(this.f62873toq.densityDpi);
            bitmapKja0 = jp0y.kja0(this.f18672k, bitmapX2, iZy);
            if (!bitmapX2.equals(bitmapKja0)) {
                this.f18672k.mo10669q(bitmapX2);
            }
        }
        return bitmapKja0;
    }

    private boolean mcp(ImageHeaderParser.ImageType imageType) {
        return true;
    }

    /* JADX INFO: renamed from: n */
    private com.bumptech.glide.load.engine.zurt<Bitmap> m10932n(fu4 fu4Var, int i2, int i3, C3087p c3087p, toq toqVar) throws IOException {
        byte[] bArr = (byte[]) this.f62874zy.zy(65536, byte[].class);
        BitmapFactory.Options optionsN7h = n7h();
        optionsN7h.inTempStorage = bArr;
        com.bumptech.glide.load.toq toqVar2 = (com.bumptech.glide.load.toq) c3087p.zy(f62867f7l8);
        com.bumptech.glide.load.ld6 ld6Var = (com.bumptech.glide.load.ld6) c3087p.zy(f18671y);
        AbstractC3101h abstractC3101h = (AbstractC3101h) c3087p.zy(AbstractC3101h.f18703y);
        boolean zBooleanValue = ((Boolean) c3087p.zy(f18669p)).booleanValue();
        C3138s<Boolean> c3138s = f62869ld6;
        try {
            return f7l8.m10956g(ld6(fu4Var, optionsN7h, abstractC3101h, toqVar2, ld6Var, c3087p.zy(c3138s) != null && ((Boolean) c3087p.zy(c3138s)).booleanValue(), i2, i3, zBooleanValue, toqVar), this.f18672k);
        } finally {
            m10934z(optionsN7h);
            this.f62874zy.put(bArr);
        }
    }

    private static synchronized BitmapFactory.Options n7h() {
        BitmapFactory.Options optionsPoll;
        Queue<BitmapFactory.Options> queue = f62866cdj;
        synchronized (queue) {
            optionsPoll = queue.poll();
        }
        if (optionsPoll == null) {
            optionsPoll = new BitmapFactory.Options();
            o1t(optionsPoll);
        }
        return optionsPoll;
    }

    private static void ni7(int i2, int i3, String str, BitmapFactory.Options options, Bitmap bitmap, int i4, int i5, long j2) {
        Log.v(f18667g, "Decoded " + qrj(bitmap) + " from [" + i2 + AnimatedProperty.PROPERTY_NAME_X + i3 + "] " + str + " with inBitmap " + cdj(options) + " for [" + i4 + AnimatedProperty.PROPERTY_NAME_X + i5 + "], sample size: " + options.inSampleSize + ", density: " + options.inDensity + ", target density: " + options.inTargetDensity + ", thread: " + Thread.currentThread().getName() + ", duration: " + C3208s.m11263k(j2));
    }

    private static void o1t(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        options.inPreferredColorSpace = null;
        options.outColorSpace = null;
        options.outConfig = null;
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    @TargetApi(19)
    @dd
    private static String qrj(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + AnimatedProperty.PROPERTY_NAME_X + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    @TargetApi(26)
    /* JADX INFO: renamed from: t */
    private static void m10933t(BitmapFactory.Options options, InterfaceC3008n interfaceC3008n, int i2, int i3) {
        Bitmap.Config config = options.inPreferredConfig;
        if (config == Bitmap.Config.HARDWARE) {
            return;
        }
        Bitmap.Config config2 = options.outConfig;
        if (config2 != null) {
            config = config2;
        }
        options.inBitmap = interfaceC3008n.f7l8(i2, i3, config);
    }

    private void toq(fu4 fu4Var, com.bumptech.glide.load.toq toqVar, boolean z2, boolean z3, BitmapFactory.Options options, int i2, int i3) {
        if (this.f18673n.ld6(i2, i3, options, z2, z3)) {
            return;
        }
        if (toqVar == com.bumptech.glide.load.toq.PREFER_ARGB_8888) {
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            return;
        }
        boolean zHasAlpha = false;
        try {
            zHasAlpha = fu4Var.mo10960q().hasAlpha();
        } catch (IOException e2) {
            if (Log.isLoggable(f18667g, 3)) {
                Log.d(f18667g, "Cannot determine whether the image has alpha or not from header, format " + toqVar, e2);
            }
        }
        Bitmap.Config config = zHasAlpha ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
        options.inPreferredConfig = config;
        if (config == Bitmap.Config.RGB_565) {
            options.inDither = true;
        }
    }

    private static int wvg(double d2) {
        return (int) (d2 + 0.5d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:?, code lost:
    
        throw r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.graphics.Bitmap x2(com.bumptech.glide.load.resource.bitmap.fu4 r5, android.graphics.BitmapFactory.Options r6, com.bumptech.glide.load.resource.bitmap.cdj.toq r7, com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3008n r8) throws java.io.IOException {
        /*
            java.lang.String r0 = "Downsampler"
            boolean r1 = r6.inJustDecodeBounds
            if (r1 != 0) goto Lc
            r7.toq()
            r5.toq()
        Lc:
            int r1 = r6.outWidth
            int r2 = r6.outHeight
            java.lang.String r3 = r6.outMimeType
            java.util.concurrent.locks.Lock r4 = com.bumptech.glide.load.resource.bitmap.jp0y.m10973s()
            r4.lock()
            android.graphics.Bitmap r5 = r5.mo10959k(r6)     // Catch: java.lang.Throwable -> L25 java.lang.IllegalArgumentException -> L27
            java.util.concurrent.locks.Lock r6 = com.bumptech.glide.load.resource.bitmap.jp0y.m10973s()
            r6.unlock()
            return r5
        L25:
            r5 = move-exception
            goto L50
        L27:
            r4 = move-exception
            java.io.IOException r1 = fu4(r4, r1, r2, r3, r6)     // Catch: java.lang.Throwable -> L25
            r2 = 3
            boolean r2 = android.util.Log.isLoggable(r0, r2)     // Catch: java.lang.Throwable -> L25
            if (r2 == 0) goto L38
            java.lang.String r2 = "Failed to decode with inBitmap, trying again without Bitmap re-use"
            android.util.Log.d(r0, r2, r1)     // Catch: java.lang.Throwable -> L25
        L38:
            android.graphics.Bitmap r0 = r6.inBitmap     // Catch: java.lang.Throwable -> L25
            if (r0 == 0) goto L4f
            r8.mo10669q(r0)     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L4e
            r0 = 0
            r6.inBitmap = r0     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L4e
            android.graphics.Bitmap r5 = x2(r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L4e
            java.util.concurrent.locks.Lock r6 = com.bumptech.glide.load.resource.bitmap.jp0y.m10973s()
            r6.unlock()
            return r5
        L4e:
            throw r1     // Catch: java.lang.Throwable -> L25
        L4f:
            throw r1     // Catch: java.lang.Throwable -> L25
        L50:
            java.util.concurrent.locks.Lock r6 = com.bumptech.glide.load.resource.bitmap.jp0y.m10973s()
            r6.unlock()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.cdj.x2(com.bumptech.glide.load.resource.bitmap.fu4, android.graphics.BitmapFactory$Options, com.bumptech.glide.load.resource.bitmap.cdj$toq, com.bumptech.glide.load.engine.bitmap_recycle.n):android.graphics.Bitmap");
    }

    /* JADX INFO: renamed from: z */
    private static void m10934z(BitmapFactory.Options options) {
        o1t(options);
        Queue<BitmapFactory.Options> queue = f62866cdj;
        synchronized (queue) {
            queue.offer(options);
        }
    }

    private static boolean zurt(BitmapFactory.Options options) {
        int i2;
        int i3 = options.inTargetDensity;
        return i3 > 0 && (i2 = options.inDensity) > 0 && i3 != i2;
    }

    private static void zy(ImageHeaderParser.ImageType imageType, fu4 fu4Var, toq toqVar, InterfaceC3008n interfaceC3008n, AbstractC3101h abstractC3101h, int i2, int i3, int i4, int i5, int i6, BitmapFactory.Options options) throws IOException {
        int i7;
        int i8;
        int iFloor;
        int iFloor2;
        if (i3 <= 0 || i4 <= 0) {
            if (Log.isLoggable(f18667g, 3)) {
                Log.d(f18667g, "Unable to determine dimensions for: " + imageType + " with target [" + i5 + AnimatedProperty.PROPERTY_NAME_X + i6 + "]");
                return;
            }
            return;
        }
        if (fn3e(i2)) {
            i8 = i3;
            i7 = i4;
        } else {
            i7 = i3;
            i8 = i4;
        }
        float qVar = abstractC3101h.toq(i7, i8, i5, i6);
        if (qVar <= 0.0f) {
            throw new IllegalArgumentException("Cannot scale with factor: " + qVar + " from: " + abstractC3101h + ", source: [" + i3 + AnimatedProperty.PROPERTY_NAME_X + i4 + "], target: [" + i5 + AnimatedProperty.PROPERTY_NAME_X + i6 + "]");
        }
        AbstractC3101h.f7l8 f7l8VarMo10965k = abstractC3101h.mo10965k(i7, i8, i5, i6);
        if (f7l8VarMo10965k == null) {
            throw new IllegalArgumentException("Cannot round with null rounding");
        }
        float f2 = i7;
        float f3 = i8;
        int iWvg = i7 / wvg(qVar * f2);
        int iWvg2 = i8 / wvg(qVar * f3);
        AbstractC3101h.f7l8 f7l8Var = AbstractC3101h.f7l8.MEMORY;
        int iMax = Math.max(1, Integer.highestOneBit(f7l8VarMo10965k == f7l8Var ? Math.max(iWvg, iWvg2) : Math.min(iWvg, iWvg2)));
        if (f7l8VarMo10965k == f7l8Var && iMax < 1.0f / qVar) {
            iMax <<= 1;
        }
        options.inSampleSize = iMax;
        if (imageType == ImageHeaderParser.ImageType.JPEG) {
            float fMin = Math.min(iMax, 8);
            iFloor = (int) Math.ceil(f2 / fMin);
            iFloor2 = (int) Math.ceil(f3 / fMin);
            int i9 = iMax / 8;
            if (i9 > 0) {
                iFloor /= i9;
                iFloor2 /= i9;
            }
        } else if (imageType == ImageHeaderParser.ImageType.PNG || imageType == ImageHeaderParser.ImageType.PNG_A) {
            float f4 = iMax;
            iFloor = (int) Math.floor(f2 / f4);
            iFloor2 = (int) Math.floor(f3 / f4);
        } else if (imageType.isWebp()) {
            float f5 = iMax;
            iFloor = Math.round(f2 / f5);
            iFloor2 = Math.round(f3 / f5);
        } else if (i7 % iMax == 0 && i8 % iMax == 0) {
            iFloor = i7 / iMax;
            iFloor2 = i8 / iMax;
        } else {
            int[] iArrM10930h = m10930h(fu4Var, options, toqVar, interfaceC3008n);
            iFloor = iArrM10930h[0];
            iFloor2 = iArrM10930h[1];
        }
        double qVar2 = abstractC3101h.toq(iFloor, iFloor2, i5, i6);
        options.inTargetDensity = m10931k(qVar2);
        options.inDensity = kja0(qVar2);
        if (zurt(options)) {
            options.inScaled = true;
        } else {
            options.inTargetDensity = 0;
            options.inDensity = 0;
        }
        if (Log.isLoggable(f18667g, 2)) {
            Log.v(f18667g, "Calculate scaling, source: [" + i3 + AnimatedProperty.PROPERTY_NAME_X + i4 + "], degreesToRotate: " + i2 + ", target: [" + i5 + AnimatedProperty.PROPERTY_NAME_X + i6 + "], power of two scaled: [" + iFloor + AnimatedProperty.PROPERTY_NAME_X + iFloor2 + "], exact scale factor: " + qVar + ", power of 2 sample size: " + iMax + ", adjusted scale factor: " + qVar2 + ", target density: " + options.inTargetDensity + ", density: " + options.inDensity);
        }
    }

    public com.bumptech.glide.load.engine.zurt<Bitmap> f7l8(InputStream inputStream, int i2, int i3, C3087p c3087p, toq toqVar) throws IOException {
        return m10932n(new fu4.C3098q(inputStream, this.f18674q, this.f62874zy), i2, i3, c3087p, toqVar);
    }

    /* JADX INFO: renamed from: g */
    public com.bumptech.glide.load.engine.zurt<Bitmap> m10935g(InputStream inputStream, int i2, int i3, C3087p c3087p) throws IOException {
        return f7l8(inputStream, i2, i3, c3087p, f62868kja0);
    }

    /* JADX INFO: renamed from: i */
    public boolean m10936i(ByteBuffer byteBuffer) {
        return true;
    }

    public boolean ki(ParcelFileDescriptor parcelFileDescriptor) {
        return ParcelFileDescriptorRewinder.zy();
    }

    @yz
    /* JADX INFO: renamed from: p */
    void m10937p(byte[] bArr, int i2, int i3, C3087p c3087p) throws IOException {
        m10932n(new fu4.C3096k(bArr, this.f18674q, this.f62874zy), i2, i3, c3087p, f62868kja0);
    }

    @hyr(21)
    /* JADX INFO: renamed from: q */
    public com.bumptech.glide.load.engine.zurt<Bitmap> m10938q(ParcelFileDescriptor parcelFileDescriptor, int i2, int i3, C3087p c3087p) throws IOException {
        return m10932n(new fu4.C3097n(parcelFileDescriptor, this.f18674q, this.f62874zy), i2, i3, c3087p, f62868kja0);
    }

    @yz
    /* JADX INFO: renamed from: s */
    void m10939s(File file, int i2, int i3, C3087p c3087p) throws IOException {
        m10932n(new fu4.zy(file, this.f18674q, this.f62874zy), i2, i3, c3087p, f62868kja0);
    }

    public boolean t8r(InputStream inputStream) {
        return true;
    }

    /* JADX INFO: renamed from: y */
    public com.bumptech.glide.load.engine.zurt<Bitmap> m10940y(ByteBuffer byteBuffer, int i2, int i3, C3087p c3087p) throws IOException {
        return m10932n(new fu4.toq(byteBuffer, this.f18674q, this.f62874zy), i2, i3, c3087p, f62868kja0);
    }
}
