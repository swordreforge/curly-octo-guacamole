package com.android.thememanager.recommend.view.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.core.view.C0720t;
import androidx.core.view.ch;
import androidx.recyclerview.widget.RecyclerView;
import zy.dd;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class ChildScrollSupportRecyclerView extends RecyclerView {

    /* JADX INFO: renamed from: y */
    private static final int f14483y = -1;

    /* JADX INFO: renamed from: g */
    private int f14484g;

    /* JADX INFO: renamed from: k */
    private int f14485k;

    /* JADX INFO: renamed from: n */
    private int f14486n;

    /* JADX INFO: renamed from: q */
    private int f14487q;

    public ChildScrollSupportRecyclerView(@lvui Context context) {
        super(context);
        this.f14485k = -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent e2) {
        int iZy = C0720t.zy(e2);
        int qVar = C0720t.toq(e2);
        if (iZy == 0) {
            this.f14485k = C0720t.m3458y(e2, 0);
            this.f14487q = (int) (e2.getX() + 0.5f);
            this.f14486n = (int) (e2.getY() + 0.5f);
            return super.onInterceptTouchEvent(e2);
        }
        if (iZy != 2) {
            if (iZy != 5) {
                return super.onInterceptTouchEvent(e2);
            }
            this.f14485k = C0720t.m3458y(e2, qVar);
            this.f14487q = (int) (C0720t.m3455p(e2, qVar) + 0.5f);
            this.f14486n = (int) (C0720t.ld6(e2, qVar) + 0.5f);
            return super.onInterceptTouchEvent(e2);
        }
        int iM3453k = C0720t.m3453k(e2, this.f14485k);
        if (iM3453k < 0) {
            return false;
        }
        int iM3455p = (int) (C0720t.m3455p(e2, iM3453k) + 0.5f);
        int iLd6 = (int) (C0720t.ld6(e2, iM3453k) + 0.5f);
        if (getScrollState() == 1) {
            return super.onInterceptTouchEvent(e2);
        }
        int i2 = iM3455p - this.f14487q;
        int i3 = iLd6 - this.f14486n;
        boolean zCanScrollHorizontally = getLayoutManager().canScrollHorizontally();
        boolean zCanScrollVertically = getLayoutManager().canScrollVertically();
        boolean z2 = zCanScrollHorizontally && Math.abs(i2) > this.f14484g && (Math.abs(i2) >= Math.abs(i3) || zCanScrollVertically);
        if (zCanScrollVertically && Math.abs(i3) > this.f14484g && (Math.abs(i3) >= Math.abs(i2) || zCanScrollHorizontally)) {
            z2 = true;
        }
        return z2 && super.onInterceptTouchEvent(e2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setScrollingTouchSlop(int slopConstant) {
        super.setScrollingTouchSlop(slopConstant);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (slopConstant == 0) {
            this.f14484g = viewConfiguration.getScaledTouchSlop();
        } else {
            if (slopConstant != 1) {
                return;
            }
            this.f14484g = ch.m3144q(viewConfiguration);
        }
    }

    public ChildScrollSupportRecyclerView(@lvui Context context, @dd AttributeSet attrs) {
        super(context, attrs);
        this.f14485k = -1;
    }

    public ChildScrollSupportRecyclerView(@lvui Context context, @dd AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.f14485k = -1;
    }
}
