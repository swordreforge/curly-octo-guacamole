package com.android.thememanager.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.views.nav.NavItemView;
import zy.nn86;

/* JADX INFO: loaded from: classes2.dex */
public class TabView extends NavItemView {

    /* JADX INFO: renamed from: k */
    private TextView f17466k;

    /* JADX INFO: renamed from: q */
    private ImageView f17467q;

    public TabView(Context context) {
        super(context);
    }

    @Override // com.android.thememanager.basemodule.views.nav.NavItemView
    /* JADX INFO: renamed from: k */
    protected void mo7339k() {
        View.inflate(getContext(), R.layout.detail_tab_view, this);
        this.f17466k = (TextView) findViewById(R.id.tab_name);
        this.f17467q = (ImageView) findViewById(R.id.message_iv);
    }

    public void setDotImageVisble(boolean visible) {
        this.f17467q.setVisibility(visible ? 0 : 8);
    }

    public void setTabColor(@zy.x2 int color) {
        this.f17466k.setTextColor(color);
    }

    @Override // com.android.thememanager.basemodule.views.nav.NavItemView
    public void toq(@zy.fn3e int iconResId, @nn86 int titleResId) {
        this.f17466k.setText(titleResId);
    }

    public TabView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public TabView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
