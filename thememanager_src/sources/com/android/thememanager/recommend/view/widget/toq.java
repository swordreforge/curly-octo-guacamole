package com.android.thememanager.recommend.view.widget;

import android.annotation.SuppressLint;
import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: compiled from: TextureVideoViewOutlineProvider.java */
/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"NewApi"})
public class toq extends ViewOutlineProvider {

    /* JADX INFO: renamed from: k */
    private float f14613k;

    public toq(float radius) {
        this.f14613k = radius;
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(View view, Outline outline) {
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        outline.setRoundRect(new Rect(0, 0, rect.right - rect.left, rect.bottom - rect.top), this.f14613k);
    }
}
