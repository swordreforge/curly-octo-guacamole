package com.google.android.material.shape;

import android.graphics.RectF;
import java.util.Arrays;
import zy.lvui;
import zy.uv6;

/* JADX INFO: compiled from: AdjustedCornerSize.java */
/* JADX INFO: loaded from: classes2.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP})
public final class toq implements InterfaceC4109q {

    /* JADX INFO: renamed from: k */
    private final InterfaceC4109q f25006k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final float f67859toq;

    public toq(float f2, @lvui InterfaceC4109q interfaceC4109q) {
        while (interfaceC4109q instanceof toq) {
            interfaceC4109q = ((toq) interfaceC4109q).f25006k;
            f2 += ((toq) interfaceC4109q).f67859toq;
        }
        this.f25006k = interfaceC4109q;
        this.f67859toq = f2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof toq)) {
            return false;
        }
        toq toqVar = (toq) obj;
        return this.f25006k.equals(toqVar.f25006k) && this.f67859toq == toqVar.f67859toq;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f25006k, Float.valueOf(this.f67859toq)});
    }

    @Override // com.google.android.material.shape.InterfaceC4109q
    /* JADX INFO: renamed from: k */
    public float mo14816k(@lvui RectF rectF) {
        return Math.max(0.0f, this.f25006k.mo14816k(rectF) + this.f67859toq);
    }
}
