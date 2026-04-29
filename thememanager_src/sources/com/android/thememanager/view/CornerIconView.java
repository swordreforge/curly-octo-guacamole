package com.android.thememanager.view;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes2.dex */
public class CornerIconView extends TextView {

    /* JADX INFO: renamed from: g */
    private int f17248g;

    /* JADX INFO: renamed from: k */
    private Context f17249k;

    /* JADX INFO: renamed from: n */
    private int f17250n;

    /* JADX INFO: renamed from: q */
    private View f17251q;

    public CornerIconView(Context context, View target) {
        this(context, null, R.attr.textViewStyle, target);
    }

    /* JADX INFO: renamed from: k */
    private void m10233k() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388661;
        if (getLayoutDirection() == 1) {
            layoutParams.setMargins(0, this.f17248g, this.f17250n, 0);
        } else {
            layoutParams.setMargins(this.f17250n, this.f17248g, 0, 0);
        }
        setGravity(17);
        setLayoutParams(layoutParams);
    }

    private void toq(Context context, View target) {
        this.f17249k = context;
        this.f17251q = target;
        this.f17250n = 0;
        this.f17248g = 0;
        if (target == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = target.getLayoutParams();
        FrameLayout frameLayout = new FrameLayout(this.f17249k);
        ViewGroup viewGroup = (ViewGroup) this.f17251q.getParent();
        int iIndexOfChild = viewGroup.indexOfChild(target);
        viewGroup.removeView(target);
        viewGroup.addView(frameLayout, iIndexOfChild, layoutParams);
        frameLayout.addView(target);
        frameLayout.addView(this);
        m10233k();
    }

    public void setCornerIconNumber(int number) {
        setText(String.valueOf(number));
    }

    public void setMargins(int marginH, int marginV) {
        this.f17250n = marginH;
        this.f17248g = marginV;
        m10233k();
    }

    public CornerIconView(Context context, AttributeSet attrs, int defStyle, View target) {
        super(context, attrs, defStyle);
        toq(context, target);
        m10233k();
    }
}
