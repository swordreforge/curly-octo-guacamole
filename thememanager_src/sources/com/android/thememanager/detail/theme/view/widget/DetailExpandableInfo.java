package com.android.thememanager.detail.theme.view.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.utils.y9n;
import com.android.thememanager.basemodule.utils.zurt;
import i1.C6077k;
import zy.dd;

/* JADX INFO: loaded from: classes2.dex */
public class DetailExpandableInfo extends FrameLayout {

    /* JADX INFO: renamed from: y */
    private static final int f11218y = 4;

    /* JADX INFO: renamed from: g */
    private boolean f11219g;

    /* JADX INFO: renamed from: k */
    private TextView f11220k;

    /* JADX INFO: renamed from: n */
    private TextView f11221n;

    /* JADX INFO: renamed from: q */
    private View f11222q;

    public DetailExpandableInfo(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: g */
    private void m7758g(boolean collapsed) {
        this.f11221n.setMaxLines(collapsed ? 4 : Integer.MAX_VALUE);
        this.f11222q.setVisibility(collapsed ? 0 : 8);
        if (collapsed) {
            this.f11221n.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.detail.theme.view.widget.k
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f11369k.m7761q(view);
                }
            });
            this.f11222q.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.detail.theme.view.widget.toq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f11403k.m7760n(view);
                }
            });
            C6077k.m22374s(this.f11221n, this.f11222q);
        } else {
            this.f11221n.setClickable(false);
            this.f11222q.setClickable(false);
            C6077k.m22367g(this.f11221n, this.f11222q);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ void m7760n(View view) {
        m7758g(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public /* synthetic */ void m7761q(View view) {
        m7758g(false);
    }

    private void zy() {
        View viewInflate = LayoutInflater.from(getContext()).inflate(zurt.m7261k(R.layout.de_expandable_info, R.layout.de_expandable_info_elder), (ViewGroup) this, true);
        this.f11220k = (TextView) viewInflate.findViewById(R.id.title);
        this.f11222q = viewInflate.findViewById(R.id.expand);
        this.f11221n = (TextView) viewInflate.findViewById(R.id.content);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (!this.f11219g || getVisibility() == 8) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            return;
        }
        this.f11219g = false;
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        m7758g(this.f11221n.getLineCount() > 4);
    }

    public void setInfo(String title, String content) {
        this.f11220k.setText(title);
        this.f11219g = true;
        String strTrim = content != null ? content.trim() : "";
        y9n.lrht(this.f11221n, strTrim);
        setVisibility(strTrim.length() == 0 ? 8 : 0);
        requestLayout();
    }

    public DetailExpandableInfo(Context context, @dd AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public DetailExpandableInfo(Context context, @dd AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f11219g = false;
        zy();
    }
}
