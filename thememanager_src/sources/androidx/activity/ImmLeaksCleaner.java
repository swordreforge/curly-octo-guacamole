package androidx.activity;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.InterfaceC0954z;
import androidx.lifecycle.fn3e;
import androidx.lifecycle.kja0;
import java.lang.reflect.Field;
import zy.hyr;
import zy.lvui;
import zy.oc;

/* JADX INFO: loaded from: classes.dex */
@hyr(19)
final class ImmLeaksCleaner implements fn3e {

    /* JADX INFO: renamed from: g */
    private static final int f18g = 2;

    /* JADX INFO: renamed from: h */
    private static Field f19h = null;

    /* JADX INFO: renamed from: n */
    private static final int f20n = 1;

    /* JADX INFO: renamed from: p */
    private static Field f21p;

    /* JADX INFO: renamed from: q */
    private static final int f22q = 0;

    /* JADX INFO: renamed from: s */
    private static Field f23s;

    /* JADX INFO: renamed from: y */
    private static int f24y;

    /* JADX INFO: renamed from: k */
    private Activity f25k;

    ImmLeaksCleaner(Activity activity) {
        this.f25k = activity;
    }

    @oc
    /* JADX INFO: renamed from: k */
    private static void m11k() {
        try {
            f24y = 2;
            Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
            f21p = declaredField;
            declaredField.setAccessible(true);
            Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
            f19h = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
            f23s = declaredField3;
            declaredField3.setAccessible(true);
            f24y = 1;
        } catch (NoSuchFieldException unused) {
        }
    }

    @Override // androidx.lifecycle.fn3e
    public void gvn7(@lvui InterfaceC0954z interfaceC0954z, @lvui kja0.toq toqVar) {
        if (toqVar != kja0.toq.ON_DESTROY) {
            return;
        }
        if (f24y == 0) {
            m11k();
        }
        if (f24y == 1) {
            InputMethodManager inputMethodManager = (InputMethodManager) this.f25k.getSystemService("input_method");
            try {
                Object obj = f23s.get(inputMethodManager);
                if (obj == null) {
                    return;
                }
                synchronized (obj) {
                    try {
                        try {
                            View view = (View) f21p.get(inputMethodManager);
                            if (view == null) {
                                return;
                            }
                            if (view.isAttachedToWindow()) {
                                return;
                            }
                            try {
                                f19h.set(inputMethodManager, null);
                                inputMethodManager.isActive();
                            } catch (IllegalAccessException unused) {
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    } catch (ClassCastException unused2) {
                    } catch (IllegalAccessException unused3) {
                    }
                }
            } catch (IllegalAccessException unused4) {
            }
        }
    }
}
