package miuix.device;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;

/* JADX INFO: compiled from: ScreenUtils.java */
/* JADX INFO: loaded from: classes3.dex */
class zy {

    /* JADX INFO: renamed from: k */
    private static final String f39999k = "ScreenUtils";

    zy() {
    }

    /* JADX INFO: renamed from: k */
    static Display m25714k(Context context) {
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                return context.getDisplay();
            } catch (UnsupportedOperationException unused) {
                Log.w(f39999k, "This context is not associated with a display. You should use createDisplayContext() to create a display context to work with windows.");
            }
        }
        return m25715n(context).getDefaultDisplay();
    }

    /* JADX INFO: renamed from: n */
    static WindowManager m25715n(Context context) {
        return (WindowManager) context.getSystemService("window");
    }

    /* JADX INFO: renamed from: q */
    static Point m25716q(Context context) {
        float f2 = context.getResources().getDisplayMetrics().density;
        Point qVar = toq(context);
        qVar.x = (int) (qVar.x / f2);
        qVar.y = (int) (qVar.y / f2);
        return qVar;
    }

    static Point toq(Context context) {
        Point point = new Point();
        zy(context, point);
        return point;
    }

    static void zy(Context context, Point point) {
        if (Build.VERSION.SDK_INT < 30) {
            m25714k(context).getRealSize(point);
            return;
        }
        Rect bounds = m25715n(context).getMaximumWindowMetrics().getBounds();
        point.x = bounds.width();
        point.y = bounds.height();
    }
}
