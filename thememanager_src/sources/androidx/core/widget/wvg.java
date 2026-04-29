package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import zy.dd;

/* JADX INFO: compiled from: TintableCompoundDrawablesView.java */
/* JADX INFO: loaded from: classes.dex */
public interface wvg {
    @dd
    ColorStateList getSupportCompoundDrawablesTintList();

    @dd
    PorterDuff.Mode getSupportCompoundDrawablesTintMode();

    void setSupportCompoundDrawablesTintList(@dd ColorStateList colorStateList);

    void setSupportCompoundDrawablesTintMode(@dd PorterDuff.Mode mode);
}
