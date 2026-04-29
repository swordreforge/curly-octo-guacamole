package com.android.thememanager.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.android.thememanager.R;
import com.android.thememanager.activity.pc;
import com.android.thememanager.fn3e;

/* JADX INFO: loaded from: classes2.dex */
public class ResourceListExpandableView extends LinearLayout {

    /* JADX INFO: renamed from: k */
    private TextView f17407k;

    /* JADX INFO: renamed from: n */
    private View.OnClickListener f17408n;

    /* JADX INFO: renamed from: q */
    private FullVisibleListView f17409q;

    public ResourceListExpandableView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: k */
    private void m10291k(boolean visible) {
        if (visible) {
            this.f17407k.setBackgroundResource(R.drawable.resource_list_small_view_item_group_header_bg_light);
        } else {
            this.f17407k.setBackground(null);
        }
    }

    private void zy(boolean visible) {
        this.f17407k.setVisibility(visible ? 0 : 8);
    }

    public void setAdapter(pc adapter) {
        this.f17409q.setAdapter((ListAdapter) adapter);
    }

    public void setExpandButtonClickListener(View.OnClickListener listener) {
        this.f17408n = listener;
    }

    public void setTitle(CharSequence text) {
        this.f17407k.setText(text);
    }

    public void setVisibilityByNumResources(int numResources, int maxNumResources) {
        if (numResources == 0) {
            setVisibility(8);
        } else {
            toq(numResources >= maxNumResources);
        }
    }

    public void toq(boolean visible) {
        if (!visible) {
            this.f17407k.setCompoundDrawablesRelative(null, null, null, null);
            this.f17407k.setOnClickListener(null);
        } else {
            Drawable drawable = getResources().getDrawable(R.drawable.arrow_right);
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            this.f17407k.setCompoundDrawablesRelative(null, null, drawable, null);
            this.f17407k.setOnClickListener(this.f17408n);
        }
    }

    public ResourceListExpandableView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ResourceListExpandableView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        View.inflate(context, R.layout.resource_list_expandable_view, this);
        this.f17409q = (FullVisibleListView) findViewById(android.R.id.list);
        this.f17407k = (TextView) findViewById(R.id.title);
        if (attrs != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, fn3e.C2036i.l2ld);
            try {
                boolean z2 = typedArrayObtainStyledAttributes.getBoolean(3, true);
                zy(z2);
                if (z2) {
                    toq(typedArrayObtainStyledAttributes.getBoolean(2, true));
                    m10291k(typedArrayObtainStyledAttributes.getBoolean(1, true));
                    this.f17407k.setText(typedArrayObtainStyledAttributes.getString(0));
                }
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
    }
}
