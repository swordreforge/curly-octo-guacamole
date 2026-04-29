package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import zy.InterfaceC7830i;

/* JADX INFO: compiled from: ViewGroupCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class t8iq {

    /* JADX INFO: renamed from: k */
    public static final int f4129k = 0;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final int f50912toq = 1;

    /* JADX INFO: renamed from: androidx.core.view.t8iq$k */
    /* JADX INFO: compiled from: ViewGroupCompat.java */
    @zy.hyr(18)
    static class C0721k {
        private C0721k() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static int m3463k(ViewGroup viewGroup) {
            return viewGroup.getLayoutMode();
        }

        @InterfaceC7830i
        static void toq(ViewGroup viewGroup, int i2) {
            viewGroup.setLayoutMode(i2);
        }
    }

    /* JADX INFO: compiled from: ViewGroupCompat.java */
    @zy.hyr(21)
    static class toq {
        private toq() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static int m3464k(ViewGroup viewGroup) {
            return viewGroup.getNestedScrollAxes();
        }

        @InterfaceC7830i
        static boolean toq(ViewGroup viewGroup) {
            return viewGroup.isTransitionGroup();
        }

        @InterfaceC7830i
        static void zy(ViewGroup viewGroup, boolean z2) {
            viewGroup.setTransitionGroup(z2);
        }
    }

    private t8iq() {
    }

    public static void f7l8(@zy.lvui ViewGroup viewGroup, boolean z2) {
        toq.zy(viewGroup, z2);
    }

    @Deprecated
    /* JADX INFO: renamed from: g */
    public static void m3459g(ViewGroup viewGroup, boolean z2) {
        viewGroup.setMotionEventSplittingEnabled(z2);
    }

    /* JADX INFO: renamed from: k */
    public static int m3460k(@zy.lvui ViewGroup viewGroup) {
        return C0721k.m3463k(viewGroup);
    }

    /* JADX INFO: renamed from: n */
    public static void m3461n(@zy.lvui ViewGroup viewGroup, int i2) {
        C0721k.toq(viewGroup, i2);
    }

    @Deprecated
    /* JADX INFO: renamed from: q */
    public static boolean m3462q(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return viewGroup.onRequestSendAccessibilityEvent(view, accessibilityEvent);
    }

    public static int toq(@zy.lvui ViewGroup viewGroup) {
        return toq.m3464k(viewGroup);
    }

    public static boolean zy(@zy.lvui ViewGroup viewGroup) {
        return toq.toq(viewGroup);
    }
}
