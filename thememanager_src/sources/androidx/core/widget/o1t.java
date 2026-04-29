package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import zy.dd;

/* JADX INFO: compiled from: TintableCompoundButton.java */
/* JADX INFO: loaded from: classes.dex */
public interface o1t {
    @dd
    ColorStateList getSupportButtonTintList();

    @dd
    PorterDuff.Mode getSupportButtonTintMode();

    void setSupportButtonTintList(@dd ColorStateList colorStateList);

    void setSupportButtonTintMode(@dd PorterDuff.Mode mode);
}
