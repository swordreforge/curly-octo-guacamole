package com.miui.miwallpaper.opengl;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;

/* JADX INFO: compiled from: SquareGlassAnimatorProgram.java */
/* JADX INFO: loaded from: classes3.dex */
public class a9 extends qrj {

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private static final int f72249fn3e = 2000;

    /* JADX INFO: renamed from: i */
    private static final float f29583i = 1.0f;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private static final float f72250t8r = 0.0f;

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private final ValueAnimator f72251cdj;

    /* JADX INFO: renamed from: h */
    private final String f29584h;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private final fti f72252ki;

    /* JADX INFO: renamed from: com.miui.miwallpaper.opengl.a9$k */
    /* JADX INFO: compiled from: SquareGlassAnimatorProgram.java */
    class C5287k extends AnimatorListenerAdapter {
        C5287k() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            a9.this.f72252ki.f29665i = 0.0f;
        }
    }

    public a9(fti ftiVar) {
        super(ftiVar);
        this.f29584h = getClass().getSimpleName();
        this.f72252ki = ftiVar;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f72251cdj = valueAnimator;
        valueAnimator.setDuration(800L);
        valueAnimator.setInterpolator(new DecelerateInterpolator(1.0f));
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.miui.miwallpaper.opengl.jk
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.f29610k.kja0(valueAnimator2);
            }
        });
        valueAnimator.addListener(new C5287k());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void kja0(ValueAnimator valueAnimator) {
        this.f72252ki.f29665i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        zurt();
    }

    @Override // com.miui.miwallpaper.opengl.C5294n
    public void a9() {
        if (this.f72251cdj.isRunning()) {
            this.f72251cdj.cancel();
        }
        this.f72251cdj.setDuration(com.google.android.exoplayer2.t8r.f65475toq);
        this.f72251cdj.setFloatValues(0.0f, 1.0f);
        this.f72251cdj.start();
    }

    @Override // com.miui.miwallpaper.opengl.C5294n
    public void fu4() {
        if (this.f72251cdj.isRunning()) {
            this.f72251cdj.cancel();
        }
    }

    @Override // com.miui.miwallpaper.opengl.C5294n
    /* JADX INFO: renamed from: s */
    public int mo17985s() {
        return 4;
    }
}
