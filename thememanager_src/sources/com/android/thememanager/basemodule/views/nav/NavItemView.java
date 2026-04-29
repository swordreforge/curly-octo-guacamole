package com.android.thememanager.basemodule.views.nav;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

/* JADX INFO: loaded from: classes.dex */
public abstract class NavItemView extends RelativeLayout {
    public NavItemView(Context context) {
        super(context);
        mo7339k();
    }

    /* JADX INFO: renamed from: k */
    protected abstract void mo7339k();

    public abstract void toq(int iconResId, int titleResId);

    public NavItemView(Context context, AttributeSet attrs) {
        super(context, attrs);
        mo7339k();
    }

    public NavItemView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mo7339k();
    }
}
