package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import zy.dd;
import zy.lvui;

/* JADX INFO: compiled from: ScaleProvider.java */
/* JADX INFO: loaded from: classes2.dex */
public final class ki implements zurt {

    /* JADX INFO: renamed from: g */
    private boolean f25443g;

    /* JADX INFO: renamed from: k */
    private float f25444k;

    /* JADX INFO: renamed from: n */
    private boolean f25445n;

    /* JADX INFO: renamed from: q */
    private float f25446q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private float f67984toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private float f67985zy;

    /* JADX INFO: renamed from: com.google.android.material.transition.ki$k */
    /* JADX INFO: compiled from: ScaleProvider.java */
    class C4196k extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ View f25447k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ float f25448n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ float f25449q;

        C4196k(View view, float f2, float f3) {
            this.f25447k = view;
            this.f25449q = f2;
            this.f25448n = f3;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f25447k.setScaleX(this.f25449q);
            this.f25447k.setScaleY(this.f25448n);
        }
    }

    public ki() {
        this(true);
    }

    private static Animator zy(View view, float f2, float f3) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, scaleX * f2, scaleX * f3), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, f2 * scaleY, f3 * scaleY));
        objectAnimatorOfPropertyValuesHolder.addListener(new C4196k(view, scaleX, scaleY));
        return objectAnimatorOfPropertyValuesHolder;
    }

    public float f7l8() {
        return this.f25444k;
    }

    /* JADX INFO: renamed from: g */
    public float m15175g() {
        return this.f67984toq;
    }

    @Override // com.google.android.material.transition.zurt
    @dd
    /* JADX INFO: renamed from: k */
    public Animator mo15176k(@lvui ViewGroup viewGroup, @lvui View view) {
        if (this.f25443g) {
            return this.f25445n ? zy(view, this.f25444k, this.f67984toq) : zy(view, this.f25446q, this.f67985zy);
        }
        return null;
    }

    public void kja0(boolean z2) {
        this.f25443g = z2;
    }

    public void ld6(float f2) {
        this.f25446q = f2;
    }

    /* JADX INFO: renamed from: n */
    public float m15177n() {
        return this.f67985zy;
    }

    public void n7h(float f2) {
        this.f25444k = f2;
    }

    /* JADX INFO: renamed from: p */
    public void m15178p(boolean z2) {
        this.f25445n = z2;
    }

    /* JADX INFO: renamed from: q */
    public float m15179q() {
        return this.f25446q;
    }

    public void qrj(float f2) {
        this.f67984toq = f2;
    }

    /* JADX INFO: renamed from: s */
    public boolean m15180s() {
        return this.f25443g;
    }

    @Override // com.google.android.material.transition.zurt
    @dd
    public Animator toq(@lvui ViewGroup viewGroup, @lvui View view) {
        return this.f25445n ? zy(view, this.f67985zy, this.f25446q) : zy(view, this.f67984toq, this.f25444k);
    }

    public void x2(float f2) {
        this.f67985zy = f2;
    }

    /* JADX INFO: renamed from: y */
    public boolean m15181y() {
        return this.f25445n;
    }

    public ki(boolean z2) {
        this.f25444k = 1.0f;
        this.f67984toq = 1.1f;
        this.f67985zy = 0.8f;
        this.f25446q = 1.0f;
        this.f25443g = true;
        this.f25445n = z2;
    }
}
