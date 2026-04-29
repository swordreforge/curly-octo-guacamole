package com.android.thememanager.lockscreen.lock.wallpaper;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

/* JADX INFO: compiled from: TranslateEvaluator.java */
/* JADX INFO: loaded from: classes2.dex */
public class ki implements TypeEvaluator<Matrix> {

    /* JADX INFO: renamed from: k */
    private final Matrix f12499k = new Matrix();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final float[] f60385toq = new float[9];

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final float[] f60386zy = new float[9];

    /* JADX INFO: renamed from: q */
    private final float[] f12500q = new float[9];

    @Override // android.animation.TypeEvaluator
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public Matrix evaluate(float fraction, Matrix startValue, Matrix endValue) {
        startValue.getValues(this.f60385toq);
        endValue.getValues(this.f60386zy);
        float[] fArr = this.f12500q;
        float[] fArr2 = this.f60385toq;
        float f2 = fArr2[0];
        float[] fArr3 = this.f60386zy;
        fArr[0] = f2 + ((fArr3[0] - f2) * fraction);
        float f3 = fArr2[1];
        fArr[1] = f3 + ((fArr3[1] - f3) * fraction);
        float f4 = fArr2[2];
        fArr[2] = f4 + ((fArr3[2] - f4) * fraction);
        float f5 = fArr2[3];
        fArr[3] = f5 + ((fArr3[3] - f5) * fraction);
        float f6 = fArr2[4];
        fArr[4] = f6 + ((fArr3[4] - f6) * fraction);
        float f7 = fArr2[5];
        fArr[5] = f7 + ((fArr3[5] - f7) * fraction);
        fArr[6] = fArr2[6];
        fArr[7] = fArr2[7];
        fArr[8] = fArr2[8];
        this.f12499k.setValues(fArr);
        return this.f12499k;
    }
}
