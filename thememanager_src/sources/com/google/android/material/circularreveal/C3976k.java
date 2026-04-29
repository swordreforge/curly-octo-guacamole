package com.google.android.material.circularreveal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import com.google.android.material.circularreveal.zy;
import zy.lvui;

/* JADX INFO: renamed from: com.google.android.material.circularreveal.k */
/* JADX INFO: compiled from: CircularRevealCompat.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C3976k {

    /* JADX INFO: renamed from: com.google.android.material.circularreveal.k$k */
    /* JADX INFO: compiled from: CircularRevealCompat.java */
    class k extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ zy f24160k;

        k(zy zyVar) {
            this.f24160k = zyVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f24160k.toq();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f24160k.mo14242k();
        }
    }

    private C3976k() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @lvui
    /* JADX INFO: renamed from: k */
    public static Animator m14244k(@lvui zy zyVar, float f2, float f3, float f4) {
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(zyVar, (Property<zy, V>) zy.C7974zy.f24172k, (TypeEvaluator) zy.toq.f67485toq, (Object[]) new zy.C3979n[]{new zy.C3979n(f2, f3, f4)});
        zy.C3979n revealInfo = zyVar.getRevealInfo();
        if (revealInfo == null) {
            throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
        }
        Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal((View) zyVar, (int) f2, (int) f3, revealInfo.f67484zy, f4);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfObject, animatorCreateCircularReveal);
        return animatorSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @lvui
    public static Animator toq(zy zyVar, float f2, float f3, float f4, float f5) {
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(zyVar, (Property<zy, V>) zy.C7974zy.f24172k, (TypeEvaluator) zy.toq.f67485toq, (Object[]) new zy.C3979n[]{new zy.C3979n(f2, f3, f4), new zy.C3979n(f2, f3, f5)});
        Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal((View) zyVar, (int) f2, (int) f3, f4, f5);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfObject, animatorCreateCircularReveal);
        return animatorSet;
    }

    @lvui
    public static Animator.AnimatorListener zy(@lvui zy zyVar) {
        return new k(zyVar);
    }
}
