package com.airbnb.lottie.utils;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: com.airbnb.lottie.utils.k */
/* JADX INFO: compiled from: BaseLottieAnimator.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1508k extends ValueAnimator {

    /* JADX INFO: renamed from: k */
    private final Set<ValueAnimator.AnimatorUpdateListener> f8276k = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: q */
    private final Set<Animator.AnimatorListener> f8277q = new CopyOnWriteArraySet();

    @Override // android.animation.Animator
    public void addListener(Animator.AnimatorListener animatorListener) {
        this.f8277q.add(animatorListener);
    }

    @Override // android.animation.ValueAnimator
    public void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f8276k.add(animatorUpdateListener);
    }

    /* JADX INFO: renamed from: g */
    void m6244g(boolean z2) {
        Iterator<Animator.AnimatorListener> it = this.f8277q.iterator();
        while (it.hasNext()) {
            it.next().onAnimationStart(this, z2);
        }
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    /* JADX INFO: renamed from: k */
    void mo6245k() {
        Iterator<Animator.AnimatorListener> it = this.f8277q.iterator();
        while (it.hasNext()) {
            it.next().onAnimationCancel(this);
        }
    }

    /* JADX INFO: renamed from: n */
    void m6246n() {
        Iterator<Animator.AnimatorListener> it = this.f8277q.iterator();
        while (it.hasNext()) {
            it.next().onAnimationRepeat(this);
        }
    }

    /* JADX INFO: renamed from: q */
    void m6247q(boolean z2) {
        Iterator<Animator.AnimatorListener> it = this.f8277q.iterator();
        while (it.hasNext()) {
            it.next().onAnimationEnd(this, z2);
        }
    }

    @Override // android.animation.Animator
    public void removeAllListeners() {
        this.f8277q.clear();
    }

    @Override // android.animation.ValueAnimator
    public void removeAllUpdateListeners() {
        this.f8276k.clear();
    }

    @Override // android.animation.Animator
    public void removeListener(Animator.AnimatorListener animatorListener) {
        this.f8277q.remove(animatorListener);
    }

    @Override // android.animation.ValueAnimator
    public void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f8276k.remove(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void setInterpolator(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void setStartDelay(long j2) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }

    /* JADX INFO: renamed from: y */
    void m6248y() {
        Iterator<ValueAnimator.AnimatorUpdateListener> it = this.f8276k.iterator();
        while (it.hasNext()) {
            it.next().onAnimationUpdate(this);
        }
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public ValueAnimator setDuration(long j2) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }
}
