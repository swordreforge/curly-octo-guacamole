package androidx.core.view;

import android.view.ScaleGestureDetector;
import zy.InterfaceC7830i;

/* JADX INFO: compiled from: ScaleGestureDetectorCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class x9kr {

    /* JADX INFO: renamed from: androidx.core.view.x9kr$k */
    /* JADX INFO: compiled from: ScaleGestureDetectorCompat.java */
    @zy.hyr(19)
    static class C0741k {
        private C0741k() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static boolean m3563k(ScaleGestureDetector scaleGestureDetector) {
            return scaleGestureDetector.isQuickScaleEnabled();
        }

        @InterfaceC7830i
        static void toq(ScaleGestureDetector scaleGestureDetector, boolean z2) {
            scaleGestureDetector.setQuickScaleEnabled(z2);
        }
    }

    private x9kr() {
    }

    /* JADX INFO: renamed from: k */
    public static boolean m3561k(@zy.lvui ScaleGestureDetector scaleGestureDetector) {
        return C0741k.m3563k(scaleGestureDetector);
    }

    @Deprecated
    /* JADX INFO: renamed from: q */
    public static void m3562q(Object obj, boolean z2) {
        zy((ScaleGestureDetector) obj, z2);
    }

    @Deprecated
    public static boolean toq(Object obj) {
        return m3561k((ScaleGestureDetector) obj);
    }

    public static void zy(@zy.lvui ScaleGestureDetector scaleGestureDetector, boolean z2) {
        C0741k.toq(scaleGestureDetector, z2);
    }
}
