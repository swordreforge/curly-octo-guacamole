package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.CheckedTextView;
import java.lang.reflect.Field;
import zy.dd;
import zy.hyr;
import zy.lvui;

/* JADX INFO: compiled from: CheckedTextViewCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class zy {

    /* JADX INFO: renamed from: k */
    private static final String f4306k = "CheckedTextViewCompat";

    /* JADX INFO: renamed from: androidx.core.widget.zy$k */
    /* JADX INFO: compiled from: CheckedTextViewCompat.java */
    private static class C0772k {

        /* JADX INFO: renamed from: k */
        private static Field f4307k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private static boolean f50990toq;

        private C0772k() {
        }

        @dd
        /* JADX INFO: renamed from: k */
        static Drawable m3721k(@lvui CheckedTextView checkedTextView) {
            if (!f50990toq) {
                try {
                    Field declaredField = CheckedTextView.class.getDeclaredField("mCheckMarkDrawable");
                    f4307k = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e2) {
                    Log.i(zy.f4306k, "Failed to retrieve mCheckMarkDrawable field", e2);
                }
                f50990toq = true;
            }
            Field field = f4307k;
            if (field != null) {
                try {
                    return (Drawable) field.get(checkedTextView);
                } catch (IllegalAccessException e3) {
                    Log.i(zy.f4306k, "Failed to get check mark drawable via reflection", e3);
                    f4307k = null;
                }
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: CheckedTextViewCompat.java */
    @hyr(16)
    private static class toq {
        private toq() {
        }

        @dd
        /* JADX INFO: renamed from: k */
        static Drawable m3722k(@lvui CheckedTextView checkedTextView) {
            return checkedTextView.getCheckMarkDrawable();
        }
    }

    /* JADX INFO: renamed from: androidx.core.widget.zy$zy, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CheckedTextViewCompat.java */
    @hyr(21)
    private static class C7875zy {
        private C7875zy() {
        }

        @dd
        /* JADX INFO: renamed from: k */
        static ColorStateList m3723k(@lvui CheckedTextView checkedTextView) {
            return checkedTextView.getCheckMarkTintList();
        }

        /* JADX INFO: renamed from: q */
        static void m3724q(@lvui CheckedTextView checkedTextView, @dd PorterDuff.Mode mode) {
            checkedTextView.setCheckMarkTintMode(mode);
        }

        @dd
        static PorterDuff.Mode toq(@lvui CheckedTextView checkedTextView) {
            return checkedTextView.getCheckMarkTintMode();
        }

        static void zy(@lvui CheckedTextView checkedTextView, @dd ColorStateList colorStateList) {
            checkedTextView.setCheckMarkTintList(colorStateList);
        }
    }

    private zy() {
    }

    @dd
    /* JADX INFO: renamed from: k */
    public static Drawable m3718k(@lvui CheckedTextView checkedTextView) {
        return toq.m3722k(checkedTextView);
    }

    /* JADX INFO: renamed from: n */
    public static void m3719n(@lvui CheckedTextView checkedTextView, @dd PorterDuff.Mode mode) {
        C7875zy.m3724q(checkedTextView, mode);
    }

    /* JADX INFO: renamed from: q */
    public static void m3720q(@lvui CheckedTextView checkedTextView, @dd ColorStateList colorStateList) {
        C7875zy.zy(checkedTextView, colorStateList);
    }

    @dd
    public static ColorStateList toq(@lvui CheckedTextView checkedTextView) {
        return C7875zy.m3723k(checkedTextView);
    }

    @dd
    public static PorterDuff.Mode zy(@lvui CheckedTextView checkedTextView) {
        return C7875zy.toq(checkedTextView);
    }
}
