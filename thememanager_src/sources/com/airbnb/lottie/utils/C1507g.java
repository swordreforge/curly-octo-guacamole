package com.airbnb.lottie.utils;

/* JADX INFO: renamed from: com.airbnb.lottie.utils.g */
/* JADX INFO: compiled from: MeanCalculator.java */
/* JADX INFO: loaded from: classes.dex */
public class C1507g {

    /* JADX INFO: renamed from: k */
    private float f8275k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private int f56186toq;

    /* JADX INFO: renamed from: k */
    public void m6243k(float f2) {
        float f3 = this.f8275k + f2;
        this.f8275k = f3;
        int i2 = this.f56186toq + 1;
        this.f56186toq = i2;
        if (i2 == Integer.MAX_VALUE) {
            this.f8275k = f3 / 2.0f;
            this.f56186toq = i2 / 2;
        }
    }

    public float toq() {
        int i2 = this.f56186toq;
        if (i2 == 0) {
            return 0.0f;
        }
        return this.f8275k / i2;
    }
}
