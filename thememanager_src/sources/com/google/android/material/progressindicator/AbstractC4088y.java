package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.google.android.material.progressindicator.toq;
import zy.lvui;
import zy.zurt;

/* JADX INFO: renamed from: com.google.android.material.progressindicator.y */
/* JADX INFO: compiled from: DrawingDelegate.java */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC4088y<S extends toq> {

    /* JADX INFO: renamed from: k */
    S f24857k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    protected f7l8 f67771toq;

    public AbstractC4088y(S s2) {
        this.f24857k = s2;
    }

    void f7l8(@lvui Canvas canvas, @zurt(from = 0.0d, to = 1.0d) float f2) {
        this.f24857k.mo14707n();
        mo14704k(canvas, f2);
    }

    /* JADX INFO: renamed from: g */
    protected void m14731g(@lvui f7l8 f7l8Var) {
        this.f67771toq = f7l8Var;
    }

    /* JADX INFO: renamed from: k */
    abstract void mo14704k(@lvui Canvas canvas, @zurt(from = 0.0d, to = 1.0d) float f2);

    /* JADX INFO: renamed from: n */
    abstract int mo14705n();

    /* JADX INFO: renamed from: q */
    abstract int mo14706q();

    abstract void toq(@lvui Canvas canvas, @lvui Paint paint, @zurt(from = 0.0d, to = 1.0d) float f2, @zurt(from = 0.0d, to = 1.0d) float f3, @zy.x2 int i2);

    abstract void zy(@lvui Canvas canvas, @lvui Paint paint);
}
