package com.android.thememanager.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.PopupWindow;

/* JADX INFO: renamed from: com.android.thememanager.widget.k */
/* JADX INFO: compiled from: DropDownPopupWindow.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2962k extends PopupWindow {

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final int f61584ld6 = -1728053248;

    /* JADX INFO: renamed from: p */
    private static final int f17835p = 200;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private boolean f61585f7l8;

    /* JADX INFO: renamed from: g */
    private boolean f17836g;

    /* JADX INFO: renamed from: k */
    private FrameLayout f17837k;

    /* JADX INFO: renamed from: n */
    private int f17838n;

    /* JADX INFO: renamed from: q */
    private ColorDrawable f17839q;

    /* JADX INFO: renamed from: s */
    private zy f17840s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private FrameLayout f61586toq;

    /* JADX INFO: renamed from: y */
    private zy f17841y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private View f61587zy;

    /* JADX INFO: renamed from: com.android.thememanager.widget.k$k */
    /* JADX INFO: compiled from: DropDownPopupWindow.java */
    class k extends zy {
        k() {
            super(C2962k.this, null);
        }

        @Override // com.android.thememanager.widget.C2962k.zy, android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            super.onAnimationStart(animation);
            C2962k.this.f61587zy.setVisibility(0);
            C2962k.this.f61587zy.setTranslationY(-C2962k.this.f61587zy.getMeasuredHeight());
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.widget.k$q */
    /* JADX INFO: compiled from: DropDownPopupWindow.java */
    private class q extends FrameLayout {
        public q(Context context) {
            super(context);
            setClickable(true);
        }

        @Override // android.view.ViewGroup, android.view.View
        public void dispatchDraw(Canvas canvas) {
            super.dispatchDraw(canvas);
            if (C2962k.this.f17836g) {
                C2962k.this.f17836g = false;
                C2962k c2962k = C2962k.this;
                c2962k.m10520p(c2962k.m10523y());
            }
        }

        @Override // android.view.View
        public boolean performClick() {
            C2962k.this.dismiss();
            return true;
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.widget.k$toq */
    /* JADX INFO: compiled from: DropDownPopupWindow.java */
    class toq extends zy {
        toq() {
            super(C2962k.this, null);
        }

        @Override // com.android.thememanager.widget.C2962k.zy, android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            super.onAnimationEnd(animation);
            C2962k.super.dismiss();
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.widget.k$zy */
    /* JADX INFO: compiled from: DropDownPopupWindow.java */
    private class zy extends AnimatorListenerAdapter {
        private zy() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            C2962k.this.f61585f7l8 = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            C2962k.this.f61585f7l8 = true;
        }

        /* synthetic */ zy(C2962k c2962k, k kVar) {
            this();
        }
    }

    public C2962k(Context context, View contentView) {
        super(-1, -1);
        this.f17841y = new k();
        this.f17840s = new toq();
        this.f61587zy = contentView;
        this.f17837k = new q(context);
        this.f17837k.addView(contentView, new FrameLayout.LayoutParams(-1, -2));
        ColorDrawable colorDrawable = new ColorDrawable(f61584ld6);
        this.f17839q = colorDrawable;
        this.f17838n = colorDrawable.getAlpha();
        this.f17837k.setBackground(this.f17839q);
        setContentView(this.f17837k);
        setFocusable(true);
        setAnimationStyle(0);
        setBackgroundDrawable(context.getResources().getDrawable(R.color.transparent));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public void m10520p(Animator animator) {
        if (this.f61585f7l8) {
            return;
        }
        animator.start();
    }

    /* JADX INFO: renamed from: s */
    private Animator m10522s() {
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this.f17839q, "alpha", this.f17838n, 0);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f61587zy, "translationY", 0.0f, -r2.getMeasuredHeight());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.setDuration(200L);
        animatorSet.play(objectAnimatorOfFloat).with(objectAnimatorOfInt);
        animatorSet.addListener(this.f17840s);
        return animatorSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public Animator m10523y() {
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this.f17839q, "alpha", 0, this.f17838n);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f61587zy, "translationY", -r2.getMeasuredHeight(), 0.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.setDuration(200L);
        animatorSet.play(objectAnimatorOfFloat).with(objectAnimatorOfInt);
        animatorSet.addListener(this.f17841y);
        return animatorSet;
    }

    @Override // android.widget.PopupWindow
    public void dismiss() {
        m10520p(m10522s());
    }

    public void ld6(Drawable bg) {
        x2(bg, 48);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View anchor, int xoff, int yoff) {
        super.showAsDropDown(anchor, xoff, yoff);
        this.f17839q.setAlpha(0);
        this.f61587zy.setVisibility(4);
        this.f17836g = true;
    }

    @Override // android.widget.PopupWindow
    public void showAtLocation(View parent, int gravity, int x3, int y3) {
        super.showAtLocation(parent, gravity, x3, y3);
        this.f17839q.setAlpha(0);
        this.f61587zy.setVisibility(4);
        this.f17836g = true;
    }

    public void x2(Drawable bg, int gravity) {
        if (this.f61586toq == null) {
            this.f61586toq = new FrameLayout(this.f17837k.getContext());
            this.f17837k.addView(this.f61586toq, new FrameLayout.LayoutParams(-1, -2));
        }
        this.f61586toq.setBackground(bg);
        ((FrameLayout.LayoutParams) this.f61586toq.getLayoutParams()).gravity = gravity;
    }
}
