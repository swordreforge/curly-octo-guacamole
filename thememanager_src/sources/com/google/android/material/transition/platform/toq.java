package com.google.android.material.transition.platform;

import zy.hyr;

/* JADX INFO: compiled from: FadeModeEvaluators.java */
/* JADX INFO: loaded from: classes2.dex */
@hyr(21)
class toq {

    /* JADX INFO: renamed from: k */
    private static final InterfaceC4204k f25520k = new C4213k();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final InterfaceC4204k f68002toq = new C7980toq();

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final InterfaceC4204k f68003zy = new zy();

    /* JADX INFO: renamed from: q */
    private static final InterfaceC4204k f25521q = new C4214q();

    /* JADX INFO: renamed from: com.google.android.material.transition.platform.toq$k */
    /* JADX INFO: compiled from: FadeModeEvaluators.java */
    class C4213k implements InterfaceC4204k {
        C4213k() {
        }

        @Override // com.google.android.material.transition.platform.InterfaceC4204k
        /* JADX INFO: renamed from: k */
        public com.google.android.material.transition.platform.zy mo15200k(float f2, float f3, float f4, float f5) {
            return com.google.android.material.transition.platform.zy.m15271k(255, zurt.n7h(0, 255, f3, f4, f2));
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.transition.platform.toq$q */
    /* JADX INFO: compiled from: FadeModeEvaluators.java */
    class C4214q implements InterfaceC4204k {
        C4214q() {
        }

        @Override // com.google.android.material.transition.platform.InterfaceC4204k
        /* JADX INFO: renamed from: k */
        public com.google.android.material.transition.platform.zy mo15200k(float f2, float f3, float f4, float f5) {
            float f6 = ((f4 - f3) * f5) + f3;
            return com.google.android.material.transition.platform.zy.toq(zurt.n7h(255, 0, f3, f6, f2), zurt.n7h(0, 255, f6, f4, f2));
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.transition.platform.toq$toq, reason: collision with other inner class name */
    /* JADX INFO: compiled from: FadeModeEvaluators.java */
    class C7980toq implements InterfaceC4204k {
        C7980toq() {
        }

        @Override // com.google.android.material.transition.platform.InterfaceC4204k
        /* JADX INFO: renamed from: k */
        public com.google.android.material.transition.platform.zy mo15200k(float f2, float f3, float f4, float f5) {
            return com.google.android.material.transition.platform.zy.toq(zurt.n7h(255, 0, f3, f4, f2), 255);
        }
    }

    /* JADX INFO: compiled from: FadeModeEvaluators.java */
    class zy implements InterfaceC4204k {
        zy() {
        }

        @Override // com.google.android.material.transition.platform.InterfaceC4204k
        /* JADX INFO: renamed from: k */
        public com.google.android.material.transition.platform.zy mo15200k(float f2, float f3, float f4, float f5) {
            return com.google.android.material.transition.platform.zy.toq(zurt.n7h(255, 0, f3, f4, f2), zurt.n7h(0, 255, f3, f4, f2));
        }
    }

    private toq() {
    }

    /* JADX INFO: renamed from: k */
    static InterfaceC4204k m15228k(int i2, boolean z2) {
        if (i2 == 0) {
            return z2 ? f25520k : f68002toq;
        }
        if (i2 == 1) {
            return z2 ? f68002toq : f25520k;
        }
        if (i2 == 2) {
            return f68003zy;
        }
        if (i2 == 3) {
            return f25521q;
        }
        throw new IllegalArgumentException("Invalid fade mode: " + i2);
    }
}
