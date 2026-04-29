package com.google.android.material.shape;

import android.graphics.RectF;
import java.util.Arrays;
import zy.lvui;
import zy.zurt;

/* JADX INFO: compiled from: RelativeCornerSize.java */
/* JADX INFO: loaded from: classes2.dex */
public final class qrj implements InterfaceC4109q {

    /* JADX INFO: renamed from: k */
    private final float f25004k;

    public qrj(@zurt(from = 0.0d, to = 1.0d) float f2) {
        this.f25004k = f2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qrj) && this.f25004k == ((qrj) obj).f25004k;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f25004k)});
    }

    @Override // com.google.android.material.shape.InterfaceC4109q
    /* JADX INFO: renamed from: k */
    public float mo14816k(@lvui RectF rectF) {
        return this.f25004k * rectF.height();
    }

    @zurt(from = 0.0d, to = 1.0d)
    public float toq() {
        return this.f25004k;
    }
}
