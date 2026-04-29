package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.animation.C3910k;
import zy.cdj;
import zy.dd;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.zy<V> {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final int f67359f7l8 = 1;

    /* JADX INFO: renamed from: g */
    protected static final int f23926g = 175;

    /* JADX INFO: renamed from: n */
    protected static final int f23927n = 225;

    /* JADX INFO: renamed from: y */
    private static final int f23928y = 2;

    /* JADX INFO: renamed from: k */
    private int f23929k;

    /* JADX INFO: renamed from: q */
    @dd
    private ViewPropertyAnimator f23930q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private int f67360toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private int f67361zy;

    /* JADX INFO: renamed from: com.google.android.material.behavior.HideBottomViewOnScrollBehavior$k */
    class C3936k extends AnimatorListenerAdapter {
        C3936k() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.f23930q = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
        this.f23929k = 0;
        this.f67360toq = 2;
        this.f67361zy = 0;
    }

    private void gvn7(@lvui V v2, int i2, long j2, TimeInterpolator timeInterpolator) {
        this.f23930q = v2.animate().translationY(i2).setInterpolator(timeInterpolator).setDuration(j2).setListener(new C3936k());
    }

    public void d2ok(@lvui V v2) {
        lvui(v2, true);
    }

    public boolean d3() {
        return this.f67360toq == 1;
    }

    public void dd(@lvui V v2, boolean z2) {
        if (oc()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f23930q;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v2.clearAnimation();
        }
        this.f67360toq = 2;
        if (z2) {
            gvn7(v2, 0, 225L, C3910k.f23773q);
        } else {
            v2.setTranslationY(0);
        }
    }

    public void eqxt(@lvui V v2, @cdj int i2) {
        this.f67361zy = i2;
        if (this.f67360toq == 1) {
            v2.setTranslationY(this.f23929k + i2);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.zy
    public void fn3e(CoordinatorLayout coordinatorLayout, @lvui V v2, @lvui View view, int i2, int i3, int i4, int i5, int i6, @lvui int[] iArr) {
        if (i3 > 0) {
            d2ok(v2);
        } else if (i3 < 0) {
            m14108r(v2);
        }
    }

    public void lvui(@lvui V v2, boolean z2) {
        if (d3()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f23930q;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v2.clearAnimation();
        }
        this.f67360toq = 1;
        int i2 = this.f23929k + this.f67361zy;
        if (z2) {
            gvn7(v2, i2, 175L, C3910k.f67313zy);
        } else {
            v2.setTranslationY(i2);
        }
    }

    public boolean oc() {
        return this.f67360toq == 2;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.zy
    public boolean qrj(@lvui CoordinatorLayout coordinatorLayout, @lvui V v2, int i2) {
        this.f23929k = v2.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v2.getLayoutParams()).bottomMargin;
        return super.qrj(coordinatorLayout, v2, i2);
    }

    /* JADX INFO: renamed from: r */
    public void m14108r(@lvui V v2) {
        dd(v2, true);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.zy
    /* JADX INFO: renamed from: t */
    public boolean mo1758t(@lvui CoordinatorLayout coordinatorLayout, @lvui V v2, @lvui View view, @lvui View view2, int i2, int i3) {
        return i2 == 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23929k = 0;
        this.f67360toq = 2;
        this.f67361zy = 0;
    }
}
