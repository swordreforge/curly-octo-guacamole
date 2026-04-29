package com.android.thememanager.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.android.thememanager.basemodule.views.nav.C1857k;
import com.android.thememanager.basemodule.views.nav.NavViewContainer;
import i1.C6077k;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class NavViewBottomContainer extends NavViewContainer {

    /* JADX INFO: renamed from: p */
    private List<C1857k> f17360p;

    public NavViewBottomContainer(Context context) {
        super(context);
        this.f17360p = new ArrayList();
    }

    @Override // com.android.thememanager.basemodule.views.nav.NavViewContainer
    /* JADX INFO: renamed from: q */
    public void mo7342q(ArrayList<C1857k> navList) {
        removeAllViews();
        this.f17360p = navList;
        for (int i2 = 0; i2 < navList.size(); i2++) {
            NavItemBottomView navItemBottomView = new NavItemBottomView(getContext());
            navItemBottomView.toq(navList.get(i2).m7343k(), navList.get(i2).zy());
            ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1, 1.0f);
            navItemBottomView.setTag(Integer.valueOf(i2));
            navItemBottomView.setOnClickListener(this.f10600g);
            navItemBottomView.setOnTouchListener(this.f10605y);
            C6077k.cdj(navItemBottomView);
            addView(navItemBottomView, layoutParams);
        }
    }

    public void setMessageVisible(int position, boolean visible) {
        if (position >= getChildCount()) {
            return;
        }
        View childAt = getChildAt(position);
        if (childAt instanceof NavItemBottomView) {
            ((NavItemBottomView) childAt).setmMessageVisible(visible);
        }
    }

    @Override // com.android.thememanager.basemodule.views.nav.NavViewContainer
    public void setSelectedPosition(int position) {
        super.setSelectedPosition(position);
        if (this.f17360p.isEmpty() || this.f17360p.size() < getChildCount()) {
            return;
        }
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof NavItemBottomView) && !this.f17360p.isEmpty()) {
                ((NavItemBottomView) getChildAt(i2)).m10271g(false, this.f17360p.get(position));
            }
        }
        if (!(getChildAt(position) instanceof NavItemBottomView) || this.f17360p.isEmpty()) {
            return;
        }
        ((NavItemBottomView) getChildAt(position)).m10271g(true, this.f17360p.get(position));
    }

    @Override // com.android.thememanager.basemodule.views.nav.NavViewContainer
    protected void zy() {
        setOrientation(0);
    }

    public NavViewBottomContainer(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f17360p = new ArrayList();
    }

    public NavViewBottomContainer(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f17360p = new ArrayList();
    }
}
