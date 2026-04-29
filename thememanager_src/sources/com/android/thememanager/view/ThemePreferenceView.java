package com.android.thememanager.view;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.thememanager.fn3e;
import i1.C6077k;
import mub.InterfaceC7395n;

/* JADX INFO: compiled from: ThemePreferenceView.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ThemePreferenceView extends LinearLayout {

    /* JADX INFO: renamed from: g */
    @InterfaceC7395n
    private Integer f17476g;

    /* JADX INFO: renamed from: k */
    @InterfaceC7395n
    private ImageView f17477k;

    /* JADX INFO: renamed from: n */
    @InterfaceC7395n
    private TextView f17478n;

    /* JADX INFO: renamed from: p */
    private boolean f17479p;

    /* JADX INFO: renamed from: q */
    @InterfaceC7395n
    private TextView f17480q;

    /* JADX INFO: renamed from: s */
    @InterfaceC7395n
    private View f17481s;

    /* JADX INFO: renamed from: y */
    @InterfaceC7395n
    private TextView f17482y;

    public ThemePreferenceView(@InterfaceC7395n Context context) {
        this(context, null);
    }

    @InterfaceC7395n
    public final ImageView getIcon() {
        if (this.f17477k == null) {
            this.f17477k = (ImageView) findViewById(R.id.icon);
        }
        return this.f17477k;
    }

    @InterfaceC7395n
    public final View getMoreArrow() {
        if (this.f17481s == null) {
            this.f17481s = findViewById(com.android.thememanager.R.id.arrow_right);
        }
        return this.f17481s;
    }

    @InterfaceC7395n
    public final TextView getMoreInfoView() {
        if (this.f17482y == null) {
            Integer num = this.f17476g;
            View viewInflate = null;
            if (num != null) {
                viewInflate = LayoutInflater.from(getContext()).inflate(num.intValue(), (ViewGroup) null, false);
            }
            kotlin.jvm.internal.d2ok.n7h(viewInflate, "null cannot be cast to non-null type android.widget.TextView");
            this.f17482y = (TextView) viewInflate;
            ViewGroup viewGroup = (ViewGroup) findViewById(R.id.widget_frame);
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
            marginLayoutParams.setMarginEnd(getContext().getResources().getDimensionPixelSize(com.android.thememanager.R.dimen.theme_preference_view_more_padding_end));
            viewGroup.addView(this.f17482y, marginLayoutParams);
        }
        return this.f17482y;
    }

    @InterfaceC7395n
    public final TextView getSummaryView() {
        if (this.f17478n == null) {
            this.f17478n = (TextView) findViewById(R.id.summary);
        }
        return this.f17478n;
    }

    @InterfaceC7395n
    public final TextView getTitleView() {
        if (this.f17480q == null) {
            this.f17480q = (TextView) findViewById(R.id.title);
        }
        return this.f17480q;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        ImageView icon = getIcon();
        if (icon != null) {
            icon.setVisibility(8);
        }
        TextView summaryView = getSummaryView();
        if (summaryView != null) {
            summaryView.setVisibility(8);
        }
        if (this.f17479p) {
            C6077k.ld6(this);
        }
    }

    public final void setIcon(@InterfaceC7395n Drawable drawable) {
        if (drawable != null) {
            ImageView icon = getIcon();
            if (icon != null) {
                icon.setImageDrawable(drawable);
            }
            ImageView icon2 = getIcon();
            if (icon2 == null) {
                return;
            }
            icon2.setVisibility(0);
        }
    }

    public final void setPaddingHorzintal(int i2, int i3) {
        setPadding(i2, getPaddingTop(), i3, getPaddingBottom());
    }

    public final void setSupportAnimation(boolean z2) {
        this.f17479p = z2;
        if (z2) {
            C6077k.ld6(this);
        } else {
            C6077k.m22367g(this);
        }
    }

    public ThemePreferenceView(@InterfaceC7395n Context context, @InterfaceC7395n AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ThemePreferenceView(@InterfaceC7395n Context context, @InterfaceC7395n AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public ThemePreferenceView(@InterfaceC7395n Context context, @InterfaceC7395n AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.f17479p = true;
        TypedArray typedArrayObtainStyledAttributes = context != null ? context.obtainStyledAttributes(attributeSet, fn3e.C2036i.vnl) : null;
        Integer numValueOf = typedArrayObtainStyledAttributes != null ? Integer.valueOf(typedArrayObtainStyledAttributes.getResourceId(1, com.android.thememanager.R.layout.miuix_preference_layout)) : null;
        this.f17476g = typedArrayObtainStyledAttributes != null ? Integer.valueOf(typedArrayObtainStyledAttributes.getResourceId(0, com.android.thememanager.R.layout.miuix_preference_widget_text)) : null;
        if (typedArrayObtainStyledAttributes != null) {
            typedArrayObtainStyledAttributes.recycle();
        }
        if (numValueOf != null) {
            numValueOf.intValue();
            LayoutInflater.from(context).inflate(numValueOf.intValue(), (ViewGroup) this, true);
        }
    }
}
