package miuix.transition;

import android.app.ActivityOptions;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Handler;
import android.view.View;

/* JADX INFO: renamed from: miuix.transition.k */
/* JADX INFO: compiled from: ActivityOptionsCompat.java */
/* JADX INFO: loaded from: classes3.dex */
class C7376k {
    C7376k() {
    }

    /* JADX INFO: renamed from: k */
    public static ActivityOptions m26752k(Rect rect, Rect rect2, float f2, float f3, int i2, float f4, boolean z2) {
        return ActivityOptions.makeMiuiClipAnimation(rect, rect2, f2, f3, i2, f4, z2);
    }

    /* JADX INFO: renamed from: q */
    public static ActivityOptions m26753q(View view, Bitmap bitmap, int i2, int i3, int i4, int i5, float f2, Handler handler, Runnable runnable, Runnable runnable2, Runnable runnable3, Runnable runnable4, int i6) {
        return ActivityOptions.makeScaleUpDown(view, bitmap, i2, i3, i4, i5, f2, handler, runnable, runnable2, runnable3, runnable4, i6);
    }

    public static ActivityOptions toq(float f2, float f3, int i2, float f4) {
        return ActivityOptions.makeMiuiRoundAnimation(f2, f3, i2, f4);
    }

    @Deprecated
    public static ActivityOptions zy(View view, Bitmap bitmap, int i2, int i3, int i4, int i5, float f2, Handler handler, Runnable runnable, Runnable runnable2, Runnable runnable3, Runnable runnable4) {
        return ActivityOptions.makeScaleUpAnimationFromRoundedView(view, bitmap, i2, i3, i4, i5, f2, handler, runnable, runnable2, runnable3, runnable4);
    }
}
