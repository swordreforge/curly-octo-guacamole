package androidx.core.graphics;

import android.graphics.BlendMode;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;
import androidx.core.graphics.f7l8;
import androidx.core.util.C0639p;
import zy.InterfaceC7830i;
import zy.dd;
import zy.hyr;
import zy.lvui;

/* JADX INFO: compiled from: PaintCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class n7h {

    /* JADX INFO: renamed from: k */
    private static final String f3579k = "\udfffd";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f50478toq = "m";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final ThreadLocal<C0639p<Rect, Rect>> f50479zy = new ThreadLocal<>();

    /* JADX INFO: renamed from: androidx.core.graphics.n7h$k */
    /* JADX INFO: compiled from: PaintCompat.java */
    @hyr(23)
    static class C0539k {
        private C0539k() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static boolean m2513k(Paint paint, String str) {
            return paint.hasGlyph(str);
        }
    }

    /* JADX INFO: compiled from: PaintCompat.java */
    @hyr(29)
    static class toq {
        private toq() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static void m2514k(Paint paint, Object obj) {
            paint.setBlendMode((BlendMode) obj);
        }
    }

    private n7h() {
    }

    /* JADX INFO: renamed from: k */
    public static boolean m2512k(@lvui Paint paint, @lvui String str) {
        return C0539k.m2513k(paint, str);
    }

    private static C0639p<Rect, Rect> toq() {
        ThreadLocal<C0639p<Rect, Rect>> threadLocal = f50479zy;
        C0639p<Rect, Rect> c0639p = threadLocal.get();
        if (c0639p == null) {
            C0639p<Rect, Rect> c0639p2 = new C0639p<>(new Rect(), new Rect());
            threadLocal.set(c0639p2);
            return c0639p2;
        }
        c0639p.f3889k.setEmpty();
        c0639p.f50633toq.setEmpty();
        return c0639p;
    }

    public static boolean zy(@lvui Paint paint, @dd EnumC0532g enumC0532g) {
        if (Build.VERSION.SDK_INT >= 29) {
            toq.m2514k(paint, enumC0532g != null ? f7l8.toq.m2460k(enumC0532g) : null);
            return true;
        }
        if (enumC0532g == null) {
            paint.setXfermode(null);
            return true;
        }
        PorterDuff.Mode modeM2459k = f7l8.m2459k(enumC0532g);
        paint.setXfermode(modeM2459k != null ? new PorterDuffXfermode(modeM2459k) : null);
        return modeM2459k != null;
    }
}
