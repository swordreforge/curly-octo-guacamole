package com.google.android.material.animation;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;
import zy.lvui;

/* JADX INFO: compiled from: MatrixEvaluator.java */
/* JADX INFO: loaded from: classes2.dex */
public class f7l8 implements TypeEvaluator<Matrix> {

    /* JADX INFO: renamed from: k */
    private final float[] f23769k = new float[9];

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final float[] f67310toq = new float[9];

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final Matrix f67311zy = new Matrix();

    @Override // android.animation.TypeEvaluator
    @lvui
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public Matrix evaluate(float f2, @lvui Matrix matrix, @lvui Matrix matrix2) {
        matrix.getValues(this.f23769k);
        matrix2.getValues(this.f67310toq);
        for (int i2 = 0; i2 < 9; i2++) {
            float[] fArr = this.f67310toq;
            float f3 = fArr[i2];
            float f4 = this.f23769k[i2];
            fArr[i2] = f4 + ((f3 - f4) * f2);
        }
        this.f67311zy.setValues(this.f67310toq);
        return this.f67311zy;
    }
}
