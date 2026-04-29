package com.miui.keyguardtemplate;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.os.Build;
import android.text.TextUtils;
import android.util.TypedValue;
import miuix.core.util.SystemProperties;

/* JADX INFO: renamed from: com.miui.keyguardtemplate.s */
/* JADX INFO: compiled from: Util.java */
/* JADX INFO: loaded from: classes3.dex */
public class C5112s {

    /* JADX INFO: renamed from: k */
    public static final String f29366k = "cetus";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final boolean f72098toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final boolean f72099zy;

    static {
        f72098toq = SystemProperties.getInt("persist.sys.muiltdisplay_type", 0) == 2;
        f72099zy = "tablet".equals(SystemProperties.get("ro.build.characteristics", "default"));
    }

    public static Bitmap f7l8(Bitmap bitmap, int i2, int i3) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        float fMax = i2 > width ? i2 / width : 1.0f;
        if (i3 > height) {
            fMax = Math.max(fMax, i3 / height);
        }
        Matrix matrix = new Matrix();
        matrix.postScale(fMax, fMax);
        return Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m17796g() {
        return TextUtils.equals(Build.DEVICE, "cetus");
    }

    /* JADX INFO: renamed from: k */
    public static float m17797k(Context context) {
        return context.getResources().getConfiguration().smallestScreenWidthDp / m17799q(context);
    }

    /* JADX INFO: renamed from: n */
    public static boolean m17798n(Context context) {
        return (context.getResources().getConfiguration().screenLayout & 15) >= 3;
    }

    /* JADX INFO: renamed from: q */
    private static float m17799q(Context context) {
        if (m17796g() && !m17798n(context)) {
            return 320.0f;
        }
        if (m17796g() && m17798n(context)) {
            return 676.0f;
        }
        if (f72098toq && m17798n(context)) {
            return 696.0f;
        }
        return f72099zy ? 711.0f : 392.0f;
    }

    public static Bitmap toq(int i2, int i3, int i4) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i3, i4, Bitmap.Config.ARGB_8888);
        new Canvas(bitmapCreateBitmap).drawColor(i2);
        return bitmapCreateBitmap;
    }

    public static Bitmap zy(Context context, int i2) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        TypedValue typedValue = new TypedValue();
        context.getResources().openRawResource(i2, typedValue);
        options.inTargetDensity = typedValue.density;
        options.inScaled = false;
        return BitmapFactory.decodeResource(context.getResources(), i2, options);
    }
}
