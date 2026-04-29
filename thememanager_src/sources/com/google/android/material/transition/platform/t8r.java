package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import zy.dd;
import zy.hyr;
import zy.lvui;

/* JADX INFO: compiled from: ScaleProvider.java */
/* JADX INFO: loaded from: classes2.dex */
@hyr(21)
public final class t8r implements ni7 {

    /* JADX INFO: renamed from: g */
    private boolean f25513g;

    /* JADX INFO: renamed from: k */
    private float f25514k;

    /* JADX INFO: renamed from: n */
    private boolean f25515n;

    /* JADX INFO: renamed from: q */
    private float f25516q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private float f68000toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private float f68001zy;

    /* JADX INFO: renamed from: com.google.android.material.transition.platform.t8r$k */
    /* JADX INFO: compiled from: ScaleProvider.java */
    class C4212k extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ View f25517k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ float f25518n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ float f25519q;

        C4212k(View view, float f2, float f3) {
            this.f25517k = view;
            this.f25519q = f2;
            this.f25518n = f3;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f25517k.setScaleX(this.f25519q);
            this.f25517k.setScaleY(this.f25518n);
        }
    }

    public t8r() {
        this(true);
    }

    private static Animator zy(View view, float f2, float f3) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, scaleX * f2, scaleX * f3), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, f2 * scaleY, f3 * scaleY));
        objectAnimatorOfPropertyValuesHolder.addListener(new C4212k(view, scaleX, scaleY));
        return objectAnimatorOfPropertyValuesHolder;
    }

    public float f7l8() {
        return this.f25514k;
    }

    /* JADX INFO: renamed from: g */
    public float m15222g() {
        return this.f68000toq;
    }

    @Override // com.google.android.material.transition.platform.ni7
    @dd
    /* JADX INFO: renamed from: k */
    public Animator mo15198k(@lvui ViewGroup viewGroup, @lvui View view) {
        if (this.f25513g) {
            return this.f25515n ? zy(view, this.f25514k, this.f68000toq) : zy(view, this.f25516q, this.f68001zy);
        }
        return null;
    }

    public void kja0(boolean z2) {
        this.f25513g = z2;
    }

    public void ld6(float f2) {
        this.f25516q = f2;
    }

    /* JADX INFO: renamed from: n */
    public float m15223n() {
        return this.f68001zy;
    }

    public void n7h(float f2) {
        this.f25514k = f2;
    }

    /* JADX INFO: renamed from: p */
    public void m15224p(boolean z2) {
        this.f25515n = z2;
    }

    /* JADX INFO: renamed from: q */
    public float m15225q() {
        return this.f25516q;
    }

    public void qrj(float f2) {
        this.f68000toq = f2;
    }

    /* JADX INFO: renamed from: s */
    public boolean m15226s() {
        return this.f25513g;
    }

    @Override // com.google.android.material.transition.platform.ni7
    @dd
    public Animator toq(@lvui ViewGroup viewGroup, @lvui View view) {
        return this.f25515n ? zy(view, this.f68001zy, this.f25516q) : zy(view, this.f68000toq, this.f25514k);
    }

    public void x2(float f2) {
        this.f68001zy = f2;
    }

    /* JADX INFO: renamed from: y */
    public boolean m15227y() {
        return this.f25515n;
    }

    public t8r(boolean z2) {
        this.f25514k = 1.0f;
        this.f68000toq = 1.1f;
        this.f68001zy = 0.8f;
        this.f25516q = 1.0f;
        this.f25513g = true;
        this.f25515n = z2;
    }
}
