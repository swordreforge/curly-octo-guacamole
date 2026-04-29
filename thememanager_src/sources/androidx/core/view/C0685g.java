package androidx.core.view;

import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.view.DisplayCutout;
import androidx.core.util.C0642s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import zy.InterfaceC7830i;

/* JADX INFO: renamed from: androidx.core.view.g */
/* JADX INFO: compiled from: DisplayCutoutCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0685g {

    /* JADX INFO: renamed from: k */
    private final DisplayCutout f4025k;

    /* JADX INFO: renamed from: androidx.core.view.g$k */
    /* JADX INFO: compiled from: DisplayCutoutCompat.java */
    @zy.hyr(28)
    static class k {
        private k() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: g */
        static int m3283g(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetTop();
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static DisplayCutout m3284k(Rect rect, List<Rect> list) {
            return new DisplayCutout(rect, list);
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: n */
        static int m3285n(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetRight();
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: q */
        static int m3286q(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetLeft();
        }

        @InterfaceC7830i
        static List<Rect> toq(DisplayCutout displayCutout) {
            return displayCutout.getBoundingRects();
        }

        @InterfaceC7830i
        static int zy(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetBottom();
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.g$toq */
    /* JADX INFO: compiled from: DisplayCutoutCompat.java */
    @zy.hyr(29)
    static class toq {
        private toq() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static DisplayCutout m3287k(Insets insets, Rect rect, Rect rect2, Rect rect3, Rect rect4) {
            return new DisplayCutout(insets, rect, rect2, rect3, rect4);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.g$zy */
    /* JADX INFO: compiled from: DisplayCutoutCompat.java */
    @zy.hyr(30)
    static class zy {
        private zy() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static DisplayCutout m3288k(Insets insets, Rect rect, Rect rect2, Rect rect3, Rect rect4, Insets insets2) {
            return new DisplayCutout(insets, rect, rect2, rect3, rect4, insets2);
        }

        @InterfaceC7830i
        static Insets toq(DisplayCutout displayCutout) {
            return displayCutout.getWaterfallInsets();
        }
    }

    public C0685g(@zy.dd Rect rect, @zy.dd List<Rect> list) {
        this(Build.VERSION.SDK_INT >= 28 ? k.m3284k(rect, list) : null);
    }

    /* JADX INFO: renamed from: k */
    private static DisplayCutout m3277k(@zy.lvui androidx.core.graphics.x2 x2Var, @zy.dd Rect rect, @zy.dd Rect rect2, @zy.dd Rect rect3, @zy.dd Rect rect4, @zy.lvui androidx.core.graphics.x2 x2Var2) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            return zy.m3288k(x2Var.m2577y(), rect, rect2, rect3, rect4, x2Var2.m2577y());
        }
        if (i2 >= 29) {
            return toq.m3287k(x2Var.m2577y(), rect, rect2, rect3, rect4);
        }
        if (i2 < 28) {
            return null;
        }
        Rect rect5 = new Rect(x2Var.f3600k, x2Var.f50489toq, x2Var.f50490zy, x2Var.f3601q);
        ArrayList arrayList = new ArrayList();
        if (rect != null) {
            arrayList.add(rect);
        }
        if (rect2 != null) {
            arrayList.add(rect2);
        }
        if (rect3 != null) {
            arrayList.add(rect3);
        }
        if (rect4 != null) {
            arrayList.add(rect4);
        }
        return k.m3284k(rect5, arrayList);
    }

    /* JADX INFO: renamed from: s */
    static C0685g m3278s(DisplayCutout displayCutout) {
        if (displayCutout == null) {
            return null;
        }
        return new C0685g(displayCutout);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0685g.class != obj.getClass()) {
            return false;
        }
        return C0642s.m2985k(this.f4025k, ((C0685g) obj).f4025k);
    }

    @zy.lvui
    public androidx.core.graphics.x2 f7l8() {
        return Build.VERSION.SDK_INT >= 30 ? androidx.core.graphics.x2.f7l8(zy.toq(this.f4025k)) : androidx.core.graphics.x2.f3599n;
    }

    /* JADX INFO: renamed from: g */
    public int m3279g() {
        if (Build.VERSION.SDK_INT >= 28) {
            return k.m3283g(this.f4025k);
        }
        return 0;
    }

    public int hashCode() {
        DisplayCutout displayCutout = this.f4025k;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    /* JADX INFO: renamed from: n */
    public int m3280n() {
        if (Build.VERSION.SDK_INT >= 28) {
            return k.m3285n(this.f4025k);
        }
        return 0;
    }

    /* JADX INFO: renamed from: q */
    public int m3281q() {
        if (Build.VERSION.SDK_INT >= 28) {
            return k.m3286q(this.f4025k);
        }
        return 0;
    }

    @zy.lvui
    public String toString() {
        return "DisplayCutoutCompat{" + this.f4025k + "}";
    }

    @zy.lvui
    public List<Rect> toq() {
        return Build.VERSION.SDK_INT >= 28 ? k.toq(this.f4025k) : Collections.emptyList();
    }

    @zy.hyr(28)
    /* JADX INFO: renamed from: y */
    DisplayCutout m3282y() {
        return this.f4025k;
    }

    public int zy() {
        if (Build.VERSION.SDK_INT >= 28) {
            return k.zy(this.f4025k);
        }
        return 0;
    }

    public C0685g(@zy.lvui androidx.core.graphics.x2 x2Var, @zy.dd Rect rect, @zy.dd Rect rect2, @zy.dd Rect rect3, @zy.dd Rect rect4, @zy.lvui androidx.core.graphics.x2 x2Var2) {
        this(m3277k(x2Var, rect, rect2, rect3, rect4, x2Var2));
    }

    private C0685g(DisplayCutout displayCutout) {
        this.f4025k = displayCutout;
    }
}
