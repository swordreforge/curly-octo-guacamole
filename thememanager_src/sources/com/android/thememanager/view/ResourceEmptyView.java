package com.android.thememanager.view;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.thememanager.R;
import i1.C6077k;
import miui.os.Build;

/* JADX INFO: loaded from: classes2.dex */
public class ResourceEmptyView extends FrameLayout {

    /* JADX INFO: renamed from: h */
    public static final int f17397h = 1;

    /* JADX INFO: renamed from: i */
    public static final int f17398i = 2;

    /* JADX INFO: renamed from: p */
    public static final int f17399p = 0;

    /* JADX INFO: renamed from: g */
    private TextView f17400g;

    /* JADX INFO: renamed from: k */
    private TextView f17401k;

    /* JADX INFO: renamed from: n */
    private ImageView f17402n;

    /* JADX INFO: renamed from: q */
    private View f17403q;

    /* JADX INFO: renamed from: s */
    private TextView f17404s;

    /* JADX INFO: renamed from: y */
    private Button f17405y;

    /* JADX INFO: renamed from: com.android.thememanager.view.ResourceEmptyView$k */
    class ViewOnClickListenerC2897k implements View.OnClickListener {
        ViewOnClickListenerC2897k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ResourceEmptyView.this.getContext().startActivity(new Intent("miui.intent.action.NETWORK_DIAGNOSTICS"));
        }
    }

    public ResourceEmptyView(Context context) {
        this(context, null);
    }

    protected int getLayoutResId() {
        return R.layout.resource_empty_view;
    }

    /* JADX INFO: renamed from: k */
    protected void mo10290k() {
        this.f17401k = (TextView) findViewById(R.id.text_view);
        this.f17403q = findViewById(R.id.compound_view);
        this.f17402n = (ImageView) findViewById(R.id.image);
        this.f17400g = (TextView) findViewById(R.id.text);
        this.f17405y = (Button) findViewById(R.id.button);
        TextView textView = (TextView) findViewById(R.id.network_diagnostics);
        this.f17404s = textView;
        textView.setOnClickListener(new ViewOnClickListenerC2897k());
        setViewStyle(0);
        C6077k.m22369i(this);
    }

    public void setButtonOnClickListener(View.OnClickListener listener) {
        this.f17405y.setOnClickListener(listener);
    }

    public void setButtonTitle(int resId) {
        this.f17405y.setText(resId);
    }

    public void setImage(int resId) {
        this.f17402n.setImageResource(resId);
    }

    public void setText(int resId) {
        this.f17401k.setText(resId);
        this.f17400g.setText(resId);
    }

    public void setViewStyle(int style) {
        if (style == 1) {
            this.f17403q.setVisibility(0);
            this.f17402n.setVisibility(0);
            this.f17400g.setVisibility(0);
            this.f17405y.setVisibility(0);
            this.f17401k.setVisibility(8);
            return;
        }
        if (style == 2) {
            this.f17403q.setVisibility(0);
            this.f17402n.setVisibility(0);
            this.f17400g.setVisibility(0);
            this.f17405y.setVisibility(8);
            this.f17401k.setVisibility(8);
            return;
        }
        this.f17403q.setVisibility(8);
        this.f17402n.setVisibility(8);
        this.f17400g.setVisibility(8);
        this.f17405y.setVisibility(8);
        this.f17401k.setVisibility(0);
    }

    public void toq(boolean visible) {
        TextView textView;
        if (Build.IS_STABLE_VERSION || com.android.thememanager.util.fti.f16451k || (textView = this.f17404s) == null) {
            return;
        }
        textView.setVisibility(visible ? 0 : 8);
    }

    public ResourceEmptyView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ResourceEmptyView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        View.inflate(context, getLayoutResId(), this);
        mo10290k();
    }
}
