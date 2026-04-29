package com.miui.clock.utils;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import zy.dd;

/* JADX INFO: loaded from: classes3.dex */
public class BaseLineSpaceView extends View {
    public BaseLineSpaceView(Context context) {
        super(context);
    }

    @Override // android.view.View
    public int getBaseline() {
        return getMeasuredHeight();
    }

    public BaseLineSpaceView(Context context, @dd AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BaseLineSpaceView(Context context, @dd AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }
}
