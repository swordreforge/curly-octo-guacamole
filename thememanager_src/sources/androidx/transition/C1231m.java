package androidx.transition;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import androidx.core.view.C0683f;

/* JADX INFO: renamed from: androidx.transition.m */
/* JADX INFO: compiled from: ViewUtils.java */
/* JADX INFO: loaded from: classes.dex */
class C1231m {

    /* JADX INFO: renamed from: k */
    private static final lv5 f6717k;

    /* JADX INFO: renamed from: q */
    static final Property<View, Rect> f6718q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f53514toq = "ViewUtils";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    static final Property<View, Float> f53515zy;

    /* JADX INFO: renamed from: androidx.transition.m$k */
    /* JADX INFO: compiled from: ViewUtils.java */
    class k extends Property<View, Float> {
        k(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(C1231m.zy(view));
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f2) {
            C1231m.m5394y(view, f2.floatValue());
        }
    }

    /* JADX INFO: renamed from: androidx.transition.m$toq */
    /* JADX INFO: compiled from: ViewUtils.java */
    class toq extends Property<View, Rect> {
        toq(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Rect get(View view) {
            return C0683f.x9kr(view);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void set(View view, Rect rect) {
            C0683f.vy(view, rect);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f6717k = new nmn5();
        } else {
            f6717k = new ch();
        }
        f53515zy = new k(Float.class, "translationAlpha");
        f6718q = new toq(Rect.class, "clipBounds");
    }

    private C1231m() {
    }

    static void f7l8(@zy.lvui View view, int i2, int i3, int i4, int i5) {
        f6717k.mo5377g(view, i2, i3, i4, i5);
    }

    /* JADX INFO: renamed from: g */
    static void m5388g(@zy.lvui View view, @zy.dd Matrix matrix) {
        f6717k.mo5300n(view, matrix);
    }

    /* JADX INFO: renamed from: k */
    static void m5389k(@zy.lvui View view) {
        f6717k.mo5378k(view);
    }

    static void ld6(@zy.lvui View view, @zy.lvui Matrix matrix) {
        f6717k.mo5301p(view, matrix);
    }

    /* JADX INFO: renamed from: n */
    static void m5390n(@zy.lvui View view) {
        f6717k.mo5379q(view);
    }

    /* JADX INFO: renamed from: p */
    static void m5391p(@zy.lvui View view, @zy.lvui Matrix matrix) {
        f6717k.mo5302s(view, matrix);
    }

    /* JADX INFO: renamed from: q */
    static c8jq m5392q(@zy.lvui View view) {
        return new y2(view);
    }

    /* JADX INFO: renamed from: s */
    static void m5393s(@zy.lvui View view, int i2) {
        f6717k.mo5308y(view, i2);
    }

    static InterfaceC1236o toq(@zy.lvui View view) {
        return new C1216j(view);
    }

    /* JADX INFO: renamed from: y */
    static void m5394y(@zy.lvui View view, float f2) {
        f6717k.f7l8(view, f2);
    }

    static float zy(@zy.lvui View view) {
        return f6717k.zy(view);
    }
}
