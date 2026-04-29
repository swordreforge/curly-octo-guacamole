package com.android.thememanager.detail.video.view.widget;

import android.view.View;
import com.android.thememanager.detail.video.view.widget.VerticalViewPager;
import zy.lvui;

/* JADX INFO: renamed from: com.android.thememanager.detail.video.view.widget.k */
/* JADX INFO: compiled from: DefaultTransformer.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2030k implements VerticalViewPager.ld6 {
    @Override // com.android.thememanager.detail.video.view.widget.VerticalViewPager.ld6
    public void transformPage(@lvui View page, float position) {
        float f2 = 0.0f;
        if (0.0f <= position && position <= 1.0f) {
            f2 = 1.0f - position;
        } else if (-1.0f < position && position < 0.0f) {
            f2 = position + 1.0f;
        }
        page.setAlpha(f2);
        page.setTranslationX(page.getWidth() * (-position));
        page.setTranslationY(position * page.getHeight());
    }
}
