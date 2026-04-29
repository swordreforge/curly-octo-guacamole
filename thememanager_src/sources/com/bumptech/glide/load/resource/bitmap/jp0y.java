package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import android.util.Log;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3008n;
import com.miui.maml.folme.AnimatedProperty;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import zy.lvui;
import zy.yz;

/* JADX INFO: compiled from: TransformationUtils.java */
/* JADX INFO: loaded from: classes2.dex */
public final class jp0y {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final Set<String> f62897f7l8;

    /* JADX INFO: renamed from: g */
    private static final Paint f18707g;

    /* JADX INFO: renamed from: k */
    private static final String f18708k = "TransformationUtils";

    /* JADX INFO: renamed from: q */
    private static final int f18710q = 7;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final int f62898toq = 6;

    /* JADX INFO: renamed from: y */
    private static final Lock f18711y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final Paint f62899zy = new Paint(6);

    /* JADX INFO: renamed from: n */
    private static final Paint f18709n = new Paint(7);

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.jp0y$k */
    /* JADX INFO: compiled from: TransformationUtils.java */
    class C3103k implements zy {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ int f18712k;

        C3103k(int i2) {
            this.f18712k = i2;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.jp0y.zy
        /* JADX INFO: renamed from: k */
        public void mo10975k(Canvas canvas, Paint paint, RectF rectF) {
            int i2 = this.f18712k;
            canvas.drawRoundRect(rectF, i2, i2, paint);
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.jp0y$q */
    /* JADX INFO: compiled from: TransformationUtils.java */
    private static final class LockC3104q implements Lock {
        LockC3104q() {
        }

        @Override // java.util.concurrent.locks.Lock
        public void lock() {
        }

        @Override // java.util.concurrent.locks.Lock
        public void lockInterruptibly() throws InterruptedException {
        }

        @Override // java.util.concurrent.locks.Lock
        @lvui
        public Condition newCondition() {
            throw new UnsupportedOperationException("Should not be called");
        }

        @Override // java.util.concurrent.locks.Lock
        public boolean tryLock() {
            return true;
        }

        @Override // java.util.concurrent.locks.Lock
        public boolean tryLock(long j2, @lvui TimeUnit timeUnit) throws InterruptedException {
            return true;
        }

        @Override // java.util.concurrent.locks.Lock
        public void unlock() {
        }
    }

    /* JADX INFO: compiled from: TransformationUtils.java */
    class toq implements zy {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ float f18713k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ float f18714q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ float f62900toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        final /* synthetic */ float f62901zy;

        toq(float f2, float f3, float f4, float f5) {
            this.f18713k = f2;
            this.f62900toq = f3;
            this.f62901zy = f4;
            this.f18714q = f5;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.jp0y.zy
        /* JADX INFO: renamed from: k */
        public void mo10975k(Canvas canvas, Paint paint, RectF rectF) {
            Path path = new Path();
            float f2 = this.f18713k;
            float f3 = this.f62900toq;
            float f4 = this.f62901zy;
            float f5 = this.f18714q;
            path.addRoundRect(rectF, new float[]{f2, f2, f3, f3, f4, f4, f5, f5}, Path.Direction.CW);
            canvas.drawPath(path, paint);
        }
    }

    /* JADX INFO: compiled from: TransformationUtils.java */
    private interface zy {
        /* JADX INFO: renamed from: k */
        void mo10975k(Canvas canvas, Paint paint, RectF rectF);
    }

    static {
        HashSet hashSet = new HashSet(Arrays.asList("XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079"));
        f62897f7l8 = hashSet;
        f18711y = hashSet.contains(Build.MODEL) ? new ReentrantLock() : new LockC3104q();
        Paint paint = new Paint(7);
        f18707g = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    private jp0y() {
    }

    public static Bitmap cdj(@lvui InterfaceC3008n interfaceC3008n, @lvui Bitmap bitmap, int i2) {
        com.bumptech.glide.util.qrj.m11260k(i2 > 0, "roundingRadius must be greater than 0.");
        return t8r(interfaceC3008n, bitmap, new C3103k(i2));
    }

    private static Bitmap f7l8(@lvui InterfaceC3008n interfaceC3008n, @lvui Bitmap bitmap) {
        Bitmap.Config configM10974y = m10974y(bitmap);
        if (configM10974y.equals(bitmap.getConfig())) {
            return bitmap;
        }
        Bitmap bitmapMo10666g = interfaceC3008n.mo10666g(bitmap.getWidth(), bitmap.getHeight(), configM10974y);
        new Canvas(bitmapMo10666g).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        return bitmapMo10666g;
    }

    /* JADX INFO: renamed from: g */
    public static Bitmap m10966g(@lvui InterfaceC3008n interfaceC3008n, @lvui Bitmap bitmap, int i2, int i3) {
        if (bitmap.getWidth() == i2 && bitmap.getHeight() == i3) {
            if (Log.isLoggable(f18708k, 2)) {
                Log.v(f18708k, "requested target size matches input, returning input");
            }
            return bitmap;
        }
        float fMin = Math.min(i2 / bitmap.getWidth(), i3 / bitmap.getHeight());
        int iRound = Math.round(bitmap.getWidth() * fMin);
        int iRound2 = Math.round(bitmap.getHeight() * fMin);
        if (bitmap.getWidth() == iRound && bitmap.getHeight() == iRound2) {
            if (Log.isLoggable(f18708k, 2)) {
                Log.v(f18708k, "adjusted target size matches input, returning input");
            }
            return bitmap;
        }
        Bitmap bitmapMo10666g = interfaceC3008n.mo10666g((int) (bitmap.getWidth() * fMin), (int) (bitmap.getHeight() * fMin), ld6(bitmap));
        m10968i(bitmap, bitmapMo10666g);
        if (Log.isLoggable(f18708k, 2)) {
            Log.v(f18708k, "request: " + i2 + AnimatedProperty.PROPERTY_NAME_X + i3);
            Log.v(f18708k, "toFit:   " + bitmap.getWidth() + AnimatedProperty.PROPERTY_NAME_X + bitmap.getHeight());
            Log.v(f18708k, "toReuse: " + bitmapMo10666g.getWidth() + AnimatedProperty.PROPERTY_NAME_X + bitmapMo10666g.getHeight());
            StringBuilder sb = new StringBuilder();
            sb.append("minPct:   ");
            sb.append(fMin);
            Log.v(f18708k, sb.toString());
        }
        Matrix matrix = new Matrix();
        matrix.setScale(fMin, fMin);
        m10969k(bitmap, bitmapMo10666g, matrix);
        return bitmapMo10666g;
    }

    /* JADX INFO: renamed from: h */
    public static Bitmap m10967h(@lvui InterfaceC3008n interfaceC3008n, @lvui Bitmap bitmap, float f2, float f3, float f4, float f5) {
        return t8r(interfaceC3008n, bitmap, new toq(f2, f3, f4, f5));
    }

    /* JADX INFO: renamed from: i */
    public static void m10968i(Bitmap bitmap, Bitmap bitmap2) {
        bitmap2.setHasAlpha(bitmap.hasAlpha());
    }

    /* JADX INFO: renamed from: k */
    private static void m10969k(@lvui Bitmap bitmap, @lvui Bitmap bitmap2, Matrix matrix) {
        Lock lock = f18711y;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, f62899zy);
            m10970n(canvas);
            lock.unlock();
        } catch (Throwable th) {
            f18711y.unlock();
            throw th;
        }
    }

    @Deprecated
    public static Bitmap ki(@lvui InterfaceC3008n interfaceC3008n, @lvui Bitmap bitmap, int i2, int i3, int i4) {
        return cdj(interfaceC3008n, bitmap, i4);
    }

    public static Bitmap kja0(@lvui InterfaceC3008n interfaceC3008n, @lvui Bitmap bitmap, int i2) {
        if (!qrj(i2)) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        x2(i2, matrix);
        RectF rectF = new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
        matrix.mapRect(rectF);
        Bitmap bitmapMo10666g = interfaceC3008n.mo10666g(Math.round(rectF.width()), Math.round(rectF.height()), ld6(bitmap));
        matrix.postTranslate(-rectF.left, -rectF.top);
        bitmapMo10666g.setHasAlpha(bitmap.hasAlpha());
        m10969k(bitmap, bitmapMo10666g, matrix);
        return bitmapMo10666g;
    }

    @lvui
    private static Bitmap.Config ld6(@lvui Bitmap bitmap) {
        return bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888;
    }

    /* JADX INFO: renamed from: n */
    private static void m10970n(Canvas canvas) {
        canvas.setBitmap(null);
    }

    public static Bitmap n7h(@lvui Bitmap bitmap, int i2) {
        if (i2 == 0) {
            return bitmap;
        }
        try {
            Matrix matrix = new Matrix();
            matrix.setRotate(i2);
            return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        } catch (Exception e2) {
            if (!Log.isLoggable(f18708k, 6)) {
                return bitmap;
            }
            Log.e(f18708k, "Exception when trying to orient image", e2);
            return bitmap;
        }
    }

    /* JADX INFO: renamed from: p */
    public static int m10971p(int i2) {
        switch (i2) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: q */
    public static Bitmap m10972q(@lvui InterfaceC3008n interfaceC3008n, @lvui Bitmap bitmap, int i2, int i3) {
        int iMin = Math.min(i2, i3);
        float f2 = iMin;
        float f3 = f2 / 2.0f;
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        float fMax = Math.max(f2 / width, f2 / height);
        float f4 = width * fMax;
        float f5 = fMax * height;
        float f6 = (f2 - f4) / 2.0f;
        float f7 = (f2 - f5) / 2.0f;
        RectF rectF = new RectF(f6, f7, f4 + f6, f5 + f7);
        Bitmap bitmapF7l8 = f7l8(interfaceC3008n, bitmap);
        Bitmap bitmapMo10666g = interfaceC3008n.mo10666g(iMin, iMin, m10974y(bitmap));
        bitmapMo10666g.setHasAlpha(true);
        Lock lock = f18711y;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmapMo10666g);
            canvas.drawCircle(f3, f3, f3, f18709n);
            canvas.drawBitmap(bitmapF7l8, (Rect) null, rectF, f18707g);
            m10970n(canvas);
            lock.unlock();
            if (!bitmapF7l8.equals(bitmap)) {
                interfaceC3008n.mo10669q(bitmapF7l8);
            }
            return bitmapMo10666g;
        } catch (Throwable th) {
            f18711y.unlock();
            throw th;
        }
    }

    public static boolean qrj(int i2) {
        switch (i2) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: s */
    public static Lock m10973s() {
        return f18711y;
    }

    private static Bitmap t8r(@lvui InterfaceC3008n interfaceC3008n, @lvui Bitmap bitmap, zy zyVar) {
        Bitmap.Config configM10974y = m10974y(bitmap);
        Bitmap bitmapF7l8 = f7l8(interfaceC3008n, bitmap);
        Bitmap bitmapMo10666g = interfaceC3008n.mo10666g(bitmapF7l8.getWidth(), bitmapF7l8.getHeight(), configM10974y);
        bitmapMo10666g.setHasAlpha(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmapF7l8, tileMode, tileMode);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setShader(bitmapShader);
        RectF rectF = new RectF(0.0f, 0.0f, bitmapMo10666g.getWidth(), bitmapMo10666g.getHeight());
        Lock lock = f18711y;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmapMo10666g);
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            zyVar.mo10975k(canvas, paint, rectF);
            m10970n(canvas);
            lock.unlock();
            if (!bitmapF7l8.equals(bitmap)) {
                interfaceC3008n.mo10669q(bitmapF7l8);
            }
            return bitmapMo10666g;
        } catch (Throwable th) {
            f18711y.unlock();
            throw th;
        }
    }

    public static Bitmap toq(@lvui InterfaceC3008n interfaceC3008n, @lvui Bitmap bitmap, int i2, int i3) {
        float width;
        float height;
        if (bitmap.getWidth() == i2 && bitmap.getHeight() == i3) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float width2 = 0.0f;
        if (bitmap.getWidth() * i3 > bitmap.getHeight() * i2) {
            width = i3 / bitmap.getHeight();
            width2 = (i2 - (bitmap.getWidth() * width)) * 0.5f;
            height = 0.0f;
        } else {
            width = i2 / bitmap.getWidth();
            height = (i3 - (bitmap.getHeight() * width)) * 0.5f;
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (width2 + 0.5f), (int) (height + 0.5f));
        Bitmap bitmapMo10666g = interfaceC3008n.mo10666g(i2, i3, ld6(bitmap));
        m10968i(bitmap, bitmapMo10666g);
        m10969k(bitmap, bitmapMo10666g, matrix);
        return bitmapMo10666g;
    }

    @yz
    static void x2(int i2, Matrix matrix) {
        switch (i2) {
            case 2:
                matrix.setScale(-1.0f, 1.0f);
                break;
            case 3:
                matrix.setRotate(180.0f);
                break;
            case 4:
                matrix.setRotate(180.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 5:
                matrix.setRotate(90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 6:
                matrix.setRotate(90.0f);
                break;
            case 7:
                matrix.setRotate(-90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 8:
                matrix.setRotate(-90.0f);
                break;
        }
    }

    @lvui
    /* JADX INFO: renamed from: y */
    private static Bitmap.Config m10974y(@lvui Bitmap bitmap) {
        return Bitmap.Config.RGBA_F16.equals(bitmap.getConfig()) ? Bitmap.Config.RGBA_F16 : Bitmap.Config.ARGB_8888;
    }

    public static Bitmap zy(@lvui InterfaceC3008n interfaceC3008n, @lvui Bitmap bitmap, int i2, int i3) {
        if (bitmap.getWidth() > i2 || bitmap.getHeight() > i3) {
            if (Log.isLoggable(f18708k, 2)) {
                Log.v(f18708k, "requested target size too big for input, fit centering instead");
            }
            return m10966g(interfaceC3008n, bitmap, i2, i3);
        }
        if (Log.isLoggable(f18708k, 2)) {
            Log.v(f18708k, "requested target size larger or equal to input, returning input");
        }
        return bitmap;
    }
}
