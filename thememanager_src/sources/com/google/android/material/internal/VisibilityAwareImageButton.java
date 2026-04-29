package com.google.android.material.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;
import zy.uv6;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"AppCompatCustomView"})
@uv6({uv6.EnumC7844k.LIBRARY_GROUP})
public class VisibilityAwareImageButton extends ImageButton {

    /* JADX INFO: renamed from: k */
    private int f24541k;

    public VisibilityAwareImageButton(Context context) {
        this(context, null);
    }

    public final int getUserSetVisibility() {
        return this.f24541k;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i2) {
        zy(i2, true);
    }

    public final void zy(int i2, boolean z2) {
        super.setVisibility(i2);
        if (z2) {
            this.f24541k = i2;
        }
    }

    public VisibilityAwareImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VisibilityAwareImageButton(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f24541k = getVisibility();
    }
}
