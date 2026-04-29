package android.view;

import android.annotation.NonNull;
import android.annotation.Nullable;
import android.graphics.Insets;
import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class WindowInsetsAnimation {

    public final /* synthetic */ class Bounds {
        static {
            throw new NoClassDefFoundError();
        }

        public /* synthetic */ Bounds(@NonNull Insets insets, @NonNull Insets insets2) {
        }

        @NonNull
        public native /* synthetic */ Insets getLowerBound();

        @NonNull
        public native /* synthetic */ Insets getUpperBound();
    }

    public /* synthetic */ class Callback {
        static {
            throw new NoClassDefFoundError();
        }

        public /* synthetic */ Callback(int i2) {
        }

        public native /* synthetic */ void onEnd(@NonNull WindowInsetsAnimation windowInsetsAnimation);

        public native /* synthetic */ void onPrepare(@NonNull WindowInsetsAnimation windowInsetsAnimation);

        @NonNull
        public native /* synthetic */ Bounds onStart(@NonNull WindowInsetsAnimation windowInsetsAnimation, @NonNull Bounds bounds);
    }

    static {
        throw new NoClassDefFoundError();
    }

    public /* synthetic */ WindowInsetsAnimation(int i2, @Nullable Interpolator interpolator, long j2) {
    }

    public native /* synthetic */ long getDurationMillis();

    public native /* synthetic */ float getFraction();

    public native /* synthetic */ float getInterpolatedFraction();

    @Nullable
    public native /* synthetic */ Interpolator getInterpolator();

    public native /* synthetic */ int getTypeMask();

    public native /* synthetic */ void setFraction(float f2);
}
