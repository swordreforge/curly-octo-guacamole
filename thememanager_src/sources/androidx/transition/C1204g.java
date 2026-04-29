package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: androidx.transition.g */
/* JADX INFO: compiled from: CanvasUtils.java */
/* JADX INFO: loaded from: classes.dex */
class C1204g {

    /* JADX INFO: renamed from: k */
    private static Method f6430k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static Method f52495toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static boolean f52496zy;

    private C1204g() {
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    /* JADX INFO: renamed from: k */
    static void m5346k(@zy.lvui Canvas canvas, boolean z2) {
        Method method;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            if (z2) {
                canvas.enableZ();
                return;
            } else {
                canvas.disableZ();
                return;
            }
        }
        if (i2 == 28) {
            throw new IllegalStateException("This method doesn't work on Pie!");
        }
        if (!f52496zy) {
            try {
                Method declaredMethod = Canvas.class.getDeclaredMethod("insertReorderBarrier", new Class[0]);
                f6430k = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = Canvas.class.getDeclaredMethod("insertInorderBarrier", new Class[0]);
                f52495toq = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f52496zy = true;
        }
        if (z2) {
            try {
                Method method2 = f6430k;
                if (method2 != null) {
                    method2.invoke(canvas, new Object[0]);
                }
            } catch (IllegalAccessException unused2) {
                return;
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2.getCause());
            }
        }
        if (z2 || (method = f52495toq) == null) {
            return;
        }
        method.invoke(canvas, new Object[0]);
    }
}
