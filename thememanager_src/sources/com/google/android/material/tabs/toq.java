package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.animation.C3910k;
import zy.lvui;

/* JADX INFO: compiled from: FadeTabIndicatorInterpolator.java */
/* JADX INFO: loaded from: classes2.dex */
class toq extends zy {

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final float f67919toq = 0.5f;

    toq() {
    }

    @Override // com.google.android.material.tabs.zy
    /* JADX INFO: renamed from: q */
    void mo15006q(TabLayout tabLayout, View view, View view2, float f2, @lvui Drawable drawable) {
        if (f2 >= 0.5f) {
            view = view2;
        }
        RectF rectFM15011k = zy.m15011k(tabLayout, view);
        float qVar = f2 < 0.5f ? C3910k.toq(1.0f, 0.0f, 0.0f, 0.5f, f2) : C3910k.toq(0.0f, 1.0f, 0.5f, 1.0f, f2);
        drawable.setBounds((int) rectFM15011k.left, drawable.getBounds().top, (int) rectFM15011k.right, drawable.getBounds().bottom);
        drawable.setAlpha((int) (qVar * 255.0f));
    }
}
