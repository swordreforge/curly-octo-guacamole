package com.airbnb.lottie.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import android.provider.Settings;
import com.airbnb.lottie.C1476n;
import com.airbnb.lottie.animation.C1418k;
import com.airbnb.lottie.animation.content.zurt;
import com.airbnb.lottie.animation.keyframe.C1425q;
import java.io.Closeable;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import javax.net.ssl.SSLException;
import zy.dd;

/* JADX INFO: renamed from: com.airbnb.lottie.utils.y */
/* JADX INFO: compiled from: Utils.java */
/* JADX INFO: loaded from: classes.dex */
public final class C1512y {

    /* JADX INFO: renamed from: k */
    public static final int f8289k = 1000000000;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final ThreadLocal<PathMeasure> f56187toq = new k();

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final ThreadLocal<Path> f56188zy = new toq();

    /* JADX INFO: renamed from: q */
    private static final ThreadLocal<Path> f8291q = new zy();

    /* JADX INFO: renamed from: n */
    private static final ThreadLocal<float[]> f8290n = new q();

    /* JADX INFO: renamed from: g */
    private static final float f8288g = (float) (Math.sqrt(2.0d) / 2.0d);

    /* JADX INFO: renamed from: com.airbnb.lottie.utils.y$k */
    /* JADX INFO: compiled from: Utils.java */
    class k extends ThreadLocal<PathMeasure> {
        k() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public PathMeasure initialValue() {
            return new PathMeasure();
        }
    }

    /* JADX INFO: renamed from: com.airbnb.lottie.utils.y$q */
    /* JADX INFO: compiled from: Utils.java */
    class q extends ThreadLocal<float[]> {
        q() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public float[] initialValue() {
            return new float[4];
        }
    }

    /* JADX INFO: renamed from: com.airbnb.lottie.utils.y$toq */
    /* JADX INFO: compiled from: Utils.java */
    class toq extends ThreadLocal<Path> {
        toq() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Path initialValue() {
            return new Path();
        }
    }

    /* JADX INFO: renamed from: com.airbnb.lottie.utils.y$zy */
    /* JADX INFO: compiled from: Utils.java */
    class zy extends ThreadLocal<Path> {
        zy() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Path initialValue() {
            return new Path();
        }
    }

    private C1512y() {
    }

    public static float f7l8(Matrix matrix) {
        float[] fArr = f8290n.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f2 = f8288g;
        fArr[2] = f2;
        fArr[3] = f2;
        matrix.mapPoints(fArr);
        return (float) Math.hypot(fArr[2] - fArr[0], fArr[3] - fArr[1]);
    }

    /* JADX INFO: renamed from: g */
    public static float m6258g(Context context) {
        return Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
    }

    /* JADX INFO: renamed from: k */
    public static void m6259k(Path path, float f2, float f3, float f4) {
        C1476n.m6103k("applyTrimPathIfNeeded");
        PathMeasure pathMeasure = f56187toq.get();
        Path path2 = f56188zy.get();
        Path path3 = f8291q.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (f2 == 1.0f && f3 == 0.0f) {
            C1476n.toq("applyTrimPathIfNeeded");
            return;
        }
        if (length < 1.0f || Math.abs((f3 - f2) - 1.0f) < 0.01d) {
            C1476n.toq("applyTrimPathIfNeeded");
            return;
        }
        float f5 = f2 * length;
        float f6 = f3 * length;
        float f7 = f4 * length;
        float fMin = Math.min(f5, f6) + f7;
        float fMax = Math.max(f5, f6) + f7;
        if (fMin >= length && fMax >= length) {
            fMin = f7l8.f7l8(fMin, length);
            fMax = f7l8.f7l8(fMax, length);
        }
        if (fMin < 0.0f) {
            fMin = f7l8.f7l8(fMin, length);
        }
        if (fMax < 0.0f) {
            fMax = f7l8.f7l8(fMax, length);
        }
        if (fMin == fMax) {
            path.reset();
            C1476n.toq("applyTrimPathIfNeeded");
            return;
        }
        if (fMin >= fMax) {
            fMin -= length;
        }
        path2.reset();
        pathMeasure.getSegment(fMin, fMax, path2, true);
        if (fMax > length) {
            path3.reset();
            pathMeasure.getSegment(0.0f, fMax % length, path3, true);
            path2.addPath(path3);
        } else if (fMin < 0.0f) {
            path3.reset();
            pathMeasure.getSegment(fMin + length, length, path3, true);
            path2.addPath(path3);
        }
        path.set(path2);
        C1476n.toq("applyTrimPathIfNeeded");
    }

    public static void kja0(Canvas canvas, RectF rectF, Paint paint, int i2) {
        C1476n.m6103k("Utils#saveLayer");
        canvas.saveLayer(rectF, paint);
        C1476n.toq("Utils#saveLayer");
    }

    public static boolean ld6(Throwable th) {
        return (th instanceof SocketException) || (th instanceof ClosedChannelException) || (th instanceof InterruptedIOException) || (th instanceof ProtocolException) || (th instanceof SSLException) || (th instanceof UnknownHostException) || (th instanceof UnknownServiceException);
    }

    /* JADX INFO: renamed from: n */
    public static float m6260n() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    public static void n7h(Canvas canvas, RectF rectF, Paint paint) {
        kja0(canvas, rectF, paint, 31);
    }

    /* JADX INFO: renamed from: p */
    public static boolean m6261p(int i2, int i3, int i4, int i5, int i6, int i7) {
        if (i2 < i5) {
            return false;
        }
        if (i2 > i5) {
            return true;
        }
        if (i3 < i6) {
            return false;
        }
        return i3 > i6 || i4 >= i7;
    }

    /* JADX INFO: renamed from: q */
    public static Path m6262q(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 == null || pointF4 == null || (pointF3.length() == 0.0f && pointF4.length() == 0.0f)) {
            path.lineTo(pointF2.x, pointF2.y);
        } else {
            float f2 = pointF3.x + pointF.x;
            float f3 = pointF.y + pointF3.y;
            float f4 = pointF2.x;
            float f5 = f4 + pointF4.x;
            float f6 = pointF2.y;
            path.cubicTo(f2, f3, f5, f6 + pointF4.y, f4, f6);
        }
        return path;
    }

    public static Bitmap qrj(Bitmap bitmap, int i2, int i3) {
        if (bitmap.getWidth() == i2 && bitmap.getHeight() == i3) {
            return bitmap;
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, i2, i3, true);
        bitmap.recycle();
        return bitmapCreateScaledBitmap;
    }

    /* JADX INFO: renamed from: s */
    public static int m6263s(float f2, float f3, float f4, float f5) {
        int i2 = f2 != 0.0f ? (int) (527 * f2) : 17;
        if (f3 != 0.0f) {
            i2 = (int) (i2 * 31 * f3);
        }
        if (f4 != 0.0f) {
            i2 = (int) (i2 * 31 * f4);
        }
        return f5 != 0.0f ? (int) (i2 * 31 * f5) : i2;
    }

    public static void toq(Path path, @dd zurt zurtVar) {
        if (zurtVar == null || zurtVar.ld6()) {
            return;
        }
        m6259k(path, ((C1425q) zurtVar.m5910s()).m5936h() / 100.0f, ((C1425q) zurtVar.m5907n()).m5936h() / 100.0f, ((C1425q) zurtVar.f7l8()).m5936h() / 360.0f);
    }

    public static Bitmap x2(Path path) {
        RectF rectF = new RectF();
        path.computeBounds(rectF, false);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) rectF.right, (int) rectF.bottom, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        C1418k c1418k = new C1418k();
        c1418k.setAntiAlias(true);
        c1418k.setColor(-16776961);
        canvas.drawPath(path, c1418k);
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: y */
    public static boolean m6264y(Matrix matrix) {
        float[] fArr = f8290n.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 37394.73f;
        fArr[3] = 39575.234f;
        matrix.mapPoints(fArr);
        return fArr[0] == fArr[2] || fArr[1] == fArr[3];
    }

    public static void zy(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }
}
