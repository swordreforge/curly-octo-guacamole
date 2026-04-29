package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.util.StateSet;
import java.util.ArrayList;
import zy.dd;
import zy.lvui;
import zy.uv6;

/* JADX INFO: compiled from: StateListAnimator.java */
/* JADX INFO: loaded from: classes2.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP})
public final class x2 {

    /* JADX INFO: renamed from: k */
    private final ArrayList<toq> f24634k = new ArrayList<>();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @dd
    private toq f67722toq = null;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @dd
    ValueAnimator f67723zy = null;

    /* JADX INFO: renamed from: q */
    private final Animator.AnimatorListener f24635q = new C4056k();

    /* JADX INFO: renamed from: com.google.android.material.internal.x2$k */
    /* JADX INFO: compiled from: StateListAnimator.java */
    class C4056k extends AnimatorListenerAdapter {
        C4056k() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            x2 x2Var = x2.this;
            if (x2Var.f67723zy == animator) {
                x2Var.f67723zy = null;
            }
        }
    }

    /* JADX INFO: compiled from: StateListAnimator.java */
    static class toq {

        /* JADX INFO: renamed from: k */
        final int[] f24637k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final ValueAnimator f67724toq;

        toq(int[] iArr, ValueAnimator valueAnimator) {
            this.f24637k = iArr;
            this.f67724toq = valueAnimator;
        }
    }

    /* JADX INFO: renamed from: n */
    private void m14618n(@lvui toq toqVar) {
        ValueAnimator valueAnimator = toqVar.f67724toq;
        this.f67723zy = valueAnimator;
        valueAnimator.start();
    }

    private void toq() {
        ValueAnimator valueAnimator = this.f67723zy;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f67723zy = null;
        }
    }

    /* JADX INFO: renamed from: k */
    public void m14619k(int[] iArr, ValueAnimator valueAnimator) {
        toq toqVar = new toq(iArr, valueAnimator);
        valueAnimator.addListener(this.f24635q);
        this.f24634k.add(toqVar);
    }

    /* JADX INFO: renamed from: q */
    public void m14620q(int[] iArr) {
        toq toqVar;
        int size = this.f24634k.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                toqVar = null;
                break;
            }
            toqVar = this.f24634k.get(i2);
            if (StateSet.stateSetMatches(toqVar.f24637k, iArr)) {
                break;
            } else {
                i2++;
            }
        }
        toq toqVar2 = this.f67722toq;
        if (toqVar == toqVar2) {
            return;
        }
        if (toqVar2 != null) {
            toq();
        }
        this.f67722toq = toqVar;
        if (toqVar != null) {
            m14618n(toqVar);
        }
    }

    public void zy() {
        ValueAnimator valueAnimator = this.f67723zy;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.f67723zy = null;
        }
    }
}
