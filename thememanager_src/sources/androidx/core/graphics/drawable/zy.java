package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.util.AttributeSet;
import java.io.IOException;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import zy.InterfaceC7830i;
import zy.dd;
import zy.hyr;
import zy.lvui;

/* JADX INFO: compiled from: DrawableCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class zy {

    /* JADX INFO: renamed from: k */
    private static final String f3558k = "DrawableCompat";

    /* JADX INFO: renamed from: n */
    private static boolean f3559n;

    /* JADX INFO: renamed from: q */
    private static Method f3560q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static Method f50457toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static boolean f50458zy;

    /* JADX INFO: renamed from: androidx.core.graphics.drawable.zy$k */
    /* JADX INFO: compiled from: DrawableCompat.java */
    @hyr(19)
    static class C0528k {
        private C0528k() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static int m2449k(Drawable drawable) {
            return drawable.getAlpha();
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: n */
        static void m2450n(Drawable drawable, boolean z2) {
            drawable.setAutoMirrored(z2);
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: q */
        static boolean m2451q(Drawable drawable) {
            return drawable.isAutoMirrored();
        }

        @InterfaceC7830i
        static Drawable toq(DrawableContainer.DrawableContainerState drawableContainerState, int i2) {
            return drawableContainerState.getChild(i2);
        }

        @InterfaceC7830i
        static Drawable zy(InsetDrawable insetDrawable) {
            return insetDrawable.getDrawable();
        }
    }

    /* JADX INFO: compiled from: DrawableCompat.java */
    @hyr(21)
    static class toq {
        private toq() {
        }

        @InterfaceC7830i
        static void f7l8(Drawable drawable, int i2) {
            drawable.setTint(i2);
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: g */
        static void m2452g(Drawable drawable, int i2, int i3, int i4, int i5) {
            drawable.setHotspotBounds(i2, i3, i4, i5);
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static void m2453k(Drawable drawable, Resources.Theme theme) {
            drawable.applyTheme(theme);
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: n */
        static void m2454n(Drawable drawable, float f2, float f3) {
            drawable.setHotspot(f2, f3);
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: q */
        static void m2455q(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: s */
        static void m2456s(Drawable drawable, PorterDuff.Mode mode) {
            drawable.setTintMode(mode);
        }

        @InterfaceC7830i
        static boolean toq(Drawable drawable) {
            return drawable.canApplyTheme();
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: y */
        static void m2457y(Drawable drawable, ColorStateList colorStateList) {
            drawable.setTintList(colorStateList);
        }

        @InterfaceC7830i
        static ColorFilter zy(Drawable drawable) {
            return drawable.getColorFilter();
        }
    }

    /* JADX INFO: renamed from: androidx.core.graphics.drawable.zy$zy, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DrawableCompat.java */
    @hyr(23)
    static class C7864zy {
        private C7864zy() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static int m2458k(Drawable drawable) {
            return drawable.getLayoutDirection();
        }

        @InterfaceC7830i
        static boolean toq(Drawable drawable, int i2) {
            return drawable.setLayoutDirection(i2);
        }
    }

    private zy() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T extends Drawable> T cdj(@lvui Drawable drawable) {
        return drawable instanceof kja0 ? (T) ((kja0) drawable).mo2420k() : drawable;
    }

    public static void f7l8(@lvui Drawable drawable, @lvui Resources resources, @lvui XmlPullParser xmlPullParser, @lvui AttributeSet attributeSet, @dd Resources.Theme theme) throws XmlPullParserException, IOException {
        toq.m2455q(drawable, resources, xmlPullParser, attributeSet, theme);
    }

    /* JADX INFO: renamed from: g */
    public static int m2441g(@lvui Drawable drawable) {
        return C7864zy.m2458k(drawable);
    }

    /* JADX INFO: renamed from: h */
    public static void m2442h(@lvui Drawable drawable, @lvui PorterDuff.Mode mode) {
        toq.m2456s(drawable, mode);
    }

    /* JADX INFO: renamed from: k */
    public static void m2443k(@lvui Drawable drawable, @lvui Resources.Theme theme) {
        toq.m2453k(drawable, theme);
    }

    @lvui
    public static Drawable ki(@lvui Drawable drawable) {
        return drawable;
    }

    public static void kja0(@lvui Drawable drawable, @dd ColorStateList colorStateList) {
        toq.m2457y(drawable, colorStateList);
    }

    public static void ld6(@lvui Drawable drawable, float f2, float f3) {
        toq.m2454n(drawable, f2, f3);
    }

    @dd
    /* JADX INFO: renamed from: n */
    public static ColorFilter m2444n(@lvui Drawable drawable) {
        return toq.zy(drawable);
    }

    public static void n7h(@lvui Drawable drawable, @zy.x2 int i2) {
        toq.f7l8(drawable, i2);
    }

    /* JADX INFO: renamed from: p */
    public static void m2445p(@lvui Drawable drawable, boolean z2) {
        C0528k.m2450n(drawable, z2);
    }

    /* JADX INFO: renamed from: q */
    public static int m2446q(@lvui Drawable drawable) {
        return C0528k.m2449k(drawable);
    }

    public static boolean qrj(@lvui Drawable drawable, int i2) {
        return C7864zy.toq(drawable, i2);
    }

    @Deprecated
    /* JADX INFO: renamed from: s */
    public static void m2447s(@lvui Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    public static boolean toq(@lvui Drawable drawable) {
        return toq.toq(drawable);
    }

    public static void x2(@lvui Drawable drawable, int i2, int i3, int i4, int i5) {
        toq.m2452g(drawable, i2, i3, i4, i5);
    }

    /* JADX INFO: renamed from: y */
    public static boolean m2448y(@lvui Drawable drawable) {
        return C0528k.m2451q(drawable);
    }

    public static void zy(@lvui Drawable drawable) {
        drawable.clearColorFilter();
    }
}
