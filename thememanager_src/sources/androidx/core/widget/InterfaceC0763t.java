package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import zy.dd;
import zy.uv6;

/* JADX INFO: renamed from: androidx.core.widget.t */
/* JADX INFO: compiled from: TintableImageSourceView.java */
/* JADX INFO: loaded from: classes.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
public interface InterfaceC0763t {
    @dd
    ColorStateList getSupportImageTintList();

    @dd
    PorterDuff.Mode getSupportImageTintMode();

    void setSupportImageTintList(@dd ColorStateList colorStateList);

    void setSupportImageTintMode(@dd PorterDuff.Mode mode);
}
