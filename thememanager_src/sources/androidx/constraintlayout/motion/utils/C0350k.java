package androidx.constraintlayout.motion.utils;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.widget.C0395k;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: androidx.constraintlayout.motion.utils.k */
/* JADX INFO: compiled from: CustomSupport.java */
/* JADX INFO: loaded from: classes.dex */
public class C0350k {

    /* JADX INFO: renamed from: k */
    private static final String f2174k = "CustomSupport";

    /* JADX INFO: renamed from: androidx.constraintlayout.motion.utils.k$k */
    /* JADX INFO: compiled from: CustomSupport.java */
    static /* synthetic */ class k {

        /* JADX INFO: renamed from: k */
        static final /* synthetic */ int[] f2175k;

        static {
            int[] iArr = new int[C0395k.toq.values().length];
            f2175k = iArr;
            try {
                iArr[C0395k.toq.INT_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2175k[C0395k.toq.FLOAT_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2175k[C0395k.toq.COLOR_DRAWABLE_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2175k[C0395k.toq.COLOR_TYPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2175k[C0395k.toq.STRING_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2175k[C0395k.toq.BOOLEAN_TYPE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2175k[C0395k.toq.DIMENSION_TYPE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: k */
    private static int m1379k(int c2) {
        int i2 = (c2 & (~(c2 >> 31))) - 255;
        return (i2 & (i2 >> 31)) + 255;
    }

    public static void toq(C0395k att, View view, float[] value) {
        Class<?> cls = view.getClass();
        String str = "set" + att.m1643y();
        try {
            boolean z2 = true;
            switch (k.f2175k[att.m1641p().ordinal()]) {
                case 1:
                    cls.getMethod(str, Integer.TYPE).invoke(view, Integer.valueOf((int) value[0]));
                    return;
                case 2:
                    cls.getMethod(str, Float.TYPE).invoke(view, Float.valueOf(value[0]));
                    return;
                case 3:
                    Method method = cls.getMethod(str, Drawable.class);
                    int iM1379k = (m1379k((int) (((float) Math.pow(value[0], 0.45454545454545453d)) * 255.0f)) << 16) | (m1379k((int) (value[3] * 255.0f)) << 24) | (m1379k((int) (((float) Math.pow(value[1], 0.45454545454545453d)) * 255.0f)) << 8) | m1379k((int) (((float) Math.pow(value[2], 0.45454545454545453d)) * 255.0f));
                    ColorDrawable colorDrawable = new ColorDrawable();
                    colorDrawable.setColor(iM1379k);
                    method.invoke(view, colorDrawable);
                    return;
                case 4:
                    cls.getMethod(str, Integer.TYPE).invoke(view, Integer.valueOf((m1379k((int) (((float) Math.pow(value[0], 0.45454545454545453d)) * 255.0f)) << 16) | (m1379k((int) (value[3] * 255.0f)) << 24) | (m1379k((int) (((float) Math.pow(value[1], 0.45454545454545453d)) * 255.0f)) << 8) | m1379k((int) (((float) Math.pow(value[2], 0.45454545454545453d)) * 255.0f))));
                    return;
                case 5:
                    throw new RuntimeException("unable to interpolate strings " + att.m1643y());
                case 6:
                    Method method2 = cls.getMethod(str, Boolean.TYPE);
                    Object[] objArr = new Object[1];
                    if (value[0] <= 0.5f) {
                        z2 = false;
                    }
                    objArr[0] = Boolean.valueOf(z2);
                    method2.invoke(view, objArr);
                    return;
                case 7:
                    cls.getMethod(str, Float.TYPE).invoke(view, Float.valueOf(value[0]));
                    return;
                default:
                    return;
            }
        } catch (IllegalAccessException e2) {
            Log.e(f2174k, "cannot access method " + str + " on View \"" + androidx.constraintlayout.motion.widget.zy.ld6(view) + "\"");
            e2.printStackTrace();
        } catch (NoSuchMethodException e3) {
            Log.e(f2174k, "no method " + str + " on View \"" + androidx.constraintlayout.motion.widget.zy.ld6(view) + "\"");
            e3.printStackTrace();
        } catch (InvocationTargetException e4) {
            e4.printStackTrace();
        }
    }
}
