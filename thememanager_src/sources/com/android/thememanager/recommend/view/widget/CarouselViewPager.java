package com.android.thememanager.recommend.view.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewParent;
import androidx.viewpager.widget.ViewPager;
import miuix.springback.view.SpringBackLayout;
import zy.dd;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class CarouselViewPager extends ViewPager {
    public CarouselViewPager(@lvui Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent ev) {
        ViewParent parent = getParent();
        boolean z2 = false;
        while (true) {
            if (parent != null) {
                if (parent instanceof ViewPager) {
                    ViewPager viewPager = (ViewPager) parent;
                    if (viewPager.getAdapter() != null) {
                        z2 = (viewPager.getCurrentItem() == 0 && getCurrentItem() != 0) || viewPager.getCurrentItem() == viewPager.getAdapter().mo5575n() - 1;
                    }
                }
                if (z2 && (parent instanceof SpringBackLayout)) {
                    ((SpringBackLayout) parent).cdj(true);
                    break;
                }
                parent = parent.getParent();
            } else {
                break;
            }
        }
        return super.dispatchTouchEvent(ev);
    }

    public CarouselViewPager(@lvui Context context, @dd AttributeSet attrs) {
        super(context, attrs);
    }
}
