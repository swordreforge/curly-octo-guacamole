package com.android.thememanager.recommend.view.widget.nav;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.ArrayMap;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.config.C1724k;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.basemodule.utils.o1t;
import com.android.thememanager.basemodule.views.nav.C1857k;
import com.android.thememanager.basemodule.views.nav.NavItemView;
import com.android.thememanager.basemodule.views.nav.NavViewContainer;
import ek5k.C6002g;
import i1.C6077k;
import java.util.ArrayList;
import yz.C7794k;

/* JADX INFO: loaded from: classes2.dex */
public class NavViewTopContainer extends NavViewContainer {

    /* JADX INFO: renamed from: c */
    private static final String f14590c = NavViewTopContainer.class.getSimpleName();

    /* JADX INFO: renamed from: e */
    private static final int f14591e = 200;

    /* JADX INFO: renamed from: f */
    private float f14592f;

    /* JADX INFO: renamed from: h */
    public ImageView f14593h;

    /* JADX INFO: renamed from: i */
    private int f14594i;

    /* JADX INFO: renamed from: l */
    private float f14595l;

    /* JADX INFO: renamed from: p */
    private LinearLayout f14596p;

    /* JADX INFO: renamed from: r */
    protected float f14597r;

    /* JADX INFO: renamed from: t */
    protected float f14598t;

    /* JADX INFO: renamed from: z */
    private int f14599z;

    /* JADX INFO: renamed from: com.android.thememanager.recommend.view.widget.nav.NavViewTopContainer$k */
    class RunnableC2464k implements Runnable {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ int f14600k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ int f14602q;

        RunnableC2464k(final int val$count, final int val$position) {
            this.f14600k = val$count;
            this.f14602q = val$position;
        }

        @Override // java.lang.Runnable
        public void run() {
            Log.e("NavViewTopContainer", "ArrayIndexOutOfBoundsException: " + this.f14600k + " , " + this.f14602q);
            ArrayMap<String, Object> arrayMapM6679k = com.android.thememanager.basemodule.analysis.zy.m6679k();
            arrayMapM6679k.put("content", "main_tab_sort:" + C1724k.m6723p().x2().main_tab_sort + ", getChildCount:" + this.f14600k + ", position:" + this.f14602q);
            C1708s.f7l8().ld6().n5r1(com.android.thememanager.basemodule.analysis.toq.xo, C1706p.ki(arrayMapM6679k));
        }
    }

    public NavViewTopContainer(Context context) {
        super(context);
        this.f14594i = -1;
    }

    /* JADX INFO: renamed from: h */
    private void m8849h(int count, int position) {
        C6002g.ld6().execute(new RunnableC2464k(count, position));
    }

    private void kja0(final TextView textView, float startSize, float endSize) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(startSize, endSize);
        valueAnimatorOfFloat.setDuration(200L);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.android.thememanager.recommend.view.widget.nav.toq
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                NavViewTopContainer.qrj(textView, valueAnimator);
            }
        });
        valueAnimatorOfFloat.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void ld6() {
        View childAt = this.f14596p.getChildAt(this.f14594i);
        this.f14593h.setTranslationX((int) (childAt.getX() + ((childAt.getWidth() - this.f14593h.getWidth()) / 2)));
    }

    private void n7h(final View view, final TextView textView, final float startSize, float endSize) {
        final View view2 = (View) getParent();
        final int translationX = (int) this.f14593h.getTranslationX();
        final int scrollX = view2.getScrollX();
        final float f2 = endSize - startSize;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(200L);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.android.thememanager.recommend.view.widget.nav.zy
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f14607k.x2(textView, startSize, f2, view, translationX, scrollX, view2, valueAnimator);
            }
        });
        valueAnimatorOfFloat.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void qrj(TextView textView, ValueAnimator valueAnimator) {
        textView.setTextSize(0, ((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x2(TextView textView, float f2, float f3, View view, int i2, int i3, View view2, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        textView.setTextSize(0, f2 + (f3 * fFloatValue));
        float x3 = ((int) (view.getX() + ((view.getWidth() - this.f14593h.getWidth()) / 2))) - i2;
        float x4 = ((int) ((((view.getX() + (view.getWidth() / 2)) - this.f14599z) + this.f14595l) + this.f14592f)) - i3;
        this.f14593h.setTranslationX(i2 + (x3 * fFloatValue));
        view2.scrollTo((int) (i3 + (x4 * fFloatValue)), 0);
    }

    /* JADX INFO: renamed from: p */
    protected void mo8847p(NavItemView view) {
    }

    @Override // com.android.thememanager.basemodule.views.nav.NavViewContainer
    /* JADX INFO: renamed from: q */
    public void mo7342q(ArrayList<C1857k> navList) {
        removeAllViews();
        if (navList.size() == 0) {
            Log.e("NavViewTopContainer", "navList size == 0");
            m8849h(-1, -1);
            return;
        }
        View.inflate(getContext(), R.layout.rc_nav_top_layout, this);
        this.f14596p = (LinearLayout) findViewById(R.id.top_ll);
        this.f14593h = (ImageView) findViewById(R.id.top_nav_bar);
        for (int i2 = 0; i2 < navList.size(); i2++) {
            NavItemTopView navItemTopView = new NavItemTopView(getContext());
            navItemTopView.toq(navList.get(i2).m7343k(), navList.get(i2).zy());
            mo8847p(navItemTopView);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
            if (i2 != navList.size() - 1) {
                layoutParams.setMarginEnd((int) getResources().getDimension(R.dimen.nav_item_top_view_margin_end));
            }
            navItemTopView.setTag(Integer.valueOf(i2));
            navItemTopView.setOnClickListener(this.f10600g);
            navItemTopView.setOnTouchListener(this.f10605y);
            C6077k.f7l8(navItemTopView);
            this.f14596p.addView(navItemTopView, layoutParams);
        }
        setSelectedPosition(0);
        this.f14596p.post(new Runnable() { // from class: com.android.thememanager.recommend.view.widget.nav.k
            @Override // java.lang.Runnable
            public final void run() {
                this.f14603k.ld6();
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public void m8851s() {
        for (int i2 = 0; i2 < this.f14596p.getChildCount(); i2++) {
            if (this.f14596p.getChildAt(i2) instanceof NavItemTopView) {
                NavItemTopView navItemTopView = (NavItemTopView) this.f14596p.getChildAt(i2);
                TextView titleView = navItemTopView.getTitleView();
                if (i2 == this.f14594i) {
                    navItemTopView.setSelected(true);
                    n7h(navItemTopView, titleView, titleView.getTextSize(), this.f14597r);
                }
            }
        }
    }

    @Override // com.android.thememanager.basemodule.views.nav.NavViewContainer
    public void setSelectedPosition(int position) {
        super.setSelectedPosition(position);
        if (this.f14596p.getChildCount() == 0 || position >= this.f14596p.getChildCount()) {
            m8849h(this.f14596p.getChildCount(), position);
            return;
        }
        int i2 = this.f14594i;
        if (position == i2) {
            C7794k.m28194k(f14590c, "select pos is same:" + position);
            return;
        }
        for (int i3 = 0; i3 < this.f14596p.getChildCount(); i3++) {
            if (this.f14596p.getChildAt(i3) instanceof NavItemTopView) {
                NavItemTopView navItemTopView = (NavItemTopView) this.f14596p.getChildAt(i3);
                TextView titleView = navItemTopView.getTitleView();
                if (i3 == position) {
                    navItemTopView.setSelected(true);
                    n7h(navItemTopView, titleView, titleView.getTextSize(), this.f14597r);
                } else if (i3 == i2) {
                    navItemTopView.setSelected(false);
                    kja0(titleView, titleView.getTextSize(), this.f14598t);
                }
            }
        }
        this.f14594i = position;
    }

    @Override // com.android.thememanager.basemodule.views.nav.NavViewContainer
    protected void zy() {
        setOrientation(1);
        setClipChildren(false);
        setClipToPadding(false);
        if (o1t.fn3e()) {
            this.f14598t = getResources().getDimension(R.dimen.top_tab_text_elder_mode_size);
            this.f14597r = getResources().getDimension(R.dimen.top_tab_text_elder_mode_size);
        } else {
            this.f14598t = getResources().getDimension(R.dimen.top_tab_text_size);
            this.f14597r = getResources().getDimension(R.dimen.top_tab_text_big_size);
        }
        this.f14595l = getResources().getDimension(R.dimen.parent_nav_item_top_view_margin_start);
        this.f14592f = getResources().getDimension(R.dimen.nav_item_top_view_margin_start);
        this.f14599z = C1819o.jk(bf2.toq.toq()) / 2;
    }

    public NavViewTopContainer(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f14594i = -1;
    }

    public NavViewTopContainer(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f14594i = -1;
    }
}
