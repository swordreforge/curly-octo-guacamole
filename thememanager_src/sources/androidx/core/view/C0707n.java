package androidx.core.view;

import android.annotation.SuppressLint;
import android.app.UiModeManager;
import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.text.TextUtils;
import android.view.Display;
import com.miui.maml.folme.AnimatedProperty;
import zy.InterfaceC7830i;

/* JADX INFO: renamed from: androidx.core.view.n */
/* JADX INFO: compiled from: DisplayCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0707n {

    /* JADX INFO: renamed from: k */
    private static final int f4065k = 3840;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final int f50842toq = 2160;

    /* JADX INFO: renamed from: androidx.core.view.n$k */
    /* JADX INFO: compiled from: DisplayCompat.java */
    @zy.hyr(17)
    static class k {
        private k() {
        }

        /* JADX INFO: renamed from: k */
        static void m3378k(Display display, Point point) {
            display.getRealSize(point);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.n$toq */
    /* JADX INFO: compiled from: DisplayCompat.java */
    @zy.hyr(23)
    static class toq {
        private toq() {
        }

        @zy.lvui
        /* JADX INFO: renamed from: k */
        static zy m3379k(@zy.lvui Context context, @zy.lvui Display display) {
            Display.Mode mode = display.getMode();
            Point pointM3372k = C0707n.m3372k(context, display);
            return (pointM3372k == null || m3381q(mode, pointM3372k)) ? new zy(mode, true) : new zy(mode, pointM3372k);
        }

        /* JADX INFO: renamed from: n */
        static boolean m3380n(Display.Mode mode, Display.Mode mode2) {
            return mode.getPhysicalWidth() == mode2.getPhysicalWidth() && mode.getPhysicalHeight() == mode2.getPhysicalHeight();
        }

        /* JADX INFO: renamed from: q */
        static boolean m3381q(Display.Mode mode, Point point) {
            return (mode.getPhysicalWidth() == point.x && mode.getPhysicalHeight() == point.y) || (mode.getPhysicalWidth() == point.y && mode.getPhysicalHeight() == point.x);
        }

        @zy.lvui
        @SuppressLint({"ArrayReturn"})
        public static zy[] toq(@zy.lvui Context context, @zy.lvui Display display) {
            Display.Mode[] supportedModes = display.getSupportedModes();
            zy[] zyVarArr = new zy[supportedModes.length];
            Display.Mode mode = display.getMode();
            Point pointM3372k = C0707n.m3372k(context, display);
            if (pointM3372k == null || m3381q(mode, pointM3372k)) {
                for (int i2 = 0; i2 < supportedModes.length; i2++) {
                    zyVarArr[i2] = new zy(supportedModes[i2], m3380n(supportedModes[i2], mode));
                }
            } else {
                for (int i3 = 0; i3 < supportedModes.length; i3++) {
                    zyVarArr[i3] = m3380n(supportedModes[i3], mode) ? new zy(supportedModes[i3], pointM3372k) : new zy(supportedModes[i3], false);
                }
            }
            return zyVarArr;
        }

        static boolean zy(@zy.lvui Display display) {
            Display.Mode mode = display.getMode();
            for (Display.Mode mode2 : display.getSupportedModes()) {
                if (mode.getPhysicalHeight() < mode2.getPhysicalHeight() || mode.getPhysicalWidth() < mode2.getPhysicalWidth()) {
                    return false;
                }
            }
            return true;
        }
    }

    private C0707n() {
    }

    private static boolean f7l8(@zy.lvui Context context) {
        return m3377y(context) && "Sony".equals(Build.MANUFACTURER) && Build.MODEL.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd");
    }

    /* JADX INFO: renamed from: g */
    static boolean m3371g(@zy.lvui Display display) {
        return toq.zy(display);
    }

    /* JADX INFO: renamed from: k */
    static Point m3372k(@zy.lvui Context context, @zy.lvui Display display) {
        Point pointM3374p = Build.VERSION.SDK_INT < 28 ? m3374p("sys.display-size", display) : m3374p("vendor.display-size", display);
        if (pointM3374p != null) {
            return pointM3374p;
        }
        if (f7l8(context) && m3371g(display)) {
            return new Point(f4065k, f50842toq);
        }
        return null;
    }

    @zy.dd
    /* JADX INFO: renamed from: n */
    private static String m3373n(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception unused) {
            return null;
        }
    }

    @zy.dd
    /* JADX INFO: renamed from: p */
    private static Point m3374p(@zy.lvui String str, @zy.lvui Display display) {
        if (display.getDisplayId() != 0) {
            return null;
        }
        String strM3373n = m3373n(str);
        if (!TextUtils.isEmpty(strM3373n) && strM3373n != null) {
            try {
                return m3376s(strM3373n);
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    @zy.lvui
    @SuppressLint({"ArrayReturn"})
    /* JADX INFO: renamed from: q */
    public static zy[] m3375q(@zy.lvui Context context, @zy.lvui Display display) {
        return toq.toq(context, display);
    }

    /* JADX INFO: renamed from: s */
    private static Point m3376s(@zy.lvui String str) throws NumberFormatException {
        String[] strArrSplit = str.trim().split(AnimatedProperty.PROPERTY_NAME_X, -1);
        if (strArrSplit.length == 2) {
            int i2 = Integer.parseInt(strArrSplit[0]);
            int i3 = Integer.parseInt(strArrSplit[1]);
            if (i2 > 0 && i3 > 0) {
                return new Point(i2, i3);
            }
        }
        throw new NumberFormatException();
    }

    @zy.lvui
    private static Point toq(@zy.lvui Context context, @zy.lvui Display display) {
        Point pointM3372k = m3372k(context, display);
        if (pointM3372k != null) {
            return pointM3372k;
        }
        Point point = new Point();
        k.m3378k(display, point);
        return point;
    }

    /* JADX INFO: renamed from: y */
    private static boolean m3377y(@zy.lvui Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    @zy.lvui
    public static zy zy(@zy.lvui Context context, @zy.lvui Display display) {
        return toq.m3379k(context, display);
    }

    /* JADX INFO: renamed from: androidx.core.view.n$zy */
    /* JADX INFO: compiled from: DisplayCompat.java */
    public static final class zy {

        /* JADX INFO: renamed from: k */
        private final Display.Mode f4066k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final Point f50843toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final boolean f50844zy;

        /* JADX INFO: renamed from: androidx.core.view.n$zy$k */
        /* JADX INFO: compiled from: DisplayCompat.java */
        @zy.hyr(23)
        static class k {
            private k() {
            }

            @InterfaceC7830i
            /* JADX INFO: renamed from: k */
            static int m3384k(Display.Mode mode) {
                return mode.getPhysicalHeight();
            }

            @InterfaceC7830i
            static int toq(Display.Mode mode) {
                return mode.getPhysicalWidth();
            }
        }

        zy(@zy.lvui Point point) {
            androidx.core.util.n7h.qrj(point, "physicalSize == null");
            this.f50843toq = point;
            this.f4066k = null;
            this.f50844zy = true;
        }

        /* JADX INFO: renamed from: k */
        public int m3382k() {
            return this.f50843toq.y;
        }

        @zy.hyr(23)
        @zy.dd
        /* JADX INFO: renamed from: q */
        public Display.Mode m3383q() {
            return this.f4066k;
        }

        public int toq() {
            return this.f50843toq.x;
        }

        @Deprecated
        public boolean zy() {
            return this.f50844zy;
        }

        @zy.hyr(23)
        zy(@zy.lvui Display.Mode mode, boolean z2) {
            androidx.core.util.n7h.qrj(mode, "mode == null, can't wrap a null reference");
            this.f50843toq = new Point(k.toq(mode), k.m3384k(mode));
            this.f4066k = mode;
            this.f50844zy = z2;
        }

        @zy.hyr(23)
        zy(@zy.lvui Display.Mode mode, @zy.lvui Point point) {
            androidx.core.util.n7h.qrj(mode, "mode == null, can't wrap a null reference");
            androidx.core.util.n7h.qrj(point, "physicalSize == null");
            this.f50843toq = point;
            this.f4066k = mode;
            this.f50844zy = true;
        }
    }
}
