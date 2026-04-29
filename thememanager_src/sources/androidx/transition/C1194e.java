package androidx.transition;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: androidx.transition.e */
/* JADX INFO: compiled from: ViewGroupUtils.java */
/* JADX INFO: loaded from: classes.dex */
class C1194e {

    /* JADX INFO: renamed from: k */
    private static boolean f6400k = true;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static Method f52486toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static boolean f52487zy;

    private C1194e() {
    }

    /* JADX INFO: renamed from: k */
    static int m5323k(@zy.lvui ViewGroup viewGroup, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            return viewGroup.getChildDrawingOrder(i2);
        }
        if (!f52487zy) {
            try {
                Class cls = Integer.TYPE;
                Method declaredMethod = ViewGroup.class.getDeclaredMethod("getChildDrawingOrder", cls, cls);
                f52486toq = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f52487zy = true;
        }
        Method method = f52486toq;
        if (method != null) {
            try {
                return ((Integer) method.invoke(viewGroup, Integer.valueOf(viewGroup.getChildCount()), Integer.valueOf(i2))).intValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: q */
    static void m5324q(@zy.lvui ViewGroup viewGroup, boolean z2) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z2);
        } else {
            zy(viewGroup, z2);
        }
    }

    static lrht toq(@zy.lvui ViewGroup viewGroup) {
        return new C1185c(viewGroup);
    }

    @zy.hyr(18)
    @SuppressLint({"NewApi"})
    private static void zy(@zy.lvui ViewGroup viewGroup, boolean z2) {
        if (f6400k) {
            try {
                viewGroup.suppressLayout(z2);
            } catch (NoSuchMethodError unused) {
                f6400k = false;
            }
        }
    }
}
