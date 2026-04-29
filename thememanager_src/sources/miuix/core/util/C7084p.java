package miuix.core.util;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.view.View;
import gcp.C6062n;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: miuix.core.util.p */
/* JADX INFO: compiled from: MiuiBlurUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public class C7084p {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static Method f87359f7l8 = null;

    /* JADX INFO: renamed from: g */
    public static Method f39880g = null;

    /* JADX INFO: renamed from: k */
    private static boolean f39881k = true;

    /* JADX INFO: renamed from: n */
    public static Method f39882n;

    /* JADX INFO: renamed from: q */
    public static Method f39883q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static Boolean f87360toq;

    /* JADX INFO: renamed from: y */
    public static Method f39884y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static Boolean f87361zy;

    static {
        if (Build.VERSION.SDK_INT < 33 || !f39881k) {
            f87360toq = Boolean.FALSE;
        } else {
            f87360toq = Boolean.valueOf(SystemProperties.get("persist.sys.background_blur_supported", "false"));
        }
    }

    public static boolean f7l8(View view, int i2) {
        return m25599y(view, i2, false);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m25593g() {
        return f87360toq.booleanValue();
    }

    /* JADX INFO: renamed from: k */
    public static boolean m25594k(View view, int i2, int i3) {
        if (!f87360toq.booleanValue() || !m25595n(view.getContext())) {
            return false;
        }
        try {
            if (f39880g == null) {
                Class cls = Integer.TYPE;
                f39880g = View.class.getMethod("addMiBackgroundBlendColor", cls, cls);
            }
            f39880g.invoke(view, Integer.valueOf(i2), Integer.valueOf(i3));
            return true;
        } catch (Exception unused) {
            f39880g = null;
            return false;
        }
    }

    public static boolean ld6(View view, int i2) {
        if (!f87360toq.booleanValue()) {
            return false;
        }
        try {
            if (f39884y == null) {
                f39884y = View.class.getMethod("setMiViewBlurMode", Integer.TYPE);
            }
            f39884y.invoke(view, Integer.valueOf(i2));
            return true;
        } catch (Exception unused) {
            f39884y = null;
            return false;
        }
    }

    /* JADX INFO: renamed from: n */
    public static synchronized boolean m25595n(Context context) {
        if (!f87360toq.booleanValue()) {
            return false;
        }
        if (context == null) {
            return false;
        }
        if (f87361zy == null) {
            f87361zy = Boolean.valueOf(Settings.Secure.getInt(context.getContentResolver(), C6062n.f77039x2, 0) == 1);
        }
        return f87361zy.booleanValue();
    }

    /* JADX INFO: renamed from: p */
    public static boolean m25596p(View view, int i2) {
        if (!f87360toq.booleanValue()) {
            return false;
        }
        try {
            if (f39882n == null) {
                f39882n = View.class.getMethod("setMiBackgroundBlurRadius", Integer.TYPE);
            }
            f39882n.invoke(view, Integer.valueOf(i2));
            return true;
        } catch (Exception unused) {
            f39882n = null;
            return false;
        }
    }

    /* JADX INFO: renamed from: q */
    public static synchronized void m25597q() {
        f87361zy = null;
    }

    /* JADX INFO: renamed from: s */
    public static boolean m25598s(View view, int i2) {
        if (!f87360toq.booleanValue()) {
            return false;
        }
        try {
            if (f39883q == null) {
                f39883q = View.class.getMethod("setMiBackgroundBlurMode", Integer.TYPE);
            }
            f39883q.invoke(view, Integer.valueOf(i2));
            return true;
        } catch (Exception unused) {
            f39883q = null;
            return false;
        }
    }

    public static boolean toq(View view) {
        if (!f87360toq.booleanValue()) {
            return false;
        }
        try {
            if (f87359f7l8 == null) {
                f87359f7l8 = View.class.getMethod("clearMiBackgroundBlendColor", new Class[0]);
            }
            f87359f7l8.invoke(view, new Object[0]);
            return true;
        } catch (Exception unused) {
            f87359f7l8 = null;
            return false;
        }
    }

    /* JADX INFO: renamed from: y */
    public static boolean m25599y(View view, int i2, boolean z2) {
        if (!f87360toq.booleanValue() || !m25595n(view.getContext())) {
            return false;
        }
        try {
            if (f39883q == null) {
                f39883q = View.class.getMethod("setMiBackgroundBlurMode", Integer.TYPE);
            }
            if (f39882n == null) {
                f39882n = View.class.getMethod("setMiBackgroundBlurRadius", Integer.TYPE);
            }
            f39883q.invoke(view, 1);
            f39882n.invoke(view, Integer.valueOf(i2));
            return ld6(view, z2 ? 2 : 1);
        } catch (Exception unused) {
            f39883q = null;
            f39882n = null;
            return false;
        }
    }

    public static boolean zy(View view) {
        if (m25598s(view, 0)) {
            return ld6(view, 0);
        }
        return false;
    }
}
