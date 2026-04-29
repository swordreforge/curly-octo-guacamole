package com.android.thememanager.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.thememanager.R;

/* JADX INFO: loaded from: classes2.dex */
public class ExpandableTextViewWithTitle extends LinearLayout {

    /* JADX INFO: renamed from: k */
    private TextView f17269k;

    /* JADX INFO: renamed from: q */
    private ExpandableTextView f17270q;

    public ExpandableTextViewWithTitle(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: k */
    private void m10238k() {
        View viewInflate = View.inflate(getContext(), R.layout.resource_expand_text_view_with_title, null);
        viewInflate.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        addView(viewInflate);
        this.f17269k = (TextView) findViewById(R.id.title);
        this.f17270q = (ExpandableTextView) findViewById(R.id.content);
    }

    public void setClickAnalyticsInfo(String info, String category) {
        this.f17270q.setClickAnalyticsInfo(info, category);
    }

    public void setContent(String content) {
        this.f17270q.setTextWithUrl(content);
    }

    public void setTitle(int titleId) {
        this.f17269k.setText(titleId);
    }

    public ExpandableTextViewWithTitle(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public void setTitle(String title) {
        this.f17269k.setText(title);
    }

    public ExpandableTextViewWithTitle(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        m10238k();
    }
}
