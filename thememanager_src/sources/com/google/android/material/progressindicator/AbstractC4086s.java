package com.google.android.material.progressindicator;

import android.animation.Animator;
import androidx.vectordrawable.graphics.drawable.toq;
import zy.lvui;

/* JADX INFO: renamed from: com.google.android.material.progressindicator.s */
/* JADX INFO: compiled from: IndeterminateAnimatorDelegate.java */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC4086s<T extends Animator> {

    /* JADX INFO: renamed from: k */
    protected C4083p f24845k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    protected final float[] f67764toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    protected final int[] f67765zy;

    protected AbstractC4086s(int i2) {
        this.f67764toq = new float[i2 * 2];
        this.f67765zy = new int[i2];
    }

    abstract void f7l8();

    /* JADX INFO: renamed from: g */
    abstract void mo14713g();

    /* JADX INFO: renamed from: k */
    abstract void mo14715k();

    /* JADX INFO: renamed from: n */
    protected void m14724n(@lvui C4083p c4083p) {
        this.f24845k = c4083p;
    }

    /* JADX INFO: renamed from: q */
    public abstract void mo14716q(@lvui toq.AbstractC1258k abstractC1258k);

    protected float toq(int i2, int i3, int i4) {
        return (i2 - i3) / i4;
    }

    /* JADX INFO: renamed from: y */
    public abstract void mo14717y();

    public abstract void zy();
}
