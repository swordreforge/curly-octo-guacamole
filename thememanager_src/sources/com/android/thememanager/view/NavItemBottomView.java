package com.android.thememanager.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.utils.C1812k;
import com.android.thememanager.basemodule.views.nav.C1857k;
import com.android.thememanager.basemodule.views.nav.NavItemView;

/* JADX INFO: loaded from: classes2.dex */
public class NavItemBottomView extends NavItemView {

    /* JADX INFO: renamed from: g */
    private C2892k f17352g;

    /* JADX INFO: renamed from: k */
    private TextView f17353k;

    /* JADX INFO: renamed from: n */
    private NavBottomLottieAnimationView f17354n;

    /* JADX INFO: renamed from: q */
    private ImageView f17355q;

    /* JADX INFO: renamed from: com.android.thememanager.view.NavItemBottomView$k */
    private class C2892k implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: k */
        private C1857k f17356k;

        public C2892k(final C1857k navItem) {
            this.f17356k = navItem;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator animation) {
            if (animation.getAnimatedFraction() >= 0.3f) {
                NavItemBottomView.this.f17353k.setTextColor(NavItemBottomView.this.m10269n(this.f17356k));
            }
        }
    }

    public NavItemBottomView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public int m10269n(C1857k navItem) {
        if ("homepage".equals(navItem.toq())) {
            return getResources().getColor(R.color.nav_homepage_title_color);
        }
        if ("resourcecategory".equals(navItem.toq())) {
            return getResources().getColor(R.color.nav_category_title_color);
        }
        if ("mine".equals(navItem.toq())) {
            return getResources().getColor(R.color.nav_mine_title_color);
        }
        if ("daily".equals(navItem.toq())) {
            return getResources().getColor(R.color.nav_daily_title_color);
        }
        return -1;
    }

    private void setTextAutoAdapterSize(int resId) {
        float dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.nav_view_title_text_size);
        float f2 = getResources().getConfiguration().fontScale;
        if (!getContext().getResources().getConfiguration().locale.getLanguage().endsWith("zh") && f2 > 1.0d) {
            this.f17353k.setTextSize((dimensionPixelSize / getResources().getDisplayMetrics().scaledDensity) / f2);
        }
        this.f17353k.setText(resId);
    }

    /* JADX INFO: renamed from: g */
    public void m10271g(boolean selected, final C1857k navItem) {
        if (!selected) {
            this.f17354n.setProgress(0.0f);
            this.f17354n.mcp();
            this.f17353k.setTextColor(getResources().getColor(R.color.nav_bottom_title_text_selector));
            this.f17353k.setTypeface(Typeface.defaultFromStyle(0));
            return;
        }
        this.f17354n.hyr();
        if (this.f17352g == null) {
            this.f17352g = new C2892k(navItem);
        }
        this.f17354n.m5881z(this.f17352g);
        if ("homepage".equals(navItem.toq())) {
            this.f17354n.setSpeed(1.4f);
        }
        this.f17353k.setTypeface(Typeface.defaultFromStyle(1));
    }

    @Override // com.android.thememanager.basemodule.views.nav.NavItemView
    /* JADX INFO: renamed from: k */
    protected void mo7339k() {
        View.inflate(getContext(), com.android.thememanager.basemodule.utils.zurt.m7261k(R.layout.nav_item_layout, R.layout.nav_item_layout_elder), this);
        this.f17353k = (TextView) findViewById(R.id.title);
        this.f17355q = (ImageView) findViewById(R.id.new_message);
        this.f17354n = (NavBottomLottieAnimationView) findViewById(R.id.icon);
    }

    public void setmMessageVisible(boolean visible) {
        this.f17355q.setVisibility(visible ? 0 : 8);
    }

    @Override // com.android.thememanager.basemodule.views.nav.NavItemView
    public void toq(int iconResId, int titleResId) {
        this.f17354n.setVisibility(0);
        this.f17354n.setAnimation(iconResId);
        if (titleResId == R.string.home_daily) {
            this.f17354n.setPadding(4, 4, 4, 4);
        }
        setTextAutoAdapterSize(titleResId);
        C1812k.m7106k(this, titleResId);
    }

    public NavItemBottomView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public NavItemBottomView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
