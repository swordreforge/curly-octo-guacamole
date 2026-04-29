package com.airbnb.lottie.animation.content;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.collection.C0252s;
import com.airbnb.lottie.C1476n;
import com.airbnb.lottie.C1504r;
import com.airbnb.lottie.animation.C1418k;
import com.airbnb.lottie.animation.keyframe.AbstractC1421k;
import com.airbnb.lottie.model.C1471n;
import com.airbnb.lottie.model.content.C1454n;
import com.airbnb.lottie.model.content.C1456q;
import com.airbnb.lottie.n5r1;
import com.airbnb.lottie.value.C1517p;
import java.util.ArrayList;
import java.util.List;
import zy.dd;
import zy.lvui;

/* JADX INFO: renamed from: com.airbnb.lottie.animation.content.y */
/* JADX INFO: compiled from: GradientFillContent.java */
/* JADX INFO: loaded from: classes.dex */
public class C1417y implements InterfaceC1412n, AbstractC1421k.toq, ld6 {

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private static final int f55897zurt = 32;

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private final C1504r f55898cdj;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private final Paint f55899f7l8;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    @dd
    private com.airbnb.lottie.animation.keyframe.zy f55900fn3e;

    /* JADX INFO: renamed from: g */
    private final Path f7870g;

    /* JADX INFO: renamed from: h */
    @dd
    private com.airbnb.lottie.animation.keyframe.cdj f7871h;

    /* JADX INFO: renamed from: i */
    float f7872i;

    /* JADX INFO: renamed from: k */
    @lvui
    private final String f7873k;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private final int f55901ki;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    @dd
    private AbstractC1421k<ColorFilter, ColorFilter> f55902kja0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private final AbstractC1421k<C1456q, C1456q> f55903ld6;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private final AbstractC1421k<PointF, PointF> f55904n7h;

    /* JADX INFO: renamed from: p */
    private final com.airbnb.lottie.model.content.f7l8 f7875p;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private final AbstractC1421k<PointF, PointF> f55905qrj;

    /* JADX INFO: renamed from: s */
    private final List<n7h> f7877s;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    @dd
    private AbstractC1421k<Float, Float> f55906t8r;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final boolean f55907toq;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private final AbstractC1421k<Integer, Integer> f55908x2;

    /* JADX INFO: renamed from: y */
    private final RectF f7878y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final com.airbnb.lottie.model.layer.toq f55909zy;

    /* JADX INFO: renamed from: q */
    private final C0252s<LinearGradient> f7876q = new C0252s<>();

    /* JADX INFO: renamed from: n */
    private final C0252s<RadialGradient> f7874n = new C0252s<>();

    public C1417y(C1504r c1504r, com.airbnb.lottie.model.layer.toq toqVar, C1454n c1454n) {
        Path path = new Path();
        this.f7870g = path;
        this.f55899f7l8 = new C1418k(1);
        this.f7878y = new RectF();
        this.f7877s = new ArrayList();
        this.f7872i = 0.0f;
        this.f55909zy = toqVar;
        this.f7873k = c1454n.m6028g();
        this.f55907toq = c1454n.m6031s();
        this.f55898cdj = c1504r;
        this.f7875p = c1454n.m6029n();
        path.setFillType(c1454n.zy());
        this.f55901ki = (int) (c1504r.x9kr().m5977q() / 32.0f);
        AbstractC1421k<C1456q, C1456q> abstractC1421kMo5997k = c1454n.m6030q().mo5997k();
        this.f55903ld6 = abstractC1421kMo5997k;
        abstractC1421kMo5997k.m5922k(this);
        toqVar.m6084s(abstractC1421kMo5997k);
        AbstractC1421k<Integer, Integer> abstractC1421kMo5997k2 = c1454n.f7l8().mo5997k();
        this.f55908x2 = abstractC1421kMo5997k2;
        abstractC1421kMo5997k2.m5922k(this);
        toqVar.m6084s(abstractC1421kMo5997k2);
        AbstractC1421k<PointF, PointF> abstractC1421kMo5997k3 = c1454n.m6032y().mo5997k();
        this.f55905qrj = abstractC1421kMo5997k3;
        abstractC1421kMo5997k3.m5922k(this);
        toqVar.m6084s(abstractC1421kMo5997k3);
        AbstractC1421k<PointF, PointF> abstractC1421kMo5997k4 = c1454n.toq().mo5997k();
        this.f55904n7h = abstractC1421kMo5997k4;
        abstractC1421kMo5997k4.m5922k(this);
        toqVar.m6084s(abstractC1421kMo5997k4);
        if (toqVar.zurt() != null) {
            AbstractC1421k<Float, Float> abstractC1421kMo5997k5 = toqVar.zurt().m6015k().mo5997k();
            this.f55906t8r = abstractC1421kMo5997k5;
            abstractC1421kMo5997k5.m5922k(this);
            toqVar.m6084s(this.f55906t8r);
        }
        if (toqVar.fu4() != null) {
            this.f55900fn3e = new com.airbnb.lottie.animation.keyframe.zy(this, toqVar, toqVar.fu4());
        }
    }

    private int[] f7l8(int[] iArr) {
        com.airbnb.lottie.animation.keyframe.cdj cdjVar = this.f7871h;
        if (cdjVar != null) {
            Integer[] numArr = (Integer[]) cdjVar.mo5912y();
            int i2 = 0;
            if (iArr.length == numArr.length) {
                while (i2 < iArr.length) {
                    iArr[i2] = numArr[i2].intValue();
                    i2++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i2 < numArr.length) {
                    iArr[i2] = numArr[i2].intValue();
                    i2++;
                }
            }
        }
        return iArr;
    }

    private RadialGradient ld6() {
        long jM5906s = m5906s();
        RadialGradient radialGradientN7h = this.f7874n.n7h(jM5906s);
        if (radialGradientN7h != null) {
            return radialGradientN7h;
        }
        PointF pointFMo5912y = this.f55905qrj.mo5912y();
        PointF pointFMo5912y2 = this.f55904n7h.mo5912y();
        C1456q c1456qMo5912y = this.f55903ld6.mo5912y();
        int[] iArrF7l8 = f7l8(c1456qMo5912y.m6043k());
        float[] qVar = c1456qMo5912y.toq();
        float f2 = pointFMo5912y.x;
        float f3 = pointFMo5912y.y;
        float fHypot = (float) Math.hypot(pointFMo5912y2.x - f2, pointFMo5912y2.y - f3);
        if (fHypot <= 0.0f) {
            fHypot = 0.001f;
        }
        RadialGradient radialGradient = new RadialGradient(f2, f3, fHypot, iArrF7l8, qVar, Shader.TileMode.CLAMP);
        this.f7874n.fn3e(jM5906s, radialGradient);
        return radialGradient;
    }

    /* JADX INFO: renamed from: p */
    private LinearGradient m5905p() {
        long jM5906s = m5906s();
        LinearGradient linearGradientN7h = this.f7876q.n7h(jM5906s);
        if (linearGradientN7h != null) {
            return linearGradientN7h;
        }
        PointF pointFMo5912y = this.f55905qrj.mo5912y();
        PointF pointFMo5912y2 = this.f55904n7h.mo5912y();
        C1456q c1456qMo5912y = this.f55903ld6.mo5912y();
        LinearGradient linearGradient = new LinearGradient(pointFMo5912y.x, pointFMo5912y.y, pointFMo5912y2.x, pointFMo5912y2.y, f7l8(c1456qMo5912y.m6043k()), c1456qMo5912y.toq(), Shader.TileMode.CLAMP);
        this.f7876q.fn3e(jM5906s, linearGradient);
        return linearGradient;
    }

    /* JADX INFO: renamed from: s */
    private int m5906s() {
        int iRound = Math.round(this.f55905qrj.m5921g() * this.f55901ki);
        int iRound2 = Math.round(this.f55904n7h.m5921g() * this.f55901ki);
        int iRound3 = Math.round(this.f55903ld6.m5921g() * this.f55901ki);
        int i2 = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i2 = i2 * 31 * iRound2;
        }
        return iRound3 != 0 ? i2 * 31 * iRound3 : i2;
    }

    @Override // com.airbnb.lottie.animation.content.InterfaceC1412n
    /* JADX INFO: renamed from: g */
    public void mo5886g(RectF rectF, Matrix matrix, boolean z2) {
        this.f7870g.reset();
        for (int i2 = 0; i2 < this.f7877s.size(); i2++) {
            this.f7870g.addPath(this.f7877s.get(i2).getPath(), matrix);
        }
        this.f7870g.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // com.airbnb.lottie.animation.content.zy
    public String getName() {
        return this.f7873k;
    }

    @Override // com.airbnb.lottie.animation.keyframe.AbstractC1421k.toq
    /* JADX INFO: renamed from: k */
    public void mo5887k() {
        this.f55898cdj.invalidateSelf();
    }

    @Override // com.airbnb.lottie.model.InterfaceC1460g
    /* JADX INFO: renamed from: n */
    public void mo5888n(C1471n c1471n, int i2, List<C1471n> list, C1471n c1471n2) {
        com.airbnb.lottie.utils.f7l8.qrj(c1471n, i2, list, c1471n2, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.model.InterfaceC1460g
    /* JADX INFO: renamed from: q */
    public <T> void mo5889q(T t2, @dd C1517p<T> c1517p) {
        com.airbnb.lottie.animation.keyframe.zy zyVar;
        com.airbnb.lottie.animation.keyframe.zy zyVar2;
        com.airbnb.lottie.animation.keyframe.zy zyVar3;
        com.airbnb.lottie.animation.keyframe.zy zyVar4;
        com.airbnb.lottie.animation.keyframe.zy zyVar5;
        if (t2 == n5r1.f8119q) {
            this.f55908x2.n7h(c1517p);
            return;
        }
        if (t2 == n5r1.f56126eqxt) {
            AbstractC1421k<ColorFilter, ColorFilter> abstractC1421k = this.f55902kja0;
            if (abstractC1421k != null) {
                this.f55909zy.jp0y(abstractC1421k);
            }
            if (c1517p == null) {
                this.f55902kja0 = null;
                return;
            }
            com.airbnb.lottie.animation.keyframe.cdj cdjVar = new com.airbnb.lottie.animation.keyframe.cdj(c1517p);
            this.f55902kja0 = cdjVar;
            cdjVar.m5922k(this);
            this.f55909zy.m6084s(this.f55902kja0);
            return;
        }
        if (t2 == n5r1.f56123d2ok) {
            com.airbnb.lottie.animation.keyframe.cdj cdjVar2 = this.f7871h;
            if (cdjVar2 != null) {
                this.f55909zy.jp0y(cdjVar2);
            }
            if (c1517p == null) {
                this.f7871h = null;
                return;
            }
            this.f7876q.m880q();
            this.f7874n.m880q();
            com.airbnb.lottie.animation.keyframe.cdj cdjVar3 = new com.airbnb.lottie.animation.keyframe.cdj(c1517p);
            this.f7871h = cdjVar3;
            cdjVar3.m5922k(this);
            this.f55909zy.m6084s(this.f7871h);
            return;
        }
        if (t2 == n5r1.f8118p) {
            AbstractC1421k<Float, Float> abstractC1421k2 = this.f55906t8r;
            if (abstractC1421k2 != null) {
                abstractC1421k2.n7h(c1517p);
                return;
            }
            com.airbnb.lottie.animation.keyframe.cdj cdjVar4 = new com.airbnb.lottie.animation.keyframe.cdj(c1517p);
            this.f55906t8r = cdjVar4;
            cdjVar4.m5922k(this);
            this.f55909zy.m6084s(this.f55906t8r);
            return;
        }
        if (t2 == n5r1.f8117n && (zyVar5 = this.f55900fn3e) != null) {
            zyVar5.zy(c1517p);
            return;
        }
        if (t2 == n5r1.f56133jp0y && (zyVar4 = this.f55900fn3e) != null) {
            zyVar4.m5943g(c1517p);
            return;
        }
        if (t2 == n5r1.f56131gvn7 && (zyVar3 = this.f55900fn3e) != null) {
            zyVar3.m5945q(c1517p);
            return;
        }
        if (t2 == n5r1.f56124d3 && (zyVar2 = this.f55900fn3e) != null) {
            zyVar2.m5944n(c1517p);
        } else {
            if (t2 != n5r1.f56142oc || (zyVar = this.f55900fn3e) == null) {
                return;
            }
            zyVar.f7l8(c1517p);
        }
    }

    @Override // com.airbnb.lottie.animation.content.zy
    public void toq(List<zy> list, List<zy> list2) {
        for (int i2 = 0; i2 < list2.size(); i2++) {
            zy zyVar = list2.get(i2);
            if (zyVar instanceof n7h) {
                this.f7877s.add((n7h) zyVar);
            }
        }
    }

    @Override // com.airbnb.lottie.animation.content.InterfaceC1412n
    /* JADX INFO: renamed from: y */
    public void mo5890y(Canvas canvas, Matrix matrix, int i2) {
        if (this.f55907toq) {
            return;
        }
        C1476n.m6103k("GradientFillContent#draw");
        this.f7870g.reset();
        for (int i3 = 0; i3 < this.f7877s.size(); i3++) {
            this.f7870g.addPath(this.f7877s.get(i3).getPath(), matrix);
        }
        this.f7870g.computeBounds(this.f7878y, false);
        Shader shaderM5905p = this.f7875p == com.airbnb.lottie.model.content.f7l8.LINEAR ? m5905p() : ld6();
        shaderM5905p.setLocalMatrix(matrix);
        this.f55899f7l8.setShader(shaderM5905p);
        AbstractC1421k<ColorFilter, ColorFilter> abstractC1421k = this.f55902kja0;
        if (abstractC1421k != null) {
            this.f55899f7l8.setColorFilter(abstractC1421k.mo5912y());
        }
        AbstractC1421k<Float, Float> abstractC1421k2 = this.f55906t8r;
        if (abstractC1421k2 != null) {
            float fFloatValue = abstractC1421k2.mo5912y().floatValue();
            if (fFloatValue == 0.0f) {
                this.f55899f7l8.setMaskFilter(null);
            } else if (fFloatValue != this.f7872i) {
                this.f55899f7l8.setMaskFilter(new BlurMaskFilter(fFloatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.f7872i = fFloatValue;
        }
        com.airbnb.lottie.animation.keyframe.zy zyVar = this.f55900fn3e;
        if (zyVar != null) {
            zyVar.toq(this.f55899f7l8);
        }
        this.f55899f7l8.setAlpha(com.airbnb.lottie.utils.f7l8.m6240q((int) ((((i2 / 255.0f) * this.f55908x2.mo5912y().intValue()) / 100.0f) * 255.0f), 0, 255));
        canvas.drawPath(this.f7870g, this.f55899f7l8);
        C1476n.toq("GradientFillContent#draw");
    }
}
