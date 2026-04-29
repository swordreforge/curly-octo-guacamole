package com.google.android.material.shape;

import zy.lvui;

/* JADX INFO: renamed from: com.google.android.material.shape.g */
/* JADX INFO: compiled from: CutCornerTreatment.java */
/* JADX INFO: loaded from: classes2.dex */
public class C4102g extends C4107n {

    /* JADX INFO: renamed from: k */
    float f24937k;

    public C4102g() {
        this.f24937k = -1.0f;
    }

    @Override // com.google.android.material.shape.C4107n
    public void toq(@lvui cdj cdjVar, float f2, float f3, float f4) {
        cdjVar.cdj(0.0f, f4 * f3, 180.0f, 180.0f - f2);
        double d2 = f4;
        double d4 = f3;
        cdjVar.n7h((float) (Math.sin(Math.toRadians(f2)) * d2 * d4), (float) (Math.sin(Math.toRadians(90.0f - f2)) * d2 * d4));
    }

    @Deprecated
    public C4102g(float f2) {
        this.f24937k = f2;
    }
}
