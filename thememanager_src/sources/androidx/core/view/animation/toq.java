package androidx.core.view.animation;

import android.graphics.Path;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import zy.InterfaceC7830i;
import zy.hyr;
import zy.lvui;

/* JADX INFO: compiled from: PathInterpolatorCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class toq {

    /* JADX INFO: renamed from: androidx.core.view.animation.toq$k */
    /* JADX INFO: compiled from: PathInterpolatorCompat.java */
    @hyr(21)
    static class C0672k {
        private C0672k() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static PathInterpolator m3125k(float f2, float f3) {
            return new PathInterpolator(f2, f3);
        }

        @InterfaceC7830i
        static PathInterpolator toq(float f2, float f3, float f4, float f5) {
            return new PathInterpolator(f2, f3, f4, f5);
        }

        @InterfaceC7830i
        static PathInterpolator zy(Path path) {
            return new PathInterpolator(path);
        }
    }

    private toq() {
    }

    @lvui
    /* JADX INFO: renamed from: k */
    public static Interpolator m3124k(float f2, float f3) {
        return C0672k.m3125k(f2, f3);
    }

    @lvui
    public static Interpolator toq(float f2, float f3, float f4, float f5) {
        return C0672k.toq(f2, f3, f4, f5);
    }

    @lvui
    public static Interpolator zy(@lvui Path path) {
        return C0672k.zy(path);
    }
}
