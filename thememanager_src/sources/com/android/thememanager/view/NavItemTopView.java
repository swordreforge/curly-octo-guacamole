package com.android.thememanager.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.utils.C1812k;
import com.android.thememanager.basemodule.views.nav.NavItemView;

/* JADX INFO: loaded from: classes2.dex */
public class NavItemTopView extends NavItemView {

    /* JADX INFO: renamed from: k */
    private TextView f17358k;

    /* JADX INFO: renamed from: q */
    private ImageView f17359q;

    public NavItemTopView(Context context) {
        super(context);
    }

    @Override // com.android.thememanager.basemodule.views.nav.NavItemView
    /* JADX INFO: renamed from: k */
    protected void mo7339k() {
        View.inflate(getContext(), R.layout.nav_item_top_layout, this);
    }

    public void setBottomImageVisible(int visible) {
        this.f17359q.setVisibility(visible);
    }

    public void setTitleSize(float size) {
        this.f17358k.setTextSize(0, size);
    }

    @Override // com.android.thememanager.basemodule.views.nav.NavItemView
    public void toq(int iconResId, int titleResId) {
        TextView textView = (TextView) findViewById(R.id.title);
        this.f17358k = textView;
        textView.setVisibility(0);
        this.f17358k.setText(titleResId);
        ImageView imageView = (ImageView) findViewById(R.id.banner_text_bottom);
        this.f17359q = imageView;
        imageView.setImageResource(iconResId);
        C1812k.m7106k(this, titleResId);
    }

    public NavItemTopView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public NavItemTopView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
