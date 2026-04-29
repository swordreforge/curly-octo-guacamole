package miuix.os;

import android.content.Context;
import android.graphics.Point;
import miuix.core.util.C7085q;

/* JADX INFO: compiled from: DeviceHelper.java */
/* JADX INFO: loaded from: classes3.dex */
public class zy {
    public static boolean f7l8(Context context) {
        return ((float) C7085q.m25604n(context)) > context.getResources().getDisplayMetrics().density * 600.0f;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m26178g(Context context) {
        Point pointM25600g = C7085q.m25600g(context);
        return ((int) (((float) Math.max(pointM25600g.x, pointM25600g.y)) / context.getResources().getDisplayMetrics().density)) <= 640;
    }

    /* JADX INFO: renamed from: k */
    public static int m26179k(Context context) {
        if (toq.f40719q) {
            return 3;
        }
        if (toq.f40718n) {
            return 4;
        }
        if (toq.f87879f7l8) {
            return 5;
        }
        return toq.f87880toq ? 2 : 1;
    }

    /* JADX INFO: renamed from: n */
    public static boolean m26180n() {
        return toq.f87880toq;
    }

    @Deprecated
    /* JADX INFO: renamed from: q */
    public static boolean m26181q(Context context) {
        return toq.f40718n ? !m26178g(context) : toq.f87881zy && f7l8(context);
    }

    @Deprecated
    public static boolean toq(Context context) {
        return toq.f40718n ? m26178g(context) : toq.f87881zy && !f7l8(context);
    }

    public static boolean zy() {
        return toq.f87881zy;
    }
}
