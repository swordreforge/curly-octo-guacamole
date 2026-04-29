package com.google.android.material.textfield;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.core.view.C0683f;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Arrays;
import zy.dd;
import zy.lvui;

/* JADX INFO: renamed from: com.google.android.material.textfield.g */
/* JADX INFO: compiled from: IconHelper.java */
/* JADX INFO: loaded from: classes2.dex */
class C4156g {
    private C4156g() {
    }

    /* JADX INFO: renamed from: g */
    static void m15059g(@lvui CheckableImageButton checkableImageButton, @dd View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        m15062q(checkableImageButton, onLongClickListener);
    }

    /* JADX INFO: renamed from: k */
    static void m15060k(@lvui TextInputLayout textInputLayout, @lvui CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = androidx.core.graphics.drawable.zy.ki(drawable).mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                androidx.core.graphics.drawable.zy.kja0(drawable, colorStateList);
            } else {
                androidx.core.graphics.drawable.zy.kja0(drawable, ColorStateList.valueOf(colorStateList.getColorForState(toq(textInputLayout, checkableImageButton), colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                androidx.core.graphics.drawable.zy.m2442h(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    /* JADX INFO: renamed from: n */
    static void m15061n(@lvui CheckableImageButton checkableImageButton, @dd View.OnClickListener onClickListener, @dd View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        m15062q(checkableImageButton, onLongClickListener);
    }

    /* JADX INFO: renamed from: q */
    private static void m15062q(@lvui CheckableImageButton checkableImageButton, @dd View.OnLongClickListener onLongClickListener) {
        boolean zD8wk = C0683f.d8wk(checkableImageButton);
        boolean z2 = onLongClickListener != null;
        boolean z3 = zD8wk || z2;
        checkableImageButton.setFocusable(z3);
        checkableImageButton.setClickable(zD8wk);
        checkableImageButton.setPressable(zD8wk);
        checkableImageButton.setLongClickable(z2);
        C0683f.o05(checkableImageButton, z3 ? 1 : 2);
    }

    private static int[] toq(@lvui TextInputLayout textInputLayout, @lvui CheckableImageButton checkableImageButton) {
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
        return iArrCopyOf;
    }

    static void zy(@lvui TextInputLayout textInputLayout, @lvui CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int colorForState = colorStateList.getColorForState(toq(textInputLayout, checkableImageButton), colorStateList.getDefaultColor());
        Drawable drawableMutate = androidx.core.graphics.drawable.zy.ki(drawable).mutate();
        androidx.core.graphics.drawable.zy.kja0(drawableMutate, ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(drawableMutate);
    }
}
