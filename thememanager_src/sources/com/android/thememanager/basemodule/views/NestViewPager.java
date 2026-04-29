package com.android.thememanager.basemodule.views;

import android.content.Context;
import android.util.AttributeSet;
import androidx.viewpager.widget.ViewPager;
import zy.dd;
import zy.lvui;

/* JADX INFO: loaded from: classes.dex */
public class NestViewPager extends ViewPager {

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.views.NestViewPager$k */
    public interface InterfaceC1846k<T> {
        default T getItem(int pos) {
            return null;
        }
    }

    public interface toq {
        /* JADX INFO: renamed from: f */
        boolean mo7321f(int direction);
    }

    public NestViewPager(@lvui Context context) {
        super(context);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean canScrollHorizontally(int direction) {
        Object adapter = getAdapter();
        if (adapter instanceof InterfaceC1846k) {
            Object item = ((InterfaceC1846k) adapter).getItem(getCurrentItem());
            if (item instanceof toq) {
                return super.canScrollHorizontally(direction) || ((toq) item).mo7321f(direction);
            }
        }
        return super.canScrollHorizontally(direction);
    }

    public NestViewPager(@lvui Context context, @dd AttributeSet attrs) {
        super(context, attrs);
    }
}
