package com.google.android.material.shape;

import zy.lvui;

/* JADX INFO: compiled from: OffsetEdgeTreatment.java */
/* JADX INFO: loaded from: classes2.dex */
public final class x2 extends f7l8 {

    /* JADX INFO: renamed from: k */
    private final f7l8 f25007k;

    /* JADX INFO: renamed from: q */
    private final float f25008q;

    public x2(@lvui f7l8 f7l8Var, float f2) {
        this.f25007k = f7l8Var;
        this.f25008q = f2;
    }

    @Override // com.google.android.material.shape.f7l8
    /* JADX INFO: renamed from: k */
    boolean mo14806k() {
        return this.f25007k.mo14806k();
    }

    @Override // com.google.android.material.shape.f7l8
    /* JADX INFO: renamed from: q */
    public void mo14133q(float f2, float f3, float f4, @lvui cdj cdjVar) {
        this.f25007k.mo14133q(f2, f3 - this.f25008q, f4, cdjVar);
    }
}
