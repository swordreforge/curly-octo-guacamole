package com.airbnb.lottie.value;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import zy.dd;
import zy.zurt;

/* JADX INFO: renamed from: com.airbnb.lottie.value.k */
/* JADX INFO: compiled from: Keyframe.java */
/* JADX INFO: loaded from: classes.dex */
public class C1515k<T> {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private static final float f56191cdj = -3987645.8f;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private static final int f56192ki = 784923401;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public final float f56193f7l8;

    /* JADX INFO: renamed from: g */
    @dd
    public final Interpolator f8299g;

    /* JADX INFO: renamed from: h */
    public PointF f8300h;

    /* JADX INFO: renamed from: k */
    @dd
    private final com.airbnb.lottie.ld6 f8301k;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    public PointF f56194kja0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private int f56195ld6;

    /* JADX INFO: renamed from: n */
    @dd
    public final Interpolator f8302n;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private float f56196n7h;

    /* JADX INFO: renamed from: p */
    private float f8303p;

    /* JADX INFO: renamed from: q */
    @dd
    public final Interpolator f8304q;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private float f56197qrj;

    /* JADX INFO: renamed from: s */
    private float f8305s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @dd
    public final T f56198toq;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private int f56199x2;

    /* JADX INFO: renamed from: y */
    @dd
    public Float f8306y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @dd
    public T f56200zy;

    public C1515k(com.airbnb.lottie.ld6 ld6Var, @dd T t2, @dd T t3, @dd Interpolator interpolator, float f2, @dd Float f3) {
        this.f8305s = f56191cdj;
        this.f8303p = f56191cdj;
        this.f56195ld6 = f56192ki;
        this.f56199x2 = f56192ki;
        this.f56197qrj = Float.MIN_VALUE;
        this.f56196n7h = Float.MIN_VALUE;
        this.f56194kja0 = null;
        this.f8300h = null;
        this.f8301k = ld6Var;
        this.f56198toq = t2;
        this.f56200zy = t3;
        this.f8304q = interpolator;
        this.f8302n = null;
        this.f8299g = null;
        this.f56193f7l8 = f2;
        this.f8306y = f3;
    }

    public int f7l8() {
        if (this.f56195ld6 == f56192ki) {
            this.f56195ld6 = ((Integer) this.f56198toq).intValue();
        }
        return this.f56195ld6;
    }

    /* JADX INFO: renamed from: g */
    public float m6278g() {
        if (this.f8305s == f56191cdj) {
            this.f8305s = ((Float) this.f56198toq).floatValue();
        }
        return this.f8305s;
    }

    /* JADX INFO: renamed from: k */
    public boolean m6279k(@zurt(from = 0.0d, to = 1.0d) float f2) {
        return f2 >= m6280n() && f2 < toq();
    }

    /* JADX INFO: renamed from: n */
    public float m6280n() {
        com.airbnb.lottie.ld6 ld6Var = this.f8301k;
        if (ld6Var == null) {
            return 0.0f;
        }
        if (this.f56197qrj == Float.MIN_VALUE) {
            this.f56197qrj = (this.f56193f7l8 - ld6Var.ki()) / this.f8301k.m5975n();
        }
        return this.f56197qrj;
    }

    /* JADX INFO: renamed from: q */
    public int m6281q() {
        if (this.f56199x2 == f56192ki) {
            this.f56199x2 = ((Integer) this.f56200zy).intValue();
        }
        return this.f56199x2;
    }

    public String toString() {
        return "Keyframe{startValue=" + this.f56198toq + ", endValue=" + this.f56200zy + ", startFrame=" + this.f56193f7l8 + ", endFrame=" + this.f8306y + ", interpolator=" + this.f8304q + '}';
    }

    public float toq() {
        if (this.f8301k == null) {
            return 1.0f;
        }
        if (this.f56196n7h == Float.MIN_VALUE) {
            if (this.f8306y == null) {
                this.f56196n7h = 1.0f;
            } else {
                this.f56196n7h = m6280n() + ((this.f8306y.floatValue() - this.f56193f7l8) / this.f8301k.m5975n());
            }
        }
        return this.f56196n7h;
    }

    /* JADX INFO: renamed from: y */
    public boolean m6282y() {
        return this.f8304q == null && this.f8302n == null && this.f8299g == null;
    }

    public float zy() {
        if (this.f8303p == f56191cdj) {
            this.f8303p = ((Float) this.f56200zy).floatValue();
        }
        return this.f8303p;
    }

    public C1515k(com.airbnb.lottie.ld6 ld6Var, @dd T t2, @dd T t3, @dd Interpolator interpolator, @dd Interpolator interpolator2, float f2, @dd Float f3) {
        this.f8305s = f56191cdj;
        this.f8303p = f56191cdj;
        this.f56195ld6 = f56192ki;
        this.f56199x2 = f56192ki;
        this.f56197qrj = Float.MIN_VALUE;
        this.f56196n7h = Float.MIN_VALUE;
        this.f56194kja0 = null;
        this.f8300h = null;
        this.f8301k = ld6Var;
        this.f56198toq = t2;
        this.f56200zy = t3;
        this.f8304q = null;
        this.f8302n = interpolator;
        this.f8299g = interpolator2;
        this.f56193f7l8 = f2;
        this.f8306y = f3;
    }

    protected C1515k(com.airbnb.lottie.ld6 ld6Var, @dd T t2, @dd T t3, @dd Interpolator interpolator, @dd Interpolator interpolator2, @dd Interpolator interpolator3, float f2, @dd Float f3) {
        this.f8305s = f56191cdj;
        this.f8303p = f56191cdj;
        this.f56195ld6 = f56192ki;
        this.f56199x2 = f56192ki;
        this.f56197qrj = Float.MIN_VALUE;
        this.f56196n7h = Float.MIN_VALUE;
        this.f56194kja0 = null;
        this.f8300h = null;
        this.f8301k = ld6Var;
        this.f56198toq = t2;
        this.f56200zy = t3;
        this.f8304q = interpolator;
        this.f8302n = interpolator2;
        this.f8299g = interpolator3;
        this.f56193f7l8 = f2;
        this.f8306y = f3;
    }

    public C1515k(T t2) {
        this.f8305s = f56191cdj;
        this.f8303p = f56191cdj;
        this.f56195ld6 = f56192ki;
        this.f56199x2 = f56192ki;
        this.f56197qrj = Float.MIN_VALUE;
        this.f56196n7h = Float.MIN_VALUE;
        this.f56194kja0 = null;
        this.f8300h = null;
        this.f8301k = null;
        this.f56198toq = t2;
        this.f56200zy = t2;
        this.f8304q = null;
        this.f8302n = null;
        this.f8299g = null;
        this.f56193f7l8 = Float.MIN_VALUE;
        this.f8306y = Float.valueOf(Float.MAX_VALUE);
    }
}
