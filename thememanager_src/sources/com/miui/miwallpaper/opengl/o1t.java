package com.miui.miwallpaper.opengl;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import b8.C1364q;

/* JADX INFO: compiled from: MoruGlassAnimatorProgram.java */
/* JADX INFO: loaded from: classes3.dex */
public class o1t extends qrj {

    /* JADX INFO: renamed from: i */
    private static final float f29643i = 1.0f;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private static final float f72326t8r = 0.0f;

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private final ValueAnimator f72327cdj;

    /* JADX INFO: renamed from: h */
    private final String f29644h;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private final ni7 f72328ki;

    /* JADX INFO: renamed from: com.miui.miwallpaper.opengl.o1t$k */
    /* JADX INFO: compiled from: MoruGlassAnimatorProgram.java */
    class C5297k extends AnimatorListenerAdapter {
        C5297k() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            o1t.this.f72328ki.f29665i = 0.0f;
        }
    }

    public o1t(ni7 ni7Var) {
        super(ni7Var);
        this.f29644h = getClass().getSimpleName();
        this.f72328ki = ni7Var;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f72327cdj = valueAnimator;
        valueAnimator.setDuration(fu4.getMoruAnimInfoById(m18019p()).animDuration);
        valueAnimator.setInterpolator(fu4.getMoruAnimInfoById(m18019p()).interpolator);
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.miui.miwallpaper.opengl.z
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.f29667k.kja0(valueAnimator2);
            }
        });
        valueAnimator.addListener(new C5297k());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void kja0(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f72328ki.f29665i = fFloatValue;
        if (C1364q.toq(this.f72317toq.f29603k) != 120) {
            zurt();
            return;
        }
        int i2 = this.f72333kja0;
        if (i2 % 2 != 0 && fFloatValue != 1.0f) {
            this.f72333kja0 = i2 + 1;
        } else {
            this.f72333kja0 = 1;
            zurt();
        }
    }

    @Override // com.miui.miwallpaper.opengl.C5294n
    public void a9() {
        if (this.f72327cdj.isRunning()) {
            this.f72327cdj.cancel();
        }
        this.f72327cdj.setFloatValues(0.0f, 1.0f);
        this.f72327cdj.start();
    }

    @Override // com.miui.miwallpaper.opengl.C5294n
    public void fu4() {
        if (this.f72327cdj.isRunning()) {
            this.f72327cdj.cancel();
        }
        ni7();
    }

    @Override // com.miui.miwallpaper.opengl.C5294n
    /* JADX INFO: renamed from: s */
    public int mo17985s() {
        return 1;
    }

    @Override // com.miui.miwallpaper.opengl.C5294n, com.miui.miwallpaper.opengl.kja0
    public void zy() {
        super.zy();
    }
}
