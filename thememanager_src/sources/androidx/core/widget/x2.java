package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.ImageView;
import zy.InterfaceC7830i;
import zy.dd;
import zy.hyr;
import zy.lvui;

/* JADX INFO: compiled from: ImageViewCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class x2 {

    /* JADX INFO: renamed from: androidx.core.widget.x2$k */
    /* JADX INFO: compiled from: ImageViewCompat.java */
    @hyr(21)
    static class C0769k {
        private C0769k() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static ColorStateList m3715k(ImageView imageView) {
            return imageView.getImageTintList();
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: q */
        static void m3716q(ImageView imageView, PorterDuff.Mode mode) {
            imageView.setImageTintMode(mode);
        }

        @InterfaceC7830i
        static PorterDuff.Mode toq(ImageView imageView) {
            return imageView.getImageTintMode();
        }

        @InterfaceC7830i
        static void zy(ImageView imageView, ColorStateList colorStateList) {
            imageView.setImageTintList(colorStateList);
        }
    }

    private x2() {
    }

    @dd
    /* JADX INFO: renamed from: k */
    public static ColorStateList m3713k(@lvui ImageView imageView) {
        return C0769k.m3715k(imageView);
    }

    /* JADX INFO: renamed from: q */
    public static void m3714q(@lvui ImageView imageView, @dd PorterDuff.Mode mode) {
        C0769k.m3716q(imageView, mode);
    }

    @dd
    public static PorterDuff.Mode toq(@lvui ImageView imageView) {
        return C0769k.toq(imageView);
    }

    public static void zy(@lvui ImageView imageView, @dd ColorStateList colorStateList) {
        C0769k.zy(imageView, colorStateList);
    }
}
