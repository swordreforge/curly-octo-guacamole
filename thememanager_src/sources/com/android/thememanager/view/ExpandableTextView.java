package com.android.thememanager.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.utils.y9n;
import i1.C6077k;

/* JADX INFO: loaded from: classes2.dex */
public class ExpandableTextView extends LinearLayout {

    /* JADX INFO: renamed from: g */
    private int f17261g;

    /* JADX INFO: renamed from: k */
    TextView f17262k;

    /* JADX INFO: renamed from: n */
    private boolean f17263n;

    /* JADX INFO: renamed from: p */
    private View.OnClickListener f17264p;

    /* JADX INFO: renamed from: q */
    TextView f17265q;

    /* JADX INFO: renamed from: s */
    private String f17266s;

    /* JADX INFO: renamed from: y */
    private String f17267y;

    /* JADX INFO: renamed from: com.android.thememanager.view.ExpandableTextView$k */
    class ViewOnClickListenerC2883k implements View.OnClickListener {
        ViewOnClickListenerC2883k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            ExpandableTextView.this.m10237q(false);
        }
    }

    public ExpandableTextView(Context context) {
        super(context);
        this.f17263n = false;
        this.f17261g = 4;
        this.f17264p = new ViewOnClickListenerC2883k();
        zy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public void m10237q(boolean collapsed) {
        this.f17262k.setMaxLines(collapsed ? this.f17261g : Integer.MAX_VALUE);
        this.f17265q.setVisibility(collapsed ? 0 : 8);
        if (!collapsed) {
            this.f17262k.setClickable(false);
            this.f17265q.setClickable(false);
        } else {
            this.f17262k.setOnClickListener(this.f17264p);
            this.f17265q.setOnClickListener(this.f17264p);
            C6077k.f7l8(this.f17262k);
            C6077k.f7l8(this.f17265q);
        }
    }

    private void toq() {
        this.f17262k = (TextView) findViewById(R.id.expandable_text);
        this.f17265q = (TextView) findViewById(R.id.expand_collapse);
    }

    public CharSequence getText() {
        TextView textView = this.f17262k;
        return textView == null ? "" : textView.getText();
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (!this.f17263n || getVisibility() == 8) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            return;
        }
        this.f17263n = false;
        m10237q(false);
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        if (this.f17262k.getLineCount() <= this.f17261g) {
            return;
        }
        m10237q(true);
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    public void setClickAnalyticsInfo(String info, String category) {
        this.f17267y = info;
        this.f17266s = category;
    }

    public void setText(String text) {
        this.f17263n = true;
        if (this.f17262k == null) {
            toq();
        }
        String strTrim = text != null ? text.trim() : "";
        this.f17262k.setText(strTrim);
        setVisibility(strTrim.length() == 0 ? 8 : 0);
        requestLayout();
    }

    public void setTextWithUrl(String text) {
        this.f17263n = true;
        if (this.f17262k == null) {
            toq();
        }
        String strTrim = text != null ? text.trim() : "";
        y9n.lrht(this.f17262k, strTrim);
        setVisibility(strTrim.length() == 0 ? 8 : 0);
        requestLayout();
    }

    void zy() {
        this.f17261g = getResources().getInteger(R.integer.comment_info_desc_line_num);
    }

    public ExpandableTextView(Context context, AttributeSet attrs) {
        super(context, attrs, 0);
        this.f17263n = false;
        this.f17261g = 4;
        this.f17264p = new ViewOnClickListenerC2883k();
        zy();
    }

    public ExpandableTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.f17263n = false;
        this.f17261g = 4;
        this.f17264p = new ViewOnClickListenerC2883k();
        zy();
    }
}
