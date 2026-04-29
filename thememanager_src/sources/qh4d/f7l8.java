package qh4d;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.gvn7;
import androidx.core.view.jp0y;
import zy.lvui;

/* JADX INFO: compiled from: ViewParentCompat.java */
/* JADX INFO: loaded from: classes3.dex */
public final class f7l8 {

    /* JADX INFO: renamed from: k */
    private static final String f43974k = "ViewParentCompat";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static int[] f94464toq;

    private f7l8() {
    }

    public static void f7l8(ViewParent viewParent, View view, int i2, int i3, int i4, int i5) {
        m27920s(viewParent, view, i2, i3, i4, i5, 0, m27916k());
    }

    /* JADX INFO: renamed from: g */
    public static void m27914g(ViewParent viewParent, View view, int i2, int i3, int[] iArr, int i4) {
        if (viewParent instanceof jp0y) {
            ((jp0y) viewParent).mo419h(view, i2, i3, iArr, i4);
            return;
        }
        if (i4 == 0) {
            try {
                viewParent.onNestedPreScroll(view, i2, i3, iArr);
            } catch (AbstractMethodError e2) {
                Log.e(f43974k, "ViewParent " + viewParent + " does not implement interface method onNestedPreScroll", e2);
            }
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: h */
    public static boolean m27915h(ViewParent viewParent, View view, AccessibilityEvent accessibilityEvent) {
        return viewParent.requestSendAccessibilityEvent(view, accessibilityEvent);
    }

    /* JADX INFO: renamed from: k */
    private static int[] m27916k() {
        int[] iArr = f94464toq;
        if (iArr == null) {
            f94464toq = new int[2];
        } else {
            iArr[0] = 0;
            iArr[1] = 0;
        }
        return f94464toq;
    }

    public static void kja0(ViewParent viewParent, View view, int i2) {
        if (viewParent instanceof jp0y) {
            ((jp0y) viewParent).kja0(view, i2);
            return;
        }
        if (i2 == 0) {
            try {
                viewParent.onStopNestedScroll(view);
            } catch (AbstractMethodError e2) {
                Log.e(f43974k, "ViewParent " + viewParent + " does not implement interface method onStopNestedScroll", e2);
            }
        }
    }

    public static void ld6(ViewParent viewParent, View view, View view2, int i2, int i3) {
        if (viewParent instanceof jp0y) {
            ((jp0y) viewParent).ld6(view, view2, i2, i3);
            return;
        }
        if (i3 == 0) {
            try {
                viewParent.onNestedScrollAccepted(view, view2, i2);
            } catch (AbstractMethodError e2) {
                Log.e(f43974k, "ViewParent " + viewParent + " does not implement interface method onNestedScrollAccepted", e2);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m27917n(ViewParent viewParent, View view, int i2, int i3, int[] iArr) {
        m27914g(viewParent, view, i2, i3, iArr, 0);
    }

    public static void n7h(ViewParent viewParent, View view) {
        kja0(viewParent, view, 0);
    }

    /* JADX INFO: renamed from: p */
    public static void m27918p(ViewParent viewParent, View view, View view2, int i2) {
        ld6(viewParent, view, view2, i2, 0);
    }

    /* JADX INFO: renamed from: q */
    public static boolean m27919q(ViewParent viewParent, View view, float f2, float f3) {
        try {
            return viewParent.onNestedPreFling(view, f2, f3);
        } catch (AbstractMethodError e2) {
            Log.e(f43974k, "ViewParent " + viewParent + " does not implement interface method onNestedPreFling", e2);
            return false;
        }
    }

    public static boolean qrj(ViewParent viewParent, View view, View view2, int i2, int i3) {
        if (viewParent instanceof jp0y) {
            return ((jp0y) viewParent).mo426z(view, view2, i2, i3);
        }
        if (i3 != 0) {
            return false;
        }
        try {
            return viewParent.onStartNestedScroll(view, view2, i2);
        } catch (AbstractMethodError e2) {
            Log.e(f43974k, "ViewParent " + viewParent + " does not implement interface method onStartNestedScroll", e2);
            return false;
        }
    }

    /* JADX INFO: renamed from: s */
    public static void m27920s(ViewParent viewParent, View view, int i2, int i3, int i4, int i5, int i6, @lvui int[] iArr) {
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
                viewParent.onNestedScroll(view, i2, i3, i4, i5);
            } catch (AbstractMethodError e2) {
                Log.e(f43974k, "ViewParent " + viewParent + " does not implement interface method onNestedScroll", e2);
            }
        }
    }

    public static void toq(ViewParent viewParent, View view, View view2, int i2) {
        viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i2);
    }

    public static boolean x2(ViewParent viewParent, View view, View view2, int i2) {
        return qrj(viewParent, view, view2, i2, 0);
    }

    /* JADX INFO: renamed from: y */
    public static void m27921y(ViewParent viewParent, View view, int i2, int i3, int i4, int i5, int i6) {
        m27920s(viewParent, view, i2, i3, i4, i5, i6, m27916k());
    }

    public static boolean zy(ViewParent viewParent, View view, float f2, float f3, boolean z2) {
        try {
            return viewParent.onNestedFling(view, f2, f3, z2);
        } catch (AbstractMethodError e2) {
            Log.e(f43974k, "ViewParent " + viewParent + " does not implement interface method onNestedFling", e2);
            return false;
        }
    }
}
