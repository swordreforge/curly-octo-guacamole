package com.android.thememanager.detail.theme.view.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.animation.TranslateAnimation;
import androidx.viewpager.widget.ViewPager;

/* JADX INFO: loaded from: classes2.dex */
public class BounceViewPager extends ViewPager {
    float ls9;
    int qns;
    private Rect ut;
    private InterfaceC1980k wh6;
    private boolean xhv;
    private boolean zm;

    /* JADX INFO: renamed from: com.android.thememanager.detail.theme.view.widget.BounceViewPager$k */
    public interface InterfaceC1980k {
        /* JADX INFO: renamed from: k */
        default void m7755k() {
        }

        default void toq() {
        }
    }

    public BounceViewPager(Context context) {
        super(context);
        this.xhv = true;
        this.ut = new Rect();
        this.ls9 = 0.0f;
        this.qns = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004c  */
    @Override // androidx.viewpager.widget.ViewPager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void jk(int r6, float r7, int r8) {
        /*
            r5 = this;
            androidx.viewpager.widget.k r0 = r5.getAdapter()
            r1 = 0
            if (r0 != 0) goto L16
            androidx.viewpager.widget.k r0 = r5.getAdapter()
            int r0 = r0.mo5575n()
            if (r0 != 0) goto L16
            r5.xhv = r1
            r5.zm = r1
            goto L3b
        L16:
            r0 = 0
            r2 = 1
            if (r6 != 0) goto L23
            int r3 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r3 != 0) goto L23
            if (r8 != 0) goto L23
            r5.xhv = r2
            goto L3b
        L23:
            androidx.viewpager.widget.k r3 = r5.getAdapter()
            int r3 = r3.mo5575n()
            int r3 = r3 - r2
            if (r6 != r3) goto L37
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 != 0) goto L37
            if (r8 != 0) goto L37
            r5.zm = r2
            goto L3b
        L37:
            r5.xhv = r1
            r5.zm = r1
        L3b:
            android.graphics.Rect r0 = r5.ut
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L4c
            android.graphics.Rect r0 = r5.ut
            int r1 = r0.top
            int r0 = r0.bottom
            int r1 = r1 - r0
            if (r1 != 0) goto L61
        L4c:
            android.graphics.Rect r0 = r5.ut
            int r1 = r5.getLeft()
            int r2 = r5.getTop()
            int r3 = r5.getRight()
            int r4 = r5.getBottom()
            r0.set(r1, r2, r3, r4)
        L61:
            super.jk(r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.detail.theme.view.widget.BounceViewPager.jk(int, float, int):void");
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent ev) {
        int action = ev.getAction();
        if (action != 1) {
            if (action == 2) {
                if (this.ls9 == 0.0f) {
                    this.ls9 = ev.getX();
                }
                int x3 = ((int) (this.ls9 - ev.getX())) / 2;
                this.qns = x3;
                if ((this.xhv && x3 <= 0) || (this.zm && x3 >= 0)) {
                    layout(-x3, 0, getMeasuredWidth() - this.qns, getMeasuredHeight());
                    return true;
                }
            }
        } else if (this.xhv || this.zm) {
            vyq(this.qns);
        }
        return super.onTouchEvent(ev);
    }

    public void setOnRefreshListener(InterfaceC1980k listener) {
        this.wh6 = listener;
    }

    public void vyq(int moveX) {
        if (this.wh6 != null) {
            if (moveX > getWidth() / 20) {
                this.wh6.toq();
            } else if (moveX < (-getWidth()) / 20) {
                this.wh6.m7755k();
            }
        }
        this.ls9 = 0.0f;
        TranslateAnimation translateAnimation = new TranslateAnimation(getX(), 0.0f, 0.0f, 0.0f);
        translateAnimation.setDuration(200L);
        startAnimation(translateAnimation);
        layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }

    public BounceViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.xhv = true;
        this.ut = new Rect();
        this.ls9 = 0.0f;
        this.qns = 0;
    }
}
