package androidx.core.view;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import zy.InterfaceC7830i;

/* JADX INFO: compiled from: ViewParentCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class y2 {

    /* JADX INFO: renamed from: k */
    private static final String f4199k = "ViewParentCompat";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static int[] f50965toq;

    /* JADX INFO: renamed from: androidx.core.view.y2$k */
    /* JADX INFO: compiled from: ViewParentCompat.java */
    @zy.hyr(19)
    static class C0743k {
        private C0743k() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static void m3574k(ViewParent viewParent, View view, View view2, int i2) {
            viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i2);
        }
    }

    /* JADX INFO: compiled from: ViewParentCompat.java */
    @zy.hyr(21)
    static class toq {
        private toq() {
        }

        @InterfaceC7830i
        static void f7l8(ViewParent viewParent, View view) {
            viewParent.onStopNestedScroll(view);
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: g */
        static boolean m3575g(ViewParent viewParent, View view, View view2, int i2) {
            return viewParent.onStartNestedScroll(view, view2, i2);
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static boolean m3576k(ViewParent viewParent, View view, float f2, float f3, boolean z2) {
            return viewParent.onNestedFling(view, f2, f3, z2);
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: n */
        static void m3577n(ViewParent viewParent, View view, View view2, int i2) {
            viewParent.onNestedScrollAccepted(view, view2, i2);
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: q */
        static void m3578q(ViewParent viewParent, View view, int i2, int i3, int i4, int i5) {
            viewParent.onNestedScroll(view, i2, i3, i4, i5);
        }

        @InterfaceC7830i
        static boolean toq(ViewParent viewParent, View view, float f2, float f3) {
            return viewParent.onNestedPreFling(view, f2, f3);
        }

        @InterfaceC7830i
        static void zy(ViewParent viewParent, View view, int i2, int i3, int[] iArr) {
            viewParent.onNestedPreScroll(view, i2, i3, iArr);
        }
    }

    private y2() {
    }

    public static void f7l8(@zy.lvui ViewParent viewParent, @zy.lvui View view, int i2, int i3, int i4, int i5) {
        m3572s(viewParent, view, i2, i3, i4, i5, 0, m3568k());
    }

    /* JADX INFO: renamed from: g */
    public static void m3566g(@zy.lvui ViewParent viewParent, @zy.lvui View view, int i2, int i3, @zy.lvui int[] iArr, int i4) {
        if (viewParent instanceof jp0y) {
            ((jp0y) viewParent).mo419h(view, i2, i3, iArr, i4);
            return;
        }
        if (i4 == 0) {
            try {
                toq.zy(viewParent, view, i2, i3, iArr);
            } catch (AbstractMethodError e2) {
                Log.e(f4199k, "ViewParent " + viewParent + " does not implement interface method onNestedPreScroll", e2);
            }
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: h */
    public static boolean m3567h(ViewParent viewParent, View view, AccessibilityEvent accessibilityEvent) {
        return viewParent.requestSendAccessibilityEvent(view, accessibilityEvent);
    }

    /* JADX INFO: renamed from: k */
    private static int[] m3568k() {
        int[] iArr = f50965toq;
        if (iArr == null) {
            f50965toq = new int[2];
        } else {
            iArr[0] = 0;
            iArr[1] = 0;
        }
        return f50965toq;
    }

    public static void kja0(@zy.lvui ViewParent viewParent, @zy.lvui View view, int i2) {
        if (viewParent instanceof jp0y) {
            ((jp0y) viewParent).kja0(view, i2);
            return;
        }
        if (i2 == 0) {
            try {
                toq.f7l8(viewParent, view);
            } catch (AbstractMethodError e2) {
                Log.e(f4199k, "ViewParent " + viewParent + " does not implement interface method onStopNestedScroll", e2);
            }
        }
    }

    public static void ld6(@zy.lvui ViewParent viewParent, @zy.lvui View view, @zy.lvui View view2, int i2, int i3) {
        if (viewParent instanceof jp0y) {
            ((jp0y) viewParent).ld6(view, view2, i2, i3);
            return;
        }
        if (i3 == 0) {
            try {
                toq.m3577n(viewParent, view, view2, i2);
            } catch (AbstractMethodError e2) {
                Log.e(f4199k, "ViewParent " + viewParent + " does not implement interface method onNestedScrollAccepted", e2);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m3569n(@zy.lvui ViewParent viewParent, @zy.lvui View view, int i2, int i3, @zy.lvui int[] iArr) {
        m3566g(viewParent, view, i2, i3, iArr, 0);
    }

    public static void n7h(@zy.lvui ViewParent viewParent, @zy.lvui View view) {
        kja0(viewParent, view, 0);
    }

    /* JADX INFO: renamed from: p */
    public static void m3570p(@zy.lvui ViewParent viewParent, @zy.lvui View view, @zy.lvui View view2, int i2) {
        ld6(viewParent, view, view2, i2, 0);
    }

    /* JADX INFO: renamed from: q */
    public static boolean m3571q(@zy.lvui ViewParent viewParent, @zy.lvui View view, float f2, float f3) {
        try {
            return toq.toq(viewParent, view, f2, f3);
        } catch (AbstractMethodError e2) {
            Log.e(f4199k, "ViewParent " + viewParent + " does not implement interface method onNestedPreFling", e2);
            return false;
        }
    }

    public static boolean qrj(@zy.lvui ViewParent viewParent, @zy.lvui View view, @zy.lvui View view2, int i2, int i3) {
        if (viewParent instanceof jp0y) {
            return ((jp0y) viewParent).mo426z(view, view2, i2, i3);
        }
        if (i3 != 0) {
            return false;
        }
        try {
            return toq.m3575g(viewParent, view, view2, i2);
        } catch (AbstractMethodError e2) {
            Log.e(f4199k, "ViewParent " + viewParent + " does not implement interface method onStartNestedScroll", e2);
            return false;
        }
    }

    /* JADX INFO: renamed from: s */
    public static void m3572s(@zy.lvui ViewParent viewParent, @zy.lvui View view, int i2, int i3, int i4, int i5, int i6, @zy.lvui int[] iArr) {
        if (viewParent instanceof gvn7) {
            ((gvn7) viewParent).ni7(view, i2, i3, i4, i5, i6, iArr);
            return;
        }
        iArr[0] = iArr[0] + i4;
        iArr[1] = iArr[1] + i5;
        if (viewParent instanceof jp0y) {
            ((jp0y) viewParent).fu4(view, i2, i3, i4, i5, i6);
            return;
        }
        if (i6 == 0) {
            try {
                toq.m3578q(viewParent, view, i2, i3, i4, i5);
            } catch (AbstractMethodError e2) {
                Log.e(f4199k, "ViewParent " + viewParent + " does not implement interface method onNestedScroll", e2);
            }
        }
    }

    public static void toq(@zy.lvui ViewParent viewParent, @zy.lvui View view, @zy.lvui View view2, int i2) {
        C0743k.m3574k(viewParent, view, view2, i2);
    }

    public static boolean x2(@zy.lvui ViewParent viewParent, @zy.lvui View view, @zy.lvui View view2, int i2) {
        return qrj(viewParent, view, view2, i2, 0);
    }

    /* JADX INFO: renamed from: y */
    public static void m3573y(@zy.lvui ViewParent viewParent, @zy.lvui View view, int i2, int i3, int i4, int i5, int i6) {
        m3572s(viewParent, view, i2, i3, i4, i5, i6, m3568k());
    }

    public static boolean zy(@zy.lvui ViewParent viewParent, @zy.lvui View view, float f2, float f3, boolean z2) {
        try {
            return toq.m3576k(viewParent, view, f2, f3, z2);
        } catch (AbstractMethodError e2) {
            Log.e(f4199k, "ViewParent " + viewParent + " does not implement interface method onNestedFling", e2);
            return false;
        }
    }
}
