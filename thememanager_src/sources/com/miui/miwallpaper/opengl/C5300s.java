package com.miui.miwallpaper.opengl;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;

/* JADX INFO: renamed from: com.miui.miwallpaper.opengl.s */
/* JADX INFO: compiled from: BlurGlassAnimatorProgram.java */
/* JADX INFO: loaded from: classes3.dex */
public class C5300s extends qrj {

    /* JADX INFO: renamed from: i */
    private static final float f29647i = 1.0f;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private static final float f72337t8r = 0.0f;

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private final ValueAnimator f72338cdj;

    /* JADX INFO: renamed from: h */
    private final String f29648h;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private final f7l8 f72339ki;

    /* JADX INFO: renamed from: com.miui.miwallpaper.opengl.s$k */
    /* JADX INFO: compiled from: BlurGlassAnimatorProgram.java */
    class k extends AnimatorListenerAdapter {
        k() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            C5300s.this.f72339ki.f29665i = 0.0f;
        }
    }

    public C5300s(f7l8 f7l8Var) {
        super(f7l8Var);
        this.f29648h = getClass().getSimpleName();
        this.f72339ki = f7l8Var;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f72338cdj = valueAnimator;
        valueAnimator.setDuration(650L);
        valueAnimator.setInterpolator(new DecelerateInterpolator(1.5f));
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.miui.miwallpaper.opengl.y
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.f29666k.kja0(valueAnimator2);
            }
        });
        valueAnimator.addListener(new k());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void kja0(ValueAnimator valueAnimator) {
        this.f72339ki.f29665i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        zurt();
    }

    @Override // com.miui.miwallpaper.opengl.C5294n
    public void a9() {
        if (this.f72338cdj.isRunning()) {
            this.f72338cdj.cancel();
        }
        this.f72338cdj.setFloatValues(0.0f, 1.0f);
        this.f72338cdj.start();
    }

    @Override // com.miui.miwallpaper.opengl.C5294n
    public void fu4() {
        if (this.f72338cdj.isRunning()) {
            this.f72338cdj.cancel();
        }
    }

    @Override // com.miui.miwallpaper.opengl.C5294n
    /* JADX INFO: renamed from: s */
    public int mo17985s() {
        return 3;
    }
}
