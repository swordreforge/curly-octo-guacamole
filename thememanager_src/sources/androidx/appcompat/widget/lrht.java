package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import androidx.appcompat.graphics.drawable.C0109k;
import androidx.collection.C0252s;
import androidx.core.content.C0498q;
import androidx.vectordrawable.graphics.drawable.C1257s;
import f7l8.C6028k;
import f7l8.toq;
import h7am.C6071k;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import zy.uv6;

/* JADX INFO: compiled from: ResourceManagerInternal.java */
/* JADX INFO: loaded from: classes.dex */
@zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
public final class lrht {

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final String f46913ld6 = "appcompat_skip_skip";

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static lrht f46915qrj = null;

    /* JADX INFO: renamed from: s */
    private static final boolean f1094s = false;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final String f46916x2 = "android.graphics.drawable.VectorDrawable";

    /* JADX INFO: renamed from: y */
    private static final String f1095y = "ResourceManagerInternal";

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private InterfaceC0200g f46917f7l8;

    /* JADX INFO: renamed from: g */
    private boolean f1096g;

    /* JADX INFO: renamed from: k */
    private WeakHashMap<Context, androidx.collection.n7h<ColorStateList>> f1097k;

    /* JADX INFO: renamed from: n */
    private TypedValue f1098n;

    /* JADX INFO: renamed from: q */
    private final WeakHashMap<Context, C0252s<WeakReference<Drawable.ConstantState>>> f1099q = new WeakHashMap<>(0);

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private androidx.collection.qrj<String, InterfaceC0202n> f46918toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private androidx.collection.n7h<String> f46919zy;

    /* JADX INFO: renamed from: p */
    private static final PorterDuff.Mode f1093p = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private static final zy f46914n7h = new zy(6);

    /* JADX INFO: compiled from: ResourceManagerInternal.java */
    private static class f7l8 implements InterfaceC0202n {
        f7l8() {
        }

        @Override // androidx.appcompat.widget.lrht.InterfaceC0202n
        /* JADX INFO: renamed from: k */
        public Drawable mo651k(@zy.lvui Context context, @zy.lvui XmlPullParser xmlPullParser, @zy.lvui AttributeSet attributeSet, @zy.dd Resources.Theme theme) {
            try {
                return C1257s.m5458n(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e2) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e2);
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.lrht$g */
    /* JADX INFO: compiled from: ResourceManagerInternal.java */
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public interface InterfaceC0200g {
        @zy.dd
        /* JADX INFO: renamed from: k */
        Drawable mo639k(@zy.lvui lrht lrhtVar, @zy.lvui Context context, @zy.fn3e int i2);

        /* JADX INFO: renamed from: n */
        boolean mo640n(@zy.lvui Context context, @zy.fn3e int i2, @zy.lvui Drawable drawable);

        @zy.dd
        /* JADX INFO: renamed from: q */
        PorterDuff.Mode mo641q(int i2);

        @zy.dd
        ColorStateList toq(@zy.lvui Context context, @zy.fn3e int i2);

        boolean zy(@zy.lvui Context context, @zy.fn3e int i2, @zy.lvui Drawable drawable);
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.lrht$k */
    /* JADX INFO: compiled from: ResourceManagerInternal.java */
    static class C0201k implements InterfaceC0202n {
        C0201k() {
        }

        @Override // androidx.appcompat.widget.lrht.InterfaceC0202n
        /* JADX INFO: renamed from: k */
        public Drawable mo651k(@zy.lvui Context context, @zy.lvui XmlPullParser xmlPullParser, @zy.lvui AttributeSet attributeSet, @zy.dd Resources.Theme theme) {
            try {
                return C0109k.mcp(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e2) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e2);
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.lrht$n */
    /* JADX INFO: compiled from: ResourceManagerInternal.java */
    private interface InterfaceC0202n {
        /* JADX INFO: renamed from: k */
        Drawable mo651k(@zy.lvui Context context, @zy.lvui XmlPullParser xmlPullParser, @zy.lvui AttributeSet attributeSet, @zy.dd Resources.Theme theme);
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.lrht$q */
    /* JADX INFO: compiled from: ResourceManagerInternal.java */
    static class C0203q implements InterfaceC0202n {
        C0203q() {
        }

        @Override // androidx.appcompat.widget.lrht.InterfaceC0202n
        /* JADX INFO: renamed from: k */
        public Drawable mo651k(@zy.lvui Context context, @zy.lvui XmlPullParser xmlPullParser, @zy.lvui AttributeSet attributeSet, @zy.dd Resources.Theme theme) {
            String classAttribute = attributeSet.getClassAttribute();
            if (classAttribute != null) {
                try {
                    Drawable drawable = (Drawable) C0203q.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    C6028k.zy.zy(drawable, context.getResources(), xmlPullParser, attributeSet, theme);
                    return drawable;
                } catch (Exception e2) {
                    Log.e("DrawableDelegate", "Exception while inflating <drawable>", e2);
                }
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: ResourceManagerInternal.java */
    private static class toq implements InterfaceC0202n {
        toq() {
        }

        @Override // androidx.appcompat.widget.lrht.InterfaceC0202n
        /* JADX INFO: renamed from: k */
        public Drawable mo651k(@zy.lvui Context context, @zy.lvui XmlPullParser xmlPullParser, @zy.lvui AttributeSet attributeSet, @zy.dd Resources.Theme theme) {
            try {
                return androidx.vectordrawable.graphics.drawable.zy.m5489n(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e2) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e2);
                return null;
            }
        }
    }

    /* JADX INFO: compiled from: ResourceManagerInternal.java */
    private static class zy extends androidx.collection.ld6<Integer, PorterDuffColorFilter> {
        public zy(int i2) {
            super(i2);
        }

        private static int t8r(int i2, PorterDuff.Mode mode) {
            return ((i2 + 31) * 31) + mode.hashCode();
        }

        PorterDuffColorFilter fn3e(int i2, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return m840p(Integer.valueOf(t8r(i2, mode)), porterDuffColorFilter);
        }

        /* JADX INFO: renamed from: i */
        PorterDuffColorFilter m652i(int i2, PorterDuff.Mode mode) {
            return m836g(Integer.valueOf(t8r(i2, mode)));
        }
    }

    private static boolean cdj(@zy.lvui Drawable drawable) {
        return (drawable instanceof C1257s) || f46916x2.equals(drawable.getClass().getName());
    }

    private static PorterDuffColorFilter f7l8(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return x2(colorStateList.getColorForState(iArr, 0), mode);
    }

    /* JADX INFO: renamed from: g */
    private Drawable m642g(@zy.lvui Context context, @zy.fn3e int i2) {
        if (this.f1098n == null) {
            this.f1098n = new TypedValue();
        }
        TypedValue typedValue = this.f1098n;
        context.getResources().getValue(i2, typedValue, true);
        long jM645n = m645n(typedValue);
        Drawable drawableM647s = m647s(context, jM645n);
        if (drawableM647s != null) {
            return drawableM647s;
        }
        InterfaceC0200g interfaceC0200g = this.f46917f7l8;
        Drawable drawableMo639k = interfaceC0200g == null ? null : interfaceC0200g.mo639k(this, context, i2);
        if (drawableMo639k != null) {
            drawableMo639k.setChangingConfigurations(typedValue.changingConfigurations);
            toq(context, jM645n, drawableMo639k);
        }
        return drawableMo639k;
    }

    /* JADX INFO: renamed from: h */
    private static void m643h(@zy.lvui lrht lrhtVar) {
    }

    /* JADX INFO: renamed from: k */
    private void m644k(@zy.lvui String str, @zy.lvui InterfaceC0202n interfaceC0202n) {
        if (this.f46918toq == null) {
            this.f46918toq = new androidx.collection.qrj<>();
        }
        this.f46918toq.put(str, interfaceC0202n);
    }

    private Drawable ki(@zy.lvui Context context, @zy.fn3e int i2) {
        int next;
        androidx.collection.qrj<String, InterfaceC0202n> qrjVar = this.f46918toq;
        if (qrjVar == null || qrjVar.isEmpty()) {
            return null;
        }
        androidx.collection.n7h<String> n7hVar = this.f46919zy;
        if (n7hVar != null) {
            String strN7h = n7hVar.n7h(i2);
            if (f46913ld6.equals(strN7h) || (strN7h != null && this.f46918toq.get(strN7h) == null)) {
                return null;
            }
        } else {
            this.f46919zy = new androidx.collection.n7h<>();
        }
        if (this.f1098n == null) {
            this.f1098n = new TypedValue();
        }
        TypedValue typedValue = this.f1098n;
        Resources resources = context.getResources();
        resources.getValue(i2, typedValue, true);
        long jM645n = m645n(typedValue);
        Drawable drawableM647s = m647s(context, jM645n);
        if (drawableM647s != null) {
            return drawableM647s;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(C6071k.f35081s)) {
            try {
                XmlResourceParser xml = resources.getXml(i2);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.f46919zy.m853k(i2, name);
                InterfaceC0202n interfaceC0202n = this.f46918toq.get(name);
                if (interfaceC0202n != null) {
                    drawableM647s = interfaceC0202n.mo651k(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                if (drawableM647s != null) {
                    drawableM647s.setChangingConfigurations(typedValue.changingConfigurations);
                    toq(context, jM645n, drawableM647s);
                }
            } catch (Exception e2) {
                Log.e(f1095y, "Exception while inflating drawable", e2);
            }
        }
        if (drawableM647s == null) {
            this.f46919zy.m853k(i2, f46913ld6);
        }
        return drawableM647s;
    }

    /* JADX INFO: renamed from: n */
    private static long m645n(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    private ColorStateList n7h(@zy.lvui Context context, @zy.fn3e int i2) {
        androidx.collection.n7h<ColorStateList> n7hVar;
        WeakHashMap<Context, androidx.collection.n7h<ColorStateList>> weakHashMap = this.f1097k;
        if (weakHashMap == null || (n7hVar = weakHashMap.get(context)) == null) {
            return null;
        }
        return n7hVar.n7h(i2);
    }

    static void ni7(Drawable drawable, yz yzVar, int[] iArr) {
        if (oc.m696k(drawable) && drawable.mutate() != drawable) {
            Log.d(f1095y, "Mutated drawable is not the same instance as the input.");
            return;
        }
        boolean z2 = yzVar.f1221q;
        if (z2 || yzVar.f46978zy) {
            drawable.setColorFilter(f7l8(z2 ? yzVar.f1220k : null, yzVar.f46978zy ? yzVar.f46977toq : f1093p, iArr));
        } else {
            drawable.clearColorFilter();
        }
    }

    /* JADX INFO: renamed from: q */
    private void m646q(@zy.lvui Context context) {
        if (this.f1096g) {
            return;
        }
        this.f1096g = true;
        Drawable drawableM650p = m650p(context, toq.C6029k.f34685k);
        if (drawableM650p == null || !cdj(drawableM650p)) {
            this.f1096g = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
    }

    /* JADX INFO: renamed from: s */
    private synchronized Drawable m647s(@zy.lvui Context context, long j2) {
        C0252s<WeakReference<Drawable.ConstantState>> c0252s = this.f1099q.get(context);
        if (c0252s == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> weakReferenceN7h = c0252s.n7h(j2);
        if (weakReferenceN7h != null) {
            Drawable.ConstantState constantState = weakReferenceN7h.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            c0252s.fu4(j2);
        }
        return null;
    }

    private synchronized boolean toq(@zy.lvui Context context, long j2, @zy.lvui Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState == null) {
            return false;
        }
        C0252s<WeakReference<Drawable.ConstantState>> c0252s = this.f1099q.get(context);
        if (c0252s == null) {
            c0252s = new C0252s<>();
            this.f1099q.put(context, c0252s);
        }
        c0252s.fn3e(j2, new WeakReference<>(constantState));
        return true;
    }

    public static synchronized PorterDuffColorFilter x2(int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilterM652i;
        zy zyVar = f46914n7h;
        porterDuffColorFilterM652i = zyVar.m652i(i2, mode);
        if (porterDuffColorFilterM652i == null) {
            porterDuffColorFilterM652i = new PorterDuffColorFilter(i2, mode);
            zyVar.fn3e(i2, mode, porterDuffColorFilterM652i);
        }
        return porterDuffColorFilterM652i;
    }

    /* JADX INFO: renamed from: y */
    public static synchronized lrht m648y() {
        if (f46915qrj == null) {
            lrht lrhtVar = new lrht();
            f46915qrj = lrhtVar;
            m643h(lrhtVar);
        }
        return f46915qrj;
    }

    private Drawable zurt(@zy.lvui Context context, @zy.fn3e int i2, boolean z2, @zy.lvui Drawable drawable) {
        ColorStateList colorStateListQrj = qrj(context, i2);
        if (colorStateListQrj == null) {
            InterfaceC0200g interfaceC0200g = this.f46917f7l8;
            if ((interfaceC0200g == null || !interfaceC0200g.mo640n(context, i2, drawable)) && !fu4(context, i2, drawable) && z2) {
                return null;
            }
            return drawable;
        }
        if (oc.m696k(drawable)) {
            drawable = drawable.mutate();
        }
        Drawable drawableKi = androidx.core.graphics.drawable.zy.ki(drawable);
        androidx.core.graphics.drawable.zy.kja0(drawableKi, colorStateListQrj);
        PorterDuff.Mode modeKja0 = kja0(i2);
        if (modeKja0 == null) {
            return drawableKi;
        }
        androidx.core.graphics.drawable.zy.m2442h(drawableKi, modeKja0);
        return drawableKi;
    }

    private void zy(@zy.lvui Context context, @zy.fn3e int i2, @zy.lvui ColorStateList colorStateList) {
        if (this.f1097k == null) {
            this.f1097k = new WeakHashMap<>();
        }
        androidx.collection.n7h<ColorStateList> n7hVar = this.f1097k.get(context);
        if (n7hVar == null) {
            n7hVar = new androidx.collection.n7h<>();
            this.f1097k.put(context, n7hVar);
        }
        n7hVar.m853k(i2, colorStateList);
    }

    public synchronized void fn3e(InterfaceC0200g interfaceC0200g) {
        this.f46917f7l8 = interfaceC0200g;
    }

    boolean fu4(@zy.lvui Context context, @zy.fn3e int i2, @zy.lvui Drawable drawable) {
        InterfaceC0200g interfaceC0200g = this.f46917f7l8;
        return interfaceC0200g != null && interfaceC0200g.zy(context, i2, drawable);
    }

    /* JADX INFO: renamed from: i */
    synchronized Drawable m649i(@zy.lvui Context context, @zy.lvui ch chVar, @zy.fn3e int i2) {
        Drawable drawableKi = ki(context, i2);
        if (drawableKi == null) {
            drawableKi = chVar.m729k(i2);
        }
        if (drawableKi == null) {
            return null;
        }
        return zurt(context, i2, false, drawableKi);
    }

    PorterDuff.Mode kja0(int i2) {
        InterfaceC0200g interfaceC0200g = this.f46917f7l8;
        if (interfaceC0200g == null) {
            return null;
        }
        return interfaceC0200g.mo641q(i2);
    }

    synchronized Drawable ld6(@zy.lvui Context context, @zy.fn3e int i2, boolean z2) {
        Drawable drawableKi;
        m646q(context);
        drawableKi = ki(context, i2);
        if (drawableKi == null) {
            drawableKi = m642g(context, i2);
        }
        if (drawableKi == null) {
            drawableKi = C0498q.m2259s(context, i2);
        }
        if (drawableKi != null) {
            drawableKi = zurt(context, i2, z2, drawableKi);
        }
        if (drawableKi != null) {
            oc.toq(drawableKi);
        }
        return drawableKi;
    }

    /* JADX INFO: renamed from: p */
    public synchronized Drawable m650p(@zy.lvui Context context, @zy.fn3e int i2) {
        return ld6(context, i2, false);
    }

    synchronized ColorStateList qrj(@zy.lvui Context context, @zy.fn3e int i2) {
        ColorStateList colorStateListN7h;
        colorStateListN7h = n7h(context, i2);
        if (colorStateListN7h == null) {
            InterfaceC0200g interfaceC0200g = this.f46917f7l8;
            colorStateListN7h = interfaceC0200g == null ? null : interfaceC0200g.toq(context, i2);
            if (colorStateListN7h != null) {
                zy(context, i2, colorStateListN7h);
            }
        }
        return colorStateListN7h;
    }

    public synchronized void t8r(@zy.lvui Context context) {
        C0252s<WeakReference<Drawable.ConstantState>> c0252s = this.f1099q.get(context);
        if (c0252s != null) {
            c0252s.m880q();
        }
    }
}
