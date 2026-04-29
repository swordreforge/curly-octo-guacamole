package androidx.transition;

import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.util.Log;
import android.view.ViewGroup;
import androidx.transition.jk;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: ViewGroupUtilsApi14.java */
/* JADX INFO: loaded from: classes.dex */
class nn86 {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static boolean f53524f7l8 = false;

    /* JADX INFO: renamed from: g */
    private static Method f6729g = null;

    /* JADX INFO: renamed from: k */
    private static final String f6730k = "ViewGroupUtilsApi14";

    /* JADX INFO: renamed from: n */
    private static boolean f6731n = false;

    /* JADX INFO: renamed from: q */
    private static Field f6732q = null;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final int f53525toq = 4;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static LayoutTransition f53526zy;

    /* JADX INFO: renamed from: androidx.transition.nn86$k */
    /* JADX INFO: compiled from: ViewGroupUtilsApi14.java */
    class C1235k extends LayoutTransition {
        C1235k() {
        }

        @Override // android.animation.LayoutTransition
        public boolean isChangingLayout() {
            return true;
        }
    }

    private nn86() {
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    /* JADX INFO: renamed from: k */
    private static void m5402k(LayoutTransition layoutTransition) {
        if (!f53524f7l8) {
            try {
                Method declaredMethod = LayoutTransition.class.getDeclaredMethod("cancel", new Class[0]);
                f6729g = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
                Log.i(f6730k, "Failed to access cancel method by reflection");
            }
            f53524f7l8 = true;
        }
        Method method = f6729g;
        if (method != null) {
            try {
                method.invoke(layoutTransition, new Object[0]);
            } catch (IllegalAccessException unused2) {
                Log.i(f6730k, "Failed to access cancel method by reflection");
            } catch (InvocationTargetException unused3) {
                Log.i(f6730k, "Failed to invoke cancel method by reflection");
            }
        }
    }

    static void toq(@zy.lvui ViewGroup viewGroup, boolean z2) {
        boolean z3 = false;
        if (f53526zy == null) {
            C1235k c1235k = new C1235k();
            f53526zy = c1235k;
            c1235k.setAnimator(2, null);
            f53526zy.setAnimator(0, null);
            f53526zy.setAnimator(1, null);
            f53526zy.setAnimator(3, null);
            f53526zy.setAnimator(4, null);
        }
        if (z2) {
            LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition != null) {
                if (layoutTransition.isRunning()) {
                    m5402k(layoutTransition);
                }
                if (layoutTransition != f53526zy) {
                    viewGroup.setTag(jk.f7l8.f52568m58i, layoutTransition);
                }
            }
            viewGroup.setLayoutTransition(f53526zy);
            return;
        }
        viewGroup.setLayoutTransition(null);
        if (!f6731n) {
            try {
                Field declaredField = ViewGroup.class.getDeclaredField("mLayoutSuppressed");
                f6732q = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i(f6730k, "Failed to access mLayoutSuppressed field by reflection");
            }
            f6731n = true;
        }
        Field field = f6732q;
        if (field != null) {
            try {
                boolean z5 = field.getBoolean(viewGroup);
                if (z5) {
                    try {
                        f6732q.setBoolean(viewGroup, false);
                    } catch (IllegalAccessException unused2) {
                        z3 = z5;
                        Log.i(f6730k, "Failed to get mLayoutSuppressed field by reflection");
                    }
                }
                z3 = z5;
            } catch (IllegalAccessException unused3) {
            }
        }
        if (z3) {
            viewGroup.requestLayout();
        }
        int i2 = jk.f7l8.f52568m58i;
        LayoutTransition layoutTransition2 = (LayoutTransition) viewGroup.getTag(i2);
        if (layoutTransition2 != null) {
            viewGroup.setTag(i2, null);
            viewGroup.setLayoutTransition(layoutTransition2);
        }
    }
}
