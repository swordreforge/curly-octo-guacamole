package com.google.android.material.shape;

import android.graphics.RectF;
import java.util.Arrays;
import zy.lvui;

/* JADX INFO: renamed from: com.google.android.material.shape.k */
/* JADX INFO: compiled from: AbsoluteCornerSize.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C4105k implements InterfaceC4109q {

    /* JADX INFO: renamed from: k */
    private final float f24951k;

    public C4105k(float f2) {
        this.f24951k = f2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4105k) && this.f24951k == ((C4105k) obj).f24951k;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f24951k)});
    }

    @Override // com.google.android.material.shape.InterfaceC4109q
    /* JADX INFO: renamed from: k */
    public float mo14816k(@lvui RectF rectF) {
        return this.f24951k;
    }

    public float toq() {
        return this.f24951k;
    }
}
