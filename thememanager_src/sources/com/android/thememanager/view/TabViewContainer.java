package com.android.thememanager.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.views.nav.C1857k;
import com.android.thememanager.basemodule.views.nav.NavViewContainer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class TabViewContainer extends NavViewContainer {

    /* JADX INFO: renamed from: p */
    private List<C1857k> f17468p;

    public TabViewContainer(Context context) {
        super(context);
        this.f17468p = new ArrayList();
    }

    /* JADX INFO: renamed from: g */
    private void m10310g(TabView tabView, boolean isSelected, @zy.n7h int colorRes) {
        tabView.setSelected(isSelected);
        tabView.setTabColor(getContext().getResources().getColor(colorRes));
    }

    @Override // com.android.thememanager.basemodule.views.nav.NavViewContainer
    /* JADX INFO: renamed from: q */
    public void mo7342q(ArrayList<C1857k> navList) {
        removeAllViews();
        this.f17468p = navList;
        for (int i2 = 0; i2 < this.f17468p.size(); i2++) {
            TabView tabView = new TabView(getContext());
            tabView.toq(navList.get(i2).m7343k(), navList.get(i2).zy());
            if (i2 == 0) {
                m10310g(tabView, true, R.color.author_title_select_color);
            } else {
                m10310g(tabView, false, R.color.author_title_no_select_color);
            }
            addView(tabView, new LinearLayout.LayoutParams(-1, -1, 1.0f));
            tabView.setTag(Integer.valueOf(i2));
            tabView.setOnClickListener(this.f10600g);
        }
    }

    public void setDotImageVisble(int position, boolean visible) {
        if (position >= getChildCount()) {
            return;
        }
        View childAt = getChildAt(position);
        if (childAt instanceof TabView) {
            ((TabView) childAt).setDotImageVisble(visible);
        }
    }

    @Override // com.android.thememanager.basemodule.views.nav.NavViewContainer
    public void setSelectedPosition(int position) {
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (i2 == position) {
                m10310g((TabView) childAt, true, R.color.author_title_select_color);
            } else {
                m10310g((TabView) childAt, false, R.color.author_title_no_select_color);
            }
        }
    }

    @Override // com.android.thememanager.basemodule.views.nav.NavViewContainer
    protected void zy() {
        setOrientation(0);
    }

    public TabViewContainer(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f17468p = new ArrayList();
    }

    public TabViewContainer(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f17468p = new ArrayList();
    }
}
