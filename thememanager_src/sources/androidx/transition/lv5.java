package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import androidx.transition.jk;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: ViewUtilsBase.java */
/* JADX INFO: loaded from: classes.dex */
class lv5 {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final int f53509f7l8 = 12;

    /* JADX INFO: renamed from: g */
    private static boolean f6705g = false;

    /* JADX INFO: renamed from: n */
    private static Field f6706n = null;

    /* JADX INFO: renamed from: q */
    private static boolean f6707q = false;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f53510toq = "ViewUtilsBase";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static Method f53511zy;

    /* JADX INFO: renamed from: k */
    private float[] f6708k;

    lv5() {
    }

    @SuppressLint({"PrivateApi", "SoonBlockedPrivateApi"})
    private void toq() {
        if (f6707q) {
            return;
        }
        try {
            Class cls = Integer.TYPE;
            Method declaredMethod = View.class.getDeclaredMethod("setFrame", cls, cls, cls, cls);
            f53511zy = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException e2) {
            Log.i(f53510toq, "Failed to retrieve setFrame method", e2);
        }
        f6707q = true;
    }

    public void f7l8(@zy.lvui View view, float f2) {
        Float f3 = (Float) view.getTag(jk.f7l8.f52609w831);
        if (f3 != null) {
            view.setAlpha(f3.floatValue() * f2);
        } else {
            view.setAlpha(f2);
        }
    }

    /* JADX INFO: renamed from: g */
    public void mo5377g(@zy.lvui View view, int i2, int i3, int i4, int i5) {
        toq();
        Method method = f53511zy;
        if (method != null) {
            try {
                method.invoke(view, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2.getCause());
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public void mo5378k(@zy.lvui View view) {
        if (view.getVisibility() == 0) {
            view.setTag(jk.f7l8.f52609w831, null);
        }
    }

    /* JADX INFO: renamed from: n */
    public void mo5300n(@zy.lvui View view, @zy.dd Matrix matrix) {
        if (matrix == null || matrix.isIdentity()) {
            view.setPivotX(view.getWidth() / 2);
            view.setPivotY(view.getHeight() / 2);
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            view.setRotation(0.0f);
            return;
        }
        float[] fArr = this.f6708k;
        if (fArr == null) {
            fArr = new float[9];
            this.f6708k = fArr;
        }
        matrix.getValues(fArr);
        float f2 = fArr[3];
        float fSqrt = ((float) Math.sqrt(1.0f - (f2 * f2))) * (fArr[0] < 0.0f ? -1 : 1);
        float degrees = (float) Math.toDegrees(Math.atan2(f2, fSqrt));
        float f3 = fArr[0] / fSqrt;
        float f4 = fArr[4] / fSqrt;
        float f5 = fArr[2];
        float f6 = fArr[5];
        view.setPivotX(0.0f);
        view.setPivotY(0.0f);
        view.setTranslationX(f5);
        view.setTranslationY(f6);
        view.setRotation(degrees);
        view.setScaleX(f3);
        view.setScaleY(f4);
    }

    /* JADX INFO: renamed from: p */
    public void mo5301p(@zy.lvui View view, @zy.lvui Matrix matrix) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            mo5301p((View) parent, matrix);
            matrix.postTranslate(r0.getScrollX(), r0.getScrollY());
        }
        matrix.postTranslate(-view.getLeft(), -view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (matrix2.isIdentity()) {
            return;
        }
        Matrix matrix3 = new Matrix();
        if (matrix2.invert(matrix3)) {
            matrix.postConcat(matrix3);
        }
    }

    /* JADX INFO: renamed from: q */
    public void mo5379q(@zy.lvui View view) {
        int i2 = jk.f7l8.f52609w831;
        if (view.getTag(i2) == null) {
            view.setTag(i2, Float.valueOf(view.getAlpha()));
        }
    }

    /* JADX INFO: renamed from: s */
    public void mo5302s(@zy.lvui View view, @zy.lvui Matrix matrix) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            mo5302s((View) parent, matrix);
            matrix.preTranslate(-r0.getScrollX(), -r0.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (matrix2.isIdentity()) {
            return;
        }
        matrix.preConcat(matrix2);
    }

    /* JADX INFO: renamed from: y */
    public void mo5308y(@zy.lvui View view, int i2) {
        if (!f6705g) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f6706n = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i(f53510toq, "fetchViewFlagsField: ");
            }
            f6705g = true;
        }
        Field field = f6706n;
        if (field != null) {
            try {
                f6706n.setInt(view, i2 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public float zy(@zy.lvui View view) {
        Float f2 = (Float) view.getTag(jk.f7l8.f52609w831);
        return f2 != null ? view.getAlpha() / f2.floatValue() : view.getAlpha();
    }
}
