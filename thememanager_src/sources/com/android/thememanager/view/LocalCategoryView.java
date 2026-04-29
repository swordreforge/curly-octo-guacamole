package com.android.thememanager.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.thememanager.R;
import zy.nn86;

/* JADX INFO: loaded from: classes2.dex */
public class LocalCategoryView extends LinearLayout {

    /* JADX INFO: renamed from: k */
    private ImageView f17307k;

    /* JADX INFO: renamed from: n */
    private TextView f17308n;

    /* JADX INFO: renamed from: q */
    private TextView f17309q;

    public LocalCategoryView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: k */
    private void m10254k(Context context) {
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.local_resource_category_view, (ViewGroup) this, true);
        this.f17307k = (ImageView) viewInflate.findViewById(R.id.icon);
        this.f17309q = (TextView) viewInflate.findViewById(R.id.title);
        this.f17308n = (TextView) viewInflate.findViewById(R.id.sub_title);
    }

    public void setInfo(@zy.fn3e int iconId, @nn86 int titleId, @nn86 int subTitleId) {
        this.f17307k.setImageResource(iconId);
        this.f17309q.setText(titleId);
        this.f17308n.setText(subTitleId);
    }

    public LocalCategoryView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public LocalCategoryView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        m10254k(context);
    }
}
