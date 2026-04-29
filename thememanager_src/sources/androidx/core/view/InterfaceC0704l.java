package androidx.core.view;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;

/* JADX INFO: renamed from: androidx.core.view.l */
/* JADX INFO: compiled from: TintableBackgroundView.java */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0704l {
    @zy.dd
    ColorStateList getSupportBackgroundTintList();

    @zy.dd
    PorterDuff.Mode getSupportBackgroundTintMode();

    void setSupportBackgroundTintList(@zy.dd ColorStateList colorStateList);

    void setSupportBackgroundTintMode(@zy.dd PorterDuff.Mode mode);
}
