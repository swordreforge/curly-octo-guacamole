package com.miui.maml.animation.interpolater;

import android.view.animation.Interpolator;
import com.miui.maml.data.Expression;

/* JADX INFO: loaded from: classes3.dex */
public class PhysicBasedInterpolator implements Interpolator {

    /* JADX INFO: renamed from: c */
    private float f29460c;
    private float c1;
    private float c2;

    /* JADX INFO: renamed from: k */
    private float f29461k;

    /* JADX INFO: renamed from: m */
    private float f29462m;
    private float mDamping;
    private Expression mDampingExp;
    private float mInitial;
    private boolean mNeedEvaluate;
    private float mResponse;
    private Expression mResponseExp;

    /* JADX INFO: renamed from: r */
    private float f29463r;

    /* JADX INFO: renamed from: w */
    private float f29464w;

    public PhysicBasedInterpolator() {
        this.mDamping = 0.9f;
        this.mResponse = 0.3f;
        this.mInitial = -1.0f;
        this.f29462m = 1.0f;
        this.c1 = -1.0f;
        this.mNeedEvaluate = true;
    }

    private void evaluate() {
        if (this.mNeedEvaluate) {
            double dPow = Math.pow(6.283185307179586d / ((double) this.mResponse), 2.0d);
            float f2 = this.f29462m;
            this.f29461k = (float) (dPow * ((double) f2));
            this.f29460c = (float) (((((double) this.mDamping) * 12.566370614359172d) * ((double) f2)) / ((double) this.mResponse));
            float fSqrt = (float) Math.sqrt(((f2 * 4.0f) * r0) - (r1 * r1));
            float f3 = this.f29462m;
            float f4 = fSqrt / (f3 * 2.0f);
            this.f29464w = f4;
            float f5 = -((this.f29460c / 2.0f) * f3);
            this.f29463r = f5;
            this.c2 = (0.0f - (f5 * this.mInitial)) / f4;
            this.mNeedEvaluate = false;
        }
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f2) {
        Expression expression = this.mDampingExp;
        if (expression != null) {
            float fEvaluate = (float) expression.evaluate();
            if (this.mDamping != fEvaluate) {
                this.mDamping = fEvaluate;
                this.mNeedEvaluate = true;
            }
        }
        Expression expression2 = this.mResponseExp;
        if (expression2 != null) {
            float fEvaluate2 = (float) expression2.evaluate();
            if (this.mResponse != fEvaluate2) {
                this.mResponse = fEvaluate2;
                this.mNeedEvaluate = true;
            }
        }
        evaluate();
        return (float) ((Math.pow(2.718281828459045d, this.f29463r * f2) * ((((double) this.c1) * Math.cos(this.f29464w * f2)) + (((double) this.c2) * Math.sin(this.f29464w * f2)))) + 1.0d);
    }

    public PhysicBasedInterpolator(Expression[] expressionArr) {
        this.mDamping = 0.9f;
        this.mResponse = 0.3f;
        this.mInitial = -1.0f;
        this.f29462m = 1.0f;
        this.c1 = -1.0f;
        this.mNeedEvaluate = true;
        if (expressionArr != null) {
            if (expressionArr.length > 0) {
                this.mDampingExp = expressionArr[0];
            }
            if (expressionArr.length > 1) {
                this.mResponseExp = expressionArr[1];
            }
        }
    }

    public PhysicBasedInterpolator(float f2, float f3) {
        this.mInitial = -1.0f;
        this.f29462m = 1.0f;
        this.c1 = -1.0f;
        this.mNeedEvaluate = true;
        this.mDamping = f2;
        this.mResponse = f3;
    }
}
