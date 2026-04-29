package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.animation.C3910k;
import com.google.android.material.internal.C4058z;
import com.google.android.material.tabs.TabLayout;
import zy.cdj;
import zy.dd;
import zy.lvui;
import zy.zurt;

/* JADX INFO: compiled from: TabIndicatorInterpolator.java */
/* JADX INFO: loaded from: classes2.dex */
class zy {

    /* JADX INFO: renamed from: k */
    @cdj(unit = 0)
    private static final int f25203k = 24;

    zy() {
    }

    /* JADX INFO: renamed from: k */
    static RectF m15011k(TabLayout tabLayout, @dd View view) {
        return view == null ? new RectF() : (tabLayout.jk() || !(view instanceof TabLayout.TabView)) ? new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()) : toq((TabLayout.TabView) view, 24);
    }

    static RectF toq(@lvui TabLayout.TabView tabView, @cdj(unit = 0) int i2) {
        int contentWidth = tabView.getContentWidth();
        int contentHeight = tabView.getContentHeight();
        int iM14624n = (int) C4058z.m14624n(tabView.getContext(), i2);
        if (contentWidth < iM14624n) {
            contentWidth = iM14624n;
        }
        int left = (tabView.getLeft() + tabView.getRight()) / 2;
        int top = (tabView.getTop() + tabView.getBottom()) / 2;
        int i3 = contentWidth / 2;
        return new RectF(left - i3, top - (contentHeight / 2), i3 + left, top + (left / 2));
    }

    /* JADX INFO: renamed from: q */
    void mo15006q(TabLayout tabLayout, View view, View view2, @zurt(from = 0.0d, to = 1.0d) float f2, @lvui Drawable drawable) {
        RectF rectFM15011k = m15011k(tabLayout, view);
        RectF rectFM15011k2 = m15011k(tabLayout, view2);
        drawable.setBounds(C3910k.zy((int) rectFM15011k.left, (int) rectFM15011k2.left, f2), drawable.getBounds().top, C3910k.zy((int) rectFM15011k.right, (int) rectFM15011k2.right, f2), drawable.getBounds().bottom);
    }

    void zy(TabLayout tabLayout, View view, @lvui Drawable drawable) {
        RectF rectFM15011k = m15011k(tabLayout, view);
        drawable.setBounds((int) rectFM15011k.left, drawable.getBounds().top, (int) rectFM15011k.right, drawable.getBounds().bottom);
    }
}
