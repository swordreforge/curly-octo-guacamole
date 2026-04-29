package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import zy.dd;
import zy.uv6;

/* JADX INFO: renamed from: androidx.core.widget.z */
/* JADX INFO: compiled from: TintableCheckedTextView.java */
/* JADX INFO: loaded from: classes.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
public interface InterfaceC0771z {
    @dd
    ColorStateList getSupportCheckMarkTintList();

    @dd
    PorterDuff.Mode getSupportCheckMarkTintMode();

    void setSupportCheckMarkTintList(@dd ColorStateList colorStateList);

    void setSupportCheckMarkTintMode(@dd PorterDuff.Mode mode);
}
