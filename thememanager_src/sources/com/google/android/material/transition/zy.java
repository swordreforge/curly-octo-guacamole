package com.google.android.material.transition;

/* JADX INFO: compiled from: FadeModeResult.java */
/* JADX INFO: loaded from: classes2.dex */
class zy {

    /* JADX INFO: renamed from: k */
    final int f25625k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    final int f68088toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    final boolean f68089zy;

    private zy(int i2, int i3, boolean z2) {
        this.f25625k = i2;
        this.f68088toq = i3;
        this.f68089zy = z2;
    }

    /* JADX INFO: renamed from: k */
    static zy m15293k(int i2, int i3) {
        return new zy(i2, i3, true);
    }

    static zy toq(int i2, int i3) {
        return new zy(i2, i3, false);
    }
}
