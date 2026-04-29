package com.google.android.material.animation;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import zy.dd;
import zy.lvui;

/* JADX INFO: renamed from: com.google.android.material.animation.s */
/* JADX INFO: compiled from: MotionTiming.java */
/* JADX INFO: loaded from: classes2.dex */
public class C3914s {

    /* JADX INFO: renamed from: k */
    private long f23777k;

    /* JADX INFO: renamed from: n */
    private int f23778n;

    /* JADX INFO: renamed from: q */
    private int f23779q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private long f67317toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @dd
    private TimeInterpolator f67318zy;

    public C3914s(long j2, long j3) {
        this.f67318zy = null;
        this.f23779q = 0;
        this.f23778n = 1;
        this.f23777k = j2;
        this.f67317toq = j3;
    }

    /* JADX INFO: renamed from: g */
    private static TimeInterpolator m13984g(@lvui ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        return ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) ? C3910k.f67312toq : interpolator instanceof AccelerateInterpolator ? C3910k.f67313zy : interpolator instanceof DecelerateInterpolator ? C3910k.f23773q : interpolator;
    }

    @lvui
    static C3914s toq(@lvui ValueAnimator valueAnimator) {
        C3914s c3914s = new C3914s(valueAnimator.getStartDelay(), valueAnimator.getDuration(), m13984g(valueAnimator));
        c3914s.f23779q = valueAnimator.getRepeatCount();
        c3914s.f23778n = valueAnimator.getRepeatMode();
        return c3914s;
    }

    public boolean equals(@dd Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3914s)) {
            return false;
        }
        C3914s c3914s = (C3914s) obj;
        if (zy() == c3914s.zy() && m13987q() == c3914s.m13987q() && f7l8() == c3914s.f7l8() && m13988y() == c3914s.m13988y()) {
            return m13986n().getClass().equals(c3914s.m13986n().getClass());
        }
        return false;
    }

    public int f7l8() {
        return this.f23779q;
    }

    public int hashCode() {
        return (((((((((int) (zy() ^ (zy() >>> 32))) * 31) + ((int) (m13987q() ^ (m13987q() >>> 32)))) * 31) + m13986n().getClass().hashCode()) * 31) + f7l8()) * 31) + m13988y();
    }

    /* JADX INFO: renamed from: k */
    public void m13985k(@lvui Animator animator) {
        animator.setStartDelay(zy());
        animator.setDuration(m13987q());
        animator.setInterpolator(m13986n());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(f7l8());
            valueAnimator.setRepeatMode(m13988y());
        }
    }

    @dd
    /* JADX INFO: renamed from: n */
    public TimeInterpolator m13986n() {
        TimeInterpolator timeInterpolator = this.f67318zy;
        return timeInterpolator != null ? timeInterpolator : C3910k.f67312toq;
    }

    /* JADX INFO: renamed from: q */
    public long m13987q() {
        return this.f67317toq;
    }

    @lvui
    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + zy() + " duration: " + m13987q() + " interpolator: " + m13986n().getClass() + " repeatCount: " + f7l8() + " repeatMode: " + m13988y() + "}\n";
    }

    /* JADX INFO: renamed from: y */
    public int m13988y() {
        return this.f23778n;
    }

    public long zy() {
        return this.f23777k;
    }

    public C3914s(long j2, long j3, @lvui TimeInterpolator timeInterpolator) {
        this.f23779q = 0;
        this.f23778n = 1;
        this.f23777k = j2;
        this.f67317toq = j3;
        this.f67318zy = timeInterpolator;
    }
}
