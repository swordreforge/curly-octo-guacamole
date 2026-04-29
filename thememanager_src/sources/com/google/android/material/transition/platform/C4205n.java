package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import zy.dd;
import zy.hyr;
import zy.lvui;

/* JADX INFO: renamed from: com.google.android.material.transition.platform.n */
/* JADX INFO: compiled from: FadeThroughProvider.java */
/* JADX INFO: loaded from: classes2.dex */
@hyr(21)
public final class C4205n implements ni7 {

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    static final float f67992toq = 0.35f;

    /* JADX INFO: renamed from: k */
    private float f25485k = f67992toq;

    /* JADX INFO: renamed from: com.google.android.material.transition.platform.n$k */
    /* JADX INFO: compiled from: FadeThroughProvider.java */
    class k implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: g */
        final /* synthetic */ float f25486g;

        /* JADX INFO: renamed from: k */
        final /* synthetic */ View f25487k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ float f25488n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ float f25489q;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ float f25490y;

        k(View view, float f2, float f3, float f4, float f5) {
            this.f25487k = view;
            this.f25489q = f2;
            this.f25488n = f3;
            this.f25486g = f4;
            this.f25490y = f5;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f25487k.setAlpha(zurt.x2(this.f25489q, this.f25488n, this.f25486g, this.f25490y, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.transition.platform.n$toq */
    /* JADX INFO: compiled from: FadeThroughProvider.java */
    class toq extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ View f25491k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ float f25492q;

        toq(View view, float f2) {
            this.f25491k = view;
            this.f25492q = f2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f25491k.setAlpha(this.f25492q);
        }
    }

    private static Animator zy(View view, float f2, float f3, @zy.zurt(from = 0.0d, to = 1.0d) float f4, @zy.zurt(from = 0.0d, to = 1.0d) float f5, float f6) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new k(view, f2, f3, f4, f5));
        valueAnimatorOfFloat.addListener(new toq(view, f6));
        return valueAnimatorOfFloat;
    }

    @Override // com.google.android.material.transition.platform.ni7
    @dd
    /* JADX INFO: renamed from: k */
    public Animator mo15198k(@lvui ViewGroup viewGroup, @lvui View view) {
        float alpha = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
        return zy(view, alpha, 0.0f, 0.0f, this.f25485k, alpha);
    }

    /* JADX INFO: renamed from: n */
    public void m15206n(@zy.zurt(from = 0.0d, to = 1.0d) float f2) {
        this.f25485k = f2;
    }

    /* JADX INFO: renamed from: q */
    public float m15207q() {
        return this.f25485k;
    }

    @Override // com.google.android.material.transition.platform.ni7
    @dd
    public Animator toq(@lvui ViewGroup viewGroup, @lvui View view) {
        float alpha = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
        return zy(view, 0.0f, alpha, this.f25485k, 1.0f, alpha);
    }
}
