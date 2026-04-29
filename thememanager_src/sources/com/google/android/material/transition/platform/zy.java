package com.google.android.material.transition.platform;

import zy.hyr;

/* JADX INFO: compiled from: FadeModeResult.java */
/* JADX INFO: loaded from: classes2.dex */
@hyr(21)
class zy {

    /* JADX INFO: renamed from: k */
    final int f25581k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    final int f68047toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    final boolean f68048zy;

    private zy(int i2, int i3, boolean z2) {
        this.f25581k = i2;
        this.f68047toq = i3;
        this.f68048zy = z2;
    }

    /* JADX INFO: renamed from: k */
    static zy m15271k(int i2, int i3) {
        return new zy(i2, i3, true);
    }

    static zy toq(int i2, int i3) {
        return new zy(i2, i3, false);
    }
}
