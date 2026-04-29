package com.android.thememanager.mine.setting.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.widget.NestedScrollView;
import com.android.thememanager.R;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class AccountScrollView extends NestedScrollView {
    private static final int bg = 60;
    private boolean as;
    private View bl;
    private int in;

    public AccountScrollView(Context context) {
        super(context);
        this.as = true;
    }

    /* JADX INFO: renamed from: f */
    private void m8302f(int scrollY) {
        View view = this.bl;
        if (view == null) {
            return;
        }
        if (scrollY >= 60 && this.as) {
            view.setBackgroundColor(this.in);
            this.as = false;
        } else {
            if (scrollY >= 60 || this.as) {
                return;
            }
            view.setBackgroundColor(0);
            this.as = true;
        }
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    protected void onScrollChanged(int l2, int t2, int oldl, int oldt) {
        super.onScrollChanged(l2, t2, oldl, oldt);
        m8302f(t2);
    }

    @Override // android.view.View
    protected void onVisibilityChanged(@lvui View changedView, int visibility) {
        super.onVisibilityChanged(changedView, visibility);
        m8302f(getScrollY());
    }

    public void setStatusBarView(View window) {
        this.bl = window;
        this.in = getResources().getColor(R.color.me_account_status_bar_bg);
    }

    public AccountScrollView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.as = true;
    }

    public AccountScrollView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.as = true;
    }
}
