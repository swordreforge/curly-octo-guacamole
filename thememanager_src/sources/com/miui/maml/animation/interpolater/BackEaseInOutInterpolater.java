package com.miui.maml.animation.interpolater;

import android.view.animation.Interpolator;
import com.miui.maml.data.Expression;

/* JADX INFO: loaded from: classes3.dex */
public class BackEaseInOutInterpolater implements Interpolator {
    private float mFactor;
    private Expression mFactorExp;

    public BackEaseInOutInterpolater() {
        this.mFactor = 1.70158f;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f2) {
        Expression expression = this.mFactorExp;
        if (expression != null) {
            this.mFactor = (float) expression.evaluate();
        }
        float f3 = this.mFactor;
        float f4 = f2 * 2.0f;
        if (f4 < 1.0f) {
            float f5 = (float) (((double) f3) * 1.525d);
            return f4 * f4 * (((1.0f + f5) * f4) - f5) * 0.5f;
        }
        float f6 = f4 - 2.0f;
        float f7 = (float) (((double) f3) * 1.525d);
        return ((f6 * f6 * (((1.0f + f7) * f6) + f7)) + 2.0f) * 0.5f;
    }

    public BackEaseInOutInterpolater(Expression[] expressionArr) {
        this.mFactor = 1.70158f;
        if (expressionArr == null || expressionArr.length <= 0) {
            return;
        }
        this.mFactorExp = expressionArr[0];
    }

    public BackEaseInOutInterpolater(float f2) {
        this.mFactor = f2;
    }
}
