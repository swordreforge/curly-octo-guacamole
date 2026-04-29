package com.miui.maml.util;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewManager;
import zy.dd;

/* JADX INFO: loaded from: classes3.dex */
public interface MamlViewManager extends ViewManager {
    void addView(View view, int i2, ViewGroup.LayoutParams layoutParams);

    @dd
    default Context getViewContext() {
        return null;
    }

    @dd
    default Rect getViewLocationOnScreen() {
        return null;
    }
}
