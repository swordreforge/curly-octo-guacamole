package androidx.core.view;

import android.view.ViewGroup;
import zy.InterfaceC7830i;

/* JADX INFO: compiled from: MarginLayoutParamsCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class ki {

    /* JADX INFO: renamed from: androidx.core.view.ki$k */
    /* JADX INFO: compiled from: MarginLayoutParamsCompat.java */
    @zy.hyr(17)
    static class C0702k {
        private C0702k() {
        }

        @InterfaceC7830i
        static void f7l8(ViewGroup.MarginLayoutParams marginLayoutParams, int i2) {
            marginLayoutParams.setMarginEnd(i2);
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: g */
        static void m3353g(ViewGroup.MarginLayoutParams marginLayoutParams, int i2) {
            marginLayoutParams.setLayoutDirection(i2);
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static int m3354k(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.getLayoutDirection();
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: n */
        static void m3355n(ViewGroup.MarginLayoutParams marginLayoutParams, int i2) {
            marginLayoutParams.resolveLayoutDirection(i2);
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: q */
        static boolean m3356q(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.isMarginRelative();
        }

        @InterfaceC7830i
        static int toq(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.getMarginEnd();
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: y */
        static void m3357y(ViewGroup.MarginLayoutParams marginLayoutParams, int i2) {
            marginLayoutParams.setMarginStart(i2);
        }

        @InterfaceC7830i
        static int zy(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.getMarginStart();
        }
    }

    private ki() {
    }

    public static void f7l8(@zy.lvui ViewGroup.MarginLayoutParams marginLayoutParams, int i2) {
        C0702k.f7l8(marginLayoutParams, i2);
    }

    /* JADX INFO: renamed from: g */
    public static void m3348g(@zy.lvui ViewGroup.MarginLayoutParams marginLayoutParams, int i2) {
        C0702k.m3353g(marginLayoutParams, i2);
    }

    /* JADX INFO: renamed from: k */
    public static int m3349k(@zy.lvui ViewGroup.MarginLayoutParams marginLayoutParams) {
        int iM3354k = C0702k.m3354k(marginLayoutParams);
        if (iM3354k == 0 || iM3354k == 1) {
            return iM3354k;
        }
        return 0;
    }

    /* JADX INFO: renamed from: n */
    public static void m3350n(@zy.lvui ViewGroup.MarginLayoutParams marginLayoutParams, int i2) {
        C0702k.m3355n(marginLayoutParams, i2);
    }

    /* JADX INFO: renamed from: q */
    public static boolean m3351q(@zy.lvui ViewGroup.MarginLayoutParams marginLayoutParams) {
        return C0702k.m3356q(marginLayoutParams);
    }

    public static int toq(@zy.lvui ViewGroup.MarginLayoutParams marginLayoutParams) {
        return C0702k.toq(marginLayoutParams);
    }

    /* JADX INFO: renamed from: y */
    public static void m3352y(@zy.lvui ViewGroup.MarginLayoutParams marginLayoutParams, int i2) {
        C0702k.m3357y(marginLayoutParams, i2);
    }

    public static int zy(@zy.lvui ViewGroup.MarginLayoutParams marginLayoutParams) {
        return C0702k.zy(marginLayoutParams);
    }
}
