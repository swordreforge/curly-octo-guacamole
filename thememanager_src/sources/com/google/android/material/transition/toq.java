package com.google.android.material.transition;

/* JADX INFO: compiled from: FadeModeEvaluators.java */
/* JADX INFO: loaded from: classes2.dex */
class toq {

    /* JADX INFO: renamed from: k */
    private static final InterfaceC4195k f25595k = new C4226k();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final InterfaceC4195k f68051toq = new C7981toq();

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final InterfaceC4195k f68052zy = new zy();

    /* JADX INFO: renamed from: q */
    private static final InterfaceC4195k f25596q = new C4227q();

    /* JADX INFO: renamed from: com.google.android.material.transition.toq$k */
    /* JADX INFO: compiled from: FadeModeEvaluators.java */
    class C4226k implements InterfaceC4195k {
        C4226k() {
        }

        @Override // com.google.android.material.transition.InterfaceC4195k
        /* JADX INFO: renamed from: k */
        public com.google.android.material.transition.zy mo15174k(float f2, float f3, float f4, float f5) {
            return com.google.android.material.transition.zy.m15293k(255, fn3e.n7h(0, 255, f3, f4, f2));
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.transition.toq$q */
    /* JADX INFO: compiled from: FadeModeEvaluators.java */
    class C4227q implements InterfaceC4195k {
        C4227q() {
        }

        @Override // com.google.android.material.transition.InterfaceC4195k
        /* JADX INFO: renamed from: k */
        public com.google.android.material.transition.zy mo15174k(float f2, float f3, float f4, float f5) {
            float f6 = ((f4 - f3) * f5) + f3;
            return com.google.android.material.transition.zy.toq(fn3e.n7h(255, 0, f3, f6, f2), fn3e.n7h(0, 255, f6, f4, f2));
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.transition.toq$toq, reason: collision with other inner class name */
    /* JADX INFO: compiled from: FadeModeEvaluators.java */
    class C7981toq implements InterfaceC4195k {
        C7981toq() {
        }

        @Override // com.google.android.material.transition.InterfaceC4195k
        /* JADX INFO: renamed from: k */
        public com.google.android.material.transition.zy mo15174k(float f2, float f3, float f4, float f5) {
            return com.google.android.material.transition.zy.toq(fn3e.n7h(255, 0, f3, f4, f2), 255);
        }
    }

    /* JADX INFO: compiled from: FadeModeEvaluators.java */
    class zy implements InterfaceC4195k {
        zy() {
        }

        @Override // com.google.android.material.transition.InterfaceC4195k
        /* JADX INFO: renamed from: k */
        public com.google.android.material.transition.zy mo15174k(float f2, float f3, float f4, float f5) {
            return com.google.android.material.transition.zy.toq(fn3e.n7h(255, 0, f3, f4, f2), fn3e.n7h(0, 255, f3, f4, f2));
        }
    }

    private toq() {
    }

    /* JADX INFO: renamed from: k */
    static InterfaceC4195k m15280k(int i2, boolean z2) {
        if (i2 == 0) {
            return z2 ? f25595k : f68051toq;
        }
        if (i2 == 1) {
            return z2 ? f68051toq : f25595k;
        }
        if (i2 == 2) {
            return f68052zy;
        }
        if (i2 == 3) {
            return f25596q;
        }
        throw new IllegalArgumentException("Invalid fade mode: " + i2);
    }
}
