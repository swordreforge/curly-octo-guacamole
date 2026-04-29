package androidx.window.layout;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import com.android.thememanager.clockmessage.model.C1873k;
import com.market.sdk.reflect.C4991s;
import com.miui.maml.folme.AnimatedProperty;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7396q;
import v5yj.C7704k;
import zy.hyr;
import zy.yz;

/* JADX INFO: compiled from: WindowMetricsCalculatorCompat.kt */
/* JADX INFO: loaded from: classes.dex */
@d3(bv = {}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\fH\u0003J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0016\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0017\u0010\u0014J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\fH\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001c¨\u0006 "}, d2 = {"Landroidx/window/layout/wvg;", "Landroidx/window/layout/o1t;", "Landroid/app/Activity;", C1873k.f10652g, "Landroid/graphics/Rect;", "bounds", "Lkotlin/was;", "x2", "Landroid/content/Context;", "context", "", "p", "Landroid/view/Display;", "display", "Landroid/view/DisplayCutout;", C7704k.y.toq.f44691k, "Landroidx/window/layout/z;", "zy", "q", AnimatedProperty.PROPERTY_NAME_Y, "(Landroid/app/Activity;)Landroid/graphics/Rect;", "f7l8", C7704k.y.toq.f95579toq, "n", "Landroid/graphics/Point;", "ld6", "(Landroid/view/Display;)Landroid/graphics/Point;", "", "Ljava/lang/String;", "TAG", C4991s.f28129n, "()V", "window_release"}, m22787k = 1, mv = {1, 6, 0})
public final class wvg implements o1t {

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    public static final wvg f53759toq = new wvg();

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7396q
    private static final String f53760zy;

    static {
        String simpleName = wvg.class.getSimpleName();
        d2ok.kja0(simpleName, "WindowMetricsCalculatorC…at::class.java.simpleName");
        f53760zy = simpleName;
    }

    private wvg() {
    }

    /* JADX INFO: renamed from: p */
    private final int m5731p(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    @hyr(28)
    @SuppressLint({"BanUncheckedReflection"})
    /* JADX INFO: renamed from: s */
    private final DisplayCutout m5732s(Display display) {
        try {
            Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(new Class[0]);
            constructor.setAccessible(true);
            Object objNewInstance = constructor.newInstance(new Object[0]);
            Method declaredMethod = display.getClass().getDeclaredMethod("getDisplayInfo", objNewInstance.getClass());
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(display, objNewInstance);
            Field declaredField = objNewInstance.getClass().getDeclaredField("displayCutout");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(objNewInstance);
            if (obj instanceof DisplayCutout) {
                return (DisplayCutout) obj;
            }
        } catch (ClassNotFoundException e2) {
            Log.w(f53760zy, e2);
        } catch (IllegalAccessException e3) {
            Log.w(f53760zy, e3);
        } catch (InstantiationException e4) {
            Log.w(f53760zy, e4);
        } catch (NoSuchFieldException e6) {
            Log.w(f53760zy, e6);
        } catch (NoSuchMethodException e7) {
            Log.w(f53760zy, e7);
        } catch (InvocationTargetException e8) {
            Log.w(f53760zy, e8);
        }
        return null;
    }

    private final void x2(Activity activity, Rect rect) {
        activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
    }

    @InterfaceC7396q
    @hyr(28)
    @SuppressLint({"BanUncheckedReflection", "BlockedPrivateApi"})
    public final Rect f7l8(@InterfaceC7396q Activity activity) {
        DisplayCutout displayCutoutM5732s;
        d2ok.m23075h(activity, "activity");
        Rect rect = new Rect();
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            if (C1333k.f7161k.m5696k(activity)) {
                Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", new Class[0]).invoke(obj, new Object[0]);
                if (objInvoke == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.graphics.Rect");
                }
                rect.set((Rect) objInvoke);
            } else {
                Object objInvoke2 = obj.getClass().getDeclaredMethod("getAppBounds", new Class[0]).invoke(obj, new Object[0]);
                if (objInvoke2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.graphics.Rect");
                }
                rect.set((Rect) objInvoke2);
            }
        } catch (IllegalAccessException e2) {
            Log.w(f53760zy, e2);
            x2(activity, rect);
        } catch (NoSuchFieldException e3) {
            Log.w(f53760zy, e3);
            x2(activity, rect);
        } catch (NoSuchMethodException e4) {
            Log.w(f53760zy, e4);
            x2(activity, rect);
        } catch (InvocationTargetException e6) {
            Log.w(f53760zy, e6);
            x2(activity, rect);
        }
        Display currentDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        C1337n c1337n = C1337n.f7164k;
        d2ok.kja0(currentDisplay, "currentDisplay");
        c1337n.m5705k(currentDisplay, point);
        C1333k c1333k = C1333k.f7161k;
        if (!c1333k.m5696k(activity)) {
            int iM5731p = m5731p(activity);
            int i2 = rect.bottom;
            if (i2 + iM5731p == point.y) {
                rect.bottom = i2 + iM5731p;
            } else {
                int i3 = rect.right;
                if (i3 + iM5731p == point.x) {
                    rect.right = i3 + iM5731p;
                } else if (rect.left == iM5731p) {
                    rect.left = 0;
                }
            }
        }
        if ((rect.width() < point.x || rect.height() < point.y) && !c1333k.m5696k(activity) && (displayCutoutM5732s = m5732s(currentDisplay)) != null) {
            int i4 = rect.left;
            C1330g c1330g = C1330g.f7153k;
            if (i4 == c1330g.toq(displayCutoutM5732s)) {
                rect.left = 0;
            }
            if (point.x - rect.right == c1330g.zy(displayCutoutM5732s)) {
                rect.right += c1330g.zy(displayCutoutM5732s);
            }
            if (rect.top == c1330g.m5681q(displayCutoutM5732s)) {
                rect.top = 0;
            }
            if (point.y - rect.bottom == c1330g.m5680k(displayCutoutM5732s)) {
                rect.bottom += c1330g.m5680k(displayCutoutM5732s);
            }
        }
        return rect;
    }

    @InterfaceC7396q
    @hyr(24)
    /* JADX INFO: renamed from: g */
    public final Rect m5733g(@InterfaceC7396q Activity activity) {
        d2ok.m23075h(activity, "activity");
        Rect rect = new Rect();
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        defaultDisplay.getRectSize(rect);
        if (!C1333k.f7161k.m5696k(activity)) {
            d2ok.kja0(defaultDisplay, "defaultDisplay");
            Point pointLd6 = ld6(defaultDisplay);
            int iM5731p = m5731p(activity);
            int i2 = rect.bottom;
            if (i2 + iM5731p == pointLd6.y) {
                rect.bottom = i2 + iM5731p;
            } else {
                int i3 = rect.right;
                if (i3 + iM5731p == pointLd6.x) {
                    rect.right = i3 + iM5731p;
                }
            }
        }
        return rect;
    }

    @InterfaceC7396q
    @hyr(14)
    @yz
    public final Point ld6(@InterfaceC7396q Display display) {
        d2ok.m23075h(display, "display");
        Point point = new Point();
        C1337n.f7164k.m5705k(display, point);
        return point;
    }

    @InterfaceC7396q
    @hyr(14)
    /* JADX INFO: renamed from: n */
    public final Rect m5734n(@InterfaceC7396q Activity activity) {
        int i2;
        d2ok.m23075h(activity, "activity");
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        d2ok.kja0(defaultDisplay, "defaultDisplay");
        Point pointLd6 = ld6(defaultDisplay);
        Rect rect = new Rect();
        int i3 = pointLd6.x;
        if (i3 == 0 || (i2 = pointLd6.y) == 0) {
            defaultDisplay.getRectSize(rect);
        } else {
            rect.right = i3;
            rect.bottom = i2;
        }
        return rect;
    }

    @Override // androidx.window.layout.o1t
    @InterfaceC7396q
    /* JADX INFO: renamed from: q */
    public C1353z mo5716q(@InterfaceC7396q Activity activity) {
        Rect rect;
        d2ok.m23075h(activity, "activity");
        if (Build.VERSION.SDK_INT >= 30) {
            rect = C1343q.f7172k.toq(activity);
        } else {
            Display display = activity.getWindowManager().getDefaultDisplay();
            d2ok.kja0(display, "display");
            Point pointLd6 = ld6(display);
            rect = new Rect(0, 0, pointLd6.x, pointLd6.y);
        }
        return new C1353z(rect);
    }

    @InterfaceC7396q
    @hyr(29)
    @SuppressLint({"BanUncheckedReflection", "BlockedPrivateApi"})
    /* JADX INFO: renamed from: y */
    public final Rect m5735y(@InterfaceC7396q Activity activity) {
        d2ok.m23075h(activity, "activity");
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", new Class[0]).invoke(obj, new Object[0]);
            if (objInvoke != null) {
                return new Rect((Rect) objInvoke);
            }
            throw new NullPointerException("null cannot be cast to non-null type android.graphics.Rect");
        } catch (IllegalAccessException e2) {
            Log.w(f53760zy, e2);
            return f7l8(activity);
        } catch (NoSuchFieldException e3) {
            Log.w(f53760zy, e3);
            return f7l8(activity);
        } catch (NoSuchMethodException e4) {
            Log.w(f53760zy, e4);
            return f7l8(activity);
        } catch (InvocationTargetException e6) {
            Log.w(f53760zy, e6);
            return f7l8(activity);
        }
    }

    @Override // androidx.window.layout.o1t
    @InterfaceC7396q
    public C1353z zy(@InterfaceC7396q Activity activity) {
        d2ok.m23075h(activity, "activity");
        int i2 = Build.VERSION.SDK_INT;
        return new C1353z(i2 >= 30 ? C1343q.f7172k.m5720k(activity) : i2 >= 29 ? m5735y(activity) : i2 >= 28 ? f7l8(activity) : m5733g(activity));
    }
}
