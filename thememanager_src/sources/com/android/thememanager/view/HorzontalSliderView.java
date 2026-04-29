package com.android.thememanager.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import com.android.thememanager.fn3e;

/* JADX INFO: loaded from: classes2.dex */
public class HorzontalSliderView extends LinearLayout {

    /* JADX INFO: renamed from: g */
    private int f17277g;

    /* JADX INFO: renamed from: k */
    private Drawable f17278k;

    /* JADX INFO: renamed from: n */
    private int f17279n;

    /* JADX INFO: renamed from: p */
    private InterfaceC2886k f17280p;

    /* JADX INFO: renamed from: q */
    private int f17281q;

    /* JADX INFO: renamed from: s */
    private int f17282s;

    /* JADX INFO: renamed from: y */
    private int f17283y;

    /* JADX INFO: renamed from: com.android.thememanager.view.HorzontalSliderView$k */
    public interface InterfaceC2886k {
        /* JADX INFO: renamed from: k */
        void m10246k(float movePercentFromCenter, boolean stopMove);
    }

    public HorzontalSliderView(Context context) {
        this(context, null);
    }

    private int getCenterPostionForSlider() {
        if (this.f17283y < 0) {
            this.f17279n = getPaddingLeft();
            int width = (getWidth() - this.f17278k.getIntrinsicWidth()) - getPaddingRight();
            this.f17277g = width;
            this.f17283y = (width + this.f17279n) / 2;
        }
        return this.f17283y;
    }

    private int getSliderCanMoveDistance() {
        return (this.f17277g - this.f17279n) / 2;
    }

    /* JADX INFO: renamed from: k */
    private boolean m10245k(int x3) {
        int i2 = this.f17281q;
        return i2 <= x3 && x3 <= i2 + this.f17278k.getIntrinsicWidth();
    }

    private void zy(int pointerXMoveDistance, boolean stopMove) {
        int i2 = this.f17281q;
        int centerPostionForSlider = getCenterPostionForSlider() + pointerXMoveDistance;
        int i3 = this.f17279n;
        if (centerPostionForSlider < i3) {
            centerPostionForSlider = i3;
        }
        int i4 = this.f17277g;
        if (centerPostionForSlider > i4) {
            centerPostionForSlider = i4;
        }
        if (i2 != centerPostionForSlider) {
            this.f17281q = centerPostionForSlider;
            invalidate();
            if (this.f17280p != null) {
                this.f17280p.m10246k(Math.max(-1.0f, Math.min(1.0f, (pointerXMoveDistance * 1.0f) / getSliderCanMoveDistance())), stopMove);
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f17281q < 0) {
            this.f17281q = getCenterPostionForSlider();
        }
        int saveCount = canvas.getSaveCount();
        canvas.translate(this.f17281q, getPaddingTop());
        this.f17278k.draw(canvas);
        canvas.restoreToCount(saveCount);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        int i2;
        int x3 = (int) event.getX();
        int action = event.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2 && (i2 = this.f17282s) >= 0) {
                    zy(x3 - i2, false);
                }
            } else if (this.f17282s >= 0) {
                zy(0, true);
                this.f17282s = -1;
            }
        } else if (m10245k(x3)) {
            this.f17282s = x3;
        }
        return true;
    }

    public void toq(InterfaceC2886k l2) {
        this.f17280p = l2;
    }

    public HorzontalSliderView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public HorzontalSliderView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.f17281q = -1;
        this.f17279n = -1;
        this.f17277g = -1;
        this.f17283y = -1;
        this.f17282s = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, fn3e.C2036i.irg4);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(2);
        this.f17278k = drawable;
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), this.f17278k.getIntrinsicHeight());
        typedArrayObtainStyledAttributes.recycle();
    }
}
