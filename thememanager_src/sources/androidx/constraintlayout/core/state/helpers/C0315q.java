package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.C0324y;

/* JADX INFO: renamed from: androidx.constraintlayout.core.state.helpers.q */
/* JADX INFO: compiled from: ChainReference.java */
/* JADX INFO: loaded from: classes.dex */
public class C0315q extends androidx.constraintlayout.core.state.zy {

    /* JADX INFO: renamed from: x */
    protected C0324y.toq f1899x;

    /* JADX INFO: renamed from: zp, reason: collision with root package name */
    protected float f47618zp;

    public C0315q(C0324y c0324y, C0324y.n nVar) {
        super(c0324y, nVar);
        this.f47618zp = 0.5f;
        this.f1899x = C0324y.toq.SPREAD;
    }

    public float i9jn() {
        return this.f47618zp;
    }

    public C0324y.toq ltg8() {
        return C0324y.toq.SPREAD;
    }

    @Override // androidx.constraintlayout.core.state.C0318k
    /* JADX INFO: renamed from: py, reason: merged with bridge method [inline-methods] */
    public C0315q qrj(float f2) {
        this.f47618zp = f2;
        return this;
    }

    public C0315q r8s8(C0324y.toq toqVar) {
        this.f1899x = toqVar;
        return this;
    }
}
