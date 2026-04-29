package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import zy.dd;
import zy.lvui;

/* JADX INFO: renamed from: com.google.android.material.transition.n */
/* JADX INFO: compiled from: FadeThroughProvider.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C4197n implements zurt {

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    static final float f67986toq = 0.35f;

    /* JADX INFO: renamed from: k */
    private float f25450k = f67986toq;

    /* JADX INFO: renamed from: com.google.android.material.transition.n$k */
    /* JADX INFO: compiled from: FadeThroughProvider.java */
    class k implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: g */
        final /* synthetic */ float f25451g;

        /* JADX INFO: renamed from: k */
        final /* synthetic */ View f25452k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ float f25453n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ float f25454q;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ float f25455y;

        k(View view, float f2, float f3, float f4, float f5) {
            this.f25452k = view;
            this.f25454q = f2;
            this.f25453n = f3;
            this.f25451g = f4;
            this.f25455y = f5;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f25452k.setAlpha(fn3e.x2(this.f25454q, this.f25453n, this.f25451g, this.f25455y, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.transition.n$toq */
    /* JADX INFO: compiled from: FadeThroughProvider.java */
    class toq extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ View f25456k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ float f25457q;

        toq(View view, float f2) {
            this.f25456k = view;
            this.f25457q = f2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f25456k.setAlpha(this.f25457q);
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
        return zy(view, alpha, 0.0f, 0.0f, this.f25450k, alpha);
    }

    /* JADX INFO: renamed from: n */
    public void m15182n(@zy.zurt(from = 0.0d, to = 1.0d) float f2) {
        this.f25450k = f2;
    }

    /* JADX INFO: renamed from: q */
    public float m15183q() {
        return this.f25450k;
    }

    @Override // com.google.android.material.transition.zurt
    @dd
    public Animator toq(@lvui ViewGroup viewGroup, @lvui View view) {
        float alpha = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
        return zy(view, 0.0f, alpha, this.f25450k, 1.0f, alpha);
    }
}
