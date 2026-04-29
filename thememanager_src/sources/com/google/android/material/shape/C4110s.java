package com.google.android.material.shape;

import zy.lvui;

/* JADX INFO: renamed from: com.google.android.material.shape.s */
/* JADX INFO: compiled from: MarkerEdgeTreatment.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C4110s extends f7l8 {

    /* JADX INFO: renamed from: k */
    private final float f25005k;

    public C4110s(float f2) {
        this.f25005k = f2 - 0.001f;
    }

    @Override // com.google.android.material.shape.f7l8
    /* JADX INFO: renamed from: k */
    boolean mo14806k() {
        return true;
    }

    @Override // com.google.android.material.shape.f7l8
    /* JADX INFO: renamed from: q */
    public void mo14133q(float f2, float f3, float f4, @lvui cdj cdjVar) {
        float fSqrt = (float) ((((double) this.f25005k) * Math.sqrt(2.0d)) / 2.0d);
        float fSqrt2 = (float) Math.sqrt(Math.pow(this.f25005k, 2.0d) - Math.pow(fSqrt, 2.0d));
        cdjVar.m14777h(f3 - fSqrt, ((float) (-((((double) this.f25005k) * Math.sqrt(2.0d)) - ((double) this.f25005k)))) + fSqrt2);
        cdjVar.n7h(f3, (float) (-((((double) this.f25005k) * Math.sqrt(2.0d)) - ((double) this.f25005k))));
        cdjVar.n7h(f3 + fSqrt, ((float) (-((((double) this.f25005k) * Math.sqrt(2.0d)) - ((double) this.f25005k)))) + fSqrt2);
    }
}
