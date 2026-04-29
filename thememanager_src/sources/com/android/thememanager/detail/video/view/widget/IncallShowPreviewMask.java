package com.android.thememanager.detail.video.view.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.thememanager.R;
import zy.dd;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class IncallShowPreviewMask extends FrameLayout {
    public IncallShowPreviewMask(@lvui Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        return false;
    }

    public IncallShowPreviewMask(@lvui Context context, @dd AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public IncallShowPreviewMask(@lvui Context context, @dd AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        LayoutInflater.from(context).inflate(R.layout.de_incall_show_preview_mask, (ViewGroup) this, true);
    }
}
