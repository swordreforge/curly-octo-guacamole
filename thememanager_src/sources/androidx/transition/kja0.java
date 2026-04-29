package androidx.transition;

import android.animation.TypeEvaluator;

/* JADX INFO: compiled from: FloatArrayEvaluator.java */
/* JADX INFO: loaded from: classes.dex */
class kja0 implements TypeEvaluator<float[]> {

    /* JADX INFO: renamed from: k */
    private float[] f6685k;

    kja0(float[] fArr) {
        this.f6685k = fArr;
    }

    @Override // android.animation.TypeEvaluator
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public float[] evaluate(float f2, float[] fArr, float[] fArr2) {
        float[] fArr3 = this.f6685k;
        if (fArr3 == null) {
            fArr3 = new float[fArr.length];
        }
        for (int i2 = 0; i2 < fArr3.length; i2++) {
            float f3 = fArr[i2];
            fArr3[i2] = f3 + ((fArr2[i2] - f3) * f2);
        }
        return fArr3;
    }
}
