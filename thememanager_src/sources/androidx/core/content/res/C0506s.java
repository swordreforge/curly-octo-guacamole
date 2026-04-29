package androidx.core.content.res;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.core.util.C0642s;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.WeakHashMap;
import zy.InterfaceC7829h;
import zy.InterfaceC7830i;
import zy.dd;
import zy.fn3e;
import zy.hyr;
import zy.lvui;
import zy.ni7;
import zy.o1t;
import zy.uv6;

/* JADX INFO: renamed from: androidx.core.content.res.s */
/* JADX INFO: compiled from: ResourcesCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0506s {

    /* JADX INFO: renamed from: k */
    private static final String f3509k = "ResourcesCompat";

    /* JADX INFO: renamed from: n */
    @zy.zy
    public static final int f3510n = 0;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final ThreadLocal<TypedValue> f50412toq = new ThreadLocal<>();

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @o1t("sColorStateCacheLock")
    private static final WeakHashMap<g, SparseArray<n>> f50413zy = new WeakHashMap<>(0);

    /* JADX INFO: renamed from: q */
    private static final Object f3511q = new Object();

    /* JADX INFO: renamed from: androidx.core.content.res.s$f7l8 */
    /* JADX INFO: compiled from: ResourcesCompat.java */
    public static abstract class f7l8 {
        @lvui
        @uv6({uv6.EnumC7844k.LIBRARY})
        /* JADX INFO: renamed from: n */
        public static Handler m2337n(@dd Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
        /* JADX INFO: renamed from: q */
        public final void m2338q(@lvui final Typeface typeface, @dd Handler handler) {
            m2337n(handler).post(new Runnable() { // from class: androidx.core.content.res.ld6
                @Override // java.lang.Runnable
                public final void run() {
                    this.f3505k.f7l8(typeface);
                }
            });
        }

        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public abstract void f7l8(@lvui Typeface typeface);

        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public abstract void m2335g(int i2);

        @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
        public final void zy(final int i2, @dd Handler handler) {
            m2337n(handler).post(new Runnable() { // from class: androidx.core.content.res.x2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f3517k.m2335g(i2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: androidx.core.content.res.s$g */
    /* JADX INFO: compiled from: ResourcesCompat.java */
    private static final class g {

        /* JADX INFO: renamed from: k */
        final Resources f3512k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final Resources.Theme f50414toq;

        g(@lvui Resources resources, @dd Resources.Theme theme) {
            this.f3512k = resources;
            this.f50414toq = theme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || g.class != obj.getClass()) {
                return false;
            }
            g gVar = (g) obj;
            return this.f3512k.equals(gVar.f3512k) && C0642s.m2985k(this.f50414toq, gVar.f50414toq);
        }

        public int hashCode() {
            return C0642s.toq(this.f3512k, this.f50414toq);
        }
    }

    /* JADX INFO: renamed from: androidx.core.content.res.s$k */
    /* JADX INFO: compiled from: ResourcesCompat.java */
    @hyr(15)
    static class k {
        private k() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static Drawable m2339k(Resources resources, int i2, int i3) {
            return resources.getDrawableForDensity(i2, i3);
        }
    }

    /* JADX INFO: renamed from: androidx.core.content.res.s$n */
    /* JADX INFO: compiled from: ResourcesCompat.java */
    private static class n {

        /* JADX INFO: renamed from: k */
        final ColorStateList f3513k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final Configuration f50415toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        final int f50416zy;

        n(@lvui ColorStateList colorStateList, @lvui Configuration configuration, @dd Resources.Theme theme) {
            this.f3513k = colorStateList;
            this.f50415toq = configuration;
            this.f50416zy = theme == null ? 0 : theme.hashCode();
        }
    }

    /* JADX INFO: renamed from: androidx.core.content.res.s$q */
    /* JADX INFO: compiled from: ResourcesCompat.java */
    @hyr(29)
    static class q {
        private q() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static float m2340k(@lvui Resources resources, @InterfaceC7829h int i2) {
            return resources.getFloat(i2);
        }
    }

    /* JADX INFO: renamed from: androidx.core.content.res.s$toq */
    /* JADX INFO: compiled from: ResourcesCompat.java */
    @hyr(21)
    static class toq {
        private toq() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static Drawable m2341k(Resources resources, int i2, Resources.Theme theme) {
            return resources.getDrawable(i2, theme);
        }

        @InterfaceC7830i
        static Drawable toq(Resources resources, int i2, int i3, Resources.Theme theme) {
            return resources.getDrawableForDensity(i2, i3, theme);
        }
    }

    /* JADX INFO: renamed from: androidx.core.content.res.s$y */
    /* JADX INFO: compiled from: ResourcesCompat.java */
    public static final class y {

        /* JADX INFO: renamed from: androidx.core.content.res.s$y$k */
        /* JADX INFO: compiled from: ResourcesCompat.java */
        @hyr(23)
        static class k {

            /* JADX INFO: renamed from: k */
            private static final Object f3514k = new Object();

            /* JADX INFO: renamed from: toq, reason: collision with root package name */
            private static Method f50417toq;

            /* JADX INFO: renamed from: zy, reason: collision with root package name */
            private static boolean f50418zy;

            private k() {
            }

            /* JADX WARN: Removed duplicated region for block: B:30:0x0027 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            @android.annotation.SuppressLint({"BanUncheckedReflection"})
            /* JADX INFO: renamed from: k */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            static void m2343k(@zy.lvui android.content.res.Resources.Theme r6) {
                /*
                    java.lang.Object r0 = androidx.core.content.res.C0506s.y.k.f3514k
                    monitor-enter(r0)
                    boolean r1 = androidx.core.content.res.C0506s.y.k.f50418zy     // Catch: java.lang.Throwable -> L3c
                    r2 = 0
                    if (r1 != 0) goto L23
                    r1 = 1
                    java.lang.Class<android.content.res.Resources$Theme> r3 = android.content.res.Resources.Theme.class
                    java.lang.String r4 = "rebase"
                    java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L19 java.lang.Throwable -> L3c
                    java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r5)     // Catch: java.lang.NoSuchMethodException -> L19 java.lang.Throwable -> L3c
                    androidx.core.content.res.C0506s.y.k.f50417toq = r3     // Catch: java.lang.NoSuchMethodException -> L19 java.lang.Throwable -> L3c
                    r3.setAccessible(r1)     // Catch: java.lang.NoSuchMethodException -> L19 java.lang.Throwable -> L3c
                    goto L21
                L19:
                    r3 = move-exception
                    java.lang.String r4 = "ResourcesCompat"
                    java.lang.String r5 = "Failed to retrieve rebase() method"
                    android.util.Log.i(r4, r5, r3)     // Catch: java.lang.Throwable -> L3c
                L21:
                    androidx.core.content.res.C0506s.y.k.f50418zy = r1     // Catch: java.lang.Throwable -> L3c
                L23:
                    java.lang.reflect.Method r1 = androidx.core.content.res.C0506s.y.k.f50417toq     // Catch: java.lang.Throwable -> L3c
                    if (r1 == 0) goto L3a
                    java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.reflect.InvocationTargetException -> L2d java.lang.IllegalAccessException -> L2f java.lang.Throwable -> L3c
                    r1.invoke(r6, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L2d java.lang.IllegalAccessException -> L2f java.lang.Throwable -> L3c
                    goto L3a
                L2d:
                    r6 = move-exception
                    goto L30
                L2f:
                    r6 = move-exception
                L30:
                    java.lang.String r1 = "ResourcesCompat"
                    java.lang.String r2 = "Failed to invoke rebase() method via reflection"
                    android.util.Log.i(r1, r2, r6)     // Catch: java.lang.Throwable -> L3c
                    r6 = 0
                    androidx.core.content.res.C0506s.y.k.f50417toq = r6     // Catch: java.lang.Throwable -> L3c
                L3a:
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L3c
                    return
                L3c:
                    r6 = move-exception
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L3c
                    throw r6
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.C0506s.y.k.m2343k(android.content.res.Resources$Theme):void");
            }
        }

        /* JADX INFO: renamed from: androidx.core.content.res.s$y$toq */
        /* JADX INFO: compiled from: ResourcesCompat.java */
        @hyr(29)
        static class toq {
            private toq() {
            }

            @InterfaceC7830i
            /* JADX INFO: renamed from: k */
            static void m2344k(@lvui Resources.Theme theme) {
                theme.rebase();
            }
        }

        private y() {
        }

        /* JADX INFO: renamed from: k */
        public static void m2342k(@lvui Resources.Theme theme) {
            if (Build.VERSION.SDK_INT >= 29) {
                toq.m2344k(theme);
            } else {
                k.m2343k(theme);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.core.content.res.s$zy */
    /* JADX INFO: compiled from: ResourcesCompat.java */
    @hyr(23)
    static class zy {
        private zy() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static int m2345k(Resources resources, int i2, Resources.Theme theme) {
            return resources.getColor(i2, theme);
        }

        @InterfaceC7830i
        @lvui
        static ColorStateList toq(@lvui Resources resources, @zy.n7h int i2, @dd Resources.Theme theme) {
            return resources.getColorStateList(i2, theme);
        }
    }

    private C0506s() {
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.graphics.Typeface cdj(@zy.lvui android.content.Context r17, android.content.res.Resources r18, @zy.lvui android.util.TypedValue r19, int r20, int r21, @zy.dd androidx.core.content.res.C0506s.f7l8 r22, @zy.dd android.os.Handler r23, boolean r24, boolean r25) {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.C0506s.cdj(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, androidx.core.content.res.s$f7l8, android.os.Handler, boolean, boolean):android.graphics.Typeface");
    }

    @dd
    public static Drawable f7l8(@lvui Resources resources, @fn3e int i2, @dd Resources.Theme theme) throws Resources.NotFoundException {
        return toq.m2341k(resources, i2, theme);
    }

    @dd
    /* JADX INFO: renamed from: g */
    public static ColorStateList m2327g(@lvui Resources resources, @zy.n7h int i2, @dd Resources.Theme theme) throws Resources.NotFoundException {
        g gVar = new g(resources, theme);
        ColorStateList colorStateListZy = zy(gVar, i2);
        if (colorStateListZy != null) {
            return colorStateListZy;
        }
        ColorStateList colorStateListN7h = n7h(resources, i2, theme);
        if (colorStateListN7h == null) {
            return zy.toq(resources, i2, theme);
        }
        m2329k(gVar, i2, colorStateListN7h, theme);
        return colorStateListN7h;
    }

    /* JADX INFO: renamed from: h */
    private static Typeface m2328h(@lvui Context context, int i2, @lvui TypedValue typedValue, int i3, @dd f7l8 f7l8Var, @dd Handler handler, boolean z2, boolean z3) {
        Resources resources = context.getResources();
        resources.getValue(i2, typedValue, true);
        Typeface typefaceCdj = cdj(context, resources, typedValue, i2, i3, f7l8Var, handler, z2, z3);
        if (typefaceCdj != null || f7l8Var != null || z3) {
            return typefaceCdj;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i2) + " could not be retrieved.");
    }

    /* JADX INFO: renamed from: k */
    private static void m2329k(@lvui g gVar, @zy.n7h int i2, @lvui ColorStateList colorStateList, @dd Resources.Theme theme) {
        synchronized (f3511q) {
            WeakHashMap<g, SparseArray<n>> weakHashMap = f50413zy;
            SparseArray<n> sparseArray = weakHashMap.get(gVar);
            if (sparseArray == null) {
                sparseArray = new SparseArray<>();
                weakHashMap.put(gVar, sparseArray);
            }
            sparseArray.append(i2, new n(colorStateList, gVar.f3512k.getConfiguration(), theme));
        }
    }

    private static boolean kja0(@lvui Resources resources, @zy.n7h int i2) {
        TypedValue typedValueQrj = qrj();
        resources.getValue(i2, typedValueQrj, true);
        int i3 = typedValueQrj.type;
        return i3 >= 28 && i3 <= 31;
    }

    @dd
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public static Typeface ld6(@lvui Context context, @ni7 int i2, @lvui TypedValue typedValue, int i3, @dd f7l8 f7l8Var) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return m2328h(context, i2, typedValue, i3, f7l8Var, null, true, false);
    }

    @zy.x2
    /* JADX INFO: renamed from: n */
    public static int m2330n(@lvui Resources resources, @zy.n7h int i2, @dd Resources.Theme theme) throws Resources.NotFoundException {
        return zy.m2345k(resources, i2, theme);
    }

    @dd
    private static ColorStateList n7h(Resources resources, int i2, @dd Resources.Theme theme) {
        if (kja0(resources, i2)) {
            return null;
        }
        try {
            return androidx.core.content.res.zy.m2358k(resources, resources.getXml(i2), theme);
        } catch (Exception e2) {
            Log.w(f3509k, "Failed to inflate ColorStateList, leaving it to the framework", e2);
            return null;
        }
    }

    @dd
    /* JADX INFO: renamed from: p */
    public static Typeface m2331p(@lvui Context context, @ni7 int i2) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return m2328h(context, i2, new TypedValue(), 0, null, null, false, false);
    }

    @dd
    /* JADX INFO: renamed from: q */
    public static Typeface m2332q(@lvui Context context, @ni7 int i2) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return m2328h(context, i2, new TypedValue(), 0, null, null, false, true);
    }

    @lvui
    private static TypedValue qrj() {
        ThreadLocal<TypedValue> threadLocal = f50412toq;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    /* JADX INFO: renamed from: s */
    public static float m2333s(@lvui Resources resources, @InterfaceC7829h int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            return q.m2340k(resources, i2);
        }
        TypedValue typedValueQrj = qrj();
        resources.getValue(i2, typedValueQrj, true);
        if (typedValueQrj.type == 4) {
            return typedValueQrj.getFloat();
        }
        throw new Resources.NotFoundException("Resource ID #0x" + Integer.toHexString(i2) + " type #0x" + Integer.toHexString(typedValueQrj.type) + " is not valid");
    }

    public static void toq(@lvui Resources.Theme theme) {
        synchronized (f3511q) {
            Iterator<g> it = f50413zy.keySet().iterator();
            while (it.hasNext()) {
                g next = it.next();
                if (next != null && theme.equals(next.f50414toq)) {
                    it.remove();
                }
            }
        }
    }

    public static void x2(@lvui Context context, @ni7 int i2, @lvui f7l8 f7l8Var, @dd Handler handler) throws Resources.NotFoundException {
        androidx.core.util.n7h.x2(f7l8Var);
        if (context.isRestricted()) {
            f7l8Var.zy(-4, handler);
        } else {
            m2328h(context, i2, new TypedValue(), 0, f7l8Var, handler, false, false);
        }
    }

    @dd
    /* JADX INFO: renamed from: y */
    public static Drawable m2334y(@lvui Resources resources, @fn3e int i2, int i3, @dd Resources.Theme theme) throws Resources.NotFoundException {
        return toq.toq(resources, i2, i3, theme);
    }

    @dd
    private static ColorStateList zy(@lvui g gVar, @zy.n7h int i2) {
        n nVar;
        Resources.Theme theme;
        synchronized (f3511q) {
            SparseArray<n> sparseArray = f50413zy.get(gVar);
            if (sparseArray != null && sparseArray.size() > 0 && (nVar = sparseArray.get(i2)) != null) {
                if (nVar.f50415toq.equals(gVar.f3512k.getConfiguration()) && (((theme = gVar.f50414toq) == null && nVar.f50416zy == 0) || (theme != null && nVar.f50416zy == theme.hashCode()))) {
                    return nVar.f3513k;
                }
                sparseArray.remove(i2);
            }
            return null;
        }
    }
}
