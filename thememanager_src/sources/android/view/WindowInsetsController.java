package android.view;

import android.annotation.NonNull;
import android.annotation.Nullable;
import android.os.CancellationSignal;
import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ interface WindowInsetsController {

    public /* synthetic */ interface OnControllableInsetsChangedListener {
        static {
            throw new NoClassDefFoundError();
        }
    }

    static {
        throw new NoClassDefFoundError();
    }

    /* synthetic */ void addOnControllableInsetsChangedListener(@NonNull OnControllableInsetsChangedListener onControllableInsetsChangedListener);

    /* synthetic */ void controlWindowInsetsAnimation(int i2, long j2, @Nullable Interpolator interpolator, @Nullable CancellationSignal cancellationSignal, @NonNull WindowInsetsAnimationControlListener windowInsetsAnimationControlListener);

    /* synthetic */ int getSystemBarsAppearance();

    /* synthetic */ int getSystemBarsBehavior();

    /* synthetic */ void hide(int i2);

    /* synthetic */ void removeOnControllableInsetsChangedListener(@NonNull OnControllableInsetsChangedListener onControllableInsetsChangedListener);

    /* synthetic */ void setSystemBarsAppearance(int i2, int i3);

    /* synthetic */ void setSystemBarsBehavior(int i2);

    /* synthetic */ void show(int i2);
}
