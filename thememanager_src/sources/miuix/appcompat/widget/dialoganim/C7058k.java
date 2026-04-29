package miuix.appcompat.widget.dialoganim;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.DecelerateInterpolator;

/* JADX INFO: renamed from: miuix.appcompat.widget.dialoganim.k */
/* JADX INFO: compiled from: DimAnimator.java */
/* JADX INFO: loaded from: classes3.dex */
public class C7058k {
    /* JADX INFO: renamed from: k */
    public static void m25468k(View view) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", 0.3f, 0.0f);
        objectAnimatorOfFloat.setInterpolator(new DecelerateInterpolator(1.5f));
        objectAnimatorOfFloat.setDuration(250L);
        objectAnimatorOfFloat.start();
    }

    public static void toq(View view) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 0.3f);
        objectAnimatorOfFloat.setInterpolator(new DecelerateInterpolator(1.5f));
        objectAnimatorOfFloat.setDuration(300L);
        objectAnimatorOfFloat.start();
    }
}
