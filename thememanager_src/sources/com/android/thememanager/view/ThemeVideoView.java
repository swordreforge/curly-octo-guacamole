package com.android.thememanager.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.VideoView;

/* JADX INFO: loaded from: classes2.dex */
public class ThemeVideoView extends VideoView {
    public ThemeVideoView(Context context) {
        super(context);
    }

    @Override // android.widget.VideoView, android.view.SurfaceView, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(View.getDefaultSize(getWidth(), widthMeasureSpec), View.getDefaultSize(getHeight(), heightMeasureSpec));
    }

    public ThemeVideoView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ThemeVideoView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public ThemeVideoView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }
}
