package androidx.appcompat.widget;

import android.R;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.ScaleDrawable;
import android.os.Build;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import zy.InterfaceC7830i;
import zy.uv6;

/* JADX INFO: compiled from: DrawableUtils.java */
/* JADX INFO: loaded from: classes.dex */
@zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
public class oc {

    /* JADX INFO: renamed from: k */
    private static final int[] f1164k = {R.attr.state_checked};

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final int[] f46939toq = new int[0];

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final Rect f46940zy = new Rect();

    /* JADX INFO: renamed from: androidx.appcompat.widget.oc$k */
    /* JADX INFO: compiled from: DrawableUtils.java */
    @zy.hyr(18)
    static class C0215k {

        /* JADX INFO: renamed from: g */
        private static final Field f1165g;

        /* JADX INFO: renamed from: k */
        private static final boolean f1166k;

        /* JADX INFO: renamed from: n */
        private static final Field f1167n;

        /* JADX INFO: renamed from: q */
        private static final Field f1168q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private static final Method f46941toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private static final Field f46942zy;

        /* JADX WARN: Removed duplicated region for block: B:25:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0058  */
        static {
            /*
                r0 = 1
                r1 = 0
                r2 = 0
                java.lang.String r3 = "android.graphics.Insets"
                java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.NoSuchFieldException -> L3b java.lang.ClassNotFoundException -> L3f java.lang.NoSuchMethodException -> L43
                java.lang.Class<android.graphics.drawable.Drawable> r4 = android.graphics.drawable.Drawable.class
                java.lang.String r5 = "getOpticalInsets"
                java.lang.Class[] r6 = new java.lang.Class[r1]     // Catch: java.lang.NoSuchFieldException -> L3b java.lang.ClassNotFoundException -> L3f java.lang.NoSuchMethodException -> L43
                java.lang.reflect.Method r4 = r4.getMethod(r5, r6)     // Catch: java.lang.NoSuchFieldException -> L3b java.lang.ClassNotFoundException -> L3f java.lang.NoSuchMethodException -> L43
                java.lang.String r5 = "left"
                java.lang.reflect.Field r5 = r3.getField(r5)     // Catch: java.lang.NoSuchFieldException -> L35 java.lang.ClassNotFoundException -> L37 java.lang.NoSuchMethodException -> L39
                java.lang.String r6 = "top"
                java.lang.reflect.Field r6 = r3.getField(r6)     // Catch: java.lang.NoSuchFieldException -> L2f java.lang.ClassNotFoundException -> L31 java.lang.NoSuchMethodException -> L33
                java.lang.String r7 = "right"
                java.lang.reflect.Field r7 = r3.getField(r7)     // Catch: java.lang.Throwable -> L2d
                java.lang.String r8 = "bottom"
                java.lang.reflect.Field r3 = r3.getField(r8)     // Catch: java.lang.Throwable -> L47
                r8 = r0
                goto L49
            L2d:
                r7 = r2
                goto L47
            L2f:
                r6 = r2
                goto L46
            L31:
                r6 = r2
                goto L46
            L33:
                r6 = r2
                goto L46
            L35:
                r5 = r2
                goto L3d
            L37:
                r5 = r2
                goto L41
            L39:
                r5 = r2
                goto L45
            L3b:
                r4 = r2
                r5 = r4
            L3d:
                r6 = r5
                goto L46
            L3f:
                r4 = r2
                r5 = r4
            L41:
                r6 = r5
                goto L46
            L43:
                r4 = r2
                r5 = r4
            L45:
                r6 = r5
            L46:
                r7 = r6
            L47:
                r8 = r1
                r3 = r2
            L49:
                if (r8 == 0) goto L58
                androidx.appcompat.widget.oc.C0215k.f46941toq = r4
                androidx.appcompat.widget.oc.C0215k.f46942zy = r5
                androidx.appcompat.widget.oc.C0215k.f1168q = r6
                androidx.appcompat.widget.oc.C0215k.f1167n = r7
                androidx.appcompat.widget.oc.C0215k.f1165g = r3
                androidx.appcompat.widget.oc.C0215k.f1166k = r0
                goto L64
            L58:
                androidx.appcompat.widget.oc.C0215k.f46941toq = r2
                androidx.appcompat.widget.oc.C0215k.f46942zy = r2
                androidx.appcompat.widget.oc.C0215k.f1168q = r2
                androidx.appcompat.widget.oc.C0215k.f1167n = r2
                androidx.appcompat.widget.oc.C0215k.f1165g = r2
                androidx.appcompat.widget.oc.C0215k.f1166k = r1
            L64:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.oc.C0215k.<clinit>():void");
        }

        private C0215k() {
        }

        @zy.lvui
        /* JADX INFO: renamed from: k */
        static Rect m699k(@zy.lvui Drawable drawable) {
            if (Build.VERSION.SDK_INT < 29 && f1166k) {
                try {
                    Object objInvoke = f46941toq.invoke(drawable, new Object[0]);
                    if (objInvoke != null) {
                        return new Rect(f46942zy.getInt(objInvoke), f1168q.getInt(objInvoke), f1167n.getInt(objInvoke), f1165g.getInt(objInvoke));
                    }
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
            }
            return oc.f46940zy;
        }
    }

    /* JADX INFO: compiled from: DrawableUtils.java */
    @zy.hyr(29)
    static class toq {
        private toq() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static Insets m700k(Drawable drawable) {
            return drawable.getOpticalInsets();
        }
    }

    private oc() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k */
    public static boolean m696k(@zy.lvui Drawable drawable) {
        if (!(drawable instanceof DrawableContainer)) {
            if (drawable instanceof androidx.core.graphics.drawable.kja0) {
                return m696k(((androidx.core.graphics.drawable.kja0) drawable).mo2420k());
            }
            if (drawable instanceof androidx.appcompat.graphics.drawable.zy) {
                return m696k(((androidx.appcompat.graphics.drawable.zy) drawable).m292k());
            }
            if (drawable instanceof ScaleDrawable) {
                return m696k(((ScaleDrawable) drawable).getDrawable());
            }
            return true;
        }
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (!(constantState instanceof DrawableContainer.DrawableContainerState)) {
            return true;
        }
        for (Drawable drawable2 : ((DrawableContainer.DrawableContainerState) constantState).getChildren()) {
            if (!m696k(drawable2)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: n */
    public static PorterDuff.Mode m697n(int i2, PorterDuff.Mode mode) {
        if (i2 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i2 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i2 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i2) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    @zy.lvui
    /* JADX INFO: renamed from: q */
    public static Rect m698q(@zy.lvui Drawable drawable) {
        if (Build.VERSION.SDK_INT < 29) {
            return C0215k.m699k(androidx.core.graphics.drawable.zy.cdj(drawable));
        }
        Insets insetsM700k = toq.m700k(drawable);
        return new Rect(insetsM700k.left, insetsM700k.top, insetsM700k.right, insetsM700k.bottom);
    }

    static void toq(@zy.lvui Drawable drawable) {
        String name = drawable.getClass().getName();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 29 || i2 >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            return;
        }
        zy(drawable);
    }

    private static void zy(Drawable drawable) {
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f1164k);
        } else {
            drawable.setState(f46939toq);
        }
        drawable.setState(state);
    }
}
