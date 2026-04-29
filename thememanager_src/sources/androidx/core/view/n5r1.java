package androidx.core.view;

import android.view.VelocityTracker;

/* JADX INFO: compiled from: VelocityTrackerCompat.java */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class n5r1 {
    private n5r1() {
    }

    @Deprecated
    /* JADX INFO: renamed from: k */
    public static float m3385k(VelocityTracker velocityTracker, int i2) {
        return velocityTracker.getXVelocity(i2);
    }

    @Deprecated
    public static float toq(VelocityTracker velocityTracker, int i2) {
        return velocityTracker.getYVelocity(i2);
    }
}
