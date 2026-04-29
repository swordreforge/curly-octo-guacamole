package b8;

import android.content.Context;
import android.graphics.Rect;
import android.view.WindowManager;

/* JADX INFO: renamed from: b8.q */
/* JADX INFO: compiled from: ScreenUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public class C1364q {
    /* JADX INFO: renamed from: k */
    public static float m5782k(Rect rect) {
        return rect.width() / rect.height();
    }

    /* JADX INFO: renamed from: q */
    public static Rect m5783q(Context context) {
        Rect bounds = ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds();
        if (toq.f7252s) {
            return (!toq.f53995f7l8 || toq.toq(context) || bounds.width() <= bounds.height()) ? bounds : new Rect(0, 0, bounds.height(), bounds.width());
        }
        int iWidth = bounds.width();
        int iHeight = bounds.height();
        return iWidth < iHeight ? new Rect(0, 0, iWidth, iHeight) : new Rect(0, 0, iHeight, iWidth);
    }

    public static int toq(Context context) {
        return (int) ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRefreshRate();
    }

    public static float zy(Context context) {
        return m5782k(m5783q(context));
    }
}
