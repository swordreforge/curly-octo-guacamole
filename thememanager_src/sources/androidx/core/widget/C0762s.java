package androidx.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.EdgeEffect;
import zy.InterfaceC7830i;
import zy.dd;
import zy.hyr;
import zy.lvui;

/* JADX INFO: renamed from: androidx.core.widget.s */
/* JADX INFO: compiled from: EdgeEffectCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0762s {

    /* JADX INFO: renamed from: k */
    private final EdgeEffect f4293k;

    /* JADX INFO: renamed from: androidx.core.widget.s$k */
    /* JADX INFO: compiled from: EdgeEffectCompat.java */
    @hyr(21)
    static class k {
        private k() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static void m3678k(EdgeEffect edgeEffect, float f2, float f3) {
            edgeEffect.onPull(f2, f3);
        }
    }

    /* JADX INFO: renamed from: androidx.core.widget.s$toq */
    /* JADX INFO: compiled from: EdgeEffectCompat.java */
    @hyr(31)
    private static class toq {
        private toq() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        public static EdgeEffect m3679k(Context context, AttributeSet attributeSet) {
            try {
                return new EdgeEffect(context, attributeSet);
            } catch (Throwable unused) {
                return new EdgeEffect(context);
            }
        }

        @InterfaceC7830i
        public static float toq(EdgeEffect edgeEffect) {
            try {
                return edgeEffect.getDistance();
            } catch (Throwable unused) {
                return 0.0f;
            }
        }

        @InterfaceC7830i
        public static float zy(EdgeEffect edgeEffect, float f2, float f3) {
            try {
                return edgeEffect.onPullDistance(f2, f3);
            } catch (Throwable unused) {
                edgeEffect.onPull(f2, f3);
                return 0.0f;
            }
        }
    }

    @Deprecated
    public C0762s(Context context) {
        this.f4293k = new EdgeEffect(context);
    }

    public static void f7l8(@lvui EdgeEffect edgeEffect, float f2, float f3) {
        k.m3678k(edgeEffect, f2, f3);
    }

    @lvui
    /* JADX INFO: renamed from: k */
    public static EdgeEffect m3671k(@lvui Context context, @dd AttributeSet attributeSet) {
        return Build.VERSION.SDK_INT >= 31 ? toq.m3679k(context, attributeSet) : new EdgeEffect(context);
    }

    /* JADX INFO: renamed from: p */
    public static float m3672p(@lvui EdgeEffect edgeEffect, float f2, float f3) {
        if (Build.VERSION.SDK_INT >= 31) {
            return toq.zy(edgeEffect, f2, f3);
        }
        f7l8(edgeEffect, f2, f3);
        return f2;
    }

    /* JADX INFO: renamed from: q */
    public static float m3673q(@lvui EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return toq.toq(edgeEffect);
        }
        return 0.0f;
    }

    @Deprecated
    /* JADX INFO: renamed from: g */
    public boolean m3674g(int i2) {
        this.f4293k.onAbsorb(i2);
        return true;
    }

    @Deprecated
    public boolean ld6() {
        this.f4293k.onRelease();
        return this.f4293k.isFinished();
    }

    @Deprecated
    /* JADX INFO: renamed from: n */
    public boolean m3675n() {
        return this.f4293k.isFinished();
    }

    @Deprecated
    /* JADX INFO: renamed from: s */
    public boolean m3676s(float f2, float f3) {
        f7l8(this.f4293k, f2, f3);
        return true;
    }

    @Deprecated
    public boolean toq(Canvas canvas) {
        return this.f4293k.draw(canvas);
    }

    @Deprecated
    public void x2(int i2, int i3) {
        this.f4293k.setSize(i2, i3);
    }

    @Deprecated
    /* JADX INFO: renamed from: y */
    public boolean m3677y(float f2) {
        this.f4293k.onPull(f2);
        return true;
    }

    @Deprecated
    public void zy() {
        this.f4293k.finish();
    }
}
