package bap7;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.TypedValue;
import androidx.core.graphics.cdj;
import androidx.core.view.animation.toq;
import zy.InterfaceC7828g;
import zy.lvui;
import zy.uv6;

/* JADX INFO: renamed from: bap7.k */
/* JADX INFO: compiled from: MotionUtils.java */
/* JADX INFO: loaded from: classes2.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP})
public class C1366k {

    /* JADX INFO: renamed from: k */
    private static final String f7254k = "cubic-bezier";

    /* JADX INFO: renamed from: q */
    private static final String f7255q = ")";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f53998toq = "path";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String f53999zy = "(";

    private C1366k() {
    }

    /* JADX INFO: renamed from: k */
    private static float m5798k(String[] strArr, int i2) {
        float f2 = Float.parseFloat(strArr[i2]);
        if (f2 >= 0.0f && f2 <= 1.0f) {
            return f2;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + f2);
    }

    @lvui
    /* JADX INFO: renamed from: n */
    public static TimeInterpolator m5799n(@lvui Context context, @InterfaceC7828g int i2, @lvui TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i2, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be a string");
        }
        String strValueOf = String.valueOf(typedValue.string);
        if (!zy(strValueOf, f7254k)) {
            if (zy(strValueOf, "path")) {
                return toq.zy(cdj.m2389n(toq(strValueOf, "path")));
            }
            throw new IllegalArgumentException("Invalid motion easing type: " + strValueOf);
        }
        String[] strArrSplit = toq(strValueOf, f7254k).split(",");
        if (strArrSplit.length == 4) {
            return toq.toq(m5798k(strArrSplit, 0), m5798k(strArrSplit, 1), m5798k(strArrSplit, 2), m5798k(strArrSplit, 3));
        }
        throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + strArrSplit.length);
    }

    /* JADX INFO: renamed from: q */
    public static int m5800q(@lvui Context context, @InterfaceC7828g int i2, int i3) {
        return com.google.android.material.resources.toq.m14748n(context, i2, i3);
    }

    private static String toq(String str, String str2) {
        return str.substring(str2.length() + 1, str.length() - 1);
    }

    private static boolean zy(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(f53999zy);
        return str.startsWith(sb.toString()) && str.endsWith(f7255q);
    }
}
