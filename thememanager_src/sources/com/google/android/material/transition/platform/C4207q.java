package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import zy.dd;
import zy.hyr;
import zy.lvui;

/* JADX INFO: renamed from: com.google.android.material.transition.platform.q */
/* JADX INFO: compiled from: FadeProvider.java */
/* JADX INFO: loaded from: classes2.dex */
@hyr(21)
public final class C4207q implements ni7 {

    /* JADX INFO: renamed from: k */
    private float f25498k = 1.0f;

    /* JADX INFO: renamed from: com.google.android.material.transition.platform.q$k */
    /* JADX INFO: compiled from: FadeProvider.java */
    class k implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: g */
        final /* synthetic */ float f25499g;

        /* JADX INFO: renamed from: k */
        final /* synthetic */ View f25500k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ float f25501n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ float f25502q;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ float f25503y;

        k(View view, float f2, float f3, float f4, float f5) {
            this.f25500k = view;
            this.f25502q = f2;
            this.f25501n = f3;
            this.f25499g = f4;
            this.f25503y = f5;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f25500k.setAlpha(zurt.x2(this.f25502q, this.f25501n, this.f25499g, this.f25503y, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.transition.platform.q$toq */
    /* JADX INFO: compiled from: FadeProvider.java */
    class toq extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ View f25504k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ float f25505q;

        toq(View view, float f2) {
            this.f25504k = view;
            this.f25505q = f2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f25504k.setAlpha(this.f25505q);
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
        return zy(view, alpha, 0.0f, 0.0f, 1.0f, alpha);
    }

    /* JADX INFO: renamed from: n */
    public void m15211n(float f2) {
        this.f25498k = f2;
    }

    /* JADX INFO: renamed from: q */
    public float m15212q() {
        return this.f25498k;
    }

    @Override // com.google.android.material.transition.platform.ni7
    @dd
    public Animator toq(@lvui ViewGroup viewGroup, @lvui View view) {
        float alpha = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
        return zy(view, 0.0f, alpha, 0.0f, this.f25498k, alpha);
    }
}
