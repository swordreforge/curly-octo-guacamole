package com.android.thememanager.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.thememanager.R;

/* JADX INFO: loaded from: classes2.dex */
public class TabViewWithIcon extends LinearLayout {

    /* JADX INFO: renamed from: k */
    private TextView f17469k;

    /* JADX INFO: renamed from: q */
    private TextView f17470q;

    public TabViewWithIcon(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: k */
    public void m10311k() {
        if (this.f17470q.getVisibility() == 0) {
            this.f17470q.setVisibility(8);
            this.f17470q.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.disappear));
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f17469k = (TextView) findViewById(R.id.text);
        this.f17470q = (TextView) findViewById(R.id.icon);
    }

    public void setText(int textRes) {
        this.f17469k.setText(textRes);
    }

    public void toq(String text) {
        this.f17470q.setText(text);
        if (this.f17470q.getVisibility() == 8) {
            this.f17470q.setVisibility(0);
            this.f17470q.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.appear));
        }
    }

    public TabViewWithIcon(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public void setText(CharSequence text) {
        this.f17469k.setText(text);
    }

    public TabViewWithIcon(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }
}
