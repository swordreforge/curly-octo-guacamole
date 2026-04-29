package androidx.core.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.PointerIcon;
import zy.InterfaceC7830i;
import zy.uv6;

/* JADX INFO: compiled from: PointerIconCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class dd {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    public static final int f50755cdj = 1015;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static final int f50756f7l8 = 1004;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    public static final int f50757fn3e = 1019;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    public static final int f50758fu4 = 1000;

    /* JADX INFO: renamed from: g */
    public static final int f3988g = 1003;

    /* JADX INFO: renamed from: h */
    public static final int f3989h = 1014;

    /* JADX INFO: renamed from: i */
    public static final int f3990i = 1018;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    public static final int f50759ki = 1016;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    public static final int f50760kja0 = 1013;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    public static final int f50761ld6 = 1009;

    /* JADX INFO: renamed from: n */
    public static final int f3991n = 1002;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    public static final int f50762n7h = 1012;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    public static final int f50763ni7 = 1021;

    /* JADX INFO: renamed from: p */
    public static final int f3992p = 1008;

    /* JADX INFO: renamed from: q */
    public static final int f3993q = 1001;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    public static final int f50764qrj = 1011;

    /* JADX INFO: renamed from: s */
    public static final int f3994s = 1007;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    public static final int f50765t8r = 1017;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final int f50766toq = 0;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public static final int f50767x2 = 1010;

    /* JADX INFO: renamed from: y */
    public static final int f3995y = 1006;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    public static final int f50768zurt = 1020;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final int f50769zy = 1000;

    /* JADX INFO: renamed from: k */
    private final PointerIcon f3996k;

    /* JADX INFO: renamed from: androidx.core.view.dd$k */
    /* JADX INFO: compiled from: PointerIconCompat.java */
    @zy.hyr(24)
    static class C0681k {
        private C0681k() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static PointerIcon m3152k(Bitmap bitmap, float f2, float f3) {
            return PointerIcon.create(bitmap, f2, f3);
        }

        @InterfaceC7830i
        static PointerIcon toq(Context context, int i2) {
            return PointerIcon.getSystemIcon(context, i2);
        }

        @InterfaceC7830i
        static PointerIcon zy(Resources resources, int i2) {
            return PointerIcon.load(resources, i2);
        }
    }

    private dd(PointerIcon pointerIcon) {
        this.f3996k = pointerIcon;
    }

    @zy.lvui
    /* JADX INFO: renamed from: k */
    public static dd m3150k(@zy.lvui Bitmap bitmap, float f2, float f3) {
        return new dd(C0681k.m3152k(bitmap, f2, f3));
    }

    @zy.lvui
    /* JADX INFO: renamed from: q */
    public static dd m3151q(@zy.lvui Resources resources, int i2) {
        return new dd(C0681k.zy(resources, i2));
    }

    @zy.lvui
    public static dd zy(@zy.lvui Context context, int i2) {
        return new dd(C0681k.toq(context, i2));
    }

    @zy.dd
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public Object toq() {
        return this.f3996k;
    }
}
