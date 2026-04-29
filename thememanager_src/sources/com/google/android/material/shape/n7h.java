package com.google.android.material.shape;

import zy.lvui;

/* JADX INFO: compiled from: RoundedCornerTreatment.java */
/* JADX INFO: loaded from: classes2.dex */
public class n7h extends C4107n {

    /* JADX INFO: renamed from: k */
    float f24966k;

    public n7h() {
        this.f24966k = -1.0f;
    }

    @Override // com.google.android.material.shape.C4107n
    public void toq(@lvui cdj cdjVar, float f2, float f3, float f4) {
        cdjVar.cdj(0.0f, f4 * f3, 180.0f, 180.0f - f2);
        float f5 = f4 * 2.0f * f3;
        cdjVar.m14778k(0.0f, 0.0f, f5, f5, 180.0f, f2);
    }

    @Deprecated
    public n7h(float f2) {
        this.f24966k = f2;
    }
}
