package miuix.core.util.variable;

import android.view.View;
import android.view.Window;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: WindowWrapper.java */
/* JADX INFO: loaded from: classes3.dex */
public class toq {

    /* JADX INFO: renamed from: g */
    protected static Method f39934g = null;

    /* JADX INFO: renamed from: k */
    private static final int f39935k = 67108864;

    /* JADX INFO: renamed from: n */
    private static final int f39936n = 17;

    /* JADX INFO: renamed from: q */
    private static final int f39937q = 16;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final int f87400toq = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final int f87401zy = 1;

    static {
        try {
            Class cls = Integer.TYPE;
            f39934g = miuix.reflect.toq.m26540s(Window.class, "setExtraFlags", cls, cls);
        } catch (Exception unused) {
            f39934g = null;
        }
    }

    /* JADX INFO: renamed from: k */
    public static boolean m25676k(Window window, int i2) {
        boolean z2 = false;
        if (f39934g == null) {
            return false;
        }
        if (i2 == 0) {
            window.clearFlags(Integer.MIN_VALUE);
        } else {
            window.addFlags(Integer.MIN_VALUE);
            View decorView = window.getDecorView();
            if (i2 == 1) {
                decorView.setSystemUiVisibility(8208);
            } else {
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-8193) & (-17));
            }
        }
        if (i2 == 0) {
            window.clearFlags(f39935k);
        } else {
            window.setFlags(f39935k, f39935k);
        }
        try {
            if (i2 == 0) {
                f39934g.invoke(window, 0, 17);
            } else {
                f39934g.invoke(window, Integer.valueOf(i2 == 1 ? 17 : 1), 17);
            }
            z2 = true;
            return true;
        } catch (Exception unused) {
            return z2;
        }
    }
}
