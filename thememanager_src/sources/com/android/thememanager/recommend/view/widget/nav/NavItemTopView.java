package com.android.thememanager.recommend.view.widget.nav;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.utils.C1812k;
import com.android.thememanager.basemodule.views.nav.NavItemView;

/* JADX INFO: loaded from: classes2.dex */
public class NavItemTopView extends NavItemView {

    /* JADX INFO: renamed from: k */
    private TextView f14587k;

    /* JADX INFO: renamed from: q */
    private final int f14588q;

    /* JADX INFO: renamed from: com.android.thememanager.recommend.view.widget.nav.NavItemTopView$k */
    class RunnableC2463k implements Runnable {
        RunnableC2463k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NavItemTopView.this.sendAccessibilityEvent(8);
        }
    }

    public NavItemTopView(Context context) {
        super(context);
        this.f14588q = 400;
    }

    public TextView getTitleView() {
        return this.f14587k;
    }

    @Override // com.android.thememanager.basemodule.views.nav.NavItemView
    /* JADX INFO: renamed from: k */
    protected void mo7339k() {
        View.inflate(getContext(), R.layout.rc_nav_item_top_layout, this);
    }

    @Override // android.view.View
    public void setSelected(boolean selected) {
        super.setSelected(selected);
        if (selected) {
            postDelayed(new RunnableC2463k(), 400L);
        }
    }

    @Override // com.android.thememanager.basemodule.views.nav.NavItemView
    public void toq(int iconResId, int titleResId) {
        TextView textView = (TextView) findViewById(R.id.title);
        this.f14587k = textView;
        textView.setVisibility(0);
        this.f14587k.setText(titleResId);
        C1812k.m7106k(this, titleResId);
    }

    public NavItemTopView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f14588q = 400;
    }

    public NavItemTopView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f14588q = 400;
    }
}
