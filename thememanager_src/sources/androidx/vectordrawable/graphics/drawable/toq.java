package androidx.vectordrawable.graphics.drawable;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;
import zy.hyr;
import zy.lvui;

/* JADX INFO: compiled from: Animatable2Compat.java */
/* JADX INFO: loaded from: classes.dex */
public interface toq extends Animatable {

    /* JADX INFO: renamed from: androidx.vectordrawable.graphics.drawable.toq$k */
    /* JADX INFO: compiled from: Animatable2Compat.java */
    public static abstract class AbstractC1258k {

        /* JADX INFO: renamed from: k */
        Animatable2.AnimationCallback f6892k;

        /* JADX INFO: renamed from: androidx.vectordrawable.graphics.drawable.toq$k$k */
        /* JADX INFO: compiled from: Animatable2Compat.java */
        class k extends Animatable2.AnimationCallback {
            k() {
            }

            @Override // android.graphics.drawable.Animatable2.AnimationCallback
            public void onAnimationEnd(Drawable drawable) {
                AbstractC1258k.this.toq(drawable);
            }

            @Override // android.graphics.drawable.Animatable2.AnimationCallback
            public void onAnimationStart(Drawable drawable) {
                AbstractC1258k.this.zy(drawable);
            }
        }

        @hyr(23)
        /* JADX INFO: renamed from: k */
        Animatable2.AnimationCallback m5486k() {
            if (this.f6892k == null) {
                this.f6892k = new k();
            }
            return this.f6892k;
        }

        public void toq(Drawable drawable) {
        }

        public void zy(Drawable drawable) {
        }
    }

    void clearAnimationCallbacks();

    void toq(@lvui AbstractC1258k abstractC1258k);

    boolean zy(@lvui AbstractC1258k abstractC1258k);
}
