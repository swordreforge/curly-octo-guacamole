package com.miui.maml.animation.interpolater;

import android.view.animation.Interpolator;
import com.miui.maml.data.Expression;

/* JADX INFO: loaded from: classes3.dex */
public class ElasticEaseOutInterpolater implements Interpolator {
    private float mAmplitude;
    private Expression mAmplitudeExp;
    private float mPriod;
    private Expression mPriodExp;

    public ElasticEaseOutInterpolater() {
        this.mAmplitude = 0.0f;
        this.mPriod = 0.3f;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f2) {
        float fAsin;
        Expression expression = this.mAmplitudeExp;
        if (expression != null) {
            this.mAmplitude = (float) expression.evaluate();
        }
        Expression expression2 = this.mPriodExp;
        if (expression2 != null) {
            this.mPriod = (float) expression2.evaluate();
        }
        float f3 = this.mAmplitude;
        if (f2 == 0.0f) {
            return 0.0f;
        }
        if (f2 == 1.0f) {
            return 1.0f;
        }
        if (f3 < 1.0f) {
            fAsin = this.mPriod / 4.0f;
            f3 = 1.0f;
        } else {
            fAsin = (float) ((((double) this.mPriod) / 6.283185307179586d) * Math.asin(1.0f / f3));
        }
        return (float) ((((double) f3) * Math.pow(2.0d, (-10.0f) * f2) * Math.sin((((double) (f2 - fAsin)) * 6.283185307179586d) / ((double) this.mPriod))) + 1.0d);
    }

    public ElasticEaseOutInterpolater(Expression[] expressionArr) {
        this.mAmplitude = 0.0f;
        this.mPriod = 0.3f;
        if (expressionArr != null) {
            if (expressionArr.length > 0) {
                this.mAmplitudeExp = expressionArr[0];
            }
            if (expressionArr.length > 1) {
                this.mPriodExp = expressionArr[1];
            }
        }
    }

    public ElasticEaseOutInterpolater(float f2, float f3) {
        this.mPriod = f2;
        this.mAmplitude = f3;
    }
}
