package androidx.appcompat.widget;

import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import androidx.core.view.C0683f;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import zy.uv6;

/* JADX INFO: compiled from: ViewUtils.java */
/* JADX INFO: loaded from: classes.dex */
@zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
public class nmn5 {

    /* JADX INFO: renamed from: k */
    private static final String f1148k = "ViewUtils";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static Method f46930toq;

    static {
        try {
            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
            f46930toq = declaredMethod;
            if (declaredMethod.isAccessible()) {
                return;
            }
            f46930toq.setAccessible(true);
        } catch (NoSuchMethodException unused) {
            Log.d(f1148k, "Could not find method computeFitSystemWindows. Oh well.");
        }
    }

    private nmn5() {
    }

    /* JADX INFO: renamed from: k */
    public static void m687k(View view, Rect rect, Rect rect2) {
        Method method = f46930toq;
        if (method != null) {
            try {
                method.invoke(view, rect, rect2);
            } catch (Exception e2) {
                Log.d(f1148k, "Could not invoke computeFitSystemWindows", e2);
            }
        }
    }

    public static boolean toq(View view) {
        return C0683f.m3159e(view) == 1;
    }

    public static void zy(View view) {
        try {
            Method method = view.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(view, new Object[0]);
        } catch (IllegalAccessException e2) {
            Log.d(f1148k, "Could not invoke makeOptionalFitsSystemWindows", e2);
        } catch (NoSuchMethodException unused) {
            Log.d(f1148k, "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e3) {
            Log.d(f1148k, "Could not invoke makeOptionalFitsSystemWindows", e3);
        }
    }
}
