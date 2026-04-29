package com.android.thememanager.view;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.base.AbstractActivityC1717k;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.basemodule.utils.y9n;
import com.android.thememanager.detail.theme.view.widget.ThemeOperationButton;
import i1.C6077k;
import miuix.animation.listener.TransitionListener;

/* JADX INFO: compiled from: ThemeBottomFloatingButton.java */
/* JADX INFO: loaded from: classes2.dex */
public class dd {

    /* JADX INFO: renamed from: k */
    private ThemeOperationButton f17512k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private int f61506toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private boolean f61507zy;

    /* JADX INFO: renamed from: com.android.thememanager.view.dd$k */
    /* JADX INFO: compiled from: ThemeBottomFloatingButton.java */
    class C2912k extends TransitionListener {
        C2912k() {
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onComplete(Object toTag) {
            dd.this.f17512k.setVisibility(8);
        }
    }

    public dd(AbstractActivityC1717k activity, ViewGroup parentView) {
        this.f17512k = new ThemeOperationButton(activity);
        m10335n(activity, parentView);
    }

    /* JADX INFO: renamed from: n */
    private void m10335n(AbstractActivityC1717k activity, ViewGroup parentView) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(activity.getResources().getDimensionPixelOffset(R.dimen.large_icon_picker_purchase_btn_width), activity.getResources().getDimensionPixelOffset(R.dimen.large_icon_picker_purchase_btn_height));
        layoutParams.gravity = 81;
        layoutParams.bottomMargin = activity.getResources().getDimensionPixelOffset(R.dimen.large_icon_picker_purchase_btn_margin_bottom);
        if (C1819o.d3()) {
            layoutParams.bottomMargin += y9n.m7247h();
        }
        this.f17512k.setLayoutParams(layoutParams);
        if (parentView == null) {
            parentView = (ViewGroup) activity.getWindow().getDecorView();
        }
        this.f61506toq = layoutParams.bottomMargin + layoutParams.height;
        parentView.addView(this.f17512k);
        this.f17512k.setVisibility(8);
    }

    public void f7l8(String text) {
        this.f17512k.setText(text);
    }

    /* JADX INFO: renamed from: g */
    public void m10336g(View.OnClickListener l2) {
        this.f17512k.setOnClickListener(l2);
    }

    /* JADX INFO: renamed from: q */
    public void m10337q() {
        if (this.f61507zy) {
            C6077k.m22367g(this.f17512k);
            this.f61507zy = false;
            C6077k.jp0y(this.f17512k, 0.0f, 0.0f, 0.0f, this.f61506toq, new C2912k());
        }
    }

    /* JADX INFO: renamed from: s */
    public void m10338s() {
        if (this.f61507zy) {
            this.f17512k.setVisibility(0);
            return;
        }
        C6077k.m22367g(this.f17512k);
        this.f61507zy = true;
        this.f17512k.setVisibility(0);
        this.f17512k.bringToFront();
        C6077k.jp0y(this.f17512k, 0.0f, 0.0f, this.f61506toq, 0.0f, null);
    }

    public void toq() {
        try {
            ThemeOperationButton themeOperationButton = this.f17512k;
            if (themeOperationButton == null || themeOperationButton.getParent() == null) {
                return;
            }
            ((ViewGroup) this.f17512k.getParent()).removeView(this.f17512k);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: y */
    public void m10339y(float textSize) {
        ThemeOperationButton themeOperationButton = this.f17512k;
        if (themeOperationButton != null) {
            themeOperationButton.setTextSize(textSize);
        }
    }

    public ThemeOperationButton zy() {
        return this.f17512k;
    }
}
