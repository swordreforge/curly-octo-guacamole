package androidx.core.view;

import android.graphics.Rect;
import android.view.Gravity;
import zy.InterfaceC7830i;

/* JADX INFO: compiled from: GravityCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class qrj {

    /* JADX INFO: renamed from: k */
    public static final int f4100k = 8388608;

    /* JADX INFO: renamed from: q */
    public static final int f4101q = 8388615;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final int f50865toq = 8388611;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final int f50866zy = 8388613;

    /* JADX INFO: renamed from: androidx.core.view.qrj$k */
    /* JADX INFO: compiled from: GravityCompat.java */
    @zy.hyr(17)
    static class C0713k {
        private C0713k() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static void m3433k(int i2, int i3, int i4, Rect rect, int i5, int i6, Rect rect2, int i7) {
            Gravity.apply(i2, i3, i4, rect, i5, i6, rect2, i7);
        }

        @InterfaceC7830i
        static void toq(int i2, int i3, int i4, Rect rect, Rect rect2, int i5) {
            Gravity.apply(i2, i3, i4, rect, rect2, i5);
        }

        @InterfaceC7830i
        static void zy(int i2, Rect rect, Rect rect2, int i3) {
            Gravity.applyDisplay(i2, rect, rect2, i3);
        }
    }

    private qrj() {
    }

    /* JADX INFO: renamed from: k */
    public static void m3431k(int i2, int i3, int i4, @zy.lvui Rect rect, int i5, int i6, @zy.lvui Rect rect2, int i7) {
        C0713k.m3433k(i2, i3, i4, rect, i5, i6, rect2, i7);
    }

    /* JADX INFO: renamed from: q */
    public static int m3432q(int i2, int i3) {
        return Gravity.getAbsoluteGravity(i2, i3);
    }

    public static void toq(int i2, int i3, int i4, @zy.lvui Rect rect, @zy.lvui Rect rect2, int i5) {
        C0713k.toq(i2, i3, i4, rect, rect2, i5);
    }

    public static void zy(int i2, @zy.lvui Rect rect, @zy.lvui Rect rect2, int i3) {
        C0713k.zy(i2, rect, rect2, i3);
    }
}
