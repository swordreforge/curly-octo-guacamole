package com.android.thememanager.module.detail.view;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.basemodule.utils.C1819o;
import miuix.animation.Folme;
import miuix.animation.IFolme;
import miuix.animation.IVisibleStyle;
import miuix.animation.base.AnimConfig;
import miuix.animation.controller.AnimState;
import miuix.animation.listener.TransitionListener;
import miuix.animation.property.ViewProperty;

/* JADX INFO: loaded from: classes2.dex */
public class FullScreenAodPreview extends AodPreview {
    private static final int bv = 300;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private boolean f60542ab;
    private FrameLayout.LayoutParams bb;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private IFolme f60543bo;
    private TransitionListener bp;

    /* JADX INFO: renamed from: d */
    private AnimState f13187d;

    /* JADX INFO: renamed from: v */
    private AnimConfig f13188v;

    /* JADX INFO: renamed from: w */
    private AnimState f13189w;

    /* JADX INFO: renamed from: com.android.thememanager.module.detail.view.FullScreenAodPreview$k */
    class C2251k extends TransitionListener {
        C2251k() {
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onComplete(Object toTag) {
            if (toTag == IVisibleStyle.VisibleType.HIDE) {
                ((ViewGroup) ((Activity) FullScreenAodPreview.this.getContext()).getWindow().getDecorView()).removeView(FullScreenAodPreview.this);
            }
        }
    }

    public FullScreenAodPreview(@zy.lvui Context context) {
        super(context);
        this.f60542ab = false;
        this.bp = new C2251k();
    }

    public boolean fu4() {
        return this.f60542ab;
    }

    public void ni7() {
        this.f60542ab = false;
        if (this.f60543bo == null) {
            return;
        }
        ((Activity) getContext()).getWindow().clearFlags(1024);
        this.f60543bo.state().fromTo(this.f13187d, this.f13189w, this.f13188v);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        AnimConfig animConfig = this.f13188v;
        if (animConfig != null) {
            animConfig.addListeners(this.bp);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnimConfig animConfig = this.f13188v;
        if (animConfig != null) {
            animConfig.removeListeners(this.bp);
        }
    }

    @Override // com.android.thememanager.module.detail.view.AodPreview
    /* JADX INFO: renamed from: p */
    public void mo8387p(int width, int height, boolean hasCorner, boolean hasStroke, String imageUrl, String aodPath) {
        ViewGroup.LayoutParams layoutParams = this.f13177l.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(width, height);
        } else {
            layoutParams.width = width;
            layoutParams.height = height;
        }
        this.f13177l.setLayoutParams(layoutParams);
        if (C1807g.wvg()) {
            width = getContext().getResources().getDimensionPixelOffset(R.dimen.de_fold_aod_preview_full_screen_width);
        }
        if (C1807g.wvg()) {
            height = getContext().getResources().getDimensionPixelOffset(R.dimen.de_fold_aod_preview_full_screen_height);
        }
        int i2 = (com.android.thememanager.basemodule.utils.y9n.fn3e().y / 2) - (height / 2);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f13175f.getLayoutParams();
        layoutParams2.width = width;
        layoutParams2.height = height;
        if (C1807g.wvg()) {
            layoutParams2.topMargin = i2;
        }
        this.f13175f.setLayoutParams(layoutParams2);
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) this.f13176j.getLayoutParams();
        layoutParams3.width = width;
        layoutParams3.height = height;
        if (C1807g.wvg()) {
            layoutParams3.topMargin = i2;
        }
        this.f13176j.setLayoutParams(layoutParams3);
        this.f13177l.setBackgroundColor(-16777216);
        this.f13176j.m7773y(0, hasStroke);
        this.f13171a = imageUrl;
        this.f13181x = aodPath;
    }

    @Override // com.android.thememanager.module.detail.view.AodPreview
    protected void x2() {
        super.x2();
        if (!com.android.thememanager.basemodule.utils.y9n.m7258z() || C1819o.d3()) {
            return;
        }
        View viewFindViewById = findViewById(R.id.static_preview_cache);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewFindViewById.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.bottomMargin += C1819o.zurt(getContext());
            viewFindViewById.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: renamed from: z */
    public void m8397z(boolean needAnim) {
        t8r();
        this.f60542ab = true;
        if (getParent() == null && needAnim) {
            if (this.bb == null) {
                this.bb = new FrameLayout.LayoutParams(-1, -1);
            }
            ((Activity) getContext()).getWindow().addFlags(1024);
            ((ViewGroup) ((Activity) getContext()).getWindow().getDecorView()).addView(this, new ViewGroup.LayoutParams(this.bb));
            if (this.f60543bo == null) {
                this.f60543bo = Folme.useAt(this);
                this.f13188v = new AnimConfig().setMinDuration(300L).addListeners(this.bp);
                AnimState animState = new AnimState(IVisibleStyle.VisibleType.SHOW);
                ViewProperty viewProperty = ViewProperty.ALPHA;
                AnimState animStateAdd = animState.add(viewProperty, 1.0d);
                ViewProperty viewProperty2 = ViewProperty.SCALE_X;
                AnimState animStateAdd2 = animStateAdd.add(viewProperty2, 1.0d);
                ViewProperty viewProperty3 = ViewProperty.SCALE_Y;
                this.f13187d = animStateAdd2.add(viewProperty3, 1.0d);
                this.f13189w = new AnimState(IVisibleStyle.VisibleType.HIDE).add(viewProperty, 0.0d).add(viewProperty2, 0.0d).add(viewProperty3, 0.0d);
            }
            this.f60543bo.state().fromTo(this.f13189w, this.f13187d, this.f13188v);
        }
    }

    public FullScreenAodPreview(@zy.lvui Context context, @zy.dd AttributeSet attrs) {
        super(context, attrs);
        this.f60542ab = false;
        this.bp = new C2251k();
    }

    public FullScreenAodPreview(@zy.lvui Context context, @zy.dd AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f60542ab = false;
        this.bp = new C2251k();
    }
}
