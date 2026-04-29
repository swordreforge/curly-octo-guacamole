package com.android.thememanager.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.views.nav.C1857k;
import com.android.thememanager.basemodule.views.nav.NavViewContainer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class NavViewTopContainer extends NavViewContainer {
    public NavViewTopContainer(Context context) {
        super(context);
    }

    @Override // com.android.thememanager.basemodule.views.nav.NavViewContainer
    /* JADX INFO: renamed from: q */
    public void mo7342q(ArrayList<C1857k> navList) {
        removeAllViews();
        for (int i2 = 0; i2 < navList.size(); i2++) {
            NavItemTopView navItemTopView = new NavItemTopView(getContext());
            navItemTopView.toq(navList.get(i2).m7343k(), navList.get(i2).zy());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
            if (i2 != navList.size() - 1) {
                layoutParams.setMarginEnd((int) getResources().getDimension(R.dimen.nav_item_top_view_margin_end));
            }
            navItemTopView.setTag(Integer.valueOf(i2));
            navItemTopView.setOnClickListener(this.f10600g);
            navItemTopView.setOnTouchListener(this.f10605y);
            addView(navItemTopView, layoutParams);
        }
    }

    @Override // com.android.thememanager.basemodule.views.nav.NavViewContainer
    public void setSelectedPosition(int position) {
        super.setSelectedPosition(position);
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            getChildAt(i2).setSelected(false);
            if (getChildAt(i2) instanceof NavItemTopView) {
                NavItemTopView navItemTopView = (NavItemTopView) getChildAt(i2);
                navItemTopView.setTitleSize(getResources().getDimension(R.dimen.top_tab_text_size));
                navItemTopView.setBottomImageVisible(8);
            }
        }
        View childAt = getChildAt(position);
        childAt.setSelected(true);
        if (childAt instanceof NavItemTopView) {
            NavItemTopView navItemTopView2 = (NavItemTopView) childAt;
            this.f10603q = navItemTopView2;
            navItemTopView2.setTitleSize(getResources().getDimension(R.dimen.top_tab_text_big_size));
            ((NavItemTopView) this.f10603q).setBottomImageVisible(0);
        }
    }

    @Override // com.android.thememanager.basemodule.views.nav.NavViewContainer
    protected void zy() {
        setOrientation(0);
    }

    public NavViewTopContainer(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public NavViewTopContainer(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
