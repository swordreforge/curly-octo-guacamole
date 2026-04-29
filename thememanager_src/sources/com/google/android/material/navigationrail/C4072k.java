package com.google.android.material.navigationrail;

import android.content.Context;
import android.view.View;
import com.google.android.material.navigation.NavigationBarItemView;
import ij.C6095k;
import zy.InterfaceC7829h;
import zy.gvn7;
import zy.lvui;
import zy.uv6;

/* JADX INFO: renamed from: com.google.android.material.navigationrail.k */
/* JADX INFO: compiled from: NavigationRailItemView.java */
/* JADX INFO: loaded from: classes2.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP})
final class C4072k extends NavigationBarItemView {
    public C4072k(@lvui Context context) {
        super(context);
    }

    @Override // com.google.android.material.navigation.NavigationBarItemView
    @InterfaceC7829h
    protected int getItemDefaultMarginResId() {
        return C6095k.g.yl24;
    }

    @Override // com.google.android.material.navigation.NavigationBarItemView
    @gvn7
    protected int getItemLayoutResId() {
        return C6095k.ld6.f79325mu;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (View.MeasureSpec.getMode(i3) == 0) {
            setMeasuredDimension(getMeasuredWidthAndState(), View.resolveSizeAndState(Math.max(getMeasuredHeight(), View.MeasureSpec.getSize(i3)), i3, 0));
        }
    }
}
