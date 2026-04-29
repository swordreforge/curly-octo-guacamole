package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;
import java.lang.reflect.Field;
import zy.InterfaceC7830i;
import zy.dd;
import zy.hyr;
import zy.lvui;

/* JADX INFO: renamed from: androidx.core.widget.q */
/* JADX INFO: compiled from: CompoundButtonCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0760q {

    /* JADX INFO: renamed from: k */
    private static final String f4292k = "CompoundButtonCompat";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static Field f50979toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static boolean f50980zy;

    /* JADX INFO: renamed from: androidx.core.widget.q$k */
    /* JADX INFO: compiled from: CompoundButtonCompat.java */
    @hyr(21)
    static class k {
        private k() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static ColorStateList m3666k(CompoundButton compoundButton) {
            return compoundButton.getButtonTintList();
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: q */
        static void m3667q(CompoundButton compoundButton, PorterDuff.Mode mode) {
            compoundButton.setButtonTintMode(mode);
        }

        @InterfaceC7830i
        static PorterDuff.Mode toq(CompoundButton compoundButton) {
            return compoundButton.getButtonTintMode();
        }

        @InterfaceC7830i
        static void zy(CompoundButton compoundButton, ColorStateList colorStateList) {
            compoundButton.setButtonTintList(colorStateList);
        }
    }

    /* JADX INFO: renamed from: androidx.core.widget.q$toq */
    /* JADX INFO: compiled from: CompoundButtonCompat.java */
    @hyr(23)
    static class toq {
        private toq() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static Drawable m3668k(CompoundButton compoundButton) {
            return compoundButton.getButtonDrawable();
        }
    }

    private C0760q() {
    }

    @dd
    /* JADX INFO: renamed from: k */
    public static Drawable m3663k(@lvui CompoundButton compoundButton) {
        return toq.m3668k(compoundButton);
    }

    /* JADX INFO: renamed from: n */
    public static void m3664n(@lvui CompoundButton compoundButton, @dd PorterDuff.Mode mode) {
        k.m3667q(compoundButton, mode);
    }

    /* JADX INFO: renamed from: q */
    public static void m3665q(@lvui CompoundButton compoundButton, @dd ColorStateList colorStateList) {
        k.zy(compoundButton, colorStateList);
    }

    @dd
    public static ColorStateList toq(@lvui CompoundButton compoundButton) {
        return k.m3666k(compoundButton);
    }

    @dd
    public static PorterDuff.Mode zy(@lvui CompoundButton compoundButton) {
        return k.toq(compoundButton);
    }
}
