package com.android.thememanager.comment.view.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.android.thememanager.basemodule.views.FilledListView;

/* JADX INFO: loaded from: classes2.dex */
public class ResourceCommentsListView extends FilledListView {

    /* JADX INFO: renamed from: c */
    private int f10822c;

    /* JADX INFO: renamed from: e */
    private boolean f10823e;

    /* JADX INFO: renamed from: f */
    private float f10824f;

    /* JADX INFO: renamed from: l */
    private int f10825l;

    /* JADX INFO: renamed from: r */
    private View f10826r;

    /* JADX INFO: renamed from: t */
    private final float f10827t;

    public ResourceCommentsListView(Context context) {
        super(context);
        this.f10827t = 1.0f;
        this.f10823e = true;
        setExceedPixel(2);
        zy(0);
    }

    private void f7l8(int offset) {
        if (offset != 0) {
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                getChildAt(i2).offsetTopAndBottom(offset);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    private boolean m7446g() {
        return getScrollDistance() == 0;
    }

    /* JADX INFO: renamed from: n */
    private boolean m7447n() {
        return getLastVisiblePosition() == getCount() - 1 && this.f10560s.getTop() + this.f10560s.getHeight() == getHeight();
    }

    /* JADX INFO: renamed from: q */
    private void m7448q(int offset, boolean mobility) {
        View view = this.f10826r;
        if (view != null && mobility) {
            int scrollY = -offset;
            if (offset < 0) {
                if (view.getScrollY() < this.f10825l && getScrollDistance() >= 0) {
                    int scrollY2 = this.f10826r.getScrollY() + scrollY;
                    int i2 = this.f10825l;
                    if (scrollY2 > i2) {
                        scrollY = i2 - this.f10826r.getScrollY();
                    }
                    this.f10822c -= scrollY;
                    this.f10826r.scrollBy(0, scrollY);
                    offset += scrollY;
                }
            } else if (view.getScrollY() > 0 && getScrollDistance() - offset <= 0) {
                if (this.f10826r.getScrollY() + scrollY < 0) {
                    scrollY = -this.f10826r.getScrollY();
                }
                this.f10822c -= scrollY;
                this.f10826r.scrollBy(0, scrollY);
                offset += scrollY;
            }
        }
        f7l8(offset);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    @Override // android.widget.AbsListView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            int r0 = r8.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 0
            if (r0 != 0) goto Le
            r7.f10822c = r1
            r2 = 0
            r7.f10824f = r2
        Le:
            float r2 = r8.getX()
            float r3 = r8.getY()
            int r4 = r7.f10822c
            float r4 = (float) r4
            float r3 = r3 + r4
            r8.setLocation(r2, r3)
            r2 = 2
            if (r0 != r2) goto L5f
            android.view.View r0 = r7.f10826r
            if (r0 == 0) goto L5f
            float r2 = r7.f10824f
            float r4 = r3 - r2
            r5 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            r6 = 1
            if (r4 <= 0) goto L39
            int r0 = r0.getScrollY()
            if (r0 <= 0) goto L37
        L35:
            r0 = r6
            goto L47
        L37:
            r0 = r1
            goto L47
        L39:
            float r2 = r2 - r3
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 <= 0) goto L5e
            int r0 = r0.getScrollY()
            int r2 = r7.f10825l
            if (r0 >= r2) goto L37
            goto L35
        L47:
            if (r0 == 0) goto L5f
            boolean r0 = r7.m7446g()
            if (r0 == 0) goto L54
            r0 = -1
            r7.m7448q(r0, r1)
            goto L5f
        L54:
            boolean r0 = r7.m7447n()
            if (r0 == 0) goto L5f
            r7.m7448q(r6, r1)
            goto L5f
        L5e:
            return r1
        L5f:
            r7.f10824f = r3
            boolean r8 = super.onTouchEvent(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.comment.view.widget.ResourceCommentsListView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setMobility(boolean mobility) {
        this.f10823e = mobility;
    }

    public void setMoveableView(View moveableView, int maxMoveDistance) {
        this.f10826r = moveableView;
        this.f10825l = maxMoveDistance;
    }

    public boolean toq() {
        return getCount() == getHeaderViewsCount() + getFooterViewsCount();
    }

    public void zy(int offset) {
        m7448q(offset, this.f10823e);
    }

    public ResourceCommentsListView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f10827t = 1.0f;
        this.f10823e = true;
        setExceedPixel(2);
        zy(0);
    }

    public ResourceCommentsListView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.f10827t = 1.0f;
        this.f10823e = true;
        setExceedPixel(2);
        zy(0);
    }
}
