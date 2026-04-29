package com.android.thememanager.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes2.dex */
public class SlidingFrameLayout extends FrameLayout {
    private ViewTreeObserver.OnPreDrawListener preDrawListener;
    private float yFraction;

    /* JADX INFO: renamed from: com.android.thememanager.view.SlidingFrameLayout$k */
    class ViewTreeObserverOnPreDrawListenerC2906k implements ViewTreeObserver.OnPreDrawListener {
        ViewTreeObserverOnPreDrawListenerC2906k() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            SlidingFrameLayout.this.getViewTreeObserver().removeOnPreDrawListener(SlidingFrameLayout.this.preDrawListener);
            SlidingFrameLayout slidingFrameLayout = SlidingFrameLayout.this;
            slidingFrameLayout.setYFraction(slidingFrameLayout.yFraction);
            return true;
        }
    }

    public SlidingFrameLayout(Context context) {
        super(context);
        this.yFraction = 0.0f;
        this.preDrawListener = null;
    }

    public void setYFraction(float fraction) {
        this.yFraction = fraction;
        if (getHeight() != 0) {
            setTranslationY(getHeight() * fraction);
        } else if (this.preDrawListener == null) {
            this.preDrawListener = new ViewTreeObserverOnPreDrawListenerC2906k();
            getViewTreeObserver().addOnPreDrawListener(this.preDrawListener);
        }
    }

    public SlidingFrameLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.yFraction = 0.0f;
        this.preDrawListener = null;
    }

    public SlidingFrameLayout(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.yFraction = 0.0f;
        this.preDrawListener = null;
    }
}
