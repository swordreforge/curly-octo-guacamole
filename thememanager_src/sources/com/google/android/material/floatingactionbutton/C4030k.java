package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import zy.dd;

/* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.k */
/* JADX INFO: compiled from: AnimatorTracker.java */
/* JADX INFO: loaded from: classes2.dex */
class C4030k {

    /* JADX INFO: renamed from: k */
    @dd
    private Animator f24445k;

    C4030k() {
    }

    /* JADX INFO: renamed from: k */
    public void m14492k() {
        Animator animator = this.f24445k;
        if (animator != null) {
            animator.cancel();
        }
    }

    public void toq() {
        this.f24445k = null;
    }

    public void zy(Animator animator) {
        m14492k();
        this.f24445k = animator;
    }
}
