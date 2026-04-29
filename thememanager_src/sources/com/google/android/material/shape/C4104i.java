package com.google.android.material.shape;

import zy.lvui;

/* JADX INFO: renamed from: com.google.android.material.shape.i */
/* JADX INFO: compiled from: TriangleEdgeTreatment.java */
/* JADX INFO: loaded from: classes2.dex */
public class C4104i extends f7l8 {

    /* JADX INFO: renamed from: k */
    private final float f24949k;

    /* JADX INFO: renamed from: q */
    private final boolean f24950q;

    public C4104i(float f2, boolean z2) {
        this.f24949k = f2;
        this.f24950q = z2;
    }

    @Override // com.google.android.material.shape.f7l8
    /* JADX INFO: renamed from: q */
    public void mo14133q(float f2, float f3, float f4, @lvui cdj cdjVar) {
        cdjVar.n7h(f3 - (this.f24949k * f4), 0.0f);
        cdjVar.n7h(f3, (this.f24950q ? this.f24949k : -this.f24949k) * f4);
        cdjVar.n7h(f3 + (this.f24949k * f4), 0.0f);
        cdjVar.n7h(f2, 0.0f);
    }
}
