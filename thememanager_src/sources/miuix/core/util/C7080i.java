package miuix.core.util;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.view.WindowMetrics;
import zy.hyr;

/* JADX INFO: renamed from: miuix.core.util.i */
/* JADX INFO: compiled from: WindowUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public class C7080i {

    /* JADX INFO: renamed from: k */
    private static final String f39862k = "WindowUtils";

    public static void cdj(Configuration configuration, Point point) {
        float f2 = configuration.densityDpi / 160.0f;
        point.x = ld6.zy(f2, configuration.screenWidthDp);
        point.y = ld6.zy(f2, configuration.screenHeightDp);
    }

    public static void f7l8(Context context, Point point) {
        m25559y(x2(context), context, point);
    }

    public static void fn3e(Context context, Point point) {
        Configuration configuration = context.getResources().getConfiguration();
        point.x = configuration.screenWidthDp;
        point.y = configuration.screenHeightDp;
    }

    public static boolean fu4(Configuration configuration, Point point, Point point2) {
        return configuration.toString().contains("mWindowingMode=freeform") && ((((float) point2.x) + 0.0f) / ((float) point.x) <= 0.9f || (((float) point2.y) + 0.0f) / ((float) point.y) <= 0.9f);
    }

    /* JADX INFO: renamed from: g */
    public static Point m25551g(Context context) {
        Point point = new Point();
        f7l8(context, point);
        return point;
    }

    /* JADX INFO: renamed from: h */
    public static void m25552h(Configuration configuration, int i2, Point point) {
        int i3 = configuration.densityDpi;
        float f2 = (i3 / 160.0f) * ((i2 * 1.0f) / i3);
        point.x = ld6.zy(f2, configuration.screenWidthDp);
        point.y = ld6.zy(f2, configuration.screenHeightDp);
    }

    /* JADX INFO: renamed from: i */
    public static Point m25553i(View view) {
        float f2 = view.getContext().getResources().getDisplayMetrics().density;
        Point pointN7h = n7h(view);
        pointN7h.x = (int) (pointN7h.x / f2);
        pointN7h.y = (int) (pointN7h.y / f2);
        return pointN7h;
    }

    @hyr(30)
    /* JADX INFO: renamed from: k */
    public static WindowMetrics m25554k(Context context) {
        return x2(context).getCurrentWindowMetrics();
    }

    public static void ki(WindowManager windowManager, Context context, Point point) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
            point.x = bounds.width();
            point.y = bounds.height();
        } else {
            if (i2 != 30) {
                if (ld6.kja0(context)) {
                    toq(context).getSize(point);
                    return;
                } else {
                    toq(context).getRealSize(point);
                    return;
                }
            }
            while ((context instanceof ContextWrapper) && !(context instanceof Activity)) {
                context = ((ContextWrapper) context).getBaseContext();
            }
            Rect bounds2 = context instanceof Activity ? windowManager.getCurrentWindowMetrics().getBounds() : windowManager.getMaximumWindowMetrics().getBounds();
            point.x = bounds2.width();
            point.y = bounds2.height();
        }
    }

    public static void kja0(Context context, Point point) {
        ki(x2(context), context, point);
    }

    @Deprecated
    public static int ld6(Context context) {
        return qrj(context).y;
    }

    /* JADX INFO: renamed from: n */
    public static void m25555n(Context context, Point point, Point point2) {
        float f2 = context.getResources().getDisplayMetrics().density;
        zy(context, point, point2);
        point.x = (int) (point.x / f2);
        point.y = (int) (point.y / f2);
        point2.x = (int) (point2.x / f2);
        point2.y = (int) (point2.y / f2);
    }

    public static Point n7h(View view) {
        Point point = new Point();
        Context context = view.getContext();
        if (Build.VERSION.SDK_INT >= 30) {
            WindowMetrics currentWindowMetrics = ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics();
            point.x = currentWindowMetrics.getBounds().width();
            point.y = currentWindowMetrics.getBounds().height();
        } else {
            View rootView = view.getRootView();
            point.x = rootView.getMeasuredWidth();
            point.y = rootView.getMeasuredHeight();
        }
        return point;
    }

    @hyr(30)
    public static Rect ni7(Context context) {
        return m25554k(context).getBounds();
    }

    /* JADX INFO: renamed from: p */
    public static void m25556p(Context context, Point point) {
        cdj(context.getResources().getConfiguration(), point);
    }

    /* JADX INFO: renamed from: q */
    public static void m25557q(WindowManager windowManager, Context context, Point point, Point point2) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            Rect bounds = windowManager.getMaximumWindowMetrics().getBounds();
            point.x = bounds.width();
            point.y = bounds.height();
            Rect bounds2 = windowManager.getCurrentWindowMetrics().getBounds();
            point2.x = bounds2.width();
            point2.y = bounds2.height();
            return;
        }
        if (i2 != 30) {
            if (ld6.kja0(context)) {
                toq(context).getRealSize(point);
                toq(context).getSize(point2);
                return;
            } else {
                toq(context).getRealSize(point);
                point2.x = point.x;
                point2.y = point.y;
                return;
            }
        }
        while ((context instanceof ContextWrapper) && !(context instanceof Activity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        Rect bounds3 = windowManager.getMaximumWindowMetrics().getBounds();
        point.x = bounds3.width();
        point.y = bounds3.height();
        if (context instanceof Activity) {
            Rect bounds4 = windowManager.getCurrentWindowMetrics().getBounds();
            point2.x = bounds4.width();
            point2.y = bounds4.height();
        } else {
            windowManager.getMaximumWindowMetrics().getBounds();
            point2.x = point.x;
            point2.y = point.y;
        }
    }

    public static Point qrj(Context context) {
        Point point = new Point();
        kja0(context, point);
        return point;
    }

    /* JADX INFO: renamed from: s */
    public static Point m25558s(Context context) {
        float f2 = context.getResources().getDisplayMetrics().density;
        Point pointM25551g = m25551g(context);
        pointM25551g.x = (int) (pointM25551g.x / f2);
        pointM25551g.y = (int) (pointM25551g.y / f2);
        return pointM25551g;
    }

    public static Point t8r(Context context) {
        float f2 = context.getResources().getDisplayMetrics().density;
        Point pointQrj = qrj(context);
        pointQrj.x = (int) (pointQrj.x / f2);
        pointQrj.y = (int) (pointQrj.y / f2);
        return pointQrj;
    }

    public static Display toq(Context context) {
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                return context.getDisplay();
            } catch (UnsupportedOperationException unused) {
                Log.w(f39862k, "This context is not associated with a display. You should use createDisplayContext() to create a display context to work with windows.");
            }
        }
        return x2(context).getDefaultDisplay();
    }

    public static WindowManager x2(Context context) {
        return (WindowManager) context.getSystemService("window");
    }

    /* JADX INFO: renamed from: y */
    public static void m25559y(WindowManager windowManager, Context context, Point point) {
        if (Build.VERSION.SDK_INT < 30) {
            toq(context).getRealSize(point);
            return;
        }
        Rect bounds = windowManager.getMaximumWindowMetrics().getBounds();
        point.x = bounds.width();
        point.y = bounds.height();
    }

    @Deprecated
    public static int zurt(Context context) {
        return qrj(context).x;
    }

    public static void zy(Context context, Point point, Point point2) {
        m25557q(x2(context), context, point, point2);
    }
}
