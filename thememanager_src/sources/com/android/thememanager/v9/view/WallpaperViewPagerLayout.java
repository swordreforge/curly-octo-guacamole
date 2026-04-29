package com.android.thememanager.v9.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager.widget.WallpaperViewPager;
import com.android.thememanager.R;
import com.android.thememanager.v9.WallpaperSubjectActivity;
import com.android.thememanager.v9.adapter.zy;
import com.android.thememanager.v9.data.C2853p;
import miuix.springback.view.SpringBackLayout;
import zy.dd;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class WallpaperViewPagerLayout extends FrameLayout implements ViewPager.InterfaceC1284p {

    /* JADX INFO: renamed from: l */
    private static String f17189l = "WallpaperViewPagerLayout";

    /* JADX INFO: renamed from: g */
    private WallpaperSubjectActivity f17190g;

    /* JADX INFO: renamed from: h */
    private boolean f17191h;

    /* JADX INFO: renamed from: i */
    private int f17192i;

    /* JADX INFO: renamed from: k */
    private WallpaperViewPager f17193k;

    /* JADX INFO: renamed from: n */
    private ImageView f17194n;

    /* JADX INFO: renamed from: p */
    private float f17195p;

    /* JADX INFO: renamed from: q */
    private ImageView f17196q;

    /* JADX INFO: renamed from: r */
    private int f17197r;

    /* JADX INFO: renamed from: s */
    private int f17198s;

    /* JADX INFO: renamed from: t */
    private int f17199t;

    /* JADX INFO: renamed from: y */
    private C2853p f17200y;

    /* JADX INFO: renamed from: z */
    private int f17201z;

    public WallpaperViewPagerLayout(@lvui Context context, @dd AttributeSet attrs) {
        super(context, attrs, 0);
        this.f17198s = 0;
        this.f17191h = true;
        this.f17192i = 0;
        this.f17201z = 0;
        this.f17199t = 0;
        this.f17197r = 0;
        m10212n(context);
    }

    /* JADX INFO: renamed from: n */
    private void m10212n(Context context) {
        LayoutInflater.from(context).inflate(R.layout.wallpaper_subject_viewpager_layout, this);
        this.f17196q = (ImageView) findViewById(R.id.left_shade);
        this.f17194n = (ImageView) findViewById(R.id.right_shade);
        this.f17196q.setVisibility(8);
        this.f17194n.setVisibility(8);
        WallpaperViewPager wallpaperViewPager = (WallpaperViewPager) findViewById(R.id.viewpager);
        this.f17193k = wallpaperViewPager;
        wallpaperViewPager.setOffscreenPageLimit(2);
        this.f17193k.zy(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent ev) {
        int action = ev.getAction();
        if (action == 0) {
            this.f17195p = ev.getX();
        } else if ((action == 1 || action == 3) && ev.getX() - this.f17195p < 0.0f && !this.f17193k.canScrollHorizontally(1)) {
            this.f17191h = false;
            this.f17200y.ki();
        }
        return super.dispatchTouchEvent(ev);
    }

    /* JADX INFO: renamed from: g */
    public void m10213g() {
        View currentView = this.f17193k.getCurrentView();
        View[] viewArrM5571e = this.f17193k.m5571e();
        if (viewArrM5571e == null || this.f17190g == null) {
            return;
        }
        for (View view : viewArrM5571e) {
            if (view != null && view.findViewById(R.id.pager_wallpaper) != null) {
                if (currentView == view) {
                    view.findViewById(R.id.pager_wallpaper).setOnClickListener(this.f17190g);
                } else {
                    view.findViewById(R.id.pager_wallpaper).setOnClickListener(null);
                }
            }
        }
    }

    public boolean getCanSlideLeft() {
        return this.f17191h;
    }

    public WallpaperViewPager getViewPager() {
        return this.f17193k;
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC1284p
    /* JADX INFO: renamed from: k */
    public void mo5550k(int state) {
        WallpaperViewPager wallpaperViewPager = this.f17193k;
        if (wallpaperViewPager == null || this.f17198s >= wallpaperViewPager.getCount() || state != 0) {
            return;
        }
        m10213g();
    }

    /* JADX INFO: renamed from: q */
    public void m10214q(WallpaperSubjectActivity activity, zy adapter) {
        this.f17190g = activity;
        this.f17193k.setAdapter(adapter);
        this.f17200y = adapter.ni7();
    }

    public void setCanSlideLeft(boolean canSlideLeft) {
        this.f17191h = canSlideLeft;
    }

    public void setViewPagerPadding(int paddingLeft, int paddingRight, float height, int firstPaddingLeft) {
        this.f17199t = firstPaddingLeft;
        if (paddingLeft == paddingRight) {
            this.f17192i = paddingLeft;
            this.f17201z = paddingRight;
        } else {
            int i2 = (paddingLeft + paddingRight) / 2;
            this.f17201z = i2;
            this.f17192i = i2;
        }
        this.f17193k.setPadding(paddingLeft, 0, paddingRight, 0);
        SpringBackLayout springBackLayout = (SpringBackLayout) findViewById(R.id.spring_back_layout);
        ViewGroup.LayoutParams layoutParams = springBackLayout.getLayoutParams();
        layoutParams.height = (int) height;
        springBackLayout.setLayoutParams(layoutParams);
        this.f17197r = this.f17192i - this.f17199t;
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC1284p
    public void toq(int position) {
        this.f17198s = position;
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC1284p
    public void zy(int position, float positionOffset, int positionOffsetPixels) {
        if (position >= 1 || this.f17198s > 1 || positionOffset <= 0.0f) {
            return;
        }
        int i2 = this.f17197r;
        int i3 = (int) (i2 * positionOffset);
        this.f17193k.setPadding(i3 + this.f17199t, 0, (i2 - i3) + this.f17201z, 0);
    }
}
