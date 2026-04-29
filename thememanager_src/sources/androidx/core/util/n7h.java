package androidx.core.util;

import android.text.TextUtils;
import java.util.Locale;
import zy.a9;
import zy.dd;
import zy.lvui;
import zy.uv6;

/* JADX INFO: compiled from: Preconditions.java */
/* JADX INFO: loaded from: classes.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
public final class n7h {
    private n7h() {
    }

    @lvui
    public static <T extends CharSequence> T cdj(@dd T t2, @lvui Object obj) {
        if (TextUtils.isEmpty(t2)) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
        return t2;
    }

    public static int f7l8(int i2, int i3, int i4, @lvui String str) {
        if (i2 < i3) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", str, Integer.valueOf(i3), Integer.valueOf(i4)));
        }
        if (i2 <= i4) {
            return i2;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", str, Integer.valueOf(i3), Integer.valueOf(i4)));
    }

    /* JADX INFO: renamed from: g */
    public static float m2973g(float f2, float f3, float f4, @lvui String str) {
        if (f2 < f3) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too low)", str, Float.valueOf(f3), Float.valueOf(f4)));
        }
        if (f2 <= f4) {
            return f2;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too high)", str, Float.valueOf(f3), Float.valueOf(f4)));
    }

    @lvui
    /* JADX INFO: renamed from: h */
    public static <T extends CharSequence> T m2974h(@dd T t2) {
        if (TextUtils.isEmpty(t2)) {
            throw new IllegalArgumentException();
        }
        return t2;
    }

    /* JADX INFO: renamed from: k */
    public static void m2975k(boolean z2) {
        if (!z2) {
            throw new IllegalArgumentException();
        }
    }

    @lvui
    public static <T extends CharSequence> T ki(@dd T t2, @lvui String str, @lvui Object... objArr) {
        if (TextUtils.isEmpty(t2)) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
        return t2;
    }

    public static void kja0(boolean z2, @dd String str) {
        if (!z2) {
            throw new IllegalStateException(str);
        }
    }

    public static int ld6(int i2, int i3) {
        if ((i2 & i3) == i2) {
            return i2;
        }
        throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i2) + ", but only 0x" + Integer.toHexString(i3) + " are allowed");
    }

    /* JADX INFO: renamed from: n */
    public static double m2976n(double d2, double d4, double d5, @lvui String str) {
        if (d2 < d4) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too low)", str, Double.valueOf(d4), Double.valueOf(d5)));
        }
        if (d2 <= d5) {
            return d2;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too high)", str, Double.valueOf(d4), Double.valueOf(d5)));
    }

    public static void n7h(boolean z2) {
        kja0(z2, null);
    }

    @a9(from = 0)
    /* JADX INFO: renamed from: p */
    public static int m2977p(int i2, @dd String str) {
        if (i2 >= 0) {
            return i2;
        }
        throw new IllegalArgumentException(str);
    }

    /* JADX INFO: renamed from: q */
    public static float m2978q(float f2, @lvui String str) {
        if (Float.isNaN(f2)) {
            throw new IllegalArgumentException(str + " must not be NaN");
        }
        if (!Float.isInfinite(f2)) {
            return f2;
        }
        throw new IllegalArgumentException(str + " must not be infinite");
    }

    @lvui
    public static <T> T qrj(@dd T t2, @lvui Object obj) {
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    @a9(from = 0)
    /* JADX INFO: renamed from: s */
    public static int m2979s(int i2) {
        if (i2 >= 0) {
            return i2;
        }
        throw new IllegalArgumentException();
    }

    public static void toq(boolean z2, @lvui Object obj) {
        if (!z2) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    @lvui
    public static <T> T x2(@dd T t2) {
        t2.getClass();
        return t2;
    }

    /* JADX INFO: renamed from: y */
    public static long m2980y(long j2, long j3, long j4, @lvui String str) {
        if (j2 < j3) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", str, Long.valueOf(j3), Long.valueOf(j4)));
        }
        if (j2 <= j4) {
            return j2;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", str, Long.valueOf(j3), Long.valueOf(j4)));
    }

    public static void zy(boolean z2, @lvui String str, @lvui Object... objArr) {
        if (!z2) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }
}
