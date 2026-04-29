package com.airbnb.lottie.value;

import com.miui.maml.folme.AnimatedProperty;

/* JADX INFO: compiled from: ScaleXY.java */
/* JADX INFO: loaded from: classes.dex */
public class ld6 {

    /* JADX INFO: renamed from: k */
    private float f8307k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private float f56201toq;

    public ld6(float f2, float f3) {
        this.f8307k = f2;
        this.f56201toq = f3;
    }

    /* JADX INFO: renamed from: k */
    public boolean m6283k(float f2, float f3) {
        return this.f8307k == f2 && this.f56201toq == f3;
    }

    /* JADX INFO: renamed from: q */
    public void m6284q(float f2, float f3) {
        this.f8307k = f2;
        this.f56201toq = f3;
    }

    public String toString() {
        return toq() + AnimatedProperty.PROPERTY_NAME_X + zy();
    }

    public float toq() {
        return this.f8307k;
    }

    public float zy() {
        return this.f56201toq;
    }

    public ld6() {
        this(1.0f, 1.0f);
    }
}
