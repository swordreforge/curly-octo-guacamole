package com.miui.maml.animation.interpolater;

import android.view.animation.Interpolator;
import com.miui.maml.data.Expression;

/* JADX INFO: loaded from: classes3.dex */
public class BackEaseOutInterpolater implements Interpolator {
    private float mFactor;
    private Expression mFactorExp;

    public BackEaseOutInterpolater() {
        this.mFactor = 1.70158f;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f2) {
        Expression expression = this.mFactorExp;
        if (expression != null) {
            this.mFactor = (float) expression.evaluate();
        }
        float f3 = f2 - 1.0f;
        float f4 = this.mFactor;
        return (f3 * f3 * (((f4 + 1.0f) * f3) + f4)) + 1.0f;
    }

    public BackEaseOutInterpolater(Expression[] expressionArr) {
        this.mFactor = 1.70158f;
        if (expressionArr == null || expressionArr.length <= 0) {
            return;
        }
        this.mFactorExp = expressionArr[0];
    }

    public BackEaseOutInterpolater(float f2) {
        this.mFactor = f2;
    }
}
