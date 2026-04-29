package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.animation.C3910k;
import zy.lvui;
import zy.zurt;

/* JADX INFO: renamed from: com.google.android.material.tabs.k */
/* JADX INFO: compiled from: ElasticTabIndicatorInterpolator.java */
/* JADX INFO: loaded from: classes2.dex */
class C4145k extends zy {
    C4145k() {
    }

    /* JADX INFO: renamed from: g */
    private static float m15004g(@zurt(from = 0.0d, to = 1.0d) float f2) {
        return (float) Math.sin((((double) f2) * 3.141592653589793d) / 2.0d);
    }

    /* JADX INFO: renamed from: n */
    private static float m15005n(@zurt(from = 0.0d, to = 1.0d) float f2) {
        return (float) (1.0d - Math.cos((((double) f2) * 3.141592653589793d) / 2.0d));
    }

    @Override // com.google.android.material.tabs.zy
    /* JADX INFO: renamed from: q */
    void mo15006q(TabLayout tabLayout, View view, View view2, float f2, @lvui Drawable drawable) {
        float fM15004g;
        float fM15005n;
        RectF rectFM15011k = zy.m15011k(tabLayout, view);
        RectF rectFM15011k2 = zy.m15011k(tabLayout, view2);
        if (rectFM15011k.left < rectFM15011k2.left) {
            fM15004g = m15005n(f2);
            fM15005n = m15004g(f2);
        } else {
            fM15004g = m15004g(f2);
            fM15005n = m15005n(f2);
        }
        drawable.setBounds(C3910k.zy((int) rectFM15011k.left, (int) rectFM15011k2.left, fM15004g), drawable.getBounds().top, C3910k.zy((int) rectFM15011k.right, (int) rectFM15011k2.right, fM15005n), drawable.getBounds().bottom);
    }
}
