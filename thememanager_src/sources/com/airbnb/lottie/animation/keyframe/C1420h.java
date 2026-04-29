package com.airbnb.lottie.animation.keyframe;

import android.graphics.Matrix;
import android.graphics.PointF;
import com.airbnb.lottie.animation.keyframe.AbstractC1421k;
import com.airbnb.lottie.n5r1;
import com.airbnb.lottie.value.C1515k;
import com.airbnb.lottie.value.C1517p;
import java.util.Collections;
import zy.dd;

/* JADX INFO: renamed from: com.airbnb.lottie.animation.keyframe.h */
/* JADX INFO: compiled from: TransformKeyframeAnimation.java */
/* JADX INFO: loaded from: classes.dex */
public class C1420h {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    @dd
    private AbstractC1421k<?, PointF> f55913f7l8;

    /* JADX INFO: renamed from: g */
    @dd
    private AbstractC1421k<PointF, PointF> f7884g;

    /* JADX INFO: renamed from: k */
    private final Matrix f7885k = new Matrix();

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    @dd
    private C1425q f55914ld6;

    /* JADX INFO: renamed from: n */
    private final float[] f7886n;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    @dd
    private AbstractC1421k<?, Float> f55915n7h;

    /* JADX INFO: renamed from: p */
    @dd
    private AbstractC1421k<Integer, Integer> f7887p;

    /* JADX INFO: renamed from: q */
    private final Matrix f7888q;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    @dd
    private AbstractC1421k<?, Float> f55916qrj;

    /* JADX INFO: renamed from: s */
    @dd
    private AbstractC1421k<Float, Float> f7889s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final Matrix f55917toq;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    @dd
    private C1425q f55918x2;

    /* JADX INFO: renamed from: y */
    @dd
    private AbstractC1421k<com.airbnb.lottie.value.ld6, com.airbnb.lottie.value.ld6> f7890y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final Matrix f55919zy;

    public C1420h(com.airbnb.lottie.model.animatable.x2 x2Var) {
        this.f7884g = x2Var.zy() == null ? null : x2Var.zy().mo5997k();
        this.f55913f7l8 = x2Var.m5999g() == null ? null : x2Var.m5999g().mo5997k();
        this.f7890y = x2Var.m6005y() == null ? null : x2Var.m6005y().mo5997k();
        this.f7889s = x2Var.f7l8() == null ? null : x2Var.f7l8().mo5997k();
        C1425q c1425q = x2Var.m6004s() == null ? null : (C1425q) x2Var.m6004s().mo5997k();
        this.f55914ld6 = c1425q;
        if (c1425q != null) {
            this.f55917toq = new Matrix();
            this.f55919zy = new Matrix();
            this.f7888q = new Matrix();
            this.f7886n = new float[9];
        } else {
            this.f55917toq = null;
            this.f55919zy = null;
            this.f7888q = null;
            this.f7886n = null;
        }
        this.f55918x2 = x2Var.m6002p() == null ? null : (C1425q) x2Var.m6002p().mo5997k();
        if (x2Var.m6001n() != null) {
            this.f7887p = x2Var.m6001n().mo5997k();
        }
        if (x2Var.ld6() != null) {
            this.f55916qrj = x2Var.ld6().mo5997k();
        } else {
            this.f55916qrj = null;
        }
        if (x2Var.m6003q() != null) {
            this.f55915n7h = x2Var.m6003q().mo5997k();
        } else {
            this.f55915n7h = null;
        }
    }

    /* JADX INFO: renamed from: q */
    private void m5914q() {
        for (int i2 = 0; i2 < 9; i2++) {
            this.f7886n[i2] = 0.0f;
        }
    }

    public Matrix f7l8(float f2) {
        AbstractC1421k<?, PointF> abstractC1421k = this.f55913f7l8;
        PointF pointFMo5912y = abstractC1421k == null ? null : abstractC1421k.mo5912y();
        AbstractC1421k<com.airbnb.lottie.value.ld6, com.airbnb.lottie.value.ld6> abstractC1421k2 = this.f7890y;
        com.airbnb.lottie.value.ld6 ld6VarMo5912y = abstractC1421k2 == null ? null : abstractC1421k2.mo5912y();
        this.f7885k.reset();
        if (pointFMo5912y != null) {
            this.f7885k.preTranslate(pointFMo5912y.x * f2, pointFMo5912y.y * f2);
        }
        if (ld6VarMo5912y != null) {
            double d2 = f2;
            this.f7885k.preScale((float) Math.pow(ld6VarMo5912y.toq(), d2), (float) Math.pow(ld6VarMo5912y.zy(), d2));
        }
        AbstractC1421k<Float, Float> abstractC1421k3 = this.f7889s;
        if (abstractC1421k3 != null) {
            float fFloatValue = abstractC1421k3.mo5912y().floatValue();
            AbstractC1421k<PointF, PointF> abstractC1421k4 = this.f7884g;
            PointF pointFMo5912y2 = abstractC1421k4 != null ? abstractC1421k4.mo5912y() : null;
            this.f7885k.preRotate(fFloatValue * f2, pointFMo5912y2 == null ? 0.0f : pointFMo5912y2.x, pointFMo5912y2 != null ? pointFMo5912y2.y : 0.0f);
        }
        return this.f7885k;
    }

    /* JADX INFO: renamed from: g */
    public Matrix m5915g() {
        PointF pointFMo5912y;
        this.f7885k.reset();
        AbstractC1421k<?, PointF> abstractC1421k = this.f55913f7l8;
        if (abstractC1421k != null && (pointFMo5912y = abstractC1421k.mo5912y()) != null) {
            float f2 = pointFMo5912y.x;
            if (f2 != 0.0f || pointFMo5912y.y != 0.0f) {
                this.f7885k.preTranslate(f2, pointFMo5912y.y);
            }
        }
        AbstractC1421k<Float, Float> abstractC1421k2 = this.f7889s;
        if (abstractC1421k2 != null) {
            float fFloatValue = abstractC1421k2 instanceof cdj ? abstractC1421k2.mo5912y().floatValue() : ((C1425q) abstractC1421k2).m5936h();
            if (fFloatValue != 0.0f) {
                this.f7885k.preRotate(fFloatValue);
            }
        }
        if (this.f55914ld6 != null) {
            float fCos = this.f55918x2 == null ? 0.0f : (float) Math.cos(Math.toRadians((-r3.m5936h()) + 90.0f));
            float fSin = this.f55918x2 == null ? 1.0f : (float) Math.sin(Math.toRadians((-r5.m5936h()) + 90.0f));
            float fTan = (float) Math.tan(Math.toRadians(r0.m5936h()));
            m5914q();
            float[] fArr = this.f7886n;
            fArr[0] = fCos;
            fArr[1] = fSin;
            float f3 = -fSin;
            fArr[3] = f3;
            fArr[4] = fCos;
            fArr[8] = 1.0f;
            this.f55917toq.setValues(fArr);
            m5914q();
            float[] fArr2 = this.f7886n;
            fArr2[0] = 1.0f;
            fArr2[3] = fTan;
            fArr2[4] = 1.0f;
            fArr2[8] = 1.0f;
            this.f55919zy.setValues(fArr2);
            m5914q();
            float[] fArr3 = this.f7886n;
            fArr3[0] = fCos;
            fArr3[1] = f3;
            fArr3[3] = fSin;
            fArr3[4] = fCos;
            fArr3[8] = 1.0f;
            this.f7888q.setValues(fArr3);
            this.f55919zy.preConcat(this.f55917toq);
            this.f7888q.preConcat(this.f55919zy);
            this.f7885k.preConcat(this.f7888q);
        }
        AbstractC1421k<com.airbnb.lottie.value.ld6, com.airbnb.lottie.value.ld6> abstractC1421k3 = this.f7890y;
        if (abstractC1421k3 != null) {
            com.airbnb.lottie.value.ld6 ld6VarMo5912y = abstractC1421k3.mo5912y();
            if (ld6VarMo5912y.toq() != 1.0f || ld6VarMo5912y.zy() != 1.0f) {
                this.f7885k.preScale(ld6VarMo5912y.toq(), ld6VarMo5912y.zy());
            }
        }
        AbstractC1421k<PointF, PointF> abstractC1421k4 = this.f7884g;
        if (abstractC1421k4 != null) {
            PointF pointFMo5912y2 = abstractC1421k4.mo5912y();
            float f4 = pointFMo5912y2.x;
            if (f4 != 0.0f || pointFMo5912y2.y != 0.0f) {
                this.f7885k.preTranslate(-f4, -pointFMo5912y2.y);
            }
        }
        return this.f7885k;
    }

    /* JADX INFO: renamed from: k */
    public void m5916k(com.airbnb.lottie.model.layer.toq toqVar) {
        toqVar.m6084s(this.f7887p);
        toqVar.m6084s(this.f55916qrj);
        toqVar.m6084s(this.f55915n7h);
        toqVar.m6084s(this.f7884g);
        toqVar.m6084s(this.f55913f7l8);
        toqVar.m6084s(this.f7890y);
        toqVar.m6084s(this.f7889s);
        toqVar.m6084s(this.f55914ld6);
        toqVar.m6084s(this.f55918x2);
    }

    @dd
    /* JADX INFO: renamed from: n */
    public AbstractC1421k<?, Float> m5917n() {
        return this.f55915n7h;
    }

    /* JADX INFO: renamed from: p */
    public void m5918p(float f2) {
        AbstractC1421k<Integer, Integer> abstractC1421k = this.f7887p;
        if (abstractC1421k != null) {
            abstractC1421k.qrj(f2);
        }
        AbstractC1421k<?, Float> abstractC1421k2 = this.f55916qrj;
        if (abstractC1421k2 != null) {
            abstractC1421k2.qrj(f2);
        }
        AbstractC1421k<?, Float> abstractC1421k3 = this.f55915n7h;
        if (abstractC1421k3 != null) {
            abstractC1421k3.qrj(f2);
        }
        AbstractC1421k<PointF, PointF> abstractC1421k4 = this.f7884g;
        if (abstractC1421k4 != null) {
            abstractC1421k4.qrj(f2);
        }
        AbstractC1421k<?, PointF> abstractC1421k5 = this.f55913f7l8;
        if (abstractC1421k5 != null) {
            abstractC1421k5.qrj(f2);
        }
        AbstractC1421k<com.airbnb.lottie.value.ld6, com.airbnb.lottie.value.ld6> abstractC1421k6 = this.f7890y;
        if (abstractC1421k6 != null) {
            abstractC1421k6.qrj(f2);
        }
        AbstractC1421k<Float, Float> abstractC1421k7 = this.f7889s;
        if (abstractC1421k7 != null) {
            abstractC1421k7.qrj(f2);
        }
        C1425q c1425q = this.f55914ld6;
        if (c1425q != null) {
            c1425q.qrj(f2);
        }
        C1425q c1425q2 = this.f55918x2;
        if (c1425q2 != null) {
            c1425q2.qrj(f2);
        }
    }

    @dd
    /* JADX INFO: renamed from: s */
    public AbstractC1421k<?, Float> m5919s() {
        return this.f55916qrj;
    }

    public void toq(AbstractC1421k.toq toqVar) {
        AbstractC1421k<Integer, Integer> abstractC1421k = this.f7887p;
        if (abstractC1421k != null) {
            abstractC1421k.m5922k(toqVar);
        }
        AbstractC1421k<?, Float> abstractC1421k2 = this.f55916qrj;
        if (abstractC1421k2 != null) {
            abstractC1421k2.m5922k(toqVar);
        }
        AbstractC1421k<?, Float> abstractC1421k3 = this.f55915n7h;
        if (abstractC1421k3 != null) {
            abstractC1421k3.m5922k(toqVar);
        }
        AbstractC1421k<PointF, PointF> abstractC1421k4 = this.f7884g;
        if (abstractC1421k4 != null) {
            abstractC1421k4.m5922k(toqVar);
        }
        AbstractC1421k<?, PointF> abstractC1421k5 = this.f55913f7l8;
        if (abstractC1421k5 != null) {
            abstractC1421k5.m5922k(toqVar);
        }
        AbstractC1421k<com.airbnb.lottie.value.ld6, com.airbnb.lottie.value.ld6> abstractC1421k6 = this.f7890y;
        if (abstractC1421k6 != null) {
            abstractC1421k6.m5922k(toqVar);
        }
        AbstractC1421k<Float, Float> abstractC1421k7 = this.f7889s;
        if (abstractC1421k7 != null) {
            abstractC1421k7.m5922k(toqVar);
        }
        C1425q c1425q = this.f55914ld6;
        if (c1425q != null) {
            c1425q.m5922k(toqVar);
        }
        C1425q c1425q2 = this.f55918x2;
        if (c1425q2 != null) {
            c1425q2.m5922k(toqVar);
        }
    }

    @dd
    /* JADX INFO: renamed from: y */
    public AbstractC1421k<?, Integer> m5920y() {
        return this.f7887p;
    }

    public <T> boolean zy(T t2, @dd C1517p<T> c1517p) {
        if (t2 == n5r1.f8113g) {
            AbstractC1421k<PointF, PointF> abstractC1421k = this.f7884g;
            if (abstractC1421k == null) {
                this.f7884g = new cdj(c1517p, new PointF());
                return true;
            }
            abstractC1421k.n7h(c1517p);
            return true;
        }
        if (t2 == n5r1.f56127f7l8) {
            AbstractC1421k<?, PointF> abstractC1421k2 = this.f55913f7l8;
            if (abstractC1421k2 == null) {
                this.f55913f7l8 = new cdj(c1517p, new PointF());
                return true;
            }
            abstractC1421k2.n7h(c1517p);
            return true;
        }
        if (t2 == n5r1.f8123y) {
            AbstractC1421k<?, PointF> abstractC1421k3 = this.f55913f7l8;
            if (abstractC1421k3 instanceof n7h) {
                ((n7h) abstractC1421k3).ki(c1517p);
                return true;
            }
        }
        if (t2 == n5r1.f8121s) {
            AbstractC1421k<?, PointF> abstractC1421k4 = this.f55913f7l8;
            if (abstractC1421k4 instanceof n7h) {
                ((n7h) abstractC1421k4).t8r(c1517p);
                return true;
            }
        }
        if (t2 == n5r1.f56135kja0) {
            AbstractC1421k<com.airbnb.lottie.value.ld6, com.airbnb.lottie.value.ld6> abstractC1421k5 = this.f7890y;
            if (abstractC1421k5 == null) {
                this.f7890y = new cdj(c1517p, new com.airbnb.lottie.value.ld6());
                return true;
            }
            abstractC1421k5.n7h(c1517p);
            return true;
        }
        if (t2 == n5r1.f8114h) {
            AbstractC1421k<Float, Float> abstractC1421k6 = this.f7889s;
            if (abstractC1421k6 == null) {
                this.f7889s = new cdj(c1517p, Float.valueOf(0.0f));
                return true;
            }
            abstractC1421k6.n7h(c1517p);
            return true;
        }
        if (t2 == n5r1.f56149zy) {
            AbstractC1421k<Integer, Integer> abstractC1421k7 = this.f7887p;
            if (abstractC1421k7 == null) {
                this.f7887p = new cdj(c1517p, 100);
                return true;
            }
            abstractC1421k7.n7h(c1517p);
            return true;
        }
        if (t2 == n5r1.f56138mcp) {
            AbstractC1421k<?, Float> abstractC1421k8 = this.f55916qrj;
            if (abstractC1421k8 == null) {
                this.f55916qrj = new cdj(c1517p, Float.valueOf(100.0f));
                return true;
            }
            abstractC1421k8.n7h(c1517p);
            return true;
        }
        if (t2 == n5r1.f56132jk) {
            AbstractC1421k<?, Float> abstractC1421k9 = this.f55915n7h;
            if (abstractC1421k9 == null) {
                this.f55915n7h = new cdj(c1517p, Float.valueOf(100.0f));
                return true;
            }
            abstractC1421k9.n7h(c1517p);
            return true;
        }
        if (t2 == n5r1.f56122cdj) {
            if (this.f55914ld6 == null) {
                this.f55914ld6 = new C1425q(Collections.singletonList(new C1515k(Float.valueOf(0.0f))));
            }
            this.f55914ld6.n7h(c1517p);
            return true;
        }
        if (t2 != n5r1.f56134ki) {
            return false;
        }
        if (this.f55918x2 == null) {
            this.f55918x2 = new C1425q(Collections.singletonList(new C1515k(Float.valueOf(0.0f))));
        }
        this.f55918x2.n7h(c1517p);
        return true;
    }
}
