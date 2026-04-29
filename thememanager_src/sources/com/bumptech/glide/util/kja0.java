package com.bumptech.glide.util;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import com.miui.maml.folme.AnimatedProperty;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;
import zy.dd;
import zy.lvui;

/* JADX INFO: compiled from: Util.java */
/* JADX INFO: loaded from: classes2.dex */
public final class kja0 {

    /* JADX INFO: renamed from: k */
    private static final int f19077k = 31;

    /* JADX INFO: renamed from: n */
    @dd
    private static volatile Handler f19078n = null;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final int f63075toq = 17;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final char[] f63076zy = "0123456789abcdef".toCharArray();

    /* JADX INFO: renamed from: q */
    private static final char[] f19079q = new char[64];

    /* JADX INFO: renamed from: com.bumptech.glide.util.kja0$k */
    /* JADX INFO: compiled from: Util.java */
    static /* synthetic */ class C3202k {

        /* JADX INFO: renamed from: k */
        static final /* synthetic */ int[] f19080k;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f19080k = iArr;
            try {
                iArr[Bitmap.Config.ALPHA_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19080k[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19080k[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19080k[Bitmap.Config.RGBA_F16.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19080k[Bitmap.Config.ARGB_8888.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    private kja0() {
    }

    public static int cdj(@dd Object obj, int i2) {
        return m11226h(obj == null ? 0 : obj.hashCode(), i2);
    }

    public static int f7l8(int i2, int i3, @dd Bitmap.Config config) {
        return i2 * i3 * m11232s(config);
    }

    public static boolean fn3e() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static void fu4(Runnable runnable) {
        x2().post(runnable);
    }

    @lvui
    /* JADX INFO: renamed from: g */
    public static <T> Queue<T> m11225g(int i2) {
        return new ArrayDeque(i2);
    }

    /* JADX INFO: renamed from: h */
    public static int m11226h(int i2, int i3) {
        return (i3 * 31) + i2;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m11227i() {
        return !fn3e();
    }

    /* JADX INFO: renamed from: k */
    public static void m11228k() {
        if (!m11227i()) {
            throw new IllegalArgumentException("You must call this method on a background thread");
        }
    }

    public static int ki(boolean z2) {
        return t8r(z2, 17);
    }

    public static int kja0(int i2) {
        return m11226h(i2, 17);
    }

    @lvui
    public static <T> List<T> ld6(@lvui Collection<T> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (T t2 : collection) {
            if (t2 != null) {
                arrayList.add(t2);
            }
        }
        return arrayList;
    }

    @lvui
    /* JADX INFO: renamed from: n */
    private static String m11229n(@lvui byte[] bArr, @lvui char[] cArr) {
        for (int i2 = 0; i2 < bArr.length; i2++) {
            int i3 = bArr[i2] & 255;
            int i4 = i2 * 2;
            char[] cArr2 = f63076zy;
            cArr[i4] = cArr2[i3 >>> 4];
            cArr[i4 + 1] = cArr2[i3 & 15];
        }
        return new String(cArr);
    }

    public static int n7h(float f2, int i2) {
        return m11226h(Float.floatToIntBits(f2), i2);
    }

    public static boolean ni7(int i2, int i3) {
        return zurt(i2) && zurt(i3);
    }

    @lvui
    public static String o1t(@lvui byte[] bArr) {
        String strM11229n;
        char[] cArr = f19079q;
        synchronized (cArr) {
            strM11229n = m11229n(bArr, cArr);
        }
        return strM11229n;
    }

    @Deprecated
    /* JADX INFO: renamed from: p */
    public static int m11230p(@lvui Bitmap bitmap) {
        return m11233y(bitmap);
    }

    /* JADX INFO: renamed from: q */
    public static boolean m11231q(@dd Object obj, @dd Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static int qrj(float f2) {
        return n7h(f2, 17);
    }

    /* JADX INFO: renamed from: s */
    public static int m11232s(@dd Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i2 = C3202k.f19080k[config.ordinal()];
        if (i2 == 1) {
            return 1;
        }
        if (i2 == 2 || i2 == 3) {
            return 2;
        }
        return i2 != 4 ? 4 : 8;
    }

    public static int t8r(boolean z2, int i2) {
        return m11226h(z2 ? 1 : 0, i2);
    }

    public static void toq() {
        if (!fn3e()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    private static Handler x2() {
        if (f19078n == null) {
            synchronized (kja0.class) {
                if (f19078n == null) {
                    f19078n = new Handler(Looper.getMainLooper());
                }
            }
        }
        return f19078n;
    }

    @TargetApi(19)
    /* JADX INFO: renamed from: y */
    public static int m11233y(@lvui Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
                return bitmap.getHeight() * bitmap.getRowBytes();
            }
        }
        throw new IllegalStateException("Cannot obtain size for recycled Bitmap: " + bitmap + "[" + bitmap.getWidth() + AnimatedProperty.PROPERTY_NAME_X + bitmap.getHeight() + "] " + bitmap.getConfig());
    }

    /* JADX INFO: renamed from: z */
    public static void m11234z(Runnable runnable) {
        x2().removeCallbacks(runnable);
    }

    public static boolean zurt(int i2) {
        return i2 > 0 || i2 == Integer.MIN_VALUE;
    }

    public static boolean zy(@dd Object obj, @dd Object obj2) {
        return obj == null ? obj2 == null : obj instanceof com.bumptech.glide.load.model.qrj ? ((com.bumptech.glide.load.model.qrj) obj).m10893k(obj2) : obj.equals(obj2);
    }
}
