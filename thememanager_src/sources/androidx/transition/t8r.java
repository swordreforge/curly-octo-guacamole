package androidx.transition;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: GhostViewPlatform.java */
/* JADX INFO: loaded from: classes.dex */
@zy.hyr(21)
class t8r implements cdj {

    /* JADX INFO: renamed from: g */
    private static boolean f6781g = false;

    /* JADX INFO: renamed from: h */
    private static boolean f6782h = false;

    /* JADX INFO: renamed from: n */
    private static Class<?> f6783n = null;

    /* JADX INFO: renamed from: p */
    private static Method f6784p = null;

    /* JADX INFO: renamed from: q */
    private static final String f6785q = "GhostViewApi21";

    /* JADX INFO: renamed from: s */
    private static boolean f6786s;

    /* JADX INFO: renamed from: y */
    private static Method f6787y;

    /* JADX INFO: renamed from: k */
    private final View f6788k;

    private t8r(@zy.lvui View view) {
        this.f6788k = view;
    }

    /* JADX INFO: renamed from: g */
    static void m5423g(View view) {
        m5424n();
        Method method = f6784p;
        if (method != null) {
            try {
                method.invoke(null, view);
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2.getCause());
            }
        }
    }

    /* JADX INFO: renamed from: n */
    private static void m5424n() {
        if (f6782h) {
            return;
        }
        try {
            m5425q();
            Method declaredMethod = f6783n.getDeclaredMethod("removeGhost", View.class);
            f6784p = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException e2) {
            Log.i(f6785q, "Failed to retrieve removeGhost method", e2);
        }
        f6782h = true;
    }

    /* JADX INFO: renamed from: q */
    private static void m5425q() {
        if (f6781g) {
            return;
        }
        try {
            f6783n = Class.forName("android.view.GhostView");
        } catch (ClassNotFoundException e2) {
            Log.i(f6785q, "Failed to retrieve GhostView class", e2);
        }
        f6781g = true;
    }

    static cdj toq(View view, ViewGroup viewGroup, Matrix matrix) {
        zy();
        Method method = f6787y;
        if (method != null) {
            try {
                return new t8r((View) method.invoke(null, view, viewGroup, matrix));
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2.getCause());
            }
        }
        return null;
    }

    private static void zy() {
        if (f6786s) {
            return;
        }
        try {
            m5425q();
            Method declaredMethod = f6783n.getDeclaredMethod("addGhost", View.class, ViewGroup.class, Matrix.class);
            f6787y = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException e2) {
            Log.i(f6785q, "Failed to retrieve addGhost method", e2);
        }
        f6786s = true;
    }

    @Override // androidx.transition.cdj
    /* JADX INFO: renamed from: k */
    public void mo5307k(ViewGroup viewGroup, View view) {
    }

    @Override // androidx.transition.cdj
    public void setVisibility(int i2) {
        this.f6788k.setVisibility(i2);
    }
}
