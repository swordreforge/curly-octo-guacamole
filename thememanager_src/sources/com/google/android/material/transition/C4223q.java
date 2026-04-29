package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import zy.dd;
import zy.lvui;

/* JADX INFO: renamed from: com.google.android.material.transition.q */
/* JADX INFO: compiled from: FadeProvider.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C4223q implements zurt {

    /* JADX INFO: renamed from: k */
    private float f25582k = 1.0f;

    /* JADX INFO: renamed from: com.google.android.material.transition.q$k */
    /* JADX INFO: compiled from: FadeProvider.java */
    class k implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: g */
        final /* synthetic */ float f25583g;

        /* JADX INFO: renamed from: k */
        final /* synthetic */ View f25584k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ float f25585n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ float f25586q;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ float f25587y;

        k(View view, float f2, float f3, float f4, float f5) {
            this.f25584k = view;
            this.f25586q = f2;
            this.f25585n = f3;
            this.f25583g = f4;
            this.f25587y = f5;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f25584k.setAlpha(fn3e.x2(this.f25586q, this.f25585n, this.f25583g, this.f25587y, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.transition.q$toq */
    /* JADX INFO: compiled from: FadeProvider.java */
    class toq extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ View f25588k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ float f25589q;

        toq(View view, float f2) {
            this.f25588k = view;
            this.f25589q = f2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f25588k.setAlpha(this.f25589q);
        }
    }

    private static Animator zy(View view, float f2, float f3, @zy.zurt(from = 0.0d, to = 1.0d) float f4, @zy.zurt(from = 0.0d, to = 1.0d) float f5, float f6) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new k(view, f2, f3, f4, f5));
        valueAnimatorOfFloat.addListener(new toq(view, f6));
        return valueAnimatorOfFloat;
    }

    @Override // com.google.android.material.transition.zurt
    @dd
    /* JADX INFO: renamed from: k */
    public Animator mo15176k(@lvui ViewGroup viewGroup, @lvui View view) {
        float alpha = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
        return zy(view, alpha, 0.0f, 0.0f, 1.0f, alpha);
    }

    /* JADX INFO: renamed from: n */
    public void m15272n(float f2) {
        this.f25582k = f2;
    }

    /* JADX INFO: renamed from: q */
    public float m15273q() {
        return this.f25582k;
    }

    @Override // com.google.android.material.transition.zurt
    @dd
    public Animator toq(@lvui ViewGroup viewGroup, @lvui View view) {
        float alpha = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
        return zy(view, 0.0f, alpha, 0.0f, this.f25582k, alpha);
    }
}
