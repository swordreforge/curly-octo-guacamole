package miuix.appcompat.app.floatingactivity;

import android.content.Context;
import android.util.Log;
import gb.toq;
import miuix.appcompat.app.t8r;
import miuix.autodensity.InterfaceC7074y;
import zy.lvui;

/* JADX INFO: compiled from: FloatingAnimHelper.java */
/* JADX INFO: loaded from: classes3.dex */
public class toq {

    /* JADX INFO: renamed from: k */
    private static boolean f38927k = false;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f86881toq = "FloatingAnimHelper";

    static {
        try {
            Class.forName("android.view.animation.TranslateWithClipAnimation");
            f38927k = true;
        } catch (ClassNotFoundException e2) {
            Log.w(f86881toq, "Failed to get isSupportTransWithClipAnim attributes", e2);
        }
    }

    public static void f7l8(@lvui t8r t8rVar, int i2) {
        t8rVar.getWindow().getDecorView().setTag(toq.C6054p.nod, Integer.valueOf(i2));
    }

    /* JADX INFO: renamed from: g */
    public static boolean m24987g() {
        return f38927k;
    }

    /* JADX INFO: renamed from: k */
    public static void m24988k(@lvui t8r t8rVar) {
    }

    public static void ld6(@lvui t8r t8rVar) {
        if (f38927k) {
            m24990p(t8rVar, t8rVar.isInFloatingWindowMode());
        } else {
            t8rVar.executeOpenEnterAnimation();
        }
    }

    /* JADX INFO: renamed from: n */
    private static boolean m24989n(@lvui Context context) {
        return context.getResources().getConfiguration().orientation == 1;
    }

    /* JADX INFO: renamed from: p */
    public static void m24990p(@lvui t8r t8rVar, boolean z2) {
        if (f38927k) {
            if (!z2) {
                t8rVar.overridePendingTransition(toq.C6052k.f75981bf2, toq.C6052k.f76000i1);
                return;
            }
            if (m24991q(t8rVar)) {
                if (m24989n(t8rVar)) {
                    t8rVar.overridePendingTransition(toq.C6052k.f34809a, toq.C6052k.f75982bo);
                    return;
                } else {
                    t8rVar.overridePendingTransition(toq.C6052k.f76033zp, toq.C6052k.f76030y2);
                    return;
                }
            }
            if (m24989n(t8rVar)) {
                t8rVar.overridePendingTransition(toq.C6052k.f75980a98o, toq.C6052k.f34829u);
            } else {
                t8rVar.overridePendingTransition(toq.C6052k.f34831x, toq.C6052k.f75983c8jq);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q */
    public static boolean m24991q(t8r t8rVar) {
        if (t8rVar instanceof InterfaceC7074y) {
            return ((InterfaceC7074y) t8rVar).shouldAdaptAutoDensity();
        }
        if (t8rVar.getApplication() instanceof InterfaceC7074y) {
            return ((InterfaceC7074y) t8rVar.getApplication()).shouldAdaptAutoDensity();
        }
        return false;
    }

    /* JADX INFO: renamed from: s */
    public static void m24992s(@lvui t8r t8rVar, boolean z2) {
        if (f38927k) {
            if (!z2) {
                t8rVar.overridePendingTransition(toq.C6052k.f75981bf2, toq.C6052k.f76000i1);
                return;
            }
            if (m24991q(t8rVar)) {
                if (m24989n(t8rVar)) {
                    t8rVar.overridePendingTransition(toq.C6052k.f34809a, toq.C6052k.f75982bo);
                    return;
                } else {
                    t8rVar.overridePendingTransition(toq.C6052k.f76033zp, toq.C6052k.f76030y2);
                    return;
                }
            }
            if (m24989n(t8rVar)) {
                t8rVar.overridePendingTransition(toq.C6052k.f75980a98o, toq.C6052k.f34829u);
            } else {
                t8rVar.overridePendingTransition(toq.C6052k.f34831x, toq.C6052k.f75983c8jq);
            }
        }
    }

    public static void toq(@lvui t8r t8rVar) {
        t8rVar.overridePendingTransition(toq.C6052k.f75985ch, toq.C6052k.f76008lv5);
    }

    public static void x2(@lvui t8r t8rVar) {
        if (f38927k) {
            if (!t8rVar.isInFloatingWindowMode()) {
                t8rVar.overridePendingTransition(toq.C6052k.f75981bf2, toq.C6052k.f76000i1);
                return;
            }
            if (m24991q(t8rVar)) {
                if (m24989n(t8rVar)) {
                    t8rVar.overridePendingTransition(toq.C6052k.f34809a, toq.C6052k.f75982bo);
                    return;
                } else {
                    t8rVar.overridePendingTransition(toq.C6052k.f76033zp, toq.C6052k.f76030y2);
                    return;
                }
            }
            if (m24989n(t8rVar)) {
                t8rVar.overridePendingTransition(toq.C6052k.f75980a98o, toq.C6052k.f34829u);
            } else {
                t8rVar.overridePendingTransition(toq.C6052k.f34831x, toq.C6052k.f75983c8jq);
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public static int m24993y(@lvui t8r t8rVar) {
        Object tag = t8rVar.getWindow().getDecorView().getTag(toq.C6054p.nod);
        if (tag instanceof Integer) {
            return ((Integer) tag).intValue();
        }
        return -1;
    }

    public static void zy(@lvui t8r t8rVar) {
        t8rVar.overridePendingTransition(toq.C6052k.f75997gyi, toq.C6052k.f75989dr);
    }
}
